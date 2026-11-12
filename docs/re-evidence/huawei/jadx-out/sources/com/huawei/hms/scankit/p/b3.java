package com.huawei.hms.scankit.p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.huawei.hms.scankit.p.b3, still in use, count: 1, list:
  (r0v0 com.huawei.hms.scankit.p.b3) from 0x002e: FILLED_NEW_ARRAY 
  (r1v1 com.huawei.hms.scankit.p.b3)
  (r0v0 com.huawei.hms.scankit.p.b3)
  (r3v2 com.huawei.hms.scankit.p.b3)
  (r2v1 com.huawei.hms.scankit.p.b3)
 A[WRAPPED] (LINE:32) elemType: com.huawei.hms.scankit.p.b3
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
/* JADX INFO: loaded from: classes10.dex */
public final class b3 {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final b3[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15995a;

    static {
        f = new b3[]{b3Var, new b3(1), b3Var, new b3(3)};
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) g.clone();
    }

    private b3(int i) {
        super(str, i);
        this.f15995a = i;
    }

    public int b() {
        return this.f15995a;
    }

    public static b3 a(int i) {
        if (i >= 0) {
            b3[] b3VarArr = f;
            if (i < b3VarArr.length) {
                return b3VarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
