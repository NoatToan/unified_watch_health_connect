package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.inter.HiAd;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile cr f18338a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18339b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f18340c = null;
    private static int d = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(Context context) {
        gk gkVarB = fp.b(context);
        d = gkVarB.ao();
        String strAp = gkVarB.ap();
        f18340c = strAp;
        hw.a("DeviceManager", "get partner config, partnerRule: %s, partnerList: %s", Integer.valueOf(d), strAp);
    }

    private static void k(final Context context) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.cc.1
            @Override // java.lang.Runnable
            public void run() {
                cc.l(context);
            }
        });
    }

    private static void j(Context context) {
        if (f18340c == null) {
            l(context);
        }
    }

    public static boolean h(Context context) {
        if (c(context)) {
            return true;
        }
        j(context);
        if (!a(d, f18340c)) {
            List listAsList = Arrays.asList(f18340c.split(","));
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() != d) {
                    hw.b("DeviceManager", "The partnerList format is incorrect, %s", listAsList);
                }
            }
            String strA = com.huawei.openalliance.ad.utils.dk.a("ro.build.2b2c.partner.ext_channel");
            boolean z = !TextUtils.isEmpty(strA) && listAsList.contains(strA.substring(0, Math.min(d, strA.length())));
            k(context);
            return z;
        }
        hw.b("DeviceManager", "partnerRule out of range");
        k(context);
        return a();
    }

    public static boolean g(Context context) {
        return "HUAWEI".equalsIgnoreCase(a(context).j()) && "HUAWEI".equalsIgnoreCase(a(context).k());
    }

    public static boolean f(Context context) {
        Integer numJ = HiAd.a(context).j();
        cr crVarA = a(context);
        String strJ = crVarA.j();
        String strK = crVarA.k();
        if (numJ == null || 2 != numJ.intValue()) {
            return "HONOR".equalsIgnoreCase(strJ) && "HONOR".equalsIgnoreCase(strK);
        }
        return true;
    }

    public static boolean e(Context context) {
        com.huawei.openalliance.ad.utils.cn cnVarA = com.huawei.openalliance.ad.utils.cn.a(context);
        String strX = cnVarA.X();
        if (!TextUtils.isEmpty(strX)) {
            return TextUtils.equals(String.valueOf(true), strX);
        }
        boolean z = false;
        try {
            z = Build.MANUFACTURER.equalsIgnoreCase("HONOR") && Build.VERSION.SDK_INT >= 31 && com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT >= 33;
        } catch (Throwable th) {
            hw.d("DeviceManager", "isHonor6UpPhone Error:" + th.getClass().getSimpleName());
        }
        cnVarA.e(z);
        return z;
    }

    public static boolean d(Context context) {
        com.huawei.openalliance.ad.utils.cn cnVarA = com.huawei.openalliance.ad.utils.cn.a(context);
        String strW = cnVarA.W();
        if (!TextUtils.isEmpty(strW)) {
            return TextUtils.equals(String.valueOf(true), strW);
        }
        boolean z = c(context) && !e(context);
        cnVarA.d(z);
        return z;
    }

    public static boolean c(Context context) {
        StringBuilder sb;
        boolean z;
        com.huawei.openalliance.ad.utils.cn cnVarA = com.huawei.openalliance.ad.utils.cn.a(context.getApplicationContext());
        String strC = cnVarA.c();
        if (!TextUtils.isEmpty(strC)) {
            return TextUtils.equals(String.valueOf(true), strC);
        }
        boolean z2 = false;
        try {
            z = Build.BRAND.equalsIgnoreCase("HUAWEI") || Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") || Build.BRAND.equalsIgnoreCase("HONOR") || Build.MANUFACTURER.equalsIgnoreCase("HONOR");
            if (!z) {
                try {
                    z = ((Integer) Class.forName(ce.a(context).e()).getDeclaredField(EmuiUtil.EMUI_SDK_INT).get(null)).intValue() > 0;
                } catch (RuntimeException e) {
                    e = e;
                    z2 = z;
                    sb = new StringBuilder("isHuaweiPhone RuntimeException:");
                    sb.append(e.getClass().getSimpleName());
                    hw.d("DeviceManager", sb.toString());
                    z = z2;
                } catch (Throwable th) {
                    e = th;
                    z2 = z;
                    sb = new StringBuilder("isHuaweiPhone Error:");
                    sb.append(e.getClass().getSimpleName());
                    hw.d("DeviceManager", sb.toString());
                    z = z2;
                }
            }
        } catch (RuntimeException e2) {
            e = e2;
        } catch (Throwable th2) {
            e = th2;
        }
        cnVarA.a(z);
        return z;
    }

    public static boolean b(Context context) {
        return c(context) || a() || b();
    }

    public static boolean b() {
        return Build.MANUFACTURER.equalsIgnoreCase("Minrray") || Build.MANUFACTURER.equalsIgnoreCase("Hivendor") || Build.MANUFACTURER.equalsIgnoreCase("Huanglong");
    }

    private static boolean a(int i, String str) {
        return i < 2 || i > 11 || TextUtils.isEmpty(str) || !str.matches(Constants.PARTNER_REGEX);
    }

    public static boolean a() {
        String strA = com.huawei.openalliance.ad.utils.dk.a("ro.build.2b2c.partner.ext_channel");
        return !TextUtils.isEmpty(strA) && strA.startsWith(com.huawei.hms.ads.dynamic.a.t);
    }

    public static cr a(Context context) {
        cr crVarB;
        if (f18338a == null) {
            synchronized (f18339b) {
                if (f18338a == null) {
                    try {
                        if (d(context)) {
                            crVarB = cm.b(context);
                        } else if (e(context)) {
                            crVarB = cj.b(context);
                        } else {
                            crVarB = a() ? ci.b(context) : cq.b(context);
                        }
                        f18338a = crVarB;
                    } catch (Throwable th) {
                        f18338a = cm.b(context);
                        hw.c("DeviceManager", "init device manager error, " + th.getClass().getSimpleName());
                    }
                }
            }
        }
        return f18338a;
    }
}
