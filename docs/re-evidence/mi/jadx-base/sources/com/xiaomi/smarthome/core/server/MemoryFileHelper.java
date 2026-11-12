package com.xiaomi.smarthome.core.server;

import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class MemoryFileHelper {
    public static MemoryFile createMemoryFile(String str, int i) {
        try {
            return new MemoryFile(str, i);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static FileDescriptor getFileDescriptor(MemoryFile memoryFile) {
        if (memoryFile != null) {
            return (FileDescriptor) ReflectUtils.invoke("android.os.MemoryFile", memoryFile, "getFileDescriptor", new Object[0]);
        }
        throw new IllegalArgumentException("memoryFile 不能为空");
    }

    public static ParcelFileDescriptor getParcelFileDescriptor(MemoryFile memoryFile) {
        if (memoryFile != null) {
            return (ParcelFileDescriptor) ReflectUtils.getInstance(ParcelFileDescriptor.class, getFileDescriptor(memoryFile));
        }
        throw new IllegalArgumentException("memoryFile 不能为空");
    }

    public static MemoryFile openMemoryFile(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        if (parcelFileDescriptor != null) {
            return openMemoryFile(parcelFileDescriptor.getFileDescriptor(), i, i2);
        }
        throw new IllegalArgumentException("ParcelFileDescriptor 不能为空");
    }

    public static MemoryFile openMemoryFile(FileDescriptor fileDescriptor, int i, int i2) {
        MemoryFile memoryFile = null;
        try {
            MemoryFile memoryFile2 = new MemoryFile("tem", 1);
            try {
                memoryFile2.close();
                Method[] declaredMethods = MemoryFile.class.getDeclaredMethods();
                Method method = null;
                for (int i3 = 0; declaredMethods != null && i3 < declaredMethods.length; i3++) {
                    if (declaredMethods[i3].getName().equals("native_mmap")) {
                        method = declaredMethods[i3];
                    }
                }
                ReflectUtils.setField("android.os.MemoryFile", memoryFile2, "mFD", fileDescriptor);
                ReflectUtils.setField("android.os.MemoryFile", memoryFile2, "mLength", Integer.valueOf(i));
                ReflectUtils.setField("android.os.MemoryFile", memoryFile2, "mAddress", ReflectUtils.invokeMethod(null, method, fileDescriptor, Integer.valueOf(i), Integer.valueOf(i2)));
                return memoryFile2;
            } catch (Exception e) {
                e = e;
                memoryFile = memoryFile2;
                e.printStackTrace();
                return memoryFile;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
