package androidx.paging;

import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00060\u000bJ%\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/paging/TemporaryDownstream;", "T", "", "()V", "historyChannel", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", Constants.EXTRA_CLOSE_TAI, "", "consumeHistory", "Lkotlinx/coroutines/flow/Flow;", "send", "", "event", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 4, 2})
final class TemporaryDownstream<T> {
    private final Channel<IndexedValue<PageEvent<T>>> historyChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: androidx.paging.TemporaryDownstream$send$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@"}, d2 = {"send", "", "T", "event", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.TemporaryDownstream", f = "CachedPageEventFlow.kt", i = {}, l = {149}, m = "send", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TemporaryDownstream.this.send(null, this);
        }
    }

    public final void close() {
        SendChannel.DefaultImpls.close$default(this.historyChannel, null, 1, null);
    }

    @NotNull
    public final Flow<IndexedValue<PageEvent<T>>> consumeHistory() {
        return FlowKt.consumeAsFlow(this.historyChannel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object send(@NotNull IndexedValue<? extends PageEvent<T>> indexedValue, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<IndexedValue<PageEvent<T>>> channel = this.historyChannel;
                anonymousClass1.label = 1;
                if (channel.send(indexedValue, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (ClosedSendChannelException unused) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }
}
