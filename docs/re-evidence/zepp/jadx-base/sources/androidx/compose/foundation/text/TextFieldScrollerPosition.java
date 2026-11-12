package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B\u0019\u0012\u0006\u0010-\u001a\u00020\t\u0012\b\b\u0002\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100B\t\b\u0016¢\u0006\u0004\b/\u00101J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u001b\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R+\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "", "cursorStart", "cursorEnd", "", "containerSize", "", "coerceOffset", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "textFieldSize", "update", "Landroidx/compose/ui/text/TextRange;", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", "offset$delegate", "Landroidx/compose/runtime/MutableState;", "getOffset", "()F", "setOffset", "(F)V", "offset", "maximum$delegate", "getMaximum", "setMaximum", "maximum", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "J", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "orientation$delegate", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "initialOrientation", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class TextFieldScrollerPosition {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new Function2<SaverScope, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final List<Object> invoke(@NotNull SaverScope saverScope, @NotNull TextFieldScrollerPosition textFieldScrollerPosition) {
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(textFieldScrollerPosition.getOffset());
            objArr[1] = Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical);
            return CollectionsKt__CollectionsKt.listOf((Object[]) objArr);
        }
    }, new Function1<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextFieldScrollerPosition invoke(@NotNull List<? extends Object> list) {
            return new TextFieldScrollerPosition(((Boolean) list.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal, ((Float) list.get(0)).floatValue());
        }
    });

    /* JADX INFO: renamed from: maximum$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState maximum;

    /* JADX INFO: renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState offset;

    /* JADX INFO: renamed from: orientation$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState orientation;

    @NotNull
    private Rect previousCursorRect;
    private long previousSelection;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }

    public TextFieldScrollerPosition(@NotNull Orientation orientation, float f) {
        this.offset = SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
        this.maximum = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.previousCursorRect = Rect.INSTANCE.getZero();
        this.previousSelection = TextRange.INSTANCE.m2729getZerod9O1mEE();
        this.orientation = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void coerceOffset(float cursorStart, float cursorEnd, int containerSize) {
        float offset = getOffset();
        float f = containerSize + offset;
        if (cursorStart < offset) {
            setOffset(getOffset() - (offset - cursorStart));
        } else if (cursorEnd > f) {
            setOffset(getOffset() + (cursorEnd - f));
        }
    }

    private final void setMaximum(float f) {
        this.maximum.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getMaximum() {
        return ((Number) this.maximum.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getOffset() {
        return ((Number) this.offset.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m477getOffsetToFollow5zctL8(long selection) {
        if (TextRange.m2724getStartimpl(selection) != TextRange.m2724getStartimpl(getPreviousSelection())) {
            return TextRange.m2724getStartimpl(selection);
        }
        return TextRange.m2719getEndimpl(selection) != TextRange.m2719getEndimpl(getPreviousSelection()) ? TextRange.m2719getEndimpl(selection) : TextRange.m2722getMinimpl(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Orientation getOrientation() {
        return (Orientation) this.orientation.getValue();
    }

    /* JADX INFO: renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPreviousSelection() {
        return this.previousSelection;
    }

    public final void setOffset(float f) {
        this.offset.setValue(Float.valueOf(f));
    }

    public final void setOrientation(@NotNull Orientation orientation) {
        this.orientation.setValue(orientation);
    }

    /* JADX INFO: renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m479setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final void update(@NotNull Orientation orientation, @NotNull Rect cursorRect, int containerSize, int textFieldSize) {
        boolean z;
        float left;
        float right;
        float f = textFieldSize - containerSize;
        setMaximum(f);
        if (cursorRect.getLeft() == this.previousCursorRect.getLeft()) {
            if (!(cursorRect.getTop() == this.previousCursorRect.getTop())) {
                if (orientation == Orientation.Vertical) {
                }
                if (z) {
                    left = cursorRect.getTop();
                } else {
                    left = cursorRect.getLeft();
                }
                if (z) {
                    right = cursorRect.getBottom();
                } else {
                    right = cursorRect.getRight();
                }
                coerceOffset(left, right, containerSize);
                this.previousCursorRect = cursorRect;
            }
        } else {
            z = orientation == Orientation.Vertical;
            if (z) {
                left = cursorRect.getTop();
            } else {
                left = cursorRect.getLeft();
            }
            if (z) {
                right = cursorRect.getBottom();
            } else {
                right = cursorRect.getRight();
            }
            coerceOffset(left, right, containerSize);
            this.previousCursorRect = cursorRect;
        }
        setOffset(e.coerceIn(getOffset(), 0.0f, f));
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
