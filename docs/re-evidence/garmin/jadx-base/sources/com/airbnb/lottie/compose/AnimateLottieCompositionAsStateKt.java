package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import t13.d;
import u13.a;
import v.e0;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0011\u001a\u00020\u00102\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "", "isPlaying", "restartOnPlay", "reverseOnRepeat", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "", "speed", "", "iterations", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "animateLottieCompositionAsState", "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLp3/m;II)Lcom/airbnb/lottie/compose/LottieAnimationState;", "wasPlaying", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimateLottieCompositionAsStateKt {

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ float $actualSpeed;
        final /* synthetic */ LottieAnimatable $animatable;
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ LottieClipSpec $clipSpec;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ boolean $isPlaying;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $restartOnPlay;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ boolean $useCompositionFrameRate;
        final /* synthetic */ p1<Boolean> $wasPlaying$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z14, boolean z15, LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i14, boolean z16, float f14, LottieClipSpec lottieClipSpec, LottieCancellationBehavior lottieCancellationBehavior, boolean z17, p1<Boolean> p1Var, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$isPlaying = z14;
            this.$restartOnPlay = z15;
            this.$animatable = lottieAnimatable;
            this.$composition = lottieComposition;
            this.$iterations = i14;
            this.$reverseOnRepeat = z16;
            this.$actualSpeed = f14;
            this.$clipSpec = lottieClipSpec;
            this.$cancellationBehavior = lottieCancellationBehavior;
            this.$useCompositionFrameRate = z17;
            this.$wasPlaying$delegate = p1Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass3(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        
            if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.animate$default(r0, r2, 0, r3, r4, r5, r6, r7, false, r9, false, r11, r16, ch.qos.logback.core.net.SyslogConstants.SYSLOG_PORT, null) == r15) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            if (this.$isPlaying && !AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$3(this.$wasPlaying$delegate) && this.$restartOnPlay) {
                LottieAnimatable lottieAnimatable = this.$animatable;
                this.label = 1;
                if (LottieAnimatableKt.resetToBeginning(lottieAnimatable, this) != aVar) {
                }
            }
            return aVar;
            AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$4(this.$wasPlaying$delegate, this.$isPlaying);
            if (!this.$isPlaying) {
                return Unit.INSTANCE;
            }
            LottieAnimatable lottieAnimatable2 = this.$animatable;
            LottieComposition lottieComposition = this.$composition;
            int i15 = this.$iterations;
            boolean z14 = this.$reverseOnRepeat;
            float f14 = this.$actualSpeed;
            LottieClipSpec lottieClipSpec = this.$clipSpec;
            float progress = lottieAnimatable2.getProgress();
            LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
            boolean z15 = this.$useCompositionFrameRate;
            this.label = 2;
        }
    }

    public static final LottieAnimationState animateLottieCompositionAsState(LottieComposition lottieComposition, boolean z14, boolean z15, boolean z16, LottieClipSpec lottieClipSpec, float f14, int i14, LottieCancellationBehavior lottieCancellationBehavior, boolean z17, boolean z18, m mVar, int i15, int i16) {
        mVar.L(683659508);
        boolean z19 = (i16 & 2) != 0 ? true : z14;
        boolean z24 = (i16 & 4) != 0 ? true : z15;
        boolean z25 = (i16 & 8) != 0 ? false : z16;
        LottieClipSpec lottieClipSpec2 = (i16 & 16) != 0 ? null : lottieClipSpec;
        float animationScale = (i16 & 32) != 0 ? 1.0f : f14;
        int i17 = (i16 & 64) != 0 ? 1 : i14;
        LottieCancellationBehavior lottieCancellationBehavior2 = (i16 & 128) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
        boolean z26 = (i16 & 256) != 0 ? false : z17;
        boolean z27 = (i16 & 512) != 0 ? false : z18;
        x1 x1Var = n.f135158a;
        if (i17 <= 0) {
            h.x(e0.f(i17, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(animationScale) || Float.isNaN(animationScale)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + animationScale + ".").toString());
        }
        LottieAnimatable lottieAnimatableRememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(mVar, 0);
        mVar.L(-180606964);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = p0.n(Boolean.valueOf(z19));
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        mVar.R();
        mVar.L(-180606834);
        if (!z26) {
            animationScale /= Utils.getAnimationScale((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        }
        float f15 = animationScale;
        mVar.R();
        l0.h(new Object[]{lottieComposition, Boolean.valueOf(z19), lottieClipSpec2, Float.valueOf(f15), Integer.valueOf(i17)}, new AnonymousClass3(z19, z24, lottieAnimatableRememberLottieAnimatable, lottieComposition, i17, z25, f15, lottieClipSpec2, lottieCancellationBehavior2, z27, p1Var, null), mVar);
        mVar.R();
        return lottieAnimatableRememberLottieAnimatable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateLottieCompositionAsState$lambda$3(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLottieCompositionAsState$lambda$4(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }
}
