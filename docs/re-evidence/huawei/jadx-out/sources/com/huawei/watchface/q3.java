package com.huawei.watchface;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class q3 extends w {
    public Bitmap w;
    public Canvas x;

    public q3(Bitmap bitmap) {
        super(bitmap);
        this.g = FitnessSleepType.HW_FITNESS_WAKE;
        this.w = Bitmap.createBitmap(FitnessSleepType.HW_FITNESS_WAKE, FitnessSleepType.HW_FITNESS_WAKE, Bitmap.Config.ARGB_8888);
        this.x = new Canvas(this.w);
    }

    @Override // com.huawei.watchface.w
    public void a(Point point) {
        if (point == null) {
            HwLog.e("RadialKaleidoscopeView", "trajectoryPoint is null.");
        } else {
            super.a(point);
            a(this.f30634c, this.x, this.w, this.f30633b, this.f30632a);
        }
    }
}
