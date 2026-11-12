package xe2;

import android.content.Context;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.google.mlkit.common.MlKitException;
import java.util.Locale;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$onResumeOnBackgroundThread$2", f = "AuthenticationActivity.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 217, 225}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f190514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f190515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f190516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f190517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AuthenticationActivity authenticationActivity, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f190517d = authenticationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f190517d, dVar);
        mVar.f190516c = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:60:0x014b  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var;
        String strName;
        AuthenticationActivity authenticationActivity;
        o53.b0 b0Var2;
        boolean zQ;
        ve2.e eVar;
        ve2.e eVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190515b;
        AuthenticationActivity authenticationActivity2 = this.f190517d;
        if (i14 == 0) {
            o13.r.b(obj);
            b0Var = (o53.b0) this.f190516c;
            i0 i0Var = authenticationActivity2.f50417f;
            if (i0Var != i0.TERMS_OF_USE && i0Var != i0.CREATE_ACCOUNT_WARNING && i0Var != i0.AGE_SIGNALS_ERROR && i0Var != i0.SIGN_IN && i0Var != i0.SIGN_IN_PORTAL && i0Var != i0.CREATE_ACCOUNT && i0Var != i0.CREATE_ACCOUNT_PORTAL) {
                AuthenticationActivity.a aVar2 = AuthenticationActivity.f50343v;
                Logger loggerZ9 = authenticationActivity2.Z9();
                i0 i0Var2 = authenticationActivity2.f50417f;
                if (i0Var2 == null || (strName = i0Var2.name()) == null) {
                    strName = "";
                }
                loggerZ9.debug("onResumeBGThread: currentFrag [" + strName + "]");
                authenticationActivity2.V9();
                re2.b.f152215a.getClass();
                if (!re2.b.w()) {
                    this.f190516c = b0Var;
                    this.f190514a = authenticationActivity2;
                    this.f190515b = 1;
                    obj = re2.b.j(this);
                    if (obj != aVar) {
                        authenticationActivity = authenticationActivity2;
                    }
                    return aVar;
                }
                authenticationActivity2.ca(i0.CHINA_PRIVACY_CONSENT, null);
            }
            return Unit.INSTANCE;
        }
        if (i14 == 1) {
            authenticationActivity = (AuthenticationActivity) this.f190514a;
            b0Var = (o53.b0) this.f190516c;
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                b0Var2 = (o53.b0) this.f190516c;
                o13.r.b(obj);
                ud2.b.f170019a.getClass();
                authenticationActivity2.getClass();
                zQ = d53.u.q(Locale.CHINA.getCountry(), ud2.b.a(authenticationActivity2, null), true);
                if (!zQ) {
                    eVar = ve2.e.f177704d;
                } else {
                    if (zQ) {
                        lc.u0.r();
                        return null;
                    }
                    eVar = ve2.e.f177705e;
                }
                re2.b bVar = re2.b.f152215a;
                this.f190516c = b0Var2;
                this.f190514a = eVar;
                this.f190515b = 3;
                bVar.getClass();
                if (re2.b.F(eVar, this) != aVar) {
                    eVar2 = eVar;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar2 = (ve2.e) this.f190514a;
            b0Var2 = (o53.b0) this.f190516c;
            o13.r.b(obj);
        }
        if (g8.i.P(b0Var2.getF136462d())) {
            AuthenticationActivity.a aVar3 = AuthenticationActivity.f50343v;
            com.airbnb.lottie.animation.keyframe.a.w("onResumeBGThread: locateMe env -> ", eVar2.name(), authenticationActivity2.Z9());
            authenticationActivity2.ca(i0.WELCOME, null);
        }
        return Unit.INSTANCE;
        authenticationActivity.f50345n = (ve2.d) obj;
        if (g8.i.P(b0Var.getF136462d())) {
            Context applicationContext = authenticationActivity2.getApplicationContext();
            if (authenticationActivity2.f50345n == null) {
                ud2.b bVar2 = ud2.b.f170019a;
                applicationContext.getClass();
                bVar2.getClass();
                if (ud2.b.a(applicationContext, null) == null) {
                    authenticationActivity2.Z9().debug("onResumeBGThread: calling 'locateMe'...");
                    re2.b.f152215a.getClass();
                    String strK = re2.b.k();
                    this.f190516c = b0Var;
                    this.f190514a = null;
                    this.f190515b = 2;
                    x53.c cVar = o53.s0.f129406a;
                    if (ge1.b.e0(x53.b.f189152a, new ud2.d(applicationContext, strK, null), this) != aVar) {
                        b0Var2 = b0Var;
                        ud2.b.f170019a.getClass();
                        authenticationActivity2.getClass();
                        zQ = d53.u.q(Locale.CHINA.getCountry(), ud2.b.a(authenticationActivity2, null), true);
                        if (!zQ) {
                            eVar = ve2.e.f177704d;
                        } else {
                            if (zQ) {
                                lc.u0.r();
                                return null;
                            }
                            eVar = ve2.e.f177705e;
                        }
                        re2.b bVar3 = re2.b.f152215a;
                        this.f190516c = b0Var2;
                        this.f190514a = eVar;
                        this.f190515b = 3;
                        bVar3.getClass();
                        if (re2.b.F(eVar, this) != aVar) {
                            eVar2 = eVar;
                            if (g8.i.P(b0Var2.getF136462d())) {
                                AuthenticationActivity.a aVar4 = AuthenticationActivity.f50343v;
                                com.airbnb.lottie.animation.keyframe.a.w("onResumeBGThread: locateMe env -> ", eVar2.name(), authenticationActivity2.Z9());
                                authenticationActivity2.ca(i0.WELCOME, null);
                            }
                        }
                    }
                    return aVar;
                }
                if (g8.i.P(b0Var.getF136462d())) {
                    authenticationActivity2.ca(i0.WELCOME, null);
                }
            } else if (g8.i.P(b0Var.getF136462d())) {
                authenticationActivity2.ca(i0.CONTINUE_AS, null);
            }
        }
        return Unit.INSTANCE;
    }
}
