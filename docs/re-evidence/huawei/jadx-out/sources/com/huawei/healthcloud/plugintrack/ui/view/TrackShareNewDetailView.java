package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.qrs;

/* JADX INFO: loaded from: classes10.dex */
public class TrackShareNewDetailView extends LinearLayout {
    private int d;
    private Context e;

    public TrackShareNewDetailView(Context context) {
        super(context);
        this.e = context;
        a();
    }

    public TrackShareNewDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        a();
    }

    private void a() {
        Context context = this.e;
        if (context != null && (context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager)) {
            WindowManager windowManager = (WindowManager) this.e.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            this.d = point.x;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d + qrs.d(this.e, 58.0f), 1073741824));
    }
}
