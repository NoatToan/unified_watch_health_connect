package it.sauronsoftware.ftp4j.connectors;

import com.huami.watch.musicupload.fragment.MusicConstant;
import it.sauronsoftware.ftp4j.FTPCommunicationChannel;
import it.sauronsoftware.ftp4j.FTPConnector;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes22.dex */
public class FTPProxyConnector extends FTPConnector {
    public static int STYLE_OPEN_COMMAND = 1;
    public static int STYLE_SITE_COMMAND;
    private String c;
    private int d;
    private String e;
    private String f;
    public int style;

    public FTPProxyConnector(String str, int i, String str2, String str3) {
        super(true);
        this.style = STYLE_SITE_COMMAND;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
    }

    @Override // it.sauronsoftware.ftp4j.FTPConnector
    public Socket connectForCommunicationChannel(String str, int i) throws IOException {
        boolean z;
        Socket socketTcpConnectForCommunicationChannel = tcpConnectForCommunicationChannel(this.c, this.d);
        FTPCommunicationChannel fTPCommunicationChannel = new FTPCommunicationChannel(socketTcpConnectForCommunicationChannel, "ASCII");
        try {
            if (fTPCommunicationChannel.readFTPReply().getCode() != 220) {
                throw new IOException("Invalid proxy response");
            }
            int i2 = this.style;
            if (i2 == STYLE_SITE_COMMAND) {
                fTPCommunicationChannel.sendFTPCommand("USER " + this.e);
                try {
                    int code = fTPCommunicationChannel.readFTPReply().getCode();
                    if (code == 230) {
                        z = false;
                    } else {
                        if (code != 331) {
                            throw new IOException("Proxy authentication failed");
                        }
                        z = true;
                    }
                    if (z) {
                        fTPCommunicationChannel.sendFTPCommand("PASS " + this.f);
                        try {
                            if (fTPCommunicationChannel.readFTPReply().getCode() != 230) {
                                throw new IOException("Proxy authentication failed");
                            }
                        } catch (FTPIllegalReplyException unused) {
                            throw new IOException("Invalid proxy response");
                        }
                    }
                    fTPCommunicationChannel.sendFTPCommand("SITE " + str + ":" + i);
                } catch (FTPIllegalReplyException unused2) {
                    throw new IOException("Invalid proxy response");
                }
            } else if (i2 == STYLE_OPEN_COMMAND) {
                fTPCommunicationChannel.sendFTPCommand("OPEN " + str + ":" + i);
            }
            return socketTcpConnectForCommunicationChannel;
        } catch (FTPIllegalReplyException unused3) {
            throw new IOException("Invalid proxy response");
        }
    }

    @Override // it.sauronsoftware.ftp4j.FTPConnector
    public Socket connectForDataTransferChannel(String str, int i) throws IOException {
        return tcpConnectForDataTransferChannel(str, i);
    }

    public void setStyle(int i) {
        if (i != STYLE_OPEN_COMMAND && i != STYLE_SITE_COMMAND) {
            throw new IllegalArgumentException("Invalid style");
        }
        this.style = i;
    }

    public FTPProxyConnector(String str, int i) {
        this(str, i, MusicConstant.FTP_USER_NAME, "ftp4j");
    }
}
