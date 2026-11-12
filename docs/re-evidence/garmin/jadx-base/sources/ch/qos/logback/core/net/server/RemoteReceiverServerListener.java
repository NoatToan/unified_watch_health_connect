package ch.qos.logback.core.net.server;

import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: loaded from: classes7.dex */
class RemoteReceiverServerListener extends ServerSocketListener<RemoteReceiverClient> {
    public RemoteReceiverServerListener(ServerSocket serverSocket) {
        super(serverSocket);
    }

    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    public RemoteReceiverClient createClient(String str, Socket socket) {
        return new RemoteReceiverStreamClient(str, socket);
    }
}
