package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraAuthStatusCallback;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraContorlInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;

/* JADX INFO: loaded from: classes10.dex */
public class meo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static meo f41512c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CameraContorlInterface f41514b;
    private static final Object e = new Object();
    private static BroadcastReceiver d = new BroadcastReceiver() { // from class: meo.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                LogUtil.a("SettingCameraManager", "device state changed");
                BaseApplication.b().unregisterReceiver(meo.d);
                meo unused = meo.f41512c = null;
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mep f41513a = new mep();
    private men g = new men();

    private meo() {
        d();
        if (this.f41513a.checkSupportCamera() && !this.g.supportAlgoArch()) {
            this.f41514b = this.f41513a;
        } else {
            this.f41514b = this.g;
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (this.f41513a.checkSupportCamera(deviceInfo) && !this.g.supportAlgoArch()) {
            this.f41514b = this.f41513a;
        } else {
            this.f41514b = this.g;
        }
    }

    public static meo a() {
        meo meoVar;
        synchronized (e) {
            if (f41512c == null) {
                f41512c = new meo();
            }
            meoVar = f41512c;
        }
        return meoVar;
    }

    private static void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.b(), d, intentFilter, clx.e, null);
    }

    public boolean c() {
        return this.f41514b.checkSupportCamera();
    }

    public boolean b(DeviceInfo deviceInfo) {
        return this.f41514b.checkSupportCamera(deviceInfo);
    }

    public void a(CameraAuthStatusCallback cameraAuthStatusCallback) {
        this.f41514b.getCameraStatus(cameraAuthStatusCallback);
    }

    public void d(boolean z) {
        this.f41514b.updateCameraAuthStatus(z);
    }

    public void e(DeviceInfo deviceInfo) {
        this.f41514b.deleteCameraAuthorization(deviceInfo);
    }

    public void b() {
        this.f41514b.unbindCameraService();
    }
}
