package com.airbnb.lottie.compose;

import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import q53.a;
import q53.i;
import q53.l;
import t13.d;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "<init>", "()V", "", "retry", "awaitRetry", "(Lt13/d;)Ljava/lang/Object;", "Lq53/i;", "channel", "Lq53/i;", "", "<set-?>", "isAwaitingRetry$delegate", "Lp3/p1;", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LottieRetrySignal {
    public static final int $stable = 0;
    private final i<Unit> channel = l.a(1, 4, a.DROP_OLDEST);

    /* JADX INFO: renamed from: isAwaitingRetry$delegate, reason: from kotlin metadata */
    private final p1 isAwaitingRetry = p0.n(Boolean.FALSE);

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.airbnb.lottie.compose.LottieRetrySignal", f = "LottieRetrySignal.kt", l = {45}, m = "awaitRetry")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LottieRetrySignal.this.awaitRetry(this);
        }
    }

    private final void setAwaitingRetry(boolean z14) {
        this.isAwaitingRetry.setValue(Boolean.valueOf(z14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object awaitRetry(d<? super Unit> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        LottieRetrySignal lottieRetrySignal;
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
        Object obj = anonymousClass1.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        if (i15 != 0) {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lottieRetrySignal = (LottieRetrySignal) anonymousClass1.L$0;
            try {
                r.b(obj);
                lottieRetrySignal.setAwaitingRetry(false);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                lottieRetrySignal.setAwaitingRetry(false);
                throw th;
            }
        }
        r.b(obj);
        try {
            setAwaitingRetry(true);
            i<Unit> iVar = this.channel;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (iVar.g(anonymousClass1) == aVar) {
                return aVar;
            }
            lottieRetrySignal = this;
            lottieRetrySignal.setAwaitingRetry(false);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            lottieRetrySignal = this;
            lottieRetrySignal.setAwaitingRetry(false);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAwaitingRetry() {
        return ((Boolean) this.isAwaitingRetry.getF182175a()).booleanValue();
    }

    public final void retry() {
        og.a.d0(this.channel, Unit.INSTANCE);
    }
}
