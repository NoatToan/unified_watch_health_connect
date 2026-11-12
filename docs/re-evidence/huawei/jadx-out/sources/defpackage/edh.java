package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class edh {
    private static final int[] d = {8, 15, 13, 11, 16, 20, 21, 18, 19, 34, 35, 44, 45};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f32783c = {8, 15, 13, 16, 20, 21, 18, 19, 34, 35, 44, 45};

    public static boolean d(int i) {
        for (int i2 : d) {
            if (i2 == i) {
                LogUtil.a("ProductType", "isSupportHeartRate() is true, productType is:", Integer.valueOf(i));
                return true;
            }
        }
        LogUtil.a("ProductType", "isSupportHeartRate() is false, productType is:", Integer.valueOf(i));
        return false;
    }

    public static int[] a() {
        return (int[]) d.clone();
    }
}
