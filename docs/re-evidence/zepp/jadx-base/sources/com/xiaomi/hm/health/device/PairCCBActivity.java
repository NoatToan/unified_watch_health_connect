package com.xiaomi.hm.health.device;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.service.WebItem;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.utils.AESHelper;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class PairCCBActivity extends BaseTitleActivity {
    private static final String B = "com.xiaomi.hm.health";
    private static final String C = "parameter";
    private static final String D = "com.ccb.atms.mobilepay_forsd";
    private static final String E = "com.ccb.mobilepay.wristband.dialog.BraProgressActivity";
    private static final String F = "http://app.mi.com/details?id=com.ccb.atms.mobilepay_forsd";
    private final Lazy<DeviceManagerApi> x = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> y = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceXNavigator> z = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<MiuiFnApi> A = KoinJavaComponent.inject(MiuiFnApi.class);

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((MiuiFnApi) PairCCBActivity.this.A.getValue()).isMiui(DeviceXFunctionsKt.getContext())) {
                ((DeviceXNavigator) PairCCBActivity.this.z.getValue()).goToMarket(PairCCBActivity.this, PairCCBActivity.D);
            } else {
                WebItem webItem = new WebItem(PairCCBActivity.F);
                webItem.from = "FROM_CCB_GUIDE";
                WebHelper.launch(webItem);
            }
            PairCCBActivity.this.finish();
        }
    }

    private byte[] p() {
        return AESHelper.getInstance().encrypt("source=com.xiaomi.hm.health" + AESEncryptionHelper.SEPARATOR + "mac=" + this.x.getValue().getBoundDeviceAddress(HMDeviceType.MILI));
    }

    private void q() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(D, 0);
            if (packageInfo == null) {
                return;
            }
            if (packageInfo.versionCode < 27) {
                CustomToast.makeText(this, getString(R.string.ccb_app_version_low), 0).show();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(C, p());
            intent.setComponent(new ComponentName(D, E));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void r() {
        TextView textView = (TextView) findViewById(R.id.left_btn);
        textView.setText(R.string.cancel);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ur5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.right_btn);
        textView2.setText(R.string.dredge_now);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: vr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.t(view);
            }
        });
        try {
            if (getPackageManager().getPackageInfo(D, 0) == null) {
                u();
            }
        } catch (Exception e) {
            e.printStackTrace();
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        q();
    }

    private void u() {
        TextView textView = (TextView) findViewById(R.id.right_btn);
        TextView textView2 = (TextView) findViewById(R.id.tips_tv);
        textView.setText(R.string.download_now);
        textView2.setText(R.string.download_ccb_tips);
        textView.setOnClickListener(new a());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_pair_ccb);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.trans, BaseTitleActivity.STYLE.NONE);
        r();
    }
}
