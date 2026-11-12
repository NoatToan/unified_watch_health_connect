package defpackage;

import android.content.Context;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes4.dex */
public class jkk {
    public static final String e = "jkk";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vibrator f22895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cpc f22896b;
    public boolean c = true;
    public xzd d = xzd.c();

    public interface a {
        void a(int i, String str);
    }

    public jkk(Context context) {
        this.f22895a = (Vibrator) context.getSystemService("vibrator");
    }

    public void a() {
        jpe.f(e, "Send Back");
        i(4, true);
    }

    public void b(boolean z) {
        jpe.f(e, "Send down");
        i(20, z);
    }

    public void c() {
        jpe.f(e, "Send Home");
        i(3, true);
    }

    public void d(boolean z) {
        jpe.f(e, "Send Left");
        i(21, z);
    }

    public void e() {
        jpe.f(e, "Send Menu");
        i(82, true);
    }

    public void f() {
        jpe.f(e, "Send Ok");
        i(66, true);
    }

    public void g() {
        jpe.f(e, "Send POWER");
        i(26, true);
    }

    public void h(boolean z) {
        jpe.f(e, "Send Right");
        i(22, z);
    }

    public void i(int i, boolean z) {
        String str = e;
        jpe.f(str, "sendKeyUpDownEvent " + i);
        cpc cpcVar = this.f22896b;
        if (cpcVar == null) {
            jpe.f(str, "RCManager is null");
            return;
        }
        cpcVar.g(0, i);
        if (z && this.c) {
            this.f22895a.vibrate(100L);
        }
        this.f22896b.g(1, i);
    }

    public void j(boolean z) {
        this.c = z;
    }

    public void k(cpc cpcVar) {
        this.f22896b = cpcVar;
    }

    public void l(boolean z) {
        jpe.f(e, "Send up");
        i(19, z);
    }

    public void m(boolean z) {
        jpe.f(e, "Send VOLUME DOWN");
        i(25, z);
    }

    public void n(boolean z) {
        jpe.f(e, "Send VOLUME UP");
        i(24, z);
    }
}
