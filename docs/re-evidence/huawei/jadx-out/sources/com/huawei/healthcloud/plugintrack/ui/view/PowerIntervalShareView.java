package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jqe;

/* JADX INFO: loaded from: classes10.dex */
public class PowerIntervalShareView extends LinearLayout {
    private PowerIntervalShareView(Context context) {
        super(context);
    }

    public PowerIntervalShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PowerIntervalShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static PowerIntervalShareView a(Context context, MotionPathSimplify motionPathSimplify, boolean z, boolean z2) {
        PowerIntervalShareView powerIntervalShareView = new PowerIntervalShareView(context);
        powerIntervalShareView.c(context, motionPathSimplify, z, z2);
        return powerIntervalShareView;
    }

    private void c(Context context, MotionPathSimplify motionPathSimplify, boolean z, boolean z2) {
        View viewInflate;
        if (context == null) {
            LogUtil.j("Track_PowerIntervalShareView", "context is null");
            return;
        }
        jqe jqeVar = new jqe(context, motionPathSimplify, z, z2);
        if (z2) {
            viewInflate = View.inflate(context, R.layout.track_share_viewholder_power_zone, this);
        } else {
            viewInflate = View.inflate(context, R.layout.track_share_viewholder_analog_power_zone, this);
        }
        jqeVar.b(viewInflate);
    }
}
