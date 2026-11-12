package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0000J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ6\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bJ6\u0010\"\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bJ&\u0010#\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ&\u0010$\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ&\u0010%\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ&\u0010&\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ\u0016\u0010'\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010(\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bJ>\u0010/\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ>\u00102\u001a\u00020\u00002\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bR\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "node", "addNode", "", "getNodes", "close", "", "x", "y", "moveTo", "dx", "dy", "moveToRelative", "lineTo", "lineToRelative", "horizontalLineTo", "horizontalLineToRelative", "verticalLineTo", "verticalLineToRelative", "x1", "y1", "x2", "y2", "x3", "y3", "curveTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "curveToRelative", "reflectiveCurveTo", "reflectiveCurveToRelative", "quadTo", "quadToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcTo", "a", "b", "arcToRelative", "", "nodes", "Ljava/util/List;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
public final class PathBuilder {

    @NotNull
    private final List<PathNode> nodes = new ArrayList();

    private final PathBuilder addNode(PathNode node) {
        this.nodes.add(node);
        return this;
    }

    @NotNull
    public final PathBuilder arcTo(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float x1, float y1) {
        return addNode(new PathNode.ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, x1, y1));
    }

    @NotNull
    public final PathBuilder arcToRelative(float a, float b, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float dx1, float dy1) {
        return addNode(new PathNode.RelativeArcTo(a, b, theta, isMoreThanHalf, isPositiveArc, dx1, dy1));
    }

    @NotNull
    public final PathBuilder close() {
        return addNode(PathNode.Close.INSTANCE);
    }

    @NotNull
    public final PathBuilder curveTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        return addNode(new PathNode.CurveTo(x1, y1, x2, y2, x3, y3));
    }

    @NotNull
    public final PathBuilder curveToRelative(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        return addNode(new PathNode.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
    }

    @NotNull
    public final List<PathNode> getNodes() {
        return this.nodes;
    }

    @NotNull
    public final PathBuilder horizontalLineTo(float x) {
        return addNode(new PathNode.HorizontalTo(x));
    }

    @NotNull
    public final PathBuilder horizontalLineToRelative(float dx) {
        return addNode(new PathNode.RelativeHorizontalTo(dx));
    }

    @NotNull
    public final PathBuilder lineTo(float x, float y) {
        return addNode(new PathNode.LineTo(x, y));
    }

    @NotNull
    public final PathBuilder lineToRelative(float dx, float dy) {
        return addNode(new PathNode.RelativeLineTo(dx, dy));
    }

    @NotNull
    public final PathBuilder moveTo(float x, float y) {
        return addNode(new PathNode.MoveTo(x, y));
    }

    @NotNull
    public final PathBuilder moveToRelative(float dx, float dy) {
        return addNode(new PathNode.RelativeMoveTo(dx, dy));
    }

    @NotNull
    public final PathBuilder quadTo(float x1, float y1, float x2, float y2) {
        return addNode(new PathNode.QuadTo(x1, y1, x2, y2));
    }

    @NotNull
    public final PathBuilder quadToRelative(float dx1, float dy1, float dx2, float dy2) {
        return addNode(new PathNode.RelativeQuadTo(dx1, dy1, dx2, dy2));
    }

    @NotNull
    public final PathBuilder reflectiveCurveTo(float x1, float y1, float x2, float y2) {
        return addNode(new PathNode.ReflectiveCurveTo(x1, y1, x2, y2));
    }

    @NotNull
    public final PathBuilder reflectiveCurveToRelative(float dx1, float dy1, float dx2, float dy2) {
        return addNode(new PathNode.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
    }

    @NotNull
    public final PathBuilder reflectiveQuadTo(float x1, float y1) {
        return addNode(new PathNode.ReflectiveQuadTo(x1, y1));
    }

    @NotNull
    public final PathBuilder reflectiveQuadToRelative(float dx1, float dy1) {
        return addNode(new PathNode.RelativeReflectiveQuadTo(dx1, dy1));
    }

    @NotNull
    public final PathBuilder verticalLineTo(float y) {
        return addNode(new PathNode.VerticalTo(y));
    }

    @NotNull
    public final PathBuilder verticalLineToRelative(float dy) {
        return addNode(new PathNode.RelativeVerticalTo(dy));
    }
}
