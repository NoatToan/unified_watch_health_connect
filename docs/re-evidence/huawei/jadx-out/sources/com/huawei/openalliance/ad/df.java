package com.huawei.openalliance.ad;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.beans.metadata.v3.CachedContent;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.IAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.huawei.openalliance.ad.inter.data.i f18381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.huawei.openalliance.ad.inter.data.d f18382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IAd f18383c;
    private static List<String> d;
    private static Map<String, List<CachedContent>> e;
    private static final byte[] f = new byte[0];
    private static ContentRecord g;
    private static ContentRecord h;
    private static Drawable i;
    private static Bitmap j;
    private static ContentRecord k;
    private static com.huawei.openalliance.ad.inter.data.e l;
    private static ContentRecord m;
    private static int n;
    private static com.huawei.openalliance.ad.inter.data.d o;
    private static int p;

    public static int p() {
        return p;
    }

    public static void o() {
        synchronized (f) {
            n = 0;
        }
    }

    public static int n() {
        int i2;
        synchronized (f) {
            i2 = n;
        }
        return i2;
    }

    public static ContentRecord m() {
        ContentRecord contentRecord;
        synchronized (f) {
            contentRecord = m;
        }
        return contentRecord;
    }

    public static com.huawei.openalliance.ad.inter.data.e l() {
        com.huawei.openalliance.ad.inter.data.e eVar;
        synchronized (f) {
            eVar = l;
        }
        return eVar;
    }

    public static ContentRecord k() {
        ContentRecord contentRecord;
        synchronized (f) {
            contentRecord = k;
        }
        return contentRecord;
    }

    public static Bitmap j() {
        Bitmap bitmap;
        synchronized (f) {
            bitmap = j;
        }
        return bitmap;
    }

    public static Drawable i() {
        Drawable drawable;
        synchronized (f) {
            drawable = i;
        }
        return drawable;
    }

    public static ContentRecord h() {
        ContentRecord contentRecord;
        synchronized (f) {
            contentRecord = h;
        }
        return contentRecord;
    }

    public static ContentRecord g() {
        ContentRecord contentRecord;
        synchronized (f) {
            contentRecord = g;
        }
        return contentRecord;
    }

    public static Map<String, List<CachedContent>> f() {
        Map<String, List<CachedContent>> map;
        synchronized (f) {
            map = e;
        }
        return map;
    }

    public static List<String> e() {
        List<String> list;
        synchronized (f) {
            list = d;
        }
        return list;
    }

    public static IAd d() {
        IAd iAd;
        synchronized (f) {
            iAd = f18383c;
        }
        return iAd;
    }

    public static void c(ContentRecord contentRecord) {
        synchronized (f) {
            try {
                if (contentRecord == null) {
                    hw.a("GlobalDataShare", "set icon ad null");
                    k = null;
                } else {
                    k = contentRecord;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static com.huawei.openalliance.ad.inter.data.d c() {
        com.huawei.openalliance.ad.inter.data.d dVar;
        synchronized (f) {
            dVar = f18382b;
        }
        return dVar;
    }

    public static void b(com.huawei.openalliance.ad.inter.data.d dVar) {
        synchronized (f) {
            try {
                if (dVar == null) {
                    hw.a("GlobalDataShare", "set interstitial ad null");
                    f18382b = null;
                } else {
                    f18382b = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(ContentRecord contentRecord) {
        synchronized (f) {
            try {
                if (contentRecord == null) {
                    hw.a("GlobalDataShare", "set spare splash ad null");
                    h = null;
                } else {
                    h = contentRecord;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(int i2) {
        p = i2;
    }

    public static com.huawei.openalliance.ad.inter.data.i b() {
        com.huawei.openalliance.ad.inter.data.i iVar;
        synchronized (f) {
            iVar = f18381a;
        }
        return iVar;
    }

    public static void a(Map<String, List<CachedContent>> map) {
        synchronized (f) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                hw.a("GlobalDataShare", "set kit cached templateIds null");
                e = null;
            } else {
                e = map;
            }
        }
    }

    public static void a(List<String> list) {
        synchronized (f) {
            if (com.huawei.openalliance.ad.utils.bm.a(list)) {
                hw.a("GlobalDataShare", "set kit cached contentIds null");
                d = null;
            } else {
                d = list;
            }
        }
    }

    public static void a(com.huawei.openalliance.ad.inter.data.i iVar) {
        synchronized (f) {
            try {
                if (iVar == null) {
                    hw.a("GlobalDataShare", "set reward ad null");
                    f18381a = null;
                } else {
                    f18381a = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(com.huawei.openalliance.ad.inter.data.e eVar) {
        synchronized (f) {
            try {
                if (eVar == null) {
                    hw.a("GlobalDataShare", "set native ad null");
                    l = null;
                } else {
                    l = eVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(com.huawei.openalliance.ad.inter.data.d dVar) {
        synchronized (f) {
            try {
                if (dVar == null) {
                    hw.a("GlobalDataShare", "interstitial is null.");
                    o = null;
                } else {
                    o = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(IAd iAd) {
        synchronized (f) {
            try {
                if (iAd == null) {
                    hw.a("GlobalDataShare", "set linkedSplashAd ad null");
                    f18383c = null;
                } else {
                    f18383c = iAd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(ContentRecord contentRecord) {
        synchronized (f) {
            try {
                if (contentRecord == null) {
                    hw.a("GlobalDataShare", "set normal splash ad null");
                    g = null;
                } else {
                    g = contentRecord;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Drawable drawable) {
        synchronized (f) {
            try {
                if (drawable == null) {
                    hw.a("GlobalDataShare", "set drawable ad null");
                    i = null;
                } else {
                    i = drawable;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Bitmap bitmap) {
        synchronized (f) {
            try {
                if (bitmap == null) {
                    hw.a("GlobalDataShare", "set bitmap ad null");
                    j = null;
                } else {
                    j = bitmap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(int i2) {
        synchronized (f) {
            n = i2;
        }
    }

    public static com.huawei.openalliance.ad.inter.data.d a() {
        com.huawei.openalliance.ad.inter.data.d dVar;
        synchronized (f) {
            dVar = o;
        }
        return dVar;
    }
}
