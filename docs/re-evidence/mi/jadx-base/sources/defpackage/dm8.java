package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public class dm8 implements eqe {
    public static final dm8 c = new dm8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15681a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15682b = 5;

    public static dm8 f() {
        return c;
    }

    public static String g(String str, Throwable th) {
        return str + '\n' + h(th);
    }

    public static String h(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // defpackage.eqe
    public void a(String str, String str2) {
        k(6, str, str2);
    }

    @Override // defpackage.eqe
    public void b(String str, String str2, Throwable th) {
        l(6, str, str2, th);
    }

    @Override // defpackage.eqe
    public boolean c(int i) {
        return this.f15682b <= i;
    }

    @Override // defpackage.eqe
    public void d(String str, String str2) {
        k(3, str, str2);
    }

    @Override // defpackage.eqe
    public void e(String str, String str2) {
        k(6, str, str2);
    }

    @Override // defpackage.eqe
    public void i(String str, String str2) {
        k(4, str, str2);
    }

    public final String j(String str) {
        if (this.f15681a == null) {
            return str;
        }
        return this.f15681a + ":" + str;
    }

    public final void k(int i, String str, String str2) {
        Log.println(i, j(str), str2);
    }

    public final void l(int i, String str, String str2, Throwable th) {
        Log.println(i, j(str), g(str2, th));
    }

    public void m(int i) {
        this.f15682b = i;
    }

    @Override // defpackage.eqe
    public void v(String str, String str2) {
        k(2, str, str2);
    }

    @Override // defpackage.eqe
    public void w(String str, String str2) {
        k(5, str, str2);
    }

    @Override // defpackage.eqe
    public void d(String str, String str2, Throwable th) {
        l(3, str, str2, th);
    }

    @Override // defpackage.eqe
    public void e(String str, String str2, Throwable th) {
        l(6, str, str2, th);
    }

    @Override // defpackage.eqe
    public void w(String str, String str2, Throwable th) {
        l(5, str, str2, th);
    }
}
