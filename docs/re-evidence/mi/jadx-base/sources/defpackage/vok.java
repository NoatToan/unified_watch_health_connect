package defpackage;

import androidx.annotation.CheckResult;

/* JADX INFO: loaded from: classes4.dex */
public class vok extends nb2<vok> {
    @CheckResult
    public static vok l0(Class<?> cls) {
        return new vok().d(cls);
    }

    @CheckResult
    public static vok m0(jy6 jy6Var) {
        return new vok().e(jy6Var);
    }

    @CheckResult
    public static vok n0(pzd pzdVar) {
        return new vok().d0(pzdVar);
    }

    @Override // defpackage.nb2
    public boolean equals(Object obj) {
        return (obj instanceof vok) && super.equals(obj);
    }

    @Override // defpackage.nb2
    public int hashCode() {
        return super.hashCode();
    }
}
