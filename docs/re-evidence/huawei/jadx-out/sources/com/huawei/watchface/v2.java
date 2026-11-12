package com.huawei.watchface;

import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.utils.HwLog;
import defpackage.pzd;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f30627b = "com.huawei.watchface.v2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile v2 f30628c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30629a = new ConcurrentHashMap(32);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f30630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30631b;

        public a(ParcelFileDescriptor parcelFileDescriptor, int i) {
            this.f30630a = parcelFileDescriptor;
            this.f30631b = i;
        }

        public ParcelFileDescriptor a() {
            return this.f30630a;
        }

        public int b() {
            return this.f30631b;
        }
    }

    public static v2 a() {
        if (f30628c == null) {
            synchronized (s0.class) {
                if (f30628c == null) {
                    f30628c = new v2();
                }
            }
        }
        return f30628c;
    }

    public static List d(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(WatchResourcesInfo.markUpHiTopId(str));
        arrayList.add(n.e().e(str).trim());
        return arrayList;
    }

    public boolean b(String str) {
        FlavorConfig.safeHwLog(f30627b, "exists name: " + str);
        s0.a aVarA = s0.a.a(str);
        List listD = d(aVarA.a());
        for (int i = 0; i < listD.size(); i++) {
            String str2 = ((String) listD.get(i)) + "_" + aVarA.b();
            String str3 = f30627b;
            HwLog.i(str3, "exists tmpUUID: " + str2);
            if (this.f30629a.containsKey(str2)) {
                HwLog.i(str3, "exists matched id: " + str2);
                return true;
            }
        }
        return false;
    }

    public a c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name 不能为空");
        }
        FlavorConfig.safeHwLog(f30627b, "get name: " + str);
        MemoryFile memoryFile = (MemoryFile) this.f30629a.get(str);
        if (memoryFile == null) {
            return null;
        }
        try {
            return new a(a(memoryFile), memoryFile.length());
        } catch (Exception e) {
            HwLog.e(f30627b, HwLog.printException(e));
            return null;
        }
    }

    public ParcelFileDescriptor a(byte[] bArr, String str) {
        String str2 = f30627b;
        FlavorConfig.safeHwLog(str2, "createMemoryFile name: " + str);
        ParcelFileDescriptor parcelFileDescriptorA = null;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        try {
            MemoryFile memoryFile = new MemoryFile(str, length);
            HwLog.i(str2, "createMemoryFile create object length:" + length);
            this.f30629a.put(str, memoryFile);
            try {
                OutputStream outputStream = memoryFile.getOutputStream();
                try {
                    outputStream.write(bArr);
                    HwLog.i(str2, "createMemoryFile write object");
                    outputStream.close();
                    try {
                        parcelFileDescriptorA = a(memoryFile);
                        StringBuilder sb = new StringBuilder("createMemoryFile parcelFileDescriptor is null: ");
                        sb.append(parcelFileDescriptorA == null);
                        HwLog.i(str2, sb.toString());
                        return parcelFileDescriptorA;
                    } catch (Exception e) {
                        HwLog.e(f30627b, HwLog.printException(e));
                        a(str);
                        return parcelFileDescriptorA;
                    }
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                HwLog.e(f30627b, HwLog.printException((Exception) e2));
                a(str);
                return null;
            }
        } catch (IOException e3) {
            HwLog.e(f30627b, HwLog.printException((Exception) e3));
            return null;
        }
    }

    public static ParcelFileDescriptor a(MemoryFile memoryFile) {
        if (memoryFile != null) {
            return ParcelFileDescriptor.dup((FileDescriptor) pzd.a(MemoryFile.class, memoryFile, "getFileDescriptor", new Object[0]));
        }
        throw new IllegalArgumentException("memoryFile 不能为空");
    }

    public void a(String str) {
        FlavorConfig.safeHwLog(f30627b, "closeMemoryFile name: " + str);
        MemoryFile memoryFile = (MemoryFile) this.f30629a.remove(str);
        if (memoryFile != null) {
            memoryFile.close();
        }
    }
}
