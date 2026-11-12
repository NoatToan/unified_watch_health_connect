package com.xiaomi.fitness.health.threetarget.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.x44;

/* JADX INFO: loaded from: classes9.dex */
public class TargetWeekBarItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12316b;
    public ThreeTargetView c;

    public TargetWeekBarItemView(Context context) {
        this(context, null);
    }

    public void a(String str, DailyGoalReport dailyGoalReport, boolean z) {
        this.f12316b.setText(str);
        int color = z ? Color.parseColor("#FD5F2C") : x44.a(iji.r3);
        if (TimeDateUtil.isFuture(dailyGoalReport.getTime())) {
            color = x44.a(iji.q2);
        }
        this.f12316b.setTextColor(color);
        this.c.x(dailyGoalReport, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12316b = (TextView) findViewById(eri.ui);
        this.c = (ThreeTargetView) findViewById(eri.fi);
    }

    public TargetWeekBarItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TargetWeekBarItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12315a = context;
        LayoutInflater.from(context).inflate(jui.J8, this);
    }
}
