package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import com.huami.watch.dataflow.chart.util.AnimUtil;
import com.huami.watch.notification.TransportUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b%\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J.\u0010\u000e\u001a\u00020\u0006*\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\fH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002J'\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\"\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010%\u001a\u00020\u0014H\u0000¢\u0006\u0004\b#\u0010$J_\u0010-\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020&0)0(2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b+\u0010,J=\u0010-\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020&0)0(2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010.\u001a\u00020*H\u0000¢\u0006\u0004\b/\u00100J\u0011\u00104\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u0006H\u0000¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\u0006H\u0000¢\u0006\u0004\b8\u00106J\u000f\u0010;\u001a\u00020\u0006H\u0000¢\u0006\u0004\b:\u00106J\u0006\u0010<\u001a\u00020\u0006J\u000e\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u001eR\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR.\u0010C\u001a\u0004\u0018\u00010&2\b\u0010B\u001a\u0004\u0018\u00010&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR0\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010]\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR+\u0010v\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010L\"\u0004\bu\u0010NR!\u0010w\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\bw\u0010xR.\u0010y\u001a\u0004\u0018\u00010\u00142\b\u0010B\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010$\"\u0004\b|\u0010}R\u001f\u0010~\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b~\u0010\u007fR!\u0010\u0080\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR=\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00022\b\u0010q\u001a\u0004\u0018\u00010\u00028F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010s\u001a\u0005\b\u0082\u0001\u0010\u0004\"\u0006\b\u0083\u0001\u0010\u0084\u0001R=\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00022\b\u0010q\u001a\u0004\u0018\u00010\u00028F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0086\u0001\u0010s\u001a\u0005\b\u0087\u0001\u0010\u0004\"\u0006\b\u0088\u0001\u0010\u0084\u0001R\u0016\u0010\u008c\u0001\u001a\u00020\u00108F@\u0006¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u008f\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/ui/geometry/Offset;", "currentSelectionStartPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "currentSelectionStartPosition", "", "updateHandleOffsets", "updateSelectionToolbarPosition", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "onTap", "detectNonConsumingTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "onClearSelectionRequested", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "offset", "convertToContainerCoordinates-Q7Q5hAU", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)Landroidx/compose/ui/geometry/Offset;", "convertToContainerCoordinates", "startPosition", "endPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isStartHandle", "updateSelection-RHHTvR4", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "updateSelection", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "", "", "mergeSelections-IUXd7x4$foundation_release", "(JJLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "mergeSelections", "selectableId", "mergeSelections$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection;J)Lkotlin/Pair;", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "copy$foundation_release", "()V", "copy", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "onRelease", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "value", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "touchMode", "Z", "getTouchMode", "()Z", "setTouchMode", "(Z)V", "onSelectionChange", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "setHasFocus", "hasFocus", "previousPosition", "Landroidx/compose/ui/geometry/Offset;", "containerLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "dragBeginPosition", "J", "dragTotalDistance", "startHandlePosition$delegate", "getStartHandlePosition-_m7T9-E", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "startHandlePosition", "endHandlePosition$delegate", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class SelectionManager {

    @Nullable
    private ClipboardManager clipboardManager;

    @Nullable
    private LayoutCoordinates containerLayoutCoordinates;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* JADX INFO: renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState endHandlePosition;

    @Nullable
    private HapticFeedback hapticFeedBack;

    @Nullable
    private Offset previousPosition;

    @Nullable
    private Selection selection;

    @NotNull
    private final SelectionRegistrarImpl selectionRegistrar;

    /* JADX INFO: renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState startHandlePosition;

    @Nullable
    private TextToolbar textToolbar;
    private boolean touchMode = true;

    @NotNull
    private Function1<? super Selection, Unit> onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
            invoke2(selection);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Selection selection) {
        }
    };

    @NotNull
    private FocusRequester focusRequester = new FocusRequester();

    /* JADX INFO: renamed from: hasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState hasFocus = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", i = {}, l = {639}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13752 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Offset, Unit> $onTap;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1", f = "SelectionManager.kt", i = {}, l = {640}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $$this$forEachGesture;
            public final /* synthetic */ Function1<Offset, Unit> $onTap;
            public int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1$1", f = "SelectionManager.kt", i = {}, l = {641}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00371 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Function1<Offset, Unit> $onTap;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00371(Function1<? super Offset, Unit> function1, Continuation<? super C00371> continuation) {
                    super(2, continuation);
                    this.$onTap = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C00371 c00371 = new C00371(this.$onTap, continuation);
                    c00371.L$0 = obj;
                    return c00371;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00371) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        this.$onTap.invoke(Offset.m972boximpl(pointerInputChange.getPosition()));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$forEachGesture = pointerInputScope;
                this.$onTap = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$$this$forEachGesture, this.$onTap, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                    C00371 c00371 = new C00371(this.$onTap, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c00371, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13752(Function1<? super Offset, Unit> function1, Continuation<? super C13752> continuation) {
            super(2, continuation);
            this.$onTap = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C13752 c13752 = new C13752(this.$onTap, continuation);
            c13752.L$0 = obj;
            return c13752;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C13752) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$onTap, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", i = {}, l = {AnimUtil.DURATION_CHART_SLEEP_SWITCH}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13771 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $block;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13771(Function0<Unit> function0, Continuation<? super C13771> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C13771 c13771 = SelectionManager.this.new C13771(this.$block, continuation);
            c13771.L$0 = obj;
            return c13771;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C13771) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                SelectionManager selectionManager = SelectionManager.this;
                final Function0<Unit> function0 = this.$block;
                Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m533invokek4lQ0M(offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m533invokek4lQ0M(long j) {
                        function0.getA();
                    }
                };
                this.label = 1;
                if (selectionManager.detectNonConsumingTap(pointerInputScope, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public SelectionManager(@NotNull SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m999getZeroF1C5BW0();
        this.dragTotalDistance = companion.m999getZeroF1C5BW0();
        this.startHandlePosition = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
        this.endHandlePosition = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.structuralEqualityPolicy());
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Selection.AnchorInfo start;
                Selection.AnchorInfo end;
                Selection selection = SelectionManager.this.getSelection();
                if (!((selection == null || (start = selection.getStart()) == null || j != start.getSelectableId()) ? false : true)) {
                    Selection selection2 = SelectionManager.this.getSelection();
                    if (!((selection2 == null || (end = selection2.getEnd()) == null || j != end.getSelectableId()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.updateHandleOffsets();
                SelectionManager.this.updateSelectionToolbarPosition();
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new Function3<LayoutCoordinates, Offset, SelectionAdjustment, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
                m530invoked4ec7I(layoutCoordinates, offset.getPackedValue(), selectionAdjustment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final void m530invoked4ec7I(@NotNull LayoutCoordinates layoutCoordinates, long j, @NotNull SelectionAdjustment selectionAdjustment) {
                Offset offsetM520convertToContainerCoordinatesQ7Q5hAU = SelectionManager.this.m520convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j);
                SelectionManager.this.m525updateSelectionRHHTvR4(offsetM520convertToContainerCoordinatesQ7Q5hAU, offsetM520convertToContainerCoordinatesQ7Q5hAU, selectionAdjustment, true);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Pair<Selection, Map<Long, Selection>> pairMergeSelections$foundation_release = SelectionManager.this.mergeSelections$foundation_release(SelectionManager.this.getSelection(), j);
                Selection selectionComponent1 = pairMergeSelections$foundation_release.component1();
                Map<Long, Selection> mapComponent2 = pairMergeSelections$foundation_release.component2();
                if (!Intrinsics.areEqual(selectionComponent1, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(mapComponent2);
                    SelectionManager.this.getOnSelectionChange().invoke(selectionComponent1);
                }
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new Function4<LayoutCoordinates, Offset, Offset, SelectionAdjustment, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, SelectionAdjustment selectionAdjustment) {
                m531invokeg0qObnA(layoutCoordinates, offset, offset2.getPackedValue(), selectionAdjustment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-g0qObnA, reason: not valid java name */
            public final void m531invokeg0qObnA(@NotNull LayoutCoordinates layoutCoordinates, @Nullable Offset offset, long j, @NotNull SelectionAdjustment selectionAdjustment) {
                SelectionManager.this.m525updateSelectionRHHTvR4(offset == null ? SelectionManager.this.m521currentSelectionStartPosition_m7T9E() : SelectionManager.this.m520convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, offset.getPackedValue()), SelectionManager.this.m520convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j), selectionAdjustment, false);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j))) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Selection.AnchorInfo start;
                Selection.AnchorInfo end;
                Selection selection = SelectionManager.this.getSelection();
                if (!((selection == null || (start = selection.getStart()) == null || j != start.getSelectableId()) ? false : true)) {
                    Selection selection2 = SelectionManager.this.getSelection();
                    if (!((selection2 == null || (end = selection2.getEnd()) == null || j != end.getSelectableId()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.m524setStartHandlePosition_kEHs6E(null);
                SelectionManager.this.m523setEndHandlePosition_kEHs6E(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: convertToContainerCoordinates-Q7Q5hAU, reason: not valid java name */
    public final Offset m520convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m972boximpl(requireContainerCoordinates$foundation_release().mo2481localPositionOfR5De75A(layoutCoordinates, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentSelectionStartPosition-_m7T9-E, reason: not valid java name */
    public final Offset m521currentSelectionStartPosition_m7T9E() {
        Selection selection = this.selection;
        if (selection == null) {
            return null;
        }
        Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
        return Offset.m972boximpl(requireContainerCoordinates$foundation_release().mo2481localPositionOfR5De75A(selectable != null ? selectable.getLayoutCoordinates() : null, SelectionHandlesKt.m514getAdjustedCoordinatesk4lQ0M(selectable.mo504getHandlePositiondBAh8RU(selection, true))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objForEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new C13752(function1, null), continuation);
        return objForEachGesture == a.getCOROUTINE_SUSPENDED() ? objForEachGesture : Unit.INSTANCE;
    }

    private final Rect getContentRect() {
        Selection selection = this.selection;
        if (selection == null) {
            return Rect.INSTANCE.getZero();
        }
        Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
        Selectable selectable2 = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
        LayoutCoordinates layoutCoordinates = selectable == null ? null : selectable.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinates2 = selectable2 != null ? selectable2.getLayoutCoordinates() : null;
        if (layoutCoordinates2 == null) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        if (layoutCoordinates3 == null || !layoutCoordinates3.isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        long jMo2481localPositionOfR5De75A = layoutCoordinates3.mo2481localPositionOfR5De75A(layoutCoordinates, selectable.mo504getHandlePositiondBAh8RU(selection, true));
        long jMo2481localPositionOfR5De75A2 = layoutCoordinates3.mo2481localPositionOfR5De75A(layoutCoordinates2, selectable2.mo504getHandlePositiondBAh8RU(selection, false));
        long jMo2482localToRootMKHz9U = layoutCoordinates3.mo2482localToRootMKHz9U(jMo2481localPositionOfR5De75A);
        long jMo2482localToRootMKHz9U2 = layoutCoordinates3.mo2482localToRootMKHz9U(jMo2481localPositionOfR5De75A2);
        return new Rect(Math.min(Offset.m983getXimpl(jMo2482localToRootMKHz9U), Offset.m983getXimpl(jMo2482localToRootMKHz9U2)), Math.min(Offset.m984getYimpl(layoutCoordinates3.mo2482localToRootMKHz9U(layoutCoordinates3.mo2481localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, selectable.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m984getYimpl(layoutCoordinates3.mo2482localToRootMKHz9U(layoutCoordinates3.mo2481localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, selectable2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m983getXimpl(jMo2482localToRootMKHz9U), Offset.m983getXimpl(jMo2482localToRootMKHz9U2)), Math.max(Offset.m984getYimpl(jMo2482localToRootMKHz9U), Offset.m984getYimpl(jMo2482localToRootMKHz9U2)) + ((float) (((double) SelectionHandlesKt.getHANDLE_HEIGHT()) * 4.0d)));
    }

    public static /* synthetic */ Pair mergeSelections$foundation_release$default(SelectionManager selectionManager, Selection selection, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            selection = null;
        }
        return selectionManager.mergeSelections$foundation_release(selection, j);
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0<Unit> function0) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new C13771(function0, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m523setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m524setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Selection selection = this.selection;
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Selectable selectable = (selection == null || (start = selection.getStart()) == null) ? null : this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(start.getSelectableId()));
        Selectable selectable2 = (selection == null || (end = selection.getEnd()) == null) ? null : this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(end.getSelectableId()));
        LayoutCoordinates layoutCoordinates2 = selectable == null ? null : selectable.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates3 = selectable2 == null ? null : selectable2.getLayoutCoordinates();
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || layoutCoordinates2 == null || layoutCoordinates3 == null) {
            m524setStartHandlePosition_kEHs6E(null);
            m523setEndHandlePosition_kEHs6E(null);
            return;
        }
        long jMo2481localPositionOfR5De75A = layoutCoordinates.mo2481localPositionOfR5De75A(layoutCoordinates2, selectable.mo504getHandlePositiondBAh8RU(selection, true));
        long jMo2481localPositionOfR5De75A2 = layoutCoordinates.mo2481localPositionOfR5De75A(layoutCoordinates3, selectable2.mo504getHandlePositiondBAh8RU(selection, false));
        Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        m524setStartHandlePosition_kEHs6E(SelectionManagerKt.m534containsInclusiveUv8p0NA(rectVisibleBounds, jMo2481localPositionOfR5De75A) ? Offset.m972boximpl(jMo2481localPositionOfR5De75A) : null);
        m523setEndHandlePosition_kEHs6E(SelectionManagerKt.m534containsInclusiveUv8p0NA(rectVisibleBounds, jMo2481localPositionOfR5De75A2) ? Offset.m972boximpl(jMo2481localPositionOfR5De75A2) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateSelection-RHHTvR4, reason: not valid java name */
    public final void m525updateSelectionRHHTvR4(Offset startPosition, Offset endPosition, SelectionAdjustment adjustment, boolean isStartHandle) {
        if (startPosition == null || endPosition == null) {
            return;
        }
        Pair<Selection, Map<Long, Selection>> pairM529mergeSelectionsIUXd7x4$foundation_release = m529mergeSelectionsIUXd7x4$foundation_release(startPosition.getPackedValue(), endPosition.getPackedValue(), adjustment, this.selection, isStartHandle);
        Selection selectionComponent1 = pairM529mergeSelectionsIUXd7x4$foundation_release.component1();
        Map<Long, Selection> mapComponent2 = pairM529mergeSelectionsIUXd7x4$foundation_release.component2();
        if (Intrinsics.areEqual(selectionComponent1, this.selection)) {
            return;
        }
        this.selectionRegistrar.setSubselections(mapComponent2);
        this.onSelectionChange.invoke(selectionComponent1);
    }

    /* JADX INFO: renamed from: updateSelection-RHHTvR4$default, reason: not valid java name */
    public static /* synthetic */ void m526updateSelectionRHHTvR4$default(SelectionManager selectionManager, Offset offset, Offset offset2, SelectionAdjustment selectionAdjustment, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            selectionAdjustment = SelectionAdjustment.NONE;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        selectionManager.m525updateSelectionRHHTvR4(offset, offset2, selectionAdjustment, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if ((textToolbar == null ? null : textToolbar.getStatus()) == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (clipboardManager = getClipboardManager()) == null) {
            return;
        }
        clipboardManager.setText(selectedText$foundation_release);
    }

    @Nullable
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Nullable
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m527getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @NotNull
    public final Modifier getModifier() {
        return KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.INSTANCE, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.onRelease();
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
                this.this$0.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FocusState focusState) {
                if (!focusState.isFocused() && this.this$0.getHasFocus()) {
                    this.this$0.onRelease();
                }
                this.this$0.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m532invokeZmokQxo(keyEvent.m2317unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m532invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                boolean z;
                if (SelectionManager_androidKt.m535isCopyKeyEventZmokQxo(keyEvent)) {
                    this.this$0.copy$foundation_release();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @NotNull
    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    @Nullable
    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString currentSelectedText;
        AnnotatedString annotatedStringPlus;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Selection selection = this.selection;
        AnnotatedString annotatedString = null;
        if (selection == null) {
            return null;
        }
        int i = 0;
        int size = listSort.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 1;
            Selectable selectable = listSort.get(i);
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                if (annotatedString != null && (annotatedStringPlus = annotatedString.plus(currentSelectedText)) != null) {
                    currentSelectedText = annotatedStringPlus;
                }
                if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                    break;
                }
                annotatedString = currentSelectedText;
            }
            if (i2 > size) {
                return annotatedString;
            }
            i = i2;
        }
        return currentSelectedText;
    }

    @Nullable
    public final Selection getSelection() {
        return this.selection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m528getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    @NotNull
    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo455onDragk4lQ0M(long delta) {
                long jMo2481localPositionOfR5De75A;
                long jM988plusMKHz9U;
                Selection selection = SelectionManager.this.getSelection();
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.dragTotalDistance = Offset.m988plusMKHz9U(selectionManager.dragTotalDistance, delta);
                Selectable selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                if (isStartHandle) {
                    jMo2481localPositionOfR5De75A = Offset.m988plusMKHz9U(SelectionManager.this.dragBeginPosition, SelectionManager.this.dragTotalDistance);
                } else {
                    jMo2481localPositionOfR5De75A = SelectionManager.this.requireContainerCoordinates$foundation_release().mo2481localPositionOfR5De75A(selectable == null ? null : selectable.getLayoutCoordinates(), SelectionHandlesKt.m514getAdjustedCoordinatesk4lQ0M(selectable.mo504getHandlePositiondBAh8RU(selection, true)));
                }
                if (isStartHandle) {
                    jM988plusMKHz9U = SelectionManager.this.requireContainerCoordinates$foundation_release().mo2481localPositionOfR5De75A(selectable2 != null ? selectable2.getLayoutCoordinates() : null, SelectionHandlesKt.m514getAdjustedCoordinatesk4lQ0M(selectable2.mo504getHandlePositiondBAh8RU(selection, false)));
                } else {
                    jM988plusMKHz9U = Offset.m988plusMKHz9U(SelectionManager.this.dragBeginPosition, SelectionManager.this.dragTotalDistance);
                }
                SelectionManager.m526updateSelectionRHHTvR4$default(SelectionManager.this, Offset.m972boximpl(jMo2481localPositionOfR5De75A), Offset.m972boximpl(jM988plusMKHz9U), null, isStartHandle, 4, null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo456onStartk4lQ0M(long startPoint) {
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                Selectable selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                LayoutCoordinates layoutCoordinates = null;
                if (isStartHandle) {
                    if (selectable != null) {
                        layoutCoordinates = selectable.getLayoutCoordinates();
                    }
                } else if (selectable2 != null) {
                    layoutCoordinates = selectable2.getLayoutCoordinates();
                }
                long jM514getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m514getAdjustedCoordinatesk4lQ0M(isStartHandle ? selectable.mo504getHandlePositiondBAh8RU(selection, true) : selectable2.mo504getHandlePositiondBAh8RU(selection, false));
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.dragBeginPosition = selectionManager.requireContainerCoordinates$foundation_release().mo2481localPositionOfR5De75A(layoutCoordinates, jM514getAdjustedCoordinatesk4lQ0M);
                SelectionManager.this.dragTotalDistance = Offset.INSTANCE.m999getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if ((textToolbar2 == null ? null : textToolbar2.getStatus()) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
                return;
            }
            textToolbar.hide();
        }
    }

    @NotNull
    public final Pair<Selection, Map<Long, Selection>> mergeSelections$foundation_release(@Nullable Selection previousSelection, long selectableId) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size() - 1;
        Selection selection = null;
        if (size >= 0) {
            int i = 0;
            Selection selectionMerge = null;
            while (true) {
                int i2 = i + 1;
                Selectable selectable = listSort.get(i);
                Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
                if (selectAllSelection != null) {
                    linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectAllSelection);
                }
                selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
            selection = selectionMerge;
        }
        if (!Intrinsics.areEqual(previousSelection, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo1718performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1727getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selection, linkedHashMap);
    }

    @NotNull
    /* JADX INFO: renamed from: mergeSelections-IUXd7x4$foundation_release, reason: not valid java name */
    public final Pair<Selection, Map<Long, Selection>> m529mergeSelectionsIUXd7x4$foundation_release(long startPosition, long endPosition, @NotNull SelectionAdjustment adjustment, @Nullable Selection previousSelection, boolean isStartHandle) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size() - 1;
        Selection selectionMerge = null;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Selectable selectable = listSort.get(i);
                Selection selectionMo505getSelectionXnYAUg = selectable.mo505getSelectionXnYAUg(startPosition, endPosition, requireContainerCoordinates$foundation_release(), adjustment, previousSelection, isStartHandle);
                if (selectionMo505getSelectionXnYAUg != null) {
                    linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectionMo505getSelectionXnYAUg);
                }
                selectionMerge = SelectionManagerKt.merge(selectionMerge, selectionMo505getSelectionXnYAUg);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        if (!Intrinsics.areEqual(previousSelection, selectionMerge) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo1718performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1727getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selectionMerge, linkedHashMap);
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(r.emptyMap());
        hideSelectionToolbar$foundation_release();
        if (this.selection != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback == null) {
                return;
            }
            hapticFeedback.mo1718performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1727getTextHandleMove5zf0vsI());
        }
    }

    @NotNull
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (!(layoutCoordinates != null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void setClipboardManager(@Nullable ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || this.selection == null) {
            return;
        }
        Offset offsetM972boximpl = layoutCoordinates == null ? null : Offset.m972boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates));
        if (Intrinsics.areEqual(this.previousPosition, offsetM972boximpl)) {
            return;
        }
        this.previousPosition = offsetM972boximpl;
        updateHandleOffsets();
        updateSelectionToolbarPosition();
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    public final void setOnSelectionChange(@NotNull Function1<? super Selection, Unit> function1) {
        this.onSelectionChange = function1;
    }

    public final void setSelection(@Nullable Selection selection) {
        this.selection = selection;
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTouchMode(boolean z) {
        this.touchMode = z;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (!getHasFocus() || this.selection == null || (textToolbar = getTextToolbar()) == null) {
            return;
        }
        TextToolbar.DefaultImpls.showMenu$default(textToolbar, getContentRect(), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$showSelectionToolbar$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.copy$foundation_release();
                this.this$0.onRelease();
            }
        }, null, null, null, 28, null);
    }
}
