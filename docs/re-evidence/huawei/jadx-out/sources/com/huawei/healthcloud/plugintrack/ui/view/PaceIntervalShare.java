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
import defpackage.jpx;

/* JADX INFO: loaded from: classes10.dex */
public class PaceIntervalShare extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jpx f11270a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f11271c;
    private HealthColumnSystem d;

    public PaceIntervalShare(Context context, MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        super(context);
        d(context, motionPath, motionPathSimplify);
    }

    public PaceIntervalShare(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PaceIntervalShare(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void d(Context context, MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (context == null) {
            LogUtil.j("Track_PaceIntervalShare", "context is null");
            return;
        }
        this.f11270a = new jpx(motionPath, motionPathSimplify, context, motionPathSimplify.requestSportType());
        View viewInflate = View.inflate(context, R.layout.track_share_viewholder_pace_parent, this);
        this.d = new HealthColumnSystem(context);
        float[] fArrD = this.f11270a.d(motionPathSimplify.requestSportType(), this.d, true);
        this.f11271c = fArrD;
        this.f11270a.d(viewInflate, fArrD, this.d, true);
        this.f11270a.b();
    }
}
