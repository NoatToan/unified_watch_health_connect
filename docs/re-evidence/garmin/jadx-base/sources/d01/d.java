package d01;

import b63.o;
import e53.e;
import e53.f;
import e53.k;
import g01.z;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ld01/d;", "Ld01/c;", "<init>", "()V", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f57016e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f57017a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f57018b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f57019c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f57020d = new LinkedHashMap();

    static {
        new b(null);
        e53.c.a aVar = e53.c.f63094b;
        f57016e = e.e(1, f.HOURS);
    }

    @Override // d01.c
    public final void a() {
        synchronized (this.f57018b) {
            this.f57018b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // d01.c
    public final void b(o oVar, k01.b bVar) {
        oVar.getClass();
        bVar.getClass();
        synchronized (this.f57018b) {
            this.f57018b.put(oVar, new a(bVar, null, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d01.c
    public final k01.b c(o oVar) {
        oVar.getClass();
        synchronized (this.f57018b) {
            a aVar = (a) this.f57018b.get(oVar);
            if (aVar == null) {
                return null;
            }
            if (aVar.a()) {
                return null;
            }
            return (k01.b) aVar.f57021a;
        }
    }

    @Override // d01.c
    public final void d() {
        synchronized (this.f57017a) {
            this.f57017a.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // d01.c
    public final void e(boolean z14, int i14, String str, s21.o oVar) {
        str.getClass();
        synchronized (this.f57020d) {
            this.f57020d.put(new d01.b(z14, i14, str), new a(oVar, null, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // d01.c
    public final void f() {
        synchronized (this.f57019c) {
            this.f57019c.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d01.c
    public final z g(o oVar, boolean z14) {
        oVar.getClass();
        synchronized (this.f57017a) {
            a aVar = (a) this.f57017a.get(new d01.a(oVar, z14));
            if (aVar == null) {
                return null;
            }
            if (aVar.a()) {
                return null;
            }
            return (z) aVar.f57021a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d01.c
    public final s21.o h(int i14, String str, boolean z14) {
        str.getClass();
        synchronized (this.f57020d) {
            a aVar = (a) this.f57020d.get(new d01.b(z14, i14, str));
            if (aVar == null) {
                return null;
            }
            if (aVar.a()) {
                return null;
            }
            return (s21.o) aVar.f57021a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d01.c
    public final s21.o i(o oVar) {
        oVar.getClass();
        synchronized (this.f57019c) {
            a aVar = (a) this.f57019c.get(oVar);
            if (aVar == null) {
                return null;
            }
            if (aVar.a()) {
                return null;
            }
            return (s21.o) aVar.f57021a;
        }
    }

    @Override // d01.c
    public final void j(o oVar, s21.o oVar2) {
        oVar.getClass();
        synchronized (this.f57019c) {
            this.f57019c.put(oVar, new a(oVar2, null, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // d01.c
    public final void k() {
        synchronized (this.f57020d) {
            this.f57020d.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // d01.c
    public final void l(o oVar, boolean z14, z zVar) {
        oVar.getClass();
        zVar.getClass();
        synchronized (this.f57017a) {
            this.f57017a.put(new d01.a(oVar, z14), new a(zVar, null, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld01/d$b;", "", "<init>", "()V", "Le53/c;", "MAX_CACHE_TIME", "J", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld01/d$a;", "T", "", "value", "Le53/j;", "expirationDate", "<init>", "(Ljava/lang/Object;Le53/j;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f57021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e53.j f57022b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Object obj, e53.j jVar, int i14, j jVar2) {
            if ((i14 & 2) != 0) {
                e53.a.C1329a.f63093a.getClass();
                jVar = k.f63117a.a().b(d.f57016e);
            }
            this(obj, jVar);
        }

        public final boolean a() {
            e53.a.C1329a.f63093a.getClass();
            return this.f57022b.compareTo(k.f63117a.a()) < 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f57021a, aVar.f57021a) && s.g(this.f57022b, aVar.f57022b);
        }

        public final int hashCode() {
            T t7 = this.f57021a;
            return this.f57022b.hashCode() + ((t7 == null ? 0 : t7.hashCode()) * 31);
        }

        public final String toString() {
            return "CachedValue(value=" + this.f57021a + ", expirationDate=" + this.f57022b + ")";
        }

        public a(T t7, e53.j jVar) {
            jVar.getClass();
            this.f57021a = t7;
            this.f57022b = jVar;
        }
    }
}
