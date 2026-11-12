package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.g3;
import mt0.q1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsFragment$setupChallengeActions$1", f = "BadgeChallengeDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f37897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, boolean z14, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f37897a = sVar;
        this.f37898b = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f37897a, this.f37898b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s.a aVar2 = s.F;
        s sVar = this.f37897a;
        pt0.p pVarE6 = sVar.E6();
        o13.t tVar = sVar.f37858q;
        g3 g3Var = (g3) pVarE6.f140757d.d();
        if (g3Var == null || (pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) g3Var.f35301b) == null) {
            return Unit.INSTANCE;
        }
        boolean zJ0 = pVar.J0();
        boolean z14 = false;
        if (pVar.Z0() && !this.f37898b) {
            z14 = true;
        }
        Object value = tVar.getValue();
        value.getClass();
        v22.e.r((ComposeView) value, !(pVar.getUserJoined() || pVar.V0()) || zJ0);
        Object value2 = tVar.getValue();
        value2.getClass();
        ((ComposeView) value2).setContent(new z3.e(398373510, true, new q1(zJ0, sVar, pVar, z14, 0)));
        return Unit.INSTANCE;
    }
}
