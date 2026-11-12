package it.sauronsoftware.ftp4j.connectors;

import it.sauronsoftware.ftp4j.FTPConnector;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes22.dex */
public class DirectConnector extends FTPConnector {
    @Override // it.sauronsoftware.ftp4j.FTPConnector
    public Socket connectForCommunicationChannel(String str, int i) throws IOException {
        return tcpConnectForCommunicationChannel(str, i);
    }

    @Override // it.sauronsoftware.ftp4j.FTPConnector
    public Socket connectForDataTransferChannel(String str, int i) throws IOException {
        return tcpConnectForDataTransferChannel(str, i);
    }
}
