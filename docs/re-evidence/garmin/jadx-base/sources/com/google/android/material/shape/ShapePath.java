package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<ShadowCompatOperation> shadowCompatOperations = new ArrayList();

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    public static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i14, Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom()), i14, this.operation.getStartAngle(), this.operation.getSweepAngle());
        }
    }

    public static class InnerCornerShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation1;
        private final PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f14, float f15) {
            this.operation1 = pathLineOperation;
            this.operation2 = pathLineOperation2;
            this.startX = f14;
            this.startY = f15;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i14, Canvas canvas) {
            int i15;
            float sweepAngle = getSweepAngle();
            if (sweepAngle > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.operation1.f53239x - this.startX, this.operation1.f53240y - this.startY);
            double dHypot2 = Math.hypot(this.operation2.f53239x - this.operation1.f53239x, this.operation2.f53240y - this.operation1.f53240y);
            float fMin = (float) Math.min(i14, Math.min(dHypot, dHypot2));
            double d14 = fMin;
            double dTan = Math.tan(Math.toRadians((-sweepAngle) / 2.0f)) * d14;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.startX, this.startY);
                this.renderMatrix.preRotate(getStartAngle());
                i15 = i14;
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i15);
            } else {
                i15 = i14;
            }
            float f14 = fMin * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f14, f14);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.operation1.f53239x, this.operation1.f53240y);
            this.renderMatrix.preRotate(getStartAngle());
            this.renderMatrix.preTranslate((float) ((-dTan) - d14), (-2.0f) * fMin);
            shadowRenderer.drawInnerCornerShadow(canvas, this.renderMatrix, rectF2, (int) fMin, 450.0f, sweepAngle, new float[]{(float) (d14 + dTan), f14});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.operation1.f53239x, this.operation1.f53240y);
                this.renderMatrix.preRotate(getEndAngle());
                this.renderMatrix.preTranslate((float) dTan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF3, i15);
            }
        }

        public float getEndAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation2.f53240y - this.operation1.f53240y) / (this.operation2.f53239x - this.operation1.f53239x)));
        }

        public float getStartAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation1.f53240y - this.startY) / (this.operation1.f53239x - this.startX)));
        }

        public float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            return endAngle <= 180.0f ? endAngle : endAngle - 360.0f;
        }
    }

    public static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f14, float f15) {
            this.operation = pathLineOperation;
            this.startX = f14;
            this.startY = f15;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i14, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.operation.f53240y - this.startY, this.operation.f53239x - this.startX), 0.0f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.startX, this.startY);
            this.renderMatrix.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i14);
        }

        public float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation.f53240y - this.startY) / (this.operation.f53239x - this.startX)));
        }
    }

    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public PathArcOperation(float f14, float f15, float f16, float f17) {
            setLeft(f14);
            setTop(f15);
            setRight(f16);
            setBottom(f17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.top;
        }

        private void setBottom(float f14) {
            this.bottom = f14;
        }

        private void setLeft(float f14) {
            this.left = f14;
        }

        private void setRight(float f14) {
            this.right = f14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f14) {
            this.startAngle = f14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f14) {
            this.sweepAngle = f14;
        }

        private void setTop(float f14) {
            this.top = f14;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f14, float f15, float f16, float f17, float f18, float f19) {
            setControlX1(f14);
            setControlY1(f15);
            setControlX2(f16);
            setControlY2(f17);
            setEndX(f18);
            setEndY(f19);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setControlX1(float f14) {
            this.controlX1 = f14;
        }

        private void setControlX2(float f14) {
            this.controlX2 = f14;
        }

        private void setControlY1(float f14) {
            this.controlY1 = f14;
        }

        private void setControlY2(float f14) {
            this.controlY2 = f14;
        }

        private void setEndX(float f14) {
            this.endX = f14;
        }

        private void setEndY(float f14) {
            this.endY = f14;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f53239x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f53240y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f53239x, this.f53240y);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float getControlX() {
            return this.controlX;
        }

        private float getControlY() {
            return this.controlY;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f14) {
            this.controlX = f14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f14) {
            this.controlY = f14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f14) {
            this.endX = f14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f14) {
            this.endY = f14;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    public static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = new Matrix();
        final Matrix renderMatrix = new Matrix();

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i14, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i14, Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i14, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f14) {
        if (getCurrentShadowAngle() == f14) {
            return;
        }
        float currentShadowAngle = ((f14 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > 180.0f) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
        pathArcOperation.setStartAngle(getCurrentShadowAngle());
        pathArcOperation.setSweepAngle(currentShadowAngle);
        this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
        setCurrentShadowAngle(f14);
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f14, float f15) {
        addConnectingShadowIfNecessary(f14);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f15);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f14) {
        this.currentShadowAngle = f14;
    }

    private void setEndShadowAngle(float f14) {
        this.endShadowAngle = f14;
    }

    private void setEndX(float f14) {
        this.endX = f14;
    }

    private void setEndY(float f14) {
        this.endY = f14;
    }

    private void setStartX(float f14) {
        this.startX = f14;
    }

    private void setStartY(float f14) {
        this.startY = f14;
    }

    public void addArc(float f14, float f15, float f16, float f17, float f18, float f19) {
        PathArcOperation pathArcOperation = new PathArcOperation(f14, f15, f16, f17);
        pathArcOperation.setStartAngle(f18);
        pathArcOperation.setSweepAngle(f19);
        this.operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f22 = f18 + f19;
        boolean z14 = f19 < 0.0f;
        if (z14) {
            f18 = (f18 + 180.0f) % 360.0f;
        }
        addShadowCompatOperation(arcShadowOperation, f18, z14 ? (180.0f + f22) % 360.0f : f22);
        double d14 = f22;
        setEndX((((f16 - f14) / 2.0f) * ((float) Math.cos(Math.toRadians(d14)))) + ((f14 + f16) * 0.5f));
        setEndY((((f17 - f15) / 2.0f) * ((float) Math.sin(Math.toRadians(d14)))) + ((f15 + f17) * 0.5f));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.operations.get(i14).applyToPath(matrix, path);
        }
    }

    public boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    public ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.shadowCompatOperations);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i14, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i14, canvas);
                }
            }
        };
    }

    public void cubicToPoint(float f14, float f15, float f16, float f17, float f18, float f19) {
        this.operations.add(new PathCubicOperation(f14, f15, f16, f17, f18, f19));
        this.containsIncompatibleShadowOp = true;
        setEndX(f18);
        setEndY(f19);
    }

    public float getEndX() {
        return this.endX;
    }

    public float getEndY() {
        return this.endY;
    }

    public float getStartX() {
        return this.startX;
    }

    public float getStartY() {
        return this.startY;
    }

    public void lineTo(float f14, float f15, float f16, float f17) {
        if ((Math.abs(f14 - getEndX()) < 0.001f && Math.abs(f15 - getEndY()) < 0.001f) || (Math.abs(f14 - f16) < 0.001f && Math.abs(f15 - f17) < 0.001f)) {
            lineTo(f16, f17);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f53239x = f14;
        pathLineOperation.f53240y = f15;
        this.operations.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f53239x = f16;
        pathLineOperation2.f53240y = f17;
        this.operations.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (innerCornerShadowOperation.getSweepAngle() > 0.0f) {
            lineTo(f14, f15);
            lineTo(f16, f17);
        } else {
            addShadowCompatOperation(innerCornerShadowOperation, innerCornerShadowOperation.getStartAngle() + 270.0f, innerCornerShadowOperation.getEndAngle() + 270.0f);
            setEndX(f16);
            setEndY(f17);
        }
    }

    public void quadToPoint(float f14, float f15, float f16, float f17) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f14);
        pathQuadOperation.setControlY(f15);
        pathQuadOperation.setEndX(f16);
        pathQuadOperation.setEndY(f17);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f16);
        setEndY(f17);
    }

    public void reset(float f14, float f15, float f16, float f17) {
        setStartX(f14);
        setStartY(f15);
        setEndX(f14);
        setEndY(f15);
        setCurrentShadowAngle(f16);
        setEndShadowAngle((f16 + f17) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public ShapePath(float f14, float f15) {
        reset(f14, f15);
    }

    public void reset(float f14, float f15) {
        reset(f14, f15, 270.0f, 0.0f);
    }

    public void lineTo(float f14, float f15) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f53239x = f14;
        pathLineOperation.f53240y = f15;
        this.operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + 270.0f, lineShadowOperation.getAngle() + 270.0f);
        setEndX(f14);
        setEndY(f15);
    }
}
