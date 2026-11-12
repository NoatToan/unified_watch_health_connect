package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.watchface.api.HwWatchFaceAdapter;
import com.huawei.watchface.mvp.model.datatype.TransFileInfo;
import com.huawei.watchface.mvp.model.datatype.TransferBusiType;
import com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IFileTransferStateCallback;
import com.huawei.watchface.utils.callback.ILoginCallback;
import com.huawei.watchface.utils.callback.IPhotoFileCallback;
import com.huawei.watchface.utils.callback.WatchFaceHealthResponseListener;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mce extends ecw implements HwWatchFaceAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mce f41401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f41402c = new byte[0];
    private lvb d;

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void commonTransferFile(String str, String str2, int i, IFileTransferStateCallback iFileTransferStateCallback) {
    }

    private mce() {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "WatchFaceAdapterImpl init");
        this.d = lvb.e();
    }

    public static mce c() {
        mce mceVar;
        synchronized (f41402c) {
            if (f41401b == null) {
                f41401b = new mce();
            }
            mceVar = f41401b;
        }
        return mceVar;
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public Map<String, Object> getHealthSettingInfo() {
        HashMap map = new HashMap(16);
        map.put("developer", SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch"));
        map.put("appWatchFace", SharedPreferenceManager.e(BaseApplication.getContext(), "APP_WATCHFACE", "app_watchface_change_url"));
        return map;
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void shareLink(String str) {
        LogUtil.a("WatchFaceAdapterImpl", "shareLink enter.");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("shareUrlContent");
            String string2 = jSONObject.getString("shareTitleContent");
            String string3 = jSONObject.getString("shareTextContent");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                String string4 = jSONObject.getString("imageUrl");
                Bitmap bitmapA = !TextUtils.isEmpty(string4) ? ltg.a(string4) : null;
                gxt gxtVar = new gxt(2);
                gxtVar.b(string3);
                gxtVar.d(bitmapA);
                gxtVar.f(string);
                gxtVar.e(string2);
                String string5 = jSONObject.getString("shareModule");
                if (TextUtils.isEmpty(string5)) {
                    string5 = AnalyticsValue.SHARE_1140001.value();
                }
                gxtVar.d(string5);
                gxtVar.e(false);
                ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, BaseApplication.getActivity());
                return;
            }
            ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "shareLink, param is invalid");
        } catch (JSONException e) {
            ReleaseLogUtil.a("DEVMGR_WatchFaceAdapterImpl", "shareLink, JSONException:", ExceptionUtils.c(e));
        }
    }

    @Override // defpackage.ecw, com.huawei.watchface.api.HwWatchFaceAdapter
    public String getCommonCountryCode() {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "commonCountryCode is: ", GRSManager.c(BaseApplication.getContext()).d());
        return GRSManager.c(BaseApplication.getContext()).d();
    }

    @Override // defpackage.ecw, com.huawei.watchface.api.HwWatchFaceAdapter
    public Map<String, String> getDeviceInfo() {
        HashMap map = new HashMap(16);
        if (lvb.e() == null) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "getDeviceInfo sDeviceManager is null");
            return map;
        }
        DeviceInfo deviceInfoC = mgg.c("WatchFaceAdapterImpl");
        Object obj = WatchFaceUtil.isSupportMyWatch(deviceInfoC) ? "1" : "0";
        String str = eey.d(deviceInfoC, 258) ? "1" : "0";
        if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            map.put("device_Identify", deviceInfoC.getDeviceIdentify());
            map.put("device_model", d(deviceInfoC));
            map.put(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION, deviceInfoC.getSoftVersion());
            map.put("device_name", deviceInfoC.getDeviceName());
            map.put("isSupportMyWatch", obj);
            map.put("isSupportMacCut", str);
            map.put("deviceIdCutStr", e(deviceInfoC.getDeviceIdentify()));
        }
        return map;
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public List<Map<String, String>> getDisableWearInfo() {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "getDisableWearInfo enter.");
        ArrayList arrayList = new ArrayList(16);
        for (dxy dxyVar : lvl.j()) {
            if (dxyVar.c() != 1 || dxyVar.b() != 2) {
                d(dxyVar.d(), arrayList);
            }
        }
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "getDisableWearInfo, size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static String d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return "";
        }
        String deviceModel = deviceInfo.getDeviceModel();
        if (!TextUtils.isEmpty(deviceModel)) {
            return deviceModel;
        }
        int productType = deviceInfo.getProductType();
        if (productType == 20) {
            LogUtil.a("WatchFaceAdapterImpl", "getDeviceModel type:", Integer.valueOf(productType));
            return "TLS-B19";
        }
        LogUtil.a("WatchFaceAdapterImpl", "getDeviceModel model is empty");
        return deviceModel;
    }

    private static void d(String str, List<Map<String, String>> list) {
        String str2;
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "buildDeviceInfoMap enter.");
        DeviceInfo deviceInfoC = mgg.c(str, "WatchFaceAdapterImpl");
        HashMap map = new HashMap(16);
        if (!eey.d(deviceInfoC, 258)) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        if (deviceInfoC != null) {
            map.put("device_Identify", deviceInfoC.getDeviceIdentify());
            map.put("device_model", d(deviceInfoC));
            map.put(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION, deviceInfoC.getSoftVersion());
            map.put("device_name", deviceInfoC.getDeviceName());
            map.put("last_connected_time", String.valueOf(deviceInfoC.getLastConnectedTime()));
            map.put("isSupportMacCut", str2);
            map.put("deviceIdCutStr", e(deviceInfoC.getDeviceIdentify()));
            list.add(map);
            return;
        }
        ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "buildDeviceInfoMap deviceInfo is null.");
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void loginByHealthHmsLite(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            ecw.loginByHealthHmsLite(context, new com.huawei.hwbasemgr.IBaseResponseCallback() { // from class: mce.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    iBaseResponseCallback.onResponse(i, obj);
                }
            });
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void loginByHealthHms(Context context, final ILoginCallback iLoginCallback) {
        if (iLoginCallback != null) {
            ecw.loginByHealthHms(context, new com.huawei.login.ui.login.util.ILoginCallback() { // from class: mce.1
                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginSuccess(Object obj) {
                    iLoginCallback.onLoginSuccess(obj);
                }

                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginFailed(Object obj) {
                    iLoginCallback.onLoginFailed(obj);
                }
            });
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void registerHealthResponseListener(WatchFaceHealthResponseListener watchFaceHealthResponseListener) {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "registerHealthResponseListener");
        mbz.a(BaseApplication.getContext()).a(watchFaceHealthResponseListener);
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void unRegisterHealthResponseListener() {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "unRegisterHealthResponseListener");
        mbz.a(BaseApplication.getContext()).h();
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void sendBluetoothCommand(int i, int i2, ByteBuffer byteBuffer) {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "sendWalletTlv,serviceId:", Integer.valueOf(i), ",commandId:", Integer.valueOf(i2));
        if (byteBuffer == null) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "sendBluetoothCommand myByteBuffer is null");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "sendWalletTlv");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        this.d.c(deviceCommand);
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void commonTransferFile(TransferBusiType transferBusiType, TransFileInfo transFileInfo, ParcelFileDescriptor parcelFileDescriptor, int i, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "parcelFileDescriptor entry.", "parcelFileDescriptor is null ? ", Boolean.valueOf(parcelFileDescriptor == null), "file size : ", Integer.valueOf(i));
        if (iAppTransferFileResultAIDLCallback == null && transFileInfo == null) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "commonTransferFile param error");
            return;
        }
        mhp mhpVar = new mhp();
        mhpVar.a(transFileInfo.getFileName());
        mhpVar.c(transFileInfo.getFileType());
        mhpVar.c(i);
        mhpVar.j(transFileInfo.getPackageName());
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "transFileInfo.getRequestType().getValue() : ", Integer.valueOf(transFileInfo.getRequestType().getValue()));
        TransferFileReqType fileReqTypeByValue = TransferFileReqType.getFileReqTypeByValue(transFileInfo.getRequestType().getValue());
        mhpVar.e(fileReqTypeByValue);
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "requestType is null ? ", Boolean.valueOf(fileReqTypeByValue == null));
        TransferBusinessType busiTypeByValue = TransferBusinessType.getBusiTypeByValue(transferBusiType.getValue());
        if (TransferFileReqType.DEVICE_UNREGISTRATION.equals(fileReqTypeByValue)) {
            mcd.d().e(mhpVar.a(), iAppTransferFileResultAIDLCallback);
            return;
        }
        if (!TransferFileReqType.DEVICE_REGISTRATION.equals(fileReqTypeByValue)) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "mHwDeviceConfigManager commonTransferFile 5.40.2");
            this.d.d(busiTypeByValue, mhpVar, mcd.d().c(iAppTransferFileResultAIDLCallback), parcelFileDescriptor);
        } else {
            mcd.d().b(mhpVar.a(), iAppTransferFileResultAIDLCallback);
            ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "mHwDeviceConfigManager commonTransferFile registration entry");
            this.d.d(busiTypeByValue, mhpVar, mcd.d().c(), parcelFileDescriptor);
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void commonTransferFile(TransferBusiType transferBusiType, TransFileInfo transFileInfo, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "commonTransferFile entry");
        if (iAppTransferFileResultAIDLCallback == null && transFileInfo == null) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "commonTransferFile param error");
            return;
        }
        mhp mhpVar = new mhp();
        mhpVar.b(transFileInfo.getAttentionTypes());
        TransferFileReqType fileReqTypeByValue = TransferFileReqType.getFileReqTypeByValue(transFileInfo.getRequestType().getValue());
        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "requestType is : ", fileReqTypeByValue, "attentionTypes size is: ", Integer.valueOf(mhpVar.a().size()));
        mhpVar.e(fileReqTypeByValue);
        mhpVar.a(transFileInfo.getFileName());
        mhpVar.c(transFileInfo.getFileType());
        mhpVar.h(transFileInfo.getFilePath());
        mhpVar.j(transFileInfo.getPackageName());
        mhpVar.b(transFileInfo.getSourceId());
        TransferBusinessType busiTypeByValue = TransferBusinessType.getBusiTypeByValue(transferBusiType.getValue());
        if (TransferFileReqType.DEVICE_UNREGISTRATION.equals(fileReqTypeByValue)) {
            mcd.d().e(mhpVar.a(), iAppTransferFileResultAIDLCallback);
            return;
        }
        if (TransferFileReqType.DEVICE_REGISTRATION.equals(fileReqTypeByValue)) {
            mcd.d().b(mhpVar.a(), iAppTransferFileResultAIDLCallback);
            ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "mHwDeviceConfigManager commonTransferFile registration entry");
            this.d.b(busiTypeByValue, mhpVar, mcd.d().c());
        } else {
            ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "mHwDeviceConfigManager commonTransferFile 5.40.2");
            this.d.b(busiTypeByValue, mhpVar, mcd.d().c(iAppTransferFileResultAIDLCallback));
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void startRequestFile(String str, int i, boolean z, final IPhotoFileCallback iPhotoFileCallback) {
        if (iPhotoFileCallback != null) {
            mhp mhpVar = new mhp();
            mhpVar.a(str);
            mhpVar.c(i);
            mhpVar.e(z);
            mhpVar.d(null);
            this.d.e(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: mce.2
                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onSuccess(int i2, String str2, String str3) {
                    ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "transfer successful :", Integer.valueOf(i2));
                    iPhotoFileCallback.onSuccess(i2, str2, str3);
                }

                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "TransferImagesFromDeviceFailed errorCode:", Integer.valueOf(i2));
                    iPhotoFileCallback.onFailure(i2, str2);
                }

                @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
                public void onProgress(int i2, String str2) {
                    LogUtil.a("WatchFaceAdapterImpl", "onFileTransferState percentage =", Integer.valueOf(i2));
                    iPhotoFileCallback.onProgress(i2, str2);
                }
            });
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void commonStopTransfer(String str, int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            this.d.b(str, i, new IBaseCallback.Stub() { // from class: mce.3
                @Override // com.huawei.hwservicesmgr.IBaseCallback
                public void onResponse(int i2, String str2) throws RemoteException {
                    ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "cancelInstallWatchFace response code:", Integer.valueOf(i2), "cancelTime:", Long.valueOf(System.currentTimeMillis()));
                    iBaseResponseCallback.onResponse(i2, str2);
                }
            });
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void installApp(String str) {
        if (CommonUtil.af(BaseApplication.getContext())) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "packageName is null");
        } else {
            LogUtil.a("WatchFaceAdapterImpl", "packageName:", str);
            lyy.b().e(str);
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public boolean getIsTaskExecuting() {
        boolean zC = SmartClipManager.e(BaseApplication.getContext()).c();
        LogUtil.a("WatchFaceAdapterImpl", "isTaskExecuting:", Boolean.valueOf(zC));
        return zC;
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public String getAccessToken() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        if (!TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "accessToken: ", accountInfo.substring(0, 4));
        }
        return accountInfo;
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void refreshAccessToken(final ILoginCallback iLoginCallback) {
        if (iLoginCallback == null) {
            ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "callback is null.");
        } else {
            ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "refreshAccessToken enter.");
            LoginInit.getInstance(BaseApplication.getContext()).refreshAccessToken(new com.huawei.login.ui.login.util.ILoginCallback() { // from class: mce.5
                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginSuccess(Object obj) {
                    if (!(obj instanceof String)) {
                        ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "object is not String.");
                        iLoginCallback.onLoginFailed(obj);
                        return;
                    }
                    String str = (String) obj;
                    if (str.length() <= 4) {
                        ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "refreshAccessToken onLoginFailed, token is less than 4");
                        iLoginCallback.onLoginFailed(obj);
                    } else {
                        ReleaseLogUtil.d("DEVMGR_WatchFaceAdapterImpl", "refreshAccessToken onLoginSuccess. token:", str.substring(0, 4));
                        iLoginCallback.onLoginSuccess(obj);
                    }
                }

                @Override // com.huawei.login.ui.login.util.ILoginCallback
                public void onLoginFailed(Object obj) {
                    ReleaseLogUtil.e("DEVMGR_WatchFaceAdapterImpl", "refreshAccessToken onLoginFailed. object: ", obj);
                    iLoginCallback.onLoginFailed(obj);
                }
            });
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void showHealthAppSettingGuide(final Context context, final String str, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        LogUtil.j("WatchFaceAdapterImpl", "showHealthAppSettingGuide");
        PermissionUtil.PermissionType permissionTypeValueOf = PermissionUtil.PermissionType.valueOf(str);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_hwh_home_other_permissions_title).a(context.getResources().getString(qrs.b(permissionTypeValueOf))).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: mcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mce.d(onClickListener2, view);
            }
        }).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: mch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mce.c(str, context, onClickListener, view);
            }
        }).b(Integer.valueOf(R.color.watchface_market_button_color)).d(Integer.valueOf(R.color.watchface_market_button_color)).b();
        customTextAlertDialogB.setCancelable(false);
        qrs.c(context, permissionTypeValueOf, customTextAlertDialogB, onClickListener, onClickListener2);
    }

    static /* synthetic */ void d(View.OnClickListener onClickListener, View view) {
        LogUtil.d("WatchFaceAdapterImpl", "showPermissionSettingGuide cancel");
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    static /* synthetic */ void c(String str, Context context, View.OnClickListener onClickListener, View view) {
        LogUtil.d("WatchFaceAdapterImpl", "showPermissionSettingGuide cancel");
        if (PermissionUtil.f() && PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE.equals(str)) {
            qrs.ad();
        } else {
            qrs.al(context);
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.huawei.watchface.api.HwWatchFaceAdapter
    public void sendLocalBroadcast(Intent intent) {
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length < 6) {
            LogUtil.j("WatchFaceAdapterImpl", "getCutMac mac is error:", Integer.valueOf(strArrSplit.length));
            return str;
        }
        return str.substring(3);
    }
}
