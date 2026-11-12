package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class it implements ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ih f19272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq f19273b;

    @Override // com.huawei.openalliance.ad.ii
    public void b(String str) {
        File file = new File(this.f19272a.a(), c(str));
        if (file.exists()) {
            if (file.delete()) {
                this.f19273b.a(file.getName(), false, null);
            } else {
                hw.d("DiskManager", "delete damaged cache file failed.");
            }
            hw.b("DiskManager", "successful delete damaged cache file");
        }
    }

    public long b() {
        File[] fileArrListFiles;
        File fileA = this.f19272a.a();
        long length = 0;
        if (fileA != null && (fileArrListFiles = fileA.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    length += file.length();
                }
            }
        }
        return length;
    }

    public void a(File file) {
        in.a(file);
        this.f19273b.a(file.getName(), System.currentTimeMillis());
    }

    @Override // com.huawei.openalliance.ad.ii
    public void a(iz izVar) {
        File file = (this.f19272a == null || izVar == null) ? null : new File(this.f19272a.a(), izVar.a());
        if (file == null || !file.exists()) {
            return;
        }
        if (file.delete()) {
            hw.b("DiskManager", "Successfully deleted file that failed to cache");
        } else {
            hw.d("DiskManager", "Failed to delete temporary file");
        }
    }

    @Override // com.huawei.openalliance.ad.ii
    public void a(long j, iz izVar) {
        long jB = b();
        long jC = this.f19272a.c();
        if (jB >= jC) {
            hw.b("DiskManager", "clear native cache, used: %s, max: %s", Long.valueOf(jB), Long.valueOf(jC));
            File file = new File(this.f19272a.a(), izVar.a());
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            com.huawei.openalliance.ad.utils.ai.a(this.f19272a.a(), j * 3, arrayList);
        }
    }

    public void a() {
        if (this.f19272a.d() + 86400000 < com.huawei.openalliance.ad.utils.as.c()) {
            hw.b("DiskManager", "clear old native cache.");
            this.f19272a.a(com.huawei.openalliance.ad.utils.as.c());
            com.huawei.openalliance.ad.utils.ai.a(this.f19272a.b(), 604800000L);
        }
    }

    @Override // com.huawei.openalliance.ad.ii
    public String a(String str) {
        hw.a("DiskManager", "try to get cache file for " + com.huawei.openalliance.ad.utils.ds.a(str));
        File file = new File(this.f19272a.a(), c(str));
        if (!file.exists()) {
            hw.a("DiskManager", "The requested cache file for url %s does not exist", com.huawei.openalliance.ad.utils.ds.a(str));
            return "";
        }
        a(file);
        return Constants.PREFIX_FILE + com.huawei.openalliance.ad.utils.ai.h(file);
    }

    public File a(String str, iz izVar, String str2, String str3) {
        hw.b("DiskManager", "try to save cache file");
        try {
            izVar.b().close();
        } catch (IOException unused) {
            hw.d("DiskManager", "Failed to close the tempResource");
        }
        File file = new File(this.f19272a.a(), izVar.a());
        String strC = c(str);
        File file2 = new File(this.f19272a.a(), strC);
        if (file2.exists()) {
            hw.b("DiskManager", "Old cache file %s exists.", file2.getName());
            hw.a("DiskManager", "del temp file result: %s", Boolean.valueOf(file.delete()));
            return file2;
        }
        if (file.renameTo(file2)) {
            hw.a("DiskManager", "Cache file %s completed", file2.getName());
            this.f19273b.a(strC, a(strC, str2, str3));
        } else {
            hw.c("DiskManager", "Failed to save the cached file %s", file2.getName());
        }
        return file2;
    }

    @Override // com.huawei.openalliance.ad.ii
    public File a(String str, iz izVar) {
        return a(str, izVar, null, null);
    }

    @Override // com.huawei.openalliance.ad.ii
    public iz a(String str, String str2) {
        File file = new File(this.f19272a.a(), b(str, str2));
        try {
            if (file.exists()) {
                hw.b("DiskManager", "temporary resource file is exists");
                return new iz(file.getName(), new FileOutputStream(file, true), file.length());
            }
            if (file.createNewFile()) {
                hw.b("DiskManager", "Successfully created temporary resource file");
                return new iz(file.getName(), new FileOutputStream(file), 0L);
            }
            hw.d("DiskManager", "Failed created new temporary resource file");
            return null;
        } catch (IOException unused) {
            hw.d("DiskManager", "Failed created temporary resource file");
            return null;
        }
    }

    private String c(String str) {
        return "cache_" + com.huawei.openalliance.ad.utils.db.a(str);
    }

    private String b(String str, String str2) {
        return "temp_" + str2 + com.huawei.openalliance.ad.utils.db.a(str);
    }

    private ContentResource a(String str, String str2, String str3) {
        ContentResource contentResource = new ContentResource();
        contentResource.a(3);
        contentResource.c(str2);
        contentResource.b(str3);
        contentResource.a(str);
        contentResource.c(1);
        contentResource.d(2);
        return contentResource;
    }

    public it(ih ihVar, dq dqVar) {
        this.f19272a = ihVar;
        this.f19273b = dqVar;
    }
}
