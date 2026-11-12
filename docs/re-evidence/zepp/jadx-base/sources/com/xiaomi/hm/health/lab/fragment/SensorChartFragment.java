package com.xiaomi.hm.health.lab.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.adapter.NmeaLogAdapter;
import com.xiaomi.hm.health.lab.fragment.SensorChartFragment;
import com.xiaomi.hm.health.lab.utils.LabTools;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import com.xiaomi.hm.health.lab.view.BehaviorTagsLineChartView;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class SensorChartFragment extends Fragment implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private static final long F = 300;
    private int C;
    private int D;
    private int E;
    private BehaviorTagsLineChartView a;
    private BehaviorTagsLineChartView b;
    private LinearLayout c;
    private LinearLayout d;
    private ImageView e;
    private CheckBox f;
    private ImageView g;
    private CheckBox h;
    private int i;
    private int j;
    private LinearLayout k;
    private View l;
    private BehaviorTagsLineChartView m;
    private RelativeLayout n;
    private RelativeLayout o;
    private LinearLayout p;
    private LinearLayout q;
    private TextView r;
    private TextView s;
    private TextView t;
    private RecyclerView u;
    private NmeaLogAdapter v;
    private RainbowTitleBar w;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private int A = 0;
    private int B = 0;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SensorChartFragment.this.c.setLayoutParams(new LinearLayout.LayoutParams(-1, SensorChartFragment.this.getResources().getDimensionPixelSize(R.dimen.gsensor_container_height)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            SensorChartFragment.this.a.setLayoutParams(layoutParams);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SensorChartFragment.this.d.setLayoutParams(new LinearLayout.LayoutParams(-1, SensorChartFragment.this.getResources().getDimensionPixelSize(R.dimen.ppgsensor_container_height)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            SensorChartFragment.this.b.setLayoutParams(layoutParams);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class c implements Animator.AnimatorListener {
        public final /* synthetic */ LinearLayout a;
        public final /* synthetic */ BehaviorTagsLineChartView b;
        public final /* synthetic */ RectF c;

        public c(LinearLayout linearLayout, BehaviorTagsLineChartView behaviorTagsLineChartView, RectF rectF) {
            this.a = linearLayout;
            this.b = behaviorTagsLineChartView;
            this.c = rectF;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(BehaviorTagsLineChartView behaviorTagsLineChartView, RectF rectF, LinearLayout linearLayout) {
            SensorChartFragment sensorChartFragment = SensorChartFragment.this;
            sensorChartFragment.U(true, behaviorTagsLineChartView, rectF, linearLayout, sensorChartFragment.C);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            SensorChartFragment sensorChartFragment = SensorChartFragment.this;
            sensorChartFragment.C = sensorChartFragment.n.getHeight() + SensorChartFragment.this.p.getHeight();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            SensorChartFragment sensorChartFragment = SensorChartFragment.this;
            sensorChartFragment.C = sensorChartFragment.o.getHeight() + SensorChartFragment.this.q.getHeight();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RelativeLayout relativeLayout = SensorChartFragment.this.n;
            final BehaviorTagsLineChartView behaviorTagsLineChartView = this.b;
            final RectF rectF = this.c;
            final LinearLayout linearLayout = this.a;
            relativeLayout.post(new Runnable() { // from class: com.xiaomi.hm.health.lab.fragment.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(behaviorTagsLineChartView, rectF, linearLayout);
                }
            });
            SensorChartFragment.this.k = this.a;
            SensorChartFragment.this.m = this.b;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a.getId() != SensorChartFragment.this.c.getId()) {
                if (this.a.getId() == SensorChartFragment.this.d.getId()) {
                    SensorChartFragment.this.o.setVisibility(0);
                    SensorChartFragment.this.g.setVisibility(8);
                    SensorChartFragment.this.h.setVisibility(8);
                    SensorChartFragment.this.o.post(new Runnable() { // from class: com.xiaomi.hm.health.lab.fragment.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.f();
                        }
                    });
                    return;
                }
                return;
            }
            SensorChartFragment.this.n.setVisibility(0);
            SensorChartFragment.this.r.setVisibility(0);
            SensorChartFragment.this.s.setVisibility(0);
            SensorChartFragment.this.t.setVisibility(0);
            SensorChartFragment.this.e.setVisibility(8);
            SensorChartFragment.this.f.setVisibility(8);
            if (SensorChartFragment.this.y) {
                SensorChartFragment.this.d.setVisibility(8);
            }
            SensorChartFragment.this.n.post(new Runnable() { // from class: com.xiaomi.hm.health.lab.fragment.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            });
        }
    }

    public class d implements Animator.AnimatorListener {
        public final /* synthetic */ LinearLayout a;
        public final /* synthetic */ BehaviorTagsLineChartView b;
        public final /* synthetic */ RectF c;

        public d(LinearLayout linearLayout, BehaviorTagsLineChartView behaviorTagsLineChartView, RectF rectF) {
            this.a = linearLayout;
            this.b = behaviorTagsLineChartView;
            this.c = rectF;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SensorChartFragment sensorChartFragment = SensorChartFragment.this;
            sensorChartFragment.U(false, this.b, this.c, this.a, sensorChartFragment.C);
            SensorChartFragment.this.k = null;
            SensorChartFragment.this.m = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a.getId() != SensorChartFragment.this.c.getId()) {
                if (this.a.getId() == SensorChartFragment.this.d.getId()) {
                    SensorChartFragment.this.o.setVisibility(8);
                    SensorChartFragment.this.g.setVisibility(0);
                    SensorChartFragment.this.h.setVisibility(0);
                    SensorChartFragment sensorChartFragment = SensorChartFragment.this;
                    sensorChartFragment.C = sensorChartFragment.q.getHeight();
                    return;
                }
                return;
            }
            SensorChartFragment.this.n.setVisibility(8);
            SensorChartFragment.this.r.setVisibility(8);
            SensorChartFragment.this.s.setVisibility(8);
            SensorChartFragment.this.t.setVisibility(8);
            SensorChartFragment.this.e.setVisibility(0);
            SensorChartFragment.this.f.setVisibility(0);
            if (SensorChartFragment.this.y) {
                SensorChartFragment.this.d.setVisibility(0);
            }
            SensorChartFragment sensorChartFragment2 = SensorChartFragment.this;
            sensorChartFragment2.C = sensorChartFragment2.p.getHeight();
        }
    }

    private void G(TextView textView) {
        this.r.setAlpha(0.5f);
        this.s.setAlpha(0.5f);
        this.t.setAlpha(0.5f);
        textView.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (this.c.getVisibility() == 4) {
            this.c.setVisibility(0);
            this.a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        if (this.u.getVisibility() == 8) {
            this.u.setVisibility(0);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) {
        if (this.u.canScrollVertically(1)) {
            this.v.addNmeaData(str);
        } else {
            this.v.addNmeaData(str);
            this.u.scrollToPosition(this.v.getData().size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        if (this.d.getVisibility() == 4) {
            this.d.setVisibility(0);
            this.b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RectF L(float f, RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF();
        float f2 = rectF.top;
        rectF3.top = f2 + ((rectF2.top - f2) * f);
        float f3 = rectF.left;
        rectF3.left = f3 + ((rectF2.left - f3) * f);
        float f4 = rectF.right;
        rectF3.right = f4 + ((rectF2.right - f4) * f);
        float f5 = rectF.bottom;
        rectF3.bottom = f5 + ((rectF2.bottom - f5) * f);
        return rectF3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(BehaviorTagsLineChartView behaviorTagsLineChartView, LinearLayout linearLayout, ValueAnimator valueAnimator) {
        U(false, behaviorTagsLineChartView, (RectF) valueAnimator.getAnimatedValue(), linearLayout, this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(BehaviorTagsLineChartView behaviorTagsLineChartView, LinearLayout linearLayout, ValueAnimator valueAnimator) {
        U(false, behaviorTagsLineChartView, (RectF) valueAnimator.getAnimatedValue(), linearLayout, this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RectF O(float f, RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF();
        float f2 = rectF.top;
        rectF3.top = f2 + ((rectF2.top - f2) * f);
        float f3 = rectF.left;
        rectF3.left = f3 + ((rectF2.left - f3) * f);
        float f4 = rectF.right;
        rectF3.right = f4 + ((rectF2.right - f4) * f);
        float f5 = rectF.bottom;
        rectF3.bottom = f5 + ((rectF2.bottom - f5) * f);
        return rectF3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        this.a.setLineColor(getResources().getIntArray(R.array.lab_gesnsor_lines_color), 4);
        this.A = this.a.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.b.setLineColor(getResources().getIntArray(R.array.lab_ppgesnsor_lines_color), 2);
        this.B = this.b.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(View view, int i, ValueAnimator valueAnimator) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, i + ((Integer) valueAnimator.getAnimatedValue()).intValue()));
        view.requestLayout();
    }

    private void S(final LinearLayout linearLayout, final BehaviorTagsLineChartView behaviorTagsLineChartView) {
        if (linearLayout == null) {
            return;
        }
        ((BaseBehaviorTaggingActivity) getActivity()).onNormalScreenMode(true);
        int statusBarHeight = LabTools.getStatusBarHeight(getContext());
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight() - statusBarHeight;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, Key.ROTATION, -0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, "translationX", 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayout, "translationY", 0.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        RectF rectF = new RectF(linearLayout.getLeft(), linearLayout.getTop(), this.i, this.j);
        valueAnimator.setObjectValues(new RectF(0.0f, 0.0f, measuredWidth, measuredHeight), rectF);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setEvaluator(new TypeEvaluator() { // from class: in6
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                return SensorChartFragment.O(f, (RectF) obj, (RectF) obj2);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mn6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.a.N(behaviorTagsLineChartView, linearLayout, valueAnimator2);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, valueAnimator);
        animatorSet.addListener(new d(linearLayout, behaviorTagsLineChartView, rectF));
        animatorSet.start();
    }

    private ValueAnimator T(final int i, final View view, int... iArr) {
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ln6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SensorChartFragment.R(view, i, valueAnimator);
            }
        });
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.start();
        return duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(boolean z, BehaviorTagsLineChartView behaviorTagsLineChartView, RectF rectF, LinearLayout linearLayout, int i) {
        behaviorTagsLineChartView.reSize(z, (int) rectF.bottom, ((int) rectF.right) - i);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams((int) rectF.bottom, (int) rectF.right));
    }

    public void addGSensorData(List<float[]> list) {
        if (!this.x) {
            this.x = true;
            this.c.post(new Runnable() { // from class: sn6
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.H();
                }
            });
        }
        BehaviorTagsLineChartView behaviorTagsLineChartView = this.a;
        if (behaviorTagsLineChartView != null) {
            behaviorTagsLineChartView.addData(list);
        }
    }

    public void addNmeaData(final String str) {
        if (!this.z) {
            this.z = true;
            this.u.post(new Runnable() { // from class: rn6
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.I();
                }
            });
        }
        this.u.post(new Runnable() { // from class: jn6
            @Override // java.lang.Runnable
            public final void run() {
                this.a.J(str);
            }
        });
    }

    public void addPPGSensorData(List<float[]> list) {
        if (!this.y) {
            this.y = true;
            this.d.post(new Runnable() { // from class: qn6
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.K();
                }
            });
        }
        this.b.addData(list);
    }

    public void displayNmea() {
        View view = this.l;
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.lab_nmae_chart_bg));
        this.v = new NmeaLogAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.u.getContext());
        linearLayoutManager.setOrientation(1);
        this.u.setLayoutManager(linearLayoutManager);
        this.v.bindToRecyclerView(this.u);
        this.w.setTitle(R.string.action_nmea);
    }

    public void fullScreen(final LinearLayout linearLayout, final BehaviorTagsLineChartView behaviorTagsLineChartView) {
        this.i = linearLayout.getHeight();
        this.j = linearLayout.getWidth();
        ((BaseBehaviorTaggingActivity) getActivity()).onFullScreenMode(true);
        int statusBarHeight = LabTools.getStatusBarHeight(getContext());
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight() - statusBarHeight;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, Key.ROTATION, 90.0f);
        int i = (measuredWidth - measuredHeight) / 2;
        float[] fArr = new float[1];
        fArr[0] = LabTools.isRTL() ? -i : i;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, "translationX", fArr);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayout, "translationY", (statusBarHeight - i) - linearLayout.getTop());
        ValueAnimator valueAnimator = new ValueAnimator();
        RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
        valueAnimator.setObjectValues(new RectF(linearLayout.getLeft(), linearLayout.getTop(), this.i, this.j), rectF);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setEvaluator(new TypeEvaluator() { // from class: kn6
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                return SensorChartFragment.L(f, (RectF) obj, (RectF) obj2);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nn6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.a.M(behaviorTagsLineChartView, linearLayout, valueAnimator2);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, valueAnimator);
        animatorSet.addListener(new c(linearLayout, behaviorTagsLineChartView, rectF));
        animatorSet.start();
    }

    public boolean isInFullScreenMode() {
        return (this.k == null || this.m == null) ? false : true;
    }

    public void normalAll() {
        LinearLayout linearLayout = this.k;
        if (linearLayout == null || this.m == null) {
            return;
        }
        if (linearLayout.getId() == this.c.getId()) {
            S(this.k, this.a);
        } else if (this.k.getId() == this.d.getId()) {
            S(this.k, this.b);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        if (id == R.id.cbx_show_hide_gsensor) {
            Analytics.event(getActivity(), StatEvent.LAB_TAGGING_CHART_DATACOLLECTION_DISPLAY, "Acceleration");
            if (!z) {
                this.e.setVisibility(0);
                int i = this.A;
                T(i, this.a, -i, 0).addListener(new a());
                return;
            } else {
                this.e.setVisibility(4);
                this.c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.a.setLayoutParams(new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.gsensor_chart_height)));
                int i2 = this.A;
                T(i2, this.a, 0, -i2);
                return;
            }
        }
        if (id == R.id.cbx_show_hide_ppgsensor) {
            Analytics.event(getActivity(), StatEvent.LAB_TAGGING_CHART_DATACOLLECTION_DISPLAY, SportAnalytics.ParamValue.DataName.HEARTRATE);
            if (!z) {
                this.g.setVisibility(0);
                int i3 = this.B;
                T(i3, this.b, -i3, 0).addListener(new b());
            } else {
                this.g.setVisibility(4);
                this.d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.b.setLayoutParams(new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.ppgsensor_chart_height)));
                T(this.B, this.b, 0, -this.A);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imv_gesnsor_normal) {
            S(this.c, this.a);
            return;
        }
        if (id == R.id.imv_ppgesnsor_normal) {
            S(this.d, this.b);
            return;
        }
        if (id == R.id.imv_fullscreen_gsensor) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_TAGGING_CHART_DATACOLLECTION_FULL).setValue("Acceleration"));
            fullScreen(this.c, this.a);
            return;
        }
        if (id == R.id.imv_fullscreen_ppgsensor) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_TAGGING_CHART_DATACOLLECTION_FULL).setValue(SportAnalytics.ParamValue.DataName.HEARTRATE));
            fullScreen(this.d, this.b);
            return;
        }
        if (id == R.id.tx_lable_x) {
            G(this.r);
            this.a.setShowValueIndex(0);
        } else if (id == R.id.tx_lable_y) {
            G(this.s);
            this.a.setShowValueIndex(1);
        } else if (id == R.id.tx_lable_z) {
            G(this.t);
            this.a.setShowValueIndex(2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_gsensor_chart, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        int i;
        this.l = view.findViewById(R.id.ll_root);
        this.a = (BehaviorTagsLineChartView) view.findViewById(R.id.hlcv_gsensor);
        BehaviorTagsLineChartView behaviorTagsLineChartView = (BehaviorTagsLineChartView) view.findViewById(R.id.hlcv_ppgsensor);
        this.b = behaviorTagsLineChartView;
        int i2 = this.D;
        if (i2 != 0 && (i = this.E) != 0) {
            behaviorTagsLineChartView.updateSensorTaskParams(i2, i);
        }
        this.e = (ImageView) view.findViewById(R.id.imv_fullscreen_gsensor);
        this.g = (ImageView) view.findViewById(R.id.imv_fullscreen_ppgsensor);
        this.e.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.f = (CheckBox) view.findViewById(R.id.cbx_show_hide_gsensor);
        this.h = (CheckBox) view.findViewById(R.id.cbx_show_hide_ppgsensor);
        this.p = (LinearLayout) view.findViewById(R.id.ll_gsensor_bar);
        this.q = (LinearLayout) view.findViewById(R.id.ll_ppgsensor_bar);
        this.f.setOnCheckedChangeListener(this);
        this.h.setOnCheckedChangeListener(this);
        this.a.post(new Runnable() { // from class: on6
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P();
            }
        });
        this.b.post(new Runnable() { // from class: pn6
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q();
            }
        });
        this.c = (LinearLayout) view.findViewById(R.id.ll_gsensor);
        this.d = (LinearLayout) view.findViewById(R.id.ll_ppgsensor);
        this.c.setPersistentDrawingCache(1);
        this.d.setPersistentDrawingCache(1);
        this.n = (RelativeLayout) view.findViewById(R.id.title_bar_gsensor);
        this.o = (RelativeLayout) view.findViewById(R.id.title_bar_ppgsensor);
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) view.findViewById(R.id.tv_title_bar);
        this.w = rainbowTitleBar;
        rainbowTitleBar.setNavigationIcon((Drawable) null);
        this.r = (TextView) view.findViewById(R.id.tx_lable_x);
        this.s = (TextView) view.findViewById(R.id.tx_lable_y);
        this.t = (TextView) view.findViewById(R.id.tx_lable_z);
        this.r.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.u = (RecyclerView) view.findViewById(R.id.rcv_nmea_log);
        ImageView imageView = (ImageView) view.findViewById(R.id.imv_gesnsor_normal);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.imv_ppgesnsor_normal);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        super.onViewCreated(view, bundle);
    }

    public void updateChartParamsOfPPG(int i, int i2) {
        this.D = i;
        this.E = i2;
    }
}
