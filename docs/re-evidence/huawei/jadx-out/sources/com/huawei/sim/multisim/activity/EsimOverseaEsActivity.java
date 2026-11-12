package com.huawei.sim.multisim.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.up.utils.ErrorCode;
import defpackage.npz;
import defpackage.oco;
import defpackage.ocr;
import defpackage.pwp;
import defpackage.pxi;
import defpackage.pxk;
import defpackage.qrs;
import defpackage.xjt;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class EsimOverseaEsActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23132a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23134c;
    private RelativeLayout f;
    private ImageView g;
    private HealthTextView h;
    private HealthButton i;
    private pwp k;
    private ocr n;
    private boolean o;
    private String q;
    private CustomTitleBar r;
    private int s;
    private HealthProgressBar t;
    private HealthTextView x;
    private RelativeLayout y;
    private String l = "";
    private e m = new e(this);
    private MultiSimDeviceInfo j = new MultiSimDeviceInfo();
    private String d = "";
    private int p = 2;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23133b = 1;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("EsimOverseaEsActivity", "onCreate");
        this.f23132a = this;
        this.q = pxk.a((Context) this);
        Intent intent = getIntent();
        if (intent != null) {
            this.f23134c = intent.getIntExtra("esim_auth_method", 0);
            this.l = intent.getStringExtra("simImsi");
            this.s = intent.getIntExtra("MultiSimSlotId", 0);
            this.o = intent.getBooleanExtra("esim_is_one_open_method", false);
            this.e = intent.getBooleanExtra("esimIsActivated", false);
            this.d = intent.getStringExtra("activatedAccode");
            this.f23133b = intent.getIntExtra("esim_card_type_key", 1);
        }
        m();
        i();
        a();
        LogUtil.a("EsimOverseaEsActivity", "isCuccSimActivated : ", Boolean.valueOf(this.e), "mCardType:", Integer.valueOf(this.f23133b));
        if (this.e && !TextUtils.isEmpty(this.d)) {
            b();
        } else {
            g();
        }
    }

    public void a() {
        LogUtil.a("EsimOverseaEsActivity", "initSdk");
        this.n = new ocr();
        this.n.a(this.f23132a, this.k, new String(Base64.b("MENBM0RBMzQ5QUExQ0I2OA=="), StandardCharsets.UTF_8), new String(Base64.b("MDZFMUJDMjgwRDFDQ0RCMTFCQjczNEZGREU3QUIyNkYwMzc0QkZFNTY2NUU2MkU4MjZDQzA1N0MwN0IyN0Q2OA=="), StandardCharsets.UTF_8));
    }

    private void i() {
        setContentView(R.layout.activity_esim_oversea_es);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.esim_title_bar);
        this.r = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.y = (RelativeLayout) findViewById(R.id.esim_waiting_layout);
        this.t = (HealthProgressBar) findViewById(R.id.esim_waiting_image);
        this.x = (HealthTextView) findViewById(R.id.esim_waiting_text);
        this.f = (RelativeLayout) findViewById(R.id.esim_fail_layout);
        this.g = (ImageView) findViewById(R.id.esim_fail_image);
        this.h = (HealthTextView) findViewById(R.id.esim_fail_text);
        HealthButton healthButton = (HealthButton) findViewById(R.id.esim_fail_btn);
        this.i = healthButton;
        healthButton.setOnClickListener(this);
    }

    private void g() {
        d(getString(R.string.IDS_plugin_multi_esim_loading));
        npz.b().e(new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.activity.EsimOverseaEsActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimOverseaEsActivity", "getMultiSimDeviceInfo onResponse errorCode :", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof MultiSimDeviceInfo)) {
                    EsimOverseaEsActivity.this.m.sendEmptyMessage(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                    return;
                }
                EsimOverseaEsActivity.this.j = (MultiSimDeviceInfo) obj;
                LogUtil.a("EsimOverseaEsActivity", "getMultiSimDeviceInfo mDeviceInfo :", EsimOverseaEsActivity.this.j);
                EsimOverseaEsActivity esimOverseaEsActivity = EsimOverseaEsActivity.this;
                if (!esimOverseaEsActivity.e(esimOverseaEsActivity.j)) {
                    EsimOverseaEsActivity.this.m.sendEmptyMessage(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                } else {
                    EsimOverseaEsActivity.this.o();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(MultiSimDeviceInfo multiSimDeviceInfo) {
        return (multiSimDeviceInfo == null || multiSimDeviceInfo.getEID() == null || "".equals(multiSimDeviceInfo.getEID())) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("EsimOverseaEsActivity", "view is null");
        } else if (view.getId() != R.id.esim_fail_btn) {
            LogUtil.j("EsimOverseaEsActivity", "unknown view");
        } else {
            finish();
        }
    }

    static class e extends Handler {
        private WeakReference<EsimOverseaEsActivity> e;

        e(EsimOverseaEsActivity esimOverseaEsActivity) {
            this.e = new WeakReference<>(esimOverseaEsActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimOverseaEsActivity", "EsimOverseaEsHandler handleMessage msg is null");
            }
            WeakReference<EsimOverseaEsActivity> weakReference = this.e;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("EsimOverseaEsActivity", "mWeakActivity is null");
                return;
            }
            EsimOverseaEsActivity esimOverseaEsActivity = this.e.get();
            LogUtil.a("EsimOverseaEsActivity", "mActivity :", esimOverseaEsActivity, "message.what ", Integer.valueOf(message.what));
            switch (message.what) {
                case 100001:
                    esimOverseaEsActivity.e(message.arg1);
                    break;
                case ErrorCode.HWID_IS_STOPED /* 100002 */:
                    esimOverseaEsActivity.a(message);
                    break;
                case 100003:
                    esimOverseaEsActivity.b(message);
                    break;
                case 100004:
                    esimOverseaEsActivity.j();
                    esimOverseaEsActivity.b(esimOverseaEsActivity.getString(R.string.IDS_plugin_network_unstable), R.drawable.esim_fail_network_img);
                    xjt.q("MSG_ESIM_OPERATION_TIMEOUT");
                    break;
                case AdapterWithBottomView.TYPE_BOTTOM /* 100005 */:
                    esimOverseaEsActivity.d(AdapterWithBottomView.TYPE_BOTTOM);
                    esimOverseaEsActivity.l();
                    pxi.c("false", "unabled_entry", String.valueOf(AdapterWithBottomView.TYPE_BOTTOM), pxi.d(esimOverseaEsActivity.f23132a, esimOverseaEsActivity.l), "online_ES", pxi.j());
                    esimOverseaEsActivity.b(esimOverseaEsActivity.getString(R.string.IDS_plugin_network_unstable), R.drawable.esim_fail_network_img);
                    break;
                case 100006:
                    esimOverseaEsActivity.a(esimOverseaEsActivity, message);
                    break;
                case WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007 /* 100007 */:
                    esimOverseaEsActivity.d(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                    esimOverseaEsActivity.b(esimOverseaEsActivity.getString(R.string.IDS_plugin_device_info_fail), R.drawable.esim_fail_device_img);
                    xjt.q("MSG_ESIM_GET_DEVICEINFO_ERROR");
                    break;
                case 100008:
                    esimOverseaEsActivity.a(message);
                    break;
                default:
                    LogUtil.j("EsimOverseaEsActivity", "Unknown message");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.e && pxk.c(this.f23133b)) {
            this.y.setVisibility(8);
            pxk.b(this.f23132a, new View.OnClickListener() { // from class: pxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45926c.c(view);
                }
            });
        }
    }

    public /* synthetic */ void c(View view) {
        LogUtil.a("EsimOverseaEsActivity", "press positive button.");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        LogUtil.a("EsimOverseaEsActivity", "handleAuthResult");
        if (i == 1000) {
            h();
            return;
        }
        if (i == 98) {
            b(getString(R.string.IDS_plugin_network_unstable), R.drawable.esim_fail_network_img);
            return;
        }
        if (i == -1005) {
            if (this.o) {
                b(this.f23132a.getString(R.string.IDS_phone_version_low_tips1), R.drawable.esim_fail_loading_img);
            } else {
                b(this.f23132a.getString(R.string.IDS_phone_version_low_tips2), R.drawable.esim_fail_loading_img);
            }
            xjt.q("UNSUPPORTED_ANDROID_VERSION_EXCEPTION");
            return;
        }
        if (i == -1006) {
            if (this.o) {
                b(this.f23132a.getString(R.string.IDS_set_default_card_tips1), R.drawable.esim_fail_loading_img);
            } else {
                b(this.f23132a.getString(R.string.IDS_set_default_card_tips2), R.drawable.esim_fail_loading_img);
            }
            xjt.q("ONLY_PRIMARY_CARD_EXCEPTION");
            return;
        }
        boolean z = CommonUtil.bg() || pxk.g();
        if (this.f23134c == 5 && z && this.p == 2) {
            this.p = 4;
            o();
        } else {
            b(this.f23132a.getString(R.string.IDS_oversea_es_load_fail), R.drawable.esim_fail_loading_img);
            xjt.q("Esim fail loading");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        LogUtil.a("EsimOverseaEsActivity", "handleQueryResult");
        if (message.arg1 == 1000) {
            e();
            return;
        }
        if (message.arg1 == 98) {
            b(getString(R.string.IDS_plugin_network_unstable), R.drawable.esim_fail_network_img);
            return;
        }
        if (message.arg1 == 1200) {
            Bundle data = message.getData();
            if (data != null) {
                String string = data.getString("ActivationCode");
                this.d = string;
                LogUtil.a("EsimOverseaEsActivity", "handleQueryResult mAcCode = ", string);
                b();
                return;
            }
            LogUtil.j("EsimOverseaEsActivity", "handleQueryResult bundle is null");
            b(this.f23132a.getString(R.string.IDS_oversea_es_load_fail), R.drawable.esim_fail_loading_img);
            return;
        }
        if (message.arg1 == -1011) {
            b(this.f23132a.getString(R.string.ids_oversea_es_query_opened), R.drawable.esim_fail_query_img);
            xjt.q("ERROR_CODE_NO_ACTIVATED_CODE_EXCEPTION");
        } else {
            b(this.f23132a.getString(R.string.IDS_oversea_es_load_fail), R.drawable.esim_fail_loading_img);
            xjt.q("Esim fail loading.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        LogUtil.a("EsimOverseaEsActivity", "handleOpenResult");
        j();
        if (message.arg1 == 0) {
            return;
        }
        b(this.f23132a.getString(R.string.IDS_oversea_es_load_fail), R.drawable.esim_fail_loading_img);
        xjt.q("Esim fail loading.." + message.arg1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(EsimOverseaEsActivity esimOverseaEsActivity, Message message) {
        esimOverseaEsActivity.d(AdapterWithBottomView.TYPE_BOTTOM);
        LogUtil.a("EsimOverseaEsActivity", "message.arg1 = ", Integer.valueOf(message.arg1));
        if (message.arg1 == 0) {
            if (pxk.i() && !Utils.o()) {
                pxk.b("", "0");
            }
            npz.b().d(true);
            pxi.c("true", "unabled_entry", String.valueOf(message.arg1), pxi.d(esimOverseaEsActivity.f23132a, esimOverseaEsActivity.l), "online_ES", pxi.j());
            finish();
            return;
        }
        npz.b().d(false);
        pxi.c("false", "unabled_entry", String.valueOf(message.arg1), pxi.d(esimOverseaEsActivity.f23132a, esimOverseaEsActivity.l), "online_ES", pxi.j());
        b(this.f23132a.getString(R.string.IDS_plugin_esim_unknonw_failed_new), R.drawable.esim_fail_loading_img);
        f();
        xjt.q("Esim fail loading :" + message.arg1);
    }

    private void f() {
        LogUtil.a("EsimOverseaEsActivity", "eSimProfileDownFail isCuccSimActivated.", Boolean.valueOf(this.e), "mCardType :", Integer.valueOf(this.f23133b));
        if (this.e && pxk.c(this.f23133b)) {
            this.y.setVisibility(8);
            pxk.b(this.f23132a, new View.OnClickListener() { // from class: pxc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45922a.e(view);
                }
            });
        }
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("EsimOverseaEsActivity", "press positive button.");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("EsimOverseaEsActivity", "mHandler = ", this.m, "message = ", Integer.valueOf(i));
        e eVar = this.m;
        if (eVar == null || !eVar.hasMessages(i)) {
            return;
        }
        this.m.removeMessages(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i) {
        this.f.setVisibility(0);
        this.y.setVisibility(8);
        xjt.q("initFailView failReason :" + str);
        HealthTextView healthTextView = this.h;
        if (healthTextView != null) {
            healthTextView.setText(str);
            this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.sim.multisim.activity.EsimOverseaEsActivity.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    EsimOverseaEsActivity.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (EsimOverseaEsActivity.this.h.getLineCount() >= 2) {
                        EsimOverseaEsActivity.this.h.setGravity(GravityCompat.START);
                    }
                }
            });
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            Context context = this.f23132a;
            pxk.b(context, imageView, qrs.d(context, 120.0f));
            Drawable drawable = getResources().getDrawable(i);
            drawable.setAutoMirrored(true);
            this.g.setImageDrawable(drawable);
        }
    }

    private void d(String str) {
        this.f.setVisibility(8);
        this.y.setVisibility(0);
        HealthTextView healthTextView = this.x;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        HealthProgressBar healthProgressBar = this.t;
        if (healthProgressBar != null) {
            Context context = this.f23132a;
            pxk.b(context, healthProgressBar, qrs.d(context, 66.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("EsimOverseaEsActivity", "removeTimeOutMessage");
        e eVar = this.m;
        if (eVar == null || !eVar.hasMessages(100004)) {
            return;
        }
        this.m.removeMessages(100004);
    }

    private void e() {
        LogUtil.a("EsimOverseaEsActivity", "addMultiSimRequest");
        j();
        this.m.sendEmptyMessageDelayed(100004, 30000L);
        this.n.a(pxk.a(this.l, this.q), pxk.e(this.j), this.m.obtainMessage(100003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("EsimOverseaEsActivity", "startAuth");
        m();
        this.n.d(this.f23132a, this.k, pxk.a(this.l, this.q), pxk.e(this.j), this.m.obtainMessage(100001));
    }

    private void m() {
        n();
        LogUtil.a("EsimOverseaEsActivity", "setAuthParam mTempAuthMethod = ", Integer.valueOf(this.p));
        pwp pwpVar = new pwp(this.p);
        this.k = pwpVar;
        pwpVar.setImsi(this.l);
        this.k.setSlotId(this.s);
    }

    private void n() {
        int i = this.f23134c;
        if (i == 5) {
            if (CommonUtil.bg() || pxk.g()) {
                return;
            }
            this.p = 4;
            return;
        }
        this.p = i;
    }

    private void h() {
        LogUtil.a("EsimOverseaEsActivity", "queryMultiSimServiceStatus");
        this.m.sendEmptyMessageDelayed(100004, 30000L);
        this.n.e(pxk.a(this.l, this.q), pxk.e(this.j), this.m.obtainMessage(ErrorCode.HWID_IS_STOPED));
    }

    private void c() {
        Integer numA = oco.a(this.f23132a, "ODSA_POLLING_TIME_LIMIT_MINUTES", this.s, 5);
        int iIntValue = numA.intValue();
        LogUtil.a("EsimOverseaEsActivity", "pullingTimeLimit = ", numA);
        this.m.sendEmptyMessageDelayed(100004, (iIntValue >= 5 ? iIntValue : 5) * 60000);
        this.n.c(pxk.a(this.l, this.q), pxk.e(this.j), this.m.obtainMessage(100008));
    }

    void b() {
        d(getString(R.string.IDS_plugin_download_fail));
        this.m.sendEmptyMessageDelayed(AdapterWithBottomView.TYPE_BOTTOM, 120000L);
        if (pxk.i() && !Utils.o()) {
            pxk.b(this.d, String.valueOf(System.currentTimeMillis()));
        }
        npz.b().d(this.d, new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.activity.EsimOverseaEsActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimOverseaEsActivity", "downLoadProfile first errorCode =", Integer.valueOf(i));
            }
        }, new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.activity.EsimOverseaEsActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimOverseaEsActivity", "downLoadProfile second errorCode =", Integer.valueOf(i));
                pxk.a(i, true);
                EsimOverseaEsActivity.this.d(AdapterWithBottomView.TYPE_BOTTOM);
                Message messageObtainMessage = EsimOverseaEsActivity.this.m.obtainMessage(100006);
                messageObtainMessage.arg1 = i;
                if (i == 0) {
                    EsimOverseaEsActivity.this.m.sendMessageDelayed(messageObtainMessage, 5000L);
                } else {
                    EsimOverseaEsActivity.this.m.sendMessage(messageObtainMessage);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("EsimOverseaEsActivity", "Enter onActivityResult(): requestCode= ", Integer.valueOf(i), " resultCode=", Integer.valueOf(i2));
        if (i != 101) {
            LogUtil.j("EsimOverseaEsActivity", "onActivityResult requestCode is invalid");
            return;
        }
        if (intent == null) {
            LogUtil.j("EsimOverseaEsActivity", "data is null");
            xjt.q("data is null");
            b(this.f23132a.getString(R.string.IDS_oversea_es_query_fail), R.drawable.esim_fail_query_img);
            return;
        }
        if (i2 == 1) {
            String stringExtra = intent.getStringExtra("ActivationCode");
            this.d = stringExtra;
            LogUtil.a("EsimOverseaEsActivity", "onActivityResult mAcCode = ", stringExtra);
            b();
        } else if (i2 == 2) {
            d(String.format(Locale.ENGLISH, this.f23132a.getString(R.string.IDS_acquire_configuration_tips), UnitUtil.e(1.0d, 1, 0), UnitUtil.e(5.0d, 1, 0)));
            c();
        } else {
            b(this.f23132a.getString(R.string.IDS_oversea_es_query_fail), R.drawable.esim_fail_query_img);
            xjt.q("query fail resultCode：" + i2);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("EsimOverseaEsActivity", "onDestroy");
        d();
        j();
        e eVar = this.m;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
        }
    }

    public void d() {
        LogUtil.a("EsimOverseaEsActivity", "finishSdk");
        ocr ocrVar = this.n;
        if (ocrVar != null) {
            ocrVar.d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
