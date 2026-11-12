package yc;

import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0013\u0014BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lyc/s0;", "", "K", "V", "Lo53/b0;", "pagedListScope", "Lyc/m2$d;", "config", "Lyc/h3;", "source", "Lo53/z;", "notifyDispatcher", "fetchDispatcher", "Lyc/s0$b;", "pageConsumer", "Lyc/s0$a;", "keyProvider", "<init>", "(Lo53/b0;Lyc/m2$d;Lyc/h3;Lo53/z;Lo53/z;Lyc/s0$b;Lyc/s0$a;)V", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f196392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.d f196393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3<K, V> f196394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.z f196395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.z f196396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b<V> f196397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a<K> f196398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f196399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f196400i;

    public interface a<K> {
        K c();

        K d();
    }

    public interface b<V> {
        void a(c1 c1Var, z0 z0Var);

        boolean b(c1 c1Var, h3.b.c<?, V> cVar);
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196401a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f196401a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yc/s0$d", "Lyc/m2$e;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends m2.e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s0<K, V> f196402d;

        public d(s0<K, V> s0Var) {
            this.f196402d = s0Var;
        }

        @Override // yc.m2.e
        public final void a(c1 c1Var, z0 z0Var) {
            c1Var.getClass();
            z0Var.getClass();
            this.f196402d.f196397f.a(c1Var, z0Var);
        }
    }

    public s0(o53.b0 b0Var, m2.d dVar, h3<K, V> h3Var, o53.z zVar, o53.z zVar2, b<V> bVar, a<K> aVar) {
        b0Var.getClass();
        dVar.getClass();
        h3Var.getClass();
        zVar.getClass();
        zVar2.getClass();
        bVar.getClass();
        aVar.getClass();
        this.f196392a = b0Var;
        this.f196393b = dVar;
        this.f196394c = h3Var;
        this.f196395d = zVar;
        this.f196396e = zVar2;
        this.f196397f = bVar;
        this.f196398g = aVar;
        this.f196399h = new AtomicBoolean(false);
        this.f196400i = new d(this);
    }

    public final void a(c1 c1Var, h3.b.c<K, V> cVar) {
        z0.c cVar2;
        if (this.f196399h.get()) {
            return;
        }
        if (!this.f196397f.b(c1Var, cVar)) {
            if (cVar.f196016a.isEmpty()) {
                z0.c.f196665b.getClass();
                cVar2 = z0.c.f196666c;
            } else {
                z0.c.f196665b.getClass();
                cVar2 = z0.c.f196667d;
            }
            this.f196400i.b(c1Var, cVar2);
            return;
        }
        int i14 = c.f196401a[c1Var.ordinal()];
        if (i14 == 1) {
            c();
        } else if (i14 == 2) {
            b();
        } else {
            vb.h.z("Can only fetch more during append/prepend");
        }
    }

    public final void b() {
        K kC = this.f196398g.c();
        if (kC == null) {
            c1 c1Var = c1.APPEND;
            h3.b.c.f196014f.getClass();
            h3.b.c<K, V> cVar = h3.b.c.f196015g;
            cVar.getClass();
            a(c1Var, cVar);
            return;
        }
        c1 c1Var2 = c1.APPEND;
        this.f196400i.b(c1Var2, z0.b.f196664b);
        m2.d dVar = this.f196393b;
        ge1.b.T(this.f196392a, this.f196396e, null, new t0(this, new h3.a.C3655a(kC, dVar.f196228a, dVar.f196230c), c1Var2, null), 2);
    }

    public final void c() {
        K kD = this.f196398g.d();
        if (kD == null) {
            c1 c1Var = c1.PREPEND;
            h3.b.c.f196014f.getClass();
            h3.b.c<K, V> cVar = h3.b.c.f196015g;
            cVar.getClass();
            a(c1Var, cVar);
            return;
        }
        c1 c1Var2 = c1.PREPEND;
        this.f196400i.b(c1Var2, z0.b.f196664b);
        m2.d dVar = this.f196393b;
        ge1.b.T(this.f196392a, this.f196396e, null, new t0(this, new h3.a.c(kD, dVar.f196228a, dVar.f196230c), c1Var2, null), 2);
    }
}
