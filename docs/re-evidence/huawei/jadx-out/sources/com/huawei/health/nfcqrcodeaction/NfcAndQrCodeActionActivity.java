package com.huawei.health.nfcqrcodeaction;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.MainActivity;
import com.huawei.health.NfcEcgDeviceActivity;
import com.huawei.health.R;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hms.network.embedded.u3;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.activity.IndoorEquipConnectedActivity;
import com.huawei.indoorequip.activity.IndoorEquipDisplayActivity;
import com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.operation.PluginOperation;
import defpackage.dmd;
import defpackage.dmp;
import defpackage.dti;
import defpackage.dxm;
import defpackage.eif;
import defpackage.elg;
import defpackage.elh;
import defpackage.etn;
import defpackage.fhz;
import defpackage.ive;
import defpackage.iwy;
import defpackage.jbg;
import defpackage.nwa;
import defpackage.nzc;
import defpackage.qpx;
import defpackage.sty;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

/* JADX INFO: loaded from: classes29.dex */
public class NfcAndQrCodeActionActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private elh f8520b;
    private String d;
    private Uri e = null;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.d("Track_IDEQ_NfcAndQrCodeActionActivity", "onCreate()");
        super.onCreate(bundle);
        this.f8519a = this;
        d(this, getIntent());
    }

    private void d(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "startGymRunning intent == null");
            return;
        }
        this.e = intent.getData();
        if (!AuthorizationUtils.c(context)) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "not agree");
            c();
            return;
        }
        if (!e(MainActivity.class)) {
            if (LoginInit.getInstance(this.f8519a).isBrowseMode()) {
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "not exist Activity and is BrowseMode");
                c();
                return;
            } else {
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "not exist Activity and is not BrowseMode");
                e(context, intent);
                return;
            }
        }
        if (e(MainActivity.class)) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "exist Activity");
            b();
            e(context, intent);
            return;
        }
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "startGymRunning other condition");
    }

    private void b() {
        if (BaseApplication.h()) {
            return;
        }
        c();
    }

    private void e(final Context context, final Intent intent) {
        LoginInit.getInstance(this.f8519a).browsingToLogin(new IBaseResponseCallback() { // from class: gfh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f35018c.b(context, intent, i, obj);
            }
        }, "");
    }

    public /* synthetic */ void b(Context context, Intent intent, int i, Object obj) {
        if (i != 0) {
            LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "it is not login: ", Integer.valueOf(i));
            return;
        }
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) == null) {
            a();
        }
        c(context);
        int iG = ive.c().g();
        boolean zO = ive.c().o();
        String strE = SharedPreferenceManager.e(this.f8519a, Integer.toString(20002), "iscrash");
        if (zO || iG == 1 || iG == 2) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "track module is running");
            if (iwy.a(jbg.a()).p() != 1) {
                Intent intent2 = new Intent(context, (Class<?>) TrackMainMapActivity.class);
                intent2.setFlags(67108864);
                intent2.putExtra("isSelected", false);
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "track module is not auto track, resume");
                d(intent2);
                return;
            }
            return;
        }
        if ("true".equals(strE)) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "crash flag of track module is true");
            return;
        }
        if (iwy.a(jbg.a()).p() == 1) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "track module has auto track, break it");
            iwy.a(jbg.a()).bu();
        }
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "track module is not running");
        if (fhz.d() != null) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "getInstance of Mediator success");
        }
        b(intent);
    }

    private void a() {
        Services.c("PluginFitnessAdvice", PluginSuggestion.class, BaseApplication.b(), new Consumer<PluginSuggestion>() { // from class: com.huawei.health.nfcqrcodeaction.NfcAndQrCodeActionActivity.1
            @Override // com.huawei.framework.servicemgr.Consumer
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void accept(PluginSuggestion pluginSuggestion) {
                if (pluginSuggestion != null) {
                    pluginSuggestion.init(NfcAndQrCodeActionActivity.this.f8519a);
                } else {
                    LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "obj is null.");
                }
            }
        }, true);
    }

    private void c(Context context) {
        ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(context));
        ive.c().init(context);
        PluginOperation.getInstance(context).setAdapter(PluginOperationAdapterImpl.getInstance(context));
        PluginOperation.getInstance(context).init(context);
        if (dmd.b().getAdapter() == null) {
            dmd.b().setAdapter(eif.a());
            dmd.b().init(this.f8519a);
        }
    }

    private void c() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra("schemeNfc", this.e);
            launchIntentForPackage.putExtra("needLogin", true);
            d(launchIntentForPackage);
            finish();
            return;
        }
        LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "launchIntentForPackage is null");
    }

    private boolean e(Class<?> cls) {
        ComponentName componentNameResolveActivity = new Intent(this, cls).resolveActivity(getPackageManager());
        if (componentNameResolveActivity == null) {
            LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "componentName is null");
            return false;
        }
        Object systemService = getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) Objects.requireNonNull((ActivityManager) systemService)).getRunningTasks(10)) {
                if (runningTaskInfo != null && Objects.equals(runningTaskInfo.baseActivity, componentNameResolveActivity)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b(Intent intent) {
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "handleCommand(Intent intent)");
        if (intent == null) {
            LogUtil.e("Track_IDEQ_NfcAndQrCodeActionActivity", "handleCommand(Intent intent) intent == null");
            return;
        }
        if (!CommonUtil.bi()) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "not support this phone, return");
            return;
        }
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            if (((SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class)).isSportServiceRunning()) {
                LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "SportService is Running!");
                finish();
                return;
            }
            String strE = e(intent);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "onCreate and get a valid payload, now will start Main Activity, payload = ", strE);
            String strC = nzc.c(strE);
            if (!d(strC)) {
                LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "handleCommand course equipment is no match");
                return;
            } else {
                b(strC, strE);
                return;
            }
        }
        if (CommonConstant.ACTION.HWID_SCHEME_URL.equals(intent.getAction())) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "onCreate and start by url");
            Uri data = intent.getData();
            if (data == null) {
                LogUtil.e("Track_IDEQ_NfcAndQrCodeActionActivity", "uri is null");
                return;
            }
            String path = data.getPath();
            if (TextUtils.isEmpty(path) || !"/conn".equals(path)) {
                return;
            }
            e(data);
        }
    }

    private void b(String str, String str2) {
        if (Utils.o()) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "is oversea not support this device");
            qpx.a(this, R.string.ie_device_unsupported);
            return;
        }
        if (!TextUtils.isEmpty(str) && sty.c(str)) {
            if (!str2.contains(RecordAction.ACT_COST_TIME_TAG)) {
                str2 = str2.replace(";", "") + "&t=" + str + "&";
            }
            j(str2);
            return;
        }
        if (!TextUtils.isEmpty(str) && "70".equals(str)) {
            g(str2);
            return;
        }
        if (!TextUtils.isEmpty(str) && sty.d(str)) {
            a(str2);
            return;
        }
        if (!TextUtils.isEmpty(str) && sty.b(str)) {
            a(str2);
            return;
        }
        if (nzc.c(str2).equals("262")) {
            h(str2);
        } else if ("54".equals(str)) {
            a(str2);
        } else {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "other nfc data");
        }
    }

    private void h(String str) {
        Intent intent = new Intent();
        intent.putExtra("PAYLOAD_FROM_NFC", str);
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (nwa.n().r()) {
            intent.setClass(this, IndoorEquipDisplayActivity.class);
            intent.putExtra("show tips key", true);
        } else if (nwa.n().y()) {
            intent.setClass(this, IndoorEquipLandDisplayActivity.class);
            intent.putExtra("show tips key", true);
        } else {
            if (sportDataOutputApi != null && sportDataOutputApi.getSportType() == 283 && sportDataOutputApi.isSportServiceRunning()) {
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "SportService is Running!");
                finish();
                return;
            }
            intent.setClass(this, DeviceMainActivity.class);
        }
        d(intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "onResume then finish self");
        super.onResume();
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "onNewIntent");
        super.onNewIntent(intent);
        d(this.f8519a, getIntent());
    }

    @Override // android.app.Activity
    public void finish() {
        setIntent(null);
        super.finish();
    }

    private String e(Intent intent) {
        Parcelable[] parcelableArrayExtra;
        String str;
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "swap NFC card by user and now will get payload.");
        if (intent == null) {
            return null;
        }
        try {
            parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        } catch (BadParcelableException e) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "BadParcelableException e = ", e.getMessage());
            parcelableArrayExtra = null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            LogUtil.e("Track_IDEQ_NfcAndQrCodeActionActivity", "getPayloadByNfc Exception", LogAnonymous.b(e2));
            parcelableArrayExtra = null;
        }
        if (parcelableArrayExtra == null || parcelableArrayExtra.length <= 0) {
            return null;
        }
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "Parcelable is not null, will get payload.");
        Parcelable parcelable = parcelableArrayExtra[0];
        if (!(parcelable instanceof NdefMessage)) {
            LogUtil.e("Track_IDEQ_NfcAndQrCodeActionActivity", "rawMessage[0] not instace of NdefMessage");
            return "";
        }
        NdefMessage ndefMessage = (NdefMessage) parcelable;
        try {
            str = ndefMessage.getRecords().length > 0 ? new String(ndefMessage.getRecords()[0].getPayload(), "UTF-8") : null;
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("Track_IDEQ_NfcAndQrCodeActionActivity", "getPayloadByNfc,UnsupportedEncodingException");
        }
        if (TextUtils.isEmpty(str) || str.length() > 100) {
            return null;
        }
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "get a payload of NFC card");
        return str;
    }

    private void a(String str) {
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "startDeviceMainActByNfc()");
        String strE = etn.e("brd", str);
        String strE2 = etn.e("ble", str);
        String strE3 = etn.e(u3.m, str);
        String strC = nzc.c(str);
        if ("68".equals(strC)) {
            if (!TextUtils.isEmpty(strE) && !TextUtils.isEmpty(strE2)) {
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "bloodPressure payload of NFC is valid and now will start DeviceMainActivity");
                i(str);
                return;
            } else {
                LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "bloodPressure payload of NFC is invalid");
                return;
            }
        }
        if ("69".equals(strC)) {
            d(strE2, strE3, str);
            return;
        }
        if (b(strC)) {
            if (!TextUtils.isEmpty(strE3)) {
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC is valid and now will start DeviceMainActivity");
                i(str);
                return;
            } else {
                LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC is invalid");
                return;
            }
        }
        d(str, strE2, strE3, strC);
    }

    private void g(String str) {
        Intent intent = new Intent();
        intent.putExtra("PAYLOAD_FROM_NFC", str);
        intent.setClass(this, NfcEcgDeviceActivity.class);
        d(intent);
    }

    private void d(String str, String str2, String str3, String str4) {
        if ("54".equals(str4)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "scale payload of NFC is valid and now will start PayloadActivity");
                b(str, str2, str3);
                return;
            } else {
                LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "hagrid scale payload of NFC is invalid");
                return;
            }
        }
        if ("261".equals(str4) && "28L1".equals(str3)) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "rower payload of NFC is valid and now will start DeviceMainActivity");
            i(str);
        } else if (e(str4)) {
            i(str);
        } else {
            LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of type is invalid when type is small pillow");
        }
    }

    private boolean e(String str) {
        return BleConstants.SPORT_TYPE_BIKE.equals(str) || "261".equals(str) || "260".equals(str) || "31".equals(str);
    }

    private void d(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ProductMapParseUtil.a(this.f8519a);
            if (e(str, ProductMap.d(str2))) {
                if (!PermissionDialogHelper.c(this)) {
                    ReleaseLogUtil.d("Track_IDEQ_NfcAndQrCodeActionActivity", "handleGlucosemeterIndex go to H5 not scan permission");
                    qpx.e(this, com.huawei.plugindevice.R.string.IDS_nearby_permission_exception);
                    finish();
                    return;
                }
                a(str, str3);
                return;
            }
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "glucosemeter payload of NFC is valid and now will start DeviceMainActivity");
            i(str3);
            return;
        }
        LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "glucosemeter payload of NFC is invalid");
    }

    private void b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            ProductMapParseUtil.a(this.f8519a);
            ProductMapInfo productMapInfoD = ProductMap.d(str3);
            if (productMapInfoD == null) {
                return;
            }
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "body fat scale device of NFC is valid");
            if (dxm.ad(productMapInfoD.f())) {
                LogUtil.d("Track_IDEQ_NfcAndQrCodeActionActivity", "enter huawei or honor body fat scale device fragment");
                e(str, productMapInfoD.f(), str2, str3);
                return;
            } else if (e(str2, productMapInfoD)) {
                a(str2, str);
                return;
            } else {
                LogUtil.d("Track_IDEQ_NfcAndQrCodeActionActivity", "enter other body fat scale device fragment");
                i(str);
                return;
            }
        }
        LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "body fat scale payload of NFC is invalid");
    }

    private void e(String str, String str2, String str3, String str4) {
        boolean zG = dmp.d().g(str3);
        boolean zC = dti.d(this, str4, str3).c();
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "startPayloadActivity hagrid scale isBondedDevice,", Boolean.valueOf(zG), ",isDeviceConnect,", Boolean.valueOf(zC));
        if (zG && zC) {
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PAYLOAD_FROM_NFC", str);
        intent.putExtra("productId", str2);
        intent.putExtra("uniqueId", str3);
        intent.putExtra("isBondedDevice", zG);
        intent.putExtra("isNfcConnect", true);
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "put isNfcConnect is true");
        intent.setClass(this, DeviceMainActivity.class);
        startActivity(intent);
        finish();
    }

    private boolean e(String str, ProductMapInfo productMapInfo) {
        if (productMapInfo == null) {
            return false;
        }
        this.d = productMapInfo.f();
        elh elhVarD = ResourceManager.c().d(this.d);
        this.f8520b = elhVarD;
        if (elhVarD == null) {
            return false;
        }
        boolean zG = dmp.d().g(str);
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "isBondedDevice:", Boolean.valueOf(zG));
        return BleConstants.BLE_THIRD_DEVICE_H5.equals(this.f8520b.n().b()) && zG;
    }

    private void a(String str, String str2) {
        if ("1".equals(this.f8520b.g())) {
            etn.c(this, this.f8520b, this.d, str);
            return;
        }
        Intent intentB = etn.b(this.f8520b, this.d, str);
        if (intentB != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(elg.e().e(this.d));
            sb.append("?enterType=");
            sb.append(TextUtils.isEmpty(str2) ? "QRCODE" : "NFC");
            intentB.putExtra("url", sb.toString());
            if (!TextUtils.isEmpty(WebViewActivity.getProductId())) {
                LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "WebViewActivity productId is not empty");
                intentB.setFlags(335544320);
            }
            startActivity(intentB);
        }
    }

    private void i(String str) {
        Intent intent = new Intent();
        intent.putExtra("PAYLOAD_FROM_NFC", str);
        intent.putExtra("ENTER_TYPE", "NFC");
        intent.setClass(this, DeviceMainActivity.class);
        d(intent);
    }

    private void j(String str) {
        if (JumpConnectHelper.c().b()) {
            qpx.b(BaseApplication.b(), BaseApplication.b().getResources().getString(R.string.IDS_fitness_equip_connected_unsupported));
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "LongCoachActivityRunning");
            return;
        }
        if (c(str)) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC is valid and now will start IndoorEquipRunningActivity");
            Intent intent = new Intent();
            intent.putExtra("PAYLOAD_FROM_NFC", str);
            if (nwa.n().r()) {
                intent.setClass(this, IndoorEquipDisplayActivity.class);
                intent.putExtra("show tips key", true);
                d(intent);
            } else if (nwa.n().y()) {
                intent.setClass(this, IndoorEquipLandDisplayActivity.class);
                intent.putExtra("show tips key", true);
                d(intent);
            } else {
                int iA = JumpConnectHelper.c().a();
                int iE = JumpConnectHelper.c().e();
                if (iA != 0 && iE != 0) {
                    LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "startIndoorEquipRunningActByNfc start courseEquipment");
                    intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", 1);
                    intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", iA);
                    intent.setClass(this, IndoorEquipConnectedActivity.class);
                    d(intent);
                } else {
                    a(str);
                }
            }
            if (str.contains("&tvn=")) {
                String strE = nzc.e(str);
                if (TextUtils.isEmpty(strE)) {
                    return;
                }
                Intent intent2 = new Intent("com.huawei.health.BROADCAST_INTENT_CONNECT_TV");
                intent2.putExtra("KEY_OF_TV_DEVICE_NAME", strE);
                LocalBroadcastManager.getInstance().sendBroadcast(intent2);
                return;
            }
            return;
        }
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC is invalid");
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC is empty");
            return false;
        }
        QrCodeOrNfcInfo qrCodeOrNfcInfoAnalysisQrCodeOrNfc = QrCodeOrNfcInfo.analysisQrCodeOrNfc(str);
        if (qrCodeOrNfcInfoAnalysisQrCodeOrNfc == null) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC parse qrCodeOrNfcInfo is null");
            return false;
        }
        String btMac = qrCodeOrNfcInfoAnalysisQrCodeOrNfc.getBtMac();
        String btName = qrCodeOrNfcInfoAnalysisQrCodeOrNfc.getBtName();
        String strC = nzc.c(str);
        if (!str.contains("proto=") && !str.contains("ftmp=")) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC Protocol is null");
            return false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(strC);
        boolean z = (TextUtils.isEmpty(btMac) && TextUtils.isEmpty(btName)) ? false : true;
        if (!zIsEmpty && z) {
            return true;
        }
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "payload of NFC is invalid");
        return false;
    }

    private void e(Uri uri) {
        String queryParameter = uri.getQueryParameter("proto");
        String queryParameter2 = uri.getQueryParameter("ble");
        String strSubstring = (queryParameter2 == null || queryParameter2.length() <= 7) ? queryParameter2 : queryParameter2.substring(6);
        String queryParameter3 = uri.getQueryParameter("blen");
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "proto of url = ", queryParameter, ",ble = ", strSubstring, ", blen", queryParameter3);
        LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "now will start indoor equip activity");
        Intent intent = new Intent();
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "";
        }
        intent.putExtra("PROTOCOL_FROM_QRCODE", queryParameter);
        if (TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = "";
        }
        intent.putExtra("BLE_FROM_QRCODE", queryParameter2);
        if (TextUtils.isEmpty(queryParameter3)) {
            queryParameter3 = "";
        }
        intent.putExtra("BLENAME_FROM_QRCODE", queryParameter3);
        String queryParameter4 = uri.getQueryParameter("tvn");
        intent.putExtra("TVNAME_FROM_QRCODE", TextUtils.isEmpty(queryParameter4) ? "" : queryParameter4);
        if (nwa.n().r()) {
            intent.setClass(this, IndoorEquipDisplayActivity.class);
            intent.putExtra("show tips key", true);
        } else if (nwa.n().y()) {
            intent.setClass(this, IndoorEquipLandDisplayActivity.class);
            intent.putExtra("show tips key", true);
        } else {
            intent.setClass(this, IndoorEquipConnectedActivity.class);
        }
        d(intent);
        if (TextUtils.isEmpty(queryParameter4)) {
            return;
        }
        Intent intent2 = new Intent("com.huawei.health.BROADCAST_INTENT_CONNECT_TV");
        intent2.putExtra("KEY_OF_TV_DEVICE_NAME", queryParameter4);
        LocalBroadcastManager.getInstance().sendBroadcast(intent2);
    }

    private void d(Intent intent) {
        try {
            startActivity(intent);
        } catch (BadParcelableException unused) {
            LogUtil.a("Track_IDEQ_NfcAndQrCodeActionActivity", "onStartActivity BadParcelableException");
        }
    }

    private boolean d(String str) {
        int iA = JumpConnectHelper.c().a();
        if (!TextUtils.isEmpty(str) && iA != 0) {
            if (!sty.c(str)) {
                LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "equipmentTypeValid course equipment nfc equipment is no ecological equipment");
                JumpConnectHelper.c().d().showEquipmentMatchTip(iA);
                finish();
                return false;
            }
            if ((iA == 1 && !str.equals("31")) || (iA == 2 && !str.equals(BleConstants.SPORT_TYPE_BIKE))) {
                LogUtil.j("Track_IDEQ_NfcAndQrCodeActionActivity", "equipmentTypeValid course equipment nfc equipment type no match");
                JumpConnectHelper.c().d().showEquipmentMatchTip(iA);
                finish();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 2, list:
      (r0v0 int) from 0x0010: IF  (r0v0 int) != (49778 int)  -> B:4:0x0012 A[HIDDEN]
      (r0v0 int) from 0x0015: IF  (r0v0 int) != (49780 int)  -> B:6:0x0017 A[HIDDEN]
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
    private boolean b(String str) {
        byte b2;
        str.hashCode();
        if (iHashCode != 49778) {
            if (iHashCode != 49780) {
                switch (str) {
                    case "270":
                        b2 = 2;
                        break;
                    case "271":
                        b2 = 3;
                        break;
                    case "272":
                        b2 = 4;
                        break;
                    case "273":
                        b2 = 5;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
            } else if (str.equals(BleConstants.TYPE_FASCIA_GUN_INDEX)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("266")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
