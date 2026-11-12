package ak0;

import android.content.Intent;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity$launchMFAOrPurchaseFlow$1", f = "GCPlusHomeActivity.kt", l = {255, 256, 258}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f12.b f3594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GCPlusHomeActivity f3597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f3599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GCPlusHomeActivity gCPlusHomeActivity, String str, String str2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f3597d = gCPlusHomeActivity;
        this.f3598e = str;
        this.f3599f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f3597d, this.f3598e, this.f3599f, dVar);
        dVar2.f3596c = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:40:0x0095, B:42:0x0099, B:44:0x00b5, B:43:0x009f, B:13:0x0027, B:30:0x006e, B:32:0x0072, B:37:0x007c, B:35:0x0079, B:16:0x002d, B:25:0x005d, B:27:0x0061, B:20:0x0044, B:22:0x0050), top: B:49:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:40:0x0095, B:42:0x0099, B:44:0x00b5, B:43:0x009f, B:13:0x0027, B:30:0x006e, B:32:0x0072, B:37:0x007c, B:35:0x0079, B:16:0x002d, B:25:0x005d, B:27:0x0061, B:20:0x0044, B:22:0x0050), top: B:49:0x0011 }] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r12 == r1) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f12.b bVar;
        Boolean bool;
        o53.b0 b0Var = (o53.b0) this.f3596c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3595b;
        GCPlusHomeActivity gCPlusHomeActivity = this.f3597d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                ve2.d dVarK = bVar.k();
                if (dVarK != null && p005kotlin.jvm.internal.s.g(bVar.H(dVarK), Boolean.TRUE)) {
                    this.f3596c = b0Var;
                    this.f3594a = bVar;
                    this.f3595b = 1;
                    obj = bVar.w(this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                GCPlusHomeActivity.a aVar2 = GCPlusHomeActivity.f35323e;
                gCPlusHomeActivity.getClass();
                ge1.b.T(o53.f0.w(gCPlusHomeActivity), null, null, new e(gCPlusHomeActivity, this.f3598e, this.f3599f, null), 3);
                return Unit.INSTANCE;
            }
            if (i14 == 1) {
                bVar = this.f3594a;
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    bool = (Boolean) obj;
                    if (bool != null) {
                        return Unit.INSTANCE;
                    }
                    if (!bool.booleanValue()) {
                        a2 a2Var = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "GCPlusHomeActivity", "MFA token is null or invalid. Launching MFA flow.");
                        this.f3596c = b0Var;
                        this.f3594a = null;
                        this.f3595b = 3;
                        obj = qu.b.a(gCPlusHomeActivity, false, this);
                    }
                    GCPlusHomeActivity.a aVar3 = GCPlusHomeActivity.f35323e;
                    gCPlusHomeActivity.getClass();
                    ge1.b.T(o53.f0.w(gCPlusHomeActivity), null, null, new e(gCPlusHomeActivity, this.f3598e, this.f3599f, null), 3);
                    return Unit.INSTANCE;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Intent intent = (Intent) obj;
            if (intent != null) {
                gCPlusHomeActivity.f35327d.a(intent, null);
            } else {
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "GCPlusHomeActivity", "Failed to build MFA intent. Cannot proceed with purchase flow.");
                Toast.makeText(gCPlusHomeActivity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
            }
            return Unit.INSTANCE;
            String str = (String) obj;
            if (str != null) {
                this.f3596c = b0Var;
                this.f3594a = null;
                this.f3595b = 2;
                obj = bVar.a(str, this);
                if (obj != aVar) {
                    bool = (Boolean) obj;
                    if (bool != null) {
                        return Unit.INSTANCE;
                    }
                    if (!bool.booleanValue()) {
                        a2 a2Var3 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "GCPlusHomeActivity", "MFA token is null or invalid. Launching MFA flow.");
                        this.f3596c = b0Var;
                        this.f3594a = null;
                        this.f3595b = 3;
                        obj = qu.b.a(gCPlusHomeActivity, false, this);
                    }
                    GCPlusHomeActivity.a aVar4 = GCPlusHomeActivity.f35323e;
                    gCPlusHomeActivity.getClass();
                    ge1.b.T(o53.f0.w(gCPlusHomeActivity), null, null, new e(gCPlusHomeActivity, this.f3598e, this.f3599f, null), 3);
                    return Unit.INSTANCE;
                }
            } else {
                a2 a2Var4 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "GCPlusHomeActivity", "MFA token is null or invalid. Launching MFA flow.");
                this.f3596c = b0Var;
                this.f3594a = null;
                this.f3595b = 3;
                obj = qu.b.a(gCPlusHomeActivity, false, this);
            }
            return aVar;
        } catch (Exception e4) {
            a2 a2Var5 = a2.SUBSCRIPTIONS;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error while checking MFA token: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var5, "GCPlusHomeActivity", strD);
        }
    }
}
