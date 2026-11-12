package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import o13.r;
import p005kotlin.Metadata;
import t13.d;
import u13.a;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Lcom/airbnb/lottie/LottieComposition;", "awaitOrNull", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lt13/d;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LottieCompositionResultKt {

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", l = {85}, m = "awaitOrNull")
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LottieCompositionResultKt.awaitOrNull(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitOrNull(LottieCompositionResult lottieCompositionResult, d<? super LottieComposition> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objAwait = anonymousClass1.result;
        Object obj = a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        try {
            if (i15 == 0) {
                r.b(objAwait);
                anonymousClass1.label = 1;
                objAwait = lottieCompositionResult.await(anonymousClass1);
                if (objAwait == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objAwait);
            }
            return (LottieComposition) objAwait;
        } catch (Throwable unused) {
            return null;
        }
    }
}
