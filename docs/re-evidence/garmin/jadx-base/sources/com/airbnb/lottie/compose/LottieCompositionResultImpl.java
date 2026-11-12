package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import com.google.firebase.messaging.Constants;
import e23.a;
import gl.b;
import o53.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.p0;
import p3.p1;
import p3.x3;
import t13.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R/\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\nR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u000fR\u001b\u0010\"\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001b\u0010'\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001b\u0010)\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#¨\u0006*"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "await", "(Lt13/d;)Ljava/lang/Object;", "composition", "", "complete$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "complete", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "completeExceptionally$lottie_compose_release", "(Ljava/lang/Throwable;)V", "completeExceptionally", "Lo53/r;", "compositionDeferred", "Lo53/r;", "<set-?>", "value$delegate", "Lp3/p1;", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "setValue", "value", "error$delegate", "getError", "()Ljava/lang/Throwable;", "setError", "", "isLoading$delegate", "Lp3/x3;", "isLoading", "()Z", "isComplete$delegate", "isComplete", "isFailure$delegate", "isFailure", "isSuccess$delegate", "isSuccess", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LottieCompositionResultImpl implements LottieCompositionResult {
    public static final int $stable = 0;
    private final r<LottieComposition> compositionDeferred = b.b();

    /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
    private final p1 value = p0.n(null);

    /* JADX INFO: renamed from: error$delegate, reason: from kotlin metadata */
    private final p1 error = p0.n(null);

    /* JADX INFO: renamed from: isLoading$delegate, reason: from kotlin metadata */
    private final x3 isLoading = p0.f(new C38752());

    /* JADX INFO: renamed from: isComplete$delegate, reason: from kotlin metadata */
    private final x3 isComplete = p0.f(new AnonymousClass2());

    /* JADX INFO: renamed from: isFailure$delegate, reason: from kotlin metadata */
    private final x3 isFailure = p0.f(new C38742());

    /* JADX INFO: renamed from: isSuccess$delegate, reason: from kotlin metadata */
    private final x3 isSuccess = p0.f(new C38762());

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends w implements a<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf((LottieCompositionResultImpl.this.getF182175a() == null && LottieCompositionResultImpl.this.getError() == null) ? false : true);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C38742 extends w implements a<Boolean> {
        public C38742() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getError() != null);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C38752 extends w implements a<Boolean> {
        public C38752() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getF182175a() == null && LottieCompositionResultImpl.this.getError() == null);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C38762 extends w implements a<Boolean> {
        public C38762() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getF182175a() != null);
        }
    }

    private void setError(Throwable th3) {
        this.error.setValue(th3);
    }

    private void setValue(LottieComposition lottieComposition) {
        this.value.setValue(lottieComposition);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public Object await(d<? super LottieComposition> dVar) {
        return this.compositionDeferred.await(dVar);
    }

    public final synchronized void complete$lottie_compose_release(LottieComposition composition) {
        composition.getClass();
        if (isComplete()) {
            return;
        }
        setValue(composition);
        this.compositionDeferred.p(composition);
    }

    public final synchronized void completeExceptionally$lottie_compose_release(Throwable error) {
        error.getClass();
        if (isComplete()) {
            return;
        }
        setError(error);
        this.compositionDeferred.O(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public Throwable getError() {
        return (Throwable) this.error.getF182175a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieCompositionResult, p3.x3
    /* JADX INFO: renamed from: getValue */
    public LottieComposition getF182175a() {
        return (LottieComposition) this.value.getF182175a();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isComplete() {
        return ((Boolean) this.isComplete.getF182175a()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isFailure() {
        return ((Boolean) this.isFailure.getF182175a()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isLoading() {
        return ((Boolean) this.isLoading.getF182175a()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isSuccess() {
        return ((Boolean) this.isSuccess.getF182175a()).booleanValue();
    }
}
