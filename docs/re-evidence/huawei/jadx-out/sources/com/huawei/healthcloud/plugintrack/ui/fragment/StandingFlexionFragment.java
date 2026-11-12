package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed;
import com.huawei.healthcloud.plugintrack.ui.view.CanvasChangeView;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.StandingFlexionViewModel;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.tencent.open.apireq.BaseResp;
import defpackage.jhl;
import defpackage.jpm;
import defpackage.jqi;
import defpackage.jta;
import defpackage.jtb;
import defpackage.jth;
import defpackage.jug;
import defpackage.nue;
import defpackage.qqn;
import defpackage.qqz;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class StandingFlexionFragment extends BaseSportExamFragment implements IOnBackPressed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jtb f11106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jta f11107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f11108c;
    private HealthTextView d;
    private nue e;
    private View i;
    private jug j;
    private View k;
    private View l;
    private HealthNumberPicker m;
    private ImageView n;
    private ImageView o;
    private HealthTextView p;
    private jth q;
    private RelativeLayout r;
    private HealthTextView t;
    private HealthTextView v;
    private StandingFlexionViewModel x;
    private HealthTextView y;
    private int u = 0;
    private int h = R.string.IDS_track_skip_keep_into_screen;
    private int g = 0;
    private int f = 1;
    private boolean s = false;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected boolean isSupportLandScreen() {
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        return R.layout.standing_flexion_fragment;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        super.initView(view);
        d(view);
        b(view);
        i();
    }

    private void d(View view) {
        this.mSportDataView = (CanvasChangeView) view.findViewById(R.id.sport_data_view);
        this.i = view.findViewById(R.id.left_data);
        this.y = (HealthTextView) view.findViewById(R.id.left_first_data);
        this.t = (HealthTextView) view.findViewById(R.id.left_second_data);
        this.o = (ImageView) view.findViewById(R.id.flexion_encourage_img);
        this.l = view.findViewById(R.id.flexion_beam_animation_layout);
        this.n = (ImageView) view.findViewById(R.id.flexion_ware_animation_img);
        this.v = (HealthTextView) view.findViewById(R.id.right_first_data);
        this.m = (HealthNumberPicker) view.findViewById(R.id.score_number_picker);
        this.r = (RelativeLayout) view.findViewById(R.id.score_picker_layout);
        this.d = (HealthTextView) view.findViewById(R.id.body_status_tips);
        this.f11108c = (ImageView) view.findViewById(R.id.bend_img);
        this.k = view.findViewById(R.id.flexion_anim_layout);
        if (LanguageUtil.f(getContext())) {
            this.d.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline5));
        } else {
            this.d.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline4));
        }
        s();
        j();
        h();
    }

    private void h() {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.y.setTypeface(typefaceCreateFromAsset);
        this.v.setTypeface(typefaceCreateFromAsset);
    }

    private void j() {
        String[] strArr = new String[101];
        for (int i = 0; i < 101; i++) {
            strArr[i] = String.valueOf(i);
        }
        this.m.setDisplayedValues(strArr);
        this.m.setMaxValue(100);
        this.m.setMinValue(0);
        this.m.setSecondaryPaintColor(qqn.d(R.color.white));
        this.m.setSelectedItemTextSize(60.0f);
        this.m.setUnselectedItemTextSize(40.0f);
        float fC = jhl.c(this.m.getContext(), 40.0f);
        this.m.e(fC, fC);
        int dimension = (int) getResources().getDimension(com.huawei.ui.commonui.R.dimen.health_common_70dp);
        this.m.setSelectorElementAndTextGapHeight(dimension, dimension);
        this.m.setEnabled(false);
        this.m.setAlpha(1.0f);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        super.onStartSport();
        t();
    }

    private void t() {
        LogUtil.a("Track_StandingFlexionFragment", "startBendAnim mCurrentScore:", Integer.valueOf(this.g), "mDirector", Integer.valueOf(this.f));
        if (this.g < 40) {
            this.f11106a.startAnimation(new Pair(Integer.valueOf(this.f), Integer.valueOf(this.g)));
            int i = R.string.IDS_track_follow_the_prompts;
            this.h = i;
            this.d.setText(getString(i));
            this.d.setVisibility(0);
            this.d.setTextSize(0, getResources().getDimension(R.dimen.health_common_38dp));
            return;
        }
        this.d.setVisibility(8);
    }

    private void b(View view) {
        this.p = (HealthTextView) view.findViewById(R.id.use_tips_2);
        jpm.d(this.mSportPreView);
        if (this.mPreTips != null) {
            this.mPreTips.setText(R.string.IDS_track_side_to_side_screen);
        }
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.signaling);
        healthImageView.setVisibility(0);
        healthImageView.setImageResource(R.drawable.ic_stand_signaling);
        if (!(this.mSportPreView instanceof ConstraintLayout)) {
            LogUtil.j("Track_StandingFlexionFragment", "!(mSportPreView instanceof ConstraintLayout)");
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.constrainWidth(R.id.signaling, -2);
        constraintSet.constrainHeight(R.id.signaling, -2);
        constraintSet.clone((ConstraintLayout) this.mSportPreView);
        constraintSet.setHorizontalBias(R.id.signaling, 0.5f);
        constraintSet.setVerticalBias(R.id.signaling, 0.75f);
        constraintSet.applyTo((ConstraintLayout) this.mSportPreView);
    }

    private void r() {
        if (this.mSportPreView != null) {
            jpm.d(this.mSportPreView);
            ((CustomTitleBar) this.mSportPreView.findViewById(R.id.title_bar)).setLeftButtonDrawable(c(R.drawable.ic_commonui_round_return), qre.f(R.string.accessibility_go_back));
            ((HealthImageView) this.mSportPreView.findViewById(R.id.how_to_use_icon)).setImageDrawable(c(R.drawable.ic_skip_how_to_use));
        }
        s();
    }

    private void i() {
        this.j = new jug(this.o);
        this.q = new jth(this.l, this.n);
        this.f11106a = new jtb(this.f11108c);
        this.f11107b = new jta(this.k);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        jtb jtbVar = this.f11106a;
        if (jtbVar != null) {
            jtbVar.a();
        }
        jta jtaVar = this.f11107b;
        if (jtaVar != null) {
            jtaVar.d();
        }
        jth jthVar = this.q;
        if (jthVar != null) {
            jthVar.a();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        g();
    }

    private void g() {
        if (this.x == null) {
            LogUtil.a("Track_StandingFlexionFragment", "initViewModelObserves failed, mViewModel is null");
            return;
        }
        k();
        o();
        n();
        l();
        m();
        f();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        sendSportResult(this.u);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initData() {
        super.initData();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return "Track_StandingFlexionFragment";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected SportExamViewModel getViewModel() {
        StandingFlexionViewModel standingFlexionViewModel = (StandingFlexionViewModel) new ViewModelProvider(requireActivity()).get(StandingFlexionViewModel.class);
        this.x = standingFlexionViewModel;
        return standingFlexionViewModel;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected void dealProgressEnd() {
        this.mSportPreView.setVisibility(8);
        this.x.onCountDown();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    private Drawable c(int i) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            return qqz.e(BaseApplication.getContext(), i);
        }
        return getResources().getDrawable(i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r();
    }

    private void k() {
        this.x.observeSportingData("preSportProgress", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11111b.a(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        if (obj instanceof Integer) {
            dealPreProgress(((Integer) obj).intValue());
        }
    }

    private void n() {
        this.x.observeSportingData("maxFlexionScore", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11112a.b(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        if (obj instanceof Integer) {
            LogUtil.a("Track_StandingFlexionFragment", "MAX_FLEXION_SCORE update mStandFlexionMaxScore:", Integer.valueOf(this.u), "data：", obj);
            Integer num = (Integer) obj;
            if (num.intValue() > this.u) {
                this.u = num.intValue();
                s();
                this.y.startAnimation(jqi.g());
                this.j.startAnimation(obj);
            }
        }
    }

    private void o() {
        this.x.observeSportingData("standFlexionScore", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11109c.h(obj);
            }
        });
        this.x.observeSportingData("bodyPosition", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11110c.f(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Object obj) {
        LogUtil.a("Track_StandingFlexionFragment", "STAND_FLEXION_SCORE update");
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            num.intValue();
            LogUtil.a("Track_StandingFlexionFragment", "score:", num);
            int iIntValue = num.intValue();
            this.g = iIntValue;
            this.m.setValue(iIntValue);
            c();
            b();
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Object obj) {
        if (obj instanceof nue) {
            nue nueVar = (nue) obj;
            this.e = nueVar;
            int iB = nueVar.b();
            this.f = iB;
            LogUtil.a("Track_StandingFlexionFragment", "mDirector:", Integer.valueOf(iB));
            e();
        }
    }

    private void a() {
        if (this.d == null) {
            LogUtil.j("Track_StandingFlexionFragment", "hideErrorStatusView mBodyStatusTips == null");
            return;
        }
        t();
        ImageView imageView = this.f11108c;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.d.setText(R.string.IDS_track_follow_the_prompts);
            this.d.setVisibility(0);
            this.d.setTextSize(0, getResources().getDimension(R.dimen.health_common_38dp));
            return;
        }
        this.d.setVisibility(8);
    }

    private void c() {
        q();
        d();
        p();
    }

    private void e() {
        if (this.f11108c.getVisibility() == 0) {
            t();
        }
    }

    private void q() {
        this.q.startAnimation(new Pair(this.e, Integer.valueOf(this.g)));
    }

    private void b() {
        if (this.k.getVisibility() == 0) {
            this.d.setVisibility(8);
            this.f11107b.a();
        }
    }

    private void d() {
        if (this.g >= 40) {
            LogUtil.a("Track_StandingFlexionFragment", "hideBendAnim");
            this.d.setVisibility(8);
            this.f11106a.d();
        }
    }

    private void p() {
        if (this.g >= 40) {
            this.r.setVisibility(0);
            this.m.setValue(this.g);
        } else {
            this.r.setVisibility(8);
        }
    }

    private void s() {
        HealthTextView healthTextView = this.y;
        if (healthTextView != null) {
            healthTextView.setText(UnitUtil.e(this.u, 1, 0));
            jpm.e(this.i, this.v, this.y, this.t);
        }
    }

    private void l() {
        this.x.observeSportingData("bodyDetectionError", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.e(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Object obj) {
        if (obj instanceof Integer) {
            this.g = 0;
            c();
            e(((Integer) obj).intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    private void e(int i) {
        dealPreStartSportTips(i, R.string.IDS_track_side_to_side_screen);
        if (i == -11) {
            this.h = R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen;
        } else if (i == -8 || i == 101) {
            this.h = R.string.IDS_track_side_to_side_screen;
        } else if (i == -4) {
            this.h = R.string.IDS_track_skip_closer_tip;
        } else if (i == -3 || i == -2 || i == -1) {
            this.h = R.string.IDS_track_skip_body_into_screen;
            this.f11106a.d();
        } else {
            switch (i) {
                case BaseResp.CODE_PERMISSION_NOT_GRANTED /* -1003 */:
                case BaseResp.CODE_UNSUPPORTED_BRANCH /* -1002 */:
                    this.h = R.string.IDS_track_straight_your_legs;
                    this.f11107b.startAnimation(this.e);
                    this.f11106a.d();
                    break;
                case BaseResp.CODE_QQ_LOW_VERSION /* -1001 */:
                    this.h = R.string.IDS_track_side_to_side_screen;
                    break;
                default:
                    this.d.setVisibility(8);
                    return;
            }
        }
        if (i != -1002 && i != -1003) {
            b();
        }
        this.d.setTextSize(0, getResources().getDimension(R.dimen.health_common_48dp));
        this.d.setText(getString(this.h));
        this.d.setVisibility(0);
    }

    private void m() {
        this.x.observeSportingData("showSportTime", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11113b.d(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj) {
        if (obj != null) {
            this.v.setText(obj.toString());
            jpm.e(this.i, this.v, this.y, this.t);
        }
    }

    private void f() {
        this.x.observeSportingData("isShowBend", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.c(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                t();
            }
            if (this.f11108c.getVisibility() == 0) {
                b();
            }
        }
    }
}
