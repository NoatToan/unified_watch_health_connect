package z10;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz10/j;", "Landroidx/lifecycle/u1;", "Le20/a;", "consentRepo", "<init>", "(Le20/a;)V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f201057e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e20.a f201058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.e2 f201059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.p2 f201060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r53.p2 f201061d;

    static {
        new a(null);
    }

    public j(e20.a aVar) {
        aVar.getClass();
        this.f201058a = aVar;
        this.f201059b = r53.g2.b(0, 0, null, 7);
        this.f201060c = r53.q2.a(new c1(false, null, null, 7, null));
        this.f201061d = r53.q2.a(z0.EMPTY);
    }

    public final void x4(q92.x xVar) {
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new m(xVar, this, null), 3);
    }

    public final void y4(q92.x xVar) {
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new q(xVar, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z4(long j8, int i14, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i15 = sVar.f201236e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                sVar.f201236e = i15 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objF = sVar.f201234c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = sVar.f201236e;
        boolean z14 = true;
        if (i16 == 0) {
            o13.r.b(objF);
            bv.a aVar = (bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null);
            sVar.f201232a = j8;
            sVar.f201233b = i14;
            sVar.f201236e = 1;
            objF = aVar.f(j8, sVar);
            if (objF != obj) {
            }
        }
        if (i16 != 1) {
            if (i16 == 2) {
                o13.r.b(objF);
                return objF;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = sVar.f201233b;
        j8 = sVar.f201232a;
        o13.r.b(objF);
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objF;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            int i17 = i14 + 1;
            if (i17 < 3) {
                sVar.f201232a = j8;
                sVar.f201233b = i14;
                sVar.f201236e = 2;
                Object objZ4 = z4(j8, i17, sVar);
                return objZ4 == obj ? obj : objZ4;
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz10/j$a;", "", "<init>", "()V", "", "RETRY_ADD_DEFAULT_RECIPIENT_COUNT", "I", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
