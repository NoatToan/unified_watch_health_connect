package com.huawei.health.suggestion.ui.runningposture;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener;
import com.huawei.health.suggestion.ui.fitness.module.TrainActionIntro;
import com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import defpackage.gzx;
import defpackage.jbo;
import defpackage.jqc;
import defpackage.njy;
import defpackage.qpn;
import defpackage.qpx;
import defpackage.xfz;
import defpackage.xkf;
import health.compact.a.CommonUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class RuningPostureSuggestActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PostureSuggestBaseFragment[] f10032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qpn f10033c;
    private List<RunningPostureAdviceBase> f;
    private c g;
    private LinearLayout i;
    private IntroPagerAdapter j;
    private View k;
    private HealthSubTabWidget l;
    private HealthViewPager n;
    private HashMap<SportDetailChartDataType, List<jbo>> o;
    private TranslateAnimation p;
    private WifiReceiver q;
    private TrainActionIntro r;
    private String[] s;
    private TranslateAnimation t;
    protected int d = 0;
    private int e = 0;
    private List<Motion> m = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f10031a = new ArrayList();
    private boolean h = false;

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            this.e = intent.getIntExtra("runningPostureFlag", 0);
            try {
                this.f = intent.getParcelableArrayListExtra("runningPostureAdvices");
                Serializable serializableExtra = intent.getSerializableExtra("runningPostureJudgeList");
                if (serializableExtra instanceof HashMap) {
                    this.o = (HashMap) serializableExtra;
                }
            } catch (IndexOutOfBoundsException e) {
                LogUtil.j("Suggest_RuningPostureSuggestActivity", e.getMessage());
            }
        }
        List<RunningPostureAdviceBase> list = this.f;
        if (list != null) {
            this.s = new String[list.size()];
            for (int i = 0; i < this.f.size(); i++) {
                if (this.f.get(i) == null) {
                    LogUtil.j("Suggest_RuningPostureSuggestActivity", "posture advices mPostureAdvices.get(i) == null ", Integer.valueOf(i));
                    return;
                }
                this.s[i] = this.f.get(i).getText();
            }
        }
        List<RunningPostureAdviceBase> list2 = this.f;
        if (list2 == null || this.s == null || list2.size() != this.s.length) {
            LogUtil.j("Suggest_RuningPostureSuggestActivity", "posture advices length is error");
            finish();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        LogUtil.a("Suggest_RuningPostureSuggestActivity", "initViewController()");
        if (isFinishing()) {
            LogUtil.j("Suggest_RuningPostureSuggestActivity", "Activity is finishing");
            return;
        }
        setContentView(R.layout.sug_running_posture_suggest);
        getWindow().setFlags(16777216, 16777216);
        this.n = (HealthViewPager) findViewById(R.id.sug_running_posture_vp);
        this.f10032b = new PostureSuggestBaseFragment[this.f.size()];
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.get(i) == null) {
                LogUtil.j("Suggest_RuningPostureSuggestActivity", "posture advices fragment mPostureAdvices.get(i) == null ", Integer.valueOf(i));
                return;
            }
            Object objA = ReflectionUtils.a(this.f.get(i).getRunningPostureFragment());
            if (objA == null) {
                LogUtil.j("Suggest_RuningPostureSuggestActivity", "posture advices fragment object == null ", this.f.get(i).getRunningPostureFragment());
            } else if (objA instanceof PostureSuggestBaseFragment) {
                this.f10032b[i] = (PostureSuggestBaseFragment) objA;
            } else {
                LogUtil.j("Suggest_RuningPostureSuggestActivity", "posture advices not instanceof PostureSuggestBaseFragment error");
            }
        }
        this.l = (HealthSubTabWidget) findViewById(R.id.sug_running_posture_tab);
        this.n.setOffscreenPageLimit(this.s.length);
        this.f10033c = new qpn(this, this.n, this.l);
        int i2 = 0;
        while (true) {
            String[] strArr = this.s;
            if (i2 < strArr.length) {
                xfz xfzVarB = this.l.b(strArr[i2]);
                Bundle bundle = new Bundle();
                bundle.putParcelable("runningPostureAdvice", this.f.get(i2));
                bundle.putSerializable("runningPostureJudgeList", this.o);
                PostureSuggestBaseFragment postureSuggestBaseFragment = this.f10032b[i2];
                if (postureSuggestBaseFragment != null) {
                    postureSuggestBaseFragment.setArguments(bundle);
                    this.f10033c.b(xfzVarB, this.f10032b[i2], this.e == i2);
                }
                i2++;
            } else {
                c();
                runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RuningPostureSuggestActivity.this.r.setAdapter(RuningPostureSuggestActivity.this.j);
                    }
                });
                this.q = new WifiReceiver();
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.setPriority(500);
                registerReceiver(this.q, intentFilter);
                return;
            }
        }
    }

    private void c() {
        this.r = (TrainActionIntro) findViewById(R.id.runningpos_train_action_intro);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_fitness_getdata_error);
        this.i = linearLayout;
        linearLayout.setOnClickListener(this);
        this.k = findViewById(R.id.sug_running_posture_suggest_content);
        IntroPagerAdapter introPagerAdapter = new IntroPagerAdapter(this.f10031a, R.layout.sug_traindetail_vp_intro);
        this.j = introPagerAdapter;
        introPagerAdapter.b(false);
        this.r.getPreAction().setOnClickListener(this);
        this.r.getNextAction().setOnClickListener(this);
        this.r.getTitleBar().setVisibility(0);
        this.r.getTitleBar().setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RuningPostureSuggestActivity runingPostureSuggestActivity = RuningPostureSuggestActivity.this;
                runingPostureSuggestActivity.downDismiss(runingPostureSuggestActivity.r);
            }
        });
        this.r.setOnSlidingListener(new OnSlidingListener() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.3
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSliding(float f) {
                RuningPostureSuggestActivity.this.k.setVisibility(0);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSlidingFinish(boolean z) {
                if (z) {
                    RuningPostureSuggestActivity.this.r.setVisibility(4);
                    RuningPostureSuggestActivity.this.k.setVisibility(0);
                } else {
                    RuningPostureSuggestActivity.this.r.setVisibility(0);
                    RuningPostureSuggestActivity.this.k.setVisibility(8);
                }
            }
        });
    }

    public void a() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (RuningPostureSuggestActivity.this.i != null) {
                    if (RuningPostureSuggestActivity.this.h == (!CommonUtil.ab(BaseApplication.getContext())) && RuningPostureSuggestActivity.this.i.getVisibility() == 0) {
                        return;
                    }
                    RuningPostureSuggestActivity.this.h = !CommonUtil.ab(BaseApplication.getContext());
                    HealthTextView healthTextView = (HealthTextView) RuningPostureSuggestActivity.this.i.findViewById(R.id.nfc_tip_title_text);
                    if (RuningPostureSuggestActivity.this.h) {
                        RuningPostureSuggestActivity.this.i.findViewById(R.id.ll_setting).setVisibility(0);
                        healthTextView.setText(com.huawei.ui.commonui.R.string.IDS_hwh_home_group_network_disconnection);
                        RuningPostureSuggestActivity.this.i.setVisibility(0);
                    }
                }
            }
        });
    }

    public void b() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.4
            @Override // java.lang.Runnable
            public void run() {
                if (RuningPostureSuggestActivity.this.i == null || RuningPostureSuggestActivity.this.i.getVisibility() == 8) {
                    return;
                }
                RuningPostureSuggestActivity.this.i.setVisibility(8);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        List<Motion> list;
        super.onResume();
        TrainActionIntro trainActionIntro = this.r;
        if (trainActionIntro == null || trainActionIntro.getVisibility() != 0 || (list = this.m) == null || list.size() <= this.d) {
            return;
        }
        j();
        if (i()) {
            return;
        }
        k();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        TrainActionIntro trainActionIntro = this.r;
        if (trainActionIntro != null && trainActionIntro.getVisibility() == 0) {
            downDismiss(this.r);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        jqc.b().e();
        WifiReceiver wifiReceiver = this.q;
        if (wifiReceiver != null) {
            unregisterReceiver(wifiReceiver);
        }
    }

    public void upShow(final View view) {
        if (view == null) {
            LogUtil.j("Suggest_RuningPostureSuggestActivity", "upShow view == null");
            return;
        }
        if (this.t == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.t = translateAnimation;
            translateAnimation.setDuration(500L);
            this.t.setInterpolator(new DecelerateInterpolator());
            this.t.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.6
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    view.setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    LogUtil.a("Suggest_RuningPostureSuggestActivity", "onAnimationEnd");
                    RuningPostureSuggestActivity.this.k.setVisibility(8);
                }
            });
        }
        view.startAnimation(this.t);
    }

    public void downDismiss(final View view) {
        if (view == null) {
            LogUtil.j("Suggest_RuningPostureSuggestActivity", "downDismiss view is null");
            return;
        }
        TranslateAnimation translateAnimation = this.p;
        if (translateAnimation == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            this.p = translateAnimation2;
            translateAnimation2.setDuration(500L);
            this.p.setInterpolator(new DecelerateInterpolator());
            this.p.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.10
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    RuningPostureSuggestActivity.this.k.setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(4);
                }
            });
        } else if (!translateAnimation.hasEnded()) {
            return;
        }
        view.startAnimation(this.p);
    }

    private void c(int i) {
        Motion motion = (Motion) b(this.m.get(i));
        this.f10031a.clear();
        motion.saveMotionPath(xkf.o(motion.acquireMotionPath()));
        this.f10031a.add(motion);
        if (motion.acquireCovers() != null) {
            this.f10031a.add(motion.acquireCovers());
        }
        if (i()) {
            return;
        }
        k();
    }

    private boolean i() {
        boolean zD = d();
        LogUtil.a("Suggest_RuningPostureSuggestActivity", "isHasDownLoaded:", Boolean.valueOf(zD));
        if (zD) {
            this.j.b(true);
            this.j.notifyDataSetChanged();
            this.j.b(3);
        }
        return zD;
    }

    private boolean d() {
        if (njy.e(this.m, this.d)) {
            LogUtil.e("Suggest_RuningPostureSuggestActivity", "mShowMotions is out of bounds");
            return false;
        }
        return xkf.s(this.m.get(this.d).acquireMotionPath());
    }

    private void k() {
        if (njy.e(this.m, this.d)) {
            return;
        }
        this.j.b(false);
        this.j.notifyDataSetChanged();
        if (njy.e(this.m, this.d)) {
            LogUtil.e("Suggest_RuningPostureSuggestActivity", "mShowMotions is out of bounds");
            return;
        }
        if (CommonUtil.ah(BaseApplication.getContext())) {
            LogUtil.a("Suggest_RuningPostureSuggestActivity", JsNetwork.NetworkType.MOBILE);
            this.j.b(1);
            this.j.b(gzx.c(BaseApplication.getContext(), com.huawei.ui.commonui.R.string.IDS_device_upgrade_file_size_mb, UnitUtil.e((this.m.get(this.d).acquireLength() * 1.0f) / 1048576.0f, 1, 1)));
        } else {
            LogUtil.a("Suggest_RuningPostureSuggestActivity", "wifi");
            this.j.b(0);
            c(this.m.get(this.d).acquireMotionPath());
        }
        this.j.a(new IntroPagerAdapter.IvDownLoadClick() { // from class: com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity.8
            @Override // com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter.IvDownLoadClick
            public void onIvDownLoadClick() {
                RuningPostureSuggestActivity runingPostureSuggestActivity = RuningPostureSuggestActivity.this;
                runingPostureSuggestActivity.c(((Motion) runingPostureSuggestActivity.m.get(RuningPostureSuggestActivity.this.d)).acquireMotionPath());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        LogUtil.a("Suggest_RuningPostureSuggestActivity", str);
        int size = this.m.size();
        int i = this.d;
        if (size <= i) {
            LogUtil.e("Suggest_RuningPostureSuggestActivity", "the download position is wrong");
            return;
        }
        Motion motion = this.m.get(i);
        if (this.g != null) {
            if (motion.acquireMotionPath().equals(this.g.f10040a) && !this.g.f10042c) {
                LogUtil.j("Suggest_RuningPostureSuggestActivity", "the video is on downloading");
                return;
            } else if (!motion.acquireMotionPath().equals(this.g.f10040a)) {
                LogUtil.j("Suggest_RuningPostureSuggestActivity", "canceled the video download task");
                this.g.f10042c = true;
            }
        }
        c cVar = new c();
        this.g = cVar;
        cVar.f10040a = motion.acquireMotionPath();
        Media media = new Media();
        media.setUrl(motion.acquireMotionPath());
        media.setPath(xkf.o(media.getUrl()));
        media.setLength(motion.acquireLength());
        media.setType(1);
        this.j.b(0);
        this.j.a(UnitUtil.e(0.0d, 2, 0));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(media);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggest_RuningPostureSuggestActivity", "toDownloadWorkoutMediaFile : courseApi is null.");
            return;
        }
        try {
            courseApi.downloadCourseMediaFileList(arrayList, media.getLength(), this.g);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("Suggest_RuningPostureSuggestActivity", "download mUrl is invalid:", str);
        }
    }

    private void a(int i) {
        if (i == 0) {
            this.r.getPreAction().setVisibility(4);
            if (i == this.m.size() - 1) {
                this.r.getNextAction().setVisibility(4);
                return;
            } else {
                this.r.getNextAction().setVisibility(0);
                return;
            }
        }
        if (i == this.m.size() - 1) {
            this.r.getPreAction().setVisibility(0);
            this.r.getNextAction().setVisibility(4);
        } else {
            this.r.getPreAction().setVisibility(0);
            this.r.getNextAction().setVisibility(0);
        }
    }

    private void g() {
        int i = this.d + 1;
        this.d = i;
        LogUtil.a("Suggest_RuningPostureSuggestActivity", "show next action", Integer.valueOf(i));
        if (this.d < this.m.size()) {
            j();
            this.r.setCurrentIndex(this.d + 1);
            c(this.d);
            a(this.d);
            return;
        }
        this.d = this.m.size() - 1;
    }

    private void h() {
        int i = this.d - 1;
        this.d = i;
        LogUtil.a("Suggest_RuningPostureSuggestActivity", "show pre action", Integer.valueOf(i));
        if (this.d >= 0) {
            j();
            this.r.setCurrentIndex(this.d + 1);
            c(this.d);
            a(this.d);
            return;
        }
        this.d = 0;
    }

    private void j() {
        this.j.b(4);
    }

    class c extends UiCallback<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10040a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10042c = false;

        c() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggest_RuningPostureSuggestActivity", "errorCode:", Integer.valueOf(i), "errorInfo:", str);
            if (CommonUtil.ah(BaseApplication.getContext())) {
                LogUtil.e("Suggest_RuningPostureSuggestActivity", "onFailure1");
                RuningPostureSuggestActivity.this.j.b(1);
            } else {
                LogUtil.e("Suggest_RuningPostureSuggestActivity", "onFailure2");
                RuningPostureSuggestActivity.this.j.b(2);
            }
            RuningPostureSuggestActivity.this.g.f10042c = true;
            qpx.e(RuningPostureSuggestActivity.this, R.string.IDS_FitnessAdvice_video_load_fail);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            RuningPostureSuggestActivity.this.j.b(true);
            RuningPostureSuggestActivity.this.j.notifyDataSetChanged();
            RuningPostureSuggestActivity.this.j.b(3);
            LogUtil.a("Suggest_RuningPostureSuggestActivity", "MediaFileItemDownLoadCallBack_success");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public boolean isCanceled() {
            return this.f10042c;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onProgress(long j, long j2) {
            super.onProgress(j, j2);
            LogUtil.a("Suggest_RuningPostureSuggestActivity", "handleBytes:", Long.valueOf(j), "-contentLength:", Long.valueOf(j2));
            if (j <= j2) {
                RuningPostureSuggestActivity.this.j.a(UnitUtil.e(((j * 1.0f) / j2) * 100.0f, 2, 0));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("Suggest_RuningPostureSuggestActivity", "onClick view = null");
            return;
        }
        if (view.getId() == R.id.sug_coach_iv_action_pre) {
            h();
        } else if (view.getId() == R.id.sug_coach_iv_action_nex) {
            g();
        } else if (view.getId() == R.id.ll_fitness_getdata_error) {
            e();
        }
    }

    private void e() {
        b();
        if (this.h) {
            CommonUtil.t(this);
        } else {
            f();
        }
    }

    private void f() {
        PostureSuggestBaseFragment[] postureSuggestBaseFragmentArr = this.f10032b;
        if (postureSuggestBaseFragmentArr != null) {
            for (PostureSuggestBaseFragment postureSuggestBaseFragment : postureSuggestBaseFragmentArr) {
                if (postureSuggestBaseFragment == null) {
                    LogUtil.j("Suggest_RuningPostureSuggestActivity", "postureSuggestBaseFragment == null");
                } else {
                    postureSuggestBaseFragment.e();
                }
            }
            return;
        }
        LogUtil.j("Suggest_RuningPostureSuggestActivity", "setFragmentActionData fragments is null");
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
        LogUtil.a("Suggest_RuningPostureSuggestActivity", "initViewController()");
    }

    public static <T> T b(Parcelable parcelable) throws Throwable {
        Parcel parcelObtain;
        try {
            parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeParcelable(parcelable, 0);
                parcelObtain.setDataPosition(0);
                T t = (T) parcelObtain.readParcelable(parcelable.getClass().getClassLoader());
                if (parcelObtain != null) {
                    parcelObtain.recycle();
                }
                return t;
            } catch (Throwable th) {
                th = th;
                if (parcelObtain != null) {
                    parcelObtain.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            parcelObtain = null;
        }
    }

    public class WifiReceiver extends BroadcastReceiver {
        public WifiReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("Suggest_RuningPostureSuggestActivity", "onReceive");
            if (CommonUtil.ab(BaseApplication.getContext())) {
                RuningPostureSuggestActivity.this.b();
                RuningPostureSuggestActivity.this.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        PostureSuggestBaseFragment[] postureSuggestBaseFragmentArr = this.f10032b;
        if (postureSuggestBaseFragmentArr != null) {
            for (PostureSuggestBaseFragment postureSuggestBaseFragment : postureSuggestBaseFragmentArr) {
                if (postureSuggestBaseFragment == null) {
                    LogUtil.j("Suggest_RuningPostureSuggestActivity", "postureSuggestBaseFragment == null");
                } else {
                    postureSuggestBaseFragment.e();
                }
            }
            return;
        }
        LogUtil.j("Suggest_RuningPostureSuggestActivity", "setFragmentActionDataFromWifi mFragments is null");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        this.r.d();
        this.j.e();
    }
}
