package com.huawei.maps.offlinedata.service.storage;

import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.maps.offlinedata.utils.j;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f18020a;

    private a() {
    }

    private String b() {
        Context contextB = com.huawei.maps.offlinedata.utils.a.b();
        String canonicalPath = null;
        if (contextB == null) {
            g.b("StorageService", "getBaseDir failed , context is null.");
            return null;
        }
        String strA = j.a("offline_storage_file_path", "", contextB);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        try {
            File filesDir = contextB.getFilesDir();
            if (filesDir != null) {
                canonicalPath = filesDir.getCanonicalPath();
            }
        } catch (IOException unused) {
            g.b("StorageService", "getExternalFileDir failed.");
        }
        if (!TextUtils.isEmpty(canonicalPath)) {
            j.b("offline_storage_file_path", canonicalPath, contextB);
        }
        return canonicalPath;
    }

    public static a e() {
        if (f18020a == null) {
            synchronized (a.class) {
                if (f18020a == null) {
                    f18020a = new a();
                }
            }
        }
        return f18020a;
    }

    public long a() {
        try {
            String strB = b();
            if (TextUtils.isEmpty(strB)) {
                g.b("StorageService", "getAvailableStorageSize failed , basePath exception.");
                return -1L;
            }
            StatFs statFs = new StatFs(strB);
            return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
        } catch (IllegalArgumentException unused) {
            g.b("StorageService", "getAvailableStorageSize failed , IllegalArgumentException");
            return -1L;
        }
    }

    public String c() {
        String strF = f();
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        return strF + "decompress" + File.separator;
    }

    public String d() {
        String strF = f();
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        return strF + "download" + File.separator;
    }

    public String f() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            g.b("StorageService", "getOfflineDataDir failed , basePath exception.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        String str = File.separator;
        sb.append(str);
        sb.append("offlineData");
        sb.append(str);
        return sb.toString();
    }
}
