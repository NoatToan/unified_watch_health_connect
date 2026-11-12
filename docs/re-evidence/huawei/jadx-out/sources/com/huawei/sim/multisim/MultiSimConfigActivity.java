package com.huawei.sim.multisim;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.multisimservice.model.SimInfo;
import com.huawei.operation.utils.Constants;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.eej;
import defpackage.lmf;
import defpackage.lsg;
import defpackage.npz;
import defpackage.obk;
import defpackage.obp;
import defpackage.obq;
import defpackage.obs;
import defpackage.ocg;
import defpackage.ocr;
import defpackage.pwo;
import defpackage.pwp;
import defpackage.pwq;
import defpackage.pxi;
import defpackage.pxk;
import defpackage.pxl;
import defpackage.xjt;
import health.compact.a.Base64;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class MultiSimConfigActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f23094b = {"android.permission.READ_PHONE_STATE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23095a;
    private LinearLayout aa;
    private LinearLayout ab;
    private LinearLayout ac;
    private LinearLayout ad;
    private ocr af;
    private b ah;
    private pwp ai;
    private HealthButton al;
    private View ao;
    private View aq;
    private HealthButton ar;
    private HealthProgressBar as;
    private int at;
    private HealthButton au;
    private HealthTextView av;
    private HealthButton aw;
    private Animation e;
    private HealthButton h;
    private Context i;
    private CustomTextAlertDialog k;
    private CustomViewDialog m;
    private HealthTextView n;
    private HealthButton t;
    private LinearLayout u;
    private LinearLayout v;
    private LinearLayout w;
    private LinearLayout x;
    private LinearLayout y;
    private LinearLayout z;
    private String q = "";
    private String ak = "";
    private int aj = 0;
    private int j = 0;
    private int o = 0;
    private CommonDialog21 ap = null;
    private MultiSimDeviceInfo l = new MultiSimDeviceInfo();
    private String ae = "";
    private String ag = "";
    private boolean s = false;
    private boolean p = false;
    private final int r = 120000;
    private String f = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23096c = false;
    private final BroadcastReceiver am = new BroadcastReceiver() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("MultiSimConfigActivity", "intent is null or action is null");
                xjt.q("intent is null or action is null.");
                return;
            }
            LogUtil.a("MultiSimConfigActivity", "connectedChanged mNonLocalBroadcastReceiver(), intent = ", intent.getAction());
            try {
                if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("ss");
                    if (stringExtra == null) {
                        LogUtil.j("MultiSimConfigActivity", "simState is null");
                        xjt.q("simState is null");
                        return;
                    }
                    LogUtil.a("MultiSimConfigActivity", "connectedChanged simState = ", stringExtra);
                    if ("UNKNOWN".equals(stringExtra)) {
                        xjt.q("connectedChanged simState = UNKNOWN");
                        MultiSimConfigActivity.this.finish();
                        return;
                    }
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || pxk.c(intent)) {
                        MultiSimConfigActivity.this.ah.sendEmptyMessage(1);
                    } else {
                        LogUtil.j("MultiSimConfigActivity", "mNonLocalBroadcastReceiver is device not support current function");
                        xjt.q("mNonLocalBroadcastReceiver is device not support current function");
                    }
                }
            } catch (Exception e) {
                LogUtil.e("MultiSimConfigActivity", "mNonLocalBroadcastReceiver is Exception");
                xjt.q("mNonLocalBroadcastReceiver is Exception :" + e.getMessage());
            }
        }
    };
    private View.OnClickListener d = new View.OnClickListener() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.6
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new Handler().post(new Runnable() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.6.5
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.d("MultiSimConfigActivity", "bt reconnect");
                    pxk.n(MultiSimConfigActivity.this);
                }
            });
        }
    };
    private ClickableSpan g = new ClickableSpan() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.8
        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            MultiSimConfigActivity.this.k();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(MultiSimConfigActivity.this.getResources().getColor(R.color.IDS_plugin_sim_main_btn_color));
        }
    };
    private View.OnClickListener an = new View.OnClickListener() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.9
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new Handler().post(new Runnable() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.9.5
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.d("MultiSimConfigActivity", "network setting");
                    pxk.g(MultiSimConfigActivity.this.i);
                }
            });
        }
    };

    private boolean e(int i) {
        if (i == 99) {
            return true;
        }
        return i >= 300 && i <= 599;
    }

    public void e() {
        LogUtil.a("MultiSimConfigActivity", "initSdk");
        ocr ocrVar = new ocr();
        this.af = ocrVar;
        if (this.f23095a) {
            this.af.a(this.i, this.ai, new String(Base64.b("MENBM0RBMzQ5QUExQ0I2OA=="), StandardCharsets.UTF_8), new String(Base64.b("MDZFMUJDMjgwRDFDQ0RCMTFCQjczNEZGREU3QUIyNkYwMzc0QkZFNTY2NUU2MkU4MjZDQzA1N0MwN0IyN0Q2OA=="), StandardCharsets.UTF_8));
            return;
        }
        ocrVar.e(this.i);
    }

    public void a() {
        LogUtil.a("MultiSimConfigActivity", "finishSdk");
        ocr ocrVar = this.af;
        if (ocrVar != null) {
            ocrVar.d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("MultiSimConfigActivity", "onCreate");
        this.i = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.q = intent.getStringExtra("simImsi");
            this.at = intent.getIntExtra("MultiSimSlotId", 0);
            this.f23096c = intent.getBooleanExtra("esimIsActivated", false);
            this.f = intent.getStringExtra("activatedAccode");
        }
        this.ah = new b(this);
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null) {
            this.f23095a = deviceCapabilityC.isSupportNewEsim();
        }
        u();
        n();
        e();
        ac();
        LogUtil.a("MultiSimConfigActivity", "esimIsActivated = " + this.f23096c);
        if (this.f23096c) {
            b();
        }
        q();
        if (lsg.d(this.i, f23094b)) {
            return;
        }
        LogUtil.j("MultiSimConfigActivity", "no permission need to request");
        lsg.a(this, f23094b, new PermissionsResultAction() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.10
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.d("MultiSimConfigActivity", "onGranted");
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.d("MultiSimConfigActivity", "onDenied");
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "MultiSimConfigActivity", "IS_ESIM_START_FIRST");
        LogUtil.a("MultiSimConfigActivity", "sharedPreference = ", strE);
        if (!TextUtils.isEmpty(strE)) {
            this.au.setText(this.i.getString(R.string.IDS_plugin_multi_sim_continue));
        }
        t();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("MultiSimConfigActivity", "onDestroy");
        a();
        r();
        b bVar = this.ah;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
        }
        HealthProgressBar healthProgressBar = this.as;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(8);
        }
        af();
    }

    private void q() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
        BroadcastManagerUtil.c(this, this.am, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void af() {
        try {
            LogUtil.a("MultiSimConfigActivity", "Enter unregisterNonLocalBroadcast()!");
            unregisterReceiver(this.am);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("MultiSimConfigActivity", "unregisterBroadcast IllegalArgumentException");
        } catch (RuntimeException unused2) {
            LogUtil.e("MultiSimConfigActivity", "unregisterBroadcast RuntimeException");
        }
    }

    private void n() {
        setContentView(R.layout.activity_multi_sim_config);
        this.aa = (LinearLayout) findViewById(R.id.multi_sim_config_open_error);
        this.ab = (LinearLayout) findViewById(R.id.multi_sim_config_query_error);
        this.ad = (LinearLayout) findViewById(R.id.multi_sim_config_unbind);
        this.x = (LinearLayout) findViewById(R.id.multi_sim_config_fail);
        this.ac = (LinearLayout) findViewById(R.id.multi_sim_config_waiting);
        this.z = (LinearLayout) findViewById(R.id.multi_sim_config_start);
        HealthButton healthButton = (HealthButton) findViewById(R.id.multi_sim_cinfig_btn_start);
        this.au = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.multi_sim_config_btn_requery);
        this.ar = healthButton2;
        healthButton2.setOnClickListener(this);
        HealthButton healthButton3 = (HealthButton) findViewById(R.id.multi_sim_config_btn_unbind);
        this.aw = healthButton3;
        healthButton3.setOnClickListener(this);
        HealthButton healthButton4 = (HealthButton) findViewById(R.id.multi_sim_config_btn_fail);
        this.h = healthButton4;
        healthButton4.setOnClickListener(this);
        HealthButton healthButton5 = (HealthButton) findViewById(R.id.multi_sim_config_btn_confirm);
        this.al = healthButton5;
        healthButton5.setOnClickListener(this);
        HealthButton healthButton6 = (HealthButton) findViewById(R.id.multi_sim_cinfig_btn_download);
        this.t = healthButton6;
        healthButton6.setOnClickListener(this);
        this.v = (LinearLayout) findViewById(R.id.network_error_bar);
        this.y = (LinearLayout) findViewById(R.id.no_sim_err_bar);
        this.w = (LinearLayout) findViewById(R.id.bt_disconnect);
        this.u = (LinearLayout) findViewById(R.id.bt_connecting);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.network_err_text);
        this.av = healthTextView;
        healthTextView.setOnClickListener(this);
        View viewFindViewById = findViewById(R.id.set_bt_reconnect);
        this.ao = viewFindViewById;
        viewFindViewById.setOnClickListener(this.d);
        View viewFindViewById2 = findViewById(R.id.set_network_error);
        this.aq = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this.an);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("MultiSimConfigActivity", "view is null");
            return;
        }
        int id = view.getId();
        LogUtil.a("MultiSimConfigActivity", "onclick view:", Integer.valueOf(id));
        if (id == R.id.multi_sim_cinfig_btn_download) {
            npz.b().e("LPA:1$esim.yhdzd.chinamobile.com:8015$", (IBaseResponseCallback) null, (IBaseResponseCallback) null);
            return;
        }
        if (id == R.id.multi_sim_cinfig_btn_start) {
            SharedPreferenceManager.e(BaseApplication.getContext(), "MultiSimConfigActivity", "IS_ESIM_START_FIRST", "hasclicked", null);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MULTISIM_1170004.value(), new HashMap(16), 0);
            l();
            this.aj = 0;
            return;
        }
        if (id == R.id.multi_sim_config_btn_requery) {
            s();
            return;
        }
        if (id == R.id.multi_sim_config_btn_unbind) {
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MULTISIM_1170005.value(), new HashMap(16), 0);
            if (this.f23096c) {
                finish();
            }
            c(this.ae, this.ag, "ES");
            return;
        }
        if (id == R.id.multi_sim_config_btn_fail) {
            if (this.f23096c) {
                finish();
            }
            m();
        } else {
            if (id == R.id.multi_sim_config_btn_confirm) {
                if (this.aj == 2) {
                    m();
                    return;
                } else {
                    finish();
                    return;
                }
            }
            if (id != R.id.network_err_text) {
                LogUtil.j("MultiSimConfigActivity", "unknown view");
                return;
            }
            this.ah.sendEmptyMessageDelayed(1, 2000L);
            w();
            this.u.setVisibility(0);
            this.e = AnimationUtils.loadAnimation(this, R.anim.bt_connecting);
            ((ImageView) findViewById(R.id.bt_connecting_imgage)).startAnimation(this.e);
        }
    }

    private void ab() {
        if (this.ap == null && !isFinishing()) {
            LogUtil.a("MultiSimConfigActivity", "no dialog");
            new CommonDialog21(this, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.ap = commonDialog21B;
            commonDialog21B.b(this.i.getString(R.string.IDS_plugin_sim_esim_handling));
            this.ap.c();
            return;
        }
        LogUtil.j("MultiSimConfigActivity", "showLoadingDialog have dialog");
    }

    private void j() {
        LogUtil.a("MultiSimConfigActivity", "enter dismissLoadingDialog()");
        CommonDialog21 commonDialog21 = this.ap;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("MultiSimConfigActivity", "dismiss Dialog!");
        if (isFinishing()) {
            return;
        }
        this.ap.dismiss();
        this.ap = null;
    }

    private void d(SpannableString spannableString) {
        View viewInflate = View.inflate(this.i, R.layout.layout_esim_dialog_text, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.esim_tips_content);
        this.n = healthTextView;
        healthTextView.setText(spannableString);
        this.n.setMovementMethod(LinkMovementMethod.getInstance());
        this.n.setVisibility(0);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.i);
        builder.a(this.i.getString(R.string.IDS_plugin_multi_sim_note)).d(viewInflate).a(this.i.getString(R.string.IDS_plugin_multi_sim_known).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("MultiSimConfigActivity", "user choose cancel");
                if (MultiSimConfigActivity.this.m != null) {
                    MultiSimConfigActivity.this.m.dismiss();
                }
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.m = customViewDialogD;
        customViewDialogD.show();
    }

    private void a(String str) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.i);
        builder.e(this.i.getString(R.string.IDS_plugin_multi_sim_note));
        builder.a(str);
        builder.b(this.i.getString(R.string.IDS_plugin_multi_sim_known), new View.OnClickListener() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("MultiSimConfigActivity", "user choose cancel");
                if (MultiSimConfigActivity.this.k != null) {
                    MultiSimConfigActivity.this.k.dismiss();
                }
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.k = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.k.isShowing()) {
            return;
        }
        this.k.show();
    }

    private void b(obp obpVar) {
        LogUtil.a("MultiSimConfigActivity", "refreshOpenMultiSimResult");
        r();
        if (obpVar == null) {
            LogUtil.j("MultiSimConfigActivity", "refreshOpenMultiSimResult result is null");
            a(getString(R.string.IDS_plugin_multi_sim_open_fail), getString(R.string.IDS_plugin_multi_sim_open_result_query_fail_notic));
            return;
        }
        ReleaseLogUtil.d("DEVMGR_MultiSimConfigActivity", "refreshOpenMultiSimResult result action = ", Integer.valueOf(obpVar.d()), " result = ", Integer.valueOf(obpVar.a()), " reason = ", Integer.valueOf(obpVar.e()));
        if (obpVar.a() == 0) {
            ocg ocgVarC = obpVar.c();
            c(ocgVarC.b(), ocgVarC.a(), "WS");
            return;
        }
        if (obpVar.a() == 2) {
            LogUtil.a("MultiSimConfigActivity", "operation is processing and do nothing");
            return;
        }
        if (obpVar.e() == 1004) {
            a(a(this.aj), getString(R.string.IDS_plugin_multi_sim_server_error));
            return;
        }
        if (obpVar.e() == 0) {
            c(getString(R.string.IDS_plugin_multi_sim_open_result_query_fail), getString(R.string.IDS_plugin_multi_sim_open_result_query_fail_notic));
            return;
        }
        if (obpVar.e() == 2007) {
            a(getString(R.string.IDS_plugin_multi_sim_open_fail), getString(R.string.IDS_plugin_multi_sim_unsupport_sim_card));
        } else if (e(obpVar.e())) {
            a(a(this.aj), getString(R.string.IDS_plugin_multi_sim_server_error));
        } else {
            c(getString(R.string.IDS_plugin_multi_sim_open_fail), obpVar.e());
        }
    }

    private int d(ArrayList<obq> arrayList) {
        if (arrayList == null) {
            LogUtil.j("MultiSimConfigActivity", "getCurrentBindStatus pairedDeviceList is null");
            return 0;
        }
        int i = 0;
        for (obq obqVar : arrayList) {
            if (obqVar.b().equals(this.l.getEID())) {
                String strC = obqVar.c();
                if (TextUtils.isEmpty(strC)) {
                    this.f = "LPA:1$esim.yhdzd.chinamobile.com:8015$";
                } else {
                    String str = "LPA:1$" + strC + SampleEvent.SEPARATOR;
                    if (strC.startsWith("LPA:1$")) {
                        str = strC;
                    }
                    this.f = str;
                }
                LogUtil.d("MultiSimConfigActivity", "mCmccAcCode=", this.f, " serverAddress=", strC);
                pxk.e("", false);
                Iterator<SimInfo> it = this.l.getSimInfoList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = 4;
                        break;
                    }
                    SimInfo next = it.next();
                    LogUtil.a("MultiSimConfigActivity", "getCurrentBindStatus sim iccid=", next.getICCID());
                    if (obqVar.d().equals(next.getICCID())) {
                        i = 1;
                        break;
                    }
                }
            }
        }
        return i;
    }

    private int c(obp obpVar) {
        obk obkVarB = obpVar.b();
        if (obkVarB == null) {
            return 2;
        }
        if (obpVar.e() == 1502) {
            return 0;
        }
        if (obpVar.e() == 2008) {
            return 4;
        }
        ArrayList<obq> arrayListB = obkVarB.b();
        obs obsVarD = obkVarB.d();
        if (obsVarD != null) {
            this.ak = obsVarD.e();
        } else {
            LogUtil.j("MultiSimConfigActivity", "refreshQueryMultiSimRet result PrimaryDevice is null");
        }
        return d(arrayListB);
    }

    private void e(obp obpVar) {
        ReleaseLogUtil.d("DEVMGR_MultiSimConfigActivity", "refreshQueryMultiSimResult result=", obpVar);
        r();
        if (obpVar == null) {
            LogUtil.j("MultiSimConfigActivity", "refreshQueryMultiSimResult result is null");
            c((String) null, getString(R.string.IDS_plugin_multi_sim_open_result_query_fail));
            return;
        }
        LogUtil.a("MultiSimConfigActivity", "refreshQueryMultiSimResult result action = ", Integer.valueOf(obpVar.d()), " result = ", Integer.valueOf(obpVar.a()), " reason = ", Integer.valueOf(obpVar.e()));
        if (obpVar.a() == 0 || obpVar.e() == 1500 || obpVar.e() == 1501 || obpVar.e() == 1502) {
            int iC = c(obpVar);
            ocg ocgVarC = obpVar.c();
            this.ae = ocgVarC.d();
            String strC = ocgVarC.c();
            this.ag = strC;
            LogUtil.a("MultiSimConfigActivity", "refreshQueryMultiSimRet status=", Integer.valueOf(iC), " mManagerUrl=", this.ae, " mManagerPostData=", strC);
            if (iC == 1) {
                m();
                return;
            } else if (iC == 4) {
                b();
                return;
            } else {
                g();
                return;
            }
        }
        if (obpVar.a() == 2) {
            LogUtil.a("MultiSimConfigActivity", "operation is processing and do nothing");
        } else {
            a(a(this.aj), getString(R.string.IDS_plugin_multi_sim_server_error));
        }
    }

    private void d(int i) {
        ReleaseLogUtil.d("DEVMGR_MultiSimConfigActivity", "refreshMultiSimAuthResult result:", Integer.valueOf(i));
        if (i == 1000) {
            if (this.aj == 0) {
                l();
                return;
            } else {
                s();
                return;
            }
        }
        if (i == 98) {
            a(a(3), getString(R.string.IDS_plugin_network_unstable));
            return;
        }
        if (i == 403) {
            e(a(3), 403);
            xjt.q("ERROR_REASON_VOLTE_ERROR");
        } else if (i == -1005) {
            a(a(3), getString(R.string.IDS_phone_version_low_tips1));
            xjt.q("UNSUPPORTED_ANDROID_VERSION_EXCEPTION");
        } else if (i == -1006) {
            a(a(3), getString(R.string.IDS_set_default_card_tips1));
            xjt.q("ONLY_PRIMARY_CARD_EXCEPTION");
        } else {
            e(a(3), 99);
            xjt.q("ERROR_REASON_SERVER_ERROR");
        }
    }

    private String a(int i) {
        if (i == 2) {
            return getString(R.string.IDS_plugin_multi_sim_unbind_fail);
        }
        if (i == 1) {
            return getString(R.string.IDS_plugin_multi_sim_query_fail);
        }
        if (i == 3) {
            return getString(R.string.IDS_plugin_multi_sim_verify_failed);
        }
        return getString(R.string.IDS_plugin_multi_sim_open_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        b bVar = this.ah;
        if (bVar == null || !bVar.hasMessages(i)) {
            return;
        }
        this.ah.removeMessages(i);
    }

    static class b extends Handler {
        WeakReference<MultiSimConfigActivity> d;

        b(MultiSimConfigActivity multiSimConfigActivity) {
            this.d = new WeakReference<>(multiSimConfigActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("MultiSimConfigActivity", "handleMessage message is null");
                xjt.q("handleMessage message is null");
                return;
            }
            super.handleMessage(message);
            MultiSimConfigActivity multiSimConfigActivity = this.d.get();
            if (multiSimConfigActivity == null) {
                LogUtil.j("MultiSimConfigActivity", "handleMessage activity is null");
                xjt.q("handleMessage activity is null");
            } else {
                LogUtil.a("MultiSimConfigActivity", "handleMessage message:", Integer.valueOf(message.what));
                MultiSimConfigActivity.c(multiSimConfigActivity, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(MultiSimConfigActivity multiSimConfigActivity, Message message) {
        int i = message.what;
        if (i == 1) {
            multiSimConfigActivity.t();
            return;
        }
        if (i == 2) {
            LogUtil.a("MultiSimConfigActivity", "message MULTI_SIM_MSG_OPEN_SUCCESS message:", message);
            if (message.obj instanceof obp) {
                multiSimConfigActivity.b((obp) message.obj);
                return;
            } else {
                LogUtil.j("MultiSimConfigActivity", "message.obj not instanceof MultiSimAsyncResult");
                return;
            }
        }
        if (i == 3) {
            a(multiSimConfigActivity, message);
            return;
        }
        if (i == 8) {
            multiSimConfigActivity.b(8);
            multiSimConfigActivity.ac();
            return;
        }
        if (i == 9) {
            multiSimConfigActivity.r();
            multiSimConfigActivity.c(multiSimConfigActivity.a(multiSimConfigActivity.aj), multiSimConfigActivity.getString(R.string.IDS_plugin_multi_sim_open_result_query_fail_notic));
            return;
        }
        switch (i) {
            case 13:
                multiSimConfigActivity.d(message.arg1);
                break;
            case 14:
                b(multiSimConfigActivity, message);
                break;
            case 15:
                multiSimConfigActivity.b(15);
                multiSimConfigActivity.a(multiSimConfigActivity.getString(R.string.IDS_plugin_multi_sim_query_fail), multiSimConfigActivity.getString(R.string.IDS_plugin_device_info_fail));
                break;
            case 16:
                multiSimConfigActivity.b(16);
                pxi.c("false", "enabled_entry", String.valueOf(16), "china_mobile", "online_ES", pxi.j());
                multiSimConfigActivity.i();
                break;
            default:
                LogUtil.j("MultiSimConfigActivity", "Unknown message");
                break;
        }
    }

    private static void a(MultiSimConfigActivity multiSimConfigActivity, Message message) {
        LogUtil.a("MultiSimConfigActivity", "message MULTI_SIM_MSG_QUERY_RESULT message:", message);
        if (message.obj instanceof obp) {
            multiSimConfigActivity.e((obp) message.obj);
        } else {
            LogUtil.j("MultiSimConfigActivity", "message.obj not instanceof MultiSimAsyncResult");
        }
    }

    private static void b(MultiSimConfigActivity multiSimConfigActivity, Message message) {
        multiSimConfigActivity.b(16);
        if (message.arg1 == 0) {
            multiSimConfigActivity.ac();
            if (pxk.i() && !Utils.o()) {
                pxk.b("", "0");
            }
            npz.b().d(true);
            int i = message.arg1;
            pxi.c("true", "enabled_entry", String.valueOf(i), "china_mobile", "online_ES", pxi.j());
            return;
        }
        npz.b().d(false);
        int i2 = message.arg1;
        pxi.c("false", "enabled_entry", String.valueOf(i2), "china_mobile", "online_ES", pxi.j());
        multiSimConfigActivity.i();
    }

    private void y() {
        LinearLayout linearLayout = this.aa;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.ab;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.ad;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.x;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
        LinearLayout linearLayout5 = this.ac;
        if (linearLayout5 != null) {
            linearLayout5.setVisibility(8);
        }
        HealthProgressBar healthProgressBar = this.as;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(8);
        }
        LinearLayout linearLayout6 = this.z;
        if (linearLayout6 != null) {
            linearLayout6.setVisibility(8);
        }
        j();
    }

    private void ac() {
        LogUtil.a("MultiSimConfigActivity", "btState :", Boolean.valueOf(pxl.c()));
        p();
        LogUtil.a("MultiSimConfigActivity", "mCurrentConnectStatus = ", Integer.valueOf(this.j));
        int i = this.j;
        if (i == 3 || i == 2 || !pxl.c()) {
            if (this.j == 2 || !pxl.c()) {
                a(getString(R.string.IDS_plugin_multi_sim_query_fail), getString(R.string.IDS_plugin_bt_fail));
            }
            if (this.j == 3) {
                a(getString(R.string.IDS_plugin_multi_sim_query_fail), getString(R.string.IDS_plugin_network_fail));
            }
            aa();
            x();
            return;
        }
        LogUtil.a("MultiSimConfigActivity", "mCurrentConnectStatus, startCurrentView");
        String strC = c();
        if (this.j != 0 || !pxk.d(strC)) {
            g();
        } else {
            e(getString(R.string.IDS_plugin_multi_sim_querying), (String) null);
            z();
        }
        p();
    }

    private void z() {
        npz.b().e(new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.14
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("MultiSimConfigActivity", "getMultiSimDevInfo onResponse errorCode :", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof MultiSimDeviceInfo)) {
                    MultiSimConfigActivity.this.ah.sendEmptyMessage(15);
                    return;
                }
                MultiSimConfigActivity.this.l = (MultiSimDeviceInfo) obj;
                LogUtil.a("MultiSimConfigActivity", "getLocalDeviceInfo mDeviceInfo :", MultiSimConfigActivity.this.l);
                MultiSimConfigActivity multiSimConfigActivity = MultiSimConfigActivity.this;
                if (!multiSimConfigActivity.d(multiSimConfigActivity.l)) {
                    MultiSimConfigActivity.this.ah.sendEmptyMessage(15);
                    return;
                }
                MultiSimConfigActivity.this.aj = 1;
                LogUtil.a("MultiSimConfigActivity", "mIsGbaAuth =", Boolean.valueOf(MultiSimConfigActivity.this.p));
                if (!MultiSimConfigActivity.this.p) {
                    MultiSimConfigActivity.this.ae();
                } else {
                    MultiSimConfigActivity.this.s();
                }
            }
        });
    }

    private void w() {
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.y;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.w;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        LinearLayout linearLayout4 = this.u;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
    }

    private void aa() {
        LogUtil.a("MultiSimConfigActivity", "setViewStatusBar status:", Integer.valueOf(this.j));
        int i = this.j;
        if (i == 1) {
            this.y.setVisibility(0);
            return;
        }
        if (i == 2) {
            LinearLayout linearLayout = this.w;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (this.f23095a) {
                this.ao.setVisibility(8);
                return;
            } else {
                this.ao.setVisibility(0);
                return;
            }
        }
        if (i == 3) {
            this.v.setVisibility(0);
        } else if (i == 4) {
            ((HealthTextView) findViewById(R.id.no_sim_err_txt)).setText(getString(R.string.IDS_plugin_multi_sim_error_dev_no_sim));
            this.y.setVisibility(0);
        } else {
            LogUtil.j("MultiSimConfigActivity", "setViewStatusBar ok");
        }
    }

    private void x() {
        if (this.j == 0) {
            int i = this.o;
            if (i == 1) {
                e(this.aw);
                return;
            }
            if (i == 4) {
                e(this.ar);
                return;
            }
            if (i == 9) {
                e(this.au);
                return;
            } else if (i == 10) {
                e(this.h);
                return;
            } else {
                LogUtil.j("MultiSimConfigActivity", "setButtonStatus ok, default view");
                return;
            }
        }
        int i2 = this.o;
        if (i2 == 1) {
            b(this.aw);
            return;
        }
        if (i2 == 4) {
            b(this.ar);
            return;
        }
        if (i2 == 9) {
            b(this.au);
        } else if (i2 == 10) {
            b(this.h);
        } else {
            LogUtil.j("MultiSimConfigActivity", "setButtonStatus default view");
        }
    }

    private void t() {
        LogUtil.a("MultiSimConfigActivity", "refreshViewStatus :", Integer.valueOf(this.o));
        w();
        int i = this.o;
        if (i == 3 || i == 2 || i == 10 || i == 8) {
            return;
        }
        p();
        aa();
        x();
    }

    private boolean o() {
        Object systemService = this.i.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            boolean z = ((TelephonyManager) systemService).getSimState() == 5;
            LogUtil.a("MultiSimConfigActivity", "isSimStatusReady isSimReady:", Boolean.valueOf(z));
            return z;
        }
        LogUtil.j("MultiSimConfigActivity", "object not instanceof TelephonyManager");
        LogUtil.a("MultiSimConfigActivity", "isSimStatusReady isSimReady:", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(MultiSimDeviceInfo multiSimDeviceInfo) {
        return (multiSimDeviceInfo == null || multiSimDeviceInfo.getEID() == null || "".equals(multiSimDeviceInfo.getEID())) ? false : true;
    }

    private void p() {
        if (!o()) {
            this.j = 1;
            return;
        }
        if (!pxl.b(this.i)) {
            this.j = 3;
        } else if (!pxl.c() || !pxl.a(this.i)) {
            this.j = 2;
        } else {
            this.j = 0;
        }
    }

    private void b(HealthButton healthButton) {
        if (healthButton != null) {
            healthButton.setEnabled(false);
            healthButton.setClickable(false);
            healthButton.setFocusable(false);
            healthButton.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_main_btn_disable_color));
        }
    }

    private void e(HealthButton healthButton) {
        if (healthButton != null) {
            healthButton.setEnabled(true);
            healthButton.setClickable(true);
            healthButton.setFocusable(true);
            healthButton.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_main_btn_color));
        }
    }

    private String h() {
        if (TextUtils.isEmpty(this.ak)) {
            this.ak = "";
        }
        return this.ak;
    }

    private void m() {
        LogUtil.a("MultiSimConfigActivity", "initMultiSimUnbindView");
        this.o = 1;
        y();
        this.ad.setVisibility(0);
        t();
        String strH = h();
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_unbind_notice);
        if (healthTextView != null) {
            healthTextView.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_plugin_multi_sim_unbind_info), strH));
        }
    }

    private void g() {
        LogUtil.a("MultiSimConfigActivity", "initMultiSimStartView");
        this.o = 9;
        y();
        this.z.setVisibility(0);
        t();
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_start_tip_tip1);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.multi_sim_start_tip_tip2);
        if (healthTextView != null) {
            healthTextView.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_plugin_multi_device_note_no1), UnitUtil.e(1.0d, 1, 0)));
        }
        if (healthTextView2 != null) {
            healthTextView2.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_plugin_note_no3), UnitUtil.e(2.0d, 1, 0)));
        }
        String string = this.i.getString(R.string.IDS_plugin_multi_device_touch_query);
        String string2 = this.i.getString(R.string.IDS_plugin_multi_device_note_no2, UnitUtil.e(3.0d, 1, 0), string);
        int[] iArr = {string2.indexOf(string)};
        if (iArr[0] == -1) {
            return;
        }
        SpannableString spannableString = new SpannableString(string2);
        ClickableSpan clickableSpan = this.g;
        int i = iArr[0];
        spannableString.setSpan(clickableSpan, i, string.length() + i, 33);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.multi_sim_start_tip_tip3);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.multi_sim_start_tip_tip4);
        if (healthTextView3 != null) {
            healthTextView3.setText(spannableString);
            healthTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (healthTextView4 != null) {
            healthTextView4.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_plugin_note_no4), UnitUtil.e(4.0d, 1, 0)));
        }
    }

    private void e(String str, int i) {
        String string;
        LogUtil.a("MultiSimConfigActivity", "initMultiSimOperationFailView");
        this.o = 3;
        y();
        t();
        this.aa.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_open_error_notice);
        if (healthTextView != null && str != null && !str.isEmpty()) {
            healthTextView.setText(str);
            healthTextView.setVisibility(0);
        }
        String string2 = this.i.getString(R.string.IDS_plugin_multi_sim_open_fail_general_blue_link);
        if (i == 403) {
            string = this.i.getString(R.string.IDS_plugin_no_volte, string2);
        } else {
            string = this.i.getString(R.string.IDS_plugin_auth_fail, string2);
        }
        int[] iArr = {string.indexOf(string2)};
        if (iArr[0] == -1) {
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        ClickableSpan clickableSpan = this.g;
        int i2 = iArr[0];
        spannableString.setSpan(clickableSpan, i2, string2.length() + i2, 33);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.multi_sim_open_error_tip);
        if (healthTextView2 != null) {
            healthTextView2.setText(spannableString);
            healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            healthTextView2.setVisibility(0);
        }
    }

    private void a(String str, String str2) {
        LogUtil.a("MultiSimConfigActivity", "initMultiSimOperationFailView");
        this.o = 3;
        y();
        t();
        LinearLayout linearLayout = this.aa;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
        LogUtil.a("MultiSimConfigActivity", "mLayoutOpenError VISIBLE ID = " + this.aa.getId());
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_open_error_notice);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.multi_sim_open_error_tip);
        if (str != null && !str.isEmpty() && healthTextView != null) {
            healthTextView.setText(str);
            healthTextView.setVisibility(0);
        }
        if (healthTextView2 != null) {
            if (str2 != null && !str2.isEmpty()) {
                healthTextView2.setText(str2);
                healthTextView2.setVisibility(0);
            } else {
                healthTextView2.setVisibility(8);
            }
        }
    }

    private void c(String str, int i) {
        LogUtil.a("MultiSimConfigActivity", "initMultiSimOperationFailView errorCode", Integer.valueOf(i));
        this.o = 3;
        y();
        t();
        this.aa.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_open_error_notice);
        if (healthTextView != null && str != null && !str.isEmpty()) {
            healthTextView.setText(str);
            healthTextView.setVisibility(0);
        }
        String string = this.i.getString(R.string.IDS_plugin_multi_sim_open_fail_general_blue_link);
        String string2 = this.i.getString(R.string.IDS_plugin_multi_sim_open_fail_general_info, Integer.valueOf(i), string);
        int[] iArr = {string2.indexOf(string)};
        if (iArr[0] == -1) {
            return;
        }
        SpannableString spannableString = new SpannableString(string2);
        ClickableSpan clickableSpan = this.g;
        int i2 = iArr[0];
        spannableString.setSpan(clickableSpan, i2, string.length() + i2, 33);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.multi_sim_open_error_tip);
        if (healthTextView2 != null) {
            healthTextView2.setText(spannableString);
            healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            healthTextView2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("MultiSimConfigActivity", "openMultiSimErrorDetailActivity");
        ThreadPoolManager.c().a("MultiSimConfigActivity", new Runnable() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.15
            @Override // java.lang.Runnable
            public void run() {
                final String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdnNew");
                MultiSimConfigActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.15.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MultiSimConfigActivity.this.i != null) {
                            try {
                                Intent intent = new Intent(MultiSimConfigActivity.this.i, (Class<?>) WebViewActivity.class);
                                if (!MultiSimConfigActivity.this.f23095a) {
                                    if (LanguageUtil.l(MultiSimConfigActivity.this.i)) {
                                        LogUtil.d("MultiSimConfigActivity", "openAppHelpActivity url: ", "/SmartWear/Leo/EMUI8.0/C001B001/zh-CN/content/doub.html?pos=3");
                                        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", url + "/SmartWear/Leo/EMUI8.0/C001B001/zh-CN/content/doub.html?pos=3");
                                    } else {
                                        LogUtil.d("MultiSimConfigActivity", "openAppHelpActivity url: ", "/SmartWear/Leo/EMUI8.0/C001B001/en-US/content/en-us_topic_0209307574.html?pos=3");
                                        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", url + "/SmartWear/Leo/EMUI8.0/C001B001/en-US/content/en-us_topic_0209307574.html?pos=3");
                                    }
                                } else {
                                    intent.putExtra("WebViewActivity.REQUEST_URL_KEY", url + "/hwtips/topic/M005/zh-CN/SF-10190314_f2260.html");
                                }
                                intent.putExtra(Constants.JUMP_MODE_KEY, 0);
                                MultiSimConfigActivity.this.i.startActivity(intent);
                            } catch (ActivityNotFoundException unused) {
                                LogUtil.e("MultiSimConfigActivity", "openMultiSimErrorDetailActivity ActivityNotFoundException");
                            }
                        }
                    }
                });
            }
        });
    }

    private void c(String str, String str2) {
        LogUtil.a("MultiSimConfigActivity", "initMultiSimOpenQueryFailView");
        this.o = 4;
        y();
        t();
        this.ab.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_query_error_notice);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.multi_sim_query_error_tip);
        if (healthTextView != null && str != null && !str.isEmpty()) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
        if (healthTextView2 != null && str2 != null && !str2.isEmpty()) {
            healthTextView2.setVisibility(0);
            healthTextView2.setText(str2);
        }
        t();
    }

    private void e(String str, String str2) {
        LogUtil.a("MultiSimConfigActivity", "initMultiSimWaitingView");
        this.o = 2;
        y();
        t();
        this.ac.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_waiting_info);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.multi_sim_waiting_info_tip);
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        if (healthTextView2 != null && str2 != null && !str2.isEmpty()) {
            healthTextView2.setVisibility(0);
            healthTextView2.setText(str2);
        }
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.multi_sim_waiting_image);
        this.as = healthProgressBar;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(0);
        }
    }

    private void i() {
        LogUtil.a("MultiSimConfigActivity", "initMultiSimConfigFailView");
        this.o = 10;
        y();
        this.x.setVisibility(0);
        String string = this.i.getString(R.string.IDS_plugin_multi_sim_open_fail_general_blue_link);
        String string2 = this.i.getString(R.string.IDS_plugin_eid_download_fail, string);
        int[] iArr = {string2.indexOf(string)};
        if (iArr[0] == -1) {
            return;
        }
        SpannableString spannableString = new SpannableString(string2);
        ClickableSpan clickableSpan = this.g;
        int i = iArr[0];
        spannableString.setSpan(clickableSpan, i, string.length() + i, 33);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.multi_sim_fail_notice);
        if (healthTextView != null) {
            healthTextView.setText(spannableString);
            healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
            healthTextView.setVisibility(0);
        }
        t();
    }

    private void v() {
        b bVar = this.ah;
        if (bVar == null || !bVar.hasMessages(9)) {
            return;
        }
        this.ah.removeMessages(9);
    }

    private void r() {
        LogUtil.a("MultiSimConfigActivity", "removeNotifyMessage");
        v();
    }

    private pwq f() {
        pwq pwqVar = new pwq();
        pwqVar.d(3);
        pwqVar.d(this.l.getEID());
        pwqVar.a(this.l.getProductName());
        pwqVar.e(this.l.getDeviceIMEI());
        return pwqVar;
    }

    private void l() {
        LogUtil.a("MultiSimConfigActivity", "openMultiSim");
        if (!pxk.d(c())) {
            LogUtil.a("MultiSimConfigActivity", "main sim not cmcc");
            String string = this.i.getString(R.string.IDS_main_discovery_tab_service_help);
            String string2 = this.i.getString(R.string.IDS_plugin_multi_device_sim_only_support_china_mobile, string);
            int[] iArr = {string2.indexOf(string)};
            if (iArr[0] == -1) {
                return;
            }
            SpannableString spannableString = new SpannableString(string2);
            ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    MultiSimConfigActivity.this.ad();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(MultiSimConfigActivity.this.getResources().getColor(R.color.IDS_plugin_sim_main_btn_color));
                }
            };
            int i = iArr[0];
            spannableString.setSpan(clickableSpan, i, string.length() + i, 33);
            d(spannableString);
            return;
        }
        if (!d(this.l)) {
            LogUtil.a("MultiSimConfigActivity", "EID of watch is not correct");
            a(getString(R.string.IDS_plugin_eid_get_fail));
            return;
        }
        pwo pwoVar = new pwo();
        pwoVar.b(d());
        this.ah.sendEmptyMessageDelayed(9, 30000L);
        ab();
        LogUtil.a("MultiSimConfigActivity", "openMultiSim primaryDevice");
        this.af.a(pwoVar, f(), this.ah.obtainMessage(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        LogUtil.a("startHelpInstructions enter", new Object[0]);
        ThreadPoolManager.c().a("MultiSimConfigActivity", new Runnable() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.5
            @Override // java.lang.Runnable
            public void run() {
                final String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdnNew");
                MultiSimConfigActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MultiSimConfigActivity.this.i != null) {
                            try {
                                Intent intent = new Intent(MultiSimConfigActivity.this.i, (Class<?>) WebViewActivity.class);
                                if (LanguageUtil.l(MultiSimConfigActivity.this.i)) {
                                    intent.putExtra("WebViewActivity.REQUEST_URL_KEY", url + "/SmartWear/Leo/EMUI8.0/C001B001/zh-CN/content/doub.html?pos=2");
                                } else {
                                    intent.putExtra("WebViewActivity.REQUEST_URL_KEY", url + "/SmartWear/Leo/EMUI8.0/C001B001/en-US/content/en-us_topic_0209307574.html?pos=2");
                                }
                                intent.putExtra("WebViewActivity.TITLE", MultiSimConfigActivity.this.getString(R.string.IDS_plugin_multi_sim_manager_title));
                                MultiSimConfigActivity.this.i.startActivity(intent);
                            } catch (ActivityNotFoundException unused) {
                                LogUtil.e("MultiSimConfigActivity", "startHelpInstructions ActivityNotFoundException");
                            }
                        }
                    }
                });
            }
        });
    }

    public String d() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        SubscriptionManager.from(this.i);
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        Object systemService = this.i.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            TelephonyManager telephonyManagerCreateForSubscriptionId = ((TelephonyManager) systemService).createForSubscriptionId(defaultDataSubscriptionId);
            if (telephonyManagerCreateForSubscriptionId != null) {
                return telephonyManagerCreateForSubscriptionId.getSubscriberId();
            }
            LogUtil.j("MultiSimConfigActivity", "newTelephonyManager is null");
            return "";
        }
        LogUtil.j("MultiSimConfigActivity", "object not instanceof TelephonyManager");
        return "";
    }

    public String c() {
        LogUtil.a("MultiSimConfigActivity", "mImsi = ", this.q);
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        Object systemService = this.i.getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            LogUtil.j("MultiSimConfigActivity", "getDefaultSimCardInfo telephonyManagerObject is not instanceof TelephonyManager");
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (telephonyManager.getSimState() == 1) {
            LogUtil.j("MultiSimConfigActivity", "sim is absent");
            return "";
        }
        String simOperator = telephonyManager.getSimOperator();
        LogUtil.a("MultiSimConfigActivity", "Operator : ", simOperator);
        return simOperator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        LogUtil.a("MultiSimConfigActivity", "startMultiSimAuth");
        this.p = true;
        u();
        this.af.d(this.i, this.ai, this.ah.obtainMessage(13));
    }

    private void u() {
        if (this.ai == null) {
            this.ai = new pwp(3);
        }
        this.ai.setImsi(d());
        if (this.f23095a) {
            this.ai.setSlotId(this.at);
        } else {
            this.ai.setSlotId(pxk.d(this.i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("MultiSimConfigActivity", "queryMultiSimStatus :", this.ak);
        pwo pwoVar = new pwo();
        pwoVar.b(d());
        this.ah.sendEmptyMessageDelayed(9, 30000L);
        this.af.e(pwoVar, f(), this.ah.obtainMessage(3));
    }

    private void c(String str, String str2, String str3) {
        LogUtil.a("MultiSimConfigActivity", "startMultiSimWebView type=", str3, " url=", str, " postData=", str2);
        if (str == null || "".equals(str)) {
            LogUtil.j("MultiSimConfigActivity", "startMultiSimWebView url null");
            return;
        }
        j();
        Intent intent = new Intent(this, (Class<?>) MultiSimWebView.class);
        intent.putExtra("url", str);
        intent.putExtra("post_data", str2);
        intent.putExtra("req_type", str3);
        startActivityForResult(intent, 0);
    }

    void b() {
        LogUtil.a("MultiSimConfigActivity", "downLoadEsimProfile mIsDownload =", Boolean.valueOf(this.s));
        if (this.s) {
            m();
            return;
        }
        e(getString(R.string.IDS_plugin_download_fail), "");
        this.s = true;
        LogUtil.a("MultiSimConfigActivity", "mCmccAcCode =", this.f);
        this.ah.sendEmptyMessageDelayed(16, 120000L);
        if (pxk.i() && !Utils.o()) {
            pxk.b(this.f, String.valueOf(System.currentTimeMillis()));
        }
        npz.b().d(this.f, new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("MultiSimConfigActivity", "openEsimWithoutConfirm first errorCode =", Integer.valueOf(i));
            }
        }, new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.MultiSimConfigActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("MultiSimConfigActivity", "openEsimWithoutConfirm second errorCode =", Integer.valueOf(i));
                pxk.a(i, true);
                MultiSimConfigActivity.this.b(16);
                Message messageObtainMessage = MultiSimConfigActivity.this.ah.obtainMessage(14);
                messageObtainMessage.arg1 = i;
                if (i == 0) {
                    MultiSimConfigActivity.this.ah.sendMessageDelayed(messageObtainMessage, 5000L);
                } else {
                    MultiSimConfigActivity.this.ah.sendMessage(messageObtainMessage);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("MultiSimConfigActivity", "Enter onActivityResult(): requestCode= ", Integer.valueOf(i), " resultCode=", Integer.valueOf(i2));
        if (i2 == 2) {
            this.s = false;
            LogUtil.a("MultiSimConfigActivity", "Enter onActivityResult(): download profile=mIsDownload=", false);
        }
        ac();
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
