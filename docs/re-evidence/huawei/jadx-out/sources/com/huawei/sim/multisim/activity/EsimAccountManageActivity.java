package com.huawei.sim.multisim.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.utils.ErrorCode;
import defpackage.npz;
import defpackage.ocr;
import defpackage.pwp;
import defpackage.pxk;
import defpackage.qrs;
import defpackage.xjt;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes15.dex */
public class EsimAccountManageActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f23124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f23125c;
    private HealthTextView d;
    private HealthButton e;
    private HealthProgressBar f;
    private CustomTitleBar g;
    private RelativeLayout i;
    private HealthTextView j;
    private int m;
    private Context o;
    private pwp p;
    private MultiSimDeviceInfo q;
    private int r;
    private ocr s;
    private String t;
    private b h = new b(this);
    private int l = 2;
    private String k = "";
    private int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23123a = true;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("EsimAccountManageActivity", "onCreate");
        this.o = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.k = intent.getStringExtra("simImsi");
            this.m = intent.getIntExtra("esim_auth_method", 0);
            this.r = intent.getIntExtra("MultiSimSlotId", 0);
            this.f23123a = intent.getBooleanExtra("isFinishSdk", true);
        }
        LogUtil.a("EsimAccountManageActivity", "onCreate mEsimAuthMethod = ", Integer.valueOf(this.m), ", mSimCardSlotId = ", Integer.valueOf(this.r));
        this.t = pxk.a(this.o);
        c();
        e();
        d();
        a();
    }

    private void d() {
        setContentView(R.layout.activity_esim_account_manage);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.account_manage_title_bar);
        this.g = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.i = (RelativeLayout) findViewById(R.id.account_manage_waiting_layout);
        this.j = (HealthTextView) findViewById(R.id.account_manage_waiting_text);
        this.f = (HealthProgressBar) findViewById(R.id.account_manage_waiting_image);
        this.f23125c = (RelativeLayout) findViewById(R.id.account_manage_fail_layout);
        this.d = (HealthTextView) findViewById(R.id.account_manage_fail_text);
        this.f23124b = (ImageView) findViewById(R.id.account_manage_fail_image);
        HealthButton healthButton = (HealthButton) findViewById(R.id.account_manage_fail_btn);
        this.e = healthButton;
        healthButton.setOnClickListener(this);
    }

    public void e() {
        LogUtil.a("EsimAccountManageActivity", "initSdk");
        this.s = new ocr();
        this.s.a(this.o, this.p, new String(Base64.b("MENBM0RBMzQ5QUExQ0I2OA=="), StandardCharsets.UTF_8), new String(Base64.b("MDZFMUJDMjgwRDFDQ0RCMTFCQjczNEZGREU3QUIyNkYwMzc0QkZFNTY2NUU2MkU4MjZDQzA1N0MwN0IyN0Q2OA=="), StandardCharsets.UTF_8));
    }

    private void a() {
        e(getString(R.string.IDS_plugin_multi_esim_loading));
        npz.b().e(new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.activity.EsimAccountManageActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimAccountManageActivity", "getMultiSimDeviceInfo errorCode = ", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof MultiSimDeviceInfo)) {
                    EsimAccountManageActivity.this.h.sendEmptyMessage(ErrorCode.HWID_IS_STOPED);
                    return;
                }
                EsimAccountManageActivity.this.q = (MultiSimDeviceInfo) obj;
                LogUtil.a("EsimAccountManageActivity", "getMultiSimDeviceInfo mMultiSimDeviceInfo = ", EsimAccountManageActivity.this.q);
                EsimAccountManageActivity esimAccountManageActivity = EsimAccountManageActivity.this;
                if (!esimAccountManageActivity.b(esimAccountManageActivity.q)) {
                    EsimAccountManageActivity.this.h.sendEmptyMessage(ErrorCode.HWID_IS_STOPED);
                    xjt.q("Eid not is Valid.");
                } else if (!pxk.h(EsimAccountManageActivity.this.k) || EsimAccountManageActivity.this.m != 1) {
                    EsimAccountManageActivity.this.h();
                } else {
                    EsimAccountManageActivity.this.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(MultiSimDeviceInfo multiSimDeviceInfo) {
        return (multiSimDeviceInfo == null || TextUtils.isEmpty(multiSimDeviceInfo.getEID())) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("EsimAccountManageActivity", "onClick view is null");
        } else if (view.getId() != R.id.account_manage_fail_btn) {
            LogUtil.j("EsimAccountManageActivity", "unknown view");
        } else {
            finish();
        }
    }

    static class b extends BaseHandler<EsimAccountManageActivity> {
        b(EsimAccountManageActivity esimAccountManageActivity) {
            super(esimAccountManageActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(EsimAccountManageActivity esimAccountManageActivity, Message message) {
            if (message == null) {
                LogUtil.j("EsimAccountManageActivity", "handleMessageWhenReferenceNotNull message is null");
            }
            LogUtil.a("EsimAccountManageActivity", "handleMessageWhenReferenceNotNull message = ", message);
            switch (message.what) {
                case 100001:
                    esimAccountManageActivity.d(message.arg1);
                    break;
                case ErrorCode.HWID_IS_STOPED /* 100002 */:
                    esimAccountManageActivity.e(ErrorCode.HWID_IS_STOPED);
                    esimAccountManageActivity.c(esimAccountManageActivity.getString(R.string.IDS_plugin_device_info_fail), R.drawable.esim_fail_device_img);
                    xjt.q("MSG_ACCOUNT_MANAGE_GET_DEVICEINFO_ERROR");
                    break;
                case 100003:
                    esimAccountManageActivity.d(message);
                    break;
                case 100004:
                    esimAccountManageActivity.e(100004);
                    esimAccountManageActivity.c(esimAccountManageActivity.getString(R.string.IDS_plugin_network_unstable), R.drawable.esim_fail_network_img);
                    xjt.q("MSG_ACCOUNT_MANAGE_OPERATION_TIMEOUT");
                    break;
                default:
                    LogUtil.j("EsimAccountManageActivity", "Unknown message");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("EsimAccountManageActivity", "handleAuthResult");
        if (i == 1000) {
            b();
            return;
        }
        if (i == 98) {
            c(getString(R.string.IDS_plugin_network_unstable), R.drawable.esim_fail_network_img);
            return;
        }
        if (i == -1005) {
            c(this.o.getString(R.string.IDS_account_management_phone_version_low), R.drawable.esim_fail_loading_img);
            return;
        }
        if (i == -1006) {
            c(this.o.getString(R.string.IDS_account_management_default_card), R.drawable.esim_fail_loading_img);
            return;
        }
        boolean z = CommonUtil.bg() || pxk.g();
        if (this.m == 5 && z && this.l == 2) {
            this.l = 4;
            h();
        } else {
            c(this.o.getString(R.string.IDS_oversea_es_load_fail), R.drawable.esim_fail_loading_img);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        LogUtil.a("EsimAccountManageActivity", "handleRequestResult: ", Integer.valueOf(message.arg1));
        e(100004);
        if (message.arg1 == 0) {
            finish();
            return;
        }
        c(this.o.getString(R.string.IDS_oversea_es_load_fail), R.drawable.esim_fail_loading_img);
        xjt.q("handleRequestResult fail loading" + message.arg1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("EsimAccountManageActivity", "changeMultiSimRequest");
        e(100004);
        this.s.b(pxk.a(this.k, this.t), pxk.e(this.q), this.h.obtainMessage(100003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        b bVar = this.h;
        if (bVar == null || !bVar.hasMessages(i)) {
            return;
        }
        this.h.removeMessages(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        this.f23125c.setVisibility(0);
        this.i.setVisibility(8);
        HealthTextView healthTextView = this.d;
        if (healthTextView != null) {
            healthTextView.setText(str);
            this.d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.sim.multisim.activity.EsimAccountManageActivity.5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    EsimAccountManageActivity.this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (EsimAccountManageActivity.this.d.getLineCount() >= 2) {
                        EsimAccountManageActivity.this.d.setGravity(GravityCompat.START);
                    }
                }
            });
        }
        ImageView imageView = this.f23124b;
        if (imageView != null) {
            Context context = this.o;
            pxk.b(context, imageView, qrs.d(context, 120.0f));
            Drawable drawable = getResources().getDrawable(i);
            drawable.setAutoMirrored(true);
            this.f23124b.setImageDrawable(drawable);
        }
    }

    private void e(String str) {
        this.f23125c.setVisibility(8);
        this.i.setVisibility(0);
        HealthTextView healthTextView = this.j;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        HealthProgressBar healthProgressBar = this.f;
        if (healthProgressBar != null) {
            Context context = this.o;
            pxk.b(context, healthProgressBar, qrs.d(context, 66.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("EsimAccountManageActivity", "startAuth");
        c();
        this.s.d(this.o, this.p, pxk.a(this.k, this.t), pxk.e(this.q), this.h.obtainMessage(100001));
    }

    private void c() {
        f();
        LogUtil.a("EsimAccountManageActivity", "setAuthParam mEsimTempAuthMethod = ", Integer.valueOf(this.l));
        pwp pwpVar = new pwp(this.l);
        this.p = pwpVar;
        pwpVar.setSlotId(this.r);
        this.p.setImsi(this.k);
    }

    private void f() {
        int i = this.m;
        if (i == 5) {
            if (CommonUtil.bg() || pxk.g()) {
                return;
            }
            this.l = 4;
            return;
        }
        this.l = i;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ocr ocrVar;
        super.onDestroy();
        LogUtil.a("EsimAccountManageActivity", "onDestroy isFinishSdk:", Boolean.valueOf(this.f23123a));
        if (this.f23123a && (ocrVar = this.s) != null) {
            ocrVar.d();
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
