package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/GridCells;", "", "<init>", "()V", "Adaptive", "Fixed", "Landroidx/compose/foundation/lazy/GridCells$Fixed;", "Landroidx/compose/foundation/lazy/GridCells$Adaptive;", "foundation_release"}, k = 1, mv = {1, 5, 1})
public abstract class GridCells {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/GridCells$Adaptive;", "Landroidx/compose/foundation/lazy/GridCells;", "Landroidx/compose/ui/unit/Dp;", SDKConstants.PARAM_CONTEXT_MIN_SIZE, "F", "getMinSize-D9Ej5fM", "()F", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    @ExperimentalFoundationApi
    public static final class Adaptive extends GridCells {
        public static final int $stable = 0;
        private final float minSize;

        private Adaptive(float f) {
            super(null);
            this.minSize = f;
        }

        public /* synthetic */ Adaptive(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        /* JADX INFO: renamed from: getMinSize-D9Ej5fM, reason: not valid java name and from getter */
        public final float getMinSize() {
            return this.minSize;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/GridCells$Fixed;", "Landroidx/compose/foundation/lazy/GridCells;", "", "count", LogUtil.I, "getCount", "()I", "<init>", "(I)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
    @ExperimentalFoundationApi
    public static final class Fixed extends GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i) {
            super(null);
            this.count = i;
        }

        public final int getCount() {
            return this.count;
        }
    }

    private GridCells() {
    }

    public /* synthetic */ GridCells(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
