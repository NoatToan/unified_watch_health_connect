package it.sauronsoftware.ftp4j;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes22.dex */
class b implements a, Runnable {
    private ServerSocket a;
    private Socket b;
    private IOException c;
    private Thread d;

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public b() throws FTPDataTransferException {
        int i;
        int i2;
        boolean z;
        boolean z2;
        this.a = null;
        String property = System.getProperty(c.a);
        boolean z3 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (stringTokenizer.countTokens() == 2) {
                String strNextToken = stringTokenizer.nextToken();
                String strNextToken2 = stringTokenizer.nextToken();
                try {
                    i2 = Integer.parseInt(strNextToken);
                } catch (NumberFormatException unused) {
                    i2 = 0;
                }
                try {
                    i = Integer.parseInt(strNextToken2);
                } catch (NumberFormatException unused2) {
                    i = 0;
                }
                if (i2 <= 0 || i <= 0 || i < i2) {
                    i = 0;
                    i2 = 0;
                    z2 = false;
                    z = false;
                } else {
                    z2 = true;
                    z = true;
                }
            } else {
                i = 0;
                i2 = 0;
                z2 = false;
                z = false;
            }
            if (!z2) {
                System.err.println("WARNING: invalid value \"" + property + "\" for the " + c.a + " system property. The value should be in the start-stop form, with start > 0, stop > 0 and start <= stop.");
            }
        } else {
            i = 0;
            i2 = 0;
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            while (i2 <= i) {
                arrayList.add(new Integer(i2));
                i2++;
            }
            while (!z3) {
                int size = arrayList.size();
                if (size <= 0) {
                    break;
                }
                int iIntValue = ((Integer) arrayList.remove((int) Math.floor(Math.random() * ((double) size)))).intValue();
                try {
                    ServerSocket serverSocket = new ServerSocket();
                    this.a = serverSocket;
                    serverSocket.setReceiveBufferSize(524288);
                    this.a.bind(new InetSocketAddress(iIntValue));
                    z3 = true;
                } catch (IOException unused3) {
                }
            }
            if (!z3) {
                throw new FTPDataTransferException("Cannot open the ServerSocket. No available port found in range " + property);
            }
        } else {
            try {
                ServerSocket serverSocket2 = new ServerSocket();
                this.a = serverSocket2;
                serverSocket2.setReceiveBufferSize(524288);
                this.a.bind(new InetSocketAddress(0));
            } catch (IOException e) {
                throw new FTPDataTransferException("Cannot open the ServerSocket", e);
            }
        }
        Thread thread = new Thread(this);
        this.d = thread;
        thread.start();
    }

    @Override // it.sauronsoftware.ftp4j.a
    public Socket a() throws FTPDataTransferException {
        if (this.b == null && this.c == null) {
            try {
                this.d.join();
            } catch (Exception unused) {
            }
        }
        if (this.c != null) {
            throw new FTPDataTransferException("Cannot receive the incoming connection", this.c);
        }
        Socket socket = this.b;
        if (socket != null) {
            return socket;
        }
        throw new FTPDataTransferException("No socket available");
    }

    public int b() {
        return this.a.getLocalPort();
    }

    @Override // it.sauronsoftware.ftp4j.a
    public void dispose() {
        ServerSocket serverSocket = this.a;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        String property = System.getProperty(c.c);
        int i2 = 30000;
        if (property != null) {
            boolean z = false;
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i >= 0) {
                z = true;
                i2 = i;
            }
            if (!z) {
                System.err.println("WARNING: invalid value \"" + property + "\" for the " + c.c + " system property. The value should be an integer greater or equal to 0.");
            }
        }
        try {
            try {
                this.a.setSoTimeout(i2);
                Socket socketAccept = this.a.accept();
                this.b = socketAccept;
                socketAccept.setSendBufferSize(524288);
            } finally {
                try {
                    this.a.close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException e) {
            this.c = e;
        }
    }
}
