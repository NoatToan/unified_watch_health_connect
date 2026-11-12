package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.common.base.Ascii;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class moa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Object f42055b = new Object();
    private static Handler e;

    public static void c() {
        HandlerThread handlerThread = new HandlerThread("FileApplicationUtil");
        handlerThread.start();
        e = new c(handlerThread.getLooper());
    }

    static class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("FileApplicationUtil", "handleMessage message is null.");
                return;
            }
            super.handleMessage(message);
            String str = message.obj instanceof String ? (String) message.obj : null;
            int i = message.what;
            if (i == 1) {
                moa.b(str);
            } else if (i != 2) {
                LogUtil.j("FileApplicationUtil", "handleMessage unknown.");
            } else {
                LogUtil.a("FileApplicationUtil", "app send file timeout.");
                mob.b(str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        mod modVar = mnk.b().get(str);
        if (modVar == null) {
            LogUtil.j("FileApplicationUtil", "handleSendFile ephemerisUtil is null.");
            return;
        }
        int iO = modVar.o();
        synchronized (f42055b) {
            int size = modVar.h().size();
            LogUtil.a("FileApplicationUtil", "SEND_FILE sendNumIndex :", Integer.valueOf(iO), ", and offset :", Integer.valueOf(modVar.g()), ", indexList.size() :", Integer.valueOf(size));
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.what = 1;
            e.sendMessageDelayed(messageObtain, modVar.m());
            byte[] bArrE = e(modVar);
            if (iO >= size) {
                LogUtil.j("FileApplicationUtil", "index error.");
                e.removeMessages(1, str);
                return;
            }
            if (bArrE != null && bArrE.length != 0) {
                if (!CommonUtil.af(BaseApplication.b())) {
                    LogUtil.a("FileApplicationUtil", "byteBuffer.length :", Integer.valueOf(bArrE.length), ", indexList.get(sendNumIndex) :", modVar.h().get(iO), ", sendNumIndex :", Integer.valueOf(iO));
                }
                e(bArrE, str, modVar);
                modVar.i(iO + 1);
                if (modVar.o() == modVar.h().size()) {
                    e.removeMessages(1, str);
                    modVar.i(0);
                }
            } else {
                LogUtil.j("FileApplicationUtil", "SEND_FILE byteBuffer is null or byteBuffer.length is zero, indexList.get(sendNumIndex) :", modVar.h().get(iO), ", sendNumIndex :", Integer.valueOf(iO));
                e.removeMessages(1, str);
            }
        }
    }

    public static void e(DeviceInfo deviceInfo) {
        if (e != null) {
            LogUtil.a("FileApplicationUtil", "ready send FILE_SEND_BUSY_TIMEOUT.");
            e.sendMessageDelayed(b(2, deviceInfo), 90000L);
        } else {
            LogUtil.j("FileApplicationUtil", "sendFileBusyTag sHandler is null.");
        }
    }

    public static void d(DeviceInfo deviceInfo, boolean z) {
        b(deviceInfo, !z);
        LogUtil.a("FileApplicationUtil", "removeOutTimeMsg deviceInfo.");
        if (deviceInfo != null) {
            mob.b(deviceInfo.getDeviceIdentify(), z);
        }
    }

    public static void b(DeviceInfo deviceInfo, boolean z) {
        if (e != null) {
            LogUtil.a("FileApplicationUtil", "removeOutTimeMsg removeMessages. isSendTimeout: ", Boolean.valueOf(z));
            if (deviceInfo != null) {
                e.removeMessages(2, deviceInfo.getDeviceIdentify());
            }
            if (z) {
                e(deviceInfo);
            }
        }
    }

    private static void e(byte[] bArr, String str, mod modVar) {
        if (modVar == null) {
            LogUtil.j("FileApplicationUtil", "sendStarFileData ephemerisUtil is null.");
            return;
        }
        if (modVar.h().size() <= modVar.o()) {
            LogUtil.j("FileApplicationUtil", "sendStarFileData IndexList is error.");
            return;
        }
        Integer num = modVar.h().get(modVar.o());
        int iIntValue = num.intValue();
        LogUtil.a("FileApplicationUtil", "sendStarFileData sendIndex :", num, ", offset :", Integer.valueOf(modVar.g()));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(5);
        byte[] bArrJ = eeq.j(iIntValue - modVar.g());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrJ.length + bArr.length);
        byteBufferAllocate.put(bArrJ);
        byteBufferAllocate.put(bArr);
        deviceCommand.setmIdentify(str);
        mnz.e(deviceCommand, byteBufferAllocate);
    }

    private static byte[] e(mod modVar) {
        synchronized (f42055b) {
            LogUtil.a("FileApplicationUtil", "getCutData fileInfoList size :", Integer.valueOf(modVar.c().size()), ", indexList.size :", Integer.valueOf(modVar.h().size()));
            if (modVar.o() < modVar.h().size()) {
                int iIntValue = modVar.h().get(modVar.o()).intValue();
                if (iIntValue < modVar.c().size() && iIntValue >= 0) {
                    return modVar.c().get(iIntValue);
                }
                return new byte[0];
            }
            return new byte[0];
        }
    }

    public static void b(String str, String str2, int i, DeviceInfo deviceInfo) {
        String str3;
        if (deviceInfo == null) {
            LogUtil.j("FileApplicationUtil", "responseApplicationData deviceInfo is null.");
            return;
        }
        mod modVarA = mob.a(deviceInfo);
        if (modVarA == null) {
            LogUtil.j("FileApplicationUtil", "responseApplicationData ephemerisUtil is null.");
            return;
        }
        LogUtil.a("FileApplicationUtil", "responseApplicationData fileName :", str, ", fileBitmap :", str2, ", offset :", Integer.valueOf(i), ", transSize :", Integer.valueOf(modVarA.k()));
        if (i == 0) {
            modVarA.c(0);
            c(modVarA);
        } else if (modVarA.k() == 0) {
            modVarA.c(0);
        } else {
            modVarA.c(Math.abs(i / modVarA.k()));
        }
        if (modVarA.b() == 0) {
            str3 = mnz.f42050a;
        } else if (modVarA.b() != 1) {
            LogUtil.j("FileApplicationUtil", "responseApplicationData file type unknown.");
            str = "";
            str3 = "";
        } else {
            str3 = mnz.f42052c;
            str = nio.c(deviceInfo.getDeviceIdentify()) + str;
        }
        if (!moc.e(str3 + str)) {
            mnz.a(4, 100001, deviceInfo);
        } else {
            e(modVarA, deviceInfo, str, str2, i);
        }
    }

    private static void e(mod modVar, DeviceInfo deviceInfo, String str, String str2, int i) {
        LogUtil.a("FileApplicationUtil", "sendFile fileType :", Integer.valueOf(modVar.b()));
        if (modVar.b() == 0) {
            d(str, i, deviceInfo);
            c(mnz.f42050a + str, modVar, deviceInfo);
            return;
        }
        if (modVar.b() == 1) {
            e(str, i, deviceInfo);
            LogUtil.a("FileApplicationUtil", "sendFile fileBitmap :", str2);
            if (!"".equals(str2) && !"FF".equals(str2)) {
                e(str2, modVar);
                e.removeMessages(1, deviceInfo.getDeviceIdentify());
            } else {
                LogUtil.a("FileApplicationUtil", "sendFile index :", Integer.valueOf(modVar.a()));
                if (i != 0 && modVar.k() != 0 && modVar.f() != 0) {
                    int iK = (i / modVar.k()) / modVar.f();
                    LogUtil.a("FileApplicationUtil", "sendFile index_change :", Integer.valueOf(iK));
                    modVar.a(iK);
                    c(modVar);
                }
            }
            e.sendMessageDelayed(b(1, deviceInfo), modVar.m());
            return;
        }
        LogUtil.j("FileApplicationUtil", "sendFile unknown.");
    }

    private static Message b(int i, DeviceInfo deviceInfo) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        if (deviceInfo != null) {
            messageObtain.obj = deviceInfo.getDeviceIdentify();
        }
        return messageObtain;
    }

    private static void c(mod modVar) {
        int i;
        LogUtil.a("FileApplicationUtil", "initIndexList numbers :", Integer.valueOf(modVar.a()), " maxDataSize :", Long.valueOf(modVar.i()), " transSize :", Integer.valueOf(modVar.k()), " offset :", Integer.valueOf(modVar.g()), " allSize :", Integer.valueOf(modVar.d()), " sendNum :", Integer.valueOf(modVar.f()));
        synchronized (f42055b) {
            modVar.h().clear();
            if (modVar.i() == 0 || modVar.k() == 0) {
                i = 1;
            } else {
                int iD = modVar.d() - (modVar.k() * modVar.g());
                LogUtil.a("FileApplicationUtil", "initIndexList numberLess :", Integer.valueOf(iD), ", (transSize * sendNum) :", Integer.valueOf(modVar.k() * modVar.f()));
                if (iD >= modVar.k() * modVar.f()) {
                    i = (int) (modVar.i() / ((long) modVar.k()));
                } else {
                    int iK = iD / modVar.k();
                    i = iD % modVar.k() != 0 ? iK + 1 : iK;
                }
            }
            LogUtil.a("FileApplicationUtil", "initIndexList number :", Integer.valueOf(i));
            for (int i2 = 0; i2 < i; i2++) {
                modVar.h().add(Integer.valueOf((modVar.f() * modVar.a()) + i2));
            }
            LogUtil.a("FileApplicationUtil", "initIndexList indexList.size() :", Integer.valueOf(modVar.h().size()));
        }
    }

    private static void e(String str, mod modVar) {
        synchronized (f42055b) {
            modVar.h().clear();
            int length = str.length() / 2;
            LogUtil.a("FileApplicationUtil", "getBitmapInfo() number :", Integer.valueOf(length));
            int i = 0;
            while (i < length) {
                int i2 = i * 2;
                String binaryString = Integer.toBinaryString(CommonUtil.v(str.substring(i2, i2 + 2)));
                int i3 = i + 1;
                LogUtil.a("FileApplicationUtil", "getBitmapInfo() index :", Integer.valueOf(i3), ", info :", binaryString);
                String strE = e(binaryString);
                LogUtil.a("FileApplicationUtil", "getBitmapInfo() index :", Integer.valueOf(i3), ", info :", strE);
                String string = new StringBuffer(strE).reverse().toString();
                LogUtil.a("FileApplicationUtil", " getBitmapInfo() index :", Integer.valueOf(i3), ", bitmap :", string);
                for (int i4 = 0; i4 < string.length(); i4++) {
                    if (string.charAt(i4) == '0' && i4 >= 0 && i4 <= 7) {
                        modVar.h().add(Integer.valueOf(modVar.g() + (modVar.f() * i) + i4));
                    }
                }
                i = i3;
            }
        }
    }

    private static String e(String str) {
        if (str.length() >= 8) {
            return str;
        }
        String str2 = "";
        for (int i = 0; i < 8 - str.length(); i++) {
            str2 = "0" + str2;
        }
        return str2 + str;
    }

    public static void d(String str, long j, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(4);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        byte[] bArrB = eeq.b(str);
        byte[] bArrA = eeq.a(bArrB.length);
        byte[] bArrH = eeq.h((int) j);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 7 + bArrB.length);
        byteBufferAllocate.put((byte) 2).put(bArrA).put(bArrB).put((byte) 3).put((byte) 4).put(bArrH);
        mnz.e(deviceCommand, byteBufferAllocate);
    }

    public static void e(String str, long j, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(4);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        byte[] bArr = {Ascii.DEL, 4, 0, 1, -122, -96};
        byte[] bArrB = eeq.b(str);
        byte[] bArrA = eeq.a(bArrB.length);
        byte[] bArrH = eeq.h((int) j);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 13 + bArrB.length);
        byteBufferAllocate.put(bArr).put((byte) 2).put(bArrA).put(bArrB).put((byte) 3).put((byte) 4).put(bArrH);
        mnz.e(deviceCommand, byteBufferAllocate);
    }

    public static void c(String str, mod modVar, DeviceInfo deviceInfo) {
        LogUtil.a("FileApplicationUtil", "Enter sendFilePath path :", str);
        if (!moc.e(str)) {
            LogUtil.j("FileApplicationUtil", "sendFilePath file not exists.");
        } else if ("ANDROID_WEAR".equals(modVar.e())) {
            LogUtil.a("FileApplicationUtil", "sendFilePath start sendAwFilePath.");
            mkf.d().c(str, deviceInfo);
        } else {
            LogUtil.j("FileApplicationUtil", "sendFilePath BT 2.0.");
        }
    }
}
