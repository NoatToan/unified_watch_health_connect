package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class sw9 {
    public static boc a(float f, int i, float f2) {
        boc bocVarA = boc.a();
        if (i < 1) {
            throw new IllegalArgumentException("Column count must be greater than 0!");
        }
        if (i == 1) {
            bocVarA.c = f;
        } else {
            bocVarA.c = ((f + f2) / i) - f2;
        }
        bocVarA.f4419a = i;
        bocVarA.f4420b = f2;
        return bocVarA;
    }
}
