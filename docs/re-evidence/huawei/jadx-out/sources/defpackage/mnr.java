package defpackage;

import android.os.Message;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.hms.kit.awareness.AwarenessStatusCodes;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.up.utils.ErrorCode;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class mnr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42020b = new Object();
    private static mnr d;
    private TransferFileInfo e;

    private mnr() {
    }

    public static mnr b() {
        mnr mnrVar;
        synchronized (f42020b) {
            if (d == null) {
                d = new mnr();
            }
            mnrVar = d;
        }
        return mnrVar;
    }

    public boolean c(String str) {
        LogUtil.a("HwFileTransferTaskManagerPart", "deleteFolder = ", str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return a(file.listFiles());
        }
        return true;
    }

    private boolean a(File[] fileArr) {
        boolean zDelete = true;
        if (fileArr != null && fileArr.length > 0) {
            for (File file : fileArr) {
                zDelete = file.delete();
                LogUtil.a("HwFileTransferTaskManagerPart", "filepath exist files,need delete, delete result = ", Boolean.valueOf(zDelete));
            }
            mjj.e();
        }
        return zDelete;
    }

    public boolean b(byte[] bArr) {
        String strE;
        if (bArr != null && (strE = eeq.e(bArr)) != null) {
            try {
                if (strE.length() > 8 && Integer.parseInt(strE.substring(8), 16) == 110002) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManagerPart", "isLeoError NumberFormatException");
            }
        }
        return false;
    }

    public void e(ExtendHandler extendHandler, List<Integer> list) {
        if (extendHandler == null || list == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 14;
        messageObtain.arg1 = list.get(0).intValue();
        messageObtain.arg2 = 10003;
        extendHandler.sendMessage(messageObtain);
    }

    public void e(byte[] bArr, MaintenaceInterface maintenaceInterface, IBaseResponseCallback iBaseResponseCallback) {
        int i;
        if (bArr == null || !(maintenaceInterface instanceof mjj)) {
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("HwFileTransferTaskManagerPart", "callbackErrorCode messageHex = ", strE);
        if (strE != null) {
            try {
                if (strE.length() < 9) {
                    return;
                } else {
                    i = Integer.parseInt(strE.substring(8), 16);
                }
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManagerPart", "callbackErrorCode NumberFormatException");
                i = 0;
            }
            if (iBaseResponseCallback != null) {
                mjh.e(this.e, i, b(i), iBaseResponseCallback);
            }
        }
    }

    public String b(int i) {
        switch (i) {
            case 100000:
                return MonitorResult.SUCCESS;
            case 100001:
                return "UNKNOW ERROR";
            case ErrorCode.HWID_IS_STOPED /* 100002 */:
                return "NOT SUPPORT THIS REQUEST";
            case 100003:
                return "NO PERMISSION";
            case 100004:
                return "SYSTEM BUSY";
            case AdapterWithBottomView.TYPE_BOTTOM /* 100005 */:
                return "REQUEST FORMAT ERROR";
            case 100006:
                return "REQUEST PARAMETER ERROR";
            case WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007 /* 100007 */:
                return "MEMORY ERROR";
            case 100008:
                return "RESPONSE TIMEOUT";
            default:
                switch (i) {
                    case 104001:
                        return "单板不支持OTA升级";
                    case 104002:
                        return "低电量 ";
                    default:
                        LogUtil.j("HwFileTransferTaskManagerPart", "getErrorCodeInfo is default");
                        return "";
                }
        }
    }

    public void c(byte[] bArr, IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface) {
        if (iBaseResponseCallback == null || bArr == null || maintenaceInterface == null) {
            return;
        }
        maintenaceInterface.onDestroyMaintenance();
        if (maintenaceInterface instanceof mjj) {
            String strE = eeq.e(bArr);
            LogUtil.a("HwFileTransferTaskManagerPart", "dfxOrSleepGetFileNameCallback callbackErrorCode messageHex = ", strE);
            if (strE == null || strE.length() < 9) {
                return;
            }
            int iV = CommonUtil.v(strE.substring(8));
            mjh.e(this.e, iV, b(iV), iBaseResponseCallback);
            return;
        }
        iBaseResponseCallback.a(10002, eeq.e(bArr));
    }

    public void d(byte[] bArr, IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface) {
        if (iBaseResponseCallback == null || bArr == null || maintenaceInterface == null) {
            return;
        }
        maintenaceInterface.onDestroyMaintenance();
        if (maintenaceInterface instanceof mjg) {
            maintenaceInterface.setMaintRetryResult(true);
        }
        if (maintenaceInterface instanceof mjj) {
            String strE = eeq.e(bArr);
            LogUtil.a("HwFileTransferTaskManagerPart", "COMMAND_ID_MAINT_QUERY_FILE_INFORMATION messageHex = ", strE);
            if (strE == null || strE.length() < 9) {
                return;
            }
            int iV = CommonUtil.v(strE.substring(8));
            mjh.e(this.e, iV, b(iV), iBaseResponseCallback);
            return;
        }
        iBaseResponseCallback.a(10002, eeq.e(bArr));
    }

    public void a(int i, int i2, ExtendHandler extendHandler) {
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            extendHandler.sendEmptyMessage(15, 30000L);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(1);
        byte[] bArrH = eeq.h(i);
        byte[] bArrH2 = eeq.h(i2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(17);
        byteBufferAllocate.put(new byte[]{2, 1, 4}).put((byte) -113).put((byte) 12).put((byte) 16).put((byte) 4).put(bArrH).put((byte) 17).put((byte) 4).put(bArrH2);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        b(deviceCommand);
    }

    public void e(int i, int i2, ExtendHandler extendHandler) {
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            extendHandler.sendEmptyMessage(15, 30000L);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(1);
        byte[] bArr = {7, 1, (byte) i2};
        byte[] bArrC = eeq.c(i);
        byte[] bArr2 = {9, 2, bArrC[0], bArrC[1]};
        byte[] bArrA = eeq.a(4);
        byte[] bArrA2 = eeq.a(bArrA.length + 8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA2.length + 8 + bArrA.length + 4);
        byteBufferAllocate.put(new byte[]{2, 1, 2}).put((byte) -122).put(bArrA2).put(bArr).put((byte) -120).put(bArrA).put(bArr2);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        b(deviceCommand);
    }

    public void b(int i, int i2, ExtendHandler extendHandler) {
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            extendHandler.sendEmptyMessage(15, 30000L);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(1);
        byte[] bArrH = eeq.h(i);
        byte[] bArrH2 = eeq.h(i2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(17);
        byteBufferAllocate.put(new byte[]{2, 1, 1}).put((byte) -125).put((byte) 12).put((byte) 4).put((byte) 4).put(bArrH).put((byte) 5).put((byte) 4).put(bArrH2);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        b(deviceCommand);
    }

    public void b(int i, ExtendHandler extendHandler) {
        if (extendHandler != null && i == 0) {
            LogUtil.a("HwFileTransferTaskManagerPart", "transfer next file");
            extendHandler.sendEmptyMessage(14);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(6);
        deviceCommand.setDataContent(new byte[]{1, 1, 1});
        deviceCommand.setDataLen(3);
        b(deviceCommand);
    }

    public void b(MaintenaceInterface maintenaceInterface, final ExtendHandler extendHandler) {
        DeviceCommand deviceCommandTransferFileEndProcess = maintenaceInterface != null ? maintenaceInterface.transferFileEndProcess() : null;
        if (deviceCommandTransferFileEndProcess != null) {
            b(deviceCommandTransferFileEndProcess);
        }
        if (maintenaceInterface == null || extendHandler == null) {
            return;
        }
        if (maintenaceInterface instanceof mjg) {
            maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    extendHandler.sendEmptyMessage(14);
                }
            }, true);
            return;
        }
        if (maintenaceInterface instanceof mjj) {
            maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    extendHandler.sendEmptyMessage(14);
                }
            }, true);
        } else if (maintenaceInterface instanceof mji) {
            LogUtil.a("HwFileTransferTaskManagerPart", "mMaintenanceSleepOrDfxUtil instanceof PeriodRRIFileUtil");
            maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwFileTransferTaskManagerPart", "PeriodRRIFileUtil WEAR OS onResponse");
                    extendHandler.sendEmptyMessage(14);
                }
            }, true);
        } else {
            extendHandler.sendEmptyMessage(14);
        }
    }

    public void b(ExtendHandler extendHandler) {
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            extendHandler.sendEmptyMessage(15, 30000L);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put(new byte[]{6, 1, 2}).put(new byte[]{7, 1, 3});
        deviceCommand.setDataContent(byteBufferAllocate.array());
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        b(deviceCommand);
    }

    public void b(int i, TransferFileInfo transferFileInfo, ExtendHandler extendHandler) {
        String fileLogId;
        int bugTypeId;
        int i2;
        byte[] bArrH;
        byte[] bArrB;
        byte[] bArrA;
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            extendHandler.sendEmptyMessage(15, 30000L);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(1);
        if (transferFileInfo != null && transferFileInfo.getType() == 0) {
            LogUtil.a("HwFileTransferTaskManagerPart", "current task is dfx task");
            deviceCommand.setmIdentify(transferFileInfo.getDeviceSn());
            fileLogId = transferFileInfo.getFileLogId();
            bugTypeId = transferFileInfo.getBugTypeId();
        } else {
            fileLogId = "";
            bugTypeId = 0;
        }
        LogUtil.a("HwFileTransferTaskManagerPart", "fileLogIdValue: ", fileLogId, ";bugTypeIdValue: ", Integer.valueOf(bugTypeId));
        ByteBuffer byteBufferAllocate = null;
        if (!CommonUtil.ap() || TextUtils.isEmpty(fileLogId) || bugTypeId == 0) {
            i2 = 0;
            bArrH = null;
            bArrB = null;
            bArrA = null;
        } else {
            bArrH = eeq.h(bugTypeId);
            bArrB = eeq.b(fileLogId);
            bArrA = eeq.a(bArrB.length);
            i2 = 4;
        }
        if (i != 0) {
            byte[] bArrC = eeq.c(i);
            byte[] bArr = {15, 2, bArrC[0], bArrC[1]};
            byteBufferAllocate = ByteBuffer.allocate((bArrH != null ? 6 : 0) + 4 + (bArrB == null ? 0 : bArrA.length + 1 + bArrB.length));
            if (bArrH != null && bArrB != null) {
                byteBufferAllocate.put(Ascii.NAK).put((byte) i2).put(bArrH).put(Ascii.SYN).put(bArrA).put(bArrB);
            }
            byteBufferAllocate.put(bArr);
        } else if (bArrH != null && bArrB != null) {
            byteBufferAllocate = ByteBuffer.allocate((bArrB != null ? bArrA.length + 1 + bArrB.length : 0) + 6);
            byteBufferAllocate.put(Ascii.NAK).put((byte) i2).put(bArrH).put(Ascii.SYN).put(bArrA).put(bArrB);
        }
        if (byteBufferAllocate != null) {
            deviceCommand.setDataContent(byteBufferAllocate.array());
            deviceCommand.setDataLen(byteBufferAllocate.array().length);
        }
        if (transferFileInfo != null && b(transferFileInfo)) {
            mnf.d(mnf.a(), mnf.c());
            e();
        }
        b(deviceCommand);
    }

    public void e() {
        mnf.a(new Runnable() { // from class: mno
            @Override // java.lang.Runnable
            public final void run() {
                this.f42015a.a();
            }
        });
    }

    /* synthetic */ void a() {
        mnf.b(false);
        mnf.d(new Timer("HwFileTransferTaskManagerPart"));
        mnf.d(new TimerTask() { // from class: mnr.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "4-minutes timer is reaching");
                mnf.b(true);
            }
        });
        LogUtil.a("HwFileTransferTaskManagerPart", "4-minutes timer start");
        if (mnf.a() != null) {
            mnf.a().schedule(mnf.c(), 240000L);
        }
    }

    public void c(MaintenaceInterface maintenaceInterface, ExtendHandler extendHandler) {
        if (extendHandler != null) {
            extendHandler.removeMessages(15);
            extendHandler.sendEmptyMessage(15, 30000L);
        }
        if (maintenaceInterface != null) {
            DeviceCommand deviceCommandMaintParametersCommand = maintenaceInterface.maintParametersCommand();
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "5.10.2 getMaintenanceSleepOrDfxParameters");
            b(deviceCommandMaintParametersCommand);
        }
    }

    public void d(String str, int i, int i2, mus musVar, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(str, i, i2, musVar, str2);
    }

    public void c(IBaseResponseCallback iBaseResponseCallback, Message message, Map<Integer, Map<Long, double[]>> map, Map<Integer, Integer> map2, Map<Integer, List<Long>> map3) {
        HashMap map4 = new HashMap(16);
        HashMap map5 = new HashMap(16);
        HashMap map6 = new HashMap(16);
        if (iBaseResponseCallback == null || map == null || map2 == null || map3 == null) {
            LogUtil.j("HwFileTransferTaskManagerPart", "GpsHandle callback is null");
            return;
        }
        for (Map.Entry<Integer, Map<Long, double[]>> entry : map.entrySet()) {
            map4.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
            map5.put(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<Integer, List<Long>> entry3 : map3.entrySet()) {
            map6.put(entry3.getKey(), entry3.getValue());
        }
        if (message != null && message.arg2 == 10003) {
            LogUtil.a("HwFileTransferTaskManagerPart", "no gps data");
            map4.put(Integer.valueOf(message.arg1), null);
            map5.put(Integer.valueOf(message.arg1), null);
            map6.put(Integer.valueOf(message.arg1), null);
        }
        iBaseResponseCallback.a(10000, new Object[]{map4, map5, map6});
    }

    public void b(DeviceCommand deviceCommand) {
        cpl.d("HwFileTransferTaskManagerPart", deviceCommand.getDataContent(), "sendCommand deviceCommand: ");
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public boolean b(TransferFileInfo transferFileInfo) {
        return transferFileInfo != null && transferFileInfo.getType() == 0 && transferFileInfo.getTaskType() == 2;
    }

    public void a(byte[] bArr) {
        int i;
        LogUtil.a("HwFileTransferTaskManagerPart", "notifyCassiniDfx 5.10.12, CommonUtil.isReleaseVersion() = " + CommonUtil.bu());
        if (bArr != null && bArr.length == 8 && bArr[2] == 127) {
            String strE = eeq.e(bArr);
            LogUtil.a("HwFileTransferTaskManagerPart", "Cassini messageHex = ", strE);
            if (strE != null) {
                try {
                    if (strE.length() < 9) {
                        return;
                    } else {
                        i = Integer.parseInt(strE.substring(8, strE.length()), 16);
                    }
                } catch (NumberFormatException unused) {
                    ReleaseLogUtil.a("Dfx_HwFileTransferTaskManagerPart", "mDeviceResponseCallback NumberFormatException");
                    i = 0;
                }
                LogUtil.a("HwFileTransferTaskManagerPart", "Cassini messageHex errorCode = " + i);
                if (i == 100000) {
                    LogUtil.a("HwFileTransferTaskManagerPart", "notifyCassiniDfx Cassini messageHex errorCode = 100000");
                    return;
                }
                LogUtil.a("HwFileTransferTaskManagerPart", "notifyCassiniDfx Cassini messageHex errorCode = " + i);
            }
        }
    }

    public void c(String str, int i, int i2, mus musVar, String str2) {
        ByteBuffer byteBufferAllocate;
        byte[] bArrB = eeq.b(str);
        byte[] bArrA = eeq.a(bArrB.length);
        byte[] bArrH = eeq.h(i);
        byte[] bArrH2 = eeq.h(i2);
        if (musVar == null) {
            return;
        }
        String strC = musVar.c();
        if (strC != null && strC.contains("AW")) {
            byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 1 + bArrB.length);
            byteBufferAllocate.put((byte) 1).put(bArrA).put(bArrB);
        } else {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrA.length + 1 + bArrB.length + 12);
            byteBufferAllocate2.put((byte) 1).put(bArrA).put(bArrB).put((byte) 2).put((byte) 4).put(bArrH).put((byte) 3).put((byte) 4).put(bArrH2);
            byteBufferAllocate = byteBufferAllocate2;
        }
        LogUtil.a("HwFileTransferTaskManagerPart", "5.10.4 transferFileUnSuspendedPart: version:", strC);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(4);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        deviceCommand.setmIdentify(str2);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        b(deviceCommand);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback, Map<Integer, Map<Long, double[]>> map, Map<Integer, Integer> map2, Map<Integer, List<Long>> map3) {
        HashMap map4 = new HashMap(16);
        HashMap map5 = new HashMap(16);
        HashMap map6 = new HashMap(16);
        if (iBaseResponseCallback == null || map == null || map2 == null || map3 == null) {
            return;
        }
        for (Map.Entry<Integer, Map<Long, double[]>> entry : map.entrySet()) {
            map4.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
            map5.put(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<Integer, List<Long>> entry3 : map3.entrySet()) {
            map6.put(entry3.getKey(), entry3.getValue());
        }
        iBaseResponseCallback.a(AwarenessStatusCodes.AWARENESS_LOCATION_NOCACHE_CODE, new Object[]{map4, map5, map6});
    }

    public void e(byte[] bArr, int i) {
        if (CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") && !mjq.a()) {
            if (bArr == null || bArr.length <= 3 || bArr[2] != 1) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_trigger_beta_log_time");
                LogUtil.a("HwFileTransferTaskManagerPart", "DeviceTriggerDFXReceiver startMainteFile: sharedPreference = ", strE);
                long j = !TextUtils.isEmpty(strE) ? Long.parseLong(strE) : 0L;
                LogUtil.a("HwFileTransferTaskManagerPart", "DeviceTriggerDFXReceiver startMainteFile: curTime = ", Long.valueOf(jCurrentTimeMillis), ", lastTime = ", Long.valueOf(j), "Time interval is less than 2 hours");
                if (jCurrentTimeMillis - j < AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL) {
                    return;
                }
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("Dfx_HwFileTransferTaskManagerPart", "DeviceDFXReceiver NumberFormatException");
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "last_trigger_beta_log_time", String.valueOf(jCurrentTimeMillis), new StorageParams(0));
            mni.e(BaseApplication.getContext()).c();
            return;
        }
        LogUtil.d("HwFileTransferTaskManagerPart", "the version is not beta. do not support 11");
    }

    public void a(IBaseResponseCallback iBaseResponseCallback, Map<Integer, Map<Long, double[]>> map, Map<Integer, Integer> map2, Map<Integer, List<Long>> map3) {
        HashMap map4 = new HashMap(16);
        HashMap map5 = new HashMap(16);
        HashMap map6 = new HashMap(16);
        if (iBaseResponseCallback != null) {
            for (Map.Entry<Integer, Map<Long, double[]>> entry : map.entrySet()) {
                map4.put(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
                map5.put(entry2.getKey(), entry2.getValue());
            }
            for (Map.Entry<Integer, List<Long>> entry3 : map3.entrySet()) {
                map6.put(entry3.getKey(), entry3.getValue());
            }
            iBaseResponseCallback.a(AwarenessStatusCodes.AWARENESS_LOCATION_NOCACHE_CODE, new Object[]{map4, map5, map6});
        }
    }

    public void a(byte[] bArr, IBaseResponseCallback iBaseResponseCallback, ExtendHandler extendHandler) {
        if (bArr != null) {
            String strE = eeq.e(bArr);
            LogUtil.a("HwFileTransferTaskManagerPart", "COMMAND_ID_MAINT_QUERY_FILE_INFORMATION messageHex = ", strE);
            if (strE == null || strE.length() < 9) {
                return;
            }
            int iV = CommonUtil.v(strE.substring(8));
            if (iBaseResponseCallback != null) {
                mjh.e(this.e, iV, b(iV), iBaseResponseCallback);
            }
        }
        if (extendHandler != null) {
            extendHandler.removeMessages(7);
        }
    }

    public void c(IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface) {
        if (iBaseResponseCallback != null) {
            if (maintenaceInterface != null) {
                maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
                if (maintenaceInterface instanceof mjg) {
                    maintenaceInterface.setMaintRetryResult(true);
                }
            }
            mjh.e(this.e, 10002, "package error", iBaseResponseCallback);
        }
    }

    public void d(TransferFileInfo transferFileInfo, String str) {
        if (transferFileInfo == null || !b(transferFileInfo)) {
            return;
        }
        LogUtil.a("HwFileTransferTaskManagerPart", "initContinueTask isActiveDfx");
        d("DEVICE_MACADDRESS", str);
        d("TRANSMITTED_SIZE", Integer.toString(0));
        d("IS_CONTINUE", "false");
        d("CONTINUE_LOG_LIST", (String) null);
        d("CONTINUE_LOG_NAME", (String) null);
        if (c(mjj.d)) {
            return;
        }
        LogUtil.j("HwFileTransferTaskManagerPart", "mDeviceMac deleteFolder failed");
    }

    public void d(StringBuffer stringBuffer, ArrayList arrayList) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "filelist is first null");
        if (stringBuffer != null) {
            d("CONTINUE_LOG_LIST", stringBuffer.toString());
        }
        d("TRANSMITTED_SIZE", Integer.toString(0));
        d("IS_CONTINUE", "false");
        if (arrayList != null && !arrayList.isEmpty()) {
            d("CONTINUE_LOG_NAME", arrayList.get(0).toString());
        }
        if (c(mjj.d)) {
            return;
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "new task and compareList deleteFolder failed");
    }

    public boolean a(boolean z, TransferFileInfo transferFileInfo, long j, int i) {
        if (transferFileInfo != null && z && b(transferFileInfo)) {
            if ("true".equals(e("IS_CONTINUE"))) {
                return e(i, j);
            }
            d("LOG_CREATE_TIME", String.valueOf(j));
            d("TRANSMITTED_SIZE", String.valueOf(0));
            if (!c(mjj.d)) {
                ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "Comparelist deletefolder failed");
            }
        }
        return false;
    }

    private boolean e(int i, long j) {
        if (i != 1) {
            return false;
        }
        if (j == CommonUtil.m(BaseApplication.getContext(), e("LOG_CREATE_TIME"))) {
            LogUtil.a("HwFileTransferTaskManagerPart", "mFileCreateTime is continue");
            return true;
        }
        if (c(mjj.d)) {
            return false;
        }
        LogUtil.a("HwFileTransferTaskManagerPart", "Comparelist deletefolder failed");
        return false;
    }

    public void c(TransferFileInfo transferFileInfo, IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface) {
        if (maintenaceInterface == null) {
            LogUtil.j("HwFileTransferTaskManagerPart", "maintenanceSleepOrDfxUtil is null");
            return;
        }
        maintenaceInterface.onDestroyMaintenance();
        if (transferFileInfo != null && b(transferFileInfo)) {
            d("IS_CONTINUE", "false");
            d("TRANSMITTED_SIZE", Integer.toString(0));
            d("CONTINUE_LOG_NAME", (String) null);
            d("CONTINUE_LOG_LIST", (String) null);
            maintenaceInterface.cutFolder(mjj.d, mjj.f41752c);
            mnf.d(mnf.a(), mnf.c());
        }
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("Dfx_HwFileTransferTaskManagerPart", "callback is null");
        } else {
            maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
            LogUtil.a("HwFileTransferTaskManagerPart", "dataPath ", maintenaceInterface.getmTransferDataContentPath());
            mnt mntVar = new mnt();
            mntVar.e(maintenaceInterface.getmTransferDataContentPath());
            mntVar.c(maintenaceInterface.getmTransferStateContentPath());
            mjh.e(this.e, 10000, mntVar, iBaseResponseCallback);
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "maintenance success");
    }

    public void b(TransferFileInfo transferFileInfo, IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface) {
        if (maintenaceInterface == null) {
            LogUtil.j("HwFileTransferTaskManagerPart", "dfxOrSleepSendLogWifiPart maintenanceSleepOrDfxUtil is null");
            return;
        }
        maintenaceInterface.onDestroyMaintenance();
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("Dfx_HwFileTransferTaskManagerPart", "dfxOrSleepSendLogWifiPart callback is null");
        } else {
            LogUtil.a("HwFileTransferTaskManagerPart", "dfxOrSleepSendLogWifiPart UploadLogUtil.ENCYPTION_PATH final = " + mjh.f41743c.substring(0, mjh.f41743c.length() - 1));
            maintenaceInterface.cutFolder(mjj.e, mjh.f41743c.substring(0, mjh.f41743c.length() + (-1)));
            LogUtil.a("HwFileTransferTaskManagerPart", "dfxOrSleepSendLogWifiPart dataPath " + maintenaceInterface.getmTransferDataContentPath());
            mnt mntVar = new mnt();
            mntVar.e(maintenaceInterface.getmTransferDataContentPath());
            mntVar.c(maintenaceInterface.getmTransferStateContentPath());
            mjh.e(this.e, 10000, mntVar, iBaseResponseCallback);
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "dfxOrSleepSendLogWifiPart maintenance success");
    }

    public void d(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (z || iBaseResponseCallback == null) {
            return;
        }
        LogUtil.a("HwFileTransferTaskManagerPart", "is LEO return callback");
        iBaseResponseCallback.a(110002, null);
    }

    public void a(String str) {
        byte[] bArrB = eeq.b(str);
        byte[] bArrA = eeq.a(bArrB.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 1 + bArrB.length);
        byteBufferAllocate.put((byte) 1).put(bArrA).put(bArrB);
        LogUtil.a("HwFileTransferTaskManagerPart", "5.10.3 queryFileInformation");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        b(deviceCommand);
    }

    public void e(StringBuffer stringBuffer, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "filelist is different from the previou");
        if (stringBuffer != null) {
            d("CONTINUE_LOG_LIST", stringBuffer.toString());
        }
        d("TRANSMITTED_SIZE", Integer.toString(0));
        d("IS_CONTINUE", "false");
        d("CONTINUE_LOG_NAME", arrayList.get(0).toString());
        if (c(mjj.d)) {
            return;
        }
        ReleaseLogUtil.e("Dfx_HwFileTransferTaskManagerPart", "compareList deleteFolder failed");
    }

    public void b(IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface) {
        if (maintenaceInterface != null) {
            maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
            if (maintenaceInterface instanceof mjg) {
                maintenaceInterface.setMaintRetryResult(true);
            }
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(10001, "30s timeout");
        }
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(10000, new Object[]{new HashMap(16), new HashMap(16), new HashMap(16)});
        } else {
            LogUtil.j("HwFileTransferTaskManagerPart", "callback is null");
        }
    }

    public void d(String str, IBaseResponseCallback iBaseResponseCallback, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str) || !str.contains("sleep_data")) {
            return;
        }
        LogUtil.a("HwFileTransferTaskManagerPart", "progress is sleep_data");
        if (iBaseResponseCallback == null || i == 0 || i3 > i) {
            return;
        }
        LogUtil.a("HwFileTransferTaskManagerPart", "progress mCallback is not null");
        mnt mntVar = new mnt();
        mntVar.d((i2 * 100) / i);
        iBaseResponseCallback.a(20000, mntVar);
    }

    public void a(IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface, TransferFileInfo transferFileInfo, int i) {
        if (iBaseResponseCallback != null) {
            if (maintenaceInterface != null) {
                if (transferFileInfo != null && b(transferFileInfo) && i == 1) {
                    d("IS_CONTINUE", "true");
                    mnf.d(mnf.a(), mnf.c());
                }
                maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
            }
            if (maintenaceInterface instanceof mjg) {
                maintenaceInterface.setMaintRetryResult(true);
            }
            mjh.e(this.e, 10002, "package error", iBaseResponseCallback);
        }
    }

    public void a(final MaintenaceInterface maintenaceInterface, final ExtendHandler extendHandler, final TransferFileInfo transferFileInfo, final int i) {
        if (extendHandler != null) {
            extendHandler.removeMessages(13);
            extendHandler.sendEmptyMessage(13, 30000L);
        }
        if (maintenaceInterface != null) {
            maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    ExtendHandler extendHandler2;
                    LogUtil.a("HwFileTransferTaskManagerPart", "onResponse fileTransferDone: ", Integer.valueOf(i2));
                    ExtendHandler extendHandler3 = extendHandler;
                    if (extendHandler3 != null) {
                        extendHandler3.removeMessages(13);
                    }
                    if (i2 == 10001 && (extendHandler2 = extendHandler) != null) {
                        extendHandler2.sendEmptyMessage(12);
                        return;
                    }
                    TransferFileInfo transferFileInfo2 = transferFileInfo;
                    if (transferFileInfo2 != null && mnr.this.b(transferFileInfo2) && i == 1) {
                        maintenaceInterface.cutFolder(mjj.d, mjj.f41752c);
                        mnr.this.d("IS_CONTINUE", "false");
                        mnr.this.d("TRANSMITTED_SIZE", Integer.toString(0));
                    }
                    ExtendHandler extendHandler4 = extendHandler;
                    if (extendHandler4 != null) {
                        extendHandler4.sendEmptyMessage(14);
                    }
                }
            }, true);
        }
    }

    public void a(final int[] iArr, final IBaseResponseCallback iBaseResponseCallback, final MaintenaceInterface maintenaceInterface, final TransferFileInfo transferFileInfo, final int i) {
        if (maintenaceInterface == null || iBaseResponseCallback == null) {
            return;
        }
        if (maintenaceInterface instanceof mjj) {
            ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "Dfx callback fail and save the collected log locally");
            maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    TransferFileInfo transferFileInfo2 = transferFileInfo;
                    if (transferFileInfo2 != null && mnr.this.b(transferFileInfo2) && i == 1) {
                        mnr.this.d("IS_CONTINUE", "true");
                        mnf.d(mnf.a(), mnf.c());
                    }
                    maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
                    mjh.e(mnr.this.e, iArr[0], mnr.this.b(iArr[0]), iBaseResponseCallback);
                }
            }, true);
        } else {
            maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
            int i2 = iArr[0];
            iBaseResponseCallback.a(i2, b(i2));
        }
    }

    public void b(final IBaseResponseCallback iBaseResponseCallback, final MaintenaceInterface maintenaceInterface, final TransferFileInfo transferFileInfo, final int i) {
        if (maintenaceInterface == null || iBaseResponseCallback == null) {
            return;
        }
        maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                TransferFileInfo transferFileInfo2 = transferFileInfo;
                if (transferFileInfo2 != null && mnr.this.b(transferFileInfo2) && i == 1) {
                    mnr.this.d("IS_CONTINUE", "true");
                    mnf.d(mnf.a(), mnf.c());
                }
                maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(mnr.this.e, 10001, "30s timeout", iBaseResponseCallback);
            }
        }, true);
    }

    public void b(MaintenaceInterface maintenaceInterface, final ExtendHandler extendHandler, TransferFileInfo transferFileInfo, int i) {
        DeviceCommand deviceCommandTransferFileEndProcess = maintenaceInterface != null ? maintenaceInterface.transferFileEndProcess() : null;
        if (deviceCommandTransferFileEndProcess != null) {
            LogUtil.a("HwFileTransferTaskManagerPart", "addSleepOrDfxPlayDataToList transferFileEndProcess sendDeviceData");
            b(deviceCommandTransferFileEndProcess);
        }
        if (extendHandler == null || maintenaceInterface == null) {
            return;
        }
        if (maintenaceInterface instanceof mjg) {
            maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    extendHandler.sendEmptyMessage(14);
                }
            }, true);
            return;
        }
        if (maintenaceInterface instanceof mjj) {
            a(maintenaceInterface, extendHandler, transferFileInfo, i);
        } else if (maintenaceInterface instanceof mji) {
            LogUtil.a("HwFileTransferTaskManagerPart", "addSleepOrDfxPlayDataToList mMaintenanceSleepOrDfxUtil instanceof PeriodRRIFileUtil");
            maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("HwFileTransferTaskManagerPart", "PeriodRRIFileUtil save2File onResponse");
                    extendHandler.sendEmptyMessage(14);
                }
            }, true);
        } else {
            extendHandler.sendEmptyMessage(14);
        }
    }

    public void a(String str, String str2) {
        byte[] bArrB = eeq.b(str);
        byte[] bArrA = eeq.a(bArrB.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 1 + bArrB.length);
        byteBufferAllocate.put((byte) 1).put(bArrA).put(bArrB);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(3);
        deviceCommand.setmIdentify(str2);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "5.10.3 querySleepOrDfxFileInformationPart");
        b(deviceCommand);
    }

    public void b(String str) {
        String strD = eeq.d(255);
        String strD2 = eeq.d(3);
        String strD3 = eeq.d(0);
        String strC = eeq.c(0L);
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (String str2 : Arrays.asList(strD, strD2, strC, strD3)) {
            sb.append(eeq.d(i) + eeq.d(str2.length() / 2) + str2);
            i++;
        }
        String string = sb.toString();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(10);
        deviceCommand.setmIdentify(str);
        deviceCommand.setDataContent(eeq.c(string));
        deviceCommand.setDataLen(eeq.c(string).length);
        b(deviceCommand);
    }

    public void b(final int i, final IBaseResponseCallback iBaseResponseCallback, final MaintenaceInterface maintenaceInterface, final TransferFileInfo transferFileInfo, final int i2) {
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "Dfx 0a04 returns an error, save the collected log locally");
        if (maintenaceInterface == null || iBaseResponseCallback == null) {
            return;
        }
        maintenaceInterface.save2File(new IBaseResponseCallback() { // from class: mnr.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                TransferFileInfo transferFileInfo2 = transferFileInfo;
                if (transferFileInfo2 != null && mnr.this.b(transferFileInfo2) && i2 == 1) {
                    mnr.this.d("IS_CONTINUE", "true");
                    mnf.d(mnf.a(), mnf.c());
                }
                maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
                mjh.e(mnr.this.e, i, mnr.this.b(i), iBaseResponseCallback);
            }
        }, true);
    }

    public void e(TransferFileInfo transferFileInfo) {
        if (transferFileInfo == null || !b(transferFileInfo)) {
            return;
        }
        d("TRANSMITTED_SIZE", Integer.toString(0));
        d("IS_CONTINUE", "false");
        d("CONTINUE_LOG_LIST", (String) null);
        d("CONTINUE_LOG_NAME", (String) null);
        d("LOG_CREATE_TIME", (String) null);
        mnf.d(mnf.a(), mnf.c());
    }

    public void b(ArrayList arrayList) {
        d("IS_CONTINUE", "false");
        d("TRANSMITTED_SIZE", Integer.toString(0));
        if (arrayList != null && !arrayList.isEmpty()) {
            d("CONTINUE_LOG_NAME", arrayList.get(0).toString());
        } else {
            d("CONTINUE_LOG_NAME", (String) null);
        }
    }

    public void a(IBaseResponseCallback iBaseResponseCallback, MaintenaceInterface maintenaceInterface, String str, String str2) {
        if (iBaseResponseCallback == null || maintenaceInterface == null) {
            return;
        }
        maintenaceInterface.cutFolder(mjj.e, mjj.f41752c);
        if (maintenaceInterface instanceof mjg) {
            maintenaceInterface.setMaintRetryResult(true);
        }
        mjh.e(this.e, 10002, b().b(str, str2), iBaseResponseCallback);
    }

    public void d(ArrayList arrayList) {
        b().d("IS_CONTINUE", "false");
        b().d("TRANSMITTED_SIZE", Integer.toString(0));
        if (arrayList == null || arrayList.isEmpty()) {
            b().d("CONTINUE_LOG_NAME", (String) null);
        } else {
            b().d("CONTINUE_LOG_NAME", arrayList.get(0).toString());
        }
    }

    public String b(String str, String str2) {
        String str3 = str + ";" + str2;
        ReleaseLogUtil.d("Dfx_HwFileTransferTaskManagerPart", "reportStatusFileList result = ", str3);
        return str3;
    }

    public int d(String str, String str2) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1014), str, str2, null);
    }

    public String e(String str) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1014), str);
    }

    public void e(TransferFileInfo transferFileInfo, int i) {
        if (!b(transferFileInfo) || i == -1) {
            return;
        }
        if (i == 1) {
            d("IS_CONTINUE", "true");
        } else {
            d("IS_CONTINUE", "false");
        }
    }

    public boolean d(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                LogUtil.j("HwFileTransferTaskManagerPart", "other command.");
                return false;
        }
    }

    public void c(ExtendHandler extendHandler, int i) {
        if (extendHandler != null) {
            extendHandler.removeMessages(i);
        }
    }

    public void c(int i, ExtendHandler extendHandler) {
        if (extendHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 14;
            messageObtain.arg1 = i;
            messageObtain.arg2 = 10003;
            extendHandler.sendMessage(messageObtain);
        }
    }

    public void a(TransferFileInfo transferFileInfo) {
        this.e = transferFileInfo;
    }
}
