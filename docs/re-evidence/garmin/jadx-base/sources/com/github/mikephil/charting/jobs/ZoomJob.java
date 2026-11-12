package com.github.mikephil.charting.jobs;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
public class ZoomJob extends ViewPortJob {
    private static ObjectPool<ZoomJob> pool;
    protected YAxis.AxisDependency axisDependency;
    protected Matrix mRunMatrixBuffer;
    protected float scaleX;
    protected float scaleY;

    static {
        ObjectPool<ZoomJob> objectPoolCreate = ObjectPool.create(1, new ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    public ZoomJob(ViewPortHandler viewPortHandler, float f14, float f15, float f16, float f17, Transformer transformer, YAxis.AxisDependency axisDependency, View view2) {
        super(viewPortHandler, f16, f17, transformer, view2);
        this.mRunMatrixBuffer = new Matrix();
        this.scaleX = f14;
        this.scaleY = f15;
        this.axisDependency = axisDependency;
    }

    public static ZoomJob getInstance(ViewPortHandler viewPortHandler, float f14, float f15, float f16, float f17, Transformer transformer, YAxis.AxisDependency axisDependency, View view2) {
        ZoomJob zoomJob = (ZoomJob) pool.get();
        zoomJob.xValue = f16;
        zoomJob.yValue = f17;
        zoomJob.scaleX = f14;
        zoomJob.scaleY = f15;
        zoomJob.mViewPortHandler = viewPortHandler;
        zoomJob.mTrans = transformer;
        zoomJob.axisDependency = axisDependency;
        zoomJob.f52822view = view2;
        return zoomJob;
    }

    public static void recycleInstance(ZoomJob zoomJob) {
        pool.recycle(zoomJob);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        Matrix matrix = this.mRunMatrixBuffer;
        this.mViewPortHandler.zoom(this.scaleX, this.scaleY, matrix);
        this.mViewPortHandler.refresh(matrix, this.f52822view, false);
        float scaleY = ((BarLineChartBase) this.f52822view).getAxis(this.axisDependency).mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = ((BarLineChartBase) this.f52822view).getXAxis().mAxisRange / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        fArr[0] = this.xValue - (scaleX / 2.0f);
        fArr[1] = (scaleY / 2.0f) + this.yValue;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.f52822view, false);
        ((BarLineChartBase) this.f52822view).calculateOffsets();
        this.f52822view.postInvalidate();
        recycleInstance(this);
    }
}
