package defpackage;

import com.google.common.base.Ascii;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mnz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42052c = BaseApplication.getContext().getFilesDir() + File.separator;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42050a = BaseApplication.getContext().getFilesDir() + "/fileShare/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42051b = new Object();

    private static List<String> b(File file, String str) {
        if (file == null || str == null) {
            LogUtil.j("FileServiceUtil", "getFileList path or productId is null");
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (!file.isDirectory() || fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(16);
        for (File file2 : fileArrListFiles) {
            if (file2.getName().contains(str)) {
                arrayList.add(file2.getName());
            }
        }
        return arrayList;
    }

    public static Object c() {
        return f42051b;
    }

    public static void d(int i, String str, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("FileServiceUtil", "responseSendFileList deviceInfo is null.");
            return;
        }
        if (str == null) {
            LogUtil.j("FileServiceUtil", "productId is null.");
            moa.d(deviceInfo, false);
            return;
        }
        List<String> listB = b(new File(f42050a), str);
        if (listB != null && i == 0) {
            c(listB, deviceInfo);
        } else if (i == 1) {
            a(deviceInfo);
        } else {
            a(1, 100001, deviceInfo);
        }
    }

    private static void c(List<String> list, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(1);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int length = 0;
        for (int i = 0; i < size; i++) {
            byte[] bArrB = eeq.b(list.get(i));
            arrayList.add(bArrB);
            length += bArrB.length;
        }
        int i2 = (length + size) - 1;
        byte[] bArrA = eeq.a(i2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 1 + i2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(bArrA);
        for (int i3 = 0; i3 < size; i3++) {
            byteBufferAllocate.put((byte[]) arrayList.get(i3));
            if (i3 == size - 1) {
                break;
            }
            byteBufferAllocate.put((byte) 59);
        }
        e(deviceCommand, byteBufferAllocate);
    }

    private static void a(DeviceInfo deviceInfo) {
        mne mneVar = mnc.e().b().get(deviceInfo.getDeviceIdentify());
        int iG = mneVar != null ? mneVar.g() : -1;
        LogUtil.a("FileServiceUtil", "now version is : ", Integer.valueOf(iG));
        if (iG == 0) {
            d(deviceInfo);
        } else if (iG == 1 || iG == 2 || iG == 3) {
            e(deviceInfo);
        } else {
            LogUtil.j("FileServiceUtil", "unknown version : ", Integer.valueOf(iG));
        }
    }

    private static void d(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(1);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        e(deviceCommand, ByteBuffer.wrap(new byte[]{1, 15, 103, 112, 115, 108, 111, 99, 97, 116, 105, 111, 110, 46, 100, 97, 116}));
    }

    private static void e(DeviceInfo deviceInfo) {
        synchronized (f42051b) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(28);
            deviceCommand.setCommandID(1);
            mne mneVar = mnc.e().b().get(deviceInfo.getDeviceIdentify());
            List<String> listA = mneVar != null ? mneVar.a() : null;
            if (listA != null && listA.size() != 0) {
                deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                int size = listA.size();
                ArrayList arrayList = new ArrayList(size);
                int length = 0;
                for (int i = 0; i < size; i++) {
                    byte[] bArrB = eeq.b(listA.get(i));
                    arrayList.add(bArrB);
                    length += bArrB.length;
                }
                int i2 = (length + size) - 1;
                byte[] bArrA = eeq.a(i2);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA.length + 1 + i2);
                try {
                    byteBufferAllocate.put((byte) 1);
                    byteBufferAllocate.put(bArrA);
                    for (int i3 = 0; i3 < size; i3++) {
                        byteBufferAllocate.put((byte[]) arrayList.get(i3));
                        if (i3 == size - 1) {
                            break;
                        }
                        byteBufferAllocate.put((byte) 59);
                    }
                } catch (BufferOverflowException unused) {
                    LogUtil.j("FileServiceUtil", "BufferOverflowException");
                }
                e(deviceCommand, byteBufferAllocate);
                return;
            }
            LogUtil.j("FileServiceUtil", "sendEphemerisFile file name is empty.");
        }
    }

    public static void a(int i, int i2, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(28);
        deviceCommand.setCommandID(i);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put(Ascii.DEL);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(eeq.h(i2));
        e(deviceCommand, byteBufferAllocate);
    }

    public static void e(DeviceCommand deviceCommand, ByteBuffer byteBuffer) {
        if (deviceCommand == null || byteBuffer == null) {
            LogUtil.j("FileServiceUtil", "addToList deviceCommand or byteBuffer is null");
            return;
        }
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        if (!CommonUtil.af(com.huawei.haf.application.BaseApplication.b())) {
            LogUtil.a("FileServiceUtil", "file trance command : ", deviceCommand.toString());
        }
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
