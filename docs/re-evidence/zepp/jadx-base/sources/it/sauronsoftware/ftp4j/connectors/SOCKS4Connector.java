package it.sauronsoftware.ftp4j.connectors;

import it.sauronsoftware.ftp4j.FTPConnector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/* JADX INFO: loaded from: classes22.dex */
public class SOCKS4Connector extends FTPConnector {
    private String c;
    private int d;
    private String e;

    public SOCKS4Connector(String str, int i, String str2) {
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    private int b(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            return i;
        }
        throw new IOException("SOCKS4Connector: connection closed by the proxy");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    private Socket c(String str, int i, boolean z) throws Throwable {
        byte[] address;
        boolean z2;
        Socket socketTcpConnectForDataTransferChannel;
        InputStream inputStream;
        OutputStream outputStream;
        try {
            address = InetAddress.getByName(str).getAddress();
            z2 = false;
        } catch (Exception unused) {
            address = new byte[]{0, 0, 0, 1};
            z2 = true;
        }
        OutputStream outputStream2 = null;
        outputStream2 = null;
        outputStream2 = null;
        Socket socket = null;
        try {
            socketTcpConnectForDataTransferChannel = z ? tcpConnectForDataTransferChannel(this.c, this.d) : tcpConnectForCommunicationChannel(this.c, this.d);
            try {
                inputStream = socketTcpConnectForDataTransferChannel.getInputStream();
                try {
                    OutputStream outputStream3 = socketTcpConnectForDataTransferChannel.getOutputStream();
                    outputStream3.write(4);
                    outputStream3.write(1);
                    outputStream3.write(i >> 8);
                    outputStream3.write(i);
                    outputStream3.write(address);
                    String str2 = this.e;
                    if (str2 != null) {
                        outputStream3.write(str2.getBytes("UTF-8"));
                    }
                    outputStream3.write(0);
                    if (z2) {
                        outputStream3.write(str.getBytes("UTF-8"));
                        outputStream3.write(0);
                    }
                    if (b(inputStream) != 0) {
                        throw new IOException("SOCKS4Connector: invalid proxy response");
                    }
                    switch (b(inputStream)) {
                        case 90:
                            inputStream.skip(6L);
                            return socketTcpConnectForDataTransferChannel;
                        case 91:
                            throw new IOException("SOCKS4Connector: connection refused/failed");
                        case 92:
                            throw new IOException("SOCKS4Connector: cannot validate the user");
                        case 93:
                            throw new IOException("SOCKS4Connector: invalid user");
                        default:
                            throw new IOException("SOCKS4Connector: invalid proxy response");
                    }
                } catch (IOException e) {
                    e = e;
                    outputStream = null;
                    socket = socketTcpConnectForDataTransferChannel;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        socketTcpConnectForDataTransferChannel = socket;
                        outputStream2 = outputStream;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (socketTcpConnectForDataTransferChannel != null) {
                            throw th;
                        }
                        try {
                            socketTcpConnectForDataTransferChannel.close();
                            throw th;
                        } catch (Throwable unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (socketTcpConnectForDataTransferChannel != null) {
                        throw th;
                    }
                    socketTcpConnectForDataTransferChannel.close();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                outputStream = null;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            outputStream = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            socketTcpConnectForDataTransferChannel = null;
            inputStream = null;
        }
    }

    @Override // it.sauronsoftware.ftp4j.FTPConnector
    public Socket connectForCommunicationChannel(String str, int i) throws IOException {
        return c(str, i, false);
    }

    @Override // it.sauronsoftware.ftp4j.FTPConnector
    public Socket connectForDataTransferChannel(String str, int i) throws IOException {
        return c(str, i, true);
    }

    public SOCKS4Connector(String str, int i) {
        this(str, i, null);
    }
}
