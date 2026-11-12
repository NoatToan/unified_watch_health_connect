package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.algorithm.callback.IBluetoothResponseCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwcoresleepmgr.SyncBaseFunction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class myl implements SyncBaseFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f42693a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBluetoothResponseCallback f42694c;
    private String e;

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final myl f42698c = new myl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(int i) {
        if (i == 144001) {
            return 10000;
        }
        return i;
    }

    private myl() {
        this.f42693a = null;
        this.e = null;
    }

    public static myl b() {
        return d.f42698c;
    }

    @Override // com.huawei.hwcoresleepmgr.SyncBaseFunction
    public void addOtaCoreSleepLog(int i, long j) {
        String strE = mjh.e(j);
        mjh.a(BaseApplication.getContext(), "031301", "EXCE_SLEEP_RECORD_ABNORMAL_ERROR", i + "", strE);
    }

    @Override // com.huawei.hwcoresleepmgr.SyncBaseFunction
    public void registerHiHealthDataClient(DeviceInfo deviceInfo) {
        mga.h(deviceInfo);
    }

    @Override // com.huawei.hwcoresleepmgr.SyncBaseFunction
    public void getSleepDataFromDevice(boolean z, boolean z2, int i, int i2, IBluetoothResponseCallback iBluetoothResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "enter getSleepDetailFromDevice, isNormal: ", Boolean.valueOf(z2), ", startTime: ", Integer.valueOf(i), ", endTime: ", Integer.valueOf(i2), ", isPriority: ", Boolean.valueOf(z));
        DeviceCapability deviceCapability = getDeviceCapability(getDeviceInfo());
        if (deviceCapability == null || (!deviceCapability.isSupportCoreSleep() && !deviceCapability.isSupportQueryDeviceCoreSleepSwitch())) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_BluetoothTransImpl", "deviceCapability is null or not support core sleep and switch");
        } else if (deviceCapability.isSupportCoreSleepNewFile()) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "support new file.");
            e(i, i2, iBluetoothResponseCallback);
        } else {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "support old file.");
            e(z2, i, i2, iBluetoothResponseCallback);
        }
    }

    private void e(boolean z, int i, int i2, IBluetoothResponseCallback iBluetoothResponseCallback) {
        TransferFileInfo transferFileInfo = new TransferFileInfo();
        transferFileInfo.setType(2);
        if (!z) {
            transferFileInfo.setPriority(3);
        } else {
            transferFileInfo.setPriority(2);
        }
        transferFileInfo.setSuspend(0);
        transferFileInfo.setTaskType(0);
        transferFileInfo.setRecordId(new ArrayList(16));
        transferFileInfo.setStartTime(i);
        transferFileInfo.setEndTime(i2);
        this.f42694c = iBluetoothResponseCallback;
        mnn.a().e(transferFileInfo, new ITransferSleepAndDFXFileCallback.Stub() { // from class: myl.2
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i3, String str, String str2) throws Throwable {
                myl.this.c(i3, str, str2, false);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i3, String str) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "getSleepDataFromDevice getFile onFailure errCode = ", Integer.valueOf(i3));
                LogUtil.a("BluetoothTransImpl", "getSleepDataFromDevice getFile onFailure errMsg = ", str);
                if (myl.this.f42694c != null) {
                    myl.this.f42694c.onFailure(i3, str);
                } else {
                    LogUtil.a("BluetoothTransImpl", "getSleepDataFromDevice getFile onFailure mCoreSleepCallback is null.");
                }
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i3, String str) {
                LogUtil.a("BluetoothTransImpl", "getSleepDataFromDevice getFile onProgress progress = " + i3);
                if (myl.this.f42694c != null) {
                    myl.this.f42694c.onProgress(i3, null);
                } else {
                    LogUtil.a("BluetoothTransImpl", "getSleepDataFromDevice getFile onProgress mCoreSleepCallback is null.");
                }
            }
        });
    }

    @Override // com.huawei.hwcoresleepmgr.SyncBaseFunction
    public DeviceInfo getDeviceInfo() {
        LogUtil.a("BluetoothTransImpl", "phonservice getDeviceInfo ");
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "BluetoothTransImpl");
        if (deviceList == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_BluetoothTransImpl", "getDeviceInfo deviceInfoList is null");
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (!eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("BluetoothTransImpl", "getActiveDeviceInfo deviceInfo ", deviceInfo);
        return deviceInfo;
    }

    @Override // com.huawei.hwcoresleepmgr.SyncBaseFunction
    public DeviceCapability getDeviceCapability(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_BluetoothTransImpl", "getDeviceCapability deviceInfo is null");
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "BluetoothTransImpl");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    @Override // com.huawei.hwcoresleepmgr.SyncBaseFunction
    public void sendCommandToDevice(int i, Map<Integer, String> map, DeviceInfo deviceInfo) {
        if (map == null || map.size() > 1) {
            LogUtil.j("BluetoothTransImpl", "sendSleepDeviceData parameter is error.");
            return;
        }
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        String value = "";
        while (it.hasNext()) {
            value = it.next().getValue();
        }
        if (TextUtils.isEmpty(value)) {
            LogUtil.j("BluetoothTransImpl", "sendSleepDeviceData parameter value is null");
            return;
        }
        if (i == 24) {
            e(Integer.parseInt(value));
        } else if (i != 25) {
            LogUtil.j("BluetoothTransImpl", "sendSleepDeviceData enter other, commandId is :", Integer.valueOf(i));
        } else {
            b(Integer.parseInt(value), deviceInfo);
        }
    }

    @Override // com.huawei.hwcoresleepmgr.SyncBaseFunction
    public void dicSyncCoreSleep(String str, int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        LinkedList<mvh> linkedList = new LinkedList<>();
        mvh mvhVar = new mvh();
        mvhVar.c(DicDataTypeUtil.DataType.SLEEP_DETAILS.value());
        if (mvd.d(mvhVar.b()) == -1) {
            ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "dicSyncCoreSleep DictionarySequenceCapability error");
            return;
        }
        linkedList.add(mvhVar);
        mzh mzhVar = new mzh();
        mzhVar.e(str);
        mzhVar.e(1);
        mzhVar.c(linkedList);
        mzhVar.c(i);
        mzhVar.d(i2);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", " start dicSyncCoreSleep");
        mzj.b().d("DIC_SEQUENCE_SYNC_TASK", mzhVar, new IBaseResponseCallback() { // from class: myl.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "dicSyncCoreSleep errorCode:", Integer.valueOf(i3));
                if (i3 != 0 && i3 != 144001) {
                    i3 = -1;
                }
                iBaseResponseCallback.a(i3, obj);
            }
        });
    }

    private void e(int i) {
        LogUtil.a("BluetoothTransImpl", "sendSleepStateCmd enabled:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(24);
        byte[] bArrA = lxp.a(i);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        LogUtil.a("BluetoothTransImpl", "sendSleepStateCmd dataInfos :", Arrays.toString(bArrA));
        e(deviceCommand);
    }

    private void b(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(25);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(eeq.c(eeq.d(i)));
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        e(deviceCommand);
    }

    private void e(DeviceCommand deviceCommand) {
        List<DeviceInfo> deviceList;
        if (TextUtils.isEmpty(deviceCommand.getmIdentify()) && ((deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "BluetoothTransImpl")) == null || deviceList.isEmpty())) {
            return;
        }
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void e(int i, int i2, IBluetoothResponseCallback iBluetoothResponseCallback) {
        this.f42694c = iBluetoothResponseCallback;
        int[] iArr = {i, i2};
        this.f42693a = iArr;
        mhp mhpVar = new mhp();
        mhpVar.a("sleep_state.bin");
        mhpVar.c(14);
        mhpVar.e(false);
        mhpVar.c(iArr);
        mhpVar.d(null);
        mrj.e().a(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: myl.4
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i3, String str, String str2) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "mStateCallback : errorCode", Integer.valueOf(i3));
                LogUtil.a("BluetoothTransImpl", "mStateCallback : transferDataContent : ", str);
                myl.this.e = str;
                myl.this.e();
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i3, String str) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "mStateCallback, onFailure errorCode is : ", Integer.valueOf(i3));
                int iB = myl.this.b(i3);
                if (myl.this.f42694c != null) {
                    myl.this.f42694c.onFailure(iB, str);
                } else {
                    LogUtil.j("BluetoothTransImpl", "mStateCallback, onFailure mCoreSleepCallback is null.");
                }
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i3, String str) {
                LogUtil.a("BluetoothTransImpl", "mStateCallback, onProgress progress is ", Integer.valueOf(i3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int[] iArr = this.f42693a;
        if (iArr == null || iArr.length != 2) {
            LogUtil.j("BluetoothTransImpl", "getDataFile times is wrong.");
            return;
        }
        LogUtil.a("BluetoothTransImpl", "lastTime : ", Integer.valueOf(iArr[0]), "nowTime : ", Integer.valueOf(iArr[1]));
        mhp mhpVar = new mhp();
        mhpVar.a("sleep_data.bin");
        mhpVar.c(15);
        mhpVar.e(false);
        mhpVar.c(iArr);
        mhpVar.d(null);
        mrj.e().a(mhpVar, new ITransferSleepAndDFXFileCallback.Stub() { // from class: myl.3
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws Throwable {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "mDataCallback : errorCode", Integer.valueOf(i));
                LogUtil.a("BluetoothTransImpl", "mDataCallback : transferDataContent : ", str);
                myl mylVar = myl.this;
                mylVar.c(i, str, mylVar.e, true);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws Throwable {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "mDataCallback, onFailure errorCode is : ", Integer.valueOf(i));
                int iB = myl.this.b(i);
                if (iB != 10000) {
                    if (myl.this.f42694c != null) {
                        myl.this.f42694c.onFailure(iB, str);
                        return;
                    } else {
                        LogUtil.j("BluetoothTransImpl", "mStateCallback, onFailure mCoreSleepCallback is null.");
                        return;
                    }
                }
                LogUtil.j("BluetoothTransImpl", "mDataCallback file is empty.");
                myl mylVar = myl.this;
                mylVar.c(i, null, mylVar.e, true);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) {
                LogUtil.a("BluetoothTransImpl", "mDataCallback, onProgress progress is ", Integer.valueOf(i));
                if (myl.this.f42694c != null) {
                    myl.this.f42694c.onProgress(i, null);
                } else {
                    LogUtil.j("BluetoothTransImpl", "mDataCallback, onProgress mCoreSleepCallback is null.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str, String str2, boolean z) throws Throwable {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_BluetoothTransImpl", "enter successProgress, sucCode ", Integer.valueOf(i), ", isNewFile ", Boolean.valueOf(z));
        LogUtil.a("BluetoothTransImpl", "successProgress mTransferStateContentPath = ", str2, ", mTransferDataContentPath = ", str);
        if (str2 == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_BluetoothTransImpl", "successProgress transferStateContent is null.");
            IBluetoothResponseCallback iBluetoothResponseCallback = this.f42694c;
            if (iBluetoothResponseCallback != null) {
                iBluetoothResponseCallback.onFailure(10001, "state path is null.");
                return;
            } else {
                ReleaseLogUtil.e("BluetoothTransImpl", "successProgress mCoreSleepCallback is null.");
                return;
            }
        }
        e(str, str2, i, z);
    }

    private void e(String str, String str2, int i, boolean z) throws Throwable {
        if (z) {
            LogUtil.a("BluetoothTransImpl", "parseSleepFile enter.");
            mjg mjgVarE = mjg.e();
            mjgVarE.d(str);
            mjgVarE.d(str2);
            mjgVarE.b();
            a(z, str, str2, i);
            return;
        }
        a(z, str, str2, i);
    }

    private void a(boolean z, String str, String str2, int i) {
        IBluetoothResponseCallback iBluetoothResponseCallback = this.f42694c;
        if (iBluetoothResponseCallback != null) {
            iBluetoothResponseCallback.onSuccess(i, a(z, str, str2));
        }
    }

    private String a(boolean z, String str, String str2) {
        HashMap map = new HashMap();
        map.put("isNewFile", String.valueOf(z));
        map.put("coreSleepDataFilePath", str);
        map.put("coreSleepStatusFilePath", str2);
        return new Gson().toJson(map);
    }
}
