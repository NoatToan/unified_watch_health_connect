package miuix.appcompat.internal.view.menu.action;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import defpackage.awi;
import defpackage.hm1;
import defpackage.md0;
import defpackage.vsi;
import defpackage.z1j;
import defpackage.zhi;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.h;
import miuix.appcompat.internal.view.menu.i;
import miuix.appcompat.internal.view.menu.j;

/* JADX INFO: loaded from: classes3.dex */
public class ActionMenuPresenter extends miuix.appcompat.internal.view.menu.a {
    public b A;
    public d B;
    public ActionBarOverlayLayout C;
    public final g D;
    public int E;
    public View F;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f26501k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26502r;
    public boolean s;
    public boolean t;
    public int u;
    public final SparseBooleanArray v;
    public View w;
    public e x;
    public e y;
    public miuix.appcompat.internal.view.menu.f z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26503a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f26503a);
        }

        public SavedState(Parcel parcel) {
            this.f26503a = parcel.readInt();
        }
    }

    public class b extends miuix.appcompat.internal.view.menu.e {
        public b(j jVar) {
            super(jVar);
            ActionMenuPresenter.this.o(ActionMenuPresenter.this.D);
        }

        @Override // miuix.appcompat.internal.view.menu.e, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            ActionMenuPresenter.this.A = null;
            ActionMenuPresenter.this.E = 0;
        }
    }

    public class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public miuix.appcompat.internal.view.menu.c f26504a;

        public c() {
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public void a(boolean z) {
            if (ActionMenuPresenter.this.i instanceof PhoneActionMenuView) {
                ((PhoneActionMenuView) ActionMenuPresenter.this.i).x(ActionMenuPresenter.this.C);
            }
        }

        public final miuix.appcompat.internal.view.menu.c b(miuix.appcompat.internal.view.menu.d dVar) {
            if (this.f26504a == null) {
                this.f26504a = new miuix.appcompat.internal.view.menu.c(ActionMenuPresenter.this.f26498b, ActionMenuPresenter.this.p, ActionMenuPresenter.this.o);
            }
            dVar.c(this.f26504a);
            return this.f26504a;
        }

        public View c(miuix.appcompat.internal.view.menu.d dVar) {
            if (dVar == null || dVar.x().size() <= 0) {
                return null;
            }
            return (View) b(dVar).g((ViewGroup) ActionMenuPresenter.this.i);
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public boolean e() {
            if (ActionMenuPresenter.this.i instanceof PhoneActionMenuView) {
                return ((PhoneActionMenuView) ActionMenuPresenter.this.i).A(ActionMenuPresenter.this.C);
            }
            return false;
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public void g(miuix.appcompat.internal.view.menu.d dVar) {
            if (ActionMenuPresenter.this.i instanceof PhoneActionMenuView) {
                ((PhoneActionMenuView) ActionMenuPresenter.this.i).setOverflowMenuView(c(dVar));
            }
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public boolean isShowing() {
            if (ActionMenuPresenter.this.i instanceof PhoneActionMenuView) {
                return ((PhoneActionMenuView) ActionMenuPresenter.this.i).z();
            }
            return false;
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f26506a;

        public d(e eVar) {
            this.f26506a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = (View) ActionMenuPresenter.this.i;
            if (view != null && view.getWindowToken() != null && this.f26506a.e()) {
                ActionMenuPresenter.this.x = this.f26506a;
            }
            ActionMenuPresenter.this.B = null;
        }
    }

    public interface e {
        void a(boolean z);

        boolean e();

        void g(miuix.appcompat.internal.view.menu.d dVar);

        boolean isShowing();
    }

    public class f extends miuix.appcompat.internal.view.menu.g implements e {
        public f(Context context, miuix.appcompat.internal.view.menu.d dVar, View view, View view2, boolean z) {
            super(context, dVar, view, view2, z);
            TypedValue typedValueK = hm1.k(context, zhi.N);
            int dimensionPixelSize = (typedValueK == null || typedValueK.type != 5) ? 0 : typedValueK.resourceId > 0 ? context.getResources().getDimensionPixelSize(typedValueK.resourceId) : TypedValue.complexToDimensionPixelSize(typedValueK.data, context.getResources().getDisplayMetrics());
            if (dimensionPixelSize > 0) {
                q(dimensionPixelSize);
            }
            n(ActionMenuPresenter.this.D);
            p(awi.E);
            int iS = ActionMenuPresenter.this.S(view);
            if (iS != -1) {
                m(iS);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.g, miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public void a(boolean z) {
            super.a(z);
            View view = ActionMenuPresenter.this.f26501k;
            if (view != null) {
                view.setSelected(false);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.e
        public void g(miuix.appcompat.internal.view.menu.d dVar) {
        }

        @Override // miuix.appcompat.internal.view.menu.g, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            ActionMenuPresenter.this.c.close();
            ActionMenuPresenter.this.x = null;
        }
    }

    public class g implements h.a {
        public g() {
        }

        @Override // miuix.appcompat.internal.view.menu.h.a
        public void b(miuix.appcompat.internal.view.menu.d dVar, boolean z) {
            if (dVar instanceof j) {
                miuix.appcompat.internal.view.menu.a.g(dVar.B(), false);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.h.a
        public boolean c(miuix.appcompat.internal.view.menu.d dVar) {
            if (dVar == null) {
                return false;
            }
            ActionMenuPresenter.this.E = ((j) dVar).getItem().getItemId();
            return false;
        }
    }

    public ActionMenuPresenter(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2) {
        this(context, actionBarOverlayLayout, i, i2, 0, 0);
    }

    public void J(int i, int i2) {
        K(this.c.findItem(i), i2);
    }

    public void K(MenuItem menuItem, int i) {
        if (menuItem instanceof miuix.appcompat.internal.view.menu.f) {
            miuix.appcompat.internal.view.menu.f fVar = (miuix.appcompat.internal.view.menu.f) menuItem;
            fVar.s(true, i);
            k0(fVar);
        }
    }

    public void L(int i) {
        M(this.c.findItem(i));
    }

    public void M(MenuItem menuItem) {
        if (menuItem instanceof miuix.appcompat.internal.view.menu.f) {
            miuix.appcompat.internal.view.menu.f fVar = (miuix.appcompat.internal.view.menu.f) menuItem;
            fVar.r(false);
            k0(fVar);
        }
    }

    public View N(Context context) {
        OverflowMenuButton overflowMenuButton = new OverflowMenuButton(context, null, this.u);
        overflowMenuButton.setOnOverflowMenuButtonClickListener(new OverflowMenuButton.a() { // from class: je0
            @Override // miuix.appcompat.internal.view.menu.action.OverflowMenuButton.a
            public final void a() {
                this.f22691a.Z();
            }
        });
        return overflowMenuButton;
    }

    public boolean O(boolean z) {
        return U(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View P(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof i.a) && ((i.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public int Q() {
        Context context = this.f26498b;
        if (context != null) {
            return hm1.j(context, zhi.f41290r, 5);
        }
        return 5;
    }

    public e R() {
        if (i0()) {
            return new f(this.f26498b, this.c, this.f26501k, this.C, true);
        }
        if (this.y == null) {
            this.y = new c();
        }
        return this.y;
    }

    public int S(View view) {
        return -1;
    }

    public miuix.appcompat.internal.view.menu.f T() {
        if (this.z == null) {
            this.z = miuix.appcompat.internal.view.menu.a.j(this.c, 0, vsi.S, 0, 0, this.f26498b.getString(z1j.p), 0);
        }
        return this.z;
    }

    public boolean U(boolean z) {
        if (this.B != null && this.i != null) {
            this.f26501k.setSelected(false);
            ((View) this.i).removeCallbacks(this.B);
            this.B = null;
            return true;
        }
        e eVar = this.x;
        if (eVar == null) {
            return false;
        }
        boolean zIsShowing = eVar.isShowing();
        if (zIsShowing) {
            this.f26501k.setSelected(false);
        }
        this.x.a(z);
        return zIsShowing;
    }

    public boolean V() {
        b bVar = this.A;
        if (bVar == null) {
            return false;
        }
        bVar.a();
        return true;
    }

    public boolean W(View view) {
        return view instanceof ActionMenuItemView;
    }

    public boolean X() {
        e eVar = this.x;
        return eVar != null && eVar.isShowing();
    }

    public boolean Y() {
        return this.l;
    }

    public final /* synthetic */ void Z() {
        miuix.appcompat.internal.view.menu.d dVar = this.c;
        if (dVar != null) {
            miuix.appcompat.internal.view.menu.a.k(dVar, dVar.B(), T());
        }
        if (this.f26501k.isSelected()) {
            U(true);
        } else {
            j0();
        }
    }

    public void a0(Configuration configuration) {
        if (!this.q && this.f26498b != null) {
            this.n = Q();
        }
        miuix.appcompat.internal.view.menu.d dVar = this.c;
        if (dVar != null) {
            miuix.appcompat.internal.view.menu.a.n(dVar, true);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.a, miuix.appcompat.internal.view.menu.h
    public void b(miuix.appcompat.internal.view.menu.d dVar, boolean z) {
        O(true);
        super.b(dVar, z);
    }

    public void b0() {
        if (this.F != null) {
            i iVar = this.i;
            if (iVar instanceof ResponsiveActionMenuView) {
                ((ResponsiveActionMenuView) iVar).L();
            }
            this.F = null;
        }
    }

    @Override // miuix.appcompat.internal.view.menu.a, miuix.appcompat.internal.view.menu.h
    public void c(Context context, miuix.appcompat.internal.view.menu.d dVar) {
        super.c(context, dVar);
        context.getResources();
        md0 md0VarB = md0.b(context);
        if (!this.m) {
            this.l = md0VarB.h();
        }
        if (!this.q) {
            this.n = Q();
        }
        if (!this.l) {
            this.f26501k = null;
        } else if (this.f26501k == null) {
            this.f26501k = N(this.f26497a);
        }
        this.w = null;
    }

    public void c0(boolean z) {
        if (z) {
            this.u = zhi.s;
        }
    }

    public void d0(View view) {
        ViewGroup viewGroup;
        View view2 = this.F;
        if (view2 != null && view2 != view && (viewGroup = (ViewGroup) view2.getParent()) != null) {
            viewGroup.removeView(this.F);
        }
        this.F = view;
        if (view.getParent() == null) {
            i iVar = this.i;
            if (iVar instanceof ResponsiveActionMenuView) {
                ((ResponsiveActionMenuView) iVar).z(view);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.a
    public void e(miuix.appcompat.internal.view.menu.f fVar, i.a aVar) {
        aVar.b(fVar, 0);
        aVar.setItemInvoker((miuix.appcompat.internal.view.menu.d.c) this.i);
    }

    public void e0(boolean z) {
        this.t = z;
    }

    public void f0(int i) {
        this.q = true;
        int i2 = this.n;
        this.n = i;
        miuix.appcompat.internal.view.menu.d dVar = this.c;
        if (dVar == null || i2 == i) {
            return;
        }
        dVar.b0();
    }

    @Override // miuix.appcompat.internal.view.menu.h
    public boolean flagActionItems() {
        ArrayList<miuix.appcompat.internal.view.menu.f> arrayListC = this.c.C();
        int size = arrayListC.size();
        int i = this.n;
        if (i < size) {
            i--;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size || i <= 0) {
                break;
            }
            miuix.appcompat.internal.view.menu.f fVar = arrayListC.get(i2);
            if (!fVar.o() && !fVar.p()) {
                z = false;
            }
            fVar.v(z);
            if (z) {
                i--;
            }
            i2++;
        }
        while (i2 < size) {
            arrayListC.get(i2).v(false);
            i2++;
        }
        return true;
    }

    public void g0(boolean z) {
        this.l = z;
        this.m = true;
    }

    @Override // miuix.appcompat.internal.view.menu.a, miuix.appcompat.internal.view.menu.h
    public boolean h(j jVar) {
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        j jVar2 = jVar;
        while (jVar2.c0() != this.c) {
            jVar2 = (j) jVar2.c0();
        }
        if (P(jVar2.getItem()) == null && this.f26501k == null) {
            return false;
        }
        this.E = jVar.getItem().getItemId();
        b bVar = new b(jVar);
        this.A = bVar;
        bVar.e(null);
        super.h(jVar);
        return true;
    }

    public void h0(int i, boolean z) {
        this.f26502r = z;
        this.s = true;
    }

    public boolean i0() {
        View view = this.f26501k;
        return (view == null || view.getParent() == null) ? false : true;
    }

    public boolean j0() {
        if (!this.l || X() || this.c == null || this.i == null || this.B != null || this.f26501k == null) {
            return false;
        }
        d dVar = new d(R());
        this.B = dVar;
        ((View) this.i).post(dVar);
        super.h(null);
        this.f26501k.setSelected(true);
        return true;
    }

    public void k0(miuix.appcompat.internal.view.menu.f fVar) {
        if (fVar.isVisible()) {
            fVar.E();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.a
    public View l(miuix.appcompat.internal.view.menu.f fVar, View view, ViewGroup viewGroup) {
        View actionView = fVar.getActionView();
        if (actionView == null || fVar.k()) {
            if (!W(view)) {
                view = null;
            }
            actionView = super.l(fVar, view, viewGroup);
        }
        actionView.setVisibility(fVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public void l0() {
        Iterator<miuix.appcompat.internal.view.menu.f> it = this.c.C().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.a
    public i m(ViewGroup viewGroup) {
        i iVarM = super.m(viewGroup);
        ((ActionMenuView) iVarM).setPresenter(this);
        View view = this.F;
        if (view != null && view.getParent() == null && (iVarM instanceof ResponsiveActionMenuView)) {
            ((ResponsiveActionMenuView) iVarM).z(this.F);
        }
        return iVarM;
    }

    @Override // miuix.appcompat.internal.view.menu.a
    public boolean q(int i, miuix.appcompat.internal.view.menu.f fVar) {
        return fVar.m();
    }

    @Override // miuix.appcompat.internal.view.menu.a, miuix.appcompat.internal.view.menu.h
    public void updateMenuView(boolean z) {
        int size;
        super.updateMenuView(z);
        if (this.i == null) {
            return;
        }
        miuix.appcompat.internal.view.menu.d dVar = this.c;
        ArrayList<miuix.appcompat.internal.view.menu.f> arrayListX = dVar != null ? dVar.x() : null;
        if (!this.l || arrayListX == null || ((size = arrayListX.size()) != 1 ? size <= 0 : !(!arrayListX.get(0).isActionViewExpanded()))) {
            View view = this.f26501k;
            if (view != null) {
                Object parent = view.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f26501k);
                }
            }
        } else {
            View view2 = this.f26501k;
            if (view2 == null) {
                this.f26501k = N(this.f26497a);
            } else {
                view2.setTranslationY(0.0f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f26501k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f26501k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                View view3 = this.f26501k;
                actionMenuView.addView(view3, actionMenuView.l(view3));
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.l);
        if (i0()) {
            return;
        }
        R().g(this.c);
    }

    public ActionMenuPresenter(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2, int i3, int i4) {
        super(context, i, i2);
        this.u = R.attr.actionOverflowButtonStyle;
        this.v = new SparseBooleanArray();
        this.D = new g();
        this.p = i3;
        this.o = i4;
        this.C = actionBarOverlayLayout;
    }
}
