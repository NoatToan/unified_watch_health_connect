package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ur3 implements wr3 {
    @Override // defpackage.wr3
    public void a(vr3 vr3Var) {
        c(vr3Var, n(vr3Var));
    }

    @Override // defpackage.wr3
    public float b(vr3 vr3Var) {
        return vr3Var.f().getElevation();
    }

    @Override // defpackage.wr3
    public void c(vr3 vr3Var, float f) {
        p(vr3Var).g(f, vr3Var.b(), vr3Var.e());
        g(vr3Var);
    }

    @Override // defpackage.wr3
    public void d(vr3 vr3Var, float f) {
        p(vr3Var).h(f);
    }

    @Override // defpackage.wr3
    public float e(vr3 vr3Var) {
        return k(vr3Var) * 2.0f;
    }

    @Override // defpackage.wr3
    public void f(vr3 vr3Var) {
        c(vr3Var, n(vr3Var));
    }

    @Override // defpackage.wr3
    public void g(vr3 vr3Var) {
        if (!vr3Var.b()) {
            vr3Var.a(0, 0, 0, 0);
            return;
        }
        float fN = n(vr3Var);
        float fK = k(vr3Var);
        int iCeil = (int) Math.ceil(oxk.a(fN, fK, vr3Var.e()));
        int iCeil2 = (int) Math.ceil(oxk.b(fN, fK, vr3Var.e()));
        vr3Var.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // defpackage.wr3
    public float h(vr3 vr3Var) {
        return k(vr3Var) * 2.0f;
    }

    @Override // defpackage.wr3
    public void i(vr3 vr3Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        vr3Var.c(new mxk(colorStateList, f));
        View viewF = vr3Var.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f2);
        c(vr3Var, f3);
    }

    @Override // defpackage.wr3
    public void j(vr3 vr3Var, ColorStateList colorStateList) {
        p(vr3Var).f(colorStateList);
    }

    @Override // defpackage.wr3
    public float k(vr3 vr3Var) {
        return p(vr3Var).d();
    }

    @Override // defpackage.wr3
    public ColorStateList l(vr3 vr3Var) {
        return p(vr3Var).b();
    }

    @Override // defpackage.wr3
    public void m(vr3 vr3Var, float f) {
        vr3Var.f().setElevation(f);
    }

    @Override // defpackage.wr3
    public float n(vr3 vr3Var) {
        return p(vr3Var).c();
    }

    @Override // defpackage.wr3
    public void o() {
    }

    public final mxk p(vr3 vr3Var) {
        return (mxk) vr3Var.d();
    }
}
