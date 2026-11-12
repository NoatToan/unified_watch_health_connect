package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TargetGoalFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.ui.commonui.timepicker.HealthHourSecondNumberPicker;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.ift;
import defpackage.ltc;
import defpackage.pdy;
import defpackage.qrs;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class TargetGoalFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9913a;
    private ImageView ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9915c;
    private ImageView d;
    private HealthTextView e;
    private ConstraintLayout f;
    private int g;
    private HealthSeekBar k;
    private HealthColumnLinearLayout l;
    private RelativeLayout m;
    private RelativeLayout n;
    private int o;
    private HealthTextView p;
    private HealthHourSecondNumberPicker q;
    private int r;
    private int s;
    private RunPlanCreateActivity.OnNextPageListener t;
    private HealthTextView u;
    private HealthTextView v;
    private int x;
    private HealthProgressBar z;
    private int w = 1;
    private List<View> j = new ArrayList();
    private List<View> i = new ArrayList();
    private HealthSeekBar.OnSeekBarChangeListener y = new HealthSeekBar.OnSeekBarChangeListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TargetGoalFragment.2
        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
        }

        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
        }

        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
            LogUtil.a("Suggestion_TargetGoalFragment", "onProgressChanged() value:", Integer.valueOf(i));
            TargetGoalFragment.this.e(TargetGoalFragment.this.s - i);
        }
    };
    private Handler h = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TargetGoalFragment.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                TargetGoalFragment.this.c();
            }
        }
    };

    public static /* synthetic */ void b(View view) {
    }

    public static TargetGoalFragment c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("planType", i);
        TargetGoalFragment targetGoalFragment = new TargetGoalFragment();
        targetGoalFragment.setArguments(bundle);
        return targetGoalFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.r = arguments.getInt("planType");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9913a = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_target_achievement, viewGroup, false);
        e(viewInflate);
        e();
        return viewInflate;
    }

    private void e(View view) {
        if (view == null) {
            LogUtil.e("Suggestion_TargetGoalFragment", "initView view is null.");
            return;
        }
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.n = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.z = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.ac = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        c(healthTextView);
        this.j.add(healthTextView);
        this.l = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        this.p = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.target_achievement_layout);
        this.j.add(healthCardView);
        this.i.add(healthCardView);
        BaseActivity.setViewSafeRegion(true, healthCardView);
        this.m = (RelativeLayout) view.findViewById(R.id.layout_set_target_time);
        this.v = (HealthTextView) view.findViewById(R.id.target_time);
        this.u = (HealthTextView) view.findViewById(R.id.target_time_dec);
        this.k = (HealthSeekBar) view.findViewById(R.id.run_target_goal_seekbar);
        this.f = (ConstraintLayout) view.findViewById(R.id.forecast_goal_constraintLayout);
        this.d = (ImageView) view.findViewById(R.id.img_arrows_forecast_achieve);
        this.e = (HealthTextView) view.findViewById(R.id.current_forecast_goal_desc);
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.sug_btn_next);
        this.j.add(healthButton);
        this.i.add(healthButton);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TargetGoalFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                FragmentActivity activity = TargetGoalFragment.this.getActivity();
                if (activity != null && !qrs.c(500)) {
                    if (TargetGoalFragment.this.t != null) {
                        TargetGoalFragment.this.t.backLock();
                        ibe.a(false, TargetGoalFragment.this.i);
                        TargetGoalFragment.this.g();
                        ibe.a(TargetGoalFragment.this.n, TargetGoalFragment.this.l, TargetGoalFragment.this.t, true);
                        return;
                    }
                    activity.finish();
                    return;
                }
                LogUtil.j("Suggestion_TargetGoalFragment", "btnNext onClick activity is null or click too fast.");
            }
        });
        ibe.a(true, this.j);
        ibl.a(this.f9913a, 90, this.z, this.ac);
    }

    private void e() {
        this.m.setOnClickListener(new View.OnClickListener() { // from class: iao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37409b.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (qrs.r()) {
            return;
        }
        j();
    }

    private void j() {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f9913a);
        this.q = new HealthHourSecondNumberPicker(this.f9913a, this.o, this.s, this.x);
        builder.b(R.string.IDS_sug_target_achievement).d((View) this.q).c(R.string.IDS_dialog_checkbox_cancel, new View.OnClickListener() { // from class: ian
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TargetGoalFragment.b(view);
            }
        }).d(R.string.IDS_dialog_checkbox_confirm, new View.OnClickListener() { // from class: iak
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        builder.d().show();
    }

    public /* synthetic */ void d(View view) {
        int selectedTime = this.q.getSelectedTime();
        e(selectedTime);
        this.k.setProgress(this.s - selectedTime);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_TargetGoalFragment", "isHidden fragment.");
        } else {
            this.n.setVisibility(0);
            ibe.a(true, this.j);
        }
    }

    private void c(HealthTextView healthTextView) {
        String strD;
        LogUtil.a("Suggestion_TargetGoalFragment", "setTargetGoalAskQuestion mPlanType:", Integer.valueOf(this.r));
        int i = this.r;
        if (i == 3) {
            strD = gzx.d(R.plurals.sug_km, 5, ltc.c(5.0d, 1, 0));
        } else if (i == 4) {
            strD = gzx.d(R.plurals.sug_km, 10, ltc.c(10.0d, 1, 0));
        } else if (i == 5) {
            strD = getResources().getString(R.string.IDS_start_track_show_distance_half_marathon);
        } else {
            strD = i != 6 ? "" : getResources().getString(R.string.IDS_start_track_show_distance_marathon);
        }
        healthTextView.setText(String.format(Locale.ROOT, getString(R.string.IDS_sug_target_score), strD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.k.setMax(this.s - this.o);
        this.k.setTouchable(true);
        this.k.setProgress((int) ((this.s - this.o) * 0.38200003f));
        this.k.setOnSeekBarChangeListener(this.y);
        int i = this.s;
        int i2 = this.o;
        this.x = ((int) ((i - i2) * 0.618f)) + i2;
        this.e.setText(getResources().getString(R.string.IDS_sug_forecast_score, d(this.f9915c)));
        e(this.x);
        d();
    }

    private String d(int i) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "Hms"), Locale.getDefault()).format(new Date(ift.h(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        this.v.setText(d(i));
        this.x = i;
        if (i >= this.f9914b) {
            this.w = 1;
            this.u.setText(getResources().getString(R.string.IDS_sug_easy_target_desc));
        } else if (i >= this.g) {
            this.w = 2;
            this.u.setText(getResources().getString(R.string.IDS_sug_enable_target_desc));
        } else {
            this.w = 3;
            this.u.setText(getResources().getString(R.string.IDS_sug_hard_target_desc));
        }
    }

    private void d() {
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            LogUtil.j("Suggestion_TargetGoalFragment", "params is not ConstraintLayout.LayoutParams.");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i = this.s;
        int i2 = this.o;
        if (i == i2) {
            LogUtil.e("Suggestion_TargetGoalFragment", "mMinAchieve == mMaxAchieve");
            return;
        }
        final float f = ((i - this.f9915c) * 1.0f) / (i - i2);
        layoutParams2.horizontalBias = f;
        this.d.setLayoutParams(layoutParams2);
        this.f.post(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TargetGoalFragment.1
            @Override // java.lang.Runnable
            public void run() {
                int width = TargetGoalFragment.this.f.getWidth() - TargetGoalFragment.this.getResources().getDimensionPixelSize(R.dimen.emui_dimens_max_start);
                float dimension = TargetGoalFragment.this.getResources().getDimension(R.dimen.emui_card_device_6dp);
                float dimension2 = TargetGoalFragment.this.getResources().getDimension(R.dimen.custom_dialog_margin_12dp);
                float width2 = (TargetGoalFragment.this.e.getWidth() - TargetGoalFragment.this.d.getWidth()) / 2.0f;
                float width3 = width - TargetGoalFragment.this.d.getWidth();
                float f2 = f;
                float width4 = TargetGoalFragment.this.d.getWidth() / 2.0f;
                ViewGroup.LayoutParams layoutParams3 = TargetGoalFragment.this.e.getLayoutParams();
                if (!(layoutParams3 instanceof ConstraintLayout.LayoutParams)) {
                    LogUtil.j("Suggestion_TargetGoalFragment", "goalDescLayoutParams is not ConstraintLayout.LayoutParams.");
                    return;
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                float f3 = (((width3 - (dimension * 2.0f)) * f2) + width4) - width2;
                if (f3 > width - TargetGoalFragment.this.e.getWidth()) {
                    layoutParams4.setMarginStart((int) ((width - TargetGoalFragment.this.e.getWidth()) + dimension2));
                } else if (f3 <= 0.0f) {
                    LogUtil.a("Suggestion_TargetGoalFragment", "initForecastView status startMove - moveWidth <= 0");
                    layoutParams4.setMarginStart((int) dimension2);
                } else {
                    LogUtil.a("Suggestion_TargetGoalFragment", "initForecastView status startMove - moveWidth > 0");
                    layoutParams4.setMarginStart((int) (f3 + dimension2));
                }
                TargetGoalFragment.this.e.setLayoutParams(layoutParams4);
            }
        });
    }

    public void a(pdy pdyVar) {
        if (pdyVar == null) {
            LogUtil.e("Suggestion_TargetGoalFragment", "initController update data is null.");
            return;
        }
        this.s = pdyVar.d();
        this.o = pdyVar.b();
        this.f9914b = pdyVar.c();
        this.g = pdyVar.e();
        this.f9915c = pdyVar.a();
        LogUtil.a("Suggestion_TargetGoalFragment", "TrainingPredictionBean", new Gson().toJson(pdyVar));
        this.h.sendMessage(this.h.obtainMessage(0));
    }

    public int b() {
        return this.x;
    }

    public int a() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.p.setText(d(this.x));
    }

    public void e(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.t = onNextPageListener;
    }
}
