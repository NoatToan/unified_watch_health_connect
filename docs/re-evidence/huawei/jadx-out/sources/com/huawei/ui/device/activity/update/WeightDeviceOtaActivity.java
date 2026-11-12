package com.huawei.ui.device.activity.update;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.views.device.RoundProgressImageView;
import defpackage.dmp;
import defpackage.dnf;
import defpackage.dof;
import defpackage.doq;
import defpackage.dre;
import defpackage.drw;
import defpackage.dti;
import defpackage.dxm;
import defpackage.elh;
import defpackage.elx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcz;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class WeightDeviceOtaActivity extends BaseActivity implements View.OnClickListener {
    private static int e = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f24838a;
    private String aa;
    private LinearLayout ab;
    private HealthTextView ac;
    private int ad;
    private a af;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f24839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f24840c;
    private HealthTextView d;
    private HealthButton f;
    private ContentValues g;
    private File h;
    private ImageView m;
    private boolean o;
    private boolean p;
    private boolean q;
    private LinearLayout r;
    private LinearLayout s;
    private rcz t;
    private String u;
    private RoundProgressImageView v;
    private HealthTextView w;
    private HealthTextView x;
    private RelativeLayout y;
    private HealthTextView z;
    private Context i = null;
    private PowerManager.WakeLock ai = null;
    private boolean n = false;
    private boolean l = false;
    private EventBus.ICallback j = new EventBus.ICallback() { // from class: com.huawei.ui.device.activity.update.WeightDeviceOtaActivity.4
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            Intent intentC = dVar.c();
            if (intentC == null) {
                LogUtil.j("DeviceOtaActivity", "update intent == null");
                return;
            }
            if ("upgrade_update_status".equals(dVar.e())) {
                int intExtra = intentC.getIntExtra("update_status", 0);
                if (intExtra == 0) {
                    if (!WeightDeviceOtaActivity.this.n) {
                        WeightDeviceOtaActivity.this.g();
                        LogUtil.a("DeviceOtaActivity", "update success.");
                        return;
                    } else {
                        LogUtil.j("DeviceOtaActivity", "is already failed,do not update pages.");
                        return;
                    }
                }
                if (intExtra == 2) {
                    LogUtil.j("DeviceOtaActivity", "update fail. CS error");
                    WeightDeviceOtaActivity.this.b(2);
                    return;
                } else {
                    LogUtil.j("DeviceOtaActivity", "update fail");
                    WeightDeviceOtaActivity.this.d(intExtra);
                    return;
                }
            }
            if ("upgrade_update_progress".equals(dVar.e())) {
                if (!WeightDeviceOtaActivity.this.n) {
                    rcz rczVar = WeightDeviceOtaActivity.this.t;
                    rcz unused = WeightDeviceOtaActivity.this.t;
                    rczVar.e(11);
                    WeightDeviceOtaActivity.this.c(intentC.getIntExtra("update_progress", 0));
                    return;
                }
                LogUtil.j("DeviceOtaActivity", "mEventCallback is already failed");
                return;
            }
            if ("set_scale_version_code".equals(dVar.e())) {
                WeightDeviceOtaActivity.this.n = false;
                WeightDeviceOtaActivity.this.m();
            } else {
                LogUtil.j("DeviceOtaActivity", "no action: ", dVar.e());
            }
        }
    };
    private IHealthDeviceCallback k = new IHealthDeviceCallback() { // from class: com.huawei.ui.device.activity.update.WeightDeviceOtaActivity.2
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
            LogUtil.a("DeviceOtaActivity", "onDataChanged");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
            LogUtil.a("DeviceOtaActivity", "onDataChanged list");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
            LogUtil.a("DeviceOtaActivity", "onProgressChanged");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            WeightDeviceOtaActivity.this.e(healthDevice, i);
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
            LogUtil.j("DeviceOtaActivity", "onFailed");
        }
    };

    static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<WeightDeviceOtaActivity> f24844a;

        a(WeightDeviceOtaActivity weightDeviceOtaActivity) {
            this.f24844a = new WeakReference<>(weightDeviceOtaActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            WeightDeviceOtaActivity weightDeviceOtaActivity = this.f24844a.get();
            if (weightDeviceOtaActivity == null) {
                LogUtil.j("DeviceOtaActivity", "handleMessage activity is null");
                return;
            }
            int i = message.what;
            if (i == 4) {
                if (message.arg1 >= 100) {
                    message.arg1 = 99;
                }
                weightDeviceOtaActivity.a(message.arg1);
            } else {
                if (i != 5) {
                    if (i != 6) {
                        LogUtil.j("DeviceOtaActivity", "else msg");
                        return;
                    } else {
                        LogUtil.a("DeviceOtaActivity", "MSG_UPGRADE_FAILED msg.arg1: ", Integer.valueOf(message.arg1));
                        weightDeviceOtaActivity.e(a(message, weightDeviceOtaActivity));
                        return;
                    }
                }
                if (!weightDeviceOtaActivity.n) {
                    weightDeviceOtaActivity.t.e();
                    weightDeviceOtaActivity.i();
                    LogUtil.a("DeviceOtaActivity", "MSG_UPGRADE_SUCCESS");
                    return;
                }
                LogUtil.a("DeviceOtaActivity", "is already failed");
            }
        }

        private String a(Message message, WeightDeviceOtaActivity weightDeviceOtaActivity) {
            int i = message.arg1;
            if (i == 1) {
                return String.format(Locale.ENGLISH, weightDeviceOtaActivity.i.getString(R.string.IDS_settings_firmware_upgrade_band_upgrade_timeout), rcz.c().m());
            }
            if (i == 1002) {
                return weightDeviceOtaActivity.i.getString(R.string.IDS_settings_firmware_upgrade_crc_check_failed);
            }
            if (i == 4) {
                LogUtil.a("DeviceOtaActivity", "battery: ", UnitUtil.e(WeightDeviceOtaActivity.e, 2, 0));
                return weightDeviceOtaActivity.i.getResources().getString(R.string.IDS_settings_firmware_upgrade_replace_battery);
            }
            if (i != 5) {
                switch (i) {
                    case 104007:
                        return weightDeviceOtaActivity.i.getString(R.string.IDS_music_management_disconnection);
                    case 104008:
                        return weightDeviceOtaActivity.i.getString(R.string.IDS_device_wifi_ota_activation_prompt_msg);
                    default:
                        return weightDeviceOtaActivity.i.getString(R.string.IDS_settings_firmware_upgrade_talk_band_failed);
                }
            }
            return weightDeviceOtaActivity.i.getString(R.string.IDS_settings_firmware_upgrade_file_not_exist);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthDevice healthDevice, int i) {
        if (isFinishing()) {
            LogUtil.j("DeviceOtaActivity", "activity has finished");
            return;
        }
        LogUtil.a("DeviceOtaActivity", "onStatusChanged ", healthDevice == null ? "" : healthDevice.getDeviceName(), ", status: ", Integer.valueOf(i));
        if (i == 3) {
            this.l = false;
            int iR = this.t.r();
            rcz rczVar = this.t;
            if (iR == 12 || rczVar.r() == 14) {
                LogUtil.a("DeviceOtaActivity", "no show fail view");
                return;
            }
            a aVar = this.af;
            if (aVar == null || this.ad >= 100) {
                return;
            }
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = 6;
            messageObtainMessage.arg1 = 104007;
            this.af.sendMessage(messageObtainMessage);
            return;
        }
        if (i != 2) {
            if (i == 14) {
                this.q = true;
                return;
            } else if (i == 13) {
                this.q = false;
                return;
            } else {
                LogUtil.j("DeviceOtaActivity", "onStatusChanged default");
                return;
            }
        }
        this.l = true;
        if (this.n) {
            LogUtil.a("DeviceOtaActivity", "is already failed, do nothing.");
            if (dxm.ai(this.u) || dxm.q(this.u)) {
                this.f.getBackground().setAlpha(150);
                this.f.setClickable(false);
                this.f.setTextColor(872113442);
                return;
            }
            return;
        }
        if (!dxm.ai(this.u)) {
            m();
        }
        a aVar2 = this.af;
        if (aVar2 == null || this.ad >= 100) {
            return;
        }
        Message messageObtainMessage2 = aVar2.obtainMessage();
        messageObtainMessage2.what = 4;
        messageObtainMessage2.arg1 = 0;
        this.af.sendMessage(messageObtainMessage2);
        this.t.e(-1);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = this;
        LogUtil.a("DeviceOtaActivity", "onCreate()");
        Intent intent = getIntent();
        if (intent != null) {
            this.u = intent.getStringExtra("productId");
            ContentValues contentValues = (ContentValues) intent.getParcelableExtra("commonDeviceInfo");
            this.g = contentValues;
            if (contentValues != null) {
                this.aa = contentValues.getAsString("uniqueId");
            }
            if (TextUtils.isEmpty(this.u)) {
                LogUtil.j("DeviceOtaActivity", "mProductId is null");
                finish();
                return;
            }
            rcz rczVarC = rcz.c();
            this.t = rczVarC;
            rczVarC.g(this.u);
            this.p = intent.getBooleanExtra("isUpdateDialog", false);
            this.o = intent.getBooleanExtra("fromsetting", false);
            if (!this.t.b(this.t.k())) {
                LogUtil.j("DeviceOtaActivity", "Abnormal startup activity and otaFilePath is not exist.");
                finish();
                return;
            }
            this.af = new a(this);
            setContentView(R.layout.activity_device_ota);
            e();
            dre.a().b(true);
            a();
            h();
            EventBus.b(this.j, 0, "upgrade_update_status", "upgrade_update_progress", "set_scale_version_code");
            EventBus.a(new EventBus.d("get_scale_version_code"));
            return;
        }
        LogUtil.j("DeviceOtaActivity", "intent is null");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        rcz rczVar = this.t;
        if (rczVar != null) {
            rczVar.e(12);
            c(100);
            this.n = false;
            Message messageObtainMessage = this.af.obtainMessage();
            messageObtainMessage.what = 5;
            this.af.sendMessage(messageObtainMessage);
            if (this.h != null) {
                this.t.a();
                try {
                    a(this.h.getCanonicalPath());
                } catch (IOException unused) {
                    LogUtil.e("DeviceOtaActivity", "showSuccess IOException");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int iR = this.t.r();
        rcz rczVar = this.t;
        if (iR == 12 || iR == 14 || iR == 11) {
            if (this.ad == 100 && iR == 11) {
                n();
                return;
            } else {
                LogUtil.j("DeviceOtaActivity", "no startTransferOtaFile");
                return;
            }
        }
        if (this.af == null || rczVar.t()) {
            return;
        }
        n();
    }

    private void a() {
        MeasurableDevice measurableDeviceB;
        Bundle bundle = new Bundle();
        bundle.putInt("type", -1);
        bundle.putString("productId", this.u);
        if (!TextUtils.isEmpty(this.aa)) {
            measurableDeviceB = dmp.d().b(this.aa, false);
        } else {
            measurableDeviceB = dmp.d().b(this.u);
        }
        if (this.u == null) {
            LogUtil.j("DeviceOtaActivity", "getConnectedStatus error productId is null");
            return;
        }
        elh elhVarD = ResourceManager.c().d(this.u);
        if (elhVarD == null) {
            LogUtil.j("DeviceOtaActivity", "getConnectedStatus error productInfo is null");
            return;
        }
        MeasureKit measureKitA = dnf.e().a(elhVarD.q());
        if (measureKitA == null) {
            return;
        }
        MeasureController measureController = measureKitA.getMeasureController();
        if (measureController != null && measurableDeviceB != null) {
            measureController.prepare(measurableDeviceB, this.k, bundle);
        } else {
            LogUtil.j("DeviceOtaActivity", "getConnectedStatus() control or device is null.");
        }
    }

    private boolean a(String str) {
        String[] list;
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (list = file.list()) == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < list.length; i++) {
            File file2 = str.endsWith(File.separator) ? new File(str + list[i]) : new File(str + File.separator + list[i]);
            if (file2.isFile() && !file2.delete()) {
                LogUtil.j("DeviceOtaActivity", "temp.delete() fail");
            }
            if (file2.isDirectory()) {
                a(str + "/" + list[i]);
                d(str + "/" + list[i]);
                z = true;
            }
        }
        return z;
    }

    private void d(String str) {
        a(str);
        File file = new File(str);
        if (!file.exists() || file.delete()) {
            return;
        }
        LogUtil.j("DeviceOtaActivity", "myFilePath.delete() fail");
    }

    private void e() {
        LogUtil.a("DeviceOtaActivity", "Enter initView");
        this.n = false;
        this.v = (RoundProgressImageView) qsp.a(this, R.id.center_ota_circle);
        this.y = (RelativeLayout) qsp.a(this, R.id.rele_percent_ota);
        this.w = (HealthTextView) qsp.a(this, R.id.text_percent);
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.text_per_sign);
        this.x = healthTextView;
        healthTextView.setText("%");
        this.x.setVisibility(8);
        this.d = (HealthTextView) qsp.a(this, R.id.text_circle_tip);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.rela_ota_failed);
        this.s = linearLayout;
        linearLayout.setVisibility(8);
        this.f24839b = (HealthTextView) qsp.a(this, R.id.text_device_version_num);
        this.f24838a = (HealthTextView) qsp.a(this, R.id.text_device_version_size);
        this.ab = (LinearLayout) qsp.a(this, R.id.lin_tip);
        this.z = (HealthTextView) qsp.a(this, R.id.text_tip);
        this.ac = (HealthTextView) qsp.a(this, R.id.text_tip_content);
        this.m = (ImageView) qsp.a(this, R.id.imageview_line);
        this.r = (LinearLayout) qsp.a(this, R.id.lin_new_feature);
        this.f24840c = (HealthTextView) qsp.a(this, R.id.text_new_feature_content);
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.button);
        this.f = healthButton;
        healthButton.setOnClickListener(this);
        ((CustomTitleBar) qsp.a(this, R.id.update_title)).setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightDeviceOtaActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeightDeviceOtaActivity.this.onBackPressed();
            }
        });
        this.ac.setTextColor(this.i.getResources().getColor(R.color.health_heart_wear_ota_text_color));
        String string = this.i.getString(R.string.IDS_settings_firmware_upgrade_transfer_details);
        if (qrs.ah(BaseApplication.getContext())) {
            string = this.i.getString(R.string.IDS_pad_upgrade_details);
        }
        this.ac.setText(String.format(Locale.ENGLISH, string, this.t.p()));
        this.f24840c.setText(this.t.i());
        this.f24839b.setText(this.t.g());
        this.f24838a.setText(qrs.a(this.i, this.t.h()));
        e = 30;
        LogUtil.a("DeviceOtaActivity", "batteryPercent: ", 30);
        f();
        this.t.e(-1);
    }

    private void f() {
        this.y.setVisibility(0);
        this.ab.setVisibility(0);
        this.z.setText(this.i.getString(R.string.IDS_service_area_notice_title));
        this.d.setText(R.string.IDS_ota_update_state_upgrading_new);
        this.m.setVisibility(0);
        this.r.setVisibility(0);
        this.s.setVisibility(8);
        a(0);
        this.ac.setTextColor(this.i.getResources().getColor(R.color.health_heart_wear_ota_text_color));
        String string = this.i.getString(R.string.IDS_settings_firmware_upgrade_transfer_details);
        if (qrs.ah(BaseApplication.getContext())) {
            string = this.i.getString(R.string.IDS_pad_upgrade_details);
        }
        this.ac.setText(String.format(Locale.ENGLISH, string, this.t.p()));
        this.t.e(0);
        this.f.getBackground().setAlpha(150);
        this.f.setClickable(false);
        this.f.setTextColor(872113442);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.d.setText(R.string.IDS_ota_update_state_upgrading_new);
        this.w.setText(UnitUtil.b(this.i, "[\\d]", UnitUtil.e(i, 2, 0), R.style.percent_number_style_num, R.style.percent_number_style_sign));
        if (this.y.getVisibility() == 8) {
            f();
        }
        this.v.e(i);
        this.ad = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (this.i == null || this.n) {
            LogUtil.j("DeviceOtaActivity", "showOtaErrorMsg error, contentText: ", str, " mIsFailed: ", Boolean.valueOf(this.n));
            return;
        }
        this.n = true;
        this.t.d((Boolean) false);
        a(0);
        this.y.setVisibility(8);
        this.s.setVisibility(0);
        this.z.setText(R.string.IDS_settings_firmware_upgrade_talk_band_failed);
        this.ac.setTextColor(-301790);
        this.ac.setText(str);
        this.t.e(0);
        this.f.getBackground().setAlpha(255);
        this.f.setClickable(true);
        this.f.setTextColor(-301790);
        this.f.setText(R.string.IDS_retry);
        d();
        this.t.b((Boolean) false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        if (this.o) {
            return;
        }
        if (!TextUtils.isEmpty(this.aa)) {
            dti.d(this, this.u, this.aa).onResume();
        } else {
            dti.c(this, this.u).onResume();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
    }

    private void n() {
        if (dxm.a(this.u, this.aa)) {
            l();
            return;
        }
        if (dxm.ag(this.u)) {
            k();
            return;
        }
        if (this.l && this.q) {
            String strK = this.t.k();
            elx.a().c(strK, null, this.i.getFilesDir() + "", new ResourceFileListener() { // from class: com.huawei.ui.device.activity.update.WeightDeviceOtaActivity.5
                @Override // com.huawei.health.device.manager.ResourceFileListener
                public void onResult(int i, String str) {
                    if (i != 200) {
                        LogUtil.j("DeviceOtaActivity", "unUpdateZip-->onResult() resultCode: ", Integer.valueOf(i));
                        return;
                    }
                    LogUtil.a("DeviceOtaActivity", "file dir name: ", str);
                    WeightDeviceOtaActivity.this.h = new File(WeightDeviceOtaActivity.this.i.getFilesDir() + File.separator + str);
                    if (WeightDeviceOtaActivity.this.h.isDirectory()) {
                        File[] fileArrListFiles = WeightDeviceOtaActivity.this.h.listFiles();
                        Intent intent = new Intent();
                        if (fileArrListFiles == null || fileArrListFiles.length != 2) {
                            Message messageObtainMessage = WeightDeviceOtaActivity.this.af.obtainMessage();
                            messageObtainMessage.what = 6;
                            messageObtainMessage.arg1 = 5;
                            WeightDeviceOtaActivity.this.af.sendMessage(messageObtainMessage);
                            return;
                        }
                        for (File file : fileArrListFiles) {
                            WeightDeviceOtaActivity.this.a(file, intent);
                        }
                        WeightDeviceOtaActivity.this.t.d((Boolean) true);
                        EventBus.a(new EventBus.d("weight_device_ota_update", intent));
                        return;
                    }
                    LogUtil.j("DeviceOtaActivity", "is not directory");
                }
            }, true);
            return;
        }
        LogUtil.j("DeviceOtaActivity", "scale device not wake up");
        d(104008);
    }

    private void l() {
        this.t.d((Boolean) true);
        Intent intent = new Intent();
        intent.putExtra("scaleUniqueId", this.aa);
        intent.putExtra("scaleNewVersion", this.t.f());
        intent.putExtra("scaleFilePath", this.t.k());
        EventBus.a(new EventBus.d("weight_device_tlv_ota_update", intent));
    }

    private void k() {
        String strK = this.t.k();
        Intent intent = new Intent();
        intent.putExtra("scalePath", strK);
        EventBus.a(new EventBus.d("weight_device_ota_update", intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, Intent intent) {
        try {
            if (file == null) {
                LogUtil.j("DeviceOtaActivity", "file is null");
                return;
            }
            String canonicalPath = file.getCanonicalPath();
            String canonicalPath2 = new File(this.i.getFilesDir() + File.separator).getCanonicalPath();
            if (TextUtils.isEmpty(canonicalPath) || TextUtils.isEmpty(canonicalPath2) || !canonicalPath.startsWith(canonicalPath2)) {
                return;
            }
            if (!TextUtils.isEmpty(file.getName()) && file.getName().toUpperCase(Locale.ENGLISH).contains(DeviceTypes.SCALE)) {
                intent.putExtra("scalePath", canonicalPath);
            } else {
                intent.putExtra("blePath", canonicalPath);
            }
        } catch (IOException unused) {
            LogUtil.e("DeviceOtaActivity", "canonicalPath IOException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        doq.e().cleanup();
        this.m.setVisibility(8);
        a(100);
        this.f.getBackground().setAlpha(255);
        this.f.setClickable(true);
        this.f.setTextColor(-301790);
        this.f.setText(R.string.IDS_social_clearup_storage_button_finish);
        this.d.setText(R.string.IDS_settings_firmware_upgrade_band_transfer_finish);
        this.ac.setTextColor(this.i.getResources().getColor(R.color.health_heart_wear_ota_text_color));
        this.ac.setText(String.format(Locale.ENGLISH, this.i.getString(R.string.IDS_ota_update_state_finish), this.t.p()));
        this.t.e(14);
        a aVar = this.af;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        d();
        if (!TextUtils.isEmpty(this.aa)) {
            dxm.g(this.aa, "");
        } else {
            dxm.g(this.u, "");
        }
        this.t.e();
        this.t.b((Boolean) true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        rcz rczVar = this.t;
        if (rczVar != null) {
            rczVar.d((Boolean) true);
            LogUtil.a("DeviceOtaActivity", "onFileTransferState percentage = " + i);
            a aVar = this.af;
            if (aVar != null) {
                Message messageObtainMessage = aVar.obtainMessage();
                messageObtainMessage.what = 4;
                messageObtainMessage.arg1 = i;
                this.af.sendMessage(messageObtainMessage);
                return;
            }
            return;
        }
        LogUtil.j("DeviceOtaActivity", "onFileTransferState mOtaInteractors is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("DeviceOtaActivity", "onUpgradeFailed: onUpgradeFailed: ", Integer.valueOf(i));
        rcz rczVar = this.t;
        if (rczVar != null) {
            LogUtil.a("DeviceOtaActivity", "is transfering: ", Boolean.valueOf(rczVar.t()));
            this.t.d((Boolean) false);
        } else {
            LogUtil.j("DeviceOtaActivity", "mOtaInteractors is null");
        }
        a aVar = this.af;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = 6;
            messageObtainMessage.arg1 = i;
            if (i == 4) {
                e = 20;
                LogUtil.a("DeviceOtaActivity", "device ota upgrade threshold value: ", 20);
            }
            this.af.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.a("DeviceOtaActivity", "onFileRespond: checkResult: ", Integer.valueOf(i));
        rcz rczVar = this.t;
        if (rczVar != null) {
            LogUtil.a("DeviceOtaActivity", "is transfering: ", Boolean.valueOf(rczVar.t()));
            this.t.d((Boolean) false);
        } else {
            LogUtil.j("DeviceOtaActivity", "mOtaInteractors is null");
        }
        if (this.af != null) {
            LogUtil.a("DeviceOtaActivity", "DeviceUpgradeCallback, i != 1");
            Message messageObtainMessage = this.af.obtainMessage();
            messageObtainMessage.what = 6;
            messageObtainMessage.arg1 = 1002;
            this.af.sendMessage(messageObtainMessage);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int iR = this.t.r();
        LogUtil.a("DeviceOtaActivity", "onBackPressed() status ", Integer.valueOf(iR));
        if (iR == 0) {
            LogUtil.a("DeviceOtaActivity", "onBackPressed, upgrade fail quit");
            b();
            super.onBackPressed();
        } else {
            if (iR == 14) {
                LogUtil.a("DeviceOtaActivity", "onBackPressed upgrade success quit");
                this.t.s();
                b();
                super.onBackPressed();
                return;
            }
            LogUtil.j("DeviceOtaActivity", "onBackPressed upgrade process invalid");
            j();
        }
    }

    private void j() {
        String string = this.i.getString(R.string.IDS_settings_firmware_upgrade_transfer_details);
        if (qrs.ah(BaseApplication.getContext())) {
            string = this.i.getString(R.string.IDS_pad_upgrade_details);
        }
        new CustomTextAlertDialog.Builder(this.i).a(R.string.IDS_service_area_notice_title).a(String.format(Locale.ENGLISH, string, this.t.p())).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightDeviceOtaActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DeviceOtaActivity", "click negative button");
            }
        }).b().show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d();
        if (!this.o) {
            if (!TextUtils.isEmpty(this.aa)) {
                dti.d(this, this.u, this.aa).onDestroy();
            } else {
                dti.c(this, this.u).onDestroy();
            }
        }
        dre.a().b(false);
        dof.d().d(this.k);
        doq.e().c(this.k);
        try {
            a aVar = this.af;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
                this.af = null;
            }
        } catch (Exception unused) {
            LogUtil.e("DeviceOtaActivity", "onDestroy Exception");
        }
        if (this.t != null) {
            LogUtil.a("DeviceOtaActivity", "onDestroy updateInteractor release");
            this.t.d((Boolean) false);
            this.t.w();
        }
        this.i = null;
        LogUtil.a("DeviceOtaActivity", "onDestroy()");
        EventBus.a(this.j, "upgrade_update_status", "upgrade_update_progress", "set_scale_version_code");
        CommonUtil.d(this.i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("DeviceOtaActivity", "onclick ");
        int id = view.getId();
        if (id == R.id.button) {
            if (this.t.r() == 0) {
                LogUtil.a("DeviceOtaActivity", "STATUS_INITIAL");
                e();
                h();
                a();
                EventBus.a(new EventBus.d("get_scale_version_code"));
                if (this.t.b(this.t.k())) {
                    LogUtil.a("DeviceOtaActivity", "升级文件存在");
                } else {
                    LogUtil.j("DeviceOtaActivity", "升级文件不存在");
                    b();
                    finish();
                }
            }
            if (this.t.r() == 14) {
                LogUtil.a("DeviceOtaActivity", "STATUS_OTA_SUCESS");
                this.t.s();
                b();
                finish();
                return;
            }
            return;
        }
        LogUtil.j("DeviceOtaActivity", "viewId: ", Integer.valueOf(id));
    }

    private void b() {
        HealthDevice healthDeviceB;
        dre.a().b(false);
        dof.d().d(this.k);
        doq.e().c(this.k);
        if (this.u == null || !this.p) {
            return;
        }
        if (!TextUtils.isEmpty(this.aa)) {
            healthDeviceB = dmp.d().b(this.aa, false);
        } else {
            healthDeviceB = drw.e().b(this.u);
        }
        if (healthDeviceB != null) {
            elh elhVarD = ResourceManager.c().d(this.u);
            if (elhVarD == null) {
                LogUtil.j("DeviceOtaActivity", "releaseConnect error because thi productInfo is null");
                return;
            }
            MeasureKit measureKitI = drw.e().i(elhVarD.q());
            if (measureKitI == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("type", -1);
            bundle.putString("productId", this.u);
            bundle.putString("uniqueId", this.aa);
            bundle.putParcelable("commonDeviceInfo", this.g);
            MeasureController measureController = measureKitI.getMeasureController();
            if (measureController != null) {
                measureController.prepare(healthDeviceB, null, bundle);
            }
        }
        if (!TextUtils.isEmpty(this.aa)) {
            drw.e().d(this.u, this.aa, -1);
        } else {
            drw.e().d(this.u, -1);
        }
    }

    private void d() {
        PowerManager.WakeLock wakeLock = this.ai;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        LogUtil.a("DeviceOtaActivity", "releasePower, release wacklock.");
        this.ai.release();
        this.ai = null;
    }

    private void h() {
        if (this.ai != null) {
            LogUtil.j("DeviceOtaActivity", "setPower, mWakeLock is null.");
        } else if (getSystemService("power") instanceof PowerManager) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "DeviceOtaActivity");
            this.ai = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire(600000L);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
