package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import t13.d;
import u13.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "rememberLottieAnimatable", "(Lp3/m;I)Lcom/airbnb/lottie/compose/LottieAnimatable;", "LottieAnimatable", "()Lcom/airbnb/lottie/compose/LottieAnimatable;", "", "resetToBeginning", "(Lcom/airbnb/lottie/compose/LottieAnimatable;Lt13/d;)Ljava/lang/Object;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "", "speed", "defaultProgress", "(Lcom/airbnb/lottie/LottieComposition;Lcom/airbnb/lottie/compose/LottieClipSpec;F)F", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LottieAnimatableKt {
    public static final LottieAnimatable LottieAnimatable() {
        return new LottieAnimatableImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float defaultProgress(LottieComposition lottieComposition, LottieClipSpec lottieClipSpec, float f14) {
        if (f14 < 0.0f && lottieComposition == null) {
            return 1.0f;
        }
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (f14 < 0.0f) {
            if (lottieClipSpec != null) {
                return lottieClipSpec.getMaxProgress$lottie_compose_release(lottieComposition);
            }
            return 1.0f;
        }
        if (lottieClipSpec != null) {
            return lottieClipSpec.getMinProgress$lottie_compose_release(lottieComposition);
        }
        return 0.0f;
    }

    public static final LottieAnimatable rememberLottieAnimatable(m mVar, int i14) {
        mVar.L(2024497114);
        x1 x1Var = n.f135158a;
        mVar.L(-610207850);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = LottieAnimatable();
            mVar.K(objQ);
        }
        LottieAnimatable lottieAnimatable = (LottieAnimatable) objQ;
        mVar.R();
        mVar.R();
        return lottieAnimatable;
    }

    public static final Object resetToBeginning(LottieAnimatable lottieAnimatable, d<? super Unit> dVar) {
        Object objSnapTo$default = LottieAnimatable.DefaultImpls.snapTo$default(lottieAnimatable, null, defaultProgress(lottieAnimatable.getComposition(), lottieAnimatable.getClipSpec(), lottieAnimatable.getSpeed()), 1, false, dVar, 9, null);
        return objSnapTo$default == a.COROUTINE_SUSPENDED ? objSnapTo$default : Unit.INSTANCE;
    }
}
