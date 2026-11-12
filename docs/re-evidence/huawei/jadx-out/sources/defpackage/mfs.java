package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mfs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mfq.c f41629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f41630c;
    private static boolean d;

    public static void c(final Activity activity, final int i) {
        if (!CommonUtil.ap() || activity == null) {
            return;
        }
        ThreadPoolManager.c().b("WaterMarkUtils", new Runnable() { // from class: mfv
            @Override // java.lang.Runnable
            public final void run() {
                mfs.d(activity, i);
            }
        });
    }

    static /* synthetic */ void d(final Activity activity, final int i) {
        d();
        activity.runOnUiThread(new Runnable() { // from class: mfu
            @Override // java.lang.Runnable
            public final void run() {
                mfq.a(mfs.f41629b, activity, i);
            }
        });
    }

    public static void a(final Activity activity, final ViewGroup viewGroup) {
        if (!CommonUtil.ap() || activity == null) {
            return;
        }
        ThreadPoolManager.c().b("WaterMarkUtils", new Runnable() { // from class: mft
            @Override // java.lang.Runnable
            public final void run() {
                mfs.d(activity, viewGroup);
            }
        });
    }

    static /* synthetic */ void d(final Activity activity, final ViewGroup viewGroup) {
        d();
        activity.runOnUiThread(new Runnable() { // from class: mfw
            @Override // java.lang.Runnable
            public final void run() {
                mfq.a(mfs.f41629b, activity, viewGroup);
            }
        });
    }

    private static void d() {
        String accountInfo;
        if (!Utils.h()) {
            accountInfo = "";
        } else {
            accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        }
        String strB = mfr.b(c(), accountInfo);
        boolean zX = qrs.x(BaseApplication.getContext());
        if (zX != d || (!TextUtils.isEmpty(strB) && (TextUtils.isEmpty(f41630c) || !f41630c.equals(strB)))) {
            LogUtil.a("WaterMarkUtils", "sWaterTextString is change, Text: ", strB);
            f41630c = strB;
            d = zX;
            f41629b = mfq.e(strB, zX);
            return;
        }
        LogUtil.j("WaterMarkUtils", "sWaterTextString is not change, Text: ", strB);
    }

    private static String c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WaterMarkUtils");
        if (deviceList == null || deviceList.isEmpty()) {
            return "";
        }
        Collections.sort(deviceList, new Comparator<DeviceInfo>() { // from class: mfs.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
                if (deviceInfo == null || deviceInfo2 == null) {
                    return 0;
                }
                if (deviceInfo2.getLastConnectedTime() > deviceInfo.getLastConnectedTime()) {
                    return 1;
                }
                return deviceInfo2.getLastConnectedTime() < deviceInfo.getLastConnectedTime() ? -1 : 0;
            }
        });
        String deviceIdentify = deviceList.get(0).getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            return deviceIdentify;
        }
        String strReplace = deviceIdentify.replace(":", "");
        int length = strReplace.length();
        return length > 4 ? strReplace.substring(length - 4, length) : strReplace;
    }
}
