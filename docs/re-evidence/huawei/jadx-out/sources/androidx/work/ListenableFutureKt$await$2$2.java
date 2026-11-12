package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import defpackage.yzc;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 176)
public final class ListenableFutureKt$await$2$2 extends Lambda implements Function1<Throwable, yzc> {
    final /* synthetic */ ListenableFuture<R> $this_await;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
        invoke2(th);
        return yzc.e;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_await.cancel(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(ListenableFuture<R> listenableFuture) {
        super(1);
        this.$this_await = listenableFuture;
    }
}
