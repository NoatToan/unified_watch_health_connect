package com.airbnb.lottie.compose;

import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R,\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "T", "", "property", "Lcom/airbnb/lottie/model/KeyPath;", "keyPath", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "callback", "<init>", "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Le23/l;)V", "value", "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getProperty$lottie_compose_release", "()Ljava/lang/Object;", "Lcom/airbnb/lottie/model/KeyPath;", "getKeyPath$lottie_compose_release", "()Lcom/airbnb/lottie/model/KeyPath;", "Le23/l;", "getCallback$lottie_compose_release", "()Le23/l;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LottieDynamicProperty<T> {
    public static final int $stable = 8;
    private final l<LottieFrameInfo<T>, T> callback;
    private final KeyPath keyPath;
    private final T property;

    /* JADX WARN: Multi-variable type inference failed */
    public LottieDynamicProperty(T t7, KeyPath keyPath, l<? super LottieFrameInfo<T>, ? extends T> lVar) {
        keyPath.getClass();
        lVar.getClass();
        this.property = t7;
        this.keyPath = keyPath;
        this.callback = lVar;
    }

    public final l<LottieFrameInfo<T>, T> getCallback$lottie_compose_release() {
        return this.callback;
    }

    /* JADX INFO: renamed from: getKeyPath$lottie_compose_release, reason: from getter */
    public final KeyPath getKeyPath() {
        return this.keyPath;
    }

    public final T getProperty$lottie_compose_release() {
        return this.property;
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieDynamicProperty$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "invoke", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<LottieFrameInfo<T>, T> {
        final /* synthetic */ T $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(T t7) {
            super(1);
            this.$value = t7;
        }

        @Override // e23.l
        public final T invoke(LottieFrameInfo<T> lottieFrameInfo) {
            lottieFrameInfo.getClass();
            return this.$value;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieDynamicProperty(T t7, KeyPath keyPath, T t14) {
        this((Object) t7, keyPath, (l) new AnonymousClass1(t14));
        keyPath.getClass();
    }
}
