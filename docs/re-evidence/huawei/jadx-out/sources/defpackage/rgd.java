package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwpaymgr.HwPayManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import com.huawei.wear.oversea.overseamanger.SatcomExistInfoCallback;
import com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack;
import com.huawei.wear.oversea.satcomcard.SatcomCardSupportInfo;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class rgd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f47286b = new HashMap(16);

    public static xmt a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_WalletSdkWrapper", "getOverSeaBaseInfo enter");
        xmt xmtVar = new xmt();
        xmtVar.l(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        xmtVar.b(BaseApplication.getContext().getPackageName());
        xmtVar.h(LoginInit.getInstance(BaseApplication.getContext()).getDeviceId());
        xmtVar.g(LoginInit.getInstance(BaseApplication.getContext()).getDeviceType());
        xmtVar.d(ThirdLoginDataStorageUtil.getTokenTypeValue());
        xmtVar.c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1007));
        xmtVar.k(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        xmtVar.b(true);
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_WalletSdkWrapper", "getOverSeaBaseInfo deviceInfo is null");
            return xmtVar;
        }
        xmtVar.f(deviceInfo.getSoftVersion());
        xmtVar.m(String.valueOf(CommonUtil.e(BaseApplication.getContext())));
        xmtVar.d(deviceInfo.getCertModel());
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009);
        xmtVar.b(CommonUtil.n(BaseApplication.getContext(), accountInfo));
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014);
        xmtVar.e(accountInfo2);
        xmtVar.n(deviceInfo.getCertModel() + " " + deviceInfo.getSoftVersion());
        if (TextUtils.isEmpty(deviceInfo.getUuid())) {
            xmtVar.i(deviceInfo.getDeviceIdentify());
        } else {
            xmtVar.i(deviceInfo.getUuid());
        }
        ReleaseLogUtil.d("R_WalletSdkWrapper", "ServiceCountryCode:", accountInfo2, ", stSite:", accountInfo);
        String strValueOf = String.valueOf(deviceInfo.getDeviceOtaAreaType());
        xmtVar.j(strValueOf);
        xmtVar.e(eey.d(deviceInfo, 50));
        xmtVar.o(deviceInfo.getDeviceUdid());
        ReleaseLogUtil.d("R_WalletSdkWrapper", "getOverSeaBaseInfo otaAreaType:", strValueOf);
        return xmtVar;
    }

    private static String c(String str) {
        ReleaseLogUtil.d("R_WalletSdkWrapper", "getCplc enter");
        final String[] strArr = {""};
        if (f47286b.containsKey(str) && !TextUtils.isEmpty(f47286b.get(str))) {
            String str2 = f47286b.get(str);
            strArr[0] = str2;
            return str2;
        }
        f47286b.clear();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HwPayManager.e().b(new IBaseResponseCallback() { // from class: rgd.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_WalletSdkWrapper", "getCplc onResponse errorCode: ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    strArr[0] = (String) obj;
                } else {
                    strArr[0] = "";
                }
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(200L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.e("R_WalletSdkWrapper", "getCplc timeout");
            }
        } catch (InterruptedException e) {
            LogUtil.e("WalletSdkWrapper", "getCplc exception:", ExceptionUtils.c(e));
        }
        f47286b.put(str, strArr[0]);
        return strArr[0];
    }

    public static void c(String str, Activity activity, boolean z, boolean z2) {
        ReleaseLogUtil.d("R_WalletSdkWrapper", "startWalletOobeActivity enter");
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), "com.huawei.wear.wallet.ui.SatcomGuideActivity");
            intent.putExtra("isFromWear", z);
            intent.putExtra("device_id", str);
            intent.putExtra("wear_home_class_name", "com.huawei.ui.homewear21.home.WearHomeActivity");
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("WalletSdkWrapper", "ActivityNotFoundException e:", e.getMessage());
        }
        if (z2) {
            activity.finish();
        }
    }

    public static void c(DeviceInfo deviceInfo, SatcomQueryCallBack satcomQueryCallBack) {
        OverSeaMangerUtil.a(BaseApplication.getContext()).a(BaseApplication.getContext(), a(deviceInfo), satcomQueryCallBack);
    }

    public static rgg d(final DeviceInfo deviceInfo, final boolean z) {
        ReleaseLogUtil.d("R_WalletSdkWrapper", "querySupportSatcom enter");
        final rgg rggVar = new rgg();
        if (deviceInfo == null) {
            ReleaseLogUtil.e("WalletSdkWrapper", "querySatcomStatus deviceInfo is null");
            return rggVar;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (!e(deviceIdentify, eej.a(deviceIdentify))) {
            ReleaseLogUtil.e("WalletSdkWrapper", "querySatcomStatus not support wallet");
            return rggVar;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        OverSeaMangerUtil.a(BaseApplication.getContext()).a(BaseApplication.getContext(), a(deviceInfo), new SatcomQueryCallBack() { // from class: rgd.1
            @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
            public int onSuccess(SatcomCardSupportInfo satcomCardSupportInfo) {
                int iE = satcomCardSupportInfo.e();
                boolean zB = satcomCardSupportInfo.b();
                int iD = satcomCardSupportInfo.d();
                ReleaseLogUtil.d("R_WalletSdkWrapper", "querySupportSatcom onSuccess returnCode:", Integer.valueOf(iE), ", isSupportSatcomCard:", Boolean.valueOf(zB), ", activityPeriod:", Integer.valueOf(iD), ", isQueryOpenedSatcomCard:", Boolean.valueOf(z));
                rggVar.e(zB);
                rggVar.a(iD);
                if (z && zB) {
                    rggVar.c(true);
                    rgd.a(countDownLatch, deviceInfo, rggVar);
                    return iE;
                }
                countDownLatch.countDown();
                return iE;
            }

            @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
            public int onFail(SatcomCardSupportInfo satcomCardSupportInfo) {
                int iE = satcomCardSupportInfo.e();
                ReleaseLogUtil.e("R_WalletSdkWrapper", "querySupportSatcom fail returnCode is:", Integer.valueOf(iE));
                countDownLatch.countDown();
                return iE;
            }
        });
        try {
            if (!countDownLatch.await(200L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.e("R_WalletSdkWrapper", "querySupportSatcom timeout");
            }
        } catch (InterruptedException e) {
            LogUtil.e("WalletSdkWrapper", "querySupportSatcom exception:", ExceptionUtils.c(e));
        }
        ReleaseLogUtil.d("R_WalletSdkWrapper", "querySupportSatcom:", rggVar);
        return rggVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final CountDownLatch countDownLatch, DeviceInfo deviceInfo, final rgg rggVar) {
        xmt xmtVarA = a(deviceInfo);
        String strC = c(deviceInfo.getDeviceIdentify());
        xmtVarA.a(strC);
        ReleaseLogUtil.d("R_WalletSdkWrapper", "queryOpenedSatcomCardStatus cplc:", strC);
        OverSeaMangerUtil.a(BaseApplication.getContext()).b(BaseApplication.getContext(), xmtVarA, new SatcomExistInfoCallback() { // from class: rgd.5
            @Override // com.huawei.wear.oversea.overseamanger.SatcomExistInfoCallback
            public void onResult(int i, int i2) {
                ReleaseLogUtil.d("R_WalletSdkWrapper", "queryOpenedSatcomCardStatus onResult resultCode:", Integer.valueOf(i), ", existSatomCard:", Integer.valueOf(i2));
                boolean z = i != 0 || i2 == 0;
                boolean zE = rggVar.e();
                int iA = rggVar.a();
                rggVar.c(z);
                if (zE && !z && iA != 0) {
                    xml.e(rgc.b());
                    ReleaseLogUtil.d("R_WalletSdkWrapper", "queryOpenedSatcomCardStatus set HealthAdapter");
                }
                countDownLatch.countDown();
            }
        });
    }

    public static void e(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("WalletSdkWrapper", "preLoadSatcomStatus deviceInfo is null");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (!e(deviceIdentify, eej.a(deviceIdentify))) {
            ReleaseLogUtil.e("R_WalletSdkWrapper", "preLoadSatcomStatus not support wallet");
        } else {
            OverSeaMangerUtil.a(BaseApplication.getContext()).a(BaseApplication.getContext(), a(deviceInfo), new SatcomQueryCallBack() { // from class: rgd.3
                @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
                public int onSuccess(SatcomCardSupportInfo satcomCardSupportInfo) {
                    int iE = satcomCardSupportInfo.e();
                    ReleaseLogUtil.d("R_WalletSdkWrapper", "preLoadSatcomStatus querySupportSatcomCardUtil onSuccess, isSupportSatcomCard:", Boolean.valueOf(satcomCardSupportInfo.b()));
                    if (satcomCardSupportInfo.b()) {
                        rgd.b(deviceInfo);
                    }
                    return iE;
                }

                @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
                public int onFail(SatcomCardSupportInfo satcomCardSupportInfo) {
                    int iE = satcomCardSupportInfo.e();
                    ReleaseLogUtil.e("R_WalletSdkWrapper", "preLoadSatcomStatus querySupportSatcomCardUtil fail returnCode is:", Integer.valueOf(iE));
                    return iE;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(DeviceInfo deviceInfo) {
        xmt xmtVarA = a(deviceInfo);
        xmtVarA.a(c(deviceInfo.getDeviceIdentify()));
        OverSeaMangerUtil.a(BaseApplication.getContext()).b(BaseApplication.getContext(), xmtVarA, new SatcomExistInfoCallback() { // from class: rgd.4
            @Override // com.huawei.wear.oversea.overseamanger.SatcomExistInfoCallback
            public void onResult(int i, int i2) {
                ReleaseLogUtil.d("R_WalletSdkWrapper", "preLoadOpenedCardStatus querySatcomExistInfo onResult, resultCode:", Integer.valueOf(i), ", existSatomCard:", Integer.valueOf(i2));
            }
        });
    }

    public static boolean e(String str, DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            ReleaseLogUtil.e("R_WalletSdkWrapper", "isShowPayEntrance deviceCapability is null");
            return false;
        }
        ReleaseLogUtil.d("R_WalletSdkWrapper", "isShowPayEntrance isSupportWalletOpenCard", Boolean.valueOf(deviceCapability.isSupportWalletOpenCard()), " isSupportPay", Boolean.valueOf(deviceCapability.isSupportPay()));
        if (!deviceCapability.isSupportWalletOpenCard() && !deviceCapability.isSupportPay()) {
            return false;
        }
        boolean zA = Utils.a(BaseApplication.getContext());
        LogUtil.a("WalletSdkWrapper", "isKoreaCountry is:", Boolean.valueOf(zA));
        if (zA) {
            return false;
        }
        if (a(str)) {
            return true;
        }
        if (deviceCapability.isHideWalletEntrance()) {
            ReleaseLogUtil.e("R_WalletSdkWrapper", "getShowWalletEntrance not support");
            return false;
        }
        if (a()) {
            if (c()) {
                ReleaseLogUtil.d("R_WalletSdkWrapper", "serviceCountryCode is cn and OpenCardNewWay is true");
                return true;
            }
            if (LanguageUtil.l(BaseApplication.getContext()) || LanguageUtil.q(BaseApplication.getContext())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        DeviceInfo deviceInfoB;
        if (TextUtils.isEmpty(str)) {
            deviceInfoB = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "WalletSdkWrapper");
        } else {
            deviceInfoB = mgg.b(str, "WalletSdkWrapper");
        }
        boolean zD = eey.d(deviceInfoB, 50);
        ReleaseLogUtil.d("R_WalletSdkWrapper", "is support index 50:", Boolean.valueOf(zD));
        return zD;
    }

    private static boolean a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014);
        if (c() && "CN".equals(accountInfo)) {
            return true;
        }
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        if ("CN".equals(accountInfo) && "CN".equals(accountInfo2)) {
            return true;
        }
        ReleaseLogUtil.e("R_WalletSdkWrapper", "country not support");
        return false;
    }

    private static boolean c() {
        LogUtil.a("WalletSdkWrapper", "isOpenCardNewWay");
        if (lkw.t() != null) {
            return lkw.t().isWalletOpenCard();
        }
        return false;
    }
}
