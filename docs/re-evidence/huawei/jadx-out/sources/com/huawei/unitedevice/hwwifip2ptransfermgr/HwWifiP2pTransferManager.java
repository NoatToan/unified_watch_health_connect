package com.huawei.unitedevice.hwwifip2ptransfermgr;

import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.p2p.P2pReceiver;
import defpackage.cju;
import defpackage.clx;
import defpackage.cod;
import defpackage.cop;
import defpackage.cpb;
import defpackage.cpc;
import defpackage.cph;
import defpackage.cpl;
import defpackage.cpm;
import defpackage.cpw;
import defpackage.cqa;
import defpackage.cqb;
import defpackage.lng;
import defpackage.xgt;
import defpackage.xgx;
import defpackage.xgz;
import defpackage.xhj;
import defpackage.xhr;
import defpackage.xhv;
import defpackage.xia;
import defpackage.xib;
import defpackage.xie;
import defpackage.xif;
import defpackage.xig;
import defpackage.xih;
import defpackage.xii;
import defpackage.xik;
import defpackage.xit;
import defpackage.xiu;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes20.dex */
public class HwWifiP2pTransferManager implements DeviceStatusChangeCallback {
    private static volatile HwWifiP2pTransferManager e;
    private Context f;
    private String j;
    private ExtendHandler m;
    private Timer r;
    private TransferBleToWifiCallback u;
    private int v;
    private xii y;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f29866a = new Object();
    private CountDownLatch i = new CountDownLatch(1);
    private CountDownLatch g = new CountDownLatch(1);
    private CountDownLatch h = null;
    private xif w = new xif();
    private boolean l = false;
    private boolean k = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29868c = 0;
    private volatile int s = 0;
    private volatile BlockingQueue<xia> n = new LinkedBlockingQueue();
    private SendCallback p = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile LinkedHashMap<Integer, xia> f29867b = new LinkedHashMap<>(16);
    private Map<Integer, List<IresponseCallback>> t = new HashMap(16);
    private P2pReceiver q = new P2pReceiver() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager.1
        @Override // com.huawei.unitedevice.p2p.P2pReceiver
        public void onReceiveMessage(DeviceInfo deviceInfo, xiu xiuVar) throws Throwable {
            xia xiaVarI = HwWifiP2pTransferManager.this.i();
            if (xiaVarI == null) {
                byte[] bArrE = HwWifiP2pTransferManager.this.e("onReceiveMessage", xiuVar);
                if (bArrE == null) {
                    return;
                }
                byte b2 = bArrE[2];
                LogUtil.b("HwWifiP2pTransferManager", "onReceiveMessage commandId is: ", Byte.valueOf(b2));
                if (b2 == 8) {
                    if (HwWifiP2pTransferManager.this.m != null) {
                        HwWifiP2pTransferManager.this.m.removeMessages(101);
                    }
                    HwWifiP2pTransferManager.this.an();
                } else if (b2 == 12) {
                    HwWifiP2pTransferManager.this.e(530003, xiuVar, deviceInfo);
                }
                LogUtil.e("HwWifiP2pTransferManager", "wifiP2pFileInfo is null.");
                return;
            }
            xia xiaVar = (xia) HwWifiP2pTransferManager.this.f29867b.get(Integer.valueOf(xiaVarI.l()));
            String identify = (xiaVar == null || xiaVar.a() == null) ? null : xiaVar.a().getIdentify();
            String deviceMac = deviceInfo != null ? deviceInfo.getDeviceMac() : null;
            LogUtil.b("HwWifiP2pTransferManager", "fileInfo macAddress:", cpl.e(identify), "uniteDevice desAddress:", deviceMac);
            if (identify == null || !identify.equals(deviceMac)) {
                LogUtil.e("HwWifiP2pTransferManager", "mac is not the same");
                HwWifiP2pTransferManager.this.e(530003, xiuVar, (DeviceInfo) null);
            } else {
                LogUtil.b("HwWifiP2pTransferManager", "fileInfo :", xiaVar);
                HwWifiP2pTransferManager.this.e(530003, xiuVar, deviceInfo);
            }
        }
    };
    private final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            if (intent == null) {
                LogUtil.e("HwWifiP2pTransferManager", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.e("HwWifiP2pTransferManager", "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            LogUtil.b("HwWifiP2pTransferManager", "mDeviceStatusReceiver onReceive action :", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                try {
                    parcelableExtra = intent.getParcelableExtra("deviceinfo");
                } catch (BadParcelableException unused) {
                    LogUtil.d("HwWifiP2pTransferManager", "fuzzy test exception, no care this.");
                    parcelableExtra = null;
                }
                com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = parcelableExtra instanceof com.huawei.health.devicemgr.business.entity.DeviceInfo ? (com.huawei.health.devicemgr.business.entity.DeviceInfo) parcelableExtra : null;
                if (deviceInfo != null) {
                    ConnectState connectState = ConnectState.getConnectState(deviceInfo.getDeviceConnectState());
                    HwWifiP2pTransferManager.this.e(connectState, deviceInfo);
                    if (connectState != null) {
                        HwWifiP2pTransferManager.this.b(connectState);
                    }
                }
            }
        }
    };

    public interface TransferBleToWifiCallback {
        void onResult(boolean z);
    }

    static class e implements SendCallback {
        private e() {
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendResult(int i) {
            LogUtil.b("HwWifiP2pTransferManager", "sendCommand errCode:", Integer.valueOf(i));
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendProgress(long j) {
            LogUtil.b("HwWifiP2pTransferManager", "count : ", Long.valueOf(j));
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onFileTransferReport(String str) {
            LogUtil.b("HwWifiP2pTransferManager", "DefaultSendCallback onFileTransferReport transferWay: ", str);
        }
    }

    private HwWifiP2pTransferManager(Context context) {
        this.f = context;
        xgt.b().a(this.f);
        xgt.b().registerDeviceStateListener(UUID.randomUUID().toString(), this);
        ae();
        af();
        this.m = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null) {
                    return false;
                }
                LogUtil.e("HwWifiP2pTransferManager", "wifi handle : ", Integer.valueOf(message.what));
                int i = message.what;
                if (i == 100) {
                    HwWifiP2pTransferManager.this.aj();
                    return true;
                }
                if (i == 101) {
                    HwWifiP2pTransferManager.this.aa();
                    return true;
                }
                if (i == 500) {
                    HwWifiP2pTransferManager.this.c();
                    return true;
                }
                LogUtil.e("HwWifiP2pTransferManager", "unknown what : ", Integer.valueOf(message.what));
                return false;
            }
        }, "HwWifiP2pTransferManager");
        LogUtil.b("HwWifiP2pTransferManager", "HwWifiP2pTransferMgr create.");
    }

    @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
    public void onConnectStatusChanged(DeviceInfo deviceInfo, int i, int i2) {
        LogUtil.b("HwWifiP2pTransferManager", "onConnectStatusChanged: ", Integer.valueOf(i));
    }

    private void af() {
        LogUtil.b("HwWifiP2pTransferManager", "enter registerBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.b(), this.o, intentFilter, clx.e, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        lng.c("WifiP2PTransfer", "Device replies 5.54.x reach timeout.");
        b(1016, "5.54.x timeout.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        CountDownLatch countDownLatch = this.i;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.i = null;
        }
        CountDownLatch countDownLatch2 = this.h;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
            this.h = null;
        }
    }

    public void x() {
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(100, 20000L);
        }
    }

    public void q() {
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.removeMessages(100);
        }
    }

    public static HwWifiP2pTransferManager a() {
        HwWifiP2pTransferManager hwWifiP2pTransferManager;
        synchronized (d) {
            if (e == null) {
                e = new HwWifiP2pTransferManager(BaseApplication.b());
            }
            hwWifiP2pTransferManager = e;
        }
        return hwWifiP2pTransferManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] e(String str, xiu xiuVar) {
        if (xiuVar == null) {
            LogUtil.e("HwWifiP2pTransferManager", str, "P2pMessage is null");
            return null;
        }
        byte[] bArrB = xiuVar.b();
        if (bArrB == null || bArrB.length <= 1) {
            LogUtil.d("HwWifiP2pTransferManager", str, "P2pMessage dataInfo illegal");
            return null;
        }
        if (bArrB.length <= 2) {
            LogUtil.b("HwWifiP2pTransferManager", "can not get commandId");
            return null;
        }
        cpl.d("HwWifiP2pTransferManager", bArrB, str, "P2pMsg_dataInfos is: ");
        return bArrB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, xiu xiuVar, DeviceInfo deviceInfo) throws Throwable {
        LogUtil.b("HwWifiP2pTransferManager", "onReceiveDeviceCommand errorCode ", Integer.valueOf(i));
        byte[] bArrE = e("onReceiveDeviceCommand", xiuVar);
        if (bArrE == null) {
            return;
        }
        byte b2 = bArrE[2];
        LogUtil.b("HwWifiP2pTransferManager", "onReceiveDeviceCommand commandId is: ", Byte.valueOf(b2));
        if (a(b2, bArrE)) {
            return;
        }
        switch (b2) {
            case 1:
            case 3:
                xie.c(bArrE);
                break;
            case 2:
                xie.a(bArrE);
                break;
            case 4:
                xie.d(bArrE);
                break;
            case 5:
                xie.b(bArrE);
                break;
            case 6:
                e(bArrE);
                break;
            case 7:
                e(bArrE, i());
                break;
            case 8:
                an();
                break;
            case 9:
                c(bArrE, deviceInfo);
                break;
            case 10:
                xie.e(bArrE);
                break;
            case 11:
            default:
                LogUtil.e("HwWifiP2pTransferManager", "unknown id : ", Byte.valueOf(b2));
                break;
            case 12:
                xie.a(bArrE, deviceInfo);
                break;
        }
    }

    private boolean a(byte b2, byte[] bArr) {
        List<IresponseCallback> list;
        if (this.t.isEmpty() || (list = this.t.get(Integer.valueOf(b2))) == null || list.isEmpty()) {
            return false;
        }
        LogUtil.b("HwWifiP2pTransferManager", "adapterReturn : ", Byte.valueOf(b2));
        list.remove(0).onResponse(bArr);
        return true;
    }

    private String ah() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    private String ai() {
        return "in.huawei.AppWifi";
    }

    private WearEngineModule ac() {
        return WearEngineModule.WIFIP2P_TRANSFER_MODULE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ConnectState connectState) {
        LogUtil.b("HwWifiP2pTransferManager", "onDeviceConnectionChange connectState : ", connectState);
    }

    public void e(xiu xiuVar) {
        c(xiuVar, this.p);
    }

    public byte[] b(xiu xiuVar, final int i) {
        final byte[][] bArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        List<IresponseCallback> linkedList = this.t.get(Integer.valueOf(i));
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.t.put(Integer.valueOf(i), linkedList);
        }
        linkedList.add(new IresponseCallback() { // from class: xid
            @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.IresponseCallback
            public final void onResponse(Object obj) {
                this.d.b(bArr, i, countDownLatch, obj);
            }
        });
        c(xiuVar, this.p);
        try {
            LogUtil.b("HwWifiP2pTransferManager", "await : ", Boolean.valueOf(countDownLatch.await(20000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e2) {
            LogUtil.b("HwWifiP2pTransferManager", "send message time out : ", Integer.valueOf(i), " exception : ", ExceptionUtils.c(e2));
            countDownLatch.countDown();
        }
        return bArr[0];
    }

    public /* synthetic */ void b(byte[][] bArr, int i, CountDownLatch countDownLatch, Object obj) {
        if (obj instanceof byte[]) {
            bArr[0] = (byte[]) obj;
        }
        List<IresponseCallback> list = this.t.get(Integer.valueOf(i));
        if (list == null || list.size() <= 0) {
            LogUtil.b("HwWifiP2pTransferManager", "no callback remove, please check : ", Integer.valueOf(i));
        } else {
            list.remove(0);
        }
        LogUtil.b("HwWifiP2pTransferManager", "response success, countDown");
        countDownLatch.countDown();
    }

    public int b() {
        LogUtil.b("HwWifiP2pTransferManager", "createServerSocket");
        xii xiiVarD = xii.d();
        this.y = xiiVarD;
        return xiiVarD.b();
    }

    public void e() {
        xii xiiVar = this.y;
        if (xiiVar != null) {
            xiiVar.c();
        } else {
            LogUtil.d("HwWifiP2pTransferManager", "mServerSocket is null. please check.");
        }
    }

    public void v() {
        this.i = new CountDownLatch(1);
        this.g = new CountDownLatch(1);
    }

    public boolean p() {
        try {
            CountDownLatch countDownLatch = this.i;
            if (countDownLatch != null && !countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                LogUtil.d("HwWifiP2pTransferManager", "getWifiP2pIsEnable is timeout");
                xib.b(BaseApplication.b()).a();
                return false;
            }
        } catch (InterruptedException e2) {
            LogUtil.d("HwWifiP2pTransferManager", "getWifiP2pIsEnable InterruptedException : ", cpc.c(e2));
        }
        LogUtil.b("HwWifiP2pTransferManager", "getWifiP2pIsEnable mIsReady is: ", Boolean.valueOf(this.l));
        return this.l;
    }

    public void c(boolean z) {
        LogUtil.b("HwWifiP2pTransferManager", "setWifiP2pIsEnable isEnable: ", Boolean.valueOf(z));
        this.l = z;
        CountDownLatch countDownLatch = this.i;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void al() {
        LogUtil.b("HwWifiP2pTransferManager", "startWifiP2pGo");
        z();
        xib xibVarB = xib.b(this.f);
        xibVarB.c();
        xibVarB.b();
    }

    private void z() {
        if (cop.f()) {
            Timer timer = this.r;
            if (timer != null) {
                timer.cancel();
                ao();
            }
            Timer timer2 = new Timer("wifi_p2p");
            timer2.schedule(new TimerTask() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager.4
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (TransferFileQueueManager.b().d("powerKit_check").size() == 0) {
                        HwWifiP2pTransferManager.this.ao();
                    } else {
                        cpw.b("wifi-p2p-send-file", 512, "user-wifip2p");
                        cpw.c("wifi-p2p-send-file", 512, 600000L, "user-wifip2p");
                    }
                }
            }, 540000L, 540000L);
            this.r = timer2;
            cpw.c("wifi-p2p-send-file", 512, 600000L, "user-wifip2p");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        if (cop.f()) {
            Timer timer = this.r;
            if (timer != null) {
                LogUtil.b("HwWifiP2pTransferManager", "unApplyPowerKit");
                timer.cancel();
                this.r = null;
            }
            cpw.b("wifi-p2p-send-file", 512, "user-wifip2p");
        }
    }

    public void b(String str) {
        this.w.b(str);
    }

    public void d(int i) {
        this.w.b(i);
    }

    public void e(String str) {
        LogUtil.b("HwWifiP2pTransferManager", "setWifiP2pPassPhrase");
        this.w.c(str);
    }

    public void a(String str) {
        LogUtil.b("HwWifiP2pTransferManager", "setWifiP2pServerSocketIp serverSocketIp is: ", str);
        this.w.d(str);
        CountDownLatch countDownLatch = this.g;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public xif n() {
        try {
            CountDownLatch countDownLatch = this.g;
            if (countDownLatch != null) {
                LogUtil.b("HwWifiP2pTransferManager", "isWaitSuccess : ", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
            }
        } catch (InterruptedException e2) {
            LogUtil.d("HwWifiP2pTransferManager", "getWifiP2pIsEnable InterruptedException : ", cpc.c(e2));
        }
        return this.w;
    }

    public TransferBleToWifiCallback f() {
        return this.u;
    }

    public void b(TransferBleToWifiCallback transferBleToWifiCallback) {
        LogUtil.b("HwWifiP2pTransferManager", "setTransferBleToWifiCallback enter.");
        this.u = transferBleToWifiCallback;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    public boolean d(String str, TransferBleToWifiCallback transferBleToWifiCallback) {
        boolean z;
        this.u = transferBleToWifiCallback;
        String strE = e(true, str);
        xia xiaVarI = i();
        if (xiaVarI != null) {
            int iL = xiaVarI.l();
            boolean zA = cop.a(cph.d(strE), 31);
            if (iL == -1 && zA) {
                LogUtil.b("HwWifiP2pTransferManager", "test isSkipQueryCapability set true");
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!c(strE, 76) || z) {
            LogUtil.b("HwWifiP2pTransferManager", "startWifiP2pToTransfer startWifiP2pGo");
            al();
            f(str);
            if (p()) {
                xie.e(this.w);
                return true;
            }
            a().q();
            a().b(1029, "normal watch create wifi go error");
            return true;
        }
        xia xiaVarI2 = i();
        LogUtil.b("HwWifiP2pTransferManager", "startWifiP2pToTransfer isSupportExpandCapability true");
        if (xiaVarI2 == null) {
            return false;
        }
        this.v = xiaVarI2.l();
        xie.d(xiaVarI2);
        return true;
    }

    private void f(String str) {
        Collection<UniteDevice> collectionValues = xgt.b().getDeviceList().values();
        if (collectionValues.isEmpty()) {
            LogUtil.e("HwWifiP2pTransferManager", "try get device wrong, please check.");
            return;
        }
        LogUtil.b("HwWifiP2pTransferManager", "values size : ", Integer.valueOf(collectionValues.size()));
        Iterator<UniteDevice> it = collectionValues.iterator();
        while (it.hasNext() && !d(str, it.next().getDeviceInfo())) {
        }
    }

    private boolean d(String str, DeviceInfo deviceInfo) {
        if (str != null) {
            if (!str.equals(deviceInfo.getDeviceMac()) || !deviceInfo.isUsing() || deviceInfo.getDeviceConnectState() != 2 || cod.a(deviceInfo.getDeviceType())) {
                return false;
            }
            String deviceMac = deviceInfo.getDeviceMac();
            this.j = deviceMac;
            LogUtil.c("HwWifiP2pTransferManager", "macAddress is not null:", cpl.e(deviceMac));
            return true;
        }
        if (!deviceInfo.isUsing() || deviceInfo.getDeviceConnectState() != 2 || cod.a(deviceInfo.getDeviceType())) {
            return false;
        }
        String deviceMac2 = deviceInfo.getDeviceMac();
        this.j = deviceMac2;
        LogUtil.c("HwWifiP2pTransferManager", "mCurrentAddress:", cpl.e(deviceMac2));
        return true;
    }

    public boolean c(int i, UniteDevice uniteDevice) {
        LogUtil.b("HwWifiP2pTransferManager", "Build.VERSION.SDK_INT：", Integer.valueOf(Build.VERSION.SDK_INT));
        if (Build.VERSION.SDK_INT >= 29) {
            String identify = uniteDevice != null ? uniteDevice.getIdentify() : null;
            boolean zD = d(i, e(false, identify));
            boolean zC = c(e(true, identify), 76);
            LogUtil.b("HwWifiP2pTransferManager", "macAddress:", cpl.e(identify), "isSupportCapability : ", Boolean.valueOf(zD), " isSupportExpandCapability:", Boolean.valueOf(zC));
            return zD || zC;
        }
        lng.c("WifiP2PTransfer", "Android version too low, not support wifip2p file transfer.");
        return false;
    }

    public boolean e(xia xiaVar) {
        if (xiaVar == null) {
            return false;
        }
        UniteDevice uniteDeviceA = xiaVar.a();
        return c(e(true, uniteDeviceA != null ? uniteDeviceA.getIdentify() : null), 76);
    }

    public String e(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Collection<UniteDevice> collectionValues = cju.d().getDeviceList().values();
        if (collectionValues.isEmpty()) {
            LogUtil.b("HwWifiP2pTransferManager", "try get device wrong, please check.");
            return "";
        }
        LogUtil.b("HwWifiP2pTransferManager", "values size : ", Integer.valueOf(collectionValues.size()));
        Iterator<UniteDevice> it = collectionValues.iterator();
        String strB = null;
        while (it.hasNext()) {
            strB = b(str, it.next(), z);
            if (!TextUtils.isEmpty(strB)) {
                break;
            }
        }
        return strB;
    }

    private String b(String str, UniteDevice uniteDevice, boolean z) {
        if (uniteDevice == null) {
            return null;
        }
        DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
        if (str != null) {
            if (!str.equals(deviceInfo.getDeviceMac()) || !deviceInfo.isUsing() || deviceInfo.getDeviceConnectState() != 2 || cod.a(deviceInfo.getDeviceType())) {
                return null;
            }
            String strC = c(z, uniteDevice);
            LogUtil.b("HwWifiP2pTransferManager", "muti device isSupportWifiFile:", strC, "isExpandCapability:", Boolean.valueOf(z));
            return strC;
        }
        if (!deviceInfo.isUsing() || deviceInfo.getDeviceConnectState() != 2 || cod.a(deviceInfo.getDeviceType())) {
            return null;
        }
        String strC2 = c(z, uniteDevice);
        LogUtil.b("HwWifiP2pTransferManager", "isSupportWifiFile:", strC2, "isExpandCapability:", Boolean.valueOf(z));
        return strC2;
    }

    private String c(boolean z, UniteDevice uniteDevice) {
        if (z) {
            return a(uniteDevice);
        }
        return uniteDevice.getCapability().getCapacity();
    }

    private String a(UniteDevice uniteDevice) {
        ExternalDeviceCapability capability = uniteDevice.getCapability();
        if (capability != null) {
            return capability.getCapacity();
        }
        return null;
    }

    private boolean c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HwWifiP2pTransferManager", "checkSupportCapability deviceInfo is null");
            return false;
        }
        boolean zD = cpb.d(cph.d(str), i);
        LogUtil.b("HwWifiP2pTransferManager", "checkSupportCapability isSupport:", Boolean.valueOf(zD));
        return zD;
    }

    private boolean d(int i, String str) {
        LogUtil.b("HwWifiP2pTransferManager", "file type : ", Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<Integer, Integer> mapA = xih.a();
        LogUtil.b("HwWifiP2pTransferManager", "trustList.size() : ", Integer.valueOf(mapA.size()));
        Integer num = mapA.get(Integer.valueOf(i));
        if (num == null) {
            return false;
        }
        return cpb.d(cph.d(str), num.intValue());
    }

    public void c(com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.b("HwWifiP2pTransferManager", "deviceIdentify : ", cpl.e(deviceIdentify), "mCurrentAddress : ", cpl.e(this.j));
        if (!TextUtils.equals(deviceIdentify, this.j)) {
            LogUtil.e("HwWifiP2pTransferManager", "not current device disconnect.");
        } else if (deviceInfo.getDeviceConnectState() != 3) {
            LogUtil.b("HwWifiP2pTransferManager", "normal state, not deal.");
        } else {
            c();
            b(1021, "device disconnect. may user close bt switch.");
        }
    }

    public void c(xhr xhrVar, WifiP2pTransferListener wifiP2pTransferListener, int i) {
        LogUtil.b("HwWifiP2pTransferManager", "setCurrentFileInfo");
        r();
        if (xhrVar == null) {
            return;
        }
        xia xiaVarE = e(xhrVar, wifiP2pTransferListener, i);
        synchronized (f29866a) {
            this.f29867b.put(Integer.valueOf(xhrVar.y()), xiaVarE);
            LogUtil.b("HwWifiP2pTransferManager", "cache size : ", Integer.valueOf(this.f29867b.size()));
        }
    }

    public xia e(xhr xhrVar, WifiP2pTransferListener wifiP2pTransferListener, int i) {
        xia xiaVar = new xia();
        if (xhrVar == null) {
            LogUtil.e("HwWifiP2pTransferManager", "createWifiTask param is null.");
            return xiaVar;
        }
        xiaVar.f(xhrVar.t());
        xiaVar.b(xhrVar.n());
        xiaVar.d(xhrVar.u());
        xiaVar.e(xhrVar.y());
        xiaVar.a(xhrVar.aq());
        xiaVar.d(xhrVar.z());
        xiaVar.g(xhrVar.ah());
        xiaVar.b(xhrVar.w());
        xiaVar.f(xhrVar.as());
        xiaVar.a(xhrVar.au());
        LogUtil.b("HwWifiP2pTransferManager", "mCheckModel value:", Integer.valueOf(this.f29868c));
        if (xhrVar.h() != null) {
            LogUtil.b("HwWifiP2pTransferManager", "currentFileInfo.getDevice() is not null");
            xiaVar.e(xhrVar.h());
        }
        if (this.f29868c == 3) {
            xiaVar.d(xhrVar.ah());
        } else {
            xiaVar.d(a(xhrVar.z(), xhrVar.t(), xhrVar.aq()));
        }
        xiaVar.e(wifiP2pTransferListener);
        xiaVar.c(i);
        xiaVar.a(xhrVar.j());
        xiaVar.i(xhrVar.ag());
        xiaVar.e(xhrVar.i());
        xiaVar.h(xhrVar.ai());
        xiaVar.c(xhrVar.g());
        return xiaVar;
    }

    public boolean b(int i) {
        xia xiaVarRemove;
        synchronized (f29866a) {
            xiaVarRemove = this.f29867b.remove(Integer.valueOf(i));
        }
        LogUtil.b("HwWifiP2pTransferManager", "remove : ", Boolean.valueOf(xiaVarRemove == null));
        return xiaVarRemove != null;
    }

    public void b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.b("HwWifiP2pTransferManager", "onFailToLister code : ", Integer.valueOf(i), " msg : ", str);
        TransferBleToWifiCallback transferBleToWifiCallbackF = a().f();
        if (transferBleToWifiCallbackF != null) {
            LogUtil.b("HwWifiP2pTransferManager", "callback is not null. try switch wifi fail");
            transferBleToWifiCallbackF.onResult(false);
            new Timer("cancel null").schedule(new TimerTask() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    HwWifiP2pTransferManager.a().b((TransferBleToWifiCallback) null);
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            e(i, str);
            a(i, str);
        }
    }

    private void e(int i, String str) {
        xia xiaVarI = i();
        if (xiaVarI == null) {
            LogUtil.e("HwWifiP2pTransferManager", "fileInfo is null, please check add and remove.");
            return;
        }
        WifiP2pTransferListener wifiP2pTransferListenerN = xiaVarI.n();
        if (wifiP2pTransferListenerN == null) {
            LogUtil.e("HwWifiP2pTransferManager", "lister is null. please check.");
        } else {
            wifiP2pTransferListenerN.onFail(i, str, xiaVarI.l());
        }
        b(xiaVarI.l());
    }

    private void a(int i, String str) {
        if (i == 1021) {
            LogUtil.b("HwWifiP2pTransferManager", "bluetooth close, report all task.");
            while (i() != null) {
                e(i, str);
            }
        }
    }

    public void e(int i, String str, int i2) {
        xia xiaVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.b("HwWifiP2pTransferManager", "onFailToLister code : ", Integer.valueOf(i), " msg : ", str, "fileType : ", Integer.valueOf(i2));
        synchronized (f29866a) {
            xiaVar = this.f29867b.get(Integer.valueOf(i2));
        }
        if (xiaVar != null) {
            WifiP2pTransferListener wifiP2pTransferListenerN = xiaVar.n();
            if (wifiP2pTransferListenerN != null) {
                wifiP2pTransferListenerN.onFail(i, str, xiaVar.l());
                b(xiaVar.l());
                return;
            } else {
                LogUtil.e("HwWifiP2pTransferManager", "lister is null. please check.");
                return;
            }
        }
        LogUtil.e("HwWifiP2pTransferManager", "fileInfo is null, please check add and remove ", Integer.valueOf(i2));
    }

    public xia i() {
        xia value;
        synchronized (f29866a) {
            value = this.f29867b.isEmpty() ? null : this.f29867b.entrySet().iterator().next().getValue();
        }
        return value;
    }

    public void c(String str) {
        LogUtil.b("HwWifiP2pTransferManager", "clearFileInfo enter : ", str);
        synchronized (f29866a) {
            this.f29867b.clear();
        }
    }

    public boolean c(int i) {
        synchronized (f29866a) {
            return (this.f29867b == null || this.f29867b.get(Integer.valueOf(i)) == null) ? false : true;
        }
    }

    public xia j() {
        synchronized (f29866a) {
            xia value = null;
            if (this.f29867b.isEmpty()) {
                return null;
            }
            Iterator<Map.Entry<Integer, xia>> it = this.f29867b.entrySet().iterator();
            Map.Entry<Integer, xia> next = null;
            while (it.hasNext()) {
                next = it.next();
            }
            if (next != null) {
                value = next.getValue();
            }
            return value;
        }
    }

    public void y() {
        w();
    }

    public boolean o() {
        Object systemService = this.f.getApplicationContext().getSystemService("wifi");
        if (systemService instanceof WifiManager) {
            WifiManager wifiManager = (WifiManager) systemService;
            LogUtil.b("HwWifiP2pTransferManager", "isWifiEnable", Boolean.valueOf(wifiManager.isWifiEnabled()));
            return wifiManager.isWifiEnabled();
        }
        LogUtil.d("HwWifiP2pTransferManager", "isWifiEnable wifiManager is null");
        return false;
    }

    public int d(String str) {
        if (j(xgx.d().getSwitchSetting(str, "auto_open_wlan_status"))) {
            return am();
        }
        return o() ? 4 : 1;
    }

    private boolean j(String str) {
        return cop.b() && !o() && "1".equals(str) && !k();
    }

    public int d(xhr xhrVar) {
        if (xhrVar == null) {
            return 0;
        }
        boolean zE = e(xhrVar);
        if (j(xgx.d().getSwitchSetting(xhrVar.h().getIdentify(), "auto_open_wlan_status")) && zE) {
            return am();
        }
        return o() ? 4 : 1;
    }

    private static boolean e(xhr xhrVar) {
        return "com.huawei.hms.dupdateengine".equals(xhrVar.ab()) && "6AA7E4A7995987A357D744C3A9E90FD0C990DA3295304CA985B8D7D2F7AD158D".equals(xhrVar.g());
    }

    private int am() {
        cpw.e("power_kit_open_wifi_module", 512, "user-ota-trans");
        as();
        Object systemService = this.f.getApplicationContext().getSystemService("wifi");
        if (systemService instanceof WifiManager) {
            WifiManager wifiManager = (WifiManager) systemService;
            if (wifiManager.isWifiEnabled()) {
                LogUtil.b("HwWifiP2pTransferManager", "powerKit open wifi success.");
                return 5;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > SharedPreferenceManager.d("transfer_file_module_id", "last_open_wifi_time", 0L) + Constants.ANALYSIS_EVENT_KEEP_TIME) {
                LogUtil.b("HwWifiP2pTransferManager", "try open wifi at:", Long.valueOf(jCurrentTimeMillis));
                SharedPreferenceManager.c("transfer_file_module_id", "last_open_wifi_time", jCurrentTimeMillis);
                wifiManager.setWifiEnabled(true);
                as();
            }
            if (wifiManager.isWifiEnabled()) {
                return 6;
            }
            cpw.b("power_kit_open_wifi_module", 512, "user-ota-trans");
            return 3;
        }
        LogUtil.d("HwWifiP2pTransferManager", "isWifiEnable wifiManager is null");
        cpw.b("power_kit_open_wifi_module", 512, "user-ota-trans");
        return 2;
    }

    private void as() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e2) {
            LogUtil.d("HwWifiP2pTransferManager", "wait fail : ", ExceptionUtils.c(e2));
        }
    }

    public boolean k() {
        try {
            Object systemService = BaseApplication.b().getSystemService("wifi");
            if (systemService instanceof WifiManager) {
                WifiManager wifiManager = (WifiManager) systemService;
                int iIntValue = ((Integer) wifiManager.getClass().getDeclaredMethod("getWifiApState", new Class[0]).invoke(wifiManager, new Object[0])).intValue();
                int iIntValue2 = ((Integer) wifiManager.getClass().getDeclaredField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
                LogUtil.b("HwWifiP2pTransferManager", "isHotSpotOpen : ", Boolean.valueOf(iIntValue == iIntValue2));
                if (iIntValue == iIntValue2) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            LogUtil.d("HwWifiP2pTransferManager", ExceptionUtils.c(e2));
            return false;
        }
    }

    public void e(boolean z) {
        LogUtil.b("HwWifiP2pTransferManager", "setWifiP2pIsConnected: ", Boolean.valueOf(z));
        this.k = z;
    }

    public boolean l() {
        LogUtil.b("HwWifiP2pTransferManager", "getWifiP2pIsConnected: ", Boolean.valueOf(this.k));
        CountDownLatch countDownLatch = this.h;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(ProfileExtendConstants.TIME_OUT, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                LogUtil.d("HwWifiP2pTransferManager", "getWifiP2pIsConnected exception : ", cpc.c(e2));
            }
        }
        return this.k;
    }

    public int m() {
        LogUtil.b("HwWifiP2pTransferManager", "isRunning: ", Integer.valueOf(this.s));
        return this.s;
    }

    public void w() {
        this.s = 2;
    }

    private void ak() {
        this.s = 5;
    }

    public void s() {
        this.s = 1;
        c();
    }

    public boolean g() {
        CountDownLatch countDownLatch = this.h;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(ProfileExtendConstants.TIME_OUT, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                LogUtil.d("HwWifiP2pTransferManager", "getSocketIsAvailable exception : ", cpc.c(e2));
            }
        }
        xii xiiVar = this.y;
        if (xiiVar == null) {
            LogUtil.d("HwWifiP2pTransferManager", "getSocketIsAvailable wifiP2pTransferServerSocket is null");
            return false;
        }
        Socket socketE = xiiVar.e();
        if (socketE == null) {
            LogUtil.d("HwWifiP2pTransferManager", "getSocketIsAvailable acceptedSocket is null");
            return false;
        }
        if (socketE.isConnected() && !socketE.isClosed()) {
            LogUtil.d("HwWifiP2pTransferManager", "socket is available");
            return true;
        }
        LogUtil.b("HwWifiP2pTransferManager", "socket is closed");
        return false;
    }

    public Context d() {
        return this.f;
    }

    private String a(ParcelFileDescriptor parcelFileDescriptor, String str, long j) throws Throwable {
        FileInputStream fileInputStreamC;
        CRC32 crc32 = new CRC32();
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            try {
                fileInputStreamC = c(parcelFileDescriptor, str, j);
                try {
                    if (fileInputStreamC == null) {
                        LogUtil.d("HwWifiP2pTransferManager", "getFileCrc fileInputStream is null");
                        LogUtil.b("HwWifiP2pTransferManager", "getFileCrc close stream");
                        cpm.d(fileInputStreamC);
                        return null;
                    }
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStreamC.read(bArr);
                        if (i == -1) {
                            String hexString = Long.toHexString(crc32.getValue());
                            LogUtil.b("HwWifiP2pTransferManager", "getFileCrc close stream");
                            cpm.d(fileInputStreamC);
                            return hexString;
                        }
                        crc32.update(bArr, 0, i);
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    LogUtil.d("HwWifiP2pTransferManager", "getFileCrc FileNotFoundException: ", cpc.c(e));
                    LogUtil.b("HwWifiP2pTransferManager", "getFileCrc close stream");
                    cpm.d(fileInputStreamC);
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    LogUtil.d("HwWifiP2pTransferManager", "getFileCrc IOException: ", cpc.c(e));
                    LogUtil.b("HwWifiP2pTransferManager", "getFileCrc close stream");
                    cpm.d(fileInputStreamC);
                    return null;
                }
            } catch (Throwable th) {
                parcelFileDescriptor2 = parcelFileDescriptor;
                th = th;
                LogUtil.b("HwWifiP2pTransferManager", "getFileCrc close stream");
                cpm.d(parcelFileDescriptor2);
                throw th;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            fileInputStreamC = null;
        } catch (IOException e5) {
            e = e5;
            fileInputStreamC = null;
        } catch (Throwable th2) {
            th = th2;
            LogUtil.b("HwWifiP2pTransferManager", "getFileCrc close stream");
            cpm.d(parcelFileDescriptor2);
            throw th;
        }
    }

    public FileInputStream c(ParcelFileDescriptor parcelFileDescriptor, String str, long j) {
        if (parcelFileDescriptor != null) {
            LogUtil.e("HwWifiP2pTransferManager", "FileInputStream by ParcelFileDescriptor");
            return new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        }
        LogUtil.e("HwWifiP2pTransferManager", "getFileInputStreamByUriId");
        return d(str, j);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.os.ParcelFileDescriptor] */
    private FileInputStream d(String str, long j) throws Throwable {
        Throwable th;
        FileNotFoundException e2;
        ?? OpenFileDescriptor;
        ?? r2;
        FileInputStream fileInputStream;
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        FileInputStream fileInputStream2 = null;
        r3 = 0;
        if (!xhv.d(str)) {
            LogUtil.e("HwWifiP2pTransferManager", "getFileInputStreamByUriId checkFilepath error");
            return null;
        }
        try {
            if (j == -1) {
                String strE = cpb.e(str);
                fileInputStream = strE != null ? new FileInputStream(strE) : null;
            } else {
                Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
                InputStream inputStreamOpenInputStream = this.f.getContentResolver().openInputStream(uriWithAppendedId);
                if (inputStreamOpenInputStream instanceof FileInputStream) {
                    LogUtil.d("HwWifiP2pTransferManager", "transform type success ");
                    fileInputStream = (FileInputStream) inputStreamOpenInputStream;
                } else {
                    LogUtil.d("HwWifiP2pTransferManager", "transform type fail ");
                    OpenFileDescriptor = this.f.getContentResolver().openFileDescriptor(uriWithAppendedId, "r");
                    if (OpenFileDescriptor != 0) {
                        try {
                            try {
                                fileInputStream2 = new FileInputStream(OpenFileDescriptor.getFileDescriptor());
                            } catch (FileNotFoundException e3) {
                                e2 = e3;
                                LogUtil.d("HwWifiP2pTransferManager", "getFileInputStreamByUriId FileNotFoundException: ", cpc.c(e2));
                                if (OpenFileDescriptor == 0) {
                                    return r3;
                                }
                                try {
                                    OpenFileDescriptor.close();
                                    return r3;
                                } catch (IOException unused) {
                                    LogUtil.d("HwWifiP2pTransferManager", "getFileInputStreamByUriId IOException.");
                                    return r3;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = OpenFileDescriptor;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                } catch (IOException unused2) {
                                    LogUtil.d("HwWifiP2pTransferManager", "getFileInputStreamByUriId IOException.");
                                }
                            }
                            throw th;
                        }
                    }
                    fileInputStream = fileInputStream2;
                    r3 = OpenFileDescriptor;
                }
            }
            if (r3 != 0) {
                try {
                    r3.close();
                } catch (IOException unused3) {
                    LogUtil.d("HwWifiP2pTransferManager", "getFileInputStreamByUriId IOException.");
                }
            }
            return fileInputStream;
        } catch (FileNotFoundException e4) {
            e2 = e4;
            OpenFileDescriptor = r3;
        } catch (Throwable th3) {
            th = th3;
            r2 = r3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    public void a(xia xiaVar) {
        if (xiaVar == null || xiaVar.n() == null) {
            LogUtil.e("HwWifiP2pTransferManager", "startSendDataByWifi params is wrong. please check.");
            return;
        }
        if (this.s == 1) {
            LogUtil.b("HwWifiP2pTransferManager", "startSendDataByWifi wait file, task is running. add file : ", xiaVar, "file path : ", xiaVar.f(), " tag : ", Integer.valueOf(xiaVar.w()));
            this.n.add(xiaVar);
            return;
        }
        this.n.clear();
        this.s = 1;
        LogUtil.b("HwWifiP2pTransferManager", "startSendDataByWifi wait file. add file : ", xiaVar, "file path : ", xiaVar.f(), " tag : ", Integer.valueOf(xiaVar.w()));
        this.n.add(xiaVar);
        new xig().start();
    }

    public BlockingQueue<xia> h() {
        return this.n;
    }

    public void u() {
        if (this.s != 0) {
            xia xiaVar = new xia();
            xiaVar.h(1);
            LogUtil.e("HwWifiP2pTransferManager", "add stop task : ", xiaVar);
            this.n.clear();
            this.n.add(xiaVar);
        } else {
            LogUtil.e("HwWifiP2pTransferManager", "wifi task not start.");
        }
        this.s = 0;
    }

    public void c() {
        LogUtil.e("HwWifiP2pTransferManager", "close wifi enter.");
        ao();
        this.h = new CountDownLatch(1);
        this.t.clear();
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(101, 20000L);
        }
        this.u = null;
        this.f29868c = 0;
        this.s = 3;
        xii.d().a();
        xib.b(this.f).d();
        u();
        xie.b(1);
    }

    private void e(byte[] bArr, xia xiaVar) throws Throwable {
        if (xiaVar == null) {
            LogUtil.e("HwWifiP2pTransferManager", "notifySuccess file info is null,please check.");
            return;
        }
        WifiP2pTransferListener wifiP2pTransferListenerN = xiaVar.n();
        if (wifiP2pTransferListenerN == null) {
            LogUtil.e("HwWifiP2pTransferManager", "notifySuccess callback is null, pelaes check.");
            return;
        }
        if (bArr == null) {
            LogUtil.d("HwWifiP2pTransferManager", "notifySuccess param is null");
            wifiP2pTransferListenerN.onFail(1026, "5.44.7 data is null", xiaVar.l());
            return;
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        int iA = -1;
        int iA2 = 0;
        for (cqa cqaVar : cqbVarA.b()) {
            int iA3 = cpb.a(cqaVar.b());
            if (iA3 == 1) {
                iA2 = cpb.a(cqaVar.c());
            } else if (iA3 != 127) {
                LogUtil.e("HwWifiP2pTransferManager", "unknown tag : ", Integer.valueOf(cpb.a(cqaVar.b())));
            } else {
                iA = cpb.a(cqaVar.c());
            }
        }
        b(xiaVar, wifiP2pTransferListenerN, iA, iA2);
    }

    private void b(xia xiaVar, WifiP2pTransferListener wifiP2pTransferListener, int i, int i2) throws Throwable {
        LogUtil.b("HwWifiP2pTransferManager", "5.54.7 code : ", Integer.valueOf(i), " file id : ", Integer.valueOf(i2));
        LogUtil.b("HwWifiP2pTransferManager", "fileCrc : " + xiaVar.d() + " resultCrc : " + a().a(xiaVar.q(), xiaVar.f(), xiaVar.v()));
        xhj.c().a();
        if (d(xiaVar)) {
            return;
        }
        ar();
        if (i == 100000) {
            wifiP2pTransferListener.onSuccess(1, "5.54.7 success.", xiaVar.l());
        } else if (i == 140008) {
            ag();
            wifiP2pTransferListener.onSuccess(140008, "5.54.7 success.", xiaVar.l());
        } else {
            wifiP2pTransferListener.onFail(140010, "5.54.7 translate fail. change bt", xiaVar.l());
        }
    }

    private boolean d(xia xiaVar) {
        xhr xhrVarB = TransferFileQueueManager.b().b("100%wifiSendCancel");
        if (xhrVarB == null || xhrVarB.b() == null || xhrVarB.y() != xiaVar.l()) {
            LogUtil.b("HwWifiP2pTransferManager", "no cancel callback");
            return false;
        }
        LogUtil.b("HwWifiP2pTransferManager", "100% wifi send cancel enter.");
        xiaVar.n().onFail(1014, "user stop wifi", xiaVar.l());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        LogUtil.b("HwWifiP2pTransferManager", "get 5.54.8");
        this.s = 0;
        CountDownLatch countDownLatch = this.h;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null) {
            LogUtil.d("HwWifiP2pTransferManager", "fileSupportP2pStatus param is null");
            a().b(1021, "5.54.9 data null");
            return;
        }
        xia xiaVarI = a().i();
        if (xiaVarI != null) {
            LogUtil.b("HwWifiP2pTransferManager", "set wait 1");
            xiaVarI.i(1);
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        int iA = 0;
        for (cqa cqaVar : cqbVarA.b()) {
            int iA2 = cpb.a(cqaVar.b());
            if (iA2 == 2) {
                iA = cpb.a(cqaVar.c());
            } else if (iA2 != 8) {
                LogUtil.e("HwWifiP2pTransferManager", "unknown tag : ", Integer.valueOf(cpb.a(cqaVar.b())));
            } else {
                this.f29868c = cpb.a(cqaVar.c());
            }
        }
        LogUtil.b("HwWifiP2pTransferManager", "5.54.9 supportType:", Integer.valueOf(iA), "mCheckModel:", Integer.valueOf(this.f29868c));
        e(deviceInfo, iA);
    }

    private void e(DeviceInfo deviceInfo, int i) {
        if (i == 1) {
            if (this.f29868c == 3) {
                int i2 = this.v;
                synchronized (f29866a) {
                    xia xiaVar = this.f29867b.get(Integer.valueOf(i2));
                    if (xiaVar != null && !TextUtils.isEmpty(xiaVar.t())) {
                        xiaVar.d(xiaVar.t());
                        this.f29867b.put(Integer.valueOf(i2), xiaVar);
                    } else {
                        LogUtil.e("HwWifiP2pTransferManager", "shaValue is empty");
                    }
                }
            }
            al();
            String deviceMac = deviceInfo != null ? deviceInfo.getDeviceMac() : null;
            LogUtil.b("HwWifiP2pTransferManager", "fileSupportP2pStatus macAddress:", cpl.e(deviceMac));
            f(deviceMac);
            if (p()) {
                xie.e(this.w);
                return;
            } else {
                a().q();
                a().b(1029, "create wifi go error");
                return;
            }
        }
        a().b(1020, "5.54.9 error");
    }

    private void e(byte[] bArr) {
        if (bArr == null) {
            LogUtil.d("HwWifiP2pTransferManager", "cancelWifiSuccess param is null");
            a().b(1028, "5.54.6 data null");
            return;
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        int iA = -1;
        for (cqa cqaVar : cqbVarA.b()) {
            if (cpb.a(cqaVar.b()) != 127) {
                LogUtil.e("HwWifiP2pTransferManager", "unknown tag : ", Integer.valueOf(cpb.a(cqaVar.b())));
            } else {
                iA = cpb.a(cqaVar.c());
            }
        }
        LogUtil.b("HwWifiP2pTransferManager", "5.54.6 code : ", Integer.valueOf(iA));
        if (iA == 100000) {
            a().b(20003, "5.54.6 cancel success.");
        } else {
            a().b(20004, "5.44.6 cancel fail");
        }
    }

    public boolean a(int i) {
        List<Integer> listB = xih.b();
        LogUtil.b("HwWifiP2pTransferManager", "wifiPairErrorCodeList.size: ", Integer.valueOf(listB.size()));
        return listB.contains(Integer.valueOf(i));
    }

    public boolean e(int i) {
        List<Integer> listE = xih.e();
        LogUtil.b("HwWifiP2pTransferManager", "wifiPairErrorCodeList.size: ", Integer.valueOf(listE.size()));
        return listE.contains(Integer.valueOf(i));
    }

    private void ar() {
        boolean z = this.f29867b.size() >= 2;
        ExtendHandler extendHandler = this.m;
        if (z || extendHandler == null) {
            LogUtil.b("HwWifiP2pTransferManager", "multi task, can not close wifi.");
        } else {
            LogUtil.b("HwWifiP2pTransferManager", "ready close wifi.");
            extendHandler.sendEmptyMessage(500, 10000L);
        }
    }

    private void ag() {
        LogUtil.b("HwWifiP2pTransferManager", "repeatFile reset wifi tag, stop wifi send.");
        ak();
    }

    public void r() {
        LogUtil.b("HwWifiP2pTransferManager", "remove wifi close");
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.removeMessages(500);
        } else {
            LogUtil.e("HwWifiP2pTransferManager", "removeWifiCloseTask fail.");
        }
    }

    public void ad() {
        synchronized (f29866a) {
            LogUtil.b("HwWifiP2pTransferManager", "wait task process.");
            LinkedHashMap<Integer, xia> linkedHashMap = this.f29867b;
            if (linkedHashMap.size() == 1) {
                LogUtil.e("HwWifiP2pTransferManager", "no wait task.");
                return;
            }
            boolean z = true;
            for (Map.Entry<Integer, xia> entry : linkedHashMap.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    xia value = entry.getValue();
                    if (value == null) {
                        LogUtil.e("HwWifiP2pTransferManager", "task is null, please check.");
                    } else {
                        WifiP2pTransferListener wifiP2pTransferListenerN = value.n();
                        LogUtil.b("HwWifiP2pTransferManager", "wait wifi task process : ", Integer.valueOf(value.l()));
                        wifiP2pTransferListenerN.onProcess(0, value.l());
                    }
                }
            }
        }
    }

    private void ae() {
        xgz xgzVar = new xgz();
        xgzVar.a(ac());
        xgzVar.i(ai());
        xgzVar.h(ah());
        xgt.b().registerReceiver(this.f, xgzVar, this.q, new SendCallback() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager.6
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.b("HwWifiP2pTransferManager", "registerReceiverToEngine errCode:", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.b("HwWifiP2pTransferManager", "registerReceiverToEngine onFileTransferReport transferWay: ", str);
            }
        });
    }

    protected void c(xiu xiuVar, SendCallback sendCallback) {
        xgz xgzVar = new xgz();
        xgzVar.a(ac());
        xgzVar.i(ai());
        xgzVar.h(ah());
        xgzVar.b(xiuVar);
        xgt.b().p2pSendForWearEngine(this.f, xit.e("HwWifiP2pTransferManager"), xgzVar, sendCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ConnectState connectState, com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo) {
        if (connectState == ConnectState.CONNECTED) {
            ae();
        } else if (connectState == ConnectState.DISCONNECTED) {
            LogUtil.b("onConnectionChange clear wifi queue", new Object[0]);
            c(deviceInfo);
        }
        b(connectState);
    }

    public void t() {
        if (this.f != null && this.q != null) {
            xgz xgzVar = new xgz();
            xgzVar.a(ac());
            xgzVar.i(ai());
            xgt.b().unregisterReceiver(this.f, this.q, xgzVar);
        }
        ab();
        xgt.b().d(ac());
    }

    private static void ab() {
        synchronized (d) {
            e = null;
        }
    }

    public void f(int i) {
        LogUtil.b("HwWifiP2pTransferManager", "tryResetWifi : ", Integer.valueOf(i));
        if (i == 5) {
            cpw.b("power_kit_open_wifi_module", 512, "user-ota-trans");
        }
        if (i == 6) {
            cpw.b("power_kit_open_wifi_module", 512, "user-ota-trans");
        }
    }
}
