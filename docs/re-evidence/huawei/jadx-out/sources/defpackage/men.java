package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraAuthStatusCallback;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class men implements CameraContorlInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f41511a = Uri.parse("content://com.huawei.camera.remotecallconfirmProvider/device");

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public boolean checkSupportCamera() {
        if (!c("com.huawei.camera.intent.RemoteCall") && !c("android.intent.action.RemoteCall")) {
            LogUtil.j("RemoteProviderImpl", "resolveInfo or resolveInfo.activityInfo is null, isSupportAuthAction is false");
            return false;
        }
        LogUtil.j("RemoteProviderImpl", "isSupportAuthAction is true");
        DeviceInfo deviceInfoC = mgg.c("RemoteProviderImpl");
        if (deviceInfoC == null) {
            return false;
        }
        return ndh.a(deviceInfoC);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public boolean checkSupportCamera(DeviceInfo deviceInfo) {
        if (!c("com.huawei.camera.intent.RemoteCall") && !c("android.intent.action.RemoteCall")) {
            LogUtil.j("RemoteProviderImpl", "resolveInfo or resolveInfo.activityInfo is null, isSupportAuthAction is false");
            return false;
        }
        LogUtil.j("RemoteProviderImpl", "isSupportAuthAction is true");
        if (deviceInfo == null) {
            return false;
        }
        return ndh.a(deviceInfo);
    }

    private boolean c(String str) {
        Intent intent = new Intent(str);
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null) {
            return false;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
        if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
            return true;
        }
        LogUtil.j("RemoteProviderImpl", "resolveInfo or resolveInfo.activityInfo is null, isSupportAuthAction is false");
        return false;
    }

    private Cursor d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("RemoteProviderImpl", "getCursor deviceUdid isEmpty");
            return null;
        }
        try {
            return BaseApplication.getContext().getContentResolver().query(f41511a, null, str, null, null);
        } catch (SQLException | IllegalArgumentException | SecurityException e) {
            LogUtil.e("RemoteProviderImpl", "getCursor Exception :", ExceptionUtils.c(e));
            return null;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public boolean supportAlgoArch() {
        int i;
        Cursor cursorD = d("default");
        if (cursorD == null) {
            LogUtil.j("RemoteProviderImpl", "supportAlgoArch cursor is null");
            return false;
        }
        if (!cursorD.moveToFirst() || cursorD.getColumnIndex("support") < 0) {
            i = 0;
        } else {
            i = cursorD.getInt(cursorD.getColumnIndex("support"));
            LogUtil.a("RemoteProviderImpl", "supportAlgoArch status:", Integer.valueOf(i));
        }
        cursorD.close();
        return i == 1;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void getCameraStatus(CameraAuthStatusCallback cameraAuthStatusCallback) {
        int i;
        DeviceInfo deviceInfoC = mgg.c("RemoteProviderImpl");
        if (deviceInfoC == null) {
            LogUtil.j("RemoteProviderImpl", "getCameraAuthorizationStatus getConnectDeviceInfo is null");
            cameraAuthStatusCallback.authStatus(false);
            return;
        }
        Cursor cursorD = d(deviceInfoC.getDeviceUdid());
        if (cursorD == null) {
            LogUtil.j("RemoteProviderImpl", "getCameraAuthorizationStatus cursor is null");
            cameraAuthStatusCallback.authStatus(false);
            return;
        }
        if (cursorD.moveToFirst()) {
            i = cursorD.getInt(cursorD.getColumnIndex("status"));
            LogUtil.a("RemoteProviderImpl", "getCameraAuthorizationStatus status:", Integer.valueOf(i));
        } else {
            i = 0;
        }
        cursorD.close();
        cameraAuthStatusCallback.authStatus(Boolean.valueOf(i == 1));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void updateCameraAuthStatus(boolean z) {
        DeviceInfo deviceInfoC = mgg.c("RemoteProviderImpl");
        if (deviceInfoC == null) {
            LogUtil.j("RemoteProviderImpl", "updateCameraAuthorization getConnectDeviceInfo is null");
            return;
        }
        String deviceUdid = deviceInfoC.getDeviceUdid();
        Cursor cursorD = d(deviceUdid);
        if (cursorD == null) {
            LogUtil.j("RemoteProviderImpl", "updateCameraAuthorization cursor is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        contentValues.put("status", Integer.valueOf(z ? 1 : 0));
        if (cursorD.getCount() == 0) {
            contentValues.put("udid", deviceUdid);
            contentResolver.insert(f41511a, contentValues);
        } else if (cursorD.moveToFirst()) {
            if (cursorD.getInt(cursorD.getColumnIndex("status")) == -1) {
                contentValues.put("udid", deviceUdid);
                contentResolver.insert(f41511a, contentValues);
            } else {
                contentResolver.update(f41511a, contentValues, deviceUdid, null);
            }
        }
        cursorD.close();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void deleteCameraAuthorization(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("RemoteProviderImpl", "deleteCameraAuth deviceInfo is null");
            return;
        }
        String deviceUdid = deviceInfo.getDeviceUdid();
        Cursor cursorD = d(deviceUdid);
        if (cursorD == null) {
            LogUtil.j("RemoteProviderImpl", "deleteCameraAuth cursor is null");
            return;
        }
        if (BaseApplication.getContext().getContentResolver().delete(f41511a, deviceUdid, null) > 0) {
            LogUtil.a("RemoteProviderImpl", "deleteCameraAuth success:", deviceInfo.getDeviceName());
        }
        cursorD.close();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void unbindCameraService() {
        LogUtil.a("RemoteProviderImpl", "unbindCameraService success:", true);
    }
}
