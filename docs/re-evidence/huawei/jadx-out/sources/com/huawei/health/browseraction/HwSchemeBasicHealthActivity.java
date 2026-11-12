package com.huawei.health.browseraction;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alipay.sdk.m.s.e;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.MainActivity;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.activity.DeviceUsageDescriptionActivity;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.ecologydevice.util.FAUtil;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.utils.UpdateProductMapCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.trade.JsTradeApi;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.music.MusicMainActivity;
import com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitMindActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepPopularCoursesActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.HealthDataHistoryActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import com.huawei.ui.openservice.ui.OpenServiceActivity;
import com.huawei.up.model.UserInfomation;
import defpackage.ddv;
import defpackage.ddx;
import defpackage.dgq;
import defpackage.dip;
import defpackage.dnj;
import defpackage.drw;
import defpackage.dxm;
import defpackage.ecu;
import defpackage.eej;
import defpackage.eel;
import defpackage.era;
import defpackage.etn;
import defpackage.ffv;
import defpackage.fua;
import defpackage.iov;
import defpackage.ioy;
import defpackage.ipl;
import defpackage.iqc;
import defpackage.iqq;
import defpackage.iqy;
import defpackage.irz;
import defpackage.iun;
import defpackage.jxh;
import defpackage.lmf;
import defpackage.lmq;
import defpackage.lql;
import defpackage.lsk;
import defpackage.lsx;
import defpackage.lsy;
import defpackage.lug;
import defpackage.lvb;
import defpackage.lzl;
import defpackage.lzq;
import defpackage.mir;
import defpackage.njd;
import defpackage.njy;
import defpackage.peh;
import defpackage.pgr;
import defpackage.pjo;
import defpackage.prf;
import defpackage.rdp;
import defpackage.tfv;
import defpackage.tqp;
import defpackage.uye;
import defpackage.vgo;
import defpackage.vgp;
import defpackage.vgw;
import defpackage.vhn;
import defpackage.vlv;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HwSchemeBasicHealthActivity extends BaseActivity {
    private static final Map<String, String> d = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.2
        {
            put("00M00D", "e835d102-af95-48a6-ae13-2983bc06f5c0");
            put("00M00F", "b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
            put("00M0CJ", "c943c933-442e-4c34-bcd0-66597f24aaed");
        }
    });
    private static String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6228a;
    private Context f;
    private String g;
    private String t;
    private Rect u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NoTitleCustomAlertDialog f6229b = null;
    private Uri v = null;
    private String m = "";
    private String s = "";
    private String h = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6230c = false;
    private boolean k = false;
    private String o = "-1";
    private String w = null;
    private boolean n = false;
    private boolean l = false;
    private boolean i = false;
    private String p = null;
    private String y = null;
    private String q = null;
    private String r = null;
    private IBaseResponseCallback j = new IBaseResponseCallback() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("HwSchemeBasicHealthActivity", "getAuthorizationStatus");
            if (obj instanceof Integer) {
                HwSchemeBasicHealthActivity.this.f6228a = ((Integer) obj).intValue();
                final DeviceInfo deviceInfo = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "HwSchemeBasicHealthActivity").get(0);
                final String deviceIdentify = deviceInfo.getDeviceIdentify();
                if (HwSchemeBasicHealthActivity.this.f6228a == 100) {
                    LogUtil.a("HwSchemeBasicHealthActivity", "authorizationStatus == AUTHORIZED_STATUS");
                    HwSchemeBasicHealthActivity.this.b(deviceIdentify, MusicMainActivity.class);
                } else {
                    HwSchemeBasicHealthActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtil.a("HwSchemeBasicHealthActivity", "Jump To MusicSecondaryMenuActivity");
                            HwSchemeBasicHealthActivity.this.d(deviceInfo, 2);
                            Intent intent = new Intent(HwSchemeBasicHealthActivity.this.f, (Class<?>) MusicSecondaryMenuActivity.class);
                            if (!TextUtils.isEmpty(deviceIdentify)) {
                                intent.putExtra("device_id", deviceIdentify);
                            }
                            intent.putExtra("isFromDeepLink", true);
                            intent.putExtra("musicAuthorizationStatus", false);
                            intent.setFlags(67108864);
                            HwSchemeBasicHealthActivity.this.startActivity(intent);
                            HwSchemeBasicHealthActivity.this.as();
                        }
                    });
                }
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = this;
        LogUtil.a("HwSchemeBasicHealthActivity", "savedInstanceState ", Boolean.valueOf(bundle == null));
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("HwSchemeBasicHealthActivity", "intent is null");
            return;
        }
        this.n = false;
        d(intent);
        a(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        d(intent);
    }

    private void d(Intent intent) {
        try {
            this.m = intent.getStringExtra("DEVICE_MODULE_ID");
        } catch (BadParcelableException unused) {
            LogUtil.e("HwSchemeBasicHealthActivity", "onCreate getStringExtra catch BadParcelableException");
        }
        this.v = intent.getData();
        this.u = intent.getSourceBounds();
        this.t = intent.getStringExtra(Constants.CA_PAYLOAD);
        this.i = intent.getBooleanExtra("closeBLEConnection", false);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.p = extras.getString("pushId");
            this.y = extras.getString("serviceId");
            this.q = extras.getString("notifiUri");
            this.r = extras.getString("messageContent");
            LogUtil.a("HwSchemeBasicHealthActivity", "mPushId = ", this.p, "mServiceId =", this.y);
        }
    }

    private void a(Intent intent) {
        if (!TextUtils.isEmpty(this.m)) {
            ReleaseLogUtil.d("R_HwSchemeBasicHealthActivity", "is from iconnect dialog");
            this.f6230c = true;
            c(intent);
            return;
        }
        if (e(intent)) {
            ReleaseLogUtil.d("R_HwSchemeBasicHealthActivity", "from notifyKeepAppAlive gotoKeepAliveSetting");
            return;
        }
        ipl.e(this, intent);
        ipl.c(this, intent);
        vlv.e(this, intent);
        pgr.b(this, intent);
        LogUtil.a("HwSchemeBasicHealthActivity", "intent data mSourceRect:", this.u);
        if (this.u == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            Rect rect = new Rect();
            this.u = rect;
            rect.set(displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 2, displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 2);
            LogUtil.j("HwSchemeBasicHealthActivity", "mSourceRect reset");
        }
        Uri uri = this.v;
        if (uri == null) {
            LogUtil.j("HwSchemeBasicHealthActivity", "intent data is null");
            return;
        }
        String path = uri.getPath();
        if (path == null || path.length() <= 0) {
            LogUtil.j("HwSchemeBasicHealthActivity", "path is null or length is 0");
            finish();
            return;
        }
        if (!path.equals("/basicHealth") && !"/devicemanagement".equals(path) && !"/ecgBasicHealth".equals(path) && !"/devicemgr".equals(path)) {
            LogUtil.j("HwSchemeBasicHealthActivity", path + " is error");
            finish();
            return;
        }
        if ("/devicemgr".equals(path)) {
            LogUtil.j("HwSchemeBasicHealthActivity", "SCHEME_PATH_DEVICE_MGR.equals(path)");
            ax();
        }
        this.l = "com.huawei.ohos.health.device".equalsIgnoreCase(ap());
        f();
        f(path);
        at();
    }

    private boolean e(Intent intent) {
        try {
            if (!mir.d(intent)) {
                return false;
            }
            lsy.a(new Runnable() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    OpAnalyticsUtil.getInstance().setRiskWarningEvent("gotoKeepAliveSetting", "NotifyKeepAppAlive");
                    rdp.d(HwSchemeBasicHealthActivity.this, "11073");
                }
            });
        } catch (Exception e2) {
            ReleaseLogUtil.e("R_HwSchemeBasicHealthActivity", "gotoKeepAliveSetting Exception:", ExceptionUtils.c(e2));
        }
        finish();
        return true;
    }

    private void at() {
        if (AuthorizationUtils.c(this)) {
            Context context = BaseApplication.getContext();
            lmf.d().c(LoginInit.getInstance(context).getAccountInfo(1011));
            lmf.d().a(LoginInit.getInstance(context).getAccountInfo(1010));
            OpAnalyticsUtil.getInstance().init(context, new b(this));
            m();
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HwSchemeBasicHealthActivity> f6243a;

        public b(HwSchemeBasicHealthActivity hwSchemeBasicHealthActivity) {
            this.f6243a = new WeakReference<>(hwSchemeBasicHealthActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            HwSchemeBasicHealthActivity hwSchemeBasicHealthActivity = this.f6243a.get();
            if (hwSchemeBasicHealthActivity != null && !hwSchemeBasicHealthActivity.isDestroyed() && !hwSchemeBasicHealthActivity.isFinishing()) {
                String queryParameter = hwSchemeBasicHealthActivity.v.getQueryParameter("from");
                if (TextUtils.isEmpty(queryParameter) || !"fa".equals(queryParameter)) {
                    return;
                }
                hwSchemeBasicHealthActivity.i();
                return;
            }
            ReleaseLogUtil.e("R_HwSchemeBasicHealthActivity", "HwSchemeBasicHealthActivity activity ", hwSchemeBasicHealthActivity);
        }
    }

    private void m() {
        String queryParameter = this.v.getQueryParameter("from");
        iqq.c(iqq.d(queryParameter, this.p, this.y, this.r, this.v), queryParameter, !TextUtils.isEmpty(this.q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("HwSchemeBasicHealthActivity", "doBiFromFaStartApp");
        HashMap map = new HashMap(16);
        map.put("from", 1);
        map.put("click", 1);
        map.put("FAPackageName", this.v.getQueryParameter("FAPackageName"));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }

    private void f() {
        if (this.l && Utils.h() && !Utils.i()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dge
                @Override // java.lang.Runnable
                public final void run() {
                    FAUtil.a(new FAUtil.ResultCallback() { // from class: dgl
                        @Override // com.huawei.health.ecologydevice.util.FAUtil.ResultCallback
                        public final void onResult(boolean z) {
                            LogUtil.a("HwSchemeBasicHealthActivity", "checkCachedDataFromFA needUpdate:", Boolean.valueOf(z));
                        }
                    });
                }
            });
        }
    }

    private void ax() {
        if (getApplicationContext().getTheme() == null) {
            LogUtil.j("HwSchemeBasicHealthActivity", "setApplicationTheme theme is null");
            return;
        }
        int identifier = getResources().getIdentifier("HealthTheme", TtmlNode.TAG_STYLE, BaseApplication.getAppPackage());
        if (identifier == 0) {
            LogUtil.j("HwSchemeBasicHealthActivity", "setApplicationTheme themeId is 0");
        } else {
            LogUtil.a("HwSchemeBasicHealthActivity", "setApplicationTheme else");
            setTheme(identifier);
        }
    }

    private void an() {
        LogUtil.a("HwSchemeBasicHealthActivity", "startActivityWithIconnect to MainActivity");
        startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
        as();
    }

    private void c(Intent intent) {
        String stringExtra;
        if (intent == null) {
            LogUtil.j("HwSchemeBasicHealthActivity", "startActivityWithIconnect intent = null");
            as();
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(this.f);
        if (!AuthorizationUtils.c(this.f) || (Utils.h() && !loginInit.getIsLogined())) {
            an();
            return;
        }
        this.s = d.get(this.m);
        try {
            stringExtra = intent.getStringExtra("DEVICE_ID");
        } catch (BadParcelableException unused) {
            LogUtil.e("HwSchemeBasicHealthActivity", "startActivityWithIconnect getStringExtra catch BadParcelableException");
            stringExtra = null;
        }
        if (TextUtils.isEmpty(this.s) || TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("HwSchemeBasicHealthActivity", "startActivityWithIconnect mProductId = null or macAddress = null");
            as();
            return;
        }
        String strB = lmq.b(stringExtra);
        this.h = strB;
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("HwSchemeBasicHealthActivity", "startActivityWithIconnect mDeviceIdentify");
            as();
            return;
        }
        ReleaseLogUtil.d("R_HwSchemeBasicHealthActivity", "startActivityWithIconnect mDeviceIdentify: ", CommonUtil.n(this.h), ", productId = ", this.s);
        if (drw.e().a(this.h) == null) {
            ReleaseLogUtil.d("R_HwSchemeBasicHealthActivity", "not bind this device");
            if (ResourceManager.c().d(this.s) == null) {
                LogUtil.a("HwSchemeBasicHealthActivity", "has not download this device, go to DeviceCategoryFragment");
                etn.a(this.f, "HDK_WEIGHT");
                as();
                return;
            } else {
                p();
                as();
                return;
            }
        }
        bb();
        as();
    }

    private void p() {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(this.f, "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("DeviceType", "HDK_WEIGHT");
        intent.putExtra("arg1", "DeviceBindWaitingFragment");
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.h);
        contentValues.put("productId", this.s);
        intent.putExtra("commonDeviceInfo", contentValues);
        startActivity(intent);
    }

    private void bb() {
        Bundle bundle = new Bundle();
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", this.s);
        contentValues.put("uniqueId", this.h);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putString("productId", this.s);
        Intent intent = new Intent(this, (Class<?>) DeviceMainActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("kind", HealthDevice.HealthDeviceKind.HDK_WEIGHT.name());
        intent.putExtra("view", "MeasureDevice");
        intent.putExtra("isFromIconnectDialog", this.f6230c);
        intent.putExtra("macAddress", this.h);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    private void f(String str) {
        byte b2;
        LoginInit loginInit = LoginInit.getInstance(this.f);
        LogUtil.a("HwSchemeBasicHealthActivity", "loginit_isLogined ", Boolean.valueOf(loginInit.getIsLogined()));
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1671961272) {
            if (iHashCode != -620976973) {
                if (iHashCode == 259271376 && str.equals("/ecgBasicHealth")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("/devicemgr")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("/devicemanagement")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            b(loginInit);
            return;
        }
        if (b2 == 1) {
            c(loginInit);
        } else if (b2 == 2) {
            ipl.c(this, this.v);
        } else {
            e(loginInit);
        }
    }

    private void b(LoginInit loginInit) {
        if (!AuthorizationUtils.c(this.f) || !loginInit.getIsLogined()) {
            LogUtil.a("HwSchemeBasicHealthActivity", "StartHealth to MainActivity");
            startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
            finish();
            return;
        }
        d(this.v);
    }

    private void e(LoginInit loginInit) {
        int iK = k();
        if ("thirdDevice".equals(t())) {
            g(iK);
            return;
        }
        if (!AuthorizationUtils.c(this.f) || !MainInteractors.e() || (!loginInit.getIsLogined() && CommonUtil.ae(this))) {
            c(iK, loginInit);
        } else if (!loginInit.getIsLogined()) {
            d(iK);
        } else {
            g(iK);
        }
    }

    private void c(LoginInit loginInit) {
        LogUtil.a("HwSchemeBasicHealthActivity", "Start to devicemgr");
        if (!MainInteractors.e() && l() != 1 && l() != 8) {
            d(this.f);
        } else if (!loginInit.getIsLogined()) {
            LoginInit.getInstance(this.f).browsingToLogin(new IBaseResponseCallback() { // from class: dgb
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f31768c.a(i, obj);
                }
            }, "");
        } else {
            av();
        }
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            av();
        } else {
            finish();
        }
    }

    private void d(final int i) {
        LogUtil.a("HwSchemeBasicHealthActivity", "jumpLogin to healthType", Integer.valueOf(i));
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
            if (browsingBiEvent != null) {
                browsingBiEvent.showFullServiceDialog(this.f, new View.OnClickListener() { // from class: dgf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f31773b.e(view);
                    }
                });
                return;
            }
            return;
        }
        LoginInit.getInstance(this.f).browsingToLogin(new IBaseResponseCallback() { // from class: dgd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f31772c.c(i, i2, obj);
            }
        }, "");
    }

    public /* synthetic */ void e(View view) {
        finish();
    }

    public /* synthetic */ void c(int i, int i2, Object obj) {
        LogUtil.d("HwSchemeBasicHealthActivity", "jumpLogin errorCode =", Integer.valueOf(i2));
        if (i2 == 0) {
            g(i);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), BaseApplication.getAppPackage() + ".MainActivity");
        intent.setFlags(67108864);
        intent.putExtra(com.huawei.operation.utils.Constants.HOME_TAB_NAME, com.huawei.operation.utils.Constants.HOME_TAB_DEVICE);
        intent.putExtra("SHORTCUT", "SC_DEVICE");
        iov.d(context, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        setIntent(null);
        finish();
    }

    private void c(int i, LoginInit loginInit) {
        LogUtil.a("HwSchemeBasicHealthActivity", "jumpToPage healthType", Integer.valueOf(i));
        if (!loginInit.getIsLogined() || !AuthorizationUtils.c(this.f)) {
            LogUtil.a("HwSchemeBasicHealthActivity", "jumpToPage no login");
            ArrayList arrayList = new ArrayList(Arrays.asList(10, 11, 1, 2, 3, 9, 5, 8, 4, 7, 22, 6, 6001, 110));
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            launchIntentForPackage.putExtra(com.huawei.health.messagecenter.model.CommonUtil.PARAM_HEALTH_TYPE, i > -1 ? i : 0);
            if (arrayList.contains(Integer.valueOf(i))) {
                launchIntentForPackage.setData(this.v);
            }
            launchIntentForPackage.putExtra("needLogin", !loginInit.getIsLogined());
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setClass(this, MainActivity.class);
            startActivity(launchIntentForPackage);
            finish();
            return;
        }
        this.n = true;
        if (i != 2) {
            Intent intent = new Intent();
            intent.putExtra(com.huawei.health.messagecenter.model.CommonUtil.PARAM_HEALTH_TYPE, 0);
            intent.setClass(this, MainActivity.class);
            startActivity(intent);
        }
        OpAnalyticsUtil.getInstance().init(BaseApplication.getContext());
        g(i);
    }

    private void d(Uri uri) {
        LogUtil.a("HwSchemeBasicHealthActivity", "jumpToDeviceActivity enter and schemeData: ", uri);
        try {
            String queryParameter = uri.getQueryParameter("DeviceType");
            this.g = queryParameter;
            LogUtil.a("HwSchemeBasicHealthActivity", "onCreate deviceType = ", queryParameter);
            if ("06E".equals(this.g) || "06D".equals(this.g)) {
                LogUtil.a("HwSchemeBasicHealthActivity", "onCreate go to band or watch");
                dgq.e(uri, this.g, this.f, this.u, getIntent().getBooleanExtra("isClick", false));
                finish();
            } else if ("025".equals(this.g) && !TextUtils.isEmpty(dxm.g.get(uri.getQueryParameter("ProductID")))) {
                LogUtil.a("HwSchemeBasicHealthActivity", "onCreate go to scale");
                e(uri);
            } else if (etn.b(this.g) != null) {
                b(uri.getQueryParameter("ProductID"), uri.getQueryParameter("SubMAC"), uri.getQueryParameter("Opcode"), this.g, uri.getQueryParameter("WiseDeviceId"));
            } else {
                if ("082".equals(this.g)) {
                    b(uri);
                    return;
                }
                LogUtil.a("HwSchemeBasicHealthActivity", "onCreate go to other condition");
                AppRouter.c("/home/main").c(com.huawei.operation.utils.Constants.HOME_TAB_NAME, com.huawei.operation.utils.Constants.HOME_TAB_DEVICE).i();
                finish();
            }
        } catch (UnsupportedOperationException unused) {
            LogUtil.e("HwSchemeBasicHealthActivity", "jumpToDeviceActivity error is UnsupportedOperationException");
        }
    }

    private void b(final Uri uri) {
        LogUtil.a("HwSchemeBasicHealthActivity", "handleSmartHeadphones");
        final String queryParameter = uri.getQueryParameter("ProductID");
        uri.getQueryParameter("Opcode");
        d(new UpdateProductMapCallback() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.1
            @Override // com.huawei.health.utils.UpdateProductMapCallback
            public void success() {
                ProductMapInfo productMapInfoD = ProductMap.d(queryParameter);
                if (productMapInfoD == null) {
                    LogUtil.a("HwSchemeBasicHealthActivity", "handleUpdateProductMap success");
                    dgq.a(HwSchemeBasicHealthActivity.this);
                    HwSchemeBasicHealthActivity.this.finish();
                    return;
                }
                String strF = productMapInfoD.f();
                Intent intent = new Intent(HwSchemeBasicHealthActivity.this, (Class<?>) DeviceMainActivity.class);
                intent.putExtra("PID_FROM_QRCODE", queryParameter);
                intent.putExtra("productId", strF);
                intent.putExtra("Device_Type", uri.getQueryParameter("DeviceType"));
                intent.putExtra("macAddress", uri.getQueryParameter("SubMAC"));
                intent.putExtra("FROM_SMART_LIFE", true);
                intent.setFlags(268435456);
                HwSchemeBasicHealthActivity.this.startActivity(intent);
                HwSchemeBasicHealthActivity.this.finish();
            }

            @Override // com.huawei.health.utils.UpdateProductMapCallback
            public void onFailure() {
                LogUtil.a("HwSchemeBasicHealthActivity", "handleUpdateProductMap onFailure");
                dgq.a(HwSchemeBasicHealthActivity.this);
                HwSchemeBasicHealthActivity.this.finish();
            }
        });
    }

    private void e(Uri uri) {
        if (uri == null) {
            return;
        }
        String queryParameter = uri.getQueryParameter("ProductID");
        String queryParameter2 = uri.getQueryParameter("SubMAC");
        String queryParameter3 = uri.getQueryParameter("WiseDeviceId");
        String str = dxm.g.get(queryParameter);
        LogUtil.a("HwSchemeBasicHealthActivity", "smartProductId ", queryParameter, " productId ", str, " subMac ", queryParameter2, "wiseDeviceId ", queryParameter3);
        if (TextUtils.isEmpty(str)) {
            dgq.a(this);
            finish();
        } else {
            String queryParameter4 = uri.getQueryParameter("Opcode");
            LogUtil.a("HwSchemeBasicHealthActivity", "had Device smartProductId ", queryParameter, " operateCode ", queryParameter4, " productId ", str);
            if ("Add".equals(queryParameter4)) {
                LogUtil.a("HwSchemeBasicHealthActivity", "add Device smartLifeJumpScale OPERATE_ADD");
                HealthDevice.HealthDeviceKind healthDeviceKindB = etn.b(this.g);
                if (healthDeviceKindB != null) {
                    etn.c(this, healthDeviceKindB.name(), str);
                }
            } else if ("Delete".equals(queryParameter4)) {
                LogUtil.a("HwSchemeBasicHealthActivity", "del Device smartProductId ", queryParameter);
                if (drw.e().b(str) != null) {
                    a("DeviceInfoList", str, queryParameter4, queryParameter2, queryParameter3);
                }
            } else if (drw.e().b(str) != null) {
                a("DeviceInfoList", str, queryParameter4, queryParameter2, queryParameter3);
            } else {
                a("syncDevice", str, queryParameter4, queryParameter2, queryParameter3);
            }
        }
        finish();
    }

    private void b(final String str, final String str2, final String str3, String str4, final String str5) {
        LogUtil.d("HwSchemeBasicHealthActivity", "smartProductId=", str, ", deviceType=", str4, ", operateCode=", str3, ", wiseDeviceId=", str5);
        final HealthDevice.HealthDeviceKind healthDeviceKindB = etn.b(str4);
        d(new UpdateProductMapCallback() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.10
            @Override // com.huawei.health.utils.UpdateProductMapCallback
            public void success() {
                ProductMapInfo productMapInfoD = ProductMap.d(str);
                if (productMapInfoD == null) {
                    dgq.a(HwSchemeBasicHealthActivity.this);
                    HwSchemeBasicHealthActivity.this.finish();
                    return;
                }
                String strF = productMapInfoD.f();
                if ("Add".equals(str3)) {
                    if (etn.a(HwSchemeBasicHealthActivity.this)) {
                        etn.c(HwSchemeBasicHealthActivity.this, healthDeviceKindB.name(), strF);
                        HwSchemeBasicHealthActivity.this.finish();
                        return;
                    }
                    Intent intent = new Intent(HwSchemeBasicHealthActivity.this, (Class<?>) DeviceMainActivity.class);
                    intent.putExtra("view", "bindSport");
                    intent.putExtra("productId", strF);
                    ContentValues contentValuesC = iqc.c(str5, str2, strF);
                    intent.putExtra("commonDeviceInfo", contentValuesC);
                    intent.putExtra("Device_Type", healthDeviceKindB.name());
                    intent.putExtra("FROM_SMART_LIFE", true);
                    intent.setFlags(268435456);
                    LogUtil.d("HwSchemeBasicHealthActivity", "smartLifeJumpSport deviceInfo ", contentValuesC.getAsString("uniqueId"), contentValuesC);
                    HwSchemeBasicHealthActivity.this.startActivity(intent);
                } else if (drw.e().b(strF) != null) {
                    HwSchemeBasicHealthActivity.this.a("DeviceInfoList", strF, str3, str2, str5);
                } else if (!"Delete".equals(str3)) {
                    HwSchemeBasicHealthActivity.this.a("syncDevice", strF, str3, str2, str5);
                }
                HwSchemeBasicHealthActivity.this.finish();
            }

            @Override // com.huawei.health.utils.UpdateProductMapCallback
            public void onFailure() {
                LogUtil.a("HwSchemeBasicHealthActivity", "handleUpdateProductMap onFailure");
                dgq.a(HwSchemeBasicHealthActivity.this);
                HwSchemeBasicHealthActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent();
        intent.setAction("SWITCH_PLUGINDEVICE");
        ContentValues contentValuesC = iqc.c(str5, str4, str2);
        LogUtil.d("HwSchemeBasicHealthActivity", "startDeviceManager deviceInfo ", contentValuesC);
        contentValuesC.put("productId", str2);
        Bundle bundle = new Bundle();
        bundle.putString("arg1", str);
        bundle.putParcelable("commonDeviceInfo", contentValuesC);
        bundle.putString("productId", str2);
        bundle.putString("mDeviceId", str5);
        bundle.putString("mac", str4);
        bundle.putString("operateCode", str3);
        bundle.putString("Device_Type", this.g);
        LogUtil.a("HwSchemeBasicHealthActivity", "deviceType is=", this.g);
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("FROM_SMART_LIFE", true);
        intent.putExtras(bundle);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    private void d(final UpdateProductMapCallback updateProductMapCallback) {
        if (lql.a(this.f)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!lql.b(HwSchemeBasicHealthActivity.this.f, 2)) {
                        LogUtil.j("HwSchemeBasicHealthActivity", "isDownloadMapSuccess is false");
                        updateProductMapCallback.onFailure();
                    } else {
                        updateProductMapCallback.success();
                        LogUtil.a("HwSchemeBasicHealthActivity", "isDownloadMapSuccess is true");
                    }
                }
            });
        } else if (ProductMapParseUtil.a(this.f)) {
            LogUtil.a("HwSchemeBasicHealthActivity", "loadProductMapConfig is true");
            updateProductMapCallback.success();
        } else {
            LogUtil.j("HwSchemeBasicHealthActivity", "loadProductMapConfig is false");
            updateProductMapCallback.onFailure();
        }
    }

    private void s() {
        if (dgq.d("005W") == null) {
            dgq.c(this, "06D");
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setClassName(this.f, "com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity");
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, 34);
        intent.putExtra("dname", "HUAWEI WATCH GT 2 Pro");
        intent.putExtra("isFromWear", true);
        startActivity(intent);
        finish();
    }

    private void g(int i) {
        LogUtil.a("HwSchemeBasicHealthActivity", "skipActivity healthType = ", Integer.valueOf(i));
        if (i == 1) {
            a(1);
            if (!"series_course_detail".equals(this.v.getQueryParameter(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE))) {
                if ("series_course".equals(this.v.getQueryParameter(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE))) {
                    b(1);
                    return;
                } else if ("detection".equals(this.v.getQueryParameter(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE))) {
                    af();
                    return;
                } else {
                    ah();
                    return;
                }
            }
            ab();
            return;
        }
        if (i == 2) {
            au();
            return;
        }
        if (i == 3) {
            if ("series_course".equals(this.v.getQueryParameter(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE))) {
                b(3);
                return;
            } else {
                b(false);
                return;
            }
        }
        if (i == 4) {
            ag();
            return;
        }
        if (i == 5) {
            u();
            return;
        }
        if (i == 7) {
            s();
            return;
        }
        if (i == 30) {
            if ("series_course".equals(this.v.getQueryParameter(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE))) {
                b(30);
                return;
            } else {
                aw();
                return;
            }
        }
        j(i);
    }

    private void af() {
        this.k = "true".equals(this.v.getQueryParameter("isStart"));
        pjo.b().c(this, this.k, this.v.getQueryParameter(ArkUIXConstants.FROM_TYPE));
        finish();
    }

    private void j(int i) {
        if (i == 6) {
            c(this.f);
            finish();
            return;
        }
        if (i == 20) {
            ae();
            return;
        }
        if (i == 80) {
            a(this.v.getQueryParameter("deviceId"), this.v.getQueryParameter("sn"));
            return;
        }
        if (i == 90) {
            w();
            return;
        }
        if (i == 6001) {
            j();
            return;
        }
        switch (i) {
            case 8:
                x();
                break;
            case 9:
                y();
                break;
            case 10:
                v();
                break;
            case 11:
                a(9);
                ac();
                break;
            case 12:
                z();
                break;
            default:
                c(i);
                break;
        }
    }

    private void c(int i) {
        if (i == 51) {
            al();
            return;
        }
        if (i == 100) {
            etn.a(this.f, "HDK_ECG");
            finish();
            return;
        }
        if (i != 110) {
            switch (i) {
                case 21:
                    aa();
                    break;
                case 22:
                    d(this.v.getQueryParameter(BleConstants.KEY_PATH), true);
                    break;
                case 23:
                    ai();
                    break;
                default:
                    LogUtil.j("HwSchemeBasicHealthActivity", "skipActivity default");
                    startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
                    finish();
                    break;
            }
            return;
        }
        ad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, boolean z) {
        LogUtil.a("HwSchemeBasicHealthActivity", "gotoDietDiaryGuideH5");
        if (z) {
            ddv.b().putBiEventFromH5Deeplink(this.v.toString(), ddx.e);
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("HwSchemeBasicHealthActivity", "gotoDietDiaryGuideH5 path ", str);
            if (str.contains("Analysis") && z) {
                am();
                return;
            } else {
                sb.append(com.huawei.operation.utils.Constants.H5PRO_PAGE_PREFIX);
                sb.append(str);
            }
        } else {
            if (!z) {
                e(3);
            }
            sb.append("#/diet_recording_tool");
        }
        String query = this.v.getQuery();
        if (!TextUtils.isEmpty(query)) {
            sb.append("?");
            sb.append(query);
        }
        LogUtil.a("HwSchemeBasicHealthActivity", "gotoDietDiaryGuideH5 gotoDietDiaryPath ", sb.toString());
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(sb.toString());
        H5proUtil.putH5ProGlobalBiParams(ddx.e + "?" + query, builder);
        ddv.b().loadH5ProApp(this.f, ddx.e, builder);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        AppRouter.c("/HWUserProfileMgr/UserInfoActivity").d(268435456).b(this);
        e(2);
        finish();
    }

    private void e(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("operation_type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DIET_ANALYSIS_DEEP_LINK_2040210.value(), map, 0);
    }

    private void am() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "USER_VIP_INFO_KEY");
        if (TextUtils.isEmpty(strE)) {
            ao();
            LogUtil.a("HwSchemeBasicHealthActivity", "initJumpDietAnalysis not member");
            return;
        }
        UserMemberInfo userMemberInfo = (UserMemberInfo) peh.b(strE, UserMemberInfo.class);
        if (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1 || irz.d(userMemberInfo)) {
            ao();
            LogUtil.a("HwSchemeBasicHealthActivity", "initJumpDietAnalysis not member");
        } else {
            o();
        }
    }

    private void ao() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/PrivilegeDetail?functionId=3");
        H5proUtil.putH5ProGlobalBiParams("com.huawei.health.h5.vip?" + this.v.getQuery(), builder);
        ddv.b().loadH5ProApp(this.f, "com.huawei.health.h5.vip", builder);
        e(1);
        finish();
    }

    private void o() {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ReleaseLogUtil.d("R_HwSchemeBasicHealthActivity", "getDietRecord dayFormat ", Integer.valueOf(iA));
        iun.a(iA, iA, new a(this));
    }

    static class a implements ResponseCallback<List<vgo>> {
        private final WeakReference<HwSchemeBasicHealthActivity> e;

        public a(HwSchemeBasicHealthActivity hwSchemeBasicHealthActivity) {
            this.e = new WeakReference<>(hwSchemeBasicHealthActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            Uri data;
            LogUtil.a("HwSchemeBasicHealthActivity", "DietRecordListener errorCode ", Integer.valueOf(i), " list ", list);
            HwSchemeBasicHealthActivity hwSchemeBasicHealthActivity = this.e.get();
            if (hwSchemeBasicHealthActivity == null || hwSchemeBasicHealthActivity.isDestroyed() || hwSchemeBasicHealthActivity.isFinishing()) {
                ReleaseLogUtil.e("R_HwSchemeBasicHealthActivity", "DietRecordListener activity ", hwSchemeBasicHealthActivity);
                return;
            }
            String queryParameter = "";
            if (njy.e(list)) {
                ReleaseLogUtil.e("R_HwSchemeBasicHealthActivity", "DietRecordListener list ", list);
                hwSchemeBasicHealthActivity.d("", false);
                return;
            }
            vgo vgoVar = list.get(0);
            if (vgoVar == null) {
                ReleaseLogUtil.e("R_HwSchemeBasicHealthActivity", "DietRecordListener dietRecord is null list ", list);
                hwSchemeBasicHealthActivity.d("", false);
                return;
            }
            List<vgw> listA = vgoVar.a();
            if (njy.e(listA)) {
                ReleaseLogUtil.e("R_HwSchemeBasicHealthActivity", "DietRecordListener mealList ", listA);
                hwSchemeBasicHealthActivity.d("", false);
                return;
            }
            boolean z = false;
            for (vgw vgwVar : listA) {
                if (vgwVar != null && !njy.e(vgwVar.c())) {
                    z = true;
                }
            }
            ReleaseLogUtil.d("R_HwSchemeBasicHealthActivity", "DietRecordListener hasFood ", Boolean.valueOf(z));
            if (!z) {
                hwSchemeBasicHealthActivity.d("", false);
                return;
            }
            UserInfomation userInfomationA = ioy.a();
            LogUtil.a("HwSchemeBasicHealthActivity", "DietRecordListener userInformation ", userInfomationA);
            if (userInfomationA == null) {
                ReleaseLogUtil.e("R_HwSchemeBasicHealthActivity", "DietRecordListener userInformation is null");
                hwSchemeBasicHealthActivity.aq();
                return;
            }
            if (userInfomationA.getAge() <= 0 || !userInfomationA.isHeightValid() || !userInfomationA.isWeightValid()) {
                hwSchemeBasicHealthActivity.aq();
                return;
            }
            Intent intent = hwSchemeBasicHealthActivity.getIntent();
            if (intent != null && (data = intent.getData()) != null) {
                queryParameter = data.getQueryParameter(BleConstants.KEY_PATH);
            }
            LogUtil.a("HwSchemeBasicHealthActivity", "DietRecordListener path ", queryParameter);
            hwSchemeBasicHealthActivity.d(queryParameter, false);
        }
    }

    private void ad() {
        try {
            String queryParameter = this.v.getQueryParameter(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE);
            String queryParameter2 = this.v.getQueryParameter("devicePackageName");
            if (TextUtils.isEmpty(queryParameter2)) {
                prf.d(this.f, queryParameter);
            } else {
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                builder.addCustomizeArg("enterType", queryParameter);
                builder.addCustomizeArg("devicePackageName", queryParameter2);
                ddv.b().loadH5ProApp(this, "com.huawei.health.h5.ecg", builder);
            }
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HwSchemeBasicHealthActivity", "goToQuickAppEcg IllegalArgumentException:", e2.getMessage());
        }
        finish();
    }

    private void av() {
        int iL = l();
        LogUtil.a("HwSchemeBasicHealthActivity", "skipDeviceMgrActivity deviceMgrType:", Integer.valueOf(iL));
        if (iL == 1 || iL == 8) {
            h(iL);
            return;
        }
        JumpDeviceStrategy jumpDeviceStrategyA = dip.a(iL);
        if (jumpDeviceStrategyA != null) {
            jumpDeviceStrategyA.processAndJump();
            finish();
        } else {
            LogUtil.j("HwSchemeBasicHealthActivity", "skipDeviceMgrActivity default");
            lvb.e().setSharedPreference("KEY_LAST_DEVICE_TAB", String.valueOf(0), null);
            d(this.f);
        }
    }

    private void h(int i) {
        LogUtil.a("HwSchemeBasicHealthActivity", "skipDeviceMgrActivityOld");
        if (i == 1) {
            ar();
        } else {
            if (i != 8) {
                return;
            }
            ak();
        }
    }

    private void ar() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "HwSchemeBasicHealthActivity");
        d(njy.e(deviceList) ? new DeviceInfo() : deviceList.get(0), 1);
        String strB = b(WebViewHelp.BI_KEY_PULL_FROM);
        LogUtil.a("HwSchemeBasicHealthActivity", "jumpWatchFace:", strB);
        if (!"globalsearch".equalsIgnoreCase(strB) && WatchFaceUtil.isSupportMyWatch()) {
            LogUtil.a("HwSchemeBasicHealthActivity", "jumpWatchFace my watchface");
            iqy.b();
            finish();
        } else if (WatchFaceUtil.isSupportWatchFaceMarket()) {
            LogUtil.j("HwSchemeBasicHealthActivity", "jumpAppHelp no watchface market");
            q();
        } else {
            d(this.f);
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.browseraction.HwSchemeBasicHealthActivity$9, reason: invalid class name */
    public class AnonymousClass9 implements Runnable {
        AnonymousClass9() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = HwSchemeBasicHealthActivity.e = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainContentcenterDbankcdnNew", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dgj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31775c.e();
                }
            });
        }

        public /* synthetic */ void e() {
            if (!TextUtils.isEmpty(HwSchemeBasicHealthActivity.e)) {
                HwSchemeBasicHealthActivity.this.aj();
                return;
            }
            LogUtil.j("HwSchemeBasicHealthActivity", "mWatchFaceGrsUrl is empty");
            HwSchemeBasicHealthActivity hwSchemeBasicHealthActivity = HwSchemeBasicHealthActivity.this;
            hwSchemeBasicHealthActivity.d(hwSchemeBasicHealthActivity.f);
        }
    }

    private void q() {
        LogUtil.a("HwSchemeBasicHealthActivity", "start to get watchFace url");
        ThreadPoolManager.c().execute(new AnonymousClass9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, int i) {
        HashMap map = new HashMap();
        if (deviceInfo != null) {
            map.put("device_name_key", deviceInfo.getDeviceName());
            map.put("product_type", Integer.valueOf(deviceInfo.getProductType()));
        }
        map.put("operation_type", Integer.valueOf(i));
        String strValue = AnalyticsValue.DEVICE_MANAGER_DEEP_LINK_2060094.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                LogUtil.j("HwSchemeBasicHealthActivity", "the mapValue is null when mapKey is:", str);
            } else {
                linkedHashMap.put(str, value.toString());
            }
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Class<?> cls) {
        Intent intent = new Intent(this.f, cls);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("device_id", str);
        }
        intent.setFlags(67108864);
        startActivity(intent);
        as();
    }

    private void ak() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
            LogUtil.d("HwSchemeBasicHealthActivity", "jumpMusic adapter is not Enabled");
            d(this.f);
        } else {
            if (lug.c() == null) {
                LogUtil.j("HwSchemeBasicHealthActivity", "jumpMusicList getDeviceList iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
                new Handler().postDelayed(new Runnable() { // from class: dfz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31765b.e();
                    }
                }, 500L);
                return;
            }
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e() {
        LogUtil.a("HwSchemeBasicHealthActivity", "beginJumpMusicList");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "HwSchemeBasicHealthActivity");
        if (njy.e(deviceList) || eel.d(deviceList.get(0).getProductType())) {
            LogUtil.j("HwSchemeBasicHealthActivity", "jumpMusic currentDeviceInfo is null");
            b("", MusicMainActivity.class);
            return;
        }
        String deviceIdentify = deviceList.get(0).getDeviceIdentify();
        DeviceCapability deviceCapabilityA = eej.a(deviceIdentify);
        if (deviceCapabilityA == null) {
            LogUtil.j("HwSchemeBasicHealthActivity", "deviceCapability is null");
            d(this.f);
        } else if (!deviceCapabilityA.isSupportMusicInfoList()) {
            LogUtil.j("HwSchemeBasicHealthActivity", "jumpMusicList not support Music");
            d(this.f);
        } else {
            e(deviceIdentify);
        }
    }

    private void e(String str) {
        LogUtil.a("HwSchemeBasicHealthActivity", "go to jumpMusicListImpl");
        if (lzq.h()) {
            LogUtil.a("HwSchemeBasicHealthActivity", "isSupportAuthorizationStatus()");
            lzl.a(BaseApplication.getContext()).e(this.j);
        } else {
            LogUtil.a("HwSchemeBasicHealthActivity", "go to musicMainActivity");
            b(str, MusicMainActivity.class);
        }
    }

    private int a(String str) {
        try {
            return CommonUtils.j(this.v.getQueryParameter(str));
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            LogUtil.e("HwSchemeBasicHealthActivity", "get type IllegalArgumentException:", str, LogAnonymous.b(e2));
            return -1;
        }
    }

    private String b(String str) {
        Uri uri = this.v;
        if (uri == null) {
            LogUtil.j("HwSchemeBasicHealthActivity", "getQueryParameter mSchemeData is null");
            return "";
        }
        try {
            return uri.getQueryParameter(str);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            LogUtil.e("HwSchemeBasicHealthActivity", "getQueryParameter exception ", LogAnonymous.b(e2));
            return "";
        }
    }

    private void c(Context context) {
        String strB = b("id");
        String strB2 = b("from");
        LogUtil.a("HwSchemeBasicHealthActivity", "bundleGotoHealthModel id ", strB, " from ", strB2);
        if (TextUtils.isEmpty(strB) && TextUtils.isEmpty(strB2)) {
            ffv.a(context, (Uri) null);
        } else {
            n();
            ffv.c(context, this.v);
        }
    }

    private void j() {
        if (ffv.c() == null) {
            LogUtil.j("HwSchemeBasicHealthActivity", "bundleGotoHealthModel healthModelApi is null");
            finish();
        } else {
            AppRouter.c("/PluginHealthModel/HealthWeekReportActivity").e("isFromExclusiveRightsPage", true).b(this);
            finish();
        }
    }

    private int k() {
        return a(com.huawei.health.messagecenter.model.CommonUtil.PARAM_HEALTH_TYPE);
    }

    private String t() {
        try {
            return this.v.getQueryParameter("from");
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HwSchemeBasicHealthActivity", "getSchemeFrom IllegalArgumentException:", e2.getMessage());
            return "";
        }
    }

    private String r() {
        try {
            return this.v.getQueryParameter("deviceId");
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HwSchemeBasicHealthActivity", "getProductId IllegalArgumentException:", e2.getMessage());
            return "";
        }
    }

    private int l() {
        return a("deviceMgrType");
    }

    private void ah() {
        LogUtil.a("HwSchemeBasicHealthActivity", "mSchemeData: ", this.v.toString());
        this.w = this.v.getQueryParameter(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE);
        this.k = "true".equals(this.v.getQueryParameter("isStart"));
        String queryParameter = this.v.getQueryParameter(ArkUIXConstants.FROM_TYPE);
        String queryParameter2 = this.v.getQueryParameter("from");
        if (!TextUtils.isEmpty(queryParameter)) {
            this.o = queryParameter;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isStartPhoneSleep", "detection".equals(this.w));
        bundle.putBoolean("isStartNow", this.k);
        bundle.putString(ArkUIXConstants.FROM_TYPE, this.o);
        bundle.putString("pullTime", this.v.getQueryParameter("pullTime"));
        int iA = "fa".equals(queryParameter2) ? 5 : lsk.a(queryParameter2, 10);
        LogUtil.a("HwSchemeBasicHealthActivity", "fromVal: ", Integer.valueOf(iA));
        bundle.putInt("from", iA);
        KnitSleepDetailActivity.e(this, bundle);
        n();
        finish();
    }

    private void b(int i) {
        Intent intent = new Intent(this, (Class<?>) SleepPopularCoursesActivity.class);
        intent.setPackage(this.f.getPackageName());
        intent.setFlags(268435456);
        intent.putExtra(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, i);
        lsx.c(intent, this.f);
        finish();
    }

    private void ab() {
        Intent intent = new Intent(this, (Class<?>) SeriesCourseListActivity.class);
        intent.putExtra("id", this.v.getQueryParameter("id"));
        intent.putExtra(WebViewHelp.BI_KEY_PULL_FROM, this.v.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM));
        intent.putExtra("resourceId", this.v.getQueryParameter("resourceId"));
        intent.putExtra("resourceName", this.v.getQueryParameter("resourceName"));
        intent.putExtra("pullOrder", this.v.getQueryParameter("pullOrder"));
        intent.putExtra("from", this.v.getQueryParameter("from"));
        intent.putExtra(WebViewHelp.BI_KEY_PULL_FROM, this.v.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM));
        intent.putExtra("resourceId", this.v.getQueryParameter("resourceId"));
        intent.putExtra("resourceName", this.v.getQueryParameter("resourceName"));
        intent.setPackage(this.f.getPackageName());
        intent.setFlags(268435456);
        lsx.c(intent, this.f);
        finish();
    }

    private void aw() {
        Intent intent = new Intent(this, (Class<?>) KnitMindActivity.class);
        intent.setPackage(this.f.getPackageName());
        intent.setFlags(268435456);
        lsx.c(intent, this.f);
        finish();
    }

    private void b(final boolean z) {
        c(new IBaseResponseCallback() { // from class: dgg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f31774b.d(z, i, obj);
            }
        });
    }

    public /* synthetic */ void d(final boolean z, int i, Object obj) {
        HandlerExecutor.c(new Runnable() { // from class: dgc
            @Override // java.lang.Runnable
            public final void run() {
                this.f31770c.a(z);
            }
        });
    }

    public /* synthetic */ void a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("start_game", z);
        uye.a(this.f, bundle);
        finish();
    }

    private void au() {
        int iA = a(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE);
        LogUtil.a("HwSchemeBasicHealthActivity", "goToWeightActivity pageType is ", Integer.valueOf(iA), " ,mIsColdStart ", Boolean.valueOf(this.n), ",mIsFromFA:" + this.l);
        Intent intent = new Intent();
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser != null) {
            intent.putExtra("weight_user_id", currentUser.i());
        }
        if (this.l) {
            intent.putExtra("moveTaskToBack", true);
            intent.setFlags(268435456);
        }
        if (iA != 10 && this.n) {
            intent.putExtra("base_health_data_type_key", 1);
            if (this.i) {
                startActivityForResult(intent, 1003);
                return;
            }
            intent.putExtra("BASE_HEALTH_DATA_TYPE_COLD_START_KEY", "weight");
            iun.d("", intent);
            finish();
            return;
        }
        if (iA == 10 && this.n) {
            intent.putExtra("base_health_data_type_key", 10);
            intent.putExtra("BASE_HEALTH_DATA_TYPE_COLD_START_KEY", TextUtils.isEmpty(this.v.getQuery()) ? "#/guide_index" : this.v.getQuery());
            iun.d(String.valueOf(2), intent);
            finish();
            return;
        }
        if (iA == 10) {
            b(intent);
            return;
        }
        intent.putExtra("base_health_data_type_key", 1);
        if (this.i) {
            startActivityForResult(intent, 1003);
            return;
        }
        intent.putExtra(ParamConstants.Param.FLAGS, 67108864);
        iun.d("", intent);
        finish();
    }

    private void b(Intent intent) {
        LogUtil.a("HwSchemeBasicHealthActivity", "is from fasting deeplink");
        ddv.b().putBiEventFromH5Deeplink(this.v.toString(), "com.huawei.health.h5.fasting-lite");
        ThreadPoolManager.c().execute(new Runnable() { // from class: dga
            @Override // java.lang.Runnable
            public final void run() {
                this.f31767b.d();
            }
        });
    }

    public /* synthetic */ void d() {
        vgp vgpVarB = vhn.b();
        boolean z = vgpVarB != null && vgpVarB.c();
        if (vgpVarB != null && vgpVarB.d() != null && vgpVarB.d().d() != null && vgpVarB.d().d().i() > 0) {
            runOnUiThread(new Runnable() { // from class: dgh
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a();
                }
            });
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        String query = this.v.getQuery();
        String str = z ? "#/plan_setting" : "#/guide_index";
        LogUtil.a("HwSchemeBasicHealthActivity", "isJoinFastingLite=", Boolean.valueOf(z), ", path=", str);
        if (TextUtils.isEmpty(query)) {
            builder.addPath(str);
        } else {
            LogUtil.a("HwSchemeBasicHealthActivity", "initWeightDeepLink parameters ", query);
            builder.addPath(str + "?" + query);
        }
        builder.addCustomizeJsModule("tradeApi", JsTradeApi.class);
        H5proUtil.putH5ProGlobalBiParams("com.huawei.health.h5.fasting-lite?" + query, builder);
        ddv.b().loadH5ProApp(this.f, "com.huawei.health.h5.fasting-lite", builder);
        finish();
    }

    public /* synthetic */ void a() {
        new NoTitleCustomAlertDialog.Builder(this).b(R.string.IDS_wl_food_f_b_update).c(R.string.IDS_wl_food_know, new View.OnClickListener() { // from class: dfx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31763b.b(view);
            }
        }).c().show();
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    private void c(final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{44306});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.browseraction.HwSchemeBasicHealthActivity.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("HwSchemeBasicHealthActivity", "getStressStatisticsDatas errorCode = " + i);
                if (obj == null) {
                    iBaseResponseCallback.a(100001, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    iBaseResponseCallback.a(100001, null);
                } else if (((HiHealthData) ((List) sparseArray.get(44306)).get(0)) != null) {
                    iBaseResponseCallback.a(0, null);
                } else {
                    iBaseResponseCallback.a(100001, null);
                }
            }
        });
    }

    private void ag() {
        e(AnalyticsValue.TEMPERATURE_2060073.value(), 1);
        if (fua.j()) {
            Intent intent = new Intent();
            boolean booleanQueryParameter = this.v.getBooleanQueryParameter("isSkin", false);
            intent.setClass(this, KnitTemperatureActivity.class);
            if (booleanQueryParameter) {
                intent.putExtra(KnitHealthDetailActivity.TEMPERATURE_TYPE, "SKIN_TEMPERATURE_MIN_MAX");
            }
            iov.d(this.f, intent);
        } else {
            HealthDataDetailActivity.a(this.f, "BodyTemperatureCardConstructor", 24);
        }
        finish();
    }

    private void u() {
        Intent intent = new Intent();
        intent.setClass(this, KnitBloodOxygenDetailActivity.class);
        iov.d(this.f, intent);
        finish();
    }

    private void x() {
        i(AnalyticsValue.HEALTH_HOME_BLOOD_SUGAR_DETAIL_2010027.value());
        if (fua.r()) {
            iov.e(this.v);
            return;
        }
        if (this.l) {
            Intent intent = new Intent(this, (Class<?>) HealthDataDetailActivity.class);
            intent.putExtra("extra_service_id", "BloodSugarCardConstructor");
            intent.putExtra("extra_time_stamp", 0L);
            intent.putExtra("extra_page_type", 8);
            intent.setFlags(268468224);
            iov.d(this.f, intent);
        } else {
            HealthDataDetailActivity.a(this, "BloodSugarCardConstructor", 8);
        }
        finish();
    }

    private void a(String str, String str2) {
        LogUtil.a("HwSchemeBasicHealthActivity", "goToBloodSugarDeviceManagePage productId: ", str, ";code: ", CommonUtil.n(str2));
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("SWITCH_PLUGINDEVICE");
        bundle.putString("arg1", "DeviceInfoList");
        bundle.putString("productId", str);
        bundle.putString("uniqueId", str2);
        intent.setPackage(getPackageName());
        intent.setClassName(getPackageName(), "com.huawei.health.device.ui.DeviceMainActivity");
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", str);
        contentValues.put("uniqueId", str2);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        intent.putExtras(bundle);
        intent.putExtra("isBindSuccess", true);
        intent.putExtra("thirdDeviceToApp", true);
        startActivity(intent);
        finish();
    }

    private void w() {
        Intent intent = new Intent();
        intent.putExtra("productId", r());
        intent.setClass(this, DeviceUsageDescriptionActivity.class);
        if (this.l) {
            intent.setFlags(268468224);
        }
        startActivity(intent);
        finish();
    }

    private void i(String str) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.f.getApplicationContext(), str, map, 0);
    }

    private void e(String str, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(getApplicationContext(), str, map, 0);
    }

    private void y() {
        if (fua.p()) {
            Intent intent = new Intent();
            intent.setClassName(this.f.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
            IntentParams intentParamsBuild = IntentParams.builder().addPageId(ArkUIXConstants.KNIT_BLOOD_PRESSURE).addBuildConfigInfo(CommonUtil.a()).addBiFrom("Today_0001", "home_card", "").build();
            LogUtil.a("HwSchemeBasicHealthActivity", "params start with: ", intentParamsBuild.toString());
            intent.putExtra(e.n, intentParamsBuild.toString());
            intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 6);
            iov.c(this.f, intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(this, KnitBloodPressureActivity.class);
            if (this.l) {
                intent2.setFlags(268468224);
            }
            iov.d(this.f, intent2);
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void ae() {
        int iJ;
        Intent intent = new Intent();
        Uri uri = this.v;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(BleConstants.SPORT_TYPE);
            if (TextUtils.isEmpty(queryParameter)) {
                iJ = -1;
            } else {
                iJ = CommonUtils.j(queryParameter);
            }
        } else {
            iJ = -1;
        }
        if (iJ == -1) {
            iJ = 283;
        }
        intent.putExtra(BleConstants.SPORT_TYPE, iJ);
        intent.setClass(this, SportHistoryActivity.class);
        iov.d(this.f, intent);
        finish();
    }

    private void aa() {
        Intent intent = new Intent();
        intent.putExtra(BleConstants.SPORT_TYPE, OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE);
        if (this.l) {
            intent.addFlags(268468224);
        }
        intent.setClass(this, SportHistoryActivity.class);
        iov.d(this.f, intent);
        finish();
    }

    private void ai() {
        LogUtil.a("HwSchemeBasicHealthActivity", "goToSportDataDetailActivity");
        jxh.a(c("startTime"), c("endTime"), new IBaseResponseCallback() { // from class: dfy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f31764a.d(i, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("HwSchemeBasicHealthActivity", "onResponse code: ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof njd)) {
            LogUtil.a("HwSchemeBasicHealthActivity", "JumpToTrackDetailActivity");
            Bundle bundleD = d((njd) obj);
            bundleD.putBoolean("ExitApp", this.l);
            Guidepost guidepostD = AppRouter.c("/PluginMotionTrack/TrackDetailActivity").d(bundleD);
            if (this.l) {
                guidepostD.d(268468224);
            }
            guidepostD.b(this.f);
            finish();
        }
    }

    private void al() {
        LogUtil.d("HwSchemeBasicHealthActivity", "gotoWeightHistoryRecord");
        Intent intent = new Intent(this, (Class<?>) HealthDataHistoryActivity.class);
        if (this.l) {
            intent.putExtra("moveTaskToBack", true);
            intent.setFlags(268435456);
        }
        if (this.i) {
            startActivityForResult(intent, 1003);
        } else {
            iov.d(this.f, intent);
            finish();
        }
    }

    private long c(String str) {
        try {
            String queryParameter = this.v.getQueryParameter(str);
            LogUtil.a("HwSchemeBasicHealthActivity", "getSchemeStartTime  parameter=", queryParameter);
            return CommonUtils.i(queryParameter);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HwSchemeBasicHealthActivity", "getSchemeFrom IllegalArgumentException:", e2.getMessage());
            return 0L;
        }
    }

    private Bundle d(njd njdVar) {
        if (TextUtils.isEmpty(njdVar.b())) {
            ReleaseLogUtil.a("HwSchemeBasicHealthActivity", "showTrackMap contentpath is err!");
            return null;
        }
        if (njdVar.c() == null) {
            ReleaseLogUtil.a("HwSchemeBasicHealthActivity", "showTrackMap simplifyData is null!");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("simplifyDatakey", njdVar.c());
        bundle.putString("contentpath", njdVar.b());
        if (njdVar.c().requestSportType() == 512 && (Collections.EMPTY_LIST instanceof Serializable)) {
            bundle.putSerializable("subTrackDetail", (Serializable) Collections.EMPTY_LIST);
        }
        bundle.putBoolean("isAfterSport", false);
        bundle.putBoolean("isNotNeedDeleteFile", false);
        return bundle;
    }

    private void v() {
        String query = this.v.getQuery();
        if (TextUtils.isEmpty(query)) {
            AppRouter.c("/PluginHealthZone/FamilyHealthTempActivity").b(this.f);
        } else {
            AppRouter.e(Uri.parse("huaweischeme://healthapp/PluginHealthZone/FamilyHealthTempActivity?" + query)).b(this.f);
        }
        finish();
    }

    private void z() {
        Intent intent = new Intent();
        intent.setClass(this, OpenServiceActivity.class);
        startActivity(intent);
        finish();
    }

    private void ac() {
        if (fua.h()) {
            String queryParameter = this.v.getQueryParameter("chooserType");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "0";
            }
            String str = queryParameter.equals("0") ? "heart_rate" : "HRV";
            Intent intent = new Intent();
            intent.setClassName(this.f.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
            IntentParams intentParamsBuild = IntentParams.builder().addBiFrom("Today_0001", "healthTrends".equals(this.v.getQueryParameter("from")) ? "healthTrend_entry" : "", "").addPageId(ArkUIXConstants.HEART_RATE).addPageType("0").addRecord("{'chooserType':" + queryParameter + ", 'entrance':\"" + str + "\"}").build();
            LogUtil.a("HwSchemeBasicHealthActivity", "params.toString()", intentParamsBuild.toString());
            intent.putExtra(e.n, intentParamsBuild.toString());
            intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 2);
            iov.c(this.f, intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(this, HeartRateDetailActivity.class);
            startActivity(intent2);
        }
        finish();
    }

    private void a(int i) {
        if ("hearthealth".equals(this.v.getQueryParameter("from"))) {
            String strValue = AnalyticsValue.HEALTH_BACK_FROM_HEART_STUDY_2041083.value();
            HashMap map = new HashMap();
            map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, Integer.valueOf(i));
            lmf.d().c(this.f, strValue, map, 0);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        setIntent(null);
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        LogUtil.a("HwSchemeBasicHealthActivity", "gotoWatchFace");
        tqp.g(BaseApplication.getContext());
        new tfv(this, "HwSchemeBasicHealthActivity").e(-1, true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1003) {
            if (TextUtils.isEmpty(this.t)) {
                LogUtil.j("HwSchemeBasicHealthActivity", "mPayLoad is empty，disconnect fail");
                finish();
            } else {
                lsy.a(new Runnable() { // from class: dgk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.g();
                    }
                });
            }
        }
    }

    public /* synthetic */ void g() {
        String btMac;
        LogUtil.a("HwSchemeBasicHealthActivity", "disconnect bluetooth:", this.t);
        QrCodeOrNfcInfo qrCodeOrNfcInfoAnalysisQrCodeOrNfc = QrCodeOrNfcInfo.analysisQrCodeOrNfc(this.t);
        if (qrCodeOrNfcInfoAnalysisQrCodeOrNfc == null) {
            ReleaseLogUtil.e("HwSchemeBasicHealthActivity", "onActivityResult qrCodeOrNfcInfo is null");
            btMac = "";
        } else {
            btMac = qrCodeOrNfcInfoAnalysisQrCodeOrNfc.getBtMac();
        }
        if (TextUtils.isEmpty(btMac)) {
            LogUtil.j("HwSchemeBasicHealthActivity", "mac is empty， disconnect fail");
        } else {
            LogUtil.j("HwSchemeBasicHealthActivity", "disconnect result :" + era.a(btMac));
        }
        finish();
    }

    private String ap() {
        try {
            Field declaredField = Class.forName("android.app.Activity").getDeclaredField("mReferrer");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            return obj instanceof String ? (String) obj : String.valueOf(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            LogUtil.e("HwSchemeBasicHealthActivity", "Reflect GetReferrer Exception");
            return "UnKnowReferrer";
        }
    }

    private void n() {
        LogUtil.a("HwSchemeBasicHealthActivity", "doBiFromStartApp");
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", 3);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
