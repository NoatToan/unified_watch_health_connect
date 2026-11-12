package xe2;

import com.garmin.android.lib.legal.LegalGatewayActivity;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.ChinaPrivacyConsentFrag$initPrivacyPolicyButton$1$1$1$1", f = "ChinaPrivacyConsentFrag.kt", l = {128}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lc2.a f190531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f190532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f190533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m f190534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, androidx.fragment.app.m mVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f190533c = rVar;
        this.f190534d = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f190533c, this.f190534d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        lc2.a aVarValueOf;
        Object objK6;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190532b;
        r rVar = this.f190533c;
        if (i14 == 0) {
            o13.r.b(obj);
            try {
                String str = rVar.getMobileAuthConfig$mobile_auth_release().A;
                if (str == null) {
                    p005kotlin.jvm.internal.s.m("privacyPolicyEnumName");
                    throw null;
                }
                aVarValueOf = lc2.a.valueOf(str);
                com.garmin.android.library.mobileauth.ui.b fragListener$mobile_auth_release = rVar.getFragListener$mobile_auth_release();
                this.f190531a = aVarValueOf;
                this.f190532b = 1;
                objK6 = fragListener$mobile_auth_release.K6(this);
                if (objK6 == aVar) {
                    return aVar;
                }
            } catch (Exception e4) {
                Logger logger = (Logger) rVar.f190537a.getValue();
                String str2 = rVar.getMobileAuthConfig$mobile_auth_release().A;
                if (str2 == null) {
                    p005kotlin.jvm.internal.s.m("privacyPolicyEnumName");
                    throw null;
                }
                logger.warn("LegalDocumentEnum name '" + str2 + "' not found, defaulting to 'GARMIN_PRIVACY_POLICY'", (Throwable) e4);
                aVarValueOf = lc2.a.GARMIN_PRIVACY_POLICY;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVarValueOf = this.f190531a;
            o13.r.b(obj);
            objK6 = obj;
        }
        lc2.a aVar2 = aVarValueOf;
        LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, this.f190534d, 201, aVar2, ((Boolean) objK6).booleanValue(), !rVar.getMobileAuthConfig$mobile_auth_release().f177775p, null, false, null, 224);
        return Unit.INSTANCE;
    }
}
