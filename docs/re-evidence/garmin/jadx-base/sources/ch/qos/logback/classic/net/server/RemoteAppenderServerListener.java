package ch.qos.logback.classic.net.server;

import ch.qos.logback.core.net.server.ServerSocketListener;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: loaded from: classes7.dex */
class RemoteAppenderServerListener extends ServerSocketListener<RemoteAppenderClient> {
    public RemoteAppenderServerListener(ServerSocket serverSocket) {
        super(serverSocket);
    }

    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    public RemoteAppenderClient createClient(String str, Socket socket) {
        return new RemoteAppenderStreamClient(str, socket);
    }
}
