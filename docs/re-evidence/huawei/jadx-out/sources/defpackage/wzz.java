package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback;
import com.huawei.ui.thirdpartservice.syncdata.wechatdevice.SdkManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class wzz {
    public static void e(final ICloudOperationResult<Boolean> iCloudOperationResult) {
        lsy.a(new Runnable() { // from class: xac
            @Override // java.lang.Runnable
            public final void run() {
                new wze().b(iCloudOperationResult);
            }
        });
    }

    public static void b(final ICloudOperationResult<List<String>> iCloudOperationResult) {
        lsy.a(new Runnable() { // from class: xad
            @Override // java.lang.Runnable
            public final void run() {
                new wzr().c((ICloudOperationResult<List<String>>) iCloudOperationResult);
            }
        });
    }

    public static void d(final DeviceInfo deviceInfo, final ICloudOperationResult<String> iCloudOperationResult) {
        lsy.a(new Runnable() { // from class: xag
            @Override // java.lang.Runnable
            public final void run() {
                new wzm().d(deviceInfo, iCloudOperationResult);
            }
        });
    }

    public static void b(final SupportDeviceResultCallback supportDeviceResultCallback) {
        lsy.a(new Runnable() { // from class: xae
            @Override // java.lang.Runnable
            public final void run() {
                new wzf().d(supportDeviceResultCallback);
            }
        });
    }

    public static void d(Map<String, String> map, ICloudOperationResult<String> iCloudOperationResult) {
        new wzh().e(map, iCloudOperationResult);
    }

    public static void b(Context context, String str, SdkManager.launchWechatCallBack launchwechatcallback) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        new SdkManager().c(context, arrayList, launchwechatcallback);
    }

    public static Bitmap b(String str) {
        wzf wzfVar = new wzf();
        List<DeviceInfo> listA = wzfVar.a();
        if (njy.e(listA)) {
            return null;
        }
        for (DeviceInfo deviceInfo : listA) {
            if (str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                return wzfVar.c(deviceInfo);
            }
        }
        return null;
    }

    public static List<DeviceInfo> e() {
        return new wzf().d();
    }

    public static List<DeviceInfo> d() {
        return new wzf().a();
    }

    public static void c(ICloudOperationResult<List<DeviceInfo>> iCloudOperationResult) {
        new wzf().d(iCloudOperationResult);
    }

    public static List<xcp> d(List<DeviceInfo> list) {
        return new wzf().a(list);
    }
}
