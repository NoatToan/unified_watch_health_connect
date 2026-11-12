package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.e;
import androidx.customview.view.AbsSavedState;
import defpackage.auk;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k47;
import defpackage.k8f;
import defpackage.l8f;
import defpackage.m8f;
import defpackage.n8f;
import defpackage.nig;
import defpackage.pmi;
import defpackage.r2m;
import defpackage.wpo;
import defpackage.xfp;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nig f8766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavigationBarMenuView f8767b;
    public final NavigationBarPresenter c;
    public ColorStateList d;
    public MenuInflater e;
    public c f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bundle f8768b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void c(Parcel parcel, ClassLoader classLoader) {
            this.f8768b = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f8768b);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            NavigationBarView.a(NavigationBarView.this);
            return (NavigationBarView.this.f == null || NavigationBarView.this.f.a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }

    public interface b {
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.c = navigationBarPresenter;
        Context context2 = getContext();
        xfp xfpVarI = c9p.i(context2, attributeSet, b4j.S5, i, i2, b4j.d6, b4j.c6);
        nig nigVar = new nig(context2, getClass(), getMaxItemCount());
        this.f8766a = nigVar;
        NavigationBarMenuView navigationBarMenuViewD = d(context2);
        this.f8767b = navigationBarMenuViewD;
        navigationBarPresenter.h(navigationBarMenuViewD);
        navigationBarPresenter.a(1);
        navigationBarMenuViewD.setPresenter(navigationBarPresenter);
        nigVar.b(navigationBarPresenter);
        navigationBarPresenter.e(getContext(), nigVar);
        if (xfpVarI.s(b4j.Y5)) {
            navigationBarMenuViewD.setIconTintList(xfpVarI.c(b4j.Y5));
        } else {
            navigationBarMenuViewD.setIconTintList(navigationBarMenuViewD.e(R.attr.textColorSecondary));
        }
        setItemIconSize(xfpVarI.f(b4j.X5, getResources().getDimensionPixelSize(pmi.l0)));
        if (xfpVarI.s(b4j.d6)) {
            setItemTextAppearanceInactive(xfpVarI.n(b4j.d6, 0));
        }
        if (xfpVarI.s(b4j.c6)) {
            setItemTextAppearanceActive(xfpVarI.n(b4j.c6, 0));
        }
        if (xfpVarI.s(b4j.e6)) {
            setItemTextColor(xfpVarI.c(b4j.e6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            androidx.core.view.c.v0(this, c(context2));
        }
        if (xfpVarI.s(b4j.a6)) {
            setItemPaddingTop(xfpVarI.f(b4j.a6, 0));
        }
        if (xfpVarI.s(b4j.Z5)) {
            setItemPaddingBottom(xfpVarI.f(b4j.Z5, 0));
        }
        if (xfpVarI.s(b4j.U5)) {
            setElevation(xfpVarI.f(b4j.U5, 0));
        }
        k47.o(getBackground().mutate(), k8f.a(context2, xfpVarI, b4j.T5));
        setLabelVisibilityMode(xfpVarI.l(b4j.f6, -1));
        int iN = xfpVarI.n(b4j.W5, 0);
        if (iN != 0) {
            navigationBarMenuViewD.setItemBackgroundRes(iN);
        } else {
            setItemRippleColor(k8f.a(context2, xfpVarI, b4j.b6));
        }
        int iN2 = xfpVarI.n(b4j.V5, 0);
        if (iN2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iN2, b4j.M5);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.O5, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.N5, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(b4j.Q5, 0));
            setItemActiveIndicatorColor(k8f.b(context2, typedArrayObtainStyledAttributes, b4j.P5));
            setItemActiveIndicatorShapeAppearance(r2m.b(context2, typedArrayObtainStyledAttributes.getResourceId(b4j.R5, 0), 0).m());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (xfpVarI.s(b4j.g6)) {
            e(xfpVarI.n(b4j.g6, 0));
        }
        xfpVarI.w();
        addView(navigationBarMenuViewD);
        nigVar.V(new a());
    }

    public static /* synthetic */ b a(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.e == null) {
            this.e = new wpo(getContext());
        }
        return this.e;
    }

    public final l8f c(Context context) {
        l8f l8fVar = new l8f();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            l8fVar.b0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        l8fVar.Q(context);
        return l8fVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView d(Context context);

    public void e(int i) {
        this.c.i(true);
        getMenuInflater().inflate(i, this.f8766a);
        this.c.i(false);
        this.c.updateMenuView(true);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f8767b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f8767b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f8767b.getItemActiveIndicatorMarginHorizontal();
    }

    public r2m getItemActiveIndicatorShapeAppearance() {
        return this.f8767b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f8767b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f8767b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f8767b.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f8767b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f8767b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f8767b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f8767b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.d;
    }

    public int getItemTextAppearanceActive() {
        return this.f8767b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f8767b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f8767b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f8767b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f8766a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.f8767b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.c;
    }

    public int getSelectedItemId() {
        return this.f8767b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8f.e(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f8766a.S(savedState.f8768b);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f8768b = bundle;
        this.f8766a.U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m8f.d(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f8767b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f8767b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f8767b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f8767b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(r2m r2mVar) {
        this.f8767b.setItemActiveIndicatorShapeAppearance(r2mVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f8767b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f8767b.setItemBackground(drawable);
        this.d = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f8767b.setItemBackgroundRes(i);
        this.d = null;
    }

    public void setItemIconSize(@Dimension int i) {
        this.f8767b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f8767b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f8767b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f8767b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.d == colorStateList) {
            if (colorStateList != null || this.f8767b.getItemBackground() == null) {
                return;
            }
            this.f8767b.setItemBackground(null);
            return;
        }
        this.d = colorStateList;
        if (colorStateList == null) {
            this.f8767b.setItemBackground(null);
        } else {
            this.f8767b.setItemBackground(new RippleDrawable(auk.a(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f8767b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f8767b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8767b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f8767b.getLabelVisibilityMode() != i) {
            this.f8767b.setLabelVisibilityMode(i);
            this.c.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f = cVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem menuItemFindItem = this.f8766a.findItem(i);
        if (menuItemFindItem == null || this.f8766a.O(menuItemFindItem, this.c, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
