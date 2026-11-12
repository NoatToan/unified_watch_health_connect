package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import defpackage.eyq;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements e.b, MenuView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1545b;
    public int c;
    public boolean d;
    public ActionMenuPresenter e;
    public i.a f;
    public e.a g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1546k;
    public d l;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1548b;

        @ViewDebug.ExportedProperty
        public int c;

        @ViewDebug.ExportedProperty
        public boolean d;

        @ViewDebug.ExportedProperty
        public boolean e;
        public boolean f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1547a = layoutParams.f1547a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1547a = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean b();

        boolean c();
    }

    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public void b(e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(e eVar) {
            return false;
        }
    }

    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            d dVar = ActionMenuView.this.l;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
            e.a aVar = ActionMenuView.this.g;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static int q(View view, int i, int i2, int i3, int i4) {
        int i5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.d();
        if (i2 > 0) {
            i5 = 2;
            if (!z2 || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z2 || i6 >= 2) {
                    i5 = i6;
                }
            } else {
                i5 = 0;
            }
        } else {
            i5 = 0;
        }
        if (!layoutParams.f1547a && z2) {
            z = true;
        }
        layoutParams.d = z;
        layoutParams.f1548b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void b(e eVar) {
        this.f1544a = eVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.e.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean f(g gVar) {
        return this.f1544a.N(gVar, 0);
    }

    public void g() {
        ActionMenuPresenter actionMenuPresenter = this.e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.x();
        }
    }

    public Menu getMenu() {
        if (this.f1544a == null) {
            Context context = getContext();
            e eVar = new e(context);
            this.f1544a = eVar;
            eVar.V(new c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.e = actionMenuPresenter;
            actionMenuPresenter.I(true);
            ActionMenuPresenter actionMenuPresenter2 = this.e;
            i.a bVar = this.f;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter2.f(bVar);
            this.f1544a.c(this.e, this.f1545b);
            this.e.G(this);
        }
        return this.f1544a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.e.z();
    }

    public int getPopupTheme() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams k() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f1547a = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean l(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            zB = ((a) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? zB : zB | ((a) childAt2).c();
    }

    public boolean m() {
        ActionMenuPresenter actionMenuPresenter = this.e;
        return actionMenuPresenter != null && actionMenuPresenter.A();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean n() {
        ActionMenuPresenter actionMenuPresenter = this.e;
        return actionMenuPresenter != null && actionMenuPresenter.C();
    }

    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.e;
        return actionMenuPresenter != null && actionMenuPresenter.D();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.e.D()) {
                this.e.A();
                this.e.J();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.h) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zB = eyq.b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1547a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1547a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1547a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        e eVar;
        boolean z = this.h;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.h = z2;
        if (z != z2) {
            this.i = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.h && (eVar = this.f1544a) != null && size != this.i) {
            this.i = size;
            eVar.M(true);
        }
        int childCount = getChildCount();
        if (this.h && childCount > 0) {
            r(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean p() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    public final void r(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i5 = size - paddingLeft;
        int i6 = this.j;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = i6 + (i8 / i7);
        int childCount = getChildCount();
        int iMax = 0;
        int i10 = 0;
        boolean z3 = false;
        int i11 = 0;
        int iMax2 = 0;
        int i12 = 0;
        long j = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            int i13 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i14 = i11 + 1;
                if (z4) {
                    int i15 = this.f1546k;
                    r14 = 0;
                    childAt.setPadding(i15, 0, i15, 0);
                } else {
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f = r14;
                layoutParams.c = r14;
                layoutParams.f1548b = r14;
                layoutParams.d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.e = z4 && ((ActionMenuItemView) childAt).d();
                int iQ = q(childAt, i9, layoutParams.f1547a ? 1 : i7, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iQ);
                if (layoutParams.d) {
                    i12++;
                }
                if (layoutParams.f1547a) {
                    z3 = true;
                }
                i7 -= iQ;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iQ == 1) {
                    j |= (long) (1 << i10);
                    iMax = iMax;
                }
                i11 = i14;
            }
            i10++;
            size2 = i13;
        }
        int i16 = size2;
        boolean z5 = z3 && i11 == 2;
        boolean z6 = false;
        while (true) {
            if (i12 <= 0 || i7 <= 0) {
                z = z6;
                i3 = iMax;
                break;
            }
            int i17 = Integer.MAX_VALUE;
            int i18 = 0;
            int i19 = 0;
            long j2 = 0;
            while (i19 < childCount) {
                boolean z7 = z6;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i19).getLayoutParams();
                int i20 = iMax;
                if (layoutParams2.d) {
                    int i21 = layoutParams2.f1548b;
                    if (i21 < i17) {
                        j2 = 1 << i19;
                        i17 = i21;
                        i18 = 1;
                    } else if (i21 == i17) {
                        i18++;
                        j2 |= 1 << i19;
                    }
                }
                i19++;
                iMax = i20;
                z6 = z7;
            }
            z = z6;
            i3 = iMax;
            j |= j2;
            if (i18 > i7) {
                break;
            }
            int i22 = i17 + 1;
            int i23 = 0;
            while (i23 < childCount) {
                View childAt2 = getChildAt(i23);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i24 = i5;
                int i25 = mode;
                long j3 = 1 << i23;
                if ((j2 & j3) == 0) {
                    if (layoutParams3.f1548b == i22) {
                        j |= j3;
                    }
                    z5 = z5;
                } else {
                    if (z5 && layoutParams3.e && i7 == 1) {
                        int i26 = this.f1546k;
                        childAt2.setPadding(i26 + i9, 0, i26, 0);
                    }
                    layoutParams3.f1548b++;
                    layoutParams3.f = true;
                    i7--;
                }
                i23++;
                mode = i25;
                i5 = i24;
                z5 = z5;
            }
            iMax = i3;
            z6 = true;
        }
        boolean z8 = !z3 && i11 == 1;
        if (i7 <= 0 || j == 0 || (i7 >= i11 - 1 && !z8 && iMax2 <= 1)) {
            i4 = 0;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z8) {
                i4 = 0;
            } else {
                i4 = 0;
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i27 = childCount - 1;
                if ((j & ((long) (1 << i27))) != 0 && !((LayoutParams) getChildAt(i27).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i28 = fBitCount > 0.0f ? (int) ((i7 * i9) / fBitCount) : i4;
            z2 = z;
            for (int i29 = i4; i29 < childCount; i29++) {
                if ((j & ((long) (1 << i29))) != 0) {
                    View childAt3 = getChildAt(i29);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.c = i28;
                        layoutParams4.f = true;
                        if (i29 == 0 && !layoutParams4.e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i28) / 2;
                        }
                        z2 = true;
                    } else if (layoutParams4.f1547a) {
                        layoutParams4.c = i28;
                        layoutParams4.f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i28) / 2;
                        z2 = true;
                    } else {
                        if (i29 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i28 / 2;
                        }
                        if (i29 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i28 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i30 = i4; i30 < childCount; i30++) {
                View childAt4 = getChildAt(i30);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f1548b * i9) + layoutParams5.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, mode != 1073741824 ? i3 : i16);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public e s() {
        return this.f1544a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.e.F(z);
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.l = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.e.H(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.d = z;
    }

    public void setPopupTheme(int i) {
        if (this.c != i) {
            this.c = i;
            if (i == 0) {
                this.f1545b = getContext();
            } else {
                this.f1545b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.e = actionMenuPresenter;
        actionMenuPresenter.G(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void t(i.a aVar, e.a aVar2) {
        this.f = aVar;
        this.g = aVar2;
    }

    public boolean u() {
        ActionMenuPresenter actionMenuPresenter = this.e;
        return actionMenuPresenter != null && actionMenuPresenter.J();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.j = (int) (56.0f * f);
        this.f1546k = (int) (f * 4.0f);
        this.f1545b = context;
        this.c = 0;
    }
}
