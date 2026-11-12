package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class JumpDataView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f11257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f11258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11259c;
    private HealthDivider d;
    private HealthTextView e;
    private ImageView f;
    private int g;
    private int h;
    private HealthTextView i;
    private ImageView j;
    private HealthDivider k;
    private HealthTextView l;
    private HealthDivider m;
    private RelativeLayout n;
    private HealthTextView o;

    public JumpDataView(Context context) {
        super(context);
        this.h = 0;
        b(context);
    }

    public JumpDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        b(context);
    }

    public JumpDataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 0;
        b(context);
    }

    public RelativeLayout getAverageJumpDurationLayout() {
        return this.f11258b;
    }

    public RelativeLayout getHeightLayout() {
        return this.f11257a;
    }

    public void setJumpDuration(int i) {
        if (i == 0) {
            this.f11258b.setVisibility(8);
            this.k.setVisibility(8);
        } else {
            this.f11259c = i;
            this.e.setText(UnitUtil.e(i, 1, 0));
        }
    }

    public void setJumpTimes(int i) {
        if (i == 0) {
            this.m.setVisibility(8);
            this.n.setVisibility(8);
        } else {
            this.g = i;
            this.l.setText(UnitUtil.e(i, 1, 0));
            this.o.setText(getContext().getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, i));
        }
    }

    public void setJumpHeight(int i) {
        String strE;
        if (i == 0) {
            this.d.setVisibility(8);
            this.f11257a.setVisibility(8);
            return;
        }
        if (UnitUtil.f()) {
            strE = UnitUtil.e((int) UnitUtil.e(i, 0), 1, 0);
            ((HealthTextView) findViewById(R.id.average_jump_height_unit)).setText(getContext().getString(R.string.IDS_ins));
        } else {
            strE = UnitUtil.e(i, 1, 0);
        }
        this.i.setText(strE);
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.e("Track_JumpDataView", "context is null");
            return;
        }
        View.inflate(context, R.layout.track_detail_jump_data, this);
        this.d = (HealthDivider) findViewById(R.id.view_first);
        this.m = (HealthDivider) findViewById(R.id.view_second);
        this.k = (HealthDivider) findViewById(R.id.view_third);
        this.i = (HealthTextView) findViewById(R.id.average_jump_height_value);
        this.l = (HealthTextView) findViewById(R.id.track_jump_times_value);
        this.e = (HealthTextView) findViewById(R.id.average_jump_time_full_value);
        this.o = (HealthTextView) findViewById(R.id.track_jump_times_unit);
        this.i.setText(UnitUtil.e(this.f11259c, 1, 0));
        this.l.setText(UnitUtil.e(this.g, 1, 0));
        this.e.setText(UnitUtil.e(this.h, 1, 0));
        this.f11257a = (RelativeLayout) findViewById(R.id.average_height_layout);
        this.n = (RelativeLayout) findViewById(R.id.jump_times);
        this.f11258b = (RelativeLayout) findViewById(R.id.jump_duration);
        this.j = (ImageView) findViewById(R.id.jump_time);
        this.f = (ImageView) findViewById(R.id.average_jump_height_ic);
        ((HealthSubHeader) findViewById(R.id.new_header)).setPaddingStartEnd(0.0f, 0.0f);
        if (LanguageUtil.ba(context)) {
            this.j.setImageResource(R.drawable.common_ui_arrow_left);
            this.f.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.j.setImageResource(R.drawable.common_ui_arrow_right);
            this.f.setImageResource(R.drawable.common_ui_arrow_right);
        }
    }
}
