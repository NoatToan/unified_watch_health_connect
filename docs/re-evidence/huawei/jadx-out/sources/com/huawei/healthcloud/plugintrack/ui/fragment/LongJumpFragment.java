package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed;
import com.huawei.healthcloud.plugintrack.ui.view.RippleView;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.LongJumpViewModel;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel;
import com.huawei.healthcloud.plugintrack.util.AiSportExamDialogUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.jau;
import defpackage.jcm;
import defpackage.jqi;
import defpackage.jqr;
import defpackage.jtj;
import defpackage.njy;
import defpackage.nue;
import defpackage.ppq;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LongJumpFragment extends BaseSportExamFragment implements IOnBackPressed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f11042a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private nue f11044c;
    private HealthTextView d;
    private HealthImageView e;
    private RelativeLayout g;
    private ViewGroup h;
    private HealthImageView i;
    private HealthImageView j;
    private jtj k;
    private HealthImageView m;
    private LinearLayout n;
    private RippleView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthImageView s;
    private ViewGroup t;
    private LongJumpViewModel u;
    private HealthImageView w;
    private RelativeLayout x;
    private final Handler f = new e(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11043b = R.string.IDS_track_skip_keep_into_screen;
    private boolean o = false;
    private boolean l = false;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected boolean isSupportLandScreen() {
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        return R.layout.long_jump_fragment;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        super.initView(view);
        b(view);
        c(view);
        f();
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(4);
        }
    }

    private void f() {
        jtj jtjVar = new jtj(this.h);
        this.k = jtjVar;
        jtjVar.c(true);
    }

    private void b(View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.left_first_data);
        this.q = healthTextView;
        healthTextView.setText(UnitUtil.e(0.0d, 1, 0));
        this.r = (HealthTextView) view.findViewById(R.id.right_first_data);
        this.d = (HealthTextView) view.findViewById(R.id.body_status_tips);
        this.j = (HealthImageView) view.findViewById(R.id.encourage_img);
        this.h = (ViewGroup) view.findViewById(R.id.distance_layout);
        this.p = (RippleView) view.findViewById(R.id.rippleImgView);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.right_second_data);
        healthTextView2.setText(getResources().getString(R.string.IDS_track_slash_separator_one, 3));
        this.x = (RelativeLayout) view.findViewById(R.id.start_signal_layout);
        this.s = (HealthImageView) view.findViewById(R.id.start_position_person);
        this.m = (HealthImageView) view.findViewById(R.id.write_light_beam);
        this.w = (HealthImageView) view.findViewById(R.id.test_line);
        this.i = (HealthImageView) view.findViewById(R.id.complete_img);
        this.e = (HealthImageView) view.findViewById(R.id.camera_bg);
        h();
        this.f11042a = (LinearLayout) view.findViewById(R.id.arrow_layout);
        this.n = (LinearLayout) view.findViewById(R.id.out_range_layout);
        this.g = (RelativeLayout) view.findViewById(R.id.complete_layout);
        d(this.q);
        d(this.r);
        d(healthTextView2);
    }

    private void d(HealthTextView healthTextView) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.setTypeface(qrr.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.l = true;
        a((View) this.g);
        q();
        this.f.postDelayed(new Runnable() { // from class: jnp
            @Override // java.lang.Runnable
            public final void run() {
                this.e.l();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        AiSportExamDialogUtils.e(getActivity(), i(), new AiSportExamDialogUtils.DialogResultCallback() { // from class: jnj
            @Override // com.huawei.healthcloud.plugintrack.util.AiSportExamDialogUtils.DialogResultCallback
            public final void executeResult(float f) {
                this.f38751b.a(f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f) {
        sendSportResult((long) f);
        finish();
    }

    private void q() {
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(1);
        }
    }

    private void h() {
        this.s.setImageBitmap(jcm.b().c("public_orange_signaling"));
        this.m.setImageBitmap(jcm.b().c("public_write_beam"));
        AnimatorSet animatorSetD = jqr.d();
        animatorSetD.setTarget(this.m);
        animatorSetD.start();
        this.w.setImageBitmap(jcm.b().c("public_test_line"));
        this.w.setAlpha(0.5f);
        this.i.setImageBitmap(jcm.b().c("pic_complete"));
        this.e.setImageBitmap(jcm.b().c("public_mask"));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected SportExamViewModel getViewModel() {
        LongJumpViewModel longJumpViewModel = (LongJumpViewModel) new ViewModelProvider(requireActivity()).get(LongJumpViewModel.class);
        this.u = longJumpViewModel;
        return longJumpViewModel;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected void dealProgressEnd() {
        this.mSportPreView.setVisibility(8);
        this.t.setVisibility(8);
        this.u.onCountDown();
    }

    private void c(View view) {
        this.t = (ViewGroup) view.findViewById(R.id.pre_sport_tips);
        this.mTitleBar.setVisibility(8);
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.signaling);
        healthImageView.setImageResource(R.drawable.jump_signaling);
        b(healthImageView);
        this.mBackImg.setVisibility(0);
    }

    private void b(HealthImageView healthImageView) {
        if (healthImageView.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) healthImageView.getLayoutParams();
            layoutParams.width = qrs.d((Context) getActivity(), 200.0f);
            layoutParams.height = qrs.d((Context) getActivity(), 280.0f);
            layoutParams.startToStart = 0;
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            layoutParams.endToEnd = -1;
            layoutParams.topMargin = qrs.d((Context) getActivity(), 50.0f);
            healthImageView.setLayoutParams(layoutParams);
            healthImageView.requestLayout();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a(getLogTag(), "onResume()");
        super.onResume();
        setSurfaceRotation();
        if (!getUserVisibleHint() || this.o) {
            return;
        }
        AiSportExamDialogUtils.e(getActivity(), new AiSportExamDialogUtils.DialogResultCallback() { // from class: jnm
            @Override // com.huawei.healthcloud.plugintrack.util.AiSportExamDialogUtils.DialogResultCallback
            public final void executeResult(float f) {
                this.e.b(f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(float f) {
        SimpleArrayMap<String, Object> simpleArrayMap = new SimpleArrayMap<>(1);
        simpleArrayMap.put("height", Integer.valueOf((int) f));
        ppq.c().setValue(simpleArrayMap);
        LongJumpViewModel longJumpViewModel = this.u;
        if (longJumpViewModel != null) {
            longJumpViewModel.d(true);
        }
        ReleaseLogUtil.d("Track_LongJumpFragment", "showSetHeightDialog mViewModel == null :", Boolean.valueOf(this.u == null), "mIsAlreadyShowHeightDialog:", true);
        this.o = true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        j();
        switchScreenTips();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p();
    }

    private void p() {
        LogUtil.a("Track_LongJumpFragment", "playLandScreenVoice");
        if (getActivity() == null || !getUserVisibleHint()) {
            LogUtil.a("Track_LongJumpFragment", "playLandScreenVoice getUserVisibleHint");
            return;
        }
        if (getResources().getConfiguration().orientation == 2) {
            d("L001");
        } else if (!this.l) {
            d("L211");
        }
        LogUtil.a("Track_LongJumpFragment", "playLandScreenVoice isCompleteTest", Boolean.valueOf(this.l));
    }

    private void d(String str) {
        String strD = jcm.b().d(str, "mp3");
        jau.c().b("assert" + strD);
    }

    private void j() {
        n();
        r();
        m();
    }

    private void m() {
        this.u.observeSportingData("bodyDetectionError", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.LongJumpFragment$$ExternalSyntheticLambda8
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11048c.d(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj) {
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue());
        }
    }

    private void n() {
        this.u.observeSportingData("preSportProgress", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.LongJumpFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11047b.b(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        if (obj instanceof Integer) {
            dealPreProgress(((Integer) obj).intValue());
        }
    }

    private void r() {
        this.u.observeSportingData("sportExamScore", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.LongJumpFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11045c.c(obj);
            }
        });
        this.u.observeSportingData("bodyPosition", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.LongJumpFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11046b.a(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        LogUtil.a("Track_LongJumpFragment", "observeScore", obj);
        if (obj instanceof Integer) {
            d(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        if (obj instanceof nue) {
            this.f11044c = (nue) obj;
            b();
            e();
        }
    }

    private void d(int i) {
        this.w.setAlpha(0.5f);
        a((View) this.f11042a);
        LinearLayout linearLayout = this.f11042a;
        if (linearLayout != null) {
            linearLayout.clearAnimation();
        }
        if (i < 50) {
            this.d.setVisibility(0);
            this.d.setText(R.string.IDS_track_jump_distance_short);
            c(2);
            return;
        }
        this.k.startAnimation(String.valueOf(i));
        c();
        x();
        b(i);
        if (i().size() == 3) {
            this.f.postDelayed(new Runnable() { // from class: jno
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38755a.k();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        LongJumpViewModel longJumpViewModel = this.u;
        if (longJumpViewModel != null) {
            longJumpViewModel.m825x32b3e3a1();
        }
    }

    private void t() {
        if (!njy.b(i()) || this.g.getVisibility() == 0) {
            return;
        }
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout == null) {
            LogUtil.j("Track_LongJumpFragment", "showCompleteView mCompleteLayout == null");
        } else {
            relativeLayout.setVisibility(0);
            b(6, 2000L);
        }
    }

    private void c() {
        if (i().size() == 1) {
            this.j.setImageBitmap(jcm.b().c("pic_great"));
            u();
        } else {
            if (this.u.a()) {
                this.j.setImageBitmap(jcm.b().c("pic_perfect"));
            } else {
                this.j.setImageBitmap(jcm.b().c("pic_keepitup"));
            }
            u();
        }
    }

    private void u() {
        this.j.setVisibility(0);
        AnimatorSet animatorSetF = jqi.f();
        animatorSetF.setTarget(this.j);
        animatorSetF.start();
        b(3, 2000L);
    }

    private void b(int i) {
        if (i > 0) {
            this.q.startAnimation(jqi.g());
            this.p.setVisibility(0);
            this.p.e();
            this.f.sendMessageDelayed(this.f.obtainMessage(4), 1000L);
        }
    }

    private void b() {
        if (this.p == null) {
            LogUtil.j("Track_LongJumpFragment", "changePointPosition mRippleImgView == null");
        } else if (this.f11044c.a() > 1.0f) {
            this.p.post(new Runnable() { // from class: jnn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38754c.g();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.p.setTranslationX(this.f11044c.a() - ((this.p.getWidth() / 2) + this.p.getLeft()));
        this.p.setTranslationY(this.f11044c.d() - ((this.p.getHeight() / 2) + this.p.getTop()));
    }

    private void e() {
        LogUtil.a("Track_LongJumpFragment", "changeTextLinePosition ", Float.valueOf(this.f11044c.j()));
        if (this.w == null) {
            LogUtil.j("Track_LongJumpFragment", "changePointPosition mRippleImgView == null");
        } else if (this.f11044c.j() > 1.0f) {
            this.w.setVisibility(0);
            this.w.post(new Runnable() { // from class: jnl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38753b.o();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.w.setTranslationX(this.f11044c.j() - this.w.getLeft());
    }

    private void a(int i) {
        if (this.t.getVisibility() == 0) {
            this.d.setVisibility(8);
            dealPreStartSportTips(i, R.string.IDS_track_side_in_screen);
            return;
        }
        if (i == -11) {
            this.f11043b = R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen;
        } else if (i == -3 || i == -2 || i == -1) {
            this.f11043b = R.string.IDS_track_skip_keep_into_screen;
            this.w.setAlpha(0.5f);
        } else {
            switch (i) {
                case -3006:
                    this.n.setVisibility(0);
                    this.x.setVisibility(0);
                    b(5, 2000L);
                    return;
                case -3005:
                    this.f11043b = R.string.IDS_track_position_close_screen;
                    break;
                case -3004:
                    this.f11043b = R.string.IDS_track_position_start_jump;
                    break;
            }
        }
        if (i == -3000 || i == -3007) {
            this.t.setVisibility(8);
            this.d.setVisibility(8);
            this.x.setVisibility(8);
            a();
            this.w.setAlpha(1.0f);
            return;
        }
        this.d.setText(this.f11043b);
        this.d.setVisibility(0);
        c(2);
        HealthImageView healthImageView = this.j;
        if (healthImageView != null && healthImageView.getVisibility() == 0) {
            b(8, 2000L);
        } else {
            this.x.setVisibility(0);
        }
    }

    private void c(int i) {
        b(i, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void b(int i, long j) {
        this.f.removeMessages(i);
        this.f.sendMessageDelayed(this.f.obtainMessage(i), j);
    }

    private void a() {
        HealthImageView healthImageView = this.j;
        if (healthImageView != null && healthImageView.getVisibility() == 0) {
            b(7, 2000L);
        } else {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.f11042a.getVisibility() != 0) {
            this.f11042a.setVisibility(0);
            if (AnimationUtils.loadAnimation(getActivity(), R.anim.anim_arrow) instanceof AnimationSet) {
                this.f11042a.startAnimation((AnimationSet) AnimationUtils.loadAnimation(getActivity(), R.anim.anim_arrow));
            }
            c(1);
        }
    }

    private void x() {
        if (this.q == null || this.r == null || njy.e(i())) {
            LogUtil.j("Track_LongJumpFragment", "updateScore mScoreText is null or scoreList null");
            return;
        }
        ReleaseLogUtil.d("Track_LongJumpFragment", "updateScore the testNum", Integer.valueOf(i().size()));
        this.r.setText(UnitUtil.e(i().size(), 1, 0));
        this.q.setText(UnitUtil.e(((Integer) Collections.max(i())).intValue(), 1, 0));
    }

    private List<Integer> i() {
        LongJumpViewModel longJumpViewModel = this.u;
        if (longJumpViewModel == null) {
            LogUtil.j("Track_LongJumpFragment", "getScoreList mViewModel == null");
            return new ArrayList(3);
        }
        return longJumpViewModel.d();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        super.onStartSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a("Track_LongJumpFragment", "onResumeSport");
        startDataSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        if (njy.e(i())) {
            finish();
        } else {
            t();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return "Track_LongJumpFragment";
    }

    class e extends BaseHandler<LongJumpFragment> {
        e(Looper looper, LongJumpFragment longJumpFragment) {
            super(looper, longJumpFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(LongJumpFragment longJumpFragment, Message message) {
            switch (message.what) {
                case 1:
                    LongJumpFragment.a((View) longJumpFragment.f11042a);
                    if (longJumpFragment.f11042a != null) {
                        LongJumpFragment.this.f11042a.clearAnimation();
                    }
                    break;
                case 2:
                    LongJumpFragment.a((View) longJumpFragment.d);
                    break;
                case 3:
                    LongJumpFragment.a((View) longJumpFragment.j);
                    if (LongJumpFragment.this.x != null) {
                        LongJumpFragment.this.x.setVisibility(0);
                    }
                    break;
                case 4:
                    LongJumpFragment.a((View) longJumpFragment.p);
                    break;
                case 5:
                    LongJumpFragment.a((View) longJumpFragment.n);
                    break;
                case 6:
                    LongJumpFragment.this.d();
                    break;
                case 7:
                    LongJumpFragment.this.s();
                    break;
                case 8:
                    if (LongJumpFragment.this.x != null) {
                        LongJumpFragment.this.x.setVisibility(0);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
