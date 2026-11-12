package defpackage;

import com.google.common.base.Ascii;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class mnx {
    public static void d(DeviceInfo deviceInfo) {
        mod modVarA = mob.a(deviceInfo);
        if (modVarA == null || modVarA.k() == 0) {
            LogUtil.j("FileServiceConsultUtil", "responseFileManagerConsult transferSize is zero.");
            moa.d(deviceInfo, false);
            return;
        }
        modVarA.f((int) (modVarA.i() / ((long) modVarA.k())));
        LogUtil.d("FileServiceConsultUtil", "responseFileManagerConsult.");
        if (modVarA.e() != null && modVarA.b() == 0) {
            c(100000, deviceInfo);
        } else if (modVarA.b() != 1) {
            LogUtil.j("FileServiceConsultUtil", "responseFileManagerConsult fileType is unknown.");
            moa.d(deviceInfo, false);
        } else {
            a(100000, deviceInfo);
        }
    }

    public static void c(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(2);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        mnz.e(deviceCommand, e(i));
    }

    private static ByteBuffer e(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put(Ascii.DEL);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(eeq.h(i));
        return byteBufferAllocate;
    }

    public static void a(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(2);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        mnz.e(deviceCommand, e(i));
    }

    public static void e(String str, DeviceInfo deviceInfo) {
        LogUtil.d("FileServiceConsultUtil", "responseSingleFile");
        if (deviceInfo == null) {
            LogUtil.j("FileServiceConsultUtil", "responseSingleFile deviceInfo is null.");
            return;
        }
        mod modVarA = mob.a(deviceInfo);
        if (str == null || modVarA == null) {
            mnz.a(3, 100001, deviceInfo);
            return;
        }
        if (!moc.e(mnz.f42050a + str) || moc.d(new File(mnz.f42050a, str), modVarA) == 0) {
            mnz.a(3, 100001, deviceInfo);
            return;
        }
        long jD = moc.d(new File(mnz.f42050a, str), modVarA);
        LogUtil.d("FileServiceConsultUtil", "responseSingleFile size : ", Long.valueOf(jD));
        d(jD, 0L, deviceInfo);
    }

    private static void d(long j, long j2, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(3);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.put((byte) 2).put((byte) 4).put(eeq.h((int) j)).put((byte) 3).put((byte) 4).put(eeq.h((int) j2));
        mnz.e(deviceCommand, byteBufferAllocate);
    }

    public static void a(String str, DeviceInfo deviceInfo) {
        LogUtil.a("FileServiceConsultUtil", "responseStarSingleFile");
        if (str == null) {
            mnz.a(3, 100001, deviceInfo);
            return;
        }
        mod modVarA = mob.a(deviceInfo);
        if (modVarA == null) {
            LogUtil.j("FileServiceConsultUtil", "responseStarSingleFile ephemerisUtil is null.");
            return;
        }
        String str2 = nio.c(deviceInfo.getDeviceIdentify()) + str;
        File file = new File(mnz.f42052c, str2);
        long jD = moc.d(file, modVarA);
        if (!moc.e(mnz.f42052c + str2) || jD == 0) {
            mnz.a(3, 100001, deviceInfo);
            return;
        }
        LogUtil.a("FileServiceConsultUtil", "responseStarSingleFile size : ", Long.valueOf(jD), " sAllSize:", Integer.valueOf(modVarA.d()));
        e(jD, a(file), deviceInfo);
    }

    private static byte[] a(File file) {
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStreamOpenInputStream = null;
        try {
            try {
                fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
                LogUtil.a("FileServiceConsultUtil", "read length : ", Integer.valueOf(fileInputStreamOpenInputStream.read(bArr)));
            } catch (IOException e) {
                LogUtil.e("FileServiceConsultUtil", "getFileBytes exception : ", ExceptionUtils.c(e));
            }
            return mog.e(bArr);
        } finally {
            IoUtils.c(fileInputStreamOpenInputStream);
        }
    }

    public static void e(long j, byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("FileServiceConsultUtil", "sendStarSingleFileInfo() fileSize : ", Long.valueOf(j));
        if (bArr == null) {
            LogUtil.j("FileServiceConsultUtil", "crc is null");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(3);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        byte[] bArrA = eeq.a(bArr.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 7 + bArr.length);
        byteBufferAllocate.put((byte) 2).put((byte) 4).put(eeq.h((int) j)).put((byte) 3).put(bArrA).put(bArr);
        mnz.e(deviceCommand, byteBufferAllocate);
    }

    public static void b(int i, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(6);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        mnz.e(deviceCommand, e(i));
    }

    public static void d(int i, DeviceInfo deviceInfo) {
        LogUtil.d("FileServiceConsultUtil", "responseResultNotification validity : ", Integer.valueOf(i));
        b(100000, deviceInfo);
    }

    public static void a(DeviceInfo deviceInfo) {
        LogUtil.a("FileServiceConsultUtil", "initData()");
        if (deviceInfo != null) {
            mnk.b().remove(deviceInfo.getDeviceIdentify());
            mnc.e().b().remove(deviceInfo.getDeviceIdentify());
        }
    }
}
