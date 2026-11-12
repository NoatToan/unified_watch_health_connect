package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b\u001a'\u0010\t\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0019\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0019\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlin/Function0;", "", "generateMsg", "", "debugLog", "Landroidx/compose/foundation/lazy/LazyListState;", "", "index", "scrollOffset", "doSmoothScrollToItem", "(Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazyListScrollingKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m2965constructorimpl(2500);
    private static final float BoundDistance = Dp.m2965constructorimpl(1500);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$2", f = "LazyListScrolling.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {67, 188}, m = "invokeSuspend", n = {"$this$scroll", "loop", "prevVelocity", "loops", "anim", "boundDistancePx", "forward", "target"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "I$0", "F$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ AnimationSpec<Float> $animationSpec;
        public final /* synthetic */ int $index;
        public final /* synthetic */ int $scrollOffset;
        public final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
        public float F$0;
        public float F$1;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LazyListState lazyListState, int i, AnimationSpec<Float> animationSpec, int i2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_doSmoothScrollToItem = lazyListState;
            this.$index = i;
            this.$animationSpec = animationSpec;
            this.$scrollOffset = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_doSmoothScrollToItem, this.$index, this.$animationSpec, this.$scrollOffset, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0099 A[Catch: ItemFoundInScroll -> 0x013d, TryCatch #0 {ItemFoundInScroll -> 0x013d, blocks: (B:24:0x0095, B:26:0x0099, B:33:0x00d1, B:37:0x00da), top: B:61:0x0095 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:39:0x011b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x011c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011c -> B:64:0x011e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 440
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListScrollingKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final void debugLog(Function0<String> function0) {
    }

    @Nullable
    public static final Object doSmoothScrollToItem(@NotNull LazyListState lazyListState, int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll$default = ScrollableState.DefaultImpls.scroll$default(lazyListState, null, new AnonymousClass2(lazyListState, i, AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), i2, null), continuation, 1, null);
        return objScroll$default == a.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListItemInfo doSmoothScrollToItem$getTargetItem(LazyListState lazyListState, int i) {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size() - 1;
        if (size < 0) {
            lazyListItemInfo = null;
            break;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            lazyListItemInfo = visibleItemsInfo.get(i2);
            if (lazyListItemInfo.getIndex() == i) {
                break;
            }
            if (i3 > size) {
                lazyListItemInfo = null;
                break;
            }
            i2 = i3;
        }
        return lazyListItemInfo;
    }
}
