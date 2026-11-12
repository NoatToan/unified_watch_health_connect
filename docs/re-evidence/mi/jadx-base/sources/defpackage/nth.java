package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class nth extends s72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f28356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f28357b;

    public nth(Context context) {
        this.f28357b = hm1.h(context, R.attr.windowBackground);
    }

    @Override // defpackage.s72
    public boolean a() {
        return false;
    }

    @Override // defpackage.s72
    public void b() {
    }

    @Override // defpackage.s72
    public View c() {
        return this.f28356a;
    }

    @Override // defpackage.s72
    public ViewGroup.LayoutParams d() {
        return this.f28356a.getLayoutParams();
    }

    @Override // defpackage.s72
    public void e() {
    }

    @Override // defpackage.yoc
    public void executeCloseEnterAnimation() {
    }

    @Override // defpackage.yoc
    public void executeCloseExitAnimation() {
    }

    @Override // defpackage.yoc
    public void executeOpenEnterAnimation() {
    }

    @Override // defpackage.yoc
    public void executeOpenExitAnimation() {
    }

    @Override // defpackage.s72
    public void f() {
    }

    @Override // defpackage.s72
    public void g(View view, boolean z) {
        View view2 = this.f28356a;
        if (view2 != null) {
            if (dyq.f(view2.getContext())) {
                this.f28356a.setBackground(new ColorDrawable(-16777216));
            } else {
                this.f28356a.setBackground(this.f28357b);
            }
        }
    }

    @Override // defpackage.s72
    public boolean h() {
        return false;
    }

    @Override // defpackage.s72
    public void j() {
    }

    @Override // defpackage.s72
    public ViewGroup k(View view, boolean z) {
        this.f28356a = view;
        return (ViewGroup) view;
    }

    @Override // defpackage.s72
    public void l(boolean z) {
    }

    @Override // defpackage.s72
    public void m(boolean z) {
    }

    @Override // defpackage.s72
    public void n(boolean z) {
    }

    @Override // defpackage.s72
    public void o(i8h i8hVar) {
    }

    @Override // defpackage.s72
    public void p(h8h h8hVar) {
    }

    @Override // defpackage.s72
    public boolean q() {
        return false;
    }

    @Override // defpackage.s72
    public void r() {
    }
}
