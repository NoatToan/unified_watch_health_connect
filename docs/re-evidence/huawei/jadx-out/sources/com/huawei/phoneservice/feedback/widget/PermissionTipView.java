package com.huawei.phoneservice.feedback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.huawei.phoneservice.feedback.R;

/* JADX INFO: loaded from: classes41.dex */
public class PermissionTipView extends RelativeLayout {
    private void e(Context context) {
        LayoutInflater.from(context).inflate(R.layout.feedback_sdk_widget_permission_tip, this);
    }

    public PermissionTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    public PermissionTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public PermissionTipView(Context context) {
        super(context);
        e(context);
    }
}
