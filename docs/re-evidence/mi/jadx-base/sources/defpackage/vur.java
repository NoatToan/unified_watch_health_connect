package defpackage;

import android.content.Context;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.YRNDevConfigInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vur {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f37247b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d1d f37248a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final vur f37249a = new vur();
    }

    public static vur j() {
        return b.f37249a;
    }

    public void a(String str, String str2) {
        synchronized (f37247b) {
            try {
                if (this.f37248a != null) {
                    long jNanoTime = System.nanoTime();
                    this.f37248a.b(m("DEV_MODE_INFO_", str, str2));
                    zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.deleteDevModeInfo:" + str + ", " + str2 + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, module:" + str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<YRNDevModeInfo> b() {
        List<YRNDevModeInfo> listC;
        synchronized (f37247b) {
            listC = c("DEV_MODE_INFO_", "getAllDevModeInfoInStorage");
        }
        return listC;
    }

    public final List<YRNDevModeInfo> c(String str, String str2) {
        if (this.f37248a != null) {
            long jNanoTime = System.nanoTime();
            List<YRNDevModeInfo> listA = this.f37248a.a(str);
            zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.getAllDevModeInfoInStorage:" + str2 + ":, spend:" + (System.nanoTime() - jNanoTime) + " ns");
            if (listA != null && listA.size() != 0) {
                return listA;
            }
        }
        return null;
    }

    public YRNBundleInfo d(String str, String str2) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return null;
                }
                long jNanoTime = System.nanoTime();
                YRNBundleInfo yRNBundleInfoD = this.f37248a.d(m("BUNDLE_INFO_BUILTIN_", str, str2));
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.getBuiltInBundleInfo:" + str2 + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, BundleInfo:" + yRNBundleInfoD);
                return yRNBundleInfoD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public YRNBundleInfo e(String str, String str2, String str3) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return null;
                }
                long jNanoTime = System.nanoTime();
                String strM = m(n(str), str2, str3);
                YRNBundleInfo yRNBundleInfoD = this.f37248a.d(strM);
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.getBundleInfo:" + str3 + ", envType:" + str + ", key:" + strM + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, BundleInfo:" + yRNBundleInfoD);
                return yRNBundleInfoD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public YRNBundleInfo f(String str, String str2) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return null;
                }
                long jNanoTime = System.nanoTime();
                YRNBundleInfo yRNBundleInfoD = this.f37248a.d(m("BUNDLE_INFO_DEV_BRANCH", str, str2));
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.getDevBranchBundleInfo:" + str2 + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, BundleInfo:" + yRNBundleInfoD);
                return yRNBundleInfoD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public YRNDevConfigInfo g(String str) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return null;
                }
                return this.f37248a.e(h(str));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String h(String str) {
        return "DEV_MODE_CONFIG_INFO_" + str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR;
    }

    public YRNDevModeInfo i(String str, String str2) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return null;
                }
                long jNanoTime = System.nanoTime();
                YRNDevModeInfo yRNDevModeInfoF = this.f37248a.f(m("DEV_MODE_INFO_", str, str2));
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.getDevModeInfo:" + str + ", " + str2 + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, DevModeInfo:" + yRNDevModeInfoF);
                return yRNDevModeInfoF;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String k(String str, YRNBundleInfo yRNBundleInfo) {
        return str + yRNBundleInfo.getAppName() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + yRNBundleInfo.getModule();
    }

    public final String l(String str, YRNDevModeInfo yRNDevModeInfo) {
        return str + yRNDevModeInfo.a() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + yRNDevModeInfo.e();
    }

    public final String m(String str, String str2, String str3) {
        return str + str2 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str3;
    }

    public final String n(String str) {
        return "BUNDLE_INFO_DEFAULT_" + str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR;
    }

    public void o(Context context) {
        if (this.f37248a != null || context == null) {
            return;
        }
        this.f37248a = new byr(context);
    }

    public boolean p(YRNBundleInfo yRNBundleInfo) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                boolean zC = this.f37248a.c(k("BUNDLE_INFO_BUILTIN_", yRNBundleInfo), yRNBundleInfo);
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.saveBuiltInBundleInfo:" + yRNBundleInfo.getModule() + ", success:" + zC + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, BundleInfo:" + yRNBundleInfo);
                return zC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q(String str, YRNBundleInfo yRNBundleInfo) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                boolean zC = this.f37248a.c(k(n(str), yRNBundleInfo), yRNBundleInfo);
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.saveBundleInfo:" + yRNBundleInfo.getModule() + "\nenvType:" + str + "\nsuccess:" + zC + "\nspend:" + (System.nanoTime() - jNanoTime) + " ns\nBundleInfo:" + yRNBundleInfo);
                return zC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r(YRNBundleInfo yRNBundleInfo) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                boolean zC = this.f37248a.c(k("BUNDLE_INFO_DEV_BRANCH", yRNBundleInfo), yRNBundleInfo);
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.saveDevBranchBundleInfo:" + yRNBundleInfo.getModule() + ", success:" + zC + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, BundleInfo:" + yRNBundleInfo);
                return zC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean s(String str, YRNDevConfigInfo yRNDevConfigInfo) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return false;
                }
                return this.f37248a.h(h(str), yRNDevConfigInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(YRNDevModeInfo yRNDevModeInfo) {
        synchronized (f37247b) {
            try {
                if (this.f37248a == null) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                boolean zG = this.f37248a.g(l("DEV_MODE_INFO_", yRNDevModeInfo), yRNDevModeInfo);
                zxr.a("YRN_YRNV3_SDK", "YRNBundleStorageManager.saveDevModeInfo:" + yRNDevModeInfo.a() + ", " + yRNDevModeInfo.e() + ", success:" + zG + ", spend:" + (System.nanoTime() - jNanoTime) + " ns, DevModeInfo:" + yRNDevModeInfo);
                return zG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vur() {
    }
}
