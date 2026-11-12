package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import com.huawei.devicesdk.connect.handshake.HandshakeSimpleCommandBase;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.strategy.CommandTimerTask;
import com.huawei.devicesdk.strategy.ConnectStrategy;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LogUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public class cnt extends ConnectStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f1876c = new Timer("ConnectStrategyScale");
    private HandshakeCommandBase d;
    private TimerTask e;

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void connect(ConnectMode connectMode, DeviceInfo deviceInfo) {
        super.connect(connectMode, deviceInfo);
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void getConnectStatus(String str) {
        LogUtil.b("ConnectStrategyScale", "getConnectStatus start");
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void startHandshake(DeviceInfo deviceInfo) {
        LogUtil.b("ConnectStrategyScale", "startHandshake enter");
        if (deviceInfo == null) {
            LogUtil.e("ConnectStrategyScale", "ConnectStrategySimple startHandshake deviceInfo parameter exception.");
            return;
        }
        cml cmlVar = new cml();
        cmlVar.h(20);
        cmlVar.f(1024);
        cmlVar.g(10);
        cnk.c().e(deviceInfo.getDeviceMac(), cmlVar);
        cky ckyVar = new cky();
        this.d = ckyVar;
        if (ckyVar instanceof HandshakeSimpleCommandBase) {
            cmg cmgVarPrepare = ckyVar.prepare(deviceInfo);
            this.f1874a = cjt.e(cmgVarPrepare.c());
            e(deviceInfo, cmgVarPrepare, false);
        }
        this.f1875b = 40;
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac()) || cmmVar == null) {
            LogUtil.e("ConnectStrategyScale", "onDataReceived device error");
            return;
        }
        if (!this.f1874a.equals(cmmVar.b())) {
            LogUtil.e("ConnectStrategyScale", "on data received is not equal deviceId");
            return;
        }
        a();
        LogUtil.b("ConnectStrategyScale", "on data received. error code: ", Integer.valueOf(i), cpl.a(deviceInfo));
        if (i != 0) {
            a(deviceInfo, false);
            return;
        }
        HandshakeCommandBase handshakeCommandBase = this.d;
        if (handshakeCommandBase == null) {
            LogUtil.e("ConnectStrategyScale", "mCurrentCommand is null");
            return;
        }
        this.mConnectStatusMsg = handshakeCommandBase.processReceivedData(deviceInfo, cmmVar);
        int iB = this.mConnectStatusMsg.b();
        LogUtil.b("ConnectStrategyScale", this.d.getClass().getName(), " data receive finish. status: ", Integer.valueOf(iB), cpl.a(deviceInfo));
        if (iB != 12) {
            a(deviceInfo, false);
            return;
        }
        HandshakeCommandBase handshakeCommandBase2 = this.d;
        if (handshakeCommandBase2 instanceof HandshakeSimpleCommandBase) {
            this.f1875b = 41;
            cmg cmgVarEnd = ((HandshakeSimpleCommandBase) handshakeCommandBase2).end(deviceInfo);
            this.f1874a = cjt.e(cmgVarEnd.c());
            e(deviceInfo, cmgVarEnd, false);
            return;
        }
        e(deviceInfo);
    }

    private void e(DeviceInfo deviceInfo) {
        HandshakeCommandBase nextCommand = this.d.getNextCommand();
        this.d = nextCommand;
        if (nextCommand == null) {
            LogUtil.b("ConnectStrategyScale", "handshake success.", cpl.a(deviceInfo));
            a(deviceInfo, true);
            return;
        }
        if (nextCommand instanceof HandshakeSimpleCommandBase) {
            LogUtil.b("ConnectStrategyScale", "mCurrentCommand instanceof HandshakeSimpleCommandBase");
            this.f1875b = 40;
            cmg cmgVarPrepare = ((HandshakeSimpleCommandBase) this.d).prepare(deviceInfo);
            this.f1874a = cjt.e(cmgVarPrepare.c());
            e(deviceInfo, cmgVarPrepare, false);
            return;
        }
        LogUtil.b("ConnectStrategyScale", "mCurrentCommand is not HandshakeSimpleCommandBase");
        cmg deviceCommand = this.d.getDeviceCommand(deviceInfo);
        this.f1874a = cjt.e(deviceCommand.c());
        e(deviceInfo, deviceCommand, true);
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void onChannelEnable(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("ConnectStrategyScale", "onDataReceived device error");
        }
        LogUtil.b("ConnectStrategyScale", "onChannelEnable errorCode ", Integer.valueOf(i), cpl.a(deviceInfo));
        if (i != 0) {
            a(deviceInfo, false);
            return;
        }
        if (this.d == null) {
            LogUtil.e("ConnectStrategyScale", "mCurrentCommand is null");
            return;
        }
        LogUtil.b("ConnectStrategyScale", "mCurrentChannelFlag: ", Integer.valueOf(this.f1875b));
        if (this.f1875b == 40) {
            cmg deviceCommand = this.d.getDeviceCommand(deviceInfo);
            this.f1874a = cjt.e(deviceCommand.c());
            e(deviceInfo, deviceCommand, true);
            return;
        }
        e(deviceInfo);
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void disconnect(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("ConnectStrategyScale", "disconnect error. device info is invalid.");
        } else {
            super.disconnect(deviceInfo);
        }
    }

    private void e(DeviceInfo deviceInfo, cmg cmgVar, boolean z) {
        LogUtil.b("ConnectStrategyScale", "sendDeviceData isNeedCheckOverTime: ", Boolean.valueOf(z));
        if (!c(cmgVar)) {
            LogUtil.d("ConnectStrategyScale", "construct device command error.", cpl.a(deviceInfo));
            a(deviceInfo, false);
            return;
        }
        cnm.d().e(deviceInfo, cmgVar);
        if (z) {
            d dVar = new d(cmgVar.c() + Constants.LINK + cpl.a(deviceInfo.getDeviceMac()), deviceInfo);
            this.e = dVar;
            this.f1876c.schedule(dVar, 10000L, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, boolean z) {
        int iE;
        LogUtil.b("ConnectStrategyScale", "callbackHandshakeStatus isHandshakeSuccess: ", Boolean.valueOf(z));
        this.d = null;
        if (this.mHandshakeStatusReporter == null) {
            LogUtil.e("ConnectStrategyScale", "handshake status callback is null ", cpl.a(deviceInfo));
            return;
        }
        if (z) {
            this.mHandshakeStatusReporter.onHandshakeFinish(deviceInfo);
            return;
        }
        if (this.mConnectStatusMsg == null) {
            LogUtil.e("ConnectStrategyScale", "callbackHandshakeStatus: mConnectStatusMsg is null.");
            iE = 999999;
        } else {
            iE = this.mConnectStatusMsg.e();
        }
        this.mHandshakeStatusReporter.onHandshakeFailed(deviceInfo, iE);
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void unPairDevice(DeviceInfo deviceInfo, ConnectMode connectMode, boolean z) {
        if (deviceInfo == null) {
            LogUtil.e("ConnectStrategyScale", "ConnectStrategySimple unPairDevice device null");
        } else {
            cll.c().d(deviceInfo, connectMode);
        }
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void destroy(String str) {
        LogUtil.b("ConnectStrategyScale", "destroy enter");
        a();
        cjz.e(str);
    }

    private boolean c(cmg cmgVar) {
        return (cmgVar == null || cmgVar.c() == null || cmgVar.i() == null) ? false : true;
    }

    private void a() {
        if (this.e != null) {
            LogUtil.b("ConnectStrategyScale", "cancel timeout task");
            this.e.cancel();
            this.e = null;
            return;
        }
        LogUtil.e("ConnectStrategyScale", "mTimerTask is empty");
    }

    class d extends CommandTimerTask {
        private DeviceInfo e;

        @Override // com.huawei.devicesdk.strategy.CommandTimerTask
        public void doTaskAction() {
        }

        d(String str, DeviceInfo deviceInfo) {
            super(str, 0);
            this.e = deviceInfo;
        }

        @Override // com.huawei.devicesdk.strategy.CommandTimerTask
        public void doTimeoutAction() {
            cnt.this.a(this.e, false);
        }
    }
}
