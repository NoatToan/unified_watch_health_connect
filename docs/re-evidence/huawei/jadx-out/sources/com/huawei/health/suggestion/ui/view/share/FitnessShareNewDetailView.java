package com.huawei.health.suggestion.ui.view.share;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.qrs;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessShareNewDetailView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10207b;
    private int e;

    public FitnessShareNewDetailView(Context context) {
        super(context);
        this.f10207b = context;
        c();
    }

    public FitnessShareNewDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10207b = context;
        c();
    }

    private void c() {
        Object systemService = this.f10207b.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        this.e = point.x;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e + qrs.d(this.f10207b, 48.0f), 1073741824));
    }
}
