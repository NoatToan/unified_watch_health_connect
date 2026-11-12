package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.k;
import defpackage.hbm;
import defpackage.k47;
import defpackage.mwi;
import defpackage.nd0;
import defpackage.oe0;
import defpackage.q1a;
import defpackage.qii;
import defpackage.tip;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements oe0.a {
    public c A;
    public b B;
    public final f C;
    public int D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f1535k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1536r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final SparseBooleanArray x;
    public e y;
    public a z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1537a;

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
            parcel.writeInt(this.f1537a);
        }

        public SavedState(Parcel parcel) {
            this.f1537a = parcel.readInt();
        }
    }

    public class a extends h {
        public a(Context context, k kVar, View view) {
            super(context, kVar, view, false, qii.m);
            if (!((g) kVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f1535k;
                f(view2 == null ? (View) ActionMenuPresenter.this.i : view2);
            }
            i(ActionMenuPresenter.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.z = null;
            actionMenuPresenter.D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public hbm a() {
            a aVar = ActionMenuPresenter.this.z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f1539a;

        public c(e eVar) {
            this.f1539a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.d();
            }
            View view = (View) ActionMenuPresenter.this.i;
            if (view != null && view.getWindowToken() != null && this.f1539a.l()) {
                ActionMenuPresenter.this.y = this.f1539a;
            }
            ActionMenuPresenter.this.A = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends q1a {
            public final /* synthetic */ ActionMenuPresenter j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.j = actionMenuPresenter;
            }

            @Override // defpackage.q1a
            public hbm b() {
                e eVar = ActionMenuPresenter.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // defpackage.q1a
            public boolean c() {
                ActionMenuPresenter.this.J();
                return true;
            }

            @Override // defpackage.q1a
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.A != null) {
                    return false;
                }
                actionMenuPresenter.A();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, qii.l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            tip.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.J();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                k47.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, qii.m);
            h(8388613);
            i(ActionMenuPresenter.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.close();
            }
            ActionMenuPresenter.this.y = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof k) {
                eVar.F().e(false);
            }
            i.a aVarL = ActionMenuPresenter.this.l();
            if (aVarL != null) {
                aVarL.b(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ActionMenuPresenter.this.c) {
                return false;
            }
            ActionMenuPresenter.this.D = ((k) eVar).getItem().getItemId();
            i.a aVarL = ActionMenuPresenter.this.l();
            if (aVarL != null) {
                return aVarL.c(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, mwi.c, mwi.f27292b);
        this.x = new SparseBooleanArray();
        this.C = new f();
    }

    public boolean A() {
        Object obj;
        c cVar = this.A;
        if (cVar != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean B() {
        a aVar = this.z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean C() {
        return this.A != null || D();
    }

    public boolean D() {
        e eVar = this.y;
        return eVar != null && eVar.d();
    }

    public void E(Configuration configuration) {
        if (!this.s) {
            this.f1536r = nd0.b(this.f1485b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.M(true);
        }
    }

    public void F(boolean z) {
        this.v = z;
    }

    public void G(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.b(this.c);
    }

    public void H(Drawable drawable) {
        d dVar = this.f1535k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.m = true;
            this.l = drawable;
        }
    }

    public void I(boolean z) {
        this.n = z;
        this.o = true;
    }

    public boolean J() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.n || D() || (eVar = this.c) == null || this.i == null || this.A != null || eVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f1485b, this.c, this.f1535k, true));
        this.A = cVar;
        ((View) this.i).post(cVar);
        return true;
    }

    @Override // oe0.a
    public void a(boolean z) {
        if (z) {
            super.g(null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        x();
        super.b(eVar, z);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void e(Context context, androidx.appcompat.view.menu.e eVar) {
        super.e(context, eVar);
        Resources resources = context.getResources();
        nd0 nd0VarB = nd0.b(context);
        if (!this.o) {
            this.n = nd0VarB.h();
        }
        if (!this.u) {
            this.p = nd0VarB.c();
        }
        if (!this.s) {
            this.f1536r = nd0VarB.d();
        }
        int measuredWidth = this.p;
        if (this.n) {
            if (this.f1535k == null) {
                d dVar = new d(this.f1484a);
                this.f1535k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1535k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1535k.getMeasuredWidth();
        } else {
            this.f1535k = null;
        }
        this.q = measuredWidth;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        ArrayList<g> arrayListG;
        int size;
        int i;
        int iQ;
        ?? r0;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.c;
        View view = null;
        ?? r3 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i2 = actionMenuPresenter.f1536r;
        int i3 = actionMenuPresenter.q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.i;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            g gVar = arrayListG.get(i6);
            if (gVar.o()) {
                i4++;
            } else if (gVar.n()) {
                i5++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.v && gVar.isActionViewExpanded()) {
                i2 = 0;
            }
        }
        if (actionMenuPresenter.n && (z || i5 + i4 > i2)) {
            i2--;
        }
        int i7 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.t) {
            int i8 = actionMenuPresenter.w;
            iQ = i3 / i8;
            i = i8 + ((i3 % i8) / iQ);
        } else {
            i = 0;
            iQ = 0;
        }
        int i9 = 0;
        int i10 = 0;
        ?? r1 = actionMenuPresenter;
        while (i9 < size) {
            g gVar2 = arrayListG.get(i9);
            if (gVar2.o()) {
                View viewM = r1.m(gVar2, view, viewGroup);
                if (r1.t) {
                    iQ -= ActionMenuView.q(viewM, i, iQ, iMakeMeasureSpec, r3);
                } else {
                    viewM.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewM.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                r0 = r3;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i7 > 0 || z2) && i3 > 0 && (!r1.t || iQ > 0);
                boolean z4 = z3;
                if (z3) {
                    View viewM2 = r1.m(gVar2, null, viewGroup);
                    if (r1.t) {
                        int iQ2 = ActionMenuView.q(viewM2, i, iQ, iMakeMeasureSpec, 0);
                        iQ -= iQ2;
                        if (iQ2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewM2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewM2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z3 = z5 & (!r1.t ? i3 + i10 <= 0 : i3 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i11 = 0; i11 < i9; i11++) {
                        g gVar3 = arrayListG.get(i11);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i7++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z3) {
                    i7--;
                }
                gVar2.u(z3);
                r0 = 0;
            } else {
                r0 = r3;
                gVar2.u(r0);
            }
            i9++;
            r3 = r0;
            size = size;
            view = null;
            r1 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean g(k kVar) {
        boolean z = false;
        if (!kVar.hasVisibleItems()) {
            return false;
        }
        k kVar2 = kVar;
        while (kVar2.i0() != this.c) {
            kVar2 = (k) kVar2.i0();
        }
        View viewY = y(kVar2.getItem());
        if (viewY == null) {
            return false;
        }
        this.D = kVar.getItem().getItemId();
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = kVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        a aVar = new a(this.f1485b, kVar, viewY);
        this.z = aVar;
        aVar.g(z);
        this.z.j();
        super.g(kVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void i(g gVar, MenuView.ItemView itemView) {
        itemView.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean k(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1535k) {
            return false;
        }
        return super.k(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View m(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.m(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public MenuView n(ViewGroup viewGroup) {
        MenuView menuView = this.i;
        MenuView menuViewN = super.n(viewGroup);
        if (menuView != menuViewN) {
            ((ActionMenuView) menuViewN).setPresenter(this);
        }
        return menuViewN;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f1537a) > 0 && (menuItemFindItem = this.c.findItem(i)) != null) {
            g((k) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f1537a = this.D;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean p(int i, g gVar) {
        return gVar.l();
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z) {
        int size;
        super.updateMenuView(z);
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            ArrayList<g> arrayListU = eVar.u();
            int size2 = arrayListU.size();
            for (int i = 0; i < size2; i++) {
                oe0 oe0VarB = arrayListU.get(i).b();
                if (oe0VarB != null) {
                    oe0VarB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.c;
        ArrayList<g> arrayListB = eVar2 != null ? eVar2.B() : null;
        if (!this.n || arrayListB == null || ((size = arrayListB.size()) != 1 ? size <= 0 : !(!arrayListB.get(0).isActionViewExpanded()))) {
            d dVar = this.f1535k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1535k);
                }
            }
        } else {
            if (this.f1535k == null) {
                this.f1535k = new d(this.f1484a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1535k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1535k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.f1535k, actionMenuView.k());
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    public boolean x() {
        return A() | B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable z() {
        d dVar = this.f1535k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }
}
