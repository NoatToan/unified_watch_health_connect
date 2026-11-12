package com.huawei.ui.homehealth.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwtextview.widget.HwTextView;

/* JADX INFO: loaded from: classes17.dex */
public class HalfWidthTextView extends HwTextView {
    private int d;

    public HalfWidthTextView(Context context) {
        super(context);
        this.d = -1;
        e();
    }

    public HalfWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        e();
    }

    public HalfWidthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        e();
    }

    private void e() {
        getScreenWidth();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d = -1;
        requestLayout();
    }

    @Override // com.huawei.uikit.hwtextview.widget.HwTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getScreenWidth() / 2, 1073741824), i2);
    }

    private int getScreenWidth() {
        WindowManager windowManager;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        Context context = getContext();
        if (context == null || (windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)) == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.d = e(windowManager);
        } else {
            this.d = c(windowManager);
        }
        return this.d;
    }

    private int e(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds().width();
    }

    private int c(WindowManager windowManager) {
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.x;
    }
}
