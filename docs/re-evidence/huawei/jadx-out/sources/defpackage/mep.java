package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hms.network.embedded.q0;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraAuthStatusCallback;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.SettingCameraCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mep implements CameraContorlInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f41515a = Uri.parse("content://com.huawei.dmsdp.provider/camera_remote_ctrl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f41516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ServiceConnection f41517c;
    private CameraAuthStatusCallback d;
    private boolean g;
    private String i;
    private Messenger h = null;
    private Handler e = new Handler(Looper.getMainLooper()) { // from class: mep.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("DmsdpServiceImpl", "get a message from server");
            switch (message.what) {
                case ARImageMetadata.CONTROL_AE_LOCK /* 65538 */:
                    mep.this.d(message.getData().getString("dmsdp_result"));
                    break;
                case ARImageMetadata.CONTROL_AE_MODE /* 65539 */:
                default:
                    LogUtil.j("DmsdpServiceImpl", "other handleMessage");
                    break;
                case 65540:
                case ARImageMetadata.CONTROL_AE_TARGET_FPS_RANGE /* 65541 */:
                    LogUtil.j("DmsdpServiceImpl", "delete success");
                    break;
            }
            mep.this.unbindCameraService();
        }
    };
    private Messenger j = new Messenger(this.e);
    private boolean f = false;
    private SettingCameraCallback k = new SettingCameraCallback() { // from class: mep.4
        @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.SettingCameraCallback
        public void connectSuccess() {
            LogUtil.a("DmsdpServiceImpl", "mPermissionOperationType is:", mep.this.i);
            if ("query".equals(mep.this.i)) {
                mep.this.b();
            } else if ("update".equals(mep.this.i)) {
                mep.this.a();
            } else if ("delete".equals(mep.this.i)) {
                mep.this.d();
            } else {
                LogUtil.j("DmsdpServiceImpl", "mPermissionOperationType is illegal");
            }
            mep.this.i = "";
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.SettingCameraCallback
        public void connectFail() {
            LogUtil.d("DmsdpServiceImpl", "connect fail");
        }
    };

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public boolean supportAlgoArch() {
        return true;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public boolean checkSupportCamera() {
        LogUtil.a("DmsdpServiceImpl", "enter checkCameraCapability");
        if (!eey.d(mgg.c("DmsdpServiceImpl"), 28)) {
            LogUtil.a("DmsdpServiceImpl", "checkSupportCamera watch not support");
            return false;
        }
        if (e()) {
            unbindCameraService();
            return true;
        }
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(f41515a, null, null, null, null);
            boolean z = cursorQuery != null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return z;
        } catch (SQLException unused) {
            LogUtil.e("DmsdpServiceImpl", "checkCameraCapability SQLException");
            return false;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("DmsdpServiceImpl", "checkCameraCapability IllegalArgumentException");
            return false;
        } catch (SecurityException unused3) {
            LogUtil.e("DmsdpServiceImpl", "checkCameraCapability SecurityException");
            return false;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public boolean checkSupportCamera(DeviceInfo deviceInfo) {
        LogUtil.a("DmsdpServiceImpl", "enter checkCameraCapability");
        if (!eey.d(deviceInfo, 28)) {
            LogUtil.a("DmsdpServiceImpl", "checkSupportCamera watch not support");
            return false;
        }
        if (e()) {
            unbindCameraService();
            return true;
        }
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(f41515a, null, null, null, null);
            boolean z = cursorQuery != null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return z;
        } catch (SQLException unused) {
            LogUtil.e("DmsdpServiceImpl", "checkCameraCapability SQLException");
            return false;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("DmsdpServiceImpl", "checkCameraCapability IllegalArgumentException");
            return false;
        } catch (SecurityException unused3) {
            LogUtil.e("DmsdpServiceImpl", "checkCameraCapability SecurityException");
            return false;
        }
    }

    private boolean c() {
        int i;
        DeviceInfo deviceInfoC = mgg.c("DmsdpServiceImpl");
        if (deviceInfoC == null) {
            LogUtil.j("DmsdpServiceImpl", "getCameraAuthorizationStatus getConnectDeviceInfo is null");
            return false;
        }
        Cursor cursorB = b(deviceInfoC.getUdidFromDevice());
        if (cursorB == null) {
            LogUtil.j("DmsdpServiceImpl", "getCameraAuthorizationStatus cursor is null");
            return false;
        }
        if (cursorB.moveToFirst()) {
            i = cursorB.getInt(cursorB.getColumnIndex("status"));
            LogUtil.a("DmsdpServiceImpl", "getCameraAuthorizationStatus status:", Integer.valueOf(i));
        } else {
            i = 0;
        }
        cursorB.close();
        return i == 1;
    }

    private void a(boolean z) {
        DeviceInfo deviceInfoC = mgg.c("DmsdpServiceImpl");
        if (deviceInfoC == null) {
            LogUtil.j("DmsdpServiceImpl", "updateCameraAuthorization getConnectDeviceInfo is null");
            return;
        }
        String udidFromDevice = deviceInfoC.getUdidFromDevice();
        Cursor cursorB = b(udidFromDevice);
        if (cursorB == null) {
            LogUtil.j("DmsdpServiceImpl", "updateCameraAuthorization cursor is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        contentValues.put("status", Integer.valueOf(z ? 1 : 0));
        if (cursorB.getCount() == 0) {
            contentValues.put("udid", udidFromDevice);
            contentResolver.insert(f41515a, contentValues);
        } else if (cursorB.moveToFirst()) {
            contentResolver.update(f41515a, contentValues, "udid =? ", new String[]{udidFromDevice});
        }
        cursorB.close();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void deleteCameraAuthorization(DeviceInfo deviceInfo) {
        LogUtil.a("DmsdpServiceImpl", "deleteCameraAuthorization");
        this.i = "delete";
        this.f41516b = deviceInfo;
        if (e()) {
            return;
        }
        this.f41516b = null;
        this.i = "";
        d(deviceInfo);
    }

    private void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DmsdpServiceImpl", "deleteCameraAuthorization deviceInfo is null");
            return;
        }
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        Cursor cursorB = b(udidFromDevice);
        if (cursorB == null) {
            LogUtil.j("DmsdpServiceImpl", "deleteCameraAuthorization cursor is null");
            return;
        }
        if (BaseApplication.getContext().getContentResolver().delete(f41515a, "udid =? ", new String[]{udidFromDevice}) > 0) {
            LogUtil.a("DmsdpServiceImpl", "deleteCameraAuthorization success:", deviceInfo.getDeviceName());
        }
        cursorB.close();
    }

    private Cursor b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DmsdpServiceImpl", "getCursor deviceUdid isEmpty");
            return null;
        }
        try {
            return BaseApplication.getContext().getContentResolver().query(f41515a, null, "udid =? ", new String[]{str}, null);
        } catch (SQLException unused) {
            LogUtil.e("DmsdpServiceImpl", "getCursor SQLException");
            return null;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("DmsdpServiceImpl", "getCursor IllegalArgumentException");
            return null;
        } catch (SecurityException unused3) {
            LogUtil.e("DmsdpServiceImpl", "getCursor SecurityException");
            return null;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void getCameraStatus(CameraAuthStatusCallback cameraAuthStatusCallback) {
        LogUtil.a("DmsdpServiceImpl", "enter getCameraStatus");
        this.i = "query";
        this.d = cameraAuthStatusCallback;
        if (e()) {
            return;
        }
        this.i = "";
        this.d.authStatus(Boolean.valueOf(c()));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void updateCameraAuthStatus(boolean z) {
        LogUtil.a("DmsdpServiceImpl", "enter updateCameraAuthStatus,isAuthorizatio ", Boolean.valueOf(z));
        this.i = "update";
        this.g = z;
        if (e()) {
            return;
        }
        this.i = "";
        this.g = false;
        a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        DeviceInfo deviceInfoC = mgg.c("DmsdpServiceImpl");
        if (deviceInfoC == null) {
            LogUtil.j("DmsdpServiceImpl", "queryDmsdp device info is null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = ARImageMetadata.CONTROL_AE_LOCK;
        messageObtain.replyTo = this.j;
        Bundle bundle = new Bundle();
        bundle.putStringArray("projection", new String[]{"status"});
        bundle.putString("selection", "udid=?");
        bundle.putStringArray("selectionArgs", new String[]{deviceInfoC.getUdidFromDevice()});
        messageObtain.setData(bundle);
        LogUtil.a("DmsdpServiceImpl", "send DMSDP_CAMERA_REMOTE_CTRL_QUERY");
        try {
            this.h.send(messageObtain);
        } catch (RemoteException unused) {
            LogUtil.e("DmsdpServiceImpl", "queryDmsdp exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        DeviceInfo deviceInfoC = mgg.c("DmsdpServiceImpl");
        if (deviceInfoC == null) {
            LogUtil.j("DmsdpServiceImpl", "updateOrInsertDmsdp device info is null");
            return;
        }
        String udidFromDevice = deviceInfoC.getUdidFromDevice();
        Message messageObtain = Message.obtain();
        messageObtain.what = ARImageMetadata.CONTROL_AE_TARGET_FPS_RANGE;
        messageObtain.replyTo = this.j;
        Bundle bundle = new Bundle();
        ContentValues contentValues = new ContentValues();
        contentValues.put("udid", udidFromDevice);
        contentValues.put("status", Integer.valueOf(this.g ? 1 : 0));
        bundle.putParcelable(q0.j, contentValues);
        messageObtain.setData(bundle);
        LogUtil.a("DmsdpServiceImpl", "send DMSDP_CAMERA_REMOTE_CTRL_INSERT_OR_UPDATE");
        try {
            this.h.send(messageObtain);
        } catch (RemoteException unused) {
            LogUtil.e("DmsdpServiceImpl", "updateOrInsertDmsdp exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        DeviceInfo deviceInfo = this.f41516b;
        if (deviceInfo == null) {
            LogUtil.j("DmsdpServiceImpl", "deleteDmsdp deviceInfo is null");
            return;
        }
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        Message messageObtain = Message.obtain();
        messageObtain.what = 65540;
        messageObtain.replyTo = this.j;
        Bundle bundle = new Bundle();
        bundle.putString("selection", "udid=?");
        bundle.putStringArray("selectionArgs", new String[]{udidFromDevice});
        messageObtain.setData(bundle);
        LogUtil.a("DmsdpServiceImpl", "send DMSDP_CAMERA_REMOTE_CTRL_DELETE");
        try {
            this.h.send(messageObtain);
        } catch (RemoteException unused) {
            LogUtil.e("DmsdpServiceImpl", "deleteDmsdp exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        LogUtil.a("DmsdpServiceImpl", "enter parseQueryResult result is", str);
        boolean z = false;
        if (StringUtils.g(str)) {
            this.d.authStatus(false);
            return;
        }
        try {
            JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
            if (jSONObject.has("status") && 1 == jSONObject.getInt("status")) {
                z = true;
            }
        } catch (JSONException unused) {
            LogUtil.e("DmsdpServiceImpl", "parseQueryResult JSONException");
        }
        this.d.authStatus(Boolean.valueOf(z));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface
    public void unbindCameraService() {
        synchronized (this) {
            if (this.f41517c != null && this.f) {
                LogUtil.a("DmsdpServiceImpl", "unbind service");
                BaseApplication.getContext().unbindService(this.f41517c);
                this.f = false;
            }
        }
    }

    private boolean e() {
        boolean zBindService;
        synchronized (this) {
            this.f41517c = new b(this.k);
            Intent intent = new Intent();
            intent.setAction("com.huawei.dmsdp.DMSDP_CAMERA_REMOTE_CTRL");
            intent.setPackage("com.huawei.dmsdp");
            try {
                zBindService = BaseApplication.getContext().bindService(intent, this.f41517c, 1);
            } catch (SecurityException e) {
                LogUtil.e("DmsdpServiceImpl", "bindService exception", LogAnonymous.b(e));
                zBindService = false;
            }
            this.f = zBindService;
            LogUtil.a("DmsdpServiceImpl", "bindRemoteService status is:", Boolean.valueOf(zBindService));
        }
        return zBindService;
    }

    class b implements ServiceConnection {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SettingCameraCallback f41521c;

        public b(SettingCameraCallback settingCameraCallback) {
            this.f41521c = settingCameraCallback;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mep.this.h = new Messenger(iBinder);
            this.f41521c.connectSuccess();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            mep.this.unbindCameraService();
            this.f41521c.connectFail();
        }
    }
}
