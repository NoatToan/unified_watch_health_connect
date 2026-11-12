package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Cdo f18407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dp f18408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f18409c = new byte[0];
    private Context d;
    private SoftReference<List<String>> e;
    private String f;
    private String g;

    public void j(String str) {
        String strK;
        Cdo cdoA = a(true);
        if (cdoA == null || (strK = k(str)) == null) {
            return;
        }
        try {
            cdoA.c(strK);
        } catch (Exception e) {
            hw.c(this.f, "deleteCacheFile " + e.getClass().getSimpleName());
        }
    }

    public void h(String str) {
        Cdo cdoA = a(true);
        if (cdoA == null) {
            hw.c(this.f, "fileDiskCache is null");
            return;
        }
        String strK = k(str);
        if (TextUtils.isEmpty(strK)) {
            return;
        }
        cdoA.a(strK);
    }

    public boolean g(String str) {
        String strC = c(str);
        return strC != null && com.huawei.openalliance.ad.utils.ai.d(new File(strC));
    }

    public boolean f(String str) {
        String strC = c(str);
        return strC != null && com.huawei.openalliance.ad.utils.ai.b(strC);
    }

    public String f() {
        return this.g;
    }

    public List<String> e() {
        SoftReference<List<String>> softReference = this.e;
        List<String> list = softReference != null ? softReference.get() : null;
        return com.huawei.openalliance.ad.utils.bm.a(list) ? new ArrayList() : list;
    }

    public String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strD = d(str);
        return f(strD) ? strD : "";
    }

    public void d() {
        if (this.e != null) {
            this.e = null;
        }
    }

    public String c(String str) {
        String strK = k(str);
        if (strK != null) {
            return b(strK);
        }
        return null;
    }

    public long c() {
        Cdo cdoA = a(false);
        if (cdoA == null) {
            return 0L;
        }
        return cdoA.b();
    }

    public void b(long j) {
        Cdo cdoA = a(false);
        if (cdoA == null) {
            return;
        }
        cdoA.b(j);
    }

    public String b(String str) {
        Cdo cdoA = a(false);
        if (cdoA == null) {
            return null;
        }
        return cdoA.b(str);
    }

    public int b() {
        Cdo cdoA = a(false);
        if (cdoA == null) {
            return 0;
        }
        return cdoA.c();
    }

    public boolean a(String str) {
        dp dpVar = this.f18408b;
        if (dpVar != null) {
            return dpVar.a(str);
        }
        return false;
    }

    public boolean a(File file, String str, ContentResource contentResource) {
        Cdo cdoA = a(true);
        if (cdoA == null) {
            hw.c(this.f, "fileDiskCache is null");
            return false;
        }
        if (contentResource != null) {
            contentResource.e(this.g);
        }
        String strK = k(str);
        if (strK == null || file == null || !file.exists()) {
            hw.c(this.f, "param error");
            return false;
        }
        try {
            return cdoA.a(strK, file, contentResource);
        } catch (Exception e) {
            hw.c(this.f, "putOuterFileToCache " + e.getClass().getSimpleName());
            return false;
        }
    }

    public void a(List<String> list, boolean z) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        try {
            SoftReference<List<String>> softReference = this.e;
            List<String> arrayList = softReference != null ? softReference.get() : null;
            if (com.huawei.openalliance.ad.utils.bm.a(arrayList)) {
                arrayList = new ArrayList<>();
            } else if (z) {
                arrayList.clear();
            }
            arrayList.addAll(list);
            this.e = new SoftReference<>(arrayList);
        } catch (Throwable th) {
            hw.d(this.f, "updateCacheExcludeList exception: %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, int i) {
        Cdo cdoA = a(true);
        if (cdoA == null) {
            hw.c(this.f, "fileDiskCache is null");
            return;
        }
        String strK = k(str);
        if (TextUtils.isEmpty(strK)) {
            return;
        }
        cdoA.a(strK, i);
    }

    public void a(long j) {
        Cdo cdoA = a(false);
        if (cdoA == null) {
            return;
        }
        cdoA.a(j);
    }

    public void a(int i) {
        Cdo cdoA = a(false);
        if (cdoA == null) {
            return;
        }
        cdoA.a(i);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a() {
        dp dpVar;
        synchronized (this.f18409c) {
            Cdo cdo = this.f18407a;
            if (cdo != null) {
                try {
                    try {
                        cdo.d();
                    } catch (Exception unused) {
                        hw.d(this.f, "clear cache error");
                    }
                    this.f18407a = null;
                    dpVar = this.f18408b;
                    try {
                        if (dpVar != null) {
                            try {
                                dpVar.stopWatching();
                            } catch (Exception unused2) {
                                hw.d(this.f, "stop watching error");
                            }
                            this.f18408b = null;
                        }
                        d();
                    } catch (Throwable th) {
                        this.f18408b = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f18407a = null;
                    throw th2;
                }
            } else {
                dpVar = this.f18408b;
                if (dpVar != null) {
                    dpVar.stopWatching();
                    this.f18408b = null;
                }
                d();
            }
            throw th;
        }
    }

    public static String l(String str) {
        String[] strArrSplit;
        int length;
        if (com.huawei.openalliance.ad.utils.dg.b(str) || (length = (strArrSplit = str.split(File.separator)).length) == 0) {
            return str;
        }
        String str2 = strArrSplit[length - 1];
        if (com.huawei.openalliance.ad.utils.dg.b(str2)) {
            return str;
        }
        return Scheme.DISKCACHE + str2;
    }

    public static String k(String str) {
        String string = Scheme.DISKCACHE.toString();
        if (str == null || !str.startsWith(string)) {
            return null;
        }
        return str.substring(string.length());
    }

    public static boolean i(String str) {
        return str != null && str.startsWith(Scheme.DISKCACHE.toString());
    }

    public static String d(String str) {
        return Scheme.DISKCACHE.toString() + com.huawei.openalliance.ad.utils.db.a(str);
    }

    private boolean b(Context context, String str) {
        File fileA;
        String str2;
        StringBuilder sb;
        if (this.f18407a != null) {
            return true;
        }
        if (context == null || (fileA = a(context, str)) == null) {
            return false;
        }
        try {
            dp dpVar = Build.VERSION.SDK_INT >= 29 ? new dp(fileA) : new dp(fileA.getPath());
            this.f18408b = dpVar;
            dpVar.startWatching();
        } catch (Throwable th) {
            hw.c(this.f, "start fileListener failed, " + th.getClass().getSimpleName());
            hw.a(3, th);
            this.f18408b = null;
        }
        try {
            gk gkVarB = fp.b(context);
            Cdo cdo = new Cdo(fileA, ((long) gkVarB.bt()) * 1048576, gkVarB.aO());
            this.f18407a = cdo;
            cdo.b(gkVarB.bU().longValue());
            this.f18407a.a(new dl(context, str));
            this.f18407a.a(this);
            return true;
        } catch (IllegalStateException e) {
            e = e;
            str2 = this.f;
            sb = new StringBuilder("Unable to create FileDiskCache");
            sb.append(e.getClass().getSimpleName());
            hw.c(str2, sb.toString());
            return false;
        } catch (Exception e2) {
            e = e2;
            str2 = this.f;
            sb = new StringBuilder("Unable to create FileDiskCache ex: ");
            sb.append(e.getClass().getSimpleName());
            hw.c(str2, sb.toString());
            return false;
        }
    }

    public static File a(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        if (com.huawei.openalliance.ad.utils.dg.b(str) || "normal".equals(str)) {
            return new File(cacheDir, File.separator + Constants.PPS_ROOT_PATH + File.separator + "pps_diskcache");
        }
        if (com.huawei.openalliance.ad.utils.dg.e(str, Constants.UIENGINE_CACHE)) {
            cacheDir = com.huawei.openalliance.ad.utils.ab.i(context).getCacheDir();
        }
        return new File(cacheDir, File.separator + Constants.PPS_ROOT_PATH + File.separator + "pps_new_diskcache" + File.separator + str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[Catch: Exception -> 0x002f, all -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x001e, B:12:0x0024), top: B:22:0x001e, outer: #1 }] */
    private Cdo a(boolean z) {
        Cdo cdo;
        synchronized (this.f18409c) {
            Cdo cdo2 = this.f18407a;
            if (cdo2 != null) {
                if (z) {
                    File fileA = cdo2.a();
                    if (fileA != null) {
                        try {
                            if (!fileA.exists()) {
                                this.f18407a = null;
                                b(this.d, this.g);
                            }
                        } catch (Exception e) {
                            hw.c(this.f, "init diskcache error:" + e.getClass().getSimpleName());
                        }
                    } else {
                        this.f18407a = null;
                        b(this.d, this.g);
                    }
                }
                throw th;
            }
            hw.b(this.g, "fileDiskCache is null, recreate");
            b(this.d, this.g);
            cdo = this.f18407a;
        }
        return cdo;
    }

    public dn(Context context, String str) {
        this.f = "DiskCacheManager_" + str;
        if (context == null) {
            return;
        }
        this.g = str;
        this.d = context.getApplicationContext();
        b(context, str);
    }
}
