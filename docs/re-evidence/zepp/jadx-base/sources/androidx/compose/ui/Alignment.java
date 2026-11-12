package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bç\u0080\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\f\rJ-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "Landroidx/compose/ui/unit/IntSize;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "Companion", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface Alignment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R\"\u0010\"\u001a\u00020!8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R\"\u0010'\u001a\u00020!8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010#\u0012\u0004\b)\u0010\b\u001a\u0004\b(\u0010%R\"\u0010*\u001a\u00020!8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010#\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010%R\"\u0010.\u001a\u00020-8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010\b\u001a\u0004\b0\u00101R\"\u00103\u001a\u00020-8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010/\u0012\u0004\b5\u0010\b\u001a\u0004\b4\u00101R\"\u00106\u001a\u00020-8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010/\u0012\u0004\b8\u0010\b\u001a\u0004\b7\u00101¨\u0006:"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "Landroidx/compose/ui/Alignment;", "TopStart", "Landroidx/compose/ui/Alignment;", "getTopStart", "()Landroidx/compose/ui/Alignment;", "getTopStart$annotations", "()V", "TopCenter", "getTopCenter", "getTopCenter$annotations", "TopEnd", "getTopEnd", "getTopEnd$annotations", "CenterStart", "getCenterStart", "getCenterStart$annotations", "Center", "getCenter", "getCenter$annotations", "CenterEnd", "getCenterEnd", "getCenterEnd$annotations", "BottomStart", "getBottomStart", "getBottomStart$annotations", "BottomCenter", "getBottomCenter", "getBottomCenter$annotations", "BottomEnd", "getBottomEnd", "getBottomEnd$annotations", "Landroidx/compose/ui/Alignment$Vertical;", "Top", "Landroidx/compose/ui/Alignment$Vertical;", "getTop", "()Landroidx/compose/ui/Alignment$Vertical;", "getTop$annotations", "CenterVertically", "getCenterVertically", "getCenterVertically$annotations", "Bottom", "getBottom", "getBottom$annotations", "Landroidx/compose/ui/Alignment$Horizontal;", "Start", "Landroidx/compose/ui/Alignment$Horizontal;", "getStart", "()Landroidx/compose/ui/Alignment$Horizontal;", "getStart$annotations", "CenterHorizontally", "getCenterHorizontally", "getCenterHorizontally$annotations", "End", "getEnd", "getEnd$annotations", "<init>", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);

        @NotNull
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);

        @NotNull
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);

        @NotNull
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);

        @NotNull
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);

        @NotNull
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);

        @NotNull
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);

        @NotNull
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);

        @NotNull
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);

        @NotNull
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);

        @NotNull
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);

        @NotNull
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);

        @NotNull
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);

        @NotNull
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);

        @NotNull
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getBottom$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopStart$annotations() {
        }

        @NotNull
        public final Vertical getBottom() {
            return Bottom;
        }

        @NotNull
        public final Alignment getBottomCenter() {
            return BottomCenter;
        }

        @NotNull
        public final Alignment getBottomEnd() {
            return BottomEnd;
        }

        @NotNull
        public final Alignment getBottomStart() {
            return BottomStart;
        }

        @NotNull
        public final Alignment getCenter() {
            return Center;
        }

        @NotNull
        public final Alignment getCenterEnd() {
            return CenterEnd;
        }

        @NotNull
        public final Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        @NotNull
        public final Alignment getCenterStart() {
            return CenterStart;
        }

        @NotNull
        public final Vertical getCenterVertically() {
            return CenterVertically;
        }

        @NotNull
        public final Horizontal getEnd() {
            return End;
        }

        @NotNull
        public final Horizontal getStart() {
            return Start;
        }

        @NotNull
        public final Vertical getTop() {
            return Top;
        }

        @NotNull
        public final Alignment getTopCenter() {
            return TopCenter;
        }

        @NotNull
        public final Alignment getTopEnd() {
            return TopEnd;
        }

        @NotNull
        public final Alignment getTopStart() {
            return TopStart;
        }
    }

    @Stable
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "align", "ui_release"}, k = 1, mv = {1, 5, 1})
    public interface Horizontal {
        int align(int size, int space, @NotNull LayoutDirection layoutDirection);
    }

    @Stable
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "", "size", "space", "align", "ui_release"}, k = 1, mv = {1, 5, 1})
    public interface Vertical {
        int align(int size, int space);
    }

    /* JADX INFO: renamed from: align-KFBX0sM, reason: not valid java name */
    long mo915alignKFBX0sM(long size, long space, @NotNull LayoutDirection layoutDirection);
}
