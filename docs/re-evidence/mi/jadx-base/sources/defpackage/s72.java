package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s72 implements yoc {
    public static boolean i(Context context) {
        return (context instanceof AppCompatActivity) && ((AppCompatActivity) context).isInFloatingWindowMode();
    }

    public abstract boolean a();

    public abstract void b();

    public abstract View c();

    public abstract ViewGroup.LayoutParams d();

    public abstract void e();

    public abstract void f();

    @SuppressLint({"ClickableViewAccessibility"})
    public abstract void g(View view, boolean z);

    public abstract boolean h();

    public abstract void j();

    public abstract ViewGroup k(View view, boolean z);

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n(boolean z);

    public abstract void o(i8h i8hVar);

    public abstract void p(h8h h8hVar);

    public abstract boolean q();

    public abstract void r();
}
