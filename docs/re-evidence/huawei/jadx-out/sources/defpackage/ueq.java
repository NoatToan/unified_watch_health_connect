package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwarkuix.oHBrigdePlugin.health.utils.DeviceUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ueq {
    private static final String[] e = {"e4b0b1d5-2003-4d88-8b5f-c4f64542040b", "a8ba095d-4123-43c4-a30a-0240011c58de"};

    public static void e(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uer
            @Override // java.lang.Runnable
            public final void run() {
                ueq.c(iBaseResponseCallback);
            }
        });
    }

    static /* synthetic */ void c(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("PressureCalibrateUtil", "callback is null in getSupportPressureDevice");
            return;
        }
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        d(arrayList);
        iBaseResponseCallback.a(0, qqt.b(arrayList));
    }

    public static String b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        d(arrayList);
        return qqt.b(arrayList);
    }

    private static void d(List<b> list) {
        DeviceInfo deviceInfoC = mgg.c("PressureCalibrateUtil");
        if (deviceInfoC == null || !DeviceUtil.isSupportPressAutoMonitor() || DeviceUtil.isSupportEmotionAutoMonitor()) {
            return;
        }
        b bVar = new b();
        bVar.e(deviceInfoC.getDeviceName());
        bVar.d("huaweischeme://healthapp/router/pressureCalibrate");
        list.add(bVar);
    }

    private static void c(List<b> list) {
        ArrayList<eby> arrayListD = drw.e().d();
        if (CollectionUtils.a(arrayListD)) {
            return;
        }
        for (eby ebyVar : arrayListD) {
            if (ebyVar != null) {
                String productId = ebyVar.getProductId();
                if (c(productId)) {
                    b bVar = new b();
                    bVar.d(b(productId));
                    bVar.e(a(ebyVar));
                    list.add(bVar);
                }
            }
        }
    }

    private static String a(eby ebyVar) {
        String strL = ebyVar.a().l();
        String strA = "";
        if (TextUtils.isEmpty(strL)) {
            LogUtil.j("PressureCalibrateUtil", "wiFiDevice sn is null");
            strL = "";
        } else if (strL.length() < 3) {
            LogUtil.j("PressureCalibrateUtil", "device sn length less than 3");
        } else {
            strL = Constants.LINK + strL.substring(strL.length() - 3);
        }
        elh elhVarD = ResourceManager.c().d(ebyVar.getProductId());
        if (elhVarD != null) {
            if (elhVarD.d().size() <= 0) {
                strA = elhVarD.l().d() + System.lineSeparator() + elhVarD.l().e();
            } else {
                strA = elo.a(elhVarD.t(), elhVarD.l().d());
            }
        }
        return strA + strL;
    }

    private static String b(String str) {
        return "huaweischeme://healthapp/router/wifiPressureCalibrate?productId=" + str + "&useId=" + MultiUsersManager.INSTANCE.getMainUser().i();
    }

    private static boolean c(String str) {
        for (String str2 : e) {
            if (str2.equals(str)) {
                LogUtil.a("PressureCalibrateUtil", "isSupportPressureDevcie()=true ", "productType = ", str);
                return true;
            }
        }
        LogUtil.a("PressureCalibrateUtil", "isSupportPressureDevcie()=false ", "productType = ", str);
        return false;
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("deviceName")
        private String f49995b;

        @SerializedName("deepLink")
        private String d;

        private b() {
        }

        public void e(String str) {
            this.f49995b = str;
        }

        public void d(String str) {
            this.d = str;
        }
    }
}
