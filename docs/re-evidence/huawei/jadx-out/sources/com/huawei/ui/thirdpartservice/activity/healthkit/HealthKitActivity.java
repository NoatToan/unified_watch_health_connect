package com.huawei.ui.thirdpartservice.activity.healthkit;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.dmg;
import defpackage.qpx;
import defpackage.wvp;
import defpackage.wzw;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes20.dex */
public class HealthKitActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f29102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f29103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29104c;
    private c d = new c(this);
    private Intent e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private HealthButton l;
    private HealthButton m;

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<HealthKitActivity> f29105b;

        b(HealthKitActivity healthKitActivity) {
            this.f29105b = new WeakReference<>(healthKitActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            HealthKitActivity healthKitActivity = this.f29105b.get();
            if (healthKitActivity == null) {
                LogUtil.j("HealthKitActivity", "healthKitActivity = null");
            } else if (i == 0) {
                LogUtil.a("HealthKitActivity", "onResponse setUserPrivacy success ");
                healthKitActivity.d.sendEmptyMessage(1);
            } else {
                wvp.d(i);
            }
        }
    }

    static class c extends BaseHandler<HealthKitActivity> {
        c(HealthKitActivity healthKitActivity) {
            super(healthKitActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HealthKitActivity healthKitActivity, Message message) {
            if (message.what != 1) {
                return;
            }
            if (healthKitActivity.i) {
                healthKitActivity.setResult(-1);
                healthKitActivity.finish();
            } else {
                healthKitActivity.e();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29104c = this;
        setContentView(R.layout.activity_health_kit);
        this.f29103b = (HealthTextView) findViewById(R.id.health_kit_welcome_rela);
        this.f29102a = (HealthTextView) findViewById(R.id.health_kit_welcome_guide_describe);
        HealthButton healthButton = (HealthButton) findViewById(R.id.health_kit_link_button);
        this.l = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.health_kit_unlink_button);
        this.m = healthButton2;
        healthButton2.setOnClickListener(this);
        Intent intent = getIntent();
        this.e = intent;
        if (intent != null) {
            this.f = intent.getBooleanExtra("key_health_kit_authorization_to_bind_device", false);
            this.i = this.e.getBooleanExtra("key_health_kit_authorization_to_thread_device", false);
            this.j = this.e.getBooleanExtra("device_list_to_health_kit_authorization", false);
            this.h = this.e.getBooleanExtra("key_start_to_measure_to_health_kit_authorization", false);
        }
        if (this.i) {
            this.l.setVisibility(0);
            this.m.setVisibility(8);
            this.f29103b.setText(R.string.IDS_health_kit_open_title);
            this.f29102a.setText(R.string.IDS_health_kit_open_content);
            return;
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean zE = new wzw().e(402);
        this.g = zE;
        LogUtil.a("HealthKitActivity", "checklinkedStatus, mIsLinked = ", Boolean.valueOf(zE));
        if (this.g) {
            b();
            return;
        }
        this.l.setVisibility(0);
        this.m.setVisibility(8);
        this.f29103b.setText(R.string.IDS_health_kit_open_title);
        this.f29102a.setText(R.string.IDS_health_kit_open_content);
    }

    private void b() {
        if (this.f) {
            d(this);
            return;
        }
        if (this.j) {
            d();
            return;
        }
        if (this.h) {
            c();
            return;
        }
        this.l.setVisibility(8);
        this.m.setVisibility(0);
        this.f29103b.setText(R.string.IDS_health_kit_close_title);
        this.f29102a.setText(R.string.IDS_health_kit_close_content);
    }

    private void c() {
        String stringExtra = this.e.getStringExtra("productId");
        LogUtil.d("HealthKitActivity", "productId = ", stringExtra);
        String stringExtra2 = this.e.getStringExtra("uniqueId");
        LogUtil.d("HealthKitActivity", "uniqueId = ", stringExtra2);
        dmg.a().setBeginMeasureBiAnalytics(stringExtra);
        Intent intent = new Intent();
        intent.setPackage(this.f29104c.getPackageName());
        intent.setClassName(this.f29104c, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", dmg.a().getH5Path(stringExtra) + "#/type=2/sn=" + stringExtra2);
        intent.putExtra("productId", stringExtra);
        intent.putExtra("commonDeviceInfo", (ContentValues) this.e.getParcelableExtra("commonDeviceInfo"));
        startActivity(intent);
        finish();
    }

    private void d() {
        LogUtil.a("HealthKitActivity", "startWebViewActivity enter");
        String stringExtra = this.e.getStringExtra("productId");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.e("HealthKitActivity", "startWebViewActivity productId is null");
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(this.f29104c.getPackageName());
        intent.setClassName(this.f29104c, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", dmg.a().getH5Path(stringExtra) + "#/type=4/uuidpre=" + dmg.a().getSubProductId(stringExtra));
        intent.putExtra("productId", stringExtra);
        ContentValues contentValues = (ContentValues) this.e.getParcelableExtra("commonDeviceInfo");
        if (contentValues == null) {
            LogUtil.e("HealthKitActivity", "startWebViewActivity contentValues is null");
            finish();
        } else {
            intent.putExtra("commonDeviceInfo", contentValues);
            LogUtil.a("HealthKitActivity", "sannuo_type=4_device list page to H5 interface,Productid=", stringExtra);
            startActivity(intent);
            finish();
        }
    }

    private void d(Activity activity) {
        dmg.a().downloadBloodSugarDeviceResource(activity);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dmg.a().destroyResourceDownloadTool();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("HealthKitActivity", "onClick view = null");
            return;
        }
        int id = view.getId();
        if (id == R.id.health_kit_link_button) {
            if (!CommonUtil.ab(this.f29104c)) {
                qpx.e(this.f29104c, R.string.IDS_connect_network);
                LogUtil.j("HealthKitActivity", "isNetworkConnected false");
                return;
            }
            c(true);
            if (this.i || this.f || this.j || this.h) {
                return;
            }
            finish();
            return;
        }
        if (id != R.id.health_kit_unlink_button) {
            LogUtil.j("HealthKitActivity", "not effect click!");
        } else if (!CommonUtil.ab(this.f29104c)) {
            qpx.e(this.f29104c, R.string.IDS_connect_network);
            LogUtil.j("HealthKitActivity", "isNetworkConnected false");
        } else {
            c(false);
            finish();
        }
    }

    private void c(boolean z) {
        if (z) {
            new wzw().b(402, new b(this), true);
        } else {
            new wzw().b(402, new b(this), false);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
