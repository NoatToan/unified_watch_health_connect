package ze2;

import android.content.Context;
import com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity;
import e23.p;
import java.net.URI;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.f1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/net/URI;", "<anonymous>", "(Lo53/b0;)Ljava/net/URI;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity$generateAutoLoginURI$2", f = "MFAPortalFlowActivity.kt", l = {187}, m = "invokeSuspend")
public final class n extends v13.i implements p<b0, t13.d<? super URI>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MFAPortalFlowActivity f204322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o13.p<sc2.a, String> f204323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ URI f204324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f204325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(MFAPortalFlowActivity mFAPortalFlowActivity, o13.p<? extends sc2.a, String> pVar, URI uri, String str, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f204322b = mFAPortalFlowActivity;
        this.f204323c = pVar;
        this.f204324d = uri;
        this.f204325e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f204322b, this.f204323c, this.f204324d, this.f204325e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super URI> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204321a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        f1 f1Var = new f1();
        MFAPortalFlowActivity mFAPortalFlowActivity = this.f204322b;
        Context applicationContext = mFAPortalFlowActivity.getApplicationContext();
        applicationContext.getClass();
        String str = mFAPortalFlowActivity.Z9().f177691b;
        ve2.e eVarBa = mFAPortalFlowActivity.ba();
        String str2 = mFAPortalFlowActivity.f50500v;
        str2.getClass();
        this.f204321a = 1;
        Object objC = f1Var.c(applicationContext, str, this.f204323c, eVarBa, this.f204324d, str2, this.f204325e, this);
        return objC == aVar ? aVar : objC;
    }
}
