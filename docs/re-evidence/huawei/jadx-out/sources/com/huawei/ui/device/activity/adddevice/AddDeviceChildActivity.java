package com.huawei.ui.device.activity.adddevice;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.views.adddevice.SelectDeviceListAdapter;
import com.huawei.up.utils.ErrorCode;
import defpackage.dnf;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.edd;
import defpackage.edh;
import defpackage.edl;
import defpackage.edn;
import defpackage.edx;
import defpackage.edz;
import defpackage.eev;
import defpackage.elg;
import defpackage.elh;
import defpackage.lmf;
import defpackage.ltc;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvv;
import defpackage.lvx;
import defpackage.lza;
import defpackage.lzb;
import defpackage.mfs;
import defpackage.mgg;
import defpackage.njy;
import defpackage.pig;
import defpackage.pis;
import defpackage.pit;
import defpackage.piu;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qtk;
import defpackage.qtv;
import defpackage.rct;
import defpackage.rcv;
import defpackage.rfk;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class AddDeviceChildActivity extends BaseActivity {
    private boolean ac;
    private CommonDialog21 af;
    private ListView ah;
    private c ai;
    private int al;
    private String am;
    private Context d;
    private CustomProgressDialog.Builder f;
    private CustomProgressDialog g;
    private CustomTitleBar h;
    private rcv j;
    private RelativeLayout l;
    private CustomTextAlertDialog m;
    private HealthTextView n;
    private CustomTextAlertDialog o;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f24069a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f24070c = new Object();
    private ArrayList<rfk> ae = new ArrayList<>(16);
    private SelectDeviceListAdapter ag = null;
    private String ak = "";
    private boolean ab = false;
    private int ar = 0;
    private int an = 0;
    private boolean v = false;
    private boolean y = false;
    private boolean u = false;
    private volatile List<edx> ao = new ArrayList(16);
    private volatile List<edx> t = new ArrayList(16);
    private volatile int aq = 0;
    private volatile int k = 0;
    private volatile int aj = 0;
    private String i = "";
    private boolean q = false;
    private boolean w = false;
    private boolean x = false;
    private boolean ad = false;
    private ArrayList<rfk> r = new ArrayList<>(16);
    private ArrayList<rfk> s = new ArrayList<>(16);
    private int z = 0;
    private long aa = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DownloadManagerApi f24071b = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
    private EventBus.ICallback p = new EventBus.ICallback() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.3
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if (dVar == null) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "event is null");
            } else if (!AddDeviceChildActivity.this.isFinishing()) {
                AddDeviceChildActivity.this.i(dVar.e());
            } else {
                LogUtil.j("PluginDevice_AddDeviceChildActivity", "activity is null");
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        this.d = BaseApplication.getContext();
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "onCreate()");
        getWindow().setFlags(16777216, 16777216);
        EventBus.b(this.p, 2, "device_download_dialog", "single_device_download_dialog");
        this.y = false;
        this.u = false;
        this.ai = new c(this);
        g();
        l();
        Intent intent = getIntent();
        if (intent != null) {
            this.y = intent.getBooleanExtra("isFromWear", false);
            boolean booleanExtra = intent.getBooleanExtra("isFromWearR1", false);
            this.u = booleanExtra;
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "mIsFromWear: ", Boolean.valueOf(this.y), " mIsFromWearR1:", Boolean.valueOf(booleanExtra));
            if (!this.u && e(intent)) {
                return;
            }
        }
        r();
        int i = this.ar;
        if (i == 1 || i == 2) {
            mfs.c(this, -1);
        }
        if (intent != null && !TextUtils.isEmpty(intent.getStringExtra("pairGuideSelectAddress"))) {
            b(intent.getStringExtra("pairGuideSelectAddress"));
        } else {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "intent is null");
        }
    }

    private boolean e(Intent intent) {
        if (!this.y) {
            return false;
        }
        int intExtra = intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -10);
        if (intExtra == -10) {
            return true;
        }
        a(intExtra);
        return true;
    }

    private void l() {
        lvb.e();
        lzb.b();
        lvv.c(this.d);
        lvx.d();
        lza.d();
        if (this.d != null) {
            this.j = rcv.a(BaseApplication.getContext());
        }
        Intent intent = getIntent();
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("KEY_OUTSIDE_OPEN_ACTIVITY_FLAG", false);
            this.ab = booleanExtra;
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "mIsOutsideOpenApp: ", Boolean.valueOf(booleanExtra));
        }
    }

    private void r() {
        setContentView(R.layout.activity_add_device_child);
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.select_device_detail_title_bar);
        this.h = customTitleBar;
        customTitleBar.setVisibility(0);
        this.h.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = AddDeviceChildActivity.this.getIntent();
                if (intent != null && "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity".equals(intent.getAction())) {
                    AddDeviceChildActivity.this.y();
                } else {
                    AddDeviceChildActivity.this.finish();
                }
            }
        });
        this.ah = (ListView) qsp.a(this, R.id.list_setup_device);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.addDevice_error_layout);
        this.l = relativeLayout;
        relativeLayout.setVisibility(8);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AddDeviceChildActivity.this.q = true;
                if (CommonUtil.ab(AddDeviceChildActivity.this.d)) {
                    AddDeviceChildActivity.this.x();
                } else {
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "Network is not Connected ");
                    qpx.e(AddDeviceChildActivity.this.d, R.string.IDS_connect_error);
                }
            }
        });
        this.n = (HealthTextView) qsp.a(this, R.id.adddevice_error_text);
        e();
        if (this.ab) {
            p();
        } else {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        if (LocalBroadcastManager.getInstance() != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
    }

    private void aa() {
        NoTitleCustomAlertDialog.Builder builderD = d();
        builderD.c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qtk.d(AddDeviceChildActivity.this.d, AddDeviceChildActivity.this);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderD.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void ac() {
        NoTitleCustomAlertDialog.Builder builderD = d();
        builderD.c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "click known button");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderD.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void ab() {
        NoTitleCustomAlertDialog.Builder builderD = d();
        builderD.c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qtk.a(AddDeviceChildActivity.this.d, AddDeviceChildActivity.this);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderD.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private NoTitleCustomAlertDialog.Builder d() {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter buildNoTitleCustomAlertDialog");
        return new NoTitleCustomAlertDialog.Builder(this).a(this.d.getResources().getString(R.string.IDS_device_mgr_not_found_device_tips1) + System.lineSeparator() + this.d.getResources().getString(R.string.IDS_device_mgr_not_found_device_tips2, ltc.c(1.0d, 1, 0)) + System.lineSeparator() + this.d.getResources().getString(R.string.IDS_device_mgr_not_found_device_tips3, ltc.c(2.0d, 1, 0), qrs.b(BaseApplication.getContext()), BaseApplication.getContext().getString(R.string.IDS_select_device_b1_name), BaseApplication.getContext().getString(R.string.IDS_select_device_b2_name), BaseApplication.getContext().getString(R.string.IDS_app_display_name_w1)));
    }

    private void s() {
        Intent intent = getIntent();
        if (intent != null) {
            this.ar = intent.getIntExtra(TtmlNode.TAG_STYLE, 0);
            this.an = intent.getIntExtra("isHeartRateDevice", 0);
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initListView() style : ", Integer.valueOf(this.ar));
            int i = this.ar;
            if (i == 1) {
                e(this.an == 1);
                return;
            }
            if (i == 2) {
                b(this.an == 1);
            } else if (i == 4) {
                q();
            } else {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "unknown style");
            }
        }
    }

    private void e(boolean z) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForWatch");
        this.h.setTitleText(this.d.getString(R.string.IDS_add_device_smart_watch));
        if (!this.r.isEmpty()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForWatch() mHwLists.clear()");
            this.r.clear();
        }
        if (!this.s.isEmpty()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForWatch() mHonorLists.clear()");
            this.s.clear();
        }
        for (edn ednVar : rct.e(z)) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForWatch() type:", Integer.valueOf(ednVar.l()));
            b(ednVar.l(), ednVar.i(), ednVar.h(), ednVar.y(), ednVar.p());
        }
        z();
        a("SMART_WATCH", true);
        c("SMART_WATCH");
    }

    private void b(boolean z) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForBand");
        this.h.setTitleText(this.d.getString(R.string.IDS_add_device_smart_band));
        if (!this.r.isEmpty()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForBand() mHwLists.clear()");
            this.r.clear();
        }
        if (!this.s.isEmpty()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForBand() mHonorLists.clear()");
            this.s.clear();
        }
        for (edn ednVar : rct.d(z)) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForBand() type:", Integer.valueOf(ednVar.l()));
            b(ednVar.l(), ednVar.i(), ednVar.h(), ednVar.y(), ednVar.p());
        }
        z();
        a("SMART_BAND", true);
        c("SMART_BAND");
    }

    private void c(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 90;
        messageObtain.obj = str;
        this.ai.sendMessage(messageObtain);
    }

    private void e() {
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.activity_add_device_button, (ViewGroup) null);
        viewInflate.findViewById(R.id.not_found_device_tip).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AddDeviceChildActivity.this.w();
            }
        });
        this.ah.addFooterView(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        boolean zBg = CommonUtil.bg();
        boolean zO = Utils.o();
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "isHuaweiSystem ", Boolean.valueOf(zBg), ",isOverSea ", Boolean.valueOf(zO));
        if (zBg && !zO) {
            aa();
        } else if (zO) {
            ab();
        } else {
            ac();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.ae.clear();
        if (this.r.size() > 0) {
            rfk rfkVar = new rfk(0);
            rfkVar.a(this.d.getString(R.string.IDS_device_huawei_band));
            rfkVar.b(false);
            this.ae.add(rfkVar);
        }
        if (!this.w && this.r.size() > 3) {
            this.ae.addAll(this.r.subList(0, 3));
            o();
        } else {
            this.ae.addAll(this.r);
        }
        if (this.s.size() > 0) {
            rfk rfkVar2 = new rfk(0);
            rfkVar2.a(this.d.getString(R.string.IDS_device_honor_band));
            rfkVar2.b(true);
            this.ae.add(rfkVar2);
        }
        if (!this.x && this.s.size() > 3) {
            this.ae.addAll(this.s.subList(0, 3));
            rfk rfkVar3 = new rfk(2);
            rfkVar3.b(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AddDeviceChildActivity.this.x = true;
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", " listNotifyDataSetChanged mIsClickRyDeviceMore ");
                    AddDeviceChildActivity.this.v();
                }
            });
            this.ae.add(rfkVar3);
        } else {
            this.ae.addAll(this.s);
        }
        this.ag.a(this.ae);
        this.ag.notifyDataSetChanged();
    }

    private void o() {
        rfk rfkVar = new rfk(2);
        rfkVar.b(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AddDeviceChildActivity.this.w = true;
                LogUtil.a("PluginDevice_AddDeviceChildActivity", " listNotifyDataSetChanged mIsClickHwDeviceMore ");
                AddDeviceChildActivity.this.v();
            }
        });
        this.ae.add(rfkVar);
    }

    private void z() {
        if (this.r.size() > 0) {
            rfk rfkVar = new rfk(0);
            rfkVar.a(this.d.getString(R.string.IDS_device_huawei_band));
            rfkVar.b(false);
            this.ae.add(rfkVar);
        }
        if (this.r.size() > 3) {
            this.ae.addAll(this.r.subList(0, 3));
            rfk rfkVar2 = new rfk(2);
            rfkVar2.b(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", " listNotifyDataSetChanged mIsClickHwDeviceMore ");
                    AddDeviceChildActivity.this.w = true;
                    AddDeviceChildActivity.this.v();
                }
            });
            this.ae.add(rfkVar2);
        } else {
            this.ae.addAll(this.r);
        }
        if (this.s.size() > 0) {
            rfk rfkVar3 = new rfk(0);
            rfkVar3.a(this.d.getString(R.string.IDS_device_honor_band));
            rfkVar3.b(true);
            this.ae.add(rfkVar3);
        }
        if (this.s.size() > 3) {
            this.ae.addAll(this.s.subList(0, 3));
            rfk rfkVar4 = new rfk(2);
            rfkVar4.b(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", " listNotifyDataSetChanged mIsClickRyDeviceMore ");
                    AddDeviceChildActivity.this.x = true;
                    AddDeviceChildActivity.this.v();
                }
            });
            this.ae.add(rfkVar4);
        } else {
            this.ae.addAll(this.s);
        }
        SelectDeviceListAdapter selectDeviceListAdapter = new SelectDeviceListAdapter(this.ae);
        this.ag = selectDeviceListAdapter;
        this.ah.setAdapter((ListAdapter) selectDeviceListAdapter);
    }

    private void h(String str) {
        this.i = str;
        EzPluginManager.b().c(new PullListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.7
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar == null) {
                    LogUtil.j("PluginDevice_AddDeviceChildActivity", "onPullingChange result is null");
                    return;
                }
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "Update the status of the index file:", Integer.valueOf(pitVar.f()));
                int iF = pitVar.f();
                AddDeviceChildActivity.this.a(AnalyticsValue.DEVICE_INDEX_FILE_2180010.value(), iF, "index");
                if (iF == 1 || iF == -11) {
                    EzPluginManager.b().e();
                    AddDeviceChildActivity addDeviceChildActivity = AddDeviceChildActivity.this;
                    addDeviceChildActivity.d(addDeviceChildActivity.i);
                    return;
                }
                if (iF == -1) {
                    if (!njy.e(AddDeviceChildActivity.this.f24071b.getIndexList())) {
                        LogUtil.a("PluginDevice_AddDeviceChildActivity", "Updating the index fails and the UI is not updated");
                    }
                    if (AddDeviceChildActivity.this.ai != null) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 50;
                        AddDeviceChildActivity.this.ai.sendMessage(messageObtain);
                        return;
                    }
                    return;
                }
                if (iF == -5) {
                    AddDeviceChildActivity.this.aj();
                    if (AddDeviceChildActivity.this.ai != null) {
                        AddDeviceChildActivity.this.ai.removeMessages(70);
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.what = 80;
                        AddDeviceChildActivity.this.ai.sendMessage(messageObtain2);
                    }
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "The server does not find any resource.");
                    return;
                }
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "unknown error");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        j();
        List<edx> indexList = this.f24071b.getIndexList();
        if (njy.e(indexList)) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "have no index info");
            return;
        }
        for (edx edxVar : indexList) {
            if (edxVar.g() != null && TextUtils.equals(edxVar.g(), str)) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "has band plugin info, uuid :" + edxVar.b());
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "publish mode :" + edxVar.f());
                if (!a(edxVar)) {
                    if (Utils.o()) {
                        if (TextUtils.equals(edxVar.f(), "2") || TextUtils.equals(edxVar.f(), "3")) {
                            b(edxVar);
                        }
                    } else if (TextUtils.equals(edxVar.f(), "1") || TextUtils.equals(edxVar.f(), "3")) {
                        b(edxVar);
                    }
                }
            }
        }
        if (m() == 0) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "have no band plugin info");
            aj();
            this.ai.removeMessages(70);
            return;
        }
        c(k());
    }

    private boolean a(edx edxVar) {
        if (!CommonUtil.ap()) {
            return false;
        }
        if (!edxVar.g().equals("SMART_WATCH") && !edxVar.g().equals("SMART_BAND")) {
            return false;
        }
        b(edxVar);
        return true;
    }

    private void c(List<edx> list) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter checkIsNeedUpdate");
        for (final edx edxVar : list) {
            if (EzPluginManager.b().j(edxVar.b())) {
                EzPluginManager.b().e(edxVar.b(), new PullListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.9
                    @Override // com.huawei.pluginmgr.filedownload.PullListener
                    public void onPullingChange(pis pisVar, pit pitVar) {
                        if (pitVar == null) {
                            LogUtil.a("PluginDevice_AddDeviceChildActivity", "onPullingChange result is null");
                        } else if (pitVar.f() == 1) {
                            AddDeviceChildActivity.this.d(edxVar);
                        }
                    }
                });
            }
        }
        if (k().size() > 0) {
            e(k());
        } else {
            aj();
            this.ai.removeMessages(70);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(edx edxVar) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "check is remove plugin index info");
        e(edxVar);
    }

    private void e(List<edx> list) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter updateDescriptionForWear");
        aj();
        this.ai.removeMessages(70);
        Message messageObtain = Message.obtain();
        messageObtain.what = 20;
        this.ai.sendMessage(messageObtain);
        this.aq = 0;
        this.k = 0;
        for (final edx edxVar : list) {
            EzPluginManager.b().d(edxVar.b(), new PullListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.10
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) {
                    if (pisVar == null || pitVar == null) {
                        LogUtil.j("PluginDevice_AddDeviceChildActivity", "onPullingChange task or result is null");
                        return;
                    }
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "update Description mTotalSize is :", Integer.valueOf(pitVar.g()), "pullSize is :", Integer.valueOf(pitVar.d()), "uuid is :", pisVar.o());
                    AddDeviceChildActivity.this.a(AnalyticsValue.DEVICE_DESCRIPTION_FILE_2180011.value(), pitVar.f(), edxVar.b());
                    if (pitVar.f() != 1) {
                        AddDeviceChildActivity.this.e(edxVar);
                        LogUtil.a("PluginDevice_AddDeviceChildActivity", "Failed to update the description file,The UI is not updated.");
                        ReleaseLogUtil.e("HWWEAR_PluginDevice_AddDeviceChildActivity", "updateDescriptionForWear failed");
                        if (AddDeviceChildActivity.this.ai != null) {
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 50;
                            AddDeviceChildActivity.this.ai.sendMessage(messageObtain2);
                            return;
                        }
                        return;
                    }
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "The description file is updated successfully.");
                    synchronized (AddDeviceChildActivity.f24069a) {
                        AddDeviceChildActivity.this.aq += pitVar.g();
                        AddDeviceChildActivity.this.k++;
                        if (AddDeviceChildActivity.this.k == AddDeviceChildActivity.this.m()) {
                            LogUtil.a("PluginDevice_AddDeviceChildActivity", "Updated successfully. The total size of the resource:", Integer.valueOf(AddDeviceChildActivity.this.aq));
                            AddDeviceChildActivity.this.am();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m() {
        int size;
        synchronized (f24070c) {
            size = this.ao.size();
        }
        return size;
    }

    private void j() {
        synchronized (f24070c) {
            this.ao.clear();
        }
    }

    private void b(edx edxVar) {
        synchronized (f24070c) {
            this.ao.add(edxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(edx edxVar) {
        synchronized (f24070c) {
            if (this.ao.contains(edxVar)) {
                this.ao.remove(edxVar);
            }
        }
    }

    private List<edx> k() {
        ArrayList arrayList = new ArrayList(16);
        synchronized (f24070c) {
            Iterator<edx> it = this.ao.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    private void ah() {
        CustomProgressDialog customProgressDialog = this.g;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "The progress bar already exists");
            return;
        }
        this.g = new CustomProgressDialog(this);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this);
        this.f = builder;
        builder.e(this.d.getString(R.string.IDS_app_update_updating)).e(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "Click Cancel");
                AddDeviceChildActivity.this.n();
            }
        });
        CustomProgressDialog customProgressDialogC = this.f.c();
        this.g = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        if (!isFinishing()) {
            this.g.show();
            this.f.b(0);
            this.f.b(UnitUtil.e(0.0d, 2, 0));
        }
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "mCustomProgressDialog.show()");
    }

    private void f(int i) {
        CustomProgressDialog customProgressDialog = this.g;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || this.aq == 0) {
            return;
        }
        int i2 = ((this.aj + i) * 100) / this.aq;
        if (i2 > 99) {
            i2 = 99;
        }
        if (this.z != i2) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "showDownloadProgress downloaded ：", Integer.valueOf(this.aj + i), " total : ", Integer.valueOf(this.aq), " showDownloadProgress progress:", Integer.valueOf(i2));
            this.z = i2;
        }
        String strE = UnitUtil.e(i2, 2, 0);
        this.f.b(i2);
        this.f.b(strE);
    }

    private void h() {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter closeProgress");
        CustomProgressDialog customProgressDialog = this.g;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || isFinishing()) {
            return;
        }
        this.g.cancel();
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter closeProgress cancel");
    }

    private void f() {
        synchronized (e) {
            this.aj = 0;
        }
        h();
        aj();
        this.n.setText(this.d.getString(R.string.IDS_device_plugin_download_error));
        this.l.setVisibility(0);
        this.ai.removeMessages(70);
        for (edx edxVar : k()) {
            if (!this.t.contains(edxVar)) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "Delete the description file after the resource is not downloaded,uuid：" + edxVar.b());
                EzPluginManager.b().b(edxVar.b());
                c(edxVar);
            }
        }
    }

    private void c(edx edxVar) {
        for (int i = 0; i < this.r.size(); i++) {
            if (this.r.get(i).a() == lvi.b(edxVar.b())) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "updateUIForWear already have this device，need remove");
                this.r.remove(i);
                v();
            }
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (this.r.get(i2).a() == lvi.b(edxVar.b())) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "updateUIForWear already have this device，need remove");
                this.r.remove(i2);
                v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter retryDownload");
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (this.ai == null) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter retryDownload mMyHandler is null");
            return;
        }
        af();
        int i = this.ar;
        if (i == 1) {
            c("SMART_WATCH");
            return;
        }
        if (i == 2) {
            c("SMART_BAND");
        } else if (i == 4) {
            c("SMART_HEADPHONES");
        } else {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "retryDownload unknown style");
        }
    }

    private void af() {
        CustomProgressDialog customProgressDialog = this.g;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "The progress bar already exist");
            return;
        }
        if (this.af == null) {
            new CommonDialog21(this, R.style.app_update_dialogActivity);
            this.af = CommonDialog21.b(this);
        }
        this.af.b(this.d.getString(R.string.IDS_device_plugin_download_loading));
        this.af.c();
        if (!Utils.o()) {
            this.ai.sendEmptyMessageDelayed(70, 5000L);
        } else {
            this.ai.sendEmptyMessageDelayed(70, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        CommonDialog21 commonDialog21 = this.af;
        if (commonDialog21 == null || !commonDialog21.isShowing() || isFinishing()) {
            return;
        }
        this.af.dismiss();
        this.af = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter handleCancel");
        g();
        f();
    }

    private void g() {
        for (pis pisVar : piu.c().b()) {
            if (pisVar != null && e(pisVar.b())) {
                EzPluginManager.b().c(pisVar);
            }
        }
    }

    private boolean e(String str) {
        if (TextUtils.equals("plugin_index", str)) {
            return true;
        }
        List<edx> indexList = this.f24071b.getIndexList();
        if (njy.e(indexList)) {
            return false;
        }
        for (edx edxVar : indexList) {
            if (edxVar != null && TextUtils.equals(edxVar.b(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        int iM = m();
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter updatePluginForWear size：", Integer.valueOf(iM));
        this.t.clear();
        if (iM > 0) {
            b(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (e(i)) {
            return;
        }
        final String strD = d(i);
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter downloadOnePlugin fetchFileId:", strD);
        EzPluginManager.b().b(strD, new PullListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.8
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar != null && AddDeviceChildActivity.this.ai != null) {
                    AddDeviceChildActivity.this.a(AnalyticsValue.DEVICE_RESOURCE_FILE_2180012.value(), pitVar.f(), strD);
                    if (pitVar.f() == 1) {
                        LogUtil.a("PluginDevice_AddDeviceChildActivity", "The resource file (single) is successfully downloaded");
                        if (AddDeviceChildActivity.this.e(i)) {
                            return;
                        }
                        AddDeviceChildActivity.this.c(i);
                        synchronized (AddDeviceChildActivity.e) {
                            AddDeviceChildActivity.this.aj += pitVar.g();
                        }
                        int iM = AddDeviceChildActivity.this.m();
                        int i2 = i + 1;
                        if (i2 < iM) {
                            AddDeviceChildActivity.this.b(i2);
                            return;
                        } else {
                            LogUtil.a("PluginDevice_AddDeviceChildActivity", "Succeeded in downloading all the resource files");
                            AddDeviceChildActivity.this.j(40);
                            return;
                        }
                    }
                    if (pitVar.f() != 0) {
                        AddDeviceChildActivity.this.j(50);
                        LogUtil.j("PluginDevice_AddDeviceChildActivity", "downloadOnePlugin failed");
                        ReleaseLogUtil.e("HWWEAR_PluginDevice_AddDeviceChildActivity", "downloadOnePlugin failed");
                        return;
                    } else {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 30;
                        messageObtain.arg1 = pitVar.d();
                        AddDeviceChildActivity.this.ai.sendMessage(messageObtain);
                        return;
                    }
                }
                LogUtil.j("PluginDevice_AddDeviceChildActivity", "onPullingChange result or mMyHandler is null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        synchronized (f24070c) {
            edx edxVar = this.ao.get(i);
            String str = this.ao.get(i).b() + "_version";
            String strE = this.ao.get(i).e();
            StorageParams storageParams = new StorageParams();
            storageParams.e(0);
            SharedPreferenceManager.e(this.d, String.valueOf(1003), str, strE, storageParams);
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "setKey is ", str, ",setVersion is ", strE);
            g(edxVar);
            this.t.add(edxVar);
        }
    }

    private String d(int i) {
        String strB;
        synchronized (f24070c) {
            strB = this.ao.get(i).b();
        }
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        this.ai.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i) {
        int iM = m();
        if (i >= 0 && i <= iM - 1) {
            return false;
        }
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "downloadOnePlugin index out of bounder.");
        Message messageObtain = Message.obtain();
        messageObtain.what = 50;
        this.ai.sendMessage(messageObtain);
        return true;
    }

    private void a(String str, boolean z) {
        List<edx> indexList = this.f24071b.getIndexList();
        if (indexList == null || indexList.size() <= 0) {
            if (z) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "indexInfoCaches.size equals 0");
                Message messageObtain = Message.obtain();
                messageObtain.what = 60;
                this.ai.sendMessage(messageObtain);
                return;
            }
            return;
        }
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "indexInfoCaches.size greater 0");
        boolean z2 = false;
        for (edx edxVar : indexList) {
            if (edxVar.g() != null && TextUtils.equals(edxVar.g(), str)) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "has band plugin info from cache, uuid :", edxVar.b());
                if (!EzPluginManager.b().j(edxVar.b())) {
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "No resource file exists under the uuid");
                } else {
                    c(this.f24071b.getPluginInfoByUuid(edxVar.b()), eev.d(edxVar.h()));
                    z2 = true;
                }
            }
        }
        if (z2 || !z) {
            return;
        }
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "have no done file ");
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 60;
        this.ai.sendMessage(messageObtain2);
    }

    private void c(edl edlVar, boolean z) {
        if (z) {
            if (edlVar == null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 50;
                this.ai.sendMessage(messageObtain);
            } else {
                if (edlVar.i() != null && edlVar.i().bv()) {
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "deviceType is ", Integer.valueOf(edlVar.i().ag()));
                    u();
                    d(edlVar);
                    runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.15
                        @Override // java.lang.Runnable
                        public void run() {
                            AddDeviceChildActivity.this.v();
                        }
                    });
                    return;
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 10;
                messageObtain2.obj = edlVar;
                this.ai.sendMessage(messageObtain2);
            }
        }
    }

    private void d(edl edlVar) {
        edn ednVarA = rct.a();
        rfk rfkVar = new rfk(ednVarA.l(), ednVarA.i(), ednVarA.h(), true, b(edlVar));
        rfkVar.e(1);
        rfkVar.b(new b(rfkVar));
        this.r.add(0, rfkVar);
        this.ad = true;
    }

    private void u() {
        for (int i = 0; i < this.r.size(); i++) {
            if (this.r.get(i).c().equals(BaseApplication.getContext().getString(R.string.IDS_app_display_name_porc))) {
                this.r.remove(i);
                return;
            }
        }
    }

    private void g(edx edxVar) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "Name of the resource file downloaded successfully:", edxVar.b());
        c(this.f24071b.getPluginInfoByUuid(edxVar.b()), eev.d(edxVar.h()));
    }

    private void a(edl edlVar) {
        ArrayList<rfk> arrayList = this.r;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < this.r.size(); i++) {
                rfk rfkVar = this.r.get(i);
                if (rfkVar.b().getInt(OpAnalyticsConstants.OPERATION_ID) == lvi.b(edlVar.c()) && lvi.b(edlVar.c()) != -1) {
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "updateUIForWear already have this device");
                    this.r.remove(rfkVar);
                    c(edlVar);
                    v();
                    return;
                }
            }
        }
        ArrayList<rfk> arrayList2 = this.s;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                rfk rfkVar2 = this.s.get(i2);
                if (rfkVar2.b().getInt(OpAnalyticsConstants.OPERATION_ID) == lvi.b(edlVar.c()) && lvi.b(edlVar.c()) != -1) {
                    LogUtil.a("PluginDevice_AddDeviceChildActivity", "updateUIForWear already have this device");
                    this.s.remove(rfkVar2);
                    c(edlVar);
                    v();
                    return;
                }
            }
        }
        if (dxm.aa(edlVar.c())) {
            c();
        }
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter updateUIForWear");
        c(edlVar);
        v();
    }

    private void c(edl edlVar) {
        int iB = lvi.b(edlVar.c());
        if (this.an == 1) {
            boolean z = edh.d(iB) || edd.a().a(iB);
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "isSupportHeartRate ", Boolean.valueOf(z), " ", Integer.valueOf(iB));
            if (!z) {
                return;
            }
        }
        if (edlVar.i() == null) {
            return;
        }
        edl edlVar2 = new edl();
        edz edzVar = new edz();
        edzVar.d(edlVar.i().a());
        edlVar2.d(edzVar);
        if (qtk.c(edlVar2, iB, CommonUtil.e(this.d))) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "ezPluginInfo", edlVar.toString());
            if ("".equals(edlVar.i().ah())) {
                return;
            }
            c(iB, -1);
            rfk rfkVar = new rfk(-1, edlVar.i().ah(), edlVar.i().h(), true, b(edlVar));
            rfkVar.e(1);
            rfkVar.b(new b(rfkVar));
            if ("1".equals(edlVar.i().j())) {
                if (this.ad) {
                    this.r.add(1, rfkVar);
                    return;
                } else {
                    this.r.add(0, rfkVar);
                    return;
                }
            }
            this.s.add(0, rfkVar);
            return;
        }
        b(edlVar, iB);
    }

    private void b(edl edlVar, int i) {
        edn ednVarA = lvi.a(i);
        rfk rfkVar = new rfk(i, ednVarA.i(), ednVarA.h(), true, b(edlVar));
        rfkVar.e(1);
        rfkVar.b(new b(rfkVar));
        if (ednVarA.p() == 1) {
            if (this.ad) {
                this.r.add(1, rfkVar);
                return;
            } else {
                this.r.add(0, rfkVar);
                return;
            }
        }
        this.s.add(0, rfkVar);
    }

    private String b(edl edlVar) {
        return pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + edlVar.i().az() + ".png";
    }

    private void c(int i, int i2) {
        if (lvi.a(i) != null) {
            lvi.a(i).a(i2);
        }
    }

    private void q() {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForEar");
        this.h.setTitleText(this.d.getString(R.string.IDS_add_device_smart_headphones));
        if (!this.r.isEmpty()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForEar() mHwLists.clear()");
            this.r.clear();
        }
        if (!this.s.isEmpty()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForEar() mHonorLists.clear()");
            this.s.clear();
        }
        for (edn ednVar : rct.d()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initViewForEar() type:", Integer.valueOf(ednVar.l()));
            b(ednVar.l(), ednVar.i(), ednVar.h(), ednVar.y(), ednVar.p());
        }
        c();
        z();
        a("SMART_HEADPHONES", true);
        c("SMART_HEADPHONES");
    }

    private void c() {
        elh elhVarD = ResourceManager.c().d("6d5416d9-2167-41df-ab10-c492e152b44f");
        if (elhVarD != null) {
            String strT = elhVarD.t();
            Iterator<rfk> it = this.ae.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().b().getInt(OpAnalyticsConstants.OPERATION_ID) == 75) {
                    z = true;
                }
            }
            if (elhVarD.d().size() > 0) {
                File file = new File(elg.e().d(elhVarD.t(), elhVarD.d().get(0).d()));
                if (!z && file.exists()) {
                    dnf.e().b(elhVarD.q(), ResourceManager.c().a(strT) + File.separator + elhVarD.o());
                    edn ednVarD = lvi.d();
                    b(ednVarD.l(), ednVarD.i(), ednVarD.h(), ednVarD.y(), ednVarD.p());
                    return;
                }
                LogUtil.e("PluginDevice_AddDeviceChildActivity", "getProductInfo file is not exists ID:", strT);
            }
        }
    }

    private void b(int i, String str, String str2, int i2, int i3) {
        rfk rfkVarD = rct.d(i, str, str2, i2);
        rfkVarD.e(1);
        rfkVarD.b(new b(rfkVarD));
        if (i3 == 1) {
            this.r.add(rfkVarD);
        } else {
            this.s.add(rfkVarD);
        }
    }

    private void b(int i, String str, String str2, int i2) {
        rfk rfkVarD = rct.d(i, str, str2, i2);
        rfkVarD.b(new e(rfkVarD));
        this.ae.add(rfkVarD);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "onDestroy()");
        this.q = false;
        CustomProgressDialog.Builder builder = this.f;
        if (builder != null) {
            builder.e((View.OnClickListener) null);
        }
        g();
        ResourceManager.c().f();
        aj();
        h();
        EventBus.a(this.p, "device_download_dialog", "single_device_download_dialog");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = getIntent();
        if (intent != null && "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity".equals(intent.getAction())) {
            y();
        } else {
            super.onBackPressed();
            LogUtil.a("PluginDevice_AddDeviceChildActivity", " onBackPressed() ");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "onStart()");
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (qrs.ac() || qrs.v()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "Utils.isThreeFoldFonts:", Boolean.valueOf(qrs.ac()), "; isLargeFontScaleMode:", Boolean.valueOf(qrs.v()));
        }
    }

    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        rfk f24090c;

        b(rfk rfkVar) {
            this.f24090c = rfkVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = this.f24090c.b().getInt(OpAnalyticsConstants.OPERATION_ID);
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "MyOnClickListener(): item.getID() ", Integer.valueOf(i), "device name : ", this.f24090c.b().getString("mContent"));
            if (AddDeviceChildActivity.this.t()) {
                LogUtil.j("PluginDevice_AddDeviceChildActivity", "onClick() isFastClick");
                return;
            }
            HashMap map = new HashMap(16);
            map.put("click", "1");
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_SELECT_DEVICE_2060002.value(), map, 0);
            if (this.f24090c.a() == -1) {
                qtk.e(AddDeviceChildActivity.this.d, AddDeviceChildActivity.this);
                return;
            }
            if (AddDeviceChildActivity.this.ad && this.f24090c.c().equals(BaseApplication.getContext().getString(R.string.IDS_app_display_name_porc))) {
                AddDeviceChildActivity.this.ae();
                return;
            }
            if (this.f24090c.b().getInt(OpAnalyticsConstants.OPERATION_ID) != 75) {
                AddDeviceChildActivity.this.a(this.f24090c);
                return;
            }
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "Honor Sunny Headset");
            DeviceInfo deviceInfoD = mgg.d("PluginDevice_AddDeviceChildActivity");
            if (deviceInfoD == null || !HwVersionManager.b(BaseApplication.getContext()).m(deviceInfoD.getDeviceIdentify())) {
                AddDeviceChildActivity.this.ag();
            } else {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "MyOnClickListener, wear device OTA is in progress");
                AddDeviceChildActivity.this.ai();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        startActivityForResult(new Intent(this, (Class<?>) AddDeviceChildSecondActivity.class), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("SWITCH_PLUGINDEVICE");
        bundle.putString("arg1", "DeviceIntroduction");
        bundle.putString("arg2", "6d5416d9-2167-41df-ab10-c492e152b44f");
        intent.setPackage(this.d.getPackageName());
        intent.setClassName(this.d.getPackageName(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtras(bundle);
        startActivityForResult(intent, 102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(rfk rfkVar) {
        Intent intent = new Intent();
        intent.setPackage(this.d.getPackageName());
        intent.setClassName(this.d, "com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity");
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, rfkVar.b().getInt(OpAnalyticsConstants.OPERATION_ID));
        if (rfkVar.c() != null && rfkVar.c().equals(BaseApplication.getContext().getString(R.string.IDS_app_display_name_porc))) {
            intent.putExtra("isPorc", true);
            intent.putExtra("IS_PROC", true);
            this.ac = true;
        } else {
            this.ac = false;
            if (rfkVar.c() != null && rfkVar.c().equals(BaseApplication.getContext().getString(R.string.IDS_huawei_r1_pro_content))) {
                intent.putExtra("isR1pro", true);
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "is R1 pro");
            }
        }
        intent.putExtra("dname", rfkVar.c());
        intent.putExtra("viewStyle", this.ar);
        this.am = rfkVar.f();
        startActivityForResult(intent, 99);
    }

    private void a(int i) {
        b(i, this.am);
    }

    private void b(int i, String str) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enter hasSelectDevice():The device to be connected is:", Integer.valueOf(i), " mIsClicked:", Boolean.valueOf(this.v));
        if (this.v) {
            return;
        }
        this.v = true;
        this.al = i;
        edn ednVarA = rct.a(i);
        if (i == -3) {
            a((String) null);
        } else if (i != 3 && i != 10) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "start enterDevicePairGuide");
            e(ednVarA.l(), ednVarA.i(), str);
        } else {
            i();
        }
    }

    private void a(String str) {
        Intent intent = new Intent();
        intent.setClassName(this.d, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent.putExtra("isFromWear", this.y || this.u);
        intent.putExtra("device_id", str);
        startActivity(intent);
        finish();
    }

    private void e(int i, String str, String str2) {
        Intent intent = new Intent(this.d, (Class<?>) DevicePairGuideActivity.class);
        intent.putExtra("pairGuideProductType", i);
        intent.putExtra("pairGuideProductName", str);
        intent.putExtra("pairGuideSelectName", str2);
        intent.putExtra("pairGuideFromScanList", false);
        intent.putExtra("isHeartRateDevice", this.an);
        intent.putExtra("pairGuideDeviceMode", ErrorCode.HWID_IS_STOPED);
        startActivityForResult(intent, 1);
    }

    private void b(String str) {
        Intent intent = new Intent(this.d, (Class<?>) DevicePairGuideActivity.class);
        intent.putExtra("pairGuideProductType", 32);
        intent.putExtra("pairGuideProductName", rcv.a(BaseApplication.getContext()).d(32));
        intent.putExtra("pairGuideFromScanList", true);
        intent.putExtra("pairGuideSelectName", "CSN-Temp");
        intent.putExtra("pairGuideSelectAddress", str);
        intent.putExtra("pairGuideDeviceMode", ErrorCode.HWID_IS_STOPED);
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "enterDevicePairGuideActivity start Activity.");
        this.al = 32;
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Intent intent = new Intent(this.d, (Class<?>) DevicePairGuideActivity.class);
        qtk.a(intent, this.al, this.j);
        if (this.al == 10) {
            intent.putExtra("pairGuideProductType", 10);
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "start mIsProc:", Boolean.valueOf(this.ac));
            intent.putExtra("pairGuideProductName", this.d.getString(R.string.IDS_app_display_name_leo));
            intent.putExtra("IS_PROC", this.ac);
        } else {
            intent.putExtra("pairGuideProductType", 3);
            intent.putExtra("pairGuideProductName", this.d.getString(R.string.IDS_app_display_name_w1));
        }
        intent.putExtra("pairGuideFromScanList", false);
        intent.putExtra("pairGuideDeviceMode", ErrorCode.HWID_IS_STOPED);
        startActivityForResult(intent, 1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "Enter onActivityResult():mPersonalBasicInfoSettingFlag ", this.ak, " resultCode:", Integer.valueOf(i2), " requestCode:", Integer.valueOf(i));
        if (this.y) {
            if (i2 == 0 && i == 1) {
                setResult(2);
                qtk.c();
                finish();
            }
            if (i == 1) {
                d(i2, intent);
            }
        } else if (i == 1) {
            d(i2, intent);
        } else if (i == 99) {
            int intExtra = (i2 != 101 || intent == null) ? -10 : intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -10);
            if (intExtra != -10) {
                a(intExtra);
            }
        } else if (i2 != -1 || i != 102) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "unknown resultCode");
        } else {
            setResult(2);
            qtk.c();
            finish();
        }
        this.v = false;
        super.onActivityResult(i, i2, intent);
    }

    private void d(int i, Intent intent) {
        if (i == 2) {
            setResult(2);
            qtk.c();
            qtv.e(intent, this, qtv.c(i, this.y || this.u, this.al, true));
        }
    }

    private void p() {
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "initSelectDeviceListAndroidWear");
        if (!this.ae.isEmpty()) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "initSelectDeviceListAndroidWear() mList.clear()");
            this.ae.clear();
        }
        b(10, this.d.getString(R.string.IDS_app_display_name_porc), this.d.getString(R.string.IDS_porsche_design_content), R.mipmap.img_porsche_design_pic1);
        b(10, this.d.getString(R.string.IDS_app_display_name_leo), this.d.getString(R.string.IDS_huaweiwatch2_content), R.mipmap.img_huawei_watch_w2_pic1);
        SelectDeviceListAdapter selectDeviceListAdapter = new SelectDeviceListAdapter(this.ae);
        this.ag = selectDeviceListAdapter;
        this.ah.setAdapter((ListAdapter) selectDeviceListAdapter);
    }

    class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        rfk f24091b;

        e(rfk rfkVar) {
            this.f24091b = rfkVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "MyOnClickListenerAndroidWear(): item.getId() ", Integer.valueOf(this.f24091b.a()));
            AddDeviceChildActivity.this.al = this.f24091b.a();
            if (HwVersionManager.b(BaseApplication.getContext()).n("")) {
                AddDeviceChildActivity.this.ai();
            } else {
                AddDeviceChildActivity.this.i();
            }
        }
    }

    static class c extends Handler {
        WeakReference<AddDeviceChildActivity> e;

        c(AddDeviceChildActivity addDeviceChildActivity) {
            this.e = new WeakReference<>(addDeviceChildActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AddDeviceChildActivity addDeviceChildActivity = this.e.get();
            if (addDeviceChildActivity == null) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "handleMessage mActivity is null");
                return;
            }
            if (message != null) {
                super.handleMessage(message);
                if (message.what < 55) {
                    addDeviceChildActivity.d(message);
                } else {
                    addDeviceChildActivity.c(message);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        int i = message.what;
        if (i == 10) {
            if (message.obj instanceof edl) {
                edl edlVar = (edl) message.obj;
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "wear info download success uuid:", edlVar.c());
                a(edlVar);
                return;
            }
            return;
        }
        if (i == 20) {
            ah();
            return;
        }
        if (i == 30) {
            synchronized (f24069a) {
                f(message.arg1);
            }
            return;
        }
        if (i == 40) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "WEAR_INFO_DOWNLOAD_FINISH ");
            h();
            synchronized (e) {
                this.aj = 0;
            }
            return;
        }
        if (i == 50) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "WEAR_INFO_DOWNLOAD_ERROR ");
            n();
            f();
            if (this.q) {
                ad();
                return;
            }
            return;
        }
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "handleWearInfo default");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        int i = message.what;
        if (i == 60) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "WEAR_INFO_HAVE_NO_CACHE ");
            af();
            return;
        }
        if (i == 70) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "WEAR_INFO_LOADING_TIME_OUT ");
            aj();
            n();
            if (this.q) {
                ad();
                return;
            }
            return;
        }
        if (i == 80) {
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "WEAR_INFO_NOT_PLACED ");
            n();
            if (this.q) {
                ad();
                return;
            }
            return;
        }
        if (i == 90) {
            if (message.obj != null && (message.obj instanceof String)) {
                String str = (String) message.obj;
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "deviceType : ", str);
                h(str);
            } else {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "wrong msg.obj");
            }
            LogUtil.a("PluginDevice_AddDeviceChildActivity", "WEAR_START_INDEX success.");
            return;
        }
        LogUtil.a("PluginDevice_AddDeviceChildActivity", "handleMoreWearInfo default");
    }

    private void ad() {
        CustomTextAlertDialog customTextAlertDialog = this.m;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
            builder.a(R.string.IDS_service_area_notice_title).b(R.string.IDS_device_device_list_update_failed).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AddDeviceChildActivity.this.m != null) {
                        AddDeviceChildActivity.this.m.dismiss();
                        AddDeviceChildActivity.this.m = null;
                    }
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            this.m = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.m.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        CustomTextAlertDialog customTextAlertDialog = this.o;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
            builder.a(R.string.IDS_service_area_notice_title).b(R.string.IDS_device_download_resoure_tip_content_message_new).a(R.string.IDS_hwh_open_service_pop_up_notification_agree, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(AddDeviceChildActivity.this);
                    deviceCloudSharePreferencesManager.c("is_down_device", true);
                    deviceCloudSharePreferencesManager.b("is_download_device_time", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
                    if ("device_download_dialog".equals(str)) {
                        ResourceManager.c().i();
                    } else if ("single_device_download_dialog".equals(str)) {
                        ResourceManager.c().b((ArrayList<String>) null);
                    } else {
                        LogUtil.a("PluginDevice_AddDeviceChildActivity", "unknown action");
                    }
                    AddDeviceChildActivity.this.o.dismiss();
                    AddDeviceChildActivity.this.o = null;
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(AddDeviceChildActivity.this);
                    deviceCloudSharePreferencesManager.c("is_down_device", false);
                    deviceCloudSharePreferencesManager.b("is_download_device_time", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
                    AddDeviceChildActivity.this.o.dismiss();
                    AddDeviceChildActivity.this.o = null;
                    AddDeviceChildActivity.this.finish();
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            this.o = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.o.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(this.d.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("PluginDevice_AddDeviceChildActivity", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.aa < 1000) {
            return true;
        }
        this.aa = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String str2) {
        HashMap map = new HashMap(16);
        map.put("deviceType", this.i);
        String[] strArrSplit = str2.split(Constants.LINK);
        if (strArrSplit.length > 0) {
            map.put(ContentResource.FILE_NAME, strArrSplit[strArrSplit.length - 1]);
        } else {
            map.put(ContentResource.FILE_NAME, str2);
        }
        map.put("errorCode", Integer.valueOf(i));
        lmf.d().c(this.d, str, map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(str, linkedHashMap);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
