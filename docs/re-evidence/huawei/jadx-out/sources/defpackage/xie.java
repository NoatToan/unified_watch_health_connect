package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes20.dex */
public class xie {
    public static void e(xif xifVar) {
        HwWifiP2pTransferManager.a().q();
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI != null) {
            LogUtil.b("WifiP2pTransferCommand", "set wait 2");
            xiaVarI.i(2);
        }
        if (xifVar == null) {
            HwWifiP2pTransferManager.a().b(1008, "wifi go info wrong");
            LogUtil.e("WifiP2pTransferCommand", "sendWifiInfoToDevice, wifiP2pGoInfo is null");
            return;
        }
        byte[] bArrH = h(xifVar.d());
        byte[] bArrJ = j(xifVar.e());
        byte[] bArrB = b();
        byte[] bArrA = a();
        byte[] bArrE = e();
        byte[] bArrD = d();
        byte[] bArrH2 = h(xifVar.c());
        int length = bArrH.length;
        int length2 = bArrJ.length;
        int length3 = bArrA.length;
        int length4 = bArrE.length;
        int length5 = bArrD.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 1 + length2 + length3 + length4 + length5 + bArrB.length + bArrH2.length);
        byteBufferAllocate.put((byte) 1).put(bArrH).put(bArrJ).put(bArrB).put(bArrA).put(bArrE).put(bArrD).put(bArrH2);
        cpl.d("WifiP2pTransferCommand", byteBufferAllocate.array(), "5.54.1 send ");
        xiu xiuVarD = d(byteBufferAllocate);
        if (xiuVarD == null) {
            LogUtil.d("WifiP2pTransferCommand", "sendWifiInfoToDevice, sendMessage is null");
            HwWifiP2pTransferManager.a().b(1009, "wrap 5.54.1 info wrong, please check.");
        } else {
            HwWifiP2pTransferManager.a().x();
            HwWifiP2pTransferManager.a().e(xiuVarD);
        }
    }

    private static xiu d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            LogUtil.e("WifiP2pTransferCommand", "createMessage messageByteBuffer is null");
            return null;
        }
        xiu.c cVar = new xiu.c();
        cVar.a(byteBuffer.array());
        return cVar.c();
    }

    public static void c(byte[] bArr) {
        if (bArr == null) {
            LogUtil.e("WifiP2pTransferCommand", "handleDeviceCommonResponseCode dataInfos is null");
            return;
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        Iterator<cqa> it = cqbVarA.b().iterator();
        while (it.hasNext()) {
            LogUtil.b("WifiP2pTransferCommand", "handleDeviceCommonResponseCode value is: ", Integer.valueOf(cpb.a(it.next().c())));
        }
    }

    public static void a(byte[] bArr) {
        HwWifiP2pTransferManager.a().q();
        if (c()) {
            return;
        }
        if (bArr == null) {
            LogUtil.e("WifiP2pTransferCommand", "handleDeviceReportP2pConnectResult dataInfos is null");
            HwWifiP2pTransferManager.a().b(1005, "5.54.2 data is null.");
            return;
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        int iA = 1;
        for (cqa cqaVar : cqbVarA.b()) {
            if (cpb.a(cqaVar.b()) == 1) {
                iA = cpb.a(cqaVar.c());
            }
        }
        if (iA == 0) {
            LogUtil.b("WifiP2pTransferCommand", "handleDeviceReportP2pConnectResult createServerSocket");
            int iB = HwWifiP2pTransferManager.a().b();
            ThreadPoolManager.c().execute(new Runnable() { // from class: xie.2
                @Override // java.lang.Runnable
                public void run() {
                    HwWifiP2pTransferManager.a().e();
                }
            });
            o(iB);
            HwWifiP2pTransferManager.a().e(true);
            return;
        }
        lng.f();
        lng.c("WifiP2PTransfer", "Device replies 5.54.2, wifi connect failed.");
        HwWifiP2pTransferManager.a().b(1006, "5.54.2 device connect fail");
    }

    private static boolean c() {
        if (HwWifiP2pTransferManager.a().f() == null || TransferFileQueueManager.b().b("bt_change_wifi_check_cancel") != null) {
            return false;
        }
        HwWifiP2pTransferManager.a().b((HwWifiP2pTransferManager.TransferBleToWifiCallback) null);
        HwWifiP2pTransferManager.a().c();
        HwWifiP2pTransferManager.a().c("no bt task");
        return true;
    }

    public static void b(xia xiaVar) {
        ByteBuffer byteBufferAllocate;
        if (xiaVar == null) {
            return;
        }
        LogUtil.b("WifiP2pTransferCommand", "set wait 5");
        xiaVar.i(5);
        byte[] bArrA = a(xiaVar.j());
        byte[] bArrI = i(xiaVar.l());
        byte[] bArrD = d((int) xiaVar.g());
        byte[] bArrC = c(xiaVar.d());
        if (xiaVar.l() == 7) {
            byteBufferAllocate = e(xiaVar, bArrA, bArrI, bArrD, bArrC);
        } else if (xiaVar.l() == 1) {
            byte[] bArrQ = q(xiaVar.j());
            byte[] bArrT = t(xiaVar.j());
            int length = bArrA.length;
            int length2 = bArrD.length;
            int length3 = bArrC.length;
            int length4 = bArrI.length;
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length + 1 + length2 + length3 + length4 + bArrQ.length + bArrT.length);
            byteBufferAllocate2.put((byte) 5).put(bArrA).put(bArrD).put(bArrI).put(bArrC).put(bArrQ).put(bArrT);
            byteBufferAllocate = byteBufferAllocate2;
        } else {
            int length5 = bArrA.length;
            int length6 = bArrD.length;
            byteBufferAllocate = ByteBuffer.allocate(length5 + 1 + length6 + bArrC.length + bArrI.length);
            byteBufferAllocate.put((byte) 5).put(bArrA).put(bArrD).put(bArrI).put(bArrC);
        }
        a(byteBufferAllocate);
    }

    public static void a(xia xiaVar) {
        byte[] bArrI;
        if (xiaVar == null) {
            return;
        }
        byte[] bArrA = a(xiaVar.j());
        if (xiaVar.ad()) {
            bArrI = i(10);
        } else {
            bArrI = i(xiaVar.l());
        }
        byte[] bArrE = new byte[0];
        if (xiaVar.ad()) {
            cqj cqjVar = new cqj();
            cqjVar.j(6, 0);
            bArrE = cqjVar.e();
        }
        int length = bArrA.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 1 + bArrI.length + bArrE.length);
        byteBufferAllocate.put((byte) 10).put(bArrA).put(bArrI);
        if (bArrE.length > 0) {
            byteBufferAllocate.put(bArrE);
        }
        a(byteBufferAllocate);
    }

    private static ByteBuffer e(xia xiaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArrE = e(xiaVar.i());
        byte[] bArrG = g(xiaVar.y());
        byte[] bArrB = b(xiaVar.c());
        byte[] bArrI = i(xiaVar.x());
        byte[] bArrD = d(xiaVar.b());
        int length = bArr.length;
        int length2 = bArr3.length;
        int length3 = bArr4.length;
        int length4 = bArr2.length;
        int length5 = bArrE.length;
        int length6 = bArrG.length;
        int length7 = bArrB.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 1 + length2 + length3 + length4 + length5 + length6 + length7 + bArrI.length + bArrD.length);
        byteBufferAllocate.put((byte) 5).put(bArr).put(bArr3).put(bArr2).put(bArr4).put(bArrE).put(bArrG).put(bArrB).put(bArrI).put(bArrD);
        return byteBufferAllocate;
    }

    private static void a(ByteBuffer byteBuffer) {
        cpl.d("WifiP2pTransferCommand", byteBuffer.array(), "5.54.5 content is: ");
        xiu xiuVarD = d(byteBuffer);
        if (xiuVarD == null) {
            LogUtil.e("WifiP2pTransferCommand", "sendNotifyDevice, sendMessage is null");
        } else {
            HwWifiP2pTransferManager.a().x();
            HwWifiP2pTransferManager.a().e(xiuVarD);
        }
    }

    private static byte[] e(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 11;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] g(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 12;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] b(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 13;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] i(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 14;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 15;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] a(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 1;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] i(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 2;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static byte[] d(int i) {
        byte[] bArrG = cph.g(i);
        byte[] bArrE = cph.e(bArrG.length);
        byte[] bArr = new byte[bArrG.length + 1 + bArrE.length];
        bArr[0] = 3;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrG, 0, bArr, bArrE.length + 1, bArrG.length);
        return bArr;
    }

    private static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        byte[] bArrD = cph.d(str);
        byte[] bArrE = cph.e(bArrD.length);
        byte[] bArr = new byte[bArrD.length + 1 + bArrE.length];
        bArr[0] = 4;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrD, 0, bArr, bArrE.length + 1, bArrD.length);
        return bArr;
    }

    private static byte[] q(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 2) {
            return null;
        }
        byte[] bArrE = cph.e(strArrSplit[0]);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 7;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] t(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 2) {
            return null;
        }
        byte[] bArrE = cph.e(strArrSplit[1]);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 8;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    public static void a(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null) {
            LogUtil.e("WifiP2pTransferCommand", "handleNotifyRequestFile data is null");
            return;
        }
        try {
            cql.c cVarA = new cql().a(bArr, 3);
            String strE = cVarA.e((byte) 1, "");
            String strE2 = cVarA.e((byte) 3, "");
            String strE3 = cVarA.e((byte) 4, "");
            String strE4 = cVarA.e((byte) 5, "");
            String strE5 = cVarA.e((byte) 6, "");
            if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strE2) || TextUtils.isEmpty(strE3) || TextUtils.isEmpty(strE4) || TextUtils.isEmpty(strE5)) {
                LogUtil.e("WifiP2pTransferCommand", "handleNotifyRequestFile data is null");
                return;
            }
            LogUtil.b("WifiP2pTransferCommand", "5.54.12 notify request file:", strE);
            cqj cqjVar = new cqj();
            cqjVar.b(1, strE);
            cqjVar.g(2, 0);
            cqjVar.b(3, strE2);
            cqjVar.b(4, strE3);
            cqjVar.b(5, strE4);
            cqjVar.b(6, strE5);
            byte[] bArrE = cqjVar.e();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + 1);
            byteBufferAllocate.put((byte) 12).put(bArrE);
            HwWifiP2pTransferManager.a().e(d(byteBufferAllocate));
            xhr xhrVar = new xhr();
            xhrVar.g(7);
            xhrVar.c(strE);
            xhrVar.o(2);
            xhrVar.a(2147483647L);
            xhrVar.g(strE2);
            xhrVar.j(strE4);
            xhrVar.a(strE3);
            xhrVar.e(strE5);
            xhrVar.g(true);
            UniteDevice uniteDevice = new UniteDevice();
            uniteDevice.setIdentify(deviceInfo.getDeviceMac());
            uniteDevice.setDeviceInfo(deviceInfo);
            xhrVar.c(uniteDevice);
            try {
                xhrVar.d(CommonUtil.c(BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "common_file_request" + File.separator + xhw.c(deviceInfo.getDeviceMac()) + File.separator + xhrVar.n()));
                xin.d().d(xhrVar);
            } catch (IOException e) {
                LogUtil.e("WifiP2pTransferCommand", "handleNotifyRequestFile set file path error:", ExceptionUtils.c(e));
            }
        } catch (cpy e2) {
            LogUtil.d("WifiP2pTransferCommand", "handleNotifyRequestFile exception : " + ExceptionUtils.c(e2));
        }
    }

    public static void e(byte[] bArr) {
        HwWifiP2pTransferManager.a().q();
        if (HwWifiP2pTransferManager.a().i() == null) {
            LogUtil.e("WifiP2pTransferCommand", "fileInfo is null, please check");
            return;
        }
        if (bArr == null) {
            LogUtil.d("WifiP2pTransferCommand", "handleGetTransferFileInfoResponse dataInfos is null");
            HwWifiP2pTransferManager.a().b(1007, "5.54.10 is null");
            return;
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        int iA = 0;
        int iA2 = 100000;
        String str = "";
        int iA3 = 0;
        int iA4 = 0;
        for (cqa cqaVar : cqbVarA.b()) {
            int iA5 = cpb.a(cqaVar.b());
            if (iA5 == 1) {
                String[] strArrSplit = cph.a(cqaVar.c()).split("_");
                str = strArrSplit[strArrSplit.length - 1];
            } else if (iA5 == 3) {
                iA = cpb.a(cqaVar.c());
            } else if (iA5 == 5) {
                iA3 = cpb.a(cqaVar.c());
            } else if (iA5 == 10) {
                iA4 = cpb.a(cqaVar.c());
            } else if (iA5 != 127) {
                LogUtil.e("WifiP2pTransferCommand", "unknown type : ", Integer.valueOf(iA5));
            } else {
                iA2 = cpb.a(cqaVar.c());
            }
        }
        LogUtil.b("WifiP2pTransferCommand", "raw file size:" + iA + " code: " + iA2 + " fileId: " + iA3 + " socketBufferSize:" + iA4 + "crc: " + str);
        a(iA, iA2, iA3, iA4, str);
    }

    private static void a(int i, int i2, int i3, int i4, String str) {
        WifiP2pTransferListener wifiP2pTransferListenerN;
        if (i2 != 100000 || i <= 0) {
            xia xiaVarJ = HwWifiP2pTransferManager.a().j();
            if (xiaVarJ == null || (wifiP2pTransferListenerN = xiaVarJ.n()) == null) {
                return;
            }
            LogUtil.b("WifiP2pTransferCommand", "downloadFileInfoCallback get error,");
            wifiP2pTransferListenerN.onFail(i2, "downloadFileInfoCallback get error", xiaVarJ.l());
            return;
        }
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        xiaVarI.d(i);
        xiaVarI.d(i3);
        xiaVarI.d(str);
        xiaVarI.a(i4);
        e(xiaVarI);
    }

    private static void e(xia xiaVar) {
        byte[] bArrI;
        byte[] bArrA = a(xiaVar.j());
        byte[] bArrD = d((int) xiaVar.g());
        if (xiaVar.ad()) {
            bArrI = i(10);
        } else {
            bArrI = i(xiaVar.l());
        }
        int length = bArrA.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 1 + bArrD.length + bArrI.length);
        byteBufferAllocate.put((byte) 11).put(bArrA).put(bArrI).put(bArrD);
        xiaVar.h(2);
        LogUtil.b("WifiP2pTransferCommand", "start file : ", xiaVar, "file path : ", xiaVar.f(), " tag : ", Integer.valueOf(xiaVar.w()));
        HwWifiP2pTransferManager.a().a(xiaVar);
        a(byteBufferAllocate);
    }

    public static void b(byte[] bArr) {
        HwWifiP2pTransferManager.a().q();
        if (HwWifiP2pTransferManager.a().i() == null) {
            LogUtil.e("WifiP2pTransferCommand", "fileInfo is null, please check");
            return;
        }
        if (bArr == null) {
            LogUtil.d("WifiP2pTransferCommand", "handleNotifyTransferFileInfoResponse dataInfos is null");
            HwWifiP2pTransferManager.a().b(1007, "5.54.5 is null");
            return;
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        int iA = 0;
        long jD = 0;
        int iA2 = 100000;
        int iA3 = 0;
        for (cqa cqaVar : cqbVarA.b()) {
            int iA4 = cpb.a(cqaVar.b());
            if (iA4 == 5) {
                iA = cpb.a(cqaVar.c());
            } else if (iA4 == 6) {
                jD = cpb.d(cqaVar.c());
            } else if (iA4 == 10) {
                iA3 = cpb.a(cqaVar.c());
            } else if (iA4 != 127) {
                LogUtil.e("WifiP2pTransferCommand", "unknown type : ", Integer.valueOf(iA4));
            } else {
                iA2 = cpb.a(cqaVar.c());
            }
        }
        d(iA, jD, iA3, iA2);
    }

    private static void d(int i, long j, int i2, int i3) {
        WifiP2pTransferListener wifiP2pTransferListenerN;
        if (i3 == 100005) {
            xia xiaVarJ = HwWifiP2pTransferManager.a().j();
            if (xiaVarJ == null || (wifiP2pTransferListenerN = xiaVarJ.n()) == null) {
                return;
            }
            LogUtil.b("WifiP2pTransferCommand", "device wi-fi send file.");
            wifiP2pTransferListenerN.onFail(1007, "device is using wi-fi", xiaVarJ.l());
            return;
        }
        HwWifiP2pTransferManager hwWifiP2pTransferManagerA = HwWifiP2pTransferManager.a();
        xia xiaVarI = hwWifiP2pTransferManagerA.i();
        if (xiaVarI == null) {
            HwWifiP2pTransferManager.a().e(1024, "5.54.5 unknown error, file info is empty.", i);
            return;
        }
        if (!hwWifiP2pTransferManagerA.c(i, xiaVarI.a())) {
            LogUtil.d("WifiP2pTransferCommand", "no support file : ", Integer.valueOf(i));
            HwWifiP2pTransferManager.a().e(1023, "5.54.5 device file type is wrong, capability not support : " + i, i);
            return;
        }
        if (hwWifiP2pTransferManagerA.i() != null) {
            LogUtil.b("WifiP2pTransferCommand", "5.54.5 rec");
            xia xiaVarI2 = hwWifiP2pTransferManagerA.i();
            xiaVarI2.i(0);
            if (j > xiaVarI2.g()) {
                HwWifiP2pTransferManager.a().e(1024, "5.54.5 offset bigger than file size, wrong.", i);
                return;
            }
            xiaVarI2.d(i);
            xiaVarI2.b(j);
            xiaVarI2.h(2);
            xiaVarI2.a(i2);
            LogUtil.b("WifiP2pTransferCommand", "start file : ", xiaVarI2, "file path : ", xiaVarI2.f(), " tag : ", Integer.valueOf(xiaVarI2.w()));
            hwWifiP2pTransferManagerA.a(xiaVarI2);
            return;
        }
        HwWifiP2pTransferManager.a().e(1024, "5.54.5 unknown error, file info is empty.", i);
    }

    public static void a(int i, int i2) {
        HwWifiP2pTransferManager.a().q();
        byte[] bArrF = f(i2);
        byte[] bArrE = e(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + 1 + bArrE.length);
        byteBufferAllocate.put((byte) 6).put(bArrF).put(bArrE);
        xiu xiuVarD = d(byteBufferAllocate);
        if (xiuVarD == null) {
            LogUtil.d("WifiP2pTransferCommand", "notifyDeviceCancelTransfer, sendMessage is null");
            return;
        }
        cpl.d("WifiP2pTransferCommand", byteBufferAllocate.array(), "5.54.6 send : ");
        HwWifiP2pTransferManager.a().x();
        HwWifiP2pTransferManager.a().e(xiuVarD);
    }

    private static byte[] f(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 1;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static byte[] e(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 2;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static byte[] a(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 1;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    public static void c(int i) {
        byte[] bArrA = a(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 1);
        byteBufferAllocate.put((byte) 7);
        byteBufferAllocate.put(bArrA);
        cpl.d("WifiP2pTransferCommand", byteBufferAllocate.array(), "5.54.7 content is:");
        xiu xiuVarD = d(byteBufferAllocate);
        if (xiuVarD == null) {
            LogUtil.d("WifiP2pTransferCommand", "notifyDeviceFileTransferFinish, sendMessage is null");
        } else {
            HwWifiP2pTransferManager.a().e(xiuVarD);
        }
    }

    public static void e(int i, int i2) {
        cqj cqjVar = new cqj();
        cqjVar.g(1, i);
        cqjVar.j(127, i2);
        byte[] bArrE = cqjVar.e();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrE.length + 1);
        byteBufferAllocate.put((byte) 7);
        byteBufferAllocate.put(bArrE);
        cpl.d("WifiP2pTransferCommand", byteBufferAllocate.array(), "5.54.7 content is:");
        xiu xiuVarD = d(byteBufferAllocate);
        if (xiuVarD == null) {
            LogUtil.d("WifiP2pTransferCommand", "notifyDeviceFileTransferFinish, sendMessage is null");
        } else {
            HwWifiP2pTransferManager.a().e(xiuVarD);
        }
    }

    public static void b(int i) {
        byte[] bArrF = f(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + 1);
        byteBufferAllocate.put((byte) 8);
        byteBufferAllocate.put(bArrF);
        xiu xiuVarD = d(byteBufferAllocate);
        if (xiuVarD == null) {
            LogUtil.d("WifiP2pTransferCommand", "notifyDeviceStopWifiP2p, sendMessage is null");
        } else {
            LogUtil.b("WifiP2pTransferCommand", "5.54.8 send");
            HwWifiP2pTransferManager.a().e(xiuVarD);
        }
    }

    public static void d(byte[] bArr) {
        HwWifiP2pTransferManager.a().q();
        if (c()) {
            return;
        }
        if (bArr == null) {
            LogUtil.d("WifiP2pTransferCommand", "handleDeviceReportSocketConnectResult, dataInfos is null");
            HwWifiP2pTransferManager.a().b(1025, "5.54.4 device info is null");
            return;
        }
        cqb cqbVarA = xik.a(bArr);
        if (cqbVarA == null) {
            return;
        }
        Iterator<cqa> it = cqbVarA.b().iterator();
        int iA = 1;
        while (it.hasNext()) {
            iA = cpb.a(it.next().c());
        }
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI == null) {
            LogUtil.e("WifiP2pTransferCommand", "5.54.4 file info is null, please check.");
            return;
        }
        int iM = xiaVarI.m();
        LogUtil.b("WifiP2pTransferCommand", "5.54.4 value : ", Integer.valueOf(iA), "model : ", Integer.valueOf(iM));
        c(iA, iM, xiaVarI);
    }

    private static void c(int i, final int i2, final xia xiaVar) {
        if (i == 0) {
            if (xii.d().e() == null) {
                LogUtil.b("WifiP2pTransferCommand", "check at once, no socket.");
                new Timer("adapterValue").schedule(new TimerTask() { // from class: xie.4
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        if (xii.d().e() != null) {
                            xie.d(0, i2, xiaVar);
                        } else {
                            LogUtil.b("WifiP2pTransferCommand", "check socket, no socket, link fail");
                            xie.d(1, i2, xiaVar);
                        }
                    }
                }, 2000L);
                return;
            } else {
                d(i, i2, xiaVar);
                return;
            }
        }
        d(i, i2, xiaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i, int i2, xia xiaVar) {
        if (i == 0) {
            b(i2, xiaVar);
            return;
        }
        HwWifiP2pTransferManager.TransferBleToWifiCallback transferBleToWifiCallbackF = HwWifiP2pTransferManager.a().f();
        if (transferBleToWifiCallbackF != null) {
            LogUtil.b("WifiP2pTransferCommand", "callback is not null.");
            transferBleToWifiCallbackF.onResult(false);
            HwWifiP2pTransferManager.a().b((HwWifiP2pTransferManager.TransferBleToWifiCallback) null);
        } else {
            lng.f();
            lng.c("WifiP2PTransfer", "Devices replies 5.54.4 socket connect failed.");
            HwWifiP2pTransferManager.a().b(1013, "5.54.4 not connect success.");
        }
    }

    private static void b(int i, xia xiaVar) {
        WifiP2pTransferListener wifiP2pTransferListenerN;
        lng.j();
        if ((i & 1) == 1) {
            LogUtil.d("WifiP2pTransferCommand", "handleDeviceReportSocketConnectResult, send 54.5");
            HwWifiP2pTransferManager.TransferBleToWifiCallback transferBleToWifiCallbackF = HwWifiP2pTransferManager.a().f();
            if (transferBleToWifiCallbackF != null) {
                LogUtil.b("WifiP2pTransferCommand", "callback is not null.");
                transferBleToWifiCallbackF.onResult(true);
                HwWifiP2pTransferManager.a().b((HwWifiP2pTransferManager.TransferBleToWifiCallback) null);
                return;
            } else {
                LogUtil.b("WifiP2pTransferCommand", String.format(Locale.ROOT, "processSuccessResult, fileType is {%d}", Integer.valueOf(xiaVar.l())));
                if (xiaVar.u() == 2) {
                    a(xiaVar);
                } else {
                    b(xiaVar);
                }
            }
        }
        if ((i & 2) != 2 || (wifiP2pTransferListenerN = xiaVar.n()) == null) {
            return;
        }
        wifiP2pTransferListenerN.onSuccess(1000, "send 5.9.9", -1);
    }

    private static byte[] h(String str) {
        if (str == null) {
            LogUtil.d("WifiP2pTransferCommand", "getSsidTlv, networkName is null");
            return new byte[0];
        }
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 1;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] j(String str) {
        if (str == null) {
            LogUtil.d("WifiP2pTransferCommand", "getPwdTlv, passPhrase is null");
            return new byte[0];
        }
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 2;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] a() {
        byte[] bArrF = cph.f(0);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 5;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static void o(int i) {
        xif xifVarN = HwWifiP2pTransferManager.a().n();
        if (xifVarN == null) {
            LogUtil.d("WifiP2pTransferCommand", "notifySocketServerInfo, wifiP2pGoInfo is null");
            HwWifiP2pTransferManager.a().b(1010, "5.54.3 wifi go exception");
            return;
        }
        byte[] bArrF = f(xifVarN.b());
        if (bArrF.length == 0) {
            LogUtil.d("WifiP2pTransferCommand", "notifySocketServerInfo, serverSocketIp is null");
            HwWifiP2pTransferManager.a().b(1011, "5.54.3 wifi ip wrong");
            return;
        }
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI != null) {
            LogUtil.b("WifiP2pTransferCommand", "set wait 4");
            xiaVarI.i(4);
        }
        LogUtil.b("WifiP2pTransferCommand", "send port : ", Integer.valueOf(i));
        byte[] bArrG = g(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + bArrG.length + 1);
        byteBufferAllocate.put((byte) 3).put(bArrF).put(bArrG);
        cpl.d("WifiP2pTransferCommand", byteBufferAllocate.array(), "5.54.3 content is:");
        xiu xiuVarD = d(byteBufferAllocate);
        if (xiuVarD == null) {
            LogUtil.d("WifiP2pTransferCommand", "notifySocketServerInfo, sendMessage is null");
            HwWifiP2pTransferManager.a().b(1012, "5.54.3 wrap info exception");
        } else {
            HwWifiP2pTransferManager.a().x();
            HwWifiP2pTransferManager.a().e(xiuVarD);
        }
    }

    private static byte[] f(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("WifiP2pTransferCommand", "getServerSocketIpTlv, serverSocketIp is null");
            return new byte[0];
        }
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 1;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] g(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 2;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static byte[] e() {
        byte[] bArrF = cph.f(xik.a());
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 6;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static byte[] d() {
        byte[] bArrE = cph.e(xik.b(HwWifiP2pTransferManager.a().d()));
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 7;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] b() {
        byte[] bArrF = cph.f(2);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 3;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static byte[] h(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 8;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    public static void d(xia xiaVar) {
        if (xiaVar == null) {
            LogUtil.e("WifiP2pTransferCommand", "commonFileInfo is null");
            return;
        }
        xiu xiuVarC = c(xiaVar);
        if (xiuVarC == null) {
            LogUtil.d("WifiP2pTransferCommand", "sendWifiInfoToDevice, sendMessage is null");
            HwWifiP2pTransferManager.a().b(1009, "wrap 5.54.9 info wrong, please check.");
        } else {
            HwWifiP2pTransferManager.a().x();
            HwWifiP2pTransferManager.a().e(xiuVarC);
        }
    }

    private static xiu c(xia xiaVar) {
        int iL = xiaVar.l();
        LogUtil.b("WifiP2pTransferCommand", "getFileType:", Integer.valueOf(iL), "getFileDescription:", xiaVar.i(), "getSrcPackageName:", xiaVar.y(), "getDesPackageName:", xiaVar.c(), "getSrcCertificate:", xiaVar.x(), "getDesCertificate:", xiaVar.b());
        byte[] bArrJ = j(xiaVar.l());
        byte[] bArrL = l(xiaVar.i());
        byte[] bArrO = o(xiaVar.y());
        byte[] bArrK = k(xiaVar.c());
        byte[] bArrM = m(xiaVar.x());
        byte[] bArrN = n(xiaVar.b());
        int length = bArrJ.length;
        int length2 = bArrL.length;
        int length3 = bArrO.length;
        int length4 = bArrK.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 1 + length2 + length3 + length4 + bArrM.length + bArrN.length);
        byteBufferAllocate.put((byte) 9).put(bArrJ).put(bArrL).put(bArrO).put(bArrK).put(bArrM).put(bArrN);
        cpl.d("WifiP2pTransferCommand", byteBufferAllocate.array(), "5.54.9 send ");
        return d(byteBufferAllocate);
    }

    public static int a(xia xiaVar, int i) {
        if (xiaVar == null) {
            LogUtil.e("WifiP2pTransferCommand", "commonFileInfo is null");
            return 0;
        }
        LogUtil.b("WifiP2pTransferCommand", "findCommonFileInfoSupportStatus : ", Integer.valueOf(i));
        xiu xiuVarC = c(xiaVar);
        if (xiuVarC == null) {
            LogUtil.d("WifiP2pTransferCommand", "sendWifiInfoToDevice, sendMessage is null");
            return 0;
        }
        return f(HwWifiP2pTransferManager.a().b(xiuVarC, i));
    }

    private static int f(byte[] bArr) {
        int iA = 0;
        if (bArr != null && bArr.length != 0) {
            cqb cqbVarA = xik.a(bArr);
            if (cqbVarA == null) {
                return 0;
            }
            for (cqa cqaVar : cqbVarA.b()) {
                if (cpb.a(cqaVar.b()) == 2) {
                    iA = cpb.a(cqaVar.c());
                } else {
                    LogUtil.e("WifiP2pTransferCommand", "unknown tag : ", Integer.valueOf(cpb.a(cqaVar.b())));
                }
            }
        }
        return iA;
    }

    private static byte[] j(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(bArrF.length);
        byte[] bArr = new byte[bArrF.length + 1 + bArrE.length];
        bArr[0] = 1;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrF, 0, bArr, bArrE.length + 1, bArrF.length);
        return bArr;
    }

    private static byte[] l(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 3;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] o(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 4;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] k(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 5;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] m(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 6;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] n(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 7;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }
}
