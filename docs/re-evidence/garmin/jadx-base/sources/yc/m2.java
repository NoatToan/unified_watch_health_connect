package yc;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005\u0010\u0011\u0012\u0013\u0014BA\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lyc/m2;", "", "T", "Ljava/util/AbstractList;", "Lyc/h3;", "pagingSource", "Lo53/b0;", "coroutineScope", "Lo53/z;", "notifyDispatcher", "Lyc/s2;", "storage", "Lyc/m2$d;", "config", "<init>", "(Lyc/h3;Lo53/b0;Lo53/z;Lyc/s2;Lyc/m2$d;)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class m2<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f196219i = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3<?, T> f196220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f196221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f196222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s2<T> f196223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f196224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f196225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f196226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f196227h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyc/m2$a;", "", "T", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a<T> {
        public void a(T t7) {
            t7.getClass();
        }

        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/m2$b;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public abstract void a(int i14, int i15);

        public abstract void b(int i14, int i15);

        public abstract void c(int i14, int i15);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lyc/m2$d;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSizeHint", "maxSize", "<init>", "(IIZII)V", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f196230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f196231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f196232e;

        static {
            new b(null);
        }

        public d(int i14, int i15, boolean z14, int i16, int i17) {
            this.f196228a = i14;
            this.f196229b = i15;
            this.f196230c = z14;
            this.f196231d = i16;
            this.f196232e = i17;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyc/m2$d$a;", "", "<init>", "()V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f196233a = -1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f196234b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f196235c = -1;

            static {
                new C3665a(null);
            }

            public final d a() {
                if (this.f196234b < 0) {
                    this.f196234b = this.f196233a;
                }
                if (this.f196235c < 0) {
                    this.f196235c = this.f196233a * 3;
                }
                return new d(this.f196233a, this.f196234b, true, this.f196235c, Integer.MAX_VALUE);
            }

            /* JADX INFO: renamed from: yc.m2$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/m2$d$a$a;", "", "<init>", "()V", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class C3665a {
                public /* synthetic */ C3665a(p005kotlin.jvm.internal.j jVar) {
                    this();
                }

                private C3665a() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/m2$d$b;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private b() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/m2$e;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f196236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z0 f196237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z0 f196238c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f196239a;

            static {
                int[] iArr = new int[c1.values().length];
                try {
                    iArr[c1.REFRESH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c1.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c1.APPEND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f196239a = iArr;
            }
        }

        public e() {
            z0.c.a aVar = z0.c.f196665b;
            aVar.getClass();
            z0.c cVar = z0.c.f196667d;
            this.f196236a = cVar;
            aVar.getClass();
            this.f196237b = cVar;
            aVar.getClass();
            this.f196238c = cVar;
        }

        public abstract void a(c1 c1Var, z0 z0Var);

        public final void b(c1 c1Var, z0 z0Var) {
            c1Var.getClass();
            z0Var.getClass();
            int i14 = a.f196239a[c1Var.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        if (p005kotlin.jvm.internal.s.g(this.f196238c, z0Var)) {
                            return;
                        } else {
                            this.f196238c = z0Var;
                        }
                    }
                } else if (p005kotlin.jvm.internal.s.g(this.f196237b, z0Var)) {
                    return;
                } else {
                    this.f196237b = z0Var;
                }
            } else if (p005kotlin.jvm.internal.s.g(this.f196236a, z0Var)) {
                return;
            } else {
                this.f196236a = z0Var;
            }
            a(c1Var, z0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lyc/m2$b;", "it", "", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.l<WeakReference<b>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f196240a = new f();

        public f() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(WeakReference<b> weakReference) {
            WeakReference<b> weakReference2 = weakReference;
            weakReference2.getClass();
            return Boolean.valueOf(weakReference2.get() == null);
        }
    }

    public m2(h3<?, T> h3Var, o53.b0 b0Var, o53.z zVar, s2<T> s2Var, d dVar) {
        h3Var.getClass();
        b0Var.getClass();
        zVar.getClass();
        s2Var.getClass();
        dVar.getClass();
        this.f196220a = h3Var;
        this.f196221b = b0Var;
        this.f196222c = zVar;
        this.f196223d = s2Var;
        this.f196224e = dVar;
        this.f196225f = (dVar.f196229b * 2) + dVar.f196228a;
        this.f196226g = new ArrayList();
        this.f196227h = new ArrayList();
    }

    public final void c(b bVar) {
        bVar.getClass();
        f fVar = f.f196240a;
        ArrayList arrayList = this.f196226g;
        p13.d0.B(fVar, arrayList);
        arrayList.add(new WeakReference(bVar));
    }

    public abstract void d(e23.p<? super c1, ? super z0, Unit> pVar);

    public final x<?, T> e() {
        h3<?, T> h3VarG = g();
        if (!(h3VarG instanceof u0)) {
            wr.g.x("Attempt to access dataSource on a PagedList that was instantiated with a ", h3VarG.getClass().getSimpleName(), " instead of a DataSource");
            return null;
        }
        x<?, T> xVar = (x<?, T>) ((u0) h3VarG).f196502c;
        xVar.getClass();
        return xVar;
    }

    public abstract Object f();

    public h3<?, T> g() {
        return this.f196220a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i14) {
        return this.f196223d.get(i14);
    }

    public abstract boolean h();

    public boolean i() {
        return h();
    }

    public final void j(int i14) {
        s2<T> s2Var = this.f196223d;
        if (i14 < 0 || i14 >= s2Var.getSize()) {
            l2.j(s2Var.getSize(), b71.i.i(i14, "Index: ", ", Size: "));
        } else {
            s2Var.f196453g = j23.t.e(i14 - s2Var.f196448b, 0, s2Var.f196452f - 1);
            l(i14);
        }
    }

    public abstract void l(int i14);

    public final void m(int i14, int i15) {
        if (i15 == 0) {
            return;
        }
        Iterator<T> it = p13.h0.G0(this.f196226g).iterator();
        while (it.hasNext()) {
            b bVar = (b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.a(i14, i15);
            }
        }
    }

    public final void n(int i14, int i15) {
        if (i15 == 0) {
            return;
        }
        Iterator<T> it = p13.h0.G0(this.f196226g).iterator();
        while (it.hasNext()) {
            b bVar = (b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.b(i14, i15);
            }
        }
    }

    public void o(c1 c1Var, z0 z0Var) {
        c1Var.getClass();
        z0Var.getClass();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f196223d.getSize();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/m2$c;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
