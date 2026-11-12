package com.garmin.feature.garminpay.providers.gpay.ui.cardverification;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import dq2.f;
import dq2.g;
import jp2.e;
import jp2.i;
import jp2.j;
import o13.r;
import o53.j0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import vb.h;
import zn2.g1;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/a;", "Landroidx/lifecycle/u1;", "Lto2/b;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 implements to2.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f51466j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f51467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f51468b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yo2.b f51473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51474h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<Boolean> f51469c = new y0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<g> f51470d = new y0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<f> f51471e = new y0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<Boolean> f51472f = new y0<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<b> f51475i = new y0<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        CARD_VERIFIED,
        CARD_PROVISION_FAILED
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51479a;

        static {
            int[] iArr = new int[to2.c.values().length];
            try {
                iArr[to2.c.CREDITCARD_ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[to2.c.CREDITCARD_PROVISION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51479a = iArr;
        }
    }

    static {
        new C1068a(null);
        int i14 = gt2.c.f79010a;
        f51466j = gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayCardVerificationViewModel");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(a aVar, yo2.b bVar, v13.c cVar) throws NewFitPayException {
        e eVar;
        aVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f99928c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f99928c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar, cVar);
            }
        } else {
            eVar = new e(aVar, cVar);
        }
        Object objS = eVar.f99926a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f99928c;
        if (i15 == 0) {
            r.b(objS);
            f51466j.debug("getVerificationMethods");
            g1 g1Var = aVar.A4().f205979a;
            eVar.f99928c = 1;
            objS = g1Var.S(bVar, eVar);
            if (objS == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objS);
        }
        g gVar = (g) objS;
        aVar.f51470d.j(gVar);
        return gVar;
    }

    public final z0 A4() {
        z0 z0Var = this.f51467a;
        if (z0Var != null) {
            return z0Var;
        }
        s.m("serviceProvider");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B4(v13.c cVar) {
        jp2.g gVar;
        if (cVar instanceof jp2.g) {
            gVar = (jp2.g) cVar;
            int i14 = gVar.f99938c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f99938c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new jp2.g(this, cVar);
            }
        } else {
            gVar = new jp2.g(this, cVar);
        }
        Object obj = gVar.f99936a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f99938c;
        Logger logger = f51466j;
        try {
            if (i15 == 0) {
                r.b(obj);
                logger.debug("refreshCreditCardsSuspendable");
                g1 g1Var = A4().f205979a;
                gVar.f99938c = 1;
                if (g1.g0(g1Var, null, gVar, 7) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            logger.error("refreshCreditCardsSuspendable: error while refreshing cached cards ", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }

    public final j0 C4() {
        return ge1.b.j(v1.a(this), null, null, new i(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D4(f fVar, v13.c cVar) throws NewFitPayException {
        j jVar;
        y0 y0Var;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f99947d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f99947d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objK0 = jVar.f99945b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f99947d;
        if (i15 == 0) {
            r.b(objK0);
            g1 g1Var = A4().f205979a;
            String str = fVar.f60813h;
            y0<f> y0Var2 = this.f51471e;
            jVar.f99944a = y0Var2;
            jVar.f99947d = 1;
            objK0 = g1Var.k0(str, jVar);
            if (objK0 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = jVar.f99944a;
            r.b(objK0);
        }
        y0Var.j(objK0);
        return Unit.INSTANCE;
    }

    @Override // to2.b
    public final void Q3(to2.c cVar) {
        Logger logger = f51466j;
        logger.debug("onSseEvent: " + cVar);
        int i14 = c.f51479a[cVar.ordinal()];
        y0<b> y0Var = this.f51475i;
        if (i14 == 1) {
            y0Var.j(b.CARD_VERIFIED);
            return;
        }
        if (i14 == 2) {
            y0Var.j(b.CARD_PROVISION_FAILED);
            return;
        }
        logger.debug("onSseEvent: " + cVar + " not handled");
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        if (this.f51467a != null) {
            A4().f205982d.l(z4().f205819e.f205629a.f73101a, this);
        }
    }

    public final yo2.b y4() {
        yo2.b bVar = this.f51473g;
        if (bVar != null) {
            return bVar;
        }
        s.m("creditCard");
        throw null;
    }

    public final t z4() {
        t tVar = this.f51468b;
        if (tVar != null) {
            return tVar;
        }
        s.m("deviceServiceProvider");
        throw null;
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1068a {
        public /* synthetic */ C1068a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1068a() {
        }
    }
}
