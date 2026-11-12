package com.huawei.ui.device.activity.adddevice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.callback.VersionNoSupportCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.adapter.LeftKindAdapter;
import com.huawei.ui.device.adapter.RightListAdapter;
import com.huawei.ui.device.utlis.SearchDeviceThreadManager;
import defpackage.coq;
import defpackage.dzu;
import defpackage.eek;
import defpackage.elh;
import defpackage.eqr;
import defpackage.est;
import defpackage.esw;
import defpackage.etn;
import defpackage.hcd;
import defpackage.lrd;
import defpackage.lvi;
import defpackage.mfs;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qtx;
import defpackage.raz;
import defpackage.rba;
import defpackage.rcv;
import defpackage.rdp;
import defpackage.rej;
import defpackage.reo;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AllDeviceListActivity extends BaseActivity implements SearchDeviceThreadManager.SearchCallback, DownloadResultCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24107a;
    private HealthRecycleView aa;
    private HealthTextView ac;
    private RightListAdapter ad;
    private List<rba> ae;
    private SearchDeviceThreadManager af;
    private String ag;
    private LinearLayout ah;
    private LinearLayout ai;
    private SystemLocaleChangeReceiver aj;
    private LinearLayout ak;
    private HealthSearchView al;
    private HealthRecycleView am;
    private int an;
    private qtx ar;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f24109c;
    private LinearLayout d;
    private CustomTitleBar f;
    private String g;
    private HealthProgressBar h;
    private RelativeLayout i;
    private rcv j;
    private esw k;
    private BroadcastReceiver l;
    private String m;
    private c o;
    private HealthRecycleView p;
    private LeftKindAdapter q;
    private LinearLayout s;
    private RightListAdapter u;
    private int v;
    private HealthTextView w;
    private LinearLayout x;
    private ImageView z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24108b = false;
    private Map<Integer, Integer> n = new HashMap(16);
    private List<raz> r = new ArrayList(16);
    private List<rba> ab = new ArrayList(16);
    private rba e = null;
    private BroadcastReceiver t = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.d("AllDeviceListActivity", "NetBroadcastReceiver intent is null");
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (CommonUtil.ab(BaseApplication.getContext())) {
                    AllDeviceListActivity.this.a();
                    AllDeviceListActivity.this.ab();
                } else {
                    LogUtil.d("AllDeviceListActivity", "net work is error");
                }
            }
        }
    };
    private BroadcastReceiver y = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.15
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.d("AllDeviceListActivity", "mPairBroadcastReceiver intent is null");
            } else if ("com.huawei.health.action.PAIR_DEVICE_SUCCESS".equals(intent.getAction())) {
                LogUtil.a("AllDeviceListActivity", "pair device success");
                if (AllDeviceListActivity.this.isFinishing()) {
                    return;
                }
                AllDeviceListActivity.this.finish();
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
    }

    /* JADX INFO: loaded from: classes16.dex */
    public class SystemLocaleChangeReceiver extends BroadcastReceiver {
        public SystemLocaleChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.c("AllDeviceListActivity", "SystemLocaleChangeReceiver intent is null");
                return;
            }
            LogUtil.a("AllDeviceListActivity", "mReceiver  onReceive  intent.getAction(): ", intent.getAction());
            if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                LogUtil.a("AllDeviceListActivity", "SystemLocaleChangeReceiver language change");
                lvi.l();
                AllDeviceListActivity.this.j();
                AllDeviceListActivity.this.m();
            }
        }
    }

    private void o() {
        if (this.aj == null) {
            LogUtil.c("AllDeviceListActivity", "Enter registerSystemLanguageChange()");
            this.aj = new SystemLocaleChangeReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
            registerReceiver(this.aj, intentFilter);
        }
    }

    private void ae() {
        if (this.aj != null) {
            LogUtil.a("AllDeviceListActivity", "Enter unregisterSystemLanguageChange()");
            try {
                unregisterReceiver(this.aj);
            } catch (IllegalArgumentException unused) {
                LogUtil.c("AllDeviceListActivity", "unregisterSystemLanguageChange，IllegalArgumentException");
            }
            this.aj = null;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    protected static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<AllDeviceListActivity> f24130a;

        c(AllDeviceListActivity allDeviceListActivity) {
            this.f24130a = new WeakReference<>(allDeviceListActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AllDeviceListActivity allDeviceListActivity = this.f24130a.get();
            if (allDeviceListActivity == null || message == null) {
                LogUtil.c("AllDeviceListActivity", "handleMessage mActivity is null");
                return;
            }
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case 100:
                        allDeviceListActivity.w();
                        break;
                    case 101:
                        allDeviceListActivity.a(message);
                        break;
                    case 102:
                        if (message.obj instanceof Integer) {
                            allDeviceListActivity.b(((Integer) message.obj).intValue());
                        }
                        break;
                    case 103:
                        allDeviceListActivity.v();
                        break;
                    default:
                        LogUtil.d("AllDeviceListActivity", "other message");
                        break;
                }
                return;
            }
            if (message.obj instanceof List) {
                allDeviceListActivity.a((List<rba>) message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.h.setVisibility(8);
        this.x.setVisibility(8);
        this.s.setVisibility(8);
        j();
        p();
        HashMap map = new HashMap(16);
        map.put("download_status", 1);
        this.ar.e(AnalyticsValue.ALL_DEVICE_LIST_RESOURCE_DOWNLOAD_RESULT.value(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        this.h.setVisibility(8);
        if (b()) {
            this.x.setVisibility(0);
            this.s.setVisibility(8);
            this.i.setVisibility(4);
            this.al.setVisibility(4);
            if (message.obj instanceof Integer) {
                if (((Integer) message.obj).intValue() == -3) {
                    this.w.setText(R.string.IDS_download_error_storage);
                } else {
                    this.w.setText(R.string.IDS_no_device_res);
                }
            }
            this.x.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.20
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AllDeviceListActivity.this.a();
                }
            });
            if (this.ar != null) {
                HashMap map = new HashMap(16);
                map.put("download_status", 2);
                this.ar.e(AnalyticsValue.ALL_DEVICE_LIST_RESOURCE_DOWNLOAD_RESULT.value(), map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.h.setVisibility(8);
        if (b()) {
            b(this.t);
            this.s.setVisibility(0);
            this.x.setVisibility(8);
            this.i.setVisibility(4);
            this.al.setVisibility(4);
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.18
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AllDeviceListActivity.this.ar.a(AllDeviceListActivity.this);
                }
            });
            if (this.ar != null) {
                HashMap map = new HashMap(16);
                map.put("download_status", 3);
                this.ar.e(AnalyticsValue.ALL_DEVICE_LIST_RESOURCE_DOWNLOAD_RESULT.value(), map);
            }
        }
    }

    private void b(BroadcastReceiver broadcastReceiver) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            BroadcastManagerUtil.a(this, broadcastReceiver, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.c("AllDeviceListActivity", "handleDownloadNetError register receiver is error");
        }
    }

    private boolean b() {
        return coq.d(this.ab) || coq.d(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.h.setVisibility(0);
        this.s.setVisibility(8);
        this.x.setVisibility(8);
        if (i > 0) {
            this.h.setProgress(i);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("AllDeviceListActivity", "onCreate");
        this.f24109c = this;
        this.o = new c(this);
        setContentView(R.layout.activity_all_device_list);
        lvi.l();
        this.ar = new qtx();
        this.af = SearchDeviceThreadManager.b();
        o();
        j();
        m();
        c();
        r();
    }

    private void r() {
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.17
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    CustomTitleBar customTitleBar = AllDeviceListActivity.this.f;
                    HealthSearchView healthSearchView = AllDeviceListActivity.this.al;
                    RelativeLayout relativeLayout = AllDeviceListActivity.this.i;
                    if (customTitleBar == null || healthSearchView == null || relativeLayout == null) {
                        return;
                    }
                    customTitleBar.setImportantForAccessibility(1);
                    healthSearchView.setImportantForAccessibility(1);
                    relativeLayout.setImportantForAccessibility(1);
                    accessibilityNodeInfo.removeChild(customTitleBar);
                    accessibilityNodeInfo.removeChild(relativeLayout);
                    accessibilityNodeInfo.removeChild(healthSearchView);
                    accessibilityNodeInfo.addChild(customTitleBar);
                    accessibilityNodeInfo.addChild(healthSearchView);
                    accessibilityNodeInfo.addChild(relativeLayout);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.r.clear();
        this.ab.clear();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.d("AllDeviceListActivity", "getIntent is null in initData");
            return;
        }
        rej rejVar = new rej(("SWITCH_PLUGINDEVICE".equals(intent.getAction()) && intent.getBooleanExtra("isFromFitnessAdvice", false)) ? qtx.f46831a : null);
        this.r.addAll(rejVar.a());
        this.ab.addAll(rejVar.d());
        this.ar.d(AnalyticsValue.ALL_DEVICE_LIST_ENTER.value());
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.d("AllDeviceListActivity", "getIntentData, intent is null");
            return;
        }
        this.an = intent.getIntExtra("SPORT_TYPE", 0);
        this.m = intent.getStringExtra("kind_id");
        this.v = intent.getIntExtra("progressbar", 0);
        this.f24107a = intent.getIntExtra("KEY_INTENT_COURSE_ENTRANCE", 0);
        this.g = intent.getStringExtra("KEY_INTENT_EQUIPMENT_TYPE");
        int i = this.v;
        if (i == 0) {
            a();
        } else if (i == 100) {
            LogUtil.a("AllDeviceListActivity", "download resource is success");
        } else {
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).addDownloadIndexAllCallBack(this);
            this.h.setVisibility(0);
            this.h.setProgress(this.v);
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.h.setVisibility(0);
        this.x.setVisibility(8);
        this.s.setVisibility(8);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).addDownloadIndexAllCallBack(this);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
        if (this.ar != null) {
            HashMap map = new HashMap(16);
            map.put("download_status", 0);
            this.ar.e(AnalyticsValue.ALL_DEVICE_LIST_RESOURCE_DOWNLOAD_RESULT.value(), map);
        }
    }

    private void p() {
        if (coq.d(this.r) || coq.d(this.ab)) {
            LogUtil.d("AllDeviceListActivity", "mLeftList or mRightList is empty");
            this.i.setVisibility(4);
            this.al.setVisibility(4);
            return;
        }
        this.h.setVisibility(8);
        d();
        this.j = rcv.a(BaseApplication.getContext());
        this.i.setVisibility(0);
        this.al.setVisibility(0);
        this.q.notifyDataSetChanged();
        this.u.notifyDataSetChanged();
        s();
    }

    private void s() {
        if (TextUtils.isEmpty(this.m)) {
            this.q.d(0);
            return;
        }
        if (coq.d(this.r)) {
            return;
        }
        LogUtil.a("AllDeviceListActivity", "scrollToTargetKindType:", this.m);
        int i = 0;
        while (true) {
            if (i >= this.r.size()) {
                i = 0;
                break;
            }
            raz razVar = this.r.get(i);
            if (this.m.equals(razVar.e()) || (hcd.f36391c.containsKey(Integer.valueOf(this.an)) && ((HealthDevice.HealthDeviceKind) hcd.f36391c.get(Integer.valueOf(this.an))).name().equals(razVar.e()))) {
                break;
            } else {
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        Integer num = this.n.get(Integer.valueOf(i));
        if (num == null || num.intValue() == 0) {
            LogUtil.d("AllDeviceListActivity", "scrollToTargetKindType rightPosition is invalid");
            return;
        }
        this.q.d(i);
        if (this.p.getLayoutManager() instanceof LinearLayoutManager) {
            this.p.getLayoutManager().scrollToPosition(i);
        }
        RecyclerView.LayoutManager layoutManager = this.aa.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(num.intValue(), 0);
        }
    }

    private void d() {
        this.n.clear();
        for (int i = 0; i < this.ab.size(); i++) {
            if (this.ab.get(i).n() != -1 && !this.n.containsKey(Integer.valueOf(this.ab.get(i).n()))) {
                this.n.put(Integer.valueOf(this.ab.get(i).n()), Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.search_custom_title);
        this.f = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllDeviceListActivity.this.onBackPressed();
            }
        });
        this.al = (HealthSearchView) qsp.a(this, R.id.device_search_view);
        this.z = (ImageView) qsp.a(this, R.id.iv_search_back);
        this.ah = (LinearLayout) qsp.a(this, R.id.search_mask_layer);
        this.ai = (LinearLayout) qsp.a(this, R.id.search_container);
        this.ak = (LinearLayout) qsp.a(this, R.id.search_holder);
        this.p = (HealthRecycleView) qsp.a(this, R.id.left_device_kind);
        this.aa = (HealthRecycleView) qsp.a(this, R.id.right_device_list);
        this.ac = (HealthTextView) qsp.a(this, R.id.search_result_header);
        this.d = (LinearLayout) qsp.a(this, R.id.all_device_layout);
        this.am = (HealthRecycleView) qsp.a(this, R.id.search_device_result_list);
        this.h = (HealthProgressBar) qsp.a(this, R.id.download_progress);
        this.s = (LinearLayout) qsp.a(this, R.id.device_error_bad_layout);
        this.x = (LinearLayout) qsp.a(this, R.id.device_download_bad_layout);
        this.i = (RelativeLayout) qsp.a(this, R.id.data_layout);
        this.w = (HealthTextView) qsp.a(this, R.id.resource_error);
        this.am.setLayoutManager(new DeviceCustomLinearLayoutManager(this));
        this.ae = new ArrayList(16);
        int dimensionPixelOffset = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.hw_show_public_size_24);
        this.al.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        g();
        h();
        x();
        mfs.c(this, -1);
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        int iD = qrs.d(BaseApplication.getContext(), 64.0f);
        if (!LanguageUtil.f(this.f24109c)) {
            iD = qrs.d(BaseApplication.getContext(), 84.0f);
        }
        layoutParams.width = iD;
        this.p.setLayoutParams(layoutParams);
    }

    private void g() {
        LogUtil.a("AllDeviceListActivity", "enter initLeftRecyclerView");
        this.p.setLayoutManager(new LinearLayoutManager(this));
        if (this.p.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.p.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        LogUtil.a("AllDeviceListActivity", "mLeftList.size ", Integer.valueOf(this.r.size()));
        LeftKindAdapter leftKindAdapter = new LeftKindAdapter(this.r);
        this.q = leftKindAdapter;
        this.p.setAdapter(leftKindAdapter);
        this.q.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.21
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (obj instanceof raz) {
                    raz razVar = (raz) obj;
                    LogUtil.a("AllDeviceListActivity", "mLeftAdapter onItemClicked position: ", Integer.valueOf(i), " name: ", razVar.b());
                    AllDeviceListActivity.this.q.d(i);
                    AllDeviceListActivity.this.f24108b = true;
                    if (AllDeviceListActivity.this.aa.getLayoutManager() == null) {
                        return;
                    }
                    if (AllDeviceListActivity.this.aa.getLayoutManager() instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) AllDeviceListActivity.this.aa.getLayoutManager()).scrollToPositionWithOffset(((Integer) AllDeviceListActivity.this.n.get(Integer.valueOf(i))).intValue(), 0);
                    }
                    if (AllDeviceListActivity.this.ar != null) {
                        HashMap map = new HashMap(16);
                        map.put("kind_name", razVar.b());
                        AllDeviceListActivity.this.ar.e(AnalyticsValue.ALL_DEVICE_LIST_LEFT_KIND.value(), map);
                    }
                }
            }
        });
    }

    private void h() {
        LogUtil.a("AllDeviceListActivity", "enter initRightRecyclerView");
        this.aa.setLayoutManager(new LinearLayoutManager(this));
        if (this.aa.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.aa.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        LogUtil.a("AllDeviceListActivity", "mLeftList.size ", Integer.valueOf(this.r.size()));
        this.aa.setLayoutManager(new DeviceCustomLinearLayoutManager(this));
        RightListAdapter rightListAdapter = new RightListAdapter(this.ab);
        this.u = rightListAdapter;
        this.aa.setAdapter(rightListAdapter);
        this.u.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.25
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (qrs.r()) {
                    LogUtil.d("AllDeviceListActivity", "onClick isFastDoubleClick");
                    return;
                }
                if (obj instanceof rba) {
                    rba rbaVar = (rba) obj;
                    if (!eqr.a().b(AllDeviceListActivity.this.f24107a) || TextUtils.isEmpty(AllDeviceListActivity.this.m) || AllDeviceListActivity.this.m.equals(rbaVar.h())) {
                        if (!hcd.f36391c.containsKey(Integer.valueOf(AllDeviceListActivity.this.an)) || ((HealthDevice.HealthDeviceKind) hcd.f36391c.get(Integer.valueOf(AllDeviceListActivity.this.an))).name().equals(rbaVar.h())) {
                            AllDeviceListActivity.this.e(rbaVar);
                            if (AllDeviceListActivity.this.ar != null) {
                                HashMap map = new HashMap(16);
                                map.put("device_name", rbaVar.g());
                                AllDeviceListActivity.this.ar.e(AnalyticsValue.ALL_DEVICE_LIST_RIGHT_ITEM.value(), map);
                                return;
                            }
                            return;
                        }
                        LogUtil.a("AllDeviceListActivity", "select wrong device type");
                        return;
                    }
                    eqr.a().b(AllDeviceListActivity.this.f24109c, AllDeviceListActivity.this.g);
                }
            }
        });
        this.aa.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.24
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                AllDeviceListActivity.this.l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        int iN;
        if (this.aa.getLayoutManager() instanceof LinearLayoutManager) {
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) this.aa.getLayoutManager()).findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > this.ab.size()) {
                iFindFirstVisibleItemPosition = 0;
            }
            if (coq.d(this.ab) || this.ab.get(iFindFirstVisibleItemPosition) == null || (iN = this.ab.get(iFindFirstVisibleItemPosition).n()) == -1 || this.q.c() == iN) {
                return;
            }
            LogUtil.a("AllDeviceListActivity", "onScrollRightListScrolled currentPosition:", Integer.valueOf(iN));
            c(iN);
            if (this.p.getLayoutManager() instanceof LinearLayoutManager) {
                this.p.getLayoutManager().scrollToPosition(iN);
            }
        }
    }

    private void c(int i) {
        if (!this.f24108b) {
            this.q.d(i);
        }
        this.f24108b = false;
    }

    private void x() {
        this.z.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllDeviceListActivity.this.f();
            }
        });
        this.f.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllDeviceListActivity.this.finish();
            }
        });
        this.ah.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllDeviceListActivity.this.f();
            }
        });
        u();
    }

    private void u() {
        this.al.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                LogUtil.a("AllDeviceListActivity", "onFocusChange:", Boolean.valueOf(z));
                AllDeviceListActivity.this.i();
                if (!z) {
                    AllDeviceListActivity.this.f.setTitleBarBackgroundColor(AllDeviceListActivity.this.getResources().getColor(R.color.colorBackground));
                    AllDeviceListActivity.this.i.setBackgroundColor(AllDeviceListActivity.this.getResources().getColor(R.color.colorBackground));
                    AllDeviceListActivity.this.ai.setVisibility(8);
                    AllDeviceListActivity.this.d.setVisibility(0);
                    AllDeviceListActivity.this.q();
                    AllDeviceListActivity.this.af.d();
                    AllDeviceListActivity.this.d(false);
                    return;
                }
                AllDeviceListActivity.this.f.setTitleBarBackgroundColor(AllDeviceListActivity.this.getResources().getColor(R.color.colorSubBackground));
                AllDeviceListActivity.this.i.setBackgroundColor(AllDeviceListActivity.this.getResources().getColor(R.color.colorSubBackground));
                AllDeviceListActivity.this.d.setVisibility(8);
                AllDeviceListActivity.this.ai.setVisibility(0);
                AllDeviceListActivity.this.ac();
                AllDeviceListActivity.this.t();
                AllDeviceListActivity.this.d(true);
            }
        });
        this.al.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.8
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                AllDeviceListActivity.this.ai.setVisibility(0);
                AllDeviceListActivity.this.c(str);
                AllDeviceListActivity.this.ar.d(AnalyticsValue.ALL_DEVICE_LIST_SEARCH.value());
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                AllDeviceListActivity.this.ai.setVisibility(0);
                AllDeviceListActivity.this.c(str);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z) {
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.7
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    CustomTitleBar customTitleBar = AllDeviceListActivity.this.f;
                    HealthSearchView healthSearchView = AllDeviceListActivity.this.al;
                    LinearLayout linearLayout = AllDeviceListActivity.this.d;
                    LinearLayout linearLayout2 = AllDeviceListActivity.this.ai;
                    ImageView imageView = AllDeviceListActivity.this.z;
                    RelativeLayout relativeLayout = AllDeviceListActivity.this.i;
                    if (customTitleBar == null || healthSearchView == null || linearLayout == null || relativeLayout == null || linearLayout2 == null || imageView == null) {
                        return;
                    }
                    customTitleBar.setImportantForAccessibility(1);
                    healthSearchView.setImportantForAccessibility(1);
                    linearLayout.setImportantForAccessibility(1);
                    linearLayout2.setImportantForAccessibility(1);
                    relativeLayout.setImportantForAccessibility(1);
                    if (z) {
                        lrd.c(imageView, 1);
                        accessibilityNodeInfo.removeChild(customTitleBar);
                        accessibilityNodeInfo.removeChild(imageView);
                        accessibilityNodeInfo.removeChild(healthSearchView);
                        accessibilityNodeInfo.removeChild(relativeLayout);
                        accessibilityNodeInfo.removeChild(linearLayout);
                        accessibilityNodeInfo.addChild(imageView);
                        accessibilityNodeInfo.addChild(healthSearchView);
                        accessibilityNodeInfo.addChild(relativeLayout);
                        accessibilityNodeInfo.addChild(linearLayout2);
                        return;
                    }
                    lrd.c(imageView, 2);
                    accessibilityNodeInfo.removeChild(customTitleBar);
                    accessibilityNodeInfo.removeChild(imageView);
                    accessibilityNodeInfo.removeChild(healthSearchView);
                    accessibilityNodeInfo.removeChild(linearLayout);
                    accessibilityNodeInfo.removeChild(relativeLayout);
                    accessibilityNodeInfo.removeChild(linearLayout2);
                    accessibilityNodeInfo.addChild(customTitleBar);
                    accessibilityNodeInfo.addChild(healthSearchView);
                    accessibilityNodeInfo.addChild(relativeLayout);
                    accessibilityNodeInfo.addChild(linearLayout);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        this.ah.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object systemService = getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 2);
            }
        }
        this.ah.setVisibility(8);
        this.al.setQuery("", false);
        this.al.clearFocus();
        this.ai.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        LogUtil.a("AllDeviceListActivity", "start do search");
        i();
        if (TextUtils.isEmpty(str)) {
            this.ac.setText("");
            this.ae.clear();
            RightListAdapter rightListAdapter = this.ad;
            if (rightListAdapter != null) {
                rightListAdapter.notifyDataSetChanged();
            }
            this.am.setVisibility(8);
            return;
        }
        this.ag = str;
        this.af.d(str, this.ab);
        this.af.e(this);
    }

    private reo.c k() {
        reo.c cVar = new reo.c();
        cVar.d(this.f);
        cVar.a(this.ak);
        cVar.e(this.ah);
        cVar.c(this.al);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        reo.e(this, k());
        this.z.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        reo.a(this, k());
        this.z.setVisibility(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        qrs.e();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SearchDeviceThreadManager searchDeviceThreadManager = this.af;
        if (searchDeviceThreadManager != null) {
            searchDeviceThreadManager.d();
            this.af.a();
            this.af = null;
        }
        c cVar = this.o;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.o = null;
        }
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
        esw eswVar = this.k;
        if (eswVar != null) {
            eswVar.a();
        }
        aa();
        ae();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102 && rdp.a()) {
            f(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        try {
            if (this.t != null) {
                LogUtil.a("AllDeviceListActivity", "unregister mNetBroadcastReceiver");
                unregisterReceiver(this.t);
                this.t = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.c("AllDeviceListActivity", "unregisterNetBroadcastReceiver is error");
        }
    }

    private void z() {
        try {
            if (this.y != null) {
                LogUtil.a("AllDeviceListActivity", "mPairBroadcastReceiver mReceiver != null");
                LocalBroadcastManager.getInstance().unregisterReceiver(this.y);
                this.y = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.c("AllDeviceListActivity", "unregisterPairBroadcast is error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        try {
            BroadcastReceiver broadcastReceiver = this.l;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.l = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.c("AllDeviceListActivity", "unregisterH5NetBroadcast is error");
        }
    }

    private void aa() {
        ab();
        ad();
        z();
    }

    @Override // com.huawei.ui.device.utlis.SearchDeviceThreadManager.SearchCallback
    public void onSearchResult(List<rba> list) {
        LogUtil.a("AllDeviceListActivity", "onSearchResult");
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = list;
        this.o.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<rba> list) {
        this.ae.clear();
        if (list.isEmpty()) {
            LogUtil.a("AllDeviceListActivity", "deviceListData is empty");
            RightListAdapter rightListAdapter = this.ad;
            if (rightListAdapter != null) {
                rightListAdapter.notifyDataSetChanged();
            }
            this.ac.setText("");
            this.ac.setVisibility(8);
            this.am.setVisibility(8);
            return;
        }
        if (this.ad == null) {
            RightListAdapter rightListAdapter2 = new RightListAdapter(this.ae);
            this.ad = rightListAdapter2;
            this.am.setAdapter(rightListAdapter2);
        }
        this.ac.setVisibility(0);
        this.am.setVisibility(0);
        this.ae.addAll(list);
        this.ad.c(this.ag);
        this.ad.notifyDataSetChanged();
        this.ac.setText(getResources().getQuantityString(R.plurals.IDS_search_device_result_count, this.ae.size(), Integer.valueOf(this.ae.size())));
        this.ad.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.9
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (obj instanceof rba) {
                    AllDeviceListActivity.this.e((rba) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(rba rbaVar) {
        n();
        String strI = rbaVar.i();
        LogUtil.a("AllDeviceListActivity", "pairGuide,:", strI);
        if (TextUtils.isEmpty(strI)) {
            LogUtil.d("AllDeviceListActivity", "pairGuid is empty");
            return;
        }
        if ("4".equals(strI)) {
            if (qtx.b(rbaVar.h(), rbaVar.l())) {
                this.ar.c(this.f24109c, rbaVar);
                return;
            } else {
                if (d(rbaVar)) {
                    return;
                }
                this.ar.e(rbaVar, this.f24109c);
                return;
            }
        }
        if ("3".equals(strI)) {
            LogUtil.d("AllDeviceListActivity", "this device is no pair guide");
            if (qtx.b(rbaVar.h(), rbaVar.l())) {
                o(rbaVar);
                return;
            } else {
                this.ar.e(rbaVar, this.f24109c, this.j);
                return;
            }
        }
        if ("6".equals(strI)) {
            if (qtx.b(rbaVar.h(), rbaVar.l()) && etn.h(rbaVar.r().get(0))) {
                this.e = rbaVar;
                h(rbaVar);
                return;
            }
            return;
        }
        if (qtx.b(rbaVar.h(), rbaVar.l())) {
            if (coq.d(rbaVar.r())) {
                return;
            }
            o(rbaVar);
        } else if (qtx.b(rbaVar.h(), rbaVar.l()) || rbaVar.h().toUpperCase(Locale.ENGLISH).equals("SPORTS_GENIE")) {
            LogUtil.a("AllDeviceListActivity", "allDeviceItem.getKindType：", rbaVar.h());
            j(rbaVar);
        } else if (rbaVar.h().equals("SMART_HEADPHONES")) {
            j(rbaVar);
        } else {
            j(rbaVar);
            LogUtil.d("AllDeviceListActivity", "invalid pairGuide:", rbaVar.h());
        }
    }

    private boolean d(rba rbaVar) {
        rbaVar.r();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final rba rbaVar) {
        if (rbaVar == null) {
            return;
        }
        if (!CommonUtil.ab(this.f24109c)) {
            if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(rbaVar.r().get(0))) {
                i();
                i(rbaVar);
                return;
            } else {
                y();
                return;
            }
        }
        String strH = rbaVar.h();
        int size = rbaVar.r().size();
        LogUtil.a("AllDeviceListActivity", "deviceType = ", strH, ", Uuid list size = ", Integer.valueOf(size), ", first Uuid = ", rbaVar.r());
        esw eswVar = new esw(this, rbaVar.h(), 1, rbaVar.r(), new est() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.10
            @Override // defpackage.ess
            public void onSuccess() {
                LogUtil.a("AllDeviceListActivity", "HadDownloadSingleDevice onSuccess");
                AllDeviceListActivity.this.a(false);
                AllDeviceListActivity.this.i();
                AllDeviceListActivity.this.i(rbaVar);
            }

            @Override // defpackage.ess
            public void onDownload(int i) {
                AllDeviceListActivity.this.b(i);
            }

            @Override // defpackage.ess
            public void onFailure(int i) {
                LogUtil.a("AllDeviceListActivity", "HadDownloadSingleDevice onFailure");
                AllDeviceListActivity.this.a(false);
                if (!CommonUtil.ab(AllDeviceListActivity.this.f24109c)) {
                    AllDeviceListActivity.this.y();
                } else {
                    AllDeviceListActivity.this.a(rbaVar);
                }
            }
        });
        this.k = eswVar;
        eswVar.e(eek.d(rbaVar.j()));
        i();
        this.k.b();
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.h.setVisibility(8);
        this.x.setVisibility(8);
        this.s.setVisibility(8);
        this.h.setProgress(0);
        d(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final rba rbaVar) {
        this.h.setVisibility(8);
        this.x.setVisibility(0);
        this.s.setVisibility(8);
        if (this.ai.getVisibility() == 0) {
            e(R.color.colorSubBackground);
        } else {
            e(R.color.colorBackground);
        }
        this.x.post(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.6
            @Override // java.lang.Runnable
            public void run() {
                AllDeviceListActivity allDeviceListActivity = AllDeviceListActivity.this;
                allDeviceListActivity.d(allDeviceListActivity.e(allDeviceListActivity.x));
            }
        });
        this.x.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllDeviceListActivity.this.h(rbaVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.h.setVisibility(8);
        this.x.setVisibility(8);
        this.s.setVisibility(0);
        if (this.ai.getVisibility() == 0) {
            e(R.color.colorSubBackground);
        } else {
            e(R.color.colorBackground);
        }
        this.s.post(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.11
            @Override // java.lang.Runnable
            public void run() {
                AllDeviceListActivity allDeviceListActivity = AllDeviceListActivity.this;
                allDeviceListActivity.d(allDeviceListActivity.e(allDeviceListActivity.s));
            }
        });
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllDeviceListActivity.this.ar.a(AllDeviceListActivity.this);
            }
        });
        e();
        b(this.l);
    }

    private void e(int i) {
        View viewFindViewById = findViewById(android.R.id.content);
        if (viewFindViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            if (viewGroup.getChildCount() <= 0) {
                return;
            }
            viewGroup.getChildAt(0).setBackgroundColor(getResources().getColor(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        HealthRecycleView healthRecycleView = this.p;
        if (healthRecycleView != null) {
            healthRecycleView.setIsIntercept(z);
        }
        HealthRecycleView healthRecycleView2 = this.aa;
        if (healthRecycleView2 != null) {
            healthRecycleView2.setIsIntercept(z);
        }
        HealthSearchView healthSearchView = this.al;
        if (healthSearchView != null) {
            boolean z2 = !z;
            healthSearchView.setEnabled(z2);
            this.al.setClickable(z2);
            this.al.setActivated(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final rba rbaVar) {
        LoginInit.getInstance(this).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.14
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    AllDeviceListActivity.this.b(rbaVar);
                }
            }
        }, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        RelativeLayout relativeLayout = this.i;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = i;
            this.i.setLayoutParams(layoutParams);
        }
        if (this.ai.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams2 = this.al.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).topMargin = i;
                this.al.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(View view) {
        int dimension;
        if (view == null || view.getMeasuredHeight() <= 0) {
            dimension = (int) getResources().getDimension(R.dimen.hw_commonui_toolbar_height_50);
        } else {
            dimension = view.getMeasuredHeight();
        }
        int dimension2 = dimension + ((int) getResources().getDimension(R.dimen.elementsMarginVerticalM));
        LinearLayout linearLayout = this.ai;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            dimension2 -= (int) getResources().getDimension(R.dimen.hwsubheader_margin_safety_top);
        }
        LogUtil.e("AllDeviceListActivity", "getTopMargin:", Integer.valueOf(dimension2));
        return dimension2;
    }

    private void e() {
        if (this.l != null) {
            return;
        }
        this.l = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.19
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null || intent.getAction() == null) {
                    LogUtil.d("AllDeviceListActivity", "NetBroadcastReceiver intent is null");
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (CommonUtil.ab(BaseApplication.getContext())) {
                        AllDeviceListActivity.this.d(0);
                        AllDeviceListActivity allDeviceListActivity = AllDeviceListActivity.this;
                        allDeviceListActivity.h(allDeviceListActivity.e);
                        AllDeviceListActivity.this.ad();
                        return;
                    }
                    LogUtil.d("AllDeviceListActivity", "net work is error");
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(rba rbaVar) {
        elh elhVarD = ResourceManager.c().d(rbaVar.r().get(0));
        if (elhVarD == null) {
            LogUtil.d("AllDeviceListActivity", "productInfo is null");
            return;
        }
        if (!dzu.e(elhVarD.t(), elhVarD.m() != null ? elhVarD.m().name() : "")) {
            LogUtil.a("AllDeviceListActivity", "setThirdPartyH5PairGuide version no support");
            dzu.c(this, this, new VersionNoSupportCallback() { // from class: com.huawei.ui.device.activity.adddevice.AllDeviceListActivity.16
                @Override // com.huawei.health.device.callback.VersionNoSupportCallback
                public void onDialogClose() {
                    LogUtil.a("AllDeviceListActivity", "setThirdPartyH5PairGuide VersionVerifyUtil noSupportDevice onDialogClose");
                }
            });
        } else {
            if (this.ar == null) {
                this.ar = new qtx();
            }
            this.ar.a(this, elhVarD);
        }
    }

    private void o(rba rbaVar) {
        LogUtil.a("AllDeviceListActivity", "startThirdDevicePairGuide");
        if (rbaVar == null || TextUtils.isEmpty(rbaVar.i())) {
            LogUtil.a("AllDeviceListActivity", "startThirdDevicePairGuide allDeviceItem or pairGuid is null");
        } else if (rbaVar.i().equals("3")) {
            f(rbaVar);
        } else {
            g(rbaVar);
        }
    }

    private void f(rba rbaVar) {
        if (rbaVar == null) {
            return;
        }
        if (!rdp.a()) {
            this.e = rbaVar;
            PermissionDialogHelper.d(this, 102);
        } else {
            c(rbaVar);
        }
    }

    private void c(rba rbaVar) {
        Intent intent = new Intent(this, (Class<?>) OneKeyScanActivity.class);
        List<String> listR = rbaVar.r();
        if (listR instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
        }
        startActivity(intent);
    }

    private void g(rba rbaVar) {
        if (rbaVar == null) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) PairingGuideActivity.class);
        intent.putExtra("kind_id", rbaVar.h());
        intent.putExtra("pair_guide", rbaVar.i());
        intent.putExtra("bluetooth_type", rbaVar.c());
        List<String> listR = rbaVar.r();
        if (listR instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
        }
        intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, rbaVar.j());
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", this.f24107a);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", this.g);
        startActivity(intent);
    }

    private void j(rba rbaVar) {
        String strI = rbaVar.i();
        LogUtil.a("AllDeviceListActivity", "pairGuide,:", strI);
        if (TextUtils.isEmpty(strI)) {
            LogUtil.d("AllDeviceListActivity", "pairGuid is empty");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) PairingGuideActivity.class);
        List<String> listR = rbaVar.r();
        if (coq.d(listR)) {
            LogUtil.d("AllDeviceListActivity", "uuidList is empty");
            return;
        }
        if (listR instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
        }
        intent.putExtra("kind_id", rbaVar.h());
        intent.putExtra("pair_guide", strI);
        intent.putExtra("bluetooth_type", rbaVar.c());
        intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, rbaVar.j());
        startActivity(intent);
    }

    @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
    public void setDownloadStatus(int i, int i2) {
        c cVar = this.o;
        if (cVar == null) {
            LogUtil.d("AllDeviceListActivity", "setDownloadStatus, mHandler is null");
            return;
        }
        if (i == 1) {
            cVar.sendEmptyMessage(100);
            return;
        }
        if (i == 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 102;
            messageObtain.obj = Integer.valueOf(i2);
            c cVar2 = this.o;
            if (cVar2 != null) {
                cVar2.sendMessage(messageObtain);
                return;
            }
            return;
        }
        if (i == -2) {
            cVar.sendEmptyMessage(103);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 101;
        messageObtain2.obj = Integer.valueOf(i);
        this.o.sendMessage(messageObtain2);
    }

    private void n() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
            LocalBroadcastManager.getInstance().registerReceiver(this.y, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.c("AllDeviceListActivity", "resisterPairReceiver is error");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        LogUtil.a("AllDeviceListActivity", "cancel to select device");
        ObserverManagerUtil.e("DEVICE_ASSOCIATION", 152);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
