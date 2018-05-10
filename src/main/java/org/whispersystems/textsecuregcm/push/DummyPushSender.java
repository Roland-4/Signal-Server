package org.whispersystems.textsecuregcm.push;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.whispersystems.textsecuregcm.entities.MessageProtos;
import org.whispersystems.textsecuregcm.storage.Account;
import org.whispersystems.textsecuregcm.storage.Device;

/**
 * Created by james on 10/05/18.
 */
public class DummyPushSender implements PushSender {

    private static final Logger logger = LoggerFactory.getLogger(DummyPushSender.class);

    private final WebsocketSender webSocketSender;

    public DummyPushSender(WebsocketSender webSocketSender) {
        this.webSocketSender = webSocketSender;
    }

    @Override
    public void sendMessage(Account account, Device device, MessageProtos.Envelope message, boolean silent) throws NotPushRegisteredException {
        logger.info("Push Notification Sent: {}, {}, {}", account, device, message);
    }

    @Override
    public void sendQueuedNotification(Account account, Device device, boolean fallback) throws NotPushRegisteredException, TransientPushFailureException {
        logger.info("Queued Push Notification Sent: {}, {}, {}", account, device);
    }

    @Override
    public WebsocketSender getWebSocketSender() {
        return webSocketSender;
    }
}
