package n70;

import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ln70/d;", "", "Lz10/v0;", "consentPrefs", "<init>", "(Lz10/v0;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z10.v0 f124118a;

    static {
        new a(null);
        z10.v0.a aVar = z10.v0.f201271b;
    }

    public d(z10.v0 v0Var) {
        v0Var.getClass();
        this.f124118a = v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(d dVar, v13.c cVar) {
        e eVar;
        q92.x xVar;
        dVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f124159d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f124159d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar, cVar);
            }
        } else {
            eVar = new e(dVar, cVar);
        }
        Object obj = eVar.f124157b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f124159d;
        if (i15 == 0) {
            o13.r.b(obj);
            q92.x xVar2 = q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "CheckProductImprovementConsentUseCase fetchConsentText()");
            p92.o oVar = p92.o.f136619a;
            eVar.f124156a = xVar2;
            eVar.f124159d = 1;
            Object objF = oVar.f(xVar2, Locale.getDefault(), eVar);
            if (objF == aVar) {
                return aVar;
            }
            xVar = xVar2;
            obj = objF;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = eVar.f124156a;
            o13.r.b(obj);
        }
        s92.g gVar = (s92.g) obj;
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("CheckProductImprovementConsentUseCase fetchConsentText() complete success[", "]", gVar != null);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, strG);
        if (gVar == null) {
            return null;
        }
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "CheckProductImprovementConsentUseCase Product improvement consent not granted yet, prompt the user and flag for never showing again");
        z10.v0.f201271b.getClass();
        z10.v0.a.a().c(xVar, Long.MAX_VALUE);
        return gVar;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln70/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PRODUCT_IMPROVEMENT_DIALOG_DELAY_DAYS", "I", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
