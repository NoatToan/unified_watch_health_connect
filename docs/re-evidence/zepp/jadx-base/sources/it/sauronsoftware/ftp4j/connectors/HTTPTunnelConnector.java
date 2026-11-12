package it.sauronsoftware.ftp4j.connectors;

import it.sauronsoftware.ftp4j.FTPConnector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class HTTPTunnelConnector extends FTPConnector {
    private String c;
    private int d;
    private String e;
    private String f;

    public HTTPTunnelConnector(String str, int i, String str2, String str3) {
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[SYNTHETIC] */
    private Socket b(String str, int i, boolean z) throws Throwable {
        Socket socketTcpConnectForDataTransferChannel;
        InputStream inputStream;
        OutputStream outputStream;
        byte[] bytes = "\r\n".getBytes("UTF-8");
        String str2 = "CONNECT " + str + ":" + i + " HTTP/1.1";
        String str3 = "Host: " + str + ":" + i;
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
                    outputStream3.write(str2.getBytes("UTF-8"));
                    outputStream3.write(bytes);
                    outputStream3.write(str3.getBytes("UTF-8"));
                    outputStream3.write(bytes);
                    if (this.e != null && this.f != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Proxy-Authorization: Basic ");
                        sb.append(a.g(this.e + ":" + this.f));
                        outputStream3.write(sb.toString().getBytes("UTF-8"));
                        outputStream3.write(bytes);
                    }
                    outputStream3.write(bytes);
                    outputStream3.flush();
                    ArrayList arrayList = new ArrayList();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    for (String line = bufferedReader.readLine(); line != null && line.length() > 0; line = bufferedReader.readLine()) {
                        arrayList.add(line);
                    }
                    int size = arrayList.size();
                    if (size < 1) {
                        throw new IOException("HTTPTunnelConnector: invalid proxy response");
                    }
                    String str4 = (String) arrayList.get(0);
                    if (!str4.startsWith("HTTP/") || str4.length() < 12) {
                        throw new IOException("HTTPTunnelConnector: invalid proxy response");
                    }
                    if ("200".equals(str4.substring(9, 12))) {
                        return socketTcpConnectForDataTransferChannel;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("HTTPTunnelConnector: connection failed\r\n");
                    stringBuffer.append("Response received from the proxy:\r\n");
                    for (int i2 = 0; i2 < size; i2++) {
                        stringBuffer.append((String) arrayList.get(i2));
                        stringBuffer.append("\r\n");
                    }
                    throw new IOException(stringBuffer.toString());
                } catch (IOException e) {
                    e = e;
                    Socket socket2 = socketTcpConnectForDataTransferChannel;
                    outputStream = null;
                    socket = socket2;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        OutputStream outputStream4 = outputStream;
                        socketTcpConnectForDataTransferChannel = socket;
                        outputStream2 = outputStream4;
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
                inputStream = null;
                socket = socketTcpConnectForDataTransferChannel;
                outputStream = null;
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
        return b(str, i, false);
    }

    @Override // it.sauronsoftware.ftp4j.FTPConnector
    public Socket connectForDataTransferChannel(String str, int i) throws IOException {
        return b(str, i, true);
    }

    public HTTPTunnelConnector(String str, int i) {
        this(str, i, null, null);
    }
}
