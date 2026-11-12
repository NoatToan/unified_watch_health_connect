package com.huawei.ui.device.activity.doublephone;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.lvb;
import defpackage.mgg;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class DoublePhoneActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceSettingsInteractors f24326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f24327c;
    private CustomTitleBar d;
    private LinearLayout f;
    private LinearLayout h;
    private RelativeLayout i;
    private LinearLayout j;
    private LinearLayout k;
    private RelativeLayout l;
    private HealthTextView m;
    private HealthTextView p;
    private HealthButton q;
    private HealthTextView r;
    private HealthTextView s;
    private final Object n = new Object();
    private List<String> e = new CopyOnWriteArrayList();
    private int o = 15;
    private int g = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f24325a = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.doublephone.DoublePhoneActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("DoublePhoneActivity", "mNonLocalBroadcastReceiver()  intent : " + intent.getAction());
            String action = intent.getAction();
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 10) {
                    DoublePhoneActivity.this.m();
                }
            } else {
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    DeviceInfo deviceInfo = intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo ? (DeviceInfo) intent.getParcelableExtra("deviceinfo") : null;
                    if (deviceInfo != null) {
                        if (DoublePhoneActivity.this.e(deviceInfo)) {
                            DoublePhoneActivity.this.a(deviceInfo);
                            return;
                        } else {
                            LogUtil.a("DoublePhoneActivity", "This device does not have the correspond capability.");
                            return;
                        }
                    }
                    return;
                }
                LogUtil.d("DoublePhoneActivity", "other action");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "DoublePhoneActivity");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("DoublePhoneActivity", "enter mConnectStateChangedReceiver, deviceCapabilityHashMaps is null or empty");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability != null && (deviceCapability.isSupportPhonesInfo() || deviceCapability.isSupportNotifyDeviceBroadCast())) {
            return true;
        }
        LogUtil.j("DoublePhoneActivity", "device not support phones info or device broadcast.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo) {
        LogUtil.a("DoublePhoneActivity", "dealDeviceConnectState Entering");
        if (deviceInfo.getDeviceConnectState() == 2) {
            if (this.q.isEnabled()) {
                return;
            }
            d();
            b();
            return;
        }
        LogUtil.d("DoublePhoneActivity", "other status");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            unregisterReceiver(this.f24325a);
        } catch (IllegalStateException unused) {
            LogUtil.e("DoublePhoneActivity", "unregisterBroadcast IllegalStateException");
        }
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        c();
        b();
    }

    private void b() {
        h();
        a();
        n();
        this.f24326b = DeviceSettingsInteractors.e(BaseApplication.getContext());
        e();
    }

    private void a() {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("DoublePhoneActivity", "checkBluetooth ");
            m();
        } else {
            LogUtil.a("DoublePhoneActivity", "normal, continue");
            n();
            this.f24326b = DeviceSettingsInteractors.e(BaseApplication.getContext());
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.i.setVisibility(0);
        this.m.setVisibility(0);
        this.h.setVisibility(8);
        this.j.setVisibility(0);
        this.q.setVisibility(0);
        this.q.setEnabled(false);
        this.k.setVisibility(8);
        this.d.setTitleText(getResources().getString(R.string.IDS_hw_health_double_phone_menu_title));
    }

    private void n() {
        this.l.setVisibility(0);
        this.i.setVisibility(8);
        this.h.setVisibility(8);
        this.m.setVisibility(0);
        this.j.setVisibility(0);
        this.q.setVisibility(0);
        this.k.setVisibility(8);
        this.q.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.m.setVisibility(8);
        this.j.setVisibility(8);
        this.q.setVisibility(8);
        this.h.setVisibility(8);
        this.k.setVisibility(0);
        this.d.setTitleText(getResources().getString(R.string.IDS_hw_health_double_phone_button_title));
        DeviceInfo deviceInfoD = mgg.d("DoublePhoneActivity");
        if (deviceInfoD == null) {
            LogUtil.a("DoublePhoneActivity", "pairOtherPhone deviceInfo is null");
        } else {
            this.s.setText(getResources().getString(R.string.IDS_hw_health_double_phone_page_content3, deviceInfoD.getDeviceName()));
        }
        setResult(-1);
    }

    private void c() {
        setContentView(R.layout.activity_device_double_phone);
        this.d = (CustomTitleBar) qsp.a(this, R.id.setting_device_title_bar);
        this.l = (RelativeLayout) qsp.a(this, R.id.layout_normal);
        this.i = (RelativeLayout) qsp.a(this, R.id.addDevice_error_layout);
        this.h = (LinearLayout) qsp.a(this, R.id.layout_device_connected);
        this.k = (LinearLayout) qsp.a(this, R.id.layout_normal_pair_other);
        this.j = (LinearLayout) qsp.a(this, R.id.rl_bottom);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.double_phone_parent);
        this.f = linearLayout;
        qrs.b(linearLayout, 3);
        this.f24327c = (ImageView) qsp.a(this, R.id.pic_double_phone);
        this.m = (HealthTextView) qsp.a(this, R.id.textview_pair_content1);
        this.s = (HealthTextView) qsp.a(this, R.id.text_view_content3);
        this.r = (HealthTextView) qsp.a(this, R.id.text_view_phone1);
        this.p = (HealthTextView) qsp.a(this, R.id.text_view_phone2);
        this.q = (HealthButton) qsp.a(this, R.id.button_start_notify_device);
        g();
        if (qrs.af(BaseApplication.getContext())) {
            l();
        } else {
            k();
        }
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.doublephone.DoublePhoneActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DoublePhoneActivity.this.i();
                DoublePhoneActivity.this.j();
            }
        });
        f();
    }

    private void f() {
        final int[] iArr = {this.o};
        for (int i = 0; i < this.o - this.g; i++) {
            this.q.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.device.activity.doublephone.DoublePhoneActivity.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (DoublePhoneActivity.this.q.getLineCount() <= 1) {
                        DoublePhoneActivity.this.q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        int width = ((WindowManager) DoublePhoneActivity.this.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getWidth();
                        ViewGroup.LayoutParams layoutParams = DoublePhoneActivity.this.q.getLayoutParams();
                        if (width == layoutParams.width) {
                            int[] iArr2 = iArr;
                            iArr2[0] = iArr2[0] - 1;
                            DoublePhoneActivity.this.q.setTextSize(1, iArr[0]);
                        } else {
                            layoutParams.width = width;
                            DoublePhoneActivity.this.q.setLayoutParams(layoutParams);
                        }
                    }
                    LogUtil.a("DoublePhoneActivity", "globalLayout...");
                }
            });
        }
    }

    private void g() {
        DeviceInfo deviceInfoD = mgg.d("DoublePhoneActivity");
        if (deviceInfoD == null || this.m == null) {
            return;
        }
        this.m.setText(getResources().getString(R.string.IDS_hw_health_double_phone_page_content1, deviceInfoD.getDeviceName()));
    }

    private void k() {
        int width = ((WindowManager) getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getWidth();
        ImageView imageView = this.f24327c;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = (width * 960) / ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
            layoutParams.width = width;
            this.f24327c.setLayoutParams(layoutParams);
        }
    }

    private void l() {
        int width = ((WindowManager) getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getWidth();
        ImageView imageView = this.f24327c;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = width;
            this.f24327c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f24326b.c(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.doublephone.DoublePhoneActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DoublePhoneActivity", "notifyDevice errCode ", Integer.valueOf(i), " objData is  ", obj);
                if (i != 0 || obj == null) {
                    return;
                }
                byte[] bArr = new byte[0];
                if (obj instanceof byte[]) {
                    bArr = (byte[]) obj;
                }
                if (bArr.length <= 1) {
                    return;
                }
                byte b2 = bArr[1];
                if (b2 == 35) {
                    String strE = eeq.e(bArr);
                    if (strE.length() > 4) {
                        try {
                            DoublePhoneActivity.this.d(new eet().b(strE.substring(4, strE.length())).e());
                            LogUtil.a("DoublePhoneActivity", "mConnectedPhoneNames : " + DoublePhoneActivity.this.e.toString());
                            return;
                        } catch (eeu unused) {
                            LogUtil.e("DoublePhoneActivity", "notifyDevice TlvException");
                            return;
                        }
                    }
                    return;
                }
                LogUtil.a("DoublePhoneActivity", "notifyDevice error command id:", Byte.valueOf(b2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<eew> list) {
        if (list == null || list.size() <= 0) {
            LogUtil.j("DoublePhoneActivity", "tlvList is empty.");
            return;
        }
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) != 127) {
                LogUtil.j("DoublePhoneActivity", "parseNotifyDevice get wrong code.");
            } else {
                LogUtil.a("DoublePhoneActivity", "parseNotifyDevice get error code. : " + CommonUtil.v(eewVar.b()));
            }
        }
    }

    private void e() {
        this.f24326b.e(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.doublephone.DoublePhoneActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DoublePhoneActivity", "getDevicePhoneInfo errCode is ", Integer.valueOf(i), " objData is ", obj);
                DoublePhoneActivity.this.d();
                if (i != 0 || obj == null) {
                    return;
                }
                byte[] bArr = (byte[]) obj;
                if (bArr.length <= 1) {
                    return;
                }
                byte b2 = bArr[1];
                if (b2 == 36) {
                    String strE = eeq.e(bArr);
                    if (strE.length() > 4) {
                        try {
                            DoublePhoneActivity.this.c(new eet().b(strE.substring(4, strE.length())).b());
                            LogUtil.a("DoublePhoneActivity", "mConnectedPhoneNames : " + DoublePhoneActivity.this.e.toString());
                            DoublePhoneActivity.this.q.post(new Runnable() { // from class: com.huawei.ui.device.activity.doublephone.DoublePhoneActivity.5.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    DoublePhoneActivity.this.o();
                                }
                            });
                            return;
                        } catch (eeu unused) {
                            LogUtil.e("DoublePhoneActivity", "getDevicePhoneInfo TlvException");
                            return;
                        }
                    }
                    return;
                }
                LogUtil.a("DoublePhoneActivity", "getDevicePhoneInfo error command id:", Byte.valueOf(b2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<ees> list) {
        if (list != null && list.size() > 0) {
            LogUtil.a("DoublePhoneActivity", "parsePhoneName tlvFatherList.size() : ", Integer.valueOf(list.size()));
            Iterator<ees> it = list.iterator();
            while (it.hasNext()) {
                List<ees> listB = it.next().b();
                if (listB != null && listB.size() > 0) {
                    Iterator<ees> it2 = listB.iterator();
                    while (it2.hasNext()) {
                        a(it2.next());
                    }
                }
            }
        }
    }

    private void a(ees eesVar) {
        List<eew> listE = eesVar.e();
        if (listE == null || listE.size() <= 0) {
            return;
        }
        String strD = null;
        for (eew eewVar : listE) {
            if (CommonUtil.v(eewVar.e()) == 3) {
                strD = eeq.d(eewVar.b());
            } else {
                LogUtil.j("DoublePhoneActivity", "parsePhoneNameSub default.");
            }
            d(strD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.k.getVisibility() == 0) {
            return;
        }
        synchronized (this.n) {
            List<String> list = this.e;
            if (list != null && list.size() == 2) {
                this.h.setVisibility(0);
                this.m.setVisibility(8);
                if (this.e.size() > 1) {
                    this.r.setText(this.e.get(0));
                    this.p.setText(this.e.get(1));
                }
            } else {
                this.h.setVisibility(8);
                this.m.setVisibility(0);
                LogUtil.j("DoublePhoneActivity", "mConnectedPhoneNames is NULL or mConnectedPhoneNames.size is not 2");
            }
        }
    }

    private void h() {
        try {
            IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            BroadcastManagerUtil.c(this, this.f24325a, intentFilter, LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            LogUtil.e("DoublePhoneActivity", "registerBroadcast IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.n) {
            this.e.clear();
        }
    }

    private void d(String str) {
        synchronized (this.n) {
            this.e.add(str);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
