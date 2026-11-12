package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import defpackage.jps;

/* JADX INFO: loaded from: classes10.dex */
public class AltitudeSlopeIntervalShare extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jps f11229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthColumnSystem f11230c;
    private float[] d;

    public AltitudeSlopeIntervalShare(Context context, MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        super(context);
        e(context, motionPath, motionPathSimplify);
    }

    public AltitudeSlopeIntervalShare(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AltitudeSlopeIntervalShare(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void e(Context context, MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (context == null) {
            LogUtil.j("Track_AltitudeSlopeIntervalShare", "context is null");
            return;
        }
        this.f11229b = new jps(motionPath, motionPathSimplify, context, motionPathSimplify.requestSportType());
        View viewInflate = View.inflate(context, R.layout.track_share_viewholder_altitude_slope_ring, this);
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(context);
        this.f11230c = healthColumnSystem;
        float[] fArrD = this.f11229b.d(healthColumnSystem, true);
        this.d = fArrD;
        this.f11229b.e(viewInflate, fArrD, true);
    }
}
