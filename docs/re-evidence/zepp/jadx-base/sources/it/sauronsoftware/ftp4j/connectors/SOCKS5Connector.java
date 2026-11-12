package it.sauronsoftware.ftp4j.connectors;

import it.sauronsoftware.ftp4j.FTPConnector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes22.dex */
public class SOCKS5Connector extends FTPConnector {
    private String c;
    private int d;
    private String e;
    private String f;

    public SOCKS5Connector(String str, int i, String str2, String str3) {
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
    }

    private int b(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            return i;
        }
        throw new IOException("SOCKS5Connector: connection closed by the proxy");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[SYNTHETIC] */
    private Socket c(String str, int i, boolean z) throws Throwable {
        Socket socketTcpConnectForDataTransferChannel;
        InputStream inputStream;
        OutputStream outputStream;
        boolean z2 = (this.e == null || this.f == null) ? false : true;
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
                    outputStream3.write(5);
                    if (z2) {
                        outputStream3.write(1);
                        outputStream3.write(2);
                    } else {
                        outputStream3.write(1);
                        outputStream3.write(0);
                    }
                    if (b(inputStream) != 5) {
                        throw new IOException("SOCKS5Connector: invalid proxy response");
                    }
                    int iB = b(inputStream);
                    if (z2) {
                        if (iB != 2) {
                            throw new IOException("SOCKS5Connector: proxy doesn't support username/password authentication method");
                        }
                        byte[] bytes = this.e.getBytes("UTF-8");
                        byte[] bytes2 = this.f.getBytes("UTF-8");
                        int length = bytes.length;
                        int length2 = bytes2.length;
                        if (length > 255) {
                            throw new IOException("SOCKS5Connector: username too long");
                        }
                        if (length2 > 255) {
                            throw new IOException("SOCKS5Connector: password too long");
                        }
                        outputStream3.write(1);
                        outputStream3.write(length);
                        outputStream3.write(bytes);
                        outputStream3.write(length2);
                        outputStream3.write(bytes2);
                        if (b(inputStream) != 1) {
                            throw new IOException("SOCKS5Connector: invalid proxy response");
                        }
                        if (b(inputStream) != 0) {
                            throw new IOException("SOCKS5Connector: authentication failed");
                        }
                    } else if (iB != 0) {
                        throw new IOException("SOCKS5Connector: proxy requires authentication");
                    }
                    outputStream3.write(5);
                    outputStream3.write(1);
                    outputStream3.write(0);
                    outputStream3.write(3);
                    byte[] bytes3 = str.getBytes("UTF-8");
                    if (bytes3.length > 255) {
                        throw new IOException("SOCKS5Connector: domain name too long");
                    }
                    outputStream3.write(bytes3.length);
                    outputStream3.write(bytes3);
                    outputStream3.write(i >> 8);
                    outputStream3.write(i);
                    if (b(inputStream) != 5) {
                        throw new IOException("SOCKS5Connector: invalid proxy response");
                    }
                    switch (b(inputStream)) {
                        case 0:
                            inputStream.skip(1L);
                            int iB2 = b(inputStream);
                            if (iB2 == 1) {
                                inputStream.skip(4L);
                            } else if (iB2 == 3) {
                                inputStream.skip(b(inputStream));
                            } else {
                                if (iB2 != 4) {
                                    throw new IOException("SOCKS5Connector: invalid proxy response");
                                }
                                inputStream.skip(16L);
                            }
                            inputStream.skip(2L);
                            return socketTcpConnectForDataTransferChannel;
                        case 1:
                            throw new IOException("SOCKS5Connector: general failure");
                        case 2:
                            throw new IOException("SOCKS5Connector: connection not allowed by ruleset");
                        case 3:
                            throw new IOException("SOCKS5Connector: network unreachable");
                        case 4:
                            throw new IOException("SOCKS5Connector: host unreachable");
                        case 5:
                            throw new IOException("SOCKS5Connector: connection refused by destination host");
                        case 6:
                            throw new IOException("SOCKS5Connector: TTL expired");
                        case 7:
                            throw new IOException("SOCKS5Connector: command not supported / protocol error");
                        case 8:
                            throw new IOException("SOCKS5Connector: address type not supported");
                        default:
                            throw new IOException("SOCKS5Connector: invalid proxy response");
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
                            } catch (Throwable unused) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (socketTcpConnectForDataTransferChannel != null) {
                            throw th;
                        }
                        try {
                            socketTcpConnectForDataTransferChannel.close();
                            throw th;
                        } catch (Throwable unused3) {
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

    public SOCKS5Connector(String str, int i) {
        this(str, i, null, null);
    }
}
