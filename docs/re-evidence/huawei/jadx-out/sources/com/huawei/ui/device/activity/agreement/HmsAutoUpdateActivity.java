package com.huawei.ui.device.activity.agreement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.qsp;
import defpackage.qug;
import defpackage.rbf;
import defpackage.rbg;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class HmsAutoUpdateActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24218b;
    private String d;
    private Context e;
    private String f;
    private rbg i;
    private Handler g = new a(this);
    private int j = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f24219c = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.agreement.HmsAutoUpdateActivity.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            if ("broadcast_receiver_user_setting".equals(intent.getAction())) {
                LogUtil.a("AutoUpdateOverWifiActivity", "onReceive broadcast_receiver_user_setting");
                HmsAutoUpdateActivity.this.g.removeMessages(1);
                HmsAutoUpdateActivity.this.finish();
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (!(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("AutoUpdateOverWifiActivity", "the intent type is not DeviceInfo");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                if (HmsAutoUpdateActivity.this.f24217a == null || !HmsAutoUpdateActivity.this.f24217a.equals(deviceInfo.getmDeviceId())) {
                    LogUtil.j("AutoUpdateOverWifiActivity", "This device does not have the correspond capability.");
                    return;
                }
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                if (deviceConnectState == 4 || deviceConnectState == 3) {
                    LogUtil.a("AutoUpdateOverWifiActivity", "onReceive connected");
                    HmsAutoUpdateActivity.this.finish();
                    return;
                }
                return;
            }
            LogUtil.a("AutoUpdateOverWifiActivity", "onReceive else branch");
        }
    };

    static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<HmsAutoUpdateActivity> f24220a;

        a(HmsAutoUpdateActivity hmsAutoUpdateActivity) {
            this.f24220a = new WeakReference<>(hmsAutoUpdateActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            HmsAutoUpdateActivity hmsAutoUpdateActivity = this.f24220a.get();
            if (hmsAutoUpdateActivity == null) {
                LogUtil.j("AutoUpdateOverWifiActivity", "activity is null");
            } else if (message.what == 1) {
                qug.d(hmsAutoUpdateActivity.f24218b, 2, 7);
                hmsAutoUpdateActivity.e();
                LogUtil.a("AutoUpdateOverWifiActivity", "handleMessage pair time out");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("AutoUpdateOverWifiActivity", "HmsAutoUpdateActivity onCreate() ");
        this.e = this;
        setContentView(R.layout.wifi_update_switch_activity);
        d();
        a();
        IntentFilter intentFilter = new IntentFilter("broadcast_receiver_user_setting");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.e, this.f24219c, intentFilter, LocalBroadcast.f36595c, null);
    }

    private rbg c(String str) {
        return new rbf().e(qug.a(str, this.f));
    }

    private void d() {
        if (getIntent() == null) {
            LogUtil.j("AutoUpdateOverWifiActivity", "initDeclarationDataWifi intent is null");
            return;
        }
        this.d = getIntent().getStringExtra("device_country_code");
        this.f = getIntent().getStringExtra("device_emui_version");
        this.f24218b = getIntent().getStringExtra("device_name");
        this.i = c("hms_auto_update");
        this.j = getIntent().getIntExtra("device_version_type", -1);
        Serializable serializableExtra = getIntent().getSerializableExtra("hms_auto_update");
        this.f24217a = getIntent().getStringExtra("pairGuideSelectAddress");
        if (serializableExtra instanceof rbg) {
            this.i.a(((rbg) serializableExtra).i());
        }
    }

    private void a() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.wear_home_open_service_statement_title);
        if (customTitleBar != null) {
            customTitleBar.setTitleText(BaseApplication.getContext().getString(R.string.IDS_startup_aboard_title_auto_up));
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.i);
        ListView listView = (ListView) qsp.a(this, R.id.dev_switch_list_view);
        DeclarationAdapter declarationAdapter = new DeclarationAdapter(this.e, arrayList, this.j);
        if (listView != null) {
            listView.setAdapter((ListAdapter) declarationAdapter);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.j("AutoUpdateOverWifiActivity", "dispatchTouchEvent event is null");
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.g.removeMessages(1);
            this.g.sendEmptyMessageDelayed(1, 60000L);
            LogUtil.a("AutoUpdateOverWifiActivity", "timeout is reset");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Handler handler = this.g;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.f24219c;
        if (broadcastReceiver != null) {
            BroadcastManagerUtil.d(this.e, broadcastReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("AutoUpdateOverWifiActivity", "enter notify Pair Fail");
        Intent intent = new Intent();
        intent.setAction("broadcast_receiver_user_setting");
        intent.putExtra("error_code", -1);
        intent.putExtra("pairGuideSelectAddress", this.f24217a);
        BroadcastManagerUtil.a(this.e, intent, LocalBroadcast.f36595c, true);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
