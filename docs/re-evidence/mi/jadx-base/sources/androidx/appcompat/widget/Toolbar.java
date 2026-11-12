package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.k;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.customview.view.AbsSavedState;
import defpackage.c5f;
import defpackage.eyq;
import defpackage.iqf;
import defpackage.of1;
import defpackage.p3b;
import defpackage.qii;
import defpackage.qzk;
import defpackage.tip;
import defpackage.wpo;
import defpackage.ws5;
import defpackage.xfp;
import defpackage.y34;
import defpackage.z5j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements iqf {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final MenuHostHelper G;
    public ArrayList<MenuItem> H;
    public e I;
    public final ActionMenuView.d J;
    public androidx.appcompat.widget.b K;
    public ActionMenuPresenter L;
    public d M;
    public i.a N;
    public androidx.appcompat.view.menu.e.a O;
    public boolean P;
    public final Runnable Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f1666b;
    public TextView c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;
    public View i;
    public Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1667k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1668r;
    public int s;
    public qzk t;
    public int u;
    public int v;
    public int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public class a implements ActionMenuView.d {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.j(menuItem)) {
                return true;
            }
            e eVar = Toolbar.this.I;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public class d implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f1675b;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean c(androidx.appcompat.view.menu.e eVar, g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.h);
            }
            Toolbar.this.i = gVar.getActionView();
            this.f1675b = gVar;
            ViewParent parent2 = Toolbar.this.i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.i);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParamsGenerateDefaultLayoutParams.f1402a = (toolbar4.n & 112) | 8388611;
                layoutParamsGenerateDefaultLayoutParams.f1669b = 2;
                toolbar4.i.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.i);
            }
            Toolbar.this.J();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.i;
            if (callback instanceof y34) {
                ((y34) callback).d();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean d(androidx.appcompat.view.menu.e eVar, g gVar) {
            KeyEvent.Callback callback = Toolbar.this.i;
            if (callback instanceof y34) {
                ((y34) callback).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.i = null;
            toolbar3.a();
            this.f1675b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void e(Context context, androidx.appcompat.view.menu.e eVar) {
            g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1674a;
            if (eVar2 != null && (gVar = this.f1675b) != null) {
                eVar2.f(gVar);
            }
            this.f1674a = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g(k kVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.i
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.i
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.i
        public void updateMenuView(boolean z) {
            if (this.f1675b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1674a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f1674a.getItem(i) == this.f1675b) {
                            return;
                        }
                    }
                }
                d(this.f1674a, this.f1675b);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private void I() {
        removeCallbacks(this.Q);
        post(this.Q);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new wpo(getContext());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean A() {
        ActionMenuView actionMenuView = this.f1665a;
        return actionMenuView != null && actionMenuView.n();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1665a;
        return actionMenuView != null && actionMenuView.o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean C() {
        Layout layout;
        TextView textView = this.f1666b;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public final int D(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iQ = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public final int E(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iQ = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int F(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void G(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void H() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
        this.G.k(menu);
    }

    public void J() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f1669b != 2 && childAt != this.f1665a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void K(int i, int i2) {
        h();
        this.t.g(i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void L(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar == null && this.f1665a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarS = this.f1665a.s();
        if (eVarS == eVar) {
            return;
        }
        if (eVarS != null) {
            eVarS.Q(this.L);
            eVarS.Q(this.M);
        }
        if (this.M == null) {
            this.M = new d();
        }
        actionMenuPresenter.F(true);
        if (eVar != null) {
            eVar.c(actionMenuPresenter, this.j);
            eVar.c(this.M, this.j);
        } else {
            actionMenuPresenter.e(this.j, null);
            this.M.e(this.j, null);
            actionMenuPresenter.updateMenuView(true);
            this.M.updateMenuView(true);
        }
        this.f1665a.setPopupTheme(this.f1667k);
        this.f1665a.setPresenter(actionMenuPresenter);
        this.L = actionMenuPresenter;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void M(i.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.N = aVar;
        this.O = aVar2;
        ActionMenuView actionMenuView = this.f1665a;
        if (actionMenuView != null) {
            actionMenuView.t(aVar, aVar2);
        }
    }

    public void N(Context context, int i) {
        this.m = i;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void O(Context context, int i) {
        this.l = i;
        TextView textView = this.f1666b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final boolean P() {
        if (!this.P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f1665a;
        return actionMenuView != null && actionMenuView.u();
    }

    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    @Override // defpackage.iqf
    public void addMenuProvider(MenuProvider menuProvider) {
        this.G.c(menuProvider);
    }

    public final void b(List<View> list, int i) {
        boolean z = androidx.core.view.c.A(this) == 1;
        int childCount = getChildCount();
        int iB = p3b.b(i, androidx.core.view.c.A(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1669b == 0 && Q(childAt) && p(layoutParams.f1402a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1669b == 0 && Q(childAt2) && p(layoutParams2.f1402a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        LayoutParams layoutParamsGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.f1669b = 1;
        if (!z || this.i == null) {
            addView(view, layoutParamsGenerateLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateLayoutParams);
            this.E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1665a) != null && actionMenuView.p();
    }

    public void e() {
        d dVar = this.M;
        g gVar = dVar == null ? null : dVar.f1675b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1665a;
        if (actionMenuView != null) {
            actionMenuView.g();
        }
    }

    public void g() {
        if (this.h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, qii.Q);
            this.h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f1402a = (this.n & 112) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.f1669b = 2;
            this.h.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        qzk qzkVar = this.t;
        if (qzkVar != null) {
            return qzkVar.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        qzk qzkVar = this.t;
        if (qzkVar != null) {
            return qzkVar.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        qzk qzkVar = this.t;
        if (qzkVar != null) {
            return qzkVar.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        qzk qzkVar = this.t;
        if (qzkVar != null) {
            return qzkVar.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarS;
        ActionMenuView actionMenuView = this.f1665a;
        return (actionMenuView == null || (eVarS = actionMenuView.s()) == null || !eVarS.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.c.A(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.c.A(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1665a.getMenu();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1665a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.f1667k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.f1668r;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getTitleTextView() {
        return this.f1666b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ws5 getWrapper() {
        if (this.K == null) {
            this.K = new androidx.appcompat.widget.b(this, true);
        }
        return this.K;
    }

    public final void h() {
        if (this.t == null) {
            this.t = new qzk();
        }
    }

    public final void i() {
        if (this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f1665a.s() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1665a.getMenu();
            if (this.M == null) {
                this.M = new d();
            }
            this.f1665a.setExpandedActionViewsExclusive(true);
            eVar.c(this.M, this.j);
        }
    }

    public final void k() {
        if (this.f1665a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1665a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1667k);
            this.f1665a.setOnMenuItemClickListener(this.J);
            this.f1665a.t(this.N, this.O);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f1402a = (this.n & 112) | 8388613;
            this.f1665a.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            c(this.f1665a, false);
        }
    }

    public final void l() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), null, qii.Q);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f1402a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268  */
    /* JADX WARN: Code duplicated, block: B:102:0x028a  */
    /* JADX WARN: Code duplicated, block: B:104:0x028d  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0180  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0229  */
    /* JADX WARN: Code duplicated, block: B:95:0x022e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0242  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iD;
        int iE;
        int iMax;
        int iMin;
        boolean zQ;
        boolean zQ2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int iD2;
        int i19;
        int i20;
        int size2;
        int i21;
        int i22;
        int i23;
        int size3;
        boolean z3 = androidx.core.view.c.A(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        int iB = androidx.core.view.c.B(this);
        int iMin2 = iB >= 0 ? Math.min(iB, i4 - i2) : 0;
        if (Q(this.d)) {
            if (z3) {
                iE = E(this.d, i24, iArr, iMin2);
                iD = paddingLeft;
            } else {
                iD = D(this.d, paddingLeft, iArr, iMin2);
            }
            if (Q(this.h)) {
                if (z3) {
                    iE = E(this.h, iE, iArr, iMin2);
                } else {
                    iD = D(this.h, iD, iArr, iMin2);
                }
            }
            if (Q(this.f1665a)) {
                if (z3) {
                    iD = D(this.f1665a, iD, iArr, iMin2);
                } else {
                    iE = E(this.f1665a, iE, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iD);
            iArr[1] = Math.max(0, currentContentInsetRight - (i24 - iE));
            iMax = Math.max(iD, currentContentInsetLeft);
            iMin = Math.min(iE, i24 - currentContentInsetRight);
            if (Q(this.i)) {
                if (z3) {
                    iMin = E(this.i, iMin, iArr, iMin2);
                } else {
                    iMax = D(this.i, iMax, iArr, iMin2);
                }
            }
            if (Q(this.e)) {
                if (z3) {
                    iMin = E(this.e, iMin, iArr, iMin2);
                } else {
                    iMax = D(this.e, iMax, iArr, iMin2);
                }
            }
            zQ = Q(this.f1666b);
            zQ2 = Q(this.c);
            if (zQ) {
                LayoutParams layoutParams3 = (LayoutParams) this.f1666b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.f1666b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zQ2) {
                LayoutParams layoutParams4 = (LayoutParams) this.c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
            }
            if (!zQ || zQ2) {
                if (zQ) {
                    textView = this.f1666b;
                } else {
                    textView = this.c;
                }
                if (zQ2) {
                    textView2 = this.c;
                } else {
                    textView2 = this.f1666b;
                }
                layoutParams = (LayoutParams) textView.getLayoutParams();
                layoutParams2 = (LayoutParams) textView2.getLayoutParams();
                z2 = (!zQ && this.f1666b.getMeasuredWidth() > 0) || (zQ2 && this.c.getMeasuredWidth() > 0);
                i5 = this.w & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f1668r;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i15 = this.f1668r;
                    if (iMax2 < i14 + i15) {
                        iMax2 = i14 + i15;
                    } else {
                        i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i17 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i18 = this.s;
                        if (i16 < i17 + i18) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i18) - i16));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.s) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.p;
                    } else {
                        i11 = 0;
                    }
                    int i25 = i11 - iArr[1];
                    iMin -= Math.max(0, i25);
                    iArr[1] = Math.max(0, -i25);
                    if (zQ) {
                        LayoutParams layoutParams5 = (LayoutParams) this.f1666b.getLayoutParams();
                        int measuredWidth = iMin - this.f1666b.getMeasuredWidth();
                        int measuredHeight2 = this.f1666b.getMeasuredHeight() + paddingTop;
                        this.f1666b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth - this.q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zQ2) {
                        int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.c.getLayoutParams())).topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i26, iMin, this.c.getMeasuredHeight() + i26);
                        i13 = iMin - this.q;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i7 = this.p;
                    } else {
                        i7 = 0;
                    }
                    i8 = 0;
                    int i27 = i7 - iArr[0];
                    iMax += Math.max(0, i27);
                    iArr[0] = Math.max(0, -i27);
                    if (zQ) {
                        LayoutParams layoutParams6 = (LayoutParams) this.f1666b.getLayoutParams();
                        int measuredWidth2 = this.f1666b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1666b.getMeasuredHeight() + paddingTop;
                        this.f1666b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zQ2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i28, measuredWidth3, this.c.getMeasuredHeight() + i28);
                        i10 = measuredWidth3 + this.q;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
                b(this.D, 3);
                size = this.D.size();
                iD2 = iMax;
                for (i19 = i8; i19 < size; i19++) {
                    iD2 = D(this.D.get(i19), iD2, iArr, iMin2);
                }
                i20 = iMin2;
                b(this.D, 5);
                size2 = this.D.size();
                for (i21 = i8; i21 < size2; i21++) {
                    iMin = E(this.D.get(i21), iMin, iArr, i20);
                }
                b(this.D, 1);
                int iU = u(this.D, iArr);
                i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iU / 2);
                i23 = iU + i22;
                if (i22 >= iD2) {
                    if (i23 > iMin) {
                        iD2 = i22 - (i23 - iMin);
                    } else {
                        iD2 = i22;
                    }
                }
                size3 = this.D.size();
                while (i8 < size3) {
                    iD2 = D(this.D.get(i8), iD2, iArr, i20);
                    i8++;
                }
                this.D.clear();
            }
            i6 = paddingLeft;
            iMin2 = iMin2;
            i8 = 0;
            b(this.D, 3);
            size = this.D.size();
            iD2 = iMax;
            while (i19 < size) {
                iD2 = D(this.D.get(i19), iD2, iArr, iMin2);
            }
            i20 = iMin2;
            b(this.D, 5);
            size2 = this.D.size();
            while (i21 < size2) {
                iMin = E(this.D.get(i21), iMin, iArr, i20);
            }
            b(this.D, 1);
            int iU2 = u(this.D, iArr);
            i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iU2 / 2);
            i23 = iU2 + i22;
            if (i22 >= iD2) {
                if (i23 > iMin) {
                    iD2 = i22 - (i23 - iMin);
                } else {
                    iD2 = i22;
                }
            }
            size3 = this.D.size();
            while (i8 < size3) {
                iD2 = D(this.D.get(i8), iD2, iArr, i20);
                i8++;
            }
            this.D.clear();
        }
        iD = paddingLeft;
        iE = i24;
        if (Q(this.h)) {
            if (z3) {
                iE = E(this.h, iE, iArr, iMin2);
            } else {
                iD = D(this.h, iD, iArr, iMin2);
            }
        }
        if (Q(this.f1665a)) {
            if (z3) {
                iD = D(this.f1665a, iD, iArr, iMin2);
            } else {
                iE = E(this.f1665a, iE, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iD);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - iE));
        iMax = Math.max(iD, currentContentInsetLeft2);
        iMin = Math.min(iE, i24 - currentContentInsetRight2);
        if (Q(this.i)) {
            if (z3) {
                iMin = E(this.i, iMin, iArr, iMin2);
            } else {
                iMax = D(this.i, iMax, iArr, iMin2);
            }
        }
        if (Q(this.e)) {
            if (z3) {
                iMin = E(this.e, iMin, iArr, iMin2);
            } else {
                iMax = D(this.e, iMax, iArr, iMin2);
            }
        }
        zQ = Q(this.f1666b);
        zQ2 = Q(this.c);
        if (zQ) {
            LayoutParams layoutParams7 = (LayoutParams) this.f1666b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin + this.f1666b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zQ2) {
            LayoutParams layoutParams8 = (LayoutParams) this.c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin;
        }
        if (zQ) {
            if (zQ) {
                textView = this.f1666b;
            } else {
                textView = this.c;
            }
            if (zQ2) {
                textView2 = this.c;
            } else {
                textView2 = this.f1666b;
            }
            layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams2 = (LayoutParams) textView2.getLayoutParams();
            if (zQ) {
            }
            i5 = this.w & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f1668r;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i15 = this.f1668r;
                if (iMax2 < i14 + i15) {
                    iMax2 = i14 + i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i18 = this.s;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.s) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.p;
                } else {
                    i11 = 0;
                }
                int i29 = i11 - iArr[1];
                iMin -= Math.max(0, i29);
                iArr[1] = Math.max(0, -i29);
                if (zQ) {
                    LayoutParams layoutParams9 = (LayoutParams) this.f1666b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f1666b.getMeasuredWidth();
                    int measuredHeight4 = this.f1666b.getMeasuredHeight() + paddingTop;
                    this.f1666b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth4 - this.q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zQ2) {
                    int i210 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i210, iMin, this.c.getMeasuredHeight() + i210);
                    i13 = iMin - this.q;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
                i8 = 0;
            } else {
                if (z2) {
                    i7 = this.p;
                } else {
                    i7 = 0;
                }
                i8 = 0;
                int i211 = i7 - iArr[0];
                iMax += Math.max(0, i211);
                iArr[0] = Math.max(0, -i211);
                if (zQ) {
                    LayoutParams layoutParams10 = (LayoutParams) this.f1666b.getLayoutParams();
                    int measuredWidth5 = this.f1666b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1666b.getMeasuredHeight() + paddingTop;
                    this.f1666b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zQ2) {
                    int i212 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i212, measuredWidth6, this.c.getMeasuredHeight() + i212);
                    i10 = measuredWidth6 + this.q;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zQ) {
                textView = this.f1666b;
            } else {
                textView = this.c;
            }
            if (zQ2) {
                textView2 = this.c;
            } else {
                textView2 = this.f1666b;
            }
            layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams2 = (LayoutParams) textView2.getLayoutParams();
            if (zQ) {
            }
            i5 = this.w & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f1668r;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i15 = this.f1668r;
                if (iMax2 < i14 + i15) {
                    iMax2 = i14 + i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i18 = this.s;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.s) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.p;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zQ) {
                    LayoutParams layoutParams11 = (LayoutParams) this.f1666b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f1666b.getMeasuredWidth();
                    int measuredHeight6 = this.f1666b.getMeasuredHeight() + paddingTop;
                    this.f1666b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth7 - this.q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zQ2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i214, iMin, this.c.getMeasuredHeight() + i214);
                    i13 = iMin - this.q;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
                i8 = 0;
            } else {
                if (z2) {
                    i7 = this.p;
                } else {
                    i7 = 0;
                }
                i8 = 0;
                int i215 = i7 - iArr[0];
                iMax += Math.max(0, i215);
                iArr[0] = Math.max(0, -i215);
                if (zQ) {
                    LayoutParams layoutParams12 = (LayoutParams) this.f1666b.getLayoutParams();
                    int measuredWidth8 = this.f1666b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1666b.getMeasuredHeight() + paddingTop;
                    this.f1666b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zQ2) {
                    int i216 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i216, measuredWidth9, this.c.getMeasuredHeight() + i216);
                    i10 = measuredWidth9 + this.q;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        b(this.D, 3);
        size = this.D.size();
        iD2 = iMax;
        while (i19 < size) {
            iD2 = D(this.D.get(i19), iD2, iArr, iMin2);
        }
        i20 = iMin2;
        b(this.D, 5);
        size2 = this.D.size();
        while (i21 < size2) {
            iMin = E(this.D.get(i21), iMin, iArr, i20);
        }
        b(this.D, 1);
        int iU3 = u(this.D, iArr);
        i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iU3 / 2);
        i23 = iU3 + i22;
        if (i22 >= iD2) {
            if (i23 > iMin) {
                iD2 = i22 - (i23 - iMin);
            } else {
                iD2 = i22;
            }
        }
        size3 = this.D.size();
        while (i8 < size3) {
            iD2 = D(this.D.get(i8), iD2, iArr, i20);
            i8++;
        }
        this.D.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.F;
        boolean zB = eyq.b(this);
        int i3 = !zB ? 1 : 0;
        if (Q(this.d)) {
            G(this.d, i, 0, i2, 0, this.o);
            measuredWidth = this.d.getMeasuredWidth() + s(this.d);
            iMax = Math.max(0, this.d.getMeasuredHeight() + t(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.h)) {
            G(this.h, i, 0, i2, 0, this.o);
            measuredWidth = this.h.getMeasuredWidth() + s(this.h);
            iMax = Math.max(iMax, this.h.getMeasuredHeight() + t(this.h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.f1665a)) {
            G(this.f1665a, i, iMax3, i2, 0, this.o);
            measuredWidth2 = this.f1665a.getMeasuredWidth() + s(this.f1665a);
            iMax = Math.max(iMax, this.f1665a.getMeasuredHeight() + t(this.f1665a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1665a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.i)) {
            iMax4 += F(this.i, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.i.getMeasuredHeight() + t(this.i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (Q(this.e)) {
            iMax4 += F(this.e, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.e.getMeasuredHeight() + t(this.e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((LayoutParams) childAt.getLayoutParams()).f1669b == 0 && Q(childAt)) {
                iMax4 += F(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f1668r + this.s;
        int i6 = this.p + this.q;
        if (Q(this.f1666b)) {
            F(this.f1666b, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.f1666b.getMeasuredWidth() + s(this.f1666b);
            measuredHeight = this.f1666b.getMeasuredHeight() + t(this.f1666b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1666b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (Q(this.c)) {
            iMax2 = Math.max(iMax2, F(this.c, i, iMax4 + i6, i2, measuredHeight + i5, iArr));
            measuredHeight += this.c.getMeasuredHeight() + t(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1665a;
        androidx.appcompat.view.menu.e eVarS = actionMenuView != null ? actionMenuView.s() : null;
        int i = savedState.f1670b;
        if (i != 0 && this.M != null && eVarS != null && (menuItemFindItem = eVarS.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.c) {
            I();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        h();
        this.t.f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.M;
        if (dVar != null && (gVar = dVar.f1675b) != null) {
            savedState.f1670b = gVar.getItemId();
        }
        savedState.c = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(int i) {
        int iA = androidx.core.view.c.A(this);
        int iB = p3b.b(i, iA) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return iA == 1 ? 5 : 3;
    }

    public final int q(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iR = r(layoutParams.f1402a);
        if (iR == 48) {
            return getPaddingTop() - i2;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.w & 112;
    }

    @Override // defpackage.iqf
    public void removeMenuProvider(MenuProvider menuProvider) {
        this.G.l(menuProvider);
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return c5f.b(marginLayoutParams) + c5f.a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(of1.b(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(of1.b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(of1.b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.I = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1665a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1667k != i) {
            this.f1667k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1668r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    public boolean v() {
        d dVar = this.M;
        return (dVar == null || dVar.f1675b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1665a;
        return actionMenuView != null && actionMenuView.m();
    }

    public void x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        H();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1669b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1669b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1669b = 0;
            this.f1402a = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f1669b = 0;
            this.f1402a = i3;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1669b = 0;
            this.f1669b = layoutParams.f1669b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1669b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1669b = 0;
            a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1669b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.R);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.e)) {
                c(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && z(imageView)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            tip.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.d)) {
                c(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && z(textView)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!z(this.c)) {
                c(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1666b;
            if (textView != null && z(textView)) {
                removeView(this.f1666b);
                this.E.remove(this.f1666b);
            }
        } else {
            if (this.f1666b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1666b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1666b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.f1666b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f1666b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1666b)) {
                c(this.f1666b, true);
            }
        }
        TextView textView2 = this.f1666b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.f1666b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1670b;
        public boolean c;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1670b = parcel.readInt();
            this.c = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1670b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new MenuHostHelper(new Runnable() { // from class: qip
            @Override // java.lang.Runnable
            public final void run() {
                this.f31555a.y();
            }
        });
        this.H = new ArrayList<>();
        this.J = new a();
        this.Q = new b();
        xfp xfpVarV = xfp.v(getContext(), attributeSet, z5j.n3, i, 0);
        androidx.core.view.c.p0(this, context, z5j.n3, attributeSet, xfpVarV.r(), i, 0);
        this.l = xfpVarV.n(z5j.P3, 0);
        this.m = xfpVarV.n(z5j.G3, 0);
        this.w = xfpVarV.l(z5j.o3, this.w);
        this.n = xfpVarV.l(z5j.p3, 48);
        int iE = xfpVarV.e(z5j.J3, 0);
        iE = xfpVarV.s(z5j.O3) ? xfpVarV.e(z5j.O3, iE) : iE;
        this.s = iE;
        this.f1668r = iE;
        this.q = iE;
        this.p = iE;
        int iE2 = xfpVarV.e(z5j.M3, -1);
        if (iE2 >= 0) {
            this.p = iE2;
        }
        int iE3 = xfpVarV.e(z5j.L3, -1);
        if (iE3 >= 0) {
            this.q = iE3;
        }
        int iE4 = xfpVarV.e(z5j.N3, -1);
        if (iE4 >= 0) {
            this.f1668r = iE4;
        }
        int iE5 = xfpVarV.e(z5j.K3, -1);
        if (iE5 >= 0) {
            this.s = iE5;
        }
        this.o = xfpVarV.f(z5j.A3, -1);
        int iE6 = xfpVarV.e(z5j.w3, Integer.MIN_VALUE);
        int iE7 = xfpVarV.e(z5j.s3, Integer.MIN_VALUE);
        int iF = xfpVarV.f(z5j.u3, 0);
        int iF2 = xfpVarV.f(z5j.v3, 0);
        h();
        this.t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.t.g(iE6, iE7);
        }
        this.u = xfpVarV.e(z5j.x3, Integer.MIN_VALUE);
        this.v = xfpVarV.e(z5j.t3, Integer.MIN_VALUE);
        this.f = xfpVarV.g(z5j.r3);
        this.g = xfpVarV.p(z5j.q3);
        CharSequence charSequenceP = xfpVarV.p(z5j.I3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = xfpVarV.p(z5j.F3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.j = getContext();
        setPopupTheme(xfpVarV.n(z5j.E3, 0));
        Drawable drawableG = xfpVarV.g(z5j.D3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = xfpVarV.p(z5j.C3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = xfpVarV.g(z5j.y3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = xfpVarV.p(z5j.z3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (xfpVarV.s(z5j.Q3)) {
            setTitleTextColor(xfpVarV.c(z5j.Q3));
        }
        if (xfpVarV.s(z5j.H3)) {
            setSubtitleTextColor(xfpVarV.c(z5j.H3));
        }
        if (xfpVarV.s(z5j.B3)) {
            x(xfpVarV.n(z5j.B3, 0));
        }
        xfpVarV.w();
    }
}
