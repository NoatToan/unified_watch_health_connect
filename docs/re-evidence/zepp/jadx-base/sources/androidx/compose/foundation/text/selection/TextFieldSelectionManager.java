package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002J%\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ!\u0010%\u001a\u00020\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0019\u0010)\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010+\u001a\u00020\rH\u0000¢\u0006\u0004\b*\u0010\u001dJ\u000f\u0010-\u001a\u00020\rH\u0000¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010/\u001a\u00020\rH\u0000¢\u0006\u0004\b.\u0010\u001dJ \u00102\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u000f\u00104\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00106\u001a\u00020\rH\u0000¢\u0006\u0004\b5\u0010\u001dJ\u000f\u00109\u001a\u00020\tH\u0000¢\u0006\u0004\b7\u00108R\u001b\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010h\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010o\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010v\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R-\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010|\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\b}\u0010~\u001a\u0004\b\u007f\u00108\"\u0005\b\u0080\u0001\u0010(R\"\u0010\u0082\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\"\u0010\u0086\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010TR!\u0010\u0088\u0001\u001a\u00020\u00188\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\"\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "transformedStartOffset", "transformedEndOffset", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "updateSelection", "on", "setSelectionStatus", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "createTextFieldValue", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "enterSelectionMode$foundation_release", "()V", "enterSelectionMode", "exitSelectionMode$foundation_release", "exitSelectionMode", "Landroidx/compose/ui/geometry/Offset;", "position", "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "cancelSelection", "copy$foundation_release", "(Z)V", "copy", "paste$foundation_release", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "isTextChanged$foundation_release", "()Z", "isTextChanged", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Lkotlin/Function1;", "onValueChange", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "editable$delegate", "Landroidx/compose/runtime/MutableState;", "getEditable", "setEditable", "editable", "dragBeginPosition", "J", "dragBeginOffsetInText", "Ljava/lang/Integer;", "dragTotalDistance", "oldValue", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class TextFieldSelectionManager {

    @Nullable
    private ClipboardManager clipboardManager;

    @Nullable
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* JADX INFO: renamed from: editable$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState editable;

    @Nullable
    private FocusRequester focusRequester;

    @Nullable
    private HapticFeedback hapticFeedBack;

    @NotNull
    private final MouseSelectionObserver mouseSelectionObserver;

    @NotNull
    private OffsetMapping offsetMapping;

    @NotNull
    private TextFieldValue oldValue;

    @NotNull
    private Function1<? super TextFieldValue, Unit> onValueChange;

    @Nullable
    private TextFieldState state;

    @Nullable
    private TextToolbar textToolbar;

    @NotNull
    private final TextDragObserver touchSelectionObserver;

    @Nullable
    private final UndoManager undoManager;

    @NotNull
    private TextFieldValue value;

    @NotNull
    private VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TextFieldSelectionManager(@Nullable UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = OffsetMapping.INSTANCE.getIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
            }
        };
        this.value = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        this.editable = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m999getZeroF1C5BW0();
        this.dragTotalDistance = companion.m999getZeroF1C5BW0();
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo455onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                if (this.this$0.getValue().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m988plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    Integer num = textFieldSelectionManager2.dragBeginOffsetInText;
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue(), num == null ? layoutResult.m488getOffsetForPosition3MmeM6k(textFieldSelectionManager2.dragBeginPosition, false) : num.intValue(), layoutResult.m488getOffsetForPosition3MmeM6k(Offset.m988plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance), false), false, SelectionAdjustment.WORD);
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo456onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                TextFieldState state;
                TextLayoutResultProxy layoutResult3;
                TextFieldState state2 = this.this$0.getState();
                if (state2 != null && state2.getDraggingHandle()) {
                    return;
                }
                TextFieldState state3 = this.this$0.getState();
                if (!((state3 == null || (layoutResult = state3.getLayoutResult()) == null || !layoutResult.m489isPositionOnTextk4lQ0M(startPoint)) ? false : true) && (state = this.this$0.getState()) != null && (layoutResult3 = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                    int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult3, layoutResult3.getLineForVerticalPosition(Offset.m984getYimpl(startPoint)), false, 2, null));
                    HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo1718performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1727getTextHandleMove5zf0vsI());
                    }
                    TextFieldValue textFieldValueM543createTextFieldValueFDrldGo = textFieldSelectionManager.m543createTextFieldValueFDrldGo(textFieldSelectionManager.getValue().getText(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                    textFieldSelectionManager.enterSelectionMode$foundation_release();
                    textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM543createTextFieldValueFDrldGo);
                    return;
                }
                if (this.this$0.getValue().getText().length() == 0) {
                    return;
                }
                this.this$0.enterSelectionMode$foundation_release();
                TextFieldState state4 = this.this$0.getState();
                if (state4 != null && (layoutResult2 = state4.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    int iM486getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m486getOffsetForPosition3MmeM6k$default(layoutResult2, startPoint, false, 2, null);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue(), iM486getOffsetForPosition3MmeM6k$default, iM486getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.WORD);
                    textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(iM486getOffsetForPosition3MmeM6k$default);
                }
                this.this$0.dragBeginPosition = startPoint;
                this.this$0.dragTotalDistance = Offset.INSTANCE.m999getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = this.this$0.getTextToolbar();
                if ((textToolbar == null ? null : textToolbar.getStatus()) == TextToolbarStatus.Hidden) {
                    this.this$0.showSelectionToolbar$foundation_release();
                }
                this.this$0.dragBeginOffsetInText = null;
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onDrag-3MmeM6k */
            public boolean mo457onDrag3MmeM6k(long dragPosition, @NotNull SelectionAdjustment adjustment) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                if ((this.this$0.getValue().getText().length() == 0) || (state = this.this$0.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue(), textFieldSelectionManager.dragBeginOffsetInText.intValue(), layoutResult.m488getOffsetForPosition3MmeM6k(dragPosition, false), false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtend-k-4lQ0M */
            public boolean mo458onExtendk4lQ0M(long downPosition) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m2724getStartimpl(textFieldSelectionManager.getValue().getSelection())), TextLayoutResultProxy.m486getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null), false, SelectionAdjustment.NONE);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo459onExtendDragk4lQ0M(long dragPosition) {
                TextFieldState state;
                TextLayoutResultProxy layoutResult;
                if ((this.this$0.getValue().getText().length() == 0) || (state = this.this$0.getState()) == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue(), textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m2724getStartimpl(textFieldSelectionManager.getValue().getSelection())), layoutResult.m488getOffsetForPosition3MmeM6k(dragPosition, false), false, SelectionAdjustment.NONE);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onStart-3MmeM6k */
            public boolean mo460onStart3MmeM6k(long downPosition, @NotNull SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                this.this$0.dragBeginPosition = downPosition;
                TextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m486getOffsetForPosition3MmeM6k$default(layoutResult, downPosition, false, 2, null));
                int iM486getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m486getOffsetForPosition3MmeM6k$default(layoutResult, textFieldSelectionManager.dragBeginPosition, false, 2, null);
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue(), iM486getOffsetForPosition3MmeM6k$default, iM486getOffsetForPosition3MmeM6k$default, false, adjustment);
                return true;
            }
        };
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m543createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m544deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m545deselect_kEHs6E$foundation_release(offset);
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value;
        Rect cursorRect;
        float fM984getYimpl;
        LayoutCoordinates layoutCoordinates3;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return Rect.INSTANCE.getZero();
        }
        TextFieldState state = getState();
        Offset offsetM972boximpl = null;
        Offset offsetM972boximpl2 = (state == null || (layoutCoordinates = state.getLayoutCoordinates()) == null) ? null : Offset.m972boximpl(layoutCoordinates.mo2482localToRootMKHz9U(m546getHandlePositiontuRUvjQ$foundation_release(true)));
        long jM999getZeroF1C5BW0 = offsetM972boximpl2 == null ? Offset.INSTANCE.m999getZeroF1C5BW0() : offsetM972boximpl2.getPackedValue();
        TextFieldState state2 = getState();
        if (state2 != null && (layoutCoordinates4 = state2.getLayoutCoordinates()) != null) {
            offsetM972boximpl = Offset.m972boximpl(layoutCoordinates4.mo2482localToRootMKHz9U(m546getHandlePositiontuRUvjQ$foundation_release(false)));
        }
        long jM999getZeroF1C5BW1 = offsetM972boximpl == null ? Offset.INSTANCE.m999getZeroF1C5BW0() : offsetM972boximpl.getPackedValue();
        TextFieldState state3 = getState();
        float fM984getYimpl2 = 0.0f;
        if (state3 == null || (layoutCoordinates2 = state3.getLayoutCoordinates()) == null) {
            fM984getYimpl = 0.0f;
        } else {
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            fM984getYimpl = Offset.m984getYimpl(layoutCoordinates2.mo2482localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value = layoutResult.getValue()) == null || (cursorRect = value.getCursorRect(e.coerceIn(TextRange.m2724getStartimpl(getValue().getSelection()), 0, Math.max(0, getValue().getText().length() - 1)))) == null) ? 0.0f : cursorRect.getTop())));
        }
        TextFieldState state4 = getState();
        if (state4 != null && (layoutCoordinates3 = state4.getLayoutCoordinates()) != null) {
            TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
            fM984getYimpl2 = Offset.m984getYimpl(layoutCoordinates3.mo2482localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value2 = layoutResult2.getValue()) == null || (cursorRect2 = value2.getCursorRect(e.coerceIn(TextRange.m2719getEndimpl(getValue().getSelection()), 0, Math.max(0, getValue().getText().length() - 1)))) == null) ? 0.0f : cursorRect2.getTop())));
        }
        return new Rect(Math.min(Offset.m983getXimpl(jM999getZeroF1C5BW0), Offset.m983getXimpl(jM999getZeroF1C5BW1)), Math.min(fM984getYimpl, fM984getYimpl2), Math.max(Offset.m983getXimpl(jM999getZeroF1C5BW0), Offset.m983getXimpl(jM999getZeroF1C5BW1)), Math.max(Offset.m984getYimpl(jM999getZeroF1C5BW0), Offset.m984getYimpl(jM999getZeroF1C5BW1)) + (Dp.m2965constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
    }

    private final void setSelectionStatus(boolean on) {
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.setSelectionIsOn(on);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(TextFieldValue value, int transformedStartOffset, int transformedEndOffset, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResultProxy layoutResult;
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m2724getStartimpl(value.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m2719getEndimpl(value.getSelection())));
        TextFieldState textFieldState = this.state;
        long jM541getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m541getTextFieldSelectionbb3KNj8((textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) ? null : layoutResult.getValue(), transformedStartOffset, transformedEndOffset, TextRange.m2718getCollapsedimpl(jTextRange) ? null : TextRange.m2712boximpl(jTextRange), isStartHandle, adjustment);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m2724getStartimpl(jM541getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m2719getEndimpl(jM541getTextFieldSelectionbb3KNj8)));
        if (TextRange.m2717equalsimpl0(jTextRange2, value.getSelection())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo1718performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m1727getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m543createTextFieldValueFDrldGo(value.getText(), jTextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
    }

    public final void copy$foundation_release(boolean cancelSelection) {
        if (TextRange.m2718getCollapsedimpl(this.value.getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(this.value));
        }
        if (cancelSelection) {
            int iM2721getMaximpl = TextRange.m2721getMaximpl(this.value.getSelection());
            this.onValueChange.invoke(m543createTextFieldValueFDrldGo(this.value.getText(), TextRangeKt.TextRange(iM2721getMaximpl, iM2721getMaximpl)));
            setSelectionStatus(false);
        }
    }

    public final void cut$foundation_release() {
        if (TextRange.m2718getCollapsedimpl(this.value.getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(this.value));
        }
        TextFieldValue textFieldValue = this.value;
        AnnotatedString textBeforeSelection = TextFieldValueKt.getTextBeforeSelection(textFieldValue, textFieldValue.getText().length());
        TextFieldValue textFieldValue2 = this.value;
        AnnotatedString annotatedStringPlus = textBeforeSelection.plus(TextFieldValueKt.getTextAfterSelection(textFieldValue2, textFieldValue2.getText().length()));
        int iM2722getMinimpl = TextRange.m2722getMinimpl(this.value.getSelection());
        this.onValueChange.invoke(m543createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM2722getMinimpl, iM2722getMinimpl)));
        setSelectionStatus(false);
        UndoManager undoManager = this.undoManager;
        if (undoManager == null) {
            return;
        }
        undoManager.forceNextSnapshot();
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m545deselect_kEHs6E$foundation_release(@Nullable Offset position) {
        if (!TextRange.m2718getCollapsedimpl(this.value.getSelection())) {
            TextFieldState textFieldState = this.state;
            TextLayoutResultProxy layoutResult = textFieldState == null ? null : textFieldState.getLayoutResult();
            this.onValueChange.invoke(TextFieldValue.m2830copy3r_uNRQ$default(this.value, (AnnotatedString) null, TextRangeKt.TextRange((position == null || layoutResult == null) ? TextRange.m2721getMaximpl(this.value.getSelection()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m486getOffsetForPosition3MmeM6k$default(layoutResult, position.getPackedValue(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        setSelectionStatus(false);
        hideSelectionToolbar$foundation_release();
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        boolean z = false;
        if (textFieldState != null && !textFieldState.getHasFocus()) {
            z = true;
        }
        if (z && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = this.value;
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setSelectionStatus(true);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setSelectionStatus(false);
    }

    @Nullable
    /* JADX INFO: renamed from: getClipboardManager$foundation_release, reason: from getter */
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    @Nullable
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m546getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        long selection = this.value.getSelection();
        int iM2724getStartimpl = isStartHandle ? TextRange.m2724getStartimpl(selection) : TextRange.m2719getEndimpl(selection);
        TextFieldState textFieldState = this.state;
        return TextSelectionDelegateKt.getSelectionHandleCoordinates((textFieldState == null ? null : textFieldState.getLayoutResult()).getValue(), this.offsetMapping.originalToTransformed(iM2724getStartimpl), isStartHandle, TextRange.m2723getReversedimpl(this.value.getSelection()));
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @NotNull
    /* JADX INFO: renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    @NotNull
    /* JADX INFO: renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    @Nullable
    /* JADX INFO: renamed from: getState$foundation_release, reason: from getter */
    public final TextFieldState getState() {
        return this.state;
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @NotNull
    /* JADX INFO: renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    @NotNull
    /* JADX INFO: renamed from: getValue$foundation_release, reason: from getter */
    public final TextFieldValue getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    @NotNull
    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo455onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m988plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldState state = this.this$0.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    boolean z = isStartHandle;
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue(), z ? value.m2707getOffsetForPositionk4lQ0M(Offset.m988plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)) : textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m2724getStartimpl(textFieldSelectionManager2.getValue().getSelection())), z ? textFieldSelectionManager2.getOffsetMapping().originalToTransformed(TextRange.m2719getEndimpl(textFieldSelectionManager2.getValue().getSelection())) : value.m2707getOffsetForPositionk4lQ0M(Offset.m988plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)), z, SelectionAdjustment.CHARACTER);
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo456onStartk4lQ0M(long startPoint) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m514getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m546getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m999getZeroF1C5BW0();
                TextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setDraggingHandle(true);
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 == null) {
                    return;
                }
                state2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setDraggingHandle(false);
                }
                TextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = this.this$0.getTextToolbar();
                if ((textToolbar == null ? null : textToolbar.getStatus()) == TextToolbarStatus.Hidden) {
                    this.this$0.showSelectionToolbar$foundation_release();
                }
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 == null ? null : textToolbar2.getStatus()) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), this.value.getText());
    }

    public final void paste$foundation_release() {
        ClipboardManager clipboardManager = this.clipboardManager;
        AnnotatedString text = clipboardManager == null ? null : clipboardManager.getText();
        if (text == null) {
            return;
        }
        TextFieldValue textFieldValue = this.value;
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(textFieldValue, textFieldValue.getText().length()).plus(text);
        TextFieldValue textFieldValue2 = this.value;
        AnnotatedString annotatedStringPlus2 = annotatedStringPlus.plus(TextFieldValueKt.getTextAfterSelection(textFieldValue2, textFieldValue2.getText().length()));
        int iM2722getMinimpl = TextRange.m2722getMinimpl(this.value.getSelection()) + text.length();
        this.onValueChange.invoke(m543createTextFieldValueFDrldGo(annotatedStringPlus2, TextRangeKt.TextRange(iM2722getMinimpl, iM2722getMinimpl)));
        setSelectionStatus(false);
        UndoManager undoManager = this.undoManager;
        if (undoManager == null) {
            return;
        }
        undoManager.forceNextSnapshot();
    }

    public final void selectAll$foundation_release() {
        setSelectionStatus(true);
        TextFieldValue textFieldValueM543createTextFieldValueFDrldGo = m543createTextFieldValueFDrldGo(this.value.getText(), TextRangeKt.TextRange(0, this.value.getText().length()));
        this.onValueChange.invoke(textFieldValueM543createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m2830copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM543createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        hideSelectionToolbar$foundation_release();
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(true);
        }
        showSelectionToolbar$foundation_release();
    }

    public final void setClipboardManager$foundation_release(@Nullable ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setEditable(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(@Nullable FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(@NotNull OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(@NotNull Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    public final void setState$foundation_release(@Nullable TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(@NotNull TextFieldValue textFieldValue) {
        this.value = textFieldValue;
    }

    public final void setVisualTransformation$foundation_release(@NotNull VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    public final void showSelectionToolbar$foundation_release() {
        Function0<Unit> function0;
        boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
        Function0<Unit> function1 = null;
        Function0<Unit> function2 = (TextRange.m2718getCollapsedimpl(this.value.getSelection()) || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldSelectionManager.copy$foundation_release$default(this.this$0, false, 1, null);
                this.this$0.hideSelectionToolbar$foundation_release();
            }
        };
        Function0<Unit> function3 = (TextRange.m2718getCollapsedimpl(this.value.getSelection()) || !getEditable() || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.cut$foundation_release();
                this.this$0.hideSelectionToolbar$foundation_release();
            }
        };
        if (getEditable()) {
            ClipboardManager clipboardManager = this.clipboardManager;
            if ((clipboardManager == null ? null : clipboardManager.getText()) != null) {
                function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.paste$foundation_release();
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }
                };
            } else {
                function0 = null;
            }
        } else {
            function0 = null;
        }
        if (TextRange.m2720getLengthimpl(this.value.getSelection()) != this.value.getText().length() && TextRange.m2720getLengthimpl(this.oldValue.getSelection()) != this.oldValue.getText().length()) {
            function1 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.selectAll$foundation_release();
                }
            };
        }
        Function0<Unit> function4 = function1;
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar == null) {
            return;
        }
        textToolbar.showMenu(getContentRect(), function2, function0, function3, function4);
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager);
    }
}
