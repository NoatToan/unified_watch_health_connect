package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.core.util.Pools;
import androidx.core.view.c;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import defpackage.kti;
import defpackage.l8f;
import defpackage.m80;
import defpackage.m8p;
import defpackage.of1;
import defpackage.pii;
import defpackage.qii;
import defpackage.r2m;
import defpackage.w8g;
import defpackage.wc1;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    public static final int[] C = {R.attr.state_checked};
    public static final int[] D = {-16842910};
    public NavigationBarPresenter A;
    public e B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionSet f8757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f8758b;
    public final Pools.Pool<NavigationBarItemView> c;
    public final SparseArray<View.OnTouchListener> d;
    public int e;
    public NavigationBarItemView[] f;
    public int g;
    public int h;
    public ColorStateList i;

    @Dimension
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f8759k;
    public final ColorStateList l;
    public int m;
    public int n;
    public Drawable o;
    public int p;
    public final SparseArray<com.google.android.material.badge.a> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8760r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public r2m x;
    public boolean y;
    public ColorStateList z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g itemData = ((NavigationBarItemView) view).getItemData();
            if (NavigationBarMenuView.this.B.O(itemData, NavigationBarMenuView.this.A, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.c = new Pools.SynchronizedPool(5);
        this.d = new SparseArray<>(5);
        this.g = 0;
        this.h = 0;
        this.q = new SparseArray<>(5);
        this.f8760r = -1;
        this.s = -1;
        this.y = false;
        this.l = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f8757a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f8757a = autoTransition;
            autoTransition.v0(0);
            autoTransition.b0(w8g.d(getContext(), pii.N, getResources().getInteger(kti.f24282b)));
            autoTransition.d0(w8g.e(getContext(), pii.O, wc1.f37827b));
            autoTransition.m0(new m8p());
        }
        this.f8758b = new a();
        c.C0(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemViewAcquire = this.c.acquire();
        return navigationBarItemViewAcquire == null ? g(getContext()) : navigationBarItemViewAcquire;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        com.google.android.material.badge.a aVar;
        int id = navigationBarItemView.getId();
        if (i(id) && (aVar = this.q.get(id)) != null) {
            navigationBarItemView.setBadge(aVar);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void b(e eVar) {
        this.B = eVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void d() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.c.release(navigationBarItemView);
                    navigationBarItemView.h();
                }
            }
        }
        if (this.B.size() == 0) {
            this.g = 0;
            this.h = 0;
            this.f = null;
            return;
        }
        j();
        this.f = new NavigationBarItemView[this.B.size()];
        boolean zH = h(this.e, this.B.G().size());
        for (int i = 0; i < this.B.size(); i++) {
            this.A.i(true);
            this.B.getItem(i).setCheckable(true);
            this.A.i(false);
            NavigationBarItemView newItem = getNewItem();
            this.f[i] = newItem;
            newItem.setIconTintList(this.i);
            newItem.setIconSize(this.j);
            newItem.setTextColor(this.l);
            newItem.setTextAppearanceInactive(this.m);
            newItem.setTextAppearanceActive(this.n);
            newItem.setTextColor(this.f8759k);
            int i2 = this.f8760r;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.s;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.u);
            newItem.setActiveIndicatorHeight(this.v);
            newItem.setActiveIndicatorMarginHorizontal(this.w);
            newItem.setActiveIndicatorDrawable(f());
            newItem.setActiveIndicatorResizeable(this.y);
            newItem.setActiveIndicatorEnabled(this.t);
            Drawable drawable = this.o;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.p);
            }
            newItem.setShifting(zH);
            newItem.setLabelVisibilityMode(this.e);
            g gVar = (g) this.B.getItem(i);
            newItem.e(gVar, 0);
            newItem.setItemPosition(i);
            int itemId = gVar.getItemId();
            newItem.setOnTouchListener(this.d.get(itemId));
            newItem.setOnClickListener(this.f8758b);
            int i4 = this.g;
            if (i4 != 0 && itemId == i4) {
                this.h = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.B.size() - 1, this.h);
        this.h = iMin;
        this.B.getItem(iMin).setChecked(true);
    }

    public ColorStateList e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = of1.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(qii.z, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = D;
        return new ColorStateList(new int[][]{iArr, C, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public final Drawable f() {
        if (this.x == null || this.z == null) {
            return null;
        }
        l8f l8fVar = new l8f(this.x);
        l8fVar.b0(this.z);
        return l8fVar;
    }

    public abstract NavigationBarItemView g(Context context);

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.q;
    }

    public ColorStateList getIconTintList() {
        return this.i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.z;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.t;
    }

    public int getItemActiveIndicatorHeight() {
        return this.v;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.w;
    }

    public r2m getItemActiveIndicatorShapeAppearance() {
        return this.x;
    }

    public int getItemActiveIndicatorWidth() {
        return this.u;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.o : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.p;
    }

    @Dimension
    public int getItemIconSize() {
        return this.j;
    }

    public int getItemPaddingBottom() {
        return this.s;
    }

    public int getItemPaddingTop() {
        return this.f8760r;
    }

    public int getItemTextAppearanceActive() {
        return this.n;
    }

    public int getItemTextAppearanceInactive() {
        return this.m;
    }

    public ColorStateList getItemTextColor() {
        return this.f8759k;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    public e getMenu() {
        return this.B;
    }

    public int getSelectedItemId() {
        return this.g;
    }

    public int getSelectedItemPosition() {
        return this.h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean h(int i, int i2) {
        if (i == -1) {
            if (i2 <= 3) {
                return false;
            }
        } else if (i != 0) {
            return false;
        }
        return true;
    }

    public final boolean i(int i) {
        return i != -1;
    }

    public final void j() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.B.size(); i++) {
            hashSet.add(Integer.valueOf(this.B.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            int iKeyAt = this.q.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.q.delete(iKeyAt);
            }
        }
    }

    public void k(SparseArray<com.google.android.material.badge.a> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (this.q.indexOfKey(iKeyAt) < 0) {
                this.q.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(this.q.get(navigationBarItemView.getId()));
            }
        }
    }

    public void l(int i) {
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.B.getItem(i2);
            if (i == item.getItemId()) {
                this.g = i;
                this.h = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    public void m() {
        TransitionSet transitionSet;
        e eVar = this.B;
        if (eVar == null || this.f == null) {
            return;
        }
        int size = eVar.size();
        if (size != this.f.length) {
            d();
            return;
        }
        int i = this.g;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.B.getItem(i2);
            if (item.isChecked()) {
                this.g = item.getItemId();
                this.h = i2;
            }
        }
        if (i != this.g && (transitionSet = this.f8757a) != null) {
            androidx.transition.c.b(this, transitionSet);
        }
        boolean zH = h(this.e, this.B.G().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.A.i(true);
            this.f[i3].setLabelVisibilityMode(this.e);
            this.f[i3].setShifting(zH);
            this.f[i3].e((g) this.B.getItem(i3), 0);
            this.A.i(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m80.P0(accessibilityNodeInfo).k0(m80.e.b(1, this.B.G().size(), false, 1));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.t = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.v = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.w = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.y = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(r2m r2mVar) {
        this.x = r2mVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.u = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.o = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.p = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.j = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.s = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f8760r = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.n = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f8759k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.m = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f8759k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8759k = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.e = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.A = navigationBarPresenter;
    }
}
