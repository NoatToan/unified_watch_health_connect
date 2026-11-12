package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes33.dex */
public class TrackLineTypeDetailItem extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f11341c;

    public TrackLineTypeDetailItem(Context context) {
        super(context);
        this.f11341c = null;
        b(context);
    }

    public TrackLineTypeDetailItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11341c = null;
        b(context);
    }

    private void b(Context context) {
        if (context == null) {
            return;
        }
        View.inflate(context, R.layout.track_share_nyx_swim_detail_item, this);
        this.f11341c = (HealthTextView) findViewById(R.id.track_share_line_type_detail_item_value);
    }
}
