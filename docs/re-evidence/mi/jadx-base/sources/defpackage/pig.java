package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class pig implements androidx.appcompat.view.menu.i {
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NavigationMenuView f30419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f30420b;
    public androidx.appcompat.view.menu.i.a c;
    public androidx.appcompat.view.menu.e d;
    public int e;
    public c f;
    public LayoutInflater g;
    public ColorStateList i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f30421k;
    public ColorStateList l;
    public Drawable m;
    public RippleDrawable n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f30422r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int y;
    public int z;
    public int h = 0;
    public int j = 0;
    public boolean x = true;
    public int B = -1;
    public final View.OnClickListener C = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            pig.this.R(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            pig pigVar = pig.this;
            boolean zO = pigVar.d.O(itemData, pigVar, 0);
            if (itemData != null && itemData.isCheckable() && zO) {
                pig.this.f.r(itemData);
            } else {
                z = false;
            }
            pig.this.R(false);
            if (z) {
                pig.this.updateMenuView(false);
            }
        }
    }

    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    public class c extends RecyclerView.Adapter<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<e> f30424a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.g f30425b;
        public boolean c;

        public c() {
            p();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.f30424a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            e eVar = this.f30424a.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public final void i(int i, int i2) {
            while (i < i2) {
                ((g) this.f30424a.get(i)).f30429b = true;
                i++;
            }
        }

        public Bundle j() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.g gVar = this.f30425b;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f30424a.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f30424a.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.g gVarA = ((g) eVar).a();
                    View actionView = gVarA != null ? gVarA.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(gVarA.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.g k() {
            return this.f30425b;
        }

        public int l() {
            int i = pig.this.f30420b.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < pig.this.f.getCount(); i2++) {
                if (pig.this.f.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(l lVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.f30424a.get(i);
                    lVar.itemView.setPadding(pig.this.s, fVar.b(), pig.this.t, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f30424a.get(i)).a().getTitle());
                int i2 = pig.this.h;
                if (i2 != 0) {
                    s8p.o(textView, i2);
                }
                textView.setPadding(pig.this.u, textView.getPaddingTop(), pig.this.v, textView.getPaddingBottom());
                ColorStateList colorStateList = pig.this.i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(pig.this.l);
            int i3 = pig.this.j;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = pig.this.f30421k;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = pig.this.m;
            androidx.core.view.c.v0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = pig.this.n;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f30424a.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f30429b);
            pig pigVar = pig.this;
            int i4 = pigVar.o;
            int i5 = pigVar.p;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(pig.this.q);
            pig pigVar2 = pig.this;
            if (pigVar2.w) {
                navigationMenuItemView.setIconSize(pigVar2.f30422r);
            }
            navigationMenuItemView.setMaxLines(pig.this.y);
            navigationMenuItemView.e(gVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                pig pigVar = pig.this;
                return new i(pigVar.g, viewGroup, pigVar.C);
            }
            if (i == 1) {
                return new k(pig.this.g, viewGroup);
            }
            if (i == 2) {
                return new j(pig.this.g, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new b(pig.this.f30420b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).i();
            }
        }

        public final void p() {
            if (this.c) {
                return;
            }
            boolean z = true;
            this.c = true;
            this.f30424a.clear();
            this.f30424a.add(new d());
            int size = pig.this.d.G().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                androidx.appcompat.view.menu.g gVar = pig.this.d.G().get(i2);
                if (gVar.isChecked()) {
                    r(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.t(false);
                }
                if (gVar.hasSubMenu()) {
                    SubMenu subMenu = gVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f30424a.add(new f(pig.this.A, 0));
                        }
                        this.f30424a.add(new g(gVar));
                        int size3 = this.f30424a.size();
                        int size4 = subMenu.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size4) {
                            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) subMenu.getItem(i3);
                            if (gVar2.isVisible()) {
                                if (!z3 && gVar2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.t(false);
                                }
                                if (gVar.isChecked()) {
                                    r(gVar);
                                }
                                this.f30424a.add(new g(gVar2));
                            }
                            i3++;
                            z = true;
                        }
                        if (z3) {
                            i(size3, this.f30424a.size());
                        }
                    }
                } else {
                    int groupId = gVar.getGroupId();
                    if (groupId != i) {
                        size2 = this.f30424a.size();
                        z2 = gVar.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList<e> arrayList = this.f30424a;
                            int i4 = pig.this.A;
                            arrayList.add(new f(i4, i4));
                        }
                    } else if (!z2 && gVar.getIcon() != null) {
                        i(size2, this.f30424a.size());
                        z2 = true;
                    }
                    g gVar3 = new g(gVar);
                    gVar3.f30429b = z2;
                    this.f30424a.add(gVar3);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.c = false;
        }

        public void q(Bundle bundle) {
            androidx.appcompat.view.menu.g gVarA;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.g gVarA2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.c = true;
                int size = this.f30424a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    e eVar = this.f30424a.get(i2);
                    if ((eVar instanceof g) && (gVarA2 = ((g) eVar).a()) != null && gVarA2.getItemId() == i) {
                        r(gVarA2);
                        break;
                    }
                }
                this.c = false;
                p();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f30424a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.f30424a.get(i3);
                    if ((eVar2 instanceof g) && (gVarA = ((g) eVar2).a()) != null && (actionView = gVarA.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(gVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void r(androidx.appcompat.view.menu.g gVar) {
            if (this.f30425b == gVar || !gVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.g gVar2 = this.f30425b;
            if (gVar2 != null) {
                gVar2.setChecked(false);
            }
            this.f30425b = gVar;
            gVar.setChecked(true);
        }

        public void s(boolean z) {
            this.c = z;
        }

        public void t() {
            p();
            notifyDataSetChanged();
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f30426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30427b;

        public f(int i, int i2) {
            this.f30426a = i;
            this.f30427b = i2;
        }

        public int a() {
            return this.f30427b;
        }

        public int b() {
            return this.f30426a;
        }
    }

    public static class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.view.menu.g f30428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30429b;

        public g(androidx.appcompat.view.menu.g gVar) {
            this.f30428a = gVar;
        }

        public androidx.appcompat.view.menu.g a() {
            return this.f30428a;
        }
    }

    public class h extends u {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.u, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.k0(m80.e.a(pig.this.f.l(), 0, false));
        }
    }

    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(kwi.g, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(kwi.i, viewGroup, false));
        }
    }

    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(kwi.j, viewGroup, false));
        }
    }

    public static abstract class l extends RecyclerView.d0 {
        public l(View view) {
            super(view);
        }
    }

    public void A(int i2) {
        this.t = i2;
        updateMenuView(false);
    }

    public void B(int i2) {
        this.s = i2;
        updateMenuView(false);
    }

    public void C(int i2) {
        this.e = i2;
    }

    public void D(Drawable drawable) {
        this.m = drawable;
        updateMenuView(false);
    }

    public void E(RippleDrawable rippleDrawable) {
        this.n = rippleDrawable;
        updateMenuView(false);
    }

    public void F(int i2) {
        this.o = i2;
        updateMenuView(false);
    }

    public void G(int i2) {
        this.q = i2;
        updateMenuView(false);
    }

    public void H(@Dimension int i2) {
        if (this.f30422r != i2) {
            this.f30422r = i2;
            this.w = true;
            updateMenuView(false);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.l = colorStateList;
        updateMenuView(false);
    }

    public void J(int i2) {
        this.y = i2;
        updateMenuView(false);
    }

    public void K(int i2) {
        this.j = i2;
        updateMenuView(false);
    }

    public void L(ColorStateList colorStateList) {
        this.f30421k = colorStateList;
        updateMenuView(false);
    }

    public void M(int i2) {
        this.p = i2;
        updateMenuView(false);
    }

    public void N(int i2) {
        this.B = i2;
        NavigationMenuView navigationMenuView = this.f30419a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void O(ColorStateList colorStateList) {
        this.i = colorStateList;
        updateMenuView(false);
    }

    public void P(int i2) {
        this.u = i2;
        updateMenuView(false);
    }

    public void Q(int i2) {
        this.h = i2;
        updateMenuView(false);
    }

    public void R(boolean z) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.s(z);
        }
    }

    public final void S() {
        int i2 = (this.f30420b.getChildCount() == 0 && this.x) ? this.z : 0;
        NavigationMenuView navigationMenuView = this.f30419a;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        androidx.appcompat.view.menu.i.a aVar = this.c;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, androidx.appcompat.view.menu.e eVar) {
        this.g = LayoutInflater.from(context);
        this.d = eVar;
        this.A = context.getResources().getDimensionPixelOffset(pmi.l);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.e;
    }

    public void h(View view) {
        this.f30420b.addView(view);
        NavigationMenuView navigationMenuView = this.f30419a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void i(WindowInsetsCompat windowInsetsCompat) {
        int iM = windowInsetsCompat.m();
        if (this.z != iM) {
            this.z = iM;
            S();
        }
        NavigationMenuView navigationMenuView = this.f30419a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.j());
        androidx.core.view.c.g(this.f30420b, windowInsetsCompat);
    }

    public androidx.appcompat.view.menu.g j() {
        return this.f.k();
    }

    public int k() {
        return this.t;
    }

    public int l() {
        return this.s;
    }

    public int m() {
        return this.f30420b.getChildCount();
    }

    public Drawable n() {
        return this.m;
    }

    public int o() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f30419a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f.q(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f30420b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f30419a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f30419a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.j());
        }
        if (this.f30420b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f30420b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public int p() {
        return this.q;
    }

    public int q() {
        return this.y;
    }

    public ColorStateList r() {
        return this.f30421k;
    }

    public ColorStateList s() {
        return this.l;
    }

    public int t() {
        return this.p;
    }

    public MenuView u(ViewGroup viewGroup) {
        if (this.f30419a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.g.inflate(kwi.f24373k, viewGroup, false);
            this.f30419a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f30419a));
            if (this.f == null) {
                this.f = new c();
            }
            int i2 = this.B;
            if (i2 != -1) {
                this.f30419a.setOverScrollMode(i2);
            }
            this.f30420b = (LinearLayout) this.g.inflate(kwi.h, (ViewGroup) this.f30419a, false);
            this.f30419a.setAdapter(this.f);
        }
        return this.f30419a;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.t();
        }
    }

    public int v() {
        return this.v;
    }

    public int w() {
        return this.u;
    }

    public View x(int i2) {
        View viewInflate = this.g.inflate(i2, (ViewGroup) this.f30420b, false);
        h(viewInflate);
        return viewInflate;
    }

    public void y(boolean z) {
        if (this.x != z) {
            this.x = z;
            S();
        }
    }

    public void z(androidx.appcompat.view.menu.g gVar) {
        this.f.r(gVar);
    }
}
