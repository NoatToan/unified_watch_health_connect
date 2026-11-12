package pt0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.b1;
import yt0.f1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.EarnedBadgeChallengeViewModel$getCompletedChallenges$1", f = "EarnedBadgeChallengeViewModel.kt", l = {59, 61, 65}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<t0<List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.a0>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f140636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f140637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f140638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f140639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, int i14, int i15, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f140637c = e0Var;
        this.f140638d = i14;
        this.f140639e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f140637c, this.f140638d, this.f140639e, dVar);
        c0Var.f140636b = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.a0>> t0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f140636b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140635a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        f1 f1Var = this.f140637c.f140657a;
        this.f140636b = t0Var;
        this.f140635a = 1;
        int i15 = f1.f199486c;
        w13.c cVar = com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k;
        f1Var.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(f1Var, new b1(f1Var, this.f140638d, this.f140639e, cVar, null), this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listH = ((com.garmin.android.apps.connectmobile.leaderboard.model.c0) ((v2.b) v2Var).f47386a).h();
            if (listH == null) {
                listH = p13.j0.f134944a;
            }
            this.f140636b = null;
            this.f140635a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p13.j0 j0Var = p13.j0.f134944a;
            this.f140636b = null;
            this.f140635a = 3;
        }
    }
}
