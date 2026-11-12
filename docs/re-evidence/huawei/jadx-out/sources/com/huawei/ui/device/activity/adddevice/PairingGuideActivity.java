package com.huawei.ui.device.activity.adddevice;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollbar.HealthScrollbarView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.R;
import com.huawei.ui.device.adapter.PairGuideAdapter;
import com.huawei.uikit.hwscrollbarview.widget.HwScrollbarView;
import defpackage.coq;
import defpackage.dnf;
import defpackage.dxm;
import defpackage.edg;
import defpackage.edl;
import defpackage.edm;
import defpackage.edn;
import defpackage.edx;
import defpackage.eek;
import defpackage.eev;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.era;
import defpackage.est;
import defpackage.esw;
import defpackage.lvi;
import defpackage.mfs;
import defpackage.pig;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qtx;
import defpackage.rbd;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.xga;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class PairingGuideActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24164a;
    private elh aa;
    private HealthRecycleView ab;
    private HealthButton ac;
    private LinearLayout ad;
    private LinearLayout ae;
    private HealthButton af;
    private HealthProgressBar ag;
    private LinearLayout ah;
    private HealthTextView ai;
    private HealthScrollbarView ak;
    private HealthButton al;
    private qtx an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24166c;
    private HealthCheckBox e;
    private HealthViewPager f;
    private HealthDotsPageIndicator g;
    private esw i;
    private DeviceDownloadSourceInfo j;
    private boolean k;
    private boolean l;
    private String m;
    private HealthDevice.HealthDeviceKind n;
    private String o;
    private HealthScrollView p;
    private LinearLayout q;
    private a r;
    private FrameLayout s;
    private RelativeLayout u;
    private String w;
    private HealthTextView y;
    private ArrayList<Integer> h = new ArrayList<>(16);
    private List<rbd> v = new ArrayList(16);
    private List<String> aj = new ArrayList(16);
    private List<String> d = new ArrayList(16);
    private ArrayList<Bitmap> z = new ArrayList<>(16);
    private BroadcastReceiver t = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.PairingGuideActivity.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("PairingGuideActivity", "NetBroadcastReceiver intent is null");
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (CommonUtil.ab(BaseApplication.getContext())) {
                    PairingGuideActivity.this.d();
                    PairingGuideActivity.this.aj();
                } else {
                    LogUtil.j("PairingGuideActivity", "net work is error");
                }
            }
        }
    };
    private BroadcastReceiver x = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.PairingGuideActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("PairingGuideActivity", "mPairBroadcastReceiver intent is null");
            } else if ("com.huawei.health.action.PAIR_DEVICE_SUCCESS".equals(intent.getAction())) {
                LogUtil.a("PairingGuideActivity", "pair device success");
                if (PairingGuideActivity.this.isFinishing()) {
                    return;
                }
                PairingGuideActivity.this.finish();
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pairing_guide);
        this.an = new qtx();
        f();
        j();
    }

    private void m() {
        elh elhVarD = ResourceManager.c().d(this.aj.get(0));
        this.aa = elhVarD;
        if (elhVarD == null) {
            LogUtil.j("PairingGuideActivity", "mProductInfo is null");
        } else {
            rdt.b(elhVarD.t(), this.m, this.w);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        esw eswVar = this.i;
        if (eswVar != null) {
            eswVar.a();
        }
        ak();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        try {
            if (this.t != null) {
                LogUtil.a("PairingGuideActivity", "unregister mNetBroadcastReceiver");
                unregisterReceiver(this.t);
                this.t = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PairingGuideActivity", "unregisterNetBroadcast is error");
        }
    }

    private void am() {
        try {
            if (this.x != null) {
                LogUtil.a("PairingGuideActivity", "unregisterBroadcastReceiver mReceiver is not null");
                LocalBroadcastManager.getInstance().unregisterReceiver(this.x);
                this.x = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PairingGuideActivity", "unregisterPairBroadcast is error");
        }
    }

    private void ak() {
        aj();
        am();
    }

    private void f() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.pairing_guide_title);
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: qud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46868b.c(view);
            }
        });
        this.f = (HealthViewPager) qsp.a(this, R.id.vp_device_device_img);
        this.ab = (HealthRecycleView) qsp.a(this, R.id.pairing_guide_list);
        this.e = (HealthCheckBox) qsp.a(this, R.id.complete_operation_checkbox);
        this.al = (HealthButton) qsp.a(this, R.id.start_pairing_bt);
        this.g = (HealthDotsPageIndicator) qsp.a(this, R.id.device_navigation_spot);
        this.y = (HealthTextView) qsp.a(this, R.id.pair_guide_text);
        this.p = (HealthScrollView) qsp.a(this, R.id.one_layout);
        this.s = (FrameLayout) qsp.a(this, R.id.more_layout);
        HealthScrollbarView healthScrollbarView = (HealthScrollbarView) qsp.a(this, R.id.scrollbar);
        this.ak = healthScrollbarView;
        xga.d((RecyclerView) this.ab, (HwScrollbarView) healthScrollbarView);
        this.q = (LinearLayout) qsp.a(this, R.id.device_error_bad_layout);
        this.ae = (LinearLayout) qsp.a(this, R.id.device_download_bad_layout);
        this.ag = (HealthProgressBar) qsp.a(this, R.id.download_progress);
        this.u = (RelativeLayout) qsp.a(this, R.id.pair_guide_layout);
        this.ai = (HealthTextView) qsp.a(this, R.id.resource_error);
        this.ad = (LinearLayout) qsp.a(this, R.id.pair_layout);
        this.ah = (LinearLayout) qsp.a(this, R.id.scan_layout);
        this.af = (HealthButton) qsp.a(this, R.id.scan_button);
        this.ac = (HealthButton) qsp.a(this, R.id.pin_button);
        n();
        this.al.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.ac.setOnClickListener(this);
        era.c(this, (LinearLayout) qsp.a(this, R.id.image_view_container), 0.8d, true);
        era.c(this, this.f, 0.7d, true);
        o();
        h();
    }

    public /* synthetic */ void c(View view) {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    private void h() {
        boolean zAh = qrs.ah(this);
        LogUtil.a("PairingGuideActivity", "initPadView isPad: ", Boolean.valueOf(zAh));
        if (zAh) {
            ((HealthColumnRelativeLayout) qsp.a(this, R.id.content_column_layout)).setColumnType(0);
            HealthScrollView healthScrollView = this.p;
            healthScrollView.setPadding(0, healthScrollView.getPaddingTop(), 0, this.p.getPaddingBottom());
            HealthRecycleView healthRecycleView = this.ab;
            healthRecycleView.setPadding(0, healthRecycleView.getPaddingTop(), 0, this.ab.getPaddingBottom());
            LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.start_pairing_layout);
            linearLayout.setPadding(0, linearLayout.getPaddingTop(), 0, linearLayout.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = this.ak.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(0);
                this.ak.setLayoutParams(layoutParams2);
            }
        }
    }

    private void j() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("PairingGuideActivity", "intent is null");
            return;
        }
        try {
            this.aj = intent.getStringArrayListExtra(BasePairManagerJsApi.UUID_LIST);
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("PairingGuideActivity", "get intent is ArrayIndexOutOfBoundsException");
        }
        this.m = intent.getStringExtra("kind_id");
        this.w = intent.getStringExtra("pair_guide");
        this.k = intent.getBooleanExtra("is_scan_to_pair_guide", false);
        this.f24164a = intent.getIntExtra("bluetooth_type", -1);
        this.f24166c = intent.getStringExtra("bluetooth_name");
        this.f24165b = intent.getStringExtra("bluetooth_mac");
        this.l = intent.getBooleanExtra("is_invalidation", false);
        this.j = (DeviceDownloadSourceInfo) intent.getParcelableExtra(AdShowExtras.DOWNLOAD_SOURCE);
        this.o = intent.getStringExtra("uniqueId");
        List<String> list = this.aj;
        if (list == null || list.isEmpty()) {
            LogUtil.j("PairingGuideActivity", "device uuids is empty");
            return;
        }
        if (TextUtils.isEmpty(this.w)) {
            LogUtil.j("PairingGuideActivity", "mPairGuide is empty");
        } else {
            if (TextUtils.isEmpty(this.m)) {
                LogUtil.j("PairingGuideActivity", "mKindType is empty");
                return;
            }
            LogUtil.a("PairingGuideActivity", "device info is:", this.m, " ,", this.aj.toString());
            s();
            d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        qrs.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (qtx.b(this.m, this.aj)) {
            q();
            return;
        }
        if (this.m.equals("SMART_HEADPHONES") && !dxm.aa(this.aj.get(0)) && !b(this.aj)) {
            LogUtil.a("PairingGuideActivity", "SMART_HEADPHONES enter R1 or R1P");
            ac();
            return;
        }
        this.ag.setVisibility(0);
        this.ae.setVisibility(8);
        this.q.setVisibility(8);
        this.u.setVisibility(4);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(this.aj, new d());
    }

    static class d implements DownloadDeviceInfoCallBack {
        private final WeakReference<PairingGuideActivity> d;

        private d(PairingGuideActivity pairingGuideActivity) {
            this.d = new WeakReference<>(pairingGuideActivity);
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onSuccess() {
            PairingGuideActivity pairingGuideActivity = this.d.get();
            if (c(pairingGuideActivity)) {
                pairingGuideActivity.ac();
            }
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onFailure(int i) {
            PairingGuideActivity pairingGuideActivity = this.d.get();
            if (c(pairingGuideActivity)) {
                pairingGuideActivity.b(i);
            }
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void netWorkError() {
            PairingGuideActivity pairingGuideActivity = this.d.get();
            if (c(pairingGuideActivity)) {
                pairingGuideActivity.x();
            }
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onDownload(int i) {
            PairingGuideActivity pairingGuideActivity = this.d.get();
            if (c(pairingGuideActivity)) {
                pairingGuideActivity.a(i);
            }
        }

        private boolean c(PairingGuideActivity pairingGuideActivity) {
            if (pairingGuideActivity != null && !pairingGuideActivity.isFinishing() && !pairingGuideActivity.isDestroyed()) {
                return true;
            }
            LogUtil.a("PairingGuideActivity", "activity is null, finish or destroyed");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        this.ag.setVisibility(8);
        this.u.setVisibility(0);
        this.ae.setVisibility(8);
        this.q.setVisibility(8);
        m();
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.ag.setVisibility(8);
        this.ae.setVisibility(0);
        this.q.setVisibility(8);
        this.u.setVisibility(4);
        if (i == -3) {
            this.ai.setText(R.string.IDS_download_error_storage);
        } else {
            this.ai.setText(R.string.IDS_no_device_res);
        }
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: quf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46869a.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            BroadcastManagerUtil.a(this, this.t, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PairingGuideActivity", "handleDownloadNetError register receiver is error");
        }
        this.ag.setVisibility(8);
        this.q.setVisibility(0);
        this.ae.setVisibility(8);
        this.u.setVisibility(4);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: qua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46864b.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        this.an.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.ag.setVisibility(0);
        this.q.setVisibility(8);
        this.ae.setVisibility(8);
        this.u.setVisibility(4);
        if (i > 0) {
            this.ag.setProgress(i);
        }
    }

    private boolean b(List<String> list) {
        if (coq.d(list)) {
            return false;
        }
        return "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(list.get(0));
    }

    private void s() {
        this.h.clear();
        this.v.clear();
        this.z.clear();
        if (qtx.b(this.m, this.aj)) {
            LogUtil.j("PairingGuideActivity", "isThirdEceSystem");
            return;
        }
        if (this.aj.contains("41bfc883-69f1-494e-8f6a-8e545202565c") && !TextUtils.isEmpty(this.f24165b)) {
            this.ad.setVisibility(8);
            this.ah.setVisibility(0);
        } else {
            this.ad.setVisibility(0);
            this.ah.setVisibility(8);
        }
        mfs.c(this, -1);
        this.u.setVisibility(0);
        t();
        if (b(this.aj)) {
            w();
            return;
        }
        if ("1".equals(this.w)) {
            this.p.setVisibility(8);
            this.s.setVisibility(0);
            v();
        } else if ("2".equals(this.w)) {
            u();
        } else if ("5".equals(this.w)) {
            p();
        } else {
            LogUtil.j("PairingGuideActivity", "other status");
        }
    }

    private void p() {
        LogUtil.a("PairingGuideActivity", "enter sports engine pairGuide");
        List<String> listE = e();
        if (coq.d(listE)) {
            LogUtil.j("PairingGuideActivity", "setFivePairGuide, deviceList is empty");
            this.u.setVisibility(4);
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(listE.get(0));
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.j("PairingGuideActivity", "description file read error");
            return;
        }
        ArrayList<String> arrayListAq = pluginInfoByUuid.i().aq();
        ArrayList<String> arrayListAx = pluginInfoByUuid.i().ax();
        if (arrayListAq == null || arrayListAq.isEmpty()) {
            LogUtil.a("PairingGuideActivity", "guideDescList has no value");
            this.p.setVisibility(0);
            this.s.setVisibility(8);
            c(listE, "", R.string.IDS_device_paring_type_le_des_info_21);
            return;
        }
        if (arrayListAq.size() == 1) {
            a(listE, pluginInfoByUuid, arrayListAq, arrayListAx);
        } else {
            c(pluginInfoByUuid, arrayListAq, arrayListAx);
            aa();
        }
    }

    private void c(edl edlVar, ArrayList<String> arrayList, List<String> list) {
        int i = 0;
        while (i < arrayList.size()) {
            rbd rbdVar = new rbd();
            int i2 = i + 1;
            rbdVar.b(getResources().getString(R.string.IDS_device_pair_guide_step, Integer.valueOf(i2)));
            if (list != null && !list.isEmpty()) {
                LogUtil.a("PairingGuideActivity", "sports engine has image");
                rbdVar.b(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(edlVar, list.get(i)));
            }
            rbdVar.a(arrayList.get(i));
            this.v.add(rbdVar);
            i = i2;
        }
    }

    private List<String> e() {
        this.ag.setVisibility(8);
        this.u.setVisibility(0);
        this.ae.setVisibility(8);
        this.q.setVisibility(8);
        this.p.setVisibility(8);
        this.s.setVisibility(0);
        ArrayList arrayList = new ArrayList(16);
        for (String str : this.aj) {
            if (!edg.a().containsKey(str) && !this.d.contains(str)) {
                LogUtil.j("PairingGuideActivity", "setFivePairGuide, this device not support: ", str);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private void a(List<String> list, edl edlVar, ArrayList<String> arrayList, List<String> list2) {
        this.p.setVisibility(0);
        this.s.setVisibility(8);
        this.g.setVisibility(4);
        if (list2 != null && !list2.isEmpty()) {
            LogUtil.j("PairingGuideActivity", "guideImgList has value");
            this.z.add(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(edlVar, list2.get(0)));
            a aVar = new a(null, this.z, true);
            this.r = aVar;
            this.f.setAdapter(aVar);
            g();
        }
        LogUtil.a("PairingGuideActivity", "sports engine has only description");
        c(list, arrayList.get(0), R.string.IDS_device_paring_type_le_des_info_21);
    }

    private void v() {
        for (String str : this.aj) {
            if (!edg.a().containsKey(str) && !this.d.contains(str)) {
                LogUtil.a("PairingGuideActivity", "this device is not support show");
            } else {
                rbd rbdVar = new rbd();
                edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
                if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
                    rbdVar.b(pluginInfoByUuid.i().ah());
                    rbdVar.c(a(pluginInfoByUuid));
                    rbdVar.a(pluginInfoByUuid.i().be());
                    rbdVar.e(str);
                    b(rbdVar, pluginInfoByUuid);
                    this.v.add(rbdVar);
                } else {
                    edn ednVarC = lvi.c(str, false);
                    if (ednVarC == null) {
                        LogUtil.j("PairingGuideActivity", " deviceInfoNew is null");
                    } else {
                        int iL = ednVarC.l();
                        int iC = ednVarC.c();
                        if (7 == iL) {
                            iC = R.mipmap.img_huawei_b3_bg;
                            rbdVar.b(R.drawable.b3_pair_guide_animation);
                        }
                        rbdVar.b(ednVarC.i());
                        rbdVar.e(false);
                        rbdVar.c(iC);
                        rbdVar.a(ednVarC.v());
                        rbdVar.e(str);
                        this.v.add(rbdVar);
                    }
                }
            }
        }
        aa();
    }

    private void b(rbd rbdVar, edl edlVar) {
        ArrayList<String> arrayListAr = edlVar.i().ar();
        if (coq.d(arrayListAr)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<String> it = arrayListAr.iterator();
        while (it.hasNext()) {
            arrayList.add(pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + it.next() + ".png");
        }
        rbdVar.e(arrayList);
    }

    private void t() {
        this.d.clear();
        List<edx> indexList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexList();
        if (indexList == null || indexList.size() <= 0) {
            LogUtil.j("PairingGuideActivity", "have no index info");
            return;
        }
        for (edx edxVar : indexList) {
            if (edxVar.g() != null) {
                String strB = edxVar.b();
                if (this.aj.contains(strB)) {
                    if (!eev.d(edxVar.h()) && !"41bfc883-69f1-494e-8f6a-8e545202565c".equals(edxVar.b())) {
                        LogUtil.j("PairingGuideActivity", "app version is not supported");
                    } else if (Utils.o()) {
                        if (TextUtils.equals(edxVar.f(), "2") || TextUtils.equals(edxVar.f(), "3")) {
                            this.d.add(strB);
                        }
                    } else if (TextUtils.equals(edxVar.f(), "1") || TextUtils.equals(edxVar.f(), "3")) {
                        this.d.add(strB);
                    }
                }
            }
        }
        LogUtil.a("PairingGuideActivity", "setDeviceShowUuid, mDeviceUuidList: ", Integer.valueOf(this.d.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if ("2".equals(this.w)) {
            ab();
        }
        if ("5".equals(this.w)) {
            w();
        }
        m();
    }

    private void ab() {
        this.ag.setVisibility(8);
        this.u.setVisibility(0);
        this.ae.setVisibility(8);
        this.q.setVisibility(8);
        this.p.setVisibility(0);
        this.s.setVisibility(8);
        elh elhVarD = ResourceManager.c().d(this.aj.get(0));
        this.aa = elhVarD;
        if (elhVarD == null) {
            LogUtil.j("PairingGuideActivity", "productInfo is null");
            return;
        }
        ArrayList<elh.c> arrayListC = elhVarD.c();
        if (arrayListC == null || arrayListC.isEmpty()) {
            LogUtil.j("PairingGuideActivity", "pairGuideInfos is empty");
        } else {
            a(arrayListC.get(0));
        }
    }

    private void q() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            af();
            return;
        }
        Iterator<String> it = this.aj.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(it.next())) {
                z = false;
            }
        }
        if (z) {
            z();
        } else {
            x();
        }
    }

    private void af() {
        String str = this.m;
        int size = this.aj.size();
        LogUtil.a("PairingGuideActivity", "deviceType: ", str, ", Uuid list size: ", Integer.valueOf(size), ", first Uuid: ", this.aj);
        esw eswVar = new esw(this, this.m, 1, this.aj, new est() { // from class: com.huawei.ui.device.activity.adddevice.PairingGuideActivity.1
            @Override // defpackage.ess
            public void onSuccess() {
                LogUtil.a("PairingGuideActivity", "HadDownloadSingleDevice onSuccess");
                PairingGuideActivity.this.z();
            }

            @Override // defpackage.ess
            public void onDownload(int i) {
                PairingGuideActivity.this.a(i);
            }

            @Override // defpackage.ess
            public void onFailure(int i) {
                LogUtil.a("PairingGuideActivity", "HadDownloadSingleDevice onFailure");
                PairingGuideActivity.this.b(-1);
            }
        });
        this.i = eswVar;
        DeviceDownloadSourceInfo deviceDownloadSourceInfo = this.j;
        if (deviceDownloadSourceInfo != null) {
            eswVar.e(eek.d(deviceDownloadSourceInfo));
        }
        this.i.b();
    }

    private void w() {
        this.ag.setVisibility(8);
        int i = 0;
        this.u.setVisibility(0);
        this.ae.setVisibility(8);
        this.q.setVisibility(8);
        this.p.setVisibility(8);
        this.s.setVisibility(0);
        elh elhVarD = ResourceManager.c().d(this.aj.get(0));
        this.aa = elhVarD;
        if (elhVarD == null) {
            LogUtil.j("PairingGuideActivity", "productInfo is null");
            return;
        }
        ArrayList<elh.c> arrayListC = elhVarD.c();
        if (arrayListC == null || arrayListC.isEmpty()) {
            LogUtil.j("PairingGuideActivity", "pairGuideInfos is empty");
            ag();
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (arrayListC.size() == 1) {
            a(arrayListC.get(0));
            return;
        }
        while (i < arrayListC.size()) {
            rbd rbdVar = new rbd();
            elh.c cVar = arrayListC.get(i);
            if (cVar == null) {
                LogUtil.j("PairingGuideActivity", "ProductInfo.ProductDescription info is null");
                return;
            }
            i++;
            rbdVar.b(getResources().getString(R.string.IDS_device_pair_guide_step, Integer.valueOf(i)));
            rbdVar.a(a(cVar.c(), this.aa.t()));
            rbdVar.c(d(cVar.d(), this.aa.t()));
            this.v.add(rbdVar);
        }
        aa();
    }

    private String d(String str, String str2) {
        return elg.e().d(str2, str);
    }

    private String a(String str, String str2) {
        return elo.a(str2, str);
    }

    private void u() {
        this.p.setVisibility(0);
        this.s.setVisibility(8);
        this.g.setVisibility(0);
        if (dxm.aa(this.aj.get(0))) {
            r();
        } else if (i()) {
            ad();
        } else {
            y();
        }
    }

    private void y() {
        ArrayList arrayList = new ArrayList(16);
        for (String str : this.aj) {
            if (!edg.a().containsKey(str)) {
                if (!this.d.contains(str)) {
                    LogUtil.j("PairingGuideActivity", "setOneWearDevice, this device not support: ", str);
                } else if ("ba50037c-f395-4a5d-907d-d98b90c73840".equals(str)) {
                    LogUtil.j("PairingGuideActivity", "setOneWearDevice, gt3: ", str);
                }
            }
            arrayList.add(str);
        }
        if (coq.d(arrayList)) {
            LogUtil.j("PairingGuideActivity", "setOneWearDevice, deviceList is empty");
            this.u.setVisibility(4);
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(arrayList.get(0));
        if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
            c(arrayList, pluginInfoByUuid.i().be(), R.string.IDS_device_paring_type_le_des_info_21);
        } else {
            edn ednVarC = lvi.c(arrayList.get(0), false);
            if (ednVarC == null) {
                LogUtil.j("PairingGuideActivity", "deviceInfoNew is null");
                return;
            }
            c(arrayList, ednVarC.v(), R.string.IDS_device_paring_type_le_des_info_21);
        }
        a(arrayList);
    }

    private void c(List<String> list, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            SpannableStringBuilder spannableStringBuilderA = rdp.a(list.get(0), BaseApplication.getContext());
            if (spannableStringBuilderA == null) {
                this.y.setText(getResources().getString(i));
                return;
            } else {
                this.y.setText(spannableStringBuilderA);
                return;
            }
        }
        this.y.setText(str);
    }

    private void a(List<String> list) {
        for (String str : list) {
            if (this.z.size() >= 6) {
                break;
            }
            edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
            if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
                ArrayList<String> arrayListAd = pluginInfoByUuid.i().ad();
                if (!coq.d(arrayListAd)) {
                    int size = pluginInfoByUuid.i().ad().size();
                    b(str);
                    for (int i = 0; i < size && this.z.size() < 6; i++) {
                        this.z.add(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, arrayListAd.get(i)));
                    }
                }
            } else {
                edn ednVarC = lvi.c(str, false);
                if (ednVarC == null) {
                    LogUtil.j("PairingGuideActivity", "setWearImage, deviceInfoNew is null");
                } else {
                    this.z.add(BitmapFactory.decodeResource(getResources(), ednVarC.c()));
                }
            }
        }
        a aVar = new a(null, this.z, true);
        this.r = aVar;
        this.f.setAdapter(aVar);
        if (this.z.size() == 1) {
            this.g.setVisibility(4);
        }
        if (coq.d(this.z)) {
            LogUtil.j("PairingGuideActivity", "setWearImage, mPluginImages is empty");
            this.u.setVisibility(4);
        }
        g();
    }

    private void b(String str) {
        edm indexBean = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexBean();
        if (indexBean == null) {
            return;
        }
        String str2 = eek.d() + indexBean.a() + File.separator + "IDS_icon_porsche_gt3.webp";
        if (new File(str2).exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inInputShareable = true;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
            if (!"b81581e1-5c5a-4e30-b099-0a448ef56a24".equals(str) || bitmapDecodeFile == null) {
                return;
            }
            this.z.add(bitmapDecodeFile);
        }
    }

    private void ad() {
        edn ednVarC = lvi.c(this.aj.get(0), false);
        if (ednVarC == null) {
            LogUtil.j("PairingGuideActivity", "deviceInfoNew is empty");
            return;
        }
        this.h.addAll(ednVarC.n());
        this.y.setText(getResources().getString(R.string.IDS_device_paring_type_r1_des_info_guide_2));
        a aVar = new a(this.h, null, false);
        this.r = aVar;
        this.f.setAdapter(aVar);
        if (this.h.size() == 1) {
            this.g.setVisibility(4);
        }
        if (coq.d(this.h)) {
            this.u.setVisibility(4);
        }
        g();
    }

    private boolean i() {
        if (!this.m.equals("SMART_HEADPHONES") || dxm.aa(this.aj.get(0))) {
            return false;
        }
        LogUtil.a("PairingGuideActivity", "SMART_HEADPHONES enter R1 or R1P");
        return true;
    }

    private void a(elh.c cVar) {
        if (cVar == null) {
            return;
        }
        this.p.setVisibility(0);
        this.s.setVisibility(8);
        this.g.setVisibility(4);
        this.z.add(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(d(cVar.d(), this.aa.t())));
        this.y.setText(a(cVar.c(), this.aa.t()));
        if ("PRO_GPRS".equals(this.aa.u())) {
            this.al.setText(getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add));
        }
        a aVar = new a(null, this.z, true);
        this.r = aVar;
        this.f.setAdapter(aVar);
        g();
    }

    private String a(edl edlVar) {
        return pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + edlVar.i().aw() + ".png";
    }

    private void aa() {
        if (coq.d(this.v)) {
            LogUtil.j("PairingGuideActivity", "setPairAdapter, mPairGuideInfos is empty");
            this.u.setVisibility(4);
        } else {
            this.u.setVisibility(0);
            PairGuideAdapter pairGuideAdapter = new PairGuideAdapter(this.v);
            this.ab.setLayoutManager(new LinearLayoutManager(this));
            this.ab.setAdapter(pairGuideAdapter);
        }
        elh elhVar = this.aa;
        if (elhVar == null || !"PRO_GPRS".equals(elhVar.u())) {
            return;
        }
        this.al.setText(getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add));
    }

    private void g() {
        this.g.setRtlEnable(true);
        this.g.setViewPager(this.f);
    }

    private void o() {
        this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.adddevice.PairingGuideActivity.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (!z) {
                    PairingGuideActivity.this.n();
                    return;
                }
                PairingGuideActivity.this.al.setAlpha(1.0f);
                PairingGuideActivity.this.af.setAlpha(1.0f);
                PairingGuideActivity.this.ac.setAlpha(1.0f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.emui_disabled_alpha, typedValue, true);
        float f = typedValue.getFloat();
        this.al.setAlpha(f);
        this.af.setAlpha(f);
        this.ac.setAlpha(f);
    }

    static class a extends HealthPagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Integer> f24172a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Bitmap> f24173c;
        private boolean d;

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        a(List<Integer> list, List<Bitmap> list2, boolean z) {
            this.f24172a = list;
            this.f24173c = list2;
            this.d = z;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            if (this.d) {
                List<Bitmap> list = this.f24173c;
                if (list != null) {
                    return list.size();
                }
                return 0;
            }
            List<Integer> list2 = this.f24172a;
            if (list2 != null) {
                return list2.size();
            }
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0042  */
        /* JADX WARN: Code duplicated, block: B:20:0x004b  */
        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            ImageView imageView = new ImageView(BaseApplication.getContext());
            if (this.d) {
                List<Bitmap> list = this.f24173c;
                if (list != null) {
                    if (i >= 0 && i < list.size()) {
                        imageView.setImageBitmap(this.f24173c.get(i));
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        if (viewGroup instanceof HealthViewPager) {
                            ((HealthViewPager) viewGroup).addView(imageView, 0);
                        }
                    }
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    if (viewGroup instanceof HealthViewPager) {
                        ((HealthViewPager) viewGroup).addView(imageView, 0);
                    }
                }
            } else {
                List<Integer> list2 = this.f24172a;
                if (list2 != null) {
                    if (i >= 0 && i < list2.size()) {
                        imageView.setImageResource(this.f24172a.get(i).intValue());
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        if (viewGroup instanceof HealthViewPager) {
                            ((HealthViewPager) viewGroup).addView(imageView, 0);
                        }
                    }
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    if (viewGroup instanceof HealthViewPager) {
                        ((HealthViewPager) viewGroup).addView(imageView, 0);
                    }
                }
            }
            return imageView;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj != null && (obj instanceof ImageView)) {
                ImageView imageView = (ImageView) obj;
                if (viewGroup == null || imageView.getDrawable() == null) {
                    return;
                }
                viewGroup.removeView(imageView);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.start_pairing_bt || id == R.id.pin_button) {
            if (!this.e.isChecked()) {
                LogUtil.j("PairingGuideActivity", "check box is not checked");
                return;
            }
            if (qrs.r()) {
                LogUtil.j("PairingGuideActivity", "onClick isFastDoubleClick");
                return;
            }
            if (this.aj.contains("41bfc883-69f1-494e-8f6a-8e545202565c")) {
                if (TextUtils.isEmpty(this.f24165b)) {
                    k();
                    return;
                } else {
                    ae();
                    return;
                }
            }
            k();
            return;
        }
        if (id == R.id.scan_button) {
            if (!this.e.isChecked()) {
                LogUtil.j("PairingGuideActivity", "check box is not checked");
                return;
            } else {
                a();
                return;
            }
        }
        LogUtil.a("PairingGuideActivity", "onClick other view");
    }

    private void ae() {
        rdp.c(this.f24166c, this.f24165b, this);
    }

    private void k() {
        l();
        if (dxm.aa(this.aj.get(0))) {
            return;
        }
        elh elhVar = this.aa;
        if (elhVar != null && "PRO_GPRS".equals(elhVar.u())) {
            a();
        } else {
            ag();
        }
    }

    private void a() {
        final CustomPermissionAction customPermissionAction = new CustomPermissionAction(this) { // from class: com.huawei.ui.device.activity.adddevice.PairingGuideActivity.3
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("PairingGuideActivity", "gotoQrCodeScanningActivity() qrCodeAction onGranted");
                PairingGuideActivity.this.b();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("PairingGuideActivity", "gotoQrCodeScanningActivity() qrCodeAction onDenied");
                PairingGuideActivity.this.b();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("PairingGuideActivity", "gotoQrCodeScanningActivity() qrCodeAction onForeverDenied");
                PairingGuideActivity.this.b();
            }
        };
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.PairingGuideActivity.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    PermissionUtil.d(PairingGuideActivity.this, PermissionUtil.PermissionType.CAMERA, customPermissionAction);
                }
            }
        }, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ComponentName componentName = new ComponentName(getPackageName(), "com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        startActivity(intent);
        finish();
    }

    private void l() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
            LocalBroadcastManager.getInstance().registerReceiver(this.x, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PairingGuideActivity", "resisterPairReceiver is error");
        }
    }

    private void ag() {
        if (this.aj.contains("e4b0b1d5-2003-4d88-8b5f-c4f64542040b") || this.aj.contains("a8ba095d-4123-43c4-a30a-0240011c58de")) {
            c();
        } else {
            ai();
        }
    }

    private void ai() {
        int i = this.f24164a;
        if (i == 1 || i == 2 || i == 0) {
            try {
                if (!rdp.a()) {
                    PermissionDialogHelper.d(this, 102);
                    return;
                }
            } catch (SecurityException unused) {
                LogUtil.e("PairingGuideActivity", "open bluetooth error");
            }
        }
        ah();
    }

    private void c() {
        LogUtil.a("PairingGuideActivity", "gotoWiFiInfo");
        Intent intent = new Intent(this, (Class<?>) DeviceMainActivity.class);
        intent.setAction("SWITCH_PLUGINDEVICE");
        List<String> list = this.aj;
        if (list == null || list.size() <= 0) {
            return;
        }
        intent.putExtra("productId", this.aj.get(0));
        intent.putExtra("arg1", "DeviceInfoList");
        intent.putExtra("arg4", "WiFiDevice");
        startActivity(intent);
        finish();
    }

    private void r() {
        ResourceManager.c().d();
        ResourceManager.c().b().e(HealthDevice.HealthDeviceKind.HDK_HEART_RATE);
        elh elhVarD = ResourceManager.c().d(this.aj.get(0));
        this.aa = elhVarD;
        if (elhVarD == null) {
            return;
        }
        dnf.e().b(this.aa.q(), ResourceManager.c().a(this.aj.get(0)) + File.separator + this.aa.o());
        HealthDevice.HealthDeviceKind healthDeviceKindM = this.aa.m();
        this.n = healthDeviceKindM;
        LogUtil.a("PairingGuideActivity", "ProductIntroductionFragment init mKind:", healthDeviceKindM);
        String str = this.aj.get(0);
        if (this.aa.d().size() == 0) {
            LogUtil.a("PairingGuideActivity", "productInfo.descriptions.size()");
            return;
        }
        int size = this.aa.d().size();
        for (int i = 0; i < size; i++) {
            this.z.add(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(elg.e().d(str, this.aa.d().get(i).d())));
        }
        a aVar = new a(null, this.z, true);
        this.r = aVar;
        this.f.setAdapter(aVar);
        if (this.z.size() == 1) {
            this.g.setVisibility(4);
        }
        String strA = elo.a(str, this.aa.d().get(0).c());
        if (TextUtils.isEmpty(strA)) {
            strA = getResources().getString(R.string.IDS_device_paring_type_le_des_info_21);
        }
        this.y.setText(strA);
        if (coq.d(this.z)) {
            this.u.setVisibility(4);
        }
        g();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102 && rdp.a()) {
            ah();
        }
    }

    private void ah() {
        LogUtil.a("PairingGuideActivity", "startIntent");
        try {
            Intent intent = new Intent(this, (Class<?>) OneKeyScanActivity.class);
            List<String> list = this.aj;
            if (list instanceof ArrayList) {
                intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) list);
                intent.putExtra("is_invalidation", this.l);
                intent.putExtra("uniqueId", this.o);
            }
            if (getIntent() != null) {
                int intExtra = getIntent().getIntExtra("KEY_INTENT_COURSE_ENTRANCE", 0);
                String stringExtra = getIntent().getStringExtra("KEY_INTENT_EQUIPMENT_TYPE");
                intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", intExtra);
                intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", stringExtra);
            }
            intent.putExtra("is_scan_to_pair_guide", this.k);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PairingGuideActivity", "startIntent error");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
