package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class e77 {
    public static boc a(float f, float f2, float f3, float f4, int i) {
        boc bocVarA = boc.a();
        float f5 = f + f2;
        int i2 = (int) (f5 / (f3 + f2));
        float f6 = (f5 / i2) - f2;
        bocVarA.c = f6;
        bocVarA.c = Math.min(f4, f6);
        bocVarA.f4419a = i2;
        bocVarA.f4420b = f2;
        return bocVarA;
    }
}
