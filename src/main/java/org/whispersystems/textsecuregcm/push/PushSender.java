package org.whispersystems.textsecuregcm.push;

import org.whispersystems.textsecuregcm.entities.MessageProtos;
import org.whispersystems.textsecuregcm.storage.Account;
import org.whispersystems.textsecuregcm.storage.Device;

/**
 * Created by james on 10/05/18.
 */
public interface PushSender {
    void sendMessage(Account account, Device device, MessageProtos.Envelope message, boolean silent)
        throws NotPushRegisteredException;

    void sendQueuedNotification(Account account, Device device, boolean fallback)
            throws NotPushRegisteredException, TransientPushFailureException;

    WebsocketSender getWebSocketSender();
}
