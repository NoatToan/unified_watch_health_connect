package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.ActivityNotFoundException;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.basesport.controls.ControlButtonLayout;
import com.huawei.health.basesport.sportui.OnEndCountdownListener;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed;
import com.huawei.healthcloud.plugintrack.ui.activity.SportBaseActivity;
import com.huawei.healthcloud.plugintrack.ui.view.CanvasChangeView;
import com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton;
import com.huawei.healthcloud.plugintrack.ui.view.MusicControlLayout;
import com.huawei.healthcloud.plugintrack.ui.view.SquareProgress;
import com.huawei.healthcloud.plugintrack.ui.view.ToolsLayout;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.CameraGlView;
import com.huawei.healthcloud.plugintrack.ui.viewholder.CountdownDialog;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SkippingViewModel;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.ive;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.jhl;
import defpackage.jpm;
import defpackage.jqi;
import defpackage.jub;
import defpackage.juc;
import defpackage.jud;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public class SkippingFragment extends BaseSportingFragment implements IOnBackPressed {
    private static final int e = jhl.c(BaseApplication.getContext(), 16.0f);
    private jud aa;
    private HealthTextView ab;
    private HealthTextView ac;
    private View ad;
    private HealthTextView ae;
    private HealthTextView af;
    private jub ag;
    private HealthTextView ai;
    private SquareProgress aj;
    private SkippingViewModel ak;
    private ImageButton al;
    private ViewGroup am;
    private CanvasChangeView an;
    private ViewGroup ao;
    private HealthTextView ap;
    private ImageButton aq;
    private ToolsLayout ar;
    private ImageButton as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f11084c;
    private HealthTextView d;
    private ViewGroup f;
    private View g;
    private ControlButtonLayout h;
    private CountdownDialog i;
    private View j;
    private ViewGroup l;
    private ImageView m;
    private View n;
    private juc o;
    private ViewGroup p;
    private HealthProgressBar q;
    private HealthTextView s;
    private HealthColumnLinearLayout t;
    private NoTitleCustomAlertDialog u;
    private RelativeLayout x;
    private MusicControlLayout y;
    private CameraGlView z;
    private boolean v = false;
    private boolean r = false;
    private Handler k = new a(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11082a = R.string.IDS_track_skip_keep_into_screen;
    private int ah = 0;
    private ImageButton w = null;
    private int au = -1;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        return R.layout.skipping_sport_fragment;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        BaseActivity.cancelLayoutById(view);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        view.setPaddingRelative(((Integer) safeRegionWidth.first).intValue(), view.getPaddingTop(), ((Integer) safeRegionWidth.second).intValue(), view.getPaddingBottom());
        this.z = (CameraGlView) view.findViewById(R.id.camera_pre_view);
        c(view);
        a(view);
        CountdownDialog countdownDialog = new CountdownDialog(getContext(), view);
        this.i = countdownDialog;
        countdownDialog.setTimeStart(3);
        this.i.enableGo();
        this.i.addEndCountdown(new OnEndCountdownListener() { // from class: jnx
            @Override // com.huawei.health.basesport.sportui.OnEndCountdownListener
            public final void endCountdown() {
                this.d.l();
            }
        });
        View viewFindViewById = view.findViewById(R.id.track_main_page_perm_bg);
        this.g = viewFindViewById;
        viewFindViewById.setBackgroundResource(R.color.transparent);
        this.ar = (ToolsLayout) view.findViewById(R.id.sport_control_layout);
        g();
    }

    private void g() {
        this.aa = new jud(this.f);
        this.ag = new jub(this.ad);
        this.o = new juc(this.m, this.l);
    }

    private void c(View view) {
        this.an = (CanvasChangeView) view.findViewById(R.id.sport_data_view);
        View viewFindViewById = view.findViewById(R.id.data_panel_layout);
        this.j = viewFindViewById;
        viewFindViewById.setPaddingRelative(viewFindViewById.getPaddingStart(), qrs.s(view.getContext()), this.j.getPaddingEnd(), this.j.getPaddingBottom());
        this.n = view.findViewById(R.id.left_data);
        this.ai = (HealthTextView) view.findViewById(R.id.left_first_data);
        this.af = (HealthTextView) view.findViewById(R.id.left_second_data);
        this.ab = (HealthTextView) view.findViewById(R.id.right_first_data);
        this.q = (HealthProgressBar) view.findViewById(R.id.target_progress);
        this.f11083b = (HealthTextView) view.findViewById(R.id.body_status_tips);
        this.ac = (HealthTextView) view.findViewById(R.id.skip_data_source_tips);
        this.f11084c = (ImageView) view.findViewById(R.id.right_top_image);
        if (LanguageUtil.f(getContext())) {
            this.f11083b.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline3));
        } else {
            this.f11083b.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline4));
        }
        this.ae = (HealthTextView) view.findViewById(R.id.skip_interrupt_times);
        this.m = (ImageView) view.findViewById(R.id.skip_encourage_img);
        this.f = (ViewGroup) view.findViewById(R.id.countinues_skip_layout);
        this.ad = view.findViewById(R.id.skip_animation_layout);
        this.l = (ViewGroup) view.findViewById(R.id.explode_animation);
        this.w = (ImageButton) view.findViewById(R.id.track_main_page_sport_music);
        this.x = (RelativeLayout) view.findViewById(R.id.music_and_ai_icon_layout);
        this.w.setOnClickListener(new View.OnClickListener() { // from class: joc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38765c.h(view2);
            }
        });
        e(view);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        if (qrs.c(600)) {
            LogUtil.e("Track_SkippingSportingFragment", "CLICK IS FAST");
            return;
        }
        try {
            LogUtil.a("Track_SkippingSportingFragment", "startActivity(intent);");
            this.ak.i();
        } catch (ActivityNotFoundException unused) {
            LogUtil.a("Track_SkippingSportingFragment", "music ActivityNotFoundException ");
        }
    }

    private void e(View view) {
        MusicControlLayout musicControlLayout = (MusicControlLayout) view.findViewById(R.id.music_content_layout);
        this.y = musicControlLayout;
        musicControlLayout.setIsExpandAnimation(true);
        this.t = (HealthColumnLinearLayout) view.findViewById(R.id.music_column_layout);
        this.y.setSportTypeDrawable(false, 283);
        this.y.b();
        this.as = (ImageButton) view.findViewById(R.id.switch_camera_pre_sport_button);
        this.aq = (ImageButton) view.findViewById(R.id.switch_camera_in_sport_button);
        this.al = (ImageButton) view.findViewById(R.id.switch_camera_ecology_rope_button);
        b(view);
    }

    private void b(View view) {
        this.ap = (HealthTextView) view.findViewById(R.id.switch_camera_pre_sport_pop);
        if (!SportSupportUtil.e() || !SportSupportUtil.c()) {
            this.ap.setVisibility(8);
            return;
        }
        final jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        if (jaqVar.t()) {
            this.ap.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: jod
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f38767b.d(jaqVar, view2);
                }
            });
        } else {
            this.ap.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(jaq jaqVar, View view) {
        this.ap.setVisibility(8);
        jaqVar.b(false);
    }

    private void b() {
        new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002)).b(false);
        this.ap.setVisibility(8);
    }

    private void af() {
        boolean zE = SportSupportUtil.e();
        boolean zC = SportSupportUtil.c();
        if (zE && zC) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SkippingFragment.this.z();
                }
            };
            this.as.setOnClickListener(onClickListener);
            this.aq.setOnClickListener(onClickListener);
            this.al.setOnClickListener(onClickListener);
            return;
        }
        this.aq.setVisibility(8);
        this.as.setVisibility(8);
        this.al.setVisibility(8);
        if (zE) {
            ae();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (qrs.c(600)) {
            LogUtil.e("Track_SkippingSportingFragment", "CLICK IS FAST");
        } else {
            ae();
            b();
        }
    }

    private void ae() {
        boolean z = !this.z.d();
        this.z.d(z);
        this.ak.e(z);
    }

    private void d(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.heart_rate_calorie_container);
        this.p = viewGroup;
        if (viewGroup == null) {
            LogUtil.a("Track_SkippingSportingFragment", "initHeartRateView: mHeartRateContainer is null");
            return;
        }
        this.s = (HealthTextView) viewGroup.findViewById(R.id.left_heart_rate_value);
        this.d = (HealthTextView) this.p.findViewById(R.id.right_calorie_value);
        ThreadPoolManager.c().execute(new Runnable() { // from class: jog
            @Override // java.lang.Runnable
            public final void run() {
                this.d.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        final boolean zN = ive.c().n();
        this.k.post(new Runnable() { // from class: joe
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(zN);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z) {
        if (z) {
            this.p.setVisibility(0);
        } else {
            LogUtil.a("Track_SkippingSportingFragment", "initHeartRateView: not connected wear device");
            this.p.setVisibility(8);
        }
    }

    private void f() {
        this.x.setPadding(0, this.j.getHeight(), 0, 0);
        if (this.ak.a()) {
            this.t.setVisibility(8);
            this.w.setVisibility(8);
            LogUtil.a("Track_SkippingSportingFragment", "button is gone");
        } else if (this.ak.b().h(283) == 1 && jaa.c(getContext())) {
            this.t.setVisibility(0);
            this.w.setVisibility(8);
            LogUtil.a("Track_SkippingSportingFragment", "mini is VISIBLE");
        } else {
            this.t.setVisibility(8);
            this.w.setVisibility(0);
            LogUtil.a("Track_SkippingSportingFragment", "button is VISIBLE");
        }
    }

    public void e() {
        if (this.y != null) {
            if (!SportMusicController.c().a()) {
                LogUtil.a("Track_SkippingSportingFragment", "refreshMusicLayout  tryBindService");
                this.y.e(283);
            }
            this.y.b();
            SkippingViewModel skippingViewModel = this.ak;
            if (skippingViewModel == null) {
                LogUtil.j("Track_SkippingSportingFragment", "mSkippingViewModel == null");
                this.t.setVisibility(8);
                this.w.setVisibility(0);
            } else if (skippingViewModel.a()) {
                LogUtil.a("Track_SkippingSportingFragment", "refreshMusicLayout is not support");
                this.t.setVisibility(8);
                this.w.setVisibility(8);
            } else if (this.ak.b().h(283) == 1 && jaa.c(getContext())) {
                this.t.setVisibility(0);
                this.y.d(true);
                this.w.setVisibility(8);
                LogUtil.a("Track_SkippingSportingFragment", "refreshMusicLayout icon is gone");
            }
        }
    }

    private void a(View view) {
        this.am = (ViewGroup) view.findViewById(R.id.pre_sport_layout);
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.title_bar);
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jnw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38761a.g(view2);
            }
        });
        customTitleBar.setLeftButtonDrawable(c(R.drawable.ic_commonui_round_return), qre.f(R.string.accessibility_go_back));
        jpm.d(this.am);
        SquareProgress squareProgress = (SquareProgress) view.findViewById(R.id.pre_progress);
        this.aj = squareProgress;
        squareProgress.setPaddingRelative(squareProgress.getPaddingStart(), qrs.s(view.getContext()), this.aj.getPaddingEnd(), this.aj.getPaddingBottom());
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.how_to_use_layout);
        this.ao = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: jny
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.f(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        ad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        FragmentActivity activity = getActivity();
        if (activity instanceof SportBaseActivity) {
            ((SportBaseActivity) activity).c(1);
        }
    }

    private void ag() {
        boolean zN = n();
        ViewGroup viewGroup = this.ao;
        if (viewGroup != null) {
            viewGroup.setVisibility(zN ? 0 : 8);
        }
        ImageButton imageButton = this.as;
        if (imageButton != null && !zN) {
            imageButton.setVisibility(8);
        }
        HealthTextView healthTextView = this.ap;
        if (healthTextView == null || zN) {
            return;
        }
        healthTextView.setVisibility(8);
    }

    private boolean n() {
        SkippingViewModel skippingViewModel = this.ak;
        if (skippingViewModel != null) {
            return skippingViewModel.getDataSource() == 7;
        }
        LogUtil.e("Track_SkippingSportingFragment", "isAiSkip skip viewModel is null");
        return false;
    }

    private void ad() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e("Track_SkippingSportingFragment", "onTitleBarBackBtnClicked activity is null");
        } else {
            onBackPressed();
            activity.finish();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed
    public void onBackPressed() {
        aa();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a(getLogTag(), "onResume()");
        super.onResume();
        if (getActivity() != null) {
            getActivity().getWindow().addFlags(128);
        }
        if (n()) {
            this.ak.onResumeSport();
        }
        y();
        ag();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        LogUtil.a(getLogTag(), "onPause()");
        super.onPause();
        if (getActivity() != null) {
            getActivity().getWindow().clearFlags(128);
        }
        if (n()) {
            this.ak.onPauseSport();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        if (z && getActivity() != null) {
            getActivity().getWindow().setFlags(16778240, 16778240);
        }
        super.setUserVisibleHint(z);
        SkippingViewModel skippingViewModel = this.ak;
        if (skippingViewModel != null) {
            skippingViewModel.b(z);
        }
    }

    private void h() {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.ai.setTypeface(typefaceCreateFromAsset);
        this.af.setTypeface(typefaceCreateFromAsset);
        this.ab.setTypeface(typefaceCreateFromAsset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ah, reason: merged with bridge method [inline-methods] */
    public void l() {
        this.ak.onStartSport();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        SkippingViewModel skippingViewModel = (SkippingViewModel) new ViewModelProvider(requireActivity()).get(SkippingViewModel.class);
        this.ak = skippingViewModel;
        if (!skippingViewModel.e()) {
            this.ak.b(true);
        }
        i();
        this.ak.d();
        this.au = ((Integer) this.ak.getSportLaunchParams().getExtra("trackFrom", Integer.class, -1)).intValue();
        LogUtil.a(getLogTag(), "initViewModel mTrackFrom = ", Integer.valueOf(this.au));
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ac();
    }

    private void ac() {
        ViewGroup viewGroup = this.am;
        if (viewGroup != null) {
            jpm.d(viewGroup);
            ((CustomTitleBar) this.am.findViewById(R.id.title_bar)).setLeftButtonDrawable(c(R.drawable.ic_commonui_round_return), qre.f(R.string.accessibility_go_back));
            ((ImageView) this.am.findViewById(R.id.how_to_use_icon)).setImageDrawable(c(R.drawable.ic_skip_how_to_use));
        }
        HealthTextView healthTextView = this.f11083b;
        if (healthTextView != null) {
            healthTextView.setText(getString(this.f11082a));
            if (LanguageUtil.f(getContext())) {
                this.f11083b.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline3));
            } else {
                this.f11083b.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline4));
            }
        }
        ak();
        w();
    }

    private Drawable c(int i) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            return qqz.e(BaseApplication.getContext(), i);
        }
        return getResources().getDrawable(i);
    }

    private void i() {
        x();
        r();
        p();
        w();
        q();
        u();
        s();
        t();
        k();
    }

    private void w() {
        SkippingViewModel skippingViewModel = this.ak;
        if (skippingViewModel == null) {
            LogUtil.j("Track_SkippingSportingFragment", "observeSportTarget, mSkippingViewModel is null");
        } else if (skippingViewModel.getSportTarget() == 5) {
            this.af.setText(getResources().getString(R.string.IDS_track_slash_separator_one, Integer.valueOf((int) this.ak.getTargetValue())));
            this.ak.observeSportingData("targetProgress", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda18
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.f11086a.j(obj);
                }
            });
        } else {
            this.af.setVisibility(8);
            this.q.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Object obj) {
        if (obj instanceof Integer) {
            this.q.setProgress(((Integer) obj).intValue());
        }
    }

    private void q() {
        this.ak.observeSportingData("bodyDetectionError", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda19
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.c(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        if (obj instanceof Integer) {
            e(((Integer) obj).intValue());
        }
    }

    private void r() {
        this.ak.observeSportingData("preSportProgress", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.b(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        if (obj instanceof Integer) {
            d(((Integer) obj).intValue());
        }
    }

    private void aa() {
        SkippingViewModel skippingViewModel = this.ak;
        if (skippingViewModel == null) {
            LogUtil.j("Track_SkippingSportingFragment", "removePreProgressObservers, mSkippingViewModel is null");
        } else {
            skippingViewModel.removeSportDataObservers("preSportProgress", this);
        }
    }

    private void s() {
        this.ak.observeSportingData("encourageType", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda21
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.d(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj) {
        this.o.startAnimation(obj);
    }

    private void u() {
        this.ak.observeSportingData("showSportTime", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11088a.m(obj);
            }
        });
        if (this.ak.getSportTarget() == 0) {
            this.ak.observeSportingData("sportTimeCountDown", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda6
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.e.n(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Object obj) {
        if (obj != null) {
            this.ab.setText(obj.toString());
            jpm.e(this.n, this.ab, this.ai, this.af);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Object obj) {
        this.ab.setTextColor(getResources().getColor(R.color.colorError));
    }

    private void p() {
        this.ak.observeSportingData("skipTimes", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda8
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11089a.g(obj);
            }
        });
        this.ak.observeSportingData("skipContinuouslyTimes", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda9
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.f(obj);
            }
        });
        this.ak.observeSportingData("footPosition", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda10
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.i(obj);
            }
        });
        this.ak.observeSportingData("interruptTimes", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda12
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11085c.h(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Object obj) {
        LogUtil.j("Track_SkippingSportingFragment", "SKIPPING_TIMES update");
        if (obj instanceof Integer) {
            this.ah = ((Integer) obj).intValue();
            ak();
            this.ai.startAnimation(jqi.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Object obj) {
        LogUtil.j("Track_SkippingSportingFragment", "SKIP_CONTINUOUSLY_TIMES update");
        if (!(obj instanceof Integer) || ((Integer) obj).intValue() <= 0) {
            return;
        }
        this.aa.startAnimation(String.valueOf(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Object obj) {
        this.ag.startAnimation(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Object obj) {
        Message messageObtainMessage = this.k.obtainMessage(1);
        messageObtainMessage.obj = obj;
        messageObtainMessage.sendToTarget();
    }

    private void t() {
        this.ak.observeSportingData(IndoorEquipManagerApi.KEY_HEART_RATE, this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda20
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11087a.e(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Object obj) {
        if (this.s != null && (obj instanceof Integer)) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue >= 255 || iIntValue <= 0) {
                this.s.setText("--");
            } else {
                this.s.setText(UnitUtil.e(iIntValue, 1, 0));
            }
        }
    }

    private void k() {
        this.ak.observeSportingData("calorie", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.a(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        HealthTextView healthTextView = this.d;
        if (healthTextView != null && (obj instanceof Integer)) {
            healthTextView.setText(UnitUtil.e(((Integer) obj).intValue(), 1, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        HealthTextView healthTextView = this.s;
        if (healthTextView != null) {
            healthTextView.setText("--");
        }
    }

    private void d(int i) {
        this.aj.setProgress(i);
        if (i >= 100) {
            AnimationSet animationSetI = jqi.i();
            animationSetI.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    SkippingFragment.this.am.setVisibility(8);
                    SkippingFragment.this.ak.onCountDown();
                    SportMusicController.c().e(283);
                }
            });
            this.am.startAnimation(animationSetI);
        }
    }

    private void e(int i) {
        if (i == 1001 || i == 1002 || i == 1003) {
            int i2 = R.string.IDS_track_skip_keep_into_screen;
            this.f11082a = i2;
            this.f11083b.setText(getString(i2));
        } else if (i == 1004) {
            int i3 = R.string.IDS_track_skip_closer_tip;
            this.f11082a = i3;
            this.f11083b.setText(getString(i3));
        } else {
            d();
            return;
        }
        ai();
    }

    private void x() {
        this.ak.observeSportLifeCycle(getLogTag(), this);
    }

    private void ak() {
        HealthTextView healthTextView = this.ai;
        if (healthTextView == null) {
            LogUtil.j("Track_SkippingSportingFragment", "updateSkipTimes mSkippingTimesText is null.");
        } else {
            healthTextView.setText(UnitUtil.e(this.ah, 1, 0));
            jpm.e(this.n, this.ab, this.ai, this.af);
        }
    }

    private void ai() {
        this.v = true;
        if (this.ae.getVisibility() != 0) {
            this.f11083b.setVisibility(0);
        }
    }

    private void d() {
        this.v = false;
        this.f11083b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.ae.setText(R.string.IDS_track_skip_interrupt_plus_one);
        this.ae.setVisibility(0);
        this.f11083b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.ae.setVisibility(8);
        if (this.v) {
            this.f11083b.setVisibility(0);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onCountDown() {
        this.g.setVisibility(0);
        this.i.startCountdown();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.g.setVisibility(8);
        this.an.setVisibility(0);
        this.j.startAnimation(jqi.b());
        this.j.setVisibility(0);
        if (this.ac != null && this.ak.getDataSource() == 5) {
            this.ac.setVisibility(0);
            this.f11084c.setVisibility(0);
            this.ac.setText(getResources().getString(R.string.IDS_rope_device_tip));
            this.k.sendEmptyMessageDelayed(3, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
        this.j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jnv
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.d.m();
            }
        });
        this.ar.setVisibility(0);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        f();
        d(this.j);
    }

    private void j() {
        SkippingViewModel skippingViewModel;
        if (ive.c().m() && (skippingViewModel = this.ak) != null && skippingViewModel.getSportTarget() != 5 && this.ak.getSportTarget() != 0) {
            ControlButtonLayout controlButtonLayout = this.ar.getControlButtonLayout();
            this.h = controlButtonLayout;
            controlButtonLayout.setClickCallback(new IBaseResponseCallback() { // from class: job
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f38764c.d(i, obj);
                }
            });
            ToolsLayout toolsLayout = this.ar;
            toolsLayout.setShowOrHideView(toolsLayout.getEcologyRopeControlPanelLayout());
        } else {
            CircleProgressButton circleProgressButton = this.ar.getCircleProgressButton();
            ToolsLayout toolsLayout2 = this.ar;
            toolsLayout2.setShowOrHideView(toolsLayout2.getBottomPanel());
            circleProgressButton.b(new CircleProgressButton.CircleProcessListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment.4
                @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
                public void onCancel() {
                }

                @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
                public void onStarted() {
                }

                @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
                public void onFinished() {
                    SkippingFragment.this.a();
                }
            });
        }
        this.ar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, Object obj) {
        SkippingViewModel skippingViewModel = this.ak;
        if (skippingViewModel == null) {
            LogUtil.a("Track_SkippingSportingFragment", "mViewModel == null ", Integer.valueOf(i));
            return;
        }
        if (i == 101) {
            skippingViewModel.onPauseSport();
            this.ar.getAnimateCallback().a(101, 101);
        } else if (i == 100) {
            skippingViewModel.onResumeSport();
            this.ar.getAnimateCallback().a(100, 100);
        } else if (i == 102) {
            this.ar.getAnimateCallback().a(102, 102);
            a();
        } else {
            LogUtil.j("Track_SkippingSportingFragment", "error code ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.ak.isToSave()) {
            this.ak.m825x32b3e3a1();
        } else {
            d(true);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        int i;
        int i2;
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.u;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.j("Track_SkippingSportingFragment", "LittleDataDialog is showing");
            return;
        }
        this.r = true;
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getContext());
        if (z) {
            i = R.string.IDS_track_abnormal_end_tip;
        } else {
            i = R.string.IDS_indoor_skipper_rope_times_no_record_tips;
        }
        NoTitleCustomAlertDialog.Builder builderB = builder.b(i);
        if (z) {
            i2 = R.string.IDS_motiontrack_show_sport_dialog_finish;
        } else {
            i2 = R.string.IDS_hwh_motiontrack_track_crash_dialog_confirm;
        }
        NoTitleCustomAlertDialog.Builder builderC = builderB.c(i2, new View.OnClickListener() { // from class: joa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38763b.i(view);
            }
        });
        if (z) {
            builderC.a(R.string.IDS_motiontrack_show_sport_dialog_continue, new View.OnClickListener() { // from class: jnz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38762c.j(view);
                }
            });
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderC.c();
        this.u = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.u.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        this.ak.m825x32b3e3a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.r = false;
        LogUtil.j("Track_SkippingSportingFragment", "continue to sport");
    }

    private void v() {
        MusicControlLayout musicControlLayout = this.y;
        if (musicControlLayout != null) {
            musicControlLayout.setMusicPause();
        }
    }

    private void y() {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SkippingFragment.2
            @Override // java.lang.Runnable
            public void run() {
                if (SkippingFragment.this.y != null && SkippingFragment.this.ak.b().h(283) == 1 && SkippingFragment.this.ak.getSportStatus() == 1) {
                    SkippingFragment.this.y.setMusicPlay();
                }
                if (SkippingFragment.this.j == null || SkippingFragment.this.j.getVisibility() != 0) {
                    return;
                }
                SkippingFragment.this.e();
            }
        });
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a("Track_SkippingSportingFragment", "onPauseSport");
        if (this.h != null) {
            this.k.sendEmptyMessage(5);
        }
        v();
        this.k.sendEmptyMessage(7);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a("Track_SkippingSportingFragment", "onResumeSport");
        if (this.h != null) {
            this.k.sendEmptyMessage(6);
        }
        y();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        Bundle bundleC;
        if (!this.ak.isToSave()) {
            LogUtil.j("Track_SkippingSportingFragment", "data can't save with little data");
            NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.u;
            if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
                LogUtil.j("Track_SkippingSportingFragment", "data can't save with little data is showing return");
                return;
            } else {
                if (!this.r) {
                    this.k.sendEmptyMessage(4);
                    return;
                }
                ive.c().a(283, -1L);
                this.ak.c();
                getActivity().finish();
                return;
            }
        }
        MotionPath motionPath = this.ak.getMotionPath();
        MotionPathSimplify motionPathSimplify = this.ak.getMotionPathSimplify();
        if (motionPath != null && motionPathSimplify != null && (bundleC = ive.c().c("motion_path2.txt", motionPathSimplify, Collections.EMPTY_LIST, true, false)) != null) {
            bundleC.putSerializable("entrance", "fromTrackMainMap");
            e(motionPathSimplify, bundleC);
        }
        this.ak.c();
        getActivity().finish();
    }

    private void e(MotionPathSimplify motionPathSimplify, Bundle bundle) {
        ReleaseLogUtil.d("Track_SkippingSportingFragment", "sendSportResult trackFrom = ", Integer.valueOf(this.au));
        if (this.au == 1) {
            ive.c().a(283, motionPathSimplify.getExtendDataInt("skipNum", 0));
        } else {
            ive.c().c(bundle);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initData() {
        if (n()) {
            this.z.setOnPreviewListener(this.ak);
            this.z.c(true);
        } else {
            this.z.c(false);
            SkippingViewModel skippingViewModel = this.ak;
            if (skippingViewModel != null) {
                skippingViewModel.onPreSport();
            }
        }
        af();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return "Track_SkippingSportingFragment";
    }

    static class a extends BaseHandler<SkippingFragment> {
        a(Looper looper, SkippingFragment skippingFragment) {
            super(looper, skippingFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SkippingFragment skippingFragment, Message message) {
            switch (message.what) {
                case 1:
                    Object obj = message.obj;
                    if (obj instanceof Integer) {
                        skippingFragment.a(((Integer) obj).intValue());
                        removeMessages(2);
                        sendMessageDelayed(obtainMessage(2), 2000L);
                    }
                    break;
                case 2:
                    skippingFragment.c();
                    break;
                case 3:
                    LogUtil.a("Track_SkippingSportingFragment", "MSG_HIDE_ECOLOGY_TIPS enter");
                    skippingFragment.ac.setVisibility(8);
                    break;
                case 4:
                    skippingFragment.d(false);
                    break;
                case 5:
                    skippingFragment.h.showBtnStopAndPlay();
                    skippingFragment.ar.getAnimateCallback().a(101, 101);
                    break;
                case 6:
                    skippingFragment.h.b();
                    skippingFragment.ar.getAnimateCallback().a(100, 100);
                    break;
                case 7:
                    skippingFragment.ab();
                    break;
            }
        }
    }
}
