package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bs5<R> implements kl5.a, Runnable, Comparable<bs5<?>>, u69.f {
    public DataSource A;
    public jl5<?> B;
    public volatile kl5 C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;
    public final e d;
    public final Pools.Pool<bs5<?>> e;
    public com.bumptech.glide.c h;
    public pzd i;
    public Priority j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sb8 f4539k;
    public int l;
    public int m;
    public jy6 n;
    public cch o;
    public b<R> p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f4540r;
    public g s;
    public long t;
    public boolean u;
    public Object v;
    public Thread w;
    public pzd x;
    public pzd y;
    public Object z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final as5<R> f4537a = new as5<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Throwable> f4538b = new ArrayList();
    public final ado c = ado.a();
    public final d<?> f = new d<>();
    public final f g = new f();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4542b;
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
            f4542b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4542b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4542b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4542b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4542b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f4541a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4541a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4541a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b<R> {
        void b(GlideException glideException);

        void c(kqk<R> kqkVar, DataSource dataSource, boolean z);

        void d(bs5<?> bs5Var);
    }

    public final class c<Z> implements cs5.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataSource f4543a;

        public c(DataSource dataSource) {
            this.f4543a = dataSource;
        }

        @Override // cs5.a
        public kqk<Z> a(kqk<Z> kqkVar) {
            return bs5.this.B(this.f4543a, kqkVar);
        }
    }

    public static class d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public pzd f4545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xqk<Z> f4546b;
        public roe<Z> c;

        public void a() {
            this.f4545a = null;
            this.f4546b = null;
            this.c = null;
        }

        public void b(e eVar, cch cchVar) {
            d0b.a("DecodeJob.encode");
            try {
                eVar.getDiskCache().b(this.f4545a, new xk5(this.f4546b, this.c, cchVar));
            } finally {
                this.c.f();
                d0b.e();
            }
        }

        public boolean c() {
            return this.c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <X> void d(pzd pzdVar, xqk<X> xqkVar, roe<X> roeVar) {
            this.f4545a = pzdVar;
            this.f4546b = xqkVar;
            this.c = roeVar;
        }
    }

    public interface e {
        fy6 getDiskCache();
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4548b;
        public boolean c;

        public final boolean a(boolean z) {
            return (this.c || z || this.f4548b) && this.f4547a;
        }

        public synchronized boolean b() {
            this.f4548b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z) {
            this.f4547a = true;
            return a(z);
        }

        public synchronized void e() {
            this.f4548b = false;
            this.f4547a = false;
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

    public bs5(e eVar, Pools.Pool<bs5<?>> pool) {
        this.d = eVar;
        this.e = pool;
    }

    public final void A() {
        if (this.g.c()) {
            D();
        }
    }

    public <Z> kqk<Z> B(DataSource dataSource, kqk<Z> kqkVar) {
        kqk<Z> kqkVarB;
        lyp<Z> lypVar;
        EncodeStrategy encodeStrategyA;
        pzd wk5Var;
        Class<?> cls = kqkVar.get().getClass();
        xqk<Z> xqkVarN = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            lyp<Z> lypVarS = this.f4537a.s(cls);
            lypVar = lypVarS;
            kqkVarB = lypVarS.b(this.h, kqkVar, this.l, this.m);
        } else {
            kqkVarB = kqkVar;
            lypVar = null;
        }
        if (!kqkVar.equals(kqkVarB)) {
            kqkVar.recycle();
        }
        if (this.f4537a.w(kqkVarB)) {
            xqkVarN = this.f4537a.n(kqkVarB);
            encodeStrategyA = xqkVarN.a(this.o);
        } else {
            encodeStrategyA = EncodeStrategy.NONE;
        }
        xqk xqkVar = xqkVarN;
        if (!this.n.d(!this.f4537a.y(this.x), dataSource, encodeStrategyA)) {
            return kqkVarB;
        }
        if (xqkVar == null) {
            throw new Registry.NoResultEncoderAvailableException(kqkVarB.get().getClass());
        }
        int i = a.c[encodeStrategyA.ordinal()];
        if (i == 1) {
            wk5Var = new wk5(this.x, this.i);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyA);
            }
            wk5Var = new qqk(this.f4537a.b(), this.x, this.i, this.l, this.m, lypVar, cls, this.o);
        }
        roe roeVarC = roe.c(kqkVarB);
        this.f.d(wk5Var, xqkVar, roeVarC);
        return roeVarC;
    }

    public void C(boolean z) {
        if (this.g.d(z)) {
            D();
        }
    }

    public final void D() {
        this.g.e();
        this.f.a();
        this.f4537a.a();
        this.D = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.f4539k = null;
        this.p = null;
        this.f4540r = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = 0L;
        this.E = false;
        this.v = null;
        this.f4538b.clear();
        this.e.release(this);
    }

    public final void E(g gVar) {
        this.s = gVar;
        this.p.d(this);
    }

    public final void F() {
        this.w = Thread.currentThread();
        this.t = epe.b();
        boolean zA = false;
        while (!this.E && this.C != null && !(zA = this.C.a())) {
            this.f4540r = n(this.f4540r);
            this.C = m();
            if (this.f4540r == h.SOURCE) {
                E(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f4540r == h.FINISHED || this.E) && !zA) {
            y();
        }
    }

    public final <Data, ResourceType> kqk<R> G(Data data, DataSource dataSource, pie<Data, ResourceType, R> pieVar) throws GlideException {
        cch cchVarO = o(dataSource);
        com.bumptech.glide.load.data.a<Data> aVarL = this.h.i().l(data);
        try {
            return pieVar.a(aVarL, cchVarO, this.l, this.m, new c(dataSource));
        } finally {
            aVarL.b();
        }
    }

    public final void H() {
        int i = a.f4541a[this.s.ordinal()];
        if (i == 1) {
            this.f4540r = n(h.INITIALIZE);
            this.C = m();
            F();
        } else if (i == 2) {
            F();
        } else {
            if (i == 3) {
                l();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.s);
        }
    }

    public final void I() {
        Throwable th;
        this.c.c();
        if (!this.D) {
            this.D = true;
            return;
        }
        if (this.f4538b.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f4538b;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public boolean J() {
        h hVarN = n(h.INITIALIZE);
        return hVarN == h.RESOURCE_CACHE || hVarN == h.DATA_CACHE;
    }

    public void a() {
        this.E = true;
        kl5 kl5Var = this.C;
        if (kl5Var != null) {
            kl5Var.cancel();
        }
    }

    @Override // kl5.a
    public void b(pzd pzdVar, Object obj, jl5<?> jl5Var, DataSource dataSource, pzd pzdVar2) {
        this.x = pzdVar;
        this.z = obj;
        this.B = jl5Var;
        this.A = dataSource;
        this.y = pzdVar2;
        this.F = pzdVar != this.f4537a.c().get(0);
        if (Thread.currentThread() != this.w) {
            E(g.DECODE_DATA);
            return;
        }
        d0b.a("DecodeJob.decodeFromRetrievedData");
        try {
            l();
        } finally {
            d0b.e();
        }
    }

    @Override // kl5.a
    public void c(pzd pzdVar, Exception exc, jl5<?> jl5Var, DataSource dataSource) {
        jl5Var.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(pzdVar, dataSource, jl5Var.a());
        this.f4538b.add(glideException);
        if (Thread.currentThread() != this.w) {
            E(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            F();
        }
    }

    @Override // kl5.a
    public void d() {
        E(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // u69.f
    public ado e() {
        return this.c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(bs5<?> bs5Var) {
        int iP = p() - bs5Var.p();
        return iP == 0 ? this.q - bs5Var.q : iP;
    }

    public final <Data> kqk<R> i(jl5<?> jl5Var, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            jl5Var.b();
            return null;
        }
        try {
            long jB = epe.b();
            kqk<R> kqkVarK = k(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                s("Decoded result " + kqkVarK, jB);
            }
            return kqkVarK;
        } finally {
            jl5Var.b();
        }
    }

    public final <Data> kqk<R> k(Data data, DataSource dataSource) throws GlideException {
        return G(data, dataSource, this.f4537a.h(data.getClass()));
    }

    public final void l() {
        kqk<R> kqkVarI;
        if (Log.isLoggable("DecodeJob", 2)) {
            u("Retrieved data", this.t, "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B);
        }
        try {
            kqkVarI = i(this.B, this.z, this.A);
        } catch (GlideException e2) {
            e2.setLoggingDetails(this.y, this.A);
            this.f4538b.add(e2);
            kqkVarI = null;
        }
        if (kqkVarI != null) {
            x(kqkVarI, this.A, this.F);
        } else {
            F();
        }
    }

    public final kl5 m() {
        int i = a.f4542b[this.f4540r.ordinal()];
        if (i == 1) {
            return new pqk(this.f4537a, this);
        }
        if (i == 2) {
            return new vk5(this.f4537a, this);
        }
        if (i == 3) {
            return new s4n(this.f4537a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f4540r);
    }

    public final h n(h hVar) {
        int i = a.f4542b[hVar.ordinal()];
        if (i == 1) {
            return this.n.a() ? h.DATA_CACHE : n(h.DATA_CACHE);
        }
        if (i == 2) {
            return this.u ? h.FINISHED : h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return h.FINISHED;
        }
        if (i == 5) {
            return this.n.b() ? h.RESOURCE_CACHE : n(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    public final cch o(DataSource dataSource) {
        cch cchVar = this.o;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f4537a.x();
        wbh<Boolean> wbhVar = com.bumptech.glide.load.resource.bitmap.a.j;
        Boolean bool = (Boolean) cchVar.c(wbhVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return cchVar;
        }
        cch cchVar2 = new cch();
        cchVar2.d(this.o);
        cchVar2.e(wbhVar, Boolean.valueOf(z));
        return cchVar2;
    }

    public final int p() {
        return this.j.ordinal();
    }

    public bs5<R> r(com.bumptech.glide.c cVar, Object obj, sb8 sb8Var, pzd pzdVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, jy6 jy6Var, Map<Class<?>, lyp<?>> map, boolean z, boolean z2, boolean z3, cch cchVar, b<R> bVar, int i3) {
        this.f4537a.v(cVar, obj, pzdVar, i, i2, jy6Var, cls, cls2, priority, cchVar, map, z, z2, this.d);
        this.h = cVar;
        this.i = pzdVar;
        this.j = priority;
        this.f4539k = sb8Var;
        this.l = i;
        this.m = i2;
        this.n = jy6Var;
        this.u = z3;
        this.o = cchVar;
        this.p = bVar;
        this.q = i3;
        this.s = g.INITIALIZE;
        this.v = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        d0b.c("DecodeJob#run(reason=%s, model=%s)", this.s, this.v);
        jl5<?> jl5Var = this.B;
        try {
            try {
                if (this.E) {
                    y();
                    if (jl5Var != null) {
                        jl5Var.b();
                    }
                    d0b.e();
                    return;
                }
                H();
                if (jl5Var != null) {
                    jl5Var.b();
                }
                d0b.e();
            } catch (Throwable th) {
                if (jl5Var != null) {
                    jl5Var.b();
                }
                d0b.e();
                throw th;
            }
        } catch (ab3 e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("DecodeJob threw unexpectedly, isCancelled: ");
                sb.append(this.E);
                sb.append(", stage: ");
                sb.append(this.f4540r);
            }
            if (this.f4540r != h.ENCODE) {
                this.f4538b.add(th2);
                y();
            }
            if (!this.E) {
                throw th2;
            }
            throw th2;
        }
    }

    public final void s(String str, long j) {
        u(str, j, null);
    }

    public final void u(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(epe.a(j));
        sb.append(", load key: ");
        sb.append(this.f4539k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    public final void w(kqk<R> kqkVar, DataSource dataSource, boolean z) {
        I();
        this.p.c(kqkVar, dataSource, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(kqk<R> kqkVar, DataSource dataSource, boolean z) {
        roe roeVar;
        d0b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (kqkVar instanceof fad) {
                ((fad) kqkVar).initialize();
            }
            if (this.f.c()) {
                kqkVar = roe.c(kqkVar);
                roeVar = kqkVar;
            } else {
                roeVar = 0;
            }
            w(kqkVar, dataSource, z);
            this.f4540r = h.ENCODE;
            try {
                if (this.f.c()) {
                    this.f.b(this.d, this.o);
                }
                if (roeVar != 0) {
                    roeVar.f();
                }
                z();
                d0b.e();
            } catch (Throwable th) {
                if (roeVar != 0) {
                    roeVar.f();
                }
                throw th;
            }
        } catch (Throwable th2) {
            d0b.e();
            throw th2;
        }
    }

    public final void y() {
        I();
        this.p.b(new GlideException("Failed to load resource", new ArrayList(this.f4538b)));
        A();
    }

    public final void z() {
        if (this.g.b()) {
            D();
        }
    }
}
