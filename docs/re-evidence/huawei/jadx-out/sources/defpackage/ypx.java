package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;

/* JADX INFO: loaded from: classes20.dex */
public class ypx {
    public static void a(KfsSize kfsSize) throws yny {
        int iMin = kfsSize.min();
        int iMax = kfsSize.max();
        if (iMin < 0) {
            throw new yny("min can't be negative");
        }
        if (iMax < 0) {
            throw new yny("max can't be negative");
        }
        if (iMax < iMin) {
            throw new yny("max should be bigger than min");
        }
    }
}
