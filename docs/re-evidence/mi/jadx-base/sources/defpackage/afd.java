package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class afd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f947a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f948b = Charset.forName("ISO-8859-1");
    public static final Object c = new Object();

    public static void a(ak8 ak8Var, ak8 ak8Var2) {
        al9 al9Var = ak8Var.f1122b;
        if (al9Var != null) {
            ak8Var2.f1122b = al9Var.clone();
        }
    }
}
