package com.huawei.ui.thirdpartservice.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.main.api.CloudAuthApi;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.health.main.model.AppLangItem;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.ThirdAuthTokenO;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.pluginachievement.AchieveDataApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.activity.alisport.AliSportActivity;
import com.huawei.ui.thirdpartservice.activity.base.CheckConnectCallback;
import com.huawei.ui.thirdpartservice.activity.googlefit.GoogleFitAuthActivity;
import com.huawei.ui.thirdpartservice.activity.healthconnect.HealthConnectActivity;
import com.huawei.ui.thirdpartservice.activity.healthkitthirdparty.ThirdPartAccountAppAdapter;
import com.huawei.ui.thirdpartservice.activity.healthkitthirdparty.ThirdPartAppAdapter;
import com.huawei.ui.thirdpartservice.activity.qqhealth.QqHealthActivity;
import com.huawei.ui.thirdpartservice.activity.qqhealth.QqHealthConnectActivity;
import com.huawei.ui.thirdpartservice.activity.wechatdevice.WeChatDeviceActivity;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.QqAuthorizeTokenResult;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.QqHealthInteractors;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.mgr.QqHealthDb;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.mgr.QqHealthTable;
import com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceCheckConnectCallback;
import com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig;
import defpackage.ljo;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.lua;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wxi;
import defpackage.wxs;
import defpackage.wyx;
import defpackage.wzp;
import defpackage.wzu;
import defpackage.wzz;
import defpackage.xbp;
import defpackage.xcj;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ThirdPartServiceActivity extends BaseActivity implements CheckConnectCallback.Interrupt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f29087a;
    private StravaConfig.StravaCountryCallback aa;
    private HealthRecycleView ab;
    private LinearLayout ac;
    private StravaConfig ad;
    private LinearLayout ae;
    private HealthTextView af;
    private HealthCardView ag;
    private HealthTextView ah;
    private ThirdPartAccountAppAdapter ai;
    private HealthCardView aj;
    private ThirdPartAppAdapter ak;
    private NestedScrollView al;
    private String am;
    private LinearLayout an;
    private HealthTextView ao;
    private LinearLayout ap;
    private LinearLayout aq;
    private HealthTextView ar;
    private WeChatApi as;
    private HealthTextView au;
    private ImageView aw;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f29088b;
    private HealthRecycleView d;
    private LinearLayout e;
    private HealthTextView g;
    private CloudAuthApi h;
    private Context i;
    private HealthCardView j;
    private LinearLayout l;
    private HealthSubHeader m;
    private LinearLayout n;
    private HealthTextView p;
    private LinearLayout q;
    private HealthSubHeader r;
    private HealthSubHeader s;
    private HealthTextView t;
    private HealthTextView u;
    private RelativeLayout v;
    private CommonDialog21 w;
    private HealthTextView x;
    private RelativeLayout y;
    private HealthTextView z;
    private List<HiAppInfo> f = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<AppLangItem> f29089c = new ArrayList(10);
    private e k = new e(this);
    private boolean o = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("ThirdPartServiceActivity", "enter onCreate():");
        super.onCreate(bundle);
        this.i = this;
        WeChatApi weChatApi = (WeChatApi) Services.b("Main", WeChatApi.class);
        this.as = weChatApi;
        weChatApi.setWeChatHandler(this.k);
        ThreadPoolManager.c().execute(new Runnable() { // from class: wwc
            @Override // java.lang.Runnable
            public final void run() {
                this.d.ab();
            }
        });
        s();
        a();
        if (n()) {
            ag();
        } else {
            aq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ab() {
        this.am = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        CloudAuthApi cloudAuthApi = (CloudAuthApi) Services.b("Main", CloudAuthApi.class);
        this.h = cloudAuthApi;
        cloudAuthApi.constructInstance(BaseApplication.getContext(), this.am);
        LogUtil.a("ThirdPartServiceActivity", "Get UserAt in ThirdPartServiceActivity: ", this.am);
        q();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("ThirdPartServiceActivity", "onActivityResult.");
        if (intent == null || !"auth".equals(intent.getStringExtra("activity"))) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: wvx
            @Override // java.lang.Runnable
            public final void run() {
                this.f52552a.ad();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ad() {
        LogUtil.a("ThirdPartServiceActivity", "onActivityResult: getThirdPartyAccountAppInfo()");
        q();
    }

    private void s() {
        HiHealthNativeApi.a(BaseApplication.getContext()).queryKitAppInfo(new c(this));
    }

    @Override // com.huawei.ui.thirdpartservice.activity.base.CheckConnectCallback.Interrupt
    public void onStatusGot() {
        r();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static class c implements HiDataOperateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ThirdPartServiceActivity> f29090c;

        c(ThirdPartServiceActivity thirdPartServiceActivity) {
            this.f29090c = new WeakReference<>(thirdPartServiceActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            LogUtil.a("ThirdPartServiceActivity", "onResult invoke");
            final ThirdPartServiceActivity thirdPartServiceActivity = this.f29090c.get();
            if (thirdPartServiceActivity == null) {
                LogUtil.j("ThirdPartServiceActivity", "onResult thirdPartServiceActivity is null");
                return;
            }
            if (!(obj instanceof List)) {
                LogUtil.j("ThirdPartServiceActivity", "getThirdPartyAppInfo onResult data not list");
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("ThirdPartServiceActivity", "getThirdPartyAppInfo onResult tempAppInfoList empty");
                return;
            }
            boolean zC = thirdPartServiceActivity.c(thirdPartServiceActivity, Constants.FAST_APP_PKG);
            for (Object obj2 : list) {
                if (obj2 instanceof HiAppInfo) {
                    HiAppInfo hiAppInfo = (HiAppInfo) obj2;
                    if (thirdPartServiceActivity.c(BaseApplication.getContext(), hiAppInfo.getPackageName()) && thirdPartServiceActivity.a(BaseApplication.getContext(), hiAppInfo)) {
                        thirdPartServiceActivity.f.add(hiAppInfo);
                    }
                    if (zC && hiAppInfo.getAppName() != null && hiAppInfo.getAppName().startsWith("QuickApp_")) {
                        thirdPartServiceActivity.f.add(hiAppInfo);
                    }
                }
            }
            if (njy.e(thirdPartServiceActivity.f)) {
                return;
            }
            LogUtil.a("ThirdPartServiceActivity", "getThirdPartyAppInfo onResult mAppInfoList size =", Integer.valueOf(thirdPartServiceActivity.f.size()));
            e eVar = thirdPartServiceActivity.k;
            Objects.requireNonNull(thirdPartServiceActivity);
            eVar.post(new Runnable() { // from class: wwu
                @Override // java.lang.Runnable
                public final void run() {
                    thirdPartServiceActivity.e();
                }
            });
        }
    }

    private void q() {
        String lang = this.h.getLang();
        LogUtil.a("ThirdPartServiceActivity", "getUsetId: ", LoginInit.getInstance(this.i).getAccountInfo(1011));
        String appLangItemUrl = this.h.getAppLangItemUrl(lang, "2");
        LogUtil.a("ThirdPartServiceActivity", "Get appLangItemUrl in ThirdPartServiceActivity: ", appLangItemUrl);
        this.f29089c = this.h.getAppLangItem(this.am, "GET", appLangItemUrl);
        List<AppLangItem> appLangItem = this.h.getAppLangItem(this.am, "GET", this.h.getAppLangItemUrl(lang, "3"));
        if (appLangItem != null) {
            LogUtil.a("ThirdPartServiceActivity", "mHealthAccountAppInfoList length: ", Integer.valueOf(appLangItem.size()));
            this.f29089c = e(this.f29089c, appLangItem);
        }
        List<AppLangItem> list = this.f29089c;
        if (list == null) {
            LogUtil.d("ThirdPartServiceActivity", "mAccountAppInfoList is null.");
            this.k.post(new Runnable() { // from class: wwn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52560a.aq();
                }
            });
            return;
        }
        LogUtil.a("ThirdPartServiceActivity", "mAccountAppInfoList length: ", Integer.valueOf(list.size()));
        if (this.f29089c.size() > 0) {
            LogUtil.a("ThirdPartServiceActivity", "getThirdPartyAccountAppInfo onResult mAppInfoList size =", Integer.valueOf(this.f29089c.size()));
            this.k.post(new Runnable() { // from class: wwo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52561b.c();
                }
            });
        } else {
            this.k.post(new Runnable() { // from class: wwn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52560a.aq();
                }
            });
        }
    }

    private List<AppLangItem> e(List<AppLangItem> list, List<AppLangItem> list2) {
        if (list == null) {
            return list2;
        }
        for (AppLangItem appLangItem : list2) {
            Iterator<AppLangItem> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    list.add(appLangItem);
                    break;
                }
            } while (!it.next().getAppId().equals(appLangItem.getAppId()));
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context, HiAppInfo hiAppInfo) {
        if (hiAppInfo == null) {
            LogUtil.j("ThirdPartServiceActivity", "checkApkValid() hiAppInfo is null");
            return false;
        }
        String packageName = hiAppInfo.getPackageName();
        String signature = hiAppInfo.getSignature();
        if (TextUtils.isEmpty(packageName) || TextUtils.isEmpty(signature)) {
            LogUtil.j("ThirdPartServiceActivity", "checkApkValid() packageName or signature is null");
            return false;
        }
        try {
            return HsfSignValidator.a(context, packageName).equals(ljo.c(signature)) && ljo.a(signature) == context.getPackageManager().getApplicationInfo(packageName, 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("ThirdPartServiceActivity", "checkApkValid() NameNotFoundException");
            return false;
        }
    }

    public void a() {
        setContentView(R.layout.activity_third_party_service);
        b();
        LogUtil.a("ThirdPartServiceActivity", "isMobileAppEngine", Boolean.valueOf(EnvironmentInfo.m()));
        if (EnvironmentInfo.m()) {
            qsp.a(this, R.id.third_party_service_subheader).setVisibility(8);
            qsp.a(this, R.id.third_party_service_cardview_layout).setVisibility(8);
        }
        ag();
        if (Utils.o()) {
            this.ac.setVisibility(8);
        }
        if (Utils.o()) {
            this.aq.setVisibility(8);
        }
        if (wyx.c().i()) {
            this.l.setVisibility(0);
        }
        this.ap.setVisibility(8);
        t();
        cancelAdaptRingRegion();
        if (Utils.o()) {
            this.ad = new StravaConfig();
            this.aa = new StravaConfig.StravaCountryCallback() { // from class: wvu
                @Override // com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig.StravaCountryCallback
                public final void onStravaCountryCallback(boolean z) {
                    this.f52550a.e(z);
                }
            };
            w();
        } else {
            setViewSafeRegion(false, this.ac, this.aq, this.ap, this.e);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: wwa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52554c.j(view);
                }
            });
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z) {
        LogUtil.a("ThirdPartServiceActivity", "mStravaConfig isSupport ", Boolean.valueOf(z));
        if (Utils.f() && z) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        af();
    }

    private void w() {
        this.e.setVisibility(8);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: wwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52562c.h(view);
            }
        });
        this.n.setVisibility(8);
        setViewSafeRegion(false, this.n);
        this.u.setText(getString(R.string.IDS_sync_fitness_data_item_sync_summary, new Object[]{getString(R.string.IDS_sync_fitness_data_komoot_name)}));
        setViewSafeRegion(true, this.q);
        this.af.setText(getString(R.string.IDS_sync_fitness_data_item_sync_summary, new Object[]{getString(R.string.IDS_sync_strava_data_name)}));
        setViewSafeRegion(true, this.ae);
        this.p.setText(R.string.IDS_health_connect_intro);
        setViewSafeRegion(true, this.l);
        if (!Utils.f()) {
            this.q.setVisibility(8);
            return;
        }
        if (String.valueOf(7).equals(LoginInit.getInstance(this).getAccountInfo(1009))) {
            this.q.setVisibility(0);
            xbp.b().refreshConnectStatus();
        }
        LogUtil.a("ThirdPartServiceActivity", "countryCode：", LoginInit.getInstance(this).getAccountInfo(1010));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        ah();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (y()) {
            this.s.setVisibility(8);
            this.j.setVisibility(8);
        }
        int childCount = this.an.getChildCount() - 1;
        for (int i = 0; i <= childCount; i++) {
            if (this.an.getChildAt(i).getVisibility() == 0) {
                childCount = i;
                break;
            }
        }
        LogUtil.a("ThirdPartServiceActivity", "hide divide line：", Integer.valueOf(childCount));
        switch (childCount) {
            case 0:
                this.aq.findViewById(R.id.divide_line_0).setVisibility(8);
                break;
            case 1:
                this.ap.findViewById(R.id.divide_line_1).setVisibility(8);
                break;
            case 2:
                this.ac.findViewById(R.id.divide_line_2).setVisibility(8);
                break;
            case 3:
                this.e.findViewById(R.id.divide_line_3).setVisibility(8);
                break;
            case 4:
                this.n.findViewById(R.id.divide_line_4).setVisibility(8);
                break;
            case 5:
                this.q.findViewById(R.id.divide_line_5).setVisibility(8);
                break;
            case 6:
                this.ae.findViewById(R.id.divide_line_6).setVisibility(8);
                break;
            case 8:
                this.l.findViewById(R.id.divide_line_8).setVisibility(8);
                break;
        }
    }

    private boolean y() {
        return this.aq.getVisibility() == 8 && this.ap.getVisibility() == 8 && this.ac.getVisibility() == 8 && this.e.getVisibility() == 8 && this.n.getVisibility() == 8 && this.q.getVisibility() == 8 && this.ae.getVisibility() == 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (njy.e(this.f)) {
            return;
        }
        this.r.setVisibility(0);
        this.ab.setVisibility(0);
        this.aj.setVisibility(0);
        this.y.setVisibility(8);
        this.ab.setLayoutManager(new LinearLayoutManager(this));
        this.ak = new ThirdPartAppAdapter(this.f);
        LogUtil.d("ThirdPartServiceActivity", "appinfo size = ", Integer.valueOf(this.f.size()));
        this.ak.e(new ThirdPartAppAdapter.ItemClickListener() { // from class: wwg
            @Override // com.huawei.ui.thirdpartservice.activity.healthkitthirdparty.ThirdPartAppAdapter.ItemClickListener
            public final void onItemClick(View view, int i) {
                this.f52556a.c(view, i);
            }
        });
        this.ab.setNestedScrollingEnabled(false);
        this.ab.setAdapter(this.ak);
        this.ak.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view, int i) {
        LogUtil.d("ThirdPartServiceActivity", "appinfo onItemClick position = ", Integer.valueOf(i));
        Intent intent = new Intent();
        intent.setClassName(this.i, "com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity");
        if (njy.c(this.f, i)) {
            HiAppInfo hiAppInfo = this.f.get(i);
            intent.putExtra("app_id", hiAppInfo.getAppId());
            intent.putExtra(MapKeyNames.APP_INFO, hiAppInfo);
        } else {
            LogUtil.j("ThirdPartServiceActivity", "addThirdPartyAppsInView onItemClick isInBounds is false");
        }
        this.i.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        p();
        this.al.setVisibility(0);
        if (!njy.e(this.f29089c)) {
            this.m.setVisibility(0);
            this.d.setVisibility(0);
            this.ag.setVisibility(0);
            this.d.setLayoutManager(new LinearLayoutManager(this));
            this.ai = new ThirdPartAccountAppAdapter(this.f29089c);
            LogUtil.d("ThirdPartServiceActivity", "account appinfo size = ", Integer.valueOf(this.f29089c.size()));
            this.ai.c(new ThirdPartAccountAppAdapter.ItemClickListener() { // from class: wwh
                @Override // com.huawei.ui.thirdpartservice.activity.healthkitthirdparty.ThirdPartAccountAppAdapter.ItemClickListener
                public final void onItemClick(View view, int i) {
                    this.d.d(view, i);
                }
            });
            this.d.setNestedScrollingEnabled(false);
            this.d.setAdapter(this.ai);
        }
        ai();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view, int i) {
        LogUtil.d("ThirdPartServiceActivity", "account appinfo onItemClick position = ", Integer.valueOf(i));
        if (n()) {
            Intent intent = new Intent();
            intent.setClassName(this.i, "com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAccountAuthActivity");
            if (njy.c(this.f29089c, i)) {
                AppLangItem appLangItem = this.f29089c.get(i);
                intent.putExtra("app_id", appLangItem.getAppId());
                intent.putExtra(MapKeyNames.APP_INFO, appLangItem);
                LogUtil.j("ThirdPartServiceActivity", "addThirdPartyAccountAppsInView putExtra app_info");
            } else {
                LogUtil.j("ThirdPartServiceActivity", "addThirdPartyAccountAppsInView onItemClick isInBounds is false");
            }
            startActivityForResult(intent, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        p();
        this.al.setVisibility(0);
        this.m.setVisibility(8);
        this.d.setVisibility(8);
        this.ag.setVisibility(8);
        ai();
    }

    private void b() {
        this.v = (RelativeLayout) qsp.a(this, R.id.third_party_list_load_progress);
        this.y = (RelativeLayout) qsp.a(this, R.id.third_party_no_data_list);
        this.al = (NestedScrollView) qsp.a(this, R.id.third_party_scroll_view);
        d();
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: wwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
        this.aq.setOnClickListener(new View.OnClickListener() { // from class: wwl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52559a.e(view);
            }
        });
        this.ap.setOnClickListener(new View.OnClickListener() { // from class: wvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.i(view);
            }
        });
        this.q.setOnClickListener(new View.OnClickListener() { // from class: wvr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52549a.b(view);
            }
        });
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: wvt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: wvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52551b.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        ak();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        if (qrs.r()) {
            return;
        }
        LogUtil.a("ThirdPartServiceActivity", "mWeChatConnect onClick");
        SharedPreferenceManager.e(this.i, Integer.toString(10000), "wechat_red_dot_show", "true", new StorageParams());
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("type", "0");
        lmf.d().c(this.i.getApplicationContext(), AnalyticsValue.HEALTH_MINE_SHARE_DATA_2040034.value(), map, 0);
        this.as.go2WeChatHandle(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        aj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        an();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        al();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        am();
    }

    private void d() {
        HealthSubHeader healthSubHeader = (HealthSubHeader) qsp.a(this, R.id.third_party_service_subheader);
        this.s = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(0);
        this.j = (HealthCardView) qsp.a(this, R.id.third_party_service_cardview_layout);
        this.an = (LinearLayout) qsp.a(this, R.id.third_party_service_layout);
        this.ac = (LinearLayout) qsp.a(this, R.id.layout_qq_health);
        this.z = (HealthTextView) qsp.a(this, R.id.textView_data_share_qq_status);
        this.aq = (LinearLayout) qsp.a(this, R.id.layout_wechat);
        this.au = (HealthTextView) qsp.a(this, R.id.tv_data_share_wechat_tips);
        this.ar = (HealthTextView) qsp.a(this, R.id.tv_data_share_wechat_status);
        this.aw = (ImageView) qsp.a(this, R.id.iv_wechat_connect_dot);
        this.ap = (LinearLayout) qsp.a(this, R.id.layout_wechat_devices);
        this.ao = (HealthTextView) qsp.a(this, R.id.tv_data_share_wechat_devices_status);
        this.e = (LinearLayout) qsp.a(this, R.id.layout_alisport);
        this.f29087a = (HealthTextView) qsp.a(this, R.id.tv_ali_subtitle);
        this.f29088b = (HealthTextView) qsp.a(this, R.id.textView_data_share_alisport_status);
        this.n = (LinearLayout) qsp.a(this, R.id.layout_google_fit);
        this.g = (HealthTextView) qsp.a(this, R.id.textView_data_share_google_fit_status);
        this.q = (LinearLayout) qsp.a(this, R.id.layout_komoot);
        this.x = (HealthTextView) qsp.a(this, R.id.textView_data_share_komoot_status);
        this.u = (HealthTextView) qsp.a(this, R.id.textView_komoot_summary);
        this.ae = (LinearLayout) qsp.a(this, R.id.layout_strava);
        this.l = (LinearLayout) qsp.a(this, R.id.layout_health_connect);
        this.ah = (HealthTextView) qsp.a(this, R.id.textView_data_share_strava_status);
        this.t = (HealthTextView) qsp.a(this, R.id.textView_data_share_health_connect_status);
        this.af = (HealthTextView) qsp.a(this, R.id.textView_strava_summary);
        this.p = (HealthTextView) qsp.a(this, R.id.textView_health_connect_summary);
        HealthSubHeader healthSubHeader2 = (HealthSubHeader) qsp.a(this, R.id.third_party_activity_subheader);
        this.r = healthSubHeader2;
        healthSubHeader2.setSubHeaderBackgroundColor(0);
        this.ab = (HealthRecycleView) qsp.a(this, R.id.rv_third_part_app);
        this.aj = (HealthCardView) qsp.a(this, R.id.third_party_activity_cardview);
        HealthSubHeader healthSubHeader3 = (HealthSubHeader) qsp.a(this, R.id.third_party_account_activity_subheader);
        this.m = healthSubHeader3;
        healthSubHeader3.setSubHeaderBackgroundColor(0);
        this.d = (HealthRecycleView) qsp.a(this, R.id.rv_third_part_account_app);
        this.ag = (HealthCardView) qsp.a(this, R.id.third_party_account_activity_cardview);
    }

    private void ak() {
        LogUtil.a("ThirdPartServiceActivity", "startQqHealthActivity()");
        b(AnalyticsValue.HEALTH_MINE_SHARE_DATA_2040034.value(), "1");
        if (qrs.r() || !n()) {
            return;
        }
        d(R.string.IDS_sns_waiting);
        QqHealthInteractors.getInstance().getAuthorizeToken(new ICloudOperationResult() { // from class: wwe
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.e.d((QqAuthorizeTokenResult) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(QqAuthorizeTokenResult qqAuthorizeTokenResult, String str, boolean z) {
        boolean zA;
        boolean zL;
        QqAuthorizeTokenResult.ThirdUserToken thirdUserToken;
        long j;
        r();
        if (!z || qqAuthorizeTokenResult == null || (thirdUserToken = qqAuthorizeTokenResult.getThirdUserToken()) == null || !thirdUserToken.isValid()) {
            zA = false;
            zL = false;
        } else {
            String lastModifyTime = thirdUserToken.getLastModifyTime();
            if (lastModifyTime != null) {
                try {
                    j = Long.parseLong(lastModifyTime);
                } catch (NumberFormatException unused) {
                    LogUtil.a("ThirdPartServiceActivity", "getAuthorizeToken() NumberFormatException");
                    j = 0;
                }
            } else {
                j = 0;
            }
            zA = a(System.currentTimeMillis(), j, thirdUserToken.getExpireTime());
            zL = l();
        }
        LogUtil.a("ThirdPartServiceActivity", "getAuthorizeToken() isSuccess=", Boolean.valueOf(z), " isQqTokenValid=", Boolean.valueOf(zA));
        b(zA, zL);
    }

    private void b(boolean z, boolean z2) {
        if (z && z2) {
            startActivityForResult(new Intent(this.i, (Class<?>) QqHealthActivity.class), 4);
            return;
        }
        Intent intent = new Intent(this.i, (Class<?>) QqHealthConnectActivity.class);
        intent.putExtra("isQqTokenValid", z);
        startActivityForResult(intent, 4);
    }

    private boolean a(long j, long j2, int i) {
        long j3 = (j - j2) / 1000;
        if (j3 > i) {
            return false;
        }
        LogUtil.a("ThirdPartServiceActivity", "getAuthorizeToken() usedTime=", Long.valueOf(j3), ", expireTime=", Integer.valueOf(i));
        return true;
    }

    private boolean l() {
        QqHealthTable qqHealthTable = new QqHealthDb().get();
        return (qqHealthTable == null || TextUtils.isEmpty(qqHealthTable.getNickName())) ? false : true;
    }

    private void aj() {
        if (qrs.r() || !n()) {
            return;
        }
        startActivity(new Intent(this.i, (Class<?>) WeChatDeviceActivity.class));
    }

    private void an() {
        if (qrs.r() || !n()) {
            return;
        }
        d(R.string.IDS_sns_waiting);
        xbp.b().checkConnectStatus(new wxi(this));
    }

    private void al() {
        if (qrs.r() || !n()) {
            return;
        }
        d(R.string.IDS_sns_waiting);
        xcj.c().b(false, this.ad, new wxs(this));
    }

    private void am() {
        if (qrs.r()) {
            return;
        }
        startActivity(new Intent(this.i, (Class<?>) HealthConnectActivity.class));
    }

    private void af() {
        LogUtil.a("ThirdPartServiceActivity", "startAliSportActivity");
        b(AnalyticsValue.HEALTH_MINE_SHARE_DATA_2040034.value(), "5");
        if (qrs.r() || !n()) {
            return;
        }
        d(R.string.IDS_sns_waiting);
        new wzp(ThirdAuthTokenO.class, "/dataOpen/third/getThirdAuthorization").getAuthorizeToken(new ICloudOperationResult() { // from class: wwi
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f52557b.c((ThirdAuthTokenO) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ThirdAuthTokenO thirdAuthTokenO, String str, boolean z) {
        LogUtil.a("ThirdPartServiceActivity", "startAliSportActivity getThirdAuthorization isSuccess = ", Boolean.valueOf(z));
        r();
        if (z) {
            Intent intent = new Intent(this.i, (Class<?>) AliSportActivity.class);
            intent.putExtra("AUTH_STATUS", false);
            List<ThirdAuthTokenO.ThirdAuthToken> thirdAuthTokenList = thirdAuthTokenO.getThirdAuthTokenList();
            if (thirdAuthTokenList != null) {
                Iterator<ThirdAuthTokenO.ThirdAuthToken> it = thirdAuthTokenList.iterator();
                while (it.hasNext()) {
                    if (it.next().getThirdAccountType() == 24) {
                        intent.putExtra("AUTH_STATUS", true);
                    }
                }
            }
            HashMap map = new HashMap(2);
            map.put("click", "1");
            map.put("click_ali_entrance", "1");
            String strValue = AnalyticsValue.HEALTH_MINE_SHARE_DATA_ALI_ENTRANCE_2140012.value();
            lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
            LogUtil.a("ThirdPartServiceActivity", "BI save notification click event finish, value = ", strValue);
            startActivity(intent);
            return;
        }
        this.k.post(new Runnable() { // from class: wwb
            @Override // java.lang.Runnable
            public final void run() {
                this.e.aa();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aa() {
        qpx.e(this, R.string.IDS_update_server_bussy);
    }

    private void ah() {
        LogUtil.a("ThirdPartServiceActivity", "startGoogleFitActivity");
        if (qrs.r() || !n()) {
            return;
        }
        startActivity(new Intent(this.i, (Class<?>) GoogleFitAuthActivity.class));
    }

    private boolean n() {
        if (CommonUtil.ab(this.i.getApplicationContext())) {
            return true;
        }
        this.k.post(new Runnable() { // from class: wwf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.z();
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        qpx.e(this, R.string.IDS_connect_network);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("ThirdPartServiceActivity", "enter onDestroy():");
        super.onDestroy();
        r();
        StravaConfig stravaConfig = this.ad;
        if (stravaConfig != null) {
            stravaConfig.b();
        }
        e eVar = this.k;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("ThirdPartServiceActivity", "enter onResume():");
        lsy.a(new Runnable() { // from class: wvm
            @Override // java.lang.Runnable
            public final void run() {
                this.f52546a.ac();
            }
        });
        if (Utils.o()) {
            as();
        } else {
            i();
            m();
            o();
        }
        if (this.o) {
            this.o = false;
        }
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ac() {
        if (Utils.o()) {
            return;
        }
        String strIsUserBinded = this.as.isUserBinded(BaseApplication.getContext());
        Message messageObtainMessage = this.k.obtainMessage(500);
        messageObtainMessage.obj = strIsUserBinded;
        this.k.sendMessage(messageObtainMessage);
        if ("true".equals(strIsUserBinded)) {
            LogUtil.a("ThirdPartServiceActivity", "judgeWechatIsBind done");
            ((AchieveDataApi) Services.b("PluginAchievement", AchieveDataApi.class)).dealWeChatTask();
        }
    }

    private void as() {
        g();
        if (wyx.c().i()) {
            f();
        }
        if (Utils.f()) {
            if (String.valueOf(7).equals(LoginInit.getInstance(this).getAccountInfo(1009))) {
                j();
            }
            this.ad.b(this.k, LoginInit.getInstance(this).getAccountInfo(1010), this.aa);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        qrs.e();
    }

    private void d(int i) {
        if (this.w == null) {
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.i);
            this.w = commonDialog21B;
            commonDialog21B.b(this.i.getString(i));
            this.w.setCancelable(false);
            this.w.c();
        }
        if (isFinishing()) {
            return;
        }
        this.w.show();
        LogUtil.a("ThirdPartServiceActivity", "mLoadingDialog.show()");
    }

    private void r() {
        CommonDialog21 commonDialog21;
        if (isFinishing() || (commonDialog21 = this.w) == null) {
            return;
        }
        commonDialog21.cancel();
        LogUtil.a("ThirdPartServiceActivity", "destroy mLoadingDialog");
    }

    private void b(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (!TextUtils.isEmpty(str2)) {
            map.put("type", str2);
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        if ("true".equals(SharedPreferenceManager.e(this.i, Integer.toString(10000), "wechat_red_dot_show"))) {
            this.aw.setVisibility(8);
        } else {
            this.aw.setVisibility(0);
        }
    }

    private void i() {
        LogUtil.a("ThirdPartServiceActivity", "checkAliAuth");
        if (CommonUtil.ab(this.i.getApplicationContext())) {
            new wzp(ThirdAuthTokenO.class, "/dataOpen/third/getThirdAuthorization").getAuthorizeToken(new ICloudOperationResult() { // from class: wwk
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.d.a((ThirdAuthTokenO) obj, str, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ThirdAuthTokenO thirdAuthTokenO, String str, boolean z) {
        List<ThirdAuthTokenO.ThirdAuthToken> thirdAuthTokenList;
        LogUtil.a("ThirdPartServiceActivity", "checkAliAuth getThirdAuthorization isSuccess = ", Boolean.valueOf(z));
        if (!z || TextUtils.isEmpty(str) || (thirdAuthTokenList = thirdAuthTokenO.getThirdAuthTokenList()) == null) {
            return;
        }
        Iterator<ThirdAuthTokenO.ThirdAuthToken> it = thirdAuthTokenList.iterator();
        while (it.hasNext()) {
            if (it.next().getThirdAccountType() == 24) {
                LogUtil.a("ThirdPartServiceActivity", "checkAliAuth bound");
                this.k.post(new Runnable() { // from class: wwj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52558a.x();
                    }
                });
                return;
            }
        }
        LogUtil.a("ThirdPartServiceActivity", "checkAliAuth unbound");
        this.k.post(new Runnable() { // from class: wvs
            @Override // java.lang.Runnable
            public final void run() {
                this.e.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f29087a.setText(R.string.IDS_ali_subtitle_bind);
        this.f29088b.setText(R.string.IDS_hw_healt_data_share_wechat_status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f29087a.setText(R.string.IDS_ali_subtitle);
        this.f29088b.setText(R.string.IDS_hw_healt_wechat_dialog_button_content);
    }

    private void m() {
        LogUtil.a("ThirdPartServiceActivity", "checkQqStatus()");
        if (CommonUtil.ab(this.i.getApplicationContext())) {
            QqHealthInteractors.getInstance().getAuthorizeToken(new ICloudOperationResult() { // from class: wvz
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.e.c((QqAuthorizeTokenResult) obj, str, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(QqAuthorizeTokenResult qqAuthorizeTokenResult, String str, boolean z) {
        boolean zA;
        QqAuthorizeTokenResult.ThirdUserToken thirdUserToken;
        long j;
        LogUtil.a("ThirdPartServiceActivity", "checkQqStatus getAuthorizeToken() isSuccess=", Boolean.valueOf(z));
        r();
        if (!z || qqAuthorizeTokenResult == null || (thirdUserToken = qqAuthorizeTokenResult.getThirdUserToken()) == null || !thirdUserToken.isValid()) {
            zA = false;
        } else {
            String lastModifyTime = thirdUserToken.getLastModifyTime();
            if (lastModifyTime != null) {
                try {
                    j = Long.parseLong(lastModifyTime);
                } catch (NumberFormatException unused) {
                    LogUtil.a("ThirdPartServiceActivity", "getAuthorizeToken() NumberFormatException");
                    j = 0;
                }
            } else {
                j = 0;
            }
            zA = a(System.currentTimeMillis(), j, thirdUserToken.getExpireTime());
        }
        b(zA);
    }

    private void t() {
        if (Utils.o()) {
            this.ap.setVisibility(8);
        } else {
            if (u()) {
                this.ap.setVisibility(0);
                o();
                LogUtil.a("ThirdPartServiceActivity", "checkWechatDeviceIsSupported true and is not expired.");
                return;
            }
            wzz.b((ICloudOperationResult<List<String>>) new ICloudOperationResult() { // from class: wwd
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.f52555c.b((List) obj, str, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list, String str, boolean z) {
        LogUtil.a("ThirdPartServiceActivity", "getSupportedProductIdsAsync ids = ", list);
        if (!z || njy.e(list)) {
            return;
        }
        this.k.sendMessage(this.k.obtainMessage(TypedValues.PositionType.TYPE_DRAWPATH));
    }

    private boolean u() {
        String strE = SharedPreferenceManager.e(this.i, Integer.toString(10000), "wx_device_entrance_supported");
        String strE2 = SharedPreferenceManager.e(this.i, Integer.toString(10000), "wx_device_entrance_supported_ts");
        return "true".equalsIgnoreCase(strE) && !(TextUtils.isEmpty(strE2) || ((System.currentTimeMillis() - Long.parseLong(strE2)) > 43200000L ? 1 : ((System.currentTimeMillis() - Long.parseLong(strE2)) == 43200000L ? 0 : -1)) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        wzz.e((ICloudOperationResult<Boolean>) new ICloudOperationResult() { // from class: wvy
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.d.a((Boolean) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool, String str, boolean z) {
        Message messageObtainMessage = this.k.obtainMessage(501);
        messageObtainMessage.obj = Boolean.valueOf(z && bool.booleanValue());
        this.k.sendMessage(messageObtainMessage);
    }

    private void b(boolean z) {
        Message messageObtainMessage = this.k.obtainMessage(503);
        if (z) {
            messageObtainMessage.obj = "true";
            this.k.sendMessage(messageObtainMessage);
        } else {
            messageObtainMessage.obj = "false";
            this.k.sendMessage(messageObtainMessage);
        }
    }

    private void g() {
        LogUtil.a("ThirdPartServiceActivity", "checkGoogleFitStatus()");
        if (CommonUtil.ab(this.i.getApplicationContext())) {
            boolean zE = wzu.a().e();
            Message messageObtainMessage = this.k.obtainMessage(504);
            if (zE) {
                messageObtainMessage.obj = "true";
            } else {
                messageObtainMessage.obj = "false";
            }
            this.k.sendMessage(messageObtainMessage);
        }
    }

    private void f() {
        LogUtil.a("ThirdPartServiceActivity", "checkHealthConnectStatus()");
        Message messageObtainMessage = this.k.obtainMessage(509);
        messageObtainMessage.obj = Boolean.valueOf(lua.e("THIRD_PARTY_SERVICE", "HEALTH_CONNECT_AGREEMENT_STATUS", false));
        this.k.sendMessage(messageObtainMessage);
    }

    private void j() {
        if (this.q.getVisibility() == 8 || !CommonUtil.ab(this.i.getApplicationContext())) {
            return;
        }
        xbp.b().checkConnectStatus(true, new a(this.k));
    }

    private void k() {
        if (CommonUtil.ab(this.i.getApplicationContext())) {
            xcj.c().b(true, this.ad, new d(this.k));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.a("ThirdPartServiceActivity", "checkApkExist NameNotFoundException");
            return false;
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class d extends ReferenceCheckConnectCallback<e> {
        d(e eVar) {
            super(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceCheckConnectCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void connectResultWhenReferenceNotNull(e eVar, boolean z, boolean z2) {
            Message messageObtainMessage = eVar.obtainMessage(TypedValues.PositionType.TYPE_CURVE_FIT);
            messageObtainMessage.obj = Boolean.valueOf(z2);
            eVar.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class a extends ReferenceCheckConnectCallback<e> {
        a(e eVar) {
            super(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceCheckConnectCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void connectResultWhenReferenceNotNull(e eVar, boolean z, boolean z2) {
            Message messageObtainMessage = eVar.obtainMessage(TypedValues.PositionType.TYPE_PERCENT_Y);
            messageObtainMessage.obj = Boolean.valueOf(z2);
            eVar.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class e extends BaseHandler<ThirdPartServiceActivity> {
        e(ThirdPartServiceActivity thirdPartServiceActivity) {
            super(thirdPartServiceActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ThirdPartServiceActivity thirdPartServiceActivity, Message message) {
            switch (message.what) {
                case 500:
                    c(message, thirdPartServiceActivity);
                    break;
                case 501:
                    e(message, thirdPartServiceActivity);
                    break;
                case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                    c(thirdPartServiceActivity);
                    break;
                case 503:
                    a(message, thirdPartServiceActivity);
                    break;
                case 504:
                    b(message, thirdPartServiceActivity);
                    break;
                case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
                case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                default:
                    a(thirdPartServiceActivity, message.what);
                    break;
                case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                    a(thirdPartServiceActivity, message);
                    break;
                case TypedValues.PositionType.TYPE_CURVE_FIT /* 508 */:
                    c(thirdPartServiceActivity, message);
                    break;
                case 509:
                    e(thirdPartServiceActivity, message);
                    break;
            }
        }

        private void a(ThirdPartServiceActivity thirdPartServiceActivity, int i) {
            if (i == 202) {
                thirdPartServiceActivity.as.dismissJumpToHwPublicDialog();
                qpx.e(thirdPartServiceActivity, R.string.IDS_confirm_network_whether_connected);
            } else {
                if (i != 203) {
                    return;
                }
                thirdPartServiceActivity.as.dismissJumpToHwPublicDialog();
                qpx.e(thirdPartServiceActivity, R.string.IDS_update_server_bussy);
            }
        }

        private void c(Message message, ThirdPartServiceActivity thirdPartServiceActivity) {
            String str;
            if (!(message.obj instanceof String)) {
                str = "";
            } else {
                str = (String) message.obj;
            }
            if (!"false".equals(str)) {
                if (!"true".equals(str)) {
                    LogUtil.a("ThirdPartServiceActivity", "updateWeChatBindStatus isBound = ", str);
                } else {
                    thirdPartServiceActivity.au.setText(R.string.IDS_hw_healt_data_share_wechat_tips_bind);
                    thirdPartServiceActivity.ar.setText(R.string.IDS_hw_healt_data_share_wechat_status);
                    KeyValDbManager.d(BaseApplication.getContext()).c("third_part_service_we_chat_status", "true", null);
                    SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "wechat_red_dot_show", "true", new StorageParams());
                }
            } else {
                thirdPartServiceActivity.au.setText(R.string.IDS_hw_healt_data_share_wechat_tips);
                thirdPartServiceActivity.ar.setText(R.string.IDS_hw_healt_wechat_dialog_button_content);
                KeyValDbManager.d(BaseApplication.getContext()).c("third_part_service_we_chat_status", "false", null);
            }
            thirdPartServiceActivity.ae();
        }

        private void c(ThirdPartServiceActivity thirdPartServiceActivity) {
            thirdPartServiceActivity.ap.setVisibility(0);
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "wx_device_entrance_supported", "true", new StorageParams());
            Context context = BaseApplication.getContext();
            String string = Integer.toString(10000);
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferenceManager.e(context, string, "wx_device_entrance_supported_ts", String.valueOf(jCurrentTimeMillis), new StorageParams());
            LogUtil.a("ThirdPartServiceActivity", "updateWeChatDeviceSupportedStatus update status and timestamp ");
            thirdPartServiceActivity.o();
        }

        private void e(Message message, ThirdPartServiceActivity thirdPartServiceActivity) {
            boolean zBooleanValue = message.obj instanceof Boolean ? ((Boolean) message.obj).booleanValue() : false;
            LogUtil.a("ThirdPartServiceActivity", "updateWeChatDeviceBindStatus hasBound = " + zBooleanValue);
            thirdPartServiceActivity.ao.setText(zBooleanValue ? R.string.IDS_hw_healt_data_share_wechat_status : R.string.IDS_hw_healt_wechat_dialog_button_content);
        }

        private void a(Message message, ThirdPartServiceActivity thirdPartServiceActivity) {
            String str;
            if (!(message.obj instanceof String)) {
                str = "";
            } else {
                str = (String) message.obj;
            }
            if (!"false".equals(str)) {
                if (!"true".equals(str)) {
                    LogUtil.a("ThirdPartServiceActivity", "updateQqBindStatus isBound = ", str);
                    return;
                } else {
                    thirdPartServiceActivity.z.setText(R.string.IDS_hw_healt_data_share_wechat_status);
                    return;
                }
            }
            thirdPartServiceActivity.z.setText(R.string.IDS_hw_healt_wechat_dialog_button_content);
        }

        private void b(Message message, ThirdPartServiceActivity thirdPartServiceActivity) {
            String str;
            if (!(message.obj instanceof String)) {
                str = "";
            } else {
                str = (String) message.obj;
            }
            if (!"false".equals(str)) {
                if (!"true".equals(str)) {
                    LogUtil.a("ThirdPartServiceActivity", "updateGoogleFitBindStatus isBound = ", str);
                    return;
                } else {
                    thirdPartServiceActivity.g.setText(R.string.IDS_hw_healt_data_share_wechat_status);
                    return;
                }
            }
            thirdPartServiceActivity.g.setText(R.string.IDS_hw_healt_wechat_dialog_button_content);
        }

        private void a(ThirdPartServiceActivity thirdPartServiceActivity, Message message) {
            if (message.obj instanceof Boolean) {
                if (((Boolean) message.obj).booleanValue()) {
                    thirdPartServiceActivity.x.setText(R.string.IDS_hw_healt_data_share_wechat_status);
                } else {
                    thirdPartServiceActivity.x.setText(R.string.IDS_hw_healt_wechat_dialog_button_content);
                }
            }
        }

        private void c(ThirdPartServiceActivity thirdPartServiceActivity, Message message) {
            LogUtil.a("ThirdPartServiceActivity", "strava updateStravaBindStatus ");
            thirdPartServiceActivity.s.setVisibility(0);
            thirdPartServiceActivity.j.setVisibility(0);
            thirdPartServiceActivity.ae.setVisibility(0);
            thirdPartServiceActivity.h();
            thirdPartServiceActivity.ai();
            if (message.obj instanceof Boolean) {
                if (((Boolean) message.obj).booleanValue()) {
                    thirdPartServiceActivity.ah.setText(R.string.IDS_hw_healt_data_share_wechat_status);
                } else {
                    thirdPartServiceActivity.ah.setText(R.string.IDS_hw_healt_wechat_dialog_button_content);
                }
            }
        }

        private void e(ThirdPartServiceActivity thirdPartServiceActivity, Message message) {
            LogUtil.a("ThirdPartServiceActivity", "updateHealthConnectBindStatus ");
            thirdPartServiceActivity.s.setVisibility(0);
            thirdPartServiceActivity.j.setVisibility(0);
            thirdPartServiceActivity.l.setVisibility(0);
            thirdPartServiceActivity.h();
            thirdPartServiceActivity.ai();
            if (message.obj instanceof Boolean) {
                if (((Boolean) message.obj).booleanValue()) {
                    thirdPartServiceActivity.t.setText(R.string.IDS_hw_device_wifi_authorized_status_authorized);
                } else {
                    thirdPartServiceActivity.t.setText(R.string.IDS_health_connect_unauthorized);
                }
            }
        }
    }

    private void ag() {
        RelativeLayout relativeLayout;
        if (isFinishing() || (relativeLayout = this.v) == null) {
            return;
        }
        relativeLayout.setVisibility(0);
        LogUtil.a("ThirdPartServiceActivity", "mLoadingDialog.show()");
    }

    private void p() {
        RelativeLayout relativeLayout = this.v;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            LogUtil.a("ThirdPartServiceActivity", "destroy mLoadingDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        if (this.ab.getVisibility() == 8 && this.d.getVisibility() == 8 && this.aq.getVisibility() == 8 && this.ap.getVisibility() == 8 && this.ac.getVisibility() == 8 && this.e.getVisibility() == 8 && this.n.getVisibility() == 8 && this.q.getVisibility() == 8 && this.ae.getVisibility() == 8) {
            this.y.setVisibility(0);
        } else {
            this.y.setVisibility(8);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
