package it.sauronsoftware.ftp4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes22.dex */
public class FTPCommunicationChannel {
    private ArrayList a = new ArrayList();
    private Socket b;
    private String c;
    private d d;
    private e e;

    public FTPCommunicationChannel(Socket socket, String str) throws IOException {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.b = socket;
        this.c = str;
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        this.d = new d(inputStream, str);
        this.e = new e(outputStream, str);
    }

    private String a() throws IOException {
        String strB = this.d.b();
        if (strB == null) {
            throw new IOException("FTPConnection closed");
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((FTPCommunicationListener) it2.next()).received(strB);
        }
        return strB;
    }

    public void addCommunicationListener(FTPCommunicationListener fTPCommunicationListener) {
        this.a.add(fTPCommunicationListener);
    }

    public void changeCharset(String str) throws IOException {
        this.c = str;
        this.d.a(str);
        this.e.a(str);
    }

    public void close() {
        try {
            this.b.close();
        } catch (Exception unused) {
        }
    }

    public FTPCommunicationListener[] getCommunicationListeners() {
        int size = this.a.size();
        FTPCommunicationListener[] fTPCommunicationListenerArr = new FTPCommunicationListener[size];
        for (int i = 0; i < size; i++) {
            fTPCommunicationListenerArr[i] = (FTPCommunicationListener) this.a.get(i);
        }
        return fTPCommunicationListenerArr;
    }

    public FTPReply readFTPReply() throws FTPIllegalReplyException, IOException {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            String strA = a();
            if (strA.trim().length() != 0) {
                if (strA.startsWith("\n")) {
                    strA = strA.substring(1);
                }
                int length = strA.length();
                if (i2 == 0 && length < 3) {
                    throw new FTPIllegalReplyException();
                }
                try {
                    i = Integer.parseInt(strA.substring(0, 3));
                } catch (Exception unused) {
                    if (i2 == 0) {
                        throw new FTPIllegalReplyException();
                    }
                    i = 0;
                }
                if (i2 != 0 && i != 0 && i != i2) {
                    throw new FTPIllegalReplyException();
                }
                if (i2 == 0) {
                    i2 = i;
                }
                if (i <= 0) {
                    arrayList.add(strA);
                } else if (length > 3) {
                    char cCharAt = strA.charAt(3);
                    arrayList.add(strA.substring(4, length));
                    if (cCharAt == ' ') {
                        break;
                    }
                    if (cCharAt != '-') {
                        throw new FTPIllegalReplyException();
                    }
                } else {
                    if (length == 3) {
                        break;
                    }
                    arrayList.add(strA);
                }
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = (String) arrayList.get(i3);
        }
        return new FTPReply(i2, strArr);
    }

    public void removeCommunicationListener(FTPCommunicationListener fTPCommunicationListener) {
        this.a.remove(fTPCommunicationListener);
    }

    public void sendFTPCommand(String str) throws IOException {
        this.e.b(str);
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((FTPCommunicationListener) it2.next()).sent(str);
        }
    }

    public void ssl(SSLSocketFactory sSLSocketFactory) throws IOException {
        Socket socketCreateSocket = sSLSocketFactory.createSocket(this.b, this.b.getInetAddress().getHostName(), this.b.getPort(), true);
        this.b = socketCreateSocket;
        InputStream inputStream = socketCreateSocket.getInputStream();
        OutputStream outputStream = this.b.getOutputStream();
        this.d = new d(inputStream, this.c);
        this.e = new e(outputStream, this.c);
    }
}
