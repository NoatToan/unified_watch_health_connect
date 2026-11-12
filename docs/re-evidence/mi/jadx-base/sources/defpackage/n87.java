package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class n87 {
    public static x87 a(String str) {
        c87 c87VarA = p87.a(str);
        if (c87VarA == null) {
            try {
                c87VarA = p87.b(new fe(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (c87VarA == null) {
            return null;
        }
        return new x87(str, c87VarA.a(), c87VarA.b(), c87VarA.d(), c87VarA.c(), c87VarA.e());
    }
}
