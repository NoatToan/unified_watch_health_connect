package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import defpackage.awi;
import defpackage.dyq;
import defpackage.mti;
import defpackage.vsi;
import defpackage.z1j;
import defpackage.zhi;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.f;
import miuix.appcompat.internal.view.menu.g;
import miuix.appcompat.internal.view.menu.j;

/* JADX INFO: loaded from: classes3.dex */
public class a extends ActionMenuPresenter {
    public f G;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.a$a, reason: collision with other inner class name */
    public class C1029a extends g {
        public C1029a(Context context, d dVar, View view, View view2, boolean z) {
            super(context, dVar, view, view2, z);
            n(a.this.D);
            p(awi.E);
        }

        @Override // miuix.appcompat.internal.view.menu.g, miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public void a(boolean z) {
            super.a(z);
            View view = a.this.f26501k;
            if (view != null) {
                view.setSelected(false);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.g, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            a.this.c.close();
        }
    }

    public a(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2, int i3, int i4) {
        super(context, actionBarOverlayLayout, i, i2, i3, i4);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    public View N(Context context) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        f fVarJ = miuix.appcompat.internal.view.menu.a.j(this.c, 0, vsi.S, 0, 0, context.getString(z1j.p), 2);
        this.c.a0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{zhi.A});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        fVarJ.setIcon(drawable);
        fVarJ.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: fa8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f17591a.q0(menuItem);
            }
        });
        this.c.X(false);
        View viewL = l(fVarJ, null, viewGroup);
        viewL.setId(vsi.S);
        this.G = fVarJ;
        fVarJ.A(viewL);
        return viewL;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    public int Q() {
        Context context = this.f26498b;
        if (context != null) {
            return context.getResources().getInteger(mti.f27199a);
        }
        return 5;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    public int S(View view) {
        return dyq.e(view) ? 51 : 53;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    public boolean W(View view) {
        if (view == null) {
            return false;
        }
        f fVar = this.G;
        return (view instanceof EndActionMenuItemView) && !(fVar != null && fVar.i() == view);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter, miuix.appcompat.internal.view.menu.a, miuix.appcompat.internal.view.menu.h
    public boolean h(j jVar) {
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        new C1029a(this.f26498b, jVar, this.f26501k, this.C, true).e();
        return true;
    }

    public void o0(int i) {
        f fVar = this.G;
        if (fVar == null) {
            return;
        }
        fVar.s(true, i);
        r0();
    }

    public void p0() {
        f fVar = this.G;
        if (fVar == null) {
            return;
        }
        fVar.r(false);
        r0();
    }

    public final /* synthetic */ boolean q0(MenuItem menuItem) {
        d dVar = this.c;
        if (dVar != null) {
            miuix.appcompat.internal.view.menu.a.k(dVar, dVar.B(), T());
        }
        if (this.f26501k.isSelected()) {
            U(true);
        } else {
            j0();
        }
        return true;
    }

    public void r0() {
        f fVar = this.G;
        if (fVar == null) {
            return;
        }
        fVar.E();
    }
}
