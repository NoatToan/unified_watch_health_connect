package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class c77 {
    public static boc a(float f, float f2, float f3, float f4, int i) {
        boc bocVarA = boc.a();
        int i2 = (int) ((f + f2) / (f2 + f4));
        bocVarA.c = f4;
        bocVarA.f4419a = i2;
        float f5 = i2 == 1 ? 0.0f : (f - (i2 * f4)) / (i2 - 1);
        bocVarA.f4420b = f5;
        bocVarA.f4420b = Math.min(f3, f5);
        return bocVarA;
    }
}
