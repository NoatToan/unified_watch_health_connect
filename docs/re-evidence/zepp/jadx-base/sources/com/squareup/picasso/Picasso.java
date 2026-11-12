package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.core.internal.view.SupportMenu;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class Picasso {
    public static final String p = "Picasso";
    public static final Handler q = new a(Looper.getMainLooper());
    public static volatile Picasso r = null;
    private final Listener a;
    private final RequestTransformer b;
    private final b c;
    private final List<RequestHandler> d;
    public final Context e;
    public final g f;
    public final Cache g;
    public final s h;
    public final Map<Object, com.squareup.picasso.a> i;
    public final Map<ImageView, f> j;
    public final ReferenceQueue<Object> k;
    public final Bitmap.Config l;
    public boolean m;
    public volatile boolean n;
    public boolean o;

    public static class Builder {
        private final Context a;
        private Downloader b;
        private ExecutorService c;
        private Cache d;
        private Listener e;
        private RequestTransformer f;
        private List<RequestHandler> g;
        private Bitmap.Config h;
        private boolean i;
        private boolean j;

        public Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.a = context.getApplicationContext();
        }

        public Builder addRequestHandler(RequestHandler requestHandler) {
            if (requestHandler == null) {
                throw new IllegalArgumentException("RequestHandler must not be null.");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            if (this.g.contains(requestHandler)) {
                throw new IllegalStateException("RequestHandler already registered.");
            }
            this.g.add(requestHandler);
            return this;
        }

        public Picasso build() {
            Context context = this.a;
            if (this.b == null) {
                this.b = u.h(context);
            }
            if (this.d == null) {
                this.d = new LruCache(context);
            }
            if (this.c == null) {
                this.c = new p();
            }
            if (this.f == null) {
                this.f = RequestTransformer.IDENTITY;
            }
            s sVar = new s(this.d);
            return new Picasso(context, new g(context, this.c, Picasso.q, this.b, this.d, sVar), this.d, this.e, this.f, this.g, sVar, this.h, this.i, this.j);
        }

        @Deprecated
        public Builder debugging(boolean z) {
            return indicatorsEnabled(z);
        }

        public Builder defaultBitmapConfig(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("Bitmap config must not be null.");
            }
            this.h = config;
            return this;
        }

        public Builder downloader(Downloader downloader) {
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.b = downloader;
            return this;
        }

        public Builder executor(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            }
            if (this.c != null) {
                throw new IllegalStateException("Executor service already set.");
            }
            this.c = executorService;
            return this;
        }

        public Builder indicatorsEnabled(boolean z) {
            this.i = z;
            return this;
        }

        public Builder listener(Listener listener) {
            if (listener == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.e = listener;
            return this;
        }

        public Builder loggingEnabled(boolean z) {
            this.j = z;
            return this;
        }

        public Builder memoryCache(Cache cache) {
            if (cache == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            }
            if (this.d != null) {
                throw new IllegalStateException("Memory cache already set.");
            }
            this.d = cache;
            return this;
        }

        public Builder requestTransformer(RequestTransformer requestTransformer) {
            if (requestTransformer == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (this.f != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            this.f = requestTransformer;
            return this;
        }
    }

    public interface Listener {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);

        public final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public interface RequestTransformer {
        public static final RequestTransformer IDENTITY = new a();

        public static class a implements RequestTransformer {
            @Override // com.squareup.picasso.Picasso.RequestTransformer
            public Request transformRequest(Request request) {
                return request;
            }
        }

        Request transformRequest(Request request);
    }

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.g().n) {
                    u.w(u.m, u.t, aVar.b.c(), "target got garbage collected");
                }
                aVar.a.b(aVar.k());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    c cVar = (c) list.get(i2);
                    cVar.b.c(cVar);
                    i2++;
                }
                return;
            }
            if (i != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i2 < size2) {
                com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i2);
                aVar2.a.i(aVar2);
                i2++;
            }
        }
    }

    public static class b extends Thread {
        private final ReferenceQueue<Object> a;
        private final Handler b;

        public class a implements Runnable {
            public final /* synthetic */ Exception a;

            public a(Exception exc) {
                this.a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.a);
            }
        }

        public b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.a = referenceQueue;
            this.b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void a() {
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    com.squareup.picasso.a.C0745a c0745a = (com.squareup.picasso.a.C0745a) this.a.remove(1000L);
                    Message messageObtainMessage = this.b.obtainMessage();
                    if (c0745a != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c0745a.a;
                        this.b.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.b.post(new a(e));
                    return;
                }
            }
        }
    }

    public Picasso(Context context, g gVar, Cache cache, Listener listener, RequestTransformer requestTransformer, List<RequestHandler> list, s sVar, Bitmap.Config config, boolean z, boolean z2) {
        this.e = context;
        this.f = gVar;
        this.g = cache;
        this.a = listener;
        this.b = requestTransformer;
        this.l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new r(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new d(context));
        arrayList.add(new m(context));
        arrayList.add(new e(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new i(context));
        arrayList.add(new n(gVar.d, sVar));
        this.d = Collections.unmodifiableList(arrayList);
        this.h = sVar;
        this.i = new WeakHashMap();
        this.j = new WeakHashMap();
        this.m = z;
        this.n = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.k = referenceQueue;
        b bVar = new b(referenceQueue, q);
        this.c = bVar;
        bVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        u.c();
        com.squareup.picasso.a aVarRemove = this.i.remove(obj);
        if (aVarRemove != null) {
            aVarRemove.a();
            this.f.c(aVarRemove);
        }
        if (obj instanceof ImageView) {
            f fVarRemove = this.j.remove((ImageView) obj);
            if (fVarRemove != null) {
                fVarRemove.a();
            }
        }
    }

    private void e(Bitmap bitmap, LoadedFrom loadedFrom, com.squareup.picasso.a aVar) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.i.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c();
            if (this.n) {
                u.v(u.m, u.E, aVar.b.c());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, loadedFrom);
        if (this.n) {
            u.w(u.m, u.D, aVar.b.c(), "from " + loadedFrom);
        }
    }

    public static void setSingletonInstance(Picasso picasso) {
        synchronized (Picasso.class) {
            if (r != null) {
                throw new IllegalStateException("Singleton instance already exists.");
            }
            r = picasso;
        }
    }

    public static Picasso with(Context context) {
        if (r == null) {
            synchronized (Picasso.class) {
                if (r == null) {
                    r = new Builder(context).build();
                }
            }
        }
        return r;
    }

    public boolean areIndicatorsEnabled() {
        return this.m;
    }

    public void c(c cVar) {
        com.squareup.picasso.a aVarH = cVar.h();
        List<com.squareup.picasso.a> listI = cVar.i();
        boolean z = true;
        boolean z2 = (listI == null || listI.isEmpty()) ? false : true;
        if (aVarH == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = cVar.j().uri;
            Exception excK = cVar.k();
            Bitmap bitmapQ = cVar.q();
            LoadedFrom loadedFromM = cVar.m();
            if (aVarH != null) {
                e(bitmapQ, loadedFromM, aVarH);
            }
            if (z2) {
                int size = listI.size();
                for (int i = 0; i < size; i++) {
                    e(bitmapQ, loadedFromM, listI.get(i));
                }
            }
            Listener listener = this.a;
            if (listener == null || excK == null) {
                return;
            }
            listener.onImageLoadFailed(this, uri, excK);
        }
    }

    public void cancelRequest(ImageView imageView) {
        b(imageView);
    }

    public void cancelTag(Object obj) {
        u.c();
        ArrayList arrayList = new ArrayList(this.i.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.squareup.picasso.a aVar = (com.squareup.picasso.a) arrayList.get(i);
            if (aVar.j().equals(obj)) {
                b(aVar.k());
            }
        }
    }

    public void d(ImageView imageView, f fVar) {
        this.j.put(imageView, fVar);
    }

    public void f(com.squareup.picasso.a aVar) {
        Object objK = aVar.k();
        if (objK != null && this.i.get(objK) != aVar) {
            b(objK);
            this.i.put(objK, aVar);
        }
        j(aVar);
    }

    public List<RequestHandler> g() {
        return this.d;
    }

    public StatsSnapshot getSnapshot() {
        return this.h.a();
    }

    public Bitmap h(String str) {
        Bitmap bitmap = this.g.get(str);
        if (bitmap != null) {
            this.h.d();
        } else {
            this.h.e();
        }
        return bitmap;
    }

    public void i(com.squareup.picasso.a aVar) {
        Bitmap bitmapH = MemoryPolicy.a(aVar.e) ? h(aVar.d()) : null;
        if (bitmapH == null) {
            f(aVar);
            if (this.n) {
                u.v(u.m, u.G, aVar.b.c());
                return;
            }
            return;
        }
        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
        e(bitmapH, loadedFrom, aVar);
        if (this.n) {
            u.w(u.m, u.D, aVar.b.c(), "from " + loadedFrom);
        }
    }

    public void invalidate(Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri == null");
        }
        this.g.clearKeyUri(uri.toString());
    }

    @Deprecated
    public boolean isDebugging() {
        return areIndicatorsEnabled() && isLoggingEnabled();
    }

    public boolean isLoggingEnabled() {
        return this.n;
    }

    public void j(com.squareup.picasso.a aVar) {
        this.f.j(aVar);
    }

    public Request k(Request request) {
        Request requestTransformRequest = this.b.transformRequest(request);
        if (requestTransformRequest != null) {
            return requestTransformRequest;
        }
        throw new IllegalStateException("Request transformer " + this.b.getClass().getCanonicalName() + " returned null for " + request);
    }

    public RequestCreator load(Uri uri) {
        return new RequestCreator(this, uri, 0);
    }

    public void pauseTag(Object obj) {
        this.f.g(obj);
    }

    public void resumeTag(Object obj) {
        this.f.h(obj);
    }

    @Deprecated
    public void setDebugging(boolean z) {
        setIndicatorsEnabled(z);
    }

    public void setIndicatorsEnabled(boolean z) {
        this.m = z;
    }

    public void setLoggingEnabled(boolean z) {
        this.n = z;
    }

    public void shutdown() {
        if (this == r) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.o) {
            return;
        }
        this.g.clear();
        this.c.a();
        this.h.n();
        this.f.z();
        Iterator<f> it2 = this.j.values().iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.j.clear();
        this.o = true;
    }

    public void cancelRequest(Target target) {
        b(target);
    }

    public RequestCreator load(String str) {
        if (str == null) {
            return new RequestCreator(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return load(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void cancelRequest(RemoteViews remoteViews, int i) {
        b(new q.c(remoteViews, i));
    }

    public void invalidate(String str) {
        if (str != null) {
            invalidate(Uri.parse(str));
            return;
        }
        throw new IllegalArgumentException("path == null");
    }

    public void invalidate(File file) {
        if (file != null) {
            invalidate(Uri.fromFile(file));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }

    public RequestCreator load(File file) {
        if (file == null) {
            return new RequestCreator(this, null, 0);
        }
        return load(Uri.fromFile(file));
    }

    public RequestCreator load(int i) {
        if (i != 0) {
            return new RequestCreator(this, null, i);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }
}
