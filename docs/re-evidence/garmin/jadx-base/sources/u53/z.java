package u53;

import o53.f2;
import ty1.q1;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f168776a = new x("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f168777b = new q1(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f168778c = new q1(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q1 f168779d = new q1(7);

    public static final void a(t13.g gVar, Object obj) {
        if (obj == f168776a) {
            return;
        }
        if (!(obj instanceof e0)) {
            Object objFold = gVar.fold(null, f168778c);
            objFold.getClass();
            ((f2) objFold).s(obj);
            return;
        }
        e0 e0Var = (e0) obj;
        f2<Object>[] f2VarArr = e0Var.f168729c;
        int length = f2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i14 = length - 1;
            f2<Object> f2Var = f2VarArr[length];
            f2Var.getClass();
            f2Var.s(e0Var.f168728b[length]);
            if (i14 < 0) {
                return;
            } else {
                length = i14;
            }
        }
    }

    public static final Object b(t13.g gVar) {
        Object objFold = gVar.fold(0, f168777b);
        objFold.getClass();
        return objFold;
    }

    public static final Object c(t13.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f168776a;
        }
        return obj instanceof Integer ? gVar.fold(new e0(gVar, ((Number) obj).intValue()), f168779d) : ((f2) obj).S();
    }
}
