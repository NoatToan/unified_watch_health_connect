package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.h.b, androidx.appcompat.view.menu.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.h f4897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.c f4901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.appcompat.view.menu.n.a f4902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.appcompat.view.menu.h.a f4903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f4908l;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements androidx.appcompat.view.menu.n.a {
        @Override // androidx.appcompat.view.menu.n.a
        public final boolean a(androidx.appcompat.view.menu.h hVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z14) {
        }
    }

    public class d implements androidx.appcompat.view.menu.h.a {
        public d() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003a A[RETURN] */
        @Override // androidx.appcompat.view.menu.h.a
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            boolean zOnMenuItemSelected;
            e eVar = ActionMenuView.this.f4908l;
            if (eVar != null) {
                Toolbar toolbar = Toolbar.this;
                Iterator<androidx.core.view.s> it = toolbar.mMenuHostHelper.f6559b.iterator();
                while (it.hasNext()) {
                    if (it.next().w5(menuItem)) {
                        zOnMenuItemSelected = true;
                        if (zOnMenuItemSelected) {
                            return true;
                        }
                    }
                }
                Toolbar.h hVar2 = toolbar.mOnMenuItemClickListener;
                zOnMenuItemSelected = hVar2 != null ? i.q.this.f86646b.onMenuItemSelected(0, menuItem) : false;
                if (zOnMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.h.a aVar = ActionMenuView.this.f4903g;
            if (aVar != null) {
                aVar.onMenuModeChange(hVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f14 = context.getResources().getDisplayMetrics().density;
        this.f4906j = (int) (56.0f * f14);
        this.f4907k = (int) (f14 * 4.0f);
        this.f4898b = context;
        this.f4899c = 0;
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            c cVar = new c(-2, -2);
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
            return cVar;
        }
        c cVar2 = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar2).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        }
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.h.b
    public final boolean a(androidx.appcompat.view.menu.j jVar) {
        return this.f4897a.performItemAction(jVar, 0);
    }

    public final boolean c(int i14) {
        boolean zB = false;
        if (i14 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i14 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i14);
        if (i14 < getChildCount() && (childAt instanceof a)) {
            zB = ((a) childAt).b();
        }
        return (i14 <= 0 || !(childAt2 instanceof a)) ? zB : ((a) childAt2).a() | zB;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f4897a == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            this.f4897a = hVar;
            hVar.setCallback(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f4901e = cVar;
            cVar.f5041m = true;
            cVar.f5042n = true;
            androidx.appcompat.view.menu.n.a bVar = this.f4902f;
            if (bVar == null) {
                bVar = new b();
            }
            cVar.f4713e = bVar;
            this.f4897a.addMenuPresenter(this.f4901e, this.f4898b);
            androidx.appcompat.widget.c cVar2 = this.f4901e;
            cVar2.f4716h = this;
            this.f4897a = cVar2.f4711c;
        }
        return this.f4897a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.c cVar = this.f4901e;
        androidx.appcompat.widget.c.d dVar = cVar.f5038j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f5040l) {
            return cVar.f5039k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4899c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void initialize(androidx.appcompat.view.menu.h hVar) {
        this.f4897a = hVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f4901e;
        if (cVar != null) {
            cVar.updateMenuView(false);
            if (this.f4901e.f()) {
                this.f4901e.e();
                this.f4901e.g();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVar = this.f4901e;
        if (cVar != null) {
            cVar.e();
            androidx.appcompat.widget.c.a aVar = cVar.f5049w;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.f4820j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int width;
        int paddingLeft;
        if (!this.f4904h) {
            super.onLayout(z14, i14, i15, i16, i17);
            return;
        }
        int childCount = getChildCount();
        int i18 = (i17 - i15) / 2;
        int dividerWidth = getDividerWidth();
        int i19 = i16 - i14;
        int paddingRight = (i19 - getPaddingRight()) - getPaddingLeft();
        boolean z15 = getLayoutDirection() == 1;
        int i24 = 0;
        int i25 = 0;
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f4909a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (c(i26)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z15) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i27 = i18 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i27, width, measuredHeight + i27);
                    paddingRight -= measuredWidth;
                    i24 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    c(i26);
                    i25++;
                }
            }
        }
        if (childCount == 1 && i24 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i28 = (i19 / 2) - (measuredWidth2 / 2);
            int i29 = i18 - (measuredHeight2 / 2);
            childAt2.layout(i28, i29, measuredWidth2 + i28, measuredHeight2 + i29);
            return;
        }
        int i30 = i25 - (i24 ^ 1);
        int iMax = Math.max(0, i30 > 0 ? paddingRight / i30 : 0);
        if (z15) {
            int width2 = getWidth() - getPaddingRight();
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt3 = getChildAt(i34);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f4909a) {
                    int i35 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i36 = i18 - (measuredHeight3 / 2);
                    childAt3.layout(i35 - measuredWidth3, i36, i35, measuredHeight3 + i36);
                    width2 = i35 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i37 = 0; i37 < childCount; i37++) {
            View childAt4 = getChildAt(i37);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f4909a) {
                int i38 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i39 = i18 - (measuredHeight4 / 2);
                childAt4.layout(i38, i39, i38 + measuredWidth4, measuredHeight4 + i39);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax + i38;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i14, int i15) {
        int i16;
        int i17;
        ?? r14;
        int i18;
        int i19;
        androidx.appcompat.view.menu.h hVar;
        boolean z14 = this.f4904h;
        boolean z15 = View.MeasureSpec.getMode(i14) == 1073741824;
        this.f4904h = z15;
        if (z14 != z15) {
            this.f4905i = 0;
        }
        int size = View.MeasureSpec.getSize(i14);
        if (this.f4904h && (hVar = this.f4897a) != null && size != this.f4905i) {
            this.f4905i = size;
            hVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f4904h || childCount <= 0) {
            for (int i24 = 0; i24 < childCount; i24++) {
                c cVar = (c) getChildAt(i24).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i14, i15);
            return;
        }
        int mode = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i14);
        int size3 = View.MeasureSpec.getSize(i15);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i15, paddingBottom, -2);
        int i25 = size2 - paddingRight;
        int i26 = this.f4906j;
        int i27 = i25 / i26;
        int i28 = i25 % i26;
        if (i27 == 0) {
            setMeasuredDimension(i25, 0);
            return;
        }
        int i29 = (i28 / i27) + i26;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i30 = 0;
        int iMax2 = 0;
        int i34 = 0;
        boolean z16 = false;
        int i35 = 0;
        long j8 = 0;
        while (true) {
            i16 = this.f4907k;
            if (i34 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i34);
            int i36 = size3;
            int i37 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i18 = i29;
            } else {
                boolean z17 = childAt instanceof ActionMenuItemView;
                i30++;
                if (z17) {
                    childAt.setPadding(i16, 0, i16, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f4914f = false;
                cVar2.f4911c = 0;
                cVar2.f4910b = 0;
                cVar2.f4912d = false;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = 0;
                cVar2.f4913e = z17 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i38 = cVar2.f4909a ? 1 : i27;
                c cVar3 = (c) childAt.getLayoutParams();
                int i39 = i27;
                i18 = i29;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i37, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z17 ? (ActionMenuItemView) childAt : null;
                boolean z18 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z19 = z18;
                if (i38 <= 0 || (z18 && i38 < 2)) {
                    i19 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i38, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i19 = measuredWidth / i18;
                    if (measuredWidth % i18 != 0) {
                        i19++;
                    }
                    if (z19 && i19 < 2) {
                        i19 = 2;
                    }
                }
                cVar3.f4912d = !cVar3.f4909a && z19;
                cVar3.f4910b = i19;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i18, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i19);
                if (cVar2.f4912d) {
                    i35++;
                }
                if (cVar2.f4909a) {
                    z16 = true;
                }
                i27 = i39 - i19;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i19 == 1) {
                    j8 |= (long) (1 << i34);
                }
            }
            i34++;
            size3 = i36;
            paddingBottom = i37;
            i29 = i18;
        }
        int i44 = size3;
        int i45 = i27;
        int i46 = i29;
        boolean z24 = z16 && i30 == 2;
        int i47 = i45;
        boolean z25 = false;
        while (true) {
            if (i35 <= 0 || i47 <= 0) {
                i17 = iMax;
                break;
            }
            int i48 = Integer.MAX_VALUE;
            long j14 = 0;
            int i49 = 0;
            int i54 = 0;
            while (i54 < childCount2) {
                int i55 = iMax;
                c cVar4 = (c) getChildAt(i54).getLayoutParams();
                boolean z26 = z24;
                if (cVar4.f4912d) {
                    int i56 = cVar4.f4910b;
                    if (i56 < i48) {
                        j14 = 1 << i54;
                        i48 = i56;
                        i49 = 1;
                    } else if (i56 == i48) {
                        j14 |= 1 << i54;
                        i49++;
                    }
                }
                i54++;
                z24 = z26;
                iMax = i55;
            }
            i17 = iMax;
            boolean z27 = z24;
            j8 |= j14;
            if (i49 > i47) {
                break;
            }
            int i57 = i48 + 1;
            int i58 = 0;
            while (i58 < childCount2) {
                View childAt2 = getChildAt(i58);
                c cVar5 = (c) childAt2.getLayoutParams();
                boolean z28 = z16;
                long j15 = 1 << i58;
                if ((j14 & j15) != 0) {
                    if (z27 && cVar5.f4913e) {
                        r14 = 1;
                        r14 = 1;
                        if (i47 == 1) {
                            childAt2.setPadding(i16 + i46, 0, i16, 0);
                        }
                    } else {
                        r14 = 1;
                    }
                    cVar5.f4910b += r14;
                    cVar5.f4914f = r14;
                    i47--;
                } else if (cVar5.f4910b == i57) {
                    j8 |= j15;
                }
                i58++;
                z16 = z28;
            }
            z24 = z27;
            iMax = i17;
            z25 = true;
        }
        boolean z29 = !z16 && i30 == 1;
        if (i47 > 0 && j8 != 0 && (i47 < i30 - 1 || z29 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j8);
            if (!z29) {
                if ((j8 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f4913e) {
                    fBitCount -= 0.5f;
                }
                int i59 = childCount2 - 1;
                if ((j8 & ((long) (1 << i59))) != 0 && !((c) getChildAt(i59).getLayoutParams()).f4913e) {
                    fBitCount -= 0.5f;
                }
            }
            int i64 = fBitCount > 0.0f ? (int) ((i47 * i46) / fBitCount) : 0;
            boolean z34 = z25;
            for (int i65 = 0; i65 < childCount2; i65++) {
                if ((j8 & ((long) (1 << i65))) != 0) {
                    View childAt3 = getChildAt(i65);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f4911c = i64;
                        cVar6.f4914f = true;
                        if (i65 == 0 && !cVar6.f4913e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i64) / 2;
                        }
                        z34 = true;
                    } else if (cVar6.f4909a) {
                        cVar6.f4911c = i64;
                        cVar6.f4914f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i64) / 2;
                        z34 = true;
                    } else {
                        if (i65 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i64 / 2;
                        }
                        if (i65 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i64 / 2;
                        }
                    }
                }
            }
            z25 = z34;
        }
        if (z25) {
            for (int i66 = 0; i66 < childCount2; i66++) {
                View childAt4 = getChildAt(i66);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f4914f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f4910b * i46) + cVar7.f4911c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i25, mode != 1073741824 ? i17 : i44);
    }

    public void setExpandedActionViewsExclusive(boolean z14) {
        this.f4901e.f5046r = z14;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f4908l = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.c cVar = this.f4901e;
        androidx.appcompat.widget.c.d dVar = cVar.f5038j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            cVar.f5040l = true;
            cVar.f5039k = drawable;
        }
    }

    public void setOverflowReserved(boolean z14) {
        this.f4900d = z14;
    }

    public void setPopupTheme(int i14) {
        if (this.f4899c != i14) {
            this.f4899c = i14;
            if (i14 == 0) {
                this.f4898b = getContext();
            } else {
                this.f4898b = new ContextThemeWrapper(getContext(), i14);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f4901e = cVar;
        cVar.f4716h = this;
        this.f4897a = cVar.f4711c;
    }

    public static class c extends LinearLayoutCompat.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4914f;

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f4909a = cVar.f4909a;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i14, int i15) {
            super(i14, i15);
            this.f4909a = false;
        }

        public c(int i14, int i15, boolean z14) {
            super(i14, i15);
            this.f4909a = z14;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.a generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
