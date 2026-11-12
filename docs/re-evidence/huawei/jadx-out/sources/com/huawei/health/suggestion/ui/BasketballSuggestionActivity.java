package com.huawei.health.suggestion.ui;

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
import com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener;
import com.huawei.health.suggestion.ui.fitness.module.TrainActionIntro;
import com.huawei.health.suggestion.ui.fragment.AverageJumpHeightFragment;
import com.huawei.health.suggestion.ui.fragment.AverageJumpTimeFragment;
import com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.BasketballAdvice;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import defpackage.gzx;
import defpackage.njy;
import defpackage.qpn;
import defpackage.qpx;
import defpackage.xfz;
import defpackage.xkf;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class BasketballSuggestionActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthViewPager f8971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f8972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<BasketballAdvice> f8973c;
    private TranslateAnimation d;
    private TranslateAnimation e;
    private BasketballSuggestionBaseFragment[] g;
    private qpn i;
    private LinearLayout j;
    private IntroPagerAdapter n;
    private c o;
    private String[] p;
    private HealthSubTabWidget r;
    private b s;
    private TrainActionIntro t;
    private int h = 0;
    private int f = 0;
    private List<Motion> m = new ArrayList(10);
    private List l = new ArrayList(10);
    private boolean k = false;

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
        LogUtil.a("Suggestion_BasketballSuggestionActivity", "initViewController()");
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f = intent.getIntExtra("basketballFlag", 0);
            try {
                this.f8973c = intent.getParcelableArrayListExtra("basketballAdviceList");
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("Suggestion_BasketballSuggestionActivity", LogAnonymous.b(e));
            }
        }
        this.p = new String[]{getResources().getString(R.string.IDS_aw_version2_average_jump_height_full), getResources().getString(R.string.IDS_aw_version2_average_jump_time_full)};
        List<BasketballAdvice> list = this.f8973c;
        if (list == null || list.size() != this.p.length) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "basketball advice length error");
            finish();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        LogUtil.a("Suggestion_BasketballSuggestionActivity", "initViewController()");
        if (isFinishing()) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "Activity is finishing");
            return;
        }
        setContentView(com.huawei.health.suggestion.R.layout.sug_basketball_suggest);
        getWindow().setFlags(16777216, 16777216);
        this.f8971a = (HealthViewPager) findViewById(com.huawei.health.suggestion.R.id.sug_basketball_suggest_view_pager);
        this.g = new BasketballSuggestionBaseFragment[]{new AverageJumpHeightFragment(), new AverageJumpTimeFragment()};
        this.r = (HealthSubTabWidget) findViewById(com.huawei.health.suggestion.R.id.sug_basketball_tab);
        this.f8971a.setOffscreenPageLimit(this.p.length);
        this.i = new qpn(this, this.f8971a, this.r);
        int i = 0;
        while (true) {
            String[] strArr = this.p;
            if (i < strArr.length) {
                xfz xfzVarB = this.r.b(strArr[i]);
                Bundle bundle = new Bundle();
                bundle.putParcelable("basketballAdvice", this.f8973c.get(i));
                this.g[i].setArguments(bundle);
                this.i.b(xfzVarB, this.g[i], this.f == i);
                i++;
            } else {
                c();
                runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.5
                    @Override // java.lang.Runnable
                    public void run() {
                        BasketballSuggestionActivity.this.t.setAdapter(BasketballSuggestionActivity.this.n);
                    }
                });
                this.s = new b();
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.setPriority(500);
                registerReceiver(this.s, intentFilter);
                return;
            }
        }
    }

    private void c() {
        this.t = (TrainActionIntro) findViewById(com.huawei.health.suggestion.R.id.basketball_train_action_intro);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.huawei.health.suggestion.R.id.ll_fitness_getdata_error);
        this.j = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f8972b = findViewById(com.huawei.health.suggestion.R.id.sug_basketball_suggest_content);
        IntroPagerAdapter introPagerAdapter = new IntroPagerAdapter(this.l, com.huawei.health.suggestion.R.layout.sug_traindetail_vp_intro);
        this.n = introPagerAdapter;
        introPagerAdapter.b(false);
        this.t.getPreAction().setOnClickListener(this);
        this.t.getNextAction().setOnClickListener(this);
        this.t.getTitleBar().setVisibility(0);
        this.t.getTitleBar().setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BasketballSuggestionActivity basketballSuggestionActivity = BasketballSuggestionActivity.this;
                basketballSuggestionActivity.downDismiss(basketballSuggestionActivity.t);
            }
        });
        this.t.setOnSlidingListener(new OnSlidingListener() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.2
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSliding(float f) {
                BasketballSuggestionActivity.this.f8972b.setVisibility(0);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSlidingFinish(boolean z) {
                if (z) {
                    BasketballSuggestionActivity.this.t.setVisibility(4);
                    BasketballSuggestionActivity.this.f8972b.setVisibility(0);
                } else {
                    BasketballSuggestionActivity.this.t.setVisibility(0);
                    BasketballSuggestionActivity.this.f8972b.setVisibility(8);
                }
            }
        });
    }

    public void d() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (BasketballSuggestionActivity.this.j != null) {
                    if (BasketballSuggestionActivity.this.k == (!CommonUtil.ab(BaseApplication.getContext())) && BasketballSuggestionActivity.this.j.getVisibility() == 0) {
                        return;
                    }
                    HealthTextView healthTextView = (HealthTextView) BasketballSuggestionActivity.this.j.findViewById(com.huawei.health.suggestion.R.id.nfc_tip_title_text);
                    BasketballSuggestionActivity.this.k = !CommonUtil.ab(BaseApplication.getContext());
                    if (BasketballSuggestionActivity.this.k) {
                        BasketballSuggestionActivity.this.j.findViewById(com.huawei.health.suggestion.R.id.ll_setting).setVisibility(0);
                        healthTextView.setText(R.string.IDS_hwh_home_group_network_disconnection);
                        BasketballSuggestionActivity.this.j.setVisibility(0);
                    }
                }
            }
        });
    }

    public void a() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.4
            @Override // java.lang.Runnable
            public void run() {
                if (BasketballSuggestionActivity.this.j == null || BasketballSuggestionActivity.this.j.getVisibility() == 8) {
                    return;
                }
                BasketballSuggestionActivity.this.j.setVisibility(8);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        List<Motion> list;
        super.onResume();
        TrainActionIntro trainActionIntro = this.t;
        if (trainActionIntro == null || trainActionIntro.getVisibility() != 0 || (list = this.m) == null || list.size() <= this.h) {
            return;
        }
        i();
        if (f()) {
            return;
        }
        m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        TrainActionIntro trainActionIntro = this.t;
        if (trainActionIntro != null && trainActionIntro.getVisibility() == 0) {
            downDismiss(this.t);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.s;
        if (bVar != null) {
            unregisterReceiver(bVar);
        }
    }

    public void e(int i, List<Motion> list) {
        this.t.e(i + 1, list.size());
        this.m = list;
        this.h = i;
        upShow(this.t);
        i();
        a(this.h);
        e(i);
    }

    public void upShow(final View view) {
        if (view == null) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "upShow, view is null");
            return;
        }
        if (this.d == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.d = translateAnimation;
            translateAnimation.setDuration(500L);
            this.d.setInterpolator(new DecelerateInterpolator());
            this.d.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.7
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    view.setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    LogUtil.a("Suggestion_BasketballSuggestionActivity", "onAnimationEnd");
                    BasketballSuggestionActivity.this.f8972b.setVisibility(8);
                }
            });
        }
        view.startAnimation(this.d);
    }

    public void downDismiss(final View view) {
        if (view == null) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "downDismiss, view is null");
            return;
        }
        TranslateAnimation translateAnimation = this.e;
        if (translateAnimation == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            this.e = translateAnimation2;
            translateAnimation2.setDuration(500L);
            this.e.setInterpolator(new DecelerateInterpolator());
            this.e.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.6
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    BasketballSuggestionActivity.this.f8972b.setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(4);
                }
            });
        } else if (!translateAnimation.hasEnded()) {
            return;
        }
        view.startAnimation(this.e);
    }

    private void a(int i) {
        if (njy.e(this.m, i)) {
            return;
        }
        Motion motion = (Motion) b(this.m.get(i));
        this.l.clear();
        motion.saveMotionPath(xkf.o(motion.acquireMotionPath()));
        this.l.add(motion);
        if (motion.acquireCovers() != null) {
            this.l.add(motion.acquireCovers());
        }
        if (f()) {
            return;
        }
        m();
    }

    private boolean f() {
        boolean zJ = j();
        LogUtil.a("Suggestion_BasketballSuggestionActivity", "isDownload:", Boolean.valueOf(zJ));
        if (zJ) {
            this.n.b(true);
            this.n.notifyDataSetChanged();
            this.n.b(3);
        }
        return zJ;
    }

    private boolean j() {
        if (njy.e(this.m, this.h)) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "isDownload, mCurrentActionPosition out of bounds");
            return false;
        }
        return xkf.s(this.m.get(this.h).acquireMotionPath());
    }

    private void m() {
        this.n.b(false);
        this.n.notifyDataSetChanged();
        if (njy.e(this.m, this.h)) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "showMask, mCurrentActionPosition out of bounds");
            return;
        }
        if (CommonUtil.ah(BaseApplication.getContext())) {
            LogUtil.a("Suggestion_BasketballSuggestionActivity", JsNetwork.NetworkType.MOBILE);
            this.n.b(1);
            this.n.b(gzx.c(BaseApplication.getContext(), R.string.IDS_device_upgrade_file_size_mb, UnitUtil.e((this.m.get(this.h).acquireLength() * 1.0f) / 1048576.0f, 1, 1)));
        } else {
            LogUtil.a("Suggestion_BasketballSuggestionActivity", "wifi");
            this.n.b(0);
            a(this.m.get(this.h).acquireMotionPath());
        }
        this.n.a(new IntroPagerAdapter.IvDownLoadClick() { // from class: com.huawei.health.suggestion.ui.BasketballSuggestionActivity.9
            @Override // com.huawei.health.suggestion.ui.fitness.helper.IntroPagerAdapter.IvDownLoadClick
            public void onIvDownLoadClick() {
                if (njy.e(BasketballSuggestionActivity.this.m, BasketballSuggestionActivity.this.h)) {
                    return;
                }
                BasketballSuggestionActivity basketballSuggestionActivity = BasketballSuggestionActivity.this;
                basketballSuggestionActivity.a(((Motion) basketballSuggestionActivity.m.get(BasketballSuggestionActivity.this.h)).acquireMotionPath());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LogUtil.a("Suggestion_BasketballSuggestionActivity", str);
        int size = this.m.size();
        int i = this.h;
        if (size <= i) {
            LogUtil.e("Suggestion_BasketballSuggestionActivity", "the download position is wrong");
            return;
        }
        Motion motion = this.m.get(i);
        if (this.o != null) {
            if (motion.acquireMotionPath().equals(this.o.f8981c) && !this.o.d) {
                LogUtil.j("Suggestion_BasketballSuggestionActivity", "the video is on downloading");
                return;
            } else if (!motion.acquireMotionPath().equals(this.o.f8981c)) {
                LogUtil.j("Suggestion_BasketballSuggestionActivity", "canceled the video download task");
                this.o.d = true;
            }
        }
        c cVar = new c();
        this.o = cVar;
        cVar.f8981c = motion.acquireMotionPath();
        Media media = new Media();
        media.setUrl(motion.acquireMotionPath());
        media.setPath(xkf.o(media.getUrl()));
        media.setLength(motion.acquireLength());
        media.setType(1);
        this.n.b(0);
        this.n.a(UnitUtil.e(0.0d, 2, 0));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(media);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "toDownloadWorkoutMediaFile : courseApi is null.");
            return;
        }
        try {
            courseApi.downloadCourseMediaFileList(arrayList, media.getLength(), this.o);
        } catch (IllegalArgumentException e) {
            LogUtil.e("Suggestion_BasketballSuggestionActivity", "download mUrl is invalid:", LogAnonymous.b(e));
        }
    }

    private void e(int i) {
        if (i == 0) {
            this.t.getPreAction().setVisibility(4);
            if (i == this.m.size() - 1) {
                this.t.getNextAction().setVisibility(4);
                return;
            } else {
                this.t.getNextAction().setVisibility(0);
                return;
            }
        }
        if (i == this.m.size() - 1) {
            this.t.getPreAction().setVisibility(0);
            this.t.getNextAction().setVisibility(4);
        } else {
            this.t.getPreAction().setVisibility(0);
            this.t.getNextAction().setVisibility(0);
        }
    }

    private void g() {
        int i = this.h + 1;
        this.h = i;
        LogUtil.a("Suggestion_BasketballSuggestionActivity", "show next action ", Integer.valueOf(i));
        if (this.h < this.m.size()) {
            i();
            this.t.setCurrentIndex(this.h + 1);
            a(this.h);
            e(this.h);
            return;
        }
        this.h = this.m.size() - 1;
    }

    private void h() {
        int i = this.h - 1;
        this.h = i;
        LogUtil.a("Suggestion_BasketballSuggestionActivity", "show pre action", Integer.valueOf(i));
        if (this.h >= 0) {
            i();
            this.t.setCurrentIndex(this.h + 1);
            a(this.h);
            e(this.h);
            return;
        }
        this.h = 0;
    }

    private void i() {
        this.n.b(4);
    }

    class c extends UiCallback<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f8981c;
        private boolean d = false;

        c() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_BasketballSuggestionActivity", "errorCode:", Integer.valueOf(i), "errorInfo:", str);
            if (CommonUtil.ah(BaseApplication.getContext())) {
                LogUtil.j("Suggestion_BasketballSuggestionActivity", "onFailure1");
                BasketballSuggestionActivity.this.n.b(1);
            } else {
                LogUtil.j("Suggestion_BasketballSuggestionActivity", "onFailure2");
                BasketballSuggestionActivity.this.n.b(2);
            }
            BasketballSuggestionActivity.this.o.d = true;
            qpx.e(BasketballSuggestionActivity.this, com.huawei.health.suggestion.R.string.IDS_FitnessAdvice_video_load_fail);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            BasketballSuggestionActivity.this.n.b(true);
            BasketballSuggestionActivity.this.n.notifyDataSetChanged();
            BasketballSuggestionActivity.this.n.b(3);
            LogUtil.a("Suggestion_BasketballSuggestionActivity", "MediaFileItemDownLoadCallBack_success");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public boolean isCanceled() {
            return this.d;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onProgress(long j, long j2) {
            super.onProgress(j, j2);
            LogUtil.a("Suggestion_BasketballSuggestionActivity", "handleBytes:", Long.valueOf(j), "-contentLength:", Long.valueOf(j2));
            if (j <= j2) {
                BasketballSuggestionActivity.this.n.a(UnitUtil.e(((j * 1.0f) / j2) * 100.0f, 2, 0));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == com.huawei.health.suggestion.R.id.sug_coach_iv_action_pre) {
            h();
            return;
        }
        if (view.getId() == com.huawei.health.suggestion.R.id.sug_coach_iv_action_nex) {
            g();
        } else if (view.getId() == com.huawei.health.suggestion.R.id.ll_fitness_getdata_error) {
            b();
        } else {
            LogUtil.a("Suggestion_BasketballSuggestionActivity", "onClick()");
        }
    }

    private void b() {
        a();
        if (this.k) {
            CommonUtil.t(this);
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        BasketballSuggestionBaseFragment[] basketballSuggestionBaseFragmentArr = this.g;
        if (basketballSuggestionBaseFragmentArr != null) {
            for (BasketballSuggestionBaseFragment basketballSuggestionBaseFragment : basketballSuggestionBaseFragmentArr) {
                if (basketballSuggestionBaseFragment != null) {
                    basketballSuggestionBaseFragment.e();
                }
            }
        }
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

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("Suggestion_BasketballSuggestionActivity", "onReceive");
            if (intent == null || intent.getAction() == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || !CommonUtil.ab(BaseApplication.getContext())) {
                return;
            }
            BasketballSuggestionActivity.this.a();
            BasketballSuggestionActivity.this.e();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        this.t.d();
        IntroPagerAdapter introPagerAdapter = this.n;
        if (introPagerAdapter != null) {
            introPagerAdapter.e();
        }
    }
}
