package com.huawei.ui.commonui.linechart.common;

import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qmh;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthViewPortHandler extends ViewPortHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23672c;

    public HwHealthViewPortHandler(Context context) {
        this.f23672c = context == null ? BaseApplication.getContext() : context;
    }

    @Override // com.github.mikephil.charting.utils.ViewPortHandler
    public Matrix refresh(Matrix matrix, View view, boolean z) {
        boolean z2 = (view instanceof HwHealthBaseScrollBarLineChart) && ((HwHealthBaseScrollBarLineChart) view).acquireChartShowMode() == HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE;
        this.mMatrixTouch.set(matrix);
        if (!z2) {
            limitTransAndScale(this.mMatrixTouch, this.mContentRect);
        }
        if (z && (view instanceof HwHealthBaseBarLineChart)) {
            ((HwHealthBaseBarLineChart) view).invalidateForce();
        }
        if (matrix == null) {
            LogUtil.e("HwHealthViewPortHandler", "refresh newMatrix == null");
            return null;
        }
        matrix.set(this.mMatrixTouch);
        return matrix;
    }

    public void c(Matrix matrix) {
        this.mMatrixTouch.set(matrix);
    }

    public boolean e() {
        float[] fArr = new float[9];
        this.mMatrixTouch.getValues(fArr);
        if (qmh.e(this.f23672c)) {
            return fArr[2] > 0.0f;
        }
        return fArr[2] < 0.0f;
    }
}
