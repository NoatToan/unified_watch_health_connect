package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed;
import com.huawei.healthcloud.plugintrack.ui.view.RippleView;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SupineLegRaiseModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SupineLegAchieveType;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.jqi;
import defpackage.jta;
import defpackage.jtj;
import defpackage.jui;
import defpackage.nue;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class SupineLegRaiseFragment extends BaseSportExamFragment implements IOnBackPressed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f11115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nue f11116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jta f11117c;
    private jtj e;
    private View f;
    private jui h;
    private ViewGroup i;
    private ImageView j;
    private HealthTextView k;
    private ViewGroup l;
    private HealthTextView o;
    private RippleView p;
    private HealthImageView q;
    private HealthTextView r;
    private HealthTextView s;
    private SupineLegRaiseModel w;
    private HealthImageView y;
    private Handler n = new a(Looper.getMainLooper(), this);
    private int d = R.string.IDS_track_skip_keep_into_screen;
    private int t = 0;
    private int g = 0;
    private boolean m = false;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected boolean isSupportLandScreen() {
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        return R.layout.supine_leg_raise_fragment;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        super.initView(view);
        b(view);
        e(view);
        b();
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(4);
        }
        switchScreenTips();
    }

    private void b() {
        this.e = new jtj(this.i);
        this.h = new jui(this.j);
        this.f11117c = new jta(this.f);
    }

    private void b(View view) {
        this.s = (HealthTextView) view.findViewById(R.id.left_first_data);
        this.o = (HealthTextView) view.findViewById(R.id.left_second_data);
        this.r = (HealthTextView) view.findViewById(R.id.right_first_data);
        this.f11115a = (HealthTextView) view.findViewById(R.id.body_status_tips);
        this.k = (HealthTextView) view.findViewById(R.id.interrupt_times);
        this.j = (ImageView) view.findViewById(R.id.encourage_img);
        this.i = (ViewGroup) view.findViewById(R.id.countinues_layout);
        this.p = (RippleView) view.findViewById(R.id.rippleImgView);
        this.f = view.findViewById(R.id.flexion_anim_layout);
        this.q = (HealthImageView) view.findViewById(R.id.init_ripple_img);
        e();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected SportExamViewModel getViewModel() {
        SupineLegRaiseModel supineLegRaiseModel = (SupineLegRaiseModel) new ViewModelProvider(requireActivity()).get(SupineLegRaiseModel.class);
        this.w = supineLegRaiseModel;
        return supineLegRaiseModel;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected void dealProgressEnd() {
        this.mSportPreView.setVisibility(8);
        this.l.setVisibility(8);
        if (this.mIsStartTheTest) {
            this.w.onResumeSport();
        } else {
            this.w.onCountDown();
        }
    }

    private void e(View view) {
        this.y = (HealthImageView) view.findViewById(R.id.signaling);
        this.l = (ViewGroup) view.findViewById(R.id.pre_sport_tips);
        this.mTitleBar.setVisibility(8);
        if (this.mPreTips != null) {
            this.mPreTips.setText(R.string.IDS_track_skip_keep_into_screen);
        }
        this.mBackImg.setVisibility(0);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a(getLogTag(), "onResume()");
        super.onResume();
        setSurfaceRotation();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        setSurfaceRotation();
    }

    private void e() {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.s.setTypeface(typefaceCreateFromAsset);
        this.o.setTypeface(typefaceCreateFromAsset);
        this.r.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        i();
        switchScreenTips();
    }

    private void i() {
        o();
        l();
        f();
        m();
        g();
        n();
    }

    private void n() {
        this.w.observeSportingData("reStartSport", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11123a.f(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            this.mSquareProgress.setProgress(0);
            this.w.resetProgress();
            this.l.setVisibility(0);
            this.f11115a.setVisibility(8);
            this.mSportPreView.setVisibility(0);
            this.mSwitchCameraPreSportButton.setVisibility(8);
            this.mSwitchCameraPopText.setVisibility(8);
            this.mToIntroduceButtonLayout.setVisibility(8);
            this.mTitleBar.setVisibility(8);
            this.mDataPanelLayout.setVisibility(8);
        }
    }

    private void f() {
        this.w.observeSportingData("bodyDetectionError", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda9
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11125c.b(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        if (obj instanceof Integer) {
            d(((Integer) obj).intValue());
        }
    }

    private void o() {
        this.w.observeSportingData("preSportProgress", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11120b.e(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Object obj) {
        if (obj instanceof Integer) {
            dealPreProgress(((Integer) obj).intValue());
        }
    }

    private void g() {
        this.w.observeSportingData("encourageType", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda8
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11124a.d(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj) {
        s();
    }

    private void m() {
        this.w.observeSportingData("showSportTime", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11118a.i(obj);
            }
        });
        if (this.w.getSportTarget() == 0) {
            this.w.observeSportingData("sportTimeCountDown", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda1
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.f11119a.j(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Object obj) {
        if (obj != null) {
            this.r.setText(obj.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Object obj) {
        this.r.setTextColor(getResources().getColor(R.color.track_map_conut_down_back));
    }

    private void l() {
        this.w.observeSportingData("sportExamScore", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.a(obj);
            }
        });
        this.w.observeSportingData("continuouslyTimes", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11121a.c(obj);
            }
        });
        this.w.observeSportingData("bodyPosition", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SupineLegRaiseFragment$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11122b.g(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        LogUtil.a("Track_SupineLegRaiseFragment", "observeRaiseTimes");
        if (obj instanceof Integer) {
            this.t = ((Integer) obj).intValue();
            s();
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        LogUtil.a("Track_SupineLegRaiseFragment", "CONTINUOUSLY_TIMES update");
        if (!(obj instanceof Integer) || ((Integer) obj).intValue() <= 0) {
            return;
        }
        this.e.startAnimation(String.valueOf(obj));
        this.h.startAnimation(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Object obj) {
        if (obj instanceof nue) {
            nue nueVar = (nue) obj;
            this.f11116b = nueVar;
            int iB = nueVar.b();
            this.g = iB;
            LogUtil.a("Track_SupineLegRaiseFragment", "mDirector:", Integer.valueOf(iB));
            d();
            a();
        }
    }

    private void k() {
        if (this.t > 0) {
            this.s.startAnimation(jqi.g());
            this.p.setVisibility(0);
            this.q.setVisibility(8);
            this.m = true;
            this.p.e();
            this.n.removeMessages(6);
            this.n.sendMessageDelayed(this.n.obtainMessage(6), 1000L);
        }
    }

    private void a() {
        if (this.g == 0) {
            this.y.setImageResource(R.drawable.supine_leg_signaling);
        } else {
            this.y.setImageResource(R.drawable.supine_leg_signaling_left);
        }
    }

    private void d() {
        if (this.p == null) {
            LogUtil.j("Track_SupineLegRaiseFragment", "changePointPosition mRippleImgView == null");
        } else if (this.f11116b.l() > 1.0f) {
            this.p.post(new Runnable() { // from class: jot
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.j();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.p.setVisibility(0);
        if (this.m) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
        }
        e(this.p, 0);
        e(this.q, 0);
        e(this.i, 100);
    }

    private void e(View view, int i) {
        float f = i;
        view.setTranslationX((this.f11116b.l() - ((view.getWidth() / 2) + view.getLeft())) + f);
        view.setTranslationY((this.f11116b.m() - ((view.getHeight() / 2) + view.getTop())) - f);
    }

    private void p() {
        for (SupineLegAchieveType supineLegAchieveType : SupineLegAchieveType.values()) {
            if (supineLegAchieveType != null) {
                if (this.t == supineLegAchieveType.getLegRaiseTimes()) {
                    this.s.setTextColor(getResources().getColor(R.color.track_map_conut_down_back));
                } else {
                    this.s.setTextColor(getResources().getColor(R.color.textColorPrimaryInverse));
                }
            }
        }
    }

    private void d(int i) {
        if (this.l.getVisibility() == 0) {
            this.f11115a.setVisibility(8);
            dealPreStartSportTips(i, R.string.IDS_track_skip_keep_into_screen);
            return;
        }
        if (i == -2007) {
            this.d = R.string.IDS_track_raise_leg_more;
        } else if (i == -11) {
            this.d = R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen;
        } else if (i == -2004) {
            this.d = R.string.IDS_track_straight_your_legs;
            r();
        } else if (i == -2003 || i == -3 || i == -2 || i == -1) {
            this.d = R.string.IDS_track_skip_keep_into_screen;
            this.p.setVisibility(8);
            this.q.setVisibility(8);
        }
        if (i != -2004) {
            c();
        }
        if (i == 0 || i == -2001 || i == -2000) {
            this.l.setVisibility(8);
            this.f11115a.setVisibility(8);
        } else {
            this.f11115a.setText(this.d);
            this.f11115a.setVisibility(0);
        }
    }

    private void s() {
        if (this.s == null) {
            LogUtil.j("Track_SupineLegRaiseFragment", "updateSkipTimes mScoreText is null.");
        } else {
            p();
            this.s.setText(UnitUtil.e(this.t, 1, 0));
        }
    }

    private void r() {
        LogUtil.a("Track_SupineLegRaiseFragment", "startKneeAnim");
        nue nueVar = new nue();
        if (h()) {
            nueVar.b(this.f11116b.e());
            nueVar.c(this.f11116b.c());
            nueVar.f(this.f11116b.g());
            nueVar.g(this.f11116b.i());
            nueVar.d(1);
        }
        this.f11117c.c(true);
        this.f11117c.startAnimation(nueVar);
    }

    private boolean h() {
        nue nueVar = this.f11116b;
        return nueVar != null && nueVar.c() > 1.0f && this.f11116b.i() > 1.0f;
    }

    private void c() {
        if (this.f.getVisibility() == 0) {
            this.f11117c.a();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        super.onStartSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a("Track_SupineLegRaiseFragment", "onResumeSport");
        startDataSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        sendSportResult(this.t);
        finish();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return "Track_SupineLegRaiseFragment";
    }

    static class a extends BaseHandler<SupineLegRaiseFragment> {
        a(Looper looper, SupineLegRaiseFragment supineLegRaiseFragment) {
            super(looper, supineLegRaiseFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SupineLegRaiseFragment supineLegRaiseFragment, Message message) {
            int i = message.what;
            if (i != 2) {
                if (i != 6 || supineLegRaiseFragment.p == null || supineLegRaiseFragment.q == null) {
                    return;
                }
                supineLegRaiseFragment.p.a();
                supineLegRaiseFragment.m = false;
                supineLegRaiseFragment.q.setVisibility(0);
                return;
            }
            supineLegRaiseFragment.k.setVisibility(8);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        jta jtaVar = this.f11117c;
        if (jtaVar != null) {
            jtaVar.d();
        }
    }
}
