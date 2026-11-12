package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.operator.HwTagCardOperator;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class mby {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f41380a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mby f41381c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f41382b;
    private SmartClipManager.SmartLoadPluginCallback d = new SmartClipManager.SmartLoadPluginCallback() { // from class: mby.4
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartLoadPluginCallback
        public void onLoadPluginResult(int i) {
            LogUtil.a("HwTagCardManager", "on load plugin result:", Integer.valueOf(i));
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartLoadPluginCallback
        public void onLoadPluginProgress(int i) {
            LogUtil.d("HwTagCardManager", "load plugin progress:", Integer.valueOf(i));
        }
    };

    private mby(Context context) {
        this.f41382b = context;
    }

    public static mby b(Context context) {
        mby mbyVar;
        synchronized (e) {
            if (f41381c == null && context != null) {
                f41381c = new mby(context);
            }
            mbyVar = f41381c;
        }
        return mbyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("HwTagCardManager", "errorCode:", Integer.valueOf(i));
        if (i == -7) {
            c(139004);
        } else if (i == -6) {
            c(139003);
        } else if (i == -2) {
            c(139001);
        } else if (i == 0) {
            e(2);
            e(1);
            c(100000);
            b();
        } else {
            LogUtil.j("HwTagCardManager", "unknown error");
        }
        f41380a = false;
        String strValue = AnalyticsValue.TOUCH_TRANSFER_2180006.value();
        HashMap map = new HashMap(16);
        map.put("status", Integer.valueOf(i));
        DeviceInfo deviceInfoC = mgg.c("HwTagCardManager");
        if (deviceInfoC != null) {
            map.put("deviceModel", deviceInfoC.getDeviceModel());
        }
        lmf.d().c(this.f41382b, strValue, map, 0);
        HwWatchFaceUtil.a(map, strValue);
    }

    private void b() {
        if (Utils.o() || CommonUtil.bd()) {
            return;
        }
        new Handler(this.f41382b.getMainLooper()).post(new Runnable() { // from class: mby.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwTagCardManager", "startLoadSmartPlugin message");
                SmartClipManager.e(mby.this.f41382b).e(mby.this.d);
            }
        });
    }

    private void e(int i) {
        mbz.a(this.f41382b).c(i, new IBaseResponseCallback() { // from class: mby.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.a("HwTagCardManager", "setTagStatus errorCode is:", Integer.valueOf(i2));
            }
        });
    }

    private void c(int i) {
        LogUtil.a("HwTagCardManager", "setOpenCardResult:", Integer.valueOf(i));
        mbz.a(this.f41382b).e(i);
    }

    public void c() {
        if (f41380a) {
            LogUtil.a("HwTagCardManager", "opening card is true");
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(this.f41382b);
        if (!loginInit.getIsLogined() || loginInit.getAccountInfo(1008) == null || TextUtils.isEmpty(loginInit.getAccountInfo(1008).trim())) {
            LogUtil.e("R_HwTagCardManager", "user not login");
            c(139002);
        } else {
            lsy.a(new Runnable() { // from class: mby.3
                @Override // java.lang.Runnable
                public void run() {
                    boolean unused = mby.f41380a = true;
                    LogUtil.a("HwTagCardManager", "open Card");
                    int iA = new HwTagCardOperator(mby.this.f41382b).a();
                    LogUtil.a("R_HwTagCardManager", "tagCardOperator errorCode:", Integer.valueOf(iA));
                    mby.this.a(iA);
                }
            });
        }
    }
}
