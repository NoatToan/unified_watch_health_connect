package n70;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ls92/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.CheckPrivacyPolicyReconsentUseCase$invoke$1", f = "CheckPrivacyPolicyReconsentUseCase.kt", l = {23, 30, 34}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<r53.j<? super s92.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q92.x f124059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f124060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f124062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f124062d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f124062d, dVar);
        cVar.f124061c = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super s92.g> jVar, t13.d<? super Unit> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00af A[PHI: r2
      0x00af: PHI (r2v4 q92.x) = (r2v3 q92.x), (r2v3 q92.x), (r2v5 q92.x) binds: [B:13:0x0068, B:15:0x0085, B:19:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r14.c(r2, r13) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q92.x xVar;
        s92.g gVar;
        r53.j jVar = (r53.j) this.f124061c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124060b;
        if (i14 != 0) {
            if (i14 == 1) {
                xVar = this.f124059a;
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                gVar = (s92.g) obj;
                this.f124061c = null;
                this.f124059a = null;
                this.f124060b = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "CheckPrivacyPolicyReconsentUseCase checkPrivacyPolicyReconsent()");
        xVar = q92.x.DI_CONNECT_PRIVACY;
        z10.d1.f200951a.getClass();
        List listK = p13.x.k(Locale.CHINA.getCountry(), Locale.KOREA.getCountry());
        String upperCase = c22.b0.b(null).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (listK.contains(upperCase)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            z10.v0.f201271b.getClass();
            if (jCurrentTimeMillis - z10.v0.a.a().f201273a.getLong("gcm_consent_privacy_policy_check_timestamp_key", 0L) > 86400000) {
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "CheckPrivacyPolicyReconsentUseCase fetch ConnectPrivacyPolicyConsent");
                p92.o oVar = p92.o.f136619a;
                this.f124061c = jVar;
                this.f124059a = xVar;
                this.f124060b = 1;
            } else if (z10.d1.j(xVar)) {
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "CheckPrivacyPolicyReconsentUseCase fetch ConnectPrivacyPolicyConsentText");
                p92.o oVar2 = p92.o.f136619a;
                this.f124061c = jVar;
                this.f124059a = null;
                this.f124060b = 2;
                obj = oVar2.f(xVar, Locale.getDefault(), this);
            } else {
                gVar = null;
                this.f124061c = null;
                this.f124059a = null;
                this.f124060b = 3;
            }
        } else if (z10.d1.j(xVar)) {
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var3, "CheckPrivacyPolicyReconsentUseCase fetch ConnectPrivacyPolicyConsentText");
            p92.o oVar3 = p92.o.f136619a;
            this.f124061c = jVar;
            this.f124059a = null;
            this.f124060b = 2;
            obj = oVar3.f(xVar, Locale.getDefault(), this);
        } else {
            gVar = null;
            this.f124061c = null;
            this.f124059a = null;
            this.f124060b = 3;
        }
        return aVar;
        z10.v0 v0Var = this.f124062d.f124031a;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = v0Var.f201273a.edit();
        editorEdit.putLong("gcm_consent_privacy_policy_check_timestamp_key", jCurrentTimeMillis2);
        editorEdit.apply();
        if (z10.d1.j(xVar)) {
            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var4, "CheckPrivacyPolicyReconsentUseCase fetch ConnectPrivacyPolicyConsentText");
            p92.o oVar4 = p92.o.f136619a;
            this.f124061c = jVar;
            this.f124059a = null;
            this.f124060b = 2;
            obj = oVar4.f(xVar, Locale.getDefault(), this);
        } else {
            gVar = null;
            this.f124061c = null;
            this.f124059a = null;
            this.f124060b = 3;
        }
        return aVar;
    }
}
