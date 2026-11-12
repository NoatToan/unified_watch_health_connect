package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class WeightScrollScaleView extends ScrollScaleView {
    public WeightScrollScaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public WeightScrollScaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }

    private void d() {
        setCustomStartColor(getContext().getColor(R.color.weight_primary_color));
        this.f23879c = -1;
    }

    @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView
    public void setSelectedPosition(int i) {
        super.setSelectedPosition(b(i));
    }

    public int b(int i) {
        if (i < 0) {
            i = 0;
        }
        return i > getSumScale() + (-1) ? getSumScale() - 1 : i;
    }
}
