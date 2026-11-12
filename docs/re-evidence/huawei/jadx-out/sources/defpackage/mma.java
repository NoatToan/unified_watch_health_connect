package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.btproxy.BtProxyNetworkChangeReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mma f41908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f41909b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mly f41910c;
    private HandlerThread d;
    private long h = 0;

    private mma() {
        LogUtil.a("HwBtProxyReceiveDataFromDevice", "new HwBtProxyReceiveDataFromDevice:");
        this.f41910c = new mly();
        HandlerThread handlerThread = new HandlerThread("HwBtProxyReceiveDataFromDevice");
        this.d = handlerThread;
        handlerThread.start();
        f41909b = new a(this.d.getLooper());
    }

    public static mma b() {
        if (f41908a == null) {
            synchronized (e) {
                LogUtil.a("HwBtProxyReceiveDataFromDevice", "getInstance()");
                if (f41908a == null) {
                    f41908a = new mma();
                }
            }
        }
        return f41908a;
    }

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            LogUtil.a("HwBtProxyReceiveDataFromDevice", "msg is ", message);
            super.handleMessage(message);
            LogUtil.a("HwBtProxyReceiveDataFromDevice", "msg.what is ", Integer.valueOf(message.what));
            if (message.what == 0) {
                boolean zAb = CommonUtil.ab(BaseApplication.getContext());
                if (zAb) {
                    LogUtil.a("HwBtProxyReceiveDataFromDevice", "netConnectStatus is available: ", Boolean.valueOf(zAb));
                    BtProxyNetworkChangeReceiver.a().e();
                    mma.f41909b.removeMessages(0);
                    return;
                } else {
                    LogUtil.j("HwBtProxyReceiveDataFromDevice", "netConnectStatus is unavailable: ", Boolean.valueOf(zAb));
                    mma.f41909b.sendEmptyMessageDelayed(0, 10000L);
                    return;
                }
            }
            LogUtil.j("HwBtProxyReceiveDataFromDevice", "do nothing.");
        }
    }

    public void c(int i, int i2) {
        this.f41910c.startProxyService(i, i2);
    }

    public void d() {
        this.f41910c.stopProxyService();
        j();
    }

    public static void c() {
        if (f41908a == null) {
            LogUtil.j("HwBtProxyReceiveDataFromDevice", "current instance is null");
        } else {
            f41908a = null;
        }
    }

    private void j() {
        HandlerThread handlerThread = this.d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.d = null;
        }
    }

    public void a(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            LogUtil.j("HwBtProxyReceiveDataFromDevice", "data illegal");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.h;
        LogUtil.a("HwBtProxyReceiveDataFromDevice", "network differTime milliseconds: ", Long.valueOf(jCurrentTimeMillis), " ,origin networkConnectStatus: ", Boolean.valueOf(CommonUtil.ab(BaseApplication.getContext())));
        if (jCurrentTimeMillis > 60000 || !CommonUtil.ab(BaseApplication.getContext())) {
            e();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.h = jCurrentTimeMillis2;
            LogUtil.a("HwBtProxyReceiveDataFromDevice", "mPowerKitLastStartupTime: ", Long.valueOf(jCurrentTimeMillis2), " NetworkConnectStatus is ", Boolean.valueOf(CommonUtil.ab(BaseApplication.getContext())));
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            BtProxyNetworkChangeReceiver.a().d();
            f41909b.sendEmptyMessageDelayed(0, 10000L);
            LogUtil.j("HwBtProxyReceiveDataFromDevice", "wearNode proxy not closed, current network is unavailable");
            return;
        }
        mlq mlqVar = new mlq();
        cpl.d("HwBtProxyReceiveDataFromDevice", bArr, "getResult(): ");
        d(bArr, mlqVar, deviceInfo);
        if (a(mlqVar)) {
            return;
        }
        mly mlyVar = this.f41910c;
        if (mlyVar == null) {
            LogUtil.j("HwBtProxyReceiveDataFromDevice", "DistributionNetworkPhoneProxy is null");
        } else {
            mlyVar.sendMessage(mlqVar);
        }
    }

    private void e() {
        PowerKitManager.a().d("HwBtProxyReceiveDataFromDevice", 512, 75000L, "user-BTProxy");
        LogUtil.a("HwBtProxyReceiveDataFromDevice", "user sleeping, apply network resource.");
    }

    private boolean a(mlq mlqVar) {
        if (mlqVar.d() == 1) {
            LogUtil.a("HwBtProxyReceiveDataFromDevice", "operateProxyService: start");
            c(mlqVar.b(), mlqVar.g());
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_OPEN_BT_PROXY_TIMES_2060059.value(), new HashMap(1), 0);
            return true;
        }
        LogUtil.a("HwBtProxyReceiveDataFromDevice", "networkIfo");
        return false;
    }

    private void d(byte[] bArr, mlq mlqVar, DeviceInfo deviceInfo) {
        try {
            List<cqi> listD = new cql().b(bArr).d();
            if (listD == null || listD.isEmpty()) {
                LogUtil.j("HwBtProxyReceiveDataFromDevice", "handleBtProxyMessage tlv error");
                return;
            }
            for (cqi cqiVar : listD) {
                e(cqiVar.c(), cqiVar.d(), mlqVar, deviceInfo);
            }
        } catch (cpy unused) {
            LogUtil.e("HwBtProxyReceiveDataFromDevice", "handleBtProxyMessage error");
        }
    }

    private void e(int i, byte[] bArr, mlq mlqVar, DeviceInfo deviceInfo) {
        LogUtil.a("HwBtProxyReceiveDataFromDevice", "handleSecondLevelMessageTlv type is ", Integer.valueOf(i), "value is ", bArr);
        if (i == 13) {
            mlqVar.e(eeq.a(bArr, -1));
            return;
        }
        if (i == 14) {
            boolean zB = BtProxyNetworkChangeReceiver.a().b();
            LogUtil.a("HwBtProxyReceiveDataFromDevice", "get isSupportBtProxy:", Boolean.valueOf(zB));
            if (zB) {
                int iA = eeq.a(bArr, -1);
                LogUtil.a("HwBtProxyReceiveDataFromDevice", "get mProxyDataMaxsize:", Integer.valueOf(iA));
                int iMax = Math.max(1, iA) * 1024;
                mlqVar.a(iMax);
                mlqVar.b(iMax);
                return;
            }
            return;
        }
        if (i != 17) {
            switch (i) {
                case 1:
                    mlqVar.g(eeq.a(bArr, -1));
                    break;
                case 2:
                    mlqVar.e(new String(bArr, StandardCharsets.UTF_8));
                    break;
                case 3:
                    mlqVar.c(new String(bArr, StandardCharsets.UTF_8));
                    break;
                case 4:
                    mlqVar.b(bArr);
                    break;
                case 5:
                    mlqVar.h(eeq.a(bArr, -1));
                    break;
                case 6:
                    mlqVar.a(bArr);
                    break;
                case 7:
                    mlqVar.d(eeq.a(bArr, -1));
                    break;
                case 8:
                    mlqVar.c(eeq.a(bArr, -1));
                    break;
                case 9:
                    mlqVar.e(bArr);
                    break;
                default:
                    LogUtil.j("HwBtProxyReceiveDataFromDevice", "default type: ", Integer.valueOf(i));
                    break;
            }
            return;
        }
        mlqVar.j(eeq.a(bArr, 0));
    }
}
