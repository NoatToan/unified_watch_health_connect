package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import defpackage.lrd;
import defpackage.qqz;
import defpackage.qre;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class DaySingleViewDataObserverView extends ScrollChartObserverView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f27141a;
    private HealthTextView ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27143c;
    private final Context d;
    private HealthDivider e;
    private LinearLayout f;
    private View g;
    private LinearLayout h;
    private HealthDivider i;
    private HealthTextView j;
    private RelativeLayout k;
    private HealthImageView l;
    private HealthImageView m;
    private HealthButton n;
    private HealthCardView o;
    private ScrollChartObserverView p;
    private RelativeLayout q;
    private RelativeLayout r;
    private LinearLayout s;
    private HealthTextView t;
    private HealthDivider u;
    private HealthTextView v;
    private HealthTextView w;
    private View x;
    private HealthRecycleView y;

    public DaySingleViewDataObserverView(Context context) {
        super(context, null, null, null);
        this.d = BaseApplication.b();
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.single_data_step_transfer_view, this);
        this.u = (HealthDivider) findViewById(R.id.day_tip_divider);
        this.v = (HealthTextView) findViewById(R.id.day_step_data_description);
        this.h = (LinearLayout) findViewById(R.id.day_distance_description);
        this.i = (HealthDivider) findViewById(R.id.day_distance_description_divider);
        this.f27142b = (LinearLayout) findViewById(R.id.day_calorie_description);
        this.e = (HealthDivider) findViewById(R.id.day_calorie_description_divider);
        this.f = (LinearLayout) findViewById(R.id.day_step_progress_layout);
        this.f27143c = (HealthTextView) findViewById(R.id.step_away_from_target);
        this.n = (HealthButton) findViewById(R.id.jump_to_sport_share_btn);
        this.f27141a = (RelativeLayout) findViewById(R.id.day_step_jump_to_sport_layout);
        this.x = findViewById(R.id.day_step_target_layout);
        this.j = (HealthTextView) findViewById(R.id.day_step_target_edit);
        HealthImageView healthImageView = (HealthImageView) findViewById(R.id.day_step_target_edit_icon);
        this.l = healthImageView;
        healthImageView.setImageDrawable(qqz.c(this.d, R.drawable.ic_edit));
        this.g = findViewById(R.id.day_step_target_edit_accessibility);
        this.w = (HealthTextView) findViewById(R.id.day_step_target_progress);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.hrv_step_source);
        this.y = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        this.o = (HealthCardView) findViewById(R.id.bind_wechat_layout);
        ((HealthImageView) findViewById(R.id.img_wechat)).setImageDrawable(qqz.c(this.d, R.drawable.ic_adduser_icon_wechat));
        this.ab = (HealthTextView) findViewById(R.id.bind_wechat);
        this.m = (HealthImageView) findViewById(R.id.close_bind_wechat);
        this.t = (HealthTextView) findViewById(R.id.step_source_management);
        this.s = (LinearLayout) findViewById(R.id.step_source_title_layout);
        ((HealthSubHeader) findViewById(R.id.hsh_step_source_title)).setSubHeaderBackgroundColor(qre.e(R.color.common_transparent));
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.day_step_target_sub_header);
        healthSubHeader.setSubHeaderBackgroundColor(qre.e(R.color.common_transparent));
        LinearLayout parentLayout = healthSubHeader.getParentLayout();
        if (parentLayout != null) {
            parentLayout.setPadding(0, parentLayout.getPaddingTop(), 0, parentLayout.getPaddingBottom());
        }
    }

    public void c(ScrollChartObserverView scrollChartObserverView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3) {
        this.p = scrollChartObserverView;
        int i = 0;
        if (relativeLayout == null) {
            this.e.setVisibility(8);
            this.f27142b.setVisibility(8);
        } else {
            this.k = relativeLayout;
            this.e.setVisibility(0);
            this.f27142b.setVisibility(0);
            this.f27142b.addView(relativeLayout);
        }
        if (relativeLayout2 == null) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            this.r = relativeLayout2;
            this.i.setVisibility(0);
            this.h.setVisibility(0);
            this.h.addView(relativeLayout2);
        }
        HealthTextView healthTextView = this.v;
        if (this.f27142b.getVisibility() != 0 && this.h.getVisibility() != 0) {
            i = 8;
        }
        healthTextView.setVisibility(i);
        this.q = relativeLayout3;
        this.f.addView(relativeLayout3);
    }

    public ScrollChartObserverView c() {
        return this.p;
    }

    public RelativeLayout d() {
        return this.q;
    }

    public HealthRecycleView e() {
        return this.y;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        this.p.onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
    }

    public HealthTextView getTargetTextView() {
        return this.w;
    }

    public void setTargetLayoutVisibility(int i) {
        View view = this.x;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    public void setEditTargetVisibility(int i) {
        HealthTextView healthTextView = this.j;
        if (healthTextView != null) {
            healthTextView.setVisibility(i);
        }
        HealthImageView healthImageView = this.l;
        if (healthImageView != null) {
            healthImageView.setVisibility(i);
        }
        setEditTargetAccessibilityVisibility(i);
    }

    public void setEditTargetAccessibilityVisibility(int i) {
        if (this.g == null) {
            ReleaseLogUtil.d("DaySingleViewDataObserverView", "setEditTargetAccessibilityVisibility mEditTargetAccessibility is null");
        } else if (lrd.d()) {
            lrd.a(this.g, qre.f(R.string.IDS_edit_target), (Class<?>) Button.class);
            this.g.setVisibility(i);
        } else {
            this.g.setVisibility(8);
        }
    }

    public void setEditTargetOnClickListener(View.OnClickListener onClickListener) {
        HealthTextView healthTextView = this.j;
        if (healthTextView != null) {
            healthTextView.setOnClickListener(onClickListener);
        }
        HealthImageView healthImageView = this.l;
        if (healthImageView != null) {
            healthImageView.setOnClickListener(onClickListener);
        }
        View view = this.g;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    private void a() {
        LinearLayout linearLayout;
        if (this.f27141a == null || (linearLayout = this.f27142b) == null || this.h == null || linearLayout.getVisibility() != 8 || this.h.getVisibility() != 8) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f27141a.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, qre.b(R.dimen.health_common_8dp), 0, qre.b(R.dimen.health_common_8dp));
            this.f27141a.setLayoutParams(layoutParams2);
        }
    }

    public void setTipVisibility(int i) {
        RelativeLayout relativeLayout = this.f27141a;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(i);
        HealthDivider healthDivider = this.u;
        if (healthDivider != null) {
            healthDivider.setVisibility(i);
        }
        a();
    }

    public int getTipVisibility() {
        RelativeLayout relativeLayout = this.f27141a;
        if (relativeLayout == null) {
            return 8;
        }
        return relativeLayout.getVisibility();
    }

    public void setTipText(CharSequence charSequence) {
        if (this.f27141a == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f27141a.setVisibility(8);
            HealthDivider healthDivider = this.u;
            if (healthDivider != null) {
                healthDivider.setVisibility(8);
                return;
            }
            return;
        }
        HealthTextView healthTextView = this.f27143c;
        if (healthTextView == null) {
            return;
        }
        healthTextView.setText(charSequence);
    }

    public void setTipButton(CharSequence charSequence, View.OnClickListener onClickListener) {
        if (this.n == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.n.setText(charSequence);
        this.n.setOnClickListener(onClickListener);
    }

    public void setTipButton(int i, CharSequence charSequence, View.OnClickListener onClickListener) {
        if (this.n == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.n.setText(charSequence);
        this.n.setTextColor(qre.e(i));
        this.n.setOnClickListener(onClickListener);
    }

    public HealthTextView getSourceManagement() {
        return this.t;
    }

    public LinearLayout getSourceLayout() {
        return this.s;
    }

    public void setOnClickGoBindWeChatListener(View.OnClickListener onClickListener) {
        HealthTextView healthTextView = this.ab;
        if (healthTextView != null) {
            healthTextView.setOnClickListener(onClickListener);
        }
    }

    public void setOnCloseWeChatLayoutListener(View.OnClickListener onClickListener) {
        HealthImageView healthImageView = this.m;
        if (healthImageView != null) {
            healthImageView.setOnClickListener(onClickListener);
        }
    }

    public void setWeChatLayoutVisibility(int i) {
        HealthCardView healthCardView = this.o;
        if (healthCardView != null) {
            healthCardView.setVisibility(i);
        }
    }
}
