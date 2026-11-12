package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@"}, d2 = {"handle", "", "T", "msg", "Landroidx/paging/multicast/ChannelManager$Message;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.multicast.ChannelManager$Actor", f = "ChannelManager.kt", i = {}, l = {103, 104, 105}, m = "handle", n = {}, s = {})
public final class ChannelManager$Actor$handle$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChannelManager.Actor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelManager$Actor$handle$1(ChannelManager.Actor actor, Continuation continuation) {
        super(continuation);
        this.this$0 = actor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handle((ChannelManager.Message) null, (Continuation<? super Unit>) this);
    }
}
