package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;

/* JADX INFO: loaded from: classes33.dex */
public class TrackShareBottomLayout extends RelativeLayout {
    public TrackShareBottomLayout(Context context) {
        super(context);
        e(context);
    }

    public TrackShareBottomLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    private void e(Context context) {
        if (context == null) {
            return;
        }
        View.inflate(context, R.layout.track_share_bottom_layout, this);
    }
}
