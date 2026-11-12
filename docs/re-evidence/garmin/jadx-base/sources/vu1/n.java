package vu1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity$resumePlanOrShowPaywall$1", f = "FBTDashBoardActivity.kt", l = {378}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f180352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FBTDashBoardActivity f180353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z14, FBTDashBoardActivity fBTDashBoardActivity, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f180352b = z14;
        this.f180353c = fBTDashBoardActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f180352b, this.f180353c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o oVarMa;
        Long l14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180351a;
        FBTDashBoardActivity fBTDashBoardActivity = this.f180353c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f180352b) {
                FBTDashBoardActivity.a aVar2 = FBTDashBoardActivity.f45458n;
                o oVarMa2 = fBTDashBoardActivity.ma();
                this.f180351a = 1;
                obj = oVarMa2.h5(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                FBTDashBoardActivity.a aVar3 = FBTDashBoardActivity.f45458n;
                oVarMa = fBTDashBoardActivity.ma();
                int i15 = o.R0;
                l14 = oVarMa.f180261k0;
                if (l14 != null) {
                    ge1.b.T(v1.a(oVarMa), null, null, new v(false, oVarMa, l14.longValue(), new tw1.p(null, "Scheduled"), null), 3);
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        if (((Boolean) obj).booleanValue()) {
            FBTDashBoardActivity.a aVar4 = FBTDashBoardActivity.f45458n;
            oVarMa = fBTDashBoardActivity.ma();
            int i16 = o.R0;
            l14 = oVarMa.f180261k0;
            if (l14 != null) {
                ge1.b.T(v1.a(oVarMa), null, null, new v(false, oVarMa, l14.longValue(), new tw1.p(null, "Scheduled"), null), 3);
            }
        } else {
            fBTDashBoardActivity.f45467m.a(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(fBTDashBoardActivity, c80.q.LIVE_ACTIVITY, false), null);
        }
        return Unit.INSTANCE;
    }
}
