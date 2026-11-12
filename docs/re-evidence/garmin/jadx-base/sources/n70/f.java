package n70;

import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ls92/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.CheckProductImprovementConsentUseCase$invoke$1", f = "CheckProductImprovementConsentUseCase.kt", l = {36, 38, 47, 55}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<r53.j<? super s92.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q92.x f124191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f124192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f124194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f124194d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f124194d, dVar);
        fVar.f124193c = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super s92.g> jVar, t13.d<? super Unit> dVar) {
        return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r15 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r15 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        if (r15 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L51;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q92.x xVar;
        boolean zContains;
        s92.g gVar;
        r53.j jVar = (r53.j) this.f124193c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124192b;
        d dVar = this.f124194d;
        if (i14 != 0) {
            if (i14 == 1) {
                xVar = this.f124191a;
                o13.r.b(obj);
                if (((q92.v) obj) == null) {
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.e(a2Var, "CheckProductImprovementConsentUseCase GET PRODUCT IMPROVEMENT consent FAILED");
                    gVar = null;
                    this.f124193c = null;
                    this.f124191a = null;
                    this.f124192b = 4;
                } else if (z10.d1.j(xVar)) {
                    this.f124193c = jVar;
                    this.f124191a = null;
                    this.f124192b = 2;
                    obj = d.a(dVar, this);
                } else {
                    gVar = null;
                }
                return aVar;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                gVar = (s92.g) obj;
            } else if (i14 == 3) {
                o13.r.b(obj);
                gVar = (s92.g) obj;
                this.f124193c = null;
                this.f124191a = null;
                this.f124192b = 4;
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "CheckProductImprovementConsentUseCase checkProductImprovementConsent()");
        xVar = q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
        SharedPreferences sharedPreferences = dVar.f124118a.f201273a;
        xVar.getClass();
        int i15 = z10.v0.b.f201274a[xVar.ordinal()];
        if (i15 != 1) {
            zContains = i15 != 3 ? false : sharedPreferences.contains("gcm_consent_product_improvement_dialog_key");
        } else {
            zContains = sharedPreferences.contains("gcm_consent_insights_dialog_key");
        }
        if (!zContains) {
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "CheckProductImprovementConsentUseCase Reschedule productImprovementConsent prompt");
            z10.v0.f201271b.getClass();
            z10.v0.a.a().c(xVar, System.currentTimeMillis());
        } else if (System.currentTimeMillis() - dVar.f124118a.b(xVar) > CoreConstants.MILLIS_IN_ONE_WEEK) {
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "CheckProductImprovementConsentUseCase It's time to prompt for the productImprovementConsent");
            p92.o oVar = p92.o.f136619a;
            oVar.getClass();
            if (!(p92.o.n(xVar) != null)) {
                this.f124193c = jVar;
                this.f124191a = xVar;
                this.f124192b = 1;
                obj = oVar.c(xVar, this);
                if (obj != aVar) {
                    if (((q92.v) obj) == null) {
                        com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.e(a2Var3, "CheckProductImprovementConsentUseCase GET PRODUCT IMPROVEMENT consent FAILED");
                    } else if (z10.d1.j(xVar)) {
                        this.f124193c = jVar;
                        this.f124191a = null;
                        this.f124192b = 2;
                        obj = d.a(dVar, this);
                    } else {
                        gVar = null;
                    }
                }
            } else if (z10.d1.j(xVar)) {
                this.f124193c = jVar;
                this.f124191a = null;
                this.f124192b = 3;
                obj = d.a(dVar, this);
            }
            return aVar;
        }
        gVar = null;
        this.f124193c = null;
        this.f124191a = null;
        this.f124192b = 4;
    }
}
