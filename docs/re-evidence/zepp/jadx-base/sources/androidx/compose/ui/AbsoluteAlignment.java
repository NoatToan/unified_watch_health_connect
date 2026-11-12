package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u001c¨\u0006\""}, d2 = {"Landroidx/compose/ui/AbsoluteAlignment;", "", "Landroidx/compose/ui/Alignment;", "TopLeft", "Landroidx/compose/ui/Alignment;", "getTopLeft", "()Landroidx/compose/ui/Alignment;", "getTopLeft$annotations", "()V", "TopRight", "getTopRight", "getTopRight$annotations", "CenterLeft", "getCenterLeft", "getCenterLeft$annotations", "CenterRight", "getCenterRight", "getCenterRight$annotations", "BottomLeft", "getBottomLeft", "getBottomLeft$annotations", "BottomRight", "getBottomRight", "getBottomRight$annotations", "Landroidx/compose/ui/Alignment$Horizontal;", "Left", "Landroidx/compose/ui/Alignment$Horizontal;", "getLeft", "()Landroidx/compose/ui/Alignment$Horizontal;", "getLeft$annotations", "Right", "getRight", "getRight$annotations", "<init>", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class AbsoluteAlignment {
    public static final int $stable = 0;

    @NotNull
    public static final AbsoluteAlignment INSTANCE = new AbsoluteAlignment();

    @NotNull
    private static final Alignment TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    @NotNull
    private static final Alignment TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    @NotNull
    private static final Alignment CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    @NotNull
    private static final Alignment CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);

    @NotNull
    private static final Alignment BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    @NotNull
    private static final Alignment BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    @NotNull
    private static final Alignment.Horizontal Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    @NotNull
    private static final Alignment.Horizontal Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    private AbsoluteAlignment() {
    }

    @Stable
    public static /* synthetic */ void getBottomLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBottomRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopRight$annotations() {
    }

    @NotNull
    public final Alignment getBottomLeft() {
        return BottomLeft;
    }

    @NotNull
    public final Alignment getBottomRight() {
        return BottomRight;
    }

    @NotNull
    public final Alignment getCenterLeft() {
        return CenterLeft;
    }

    @NotNull
    public final Alignment getCenterRight() {
        return CenterRight;
    }

    @NotNull
    public final Alignment.Horizontal getLeft() {
        return Left;
    }

    @NotNull
    public final Alignment.Horizontal getRight() {
        return Right;
    }

    @NotNull
    public final Alignment getTopLeft() {
        return TopLeft;
    }

    @NotNull
    public final Alignment getTopRight() {
        return TopRight;
    }
}
