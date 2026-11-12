package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import defpackage.mwi;
import defpackage.oqf;
import defpackage.smi;

/* JADX INFO: loaded from: classes.dex */
public final class j extends oqf implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {
    public static final int v = mwi.o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1517b;
    public final e c;
    public final d d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final MenuPopupWindow i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public i.a o;
    public ViewTreeObserver p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1519r;
    public int s;
    public boolean u;
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1518k = new b();
    public int t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!j.this.isShowing() || j.this.i.y()) {
                return;
            }
            View view = j.this.n;
            if (view == null || !view.isShown()) {
                j.this.dismiss();
            } else {
                j.this.i.a();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = j.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    j.this.p = view.getViewTreeObserver();
                }
                j jVar = j.this;
                jVar.p.removeGlobalOnLayoutListener(jVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public j(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.f1517b = context;
        this.c = eVar;
        this.e = z;
        this.d = new d(eVar, LayoutInflater.from(context), z, v);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(smi.d));
        this.m = view;
        this.i = new MenuPopupWindow(context, null, i, i2);
        eVar.c(this, context);
    }

    @Override // defpackage.hbm
    public void a() {
        if (!v()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        if (eVar != this.c) {
            return;
        }
        dismiss();
        i.a aVar = this.o;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // defpackage.hbm
    public void dismiss() {
        if (isShowing()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(i.a aVar) {
        this.o = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(k kVar) {
        if (kVar.hasVisibleItems()) {
            h hVar = new h(this.f1517b, kVar, this.n, this.e, this.g, this.h);
            hVar.i(this.o);
            hVar.g(oqf.t(kVar));
            hVar.setOnDismissListener(this.l);
            this.l = null;
            this.c.e(false);
            int iF = this.i.f();
            int iE = this.i.e();
            if ((Gravity.getAbsoluteGravity(this.t, androidx.core.view.c.A(this.m)) & 7) == 5) {
                iF += this.m.getWidth();
            }
            if (hVar.m(iF, iE)) {
                i.a aVar = this.o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(kVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oqf
    public void h(e eVar) {
    }

    @Override // defpackage.hbm
    public boolean isShowing() {
        return !this.q && this.i.isShowing();
    }

    @Override // defpackage.oqf
    public void l(View view) {
        this.m = view;
    }

    @Override // defpackage.hbm
    public ListView m() {
        return this.i.m();
    }

    @Override // defpackage.oqf
    public void o(boolean z) {
        this.d.d(z);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.f1518k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // defpackage.oqf
    public void p(int i) {
        this.t = i;
    }

    @Override // defpackage.oqf
    public void q(int i) {
        this.i.g(i);
    }

    @Override // defpackage.oqf
    public void r(boolean z) {
        this.u = z;
    }

    @Override // defpackage.oqf
    public void s(int i) {
        this.i.b(i);
    }

    @Override // defpackage.oqf
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z) {
        this.f1519r = false;
        d dVar = this.d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public final boolean v() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.q || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.setOnDismissListener(this);
        this.i.setOnItemClickListener(this);
        this.i.G(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.f1518k);
        this.i.A(view2);
        this.i.D(this.t);
        if (!this.f1519r) {
            this.s = oqf.k(this.d, null, this.f1517b, this.f);
            this.f1519r = true;
        }
        this.i.C(this.s);
        this.i.F(2);
        this.i.E(j());
        this.i.a();
        ListView listViewM = this.i.m();
        listViewM.setOnKeyListener(this);
        if (this.u && this.c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1517b).inflate(mwi.n, (ViewGroup) listViewM, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.c.z());
            }
            frameLayout.setEnabled(false);
            listViewM.addHeaderView(frameLayout, null, false);
        }
        this.i.j(this.d);
        this.i.a();
        return true;
    }
}
