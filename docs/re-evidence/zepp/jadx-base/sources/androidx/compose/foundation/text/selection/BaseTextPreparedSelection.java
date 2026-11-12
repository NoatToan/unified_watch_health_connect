package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import com.liulishuo.filedownloader.model.ConnectionModel;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B4\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010P\u001a\u00020Oø\u0001\u0001¢\u0006\u0004\b`\u0010aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u0006*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\t\u001a\u00020\u0006*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\n\u001a\u00020\u0006*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u000b\u001a\u00020\u0006*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0014\u0010\r\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J@\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0001\u0010\u0015*\u00028\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0084\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0006H\u0004J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0004J\r\u0010!\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010\"J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\"J&\u0010'\u001a\u00028\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b'\u0010(J&\u0010)\u001a\u00028\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00028\u0000¢\u0006\u0004\b*\u0010\"J\r\u0010+\u001a\u00028\u0000¢\u0006\u0004\b+\u0010\"J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010\"J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\"J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\"J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\"J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\"J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\"J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\"J\r\u00103\u001a\u00028\u0000¢\u0006\u0004\b3\u0010\"J\r\u00104\u001a\u00028\u0000¢\u0006\u0004\b4\u0010\"J\r\u00105\u001a\u00028\u0000¢\u0006\u0004\b5\u0010\"J\r\u00106\u001a\u00028\u0000¢\u0006\u0004\b6\u0010\"J\r\u00107\u001a\u00028\u0000¢\u0006\u0004\b7\u0010\"J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010\"J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\"J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\"J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\"R\u0019\u0010=\u001a\u00020<8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010F\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010K\u001a\u00020J8\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010P\u001a\u00020O8\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR+\u0010T\u001a\u00020A8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\u0012\n\u0004\bT\u0010C\u001a\u0004\bU\u0010E\"\u0004\bV\u0010WR\"\u0010X\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010>\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\\8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0016\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isLtr", "Landroidx/compose/ui/text/TextLayoutResult;", "", ConnectionModel.CURRENT_OFFSET, "getNextWordOffset", "getPrevWordOffset", "getLineStartByOffset", "getLineEndByOffset", "linesAmount", "jumpByLinesOffset", "transformedEndOffset", "transformedMinOffset", "transformedMaxOffset", "offset", "charOffset", "getParagraphStart", "getParagraphEnd", "U", "resetCachedX", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "apply", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "setCursor", "start", "end", "setSelection", "selectAll", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "deselect", "moveCursorLeft", "moveCursorRight", SearchCriteria.OR, "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "moveCursorPrev", "moveCursorNext", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "moveCursorNextByWord", "moveCursorPrevByWord", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "moveCursorToLineStart", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "deleteSelected", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "J", "getOriginalSelection-d9O1mEE", "()J", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "annotatedString", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "getText$foundation_release", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {

    @NotNull
    private AnnotatedString annotatedString;

    @Nullable
    private final TextLayoutResult layoutResult;

    @NotNull
    private final OffsetMapping offsetMapping;
    private final long originalSelection;

    @NotNull
    private final AnnotatedString originalText;
    private long selection;

    @NotNull
    private final TextPreparedSelectionState state;

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = getOriginalSelection();
        this.annotatedString = annotatedString;
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z, Function1 function1, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
            function1.invoke(obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) obj;
    }

    private final int charOffset(int offset) {
        return e.coerceAtMost(offset, getText$foundation_release().length() - 1);
    }

    private final int getLineEndByOffset(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true));
    }

    public static /* synthetic */ int getLineEndByOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffset");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMaxOffset();
        }
        return baseTextPreparedSelection.getLineEndByOffset(textLayoutResult, i);
    }

    private final int getLineStartByOffset(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i)));
    }

    public static /* synthetic */ int getLineStartByOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffset");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMinOffset();
        }
        return baseTextPreparedSelection.getLineStartByOffset(textLayoutResult, i);
    }

    private final int getNextWordOffset(TextLayoutResult textLayoutResult, int i) {
        if (i >= this.originalText.length()) {
            return this.originalText.length();
        }
        long jM2709getWordBoundaryjx7JFs = textLayoutResult.m2709getWordBoundaryjx7JFs(charOffset(i));
        return TextRange.m2719getEndimpl(jM2709getWordBoundaryjx7JFs) <= i ? getNextWordOffset(textLayoutResult, i + 1) : this.offsetMapping.transformedToOriginal(TextRange.m2719getEndimpl(jM2709getWordBoundaryjx7JFs));
    }

    public static /* synthetic */ int getNextWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffset");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getNextWordOffset(textLayoutResult, i);
    }

    private final int getParagraphEnd() {
        return StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m2721getMaximpl(getSelection()));
    }

    private final int getParagraphStart() {
        return StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m2722getMinimpl(getSelection()));
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i) {
        if (i < 0) {
            return 0;
        }
        long jM2709getWordBoundaryjx7JFs = textLayoutResult.m2709getWordBoundaryjx7JFs(charOffset(i));
        return TextRange.m2724getStartimpl(jM2709getWordBoundaryjx7JFs) >= i ? getPrevWordOffset(textLayoutResult, i - 1) : this.offsetMapping.transformedToOriginal(TextRange.m2724getStartimpl(jM2709getWordBoundaryjx7JFs));
    }

    public static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i2 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i);
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult == null ? null : textLayoutResult.getParagraphDirection(TextRange.m2719getEndimpl(getSelection()))) != ResolvedTextDirection.Rtl;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int iTransformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(iTransformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iTransformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        float fFloatValue = cachedX.floatValue();
        if ((isLtr() && fFloatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && fFloatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return getOffsetMapping().transformedToOriginal(textLayoutResult.m2707getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m2719getEndimpl(getSelection()));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m2721getMaximpl(getSelection()));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m2722getMinimpl(getSelection()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <U> T apply(U u, boolean z, @NotNull Function1<? super U, Unit> function1) {
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            function1.invoke(u);
        }
        Objects.requireNonNull(u, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u;
    }

    @NotNull
    public final T collapseLeftOr(@NotNull Function1<? super T, Unit> or) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m2718getCollapsedimpl(getSelection())) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m2722getMinimpl(getSelection()));
            } else {
                setCursor(TextRange.m2721getMaximpl(getSelection()));
            }
        }
        return this;
    }

    @NotNull
    public final T collapseRightOr(@NotNull Function1<? super T, Unit> or) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m2718getCollapsedimpl(getSelection())) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m2721getMaximpl(getSelection()));
            } else {
                setCursor(TextRange.m2722getMinimpl(getSelection()));
            }
        }
        return this;
    }

    @NotNull
    public final T deleteSelected() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int length = getText$foundation_release().length();
            setAnnotatedString(getAnnotatedString().subSequence(Math.max(0, TextRange.m2722getMinimpl(getSelection()) - length), TextRange.m2722getMinimpl(getSelection())).plus(getAnnotatedString().subSequence(TextRange.m2721getMaximpl(getSelection()), Math.min(TextRange.m2721getMaximpl(getSelection()) + length, getText$foundation_release().length()))));
            setCursor(TextRange.m2722getMinimpl(getSelection()));
        }
        return this;
    }

    @NotNull
    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m2719getEndimpl(getSelection()));
        }
        return this;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getOriginalSelection() {
        return this.originalSelection;
    }

    @NotNull
    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    @NotNull
    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    @NotNull
    public final T moveCursorDownByLine() {
        TextLayoutResult layoutResult;
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(jumpByLinesOffset(layoutResult, 1));
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorNext() {
        int iFindFollowingBreak;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (iFindFollowingBreak = StringHelpers_androidKt.findFollowingBreak(getAnnotatedString().getText(), TextRange.m2719getEndimpl(getSelection()))) != -1) {
            setCursor(iFindFollowingBreak);
        }
        return this;
    }

    @NotNull
    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphEnd());
        }
        return this;
    }

    @NotNull
    public final T moveCursorNextByWord() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getNextWordOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrev() {
        int iFindPrecedingBreak;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (iFindPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(getAnnotatedString().getText(), TextRange.m2719getEndimpl(getSelection()))) != -1) {
            setCursor(iFindPrecedingBreak);
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphStart());
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrevByWord() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getPrevWordOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineEnd() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getLineEndByOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineStart() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getLineStartByOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorUpByLine() {
        TextLayoutResult layoutResult;
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(jumpByLinesOffset(layoutResult, -1));
        }
        return this;
    }

    @NotNull
    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            m503setSelection5zctL8(TextRangeKt.TextRange(TextRange.m2724getStartimpl(getOriginalSelection()), TextRange.m2719getEndimpl(getSelection())));
        }
        return this;
    }

    public final void setAnnotatedString(@NotNull AnnotatedString annotatedString) {
        this.annotatedString = annotatedString;
    }

    public final void setCursor(int offset) {
        setSelection(offset, offset);
    }

    public final void setSelection(int start, int end) {
        m503setSelection5zctL8(TextRangeKt.TextRange(start, end));
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m503setSelection5zctL8(long j) {
        this.selection = j;
    }
}
