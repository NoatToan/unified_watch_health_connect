package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "androidx/concurrent/futures/ListenableFutureKt$await$2$1"}, k = 3, mv = {1, 1, 16})
public final class d extends w implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f6088a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ListenableFuture listenableFuture) {
        super(1);
        this.f6088a = listenableFuture;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        this.f6088a.cancel(false);
        return Unit.INSTANCE;
    }
}
