package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes10.dex */
public class lct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39920b = BaseApplication.getAppPackage();

    public static int a(int i) {
        int i2 = 1;
        if (i != 1 && i != 2) {
            i2 = 3;
            if (i != 3) {
                return 2;
            }
        }
        return i2;
    }
}
