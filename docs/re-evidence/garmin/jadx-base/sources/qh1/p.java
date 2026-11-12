package qh1;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c22.a0;
import c22.n3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lqh1/p;", "Landroidx/lifecycle/u1;", "Lqh1/m;", "userMetricsRepository", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lqh1/m;Lc22/a0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f144766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f144767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<fw.m<Boolean>> f144768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<rh1.a> f144769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f144770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f144771f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144772a;

        static {
            int[] iArr = new int[n3.values().length];
            try {
                iArr[n3.POUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f144772a = iArr;
        }
    }

    static {
        new a(null);
    }

    public p(m mVar, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            m.f144747r0.getClass();
            ez0.b bVar = ez0.b.f67468a;
            ez0.c cVar = ez0.c.GC;
            m42.a aVar = (m42.a) ez0.b.a(bVar, cVar, m42.a.class, new c83.h.a[0], null, null, null, 120);
            k.f144740a.getClass();
            mVar = new e((k) ez0.b.a(bVar, cVar, k.class, new c83.h.a[0], null, null, null, 120), aVar);
        }
        this(mVar, (i14 & 2) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(p pVar, v2 v2Var, v13.c cVar) {
        t tVar;
        rh1.b bVar;
        rh1.a.C2881a c2881a;
        rh1.a aVar;
        n3 n3Var;
        y0<rh1.a> y0Var = pVar.f144769d;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f144785g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f144785g = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(pVar, cVar);
            }
        } else {
            tVar = new t(pVar, cVar);
        }
        Object obj = tVar.f144783e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f144785g;
        if (i15 == 0) {
            o13.r.b(obj);
            rh1.a aVarD = y0Var.d();
            if (aVarD != null) {
                if (v2Var instanceof v2.b) {
                    bVar = (rh1.b) ((v2.b) v2Var).f47386a;
                    rh1.a.C2881a c2881a2 = rh1.a.f152744f;
                    tVar.f144779a = aVarD;
                    tVar.f144780b = bVar;
                    tVar.f144781c = c2881a2;
                    tVar.f144782d = y0Var;
                    tVar.f144785g = 1;
                    rh1.a aVarD2 = pVar.f144769d.d();
                    Object objE0 = (aVarD2 == null || (n3Var = aVarD2.f152747c) == null) ? ge1.b.e0(pVar.f144767b.f22991c, new s(pVar, null), tVar) : n3Var;
                    if (objE0 == aVar2) {
                        return aVar2;
                    }
                    obj = objE0;
                    c2881a = c2881a2;
                    aVar = aVarD;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    rh1.a.C2881a c2881a3 = rh1.a.f152744f;
                    Exception exc = ((v2.a) v2Var).f47383a;
                    c2881a3.getClass();
                    exc.getClass();
                    fw.m.f73767e.getClass();
                    y0Var.j(rh1.a.a(aVarD, null, null, null, fw.m.a.a(null, exc), false, 23));
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y0Var = tVar.f144782d;
        c2881a = tVar.f144781c;
        bVar = tVar.f144780b;
        aVar = tVar.f144779a;
        o13.r.b(obj);
        c2881a.getClass();
        y0Var.j(rh1.a.C2881a.a(bVar, (n3) obj, aVar));
        return Unit.INSTANCE;
    }

    public final void y4() {
        y0<rh1.a> y0Var = this.f144769d;
        rh1.a aVarD = y0Var.d();
        if (aVarD != null) {
            rh1.a.f152744f.getClass();
            y0Var.j(rh1.a.a(aVarD, null, null, null, fw.m.a.f(fw.m.f73767e, null, null, 3), false, 23));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqh1/p$a;", "", "<init>", "()V", "", "FIFTEEN_DAYS", "I", "FORTY_FIVE_DAYS", "", "KEY_PAIR_CUSTOM_METRICS_MUSCLE_MASS_UNIT", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public p(m mVar, a0 a0Var) {
        mVar.getClass();
        a0Var.getClass();
        this.f144766a = mVar;
        this.f144767b = a0Var;
        y0<fw.m<Boolean>> y0Var = new y0<>();
        this.f144768c = y0Var;
        rh1.a.f152744f.getClass();
        y0<rh1.a> y0Var2 = new y0<>(new rh1.a(null, null, null, null, false, 31, null));
        this.f144769d = y0Var2;
        this.f144770e = y0Var2;
        this.f144771f = y0Var;
    }

    public p() {
        this(null, null, 3, null);
    }
}
