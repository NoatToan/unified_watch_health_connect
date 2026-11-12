package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.AiActionTrainViewModel;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.ddv;
import defpackage.jch;
import defpackage.jcl;
import defpackage.jpm;
import defpackage.jqi;
import defpackage.jxe;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class AiActionTrainFragment extends BaseSportExamFragment implements IOnBackPressed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f11012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f11013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f11014c;
    private HealthTextView d;
    private HealthTextView e;
    private ImageView f;
    private HealthTextView k;
    private HealthImageView l;
    private HealthTextView n;
    private HealthTextView o;
    private AiActionTrainViewModel q;
    private HealthTextView r;
    private int t;
    private NoTitleCustomAlertDialog h = null;
    private final Handler i = new e(Looper.getMainLooper(), this);
    private long g = 0;
    private long m = 0;
    private boolean j = false;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected boolean isSupportLandScreen() {
        return false;
    }

    public AiActionTrainFragment(int i) {
        LogUtil.a("Track_AiActionTrainFragment", "AiActionTrainFragment ", Integer.valueOf(i));
        this.t = i;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    public void startUserGuidance() {
        Bundle bundle = new Bundle();
        bundle.putInt("planType", 1);
        bundle.putBoolean("IS_AI_ACTION", true);
        if (jch.b(this.q.c()) == 1) {
            bundle.putBoolean("AI_ACTION_ORIENTATION", true);
        }
        AppRouter.c("/PluginAiFitnessSportCommon/AIMotionGuidanceActivity").d(bundle).b(BaseApplication.getContext());
        jxe.a(3, this.q.a());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        if (jch.b(this.t) == 0) {
            return R.layout.ai_action_train_fragment;
        }
        return R.layout.ai_action_train_fragment_land;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (jch.b(this.t) == 1 && getActivity() != null) {
            getActivity().setRequestedOrientation(0);
        } else {
            d(this.l);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return "Track_AiActionTrainFragment";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected SportExamViewModel getViewModel() {
        LogUtil.a("Track_AiActionTrainFragment", "getViewModel");
        AiActionTrainViewModel aiActionTrainViewModel = (AiActionTrainViewModel) new ViewModelProvider(requireActivity()).get(AiActionTrainViewModel.class);
        this.q = aiActionTrainViewModel;
        return aiActionTrainViewModel;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected void dealProgressEnd() {
        this.mSportPreView.setVisibility(8);
        this.q.onCountDown();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        super.initView(view);
        LogUtil.a("Track_AiActionTrainFragment", "initView");
        b(view);
        a(view);
        c(view);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        LogUtil.a("Track_AiActionTrainFragment", "initViewModel");
        AiActionTrainViewModel aiActionTrainViewModel = this.q;
        if (aiActionTrainViewModel != null) {
            aiActionTrainViewModel.enableCanStart(true);
        }
        b();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initData() {
        super.initData();
    }

    private void b() {
        a();
        i();
        e();
        f();
        j();
        h();
    }

    private void b(int i) {
        if (!this.j && this.q.getSportStatus() == 1) {
            if (i != 0 && this.g == 0) {
                this.g = this.m;
            }
            if (i == 0) {
                this.g = 0L;
            }
            long j = this.g;
            if (j != 0 && this.m - j > 60) {
                this.j = true;
                this.q.m825x32b3e3a1();
                jxe.e(6, this.q.a(), this.q.e());
            }
        }
    }

    private void a() {
        this.q.observeSportingData("bodyDetectionError", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.e(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            e(num.intValue());
            d(num.intValue());
            b(num.intValue());
        }
    }

    private void i() {
        this.q.observeSportingData("preSportProgress", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11015b.d(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj) {
        if (obj instanceof Integer) {
            dealPreProgress(((Integer) obj).intValue());
        }
    }

    private void e() {
        this.q.observeSportingData("calorie", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda9
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

    private void j() {
        this.q.observeSportingData("result_code", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda8
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11018c.c(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        if (obj instanceof Integer) {
            LogUtil.a("Track_AiActionTrainFragment", "observeResultCode data is === ", obj);
            c(((Integer) obj).intValue());
        }
    }

    private void h() {
        if (this.q.getSportTarget() == 5 && this.q.d() == 10) {
            this.o.setText(getResources().getString(R.string.IDS_track_slash_separator_one, Integer.valueOf((int) this.q.getTargetValue())));
        }
        this.q.observeSportingData("valid_times", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11016c.g(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Object obj) {
        if (obj instanceof Integer) {
            LogUtil.a("Track_AiActionTrainFragment", "observeValidTimes data is === ", obj);
            this.r.setText(String.valueOf(((Integer) obj).intValue()));
        }
    }

    private void f() {
        this.q.observeSportingData("showSportTime", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11017a.b(obj);
            }
        });
        this.q.observeSportingData(ParsedFieldTag.NPES_SPORT_TIME, this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.f(obj);
            }
        });
        if (this.q.getSportTarget() == 0) {
            this.q.observeSportingData("sportTimeCountDown", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment$$ExternalSyntheticLambda7
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.d.j(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        if (obj != null) {
            this.k.setText(obj.toString());
            jpm.e(this.f11012a, this.k, this.r, this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Object obj) {
        if (obj instanceof Integer) {
            this.m = ((Integer) obj).intValue();
            LogUtil.a("Track_AiActionTrainFragment", "sport_time is ", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Object obj) {
        this.k.setTextColor(getResources().getColor(R.color.track_map_conut_down_back));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    public void endCountDown() {
        super.endCountDown();
        jxe.a(4, this.q.a());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    public void clickStopButton() {
        LogUtil.a("Track_AiActionTrainFragment", "clickStopButton");
        AiActionTrainViewModel aiActionTrainViewModel = this.q;
        if (aiActionTrainViewModel == null) {
            LogUtil.a("Track_AiActionTrainFragment", "clickStopButton, mViewModel == null");
        } else if (!aiActionTrainViewModel.isToSave()) {
            m();
        } else {
            this.q.m825x32b3e3a1();
            jxe.e(1, this.q.a(), this.q.e());
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed
    public void onBackPressed() {
        LogUtil.a("Track_AiActionTrainFragment", "onBackPressed");
        if (this.mIsStartTheTest) {
            m();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a("Track_AiActionTrainFragment", "onStopSport");
        jxe.a(5, this.q.a());
        if (!this.q.isToSave()) {
            LogUtil.a("Track_AiActionTrainFragment", "onStopSport, not save data");
            finish();
        } else {
            b(4, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        LogUtil.a("Track_AiActionTrainFragment", "enter showDataSaveDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.h;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("Track_AiActionTrainFragment", "showDataSaveDialog is showing");
            return;
        }
        int i = R.string.IDS_track_uncomplete_target_tips_default;
        if (!this.q.isToSave()) {
            i = R.string.IDS_track_dialog_worm;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(getContext()).b(i).a(R.string.IDS_motiontrack_show_cancel, new View.OnClickListener() { // from class: jmd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.i(view);
            }
        }).c(R.string.IDS_device_nps_dialog_exit, new View.OnClickListener() { // from class: jmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38726c.g(view);
            }
        }).c();
        this.h = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.h.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.h;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
        }
        jxe.e(5, this.q.a(), this.q.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        AiActionTrainViewModel aiActionTrainViewModel = this.q;
        if (aiActionTrainViewModel != null) {
            aiActionTrainViewModel.m825x32b3e3a1();
            if (!this.q.isToSave()) {
                jxe.e(3, this.q.a(), this.q.e());
            }
            jxe.e(4, this.q.a(), this.q.e());
        }
    }

    private void b(View view) {
        if (jch.b(this.t) == 0) {
            this.n = (HealthTextView) view.findViewById(R.id.use_tips_2);
        } else {
            this.mSportPreView.setVisibility(0);
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i;
        if (jch.b(this.t) == 0) {
            if (this.t == 1) {
                i = R.string.IDS_track_face_screen_directly;
            } else {
                i = R.string.IDS_track_side_to_side_screen;
            }
            if (this.mPreTips.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mPreTips.getLayoutParams();
                marginLayoutParams.topMargin = qrs.s(this.mSportPreView.getContext());
                this.mPreTips.setLayoutParams(marginLayoutParams);
            }
            this.n.setText(R.string.IDS_ai_fitness_sport_tip_keep_inside_screen);
            this.n.setVisibility(0);
        } else {
            i = R.string.IDS_track_side_in_screen;
        }
        if (this.mPreTips != null) {
            this.mPreTips.setText(i);
        }
    }

    private void a(View view) {
        Drawable drawable;
        Drawable drawable2;
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.signaling);
        this.l = healthImageView;
        healthImageView.setVisibility(0);
        this.l.setImageBitmap(d());
        if (jch.b(this.t) == 0) {
            CustomTitleBar customTitleBar = this.mTitleBar;
            if (LanguageUtil.ba(this.mSportPreView.getContext())) {
                drawable2 = qqz.e(this.mSportPreView.getContext(), R.drawable.ic_commonui_round_return);
            } else {
                drawable2 = getResources().getDrawable(R.drawable.ic_commonui_round_return);
            }
            customTitleBar.setLeftButtonDrawable(drawable2, qre.f(R.string.accessibility_go_back));
            jpm.d(this.mSportPreView);
            d(this.l);
            return;
        }
        b(this.l);
        this.mTitleBar.setVisibility(8);
        this.mBackImg.setVisibility(0);
        HealthImageView healthImageView2 = this.mBackImg;
        if (LanguageUtil.ba(this.mSportPreView.getContext())) {
            drawable = qqz.e(this.mSportPreView.getContext(), R.drawable.ic_commonui_round_return);
        } else {
            drawable = getResources().getDrawable(R.drawable.ic_commonui_round_return);
        }
        healthImageView2.setImageDrawable(drawable);
        ViewGroup.LayoutParams layoutParams = this.mBackImg.getLayoutParams();
        layoutParams.height = qrs.d(this.mSportPreView.getContext(), 40.0f);
        layoutParams.width = qrs.d(this.mSportPreView.getContext(), 40.0f);
        this.mBackImg.setLayoutParams(layoutParams);
    }

    private Bitmap d() {
        String str;
        if (jch.b(this.t) == 0) {
            if (this.t == 1) {
                str = "positive_signaling";
            } else {
                str = "side_signaling";
            }
        } else {
            int i = this.t;
            if (i == 4 || i == 7) {
                str = "lie_signaling";
            } else {
                str = "lay_signaling";
            }
        }
        return jcl.e().e(str);
    }

    private void d(HealthImageView healthImageView) {
        if (healthImageView.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) healthImageView.getLayoutParams();
            e(layoutParams);
            layoutParams.startToStart = 0;
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            layoutParams.endToEnd = 0;
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone((ConstraintLayout) this.mSportPreView);
            constraintSet.setHorizontalBias(R.id.signaling, 0.5f);
            constraintSet.applyTo((ConstraintLayout) this.mSportPreView);
            healthImageView.setLayoutParams(layoutParams);
            healthImageView.requestLayout();
        }
    }

    private void e(ConstraintLayout.LayoutParams layoutParams) {
        layoutParams.width = qrs.d((Context) getActivity(), 170.0f);
        layoutParams.height = qrs.d((Context) getActivity(), 528.0f);
        if (qrs.af(getContext()) && qrs.t() && qrs.x()) {
            layoutParams.width = qrs.d((Context) getActivity(), 130.0f);
            layoutParams.height = qrs.d((Context) getActivity(), 423.0f);
        }
    }

    private void b(HealthImageView healthImageView) {
        if (healthImageView.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) healthImageView.getLayoutParams();
            layoutParams.width = qrs.d((Context) getActivity(), 528.0f);
            layoutParams.height = qrs.d((Context) getActivity(), 170.0f);
            layoutParams.startToStart = 0;
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            layoutParams.endToEnd = -1;
            layoutParams.bottomMargin = qrs.d((Context) getActivity(), -16.0f);
            layoutParams.leftMargin = qrs.d((Context) getActivity(), 126.0f);
            healthImageView.setLayoutParams(layoutParams);
            healthImageView.requestLayout();
        }
    }

    private void c(View view) {
        this.e = (HealthTextView) view.findViewById(R.id.body_status_tips);
        this.d = (HealthTextView) view.findViewById(R.id.right_calorie_value);
        this.k = (HealthTextView) view.findViewById(R.id.right_first_data);
        Typeface typefaceC = qrr.c();
        this.d.setTypeface(typefaceC);
        this.k.setTypeface(typefaceC);
        this.f11012a = view.findViewById(R.id.left_data);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.left_first_data);
        this.r = healthTextView;
        healthTextView.setTypeface(typefaceC);
        this.f = (ImageView) view.findViewById(R.id.encourage_img);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.left_second_data);
        this.o = healthTextView2;
        healthTextView2.setTypeface(typefaceC);
        this.f11014c = (RelativeLayout) view.findViewById(R.id.complete_layout);
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.complete_img);
        this.f11013b = healthImageView;
        healthImageView.setImageBitmap(jcl.e().e("sport_complete"));
    }

    private void e(int i) {
        if (i == -7) {
            if (jch.b(this.t) == 0) {
                this.n.setVisibility(8);
                this.mPreTips.setText(R.string.IDS_track_kepp_bright);
                if (this.mPreTips.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mPreTips.getLayoutParams();
                    marginLayoutParams.topMargin = qrs.s(this.mSportPreView.getContext()) * 2;
                    this.mPreTips.setLayoutParams(marginLayoutParams);
                }
            } else {
                this.mPreTips.setText(R.string.IDS_ai_fitness_sport_tip_keep_light_bright);
            }
            b(1, 6000L);
        }
    }

    private void d(int i) {
        if (i == -5) {
            this.e.setText(R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen);
            this.e.setVisibility(0);
        } else if (i == -1) {
            this.e.setText(R.string.IDS_ai_fitness_sport_tip_keep_inside_screen);
            this.e.setVisibility(0);
        } else {
            if (i != 0) {
                return;
            }
            this.e.setVisibility(8);
        }
    }

    private void c(int i) {
        if (i == 1 || i == 2 || i == 3) {
            this.f.setImageBitmap(jcl.e().e("add_one"));
            n();
        }
        if (i == 4) {
            this.f.setImageBitmap(jcl.e().e("perfect"));
            n();
        }
    }

    private void n() {
        this.f.setVisibility(0);
        AnimatorSet animatorSetF = jqi.f();
        animatorSetF.setTarget(this.f);
        animatorSetF.start();
        b(3, 2000L);
    }

    private void b(int i, long j) {
        this.i.removeMessages(i);
        this.i.sendMessageDelayed(this.i.obtainMessage(i), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("Track_AiActionTrainFragment", "showCompleteView");
        RelativeLayout relativeLayout = this.f11014c;
        if (relativeLayout == null) {
            LogUtil.j("Track_AiActionTrainFragment", "showCompleteView mCompleteLayout == null");
        } else if (relativeLayout.getVisibility() != 0) {
            this.f11014c.setVisibility(0);
            b(5, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            LogUtil.a("Track_AiActionTrainFragment", "mCompleteLayout is visible");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("Track_AiActionTrainFragment", "go to h5");
        H5ProLaunchOption.Builder builderAddPath = new H5ProLaunchOption.Builder().addCustomizeArg("workoutRecord", new Gson().toJson(this.q.e())).addPath("#/SingleActionResultRecord");
        builderAddPath.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddv.b().getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).enableImageCache();
        ddv.b().loadH5ProApp(getActivity(), "com.huawei.health.h5.ai-fitness-course", builderAddPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.q.getTargetSportStatus() == 1) {
            jxe.e(2, this.q.a(), this.q.e());
        }
    }

    class e extends BaseHandler<AiActionTrainFragment> {
        e(Looper looper, AiActionTrainFragment aiActionTrainFragment) {
            super(looper, aiActionTrainFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AiActionTrainFragment aiActionTrainFragment, Message message) {
            LogUtil.a("Track_AiActionTrainFragment", "message ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                AiActionTrainFragment.this.g();
                return;
            }
            if (i == 2) {
                AiActionTrainFragment.this.m();
                return;
            }
            if (i == 3) {
                AiActionTrainFragment.d((View) aiActionTrainFragment.f);
                return;
            }
            if (i == 4) {
                AiActionTrainFragment.this.k();
            } else {
                if (i != 5) {
                    return;
                }
                AiActionTrainFragment.this.c();
                AiActionTrainFragment.this.o();
                AiActionTrainFragment.this.finish();
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_AiActionTrainFragment", " onResume");
        this.q.onResumeSport();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a("Track_AiActionTrainFragment", " onPause");
        this.q.onPauseSport();
    }
}
