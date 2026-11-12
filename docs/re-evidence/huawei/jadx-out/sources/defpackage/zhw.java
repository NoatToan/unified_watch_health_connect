package defpackage;

import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellingNode;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B.\u0012'\u0010\u0002\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t¢\u0006\u0002\u0010\nJ\u0013\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R/\u0010\u0002\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/InvokeOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "handler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;)V", "_invoked", "Lkotlinx/atomicfu/AtomicInt;", TrackConstants$Opers.INVOKE, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zhw extends JobCancellingNode {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(zhw.class, "_invoked");

    @Volatile
    private volatile int _invoked;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1<Throwable, yzc> f54111c;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
        invoke2(th);
        return yzc.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zhw(Function1<? super Throwable, yzc> function1) {
        this.f54111c = function1;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(Throwable cause) {
        if (e.compareAndSet(this, 0, 1)) {
            this.f54111c.invoke(cause);
        }
    }
}
