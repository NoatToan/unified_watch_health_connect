package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.arkuidevice.DeviceBridgeApi;
import com.huawei.health.R;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.watchface.WatchFaceApi;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class iqy {
    private static final IBaseResponseCallback e = new IBaseResponseCallback() { // from class: iqy.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
                H5ProClient.startH5MiniProgram(WatchFaceApiImpl.getStartMyWatchFaceContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
                mgu.a("e4");
            }
        }
    };

    public static void c(String str) {
        ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFace:", str);
        if (!mga.c()) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "currentDevice is null");
            a(BaseApplication.getContext(), true);
            return;
        }
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        String queryParameter2 = uri.getQueryParameter(BleConstants.KEY_PATH);
        ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFace from ", queryParameter);
        if (TitleBean.RIGHT_BTN_TYPE_SHARE.equals(queryParameter) && Objects.equals(queryParameter2, "watchfaceDetail")) {
            if (dxx.d().e() == null) {
                e(queryParameter, uri);
                return;
            } else {
                c(queryParameter, uri);
                return;
            }
        }
        boolean zIsSupportMyWatch = WatchFaceUtil.isSupportMyWatch();
        if (zIsSupportMyWatch && Objects.equals(queryParameter2, "myWatchface")) {
            b();
            return;
        }
        String queryParameter3 = uri.getQueryParameter("watchFaceType");
        if (zIsSupportMyWatch && "watchfaceDetail".equals(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
            e(queryParameter3);
            return;
        }
        String queryParameter4 = uri.getQueryParameter("watchFaceId");
        String queryParameter5 = uri.getQueryParameter("watchfaceVersion");
        if (zIsSupportMyWatch && Objects.equals(queryParameter2, "watchfaceDetail") && !TextUtils.isEmpty(queryParameter4) && !TextUtils.isEmpty(queryParameter5)) {
            c(queryParameter, uri);
            return;
        }
        if ("watchfaceDetail".equals(queryParameter2)) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFace jump to album qrcode");
            tqp.m();
        } else if (!zIsSupportMyWatch) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFace not support my watchface");
            c();
        } else {
            ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFace fail url is error");
        }
    }

    private static boolean b(String str) {
        LogUtil.a("WatchFaceDeeplinkUtils", "isDeviceTypeMatched enter:", str);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        DeviceInfo deviceInfoE = dxx.d().e();
        if (deviceInfoE == null) {
            LogUtil.a("WatchFaceDeeplinkUtils", "isDeviceTypeMatched currentDevice is null");
            return false;
        }
        String hiLinkDeviceId = deviceInfoE.getHiLinkDeviceId();
        String deviceSubModelId = deviceInfoE.getDeviceSubModelId();
        LogUtil.a("WatchFaceDeeplinkUtils", "isDeviceTypeMatched hiLinkDeviceId:", hiLinkDeviceId, deviceSubModelId);
        if (TextUtils.isEmpty(hiLinkDeviceId)) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceDeeplinkUtils", "isDeviceTypeMatched hiLinkDeviceId is empty");
            return false;
        }
        String upperCase = hiLinkDeviceId.toUpperCase(Locale.ENGLISH);
        for (String str2 : str.split(",")) {
            String upperCase2 = str2.toUpperCase(Locale.ENGLISH);
            if (!upperCase2.contains(Constants.LINK)) {
                if (upperCase.equals(upperCase2)) {
                    LogUtil.a("WatchFaceDeeplinkUtils", "isDeviceTypeMatched hiLinkDeviceId matched");
                    return true;
                }
            } else {
                String[] strArrSplit = upperCase2.split(Constants.LINK);
                if (strArrSplit.length != 2) {
                    ReleaseLogUtil.e("DEVMGR_WatchFaceDeeplinkUtils", "isDeviceTypeMatched bad id param:", upperCase2);
                } else if (Objects.equals(upperCase, strArrSplit[0]) && Objects.equals(deviceSubModelId, strArrSplit[1])) {
                    LogUtil.a("WatchFaceDeeplinkUtils", "isDeviceTypeMatched matched");
                    return true;
                }
            }
        }
        return false;
    }

    private static void d(String str, String str2) {
        ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFaceByIdAndVersion ", "WatchFaceId:", str, "WatchFaceVersion:", str2);
        WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
        if (watchFaceApi == null) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFaceH5 watchFaceApi is null");
        } else {
            watchFaceApi.openWatchFaceDetail(str, str2, e);
        }
    }

    private static void e(final String str) {
        ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startDiyMyWatchFace start to Diy ", str);
        if (ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "WatchFaceDeeplinkUtils") == null) {
            c();
            return;
        }
        try {
            int i = Integer.parseInt(str);
            WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
            if (watchFaceApi == null) {
                ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFaceH5 watchFaceApi is null");
            } else {
                watchFaceApi.openWatchFaceDetail(i, new IBaseResponseCallback() { // from class: iqy.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        if (i2 == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
                            H5ProClient.startH5MiniProgram(WatchFaceApiImpl.getStartMyWatchFaceContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
                            mgu.a("e4");
                        } else {
                            ReleaseLogUtil.e("DEVMGR_WatchFaceDeeplinkUtils", "startDiyMyWatchFace diy not support:", str);
                            iqy.c();
                        }
                    }
                });
            }
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceDeeplinkUtils", "startDiyMyWatchFace NumberFormatException type:", str);
            c();
        }
    }

    private static void a(Context context, Boolean bool) {
        if (context == null) {
            LogUtil.j("WatchFaceDeeplinkUtils", "jumpToDevice fail");
            return;
        }
        LogUtil.a("WatchFaceDeeplinkUtils", "jumpToDevice");
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), BaseApplication.getAppPackage() + ".MainActivity");
        intent.setFlags(67108864);
        if (bool.booleanValue()) {
            LogUtil.a("WatchFaceDeeplinkUtils", "jumpToDevice isNeedToShowToast");
            intent.putExtra("TOAST", qre.f(R.string.IDS_device_not_support_my_watch_face));
        }
        intent.putExtra(com.huawei.operation.utils.Constants.HOME_TAB_NAME, com.huawei.operation.utils.Constants.HOME_TAB_DEVICE);
        iov.d(context, intent);
    }

    private static void d(String str, String str2, Uri uri) {
        if (WatchFaceUtil.isSupportMyWatch(dxx.d().e())) {
            d(str, str2);
        } else if (WatchFaceUtil.isSupportWatchFaceMarket()) {
            b(str, uri.getQueryParameter("shareVersion"));
        } else {
            ReleaseLogUtil.e("DEVMGR_WatchFaceDeeplinkUtils", "is not SupportWatchFaceMarket, jump To Device");
            a(BaseApplication.getContext(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Uri uri) {
        String queryParameter = uri.getQueryParameter("deviceType");
        String queryParameter2 = uri.getQueryParameter("watchFaceId");
        String queryParameter3 = uri.getQueryParameter("watchfaceVersion");
        if (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3)) {
            return;
        }
        if (TitleBean.RIGHT_BTN_TYPE_SHARE.equals(str)) {
            d(queryParameter2, queryParameter3, uri);
        } else if (!b(queryParameter)) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFace deviceType not match");
            c();
        } else {
            d(queryParameter2, queryParameter3);
        }
    }

    private static void e(final String str, final Uri uri) {
        ReleaseLogUtil.e("DEVMGR_WatchFaceDeeplinkUtils", "handleDeviceInfo enter");
        DeviceBridgeApi deviceBridgeApi = (DeviceBridgeApi) Services.d("DeviceBridgeApiManager", DeviceBridgeApi.class);
        if (deviceBridgeApi == null) {
            LogUtil.j("WatchFaceDeeplinkUtils", "deviceBridgeApi is null");
        } else {
            a(BaseApplication.getContext(), false);
            deviceBridgeApi.b(new BaseResponseCallback<DeviceInfo>() { // from class: iqy.5
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i, DeviceInfo deviceInfo) {
                    if (i != 0) {
                        ReleaseLogUtil.e("DEVMGR_WatchFaceDeeplinkUtils", "onResponse errorCode is", Integer.valueOf(i));
                    } else if (deviceInfo != null) {
                        iqy.c(str, uri);
                    } else {
                        LogUtil.j("WatchFaceDeeplinkUtils", "get currentDevice is null");
                    }
                }
            });
        }
    }

    public static void b(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startWatchFaceMarketByIdAndVersion", "WatchFaceId:", str, "WatchFaceVersion:", str2);
        String str4 = mca.e(GRSManager.c(BaseApplication.getContext()).d()).get("watchFaceH5");
        if (CommonUtil.ap()) {
            str3 = String.format("%ssandbox/cch5/health/watchFace/index.html#/dial-detail?version=%s&hitopId=%s", str4, str2, str);
        } else {
            str3 = String.format("%scch5/health/watchFace/index.html#/dial-detail?version=%s&hitopId=%s", str4, str2, str);
        }
        ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startWatchFaceMarketByIdAndVersion url is", str3);
        mca.a(BaseApplication.getContext());
        mca.c(BaseApplication.getContext(), str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        qpx.e(BaseApplication.getContext(), R.string.IDS_device_not_support_my_watch_face_deeplink);
    }

    public static void b() {
        ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFaceHome enter");
        WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
        if (watchFaceApi == null) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceDeeplinkUtils", "startMyWatchFaceH5 watchFaceApi is null");
        } else {
            watchFaceApi.openMyWatchFace(e);
        }
    }
}
