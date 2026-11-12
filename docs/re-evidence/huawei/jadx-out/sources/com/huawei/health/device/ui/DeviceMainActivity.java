package com.huawei.health.device.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment;
import com.huawei.health.device.ui.measure.fragment.HagridWiFiInfoConfirmFragment;
import com.huawei.health.device.ui.measure.fragment.HagridWifiProductUpgradeFragment;
import com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment;
import com.huawei.health.device.ui.measure.fragment.WeightAutoMeasureFragment;
import com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment;
import com.huawei.health.device.ui.measure.fragment.WiFiProductUpgradeFragment;
import com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment;
import com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingUniversalFragment;
import com.huawei.health.ecologydevice.manager.GprsDeviceHelper;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.BloodPressureIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindingFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceConnectingFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceScanningFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSilentGuideFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.ProductCreateFactory;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.dmp;
import defpackage.dnj;
import defpackage.doq;
import defpackage.drw;
import defpackage.dst;
import defpackage.dti;
import defpackage.dvh;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dxx;
import defpackage.dyg;
import defpackage.dyk;
import defpackage.dyn;
import defpackage.dys;
import defpackage.eam;
import defpackage.ect;
import defpackage.eky;
import defpackage.elg;
import defpackage.elh;
import defpackage.elk;
import defpackage.elo;
import defpackage.eqr;
import defpackage.esj;
import defpackage.etn;
import defpackage.ioi;
import defpackage.iov;
import defpackage.ltd;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qst;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceMainActivity extends BaseActivity {
    private Fragment aa;
    private Fragment ab;
    private String ac;
    private String ad;
    private Bundle ae;
    private String ag;
    private CustomTitleBar ah;
    private WeakReference<Timer> ai;
    private int aj;
    private String al;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoTitleCustomAlertDialog f6326c;
    private Class<?> d;
    private String f;
    private String h;
    private Handler i;
    private String j;
    private boolean k;
    private boolean m;
    private boolean p;
    private long q;
    private boolean t;
    private String u;
    private Class v;
    private View w;
    private String x;
    private CommonDialog21 y;
    private String z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Fragment f6324a = null;
    private boolean r = false;
    private boolean n = false;
    private boolean l = false;
    private Bundle e = new Bundle();
    private ArrayList<String> an = new ArrayList<>(16);
    private boolean o = true;
    private boolean s = false;
    private ArrayList<HealthDevice> g = new ArrayList<>(10);
    private Map<String, String> af = new HashMap();

    /* JADX INFO: loaded from: classes7.dex */
    static class d implements IBaseResponseCallback {
        d() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity getOtherUserData errorCode:", Integer.valueOf(i));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Timer f6327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f6329c;
        private Intent d;
        private WeakReference<DeviceMainActivity> e;

        b(DeviceMainActivity deviceMainActivity, Handler handler, Intent intent, String str, Timer timer) {
            this.e = new WeakReference<>(deviceMainActivity);
            this.f6329c = handler;
            this.d = intent;
            this.f6328b = str;
            this.f6327a = timer;
        }

        private void c() {
            this.f6327a.cancel();
            Handler handler = this.f6329c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final DeviceMainActivity deviceMainActivity = this.e.get();
            if (deviceMainActivity == null) {
                LogUtil.j("DeviceMainActivity", "mainActivity is null");
                c();
            } else if (drw.e().b(this.f6328b) != null) {
                c();
                deviceMainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.DeviceMainActivity.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        deviceMainActivity.h(b.this.d);
                        deviceMainActivity.k();
                    }
                });
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ae = bundle;
        }
        this.q = System.currentTimeMillis();
        if (qrs.ac()) {
            Resources resources = getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            configuration.fontScale = 2.4f;
            resources.updateConfiguration(configuration, displayMetrics);
        }
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onCreate");
        this.k = true;
        Intent intent = getIntent();
        this.i = new Handler(Looper.getMainLooper());
        e(intent);
        setContentView(R.layout.device_main_activity);
        clearBackgroundDrawable();
        if (!qrs.af(this)) {
            setRequestedOrientation(1);
        }
        x();
        if (a(intent)) {
            LogUtil.a("DeviceMainActivity", "handleSmartHeadphones enter");
            return;
        }
        if (c(intent)) {
            return;
        }
        h();
        ResourceManager.c().d();
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser == null || currentUser.i() == null) {
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity getMainUser");
            MultiUsersManager.INSTANCE.getMainUser();
        }
        MultiUsersManager.INSTANCE.getOtherUserData(new d());
        cancelAdaptRingRegion();
    }

    private void an() {
        if ("68".equals(this.h)) {
            if (TextUtils.isEmpty(this.ad)) {
                LogUtil.a("DeviceMainActivity", "goto BloodPressureIntroductionFragment");
                ag();
                return;
            } else {
                LogUtil.a("DeviceMainActivity", "goto NfcOrQrCodeGuideFragment");
                af();
                return;
            }
        }
        if ("69".equals(this.h)) {
            LogUtil.a("DeviceMainActivity", "goto BloodSugarIntroductionFragment");
            ah();
            return;
        }
        if ("262".equals(this.h)) {
            LogUtil.a("DeviceMainActivity", "goto RopeSkippingGuideFragment");
            am();
            return;
        }
        if ("54".equals(this.h)) {
            LogUtil.a("DeviceMainActivity", "goto DeviceBindWaitingFragment");
            ae();
        } else if (a(this.h)) {
            LogUtil.a("DeviceMainActivity", "goto NfcOrQrCodeGuideFragment");
            af();
        } else if (q()) {
            af();
        } else {
            LogUtil.a("DeviceMainActivity", "not goto Fragment");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x000c: IF  (r0v0 int) != (49773 int)  -> B:4:0x000e A[HIDDEN]
      (r0v0 int) from 0x0011: IF  (r0v0 int) != (49778 int)  -> B:6:0x0013 A[HIDDEN]
      (r0v0 int) from 0x0016: IF  (r0v0 int) != (49780 int)  -> B:8:0x0018 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private boolean a(String str) {
        byte b2;
        str.hashCode();
        if (iHashCode != 49773) {
            if (iHashCode != 49778) {
                if (iHashCode != 49780) {
                    switch (str) {
                        case "270":
                            b2 = 3;
                            break;
                        case "271":
                            b2 = 4;
                            break;
                        case "272":
                            b2 = 5;
                            break;
                        case "273":
                            b2 = 6;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                } else if (str.equals(BleConstants.TYPE_FASCIA_GUN_INDEX)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("266")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("261")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private void e(Intent intent) {
        if (intent != null) {
            try {
                this.t = intent.getBooleanExtra("is_go_rope_jump", false);
                this.e.putInt("bloodSugarMeasureType", intent.getIntExtra("bloodsugar_timeperiod_key", 0));
                if (intent.getStringExtra("bloodsugar_timeperiod_key_string") != null) {
                    this.e.putString("bloodSugarMeasureTypeString", intent.getStringExtra("bloodsugar_timeperiod_key_string"));
                }
                this.aj = intent.getIntExtra("type", 0);
                if (intent.getBooleanExtra("isFromDiscover", false)) {
                    LogUtil.a("DeviceMainActivity", "onCreate isFromDiscover.");
                    this.e.putBoolean("isFromDiscover", true);
                } else {
                    this.e.putBoolean("isFromDiscover", false);
                }
                this.e.putInt("isHeartRateDevice", intent.getIntExtra("isHeartRateDevice", 0));
                this.e.putBoolean("isFromFitnessAdvice", intent.getBooleanExtra("isFromFitnessAdvice", false));
                this.e.putString("title", intent.getStringExtra("title"));
                boolean booleanExtra = intent.getBooleanExtra("isNfcConnect", false);
                this.p = booleanExtra;
                LogUtil.a("DeviceMainActivity", "initData getBooleanExtra mIsNfcConnect: ", Boolean.valueOf(booleanExtra));
                this.e.putString("productId", intent.getStringExtra("productId"));
                this.ag = intent.getStringExtra("productId");
                this.al = intent.getStringExtra("uniqueId");
            } catch (Exception unused) {
                LogUtil.e("DeviceMainActivity", "onCreate Exception");
            }
        }
    }

    public Bundle d() {
        return this.e;
    }

    private boolean g(Intent intent) {
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("PAYLOAD_FROM_NFC");
        this.ac = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.h = etn.e(this.ac);
            this.u = etn.e("ble", this.ac);
            this.f6325b = etn.e("brd", this.ac);
            this.j = etn.e("n", this.ac);
            this.ad = etn.e(u3.m, this.ac);
            this.z = etn.e(CmcdData.Factory.STREAM_TYPE_LIVE, this.ac);
        } else if (intent.getBooleanExtra("KEY_TO_GET_START_FROM_QRCODE", false)) {
            this.h = intent.getStringExtra("DEVICE_TYPE_INDEX");
            this.u = intent.getStringExtra("BLE_FROM_QRCODE");
            this.f6325b = intent.getStringExtra("BRAND_FROM_QRCODE");
            this.j = intent.getStringExtra("BLENAME_FROM_QRCODE");
            this.ad = intent.getStringExtra("PID_FROM_QRCODE");
            this.z = intent.getStringExtra("PIN_FROM_QRCODE");
        } else {
            LogUtil.a("DeviceMainActivity", "unknow type");
            this.h = null;
        }
        if (!TextUtils.isEmpty(this.h)) {
            if ("68".equals(this.h)) {
                return b(intent);
            }
            if ("69".equals(this.h)) {
                return o();
            }
            if ("262".equals(this.h)) {
                return s();
            }
            if (a(this.h)) {
                return n();
            }
            if ("54".equals(this.h)) {
                return d(intent);
            }
            if (q()) {
                p();
                return true;
            }
        }
        return false;
    }

    private boolean q() {
        return BleConstants.SPORT_TYPE_BIKE.equals(this.h) || "261".equals(this.h) || "260".equals(this.h) || "31".equals(this.h);
    }

    private void x() {
        this.af.put("266", "HDK_SMART_PILLOW");
        this.af.put(BleConstants.TYPE_FASCIA_GUN_INDEX, "HDK_MASSAGE_GUN");
        this.af.put("271", "HDK_ECG");
        this.af.put("273", "HDK_BLOOD_OXYGEN");
        this.af.put("270", "HDK_HEART_RATE");
        this.af.put("272", "HDK_BODY_TEMPERATURE");
        this.af.put("68", "HDK_BLOOD_PRESSURE");
        this.af.put("69", "HDK_BLOOD_SUGAR");
        this.af.put("262", "HDK_ROPE_SKIPPING");
        this.af.put("54", "HDK_WEIGHT");
        this.af.put(BleConstants.SPORT_TYPE_BIKE, "HDK_EXERCISE_BIKE");
        this.af.put("261", "HDK_ROWING_MACHINE");
        this.af.put("260", "HDK_ELLIPTICAL_MACHINE");
        this.af.put("31", "HDK_TREADMILL");
    }

    private boolean b(Intent intent) {
        if (TextUtils.isEmpty(this.f6325b) || TextUtils.isEmpty(this.u)) {
            return false;
        }
        if ("100".equals(this.f6325b)) {
            p();
            return true;
        }
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.putExtra("kind", "HDK_UNKNOWN");
        intent.putExtra("arg1", "DeviceList");
        return false;
    }

    private void p() {
        this.e.putString("DEVICE_TYPE_INDEX", this.h);
        this.e.putString("BLE_FROM_QRCODE", this.u);
        this.e.putString("PAYLOAD_FROM_NFC", this.ac);
        this.e.putString("BLENAME_FROM_QRCODE", this.j);
        this.e.putString("BRAND_FROM_QRCODE", this.f6325b);
        this.e.putString("PID_FROM_QRCODE", this.ad);
        this.e.putString("PIN_FROM_QRCODE", this.z);
        this.e.putString("DeviceType", this.af.get(this.h));
    }

    private boolean o() {
        if ((TextUtils.isEmpty(this.u) && TextUtils.isEmpty(this.j)) || TextUtils.isEmpty(this.ad)) {
            return false;
        }
        p();
        return true;
    }

    private boolean n() {
        p();
        return true;
    }

    private void ae() {
        String string = this.e.getString("PID_FROM_QRCODE");
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("DeviceMainActivity", "switchBodyFatScaleFragment pid is null");
            return;
        }
        ProductMapParseUtil.a(dxw.d());
        ProductMapInfo productMapInfoD = ProductMap.d(string);
        if (productMapInfoD == null) {
            LogUtil.j("DeviceMainActivity", "switchBodyFatScaleFragment productInfo is null");
            return;
        }
        if (dxm.ad(productMapInfoD.f())) {
            if (this.m) {
                ak();
                return;
            } else {
                ai();
                return;
            }
        }
        af();
    }

    private boolean s() {
        if (TextUtils.isEmpty(this.ad)) {
            LogUtil.j("DeviceMainActivity", "isRopeType() pid is null");
            return false;
        }
        p();
        this.e.putBoolean("KEY_TO_GET_START_FROM_QRCODE", true);
        return true;
    }

    private boolean d(Intent intent) {
        ProductMapParseUtil.a(dxw.d());
        ProductMapInfo productMapInfoD = ProductMap.d(this.ad);
        if (productMapInfoD == null) {
            return false;
        }
        if (dxm.ad(productMapInfoD.f())) {
            return e(intent, this.u, this.ad);
        }
        p();
        return true;
    }

    private boolean e(Intent intent, String str, String str2) {
        this.m = intent.getBooleanExtra("isBondedDevice", false);
        boolean booleanExtra = intent.getBooleanExtra("isNfcConnect", false);
        this.p = booleanExtra;
        LogUtil.a("DeviceMainActivity", "isFormNfcOrQrCodeForMeasurePressure getBooleanExtra mIsNfcConnect: ", Boolean.valueOf(booleanExtra));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("DeviceMainActivity", "isHagridScaleType address or pid is empty");
            return false;
        }
        if (this.e == null) {
            LogUtil.j("DeviceMainActivity", "isHagridScaleType mBundle is null");
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str);
        if ("M00F".equals(str2)) {
            contentValues.put("productId", "b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
        }
        this.e.putString("PID_FROM_QRCODE", str2);
        this.e.putParcelable("commonDeviceInfo", contentValues);
        this.e.putString("productId", "b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
        this.e.putString("DeviceType", "HDK_WEIGHT");
        this.e.putBoolean("isNfcConnect", this.p);
        LogUtil.a("DeviceMainActivity", "putBoolean mIsNfcConnect: ", Boolean.valueOf(this.p));
        return true;
    }

    public Class<?> e() {
        return this.v;
    }

    public void e(Class<?> cls) {
        this.v = cls;
    }

    public boolean f() {
        return this.r;
    }

    public boolean g() {
        return this.n;
    }

    @Override // android.app.Activity
    protected void onRestart() {
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onRestart.");
        super.onRestart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Class<?> cls;
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onResume.");
        super.onResume();
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("isJumpFromFittings", false);
            this.r = intent.getBooleanExtra("FROM_SMART_LIFE", false);
            boolean booleanExtra2 = intent.getBooleanExtra("isNfcConnect", false);
            this.p = booleanExtra2;
            LogUtil.a("DeviceMainActivity", "onResume getBooleanExtra mIsNfcConnect: ", Boolean.valueOf(booleanExtra2), " isJumpFromFittings", Boolean.valueOf(booleanExtra));
            z = booleanExtra;
        } else {
            LogUtil.j("DeviceMainActivity", "onResume intent is null");
        }
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity mIsActivityStoped is ", Boolean.valueOf(this.l));
        if (!this.l || (cls = this.d) == null) {
            return;
        }
        String simpleName = cls.getSimpleName();
        if (TextUtils.isEmpty(simpleName) || "ProductIntroductionFragment".equals(simpleName) || "WiFiProductIntroductionFragment".equals(simpleName) || "HagridDeviceBindResultFragment".equals(simpleName) || z) {
            return;
        }
        getSupportFragmentManager().popBackStack(this.d.getSimpleName(), 1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onNewIntent");
        setIntent(intent);
        this.k = true;
        if (intent == null) {
            return;
        }
        if (!intent.getBooleanExtra("FROM_BIND_USER_INFO", false) && etn.d(this.q)) {
            LogUtil.j("DeviceMainActivity", "repeat init view, can not create fragment immediately again.");
            return;
        }
        x();
        if (a(intent) || c(intent)) {
            return;
        }
        h();
    }

    public void d(boolean z) {
        this.k = z;
    }

    private boolean c(Intent intent) {
        if (!g(intent)) {
            return false;
        }
        LogUtil.a("DeviceMainActivity", "isFormNfcOrQrCodeForMeasurePressure true");
        an();
        return true;
    }

    private boolean a(Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.e("R_Weight_DeviceMainActivity", "handleSmartHeadphones intent == null");
            return false;
        }
        String stringExtra = intent.getStringExtra("Device_Type");
        if (!"082".equals(stringExtra)) {
            return false;
        }
        String stringExtra2 = intent.getStringExtra("macAddress");
        String stringExtra3 = intent.getStringExtra("PID_FROM_QRCODE");
        this.e.putString("BLE_FROM_QRCODE", stringExtra2);
        this.e.putString("BLENAME_FROM_QRCODE", "");
        this.e.putString("DEVICE_TYPE_INDEX", stringExtra);
        this.e.putString("PID_FROM_QRCODE", stringExtra3);
        this.e.putString("PIN_FROM_QRCODE", "");
        this.e.putString("DeviceType", "SMART_HEADPHONES");
        this.e.putBoolean("FROM_SMART_LIFE", true);
        af();
        return true;
    }

    private void ag() {
        Fragment fragment = this.f6324a;
        if (fragment != null) {
            String simpleName = fragment.getClass().getSimpleName();
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity fragment name is ", simpleName);
            if (!TextUtils.isEmpty(simpleName) && "BloodPressureIntroductionFragment".equals(simpleName)) {
                LogUtil.a("DeviceMainActivity", "switchBloodPressureIntroductionFragment onNewIntent switch");
                return;
            } else {
                if (!TextUtils.isEmpty(simpleName) && "BloodPressureMeasuringProgressFragment".equals(simpleName)) {
                    LogUtil.a("DeviceMainActivity", "BloodPressureMeasuringProgressFragment is isMeasuring");
                    return;
                }
                LogUtil.j("DeviceMainActivity", "switchBloodPressureIntroductionFragment other fragment");
            }
        }
        BloodPressureIntroductionFragment bloodPressureIntroductionFragment = new BloodPressureIntroductionFragment();
        bloodPressureIntroductionFragment.setArguments(this.e);
        c((Fragment) null, bloodPressureIntroductionFragment);
    }

    private void ah() {
        Fragment fragment = this.f6324a;
        if (fragment != null) {
            String simpleName = fragment.getClass().getSimpleName();
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity fragment name is :", simpleName);
            if (!TextUtils.isEmpty(simpleName) && "BloodSugarIntroductionFragment".equals(simpleName)) {
                LogUtil.a("DeviceMainActivity", "DeviceMainActivity onNewIntent switch");
                return;
            }
            LogUtil.j("DeviceMainActivity", "other fragment");
        }
        BloodSugarIntroductionFragment bloodSugarIntroductionFragment = new BloodSugarIntroductionFragment();
        bloodSugarIntroductionFragment.setArguments(this.e);
        c((Fragment) null, bloodSugarIntroductionFragment);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onSaveInstanceState.");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onStop.");
        super.onStop();
        this.l = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onDestroy mIsDisConnectFlag: ", Boolean.valueOf(this.o));
        dyn.a().c();
        dyk.a().d();
        dys.a().b();
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: dsr
            @Override // java.lang.Runnable
            public final void run() {
                this.e.j();
            }
        });
        esj.d();
    }

    public /* synthetic */ void j() {
        ContentValues contentValuesH;
        String asString = this.ag;
        if (TextUtils.isEmpty(asString) && (contentValuesH = drw.e().h()) != null) {
            asString = contentValuesH.getAsString("productId");
        }
        if (dxm.aj(asString)) {
            dti.b(this);
        } else if (this.o) {
            doq.e().cleanup();
        } else {
            this.o = true;
            LogUtil.j("DeviceMainActivity", "bind flow goto BindUserInfoActivity, not disconnect");
        }
    }

    public void d(String str) {
        this.ag = str;
    }

    public void c(String str) {
        this.al = str;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity onBackPressed called");
        this.o = true;
        Fragment fragment = this.f6324a;
        if (fragment != null) {
            String simpleName = fragment.getClass().getSimpleName();
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity fragment name is ", simpleName);
            if (("HagridDeviceManagerFragment".equals(simpleName) || "ProductIntroductionFragment".equals(simpleName) || "WiFiProductIntroductionFragment".equals(simpleName)) && this.r) {
                moveTaskToBack(true);
            }
            Fragment fragment2 = this.f6324a;
            if (!(fragment2 instanceof BaseFragment)) {
                LogUtil.j("DeviceMainActivity", "mCurrentFragment is not instanceof BaseFragment in func onBackPressed");
                return;
            } else {
                if (!((BaseFragment) fragment2).onBackPressed() || isFinishing()) {
                    return;
                }
                super.onBackPressed();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity dispatchKeyEvent called");
        if (keyEvent == null) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity dispatchKeyEvent event is null");
            return true;
        }
        if (dxm.ad(this.ag) && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            onBackPressed();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    protected void h() {
        String str;
        IllegalArgumentException e;
        String stringExtra;
        Intent intent = getIntent();
        com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKindValueOf = com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_UNKNOWN;
        String stringExtra2 = "";
        if (intent == null) {
            str = "";
        } else {
            this.r = intent.getBooleanExtra("FROM_SMART_LIFE", false);
            this.n = intent.getIntExtra(CommonUtil.PARAM_HEALTH_TYPE, 0) == 6;
            ContentValues contentValues = (ContentValues) intent.getParcelableExtra("commonDeviceInfo");
            if (contentValues != null) {
                this.ag = contentValues.getAsString("productId");
                String asString = contentValues.getAsString("uniqueId");
                this.al = asString;
                LogUtil.a("DeviceMainActivity", "mProductId: ", this.ag, ", code: ", dyg.d(asString));
            } else {
                LogUtil.j("DeviceMainActivity", "device info is null");
            }
            if (TextUtils.isEmpty(this.ag)) {
                this.ag = intent.getStringExtra("productId");
            }
            this.f = intent.getStringExtra("mDeviceId");
            this.x = intent.getStringExtra("mac");
            try {
                this.an = intent.getStringArrayListExtra(BasePairManagerJsApi.UUID_LIST);
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("DeviceMainActivity", "ArrayIndexOutOfBoundsException get uuid list");
            } catch (IndexOutOfBoundsException unused2) {
                LogUtil.e("DeviceMainActivity", "IndexOutOfBoundsException get uuid list");
            }
            try {
                try {
                    if (TextUtils.isEmpty(intent.getStringExtra("view")) && TextUtils.isEmpty(intent.getStringExtra("kind")) && TextUtils.isEmpty(intent.getStringExtra("root_in_me")) && AppRouterUtils.b(intent) != null) {
                        Uri uriB = AppRouterUtils.b(intent);
                        stringExtra = uriB.getQueryParameter("view");
                        String queryParameter = uriB.getQueryParameter("kind");
                        healthDeviceKindValueOf = com.huawei.health.device.model.HealthDevice.HealthDeviceKind.valueOf(queryParameter);
                        LogUtil.a("DeviceMainActivity", "getRawUriFormIntent viewOption: ", stringExtra, "  strKind: ", queryParameter);
                    } else {
                        if (!TextUtils.isEmpty(intent.getStringExtra("view"))) {
                            stringExtra = intent.getStringExtra("view");
                        } else {
                            stringExtra = "";
                        }
                        if (!TextUtils.isEmpty(intent.getStringExtra("root_in_me"))) {
                            stringExtra2 = intent.getStringExtra("root_in_me");
                        }
                        if (intent.getStringExtra("kind") != null) {
                            healthDeviceKindValueOf = com.huawei.health.device.model.HealthDevice.HealthDeviceKind.valueOf(intent.getStringExtra("kind"));
                        }
                    }
                    String str2 = stringExtra2;
                    stringExtra2 = stringExtra;
                    str = str2;
                    try {
                        this.e.putString("productId", intent.getStringExtra("productId"));
                        this.r = intent.getBooleanExtra("FROM_SMART_LIFE", false);
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        LogUtil.e("DeviceMainActivity", "DeviceMainActivity Invalid device kind.", e.getMessage());
                    } catch (Exception unused3) {
                        LogUtil.e("DeviceMainActivity", "initView Exception");
                    }
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    stringExtra2 = "view";
                    str = "";
                } catch (Exception unused4) {
                    stringExtra2 = "view";
                    str = "";
                }
            } catch (IllegalArgumentException e4) {
                e = e4;
                str = "";
            } catch (Exception unused5) {
                str = "";
            }
        }
        etn.d();
        e(stringExtra2, intent, str, healthDeviceKindValueOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    private void e(String str, Intent intent, String str2, com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a("DeviceMainActivity", "showDeviceView: viewOption: ", str);
        str.hashCode();
        switch (str) {
            case "hagridDeviceWlanUseGuide":
                m(intent);
                break;
            case "WiFiConfirm":
                k(intent);
                break;
            case "deviceManage":
                o(intent);
                break;
            case "WifiVersionDetails":
                p(intent);
                break;
            case "PickDevice":
                d(healthDeviceKind);
                break;
            case "BondDevice":
                a(healthDeviceKind, false);
                break;
            case "downloadDevice":
                ac();
                break;
            case "SpecifiedMeasureDevice":
                t();
                break;
            case "ListDevice":
                d(intent, str2, healthDeviceKind);
                break;
            default:
                e(str, intent, healthDeviceKind);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    private void e(String str, Intent intent, com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        str.hashCode();
        switch (str) {
            case "AutoMeasureDevice":
                a(healthDeviceKind, intent);
                break;
            case "bindScale":
                ad();
                break;
            case "bindSport":
                s(intent);
                break;
            case "bindGuideDevice":
                y();
                break;
            case "MeasureDevice":
                b(healthDeviceKind, intent);
                break;
            case "WiFiBindDevice":
                aa();
                break;
            case "bindResultConfirm":
                q(intent);
                break;
            default:
                if (intent != null) {
                    f(intent);
                    break;
                }
                break;
        }
    }

    private void n(Intent intent) {
        DeviceConnectingFragment deviceConnectingFragment = new DeviceConnectingFragment();
        deviceConnectingFragment.setArguments(intent.getExtras());
        c((Fragment) null, deviceConnectingFragment);
    }

    private void af() {
        Fragment fragment = this.f6324a;
        if (fragment != null && "NfcOrQrCodeGuideFragment".equals(fragment.getClass().getSimpleName())) {
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity onNewIntent switch");
            return;
        }
        NfcOrQrCodeGuideFragment nfcOrQrCodeGuideFragment = new NfcOrQrCodeGuideFragment();
        this.e.putString("ENTER_TYPE", getIntent().getStringExtra("ENTER_TYPE"));
        nfcOrQrCodeGuideFragment.setArguments(this.e);
        c((Fragment) null, nfcOrQrCodeGuideFragment);
    }

    private void am() {
        Fragment fragment = this.f6324a;
        if (fragment != null) {
            String simpleName = fragment.getClass().getSimpleName();
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity fragment name is ", simpleName);
            if (!TextUtils.isEmpty(simpleName) && "RopeSkippingGuideFragment".equals(simpleName)) {
                LogUtil.a("DeviceMainActivity", "switchRopeSkippingGuideFragmentt onNewIntent switch");
                return;
            }
            LogUtil.j("DeviceMainActivity", "switchRopeSkippingGuideFragment other fragment");
        }
        RopeSkippingGuideFragment ropeSkippingGuideFragment = new RopeSkippingGuideFragment();
        ropeSkippingGuideFragment.setArguments(this.e);
        c((Fragment) null, ropeSkippingGuideFragment);
    }

    private void d(Intent intent, String str, com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        final InputStream inputStreamD;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("ZipPath");
            try {
                if (health.compact.a.CommonUtil.cj()) {
                    inputStreamD = d(intent.getData());
                    c(stringExtra, healthDeviceKind);
                } else {
                    inputStreamD = null;
                }
                if (stringExtra != null) {
                    LogUtil.a("DeviceMainActivity", "DeviceMainActivity zipPath is ", stringExtra);
                    ResourceManager.c().d(stringExtra, inputStreamD, new ResourceFileListener() { // from class: dsp
                        @Override // com.huawei.health.device.manager.ResourceFileListener
                        public final void onResult(int i, String str2) {
                            DeviceMainActivity.a(inputStreamD, i, str2);
                        }
                    });
                } else if (inputStreamD != null) {
                    try {
                        inputStreamD.close();
                    } catch (IOException unused) {
                        LogUtil.e("DeviceMainActivity", "toUnzipFromDemo IOException");
                    }
                }
                if ("me".equals(str)) {
                    a(healthDeviceKind, str);
                } else {
                    c(healthDeviceKind);
                }
            } catch (FileNotFoundException unused2) {
                LogUtil.e("DeviceMainActivity", "toUnzipFromDemo FileNotFoundException");
            }
        }
    }

    public static /* synthetic */ void a(InputStream inputStream, int i, String str) {
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity resultCode is ", Integer.valueOf(i), " resultValue is ", str);
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("DeviceMainActivity", "toUnzipFromDemo IOException");
            }
        }
    }

    private void c(String str, com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (TextUtils.isEmpty(str) || !healthDeviceKind.name().equals("HDK_UNKNOWN")) {
            return;
        }
        String strSubstring = str.substring(str.lastIndexOf(File.separator) + 1);
        String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf("."));
        SharedPreferenceManager.e(dxw.d(), String.valueOf(10000), "import_zip_product_id", strSubstring2, new StorageParams());
    }

    private InputStream d(Uri uri) throws FileNotFoundException {
        return getContentResolver().openInputStream(uri);
    }

    private void k(Intent intent) {
        if (intent != null) {
            Fragment hagridWiFiInfoConfirmFragment = new HagridWiFiInfoConfirmFragment();
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.al);
            contentValues.put("productId", this.ag);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.putParcelable("commonDeviceInfo", contentValues);
                hagridWiFiInfoConfirmFragment.setArguments(extras);
            }
            c((Fragment) null, hagridWiFiInfoConfirmFragment);
        }
    }

    private void o(Intent intent) {
        if (intent != null) {
            HagridDeviceManagerFragment hagridDeviceManagerFragment = new HagridDeviceManagerFragment();
            intent.putExtra("isNfcConnect", this.p);
            LogUtil.a("DeviceMainActivity", "showDeviceManageView put isNfcConnect is ", Boolean.valueOf(this.p));
            hagridDeviceManagerFragment.setArguments(intent.getExtras());
            c((Fragment) null, hagridDeviceManagerFragment);
        }
    }

    private void m(Intent intent) {
        if (intent != null) {
            Fragment hagridDeviceWlanUseGuideFragment = (BaseFragment) c(HagridDeviceWlanUseGuideFragment.class);
            intent.putExtra("isNfcConnect", this.p);
            LogUtil.a("DeviceMainActivity", "showHagridDeviceWlanUseGuideView put isNfcConnect is ", Boolean.valueOf(this.p));
            if (!(hagridDeviceWlanUseGuideFragment instanceof HagridDeviceWlanUseGuideFragment)) {
                hagridDeviceWlanUseGuideFragment = new HagridDeviceWlanUseGuideFragment();
            }
            hagridDeviceWlanUseGuideFragment.setArguments(intent.getExtras());
            c((Fragment) null, hagridDeviceWlanUseGuideFragment);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    private void f(Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("SWITCH_PLUGINDEVICE")) {
            return;
        }
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity action is ", action);
        String stringExtra = intent.getStringExtra("arg1");
        if (stringExtra == null) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity cloud message arg1 is null");
        }
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity cloud message arg1: ", stringExtra);
        stringExtra.hashCode();
        switch (stringExtra) {
            case "DeviceInfo":
                j(intent);
                break;
            case "DeviceList":
                v();
                break;
            case "DeviceIntroduction":
                l(intent);
                break;
            case "DeviceInfoList":
                h(intent);
                break;
            case "DeviceBindWaitingFragment":
                u();
                break;
            case "syncDevice":
                r(intent);
                break;
            case "ropeDeviceConnecting":
                n(intent);
                break;
            case "DeviceBindWaitingUniversal":
                i(intent);
                break;
            default:
                LogUtil.j("DeviceMainActivity", "DeviceMainActivity cloud message arg1 is invalid, arg1: ", stringExtra);
                break;
        }
    }

    private void u() {
        if (this.ae != null) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity is rebuild");
        } else if (njy.e(this.an)) {
            w();
        } else {
            z();
        }
    }

    private void v() {
        c((Fragment) null, new DeviceBindingFragment());
    }

    private void z() {
        Intent intent = getIntent();
        if (intent == null) {
            m();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(BasePairManagerJsApi.UUID_LIST, this.an);
        bundle.putString("DeviceType", intent.getStringExtra("DeviceType"));
        bundle.putString("DeviceIconPath", intent.getStringExtra("DeviceIconPath"));
        bundle.putString("title", intent.getStringExtra("DeviceName"));
        bundle.putBoolean("isNfcConnect", this.p);
        LogUtil.a("DeviceMainActivity", "showWeightDeviceBindingWaitingView put isNfcConnect is ", Boolean.valueOf(this.p));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.al);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putParcelable(AdShowExtras.DOWNLOAD_SOURCE, intent.getParcelableExtra(AdShowExtras.DOWNLOAD_SOURCE));
        bundle.putBoolean("is_go_rope_jump", this.t);
        bundle.putString("fittings_host_sn", intent.getStringExtra("fittings_host_sn"));
        eqr.a().a(intent, bundle);
        Fragment deviceBindWaitingFragment = new DeviceBindWaitingFragment();
        deviceBindWaitingFragment.setArguments(bundle);
        c((Fragment) null, deviceBindWaitingFragment);
    }

    private void w() {
        Intent intent = getIntent();
        if (TextUtils.isEmpty(this.ag) || intent == null) {
            m();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.ag);
        bundle.putBoolean("is_go_rope_jump", this.t);
        bundle.putString("DeviceType", intent.getStringExtra("DeviceType"));
        bundle.putString("DeviceIconPath", intent.getStringExtra("DeviceIconPath"));
        bundle.putString("title", intent.getStringExtra("DeviceName"));
        bundle.putBoolean("isNfcConnect", this.p);
        LogUtil.a("DeviceMainActivity", "showDeviceBindingWaitingView put isNfcConnect is ", Boolean.valueOf(this.p));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.al);
        contentValues.put("productId", this.ag);
        bundle.putBoolean("is_invalidation", intent.getBooleanExtra("is_invalidation", false));
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putParcelable(AdShowExtras.DOWNLOAD_SOURCE, intent.getParcelableExtra(AdShowExtras.DOWNLOAD_SOURCE));
        bundle.putString("fittings_host_sn", intent.getStringExtra("fittings_host_sn"));
        eqr.a().a(intent, bundle);
        Fragment deviceBindWaitingFragment = new DeviceBindWaitingFragment();
        deviceBindWaitingFragment.setArguments(bundle);
        if (intent.getBooleanExtra("isJumpFromFittings", false)) {
            c(new SecondRopeIntroductionFragment(), deviceBindWaitingFragment);
        } else {
            c((Fragment) null, deviceBindWaitingFragment);
        }
    }

    private void ac() {
        elk elkVarA = a(ResourceManager.c().b().d(), com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_WEIGHT.name());
        if (elkVarA != null) {
            d(elkVarA);
        } else {
            LogUtil.j("DeviceMainActivity", "WEIGHT ProductGroup is error");
        }
    }

    private void y() {
        Bundle bundle = this.e;
        if (bundle == null) {
            LogUtil.j("DeviceMainActivity", "showBindGuideView mBundle is null");
            m();
            return;
        }
        String string = bundle.getString("productId");
        elh elhVarD = ResourceManager.c().d(string);
        if (elhVarD == null) {
            LogUtil.j("DeviceMainActivity", "showBindGuideView productInfo is null");
            ac();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.al);
        contentValues.put("productId", this.ag);
        this.e.putParcelable("commonDeviceInfo", contentValues);
        this.e.putString("productId", this.ag);
        this.e.putBoolean("isFromIconnectDialog", true);
        this.e.putString("title", elo.a(string, elhVarD.l().d()));
        LogUtil.a("DeviceMainActivity", "showBindGuideView productId: ", string, ", mUniquidId: ", health.compact.a.CommonUtil.n(this.al), ", mProductId: ", this.ag);
        HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment = new HagridDeviceBindGuidFragment();
        hagridDeviceBindGuidFragment.setArguments(this.e);
        c((Fragment) null, hagridDeviceBindGuidFragment);
    }

    private void ad() {
        LogUtil.a("DeviceMainActivity", "enter startScaleBinding");
        Bundle bundle = this.e;
        if (bundle == null) {
            LogUtil.j("DeviceMainActivity", "mBundle is null");
            m();
            return;
        }
        String string = bundle.getString("productId");
        if (TextUtils.isEmpty(string)) {
            m();
            return;
        }
        if (ResourceManager.c().d(string) == null) {
            etn.a(this, "HDK_WEIGHT");
        } else if (!TextUtils.isEmpty(string) && dxm.ad(string)) {
            a(string, (String) null);
        }
        m();
    }

    private void s(Intent intent) {
        Bundle bundle = this.e;
        if (bundle == null) {
            LogUtil.j("DeviceMainActivity", "mBundle is null");
            m();
            return;
        }
        String string = bundle.getString("productId");
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("DeviceMainActivity", "startScaleBinding fail: product id is null");
            m();
            return;
        }
        if (ResourceManager.c().d(string) == null && intent != null) {
            String stringExtra = intent.getStringExtra("Device_Type");
            if (TextUtils.isEmpty(stringExtra)) {
                LogUtil.j("DeviceMainActivity", "startScaleBinding fail: product id is null");
                m();
                return;
            }
            elk elkVarA = a(ResourceManager.c().b().d(), stringExtra);
            if (elkVarA != null) {
                d(elkVarA);
                return;
            } else {
                LogUtil.j("DeviceMainActivity", stringExtra, " ProductGroup is error");
                return;
            }
        }
        ProductIntroductionFragment productIntroductionFragment = new ProductIntroductionFragment();
        productIntroductionFragment.setArguments(this.e);
        c((Fragment) null, productIntroductionFragment);
    }

    private void d(elk elkVar) {
        LogUtil.a("DeviceMainActivity", "switchCategoryFragment item: ", elkVar.toString());
        Bundle bundle = new Bundle();
        bundle.putBoolean(DeviceCategoryFragment.WIFI_UPDATE_BACK_FINISH, true);
        bundle.putString(DeviceCategoryFragment.DEVICE_KIND, getResources().getString(elo.d(elkVar.c())));
        bundle.putString(DeviceCategoryFragment.DEVICE_TYPE, elkVar.e().name());
        DeviceCategoryFragment deviceCategoryFragment = new DeviceCategoryFragment();
        deviceCategoryFragment.setArguments(bundle);
        c((Fragment) null, deviceCategoryFragment);
    }

    private void j(Intent intent) {
        String stringExtra = intent.getStringExtra("Device_Type");
        ArrayList<elk> arrayListD = ResourceManager.c().b().d();
        if (arrayListD.size() <= 0) {
            if (!Utils.o() || health.compact.a.CommonUtil.cj()) {
                arrayListD = eky.a("groups.xml");
            } else {
                arrayListD = eky.a("groups_abroad.xml");
            }
        }
        elk elkVarA = a(arrayListD, stringExtra);
        if (elkVarA != null) {
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity item: ", elkVarA.toString());
            DeviceCategoryFragment deviceCategoryFragment = new DeviceCategoryFragment();
            Bundle bundle = new Bundle();
            bundle.putString(DeviceCategoryFragment.DEVICE_TYPE, elkVarA.e().name());
            bundle.putString(DeviceCategoryFragment.DEVICE_KIND, getResources().getString(elo.d(elkVarA.c())));
            deviceCategoryFragment.setArguments(bundle);
            c((Fragment) null, deviceCategoryFragment);
        }
    }

    private void i(Intent intent) {
        String stringExtra = intent.getStringExtra("arg2");
        String stringExtra2 = intent.getStringExtra("arg3");
        if (stringExtra == null) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity cloud message arg2 is null");
            return;
        }
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity cloud message arg2: ", stringExtra);
        Bundle bundle = new Bundle();
        bundle.putString("productId", stringExtra);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", stringExtra2);
        contentValues.put("productId", stringExtra);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        Fragment deviceBindWaitingUniversalFragment = new DeviceBindWaitingUniversalFragment();
        deviceBindWaitingUniversalFragment.setArguments(bundle);
        c((Fragment) null, deviceBindWaitingUniversalFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Intent intent) {
        LogUtil.a("DeviceMainActivity", "showChooseDeviceBindingListView");
        String stringExtra = intent.getStringExtra("productId");
        elh elhVarD = ResourceManager.c().d(stringExtra);
        if (elhVarD == null) {
            d(intent, stringExtra);
            return;
        }
        if (intent.getBooleanExtra("thirdDeviceToApp", false)) {
            h(getString(R.string.IDS_getting_file));
            d(intent, this.ag);
            GprsDeviceHelper.e(this.ag, this.al, new GprsDeviceHelper.CheckAndBindCallback() { // from class: com.huawei.health.device.ui.DeviceMainActivity.4
                @Override // com.huawei.health.ecologydevice.manager.GprsDeviceHelper.CheckAndBindCallback
                public void onBindFinish() {
                    DeviceMainActivity.this.ab();
                }

                @Override // com.huawei.health.ecologydevice.manager.GprsDeviceHelper.CheckAndBindCallback
                public void onBindException() {
                    qpx.b(DeviceMainActivity.this, R.string.IDS_device_binding_fail);
                    DeviceMainActivity.this.m();
                }
            });
            return;
        }
        if ("1".equals(elhVarD.g()) || BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVarD.n().b())) {
            if (!PermissionDialogHelper.c(this)) {
                ReleaseLogUtil.d("R_Weight_DeviceMainActivity", "showChooseDeviceBindingListView go to H5 not scan permission");
                qpx.e(this, R.string.IDS_nearby_permission_exception);
                m();
                return;
            }
            if ("1".equals(elhVarD.g())) {
                etn.c(this, elhVarD, this.ag, this.al);
            } else {
                String stringExtra2 = intent.getStringExtra("operateCode");
                Intent intentB = etn.b(elhVarD, this.ag, this.al);
                if (intentB != null) {
                    intentB.putExtra("operateCode", stringExtra2);
                    startActivity(intentB);
                }
            }
            m();
            return;
        }
        d(intent, stringExtra);
    }

    private void d(Intent intent, String str) {
        Fragment fragmentCreateProductFragment;
        Bundle bundle = new Bundle();
        if (dxm.ag(str)) {
            intent.putExtra("isNfcConnect", this.p);
            LogUtil.a("DeviceMainActivity", "showChooseDeviceBindingListView isHuaweiWspScaleProduct put isNfcConnect is ", Boolean.valueOf(this.p));
            fragmentCreateProductFragment = new HagridDeviceManagerFragment();
        } else if (dxm.ac(str)) {
            fragmentCreateProductFragment = new HonourDeviceFragment();
        } else if (ect.c(str)) {
            if (TextUtils.isEmpty(this.al)) {
                this.al = a(this.f, this.x, str).getAsString("uniqueId");
            }
            fragmentCreateProductFragment = new WiFiProductIntroductionFragment();
            String stringExtra = intent.getStringExtra("arg4");
            if (!TextUtils.isEmpty(stringExtra)) {
                bundle.putString("arg4", stringExtra);
            }
        } else {
            fragmentCreateProductFragment = ProductCreateFactory.createProductFragment(str);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.al);
        contentValues.put("productId", this.ag);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putString("productId", this.ag);
        bundle.putBoolean(BaseRopeIntroductionFragment.KEY_FROM_SCAN, true);
        bundle.putString("operateCode", intent.getStringExtra("operateCode"));
        if (fragmentCreateProductFragment instanceof ProductIntroductionFragment) {
            bundle.putBoolean("isBindSuccess", intent.getBooleanExtra("isBindSuccess", false));
        }
        fragmentCreateProductFragment.setArguments(bundle);
        c((Fragment) null, fragmentCreateProductFragment);
        if (etn.a(this) && intent.getBooleanExtra("isBindSuccess", false)) {
            etn.c();
        }
    }

    private ContentValues a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return new ContentValues();
        }
        ArrayList<ContentValues> arrayListC = dmp.d().c(str3);
        LogUtil.a("DeviceMainActivity", "getDeviceInfoByWiseDeivceIdOrSubMac deviceInfos size is ", Integer.valueOf(arrayListC.size()));
        if (njy.e(arrayListC)) {
            return new ContentValues();
        }
        if (arrayListC.size() == 1) {
            return arrayListC.get(0);
        }
        for (ContentValues contentValues : arrayListC) {
            String asString = contentValues.getAsString("mDeviceId");
            if (!TextUtils.isEmpty(asString) && asString.equals(str)) {
                LogUtil.a("DeviceMainActivity", "mDeviceId pass");
                return contentValues;
            }
            String asString2 = contentValues.getAsString("uniqueId");
            if (!TextUtils.isEmpty(asString2) && asString2.equals(str)) {
                LogUtil.a("DeviceMainActivity", "the device has bound on the cloud && no bound by Ble");
                return contentValues;
            }
            if (!TextUtils.isEmpty(asString2) && asString2.replace(":", "").endsWith(str2)) {
                LogUtil.a("DeviceMainActivity", "uniqueId pass");
                return contentValues;
            }
        }
        return new ContentValues();
    }

    private elk a(ArrayList<elk> arrayList, String str) {
        elk elkVar = null;
        for (elk elkVar2 : arrayList) {
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity item.kind.name(): ", elkVar2.e().name(), " device_Type: ", str);
            if (elkVar2.e().name().equals(str)) {
                elkVar = elkVar2;
            }
        }
        return elkVar;
    }

    private void l(Intent intent) {
        Fragment honourDeviceFragment;
        String stringExtra = intent.getStringExtra("arg2");
        boolean booleanExtra = intent.getBooleanExtra("isBindSuccess", false);
        if (stringExtra == null) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity cloud message arg2 is null");
            return;
        }
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity cloud message arg2: ", stringExtra);
        String stringExtra2 = intent.getStringExtra("sn");
        Bundle bundle = new Bundle();
        bundle.putString("sn", stringExtra2);
        LogUtil.a("DeviceMainActivity", "showDeviceIntroductionFragment serialNumber:", dyg.b(stringExtra2));
        bundle.putString("productId", stringExtra);
        if (dxm.x(stringExtra) || dxm.ae(stringExtra)) {
            if (dxm.ag(stringExtra)) {
                intent.putExtra("isNfcConnect", this.p);
                LogUtil.a("DeviceMainActivity", "showDeviceIntroductionFragment isHonorAmBondedDevice put isNfcConnect: ", Boolean.valueOf(this.p));
                honourDeviceFragment = new HagridDeviceManagerFragment();
            } else {
                honourDeviceFragment = new HonourDeviceFragment();
            }
        } else if (ect.c(stringExtra)) {
            honourDeviceFragment = new WiFiProductIntroductionFragment();
        } else {
            honourDeviceFragment = new ProductIntroductionFragment();
        }
        String stringExtra3 = intent.getStringExtra("arg3");
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", stringExtra3);
        contentValues.put("productId", stringExtra);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        if (dxm.z(stringExtra)) {
            LogUtil.a("DeviceMainActivity", "showDeviceIntroductionFragment isHonourScale bindSuccess, ", Boolean.valueOf(booleanExtra));
            bundle.putBoolean("isBindSuccess", booleanExtra);
        }
        honourDeviceFragment.setArguments(bundle);
        c((Fragment) null, honourDeviceFragment);
    }

    private void a(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind, Intent intent) {
        if (intent != null) {
            Bundle bundle = new Bundle();
            bundle.putString("kind", String.valueOf(healthDeviceKind));
            bundle.putSerializable("HealthData", intent.getSerializableExtra("HealthData"));
            bundle.putString("productId", intent.getStringExtra("productId"));
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.al);
            contentValues.put("productId", this.ag);
            bundle.putParcelable("commonDeviceInfo", contentValues);
            Fragment weightAutoMeasureFragment = new WeightAutoMeasureFragment();
            weightAutoMeasureFragment.setArguments(bundle);
            c((Fragment) null, weightAutoMeasureFragment);
        }
    }

    private void p(Intent intent) {
        Fragment wiFiProductUpgradeFragment;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (dxx.e(extras)) {
                LogUtil.a("DeviceMainActivity", "showWifiUpgradeFragment is dual_mode device");
                wiFiProductUpgradeFragment = new HagridWifiProductUpgradeFragment();
            } else {
                LogUtil.a("DeviceMainActivity", "showWifiUpgradeFragment is other Device");
                wiFiProductUpgradeFragment = new WiFiProductUpgradeFragment();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("productId", this.ag);
            contentValues.put("uniqueId", this.al);
            extras.putParcelable("commonDeviceInfo", contentValues);
            LogUtil.a("DeviceMainActivity", "showWifiUpgradeFragment code: ", health.compact.a.CommonUtil.n(this.al), ", mProductId: ", this.ag);
            wiFiProductUpgradeFragment.setArguments(extras);
            c((Fragment) null, wiFiProductUpgradeFragment);
        }
    }

    public void a(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(healthDeviceKind));
        bundle.putBoolean("isRebind", z);
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", this.ag);
        contentValues.put("uniqueId", this.al);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        if (ResourceManager.c().b().e(healthDeviceKind) != null) {
            LogUtil.a("DeviceMainActivity", "DeviceMainActivity showDeviceBondView is not null");
            elk elkVarE = ResourceManager.c().b().e(healthDeviceKind);
            if (elkVarE != null) {
                bundle.putString(DeviceCategoryFragment.DEVICE_KIND, getResources().getString(elo.d(elkVarE.c())));
            }
        }
        Fragment deviceCategoryFragment = new DeviceCategoryFragment();
        deviceCategoryFragment.setArguments(bundle);
        c((Fragment) null, deviceCategoryFragment);
    }

    private void q(Intent intent) {
        if (this.ae != null) {
            LogUtil.j("DeviceMainActivity", "showWiFiConfirm mSavedInstanceState is not null, return");
            return;
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                LogUtil.j("DeviceMainActivity", "showWiFiConfirm bundle is null");
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.al);
            contentValues.put("productId", this.ag);
            extras.putParcelable("commonDeviceInfo", contentValues);
            Fragment hagridDeviceBindResultFragment = new HagridDeviceBindResultFragment();
            hagridDeviceBindResultFragment.setArguments(extras);
            c((Fragment) null, hagridDeviceBindResultFragment);
            LogUtil.a("DeviceMainActivity", "showWiFiConfirm is end");
        }
    }

    private void aa() {
        MyDeviceFragment myDeviceFragment = new MyDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putString("kind", com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_WEIGHT.name());
        bundle.putString("EntryType", "WiFiDevice");
        myDeviceFragment.setArguments(bundle);
        c((Fragment) null, myDeviceFragment);
    }

    private void d(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        MyDeviceFragment myDeviceFragment = new MyDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putString("kind", healthDeviceKind.name());
        bundle.putString("EntryType", "Pick");
        myDeviceFragment.setArguments(bundle);
        c((Fragment) null, myDeviceFragment);
    }

    private void e(String str, String str2) {
        if ("true".equals(ioi.d().c(402))) {
            etn.o(str);
            b(str, str2);
        } else {
            etn.b(this, str, str2, true);
        }
    }

    private void b(String str, String str2) {
        if (!PermissionDialogHelper.c(this)) {
            ReleaseLogUtil.d("R_Weight_DeviceMainActivity", "startWebViewMeasure go to H5 not scan permission");
            qpx.e(this, R.string.IDS_nearby_permission_exception);
            m();
            return;
        }
        etn.o(str);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.d());
        intent.setClassName(BaseApplication.d(), "com.huawei.operation.activity.WebViewActivity");
        if (!TextUtils.isEmpty(elhVarD.p()) && !TextUtils.isEmpty(elhVarD.e())) {
            intent.putExtra("url", elg.e().e(str) + "#/type=2/sn=" + str2);
        } else {
            intent.putExtra("url", elg.e().e(str));
        }
        intent.putExtra("productId", str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("name", etn.c(str, elhVarD.l().d()));
        contentValues.put("deviceType", elhVarD.m().name());
        contentValues.put(Constants.KEY_BLE_SCAN_MODE, Integer.valueOf(elhVarD.v().c()));
        intent.putExtra("commonDeviceInfo", contentValues);
        intent.putExtra("bleIntroductionType", elhVarD.n().b());
        if (!TextUtils.isEmpty(WebViewActivity.getProductId())) {
            LogUtil.a("DeviceMainActivity", "WebViewActivity productId is not empty");
            intent.setFlags(335544320);
        }
        startActivity(intent);
        m();
    }

    private void b(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind, Intent intent) {
        ArrayList<ContentValues> arrayListE = drw.e().e(healthDeviceKind);
        e((Class<?>) null);
        LogUtil.a("DeviceMainActivity", "showDeviceMeasureView mType: ", Integer.valueOf(this.aj));
        if (arrayListE.size() == 1) {
            String asString = arrayListE.get(0).getAsString("productId");
            String asString2 = arrayListE.get(0).getAsString("uniqueId");
            elh elhVarD = ResourceManager.c().d(asString);
            if ("1".equals(elhVarD.g())) {
                if (PermissionDialogHelper.c(this)) {
                    etn.c(this, elhVarD, asString, asString2);
                } else {
                    ReleaseLogUtil.d("R_Weight_DeviceMainActivity", "startWebViewMeasure go to H5 not scan permission");
                    qpx.e(this, R.string.IDS_nearby_permission_exception);
                }
                m();
                return;
            }
            Fragment fragmentA = dst.a(asString);
            if (fragmentA != null) {
                Bundle bundle = new Bundle();
                bundle.putString("view", "measure");
                bundle.putString("productId", asString);
                ContentValues contentValues = new ContentValues();
                contentValues.put("uniqueId", asString2);
                contentValues.put("productId", asString);
                bundle.putParcelable("commonDeviceInfo", contentValues);
                bundle.putInt("type", this.aj);
                bundle.putString("kind", healthDeviceKind.name());
                bundle.putParcelable("commonDeviceInfo", arrayListE.get(0));
                fragmentA.setArguments(bundle);
                c((Fragment) null, fragmentA);
                return;
            }
            if (elhVarD == null || !"H5".equals(elhVarD.e()) || !"H5".equals(elhVarD.p())) {
                if (elhVarD != null && "H5".equals(elhVarD.p())) {
                    b(asString, asString2);
                    return;
                }
                if (drw.e().h(asString)) {
                    d(drw.e().e(asString), asString, healthDeviceKind);
                    return;
                }
                com.huawei.health.device.model.HealthDevice healthDeviceB = drw.e().b(asString);
                if (healthDeviceB instanceof MeasurableDevice) {
                    d((MeasurableDevice) healthDeviceB, asString, healthDeviceKind);
                    return;
                }
                return;
            }
            e(asString, asString2);
            return;
        }
        if (arrayListE.size() > 1) {
            b(healthDeviceKind, intent, arrayListE);
        } else {
            LogUtil.j("DeviceMainActivity", "product size less than 1");
        }
    }

    private void b(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind, Intent intent, ArrayList<ContentValues> arrayList) {
        ContentValues contentValuesD;
        if (intent == null) {
            LogUtil.j("DeviceMainActivity", "hasBindMoreDevices intent is null");
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("isFromIconnectDialog", false);
        String stringExtra = intent.getStringExtra("macAddress");
        LogUtil.a("DeviceMainActivity", "bondedDevices.size() > 1 isAccurateMeasure: ", Boolean.valueOf(booleanExtra));
        if (booleanExtra && !TextUtils.isEmpty(stringExtra)) {
            LogUtil.a("DeviceMainActivity", "isAccurateMeasure start target measure fragment macAddress: ", health.compact.a.CommonUtil.n(stringExtra));
            contentValuesD = d(arrayList, stringExtra);
        } else {
            contentValuesD = d(arrayList);
        }
        if (contentValuesD != null) {
            LogUtil.a("DeviceMainActivity", "deviceInfo != null, go to target measure fragment");
            b(healthDeviceKind, contentValuesD);
        } else {
            a(healthDeviceKind);
        }
    }

    private ContentValues d(ArrayList<ContentValues> arrayList, String str) {
        if (njy.e(arrayList) || TextUtils.isEmpty(str)) {
            return null;
        }
        for (ContentValues contentValues : arrayList) {
            if (contentValues != null && TextUtils.equals(str, contentValues.getAsString("uniqueId"))) {
                return contentValues;
            }
        }
        return null;
    }

    private ContentValues d(ArrayList<ContentValues> arrayList) {
        if (njy.e(arrayList)) {
            return null;
        }
        String strL = l();
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        for (ContentValues contentValues : arrayList) {
            if (contentValues != null && TextUtils.equals(strL, contentValues.getAsString("uniqueId"))) {
                return contentValues;
            }
        }
        return null;
    }

    private String l() {
        String strG = doq.e().g();
        LogUtil.a("DeviceMainActivity", "getCurrentConnectedDevice connectDeviceAddress: ", dyg.b(strG));
        return !TextUtils.isEmpty(strG) ? strG : "";
    }

    private void a(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        MyDeviceFragment myDeviceFragment = new MyDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putString("kind", healthDeviceKind.name());
        bundle.putString("EntryType", "Measure");
        myDeviceFragment.setArguments(bundle);
        c((Fragment) null, myDeviceFragment);
    }

    private void d(HealthDevice healthDevice, String str, com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("DeviceMainActivity", "chooseFragment productInfo is null");
            return;
        }
        boolean zEquals = HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(elhVarD.r());
        if (healthDevice == null) {
            LogUtil.j("DeviceMainActivity", "the device is null");
            return;
        }
        if (zEquals) {
            LogUtil.d("DeviceMainActivity", "DeviceMainActivity the productId ", str, " is not res, and this is auto");
            Bundle bundleE = e(str);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", healthDevice.getUniqueId());
            contentValues.put("productId", str);
            bundleE.putParcelable("commonDeviceInfo", contentValues);
            Fragment deviceSilentGuideFragment = new DeviceSilentGuideFragment();
            deviceSilentGuideFragment.setArguments(bundleE);
            c((Fragment) null, deviceSilentGuideFragment);
            return;
        }
        LogUtil.d("DeviceMainActivity", " DeviceMainActivity the productId ", str, " is not res, and this is not auto ", " kind.name is ", healthDeviceKind.name());
        d(healthDeviceKind, str);
    }

    private void d(MeasurableDevice measurableDevice, String str, com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        elh elhVarD = ResourceManager.c().d(str);
        String strR = elhVarD != null ? elhVarD.r() : null;
        String strP = elhVarD != null ? elhVarD.p() : null;
        boolean zEquals = HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(strR);
        if (measurableDevice == null) {
            LogUtil.j("DeviceMainActivity", "the device is null");
            return;
        }
        if (measurableDevice.isAutoDevice() && zEquals) {
            LogUtil.d("DeviceMainActivity", "DeviceMainActivity the productId: ", str, " is not res, and this is auto");
            c(measurableDevice, str);
            return;
        }
        LogUtil.d("DeviceMainActivity", "DeviceMainActivity the productId: ", str, " is not res, and this is not auto, kind.name is ", healthDeviceKind.name());
        BaseFragment baseFragmentA = dst.a(healthDeviceKind.name());
        if (baseFragmentA != null) {
            c(baseFragmentA, healthDeviceKind.name(), measurableDevice, str);
        } else if (!"H5".equals(strP)) {
            LogUtil.j("DeviceMainActivity", " DeviceMainActivity no Fragment");
        } else {
            j(str);
            m();
        }
    }

    private void d(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind, String str) {
        BaseFragment baseFragmentA = dst.a(healthDeviceKind.name());
        if (baseFragmentA != null) {
            Bundle bundle = new Bundle();
            bundle.putString("view", "measure");
            bundle.putString("kind", healthDeviceKind.name());
            bundle.putString("productId", str);
            bundle.putInt("type", this.aj);
            baseFragmentA.setArguments(bundle);
            c((Fragment) null, baseFragmentA);
        }
    }

    private void b(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind, ContentValues contentValues) {
        if (contentValues == null) {
            LogUtil.j("DeviceMainActivity", "startMeasureBaseFragment deviceInfo is null");
            return;
        }
        LogUtil.a("DeviceMainActivity", "startMeasureBaseFragment code: ", health.compact.a.CommonUtil.n(contentValues.getAsString("uniqueId")));
        BaseFragment baseFragmentA = dst.a(healthDeviceKind.name());
        if (baseFragmentA != null) {
            Bundle bundle = new Bundle();
            bundle.putString("view", "measure");
            bundle.putString("kind", healthDeviceKind.name());
            bundle.putParcelable("commonDeviceInfo", contentValues);
            bundle.putInt("type", this.aj);
            baseFragmentA.setArguments(bundle);
            c((Fragment) null, baseFragmentA);
        }
    }

    private void c(MeasurableDevice measurableDevice, String str) {
        Bundle bundleE = e(str);
        DeviceSilentGuideFragment deviceSilentGuideFragment = new DeviceSilentGuideFragment();
        e(measurableDevice, str, bundleE);
        deviceSilentGuideFragment.setArguments(bundleE);
        c((Fragment) null, deviceSilentGuideFragment);
    }

    private void c(BaseFragment baseFragment, String str, MeasurableDevice measurableDevice, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("view", "measure");
        bundle.putString("kind", str);
        bundle.putString("productId", str2);
        bundle.putInt("type", this.aj);
        e(measurableDevice, str2, bundle);
        baseFragment.setArguments(bundle);
        c((Fragment) null, baseFragment);
    }

    private void j(String str) {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.d());
        intent.setClassName(BaseApplication.d(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str));
        intent.putExtra("productId", str);
        startActivity(intent);
    }

    private Bundle e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("view", "bond");
        bundle.putString("productId", str);
        bundle.putInt("type", this.aj);
        return bundle;
    }

    private void e(MeasurableDevice measurableDevice, String str, Bundle bundle) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", measurableDevice.getUniqueId());
        contentValues.put("productId", str);
        bundle.putParcelable("commonDeviceInfo", contentValues);
    }

    public void b(Fragment fragment) {
        this.f6324a = fragment;
    }

    public Fragment a() {
        return this.f6324a;
    }

    private void a(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind, String str) {
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity showDeviceListView kind ", healthDeviceKind.name());
        Bundle bundle = new Bundle();
        bundle.putString("kind", healthDeviceKind.name());
        bundle.putString("EntryType", "List");
        bundle.putString("root_in_me", str);
        MyDeviceFragment myDeviceFragment = new MyDeviceFragment();
        myDeviceFragment.setArguments(bundle);
        c((Fragment) null, myDeviceFragment);
    }

    private void c(com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity showDeviceListView kind ", healthDeviceKind.name());
        Bundle bundle = new Bundle();
        bundle.putString("kind", healthDeviceKind.name());
        bundle.putString("EntryType", "List");
        Intent intent = getIntent();
        if (intent != null) {
            try {
                bundle.putBoolean("isFromFitnessAdvice", intent.getBooleanExtra("isFromFitnessAdvice", false));
                bundle.putStringArrayList("notHeartRateDeviceList", intent.getStringArrayListExtra("notHeartRateDeviceList"));
            } catch (Exception unused) {
                LogUtil.e("DeviceMainActivity", "showDeviceListView Exception");
            }
        }
        MyDeviceFragment myDeviceFragment = new MyDeviceFragment();
        myDeviceFragment.setArguments(bundle);
        c((Fragment) null, myDeviceFragment);
    }

    public void a(Class<?> cls) {
        if (cls == null) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity fragmentClass is null");
            m();
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!b(cls)) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity fragmentClass is not Exists InBackStack");
            m();
            return;
        }
        this.d = cls;
        LogUtil.a("DeviceMainActivity", "DeviceMainActivity mClass is ", cls.getSimpleName());
        try {
            supportFragmentManager.popBackStack(cls.getSimpleName(), 1);
        } catch (IllegalStateException e) {
            LogUtil.e("DeviceMainActivity", "DeviceMainActivity throws ", e.getMessage());
        }
    }

    private boolean b(Class<?> cls) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int backStackEntryCount = supportFragmentManager.getBackStackEntryCount();
        LogUtil.d("DeviceMainActivity", "DeviceMainActivity fragmentClass is ", cls.getSimpleName());
        boolean z = false;
        for (int i = 0; i < backStackEntryCount; i++) {
            FragmentManager.BackStackEntry backStackEntryAt = supportFragmentManager.getBackStackEntryAt(i);
            LogUtil.d("DeviceMainActivity", "DeviceMainActivity backStackEntry is ", backStackEntryAt.getName());
            if (backStackEntryAt.getName().equals(cls.getSimpleName())) {
                z = true;
            }
        }
        return z;
    }

    public Fragment c(Class<?> cls) {
        if (cls == null) {
            LogUtil.a("DeviceMainActivity", "getSelectFragment fragmentClass is null");
            return null;
        }
        return getSupportFragmentManager().findFragmentByTag(cls.getSimpleName());
    }

    public void c(Fragment fragment, Fragment fragment2) {
        if (fragment2 == null) {
            LogUtil.a("DeviceMainActivity", "switchFragment target fragment is null");
            m();
            return;
        }
        ReleaseLogUtil.d("R_Weight_DeviceMainActivity", "switchFragment target fragment is: ", fragment2.getClass().getSimpleName());
        Bundle arguments = fragment2.getArguments();
        if ((fragment2 instanceof HagridDeviceManagerFragment) && qst.d()) {
            d(this, arguments);
            m();
            return;
        }
        boolean z = (arguments == null || arguments.getInt("scanMode") == 4) ? false : true;
        if (((fragment2 instanceof DeviceScanningFragment) || (fragment2 instanceof HagridDeviceBindGuidFragment)) && z) {
            this.aa = fragment;
            this.ab = fragment2;
            if (!r()) {
                return;
            }
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (!this.k && !this.r) {
            if (LanguageUtil.ba(this)) {
                fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.right_enter, R.anim.right_exit, R.anim.left_enter, R.anim.left_exit);
            } else {
                fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.left_enter, R.anim.left_exit, R.anim.right_enter, R.anim.right_exit);
            }
        }
        this.k = false;
        if (fragment != null) {
            ReleaseLogUtil.d("R_Weight_DeviceMainActivity", "switchFragment fromFragment is: ", fragment.getClass().getSimpleName());
            if (!fragment2.isAdded()) {
                fragmentTransactionBeginTransaction.addToBackStack(fragment.getClass().getSimpleName());
            }
        } else {
            ReleaseLogUtil.d("R_Weight_DeviceMainActivity", "switchFragment from fragment is null");
        }
        if (fragment2.isAdded()) {
            fragmentTransactionBeginTransaction.show(fragment2);
        } else {
            fragmentTransactionBeginTransaction.replace(R.id.device_fragment_container, fragment2, fragment2.getClass().getSimpleName());
        }
        this.d = fragment2.getClass();
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private void t() {
        elh elhVarD = ResourceManager.c().d(this.ag);
        if (elhVarD == null) {
            ReleaseLogUtil.e("R_Weight_DeviceMainActivity", "jumpToMeasureFragment productInfo == null");
            return;
        }
        com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKindM = elhVarD.m();
        Fragment fragmentA = dst.a(healthDeviceKindM.name());
        if (fragmentA != null) {
            Bundle bundle = new Bundle();
            bundle.putString("view", "measure");
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.al);
            contentValues.put("productId", this.ag);
            bundle.putString("kind", healthDeviceKindM.name());
            bundle.putParcelable("commonDeviceInfo", contentValues);
            bundle.putString("goback", "hygride");
            bundle.putBoolean("status", false);
            bundle.putBoolean("deviceMgrMeasure", true);
            bundle.putInt("type", -1);
            fragmentA.setArguments(bundle);
            c((Fragment) null, fragmentA);
        }
    }

    private void d(Activity activity, Bundle bundle) {
        ContentValues contentValues = (ContentValues) bundle.getParcelable("commonDeviceInfo");
        if (contentValues == null) {
            LogUtil.a("DeviceMainActivity", "jumpToArkuiDevice contentValues == null");
            b(activity);
            return;
        }
        String asString = contentValues.getAsString("uniqueId");
        ContentValues contentValuesJ = dmp.d().j(asString);
        if (contentValuesJ == null) {
            LogUtil.a("DeviceMainActivity", "jumpToArkuiDevice deviceInfo == null, code:", health.compact.a.CommonUtil.n(asString));
            b(activity);
            return;
        }
        String asString2 = contentValuesJ.getAsString("name");
        LogUtil.a("DeviceMainActivity", "jumpToArkuiDevice deviceName: ", asString2);
        Intent intent = new Intent();
        intent.setClassName(activity, ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
        IntentParams intentParamsBuild = IntentParams.builder().addInfo("deviceName", 10, asString2).addPageId(ArkUIXConstants.OTHER_DEVICE_MANAGER_PAGE).addPageType("0").build();
        LogUtil.a("DeviceMainActivity", "wearDeviceJump params.toString()", intentParamsBuild.toString());
        intent.putExtra(e.n, intentParamsBuild.toString());
        intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 3);
        iov.c(activity, intent);
    }

    private void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
            intent.setFlags(67108864);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
            intent.putExtra("SHORTCUT", "SC_DEVICE");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DeviceMainActivity", "ActivityNotFoundException e：", e.getMessage());
        }
    }

    public void d(Fragment fragment, Fragment fragment2) {
        if (fragment2 == null) {
            LogUtil.a("DeviceMainActivity", "addFragment target fragment is null");
            m();
            return;
        }
        LogUtil.a("DeviceMainActivity", "addFragment target fragment is: ", fragment2.getClass().getSimpleName());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        if (!this.k && !this.r) {
            if (LanguageUtil.ba(this)) {
                fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.right_enter, R.anim.right_exit, R.anim.left_enter, R.anim.left_exit);
            } else {
                fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.left_enter, R.anim.left_exit, R.anim.right_enter, R.anim.right_exit);
            }
        }
        this.k = false;
        if (fragment != null) {
            LogUtil.a("DeviceMainActivity", "addFragment fromFragment is: ", fragment.getClass().getSimpleName());
            if (!fragment2.isAdded()) {
                fragmentTransactionBeginTransaction.addToBackStack(fragment.getClass().getSimpleName());
            }
            fragmentTransactionBeginTransaction.hide(fragment);
        } else {
            LogUtil.a("DeviceMainActivity", "addFragment from fragment is null");
        }
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(fragment2.getClass().getSimpleName());
        if (!fragment2.isAdded() && fragmentFindFragmentByTag == null) {
            fragmentTransactionBeginTransaction.add(R.id.device_fragment_container, fragment2, fragment2.getClass().getSimpleName());
        } else {
            fragmentTransactionBeginTransaction.show(fragment2);
        }
        this.d = fragment2.getClass();
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Fragment fragment;
        if (iArr != null && strArr != null) {
            ltd.e().e(strArr, iArr);
        }
        if (i == 1 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (fragment = this.ab) != null) {
            c(this.aa, fragment);
        }
        if (i == 20192) {
            if (iArr != null && iArr.length > 0 && strArr != null) {
                b(strArr, i, iArr);
            } else {
                LogUtil.j("DeviceMainActivity", "grantResults is null");
            }
        }
    }

    private void b(String[] strArr, int i, int[] iArr) {
        for (String str : strArr) {
            if ("android.permission.RECORD_AUDIO".equals(str) || "android.permission.MODIFY_AUDIO_SETTINGS".equals(str) || "android.permission.PROCESS_OUTGOING_CALLS".equals(str)) {
                Fragment fragment = this.f6324a;
                if (fragment != null) {
                    fragment.onRequestPermissionsResult(i, strArr, iArr);
                    return;
                }
                return;
            }
        }
    }

    private boolean r() {
        if (checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        if (shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || health.compact.a.CommonUtil.e(this, "android.permission.ACCESS_COARSE_LOCATION")) {
            requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
            health.compact.a.CommonUtil.k(this, "android.permission.ACCESS_COARSE_LOCATION");
            return false;
        }
        qrs.e((Context) this, true);
        return false;
    }

    public ArrayList<HealthDevice> b() {
        return this.g;
    }

    public void b(final String str) {
        LogUtil.a("DeviceMainActivity", "showSelectBindDeviceDialog productId: ", str);
        Fragment fragment = this.f6324a;
        if (fragment == null || fragment.getContext() == null) {
            LogUtil.j("DeviceMainActivity", "DeviceMainActivity currentFragment context is null");
            return;
        }
        if (this.f6326c == null) {
            dxx.d(this.al);
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f6324a.getContext());
            builder.b(R.string.IDS_device_bluetooth_rebind_msg_new).c(com.huawei.ui.commonui.R.string.IDS_btsdk_confirm_repair, new View.OnClickListener() { // from class: dss
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32334a.e(str, view);
                }
            }).a(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dsu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32337c.d(view);
                }
            });
            this.f6326c = builder.c();
        }
        if (this.f6326c.isShowing()) {
            return;
        }
        this.f6326c.show();
    }

    public /* synthetic */ void e(String str, View view) {
        Fragment fragment = this.f6324a;
        if (fragment instanceof HagridDeviceManagerFragment) {
            dvh.b(fragment.getContext(), this.ag, this.al);
        } else if (!TextUtils.isEmpty(str) && dxm.ad(str)) {
            a(str, this.al);
        } else {
            a(etn.a("HDK_WEIGHT"), true);
        }
    }

    public /* synthetic */ void d(View view) {
        if ("HagridDeviceManagerFragment".equals(this.f6324a.getClass().getSimpleName())) {
            return;
        }
        m();
    }

    private void a(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.d());
        intent.setClassName(BaseApplication.d(), "com.huawei.ui.device.activity.adddevice.PairingGuideActivity");
        intent.putExtra("kind_id", "HDK_WEIGHT");
        intent.putExtra("pair_guide", "2");
        intent.putExtra("is_invalidation", true);
        intent.putExtra("uniqueId", str2);
        ArrayList<String> arrayList = new ArrayList<>(16);
        arrayList.add(str);
        intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
        startActivity(intent);
    }

    private void h(String str) {
        if (this.y == null) {
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.y = commonDialog21B;
            commonDialog21B.b(str);
            this.y.c();
            this.y.setCancelable(false);
            return;
        }
        LogUtil.j("DeviceMainActivity", "showLoadingDialog: mLoadingDialog is not null");
    }

    private void r(final Intent intent) {
        LogUtil.a("DeviceMainActivity", "syncWiFiDeviceAndGoToDeviceManager");
        this.w = findViewById(R.id.device_main_loading);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.device_main_title);
        this.ah = customTitleBar;
        if (customTitleBar != null) {
            customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: dsw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32338b.b(view);
                }
            });
            this.ah.setVisibility(0);
        }
        View view = this.w;
        if (view != null) {
            view.setVisibility(0);
        }
        final Runnable runnable = new Runnable() { // from class: dsv
            @Override // java.lang.Runnable
            public final void run() {
                this.e.i();
            }
        };
        this.i.postDelayed(runnable, 7000L);
        eam.d().a(intent.getStringExtra("productId"), this.al, new IBaseResponseCallback() { // from class: dsx
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.a(intent, runnable, i, obj);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        onBackPressed();
    }

    public /* synthetic */ void i() {
        WeakReference<Timer> weakReference = this.ai;
        if (weakReference != null && weakReference.get() != null) {
            this.ai.get().cancel();
        }
        k();
        ad();
    }

    public /* synthetic */ void a(Intent intent, Runnable runnable, int i, Object obj) {
        if (this.i == null) {
            LogUtil.j("DeviceMainActivity", "syncWiFiDevice complete, but handler is null");
            return;
        }
        Message.obtain().obj = intent;
        if (i == 0) {
            LogUtil.a("DeviceMainActivity", "syncWiFiDeviceAndGoToDeviceManager success, showChooseDeviceBindingListView");
            t(intent);
        } else {
            this.i.removeCallbacksAndMessages(null);
            this.i.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        CustomTitleBar customTitleBar = this.ah;
        if (customTitleBar != null) {
            customTitleBar.setVisibility(8);
            this.ah = null;
        }
        View view = this.w;
        if (view != null) {
            view.setVisibility(8);
            this.w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        CommonDialog21 commonDialog21 = this.y;
        if (commonDialog21 != null) {
            commonDialog21.cancel();
            this.y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f6326c;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.f6326c = null;
        }
        ab();
        finish();
    }

    private void t(Intent intent) {
        String stringExtra = intent.getStringExtra("productId");
        Timer timer = new Timer("DeviceMainActivity");
        this.ai = new WeakReference<>(timer);
        b bVar = new b(this, this.i, intent, stringExtra, timer);
        try {
            LogUtil.a("DeviceMainActivity", "startTimerToCheckDevice start checking");
            timer.schedule(bVar, 0L, 200L);
        } catch (IllegalStateException e) {
            LogUtil.e("DeviceMainActivity", "startTimeTask schedule IllegalStateException: ", e.getMessage());
        }
    }

    public void c(boolean z) {
        this.s = z;
    }

    public boolean c() {
        return this.s;
    }

    private void ai() {
        Fragment fragment = this.f6324a;
        if (fragment != null) {
            String simpleName = fragment.getClass().getSimpleName();
            LogUtil.a("DeviceMainActivity", "switchDeviceBindWaitingFragment fragment name is ", simpleName);
            if (!TextUtils.isEmpty(simpleName) && "DeviceBindWaitingFragment".equals(simpleName)) {
                LogUtil.a("DeviceMainActivity", "switchDeviceBindWaitingFragment onNewIntent switch");
                return;
            } else {
                if (!TextUtils.isEmpty(simpleName) && "DeviceBindWaitingFragment".equals(simpleName)) {
                    LogUtil.a("DeviceMainActivity", "switchDeviceBindWaitingFragment is isMeasuring");
                    return;
                }
                LogUtil.j("DeviceMainActivity", "switchDeviceBindWaitingFragment other fragment");
            }
        }
        DeviceBindWaitingFragment deviceBindWaitingFragment = new DeviceBindWaitingFragment();
        if (this.e != null && getIntent() != null && getIntent().getParcelableExtra(AdShowExtras.DOWNLOAD_SOURCE) != null) {
            this.e.putParcelable(AdShowExtras.DOWNLOAD_SOURCE, getIntent().getParcelableExtra(AdShowExtras.DOWNLOAD_SOURCE));
            this.e.putBoolean("is_go_rope_jump", this.t);
            this.e.putBoolean("isNfcConnect", this.p);
            this.e.putString("fittings_host_sn", getIntent().getStringExtra("fittings_host_sn"));
            eqr.a().a(getIntent(), this.e);
        }
        deviceBindWaitingFragment.setArguments(this.e);
        c((Fragment) null, deviceBindWaitingFragment);
    }

    private void ak() {
        Fragment fragment = this.f6324a;
        if (fragment != null) {
            String simpleName = fragment.getClass().getSimpleName();
            LogUtil.a("DeviceMainActivity", "switchHagridDeviceManagerFragment fragment name is ", simpleName);
            if (!TextUtils.isEmpty(simpleName) && "HagridDeviceManagerFragment".equals(simpleName)) {
                LogUtil.a("DeviceMainActivity", "switchHagridDeviceManagerFragment onNewIntent switch");
                return;
            }
            LogUtil.j("DeviceMainActivity", "other fragment");
        }
        HagridDeviceManagerFragment hagridDeviceManagerFragment = new HagridDeviceManagerFragment();
        Bundle bundle = this.e;
        if (bundle != null) {
            bundle.putBoolean("isNfcConnect", this.p);
        }
        hagridDeviceManagerFragment.setArguments(this.e);
        c((Fragment) null, hagridDeviceManagerFragment);
    }

    public void b(boolean z) {
        this.o = z;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
