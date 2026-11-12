package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.ConnectStatusInterface;
import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.hichain.HiChainAuthManager;
import com.huawei.devicesdk.strategy.CommandTimerTask;
import com.huawei.devicesdk.strategy.ConnectStrategy;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public class cnx extends ConnectStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1879a = new Object();
    private static boolean d = true;
    private static List<String> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConnectFilter f1880b;
    private TimerTask i;
    private DeviceInfo j;
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandshakeCommandBase f1881c = null;
    private Timer h = new Timer("ConnectStrategyGeneral");

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void getConnectStatus(String str) {
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void onChannelEnable(DeviceInfo deviceInfo, int i) {
    }

    static {
        ArrayList arrayList = new ArrayList(16);
        e = arrayList;
        arrayList.add("1A05");
        e.add("1A06");
        e.add("2601");
        e.add("0131");
        e.add("0130");
    }

    public static boolean d() {
        return d;
    }

    public static void e(boolean z) {
        d = z;
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void disconnect(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("ConnectStrategyGeneral", "disconnect error. deivce info is invalid.");
        } else {
            super.disconnect(deviceInfo);
        }
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void unPairDevice(DeviceInfo deviceInfo, ConnectMode connectMode, boolean z) {
        if (z) {
            cll.c().d(deviceInfo, connectMode);
        }
        if (deviceInfo != null && cmz.b(deviceInfo.getDeviceMac())) {
            cnd.a().a(deviceInfo.getDeviceMac());
        }
        if (deviceInfo != null) {
            cpv.c(deviceInfo.getDeviceMac(), "");
        }
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void destroy(String str) {
        a();
        cjy.b(str);
        cnh.d().d(str);
        HiChainAuthManager.e().c(str);
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
        if (deviceInfo == null || cmmVar == null) {
            LogUtil.e("ConnectStrategyGeneral", "onDataReceived deviceInfo dataContents parameter exception.");
            return;
        }
        if (i != 0) {
            LogUtil.e("ConnectStrategyGeneral", "this command is not send sucess");
            return;
        }
        LogUtil.b("ConnectStrategyGeneral", "onDataReceived");
        d(cmmVar);
        if (this.f) {
            String strD = cph.d(cmmVar.d());
            if (strD.length() < 4) {
                return;
            }
            if (!e.contains(strD.substring(0, 4))) {
                LogUtil.e("ConnectStrategyGeneral", "is not customization handshake command, return.");
                return;
            } else {
                c(deviceInfo, strD);
                return;
            }
        }
        cmh cmhVarB = b(deviceInfo, cmmVar);
        if (cmhVarB == null || cmhVarB.b() != 53) {
            return;
        }
        if (this.mHandshakeStatusReporter != null) {
            this.mHandshakeStatusReporter.onHandshakeStartOobe(deviceInfo);
        }
        this.f = true;
        c(deviceInfo, "service_capability_success");
    }

    private void d(cmm cmmVar) {
        byte[] bArrD = cmmVar.d();
        if (bArrD == null || bArrD.length < 2) {
            LogUtil.e("ConnectStrategyGeneral", "handleKeyLost is not valid array: ", bArrD);
            return;
        }
        if (bArrD[0] == 1 && bArrD[1] == 52) {
            LogUtil.b("ConnectStrategyGeneral", "Enter onDataReceivedMethod() key lost 5.1.52:");
            if (cnc.e(bArrD) == 1) {
                this.mConnectStatusMsg.d(HiHealthStatusCodes.BLUETOOTH_FORBIDDEN_ERROR);
                this.mConnectStatusMsg.e(11);
                a(this.mConnectStatusMsg);
            }
        }
    }

    private boolean c(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("ConnectStrategyGeneral", "device is invalid.");
            return false;
        }
        if (this.f1880b == null) {
            LogUtil.e("ConnectStrategyGeneral", "setPreDataCache error ConnectFilter null");
            return false;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        String strE = cku.e(i);
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(deviceMac);
        uniteDevice.setDeviceInfo(deviceInfo);
        cnk.c().c(deviceMac, (cmr) new Gson().fromJson(this.f1880b.preProcess(uniteDevice, strE), cmr.class));
        return true;
    }

    private cmh b(DeviceInfo deviceInfo, cmm cmmVar) {
        LogUtil.b("ConnectStrategyGeneral", "processCommonCommandMessage");
        if (!a(cmmVar)) {
            if (this.mConnectStatusMsg == null) {
                this.mConnectStatusMsg = e();
            }
            this.mConnectStatusMsg.e(16);
            return this.mConnectStatusMsg;
        }
        a();
        this.mConnectStatusMsg = this.f1881c.processReceivedData(deviceInfo, cmmVar);
        int iB = this.mConnectStatusMsg.b();
        HandshakeCommandBase handshakeCommandBase = this.f1881c;
        if (handshakeCommandBase == null) {
            this.mConnectStatusMsg.e(11);
            a(this.mConnectStatusMsg);
            return this.mConnectStatusMsg;
        }
        ReleaseLogUtil.c("DEVMGR_ConnectStrategyGeneral", handshakeCommandBase.getTag(), " data receive finish. status: ", Integer.valueOf(iB), cpl.e(deviceInfo));
        if (iB == 3) {
            if (deviceInfo.isReconnect()) {
                if (Boolean.parseBoolean(cpk.e("isUserConnect", ""))) {
                    LogUtil.b("ConnectStrategyGeneral", "updateResult:", Boolean.valueOf(c(deviceInfo, iB)));
                    cpk.a("isUserConnect");
                } else {
                    LogUtil.b("ConnectStrategyGeneral", "can not reconnect device in double phone situation.", cpl.a(deviceInfo));
                    cno.a().a(deviceInfo);
                    this.mConnectStatusMsg.e(11);
                    a(this.mConnectStatusMsg);
                    return this.mConnectStatusMsg;
                }
            } else {
                boolean zC = c(deviceInfo, iB);
                cmr cmrVarH = cnk.c().h(deviceInfo.getDeviceMac());
                if (!zC || cmrVarH == null || !cmrVarH.a()) {
                    this.mConnectStatusMsg.e(11);
                    a(this.mConnectStatusMsg);
                    LogUtil.d("ConnectStrategyGeneral", "processCommonCommandMessage: pre device cache error.");
                    return this.mConnectStatusMsg;
                }
            }
        }
        if (iB == 15) {
            c(deviceInfo, iB);
        }
        return e(this.mConnectStatusMsg, deviceInfo, iB);
    }

    private cmh e(cmh cmhVar, DeviceInfo deviceInfo, int i) {
        if (i == 12 || i == 15 || i == 3) {
            HandshakeCommandBase nextCommand = this.f1881c.getNextCommand();
            this.f1881c = nextCommand;
            e(nextCommand);
            return cmhVar;
        }
        if (i != 17) {
            if (i == 56) {
                LogUtil.e("ConnectStrategyGeneral", "onDataReceived: connectStatus keyMiss");
                return cmhVar;
            }
            if (i != 53) {
                a(cmhVar);
                LogUtil.d("ConnectStrategyGeneral", "onDataReceived: get next command fail");
            }
            if (i == 55) {
                disconnect(deviceInfo);
                deviceInfo.setUsing(false);
                deviceInfo.setDeviceConnectState(4);
                cnk.c().c(deviceInfo);
            }
        }
        return cmhVar;
    }

    private boolean a(cmm cmmVar) {
        HandshakeCommandBase handshakeCommandBase = this.f1881c;
        if (handshakeCommandBase instanceof HandshakeGeneralCommandBase) {
            String tag = ((HandshakeGeneralCommandBase) handshakeCommandBase).getTag();
            byte[] bArrD = cmmVar.d();
            if (bArrD == null || bArrD.length < 2) {
                LogUtil.b("ConnectStrategyGeneral", "isValidCommand srcArray: ", bArrD);
            } else {
                byte[] bArr = new byte[2];
                System.arraycopy(bArrD, 0, bArr, 0, 2);
                if (!TextUtils.isEmpty(tag) && tag.equalsIgnoreCase(cph.d(bArr))) {
                    LogUtil.b("ConnectStrategyGeneral", "isValidCommand dstArray = ", bArr, "tag = ", tag);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void registerHandshakeFilter(DeviceInfo deviceInfo, ConnectFilter connectFilter) {
        super.registerHandshakeFilter(deviceInfo, connectFilter);
        this.f1880b = connectFilter;
    }

    private cmg a(DeviceInfo deviceInfo) {
        cmg cmgVar = new cmg();
        if (deviceInfo == null) {
            LogUtil.e("ConnectStrategyGeneral", "device info is empty when buildDeviceCommand");
            return cmgVar;
        }
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmg.b bVar = new cmg.b();
        bVar.d(3);
        return bVar.a(cmgVar);
    }

    private void c(DeviceInfo deviceInfo, String str) {
        if (this.f1880b == null) {
            LogUtil.e("ConnectStrategyGeneral", "mConnectFilter is null.");
            ConnectFilter connectFilterA = cnf.d().a();
            this.f1880b = connectFilterA;
            if (connectFilterA == null) {
                LogUtil.b("ConnectStrategyGeneral", "no filter, so connect success.");
                this.mConnectStatusMsg.e(10);
                b(this.mConnectStatusMsg);
                return;
            }
        }
        cmg cmgVarA = a(deviceInfo);
        cmg cmgVar = new cmg();
        UniteDevice uniteDeviceE = e(deviceInfo);
        d(deviceInfo, cmgVarA, cmgVar, uniteDeviceE, this.f1880b.onFilter(uniteDeviceE, str, cmgVar));
    }

    private void d(DeviceInfo deviceInfo, cmg cmgVar, cmg cmgVar2, UniteDevice uniteDevice, int i) {
        if (i == 54) {
            LogUtil.d("ConnectStrategyGeneral", "reply is not current command, abandon this.");
            return;
        }
        if (i == 50) {
            b(deviceInfo, cmgVar, cmgVar2, uniteDevice);
            return;
        }
        if (i == 51) {
            this.f = false;
            this.mConnectStatusMsg.e(51);
            this.mConnectStatusMsg.d(cpi.c(5, i));
            a(this.mConnectStatusMsg);
            return;
        }
        if (i == 57 || i == 58) {
            this.f = false;
            this.mConnectStatusMsg.e(i);
            this.mConnectStatusMsg.d(cpi.c(5, i));
            a(this.mConnectStatusMsg);
            return;
        }
        if (i == 52) {
            cnk.c().c(uniteDevice);
            ConnectStatusInterface connectStatusInterface = this.mHandshakeStatusReporter;
            if (connectStatusInterface == null) {
                LogUtil.e("ConnectStrategyGeneral", "onCapabilityChanged invoke exception.");
            } else {
                connectStatusInterface.onCapabilityChanged(deviceInfo);
            }
            b(this.mConnectStatusMsg);
        }
    }

    private void b(DeviceInfo deviceInfo, cmg cmgVar, cmg cmgVar2, UniteDevice uniteDevice) {
        if (cmgVar2.b() != null && cmgVar2.b().length > 0) {
            cnk.c().c(uniteDevice);
            ConnectStatusInterface connectStatusInterface = this.mHandshakeStatusReporter;
            if (connectStatusInterface != null) {
                connectStatusInterface.onCapabilityChanged(deviceInfo);
            } else {
                LogUtil.e("ConnectStrategyGeneral", "onCapabilityChanged invoke exception.");
            }
            cmgVar.a(cmgVar2.b());
            cnm.d().e(this.j, cmgVar);
            return;
        }
        LogUtil.e("ConnectStrategyGeneral", "SendCommandManage getCommand is null ");
    }

    private UniteDevice e(DeviceInfo deviceInfo) {
        UniteDevice uniteDevice = new UniteDevice();
        if (deviceInfo != null) {
            uniteDevice.setIdentify(deviceInfo.getDeviceMac());
            uniteDevice.setCapability(cnk.c().b(deviceInfo.getDeviceMac()));
            uniteDevice.setDeviceInfo(deviceInfo);
        }
        return uniteDevice;
    }

    private void b(cmh cmhVar) {
        this.f = false;
        cmhVar.e(10);
        a(cmhVar);
    }

    private void a() {
        synchronized (f1879a) {
            TimerTask timerTask = this.i;
            if (timerTask != null) {
                timerTask.cancel();
                this.i = null;
            } else {
                LogUtil.e("ConnectStrategyGeneral", "mTimerTask is empty:", this);
            }
        }
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void startHandshake(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("ConnectStrategyGeneral", "device info is empty.");
            return;
        }
        this.f1881c = new ckv(deviceInfo);
        this.j = deviceInfo;
        cqp.a(100089, cqc.a((Object) deviceInfo.getDeviceName()), "", "");
        e(this.f1881c);
    }

    private void e(HandshakeCommandBase handshakeCommandBase) {
        if (handshakeCommandBase == null) {
            LogUtil.b("ConnectStrategyGeneral", "hand shake successed.");
            this.mConnectStatusMsg.e(10);
            a(this.mConnectStatusMsg);
            return;
        }
        LogUtil.b("ConnectStrategyGeneral", "sendDeviceData");
        cmg deviceCommand = handshakeCommandBase.getDeviceCommand(this.j);
        if (deviceCommand == null || deviceCommand.b() == null) {
            LogUtil.d("ConnectStrategyGeneral", "construct command message error.");
            this.mConnectStatusMsg.e(11);
            a(this.mConnectStatusMsg);
            this.f1881c = null;
            return;
        }
        deviceCommand.c(c(deviceCommand.b()));
        if (cnk.c().a(this.j.getDeviceMac()) == null) {
            LogUtil.e("ConnectStrategyGeneral", "sendDeviceData deviceInfo is removed");
        } else if (deviceCommand.h() > 0) {
            d(deviceCommand);
        } else {
            e(deviceCommand, handshakeCommandBase);
            cnm.d().e(this.j, deviceCommand);
        }
    }

    private int c(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        return (bArr[0] * 100) + bArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(cmh cmhVar) {
        if (cmhVar == null) {
            LogUtil.d("ConnectStrategyGeneral", "callbackHandshakeStatus: connectStatusMsg is null.");
            this.mHandshakeStatusReporter.onHandshakeFailed(this.j, 999999);
        } else if (this.mHandshakeStatusReporter != null) {
            if (cmhVar.b() == 10) {
                this.mHandshakeStatusReporter.onHandshakeFinish(this.j);
            } else {
                this.mHandshakeStatusReporter.onHandshakeFailed(this.j, cmhVar.e());
            }
        }
    }

    private void d(cmg cmgVar) {
        int iH = cmgVar.h();
        cnm.d().e(this.j, cmgVar);
        try {
            e eVar = new e(cmgVar.c() + Constants.LINK + cpl.a(this.j.getDeviceMac()), cmgVar, iH, cmgVar.a());
            this.i = eVar;
            long j = 10000;
            this.h.schedule(eVar, j, j);
        } catch (IllegalStateException e2) {
            LogUtil.d("ConnectStrategyGeneral", "sendDeviceDataByAck() IllegalStateException:", e2.getMessage());
        }
    }

    private void e(cmg cmgVar, HandshakeCommandBase handshakeCommandBase) {
        if (this.f1881c == null) {
            ReleaseLogUtil.c("DEVMGR_ConnectStrategyGeneral", "sendDeviceDataNeedWait handshakeCommandTag: ", handshakeCommandBase.getTag());
            this.f1881c = handshakeCommandBase.getNextCommand();
        }
        HandshakeCommandBase handshakeCommandBase2 = this.f1881c;
        if (handshakeCommandBase2 == null) {
            ReleaseLogUtil.c("DEVMGR_ConnectStrategyGeneral", "sendDeviceDataNeedWait mCurrentCommand again is null.");
            disconnect(this.j);
            this.j.setDeviceConnectState(4);
            cnk.c().c(this.j);
            lng.c("ConnectMessage", "sendDeviceDataNeedWait mCurrentCommand is empty");
            return;
        }
        String tag = ((HandshakeGeneralCommandBase) handshakeCommandBase2).getTag();
        boolean z = tag.equalsIgnoreCase("0128") && d;
        if (this.j.getDeviceBtType() == 2) {
            if (tag.equalsIgnoreCase("010E")) {
                c(cmgVar);
            } else if (z) {
                LogUtil.b("ConnectStrategyGeneral", "sendDeviceDataNeedWait-isHiChain3FirstTag: ", Boolean.valueOf(d));
                d = false;
                c(cmgVar);
            }
        }
        LogUtil.e("ConnectStrategyGeneral", "mIsHiChain3FirstTag:", Boolean.valueOf(d));
    }

    private void c(cmg cmgVar) {
        synchronized (f1879a) {
            e eVar = new e(cmgVar.c() + Constants.LINK + cpl.a(this.j.getDeviceMac()), cmgVar, cmgVar.h(), cmgVar.a());
            this.i = eVar;
            long j = (long) 30000;
            this.h.schedule(eVar, j, j);
        }
    }

    class e extends CommandTimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1882a;
        private cmg e;

        e(String str, cmg cmgVar, int i, int i2) {
            super(str, i);
            this.e = cmgVar;
            this.f1882a = i2;
        }

        @Override // com.huawei.devicesdk.strategy.CommandTimerTask
        public void doTaskAction() {
            LogUtil.b("ConnectStrategyGeneral", "doTaskAction:", cnx.this);
            cmg cmgVar = this.e;
            if (cmgVar == null) {
                LogUtil.e("ConnectStrategyGeneral", "mCommandMessage is null.");
                return;
            }
            byte[] bArrB = cmgVar.b();
            if ("0101".equals(cpq.a(bArrB))) {
                if (cnx.this.j != null) {
                    cml cmlVarC = cnk.c().c(cnx.this.j.getDeviceMac());
                    LogUtil.b("ConnectStrategyGeneral", "doTaskAction retry linkNegotiationCommand:", cmlVarC);
                    if (cmlVarC != null) {
                        cancel();
                        return;
                    }
                } else {
                    LogUtil.e("ConnectStrategyGeneral", "mDeviceInfo is null.");
                    return;
                }
            }
            if ("0105".equals(cpq.a(bArrB))) {
                LogUtil.b("ConnectStrategyGeneral", "doTaskAction time command.");
                this.e = cnx.this.f1881c.getDeviceCommand(cnx.this.j);
            }
            cnm.d().e(cnx.this.j, this.e);
        }

        @Override // com.huawei.devicesdk.strategy.CommandTimerTask
        public void doTimeoutAction() {
            LogUtil.b("ConnectStrategyGeneral", "doTimeoutAction");
            if (cnx.this.mConnectStatusMsg == null) {
                cnx cnxVar = cnx.this;
                cnxVar.mConnectStatusMsg = cnxVar.e();
            }
            cnx.this.mConnectStatusMsg.e(11);
            cnx.this.mConnectStatusMsg.d(cpi.c(8, this.f1882a));
            cnx cnxVar2 = cnx.this;
            cnxVar2.a(cnxVar2.mConnectStatusMsg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cmh e() {
        cmh cmhVar = new cmh();
        HandshakeCommandBase handshakeCommandBase = this.f1881c;
        if (handshakeCommandBase != null) {
            try {
                cmhVar.d(Integer.parseInt(handshakeCommandBase.getTag()));
                return cmhVar;
            } catch (NumberFormatException unused) {
                LogUtil.d("ConnectStrategyGeneral", "NumberFormatException exception");
            }
        }
        return cmhVar;
    }
}
