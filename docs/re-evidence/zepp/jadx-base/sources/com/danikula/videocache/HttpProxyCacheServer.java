package com.danikula.videocache;

import android.content.Context;
import android.net.Uri;
import com.danikula.videocache.file.DiskUsage;
import com.danikula.videocache.file.FileNameGenerator;
import com.danikula.videocache.file.Md5FileNameGenerator;
import com.danikula.videocache.file.TotalCountLruDiskUsage;
import com.danikula.videocache.file.TotalSizeLruDiskUsage;
import com.danikula.videocache.headers.EmptyHeadersInjector;
import com.danikula.videocache.headers.HeaderInjector;
import com.danikula.videocache.sourcestorage.SourceInfoStorage;
import com.danikula.videocache.sourcestorage.SourceInfoStorageFactory;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class HttpProxyCacheServer {
    private static final Logger i = LoggerFactory.getLogger("HttpProxyCacheServer");
    private static final String j = "127.0.0.1";
    private final Object a;
    private final ExecutorService b;
    private final Map<String, d> c;
    private final ServerSocket d;
    private final int e;
    private final Thread f;
    private final com.danikula.videocache.a g;
    private final f h;

    public static final class Builder {
        private static final long f = 536870912;
        private File a;
        private SourceInfoStorage d;
        private DiskUsage c = new TotalSizeLruDiskUsage(f);
        private FileNameGenerator b = new Md5FileNameGenerator();
        private HeaderInjector e = new EmptyHeadersInjector();

        public Builder(Context context) {
            this.d = SourceInfoStorageFactory.newSourceInfoStorage(context);
            this.a = h.c(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.danikula.videocache.a b() {
            return new com.danikula.videocache.a(this.a, this.b, this.c, this.d, this.e);
        }

        public HttpProxyCacheServer build() {
            return new HttpProxyCacheServer(b());
        }

        public Builder cacheDirectory(File file) {
            this.a = (File) Preconditions.checkNotNull(file);
            return this;
        }

        public Builder diskUsage(DiskUsage diskUsage) {
            this.c = (DiskUsage) Preconditions.checkNotNull(diskUsage);
            return this;
        }

        public Builder fileNameGenerator(FileNameGenerator fileNameGenerator) {
            this.b = (FileNameGenerator) Preconditions.checkNotNull(fileNameGenerator);
            return this;
        }

        public Builder headerInjector(HeaderInjector headerInjector) {
            this.e = (HeaderInjector) Preconditions.checkNotNull(headerInjector);
            return this;
        }

        public Builder maxCacheFilesCount(int i) {
            this.c = new TotalCountLruDiskUsage(i);
            return this;
        }

        public Builder maxCacheSize(long j) {
            this.c = new TotalSizeLruDiskUsage(j);
            return this;
        }
    }

    public final class b implements Runnable {
        private final Socket a;

        public b(Socket socket) {
            this.a = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpProxyCacheServer.this.l(this.a);
        }
    }

    public final class c implements Runnable {
        private final CountDownLatch a;

        public c(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.countDown();
            HttpProxyCacheServer.this.p();
        }
    }

    private String c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", j, Integer.valueOf(this.e), ProxyCacheUtils.e(str));
    }

    private void d(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e) {
            k(new ProxyCacheException("Error closing socket", e));
        }
    }

    private void e(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
            i.debug("Releasing input stream… Socket is closed by client.");
        } catch (IOException e) {
            k(new ProxyCacheException("Error closing socket input stream", e));
        }
    }

    private void f(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            i.warn("Failed to close socket on proxy side: {}. It seems client have already closed connection.", e.getMessage());
        }
    }

    private File g(String str) {
        com.danikula.videocache.a aVar = this.g;
        return new File(aVar.a, aVar.b.generate(str));
    }

    private d h(String str) throws ProxyCacheException {
        d dVar;
        synchronized (this.a) {
            dVar = this.c.get(str);
            if (dVar == null) {
                dVar = new d(str, this.g);
                this.c.put(str, dVar);
            }
        }
        return dVar;
    }

    private int i() {
        int iB;
        synchronized (this.a) {
            iB = 0;
            Iterator<d> it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                iB += it2.next().b();
            }
        }
        return iB;
    }

    private boolean j() {
        return this.h.e(3, 70);
    }

    private void k(Throwable th) {
        i.error("HttpProxyCacheServer error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Socket socket) {
        try {
            try {
                com.danikula.videocache.b bVarC = com.danikula.videocache.b.c(socket.getInputStream());
                Logger logger = i;
                logger.debug("Request to cache proxy:" + bVarC);
                String strD = ProxyCacheUtils.d(bVarC.a);
                if (this.h.d(strD)) {
                    this.h.g(socket);
                } else {
                    h(strD).d(bVarC, socket);
                }
                m(socket);
                logger.debug("Opened connections: " + i());
            } catch (ProxyCacheException e) {
                e = e;
                k(new ProxyCacheException("Error processing request", e));
                m(socket);
                i.debug("Opened connections: " + i());
            } catch (SocketException unused) {
                Logger logger2 = i;
                logger2.debug("Closing socket… Socket is closed by client.");
                m(socket);
                logger2.debug("Opened connections: " + i());
            } catch (IOException e2) {
                e = e2;
                k(new ProxyCacheException("Error processing request", e));
                m(socket);
                i.debug("Opened connections: " + i());
            }
        } catch (Throwable th) {
            m(socket);
            i.debug("Opened connections: " + i());
            throw th;
        }
    }

    private void m(Socket socket) {
        e(socket);
        f(socket);
        d(socket);
    }

    private void n() {
        synchronized (this.a) {
            Iterator<d> it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                it2.next().f();
            }
            this.c.clear();
        }
    }

    private void o(File file) {
        try {
            this.g.c.touch(file);
        } catch (IOException e) {
            i.error("Error touching file " + file, (Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket socketAccept = this.d.accept();
                i.debug("Accept new socket " + socketAccept);
                this.b.submit(new b(socketAccept));
            } catch (IOException e) {
                k(new ProxyCacheException("Error during waiting connection", e));
                return;
            }
        }
    }

    public String getProxyUrl(String str) {
        return getProxyUrl(str, true);
    }

    public boolean isCached(String str) {
        Preconditions.checkNotNull(str, "Url can't be null!");
        return g(str).exists();
    }

    public void registerCacheListener(CacheListener cacheListener, String str) {
        Preconditions.checkAllNotNull(cacheListener, str);
        synchronized (this.a) {
            try {
                h(str).e(cacheListener);
            } catch (ProxyCacheException e) {
                i.warn("Error registering cache listener", (Throwable) e);
            }
        }
    }

    public void shutdown() {
        i.info("Shutdown proxy server");
        n();
        this.g.d.release();
        this.f.interrupt();
        try {
            if (this.d.isClosed()) {
                return;
            }
            this.d.close();
        } catch (IOException e) {
            k(new ProxyCacheException("Error shutting down proxy server", e));
        }
    }

    public void unregisterCacheListener(CacheListener cacheListener, String str) {
        Preconditions.checkAllNotNull(cacheListener, str);
        synchronized (this.a) {
            try {
                h(str).h(cacheListener);
            } catch (ProxyCacheException e) {
                i.warn("Error registering cache listener", (Throwable) e);
            }
        }
    }

    public HttpProxyCacheServer(Context context) {
        this(new Builder(context).b());
    }

    public String getProxyUrl(String str, boolean z) {
        if (!z || !isCached(str)) {
            return j() ? c(str) : str;
        }
        File fileG = g(str);
        o(fileG);
        return Uri.fromFile(fileG).toString();
    }

    private HttpProxyCacheServer(com.danikula.videocache.a aVar) {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(8);
        this.c = new ConcurrentHashMap();
        this.g = (com.danikula.videocache.a) Preconditions.checkNotNull(aVar);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName(j));
            this.d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.e = localPort;
            e.a(j, localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new c(countDownLatch));
            this.f = thread;
            thread.start();
            countDownLatch.await();
            this.h = new f(j, localPort);
            i.info("Proxy cache server started. Is it alive? " + j());
        } catch (IOException | InterruptedException e) {
            this.b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    public void unregisterCacheListener(CacheListener cacheListener) {
        Preconditions.checkNotNull(cacheListener);
        synchronized (this.a) {
            Iterator<d> it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                it2.next().h(cacheListener);
            }
        }
    }
}
