package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class f<R> implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable<f<?>>, FactoryPools.Poolable {
    private static final String F = "DecodeJob";
    private DataSource A;
    private DataFetcher<?> B;
    private volatile DataFetcherGenerator C;
    private volatile boolean D;
    private volatile boolean E;
    private final e d;
    private final Pools.Pool<f<?>> e;
    private GlideContext h;
    private Key i;
    private Priority j;
    private i k;
    private int l;
    private int m;
    private DiskCacheStrategy n;
    private Options o;
    private b<R> p;
    private int q;
    private h r;
    private g s;
    private long t;
    private boolean u;
    private Object v;
    private Thread w;
    private Key x;
    private Key y;
    private Object z;
    private final com.bumptech.glide.load.engine.e<R> a = new com.bumptech.glide.load.engine.e<>();
    private final List<Throwable> b = new ArrayList();
    private final StateVerifier c = StateVerifier.newInstance();
    private final d<?> f = new d<>();
    private final C0124f g = new C0124f();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b<R> {
        void a(f<?> fVar);

        void onLoadFailed(GlideException glideException);

        void onResourceReady(Resource<R> resource, DataSource dataSource);
    }

    public final class c<Z> implements DecodePath.a<Z> {
        private final DataSource a;

        public c(DataSource dataSource) {
            this.a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.DecodePath.a
        @NonNull
        public Resource<Z> a(@NonNull Resource<Z> resource) {
            return f.this.q(this.a, resource);
        }
    }

    public static class d<Z> {
        private Key a;
        private ResourceEncoder<Z> b;
        private m<Z> c;

        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public void b(e eVar, Options options) {
            GlideTrace.beginSection("DecodeJob.encode");
            try {
                eVar.a().put(this.a, new com.bumptech.glide.load.engine.d(this.b, this.c, options));
            } finally {
                this.c.d();
                GlideTrace.endSection();
            }
        }

        public boolean c() {
            return this.c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <X> void d(Key key, ResourceEncoder<X> resourceEncoder, m<X> mVar) {
            this.a = key;
            this.b = resourceEncoder;
            this.c = mVar;
        }
    }

    public interface e {
        DiskCache a();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$f, reason: collision with other inner class name */
    public static class C0124f {
        private boolean a;
        private boolean b;
        private boolean c;

        private boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        public synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        public synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public f(e eVar, Pools.Pool<f<?>> pool) {
        this.d = eVar;
        this.e = pool;
    }

    private <Data> Resource<R> b(DataFetcher<?> dataFetcher, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dataFetcher.cleanup();
            return null;
        }
        try {
            long logTime = LogTime.getLogTime();
            Resource<R> resourceC = c(data, dataSource);
            if (Log.isLoggable(F, 2)) {
                j("Decoded result " + resourceC, logTime);
            }
            return resourceC;
        } finally {
            dataFetcher.cleanup();
        }
    }

    private <Data> Resource<R> c(Data data, DataSource dataSource) throws GlideException {
        return u(data, dataSource, this.a.h(data.getClass()));
    }

    private void d() {
        if (Log.isLoggable(F, 2)) {
            k("Retrieved data", this.t, "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B);
        }
        Resource<R> resourceB = null;
        try {
            resourceB = b(this.B, this.z, this.A);
        } catch (GlideException e2) {
            e2.g(this.y, this.A);
            this.b.add(e2);
        }
        if (resourceB != null) {
            m(resourceB, this.A);
        } else {
            t();
        }
    }

    private DataFetcherGenerator e() {
        int i = a.b[this.r.ordinal()];
        if (i == 1) {
            return new n(this.a, this);
        }
        if (i == 2) {
            return new com.bumptech.glide.load.engine.b(this.a, this);
        }
        if (i == 3) {
            return new q(this.a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.r);
    }

    private h f(h hVar) {
        int i = a.b[hVar.ordinal()];
        if (i == 1) {
            return this.n.decodeCachedData() ? h.DATA_CACHE : f(h.DATA_CACHE);
        }
        if (i == 2) {
            return this.u ? h.FINISHED : h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return h.FINISHED;
        }
        if (i == 5) {
            return this.n.decodeCachedResource() ? h.RESOURCE_CACHE : f(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    @NonNull
    private Options g(DataSource dataSource) {
        Options options = this.o;
        if (Build.VERSION.SDK_INT < 26) {
            return options;
        }
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.a.w();
        Option<Boolean> option = Downsampler.ALLOW_HARDWARE_CONFIG;
        Boolean bool = (Boolean) options.get(option);
        if (bool != null && (!bool.booleanValue() || z)) {
            return options;
        }
        Options options2 = new Options();
        options2.putAll(this.o);
        options2.set(option, Boolean.valueOf(z));
        return options2;
    }

    private int h() {
        return this.j.ordinal();
    }

    private void j(String str, long j) {
        k(str, j, null);
    }

    private void k(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(LogTime.getElapsedMillis(j));
        sb.append(", load key: ");
        sb.append(this.k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v(F, sb.toString());
    }

    private void l(Resource<R> resource, DataSource dataSource) {
        w();
        this.p.onResourceReady(resource, dataSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m(Resource<R> resource, DataSource dataSource) {
        if (resource instanceof Initializable) {
            ((Initializable) resource).initialize();
        }
        m mVar = 0;
        if (this.f.c()) {
            resource = m.b(resource);
            mVar = resource;
        }
        l(resource, dataSource);
        this.r = h.ENCODE;
        try {
            if (this.f.c()) {
                this.f.b(this.d, this.o);
            }
            if (mVar != 0) {
                mVar.d();
            }
            o();
        } catch (Throwable th) {
            if (mVar != 0) {
                mVar.d();
            }
            throw th;
        }
    }

    private void n() {
        w();
        this.p.onLoadFailed(new GlideException("Failed to load resource", new ArrayList(this.b)));
        p();
    }

    private void o() {
        if (this.g.b()) {
            s();
        }
    }

    private void p() {
        if (this.g.c()) {
            s();
        }
    }

    private void s() {
        this.g.e();
        this.f.a();
        this.a.a();
        this.D = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = 0L;
        this.E = false;
        this.v = null;
        this.b.clear();
        this.e.release(this);
    }

    private void t() {
        this.w = Thread.currentThread();
        this.t = LogTime.getLogTime();
        boolean zA = false;
        while (!this.E && this.C != null && !(zA = this.C.a())) {
            this.r = f(this.r);
            this.C = e();
            if (this.r == h.SOURCE) {
                reschedule();
                return;
            }
        }
        if ((this.r == h.FINISHED || this.E) && !zA) {
            n();
        }
    }

    private <Data, ResourceType> Resource<R> u(Data data, DataSource dataSource, LoadPath<Data, ResourceType, R> loadPath) throws GlideException {
        Options optionsG = g(dataSource);
        DataRewinder<Data> rewinder = this.h.getRegistry().getRewinder(data);
        try {
            return loadPath.load(rewinder, optionsG, this.l, this.m, new c(dataSource));
        } finally {
            rewinder.cleanup();
        }
    }

    private void v() {
        int i = a.a[this.s.ordinal()];
        if (i == 1) {
            this.r = f(h.INITIALIZE);
            this.C = e();
            t();
        } else if (i == 2) {
            t();
        } else {
            if (i == 3) {
                d();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.s);
        }
    }

    private void w() {
        this.c.throwIfRecycled();
        if (this.D) {
            throw new IllegalStateException("Already notified");
        }
        this.D = true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull f<?> fVar) {
        int iH = h() - fVar.h();
        return iH == 0 ? this.q - fVar.q : iH;
    }

    public void cancel() {
        this.E = true;
        DataFetcherGenerator dataFetcherGenerator = this.C;
        if (dataFetcherGenerator != null) {
            dataFetcherGenerator.cancel();
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public StateVerifier getVerifier() {
        return this.c;
    }

    public f<R> i(GlideContext glideContext, Object obj, i iVar, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, Options options, b<R> bVar, int i3) {
        this.a.u(glideContext, obj, key, i, i2, diskCacheStrategy, cls, cls2, priority, options, map, z, z2, this.d);
        this.h = glideContext;
        this.i = key;
        this.j = priority;
        this.k = iVar;
        this.l = i;
        this.m = i2;
        this.n = diskCacheStrategy;
        this.u = z3;
        this.o = options;
        this.p = bVar;
        this.q = i3;
        this.s = g.INITIALIZE;
        this.v = obj;
        return this;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        dataFetcher.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.h(key, dataSource, dataFetcher.getDataClass());
        this.b.add(glideException);
        if (Thread.currentThread() == this.w) {
            t();
        } else {
            this.s = g.SWITCH_TO_SOURCE_SERVICE;
            this.p.a(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.x = key;
        this.z = obj;
        this.B = dataFetcher;
        this.A = dataSource;
        this.y = key2;
        if (Thread.currentThread() != this.w) {
            this.s = g.DECODE_DATA;
            this.p.a(this);
        } else {
            GlideTrace.beginSection("DecodeJob.decodeFromRetrievedData");
            try {
                d();
            } finally {
                GlideTrace.endSection();
            }
        }
    }

    @NonNull
    public <Z> Resource<Z> q(DataSource dataSource, @NonNull Resource<Z> resource) {
        Resource<Z> resourceTransform;
        Transformation<Z> transformation;
        EncodeStrategy encodeStrategy;
        Key cVar;
        Class<?> cls = resource.get().getClass();
        ResourceEncoder<Z> resourceEncoderN = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            Transformation<Z> transformationR = this.a.r(cls);
            transformation = transformationR;
            resourceTransform = transformationR.transform(this.h, resource, this.l, this.m);
        } else {
            resourceTransform = resource;
            transformation = null;
        }
        if (!resource.equals(resourceTransform)) {
            resource.recycle();
        }
        if (this.a.v(resourceTransform)) {
            resourceEncoderN = this.a.n(resourceTransform);
            encodeStrategy = resourceEncoderN.getEncodeStrategy(this.o);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        ResourceEncoder resourceEncoder = resourceEncoderN;
        if (!this.n.isResourceCacheable(!this.a.x(this.x), dataSource, encodeStrategy)) {
            return resourceTransform;
        }
        if (resourceEncoder == null) {
            throw new Registry.NoResultEncoderAvailableException(resourceTransform.get().getClass());
        }
        int i = a.c[encodeStrategy.ordinal()];
        if (i == 1) {
            cVar = new com.bumptech.glide.load.engine.c(this.x, this.i);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            cVar = new o(this.a.b(), this.x, this.i, this.l, this.m, transformation, cls, this.o);
        }
        m mVarB = m.b(resourceTransform);
        this.f.d(cVar, resourceEncoder, mVarB);
        return mVarB;
    }

    public void r(boolean z) {
        if (this.g.d(z)) {
            s();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
        this.s = g.SWITCH_TO_SOURCE_SERVICE;
        this.p.a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        GlideTrace.beginSectionFormat("DecodeJob#run(model=%s)", this.v);
        DataFetcher<?> dataFetcher = this.B;
        try {
            if (this.E) {
                n();
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
                GlideTrace.endSection();
                return;
            }
            v();
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
            GlideTrace.endSection();
        } catch (Throwable th) {
            try {
                if (Log.isLoggable(F, 3)) {
                    Log.d(F, "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + this.r, th);
                }
                if (this.r != h.ENCODE) {
                    this.b.add(th);
                    n();
                }
                if (!this.E) {
                    throw th;
                }
                if (dataFetcher != null) {
                }
            } catch (Throwable th2) {
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
                GlideTrace.endSection();
                throw th2;
            }
        }
    }

    public boolean x() {
        h hVarF = f(h.INITIALIZE);
        return hVarF == h.RESOURCE_CACHE || hVarF == h.DATA_CACHE;
    }
}
