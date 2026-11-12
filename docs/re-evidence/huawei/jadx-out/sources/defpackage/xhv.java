package defpackage;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public class xhv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53017a = BaseApplication.b().getFilesDir() + "/fileShare/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53018c = "watchfacePhoto" + File.separator + WatchFaceProvider.BACKGROUND_LABEL;
    private static final String e = "watchfaceVideo" + File.separator + WatchFaceProvider.BACKGROUND_LABEL;

    public static boolean d(String str) {
        return str == null || str.indexOf(FeedbackWebConstants.INVALID_FILE_NAME_PRE) < 0;
    }

    public static int d(int i, int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if (i % i2 == 0) {
            i3 = i / i2;
        } else {
            i3 = (i / i2) + 1;
        }
        LogUtil.b("TransFileCommandUtills", "sendDataToDevice, file_array :", Integer.valueOf(i3));
        return i3;
    }

    public static int d(int i, int i2, int i3) {
        if ((i - i3) / i2 != 0) {
            LogUtil.b("TransFileCommandUtills", "send max, size :", Integer.valueOf(i2));
            return i2;
        }
        int i4 = i % i2;
        LogUtil.b("TransFileCommandUtills", "send not max, size :", Integer.valueOf(i4));
        return i4;
    }

    public static void b(String str, long j, int i, String str2, UniteDevice uniteDevice) {
        ByteBuffer byteBufferAllocate;
        LogUtil.b("TransFileCommandUtills", "enter sendFileInfo fileName ", str);
        byte[] bArrD = xiw.d(str, j, i);
        if (i == 1) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length != 2) {
                LogUtil.e("TransFileCommandUtills", "sendFileInfo, deviceCommand error");
                return;
            }
            byte[] bArrH = h(strArrSplit[0]);
            byte[] bArrL = l(strArrSplit[1]);
            byteBufferAllocate = ByteBuffer.allocate(bArrD.length + bArrH.length + bArrL.length);
            byteBufferAllocate.put(bArrD).put(bArrH).put(bArrL);
            LogUtil.b("TransFileCommandUtills", "sendFileInfo, get WatchInfo success");
        } else if (i == 2 && !TextUtils.isEmpty(str2) && !"huaweiOnlineMusic".equals(str2)) {
            byte[] bArrI = i(str2);
            byteBufferAllocate = ByteBuffer.allocate(bArrD.length + bArrI.length);
            byteBufferAllocate.put(bArrD).put(bArrI);
        } else {
            LogUtil.e("TransFileCommandUtills", "sendFileInfo error");
            byteBufferAllocate = ByteBuffer.allocate(bArrD.length);
            byteBufferAllocate.put(bArrD);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBufferAllocate.capacity() + 2);
        byteBufferAllocate2.put((byte) 40).put((byte) 2).put(byteBufferAllocate.array());
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate2.array());
        cmg.b bVar = new cmg.b();
        cpl.d("TransFileCommandUtills", byteBufferAllocate.array(), "getStartSendCommand deviceCommand: ");
        d(uniteDevice, bVar.a(cmgVar));
    }

    private static byte[] h(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 5;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] l(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 6;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] i(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 7;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    public static void d(UniteDevice uniteDevice, cmg cmgVar) {
        xhr xhrVarB = TransferFileQueueManager.b().b("ready_send_command");
        if (xhrVarB != null) {
            b(xhrVarB.i(), uniteDevice, cmgVar, xhrVarB.y());
        }
    }

    public static void b(String str, String str2, int i, int i2, int i3, DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate;
        byte[] bArrF = f(str2);
        byte[] bArrD = d(i);
        byte[] bArrE = e(i3);
        if (i2 != -1) {
            byte[] bArrB = b(i2);
            byteBufferAllocate = ByteBuffer.allocate(bArrF.length + 2 + bArrD.length + bArrB.length + bArrE.length);
            byteBufferAllocate.put((byte) 40).put((byte) 1).put(bArrF).put(bArrD).put(bArrB).put(bArrE);
        } else {
            int length = bArrF.length;
            byteBufferAllocate = ByteBuffer.allocate(length + 2 + bArrD.length + bArrE.length);
            byteBufferAllocate.put((byte) 40).put((byte) 1).put(bArrF).put(bArrD).put(bArrE);
        }
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        bVar.b(true);
        LogUtil.b("TransFileCommandUtills", "sendFileHashFailed, deviceCommand :", cmgVar.toString());
        b(str, d(deviceInfo), bVar.a(cmgVar), i);
    }

    public static void e(String str, String str2, int i, int i2, DeviceInfo deviceInfo, String str3, String str4) {
        byte[] bArrF = f(str2);
        byte[] bArrD = d(i);
        byte[] bArrE = e(i2);
        byte[] bArrJ = j(str3);
        byte[] bArrG = g(str4);
        int length = bArrF.length;
        int length2 = bArrD.length;
        int length3 = bArrE.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 2 + length2 + length3 + bArrJ.length + bArrG.length);
        byteBufferAllocate.put((byte) 40).put((byte) 1).put(bArrF).put(bArrD).put(bArrE).put(bArrJ).put(bArrG);
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        bVar.b(true);
        LogUtil.b("TransFileCommandUtills", "sendHiWearFileHashFailed, deviceCommand :", cmgVar.toString());
        b(str, d(deviceInfo), bVar.a(cmgVar), i);
    }

    private static byte[] f(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 1;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] d(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 2;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] e(int i) {
        byte[] bArrG = cph.g(i);
        byte[] bArr = new byte[bArrG.length + 2];
        bArr[0] = Ascii.DEL;
        bArr[1] = 4;
        System.arraycopy(bArrG, 0, bArr, 2, bArrG.length);
        return bArr;
    }

    private static byte[] b(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 5;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] j(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 3;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] g(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 4;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static void b(String str, UniteDevice uniteDevice, cmg cmgVar, int i) {
        int iE;
        if (i == 7) {
            iE = cou.a().e(uniteDevice.getIdentify(), 40, str);
        } else {
            iE = cou.a().e(uniteDevice.getIdentify(), 40, Integer.toString(i));
        }
        cmgVar.d(iE);
        byte[] bArrB = cmgVar.b();
        if (bArrB != null && bArrB.length > 2) {
            LogUtil.b("TransFileCommandUtills", "sendDeviceData fileType: ", Integer.valueOf(i), " packageName: ", str, " socketChannel: ", Integer.valueOf(iE), " serviceId: ", Byte.valueOf(bArrB[0]), " commandId: ", Byte.valueOf(bArrB[1]));
        }
        xip.a().e(uniteDevice, cmgVar);
    }

    public static void c(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        byte[] bArrI = i(i);
        byte[] bArrG = cph.g(20001);
        int length = bArrG.length + 2;
        byte[] bArr = new byte[length];
        bArr[0] = Ascii.DEL;
        bArr[1] = 4;
        System.arraycopy(bArrG, 0, bArr, 2, bArrG.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrI.length + 2);
        byteBufferAllocate.put((byte) 40).put((byte) 3).put(bArrI).put(bArr);
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        LogUtil.b("TransFileCommandUtills", "sendFileHashFailed, deviceCommand :", byteBufferAllocate.toString());
        d(d(deviceInfo), bVar.a(cmgVar));
    }

    private static byte[] i(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    public static void a(int i, String str, DeviceInfo deviceInfo, long j) {
        ByteBuffer byteBufferAllocate;
        if (deviceInfo == null) {
            return;
        }
        byte[] bArrI = i(i);
        byte[] bArrD = cph.d(str);
        byte[] bArrE = cph.e(bArrD.length);
        int length = bArrD.length + 1 + bArrE.length;
        byte[] bArr = new byte[length];
        bArr[0] = 3;
        System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
        System.arraycopy(bArrD, 0, bArr, bArrE.length + 1, bArrD.length);
        if (j != 0) {
            byte[] bArrE2 = cph.e(j);
            byte[] bArrE3 = cph.e(bArrE2.length);
            byte[] bArrF = cph.f(4);
            byteBufferAllocate = ByteBuffer.allocate(bArrI.length + length + 2 + bArrF.length + bArrE3.length + bArrE2.length);
            byteBufferAllocate.put((byte) 40).put((byte) 3).put(bArrI).put(bArr);
            byteBufferAllocate.put(bArrF).put(bArrE3).put(bArrE2);
        } else {
            byteBufferAllocate = ByteBuffer.allocate(bArrI.length + length + 2);
            byteBufferAllocate.put((byte) 40).put((byte) 3).put(bArrI).put(bArr);
        }
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        bVar.b(true);
        LogUtil.b("TransFileCommandUtills", "sendFileHashResult, deviceCommand :", byteBufferAllocate.toString());
        d(d(deviceInfo), bVar.a(cmgVar));
    }

    public static void b(int i, boolean z, DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate;
        LogUtil.b("TransFileCommandUtills", "enter sendConsultAck fileId :", Integer.valueOf(i), ", isNormal :", Boolean.valueOf(z));
        if (deviceInfo == null) {
            return;
        }
        byte[] bArrF = cph.f(i);
        int length = bArrF.length + 2;
        byte[] bArr = new byte[length];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        byte[] bArrA = a();
        if (z) {
            byteBufferAllocate = ByteBuffer.allocate(bArrA.length + length + 5);
            byteBufferAllocate.put((byte) 40).put((byte) 4).put(bArrA).put(bArr).put(new byte[]{9, 1, 1});
        } else {
            byteBufferAllocate = ByteBuffer.allocate(bArrA.length + length + 2);
            byteBufferAllocate.put((byte) 40).put((byte) 4).put(bArrA).put(bArr);
        }
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        LogUtil.b("TransFileCommandUtills", "sendConsultAck, deviceCommand :", byteBufferAllocate.toString());
        d(d(deviceInfo), bVar.a(cmgVar));
    }

    private static byte[] a() {
        byte[] bArrG = cph.g(100000);
        byte[] bArr = new byte[bArrG.length + 2];
        bArr[0] = Ascii.DEL;
        bArr[1] = 4;
        System.arraycopy(bArrG, 0, bArr, 2, bArrG.length);
        return bArr;
    }

    public static void a(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        byte[] bArrA = a();
        byte[] bArrF = cph.f(i);
        int length = bArrF.length + 2;
        byte[] bArr = new byte[length];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + length + 2);
        byteBufferAllocate.put((byte) 40).put((byte) 7).put(bArrA).put(bArr);
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        LogUtil.b("TransFileCommandUtills", "getStartSendCommand deviceCommand:", byteBufferAllocate.toString());
        d(d(deviceInfo), bVar.a(cmgVar));
    }

    public static void d(UniteDevice uniteDevice, int i, xhr xhrVar) {
        ByteBuffer byteBufferAllocate;
        if (uniteDevice == null) {
            return;
        }
        byte[] bArrA = a(i);
        if (xhrVar != null && xhrVar.y() == 7) {
            byte[] bArrC = c(xhrVar.n());
            byte[] bArrA2 = a(xhrVar.ag());
            byte[] bArrB = b(xhrVar.i());
            byteBufferAllocate = ByteBuffer.allocate(bArrA.length + bArrC.length + bArrA2.length + bArrB.length + 2);
            byteBufferAllocate.put((byte) 40).put((byte) 9).put(bArrA).put(bArrC).put(bArrA2).put(bArrB);
        } else {
            byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 2);
            byteBufferAllocate.put((byte) 40).put((byte) 9).put(bArrA);
        }
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        cpl.d("TransFileCommandUtills", byteBufferAllocate.array(), "getStartSendCommand deviceCommand:");
        d(uniteDevice, bVar.a(cmgVar));
    }

    private static byte[] a(int i) {
        byte[] bArrF = cph.f(i);
        byte[] bArr = new byte[bArrF.length + 2];
        bArr[0] = 1;
        bArr[1] = 1;
        System.arraycopy(bArrF, 0, bArr, 2, bArrF.length);
        return bArr;
    }

    private static byte[] c(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 2;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] a(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 3;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    private static byte[] b(String str) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrE.length + 1 + bArrE2.length];
        bArr[0] = 4;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        return bArr;
    }

    public static void c(int i, long j, int i2, String str, DeviceInfo deviceInfo) {
        byte[] bArr;
        if (deviceInfo == null) {
            return;
        }
        byte[] bArrI = i(i);
        byte[] bArrA = a(j);
        byte[] bArrC = c(i2);
        if (!TextUtils.isEmpty(str)) {
            byte[] bArrD = cph.d(str);
            byte[] bArrE = cph.e(bArrD.length);
            bArr = new byte[bArrD.length + 1 + bArrE.length];
            bArr[0] = 5;
            System.arraycopy(bArrE, 0, bArr, 1, bArrE.length);
            System.arraycopy(bArrD, 0, bArr, bArrE.length + 1, bArrD.length);
        } else {
            byte[] bArrG = cph.g(20001);
            bArr = new byte[bArrG.length + 2];
            bArr[0] = Ascii.DEL;
            bArr[1] = 4;
            System.arraycopy(bArrG, 0, bArr, 2, bArrG.length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + bArrC.length + bArrA.length + bArrI.length + 2);
        byteBufferAllocate.put((byte) 40).put((byte) 5).put(bArrI).put(bArrA).put(bArrC).put(bArr);
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        cmg.b bVar = new cmg.b();
        bVar.b(true);
        LogUtil.b("TransFileCommandUtills", "sendFileSubFrameHashResult, deviceCommand :", byteBufferAllocate.toString());
        d(d(deviceInfo), bVar.a(cmgVar));
    }

    private static byte[] a(long j) {
        byte[] bArrE = cph.e(j);
        byte[] bArr = new byte[bArrE.length + 2];
        bArr[0] = 2;
        bArr[1] = 4;
        System.arraycopy(bArrE, 0, bArr, 2, bArrE.length);
        return bArr;
    }

    private static byte[] c(int i) {
        byte[] bArrG = cph.g(i);
        byte[] bArr = new byte[bArrG.length + 2];
        bArr[0] = 3;
        bArr[1] = 4;
        System.arraycopy(bArrG, 0, bArr, 2, bArrG.length);
        return bArr;
    }

    public static boolean d(int i, String str) {
        if (str == null) {
            LogUtil.e("TransFileCommandUtills", "checkFileExist fileType :", Integer.valueOf(i), ", fileName = null");
            return false;
        }
        if (i != 3) {
            if (i == 4 || i == 5) {
                return e(str);
            }
            if (i != 10 && i != 11) {
                LogUtil.e("TransFileCommandUtills", "checkFileExist fileType :", Integer.valueOf(i), ", file type is not support.");
                return c(str, i);
            }
        }
        return d(str, i);
    }

    public static boolean e(String str) {
        if (str == null || str.isEmpty()) {
            LogUtil.e("TransFileCommandUtills", "checkPayFileExist fileName null or empty");
            return false;
        }
        File file = new File(f53017a + str);
        LogUtil.b("TransFileCommandUtills", " checkPayFileExist file exists :", Boolean.valueOf(file.exists()));
        return file.exists();
    }

    private static boolean c(String str, int i) {
        if (str == null || TextUtils.isEmpty(str)) {
            LogUtil.e("TransFileCommandUtills", "checkPayFileExist fileName null or empty");
            return false;
        }
        String strA = a(str, i);
        if (strA != null) {
            File file = new File(strA);
            LogUtil.b("TransFileCommandUtills", " checkOtherFileExist file exists :", Boolean.valueOf(file.exists()));
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    public static String a(String str, int i) {
        String str2 = null;
        try {
            str2 = BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + i + File.separator + str;
            LogUtil.b("TransFileCommandUtills", " getCommonFilePath file filepath :", str2);
            return str2;
        } catch (IOException unused) {
            LogUtil.d("TransFileCommandUtills", " getCommonFilePath file Exception");
            return str2;
        }
    }

    public static boolean d(String str, int i) {
        File[] fileArrListFiles;
        try {
            File file = new File((i == 10 || i == 11) ? BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + e : BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + f53018c);
            LogUtil.b("TransFileCommandUtills", "checkFileExist file exist :", Boolean.valueOf(file.exists()), " , isDirectory :", Boolean.valueOf(file.isDirectory()));
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    if (i == 10 && name.contains(str)) {
                        LogUtil.e("TransFileCommandUtills", "checkFileExist exists WATCH_VIDEO_FILE_TYPE");
                        return true;
                    }
                    if (name.contains(str) && name.endsWith(".png")) {
                        LogUtil.b("TransFileCommandUtills", "checkFileExist exists");
                        return true;
                    }
                }
                LogUtil.b("TransFileCommandUtills", "checkFileExist not exists");
            }
            return false;
        } catch (IOException unused) {
            LogUtil.d("TransFileCommandUtills", "checkFileExist IOException");
            return false;
        }
    }

    public static String d(String str, int i, int i2) throws IOException {
        String str2;
        if (i == 10) {
            return BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + e + File.separator + str;
        }
        if (i == 11) {
            str2 = BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + e + File.separator + str;
        } else {
            str2 = BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + f53018c + File.separator + str;
        }
        int iLastIndexOf = str2.lastIndexOf(".");
        if (i2 != 1) {
            if (iLastIndexOf >= str2.length()) {
                str2 = "";
            } else {
                str2 = str2.substring(0, iLastIndexOf) + WatchFaceConstant.BIN_SUFFIX;
            }
        }
        LogUtil.b("TransFileCommandUtills", "deviceStartTransfer filePath :", str2);
        return str2;
    }

    private static UniteDevice d(DeviceInfo deviceInfo) {
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setDeviceInfo(deviceInfo);
        uniteDevice.setIdentify(deviceInfo.getDeviceMac());
        return uniteDevice;
    }

    public static byte[] e(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        try {
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.d("TransFileCommandUtills", "getSendBytes, ArrayIndexOutOfBoundsException");
            return bArr2;
        }
    }
}
