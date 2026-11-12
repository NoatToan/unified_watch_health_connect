package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.animation.AnimatorSet;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.CrossJumpViewModel;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.jcm;
import defpackage.jpm;
import defpackage.jqi;
import defpackage.jqr;
import defpackage.jtj;
import defpackage.ppq;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class CrossJumpFragment extends BaseSportExamFragment implements IOnBackPressed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f11020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f11021b;
    private HealthImageView d;
    private HealthTextView e;
    private jtj f;
    private HealthTextView h;
    private ViewGroup i;
    private int k;
    private HealthImageView l;
    private ConstraintLayout m;
    private HealthTextView o;
    private int q;
    private CrossJumpViewModel r;
    private HealthImageView s;
    private HealthTextView t;
    private final Handler g = new d(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11022c = R.string.IDS_track_skip_keep_into_screen;
    private boolean n = false;
    private boolean j = false;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected boolean isSupportLandScreen() {
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        return R.layout.cross_jump_fragment;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        super.initView(view);
        e(view);
        d(view);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initData() {
        super.initData();
        d();
    }

    private void d() {
        this.mSwitchCameraPreSportButton.setVisibility(8);
        this.mSwitchCameraInSportButton.setVisibility(8);
        this.mSwitchCameraPopText.setVisibility(8);
    }

    private void e(View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.left_first_data);
        this.h = healthTextView;
        healthTextView.setText(UnitUtil.e(0.0d, 1, 0));
        this.o = (HealthTextView) view.findViewById(R.id.right_first_data);
        this.e = (HealthTextView) view.findViewById(R.id.body_status_tips);
        this.f11021b = (HealthImageView) view.findViewById(R.id.encourage_img);
        ((HealthTextView) view.findViewById(R.id.left_second_data)).setText(getResources().getString(R.string.IDS_track_slash_separator_one, 10));
        this.d = (HealthImageView) view.findViewById(R.id.complete_img);
        a();
        this.m = (ConstraintLayout) view.findViewById(R.id.sport_tips_out_screen);
        this.f11020a = (RelativeLayout) view.findViewById(R.id.complete_layout);
        this.l = (HealthImageView) view.findViewById(R.id.sport_signal);
        this.i = (ViewGroup) view.findViewById(R.id.group_layout);
        this.s = (HealthImageView) view.findViewById(R.id.square_img);
        this.t = (HealthTextView) view.findViewById(R.id.sport_use_tips_2);
    }

    private void a() {
        this.d.setImageBitmap(jcm.b().c("pic_complete_portrait"));
        this.f11021b.setImageBitmap(jcm.b().c("pic_keepitup"));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected SportExamViewModel getViewModel() {
        CrossJumpViewModel crossJumpViewModel = (CrossJumpViewModel) new ViewModelProvider(requireActivity()).get(CrossJumpViewModel.class);
        this.r = crossJumpViewModel;
        return crossJumpViewModel;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    protected void dealProgressEnd() {
        this.mSportPreView.setVisibility(8);
        this.r.onCountDown();
    }

    private void d(View view) {
        ((HealthImageView) view.findViewById(R.id.signaling)).setVisibility(0);
        jpm.d(this.mSportPreView);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        super.initViewModel();
        b();
        e();
    }

    private void e() {
        this.f = new jtj(this.i);
    }

    private void b() {
        g();
        l();
        f();
        h();
        i();
        j();
    }

    private void h() {
        this.r.observeSportingData("showSportTime", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11026b.d(obj);
            }
        });
        this.r.observeSportingData(ParsedFieldTag.NPES_SPORT_TIME, this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.i(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj) {
        if (obj == null || this.j) {
            return;
        }
        this.o.setText(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Object obj) {
        if (!(obj instanceof Integer) || this.j) {
            return;
        }
        if (this.r.b()) {
            this.r.m825x32b3e3a1();
        }
        int iIntValue = ((Integer) obj).intValue();
        this.k = iIntValue;
        if (this.r.d(iIntValue)) {
            this.o.setTextColor(getResources().getColor(R.color.track_map_conut_down_back));
        }
    }

    private void f() {
        this.r.observeSportingData("bodyDetectionError", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11024a.c(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue());
        }
    }

    private void g() {
        this.r.observeSportingData("preSportProgress", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11023c.e(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Object obj) {
        if (obj instanceof Integer) {
            dealPreProgress(((Integer) obj).intValue());
        }
    }

    private void l() {
        this.r.observeSportingData("sportExamScore", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.f(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Object obj) {
        LogUtil.a("Track_LongJumpFragment", "observeScore", obj);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() != 0) {
                if (!this.mIsStartTheTest) {
                    this.mIsStartTheTest = true;
                    this.r.onStartSport();
                }
                if (this.r.getSportStatus() == 2) {
                    this.r.onResumeSport();
                }
                this.s.setVisibility(0);
                this.s.setImageBitmap(this.r.b(num.intValue()));
            }
        }
    }

    private void i() {
        this.r.observeSportingData("COMPLETE_ONE_GROUP", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.a(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        LogUtil.a("Track_LongJumpFragment", "observeGroup", obj);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            this.h.setText(UnitUtil.e(num.intValue(), 1, 0));
            this.f.startAnimation("1");
            if (num.intValue() >= 10) {
                LogUtil.a("Track_LongJumpFragment", "observeGroup");
                this.j = true;
                this.r.m825x32b3e3a1();
            }
        }
    }

    private void m() {
        if (this.f11020a.getVisibility() != 0) {
            RelativeLayout relativeLayout = this.f11020a;
            if (relativeLayout == null) {
                LogUtil.j("Track_LongJumpFragment", "showCompleteView mCompleteLayout == null");
            } else {
                relativeLayout.setVisibility(0);
                d(4);
            }
        }
    }

    private void j() {
        this.r.observeSportingData("OVER_TIME_JUMP", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f11025c.b(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 8) {
                this.e.setText(R.string.IDS_track_jump_follow);
                this.e.setVisibility(0);
                d(1);
            }
            if (num.intValue() == 3) {
                o();
            }
        }
    }

    private void o() {
        this.f11021b.setVisibility(0);
        AnimatorSet animatorSetF = jqi.f();
        animatorSetF.setTarget(this.f11021b);
        animatorSetF.start();
        d(2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    private void a(int i) {
        if (this.mSportPreView.getVisibility() == 0) {
            dealPreStartSportTips(i, R.string.IDS_track_skip_set_phone);
            return;
        }
        this.q = i;
        if (i == -11 || i == -3 || i == -2 || i == -1) {
            if (i == -11) {
                this.f11022c = R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen;
            } else {
                this.f11022c = R.string.IDS_track_skip_body_into_screen;
            }
            this.t.setText(this.f11022c);
            if (this.r.getSportStatus() != 2) {
                this.r.onPauseSport();
            }
            if (!this.n) {
                k();
            }
        } else {
            switch (i) {
                case -4003:
                    this.f11022c = R.string.IDS_track_jump_small;
                    c();
                    break;
                case -4002:
                    this.f11022c = R.string.IDS_track_jump_order;
                    c();
                    break;
                case -4001:
                    if (i == -11) {
                        this.f11022c = R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen;
                    } else {
                        this.f11022c = R.string.IDS_track_skip_body_into_screen;
                    }
                    this.t.setText(this.f11022c);
                    if (this.r.getSportStatus() != 2) {
                        this.r.onPauseSport();
                    }
                    if (!this.n) {
                        k();
                    }
                    break;
            }
        }
        if (i != -4000 || this.n) {
            return;
        }
        this.t.setText(R.string.IDS_track_skip_body_into_screen);
        ppq.c().setExamStage(1);
        n();
    }

    private void c() {
        this.r.onPauseSport();
        this.n = true;
        this.e.setText(this.f11022c);
        this.e.setVisibility(0);
        this.s.setVisibility(0);
        this.s.setImageBitmap(this.r.b(-4002));
        this.s.startAnimation(jqr.c());
        d(3);
    }

    private void d(int i) {
        this.g.removeMessages(i);
        this.g.sendMessageDelayed(this.g.obtainMessage(i), 2000L);
    }

    private void k() {
        this.mDataPanelLayout.setVisibility(8);
        this.m.setVisibility(0);
        this.l.setVisibility(0);
        this.s.setVisibility(8);
    }

    private void n() {
        this.e.setVisibility(8);
        this.mDataPanelLayout.setVisibility(0);
        this.m.setVisibility(8);
        this.l.setVisibility(8);
        this.s.setVisibility(0);
        this.s.setImageBitmap(this.r.b(1));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        CrossJumpViewModel crossJumpViewModel = this.r;
        if (crossJumpViewModel != null && crossJumpViewModel.b()) {
            sendSportResult(0L);
            finish();
            return;
        }
        CrossJumpViewModel crossJumpViewModel2 = this.r;
        if (crossJumpViewModel2 != null && crossJumpViewModel2.a() < 10) {
            finish();
        } else {
            m();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment
    public void endCountDown() {
        ppq.c().setExamStage(1);
        startDataSport();
        this.l.setVisibility(8);
        this.s.setVisibility(0);
        this.s.setImageBitmap(this.r.b(1));
        this.m.setVisibility(8);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment, com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return "Track_LongJumpFragment";
    }

    static class d extends BaseHandler<CrossJumpFragment> {
        d(Looper looper, CrossJumpFragment crossJumpFragment) {
            super(looper, crossJumpFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(CrossJumpFragment crossJumpFragment, Message message) {
            if (crossJumpFragment == null) {
                LogUtil.j("Track_LongJumpFragment", "UiHandler fragment == null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                CrossJumpFragment.a((View) crossJumpFragment.e);
                return;
            }
            if (i == 2) {
                CrossJumpFragment.a((View) crossJumpFragment.f11021b);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                LogUtil.a("Track_LongJumpFragment", "showCompleteView");
                crossJumpFragment.sendSportResult(crossJumpFragment.j ? crossJumpFragment.k : 0L);
                crossJumpFragment.finish();
                return;
            }
            crossJumpFragment.s.clearAnimation();
            CrossJumpFragment.a((View) crossJumpFragment.s);
            crossJumpFragment.e.setVisibility(8);
            crossJumpFragment.n = false;
            LogUtil.a("Track_LongJumpFragment", "fragment.mStatus:", Integer.valueOf(crossJumpFragment.q));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
