package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class o87 {
    public static y87 a(String str) {
        d87 d87VarA = q87.a(str);
        if (d87VarA == null) {
            try {
                d87VarA = q87.b(new ee(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (d87VarA == null) {
            return null;
        }
        return new y87(str, d87VarA.a(), d87VarA.b(), d87VarA.d(), d87VarA.c(), d87VarA.e());
    }
}
