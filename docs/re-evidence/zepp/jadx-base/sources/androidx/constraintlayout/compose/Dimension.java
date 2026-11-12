package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import com.xiaomi.hm.health.Constant;
import com.xmlywind.sdk.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/constraintlayout/compose/Dimension;", "", "Companion", "Coercible", "MaxCoercible", "MinCoercible", "compose_release"}, k = 1, mv = {1, 5, 1})
public interface Dimension {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1})
    public interface Coercible extends Dimension {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eR\u0013\u0010\u0013\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u001a\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Companion;", "", "Landroidx/compose/ui/unit/Dp;", Constant.PAI_KEY_DAILY_PAI, "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "preferredValue-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "preferredValue", "Landroidx/constraintlayout/compose/Dimension;", "value-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension;", "value", "", Constants.RATIO, "", "percent", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getPreferredWrapContent", "()Landroidx/constraintlayout/compose/Dimension$Coercible;", "preferredWrapContent", "getWrapContent", "()Landroidx/constraintlayout/compose/Dimension;", "wrapContent", "getMatchParent", "matchParent", "getFillToConstraints", "fillToConstraints", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final Coercible getFillToConstraints() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$fillToConstraints$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                }
            });
        }

        @NotNull
        public final Dimension getMatchParent() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$matchParent$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Parent();
                }
            });
        }

        @NotNull
        public final Coercible getPreferredWrapContent() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$preferredWrapContent$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                }
            });
        }

        @NotNull
        public final Dimension getWrapContent() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$wrapContent$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Fixed(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                }
            });
        }

        @NotNull
        public final Dimension percent(final float percent) {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$percent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Percent(0, percent).suggested(0);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: preferredValue-0680j_4, reason: not valid java name */
        public final MinCoercible m3223preferredValue0680j_4(final float dp) {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$preferredValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Suggested(state.convertDimension(Dp.m2963boximpl(dp))).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                }
            });
        }

        @NotNull
        public final Dimension ratio(@NotNull final String ratio) {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$ratio$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Ratio(ratio).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: value-0680j_4, reason: not valid java name */
        public final Dimension m3224value0680j_4(final float dp) {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$value$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    return androidx.constraintlayout.core.state.Dimension.Fixed(state.convertDimension(Dp.m2963boximpl(dp)));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1})
    public interface MaxCoercible extends Dimension {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1})
    public interface MinCoercible extends Dimension {
    }
}
