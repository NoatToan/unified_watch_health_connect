package androidx.compose.ui.graphics;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\"#\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"#\u0010\t\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\u0007\u0010\u0003\"#\u0010\f\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\n\u0010\u0003\"#\u0010\u000f\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0005\u001a\u0004\b\r\u0010\u0003\"#\u0010\u0012\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0010\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation$Companion;", "Landroidx/compose/ui/graphics/PathOperation;", "getDifference", "(Landroidx/compose/ui/graphics/PathOperation$Companion;)I", "getDifference$annotations", "(Landroidx/compose/ui/graphics/PathOperation$Companion;)V", "difference", "getIntersect", "getIntersect$annotations", "intersect", "getUnion", "getUnion$annotations", "union", "getReverseDifference", "getReverseDifference$annotations", "reverseDifference", "getXor", "getXor$annotations", "xor", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class PathOperationKt {
    public static final int getDifference(@NotNull PathOperation.Companion companion) {
        return companion.m1433getDifferenceb3I0S0c();
    }

    @Deprecated(message = "Use PathOperation.Difference instead", replaceWith = @ReplaceWith(expression = "PathOperation.Difference", imports = {"androidx.compose.ui.graphics.PathOperation.Difference"}))
    public static /* synthetic */ void getDifference$annotations(PathOperation.Companion companion) {
    }

    public static final int getIntersect(@NotNull PathOperation.Companion companion) {
        return companion.m1434getIntersectb3I0S0c();
    }

    @Deprecated(message = "Use PathOperation.Intersect instead", replaceWith = @ReplaceWith(expression = "PathOperation.Intersect", imports = {"androidx.compose.ui.graphics.PathOperation.Intersect"}))
    public static /* synthetic */ void getIntersect$annotations(PathOperation.Companion companion) {
    }

    public static final int getReverseDifference(@NotNull PathOperation.Companion companion) {
        return companion.m1435getReverseDifferenceb3I0S0c();
    }

    @Deprecated(message = "Use PathOperation.ReverseDifference instead", replaceWith = @ReplaceWith(expression = "PathOperation.ReverseDifference", imports = {"androidx.compose.ui.graphics.PathOperation.ReverseDifference"}))
    public static /* synthetic */ void getReverseDifference$annotations(PathOperation.Companion companion) {
    }

    public static final int getUnion(@NotNull PathOperation.Companion companion) {
        return companion.m1436getUnionb3I0S0c();
    }

    @Deprecated(message = "Use PathOperation.Union instead", replaceWith = @ReplaceWith(expression = "PathOperation.Union", imports = {"androidx.compose.ui.graphics.PathOperation.Union"}))
    public static /* synthetic */ void getUnion$annotations(PathOperation.Companion companion) {
    }

    public static final int getXor(@NotNull PathOperation.Companion companion) {
        return companion.m1437getXorb3I0S0c();
    }

    @Deprecated(message = "Use PathOperation.Xor instead", replaceWith = @ReplaceWith(expression = "PathOperation.Xor", imports = {"androidx.compose.ui.graphics.PathOperation.Xor"}))
    public static /* synthetic */ void getXor$annotations(PathOperation.Companion companion) {
    }
}
