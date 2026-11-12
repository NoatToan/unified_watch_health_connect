package com.huawei.ui.device.activity.finddevice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import defpackage.edl;
import defpackage.eeg;
import defpackage.eep;
import defpackage.eeq;
import defpackage.eey;
import defpackage.lvi;
import defpackage.lxd;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes16.dex */
public class FindDeviceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f24368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f24369b;
    private boolean d;
    private LinearLayout f;
    private DeviceInfo g;
    private HealthTextView h;
    private LinearLayout i;
    private ImageView j;
    private FindDeviceDynamicImageView k;
    private ImageView l;
    private HealthTextView m;
    private ImageView n;
    private String p;
    private HealthTextView q;
    private NoTitleCustomAlertDialog r;
    private String s;
    private RelativeLayout t;
    private String u;
    private ImageView v;
    private HealthTextView x;
    private String y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f24370c = null;
    private final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("FindDeviceActivity", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.j("FindDeviceActivity", "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            LogUtil.a("FindDeviceActivity", "mDeviceStatusReceiver onReceive action :", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
                if (deviceInfo == null || FindDeviceActivity.this.g == null || !deviceInfo.getDeviceIdentify().equals(FindDeviceActivity.this.g.getDeviceIdentify())) {
                    LogUtil.j("FindDeviceActivity", "mDeviceStatusReceiver not current device");
                    return;
                }
                lxd.b().c();
                LogUtil.a("FindDeviceActivity", "device connectionState is ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                if (deviceInfo.getDeviceConnectState() != 2) {
                    FindDeviceActivity.this.h();
                } else if (deviceInfo.getDeviceConnectState() == 2) {
                    FindDeviceActivity.this.f();
                }
            }
        }
    };
    private Handler e = new Handler() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("FindDeviceActivity", "handleMessage message is null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 2) {
                FindDeviceActivity.this.k();
                if (!FindDeviceActivity.this.d) {
                    FindDeviceActivity.this.x.setText(R.string.IDS_watch_vibrating);
                    return;
                } else {
                    FindDeviceActivity.this.x.setText(R.string.IDS_bolt_ringing);
                    return;
                }
            }
            if (i == 3) {
                FindDeviceActivity.this.l();
                return;
            }
            if (i == 4) {
                FindDeviceActivity.this.a(4);
            } else if (i == 5) {
                FindDeviceActivity.this.x.setText("");
            } else {
                LogUtil.j("FindDeviceActivity", "handler message default");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f24369b.setVisibility(8);
        this.v.setVisibility(0);
        this.t.setAlpha(1.0f);
        this.t.setClickable(true);
        this.i.setAlpha(1.0f);
        this.i.setClickable(true);
        if (!this.d) {
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
        } else {
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_available));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_available));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.r;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.r.dismiss();
        }
        this.l.setVisibility(8);
        this.k.setVisibility(8);
        this.v.setVisibility(0);
        this.f24369b.setVisibility(0);
        this.x.setText("");
        this.q.setText(this.g.getDeviceName());
        if (!this.d) {
            this.m.setText(this.p);
            this.h.setText(this.p);
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
        } else {
            this.m.setText(this.s);
            this.h.setText(this.s);
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_not_available));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_not_available));
        }
        this.t.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_home_click_bg));
        this.m.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimary));
        this.h.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimary));
        this.t.setAlpha(0.4f);
        this.t.setClickable(false);
        this.i.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_find_click_bg));
        this.i.setAlpha(0.4f);
        this.i.setClickable(false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24370c = this;
        LogUtil.a("FindDeviceActivity", "onCreate()");
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("FindDeviceActivity", "onCreate intent is null");
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("device");
        if (parcelableExtra instanceof DeviceInfo) {
            this.g = (DeviceInfo) parcelableExtra;
        }
        if (this.g == null) {
            LogUtil.j("FindDeviceActivity", "onCreate mDeviceInfo is null");
            return;
        }
        setContentView(R.layout.activity_find_device);
        a();
        lxd.b().c();
        c();
        if (this.g.getDeviceConnectState() == 2) {
            f();
            i();
        } else {
            h();
        }
    }

    private void c() {
        LogUtil.a("FindDeviceActivity", "Enter initView!");
        this.m = (HealthTextView) qsp.a(this, R.id.device_find);
        this.v = (ImageView) qsp.a(this, R.id.picture);
        this.l = (ImageView) qsp.a(this, R.id.dynamic_picture);
        this.q = (HealthTextView) qsp.a(this, R.id.device_name);
        this.x = (HealthTextView) qsp.a(this, R.id.device_tips);
        this.k = (FindDeviceDynamicImageView) qsp.a(this, R.id.scan_radar);
        this.t = (RelativeLayout) qsp.a(this, R.id.device_find_all);
        this.f24368a = (LinearLayout) qsp.a(this, R.id.device_find_double_menu);
        this.i = (LinearLayout) qsp.a(this, R.id.device_layout_operate);
        this.j = (ImageView) qsp.a(this, R.id.device_find_status);
        this.h = (HealthTextView) qsp.a(this, R.id.device_find_operate);
        this.f = (LinearLayout) qsp.a(this, R.id.device_layout_location);
        if (FindNetworkUtils.c(this.g, this.f24370c)) {
            this.t.setVisibility(8);
            this.f24368a.setVisibility(0);
        } else {
            this.t.setVisibility(0);
            this.f24368a.setVisibility(8);
        }
        this.n = (ImageView) qsp.a(this, R.id.icon);
        this.f24369b = (RelativeLayout) qsp.a(this, R.id.find_error_layout);
        b();
        this.v.setVisibility(0);
        this.q.setText(this.g.getDeviceName());
        boolean z = !eey.d(this.g, TsExtractor.TS_STREAM_TYPE_E_AC3);
        this.d = z;
        LogUtil.a("FindDeviceActivity", "isDeviceSupportSpeaker: ", Boolean.valueOf(z));
        this.s = this.f24370c.getResources().getString(R.string.IDS_bolt_button_ring);
        this.u = this.f24370c.getResources().getString(R.string.IDS_bolt_button_stop_ring);
        this.p = this.f24370c.getResources().getString(R.string.IDS_rope_vibrate);
        this.y = this.f24370c.getResources().getString(R.string.IDS_find_watch_stop_vibrates);
        if (!this.d) {
            this.m.setText(this.p);
            this.h.setText(this.p);
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
        } else {
            this.m.setText(this.s);
            this.h.setText(this.s);
        }
        e();
    }

    private void e() {
        this.t.setOnClickListener(new View.OnClickListener() { // from class: qvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: qvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: qvf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46899b.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        if (qrs.r()) {
            LogUtil.j("FindDeviceActivity", "location onClick isFastClick");
        } else if (this.g != null) {
            FindNetworkUtils.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (qrs.r()) {
            LogUtil.j("FindDeviceActivity", "onClick isFastClick");
            return;
        }
        String string = this.m.getText().toString();
        if (this.s.equalsIgnoreCase(string) || this.p.equalsIgnoreCase(string)) {
            if (this.d) {
                j();
                return;
            } else {
                n();
                return;
            }
        }
        if (this.u.equalsIgnoreCase(string) || this.y.equalsIgnoreCase(string)) {
            a(1);
        } else {
            LogUtil.j("FindDeviceActivity", "onClick error content");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.l.setVisibility(8);
        this.k.setVisibility(8);
        this.v.setVisibility(0);
        this.q.setText(this.g.getDeviceName());
        this.x.setText("");
        if (!this.d) {
            this.m.setText(this.p);
            this.h.setText(this.p);
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration_stop));
        } else {
            this.m.setText(this.f24370c.getResources().getString(R.string.IDS_bolt_button_ring));
            this.h.setText(this.f24370c.getResources().getString(R.string.IDS_bolt_button_ring));
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_available));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_available));
        }
        this.t.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_home_click_bg));
        this.i.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_find_click_bg));
        this.m.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimary));
        this.h.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimary));
        if (1 == i) {
            i();
        }
    }

    private void b() {
        DeviceInfo deviceInfo = this.g;
        if (deviceInfo == null) {
            LogUtil.j("FindDeviceActivity", "deviceInfo is null");
            return;
        }
        if (lvi.n(deviceInfo.getProductType())) {
            String strJ = lvi.j(this.g.getProductType());
            LogUtil.a("FindDeviceActivity", "is plugin download uuid:", strJ);
            boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
            LogUtil.a("FindDeviceActivity", "is plugin download pluginAvaiable:", Boolean.valueOf(zIsResourcesAvailable));
            if (zIsResourcesAvailable) {
                d(strJ);
                return;
            } else {
                g();
                return;
            }
        }
        g();
    }

    private void d(String str) {
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid != null) {
            String strE = eep.e(pluginInfoByUuid, 2, this.g);
            LogUtil.a("FindDeviceActivity", "is plugin download image:", strE);
            Bitmap bitmapLoadImageByImageName = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strE);
            this.v.setImageBitmap(bitmapLoadImageByImageName);
            this.l.setImageBitmap(bitmapLoadImageByImageName);
            return;
        }
        g();
    }

    private void g() {
        if (lvi.f(this.g.getProductType())) {
            this.v.setImageResource(R.mipmap.device_icon_band_default_new);
        } else {
            this.v.setImageResource(R.mipmap.device_icon_watch_default_new);
        }
    }

    private void j() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f24370c).b(R.string.IDS_bolt_device_maximum_volume_playback).a(R.string.IDS_bolt_button_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (FindDeviceActivity.this.r == null || !FindDeviceActivity.this.r.isShowing()) {
                    return;
                }
                FindDeviceActivity.this.r.dismiss();
            }
        }).c(R.string.IDS_bolt_button_playback, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FindDeviceActivity.this.n();
            }
        }).c();
        this.r = noTitleCustomAlertDialogC;
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        this.r.setCancelable(false);
        this.r.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        k();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.v.setVisibility(8);
        this.l.setVisibility(0);
        this.k.setVisibility(0);
        this.k.d();
        this.q.setText(this.g.getDeviceName());
        if (!this.d) {
            this.m.setText(this.y);
            this.h.setText(this.y);
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration));
        } else {
            this.m.setText(this.f24370c.getResources().getString(R.string.IDS_bolt_button_stop_ring));
            this.h.setText(this.f24370c.getResources().getString(R.string.IDS_bolt_button_stop_ring));
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_enable));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_enable));
        }
        this.t.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_home_orange_bg));
        this.i.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_find_orange_bg));
        this.m.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimaryInverse));
        this.h.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimaryInverse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.v.setVisibility(0);
        this.q.setText(R.string.IDS_bolt_respond_fail);
        this.x.setText(R.string.IDS_bolt_restart_phone_bluetooth_find);
        if (!this.d) {
            this.m.setText(this.p);
            this.h.setText(this.p);
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.drawable.icon_watch_vibration));
        } else {
            this.m.setText(this.f24370c.getResources().getString(R.string.IDS_bolt_button_ring));
            this.h.setText(this.f24370c.getResources().getString(R.string.IDS_bolt_button_ring));
            this.n.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_not_available));
            this.j.setBackground(this.f24370c.getResources().getDrawable(R.mipmap.ring_not_available));
        }
        this.t.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_home_click_bg));
        this.m.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimary));
        this.h.setTextColor(this.f24370c.getResources().getColor(R.color.textColorPrimary));
        this.t.setAlpha(0.4f);
        this.t.setClickable(false);
        this.i.setBackground(this.f24370c.getResources().getDrawable(R.drawable.wear_find_click_bg));
        this.i.setAlpha(0.4f);
        this.i.setClickable(false);
    }

    private void d() {
        LogUtil.a("FindDeviceActivity", "sendFindDeviceCommand enter");
        lxd.b().b(this.g, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("FindDeviceActivity", "onCreate sendFindDeviceCommand onResponse errorCode,", Integer.valueOf(i));
                if (i == 100000 && (obj instanceof eeg)) {
                    eeg eegVar = (eeg) obj;
                    int iV = CommonUtil.v(eeq.e(eegVar.e()));
                    LogUtil.a("FindDeviceActivity", "onCreate onResponse,", Integer.valueOf(eegVar.d()), Integer.valueOf(iV));
                    if (eegVar.d() == 2) {
                        if (iV == 0) {
                            FindDeviceActivity.this.e.sendEmptyMessage(2);
                            return;
                        } else {
                            FindDeviceActivity.this.e.sendEmptyMessage(3);
                            return;
                        }
                    }
                    if (eegVar.d() == 4) {
                        FindDeviceActivity.this.e.sendEmptyMessage(4);
                        return;
                    } else {
                        LogUtil.j("FindDeviceActivity", "sendFindDeviceCommand else");
                        return;
                    }
                }
                LogUtil.a("FindDeviceActivity", "sendFindDeviceCommand showResponseFailedDialog");
            }
        });
    }

    private void i() {
        LogUtil.a("FindDeviceActivity", "sendStopDeviceCommand enter");
        lxd.b().e(this.g, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceActivity.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("FindDeviceActivity", "showDialog sendStopFindDeviceCommand onResponse errorCode,", Integer.valueOf(i));
                if (i == 100000 && (obj instanceof eeg)) {
                    eeg eegVar = (eeg) obj;
                    int iV = CommonUtil.v(eeq.e(eegVar.e()));
                    LogUtil.a("FindDeviceActivity", "showDialog onResponse,", Integer.valueOf(eegVar.d()), Integer.valueOf(iV));
                    if (eegVar.d() == 1) {
                        if (iV != 0) {
                            FindDeviceActivity.this.e.sendEmptyMessage(3);
                            return;
                        } else {
                            LogUtil.a("FindDeviceActivity", "sendStopDeviceCommand success");
                            FindDeviceActivity.this.e.sendEmptyMessage(5);
                            return;
                        }
                    }
                    return;
                }
                LogUtil.j("FindDeviceActivity", "sendStopDeviceCommand showResponseFailedDialog");
            }
        });
    }

    private void a() {
        BroadcastManagerUtil.c(this.f24370c, this.o, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void m() {
        try {
            LogUtil.a("FindDeviceActivity", "Enter unregisterBindDeviceBroadcast()!");
            unregisterReceiver(this.o);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("FindDeviceActivity", "unregisterBindDeviceBroadcast failed");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("FindDeviceActivity", "onResume()");
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        FindDeviceDynamicImageView findDeviceDynamicImageView = this.k;
        if (findDeviceDynamicImageView != null && findDeviceDynamicImageView.getVisibility() == 0) {
            i();
            this.e.sendEmptyMessage(4);
        }
        lxd.b().a();
        super.onDestroy();
        LogUtil.a("FindDeviceActivity", "onDestroy()");
        m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
