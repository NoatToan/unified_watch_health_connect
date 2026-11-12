package l52;

import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.w2;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"l52/o$a", "Ll52/t;", "", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements t<T, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u<T> f110321a;

        public a(u<T> uVar) {
            this.f110321a = uVar;
        }

        @Override // l52.t
        public final void a(f.e eVar) {
        }

        @Override // l52.t
        public final void b(f.e eVar, i.a aVar) {
            this.f110321a.o(aVar);
        }
    }

    @o13.e
    public static final <T extends Parcelable> Object a(s<T> sVar, h hVar, u<T> uVar) {
        sVar.getClass();
        hVar.getClass();
        return sVar.b(hVar, new a(uVar));
    }

    public static Object b(s sVar, h hVar, e23.p pVar) {
        w2 w2Var = new w2(20);
        sVar.getClass();
        hVar.getClass();
        pVar.getClass();
        return sVar.b(hVar, new p(pVar, w2Var));
    }

    public static final <T extends Parcelable> boolean c(s<T> sVar, e23.l<? super i.a<T>, Boolean> lVar) {
        sVar.getClass();
        Object objB = b(sVar, h.PRE_ORDER, new b71.n(lVar, 11, (byte) 0));
        Boolean bool = Boolean.FALSE;
        int i14 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public static int d(s sVar) {
        w2 w2Var = new w2(21);
        sVar.getClass();
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        a(sVar, h.PRE_ORDER, new hc0.c(23, w2Var, p0Var));
        return p0Var.f105807a;
    }

    public static final <T extends Parcelable> i.a<T> e(s<T> sVar, e23.l<? super i.a<T>, Boolean> lVar) {
        sVar.getClass();
        lVar.getClass();
        Object objB = b(sVar, h.PRE_ORDER, new b71.n(lVar, 10, (byte) 0));
        int i14 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = null;
        }
        return (i.a) objB;
    }

    public static final void f(i.a aVar, e23.l lVar) {
        aVar.getClass();
        a(aVar, h.PRE_ORDER, new hc0.c(22, aVar, lVar));
    }
}
