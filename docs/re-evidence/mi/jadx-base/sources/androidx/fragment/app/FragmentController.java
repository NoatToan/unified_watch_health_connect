package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import defpackage.g6i;

/* JADX INFO: loaded from: classes.dex */
public class FragmentController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentHostCallback<?> f2338a;

    public FragmentController(FragmentHostCallback<?> fragmentHostCallback) {
        this.f2338a = fragmentHostCallback;
    }

    public static FragmentController b(FragmentHostCallback<?> fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) g6i.h(fragmentHostCallback, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        FragmentHostCallback<?> fragmentHostCallback = this.f2338a;
        fragmentHostCallback.e.m(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public void c() {
        this.f2338a.e.z();
    }

    public boolean d(MenuItem menuItem) {
        return this.f2338a.e.C(menuItem);
    }

    public void e() {
        this.f2338a.e.D();
    }

    public void f() {
        this.f2338a.e.F();
    }

    public void g() {
        this.f2338a.e.O();
    }

    public void h() {
        this.f2338a.e.S();
    }

    public void i() {
        this.f2338a.e.T();
    }

    public void j() {
        this.f2338a.e.V();
    }

    public boolean k() {
        return this.f2338a.e.c0(true);
    }

    public FragmentManager l() {
        return this.f2338a.e;
    }

    public void m() {
        this.f2338a.e.d1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2338a.e.A0().onCreateView(view, str, context, attributeSet);
    }
}
