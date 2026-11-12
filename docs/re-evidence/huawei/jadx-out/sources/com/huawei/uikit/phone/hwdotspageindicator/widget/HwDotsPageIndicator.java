package com.huawei.uikit.phone.hwdotspageindicator.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.huawei.uikit.hwdotspageindicator.R;

/* JADX INFO: loaded from: classes20.dex */
public class HwDotsPageIndicator extends com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicator {
    public HwDotsPageIndicator(Context context) {
        this(context, null);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicator, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        d(canvas, getCurrentBgColor());
        if (c()) {
            e(canvas, null);
        }
    }

    public HwDotsPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwDotsPageIndicatorStyle);
    }

    public HwDotsPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
