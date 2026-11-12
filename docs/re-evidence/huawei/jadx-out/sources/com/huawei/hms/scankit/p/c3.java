package com.huawei.hms.scankit.p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.huawei.hms.scankit.p.c3, still in use, count: 1, list:
  (r0v0 com.huawei.hms.scankit.p.c3) from 0x002e: FILLED_NEW_ARRAY 
  (r1v1 com.huawei.hms.scankit.p.c3)
  (r0v0 com.huawei.hms.scankit.p.c3)
  (r3v2 com.huawei.hms.scankit.p.c3)
  (r2v1 com.huawei.hms.scankit.p.c3)
 A[WRAPPED] (LINE:18) elemType: com.huawei.hms.scankit.p.c3
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes34.dex */
public final class c3 {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final c3[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16022a;

    static {
        f = new c3[]{c3Var, new c3(1), c3Var, new c3(3)};
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) g.clone();
    }

    private c3(int i) {
        super(str, i);
        this.f16022a = i;
    }

    public static c3 a(int i) {
        if (i >= 0) {
            c3[] c3VarArr = f;
            if (i < c3VarArr.length) {
                return c3VarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
