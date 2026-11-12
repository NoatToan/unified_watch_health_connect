package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes14.dex */
public class ShapeAppearancePathProvider {
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    public static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i14);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i14);
    }

    public static final class ShapeAppearancePathSpec {
        public final RectF bounds;
        public final float interpolation;
        public final Path path;
        public final PathListener pathListener;
        public final ShapeAppearanceModel shapeAppearanceModel;

        public ShapeAppearancePathSpec(ShapeAppearanceModel shapeAppearanceModel, float f14, RectF rectF, PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f14;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i14 = 0; i14 < 4; i14++) {
            this.cornerPaths[i14] = new ShapePath();
            this.cornerTransforms[i14] = new Matrix();
            this.edgeTransforms[i14] = new Matrix();
        }
    }

    private float angleOfEdge(int i14) {
        return ((i14 + 1) % 4) * 90;
    }

    private void appendCornerPath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i14) {
        this.scratch[0] = this.cornerPaths[i14].getStartX();
        this.scratch[1] = this.cornerPaths[i14].getStartY();
        this.cornerTransforms[i14].mapPoints(this.scratch);
        if (i14 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i14].applyToPath(this.cornerTransforms[i14], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i14], this.cornerTransforms[i14], i14);
        }
    }

    private void appendEdgePath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i14) {
        int i15 = (i14 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i14].getEndX();
        this.scratch[1] = this.cornerPaths[i14].getEndY();
        this.cornerTransforms[i14].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i15].getStartX();
        this.scratch2[1] = this.cornerPaths[i15].getStartY();
        this.cornerTransforms[i15].mapPoints(this.scratch2);
        float[] fArr = this.scratch;
        float f14 = fArr[0];
        float[] fArr2 = this.scratch2;
        float fMax = Math.max(((float) Math.hypot(f14 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i14);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i14, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(fMax, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i14], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i14) || pathOverlapsCorner(this.edgePath, i15))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i14].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr3 = this.scratch;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i14], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i14], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i14], i14);
        }
    }

    private void getCoordinatesOfCorner(int i14, RectF rectF, PointF pointF) {
        if (i14 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i14 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i14 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerSize getCornerSizeForIndex(int i14, ShapeAppearanceModel shapeAppearanceModel) {
        if (i14 == 1) {
            return shapeAppearanceModel.getBottomRightCornerSize();
        }
        if (i14 != 2) {
            return i14 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomLeftCornerSize();
    }

    private CornerTreatment getCornerTreatmentForIndex(int i14, ShapeAppearanceModel shapeAppearanceModel) {
        if (i14 == 1) {
            return shapeAppearanceModel.getBottomRightCorner();
        }
        if (i14 != 2) {
            return i14 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner();
        }
        return shapeAppearanceModel.getBottomLeftCorner();
    }

    private float getEdgeCenterForIndex(RectF rectF, int i14) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i14];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i14].mapPoints(fArr);
        return (i14 == 1 || i14 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i14, ShapeAppearanceModel shapeAppearanceModel) {
        if (i14 == 1) {
            return shapeAppearanceModel.getBottomEdge();
        }
        if (i14 != 2) {
            return i14 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge();
        }
        return shapeAppearanceModel.getLeftEdge();
    }

    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int i14) {
        this.cornerPath.reset();
        this.cornerPaths[i14].applyToPath(this.cornerTransforms[i14], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void setCornerPathAndTransform(ShapeAppearancePathSpec shapeAppearancePathSpec, int i14) {
        getCornerTreatmentForIndex(i14, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i14], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, getCornerSizeForIndex(i14, shapeAppearancePathSpec.shapeAppearanceModel));
        float fAngleOfEdge = angleOfEdge(i14);
        this.cornerTransforms[i14].reset();
        getCoordinatesOfCorner(i14, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i14];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i14].preRotate(fAngleOfEdge);
    }

    private void setEdgePathAndTransform(int i14) {
        this.scratch[0] = this.cornerPaths[i14].getEndX();
        this.scratch[1] = this.cornerPaths[i14].getEndY();
        this.cornerTransforms[i14].mapPoints(this.scratch);
        float fAngleOfEdge = angleOfEdge(i14);
        this.edgeTransforms[i14].reset();
        Matrix matrix = this.edgeTransforms[i14];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i14].preRotate(fAngleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f14, RectF rectF, PathListener pathListener, Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f14, rectF, pathListener, path);
        for (int i14 = 0; i14 < 4; i14++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i14);
            setEdgePathAndTransform(i14);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            appendCornerPath(shapeAppearancePathSpec, i15);
            appendEdgePath(shapeAppearancePathSpec, i15);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }

    public void setEdgeIntersectionCheckEnable(boolean z14) {
        this.edgeIntersectionCheckEnabled = z14;
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f14, RectF rectF, Path path) {
        calculatePath(shapeAppearanceModel, f14, rectF, null, path);
    }
}
