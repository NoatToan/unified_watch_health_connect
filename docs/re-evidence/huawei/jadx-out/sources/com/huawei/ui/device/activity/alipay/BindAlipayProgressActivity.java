package com.huawei.ui.device.activity.alipay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.eeq;
import defpackage.lmf;
import defpackage.out;
import defpackage.req;
import defpackage.xiu;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class BindAlipayProgressActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f24236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f24237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f24238c;
    private HealthTextView e;
    private CustomTitleBar g;
    private HealthButton h;
    private Context i;
    private HealthTextView j;
    private boolean d = false;
    private Handler f = new Handler() { // from class: com.huawei.ui.device.activity.alipay.BindAlipayProgressActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null) {
                switch (message.what) {
                    case 10:
                        BindAlipayProgressActivity.this.c(8196);
                        BindAlipayProgressActivity.this.c();
                        break;
                    case 11:
                        LogUtil.a("BindAlipayProgressActivity", "GET_BIND_CODE_START_FLAG, hasBound:", Boolean.valueOf(BindAlipayProgressActivity.this.d));
                        if (!BindAlipayProgressActivity.this.d) {
                            BindAlipayProgressActivity.this.c(8193);
                        }
                        break;
                    case 12:
                        BindAlipayProgressActivity.this.finish();
                        break;
                    case 13:
                        BindAlipayProgressActivity.this.d = true;
                        BindAlipayProgressActivity.this.a();
                        break;
                    default:
                        LogUtil.j("BindAlipayProgressActivity", "mHandler default");
                        break;
                }
            }
            LogUtil.j("BindAlipayProgressActivity", "mHandler message is null");
        }
    };
    private PingCallback o = new PingCallback() { // from class: com.huawei.ui.device.activity.alipay.BindAlipayProgressActivity.2
        @Override // com.huawei.health.deviceconnect.callback.PingCallback
        public void onPingResult(int i) {
            LogUtil.a("BindAlipayProgressActivity", "pingDevice onPingResult:", Integer.valueOf(i));
            if (i == 202) {
                BindAlipayProgressActivity.this.f.sendEmptyMessageDelayed(11, 5000L);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bind_alipay_progress);
        this.i = this;
        d();
        req.e().c(this);
        req.e().b(this.o);
        this.f.sendEmptyMessageDelayed(10, 40000L);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f.removeCallbacksAndMessages(null);
    }

    private void d() {
        this.g = (CustomTitleBar) out.d(this, R.id.bind_alipay_title_bar);
        this.h = (HealthButton) out.d(this, R.id.bind_alipay_cancel);
        this.f24237b = (ImageView) out.d(this, R.id.bind_alipay_fail_image);
        this.f24238c = (HealthTextView) out.d(this, R.id.bind_alipay_title);
        this.j = (HealthTextView) out.d(this, R.id.bind_alipay_try_tip);
        this.f24236a = (HealthTextView) out.d(this, R.id.bind_alipay_try_message);
        this.e = (HealthTextView) out.d(this, R.id.bind_alipay_message);
        this.f24237b.setVisibility(8);
        this.j.setVisibility(8);
        this.f24236a.setVisibility(8);
        this.h.setOnClickListener(this);
        this.g.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.alipay.BindAlipayProgressActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BindAlipayProgressActivity.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("BindAlipayProgressActivity", "showBindFialView");
        this.h.setText(getResources().getString(R.string.IDS_contact_confirm_ios_btn));
        this.f24238c.setText(getResources().getString(R.string.IDS_bind_alipay_fail));
        this.f24237b.setVisibility(0);
        this.j.setVisibility(0);
        this.f24236a.setVisibility(0);
        this.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("BindAlipayProgressActivity", "showHasBindedView");
        this.h.setText(getResources().getString(R.string.IDS_contact_confirm_ios_btn));
        this.f24238c.setText(getResources().getString(R.string.IDS_hw_healt_data_share_wechat_status));
        this.e.setText(getResources().getString(R.string.IDS_bind_alipay_binded_tip));
        this.f24237b.setImageResource(R.mipmap.ic_pairing_completed);
        this.f24237b.setVisibility(0);
        this.j.setVisibility(8);
        this.f24236a.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        req.e().b(i);
    }

    public void c(xiu xiuVar) {
        LogUtil.a("BindAlipayProgressActivity", "onReceiveDeviceCommand message");
        if (xiuVar == null) {
            LogUtil.j("BindAlipayProgressActivity", "handleReceiveMessage message is null");
            return;
        }
        byte[] bArrB = xiuVar.b();
        if (bArrB == null || bArrB.length == 0) {
            LogUtil.j("BindAlipayProgressActivity", "handleReceiveMessage message is empty");
            return;
        }
        int iC = c(bArrB, 0);
        int iC2 = c(bArrB, 4);
        int iC3 = c(bArrB, 8);
        LogUtil.a("BindAlipayProgressActivity", "onReceiveMessage version = ", Integer.valueOf(iC), " magic = ", Integer.valueOf(iC2));
        if (iC3 == 8194) {
            if (bArrB.length > 16) {
                LogUtil.a("BindAlipayProgressActivity", "get bindcode success");
                e(eeq.d(eeq.e(Arrays.copyOfRange(bArrB, 16, bArrB.length))));
                this.f.sendEmptyMessageDelayed(12, 1000L);
                return;
            }
            return;
        }
        if (iC3 != 8195) {
            if (iC3 == 8197) {
                LogUtil.a("BindAlipayProgressActivity", "has already bind alipay");
                this.f.sendEmptyMessage(13);
                return;
            } else {
                LogUtil.j("BindAlipayProgressActivity", "get bindcode fail");
                return;
            }
        }
        LogUtil.a("BindAlipayProgressActivity", "get bindcode time out");
        HashMap map = new HashMap(10);
        map.put("errorCode", 8195);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BIND_ALIPAY_TIME_OUT.value(), map, 0);
        this.f.sendEmptyMessage(10);
    }

    private int c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.bind_alipay_cancel) {
            b();
        } else {
            LogUtil.j("BindAlipayProgressActivity", "click nothing");
        }
    }

    private void e(String str) {
        LogUtil.a("BindAlipayProgressActivity", "startAlipay");
        try {
            this.i.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("alipays://platformapi/startapp?appId=2017092008831174&page=%2Fpages%2Fwatch%2Findex&query=" + URLEncoder.encode("code=" + URLEncoder.encode(str, "utf-8"), "utf-8"))));
        } catch (ActivityNotFoundException | UnsupportedEncodingException unused) {
            LogUtil.e("BindAlipayProgressActivity", "startAlipay UnsupportedEncodingException or ActivityNotFoundException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (TextUtils.equals(this.h.getText().toString(), getResources().getString(R.string.IDS_settings_button_cancal_ios_btn))) {
            c(8196);
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
