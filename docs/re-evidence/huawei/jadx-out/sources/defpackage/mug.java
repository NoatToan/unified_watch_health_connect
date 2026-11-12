package defpackage;

import android.graphics.Bitmap;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class mug {
    public static mug b() {
        return c.f42420b;
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final mug f42420b = new mug();
    }

    public void a(muh muhVar, Bitmap bitmap, boolean z, final IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "CompositeImageManager");
        if (d(deviceInfo, z)) {
            mui.c(deviceInfo, muhVar, bitmap, new ResultCallback<Bitmap>() { // from class: mug.1
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Bitmap bitmap2) {
                    iBaseResponseCallback.a(0, bitmap2);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    iBaseResponseCallback.a(-1, th);
                }
            });
            return;
        }
        int iM = muhVar.m();
        if (iM == 1) {
            iBaseResponseCallback.a(0, mui.e(muhVar, bitmap));
        } else if (iM == 2) {
            iBaseResponseCallback.a(0, mui.a(muhVar, bitmap));
        } else {
            iBaseResponseCallback.a(-1, null);
            LogUtil.e("CompositeImageManager", "watchType is not supported: ", Integer.valueOf(muhVar.m()));
        }
    }

    private boolean d(DeviceInfo deviceInfo, boolean z) {
        Objects.isNull(deviceInfo);
        if (deviceInfo == null) {
            LogUtil.j("CompositeImageManager", "isCanCompositedPicture deviceInfo is null");
            return false;
        }
        boolean zB = SharedPreferenceManager.b(Integer.toString(1000), "screenshot_setting_square_watch_switch", false);
        LogUtil.a("CompositeImageManager", "isCanCompositedPicture isSquareWatchTest:", Boolean.valueOf(zB));
        if (!CommonUtil.bu() && zB) {
            return true;
        }
        boolean zD = eey.d(deviceInfo, 289);
        boolean zK = Utils.k();
        LogUtil.a("CompositeImageManager", "isCanCompositedPicture isSupport: ", Boolean.valueOf(zD), " isOpen: ", Boolean.valueOf(z), " isOverseaNoCloud :", Boolean.valueOf(zK));
        return zD && z && !zK;
    }
}
