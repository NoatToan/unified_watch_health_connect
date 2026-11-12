package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;

/* JADX INFO: loaded from: classes16.dex */
public class qkt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f46401c;
    private float e;
    private float g;
    private float h;
    private float i;
    private float j;
    private Matrix d = new Matrix();
    private int o = 40;
    private int f = HeartRateThresholdConfig.HEART_RATE_LIMIT;

    public void b(float f, float f2, float f3, float f4) {
        this.f46399a = f;
        this.e = f2;
        this.f46400b = f3;
        this.f46401c = f4;
    }

    public void c(float f, float f2, float f3, float f4) {
        this.i = f;
        this.g = f2;
        this.h = f3;
        this.j = f4;
    }

    public void d(int i, int i2) {
        this.o = i;
        this.f = i2;
    }

    public void c() {
        this.d.reset();
        float[] fArr = {0.0f, this.f, 501.0f, this.o};
        this.d.postTranslate(-this.f46399a, -this.f46400b);
        this.d.mapPoints(fArr);
        Log.i("ChartContentTransform", "matrix anchor(postTranslate -mDataAreaMinX,-mDataAreaMinY):" + fArr[0] + " " + fArr[1] + " " + fArr[2] + " " + fArr[3]);
        this.d.postScale(1.0f, -1.0f);
        this.d.mapPoints(fArr);
        Log.i("ChartContentTransform", "matrix anchor(postScale 1 -1):" + fArr[0] + " " + fArr[1] + " " + fArr[2] + " " + fArr[3]);
        float f = this.f46401c - this.f46400b;
        this.d.postTranslate(0.0f, f);
        this.d.mapPoints(fArr);
        Log.i("ChartContentTransform", "matrix anchor(postTranslate 0 dataAreaHeight):" + fArr[0] + " " + fArr[1] + " " + fArr[2] + " " + fArr[3]);
        this.d.postScale((this.g - this.i) / (this.e - this.f46399a), (this.j - this.h) / f);
        this.d.mapPoints(fArr);
        Log.i("ChartContentTransform", "matrix anchor(postScale drawingAreaWidth/dataAreaWidth drawingAreaHeight/dataAreaHeight):" + fArr[0] + " " + fArr[1] + " " + fArr[2] + " " + fArr[3]);
    }

    public void d(float[] fArr) {
        this.d.mapPoints(fArr);
    }

    public void c(RectF rectF) {
        this.d.mapRect(rectF);
    }
}
