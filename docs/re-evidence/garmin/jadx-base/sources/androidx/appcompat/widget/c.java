package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.b {
    public int A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f5038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f5039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5046r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f5047t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f5048v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f5049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RunnableC0075c f5050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f5051y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f5052z;

    public class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.s sVar, View view2) {
            super(context, sVar, view2, false, R.attr.actionOverflowMenuStyle);
            if ((((androidx.appcompat.view.menu.j) sVar.getItem()).f4796x & 32) != 32) {
                View view3 = c.this.f5038j;
                this.f4816f = view3 == null ? (View) c.this.f4716h : view3;
            }
            f fVar = c.this.f5052z;
            this.f4819i = fVar;
            androidx.appcompat.view.menu.l lVar = this.f4820j;
            if (lVar != null) {
                lVar.setCallback(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public final void c() {
            c cVar = c.this;
            cVar.f5049w = null;
            cVar.A = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public final androidx.appcompat.view.menu.l a() {
            a aVar = c.this.f5049w;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    public class RunnableC0075c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f5055a;

        public RunnableC0075c(e eVar) {
            this.f5055a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            androidx.appcompat.view.menu.h hVar = cVar.f4711c;
            if (hVar != null) {
                hVar.changeMenuMode();
            }
            View view2 = (View) cVar.f4716h;
            if (view2 != null && view2.getWindowToken() != null) {
                e eVar = this.f5055a;
                if (eVar.b()) {
                    cVar.f5048v = eVar;
                } else if (eVar.f4816f != null) {
                    eVar.d(0, 0, false, false);
                    cVar.f5048v = eVar;
                }
            }
            cVar.f5050x = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends f0 {
            public a(View view2, c cVar) {
                super(view2);
            }

            @Override // androidx.appcompat.widget.f0
            public final androidx.appcompat.view.menu.q b() {
                e eVar = c.this.f5048v;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.f0
            public final boolean c() {
                c.this.g();
                return true;
            }

            @Override // androidx.appcompat.widget.f0
            public final boolean d() {
                c cVar = c.this;
                if (cVar.f5050x != null) {
                    return false;
                }
                cVar.e();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            a1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.g();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i14, int i15, int i16, int i17) {
            boolean frame = super.setFrame(i14, i15, i16, i17);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.h hVar, View view2, boolean z14) {
            super(context, hVar, view2, z14, R.attr.actionOverflowMenuStyle);
            this.f4817g = 8388613;
            f fVar = c.this.f5052z;
            this.f4819i = fVar;
            androidx.appcompat.view.menu.l lVar = this.f4820j;
            if (lVar != null) {
                lVar.setCallback(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.h hVar = cVar.f4711c;
            if (hVar != null) {
                hVar.close();
            }
            cVar.f5048v = null;
            super.c();
        }
    }

    public class f implements androidx.appcompat.view.menu.n.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean a(androidx.appcompat.view.menu.h hVar) {
            c cVar = c.this;
            if (hVar == cVar.f4711c) {
                return false;
            }
            cVar.A = ((androidx.appcompat.view.menu.s) hVar).getItem().getItemId();
            androidx.appcompat.view.menu.n.a aVar = cVar.f4713e;
            if (aVar != null) {
                return aVar.a(hVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z14) {
            if (hVar instanceof androidx.appcompat.view.menu.s) {
                hVar.getRootMenu().close(false);
            }
            androidx.appcompat.view.menu.n.a aVar = c.this.f4713e;
            if (aVar != null) {
                aVar.onCloseMenu(hVar, z14);
            }
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f5047t = new SparseBooleanArray();
        this.f5052z = new f();
    }

    @Override // androidx.appcompat.view.menu.b
    public final void a(androidx.appcompat.view.menu.j jVar, androidx.appcompat.view.menu.o.a aVar) {
        aVar.initialize(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f4716h);
        if (this.f5051y == null) {
            this.f5051y = new b();
        }
        actionMenuItemView.setPopupCallback(this.f5051y);
    }

    @Override // androidx.appcompat.view.menu.b
    public final boolean b(ViewGroup viewGroup, int i14) {
        if (viewGroup.getChildAt(i14) == this.f5038j) {
            return false;
        }
        viewGroup.removeViewAt(i14);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public final View c(androidx.appcompat.view.menu.j jVar, View view2, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.e()) {
            actionView = super.c(jVar, view2, viewGroup);
        }
        actionView.setVisibility(jVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.b(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public final boolean d(androidx.appcompat.view.menu.j jVar) {
        return (jVar.f4796x & 32) == 32;
    }

    public final boolean e() {
        Object obj;
        RunnableC0075c runnableC0075c = this.f5050x;
        if (runnableC0075c != null && (obj = this.f4716h) != null) {
            ((View) obj).removeCallbacks(runnableC0075c);
            this.f5050x = null;
            return true;
        }
        e eVar = this.f5048v;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f4820j.dismiss();
        }
        return true;
    }

    public final boolean f() {
        e eVar = this.f5048v;
        return eVar != null && eVar.b();
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public final boolean flagActionItems() {
        int size;
        ArrayList<androidx.appcompat.view.menu.j> visibleItems;
        int i14;
        boolean z14;
        c cVar = this;
        androidx.appcompat.view.menu.h hVar = cVar.f4711c;
        if (hVar != null) {
            visibleItems = hVar.getVisibleItems();
            size = visibleItems.size();
        } else {
            size = 0;
            visibleItems = null;
        }
        int i15 = cVar.f5045q;
        int i16 = cVar.f5044p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f4716h;
        int i17 = 0;
        boolean z15 = false;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = 2;
            z14 = true;
            if (i17 >= size) {
                break;
            }
            androidx.appcompat.view.menu.j jVar = visibleItems.get(i17);
            int i24 = jVar.f4797y;
            if ((i24 & 2) == 2) {
                i18++;
            } else if ((i24 & 1) == 1) {
                i19++;
            } else {
                z15 = true;
            }
            if (cVar.f5046r && jVar.C) {
                i15 = 0;
            }
            i17++;
        }
        if (cVar.f5041m && (z15 || i19 + i18 > i15)) {
            i15--;
        }
        int i25 = i15 - i18;
        SparseBooleanArray sparseBooleanArray = cVar.f5047t;
        sparseBooleanArray.clear();
        int i26 = 0;
        int i27 = 0;
        while (i26 < size) {
            androidx.appcompat.view.menu.j jVar2 = visibleItems.get(i26);
            int i28 = jVar2.f4797y;
            boolean z16 = (i28 & 2) == i14 ? z14 : false;
            int i29 = jVar2.f4774b;
            if (z16) {
                View viewC = cVar.c(jVar2, null, viewGroup);
                viewC.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewC.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i27 == 0) {
                    i27 = measuredWidth;
                }
                if (i29 != 0) {
                    sparseBooleanArray.put(i29, z14);
                }
                jVar2.g(z14);
            } else {
                if ((i28 & 1) == z14) {
                    boolean z17 = sparseBooleanArray.get(i29);
                    boolean z18 = ((i25 > 0 || z17) && i16 > 0) ? z14 : false;
                    if (z18) {
                        View viewC2 = cVar.c(jVar2, null, viewGroup);
                        viewC2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewC2.getMeasuredWidth();
                        i16 -= measuredWidth2;
                        if (i27 == 0) {
                            i27 = measuredWidth2;
                        }
                        z18 &= i16 + i27 > 0;
                    }
                    if (z18 && i29 != 0) {
                        sparseBooleanArray.put(i29, true);
                    } else if (z17) {
                        sparseBooleanArray.put(i29, false);
                        for (int i30 = 0; i30 < i26; i30++) {
                            androidx.appcompat.view.menu.j jVar3 = visibleItems.get(i30);
                            if (jVar3.f4774b == i29) {
                                if ((jVar3.f4796x & 32) == 32) {
                                    i25++;
                                }
                                jVar3.g(false);
                            }
                        }
                    }
                    if (z18) {
                        i25--;
                    }
                    jVar2.g(z18);
                } else {
                    jVar2.g(false);
                }
                i26++;
                i14 = 2;
                cVar = this;
                z14 = true;
            }
            i26++;
            i14 = 2;
            cVar = this;
            z14 = true;
        }
        return z14;
    }

    public final boolean g() {
        androidx.appcompat.view.menu.h hVar;
        if (!this.f5041m || f() || (hVar = this.f4711c) == null || this.f4716h == null || this.f5050x != null || hVar.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC0075c runnableC0075c = new RunnableC0075c(new e(this.f4710b, this.f4711c, this.f5038j, true));
        this.f5050x = runnableC0075c;
        ((View) this.f4716h).post(runnableC0075c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public final void initForMenu(Context context, androidx.appcompat.view.menu.h hVar) {
        super.initForMenu(context, hVar);
        Resources resources = context.getResources();
        m.a aVarA = m.a.a(context);
        if (!this.f5042n) {
            this.f5041m = true;
        }
        this.f5043o = aVarA.f115421a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f5045q = aVarA.b();
        int measuredWidth = this.f5043o;
        if (this.f5041m) {
            if (this.f5038j == null) {
                d dVar = new d(this.f4709a);
                this.f5038j = dVar;
                if (this.f5040l) {
                    dVar.setImageDrawable(this.f5039k);
                    this.f5039k = null;
                    this.f5040l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f5038j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f5038j.getMeasuredWidth();
        } else {
            this.f5038j = null;
        }
        this.f5044p = measuredWidth;
        float f14 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public final void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z14) {
        e();
        a aVar = this.f5049w;
        if (aVar != null && aVar.b()) {
            aVar.f4820j.dismiss();
        }
        super.onCloseMenu(hVar, z14);
    }

    @Override // androidx.appcompat.view.menu.n
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i14;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i14 = ((g) parcelable).f5061a) > 0 && (menuItemFindItem = this.f4711c.findItem(i14)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.s) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable onSaveInstanceState() {
        g gVar = new g();
        gVar.f5061a = this.A;
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.s sVar) {
        boolean z14;
        if (sVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.s sVar2 = sVar;
            while (sVar2.getParentMenu() != this.f4711c) {
                sVar2 = (androidx.appcompat.view.menu.s) sVar2.getParentMenu();
            }
            MenuItem item = sVar2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f4716h;
            View view2 = null;
            view2 = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    if ((childAt instanceof androidx.appcompat.view.menu.o.a) && ((androidx.appcompat.view.menu.o.a) childAt).getItemData() == item) {
                        view2 = childAt;
                        break;
                    }
                }
            }
            if (view2 != null) {
                this.A = sVar.getItem().getItemId();
                int size = sVar.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        z14 = false;
                        break;
                    }
                    MenuItem item2 = sVar.getItem(i15);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z14 = true;
                        break;
                    }
                    i15++;
                }
                a aVar = new a(this.f4710b, sVar, view2);
                this.f5049w = aVar;
                aVar.f4818h = z14;
                androidx.appcompat.view.menu.l lVar = aVar.f4820j;
                if (lVar != null) {
                    lVar.f(z14);
                }
                a aVar2 = this.f5049w;
                if (!aVar2.b()) {
                    if (aVar2.f4816f == null) {
                        vb.h.z("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    aVar2.d(0, 0, false, false);
                }
                super.onSubMenuSelected(sVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public final void updateMenuView(boolean z14) {
        super.updateMenuView(z14);
        ((View) this.f4716h).requestLayout();
        androidx.appcompat.view.menu.h hVar = this.f4711c;
        boolean z15 = false;
        if (hVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> actionItems = hVar.getActionItems();
            int size = actionItems.size();
            for (int i14 = 0; i14 < size; i14++) {
                androidx.core.view.b bVar = actionItems.get(i14).A;
            }
        }
        androidx.appcompat.view.menu.h hVar2 = this.f4711c;
        ArrayList<androidx.appcompat.view.menu.j> nonActionItems = hVar2 != null ? hVar2.getNonActionItems() : null;
        if (this.f5041m && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z15 = !nonActionItems.get(0).C;
            } else if (size2 > 0) {
                z15 = true;
            }
        }
        d dVar = this.f5038j;
        if (z15) {
            if (dVar == null) {
                this.f5038j = new d(this.f4709a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f5038j.getParent();
            if (viewGroup != this.f4716h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f5038j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4716h;
                d dVar2 = this.f5038j;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c(-2, -2);
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f4909a = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f4716h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f5038j);
            }
        }
        ((ActionMenuView) this.f4716h).setOverflowReserved(this.f5041m);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5061a;

        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        public g(Parcel parcel) {
            this.f5061a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(this.f5061a);
        }

        public g() {
        }
    }
}
