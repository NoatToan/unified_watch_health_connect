package com.airbnb.lottie.compose;

import com.airbnb.lottie.value.LottieFrameInfo;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.x3;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "invoke", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1<T> extends w implements l<LottieFrameInfo<T>, T> {
    final /* synthetic */ x3<l<LottieFrameInfo<T>, T>> $callbackState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1(x3<? extends l<? super LottieFrameInfo<T>, ? extends T>> x3Var) {
        super(1);
        this.$callbackState$delegate = x3Var;
    }

    @Override // e23.l
    public final T invoke(LottieFrameInfo<T> lottieFrameInfo) {
        lottieFrameInfo.getClass();
        return (T) LottieDynamicPropertiesKt.rememberLottieDynamicProperty$lambda$4(this.$callbackState$delegate).invoke(lottieFrameInfo);
    }
}
