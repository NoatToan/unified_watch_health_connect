package com.huawei.ui.main.stories.history;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hms.common.data.DataHolder;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment;
import com.huawei.ui.main.stories.history.inputhistory.InputSportHistoryActivity;
import com.huawei.ui.main.stories.history.view.SportArrayAdapter;
import defpackage.jry;
import defpackage.lmf;
import defpackage.njy;
import defpackage.nkx;
import defpackage.ppv;
import defpackage.qre;
import defpackage.qrs;
import defpackage.vqo;
import defpackage.vqx;
import defpackage.vrg;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class SportHistoryActivity extends BaseActivity {
    private static boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f28254a;
    private Animation f;
    private HealthTextView h;
    private HealthTextView i;
    private Animation j;
    private String[] l;
    private SportHistoryListFragment m;
    private LinearLayout n;
    private HealthSpinner r;
    private HealthSpinner t;
    private CopyOnWriteArrayList<Integer> k = new CopyOnWriteArrayList<>();
    private ArrayList<Integer> p = new ArrayList<>();
    private int o = 0;
    private int s = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28256c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28255b = false;
    private boolean g = true;
    private Handler d = new Handler() { // from class: com.huawei.ui.main.stories.history.SportHistoryActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                SportHistoryActivity.this.f28256c = true;
            } else if (i == 2) {
                SportHistoryActivity.this.s();
                return;
            } else if (i == 3) {
                if (SportHistoryActivity.this.f28256c) {
                    return;
                } else {
                    SportHistoryActivity.this.f28256c = true;
                }
            }
            if (SportHistoryActivity.this.f28256c) {
                if (!SportHistoryActivity.this.k.contains(Integer.valueOf(SportHistoryActivity.this.o))) {
                    SportHistoryActivity.this.o = 0;
                }
                removeMessages(3);
                SportHistoryActivity.this.q();
                if (SportHistoryActivity.this.a() != 0) {
                    return;
                }
                SportHistoryActivity.this.m.c(SportHistoryActivity.this.o);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        p();
        if (!this.p.contains(Integer.valueOf(a()))) {
            int iA = a();
            LogUtil.j("Track_TrackSportHistoryActivity", "mSubSportType is ", Integer.valueOf(iA), " list is ", this.p);
            h(0);
            this.m.b(0);
            return;
        }
        if (a() != 0) {
            this.m.b(a());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_TrackSportHistoryActivity", "onCreate");
        ActivityTransitionAnimator activityTransitionAnimatorA = ActivityTransitionAnimator.c().a((Activity) this);
        boolean zA = activityTransitionAnimatorA.a();
        if (zA) {
            activityTransitionAnimatorA.f();
        } else {
            clearBackgroundDrawable();
        }
        setContentView(R.layout.activity_track_sport_history);
        if (zA) {
            activityTransitionAnimatorA.d(true).d(new BaseActivity.e(this)).e();
        }
        o();
        m();
        h();
        f();
        this.d.sendEmptyMessageDelayed(3, 5000L);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vpn
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
        e(this.o);
    }

    public /* synthetic */ void c() {
        l();
        n();
        if (!e) {
            HiHealthNativeApi.a(this).synCloud(HiSyncOption.getSyncOption(5, 2), null);
            e = true;
        }
        ppv.d().a();
    }

    private void n() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(this).setPageId(120).build());
        }
    }

    private void m() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentById(R.id.frag_sport_history_list) == null) {
            this.m = new SportHistoryListFragment(this.o);
            fragmentTransactionBeginTransaction.add(R.id.frag_sport_history_list, this.m);
            fragmentTransactionBeginTransaction.commit();
        } else if (supportFragmentManager.findFragmentById(R.id.frag_sport_history_list) instanceof SportHistoryListFragment) {
            this.m = (SportHistoryListFragment) supportFragmentManager.findFragmentById(R.id.frag_sport_history_list);
        }
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.sport_history_titlebar);
        this.f28254a = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getColor(R.color.colorSubBackground));
        this.t = this.f28254a.getTitleSpinner();
        this.f28254a.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_appbar_more), qre.f(R.string.IDS_contact_add));
        r();
        this.f28254a.setRightSoftkeyVisibility(0);
        this.f28254a.setRightSoftkeyBackground(ContextCompat.getDrawable(this, R.drawable.ic_health_toolbar_data), qre.f(R.string.IDS_hwh_motiontrack_sport_data_statistics));
        this.f28254a.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: vpm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51434b.b(view);
            }
        });
        k();
    }

    public /* synthetic */ void b(View view) {
        a(false);
    }

    private void r() {
        this.f28254a.setRightButtonOnClickListener(new View.OnClickListener() { // from class: vph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        new PopViewList(this, this.f28254a, new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_hwh_input_history_data_add_workout_record), getResources().getString(R.string.IDS_workout_records_merge)))).b(new PopViewList.PopViewClickListener() { // from class: vpj
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.d.b(i);
            }
        });
    }

    public /* synthetic */ void b(int i) {
        if (i == 0) {
            a(true);
        } else {
            if (i != 1) {
                return;
            }
            AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sports-record?h5pro=true&urlType=4&pName=com.huawei.health&path=ActiveMergeRecord")).e(268435456).b(BaseApplication.getContext());
        }
    }

    private void k() {
        this.n = (LinearLayout) findViewById(R.id.ll_sport_history_scroll_title);
        this.i = (HealthTextView) findViewById(R.id.htv_sport_history_cut_time);
        this.h = (HealthTextView) findViewById(R.id.htv_sport_history_cut_content);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        this.j = alphaAnimation;
        alphaAnimation.setDuration(150L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.1f);
        this.f = alphaAnimation2;
        alphaAnimation2.setDuration(150L);
        this.f.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.ui.main.stories.history.SportHistoryActivity.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SportHistoryActivity.this.n.setVisibility(8);
            }
        });
    }

    public void c(int i) {
        LinearLayout linearLayout = this.n;
        if (linearLayout == null || linearLayout.getVisibility() == i) {
            return;
        }
        if (i == 0) {
            this.n.setVisibility(i);
            this.n.startAnimation(this.j);
        } else {
            this.n.startAnimation(this.f);
        }
    }

    public void b(String str, String str2) {
        if (this.i != null && !TextUtils.isEmpty(str)) {
            this.i.setText(str);
        }
        if (this.h == null || TextUtils.isEmpty(str2)) {
            return;
        }
        this.h.setText(str2);
    }

    public void a(boolean z) {
        if (this.f28255b) {
            LogUtil.a("Track_TrackSportHistoryActivity", "don't click to fast");
            return;
        }
        this.d.postDelayed(new Runnable() { // from class: vpf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.g();
            }
        }, 500L);
        this.f28255b = true;
        if (z) {
            LogUtil.a("Track_TrackSportHistoryActivity", "onClick() add sport data");
            startActivity(new Intent(this, (Class<?>) InputSportHistoryActivity.class));
            e(AnalyticsValue.SPORT_RECORD_ADD_MOTION_RECORD_2040186.value());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) SportDataActivity.class);
        if (njy.b(this.k.clone(), Integer.class)) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.addAll(this.k);
            intent.putIntegerArrayListExtra("type_list", arrayList);
            intent.putExtra(DataHolder.TYPE_INT, this.o);
            startActivity(intent);
        }
        e(AnalyticsValue.BI_TRACK_SHOW_STAT_1040035.value());
    }

    public /* synthetic */ void g() {
        this.f28255b = false;
    }

    private void e(String str) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.o));
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    public int a() {
        return this.s;
    }

    public void h(int i) {
        this.s = i;
    }

    public void h() {
        nkx.a(new d(this));
    }

    public void f() {
        if (this.o == 10001 && this.g) {
            nkx.b(new c(this));
            this.g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (njy.e(this.k)) {
            ReleaseLogUtil.e("Track_TrackSportHistoryActivity", "mSportSortList is empty");
            return;
        }
        ArrayAdapter<String> arrayAdapterC = c(vrg.b(this.k, this));
        HealthSpinner healthSpinner = this.t;
        if (healthSpinner != null) {
            healthSpinner.setAdapter((SpinnerAdapter) arrayAdapterC);
            this.t.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.ui.main.stories.history.SportHistoryActivity.5
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    LogUtil.a("Track_TrackSportHistoryActivity", "onItemSelected");
                    SportHistoryActivity sportHistoryActivity = SportHistoryActivity.this;
                    sportHistoryActivity.o = vrg.d(i, sportHistoryActivity.k);
                    SportHistoryActivity.this.f();
                    SportHistoryActivity.this.j();
                }
            });
            int iA = vrg.a(this.o, this.k);
            LogUtil.a("Track_TrackSportHistoryActivity", "updateSpinner mSportType = ", Integer.valueOf(this.o), " selection = ", Integer.valueOf(iA));
            this.t.setSelection(iA, true);
            this.t.setClickable(false);
            SportHistoryListFragment sportHistoryListFragment = this.m;
            if (sportHistoryListFragment != null) {
                sportHistoryListFragment.a(new IBaseResponseCallback() { // from class: vpe
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.d.c(i, obj);
                    }
                });
            }
        }
    }

    public /* synthetic */ void c(int i, Object obj) {
        this.t.setClickable(true);
    }

    private void p() {
        ArrayList<Integer> arrayList;
        this.l = vrg.c(this.p, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, com.huawei.ui.commonui.R.layout.health_commonui_spinner_item_appbar, this.l);
        arrayAdapter.setDropDownViewResource(R.layout.hwspinner_dropdown_item);
        HealthSpinner healthSpinnerB = this.m.b();
        this.r = healthSpinnerB;
        if (healthSpinnerB == null || (arrayList = this.p) == null || arrayList.size() <= 1) {
            return;
        }
        this.r.setAdapter((SpinnerAdapter) arrayAdapter);
        int iA = vrg.a(a(), this.p);
        if (this.r.getCount() > iA) {
            this.r.setSelection(iA, true);
        }
        this.r.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.ui.main.stories.history.SportHistoryActivity.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                LogUtil.a("Track_TrackSportHistoryActivity", "onItemSubSelected");
                SportHistoryActivity.this.d(i);
            }
        });
        if (this.o == 10001) {
            this.r.setVisibility(0);
        }
    }

    private void o() {
        i();
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
            this.o = intExtra;
            if (intExtra == 264) {
                this.o = 258;
            } else if (intExtra == 266) {
                this.o = 262;
            } else if (intExtra == 10001) {
                h(intent.getIntExtra("subSportType", 0));
            } else if (intExtra == 282) {
                this.o = 257;
            } else if (intExtra == 283) {
                h(intent.getIntExtra("subSportType", 0));
            } else if (intExtra == 289 || intExtra == 288 || intExtra == 291) {
                this.o = 287;
            } else if (!jry.a(getApplicationContext()).e().contains(Integer.valueOf(this.o))) {
                this.o = 258;
            }
            if ("jumpFromFileSyncNotify".equals(intent.getStringExtra("entrance"))) {
                LogUtil.a("Track_TrackSportHistoryActivity", "BI JUMP_FROM_FILE_SYNC_NOTIFY");
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(this, AnalyticsValue.HEALTH_JUMP_SPORT_HISTORY_FROM_NOTIFY_1040064.value(), map, 0);
            }
        }
    }

    private void i() {
        this.k.add(0);
        this.k.add(258);
        this.k.add(257);
        this.k.add(259);
        this.k.add(10001);
        this.k.add(283);
    }

    public void e(int i) {
        if (!vqx.e(i) || i == 0) {
            this.f28254a.setRightButtonVisibility(0);
        } else {
            this.f28254a.setRightButtonVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.r == null) {
            this.r = this.m.b();
        }
        if (this.o == 10001 && this.p.size() > 1) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
        if (a() != 0) {
            this.m.b(a());
        }
        this.m.c(this.o);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vpk
            @Override // java.lang.Runnable
            public final void run() {
                this.f51432c.b();
            }
        });
    }

    public /* synthetic */ void b() {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.o));
        map.put("category", 0);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BI_TRACK_HISTORY_CHANGE_SPORT_TYPE_1040034.value(), map, 0);
    }

    public void d(final int i) {
        h(this.p.get(i).intValue());
        LogUtil.a("Track_TrackSportHistoryActivity", Integer.valueOf(i), " ", Integer.valueOf(a()));
        this.m.e(a());
        ThreadPoolManager.c().execute(new Runnable() { // from class: vpg
            @Override // java.lang.Runnable
            public final void run() {
                this.f51429a.a(i);
            }
        });
    }

    public /* synthetic */ void a(int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.o));
        map.put("category", Integer.valueOf(a()));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BI_TRACK_HISTORY_CHANGE_SPORT_TYPE_1040034.value(), map, 0);
        f(i);
    }

    private void f(int i) {
        String[] strArr = this.l;
        if (strArr == null || strArr.length <= i) {
            return;
        }
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("dataType", this.l[i]);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SPORT_RECORD_CHANGE_FITNESS_TYPE_2040193.value(), map, 0);
    }

    private void l() {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_FITNESS_DOT", String.valueOf(false), new StorageParams());
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SPORT_CARD_RED_DOT_FOR_AUTO_TRACK", String.valueOf(false), new StorageParams());
        LogUtil.a("Track_TrackSportHistoryActivity", "set SHOW_FITNESS_RED_DOT false");
        String string = Long.toString(System.currentTimeMillis());
        String usetId = LoginInit.getInstance(BaseApplication.getContext()).getUsetId();
        StorageParams storageParams = new StorageParams();
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "in_sport_history_activity_time", string + "##" + usetId, storageParams);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.d.removeCallbacksAndMessages(null);
        vqo.e();
    }

    @Override // android.app.Activity
    public void finish() {
        if (ActivityTransitionAnimator.c().a()) {
            HandlerExecutor.b(new Runnable() { // from class: vpi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51431c.e();
                }
            });
        } else {
            super.finish();
        }
    }

    public /* synthetic */ void e() {
        ActivityTransitionAnimator.c().a(qrs.ad(this)).c(qrs.q(this)).b();
    }

    public boolean d() {
        if (getIntent() == null) {
            return false;
        }
        return getIntent().getBooleanExtra("ExitApp", false);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements IBaseResponseCallback {
        private WeakReference<SportHistoryActivity> e;

        d(SportHistoryActivity sportHistoryActivity) {
            this.e = new WeakReference<>(sportHistoryActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WeakReference<SportHistoryActivity> weakReference = this.e;
            if (weakReference != null && weakReference.get() != null) {
                this.e.get().b(i, obj);
            } else {
                ReleaseLogUtil.e("Track_TrackSportHistoryActivity", "mActivityReference == null ||  mActivityReference.get() == null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj) {
        if (i == 0 && njy.b(obj, Integer.class)) {
            this.k.clear();
            i();
            this.k.addAll((List) obj);
            CopyOnWriteArrayList<Integer> copyOnWriteArrayListA = vrg.a(this.k, this);
            this.k = copyOnWriteArrayListA;
            if (this.d != null) {
                int size = copyOnWriteArrayListA.size();
                ReleaseLogUtil.d("Track_TrackSportHistoryActivity", "mSportSortList.size()  ", Integer.valueOf(size), " mSportSortList == ", this.k.toString());
                this.d.sendMessage(this.d.obtainMessage(1));
                return;
            }
            return;
        }
        this.f28256c = true;
        this.d.removeMessages(3);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SportHistoryActivity> f28261c;

        c(SportHistoryActivity sportHistoryActivity) {
            this.f28261c = new WeakReference<>(sportHistoryActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WeakReference<SportHistoryActivity> weakReference = this.f28261c;
            if (weakReference == null || weakReference.get() == null) {
                ReleaseLogUtil.e("Track_TrackSportHistoryActivity", "mActivityReference == null ||  mActivityReference.get() == null");
                return;
            }
            final SportHistoryActivity sportHistoryActivity = this.f28261c.get();
            if (sportHistoryActivity == null || sportHistoryActivity.m == null || sportHistoryActivity.p == null || i != 0 || !njy.b(obj, Integer.class)) {
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList.size() > 0) {
                sportHistoryActivity.m.c(true);
                sportHistoryActivity.p.add(0);
                sportHistoryActivity.p.addAll(arrayList);
                if (SportHistoryActivity.this.d != null) {
                    SportHistoryActivity.this.d.sendMessage(SportHistoryActivity.this.d.obtainMessage(2));
                    return;
                }
                return;
            }
            HandlerExecutor.c(new Runnable() { // from class: vpl
                @Override // java.lang.Runnable
                public final void run() {
                    SportHistoryActivity.c.e(sportHistoryActivity);
                }
            });
        }

        public static /* synthetic */ void e(SportHistoryActivity sportHistoryActivity) {
            sportHistoryActivity.h(0);
            sportHistoryActivity.m.e(0);
            sportHistoryActivity.m.c(false);
        }
    }

    private ArrayAdapter<String> c(String[] strArr) {
        if (qrs.v()) {
            return new ArrayAdapter<>(this, R.layout.health_large_fonts_spinner_item_appbar, strArr);
        }
        return new SportArrayAdapter(this, R.layout.sport_spinner, strArr, this.k);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
