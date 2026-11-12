package com.danikula.videocache;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.danikula.videocache.file.FileCache;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class d {
    private final AtomicInteger a = new AtomicInteger(0);
    private final String b;
    private volatile c c;
    private final List<CacheListener> d;
    private final CacheListener e;
    private final com.danikula.videocache.a f;

    public static final class a extends Handler implements CacheListener {
        private final String a;
        private final List<CacheListener> b;

        public a(String str, List<CacheListener> list) {
            super(Looper.getMainLooper());
            this.a = str;
            this.b = list;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<CacheListener> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().onCacheAvailable((File) message.obj, this.a, message.arg1);
            }
        }

        @Override // com.danikula.videocache.CacheListener
        public void onCacheAvailable(File file, String str, int i) {
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = file;
            sendMessage(messageObtainMessage);
        }
    }

    public d(String str, com.danikula.videocache.a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.d = copyOnWriteArrayList;
        this.b = (String) Preconditions.checkNotNull(str);
        this.f = (com.danikula.videocache.a) Preconditions.checkNotNull(aVar);
        this.e = new a(str, copyOnWriteArrayList);
    }

    private synchronized void a() {
        if (this.a.decrementAndGet() <= 0) {
            this.c.m();
            this.c = null;
        }
    }

    private c c() throws ProxyCacheException {
        String str = this.b;
        com.danikula.videocache.a aVar = this.f;
        c cVar = new c(new HttpUrlSource(str, aVar.d, aVar.e), new FileCache(this.f.a(this.b), this.f.c));
        cVar.t(this.e);
        return cVar;
    }

    private synchronized void g() throws ProxyCacheException {
        this.c = this.c == null ? c() : this.c;
    }

    public int b() {
        return this.a.get();
    }

    public void d(b bVar, Socket socket) throws IOException, ProxyCacheException {
        g();
        try {
            this.a.incrementAndGet();
            this.c.s(bVar, socket);
        } finally {
            a();
        }
    }

    public void e(CacheListener cacheListener) {
        this.d.add(cacheListener);
    }

    public void f() {
        this.d.clear();
        if (this.c != null) {
            this.c.t(null);
            this.c.m();
            this.c = null;
        }
        this.a.set(0);
    }

    public void h(CacheListener cacheListener) {
        this.d.remove(cacheListener);
    }
}
