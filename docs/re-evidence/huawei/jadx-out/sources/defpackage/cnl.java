package defpackage;

import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import com.huawei.devicesdk.callback.FrameReceiver;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceDataFrameParcel;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.MemoryUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.ParserInterface;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class cnl {
    private static Map<Integer, ParserInterface> e = new HashMap(16);
    private static final cnl d = new cnl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadPoolManager f1845a = ThreadPoolManager.b(3, 10, "DataReceivedManage");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, c> f1846b = new ConcurrentHashMap(16);
    private final Queue<cmn> i = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f1847c = new ConcurrentHashMap(16);
    private int h = 0;

    private cnl() {
        e.put(52, xjb.c());
        e.put(44, xhe.d());
        e.put(40, xhj.c());
        e.put(55, xja.b());
        e.put(57, xjb.c());
    }

    public static cnl b() {
        return d;
    }

    public void e(DeviceInfo deviceInfo, cmm cmmVar, int i) {
        if (deviceInfo == null) {
            LogUtil.e("DataReceivedManage", "onDataReceived deviceInfo is null");
            return;
        }
        if (cmmVar == null) {
            LogUtil.e("DataReceivedManage", "onDataReceived frame is null");
        } else if (c(cmmVar)) {
            b(deviceInfo, cmmVar, i);
        } else {
            d(deviceInfo, cmmVar, i, false);
        }
    }

    private c e(String str) {
        StringBuilder sb = new StringBuilder("HighSpeedThread");
        int i = this.h;
        this.h = i + 1;
        sb.append(i);
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        c cVar = new c(handlerThread.getLooper());
        this.f1846b.put(str, cVar);
        LogUtil.e("DataReceivedManage", "create new HighSpeedThread");
        return cVar;
    }

    private void b(DeviceInfo deviceInfo, cmm cmmVar, int i) {
        String deviceMac = deviceInfo.getDeviceMac();
        c cVarE = this.f1846b.get(deviceMac);
        if (cVarE == null) {
            cVarE = e(deviceMac);
        }
        if (d(deviceMac) > 50) {
            cVarE.removeMessages(1);
            this.f1847c.put(deviceMac, 0);
            LogUtil.d("DataReceivedManage", "fast thread out of bounds");
        }
        Message messageObtainMessage = cVarE.obtainMessage(1);
        messageObtainMessage.obj = new Object[]{deviceInfo, cmmVar};
        messageObtainMessage.arg1 = i;
        this.f1847c.put(deviceMac, Integer.valueOf(d(deviceMac) + 1));
        if (cVarE.sendMessage(messageObtainMessage)) {
            return;
        }
        ReleaseLogUtil.b("DataReceivedManage", "high speed command send failed");
        this.f1846b.remove(deviceMac);
        cVarE.removeCallbacksAndMessages(null);
        cVarE.getLooper().quit();
        if (e(deviceMac).sendMessage(messageObtainMessage)) {
            return;
        }
        ReleaseLogUtil.b("DataReceivedManage", "Retrying high speed command send failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, cmm cmmVar, int i, boolean z) {
        if (cmmVar == null) {
            LogUtil.e("DataReceivedManage", "dataReceivedHandle dataContents is null.");
            return;
        }
        byte[] bArrD = cmmVar.d();
        if (bArrD != null && bArrD.length > 1) {
            byte b2 = bArrD[0];
            byte b3 = bArrD[1];
            if (b2 == 27 || b2 == 39) {
                ReleaseLogUtil.c("DEVMGR_DataReceivedManage", "response sid: ", Integer.valueOf(b2), " cid: ", Integer.valueOf(b3));
            }
            LogUtil.b("DataReceivedManage", "serviceId: ", Integer.valueOf(b2), ", commandId: ", Integer.valueOf(b3));
            if (cpx.a(b2, b3, deviceInfo.getDeviceMac(), "receive from device")) {
                return;
            }
            if (b(deviceInfo, i, bArrD, b2)) {
                LogUtil.b("DataReceivedManage", "specialCommandHandle enter.");
                return;
            }
        }
        for (FrameReceiver frameReceiver : cnq.b().d()) {
            if (z) {
                c(frameReceiver, deviceInfo, cmmVar, i);
            } else {
                e(frameReceiver, deviceInfo, cmmVar, i);
            }
        }
    }

    private void e(FrameReceiver frameReceiver, DeviceInfo deviceInfo, cmm cmmVar, int i) {
        cmn cmnVar = new cmn(frameReceiver, deviceInfo, cmmVar, i);
        cmnVar.d(SystemClock.elapsedRealtime(), this.i.size());
        this.i.add(cmnVar);
        ThreadPoolManager threadPoolManager = f1845a;
        if (threadPoolManager != null) {
            threadPoolManager.execute(new Runnable() { // from class: cnl.1
                @Override // java.lang.Runnable
                public void run() {
                    cmn cmnVar2 = (cmn) cnl.this.i.poll();
                    a(cmnVar2);
                    if (cmnVar2 != null) {
                        cnl.this.c(cmnVar2.c(), cmnVar2.b(), cmnVar2.e(), cmnVar2.a());
                    }
                }

                private void a(cmn cmnVar2) {
                    if (cmnVar2 == null) {
                        ReleaseLogUtil.d("DEVMGR_DataReceivedManage", "checkFrameReceivedTimeout frame == null");
                        xgx.d().setProbabilityProblemEvent("checkFrameReceivedTimeout", "frame == null");
                        return;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (jElapsedRealtime - cmnVar2.g() > 6000) {
                        final String str = "time: " + cmnVar2.g() + " -- " + jElapsedRealtime + "  size: " + cmnVar2.d() + " -- " + cnl.this.i.size();
                        ReleaseLogUtil.d("DEVMGR_DataReceivedManage", "checkFrameReceivedTimeout timeoutInfo：", str);
                        lng.c("CommandMessage", "thread pool execute long time " + a(cmnVar2.e()));
                        DfxMonitorCenter.c(new Runnable() { // from class: cnl.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    String str2 = "timeoutInfo：" + str + "  memoryInfo:" + MemoryUtils.e(false) + "  dumpMemoryInfo:" + MemoryUtils.a((Debug.MemoryInfo) null, false);
                                    lng.c("CommandMessage", str2);
                                    xgx.d().setProbabilityProblemEvent("checkFrameReceivedTimeout", str2);
                                } catch (Exception unused) {
                                    xgx.d().setProbabilityProblemEvent("checkFrameReceivedTimeout", "timeoutInfo：" + str);
                                }
                            }
                        });
                    }
                }

                private String a(cmm cmmVar2) {
                    if (cmmVar2 == null || cmmVar2.d() == null || cmmVar2.d().length < 2) {
                        return null;
                    }
                    return cph.b(cmmVar2.d(), 2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(FrameReceiver frameReceiver, DeviceInfo deviceInfo, cmm cmmVar, int i) {
        if (frameReceiver == null) {
            LogUtil.e("DataReceivedManage", "onFrameReceived receiver is null.");
            return;
        }
        try {
            UniteDevice uniteDevice = new UniteDevice();
            uniteDevice.setIdentify(deviceInfo.getDeviceMac());
            uniteDevice.setDeviceInfo(deviceInfo);
            frameReceiver.onFrameReceived(i, uniteDevice, d(cmmVar));
        } catch (RemoteException | OutOfMemoryError e2) {
            ReleaseLogUtil.c("DEVMGR_DataReceivedManage", "onFrameReceived exception, ", ExceptionUtils.c(e2), "memoryInfo is ", coy.b());
            lng.c("ConnectMessage", "onFrameReceived memoryInfo is" + coy.b());
        }
    }

    private boolean b(DeviceInfo deviceInfo, int i, byte[] bArr, int i2) {
        cmo cmoVarF = cnk.c().f(deviceInfo.getDeviceMac());
        ConnectMode connectModeB = cmoVarF == null ? null : cmoVarF.b();
        if (connectModeB != null) {
            if (connectModeB.value() == ConnectMode.SIMPLE.value()) {
                return false;
            }
        } else {
            LogUtil.e("DataReceivedManage", "getResult connectMode is null");
        }
        return e.containsKey(Integer.valueOf(i2)) && !e(e.get(Integer.valueOf(i2)), deviceInfo, bArr, i);
    }

    private boolean e(ParserInterface parserInterface, DeviceInfo deviceInfo, byte[] bArr, int i) {
        if (parserInterface == null) {
            return true;
        }
        LogUtil.b("DataReceivedManage", "the manager is ", parserInterface.getClass().getSimpleName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean result = parserInterface.getResult(deviceInfo, bArr);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 30) {
            cpl.c("DataReceivedManage", bArr, "specialCommandHandle block msg:", Long.valueOf(jCurrentTimeMillis2), ",command:");
        }
        return result;
    }

    private DeviceDataFrameParcel d(cmm cmmVar) {
        DeviceDataFrameParcel deviceDataFrameParcel = new DeviceDataFrameParcel();
        if (cmmVar == null) {
            return deviceDataFrameParcel;
        }
        deviceDataFrameParcel.setCharacteristicId(cmmVar.b());
        deviceDataFrameParcel.setData(cmmVar.d());
        return deviceDataFrameParcel;
    }

    private boolean c(cmm cmmVar) {
        byte[] bArrD = cmmVar.d();
        if (bArrD == null || bArrD.length < 1) {
            return false;
        }
        byte b2 = bArrD[0];
        return b2 == 48 || b2 == 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(String str) {
        Integer num = this.f1847c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    class c extends Handler {
        c(Looper looper) {
            super(looper);
            LogUtil.b("DataReceivedManage", "ProcessHandler start");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                return;
            }
            if (message.what != 1) {
                return;
            }
            Object[] objArr = message.obj instanceof Object[] ? (Object[]) message.obj : null;
            if (objArr == null || objArr.length < 2) {
                StringBuilder sb = new StringBuilder("Received objects failed, is null ");
                sb.append(objArr == null);
                LogUtil.e("DataReceivedManage", sb.toString());
                return;
            }
            Object obj = objArr[0];
            DeviceInfo deviceInfo = obj instanceof DeviceInfo ? (DeviceInfo) obj : null;
            Object obj2 = objArr[1];
            cmm cmmVar = obj2 instanceof cmm ? (cmm) obj2 : null;
            int i = message.arg1;
            if (deviceInfo == null) {
                LogUtil.e("DataReceivedManage", "ProcessHandler deviceInfo is null");
            } else {
                cnl.this.f1847c.put(deviceInfo.getDeviceMac(), Integer.valueOf(cnl.this.d(deviceInfo.getDeviceMac()) - 1));
                cnl.this.d(deviceInfo, cmmVar, i, true);
            }
        }
    }
}
