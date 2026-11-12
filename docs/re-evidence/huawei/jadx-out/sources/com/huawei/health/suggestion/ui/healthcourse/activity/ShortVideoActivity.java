package com.huawei.health.suggestion.ui.healthcourse.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.healthcourse.adapter.ShortVideoPagerAdapter;
import com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment;
import com.huawei.health.suggestion.ui.healthcourse.helper.ShortVideoWifiBroadcastReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.HealthCourseJumpParameter;
import com.huawei.pluginfitnessadvice.course.BaseVideoInfo;
import com.huawei.pluginfitnessadvice.course.EssenceVideoInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.buh;
import defpackage.hjt;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ShortVideoActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseVideoFragment f9556c;
    private ViewPager2 f;
    private ShortVideoPagerAdapter g;
    private String h;
    private ShortVideoWifiBroadcastReceiver k;
    private hjt m;
    private int d = 0;
    private int j = -1;
    private int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<BaseVideoInfo> f9554a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9555b = false;
    private boolean e = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Suggestion_ShortVideoActivity", "onCreate");
        h();
        clearBackgroundDrawable();
        if (CommonUtil.ah(this) && e(true)) {
            LogUtil.a("Suggestion_ShortVideoActivity", "ShowMobileDialog");
        } else {
            b();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        LogUtil.a("Suggestion_ShortVideoActivity", "onNewIntent");
        super.onNewIntent(intent);
        e(intent);
    }

    private void b() {
        this.f9555b = true;
        setContentView(R.layout.sug_viewpager_short_video);
        Intent intent = getIntent();
        d(intent);
        a(intent);
        g();
        j();
        ThreadPoolManager.c().execute(new Runnable() { // from class: hok
            @Override // java.lang.Runnable
            public final void run() {
                this.d.f();
            }
        });
    }

    private void g() {
        this.f = (ViewPager2) findViewById(R.id.viewPager);
        ShortVideoPagerAdapter shortVideoPagerAdapter = new ShortVideoPagerAdapter(this, this.f9554a, true);
        this.g = shortVideoPagerAdapter;
        this.f.setAdapter(shortVideoPagerAdapter);
        this.f.setOffscreenPageLimit(1);
        this.f.setOrientation(1);
        this.f.getChildAt(0).setOverScrollMode(2);
        this.f.registerOnPageChangeCallback(new AnonymousClass1());
        b(this.d);
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.healthcourse.activity.ShortVideoActivity$1, reason: invalid class name */
    public class AnonymousClass1 extends ViewPager2.OnPageChangeCallback {
        AnonymousClass1() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            ShortVideoActivity.this.f.setUserInputEnabled(false);
            ShortVideoActivity.this.f.postDelayed(new Runnable() { // from class: hoi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36982a.a();
                }
            }, 300L);
        }

        public /* synthetic */ void a() {
            ShortVideoActivity.this.f.setUserInputEnabled(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ShortVideoActivity.this.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int itemCount = this.g.getItemCount();
        if (!this.g.d() || itemCount <= 1) {
            return;
        }
        int currentItem = this.f.getCurrentItem();
        if (currentItem == 0) {
            this.f.setCurrentItem(itemCount - 2, false);
        } else if (currentItem == itemCount - 1) {
            this.f.setCurrentItem(1, false);
        }
    }

    private void d(Intent intent) {
        if (intent == null) {
            return;
        }
        this.d = intent.getIntExtra("currentOrder", 0);
        String stringExtra = intent.getStringExtra("serialCourseId");
        this.h = stringExtra;
        LogUtil.a("Suggestion_ShortVideoActivity", "currentOrder: ", Integer.valueOf(this.d), "get serialCourseId = ", stringExtra);
    }

    private void e(Intent intent) {
        if (intent == null) {
            return;
        }
        HealthCourseJumpParameter healthCourseJumpParameter = (HealthCourseJumpParameter) intent.getParcelableExtra("healthCourseJumpParameter");
        LogUtil.a("Suggestion_ShortVideoActivity", "initCourseData = ", healthCourseJumpParameter);
        if (healthCourseJumpParameter == null) {
            ReleaseLogUtil.e("Suggestion_ShortVideoActivity", "healthCourseJumpParameter is null");
            return;
        }
        int currentOrder = healthCourseJumpParameter.getCurrentOrder();
        this.d = currentOrder;
        b(currentOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.f == null) {
            LogUtil.j("Suggestion_ShortVideoActivity", "mViewPager is null");
            return;
        }
        if (this.g.d() && this.g.getItemCount() > 1) {
            ViewPager2 viewPager2 = this.f;
            if (i == 0) {
                i = 1;
            }
            viewPager2.setCurrentItem(i, false);
            return;
        }
        this.f.setCurrentItem(i == 0 ? 0 : i - 1, false);
    }

    private void a(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            LogUtil.a("Suggestion_ShortVideoActivity", "has got serialCourseId = ", this.h);
            return;
        }
        try {
            HealthCourseJumpParameter healthCourseJumpParameter = (HealthCourseJumpParameter) intent.getParcelableExtra("healthCourseJumpParameter");
            LogUtil.a("Suggestion_ShortVideoActivity", "initCourseData = ", healthCourseJumpParameter);
            if (healthCourseJumpParameter == null) {
                return;
            }
            this.d = healthCourseJumpParameter.getCurrentOrder();
            this.i = healthCourseJumpParameter.getTotalCount();
            this.f9554a = e(healthCourseJumpParameter.getEssenceVideos());
            this.h = healthCourseJumpParameter.getSerialCourseId();
        } catch (Exception e) {
            LogUtil.e("Suggestion_ShortVideoActivity", LogAnonymous.b(e));
        }
    }

    private List<BaseVideoInfo> e(List<EssenceVideoInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!njy.e(this.f9554a)) {
            LogUtil.a("Suggestion_ShortVideoActivity", "essenceVideoInfos is not empty");
            return;
        }
        if (TextUtils.isEmpty(this.h)) {
            LogUtil.a("Suggestion_ShortVideoActivity", "serialCourseId is not empty");
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.e("Suggestion_ShortVideoActivity", "params invalid");
        } else {
            courseApi.queryEssenceVideos(this.h, new UiCallback<List<EssenceVideoInfo>>() { // from class: com.huawei.health.suggestion.ui.healthcourse.activity.ShortVideoActivity.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_ShortVideoActivity", "queryEssenceVideos onFailure errorInfo is: ", str, "errorCode is: ", Integer.valueOf(i));
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<EssenceVideoInfo> list) {
                    ShortVideoActivity.this.b(list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<EssenceVideoInfo> list) {
        this.f9554a.addAll(list);
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.suggestion.ui.healthcourse.activity.ShortVideoActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ShortVideoActivity.this.g.e(ShortVideoActivity.this.f9554a);
                ShortVideoActivity shortVideoActivity = ShortVideoActivity.this;
                shortVideoActivity.b(shortVideoActivity.d);
            }
        });
    }

    public void a() {
        this.f.setCurrentItem(this.f.getCurrentItem() + 1, true);
    }

    private void j() {
        if (this.k == null) {
            ShortVideoWifiBroadcastReceiver shortVideoWifiBroadcastReceiver = new ShortVideoWifiBroadcastReceiver(this);
            this.k = shortVideoWifiBroadcastReceiver;
            if (this.e) {
                shortVideoWifiBroadcastReceiver.e(true);
            }
        }
        LogUtil.a("Suggestion_ShortVideoActivity", "Enter registerWifiBroadcast()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.k, intentFilter);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        BaseVideoFragment baseVideoFragmentD = d();
        if (baseVideoFragmentD != null) {
            baseVideoFragmentD.a();
        }
        LogUtil.a("Suggestion_ShortVideoActivity", "onStop");
    }

    public BaseVideoFragment d() {
        ViewPager2 viewPager2 = this.f;
        if (viewPager2 == null) {
            ReleaseLogUtil.e("Suggestion_ShortVideoActivity", "getCurrentFragment mViewPager is null");
            return null;
        }
        if (viewPager2.getCurrentItem() != this.j) {
            int currentItem = this.f.getCurrentItem();
            this.j = currentItem;
            this.f9556c = e(currentItem);
        }
        return this.f9556c;
    }

    private BaseVideoFragment e(int i) {
        ShortVideoPagerAdapter shortVideoPagerAdapter;
        if (this.f == null || (shortVideoPagerAdapter = this.g) == null) {
            ReleaseLogUtil.d("Suggestion_ShortVideoActivity", "getCurrentFragment viewPager == null");
            return null;
        }
        long itemId = shortVideoPagerAdapter.getItemId(i);
        LogUtil.a("Suggestion_ShortVideoActivity", "itemId: ", Long.valueOf(itemId));
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("f" + itemId);
        if (fragmentFindFragmentByTag instanceof BaseVideoFragment) {
            LogUtil.a("Suggestion_ShortVideoActivity", "fragment instanceof BaseVideoFragment");
            return (BaseVideoFragment) fragmentFindFragmentByTag;
        }
        LogUtil.e("Suggestion_ShortVideoActivity", "fragment !instanceof BaseVideoFragment");
        return null;
    }

    private void h() {
        hjt hjtVarD = hjt.d(this);
        this.m = hjtVarD;
        hjtVarD.e(R.layout.sug_fitness_coach_dialog_exit).e(R.id.sug_dialog_tv_content, R.string.IDS_FitnessAdvice_use_rate_of_flow).d(R.id.sug_coach_dialog_yse, com.huawei.ui.commonui.R.string.IDS_apphelp_pwindows_continue_button).e(R.id.sug_coach_dialog_No, new View.OnClickListener() { // from class: hoc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36976c.c(view);
            }
        }).e(R.id.sug_coach_dialog_yse, new View.OnClickListener() { // from class: hof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36979c.e(view);
            }
        });
        this.m.a().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hol
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f36985c.b(dialogInterface);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        this.m.b();
        finish();
    }

    public /* synthetic */ void e(View view) {
        this.m.b();
        buh.c(true);
        this.e = true;
        if (!this.f9555b) {
            b();
            return;
        }
        BaseVideoFragment baseVideoFragmentD = d();
        if (baseVideoFragmentD == null) {
            LogUtil.j("Suggestion_ShortVideoActivity", "shortVideoFragment == null");
        } else {
            baseVideoFragmentD.onResume();
            LogUtil.a("Suggestion_ShortVideoActivity", "initWifiDialog isHasRemindMobileConnected true");
        }
    }

    public /* synthetic */ void b(DialogInterface dialogInterface) {
        finish();
    }

    public boolean e(boolean z) {
        boolean zD = buh.d();
        LogUtil.a("Suggestion_ShortVideoActivity", "checkShowWifiDialog:", Boolean.valueOf(zD));
        if (zD) {
            return false;
        }
        this.m.e();
        if (z) {
            return true;
        }
        BaseVideoFragment baseVideoFragmentD = d();
        if (baseVideoFragmentD == null) {
            LogUtil.j("Suggestion_ShortVideoActivity", "shortVideoFragment == null");
            return true;
        }
        if (baseVideoFragmentD.c()) {
            baseVideoFragmentD.onPause();
            LogUtil.a("Suggestion_ShortVideoActivity", "baseVideoFragment onPause");
        }
        return true;
    }

    public boolean c() {
        long jC = buh.c();
        LogUtil.a("Suggestion_ShortVideoActivity", "mobileToastTime is: ", Long.valueOf(jC));
        if (Math.abs(System.currentTimeMillis() - jC) < 300000) {
            LogUtil.a("Suggestion_ShortVideoActivity", "mobileToastTime is not more then 5min");
            return false;
        }
        buh.c(System.currentTimeMillis());
        qpx.b(this, R.string.IDS_FitnessAdvice_use_rate_of_flow);
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i();
    }

    private void i() {
        if (this.k != null) {
            LogUtil.a("Suggestion_ShortVideoActivity", "Enter unregisterWifiBroadcast()");
            try {
                unregisterReceiver(this.k);
            } catch (IllegalArgumentException e) {
                LogUtil.j("Suggestion_ShortVideoActivity", LogAnonymous.b(e));
            } catch (RuntimeException e2) {
                LogUtil.j("Suggestion_ShortVideoActivity", LogAnonymous.b(e2));
            }
            this.k = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
