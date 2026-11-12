package n70;

import android.content.SharedPreferences;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<unused var>", "", "pairedDevicesCount", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "<anonymous>", "(ZI)Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetUploadConsentStatusUseCase$invoke$1", f = "GetUploadConsentStatusUseCase.kt", l = {32, 45, 54, 60, 70}, m = "invokeSuspend", v = 2)
public final class n6 extends v13.i implements e23.q<Boolean, Integer, t13.d<? super com.garmin.android.apps.connectmobile.dashboard.presentation.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q92.x f124441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.v f124442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f124443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f124444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l6 f124445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(l6 l6Var, t13.d<? super n6> dVar) {
        super(3, dVar);
        this.f124445e = l6Var;
    }

    @Override // e23.q
    public final Object invoke(Boolean bool, Integer num, t13.d<? super com.garmin.android.apps.connectmobile.dashboard.presentation.c> dVar) {
        int iIntValue = num.intValue();
        n6 n6Var = new n6(this.f124445e, dVar);
        n6Var.f124444d = iIntValue;
        return n6Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r15 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (r15 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0145, code lost:
    
        if (r15 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        if (r15 == r1) goto L62;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        q92.x xVar;
        q92.v vVar;
        Object objF;
        q92.v vVar2;
        s92.g gVar;
        int i14 = this.f124444d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f124443c;
        l6 l6Var = this.f124445e;
        if (i15 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strH = am.j.h(i14, "GetUploadConsentStatusUseCase paired devices ");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strH);
            p92.o oVar = p92.o.f136619a;
            oVar.getClass();
            if (p92.o.m().h() == null) {
                this.f124444d = i14;
                this.f124443c = 1;
                obj = oVar.h(this);
            } else {
                z10.d1 d1Var = z10.d1.f200951a;
                z10.v0.f201271b.getClass();
                z10.v0 v0VarA = z10.v0.a.a();
                boolean z14 = i14 > 0;
                SharedPreferences.Editor editorEdit = v0VarA.f201273a.edit();
                editorEdit.putBoolean("gcm_consent_hide_my_day_key", z14);
                editorEdit.apply();
                if (i14 == 0) {
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "GetUploadConsentStatusUseCase No paired devices");
                    return null;
                }
                xVar = q92.x.DI_CONNECT_UPLOAD;
                int i16 = l6.f124393b;
                l6Var.getClass();
                p92.o oVar2 = p92.o.f136619a;
                oVar2.getClass();
                if (p92.o.n(xVar) != null || z10.d1.j(xVar)) {
                    this.f124441a = xVar;
                    this.f124444d = i14;
                    this.f124443c = 2;
                    obj = oVar2.c(xVar, this);
                } else {
                    vVar = null;
                    if (z10.d1.j(xVar)) {
                        if (vVar != null) {
                            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.e(a2Var3, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> GET UPLOAD consent FAILED -> show home screen");
                            return null;
                        }
                        p92.o oVar3 = p92.o.f136619a;
                        this.f124441a = null;
                        this.f124442b = vVar;
                        this.f124444d = i14;
                        this.f124443c = 3;
                        objF = oVar3.f(xVar, Locale.getDefault(), this);
                        if (objF != aVar) {
                            vVar2 = vVar;
                            obj = objF;
                            gVar = (s92.g) obj;
                            if (gVar != null) {
                                com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.a(a2Var4, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> Show upload consent screen");
                                return new com.garmin.android.apps.connectmobile.dashboard.presentation.c.a(vVar2, gVar);
                            }
                            com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.e(a2Var5, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> GET UPLOAD consent text FAILED -> show device screen");
                            this.f124441a = null;
                            this.f124442b = null;
                            this.f124444d = i14;
                            this.f124443c = 4;
                            obj = l6.a(l6Var, this);
                        }
                    } else {
                        if (z10.d1.k()) {
                            return null;
                        }
                        com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var6, "GetUploadConsentStatusUseCase shouldRestrictFilesUpload() -> Show device screen");
                        this.f124441a = null;
                        this.f124442b = null;
                        this.f124444d = i14;
                        this.f124443c = 5;
                        obj = l6.a(l6Var, this);
                    }
                }
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    vVar2 = this.f124442b;
                    o13.r.b(obj);
                    gVar = (s92.g) obj;
                    if (gVar != null) {
                        com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var7, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> Show upload consent screen");
                        return new com.garmin.android.apps.connectmobile.dashboard.presentation.c.a(vVar2, gVar);
                    }
                    com.garmin.android.apps.connectmobile.a2 a2Var8 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.e(a2Var8, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> GET UPLOAD consent text FAILED -> show device screen");
                    this.f124441a = null;
                    this.f124442b = null;
                    this.f124444d = i14;
                    this.f124443c = 4;
                    obj = l6.a(l6Var, this);
                } else {
                    if (i15 != 4) {
                        if (i15 == 5) {
                            o13.r.b(obj);
                            return (com.garmin.android.apps.connectmobile.dashboard.presentation.c) obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (com.garmin.android.apps.connectmobile.dashboard.presentation.c) obj;
            }
            xVar = this.f124441a;
            o13.r.b(obj);
            vVar = (q92.v) obj;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "GetUploadConsentStatusUseCase Fetch upload consent consentStatus=[" + vVar + "]");
            if (z10.d1.j(xVar)) {
                if (vVar != null) {
                    com.garmin.android.apps.connectmobile.a2 a2Var9 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.e(a2Var9, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> GET UPLOAD consent FAILED -> show home screen");
                    return null;
                }
                p92.o oVar4 = p92.o.f136619a;
                this.f124441a = null;
                this.f124442b = vVar;
                this.f124444d = i14;
                this.f124443c = 3;
                objF = oVar4.f(xVar, Locale.getDefault(), this);
                if (objF != aVar) {
                    vVar2 = vVar;
                    obj = objF;
                    gVar = (s92.g) obj;
                    if (gVar != null) {
                        com.garmin.android.apps.connectmobile.a2 a2Var10 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var10, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> Show upload consent screen");
                        return new com.garmin.android.apps.connectmobile.dashboard.presentation.c.a(vVar2, gVar);
                    }
                    com.garmin.android.apps.connectmobile.a2 a2Var11 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.e(a2Var11, "GetUploadConsentStatusUseCase shouldPromptForConsent() -> GET UPLOAD consent text FAILED -> show device screen");
                    this.f124441a = null;
                    this.f124442b = null;
                    this.f124444d = i14;
                    this.f124443c = 4;
                    obj = l6.a(l6Var, this);
                }
            } else {
                if (z10.d1.k()) {
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var12 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var12, "GetUploadConsentStatusUseCase shouldRestrictFilesUpload() -> Show device screen");
                this.f124441a = null;
                this.f124442b = null;
                this.f124444d = i14;
                this.f124443c = 5;
                obj = l6.a(l6Var, this);
            }
            return aVar;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "GetUploadConsentStatusUseCase Fetched 'data-sync/indicators' from GC: syncDeviceData=[" + ((Boolean) obj) + "]");
        z10.d1 d1Var2 = z10.d1.f200951a;
        z10.v0.f201271b.getClass();
        z10.v0 v0VarA2 = z10.v0.a.a();
        if (i14 > 0) {
        }
        SharedPreferences.Editor editorEdit2 = v0VarA2.f201273a.edit();
        editorEdit2.putBoolean("gcm_consent_hide_my_day_key", z14);
        editorEdit2.apply();
        if (i14 == 0) {
            com.garmin.android.apps.connectmobile.a2 a2Var13 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var13, "GetUploadConsentStatusUseCase No paired devices");
            return null;
        }
        xVar = q92.x.DI_CONNECT_UPLOAD;
        int i17 = l6.f124393b;
        l6Var.getClass();
        p92.o oVar5 = p92.o.f136619a;
        oVar5.getClass();
        if (p92.o.n(xVar) != null) {
        }
        this.f124441a = xVar;
        this.f124444d = i14;
        this.f124443c = 2;
        obj = oVar5.c(xVar, this);
    }
}
