package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes41.dex */
public class ozg extends Transformer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Matrix f45008c;
    private LineChart e;

    public ozg(ViewPortHandler viewPortHandler, LineChart lineChart) {
        super(viewPortHandler);
        this.f45008c = new Matrix();
        this.mViewPortHandler = viewPortHandler;
        this.e = lineChart;
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void prepareMatrixValuePx(float f, float f2, float f3, float f4) {
        float fContentWidth = f2 > 0.0f ? this.mViewPortHandler.contentWidth() / f2 : 0.0f;
        float fContentHeight = f3 > 0.0f ? this.mViewPortHandler.contentHeight() / f3 : 0.0f;
        if (Float.isInfinite(fContentWidth)) {
            fContentWidth = 0.0f;
        }
        if (Float.isInfinite(fContentHeight)) {
            fContentHeight = 0.0f;
        }
        this.mMatrixValueToPx.reset();
        this.mMatrixValueToPx.postTranslate(-f, -f4);
        this.mMatrixValueToPx.postScale(fContentWidth, -fContentHeight);
        this.f45008c.reset();
        this.f45008c.postScale(1.0f, -1.0f);
        this.f45008c.postTranslate(0.0f, -this.e.getViewPortHandler().getContentRect().height());
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void pathValueToPixel(Path path) {
        path.transform(this.mMatrixValueToPx);
        path.transform(this.f45008c);
        path.transform(this.mViewPortHandler.getMatrixTouch());
        path.transform(this.mMatrixOffset);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void pointValuesToPixel(float[] fArr) {
        this.mMatrixValueToPx.mapPoints(fArr);
        this.f45008c.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
        this.mMatrixOffset.mapPoints(fArr);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectValueToPixel(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.f45008c.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectToPixelPhase(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.f45008c.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectToPixelPhaseHorizontal(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.f45008c.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectValueToPixelHorizontal(RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.f45008c.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectValueToPixelHorizontal(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.f45008c.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void pixelsToValue(float[] fArr) {
        Matrix matrix = this.mPixelToValueMatrixBuffer;
        matrix.reset();
        this.mMatrixOffset.invert(matrix);
        matrix.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().invert(matrix);
        matrix.mapPoints(fArr);
        this.f45008c.invert(matrix);
        matrix.mapPoints(fArr);
        this.mMatrixValueToPx.invert(matrix);
        matrix.mapPoints(fArr);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public Matrix getValueToPixelMatrix() {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixValueToPx);
        matrix.postConcat(this.f45008c);
        matrix.postConcat(this.mViewPortHandler.getMatrixTouch());
        matrix.postConcat(this.mMatrixOffset);
        return matrix;
    }
}
