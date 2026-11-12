package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.passport.Configs;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002efB\u0007¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0017\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u001d\u001a\u00020\u0004*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u001f\u001a\u00020\u0004*\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010!\u001a\u00020\u0004*\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010#\u001a\u00020\u0004*\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010&\u001a\u00020\u0004*\u00020$2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010(\u001a\u00020\u0004*\u00020'2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010*\u001a\u00020\u0004*\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010,\u001a\u00020\u0004*\u00020+2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JX\u00108\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001bH\u0002JX\u0010?\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020.2\u0006\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020.H\u0002J\u0018\u0010D\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0002J\u0018\u0010I\u001a\u00020G2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0002J\u0010\u0010J\u001a\u00020B2\u0006\u0010F\u001a\u00020EH\u0002J \u0010L\u001a\u00020B2\u0006\u0010K\u001a\u00020B2\u0006\u0010=\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002J \u0010O\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010=\u001a\u00020G2\u0006\u0010N\u001a\u00020MH\u0002J\f\u0010Q\u001a\u00020P*\u00020PH\u0002J\f\u0010Q\u001a\u00020.*\u00020.H\u0002J\u0006\u0010R\u001a\u00020\u0004J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010S\u001a\u00020EJ\u0014\u0010X\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0UJ\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0UJ\u0010\u0010Z\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020V0[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u0016\u0010b\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010_¨\u0006g"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "Landroidx/compose/ui/graphics/Path;", "target", "", "close", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "relativeMoveTo", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "moveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "relativeLineTo", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "lineTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "relativeHorizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "horizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "relativeVerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "verticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "relativeCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "curveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "prevIsCurve", "relativeReflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "reflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "relativeQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "quadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "prevIsQuad", "relativeReflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "reflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "relativeArcTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "arcTo", b.r, "", "x0", "y0", "x1", "y1", "a", "b", "theta", "isMoreThanHalf", "isPositiveArc", "drawArc", "cx", "cy", "e1x", "e1y", "start", "sweep", "arcToBezier", "", Constant.h, "", "args", "addNode", "", SOAP.XMLNS, "", "end", "nextStart", "getFloats", "original", "copyOfRange", "Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "result", "extract", "", "toRadians", "clear", "pathData", "parsePathString", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "addPathNodes", "toNodes", "toPath", "", "Ljava/util/List;", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "currentPoint", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "ctrlPoint", "segmentPoint", "reflectiveCtrlPoint", "<init>", "()V", "ExtractFloatResult", "PathPoint", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
public final class PathParser {

    @NotNull
    private final PathPoint ctrlPoint;

    @NotNull
    private final PathPoint currentPoint;

    @NotNull
    private final List<PathNode> nodes = new ArrayList();

    @NotNull
    private final PathPoint reflectiveCtrlPoint;

