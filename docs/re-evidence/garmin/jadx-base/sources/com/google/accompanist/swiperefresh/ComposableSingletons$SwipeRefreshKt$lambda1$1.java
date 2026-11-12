package com.google.accompanist.swiperefresh;

import e23.r;
import g6.f;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: renamed from: com.google.accompanist.swiperefresh.ComposableSingletons$SwipeRefreshKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", "s", "Lg6/f;", "trigger", "", "invoke-ziNgDLE", "(Lcom/google/accompanist/swiperefresh/SwipeRefreshState;FLp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class ComposableSingletons$SwipeRefreshKt$lambda1$1 extends w implements r<SwipeRefreshState, f, m, Integer, Unit> {
    public static final ComposableSingletons$SwipeRefreshKt$lambda1$1 INSTANCE = new ComposableSingletons$SwipeRefreshKt$lambda1$1();

    public ComposableSingletons$SwipeRefreshKt$lambda1$1() {
        super(4);
    }

    @Override // e23.r
    public /* synthetic */ Unit invoke(SwipeRefreshState swipeRefreshState, f fVar, m mVar, Integer num) {
        m75invokeziNgDLE(swipeRefreshState, fVar.f75997a, mVar, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke-ziNgDLE, reason: not valid java name */
    public final void m75invokeziNgDLE(SwipeRefreshState swipeRefreshState, float f14, m mVar, int i14) {
        SwipeRefreshState swipeRefreshState2;
        int i15;
        swipeRefreshState.getClass();
        if ((i14 & 14) == 0) {
            swipeRefreshState2 = swipeRefreshState;
            i15 = i14 | (mVar.B(swipeRefreshState2) ? 4 : 2);
        } else {
            swipeRefreshState2 = swipeRefreshState;
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= mVar.i(f14) ? 32 : 16;
        }
        if ((i15 & 731) == 146 && mVar.b()) {
            mVar.e();
        } else {
            x1 x1Var = n.f135158a;
            SwipeRefreshIndicatorKt.m76SwipeRefreshIndicator_UAkqwU(swipeRefreshState2, f14, null, false, false, false, 0L, 0L, null, 0.0f, false, 0.0f, mVar, i15 & 126, 0, 4092);
        }
    }
}
