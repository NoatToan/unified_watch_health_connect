package com.huawei.ui.device.activity.agreement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.eey;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.pee;
import defpackage.pig;
import defpackage.pis;
import defpackage.piu;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qug;
import defpackage.quh;
import defpackage.rbf;
import defpackage.rbg;
import defpackage.rbq;
import defpackage.rbr;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class AgreementDeclarationActivity extends BaseActivity implements View.OnClickListener {
    public static volatile boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f24179a;
    private HealthTextView aa;
    private HealthTextView ad;
    private Context f;
    private CustomTextAlertDialog.Builder g;
    private HealthCheckBox h;
    private String i;
    private CustomProgressDialog j;
    private List<rbq> k;
    private String l;
    private DeviceCapability m;
    private DeviceInfo n;
    private CustomProgressDialog.Builder o;
    private String q;
    private String r;
    private CustomTextAlertDialog s;
    private CustomTextAlertDialog t;
    private String u;
    private CustomTextAlertDialog v;
    private String w;
    private Handler x = new e(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24181c = false;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24180b = false;
    private int ab = -1;
    private final BroadcastReceiver y = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("AgreementDeclarationActivity", "mProcessLocalBroadcastReceiver intent is null");
                return;
            }
            if ("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS".equals(intent.getAction())) {
                AgreementDeclarationActivity.this.e(intent.getIntExtra("progress", -1));
            } else {
                if ("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE".equals(intent.getAction())) {
                    AgreementDeclarationActivity.this.e();
                    AgreementDeclarationActivity.this.u();
                    AgreementDeclarationActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AgreementDeclarationActivity.this.e = false;
                            AgreementDeclarationActivity.this.f();
                            AgreementDeclarationActivity.this.i();
                        }
                    });
                    return;
                }
                LogUtil.j("AgreementDeclarationActivity", "mProcessLocalBroadcastReceiver()  intent : ", intent.getAction());
            }
        }
    };
    private BroadcastReceiver p = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("AgreementDeclarationActivity", "intent or action is null");
                return;
            }
            if ("broadcast_receiver_user_setting".equals(intent.getAction())) {
                LogUtil.a("AgreementDeclarationActivity", "onReceive broadcast_receiver_user_setting");
                AgreementDeclarationActivity.this.x.removeMessages(1);
                AgreementDeclarationActivity.this.finish();
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                DeviceInfo deviceInfoC = qug.c(AgreementDeclarationActivity.this.l, intent);
                if (deviceInfoC != null) {
                    if (TextUtils.isEmpty(AgreementDeclarationActivity.this.l) || !AgreementDeclarationActivity.this.l.equals(deviceInfoC.getDeviceIdentify())) {
                        LogUtil.j("AgreementDeclarationActivity", "This broadcast is not sent by the current device");
                        return;
                    }
                    int deviceConnectState = deviceInfoC.getDeviceConnectState();
                    if (deviceConnectState == 4 || deviceConnectState == 3) {
                        if (AgreementDeclarationActivity.this.f24180b) {
                            AgreementDeclarationActivity.this.a(-1);
                            return;
                        } else {
                            AgreementDeclarationActivity.this.a(-2);
                            return;
                        }
                    }
                    if (deviceConnectState == 2) {
                        LogUtil.a("AgreementDeclarationActivity", "onReceive connected");
                        AgreementDeclarationActivity.this.a(deviceInfoC);
                        return;
                    } else {
                        LogUtil.j("AgreementDeclarationActivity", "onReceive change else");
                        return;
                    }
                }
                LogUtil.j("AgreementDeclarationActivity", "get deviceInfo error");
                return;
            }
            LogUtil.a("AgreementDeclarationActivity", "onReceive else branch");
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 112);
        LogUtil.a("AgreementDeclarationActivity", "startConnectEarphoneProcess. isSupportEarPhone: ", Boolean.valueOf(zD));
        if (zD && !"1".equals(this.w)) {
            LogUtil.a("AgreementDeclarationActivity", "startConnectEarphoneProcess. in");
            BroadcastManagerUtil.e(this.f, new Intent("com.huawei.health.pair_earphone"));
        }
        finish();
    }

    static class e extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<AgreementDeclarationActivity> f24190c;

        e(AgreementDeclarationActivity agreementDeclarationActivity) {
            this.f24190c = new WeakReference<>(agreementDeclarationActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AgreementDeclarationActivity agreementDeclarationActivity = this.f24190c.get();
            if (agreementDeclarationActivity == null) {
                LogUtil.j("AgreementDeclarationActivity", "handleMessage activity is null");
                return;
            }
            if (message.what == 1) {
                qug.d(agreementDeclarationActivity.q, 2, 2);
                agreementDeclarationActivity.f24180b = true;
                agreementDeclarationActivity.a(-1);
                LogUtil.a("AgreementDeclarationActivity", "handleMessage pair time out");
                xjt.l("oobe is time out");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("AgreementDeclarationActivity", "AgreementDeclarationActivity onCreate() ");
        this.f = this;
        g();
        k();
        i();
        IntentFilter intentFilter = new IntentFilter("broadcast_receiver_user_setting");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.f, this.p, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void k() {
        ReleaseLogUtil.d("R_AgreementDeclarationActivity", "sendOobeStatus: ", Boolean.valueOf(lvb.e().b("oobeCreated", this.n, 0, null)));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Handler handler = this.x;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Handler handler = this.x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rdp.e(this.l);
        d = false;
        this.w = null;
        BroadcastReceiver broadcastReceiver = this.p;
        if (broadcastReceiver != null) {
            BroadcastManagerUtil.d(this.f, broadcastReceiver);
        }
        CustomTextAlertDialog customTextAlertDialog = this.v;
        if (customTextAlertDialog != null) {
            if (customTextAlertDialog.isShowing()) {
                this.v.dismiss();
            }
            this.v = null;
        }
        CustomProgressDialog customProgressDialog = this.j;
        if (customProgressDialog != null) {
            if (customProgressDialog.isShowing()) {
                this.j.dismiss();
            }
            this.j = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        CustomTextAlertDialog customTextAlertDialog2 = this.t;
        if (customTextAlertDialog2 != null) {
            if (customTextAlertDialog2.isShowing()) {
                this.t.dismiss();
            }
            this.t = null;
        }
        CustomTextAlertDialog customTextAlertDialog3 = this.s;
        if (customTextAlertDialog3 != null) {
            if (customTextAlertDialog3.isShowing()) {
                this.s.dismiss();
            }
            this.s = null;
        }
    }

    private void g() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("AgreementDeclarationActivity", "initData intent is null");
            return;
        }
        this.l = intent.getStringExtra("pairGuideSelectAddress");
        this.i = intent.getStringExtra("device_country_code");
        this.w = intent.getStringExtra("firstPair");
        this.r = intent.getStringExtra("device_emui_version");
        if (intent.getExtras() != null) {
            this.n = (DeviceInfo) intent.getExtras().getParcelable("deviceInfo");
        }
        DeviceInfo deviceInfo = this.n;
        if (deviceInfo == null) {
            LogUtil.j("AgreementDeclarationActivity", "mDeviceInfo is null");
            return;
        }
        this.q = deviceInfo.getDeviceName();
        if (TextUtils.isEmpty(this.r)) {
            xjt.l("oobe emuiVersion is empty");
            a(-3);
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String strJ = lvi.j(this.n.getProductType());
        String pluginIndexOobe = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginIndexOobe(strJ);
        this.u = pluginIndexOobe;
        LogUtil.a("AgreementDeclarationActivity", " mOobeid1 is : ", pluginIndexOobe, "   ", strJ);
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "AgreementDeclarationActivity");
        if (mapD == null) {
            LogUtil.j("AgreementDeclarationActivity", "filter deviceCapabilityMap is null");
            return;
        }
        DeviceCapability deviceCapability = mapD.get(this.l);
        if (deviceCapability != null) {
            int smartWatchVersionTypeValue = deviceCapability.getSmartWatchVersionTypeValue();
            LogUtil.a("AgreementDeclarationActivity", "smartWatchVersion:", Integer.valueOf(smartWatchVersionTypeValue));
            qug.e(smartWatchVersionTypeValue, this.u);
        }
        LogUtil.a("AgreementDeclarationActivity", "basic:", Integer.valueOf(qug.a().length));
        String[] strArrA = qug.a();
        this.f24179a = strArrA;
        if (strArrA.length == 0) {
            xjt.l("get oobe resource error");
            a(false);
        }
        this.k = new ArrayList(this.f24179a.length + 1);
        List<String> listC = c();
        a(listC);
        ArrayList arrayList = new ArrayList(0);
        for (String str : listC) {
            rbq rbqVarA = qug.a(str, this.r);
            if (!TextUtils.isEmpty(rbqVarA.a())) {
                rbr rbrVarO = rbqVarA.o();
                if (rbrVarO != null) {
                    rbrVarO.a(true);
                }
                arrayList.add(rbqVarA);
            } else {
                LogUtil.j("AgreementDeclarationActivity", "featureId: ", str);
            }
        }
        if (arrayList.isEmpty()) {
            LogUtil.j("AgreementDeclarationActivity", "tempDeclarationList is empty");
            xjt.l("oobe info is empty");
            a(true);
            return;
        }
        this.k.addAll(arrayList);
    }

    private void a(boolean z) {
        LogUtil.e("AgreementDeclarationActivity", "enter reportShowException", "deviceId:", this.l, "emuiVersion:", this.r, "isHasResources:", Boolean.valueOf(z));
        rdt.b(this.l, this.r, z);
        if (this.e) {
            return;
        }
        LogUtil.j("AgreementDeclarationActivity", "showDownloadRetryDialog");
        this.e = true;
        t();
    }

    private List<String> c() {
        ArrayList arrayList = new ArrayList(this.f24179a.length);
        Collections.addAll(arrayList, this.f24179a);
        return arrayList;
    }

    private void a(List<String> list) {
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "AgreementDeclarationActivity");
        if (mapD == null) {
            LogUtil.j("AgreementDeclarationActivity", "filter deviceCapabilityMap is null");
            return;
        }
        DeviceCapability deviceCapability = mapD.get(this.l);
        this.m = deviceCapability;
        if (deviceCapability != null) {
            LogUtil.a("AgreementDeclarationActivity", "DEVICE_TYPE", Integer.valueOf(deviceCapability.getSmartWatchVersionTypeValue()));
            int smartWatchVersionTypeValue = this.m.getSmartWatchVersionTypeValue();
            if (smartWatchVersionTypeValue == 0) {
                this.f24181c = false;
                return;
            }
            if (smartWatchVersionTypeValue == 1) {
                list.remove("operator_service_statement");
                this.f24181c = false;
                return;
            } else if (smartWatchVersionTypeValue == 2) {
                list.remove("huawei_mobile_service_statement");
                this.f24181c = true;
                return;
            } else {
                if (smartWatchVersionTypeValue == 3) {
                    list.remove("huawei_mobile_service_statement");
                    list.remove("operator_service_statement");
                    this.f24181c = true;
                    return;
                }
                LogUtil.a("AgreementDeclarationActivity", "in default branch");
                return;
            }
        }
        LogUtil.a("AgreementDeclarationActivity", "declaration deviceCapability is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        setContentView(R.layout.activity_agreement_declaration);
        View viewA = qsp.a(this, R.id.statusbar);
        RelativeLayout.LayoutParams layoutParamsU = qrs.u(this.f);
        if (viewA != null) {
            viewA.setLayoutParams(layoutParamsU);
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.agreement_declaration_text_view_back);
        this.ad = healthTextView;
        if (healthTextView != null) {
            healthTextView.setOnClickListener(this);
        }
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(this, R.id.agreement_declaration_text_view_next);
        this.aa = healthTextView2;
        if (healthTextView2 != null) {
            healthTextView2.setOnClickListener(this);
        }
        HealthCheckBox healthCheckBox = (HealthCheckBox) qsp.a(this, R.id.cb_checkbox);
        this.h = healthCheckBox;
        if (healthCheckBox != null) {
            healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AgreementDeclarationActivity.this.c(z);
                }
            });
            c(this.h.isChecked());
        }
        ListView listView = (ListView) qsp.a(this, R.id.list_view_content);
        List<rbg> listE = new rbf().e(this.k);
        e(listE);
        DeviceInfo deviceInfo = this.n;
        if (deviceInfo != null) {
            this.ab = deviceInfo.getProductType();
        }
        DeclarationAdapter declarationAdapter = new DeclarationAdapter(this, listE, this.ab);
        if (listView != null) {
            listView.setAdapter((ListAdapter) declarationAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.agreement_declaration_text_view_next);
        this.aa = healthTextView;
        if (healthTextView != null) {
            healthTextView.setEnabled(z);
            if (z) {
                this.aa.setAlpha(1.0f);
                return;
            }
            TypedValue typedValue = new TypedValue();
            getResources().getValue(R.dimen.emui_disabled_alpha, typedValue, true);
            this.aa.setAlpha(typedValue.getFloat());
        }
    }

    private void e(List<rbg> list) {
        rbg rbgVar = new rbg();
        rbgVar.a(0);
        rbgVar.h(this.f.getResources().getString(R.string.IDS_startup_agreements_and_statements));
        list.add(0, rbgVar);
    }

    private void l() {
        LogUtil.a("AgreementDeclarationActivity", "next()");
        if (this.f24181c && j()) {
            w();
        } else {
            q();
        }
    }

    private boolean j() {
        rbg rbgVarA = a("hms_statement_head");
        rbg rbgVarA2 = a("hms_statement_body");
        rbg rbgVarA3 = a("hms_auto_update");
        if (rbgVarA == null || rbgVarA2 == null || rbgVarA3 == null) {
            LogUtil.j("AgreementDeclarationActivity", "hms is null");
            return false;
        }
        if (!TextUtils.isEmpty(rbgVarA.c()) && !TextUtils.isEmpty(rbgVarA2.c()) && !TextUtils.isEmpty(rbgVarA3.c())) {
            return true;
        }
        LogUtil.j("AgreementDeclarationActivity", "hms feature id is null");
        return false;
    }

    private rbg a(String str) {
        return new rbf().e(qug.a(str, this.r));
    }

    private void q() {
        if (qug.e().length == 0) {
            quh.d(this.l, new rbf().e(this.k));
            this.aa.setEnabled(false);
            this.ad.setEnabled(false);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) EnhancementImprovementActivity.class);
        if (new rbf().e(this.k) instanceof Serializable) {
            intent.putExtra("declarationBeans", (Serializable) new rbf().e(this.k));
        }
        intent.putExtra("pairGuideSelectAddress", this.l);
        intent.putExtra("device_country_code", this.i);
        intent.putExtra("device_emui_version", this.r);
        intent.putExtra("device_version_type", this.ab);
        intent.putExtra("device_name", this.q);
        startActivity(intent);
    }

    private void w() {
        Intent intent = new Intent(this.f, (Class<?>) AboardHmsDeclarationActivity.class);
        if (new rbf().e(this.k) instanceof Serializable) {
            intent.putExtra("declarationBeans", (Serializable) new rbf().e(this.k));
        }
        intent.putExtra("pairGuideSelectAddress", this.l);
        intent.putExtra("device_country_code", this.i);
        intent.putExtra("device_emui_version", this.r);
        intent.putExtra("device_name", this.q);
        intent.putExtra("device_version_type", this.ab);
        startActivity(intent);
    }

    private void d() {
        qug.d(this.q, 1, 2);
        r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            LogUtil.j("AgreementDeclarationActivity", "onKeyDown event is null");
            return false;
        }
        if (keyEvent.getKeyCode() == 4) {
            LogUtil.a("AgreementDeclarationActivity", "on press back not back");
            d();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.agreement_declaration_text_view_back) {
            d();
            return;
        }
        if (view.getId() == R.id.agreement_declaration_text_view_next) {
            l();
            return;
        }
        CustomTextAlertDialog.Builder builder = this.g;
        if (builder != null && builder.c() == view) {
            a(-3);
            return;
        }
        CustomTextAlertDialog.Builder builder2 = this.g;
        if (builder2 != null && builder2.a() == view) {
            LogUtil.a("AgreementDeclarationActivity", "onClick() the NegativeButton");
        } else {
            LogUtil.a("AgreementDeclarationActivity", "onClick() the else branch");
        }
    }

    private void r() {
        LogUtil.a("AgreementDeclarationActivity", "showExitPairDialog()");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f);
        this.g = builder;
        builder.b(R.string.IDS_startup_wizard_agree);
        this.g.a(R.string.IDS_startup_wizard_quit, this);
        this.g.e(R.string.IDS_startup_wizard_cancel, this);
        CustomTextAlertDialog customTextAlertDialogB = this.g.b();
        this.v = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(true);
        this.v.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("AgreementDeclarationActivity", "enter notify Pair Fail", Integer.valueOf(i));
        Intent intent = new Intent();
        intent.setAction("broadcast_receiver_user_setting");
        intent.putExtra("error_code", i);
        intent.putExtra("pairGuideSelectAddress", this.l);
        BroadcastManagerUtil.a(this.f, intent, LocalBroadcast.f36595c, true);
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.j("AgreementDeclarationActivity", "dispatchTouchEvent event is null");
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.x.removeMessages(1);
            this.x.sendEmptyMessageDelayed(1, 60000L);
            LogUtil.a("AgreementDeclarationActivity", "timeout is reset");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.u);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(arrayList, null);
        LogUtil.a("AgreementDeclarationActivity", "retryDownloadOobeData: ", arrayList);
        p();
        n();
    }

    private void a() {
        LogUtil.a("AgreementDeclarationActivity", "isDeleteSuccess:", Boolean.valueOf(pee.b(pig.c().e(this.u))));
    }

    private void n() {
        LogUtil.a("AgreementDeclarationActivity", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS");
        intentFilter.addAction("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE");
        LocalBroadcastManager.getInstance().registerReceiver(this.y, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.y);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("AgreementDeclarationActivity", "IllegalArgumentException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.2
            @Override // java.lang.Runnable
            public void run() {
                qpx.e(AgreementDeclarationActivity.this.f, R.string.IDS_connect_error);
            }
        });
    }

    private void p() {
        CustomProgressDialog customProgressDialog = this.j;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.j("AgreementDeclarationActivity", "The progress bar already exists");
        } else {
            runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    AgreementDeclarationActivity.this.j = new CustomProgressDialog(AgreementDeclarationActivity.this.f);
                    AgreementDeclarationActivity agreementDeclarationActivity = AgreementDeclarationActivity.this;
                    agreementDeclarationActivity.o = new CustomProgressDialog.Builder(agreementDeclarationActivity.f);
                    AgreementDeclarationActivity.this.o.e(AgreementDeclarationActivity.this.f.getString(R.string.IDS_hw_health_wear_update_device_resource_text)).e(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.3.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.a("AgreementDeclarationActivity", "Click Cancel");
                            AgreementDeclarationActivity.this.h();
                        }
                    });
                    AgreementDeclarationActivity agreementDeclarationActivity2 = AgreementDeclarationActivity.this;
                    agreementDeclarationActivity2.j = agreementDeclarationActivity2.o.c();
                    AgreementDeclarationActivity.this.j.setCanceledOnTouchOutside(false);
                    if (!AgreementDeclarationActivity.this.isFinishing()) {
                        AgreementDeclarationActivity.this.j.show();
                        AgreementDeclarationActivity.this.o.b(0);
                        AgreementDeclarationActivity.this.o.b(UnitUtil.e(0.0d, 2, 0));
                    }
                    LogUtil.a("AgreementDeclarationActivity", "mCustomProgressDialog.show()");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == -1) {
            h();
            u();
            return;
        }
        CustomProgressDialog customProgressDialog = this.j;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || i < 0) {
            return;
        }
        String strE = UnitUtil.e(i, 2, 0);
        this.o.b(i);
        this.o.b(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("AgreementDeclarationActivity", "enter handleCancel");
        pis pisVarE = piu.c().e(this.u);
        if (pisVarE != null) {
            piu.c().a(pisVarE);
        }
        b();
    }

    private void b() {
        e();
        s();
    }

    private void t() {
        CustomTextAlertDialog customTextAlertDialog = this.s;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.6
                @Override // java.lang.Runnable
                public void run() {
                    CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(AgreementDeclarationActivity.this.f);
                    builder.a(R.string.IDS_service_area_notice_title).b(R.string.IDS_no_device_res).a(AgreementDeclarationActivity.this.f.getString(R.string.IDS_settings_button_cancal_ios_btn), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.6.5
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (AgreementDeclarationActivity.this.s != null) {
                                AgreementDeclarationActivity.this.s.dismiss();
                                AgreementDeclarationActivity.this.s = null;
                            }
                            AgreementDeclarationActivity.this.h();
                        }
                    }).a(R.string.IDS_retry, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.6.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (!CommonUtil.ab(BaseApplication.getContext())) {
                                AgreementDeclarationActivity.this.m();
                                return;
                            }
                            if (AgreementDeclarationActivity.this.s != null) {
                                AgreementDeclarationActivity.this.s.dismiss();
                                AgreementDeclarationActivity.this.s = null;
                            }
                            AgreementDeclarationActivity.this.o();
                        }
                    });
                    AgreementDeclarationActivity.this.s = builder.b();
                    AgreementDeclarationActivity.this.s.setCancelable(false);
                    AgreementDeclarationActivity.this.s.show();
                }
            });
        }
    }

    private void s() {
        CustomTextAlertDialog customTextAlertDialog = this.t;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.10
                @Override // java.lang.Runnable
                public void run() {
                    CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(AgreementDeclarationActivity.this.f);
                    builder.a(R.string.IDS_service_area_notice_title).b(R.string.IDS_update_network_abnormal).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity.10.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (AgreementDeclarationActivity.this.t != null) {
                                AgreementDeclarationActivity.this.t.dismiss();
                                AgreementDeclarationActivity.this.t = null;
                                AgreementDeclarationActivity.this.a(-3);
                            }
                        }
                    });
                    AgreementDeclarationActivity.this.t = builder.b();
                    AgreementDeclarationActivity.this.t.setCancelable(false);
                    AgreementDeclarationActivity.this.t.show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("AgreementDeclarationActivity", "enter closeProgress");
        CustomProgressDialog customProgressDialog = this.j;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || isFinishing()) {
            return;
        }
        this.j.cancel();
        LogUtil.j("AgreementDeclarationActivity", "enter closeProgress cancel");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
