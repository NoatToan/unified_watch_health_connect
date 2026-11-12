package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mlf implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mlf f41865a;

    public static mlf a() {
        if (f41865a == null) {
            synchronized (mlf.class) {
                if (f41865a == null) {
                    f41865a = new mlf();
                }
            }
        }
        return f41865a;
    }

    public void b() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.accountinfo", this);
    }

    public void c() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.accountinfo");
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null) {
            LogUtil.j("HwAccountInfoManager", "onDataReceived deviceInfo is null");
            return;
        }
        LogUtil.a("HwAccountInfoManager", "message = ", eecVar.toString());
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            if (d(eeeVar)) {
                try {
                    int iD = new cql().a(eeeVar.c(), 0).d((byte) 1, -1);
                    ReleaseLogUtil.d("R_HwAccountInfoManager", "reqEvent = ", Integer.valueOf(iD));
                    HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
                    hwGetDevicesParameter.setDeviceIdentify(deviceInfo.getDeviceIdentify());
                    List<DeviceInfo> deviceList = edb.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwAccountInfoManager");
                    if (deviceList == null || deviceList.size() == 0) {
                        LogUtil.j("HwAccountInfoManager", "getDeviceList is null");
                        return;
                    } else {
                        d(deviceList.get(0), iD);
                        return;
                    }
                } catch (cpy unused) {
                    ReleaseLogUtil.a("R_HwAccountInfoManager", "handleSampleEvent error EventData = ", eeeVar.c());
                    return;
                }
            }
            return;
        }
        LogUtil.j("HwAccountInfoManager", "onDataReceived sampleBase not instanceof SampleEvent");
    }

    private boolean d(eee eeeVar) {
        if (!eeeVar.getSrcPkgName().equals("hw.watch.accountinfo")) {
            LogUtil.j("HwAccountInfoManager", "wearPkgName not match.");
            return false;
        }
        if (eeeVar.getCommandId() != 2) {
            LogUtil.j("HwAccountInfoManager", "command not match.");
            return false;
        }
        if (eeeVar.d() != 800100015) {
            LogUtil.j("HwAccountInfoManager", "eventId not match.");
            return false;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC != null && bArrC.length != 0) {
            return true;
        }
        LogUtil.j("HwAccountInfoManager", "sampleEvent data is empty.");
        return false;
    }

    /* synthetic */ void c(DeviceInfo deviceInfo, int i, Object obj) {
        ReleaseLogUtil.d("R_HwAccountInfoManager", "refreshUserInfo onFinish, errorCode = ", Integer.valueOf(i));
        b(deviceInfo, d());
    }

    private void d(final DeviceInfo deviceInfo, int i) {
        if (i == 2) {
            b(deviceInfo, d());
        } else if (i == 3) {
            ThirdPartyLoginManager.getInstance().queryUserInfo(new IBaseResponseCallback() { // from class: mlj
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.e.c(deviceInfo, i2, obj);
                }
            }, false);
        } else {
            LogUtil.j("HwAccountInfoManager", "reqEvent is invalid");
        }
    }

    private byte[] d() {
        int i;
        try {
            i = Integer.parseInt(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1019));
        } catch (NumberFormatException e) {
            LogUtil.e("HwAccountInfoManager", "NumberFormatException = ", e.getMessage());
            i = -1;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014);
        boolean zIsKidAccount = LoginInit.getInstance(BaseApplication.getContext()).isKidAccount();
        LogUtil.a("HwAccountInfoManager", "ageGroupFlag = ", Integer.valueOf(i), ",registrationCountryCode = ", accountInfo, ",serviceCountryCode = ", accountInfo2, ",kidAccount = ", Boolean.valueOf(zIsKidAccount));
        cqj cqjVar = new cqj();
        cqjVar.g(1, 1).g(2, i).b(3, accountInfo).b(4, accountInfo2).g(5, zIsKidAccount ? 1 : 0);
        return cqjVar.e();
    }

    private void b(DeviceInfo deviceInfo, byte[] bArr) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.accountinfo");
        eeeVar.setWearPkgName("hw.watch.accountinfo");
        eeeVar.a(800100015L);
        eeeVar.setCommandId(2);
        eeeVar.a(0);
        eeeVar.e(bArr);
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "HwAccountInfoManager");
    }
}
