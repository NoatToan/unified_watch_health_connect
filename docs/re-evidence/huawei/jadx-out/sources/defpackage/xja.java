package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.FrameReceiver;
import com.huawei.devicesdk.entity.DeviceDataFrameParcel;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.ParserInterface;
import health.compact.a.LogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xja implements ParserInterface {
    private xja() {
        LogUtil.b("HwSampleCommandMgr", "create HwSampleCommandMgr");
    }

    public static xja b() {
        return a.f53094b;
    }

    @Override // com.huawei.unitedevice.hwcommonfilemgr.ParserInterface
    public boolean getResult(DeviceInfo deviceInfo, byte[] bArr) {
        boolean zD = d(bArr);
        LogUtil.b("HwSampleCommandMgr", "isSampleCommand: ", Boolean.valueOf(zD));
        if (!zD) {
            return true;
        }
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(deviceInfo.getDeviceMac());
        uniteDevice.setDeviceInfo(deviceInfo);
        cpl.d("HwSampleCommandMgr", bArr, "getResult() message:");
        try {
            List<cqa> listB = b(bArr).b();
            if (coq.d(listB)) {
                LogUtil.e("HwSampleCommandMgr", "getResult tlvList is null or size is zero");
                return false;
            }
            LogUtil.b("HwSampleCommandMgr", "fill destPkgName enter.");
            for (cqa cqaVar : listB) {
                if (cpb.a(cqaVar.b()) == 2) {
                    String strA = cph.a(cqaVar.c());
                    if (TextUtils.isEmpty(strA)) {
                        LogUtil.e("HwSampleCommandMgr", "getResult Constant.DEST_PKG_TYPE is null.");
                        return false;
                    }
                    c(strA, uniteDevice, bArr);
                    return false;
                }
            }
            return false;
        } catch (cpy e) {
            LogUtil.d("HwSampleCommandMgr", "processSampleConfig Exception ", cpc.c(e));
        }
    }

    private boolean d(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            LogUtil.e("HwSampleCommandMgr", "isSampleCommandResult input param is invalid.");
            return false;
        }
        if (bArr[0] != 55) {
            return false;
        }
        LogUtil.b("HwSampleCommandMgr", "isSampleCommandResult data received");
        return true;
    }

    private void c(String str, UniteDevice uniteDevice, byte[] bArr) {
        boolean z;
        Exception e;
        Map<String, FrameReceiver> mapB = xje.e().b();
        int size = mapB.size();
        LogUtil.b("HwSampleCommandMgr", "handleReceiveData enter. destPkgName: ", str, ", receiveCallbackList.size: ", Integer.valueOf(size));
        if (size == 0) {
            LogUtil.e("HwSampleCommandMgr", "getReceiver sampleBase is null.");
            return;
        }
        DeviceDataFrameParcel deviceDataFrameParcel = new DeviceDataFrameParcel();
        deviceDataFrameParcel.setData(bArr);
        boolean z2 = false;
        for (Map.Entry<String, FrameReceiver> entry : mapB.entrySet()) {
            String key = entry.getKey();
            if (key != null && key.contains(str)) {
                try {
                    if (entry.getValue() != null) {
                        z = true;
                        LogUtil.b("HwSampleCommandMgr", "handleReceiveData success.");
                        try {
                            entry.getValue().onFrameReceived(0, uniteDevice, deviceDataFrameParcel);
                        } catch (RemoteException unused) {
                            z2 = true;
                            LogUtil.d("HwSampleCommandMgr", "preProcess RemoteException");
                        } catch (Exception e2) {
                            e = e2;
                            LogUtil.d("HwSampleCommandMgr", "preProcess Exception : ", ExceptionUtils.c(e));
                        }
                        z2 = z;
                    }
                } catch (RemoteException unused2) {
                } catch (Exception e3) {
                    z = z2;
                    e = e3;
                }
            }
        }
        LogUtil.b("HwSampleCommandMgr", "handleReceiveData exit. isSuccess: ", Boolean.valueOf(z2));
    }

    private cqb b(byte[] bArr) throws cpy {
        String strD = cph.d(bArr);
        return new cqe().a((strD == null || strD.length() <= 4) ? null : strD.substring(4, strD.length()));
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static xja f53094b = new xja();
    }
}
