package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.media3.common.C;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;

/* JADX INFO: loaded from: classes13.dex */
public class SpeedRecyclerView extends HealthRecycleView {
    public SpeedRecyclerView(Context context) {
        super(context);
    }

    public SpeedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpeedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.ui.commonui.recycleview.HealthRecycleView, com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView, androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        return super.fling(c(i), c(i2));
    }

    private int c(int i) {
        if (i > 0) {
            return Math.min(i, 3000);
        }
        return Math.max(i, C.PRIORITY_PLAYBACK_PRELOAD);
    }
}
