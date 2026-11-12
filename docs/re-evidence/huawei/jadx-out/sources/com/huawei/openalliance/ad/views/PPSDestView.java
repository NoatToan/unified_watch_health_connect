package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.openalliance.ad.lu;

/* JADX INFO: loaded from: classes41.dex */
public class PPSDestView extends FrameLayout implements lu {
    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    public PPSDestView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PPSDestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PPSDestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PPSDestView(Context context) {
        super(context);
    }
}
