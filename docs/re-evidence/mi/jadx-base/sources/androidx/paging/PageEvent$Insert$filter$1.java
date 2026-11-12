package androidx.paging;

import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u0005H\u0096@"}, d2 = {"filter", "", "T", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "continuation", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {104}, m = "filter", n = {"predicate", "this_$iv$iv", "destination$iv$iv$iv", "it", "originalIndices", "data", DeviceTagInterface.CUSTOM_TAG_TYPE, "index$iv", "index"}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1"})
public final class PageEvent$Insert$filter$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageEvent.Insert this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$filter$1(PageEvent.Insert insert, Continuation continuation) {
        super(continuation);
        this.this$0 = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.filter(null, this);
    }
}
