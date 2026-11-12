package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.k0;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f4826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f4827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f4832i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f4836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f4837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n.a f4838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f4839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4841r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4842t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4844w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f4833j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f4834k = new b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4843v = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            r rVar = r.this;
            boolean zA = rVar.a();
            k0 k0Var = rVar.f4832i;
            if (!zA || k0Var.A) {
                return;
            }
            View view2 = rVar.f4837n;
            if (view2 == null || !view2.isShown()) {
                rVar.dismiss();
            } else {
                k0Var.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
            r rVar = r.this;
            ViewTreeObserver viewTreeObserver = rVar.f4839p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    rVar.f4839p = view2.getViewTreeObserver();
                }
                rVar.f4839p.removeGlobalOnLayoutListener(rVar.f4833j);
            }
            view2.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, h hVar, View view2, int i14, int i15, boolean z14) {
        this.f4825b = context;
        this.f4826c = hVar;
        this.f4828e = z14;
        this.f4827d = new g(hVar, LayoutInflater.from(context), z14, R.layout.abc_popup_menu_item_layout);
        this.f4830g = i14;
        this.f4831h = i15;
        Resources resources = context.getResources();
        this.f4829f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4836m = view2;
        this.f4832i = new k0(context, null, i14, i15);
        hVar.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.q
    public final boolean a() {
        return !this.f4840q && this.f4832i.B.isShowing();
    }

    @Override // androidx.appcompat.view.menu.l
    public final void b(h hVar) {
    }

    @Override // androidx.appcompat.view.menu.l
    public final void d(View view2) {
        this.f4836m = view2;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void dismiss() {
        if (a()) {
            this.f4832i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public final d0 e() {
        return this.f4832i.f5134c;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void f(boolean z14) {
        this.f4827d.f4766c = z14;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void g(int i14) {
        this.f4843v = i14;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void h(int i14) {
        this.f4832i.f5137f = i14;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f4835l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void j(boolean z14) {
        this.f4844w = z14;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void k(int i14) {
        this.f4832i.g(i14);
    }

    @Override // androidx.appcompat.view.menu.n
    public final void onCloseMenu(h hVar, boolean z14) {
        if (hVar != this.f4826c) {
            return;
        }
        dismiss();
        n.a aVar = this.f4838o;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z14);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4840q = true;
        this.f4826c.close();
        ViewTreeObserver viewTreeObserver = this.f4839p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4839p = this.f4837n.getViewTreeObserver();
            }
            this.f4839p.removeGlobalOnLayoutListener(this.f4833j);
            this.f4839p = null;
        }
        this.f4837n.removeOnAttachStateChangeListener(this.f4834k);
        PopupWindow.OnDismissListener onDismissListener = this.f4835l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i14 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean onSubMenuSelected(s sVar) {
        boolean z14;
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f4825b, sVar, this.f4837n, this.f4828e, this.f4830g, this.f4831h);
            n.a aVar = this.f4838o;
            mVar.f4819i = aVar;
            l lVar = mVar.f4820j;
            if (lVar != null) {
                lVar.setCallback(aVar);
            }
            int size = sVar.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z14 = false;
                    break;
                }
                MenuItem item = sVar.getItem(i14);
                if (item.isVisible() && item.getIcon() != null) {
                    z14 = true;
                    break;
                }
                i14++;
            }
            mVar.f4818h = z14;
            l lVar2 = mVar.f4820j;
            if (lVar2 != null) {
                lVar2.f(z14);
            }
            mVar.f4821k = this.f4835l;
            this.f4835l = null;
            this.f4826c.close(false);
            k0 k0Var = this.f4832i;
            int width = k0Var.f5137f;
            int i15 = k0Var.i();
            if ((Gravity.getAbsoluteGravity(this.f4843v, this.f4836m.getLayoutDirection()) & 7) == 5) {
                width += this.f4836m.getWidth();
            }
            if (!mVar.b()) {
                if (mVar.f4816f != null) {
                    mVar.d(width, i15, true, true);
                }
            }
            n.a aVar2 = this.f4838o;
            if (aVar2 != null) {
                aVar2.a(sVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void setCallback(n.a aVar) {
        this.f4838o = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void show() {
        View view2;
        if (a()) {
            return;
        }
        if (this.f4840q || (view2 = this.f4836m) == null) {
            vb.h.z("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f4837n = view2;
        k0 k0Var = this.f4832i;
        androidx.appcompat.widget.p pVar = k0Var.B;
        androidx.appcompat.widget.p pVar2 = k0Var.B;
        pVar.setOnDismissListener(this);
        k0Var.f5147p = this;
        k0Var.A = true;
        pVar2.setFocusable(true);
        View view3 = this.f4837n;
        boolean z14 = this.f4839p == null;
        ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
        this.f4839p = viewTreeObserver;
        if (z14) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4833j);
        }
        view3.addOnAttachStateChangeListener(this.f4834k);
        k0Var.f5146o = view3;
        k0Var.f5143l = this.f4843v;
        boolean z15 = this.f4841r;
        Context context = this.f4825b;
        g gVar = this.f4827d;
        if (!z15) {
            this.f4842t = l.c(gVar, context, this.f4829f);
            this.f4841r = true;
        }
        k0Var.p(this.f4842t);
        pVar2.setInputMethodMode(2);
        Rect rect = this.f4810a;
        k0Var.f5155z = rect != null ? new Rect(rect) : null;
        k0Var.show();
        d0 d0Var = k0Var.f5134c;
        d0Var.setOnKeyListener(this);
        if (this.f4844w) {
            h hVar = this.f4826c;
            if (hVar.getHeaderTitle() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) d0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(hVar.getHeaderTitle());
                }
                frameLayout.setEnabled(false);
                d0Var.addHeaderView(frameLayout, null, false);
            }
        }
        k0Var.n(gVar);
        k0Var.show();
    }

    @Override // androidx.appcompat.view.menu.n
    public final void updateMenuView(boolean z14) {
        this.f4841r = false;
        g gVar = this.f4827d;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }
}
