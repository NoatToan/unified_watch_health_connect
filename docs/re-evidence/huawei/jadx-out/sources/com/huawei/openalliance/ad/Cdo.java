package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.openalliance.ad.do, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f18410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f18411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f18412c;
    private dq d;
    private dn e;
    private volatile long f = 345600000;

    public void d() {
        com.huawei.openalliance.ad.utils.ai.b(this.f18412c);
    }

    public void c(final String str) {
        hw.b("FileDiskCache", "remove key " + str);
        com.huawei.openalliance.ad.utils.ai.e(new File(this.f18412c, str));
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.do.1
            @Override // java.lang.Runnable
            public void run() {
                Cdo.this.a(str, true, (Integer) 2);
            }
        }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
    }

    public int c() {
        return this.f18411b;
    }

    public void b(long j) {
        this.f = j * 60000;
    }

    public String b(String str) {
        try {
            return new File(this.f18412c, str).getCanonicalPath();
        } catch (IOException e) {
            hw.c("FileDiskCache", "getFilePath " + e.getClass().getSimpleName());
            return "";
        }
    }

    public long b() {
        return this.f18410a;
    }

    public boolean a(String str, File file, ContentResource contentResource) {
        boolean z;
        hw.b("FileDiskCache", "put file: " + str);
        File file2 = new File(this.f18412c, str);
        if (com.huawei.openalliance.ad.utils.ai.a(file, file2)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean lastModified = file2.setLastModified(jCurrentTimeMillis);
            if (contentResource != null) {
                contentResource.a(jCurrentTimeMillis);
            }
            hw.b("FileDiskCache", "set last modify result: " + lastModified);
            a(str, contentResource);
            z = true;
        } else {
            z = false;
        }
        if (contentResource == null || contentResource.f() != 1) {
            d((String) null);
            return z;
        }
        d(str);
        return z;
    }

    public void a(String str, int i) {
        dq dqVar;
        if (!new File(this.f18412c, str).exists() || (dqVar = this.d) == null) {
            return;
        }
        dqVar.a(str, i);
    }

    public void a(String str) {
        File file = new File(this.f18412c, str);
        if (file.exists()) {
            com.huawei.openalliance.ad.utils.ai.c(file);
            dq dqVar = this.d;
            if (dqVar != null) {
                dqVar.a(str, System.currentTimeMillis());
            }
        }
    }

    public void a(dq dqVar) {
        this.d = dqVar;
    }

    public void a(dn dnVar) {
        if (dnVar != null) {
            this.e = dnVar;
        }
    }

    public void a(long j) {
        hw.a("FileDiskCache", "set max size: %d", Long.valueOf(j));
        this.f18410a = j;
    }

    public void a(int i) {
        hw.a("FileDiskCache", "set max num: %d", Integer.valueOf(i));
        this.f18411b = i;
    }

    public File a() {
        return this.f18412c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h() {
        File[] fileArrListFiles = this.f18412c.listFiles();
        if (fileArrListFiles != null) {
            return a(fileArrListFiles);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        File[] fileArrListFiles = this.f18412c.listFiles();
        long length = 0;
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    length += file.length();
                }
            }
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        hw.b("FileDiskCache", "clearAllExpiredFiles valid time: " + this.f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = this.f18412c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.lastModified() < jCurrentTimeMillis - this.f) {
                    hw.a("FileDiskCache", "remove old expired file, modify time: %d file: %s", Long.valueOf(file.lastModified()), com.huawei.openalliance.ad.utils.ds.a(com.huawei.openalliance.ad.utils.ai.h(file)));
                    if (com.huawei.openalliance.ad.utils.ai.a(file)) {
                        hw.a("FileDiskCache", "file delete success");
                        a(file.getName(), true, (Integer) 1);
                    }
                }
                if (file.isDirectory() && (("normal".equals(this.e.f()) && file.getName().startsWith(MetaCreativeType.AR)) || Constants.WEBVIEW_CACHE.equals(this.e.f()))) {
                    hw.a("FileDiskCache", "delete file: %s", com.huawei.openalliance.ad.utils.ds.a(file.getName()));
                    com.huawei.openalliance.ad.utils.ai.b(file);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<String> e() {
        dq dqVar;
        List<String> listE = this.e.e();
        return (com.huawei.openalliance.ad.utils.bm.a(listE) || (dqVar = this.d) == null) ? new HashSet() : dqVar.a(listE);
    }

    private void d(final String str) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.do.2
            @Override // java.lang.Runnable
            public void run() {
                Set setE = Cdo.this.e();
                if (!com.huawei.openalliance.ad.utils.dg.b(str)) {
                    setE.add(str);
                }
                Cdo.this.f();
                long jG = Cdo.this.g();
                hw.b("FileDiskCache", "cacheType: %s current used size: %s maxSize: %s", Cdo.this.e.f(), Long.valueOf(jG), Long.valueOf(Cdo.this.f18410a));
                if (jG > Cdo.this.f18410a) {
                    Cdo.this.a(jG, (Set<String>) setE);
                }
                int iH = Cdo.this.h();
                hw.b("FileDiskCache", "cacheType: %s current used num: %s maxNum: %s", Cdo.this.e.f(), Integer.valueOf(iH), Integer.valueOf(Cdo.this.f18411b));
                if (iH > Cdo.this.f18411b) {
                    Cdo.this.a(iH, (Set<String>) setE);
                }
            }
        }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
    }

    private boolean b(int i, List<ContentResource> list, Set<String> set) {
        hw.b("FileDiskCache", "delete files not recorded for num");
        File[] fileArrListFiles = this.f18412c.listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, new a());
            for (File file : fileArrListFiles) {
                if (file.isFile() && !a(file.getName(), list)) {
                    if (a(file, set) > 0) {
                        i--;
                    }
                    hw.a("FileDiskCache", "cachetype: %s current num: %d", this.e.f(), Integer.valueOf(i));
                    if (i <= this.f18411b) {
                        hw.b("FileDiskCache", "used num is lower than max num");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void b(long j, List<ContentResource> list, Set<String> set) {
        hw.b("FileDiskCache", "delete sorted content resource files");
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        for (ContentResource contentResource : list) {
            File file = new File(this.f18412c, contentResource.a());
            dn dnVar = this.e;
            boolean zA = dnVar == null ? false : dnVar.a(contentResource.a());
            if (hw.a()) {
                hw.a("FileDiskCache", "deleteFromSortedContentResources, isAccessed: %s", Boolean.valueOf(zA));
            }
            if (!zA && file.exists()) {
                j -= a(file, set);
                hw.a("FileDiskCache", "current size: %d", Long.valueOf(j));
                if (j <= this.f18410a) {
                    hw.b("FileDiskCache", "used cache space is lower than max size");
                    return;
                }
            } else if (zA) {
                hw.b("FileDiskCache", "file %s is using, not delete", contentResource.a());
            } else {
                hw.b("FileDiskCache", "file %s not exist, delete table entry", contentResource.a());
                a(contentResource.a(), false, (Integer) null);
            }
        }
    }

    private static boolean a(String str, List<ContentResource> list) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return false;
        }
        Iterator<ContentResource> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().a(), str)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(long j, List<ContentResource> list, Set<String> set) {
        hw.b("FileDiskCache", "delete files not recorded");
        File[] fileArrListFiles = this.f18412c.listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, new a());
            for (File file : fileArrListFiles) {
                if (file.isFile() && !a(file.getName(), list)) {
                    j -= a(file, set);
                    hw.a("FileDiskCache", "cachetype: %s current size: %d", this.e.f(), Long.valueOf(j));
                    if (j <= this.f18410a) {
                        hw.b("FileDiskCache", "used cache space is lower than max size");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, Integer num) {
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.a(str, z, num);
        }
    }

    private void a(String str, ContentResource contentResource) {
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.a(str, contentResource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, Set<String> set) {
        dq dqVar = this.d;
        List<ContentResource> listA = dqVar != null ? dqVar.a() : null;
        if (a(j, listA, set)) {
            hw.b("FileDiskCache", "there is enough space in disk cache");
        } else {
            b(g(), listA, set);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Set<String> set) {
        dq dqVar = this.d;
        List<ContentResource> listA = dqVar != null ? dqVar.a() : null;
        if (b(i, listA, set)) {
            hw.b("FileDiskCache", "there is enough space in disk cache");
        } else {
            a(h(), listA, set);
        }
    }

    private void a(int i, List<ContentResource> list, Set<String> set) {
        hw.b("FileDiskCache", "delete sorted content resource files for num");
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        for (ContentResource contentResource : list) {
            File file = new File(this.f18412c, contentResource.a());
            dn dnVar = this.e;
            boolean zA = dnVar == null ? false : dnVar.a(contentResource.a());
            if (hw.a()) {
                hw.a("FileDiskCache", "deleteFromSortedContentResources, isAccessed: %s", Boolean.valueOf(zA));
            }
            if (!zA && file.exists()) {
                if (a(file, set) > 0) {
                    i--;
                }
                hw.a("FileDiskCache", "cachetype: %s current num: %d", this.e.f(), Integer.valueOf(i));
                if (i <= this.f18411b) {
                    hw.b("FileDiskCache", "used cache num is lower than max num");
                    return;
                }
            } else if (zA) {
                hw.b("FileDiskCache", "file %s is using, not delete", contentResource.a());
            } else {
                hw.b("FileDiskCache", "file %s not exist, delete table entry", contentResource.a());
                a(contentResource.a(), false, (Integer) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.do$a */
    static class a implements Comparator<File> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }

        private a() {
        }
    }

    private long a(File file, Set<String> set) {
        if (!com.huawei.openalliance.ad.utils.bm.a(set) && set.contains(file.getName())) {
            if (hw.a()) {
                hw.a("FileDiskCache", "file %s in blackList, don't delete", file.getName());
            }
            return 0L;
        }
        long jLastModified = file.lastModified();
        hw.a("FileDiskCache", "remove old exceeded file, modify time: %d file: %s", Long.valueOf(jLastModified), file.getName());
        long length = file.length();
        if (!com.huawei.openalliance.ad.utils.ai.a(file)) {
            return 0L;
        }
        hw.b("FileDiskCache", "file %s deleted", file.getName());
        a(file.getName(), true, (Integer) 0);
        return length;
    }

    private int a(File[] fileArr) {
        int i = 0;
        for (File file : fileArr) {
            if (file.isFile()) {
                i++;
            }
        }
        return i;
    }

    public Cdo(File file, long j, int i) {
        this.f18412c = file;
        this.f18410a = j;
        this.f18411b = i;
        com.huawei.openalliance.ad.utils.ai.g(file);
    }
}
