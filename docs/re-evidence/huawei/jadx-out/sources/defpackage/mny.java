package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class mny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mny f42049a;
    private static final Object d = new Object();
    private mur e = null;

    private mny() {
    }

    public static mny a() {
        mny mnyVar;
        synchronized (d) {
            if (f42049a == null) {
                f42049a = new mny();
            }
            mnyVar = f42049a;
        }
        return mnyVar;
    }

    public boolean b(mur murVar) {
        synchronized (this) {
            if (murVar != null) {
                if (murVar.c() != null) {
                    mur murVar2 = this.e;
                    if (murVar2 == null) {
                        this.e = murVar;
                        return true;
                    }
                    if (murVar2.d() == murVar.d() && Arrays.equals(murVar.c(), this.e.c())) {
                        LogUtil.j("CheckFileDataUtil", "report is repeat.");
                        this.e = null;
                        return false;
                    }
                    this.e = murVar;
                    return true;
                }
            }
            LogUtil.j("CheckFileDataUtil", "report is empty.");
            return false;
        }
    }
}
