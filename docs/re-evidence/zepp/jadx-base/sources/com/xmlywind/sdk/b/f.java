package com.xmlywind.sdk.b;

import android.content.Context;
import android.net.Uri;
import com.xmlywind.logger.SigmobLog;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public class f {
    private final Object a;
    private final ExecutorService b;
    private final Map<String, g> c;
    private final ServerSocket d;
    private final int e;
    private final Thread f;
    private final com.xmlywind.sdk.b.c g;
    private final k h;

    public static final class a {
        private File a;
        private com.xmlywind.sdk.b.c.c d;
        private com.xmlywind.sdk.b.a.a c = new com.xmlywind.sdk.b.a.g(536870912);
        private com.xmlywind.sdk.b.a.c b = new com.xmlywind.sdk.b.a.f();
        private com.xmlywind.sdk.b.b.b e = new com.xmlywind.sdk.b.b.a();

        public a(Context context) {
            this.d = com.xmlywind.sdk.b.c.d.a(context);
            this.a = r.a(context);
        }

        private com.xmlywind.sdk.b.c b() {
            return new com.xmlywind.sdk.b.c(this.a, this.b, this.c, this.d, this.e);
        }

        public a a(File file) {
            this.a = (File) l.a(file);
            return this;
        }

        public f a() {
            return new f(b());
        }
    }

    public final class b implements Runnable {
        private final Socket b;

        public b(Socket socket) {
            this.b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.a(this.b);
        }
    }

    public final class c implements Runnable {
        private final CountDownLatch b;

        public c(CountDownLatch countDownLatch) {
            this.b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.countDown();
            f.this.b();
        }
    }

    private f(com.xmlywind.sdk.b.c cVar) {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(8);
        this.c = new ConcurrentHashMap();
        this.g = (com.xmlywind.sdk.b.c) l.a(cVar);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.e = localPort;
            i.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new c(countDownLatch));
            this.f = thread;
            thread.start();
            countDownLatch.await();
            this.h = new k("127.0.0.1", localPort);
            SigmobLog.i("Proxy cache server started. Is it alive? " + a());
        } catch (IOException | InterruptedException e) {
            this.b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    private void a(File file) {
        try {
            this.g.c.a(file);
        } catch (IOException e) {
            SigmobLog.e("Error touching file " + file, e);
        }
    }

    private void a(Throwable th) {
        SigmobLog.e("HttpProxyCacheServer error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Socket socket) {
        StringBuilder sb;
        try {
            try {
                d dVarA = d.a(socket.getInputStream());
                SigmobLog.d("Request to cache proxy:" + dVarA);
                String strC = o.c(dVarA.a);
                if (this.h.a(strC)) {
                    this.h.a(socket);
                } else {
                    e(strC).a(dVarA, socket);
                }
                b(socket);
                sb = new StringBuilder();
            } catch (n e) {
                e = e;
                a(new n("Error processing request", e));
                b(socket);
                sb = new StringBuilder();
            } catch (SocketException unused) {
                SigmobLog.d("Closing socket… Socket is closed by client.");
                b(socket);
                sb = new StringBuilder();
            } catch (IOException e2) {
                e = e2;
                a(new n("Error processing request", e));
                b(socket);
                sb = new StringBuilder();
            }
            sb.append("Opened connections: ");
            sb.append(c());
            SigmobLog.d(sb.toString());
        } catch (Throwable th) {
            b(socket);
            SigmobLog.d("Opened connections: " + c());
            throw th;
        }
    }

    private boolean a() {
        return this.h.a(3, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket socketAccept = this.d.accept();
                SigmobLog.d("Accept new socket " + socketAccept);
                this.b.submit(new b(socketAccept));
            } catch (IOException e) {
                a(new n("Error during waiting connection", e));
                return;
            }
        }
    }

    private void b(Socket socket) {
        c(socket);
        d(socket);
        e(socket);
    }

    private int c() {
        int iA;
        synchronized (this.a) {
            Iterator<g> it2 = this.c.values().iterator();
            iA = 0;
            while (it2.hasNext()) {
                iA += it2.next().a();
            }
        }
        return iA;
    }

    private void c(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
            SigmobLog.d("Releasing input stream… Socket is closed by client.");
        } catch (IOException e) {
            a(new n("Error closing socket input stream", e));
        }
    }

    private String d(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.e), o.b(str));
    }

    private void d(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            SigmobLog.e("Failed to close socket on proxy side  It seems client have already closed connection.", e);
        }
    }

    private g e(String str) {
        g gVar;
        synchronized (this.a) {
            gVar = this.c.get(str);
            if (gVar == null) {
                gVar = new g(str, this.g);
                this.c.put(str, gVar);
            }
        }
        return gVar;
    }

    private void e(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e) {
            a(new n("Error closing socket", e));
        }
    }

    public String a(String str) {
        return a(str, true);
    }

    public String a(String str, boolean z) {
        if (!z || !b(str)) {
            return a() ? d(str) : str;
        }
        File fileC = c(str);
        a(fileC);
        return Uri.fromFile(fileC).toString();
    }

    public boolean b(String str) {
        l.a(str, "Url can't be null!");
        return c(str).exists();
    }

    public File c(String str) {
        com.xmlywind.sdk.b.c cVar = this.g;
        return new File(cVar.a, cVar.b.a(str));
    }
}
