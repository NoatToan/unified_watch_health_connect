package com.huawei.ui.commonui.linechart.common;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import defpackage.qmh;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthTransformer extends Transformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Matrix f23669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f23670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BusinessMatrixGenerator f23671c;
    private Matrix d;
    private Context e;

    public interface BusinessMatrixGenerator {
        Matrix generateBusinessMatrix(Matrix matrix);
    }

    public HwHealthTransformer(Context context, ViewPortHandler viewPortHandler) {
        super(viewPortHandler);
        this.f23669a = new Matrix();
        this.f23671c = null;
        this.e = null;
        this.f23670b = new Matrix();
        this.d = new Matrix();
        this.e = context;
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void prepareMatrixValuePx(float f, float f2, float f3, float f4) {
        super.prepareMatrixValuePx(f, f2, f3, f4);
        this.f23669a.reset();
        a(f, f2, f3, f4);
        this.f23670b.reset();
        if (qmh.e(this.e)) {
            this.f23670b.postScale(-1.0f, 1.0f);
            this.f23670b.postTranslate(this.mViewPortHandler.getContentRect().width(), 0.0f);
        }
    }

    protected void a(float f, float f2, float f3, float f4) {
        BusinessMatrixGenerator businessMatrixGenerator = this.f23671c;
        if (businessMatrixGenerator != null) {
            Matrix matrix = this.f23669a;
            matrix.set(businessMatrixGenerator.generateBusinessMatrix(matrix));
        }
    }

    public void e(BusinessMatrixGenerator businessMatrixGenerator) {
        this.f23671c = businessMatrixGenerator;
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void pointValuesToPixel(float[] fArr) {
        this.mMatrixValueToPx.mapPoints(fArr);
        this.f23669a.mapPoints(fArr);
        this.f23670b.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
        this.mMatrixOffset.mapPoints(fArr);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void pathValueToPixel(Path path) {
        if (path == null) {
            LogUtil.e("HwHealthTransformer", "pathValueToPixel path == null");
            return;
        }
        path.transform(this.mMatrixValueToPx);
        path.transform(this.f23669a);
        path.transform(this.f23670b);
        path.transform(this.mViewPortHandler.getMatrixTouch());
        path.transform(this.mMatrixOffset);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectValueToPixel(RectF rectF) {
        if (rectF == null) {
            LogUtil.e("HwHealthTransformer", "rectValueToPixel rectF == null");
            return;
        }
        this.mMatrixValueToPx.mapRect(rectF);
        this.f23669a.mapRect(rectF);
        this.f23670b.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectToPixelPhase(RectF rectF, float f) {
        if (rectF == null) {
            LogUtil.e("HwHealthTransformer", "rectToPixelPhase rectF == null");
            return;
        }
        rectF.top *= f;
        rectF.bottom *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.f23669a.mapRect(rectF);
        this.f23670b.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectToPixelPhaseHorizontal(RectF rectF, float f) {
        c(rectF, f);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectValueToPixelHorizontal(RectF rectF) {
        if (rectF == null) {
            LogUtil.e("HwHealthTransformer", "rectValueToPixelHorizontal rectF == null");
            return;
        }
        this.mMatrixValueToPx.mapRect(rectF);
        this.f23669a.mapRect(rectF);
        this.f23670b.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void rectValueToPixelHorizontal(RectF rectF, float f) {
        c(rectF, f);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public Matrix getValueToPixelMatrix() {
        this.d.set(this.mMatrixValueToPx);
        this.d.postConcat(this.f23669a);
        this.d.postConcat(this.f23670b);
        this.d.postConcat(this.mViewPortHandler.getMatrixTouch());
        this.d.postConcat(this.mMatrixOffset);
        return this.d;
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void pixelsToValue(float[] fArr) {
        Matrix matrix = this.mPixelToValueMatrixBuffer;
        matrix.reset();
        this.mMatrixOffset.invert(matrix);
        matrix.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().invert(matrix);
        matrix.mapPoints(fArr);
        this.f23670b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f23669a.invert(matrix);
        matrix.mapPoints(fArr);
        this.mMatrixValueToPx.invert(matrix);
        matrix.mapPoints(fArr);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.Entry] */
    public float[] d(IHwHealthLineDataSet iHwHealthLineDataSet, float f, float f2, int i, int i2) {
        int i3 = (((int) ((i2 - i) * f)) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesLine.length != i3) {
            this.valuePointsForGenerateTransformedValuesLine = new float[i3];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesLine;
        if (iHwHealthLineDataSet == null) {
            LogUtil.e("HwHealthTransformer", "generateTransformedValuesLine data == null");
            return fArr;
        }
        int entryCount = iHwHealthLineDataSet.getEntryCount();
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = (i4 / 2) + i;
            if (i5 >= entryCount) {
                break;
            }
            ?? entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i5);
            if (entryForIndex != 0) {
                fArr[i4] = entryForIndex.getX();
                fArr[i4 + 1] = entryForIndex.getY() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public void c(RectF rectF, float f) {
        if (rectF == null) {
            LogUtil.e("HwHealthTransformer", "rectValueToPixelHorizontal rectF == null");
            return;
        }
        rectF.left *= f;
        rectF.right *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.f23669a.mapRect(rectF);
        this.f23670b.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }
}