    @NotNull
    private final PathPoint segmentPoint;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "", "", Configs.Params.RESET, "", "component1", "component2", "x", "y", "copy", "", "toString", "", "hashCode", "other", "", "equals", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PathPoint {
        private float x;
        private float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public PathPoint() {
            float f = 0.0f;
            this(f, f, 3, null);
        }

        public PathPoint(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ PathPoint copy$default(PathPoint pathPoint, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = pathPoint.x;
            }
            if ((i & 2) != 0) {
                f2 = pathPoint.y;
            }
            return pathPoint.copy(f, f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final PathPoint copy(float x, float y) {
            return new PathPoint(x, y);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) other;
            return Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(pathPoint.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(pathPoint.y));
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
        }

        public final void reset() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }

        @NotNull
        public String toString() {
            return "PathPoint(x=" + this.x + ", y=" + this.y + ')';
        }

        public /* synthetic */ PathPoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    public PathParser() {
        float f = 0.0f;
        int i = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.currentPoint = new PathPoint(f, f, i, defaultConstructorMarker);
        this.ctrlPoint = new PathPoint(f, f, i, defaultConstructorMarker);
        this.segmentPoint = new PathPoint(f, f, i, defaultConstructorMarker);
        this.reflectiveCtrlPoint = new PathPoint(f, f, i, defaultConstructorMarker);
    }

    private final void addNode(char cmd, float[] args) {
        this.nodes.addAll(PathNodeKt.toPathNodes(cmd, args));
    }

    private final void arcTo(PathNode.ArcTo arcTo, Path path) {
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
        this.currentPoint.setX(arcTo.getArcStartX());
        this.currentPoint.setY(arcTo.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcToBezier(Path p, double cx, double cy, double a, double b, double e1x, double e1y, double theta, double start, double sweep) {
        double d = a;
        double d2 = 4;
        int iCeil = (int) Math.ceil(Math.abs((sweep * d2) / 3.141592653589793d));
        double dCos = Math.cos(theta);
        double dSin = Math.sin(theta);
        double dCos2 = Math.cos(start);
        double dSin2 = Math.sin(start);
        double d3 = -d;
        double d4 = d3 * dCos;
        double d5 = b * dSin;
        double d6 = (d4 * dSin2) - (d5 * dCos2);
        double d7 = d3 * dSin;
        double d8 = b * dCos;
        double d9 = (dSin2 * d7) + (dCos2 * d8);
        double d10 = sweep / ((double) iCeil);
        if (iCeil <= 0) {
            return;
        }
        double d11 = start;
        int i = iCeil;
        double d12 = d9;
        double d13 = d6;
        int i2 = 0;
        double d14 = e1x;
        double d15 = e1y;
        while (true) {
            double d16 = d14;
            int i3 = i2 + 1;
            double d17 = d11 + d10;
            double dSin3 = Math.sin(d17);
            double dCos3 = Math.cos(d17);
            double d18 = dCos;
            double d19 = (cx + ((d * dCos) * dCos3)) - (d5 * dSin3);
            double d20 = cy + (d * dSin * dCos3) + (d8 * dSin3);
            double d21 = (d4 * dSin3) - (d5 * dCos3);
            double d22 = (dSin3 * d7) + (dCos3 * d8);
            double d23 = d17 - d11;
            double d24 = dSin;
            double dTan = Math.tan(d23 / ((double) 2));
            double d25 = d2;
            double dSin4 = (Math.sin(d23) * (Math.sqrt(d2 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            double d26 = d10;
            double d27 = d7;
            p.cubicTo((float) (d16 + (d13 * dSin4)), (float) (d15 + (d12 * dSin4)), (float) (d19 - (dSin4 * d21)), (float) (d20 - (dSin4 * d22)), (float) d19, (float) d20);
            int i4 = i;
            if (i3 >= i4) {
                return;
            }
            d10 = d26;
            dSin = d24;
            i = i4;
            i2 = i3;
            d7 = d27;
            d11 = d17;
            d12 = d22;
            d2 = d25;
            d13 = d21;
            d15 = d20;
            d14 = d19;
            dCos = d18;
            d = a;
        }
    }

    private final void close(Path target) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        target.close();
        target.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final float[] copyOfRange(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int length = original.length;
        if (start < 0 || start > length) {
            throw new IndexOutOfBoundsException();
        }
        int i = end - start;
        int iMin = Math.min(i, length - start);
        float[] fArr = new float[i];
        ArraysKt___ArraysJvmKt.copyInto(original, fArr, 0, start, iMin + start);
        return fArr;
    }

    private final void curveTo(PathNode.CurveTo curveTo, Path path) {
        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
        this.ctrlPoint.setX(curveTo.getX2());
        this.ctrlPoint.setY(curveTo.getY2());
        this.currentPoint.setX(curveTo.getX3());
        this.currentPoint.setY(curveTo.getY3());
    }

    private final void drawArc(Path p, double x0, double y0, double x1, double y1, double a, double b, double theta, boolean isMoreThanHalf, boolean isPositiveArc) {
        double d;
        double d2;
        double radians = toRadians(theta);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = ((x0 * dCos) + (y0 * dSin)) / a;
        double d4 = (((-x0) * dSin) + (y0 * dCos)) / b;
        double d5 = ((x1 * dCos) + (y1 * dSin)) / a;
        double d6 = (((-x1) * dSin) + (y1 * dCos)) / b;
        double d7 = d3 - d5;
        double d8 = d4 - d6;
        double d9 = 2;
        double d10 = (d3 + d5) / d9;
        double d11 = (d4 + d6) / d9;
        double d12 = (d7 * d7) + (d8 * d8);
        if (d12 == 0.0d) {
            return;
        }
        double d13 = (1.0d / d12) - 0.25d;
        if (d13 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d12) / 1.99999d);
            drawArc(p, x0, y0, x1, y1, a * dSqrt, b * dSqrt, theta, isMoreThanHalf, isPositiveArc);
            return;
        }
        double dSqrt2 = Math.sqrt(d13);
        double d14 = d7 * dSqrt2;
        double d15 = dSqrt2 * d8;
        if (isMoreThanHalf == isPositiveArc) {
            d = d10 - d15;
            d2 = d11 + d14;
        } else {
            d = d10 + d15;
            d2 = d11 - d14;
        }
        double dAtan2 = Math.atan2(d4 - d2, d3 - d);
        double dAtan3 = Math.atan2(d6 - d2, d5 - d) - dAtan2;
        if (isPositiveArc != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d16 = d * a;
        double d17 = d2 * b;
        arcToBezier(p, (d16 * dCos) - (d17 * dSin), (d16 * dSin) + (d17 * dCos), a, b, x0, y0, radians, dAtan2, dAtan3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    private final void extract(String s, int start, ExtractFloatResult result) {
        result.setEndWithNegativeOrDot(false);
        int i = start;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i < s.length()) {
            char cCharAt = s.charAt(i);
            if (cCharAt == ' ' || cCharAt == ',') {
                z = false;
                z3 = true;
            } else if (cCharAt == '-') {
                if (i == start || z) {
                    z = false;
                } else {
                    result.setEndWithNegativeOrDot(true);
                    z = false;
                    z3 = true;
                }
            } else if (cCharAt != '.') {
                if (cCharAt == 'e' || cCharAt == 'E') {
                    z = true;
                } else {
                    z = false;
                }
            } else if (z2) {
                result.setEndWithNegativeOrDot(true);
                z = false;
                z3 = true;
            } else {
                z = false;
                z2 = true;
            }
            if (z3) {
                break;
            } else {
                i++;
            }
        }
        result.setEndPosition(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float[] getFloats(String s) {
        int i = 0;
        Object[] objArr = 0;
        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[s.length()];
        ExtractFloatResult extractFloatResult = new ExtractFloatResult(i, objArr == true ? 1 : 0, 3, null);
        int length = s.length();
        int i2 = 1;
        int i3 = 0;
        while (i2 < length) {
            extract(s, i2, extractFloatResult);
            int endPosition = extractFloatResult.getEndPosition();
            if (i2 < endPosition) {
                fArr[i3] = Float.parseFloat(s.substring(i2, endPosition));
                i3++;
            }
            i2 = extractFloatResult.getEndWithNegativeOrDot() ? endPosition : endPosition + 1;
        }
        return copyOfRange(fArr, 0, i3);
    }

    private final void horizontalTo(PathNode.HorizontalTo horizontalTo, Path path) {
        path.lineTo(horizontalTo.getX(), this.currentPoint.getY());
        this.currentPoint.setX(horizontalTo.getX());
    }

    private final void lineTo(PathNode.LineTo lineTo, Path path) {
        path.lineTo(lineTo.getX(), lineTo.getY());
        this.currentPoint.setX(lineTo.getX());
        this.currentPoint.setY(lineTo.getY());
    }

    private final void moveTo(PathNode.MoveTo moveTo, Path path) {
        this.currentPoint.setX(moveTo.getX());
        this.currentPoint.setY(moveTo.getY());
        path.moveTo(moveTo.getX(), moveTo.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final int nextStart(String s, int end) {
        while (end < s.length()) {
            char cCharAt = s.charAt(end);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    private final void quadTo(PathNode.QuadTo quadTo, Path path) {
        path.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
        this.ctrlPoint.setX(quadTo.getX1());
        this.ctrlPoint.setY(quadTo.getY1());
        this.currentPoint.setX(quadTo.getX2());
        this.currentPoint.setY(quadTo.getY2());
    }

    private final void reflectiveCurveTo(PathNode.ReflectiveCurveTo reflectiveCurveTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
        this.ctrlPoint.setX(reflectiveCurveTo.getX1());
        this.ctrlPoint.setY(reflectiveCurveTo.getY1());
        this.currentPoint.setX(reflectiveCurveTo.getX2());
        this.currentPoint.setY(reflectiveCurveTo.getY2());
    }

    private final void reflectiveQuadTo(PathNode.ReflectiveQuadTo reflectiveQuadTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(reflectiveQuadTo.getX());
        this.currentPoint.setY(reflectiveQuadTo.getY());
    }

    private final void relativeArcTo(PathNode.RelativeArcTo relativeArcTo, Path path) {
        float arcStartDx = relativeArcTo.getArcStartDx() + this.currentPoint.getX();
        float arcStartDy = relativeArcTo.getArcStartDy() + this.currentPoint.getY();
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
        this.currentPoint.setX(arcStartDx);
        this.currentPoint.setY(arcStartDy);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void relativeCurveTo(PathNode.RelativeCurveTo relativeCurveTo, Path path) {
        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeCurveTo.getDx2());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeCurveTo.getDy2());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeCurveTo.getDx3());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeCurveTo.getDy3());
    }

    private final void relativeHorizontalTo(PathNode.RelativeHorizontalTo relativeHorizontalTo, Path path) {
        path.relativeLineTo(relativeHorizontalTo.getDx(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeHorizontalTo.getDx());
    }

    private final void relativeLineTo(PathNode.RelativeLineTo relativeLineTo, Path path) {
        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeLineTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeLineTo.getDy());
    }

    private final void relativeMoveTo(PathNode.RelativeMoveTo relativeMoveTo, Path path) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeMoveTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeMoveTo.getDy());
        path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeQuadTo(PathNode.RelativeQuadTo relativeQuadTo, Path path) {
        path.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeQuadTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeQuadTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeQuadTo.getDx1());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeQuadTo.getDy1());
    }

    private final void relativeReflectiveCurveTo(PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeReflectiveCurveTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeReflectiveCurveTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveCurveTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveCurveTo.getDy2());
    }

    private final void relativeReflectiveQuadTo(PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveQuadTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveQuadTo.getDy());
    }

    private final void relativeVerticalTo(PathNode.RelativeVerticalTo relativeVerticalTo, Path path) {
        path.relativeLineTo(0.0f, relativeVerticalTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setY(pathPoint.getY() + relativeVerticalTo.getDy());
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    private final double toRadians(double d) {
        return (d / ((double) 180)) * 3.141592653589793d;
    }

    private final float toRadians(float f) {
        return (f / 180.0f) * 3.1415927f;
    }

    private final void verticalTo(PathNode.VerticalTo verticalTo, Path path) {
        path.lineTo(this.currentPoint.getX(), verticalTo.getY());
        this.currentPoint.setY(verticalTo.getY());
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
        this.nodes.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String pathData) {
        this.nodes.clear();
        int i = 1;
        int i2 = 0;
        while (i < pathData.length()) {
            int iNextStart = nextStart(pathData, i);
            String strSubstring = pathData.substring(i2, iNextStart);
            int length = strSubstring.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = Intrinsics.compare((int) strSubstring.charAt(!z ? i3 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            String string = strSubstring.subSequence(i3, length + 1).toString();
            if (string.length() > 0) {
                addNode(string.charAt(0), getFloats(string));
            }
            i2 = iNextStart;
            i = iNextStart + 1;
        }
        if (i - i2 == 1 && i2 < pathData.length()) {
            addNode(pathData.charAt(i2), new float[0]);
        }
        return this;
    }

    @NotNull
    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    @NotNull
    public final Path toPath(@NotNull Path target) {
        target.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List<PathNode> list = this.nodes;
        int size = list.size() - 1;
        if (size >= 0) {
            PathNode pathNode = null;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                PathNode pathNode2 = list.get(i);
                if (pathNode == null) {
                    pathNode = pathNode2;
                }
                if (pathNode2 instanceof PathNode.Close) {
                    close(target);
                } else if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                    relativeMoveTo((PathNode.RelativeMoveTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.MoveTo) {
                    moveTo((PathNode.MoveTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                    relativeLineTo((PathNode.RelativeLineTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.LineTo) {
                    lineTo((PathNode.LineTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                    relativeHorizontalTo((PathNode.RelativeHorizontalTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                    horizontalTo((PathNode.HorizontalTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                    relativeVerticalTo((PathNode.RelativeVerticalTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.VerticalTo) {
                    verticalTo((PathNode.VerticalTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                    relativeCurveTo((PathNode.RelativeCurveTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.CurveTo) {
                    curveTo((PathNode.CurveTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                    relativeReflectiveCurveTo((PathNode.RelativeReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
                } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                    reflectiveCurveTo((PathNode.ReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
                } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                    relativeQuadTo((PathNode.RelativeQuadTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.QuadTo) {
                    quadTo((PathNode.QuadTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                    relativeReflectiveQuadTo((PathNode.RelativeReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
                } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                    reflectiveQuadTo((PathNode.ReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
                } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                    relativeArcTo((PathNode.RelativeArcTo) pathNode2, target);
                } else if (pathNode2 instanceof PathNode.ArcTo) {
                    arcTo((PathNode.ArcTo) pathNode2, target);
                }
                if (i2 > size) {
                    break;
                }
                pathNode = pathNode2;
                i = i2;
            }
        }
        return target;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "", "", "component1", "", "component2", "endPosition", "endWithNegativeOrDot", "copy", "", "toString", "hashCode", "other", "equals", LogUtil.I, "getEndPosition", "()I", "setEndPosition", "(I)V", "Z", "getEndWithNegativeOrDot", "()Z", "setEndWithNegativeOrDot", "(Z)V", "<init>", "(IZ)V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        /* JADX WARN: Multi-variable type inference failed */
        public ExtractFloatResult() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public ExtractFloatResult(int i, boolean z) {
            this.endPosition = i;
            this.endWithNegativeOrDot = z;
        }

        public static /* synthetic */ ExtractFloatResult copy$default(ExtractFloatResult extractFloatResult, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = extractFloatResult.endPosition;
            }
            if ((i2 & 2) != 0) {
                z = extractFloatResult.endWithNegativeOrDot;
            }
            return extractFloatResult.copy(i, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getEndPosition() {
            return this.endPosition;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        @NotNull
        public final ExtractFloatResult copy(int endPosition, boolean endWithNegativeOrDot) {
            return new ExtractFloatResult(endPosition, endWithNegativeOrDot);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) other;
            return this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int i = this.endPosition * 31;
            boolean z = this.endWithNegativeOrDot;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return i + r1;
        }

        public final void setEndPosition(int i) {
            this.endPosition = i;
        }

        public final void setEndWithNegativeOrDot(boolean z) {
            this.endWithNegativeOrDot = z;
        }

        @NotNull
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }

        public /* synthetic */ ExtractFloatResult(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }
}
