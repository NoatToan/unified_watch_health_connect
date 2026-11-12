package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.HwWearEngineNative;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.device.FoundListener;
import com.huawei.wearengine.device.GetAttributeListener;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pReceiverCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import com.huawei.wearengine.p2p.ReceiveResultCallback;
import defpackage.ylj;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yhu extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f53344c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private P2pReceiverCallback f53345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, Object> f53346b;
    private HwWearEngineNative d;

    private yhu() {
        super(BaseApplication.getContext());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        this.f53346b = concurrentHashMap;
        this.f53345a = null;
        concurrentHashMap.clear();
        LogUtil.a("WearEngine_HwHiWearKitManager", "enter HwHiWearKitManager");
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final yhu f53348a = new yhu();
    }

    public static yhu b() {
        return c.f53348a;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 52;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "getResult");
        if (deviceInfo == null || bArr == null || bArr.length < 2) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "device or dataContents is null");
            return;
        }
        LogUtil.a("WearEngine_HwHiWearKitManager", "HwHiWearKitManager getResult dataInfos is:", Arrays.toString(bArr));
        if (bArr[1] == 1) {
            e(deviceInfo, bArr);
        } else {
            LogUtil.a("WearEngine_HwHiWearKitManager", "other commandID");
        }
    }

    private void e(DeviceInfo deviceInfo, byte[] bArr) {
        List<eew> listB = ykx.b(bArr);
        if (coq.d(listB)) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "tlvs is empty");
        } else {
            b(deviceInfo, listB);
        }
    }

    private void b(DeviceInfo deviceInfo, List<eew> list) {
        yjc yjcVarB = b(list);
        int iJ = yjcVarB.j();
        int iB = yjcVarB.b();
        String strA = yjcVarB.a();
        if (iJ == 1) {
            c(deviceInfo, iB, yjcVarB.c(), yjcVarB.d(), strA);
            return;
        }
        if (iJ == 2) {
            e(deviceInfo, eeq.c(strA), iB, yjcVarB.c(), yjcVarB.d());
            return;
        }
        if (iJ == 3) {
            c(yjcVarB.e(), iB);
        } else if (iJ == 4) {
            e(deviceInfo, iB, yjcVarB.c(), yjcVarB.d());
        } else {
            LogUtil.e("WearEngine_HwHiWearKitManager", "handResponseCallback subCmd is invalid for ", Integer.valueOf(iJ));
        }
    }

    private void e(DeviceInfo deviceInfo, int i, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "handleGetAppVersion enter");
        d(deviceInfo, ylj.e(i, identityInfo2, identityInfo, ylj.b(identityInfo2.getPackageName())));
    }

    private yjc b(List<eew> list) {
        yjc yjcVar = new yjc();
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        for (eew eewVar : list) {
            switch (CommonUtil.v(eewVar.e())) {
                case 1:
                    yjcVar.c(ykx.a(eewVar));
                    break;
                case 2:
                    yjcVar.a(ykx.a(eewVar));
                    break;
                case 3:
                    strD = eeq.d(eewVar.b());
                    break;
                case 4:
                    strD3 = eeq.d(eewVar.b());
                    break;
                case 5:
                    strD2 = eeq.d(eewVar.b());
                    break;
                case 6:
                    strD4 = eeq.d(eewVar.b());
                    break;
                case 7:
                    yjcVar.a(eewVar.b());
                    break;
                case 8:
                    yjcVar.e(eewVar);
                    break;
            }
        }
        yjcVar.d(new IdentityInfo(strD, strD2));
        yjcVar.c(new IdentityInfo(strD3, strD4));
        return yjcVar;
    }

    private void c(DeviceInfo deviceInfo, int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, String str) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "handDevicePingCommand enter");
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "handDevicePingCommand device identify is null");
            return;
        }
        int iA = ylj.a(identityInfo2.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            iA = ylj.e(identityInfo, identityInfo2, b(str), iA);
        } else if (iA == 205) {
            ylj.e(identityInfo2.getPackageName());
        }
        d(deviceInfo, ylj.a(i, identityInfo2, identityInfo, iA));
    }

    private yjl b(String str) {
        List<eew> listE;
        try {
            listE = new eet().b(str).e();
        } catch (eeu unused) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "parsePingPayload TlvException");
            listE = null;
        }
        if (listE == null) {
            return null;
        }
        int iA = -1;
        String strD = "";
        for (eew eewVar : listE) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 1) {
                iA = ykx.a(eewVar);
            } else if (iV == 5) {
                strD = eeq.d(eewVar.b());
            }
        }
        yjl yjlVar = new yjl();
        yjlVar.e(iA);
        try {
            JSONObject jSONObject = new JSONObject(strD);
            yjh yjhVar = new yjh();
            yjhVar.e(jSONObject.getInt("entryType"));
            yjhVar.c(jSONObject.getString("entryName"));
            yjlVar.a(yjhVar);
        } catch (JSONException unused2) {
            ReleaseLogUtil.a("WearEngine_HwHiWearKitManager", "parse startOptions exception");
        }
        return yjlVar;
    }

    private void e(DeviceInfo deviceInfo, byte[] bArr, int i, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        synchronized (this) {
            LogUtil.a("WearEngine_HwHiWearKitManager", "handDeviceSendCommand enter");
            if (this.f53345a == null) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "handDeviceSendCommand mP2pReceiverCallback is null");
                d(deviceInfo, ylj.a(i, identityInfo2, identityInfo, 206));
                return;
            }
            Device deviceA = ykx.a(deviceInfo);
            if (deviceA == null) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "handDeviceSendCommand HiWearDevice is null");
                return;
            }
            if (identityInfo == null || identityInfo2 == null) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "handDeviceSendCommand pkgInfo is null");
                return;
            }
            if (bArr != null && !TextUtils.isEmpty(identityInfo.getPackageName()) && !TextUtils.isEmpty(identityInfo2.getPackageName())) {
                b(deviceA, bArr, new yke(identityInfo, identityInfo2), i, deviceInfo);
                return;
            }
            LogUtil.e("WearEngine_HwHiWearKitManager", "handDeviceSendCommand message or package name is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, DeviceCommand deviceCommand) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "sendDeviceCommand device identify is null");
        } else {
            if (deviceCommand == null) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "sendDeviceCommand deviceCommand is null");
                return;
            }
            LogUtil.d("WearEngine_HwHiWearKitManager", "sendDeviceCommand deviceCommand is:", deviceCommand.toString());
            deviceCommand.setmIdentify(deviceIdentify);
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        }
    }

    private void b(Device device, byte[] bArr, yke ykeVar, final int i, final DeviceInfo deviceInfo) {
        synchronized (this) {
            final IdentityInfo identityInfoD = ykeVar.d();
            final IdentityInfo identityInfoC = ykeVar.c();
            MessageParcel messageParcelA = a(bArr);
            P2pReceiverCallback p2pReceiverCallback = this.f53345a;
            if (p2pReceiverCallback == null) {
                LogUtil.j("WearEngine_HwHiWearKitManager", "mP2pReceiverCallback is null");
            } else {
                try {
                    p2pReceiverCallback.onDataReceived(device, messageParcelA, identityInfoD, identityInfoC, new ReceiveResultCallback.Stub() { // from class: com.huawei.wearengine.HwHiWearKitManager$1
                        @Override // com.huawei.wearengine.p2p.ReceiveResultCallback
                        public void onReceiveResult(int i2) {
                            this.this$0.d(deviceInfo, ylj.a(i, identityInfoC, identityInfoD, i2));
                        }
                    });
                } catch (RemoteException unused) {
                    LogUtil.e("WearEngine_HwHiWearKitManager", "handleDataReceive RemoteException");
                }
            }
        }
    }

    private MessageParcel a(byte[] bArr) {
        MessageParcel messageParcel = new MessageParcel();
        messageParcel.setType(1);
        messageParcel.setData(bArr);
        return messageParcel;
    }

    private void c(eew eewVar, int i) {
        if (eewVar == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "responseTlv is null");
            return;
        }
        if (i == -1) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "result sequenceNum is error");
            return;
        }
        String strB = eewVar.b();
        LogUtil.a("WearEngine_HwHiWearKitManager", "handleResultCallback resultString is:", strB);
        LogUtil.a("WearEngine_HwHiWearKitManager", "handleResultCallback sequenceNum is:", Integer.valueOf(i));
        int iV = !TextUtils.isEmpty(strB) ? CommonUtil.v(strB) : 203;
        LogUtil.a("WearEngine_HwHiWearKitManager", "handleResultCallback result int is:", Integer.valueOf(iV));
        Object objRemove = this.f53346b.remove(Integer.valueOf(i));
        if (objRemove == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "handleResultCallback is null");
            return;
        }
        if (objRemove instanceof P2pPingCallback) {
            c(iV, (P2pPingCallback) objRemove);
        } else if (!(objRemove instanceof P2pSendCallback)) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "handleResultCallback callback not target class");
        } else {
            b(iV, (P2pSendCallback) objRemove);
        }
    }

    private void c(int i, P2pPingCallback p2pPingCallback) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "handleResultCallback is P2pPingCallback");
        try {
            p2pPingCallback.onResult(i);
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "handleP2pPingCallback RemoteException");
        } catch (Exception unused2) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "handleP2pPingCallback p2pPingCallback has exception");
        }
    }

    private void b(int i, P2pSendCallback p2pSendCallback) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "handleResultCallback is P2pSendCallback");
        try {
            p2pSendCallback.onSendResult(i);
            if (i != 207 && i != 209) {
                p2pSendCallback.onSendProgress(0L);
                return;
            }
            p2pSendCallback.onSendProgress(100L);
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "handleP2pSendCallback RemoteException");
        } catch (Exception unused2) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "handleP2pSendCallback p2pSendCallback has exception");
        }
    }

    public void d(FoundListener foundListener, String str, boolean z) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "foundDevices enter");
        if (foundListener == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "listener is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_HwHiWearKitManager");
        if (!z && deviceList != null) {
            LogUtil.a("WearEngine_HwHiWearKitManager", "enter non-white filter");
            List<DeviceInfo> listC = ykx.c(deviceList);
            deviceList.clear();
            deviceList.addAll(listC);
        }
        if (deviceList != null) {
            try {
                if (!deviceList.isEmpty()) {
                    LogUtil.a("WearEngine_HwHiWearKitManager", "foundDevices device is ok");
                    foundListener.onDeviceFound(ykx.b(deviceList, str));
                    return;
                }
            } catch (RemoteException unused) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "foundDevices remoteException");
                return;
            }
        }
        LogUtil.j("WearEngine_HwHiWearKitManager", "discoverDevices device is empty");
        foundListener.onDeviceFound(new ArrayList(16));
    }

    public void d(FoundListener foundListener, String str) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "foundAllDevices enter");
        if (foundListener == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "foundAllDevices listener is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_HwHiWearKitManager");
        if (deviceList != null && deviceList.size() > 0) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                arrayList.add(ykx.d(it.next()));
            }
        }
        List<dru> thirdDeviceList = ((PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class)).getThirdDeviceList();
        if (thirdDeviceList != null && thirdDeviceList.size() > 0) {
            Iterator<dru> it2 = thirdDeviceList.iterator();
            while (it2.hasNext()) {
                arrayList.add(ykx.a(it2.next()));
            }
        }
        try {
            if (arrayList.isEmpty()) {
                LogUtil.j("WearEngine_HwHiWearKitManager", "discoverAllDevices device is empty");
                foundListener.onDeviceFound(new ArrayList(16));
            } else {
                LogUtil.a("WearEngine_HwHiWearKitManager", "foundAllDevices device is ok");
                foundListener.onDeviceFound(arrayList);
            }
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "foundAllDevices remoteException");
        }
    }

    public void a(FoundListener foundListener, String str, boolean z) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "foundCommonDevices enter");
        if (foundListener == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "listener is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_HwHiWearKitManager");
        if (deviceList != null) {
            try {
                if (!deviceList.isEmpty()) {
                    LogUtil.a("WearEngine_HwHiWearKitManager", "foundCommonDevices device is ok");
                    ArrayList arrayList = new ArrayList(16);
                    Iterator<DeviceInfo> it = deviceList.iterator();
                    while (it.hasNext()) {
                        a(str, z, arrayList, it.next());
                    }
                    foundListener.onDeviceFound(arrayList);
                    return;
                }
            } catch (RemoteException unused) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "foundCommonDevices remoteException");
                return;
            }
        }
        LogUtil.j("WearEngine_HwHiWearKitManager", "discoverDevices device is empty");
        foundListener.onDeviceFound(new ArrayList(16));
    }

    private void a(String str, boolean z, List<Device> list, DeviceInfo deviceInfo) {
        Device deviceI;
        if ((ykx.o(deviceInfo) && !ykx.b(str)) || ykx.d(deviceInfo, str) || (deviceI = ykx.i(deviceInfo)) == null) {
            return;
        }
        if (ykx.o(deviceInfo) && ykx.b(str)) {
            ykx.b(deviceI);
        } else {
            ykx.b(deviceI, deviceInfo, z);
        }
        ykx.a(deviceInfo, deviceI, str);
        ykx.a(deviceInfo, deviceI);
        if (e(deviceI)) {
            list.add(deviceI);
        }
    }

    private boolean e(Device device) {
        if (device == null) {
            return false;
        }
        return device.getP2pCapability() == 0 || device.getMonitorCapability() == 0 || device.getNotifyCapability() == 0 || device.getSensorCapability() == 0;
    }

    public void d(Device device, GetAttributeListener getAttributeListener) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "getHiLinkDeviceId enter");
        if (getAttributeListener == null) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "getHiLinkDeviceId getAttributeListener == null");
            throw new IllegalStateException(String.valueOf(12));
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_HwHiWearKitManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "getHiLinkDeviceId deviceInfoList is empty");
            throw new IllegalStateException(String.valueOf(5));
        }
        LogUtil.a("WearEngine_HwHiWearKitManager", "getHiLinkDeviceId deviceInfoList is ok");
        DeviceInfo deviceInfoD = ykx.d(device, deviceList);
        if (!ykx.f(deviceInfoD)) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "getHiLinkDeviceId device not support hiwearkit.");
            throw new IllegalStateException(String.valueOf(12));
        }
        try {
            getAttributeListener.onGetString(deviceInfoD.getHiLinkDeviceId());
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "getHiLinkDeviceId remoteException");
        }
    }

    public void d(Device device, int i, GetAttributeListener getAttributeListener) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "queryDeviceCapability enter");
        if (getAttributeListener == null) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "queryDeviceCapability queryCapabilityCallback == null");
            throw new IllegalStateException(String.valueOf(5));
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "WearEngine_HwHiWearKitManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "queryDeviceCapability deviceInfoList is empty");
            throw new IllegalStateException(String.valueOf(12));
        }
        DeviceInfo deviceInfoD = ykx.d(device, deviceList);
        if (!ykx.f(deviceInfoD)) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "queryDeviceCapability device not support hiwearkit.");
            throw new IllegalStateException(String.valueOf(12));
        }
        try {
            getAttributeListener.onGetString(Integer.toString(!eey.d(deviceInfoD, i) ? 1 : 0));
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "queryDeviceCapability remoteException");
        }
    }

    public void d(int i, Object obj) {
        if (obj == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "registerDataReceiveListener callback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        this.f53346b.put(Integer.valueOf(i), obj);
        LogUtil.a("WearEngine_HwHiWearKitManager", "registerDataReceiveListener callback ok");
    }

    public int c() {
        return xio.c().a();
    }

    public String d(String str) {
        LogUtil.a("WearEngine_HwHiWearKitManager", "getIdentify enter");
        if (str == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "getIdentify enter parameter is invalid.");
            return "";
        }
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "WearEngine_HwHiWearKitManager");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType()) && (str.equals(deviceInfo2.getDeviceUdid()) || str.equals(deviceInfo2.getUuid()))) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "getUsedDeviceList is invalid.");
            throw new IllegalStateException(String.valueOf(16));
        }
        return deviceInfo.getDeviceIdentify();
    }

    public P2pReceiverCallback d() {
        P2pReceiverCallback p2pReceiverCallback;
        synchronized (this) {
            p2pReceiverCallback = this.f53345a;
        }
        return p2pReceiverCallback;
    }

    public void d(P2pReceiverCallback p2pReceiverCallback) {
        synchronized (this) {
            if (p2pReceiverCallback != null) {
                LogUtil.a("WearEngine_HwHiWearKitManager", "registerDeviceDataListener enter");
                this.f53345a = p2pReceiverCallback;
                e();
            }
        }
    }

    public void a() {
        synchronized (this) {
            LogUtil.a("WearEngine_HwHiWearKitManager", "unsubscribeDeviceDataListener enter");
            this.f53345a = null;
            h();
        }
    }

    public void b(HwWearEngineNative hwWearEngineNative) {
        this.d = hwWearEngineNative;
    }

    public boolean c(mrk mrkVar) {
        if (mrkVar == null) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "isP2pReceiverExist commonFileInfo is null");
            return false;
        }
        if (this.d == null) {
            LogUtil.e("WearEngine_HwHiWearKitManager", "isP2pReceiverExist mHwWearEngineNative is null");
            return false;
        }
        LogUtil.a("WearEngine_HwHiWearKitManager", "enter isP2pReceiverExist");
        IdentityInfo identityInfoB = b(mrkVar);
        IdentityInfo identityInfoD = d(mrkVar);
        return this.d.d(ykx.c(), identityInfoD, identityInfoB);
    }

    private void e() {
        LogUtil.a("WearEngine_HwHiWearKitManager", "begin registerFileReceiveCallback");
        IBaseResponseCallback iBaseResponseCallback = new IBaseResponseCallback() { // from class: yhu.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearEngine_HwHiWearKitManager", "enter file receive callback onResponse");
                if (i != 0) {
                    LogUtil.e("WearEngine_HwHiWearKitManager", "IBaseResponseCallback onResponse failed, errorCode:" + i);
                    return;
                }
                if (obj instanceof xhr) {
                    xhr xhrVar = (xhr) obj;
                    mrk mrkVar = new mrk();
                    mrkVar.g(xhrVar.ag());
                    mrkVar.i(xhrVar.ai());
                    mrkVar.d(xhrVar.i());
                    mrkVar.a(xhrVar.g());
                    mrkVar.c(xhrVar.t());
                    mrkVar.b(xhrVar.n());
                    mrkVar.j(xhrVar.ah());
                    mrkVar.e(xhrVar.j());
                    obj = mrkVar;
                }
                if (!(obj instanceof mrk)) {
                    LogUtil.e("WearEngine_HwHiWearKitManager", "IBaseResponseCallback onResponse failed, objData is not CommonFileInfo");
                    return;
                }
                mrk mrkVar2 = (mrk) obj;
                IdentityInfo identityInfoB = yhu.this.b(mrkVar2);
                IdentityInfo identityInfoD = yhu.this.d(mrkVar2);
                yhu.this.c(ykx.c(), yhu.this.a(mrkVar2), identityInfoB, identityInfoD);
            }
        };
        mrj.e().d(iBaseResponseCallback);
        xin.d().a(iBaseResponseCallback);
    }

    private void h() {
        LogUtil.a("WearEngine_HwHiWearKitManager", "unregisterFileReceiveCallback enter");
        mrj.e().b();
        xin.d().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        synchronized (this) {
            LogUtil.a("WearEngine_HwHiWearKitManager", "enter handleFileReceiveCallback");
            if (device == null) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "handleFileReceiveCallback device is null");
                return;
            }
            P2pReceiverCallback p2pReceiverCallback = this.f53345a;
            if (p2pReceiverCallback == null) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "handleFileReceiveCallback mP2pReceiverCallback is null");
            } else {
                try {
                    p2pReceiverCallback.onDataReceived(device, messageParcel, identityInfo, identityInfo2, new ReceiveResultCallback.Stub() { // from class: com.huawei.wearengine.HwHiWearKitManager$3
                        @Override // com.huawei.wearengine.p2p.ReceiveResultCallback
                        public void onReceiveResult(int i) throws RemoteException {
                        }
                    });
                } catch (RemoteException unused) {
                    LogUtil.e("WearEngine_HwHiWearKitManager", "handleFileReceiveCallback RemoteException");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IdentityInfo b(mrk mrkVar) {
        return new IdentityInfo(mrkVar.ac(), mrkVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IdentityInfo d(mrk mrkVar) {
        return new IdentityInfo(mrkVar.f(), mrkVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageParcel a(mrk mrkVar) {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        MessageParcel messageParcel = new MessageParcel();
        messageParcel.setType(2);
        String strM = mrkVar.m();
        LogUtil.d("WearEngine_HwHiWearKitManager", "getMessageParcelFromCommonFileInfo filePath:" + strM);
        if (TextUtils.isEmpty(strM)) {
            LogUtil.j("WearEngine_HwHiWearKitManager", "getMessageParcelFromCommonFileInfo filePath is empty");
        } else {
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(strM), 268435456);
            } catch (FileNotFoundException unused) {
                LogUtil.e("WearEngine_HwHiWearKitManager", "getMessageParcelFromCommonFileInfo FileNotFoundException");
                parcelFileDescriptorOpen = null;
            }
            messageParcel.setParcelFileDescriptor(parcelFileDescriptorOpen);
            messageParcel.setFileName(mrkVar.n());
            messageParcel.setDescription(mrkVar.e());
            messageParcel.setFileSha256(mrkVar.w());
            messageParcel.setData(new byte[0]);
            return messageParcel;
        }
        parcelFileDescriptorOpen = null;
        messageParcel.setParcelFileDescriptor(parcelFileDescriptorOpen);
        messageParcel.setFileName(mrkVar.n());
        messageParcel.setDescription(mrkVar.e());
        messageParcel.setFileSha256(mrkVar.w());
        messageParcel.setData(new byte[0]);
        return messageParcel;
    }
}
