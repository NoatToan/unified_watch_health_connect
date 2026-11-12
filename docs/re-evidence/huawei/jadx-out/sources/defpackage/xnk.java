package defpackage;

import com.huawei.wear.oversea.packageinfo.PackageUtilApi;

/* JADX INFO: loaded from: classes20.dex */
public class xnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PackageUtilApi f53198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53199b = new Object();

    private static PackageUtilApi d() {
        if (f53198a == null) {
            synchronized (f53199b) {
                if (f53198a == null) {
                    f53198a = xmm.e(xml.d());
                }
            }
        }
        return f53198a;
    }

    public static String b() {
        if (d() == null) {
            return "";
        }
        return d().getWearWalletSdkVersionName();
    }
}
