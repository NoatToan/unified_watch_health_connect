package com.huawei.ui.device.activity.update;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.views.device.RoundProgressImageView;
import defpackage.dmp;
import defpackage.dnf;
import defpackage.dof;
import defpackage.doq;
import defpackage.drw;
import defpackage.dti;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.lmf;
import defpackage.nuu;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.ram;
import defpackage.rcz;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class WeightUpdateVersionActivity extends BaseActivity implements View.OnClickListener {
    private boolean aa;
    private HealthTextView ab;
    private boolean ac;
    private boolean ad;
    private LinearLayout ae;
    private HealthTextView af;
    private HealthTextView ag;
    private RoundProgressImageView ah;
    private HealthTextView ai;
    private HealthTextView aj;
    private LinearLayout ak;
    private HealthTextView al;
    private String am;
    private String an;
    private dti aq;
    private rcz as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f24846b;
    private ImageView e;
    private HealthTextView h;
    private CustomTitleBar j;
    private HealthTextView k;
    private RelativeLayout l;
    private ContentValues m;
    private HealthTextView n;
    private HealthTextView o;
    private RelativeLayout p;
    private LinearLayout q;
    private d r;
    private HealthTextView t;
    private HealthDivider y;
    private boolean z;
    private String i = "";
    private Context f = null;
    private boolean u = false;
    private int w = 0;
    private boolean v = false;
    private boolean x = false;
    private CustomTextAlertDialog s = null;
    private CustomTextAlertDialog ap = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTextAlertDialog f24847c = null;
    private final ThreadLocal<Boolean> g = new ThreadLocal<>();
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("WeightUpdateVersionActivity", "onReceive: action = " + action);
            if ("action_app_check_new_version_state".equals(action)) {
                WeightUpdateVersionActivity.this.e(intent);
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IHealthDeviceCallback f24845a = new IHealthDeviceCallback() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.3
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            if (healthDevice != null) {
                LogUtil.a("WeightUpdateVersionActivity", "mCallback onStatusChanged device name is ", healthDevice.getDeviceName());
            }
            LogUtil.a("WeightUpdateVersionActivity", "mCallback onStatusChanged status is ", Integer.valueOf(i));
            if (i == 1 || i == 2) {
                WeightUpdateVersionActivity.this.r.removeMessages(1);
            }
            if (i == 3) {
                if (Boolean.TRUE.equals(WeightUpdateVersionActivity.this.g.get())) {
                    WeightUpdateVersionActivity.this.g.set(false);
                    LogUtil.a("WeightUpdateVersionActivity", "mClickState HWChMeasureController#prepare>onStatusChanged");
                    return;
                } else {
                    WeightUpdateVersionActivity.this.x = false;
                    WeightUpdateVersionActivity.this.r.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
            }
            if (i == 2) {
                WeightUpdateVersionActivity.this.x = true;
                if (!WeightUpdateVersionActivity.this.v) {
                    if (WeightUpdateVersionActivity.this.as != null) {
                        WeightUpdateVersionActivity.this.as.e(WeightUpdateVersionActivity.this.z, WeightUpdateVersionActivity.this.am);
                        WeightUpdateVersionActivity.this.r.sendEmptyMessage(4);
                        WeightUpdateVersionActivity.this.x();
                        return;
                    }
                    return;
                }
                LogUtil.a("WeightUpdateVersionActivity", "is already failed, do nothing.");
                return;
            }
            LogUtil.a("WeightUpdateVersionActivity", "onStatusChanged: status = ", Integer.valueOf(i));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        int intExtra2 = intent.getIntExtra("result", -1);
        String stringExtra = intent.getStringExtra("content");
        LogUtil.a("WeightUpdateVersionActivity", "updateAppState: state = " + intExtra + ", result = " + intExtra2);
        d(intExtra, intExtra2, stringExtra, intent);
        e(intExtra, stringExtra);
        d(intExtra, intExtra2);
    }

    private void d(int i, int i2, String str, Intent intent) {
        switch (i) {
            case 48:
                LogUtil.a("WeightUpdateVersionActivity", "STATE_CHECK_NEW_VERSION_START:mUpdateStatus = " + this.as.r());
                break;
            case 49:
                LogUtil.a("WeightUpdateVersionActivity", "STATE_CHECK_NEW_VERSION_FAILED:mUpdateStatus = " + this.as.r());
                if (this.as.r() == 1) {
                    if (i2 == 0) {
                        LogUtil.a("WeightUpdateVersionActivity", "No New Version");
                        k();
                        this.as.e();
                    } else {
                        a(i2);
                    }
                }
                break;
            case 50:
                LogUtil.a("WeightUpdateVersionActivity", "STATE_CHECK_NEW_VERSION_SUCCESS:mUpdateStatus = " + this.as.r());
                this.as.e(1);
                this.as.e((Boolean) true);
                this.as.a(i2);
                this.as.j(qrs.a(this.f, i2));
                this.i = this.k.getText().toString();
                this.as.a(str);
                LogUtil.a("WeightUpdateVersionActivity", "mCurrentVersion=", this.i, ", mBandNewVersion=", this.as.g());
                this.u = intent.getBooleanExtra("isForced", false);
                this.w = intent.getIntExtra("minAppCode", 0);
                LogUtil.a("WeightUpdateVersionActivity", "check success! mIsForced:" + this.u + " minCode: " + this.w);
                break;
            default:
                LogUtil.a("WeightUpdateVersionActivity", "updateAppStateOne default case " + i);
                break;
        }
    }

    private void e(int i, String str) {
        if (i != 20) {
            switch (i) {
                case 51:
                    LogUtil.a("WeightUpdateVersionActivity", "STATE_FETCH_CHANGELOG_START:mUpdateStatus = " + this.as.r());
                    int iR = this.as.r();
                    rcz rczVar = this.as;
                    if (iR == 1) {
                        rczVar.e(2);
                    }
                    break;
                case 52:
                    LogUtil.a("WeightUpdateVersionActivity", "STATE_FETCH_CHANGELOG_FAILED: mUpdateStatus = " + this.as.r());
                    if (this.as.r() == 2) {
                        d(this.f.getString(R.string.IDS_update_get_changelog_failed));
                    }
                    break;
                case 53:
                    LogUtil.a("WeightUpdateVersionActivity", "STATE_FETCH_CHANGELOG_SUCCESS: mUpdateStatus = " + this.as.r());
                    int iR2 = this.as.r();
                    rcz rczVar2 = this.as;
                    if (iR2 == 2) {
                        rczVar2.c(rczVar2.f(str));
                        LogUtil.a("WeightUpdateVersionActivity", "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewFeatureContent = " + this.as.i());
                        s();
                    }
                    break;
                default:
                    LogUtil.a("WeightUpdateVersionActivity", "default case " + i);
                    break;
            }
            return;
        }
        LogUtil.a("WeightUpdateVersionActivity", "STATE_DOWNLOAD_APP_START:mUpdateStatus = " + this.as.r());
        this.as.e(3);
    }

    private void d(int i, int i2) {
        String strE;
        switch (i) {
            case 21:
                LogUtil.a("WeightUpdateVersionActivity", "STATE_DOWNLOAD_APP_PROGRESS: mUpdateStatus = " + this.as.r());
                this.as.e(3);
                c(i2);
                break;
            case 22:
                LogUtil.a("WeightUpdateVersionActivity", "STATE_DOWNLOAD_APP_FAILED: mWeightUpdateInteractors.mUpdateStatus = " + this.as.r());
                if (this.as.r() != 3) {
                    strE = "";
                } else {
                    LogUtil.a("WeightUpdateVersionActivity", "STATE_DOWNLOAD_APP_FAILED: result = " + i2);
                    strE = ram.e(this.f, i2);
                }
                d(strE);
                break;
            case 23:
                LogUtil.a("WeightUpdateVersionActivity", "STATE_DOWNLOAD_APP_SUCCESS: ");
                this.as.d(true);
                q();
                f();
                break;
            default:
                LogUtil.a("WeightUpdateVersionActivity", "updateAppStateThree default case " + i);
                break;
        }
    }

    private void a(int i) {
        String string;
        if (i == 1) {
            string = this.f.getResources().getString(R.string.IDS_update_network_error);
            c(string);
        } else if (i == 2) {
            string = this.f.getResources().getString(R.string.IDS_update_server_error);
        } else if (i == 4) {
            string = this.f.getString(R.string.IDS_settings_firmware_upgrade_phone_low_battery);
        } else {
            string = this.f.getResources().getString(R.string.IDS_update_unknown_error);
        }
        d(string);
    }

    private void f() {
        this.r.removeCallbacksAndMessages(null);
        if (!this.x) {
            LogUtil.j("WeightUpdateVersionActivity", "enterDeviceOtaActivity(): connected false");
            return;
        }
        dof.d().d(this.f24845a);
        doq.e().c(this.f24845a);
        if (!this.aa) {
            this.aq.setClean();
        }
        LogUtil.a("WeightUpdateVersionActivity", " enterDeviceOtaActivity():");
        t();
        Intent intent = new Intent();
        intent.putExtra("productId", this.an);
        intent.putExtra("commonDeviceInfo", this.m);
        intent.putExtra("isUpdateDialog", true);
        intent.putExtra("fromsetting", this.aa);
        intent.setClass(this.f, WeightDeviceOtaActivity.class);
        try {
            this.f.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WeightUpdateVersionActivity", "enterDeviceOtaActivity exception");
        }
        finish();
    }

    private void t() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (dxm.ag(this.an)) {
            map.put("type", dxm.f32485b.get(this.an));
            if (this.as == null) {
                LogUtil.j("WeightUpdateVersionActivity", "setBiWifiDeviceOtaUpgrade mWeightUpdateInteractors is null");
                return;
            }
            String strM = dxm.m(this.am);
            String strG = this.as.g();
            map.put("oldVersion", strM);
            map.put("newVersion", strG);
            map.put("deviceId", Integer.valueOf(dxm.j(this.an)));
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_UP_OTA_SUCCESS_2060041.value(), map, 0);
            LogUtil.a("WeightUpdateVersionActivity", "setBi ID = ", AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_UP_OTA_SUCCESS_2060041);
            return;
        }
        LogUtil.j("WeightUpdateVersionActivity", "setBiMiniOtaUpgrade not huawei wsp scale");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = this;
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("WeightUpdateVersionActivity", "onCreate it is null.");
            finish();
            return;
        }
        this.ac = intent.getBooleanExtra("isUpdateDialog", false);
        this.an = intent.getStringExtra("productId");
        ContentValues contentValues = (ContentValues) intent.getParcelableExtra("commonDeviceInfo");
        this.m = contentValues;
        if (contentValues != null) {
            this.am = contentValues.getAsString("uniqueId");
            if (TextUtils.isEmpty(this.an)) {
                this.an = this.m.getAsString("productId");
            }
        } else {
            this.am = intent.getStringExtra("uniqueId");
        }
        this.aa = intent.getBooleanExtra("fromsetting", false);
        this.z = intent.getBooleanExtra("user_type", false);
        boolean booleanExtra = intent.getBooleanExtra("isFromNotify", false);
        this.ad = booleanExtra;
        boolean z = this.ac;
        LogUtil.a("WeightUpdateVersionActivity", "onCreate mIsUpdateDialog=", Boolean.valueOf(z), ", mProductId=", this.an, ", mIsSetting=", Boolean.valueOf(this.aa), ", mIsMainUser=", Boolean.valueOf(this.z), ", mIsFromNotify=", Boolean.valueOf(booleanExtra));
        if (TextUtils.isEmpty(this.an)) {
            finish();
            return;
        }
        if (!this.aa) {
            if (!TextUtils.isEmpty(this.am)) {
                this.aq = dti.d(this, this.an, this.am);
            } else {
                this.aq = dti.c(this, this.an);
            }
            this.aq.d();
        }
        this.r = new d(this);
        rcz rczVarC = rcz.c();
        this.as = rczVarC;
        rczVarC.g(this.an);
        this.as.c(this.r);
        setContentView(R.layout.activity_update_version);
        l();
        i();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        BroadcastManagerUtil.c(this.f, this.d, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void i() {
        LogUtil.a("WeightUpdateVersionActivity", "enter initUpdate()  ");
        this.as.e(0);
        this.as.d(true);
        EventBus.a(new EventBus.d("send_wake_up"));
        r();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("WeightUpdateVersionActivity", "onResume()");
        super.onResume();
        if (!this.aa) {
            if (dxm.ag(this.an) && doq.e().l() == 2) {
                this.aa = true;
            }
            dti dtiVar = this.aq;
            if (dtiVar != null) {
                dtiVar.onResume();
                this.r.removeMessages(1);
            }
        }
        if (this.as.r() != 2) {
            EventBus.a(new EventBus.d("get_scale_version_code"));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String strQ;
        LogUtil.a("WeightUpdateVersionActivity", "onBackPressed()  ");
        rcz rczVar = this.as;
        if (rczVar != null) {
            int iR = rczVar.r();
            LogUtil.a("WeightUpdateVersionActivity", "onBackPressed() status = " + iR);
            LogUtil.a("WeightUpdateVersionActivity", "onBackPressed() isForcedUpdate = " + this.u);
            if (iR == 0) {
                super.onBackPressed();
            } else if (this.u) {
                e(this.as.p());
                super.onBackPressed();
            } else if (iR == 3) {
                v();
            } else {
                super.onBackPressed();
            }
        }
        dof.d().d(this.f24845a);
        doq.e().c(this.f24845a);
        if (!this.aa) {
            this.aq.onDestroy();
        }
        if (this.an == null || !this.ac) {
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.am, false);
        if (measurableDeviceB != null) {
            elh elhVarD = ResourceManager.c().d(this.an);
            if (elhVarD == null) {
                strQ = "";
            } else {
                strQ = elhVarD.q();
            }
            MeasureKit measureKitI = drw.e().i(strQ);
            MeasureController measureController = measureKitI != null ? measureKitI.getMeasureController() : null;
            Bundle bundle = new Bundle();
            bundle.putInt("type", -1);
            bundle.putString("productId", this.an);
            bundle.putParcelable("commonDeviceInfo", this.m);
            if (measureController != null) {
                measureController.prepare(measurableDeviceB, null, bundle);
            }
        }
        drw.e().d(this.an, this.am, -1);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        dti dtiVar;
        d dVar = this.r;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
        if (!this.aa && (dtiVar = this.aq) != null) {
            dtiVar.setClean();
        }
        CommonUtil.d(this.f);
        super.onDestroy();
        z();
        d();
        if (this.as != null) {
            LogUtil.a("WeightUpdateVersionActivity", "ondestroy updateInteractor release");
            this.as.w();
            this.as = null;
        }
        this.f = null;
        this.g.remove();
        LogUtil.a("WeightUpdateVersionActivity", "onDestroy()");
        dof.d().d(this.f24845a);
        doq.e().c(this.f24845a);
    }

    private void d() {
        CustomTextAlertDialog customTextAlertDialog = this.s;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.s = null;
        }
        CustomTextAlertDialog customTextAlertDialog2 = this.f24847c;
        if (customTextAlertDialog2 != null) {
            customTextAlertDialog2.dismiss();
            this.f24847c = null;
        }
        CustomTextAlertDialog customTextAlertDialog3 = this.ap;
        if (customTextAlertDialog3 != null) {
            customTextAlertDialog3.dismiss();
            this.ap = null;
        }
    }

    private void l() {
        LogUtil.a("WeightUpdateVersionActivity", "Enter initView!");
        RoundProgressImageView roundProgressImageView = (RoundProgressImageView) qsp.a(this, R.id.center_ota_download);
        this.ah = roundProgressImageView;
        roundProgressImageView.setVisibility(0);
        this.j = (CustomTitleBar) qsp.a(this, R.id.update_title);
        this.e = (ImageView) qsp.a(this, R.id.image_check_logo);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.rele_circle_download);
        this.p = relativeLayout;
        relativeLayout.setVisibility(8);
        this.ag = (HealthTextView) qsp.a(this, R.id.text_percent);
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.text_per_sign);
        this.ai = healthTextView;
        healthTextView.setText("%");
        this.ai.setVisibility(8);
        this.h = (HealthTextView) qsp.a(this, R.id.text_circle_tip);
        this.q = (LinearLayout) qsp.a(this, R.id.rela_failed);
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.button);
        this.f24846b = healthButton;
        healthButton.setOnClickListener(this);
        this.f24846b.setClickable(true);
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.af = (HealthTextView) qsp.a(this, R.id.text_new_version_tip);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.lin_tip);
        this.ak = linearLayout;
        linearLayout.setVisibility(8);
        this.aj = (HealthTextView) qsp.a(this, R.id.text_tip);
        this.al = (HealthTextView) qsp.a(this, R.id.text_tip_content);
        this.ab = (HealthTextView) qsp.a(this, R.id.text_new_feature_content);
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(this, R.id.lin_new_feature);
        this.ae = linearLayout2;
        linearLayout2.setVisibility(8);
        HealthDivider healthDivider = (HealthDivider) qsp.a(this, R.id.imageview_line);
        this.y = healthDivider;
        healthDivider.setVisibility(8);
        this.o = (HealthTextView) qsp.a(this, R.id.failed_message);
        if (dxm.ag(this.an)) {
            this.j.setTitleText(this.f.getResources().getString(R.string.IDS_device_scale_device_firmware_version));
        } else {
            this.j.setTitleText(this.f.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        }
        this.j.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeightUpdateVersionActivity.this.onBackPressed();
            }
        });
        m();
        u();
        if (!dxm.y(this.an) || this.z) {
            return;
        }
        this.f24846b.setVisibility(8);
    }

    private void m() {
        this.l = (RelativeLayout) qsp.a(this, R.id.rela_device_version);
        this.t = (HealthTextView) qsp.a(this, R.id.text_device_version);
        this.k = (HealthTextView) qsp.a(this, R.id.text_device_version_num);
        this.n = (HealthTextView) qsp.a(this, R.id.text_device_version_size);
        this.l.setVisibility(0);
        String strN = this.as.n();
        this.i = strN;
        if (TextUtils.isEmpty(strN)) {
            this.i = dxm.m(this.am);
        }
        if (TextUtils.isEmpty(this.i) || "0".equals(this.i)) {
            this.i = dxm.m(this.an);
        }
        if (TextUtils.isEmpty(this.i) || "0".equals(this.i)) {
            return;
        }
        this.k.setText(this.i);
    }

    private void u() {
        LogUtil.a("WeightUpdateVersionActivity", "Enter showDeviceType() deviceType " + this.as.l());
        elh elhVarE = this.as.e(this.an);
        if (elhVarE != null) {
            if (elhVarE.d().size() <= 0) {
                this.e.setImageResource(elo.a(elhVarE.l().b()));
            } else {
                this.e.setImageBitmap(elo.c(elg.e().d(elhVarE.t(), elhVarE.l().b())));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        LogUtil.a("WeightUpdateVersionActivity", "onclick " + this.as.r());
        if (id == R.id.button) {
            if (this.as.r() == 0) {
                LogUtil.a("WeightUpdateVersionActivity", "mWeightUpdateInteractors.STATUS_INITIAL ");
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("action_app_check_new_version_state");
                BroadcastManagerUtil.c(this.f, this.d, intentFilter, LocalBroadcast.f36595c, null);
                r();
                if (!this.x) {
                    x();
                }
                p();
                return;
            }
            boolean z = dxm.u(this.an) && CommonUtil.e(this.i, "1.0.1.117") < 0;
            if (dxm.y(this.an) && (!dxm.a(this.an, this.am) || z)) {
                g();
            } else if (this.as.r() == 2) {
                LogUtil.a("WeightUpdateVersionActivity", "mWeightUpdateInteractors.STATUS_PULL_CHANGE_LOG");
                EventBus.a(new EventBus.d("send_wake_up"));
                j();
                this.r.sendEmptyMessageDelayed(5, 45000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        MeasurableDevice measurableDeviceB;
        if (this.ad && this.x) {
            this.as.h(this.i);
            if (!TextUtils.isEmpty(this.am)) {
                measurableDeviceB = dmp.d().b(this.am, false);
            } else {
                measurableDeviceB = dmp.d().b(this.an);
            }
            if (measurableDeviceB != null) {
                this.as.i(measurableDeviceB.getSerialNumber());
            }
            this.as.v();
            return;
        }
        EventBus.a(new EventBus.d("get_scale_version_code"));
    }

    private void g() {
        setResult(-1);
        finish();
    }

    protected static class d extends BaseHandler<WeightUpdateVersionActivity> {
        d(WeightUpdateVersionActivity weightUpdateVersionActivity) {
            super(weightUpdateVersionActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeightUpdateVersionActivity weightUpdateVersionActivity, Message message) {
            if (weightUpdateVersionActivity == null) {
                return;
            }
            switch (message.what) {
                case 1:
                    weightUpdateVersionActivity.d(weightUpdateVersionActivity.f.getString(R.string.IDS_music_management_disconnection));
                    break;
                case 2:
                    break;
                case 3:
                    if (message.obj instanceof String) {
                        weightUpdateVersionActivity.b((String) message.obj);
                    }
                    weightUpdateVersionActivity.p();
                    break;
                case 4:
                    weightUpdateVersionActivity.n();
                    break;
                case 5:
                    EventBus.a(new EventBus.d("send_wake_up"));
                    sendEmptyMessageDelayed(5, 45000L);
                    break;
                case 6:
                    weightUpdateVersionActivity.w();
                    break;
                default:
                    LogUtil.a("WeightUpdateVersionActivity", "handleMessageWhenReferenceNotNull default.");
                    break;
            }
        }
    }

    private void r() {
        this.v = false;
        n();
        e();
        HashMap map = new HashMap(0);
        map.put("state", "device");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010032.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        String string;
        HashMap map = new HashMap(16);
        map.put("type", dxm.f32485b.get(this.an));
        HealthTextView healthTextView = this.k;
        if (healthTextView != null && healthTextView.getText() != null) {
            string = this.k.getText().toString();
        } else {
            string = "";
        }
        map.put("deviceVersion", string);
        map.put("deviceId", Integer.valueOf(dxm.j(this.an)));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_CHECK_UP_OTA_SUCCESS_2060040.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LogUtil.a("WeightUpdateVersionActivity", "Enter initViewForCheck! ");
        if (dxm.ag(this.an)) {
            this.j.setTitleText(this.f.getResources().getString(R.string.IDS_device_scale_device_firmware_version));
        } else {
            this.j.setTitleText(this.f.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        }
        this.l.setVisibility(0);
        if (this.as.n() != null) {
            String strN = this.as.n();
            this.i = strN;
            b(strN);
        }
        u();
        this.e.setVisibility(0);
        if (!this.ah.getIsRunning()) {
            this.ah.c();
        }
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.ak.setVisibility(8);
        this.y.setVisibility(8);
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize_disable));
        this.f24846b.setClickable(false);
        this.f24846b.setText(R.string.IDS_ota_update_state_checking);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.ah.e();
    }

    private void k() {
        LogUtil.a("WeightUpdateVersionActivity", "Enter initViewForNoVersion! ");
        this.v = true;
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.f24846b.setClickable(true);
        this.f24846b.setText(R.string.IDS_ota_update_button_check_version);
        this.af.setText(R.string.IDS_ota_update_state_no_new_version);
        this.af.setVisibility(0);
        this.ah.e();
        nuu.a().d(this.an, this.am);
        this.as.e(0);
    }

    private void c(String str) {
        LogUtil.a("WeightUpdateVersionActivity", "Enter initViewForNoNetwork! ");
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.f24846b.setClickable(true);
        this.f24846b.setText(R.string.IDS_retry);
        this.ak.setVisibility(0);
        this.aj.setText(this.f.getString(R.string.IDS_service_area_notice_title));
        this.al.setText(str);
        this.y.setVisibility(0);
        this.ah.e();
    }

    private void s() {
        LogUtil.a("WeightUpdateVersionActivity", "Enter showAppNewVersion");
        if (dxm.y(this.an) && !this.z) {
            LogUtil.a("WeightUpdateVersionActivity", "The new version is not displayed for sub-users");
            this.ah.e();
            return;
        }
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.f24846b.setClickable(true);
        boolean z = dxm.u(this.an) && CommonUtil.e(this.i, "1.0.1.117") < 0;
        if (dxm.y(this.an)) {
            if (!dxm.a(this.an, this.am) || z) {
                this.f24846b.setText(R.string.IDS_wlan_config_device);
            } else {
                this.f24846b.setText(R.string.IDS_device_manager_update_health);
            }
        } else {
            this.f24846b.setText(R.string.IDS_device_manager_update_health);
        }
        this.af.setText(R.string.IDS_ota_update_new_version);
        this.af.setVisibility(8);
        this.ae.setVisibility(0);
        this.l.setVisibility(0);
        this.t.setText(R.string.IDS_ota_update_new_version);
        this.k.setText(this.as.g());
        this.n.setText(this.as.o());
        this.n.setVisibility(0);
        this.ab.setText(this.as.i());
        this.ah.e();
    }

    private void o() {
        LogUtil.a("WeightUpdateVersionActivity", "Enter initViewForDownload!");
        this.e.setVisibility(8);
        this.q.setVisibility(8);
        this.ak.setVisibility(8);
        this.p.setVisibility(0);
        c(0);
        this.y.setVisibility(8);
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize_disable));
        this.f24846b.setClickable(false);
        this.af.setVisibility(4);
    }

    private void c(int i) {
        LogUtil.a("WeightUpdateVersionActivity", "Enter showAppDownloadProgress progress = " + i);
        this.h.setText(R.string.IDS_update_downloading);
        String strE = UnitUtil.e((double) i, 2, 0);
        LogUtil.a("WeightUpdateVersionActivity", "percentNum = " + strE + "text:" + ((Object) UnitUtil.b(this.f, "[\\d]", strE, R.style.percent_number_style_num, R.style.percent_number_style_sign)));
        this.ag.setText(UnitUtil.b(this.f, "[\\d]", strE, R.style.percent_number_style_num, R.style.percent_number_style_sign));
        this.ah.e((float) i);
    }

    private void q() {
        this.v = false;
        this.h.setText(R.string.IDS_settings_firmware_upgrade_talk_band_succeed);
        this.h.setVisibility(0);
        c(100);
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize_disable));
        this.f24846b.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x00e0  */
    public void d(String str) {
        if (this.f == null || this.v) {
            LogUtil.e("WeightUpdateVersionActivity", "showErrorMsg error, tipText=", str, " mIsFailed=", Boolean.valueOf(this.v));
            return;
        }
        this.v = true;
        LogUtil.a("WeightUpdateVersionActivity", "showErrorMsg(): tipText = " + str);
        this.ah.e();
        this.e.setVisibility(8);
        c(0);
        this.p.setVisibility(8);
        this.q.setVisibility(0);
        this.f24846b.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.f24846b.setClickable(true);
        this.f24846b.setText(this.f.getText(R.string.IDS_retry));
        this.ak.setVisibility(0);
        this.aj.setText(this.f.getString(R.string.IDS_settings_restore_factory_settings_dialog_title));
        if (str.equals(this.f.getResources().getString(R.string.IDS_music_management_disconnection))) {
            this.al.setText(str + System.lineSeparator() + this.f.getResources().getString(R.string.IDS_device_scale_connect_tip));
        } else {
            this.al.setText(str);
        }
        this.y.setVisibility(0);
        int iR = this.as.r();
        rcz rczVar = this.as;
        if (iR != 1) {
            int iR2 = rczVar.r();
            rcz rczVar2 = this.as;
            if (iR2 == 2) {
                this.o.setText(R.string.IDS_ota_check_version_failed_title);
            } else if (rczVar2.r() == 3) {
                this.o.setText(R.string.IDS_update_download_failed);
            } else {
                this.o.setText("");
            }
        } else {
            this.o.setText(R.string.IDS_ota_check_version_failed_title);
        }
        LogUtil.a("WeightUpdateVersionActivity", "showErrorMsg() mUpdateStatus :" + this.as.r());
        this.as.e(0);
    }

    private void e() {
        LogUtil.a("WeightUpdateVersionActivity", "doCheckAppNewVersion: mWeightUpdateInteractors.mUpdateStatus = " + this.as.r() + "mIsConnected:" + this.x);
        int iR = this.as.r();
        rcz rczVar = this.as;
        if (iR == 0) {
            rczVar.e(1);
        }
        h();
    }

    private void j() {
        if (this.w > 0) {
            int iE = CommonUtil.e(this.f);
            LogUtil.a("WeightUpdateVersionActivity", "curversioncode :" + iE);
            if (this.w > iE) {
                b();
                return;
            }
        }
        rcz rczVar = this.as;
        boolean zA = rczVar.a(rczVar.h());
        LogUtil.a("WeightUpdateVersionActivity", "handleAppNewVersionOk: checkMemory = " + zA);
        if (!zA) {
            d(this.f.getString(R.string.IDS_update_low_memory));
            return;
        }
        boolean zU = this.as.u();
        LogUtil.a("WeightUpdateVersionActivity", "handleAppNewVersionOk: wifiConnected = " + zU);
        if (!zU) {
            if (this.as.q()) {
                y();
                return;
            } else {
                a(1);
                return;
            }
        }
        a();
    }

    private void y() {
        Context context = this.f;
        if (context != null && this.ap == null && e(context)) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_ota_update_is_roaming).a(R.string.IDS_update_new_version_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.d("WeightUpdateVersionActivity", "start wifiDialog, user click Negative button! ");
                    WeightUpdateVersionActivity.this.ap.dismiss();
                    WeightUpdateVersionActivity.this.ap = null;
                    WeightUpdateVersionActivity.this.a();
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.d("WeightUpdateVersionActivity", "start wifiDialog, user click Positive button!");
                    WeightUpdateVersionActivity.this.ap.dismiss();
                    WeightUpdateVersionActivity.this.ap = null;
                }
            }).b();
            this.ap = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(true);
            this.ap.show();
        }
    }

    private void v() {
        Context context = this.f;
        if (context != null && this.s == null && e(context)) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_settings_firmware_upgrade_ensure_exit).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.d("WeightUpdateVersionActivity", "start showExitUpdateDialog, user click Negative button! ");
                    int iR = WeightUpdateVersionActivity.this.as.r();
                    rcz unused = WeightUpdateVersionActivity.this.as;
                    if (iR == 3) {
                        WeightUpdateVersionActivity.this.as.b();
                        rcz rczVar = WeightUpdateVersionActivity.this.as;
                        rcz unused2 = WeightUpdateVersionActivity.this.as;
                        rczVar.e(0);
                        LogUtil.a("WeightUpdateVersionActivity", "start showExitUpdateDialog,cancle downloading file!");
                        if (WeightUpdateVersionActivity.this.u) {
                            WeightUpdateVersionActivity weightUpdateVersionActivity = WeightUpdateVersionActivity.this;
                            weightUpdateVersionActivity.e(weightUpdateVersionActivity.as.p());
                        }
                    }
                    WeightUpdateVersionActivity.this.s.dismiss();
                    WeightUpdateVersionActivity.this.s = null;
                    WeightUpdateVersionActivity.this.finish();
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.d("WeightUpdateVersionActivity", "showExitUpdateDialog ok click");
                    WeightUpdateVersionActivity.this.s.dismiss();
                    WeightUpdateVersionActivity.this.s = null;
                }
            }).b();
            this.s = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(true);
            this.s.show();
            return;
        }
        Context context2 = this.f;
        if (context2 != null && this.s != null && e(context2)) {
            this.s.show();
        } else {
            LogUtil.j("WeightUpdateVersionActivity", "mContext is null");
        }
    }

    private void h() {
        MeasurableDevice measurableDeviceB;
        MeasureController measureController;
        Bundle bundle = new Bundle();
        bundle.putInt("type", -1);
        bundle.putString("productId", this.an);
        bundle.putParcelable("commonDeviceInfo", this.m);
        if (!TextUtils.isEmpty(this.am)) {
            measurableDeviceB = dmp.d().b(this.am, false);
        } else {
            measurableDeviceB = dmp.d().b(this.an);
        }
        if (measurableDeviceB != null) {
            this.as.i(measurableDeviceB.getAddress());
            elh elhVarD = ResourceManager.c().d(this.an);
            MeasureKit measureKitA = elhVarD != null ? dnf.e().a(elhVarD.q()) : null;
            if (measureKitA == null || (measureController = measureKitA.getMeasureController()) == null) {
                return;
            }
            this.g.set(true);
            measureController.prepare(measurableDeviceB, this.f24845a, bundle);
            this.g.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("WeightUpdateVersionActivity", "doDownloadAppFile: mUpdateStatus = " + this.as.r());
        o();
        this.as.b();
        this.as.j();
    }

    private void z() {
        BroadcastReceiver broadcastReceiver = this.d;
        if (broadcastReceiver == null) {
            return;
        }
        try {
            Context context = this.f;
            if (context != null) {
                context.unregisterReceiver(broadcastReceiver);
            }
            this.d = null;
        } catch (IllegalArgumentException e) {
            LogUtil.a("WeightUpdateVersionActivity", e.getMessage());
        }
    }

    public void b() {
        LogUtil.a("WeightUpdateVersionActivity", "Enter showAppVersionIsLow");
        Context context = this.f;
        if (context != null && this.f24847c == null && e(context)) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).e(String.format(Locale.ENGLISH, this.f.getString(R.string.IDS_update_band_new_version_title2), this.as.p())).b(R.string.IDS_update_band_message_string).a(R.string.IDS_update_new_version_to_upgrade_app, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.d("WeightUpdateVersionActivity", "start showAppIsLowdialog, user click Negative button! ");
                    WeightUpdateVersionActivity.this.f24847c.dismiss();
                    WeightUpdateVersionActivity.this.f24847c = null;
                    WeightUpdateVersionActivity.this.c();
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.WeightUpdateVersionActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.d("WeightUpdateVersionActivity", "start showAppIsLowdialog, user click Positive button!");
                    WeightUpdateVersionActivity.this.f24847c.dismiss();
                    WeightUpdateVersionActivity.this.f24847c = null;
                    WeightUpdateVersionActivity.this.finish();
                }
            }).b();
            this.f24847c = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(true);
            this.f24847c.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("WeightUpdateVersionActivity", " enterUpdateActivity():");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        LogUtil.a("WeightUpdateVersionActivity", "showForcedUpdateDialog deviceName:" + str);
        Intent intent = new Intent();
        intent.putExtra("deviceName", str);
        intent.putExtra("isForced", true);
        intent.putExtra(ParamConstants.CallbackMethod.ON_SHOW, false);
        intent.putExtra("isScale", true);
        intent.putExtra("productId", this.an);
        intent.putExtra("user_type", this.z);
        intent.putExtra("commonDeviceInfo", this.m);
        intent.setClass(this.f, BandUpdateDialogActivity.class);
        try {
            this.f.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WeightUpdateVersionActivity", "showForcedUpdateManualDialog exception");
        }
    }

    private boolean e(Context context) {
        if (context instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) context;
            if (!baseActivity.isFinishing() && !baseActivity.isDestroyed()) {
                return true;
            }
            LogUtil.j("WeightUpdateVersionActivity", "isLiving: activity is isFinishing | isDestroyed.");
            return false;
        }
        LogUtil.j("WeightUpdateVersionActivity", "isLiving: context isn't BaseActivity.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.t == null || this.k == null) {
            LogUtil.j("WeightUpdateVersionActivity", "mDeviceVersion view is null");
        } else if (getResources().getString(R.string.IDS_ota_update_now_version).equals(this.t.getText().toString())) {
            this.k.setText(str);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
