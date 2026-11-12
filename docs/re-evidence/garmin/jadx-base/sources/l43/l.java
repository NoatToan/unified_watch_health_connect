package l43;

import java.util.Set;
import p13.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f110040c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<x33.b> f110041d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f110042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o43.i f110043b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x33.b f110044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f110045b;

        public a(x33.b bVar, i iVar) {
            bVar.getClass();
            this.f110044a = bVar;
            this.f110045b = iVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f110044a.equals(((a) obj).f110044a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f110044a.hashCode();
        }
    }

    static {
        x33.b.a aVar = x33.b.f188590d;
        x33.c cVarI = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105873d.i();
        aVar.getClass();
        f110041d = a1.b(x33.b.a.b(cVarI));
    }

    public l(n nVar) {
        nVar.getClass();
        this.f110042a = nVar;
        this.f110043b = nVar.f110051a.h(new k(this));
    }

    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
