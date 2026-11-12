package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.view.g1;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.o {
    private static final String TAG = "Toolbar";
    private androidx.appcompat.view.menu.n.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private n0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    androidx.appcompat.view.menu.h.a mMenuBuilderCallback;
    final androidx.core.view.r mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    h mOnMenuItemClickListener;
    private androidx.appcompat.widget.c mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private z0 mWrapper;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    public class c implements androidx.appcompat.view.menu.h.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.h.a aVar = Toolbar.this.mMenuBuilderCallback;
            return aVar != null && aVar.onMenuItemSelected(hVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.c cVar = toolbar.mMenuView.f4901e;
            if (cVar == null || !cVar.f()) {
                Iterator<androidx.core.view.s> it = toolbar.mMenuHostHelper.f6559b.iterator();
                while (it.hasNext()) {
                    it.next().Z4(hVar);
                }
            }
            androidx.appcompat.view.menu.h.a aVar = toolbar.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.onMenuModeChange(hVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Toolbar.this.collapseActionView();
        }
    }

    public static class e {
        private e() {
        }

        public static OnBackInvokedDispatcher a(View view2) {
            return view2.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new y0(runnable, 0);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f5014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.j f5015b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean collapseItemActionView(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof m.c) {
                ((m.c) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.mExpandedActionView);
            toolbar.removeView(toolbar.mCollapseButtonView);
            toolbar.mExpandedActionView = null;
            toolbar.addChildrenForExpandedActionView();
            this.f5015b = null;
            toolbar.requestLayout();
            jVar.C = false;
            jVar.f4786n.onItemsChanged(false);
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean expandItemActionView(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.ensureCollapseButtonView();
            ViewParent parent = toolbar.mCollapseButtonView.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                toolbar.addView(toolbar.mCollapseButtonView);
            }
            View actionView = jVar.getActionView();
            toolbar.mExpandedActionView = actionView;
            this.f5015b = jVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
                }
                g gVarGenerateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
                gVarGenerateDefaultLayoutParams.f86545a = (toolbar.mButtonGravity & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f5017b = 2;
                toolbar.mExpandedActionView.setLayoutParams(gVarGenerateDefaultLayoutParams);
                toolbar.addView(toolbar.mExpandedActionView);
            }
            toolbar.removeChildrenForExpandedActionView();
            toolbar.requestLayout();
            jVar.C = true;
            jVar.f4786n.onItemsChanged(false);
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof m.c) {
                ((m.c) callback).onActionViewExpanded();
            }
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n
        public final void initForMenu(Context context, androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.h hVar2 = this.f5014a;
            if (hVar2 != null && (jVar = this.f5015b) != null) {
                hVar2.collapseItemActionView(jVar);
            }
            this.f5014a = hVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public final void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z14) {
        }

        @Override // androidx.appcompat.view.menu.n
        public final void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public final Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean onSubMenuSelected(androidx.appcompat.view.menu.s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public final void updateMenuView(boolean z14) {
            if (this.f5015b != null) {
                androidx.appcompat.view.menu.h hVar = this.f5014a;
                if (hVar != null) {
                    int size = hVar.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        if (this.f5014a.getItem(i14) == this.f5015b) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f5014a, this.f5015b);
            }
        }
    }

    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new androidx.core.view.r(new x0(this, 1));
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        Context context2 = getContext();
        int[] iArr = h.a.f80446z;
        w0 w0VarG = w0.g(context2, attributeSet, iArr, i14, 0);
        androidx.core.view.s0.q(this, context, iArr, attributeSet, w0VarG.f5271b, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        this.mTitleTextAppearance = typedArray.getResourceId(28, 0);
        this.mSubtitleTextAppearance = typedArray.getResourceId(19, 0);
        this.mGravity = typedArray.getInteger(0, this.mGravity);
        this.mButtonGravity = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        ensureContentInsets();
        n0 n0Var = this.mContentInsets;
        n0Var.f5188h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            n0Var.f5185e = dimensionPixelSize;
            n0Var.f5181a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            n0Var.f5186f = dimensionPixelSize2;
            n0Var.f5182b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            n0Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.mCollapseIcon = w0VarG.b(4);
        this.mCollapseDescription = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableB = w0VarG.b(16);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = w0VarG.b(11);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(w0VarG.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(w0VarG.a(20));
        }
        if (typedArray.hasValue(14)) {
            inflateMenu(typedArray.getResourceId(14, 0));
        }
        w0VarG.h();
    }

    private void addCustomViewsWithGravity(List<View> list, int i14) {
        boolean z14 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection());
        list.clear();
        if (!z14) {
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f5017b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(gVar.f86545a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i16 = childCount - 1; i16 >= 0; i16--) {
            View childAt2 = getChildAt(i16);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f5017b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(gVar2.f86545a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view2, boolean z14) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f5017b = 1;
        if (!z14 || this.mExpandedActionView == null) {
            addView(view2, gVarGenerateLayoutParams);
        } else {
            view2.setLayoutParams(gVarGenerateLayoutParams);
            this.mHiddenViews.add(view2);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new n0();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.f4897a == null) {
            androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            hVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            ActionMenuView actionMenuView2 = this.mMenuView;
            androidx.appcompat.view.menu.n.a aVar = this.mActionMenuPresenterCallback;
            c cVar = new c();
            actionMenuView2.f4902f = aVar;
            actionMenuView2.f4903g = cVar;
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f86545a = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(gVarGenerateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f86545a = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i14) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int getChildTop(View view2, int i14) {
        g gVar = (g) view2.getLayoutParams();
        int measuredHeight = view2.getMeasuredHeight();
        int i15 = i14 > 0 ? (measuredHeight - i14) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(gVar.f86545a);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i15;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i15;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i16 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i16) {
            iMax = i16;
        } else {
            int i17 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i18 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i17 < i18) {
                iMax = Math.max(0, iMax - (i18 - i17));
            }
        }
        return paddingTop + iMax;
    }

    private int getChildVerticalGravity(int i14) {
        int i15 = i14 & 112;
        return (i15 == 16 || i15 == 48 || i15 == 80) ? i15 : this.mGravity & 112;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i14 = 0; i14 < menu.size(); i14++) {
            arrayList.add(menu.getItem(i14));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    private MenuInflater getMenuInflater() {
        return new m.g(getContext());
    }

    private int getVerticalMargins(View view2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i14 = iArr[0];
        int i15 = iArr[1];
        int size = list.size();
        int i16 = 0;
        int measuredWidth = 0;
        while (i16 < size) {
            View view2 = list.get(i16);
            g gVar = (g) view2.getLayoutParams();
            int i17 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i14;
            int i18 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i15;
            int iMax = Math.max(0, i17);
            int iMax2 = Math.max(0, i18);
            int iMax3 = Math.max(0, -i17);
            int iMax4 = Math.max(0, -i18);
            measuredWidth += view2.getMeasuredWidth() + iMax + iMax2;
            i16++;
            i15 = iMax4;
            i14 = iMax3;
        }
        return measuredWidth;
    }

    private boolean isChildOrHidden(View view2) {
        return view2.getParent() == this || this.mHiddenViews.contains(view2);
    }

    private int layoutChildLeft(View view2, int i14, int[] iArr, int i15) {
        g gVar = (g) view2.getLayoutParams();
        int i16 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i16) + i14;
        iArr[0] = Math.max(0, -i16);
        int childTop = getChildTop(view2, i15);
        int measuredWidth = view2.getMeasuredWidth();
        view2.layout(iMax, childTop, iMax + measuredWidth, view2.getMeasuredHeight() + childTop);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + iMax;
    }

    private int layoutChildRight(View view2, int i14, int[] iArr, int i15) {
        g gVar = (g) view2.getLayoutParams();
        int i16 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i14 - Math.max(0, i16);
        iArr[1] = Math.max(0, -i16);
        int childTop = getChildTop(view2, i15);
        int measuredWidth = view2.getMeasuredWidth();
        view2.layout(iMax - measuredWidth, childTop, iMax, view2.getMeasuredHeight() + childTop);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int measureChildCollapseMargins(View view2, int i14, int i15, int i16, int i17, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        int i18 = marginLayoutParams.leftMargin - iArr[0];
        int i19 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i19) + Math.max(0, i18);
        iArr[0] = Math.max(0, -i18);
        iArr[1] = Math.max(0, -i19);
        view2.measure(ViewGroup.getChildMeasureSpec(i14, getPaddingRight() + getPaddingLeft() + iMax + i15, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i16, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i17, marginLayoutParams.height));
        return view2.getMeasuredWidth() + iMax;
    }

    private void measureChildConstrained(View view2, int i14, int i15, int i16, int i17, int i18) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i15, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i17, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i18 >= 0) {
            if (mode != 0) {
                i18 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i18);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
        }
        view2.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        androidx.core.view.r rVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<androidx.core.view.s> it = rVar.f6559b.iterator();
        while (it.hasNext()) {
            it.next().Y3(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view2) {
        return (view2 == null || view2.getParent() != this || view2.getVisibility() == 8) ? false : true;
    }

    public void addChildrenForExpandedActionView() {
        int size = this.mHiddenViews.size();
        while (true) {
            size--;
            ArrayList<View> arrayList = this.mHiddenViews;
            if (size < 0) {
                arrayList.clear();
                return;
            }
            addView(arrayList.get(size));
        }
    }

    @Override // androidx.core.view.o
    public void addMenuProvider(androidx.core.view.s sVar) {
        androidx.core.view.r rVar = this.mMenuHostHelper;
        rVar.f6559b.add(sVar);
        rVar.f6558a.run();
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.f4900d;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public void collapseActionView() {
        f fVar = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.j jVar = fVar == null ? null : fVar.f5015b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        androidx.appcompat.widget.c cVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (cVar = actionMenuView.f4901e) == null) {
            return;
        }
        cVar.e();
        androidx.appcompat.widget.c.a aVar = cVar.f5049w;
        if (aVar == null || !aVar.b()) {
            return;
        }
        aVar.f4820j.dismiss();
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            m mVar = new m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = mVar;
            mVar.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f86545a = (this.mButtonGravity & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f5017b = 2;
            this.mCollapseButtonView.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof i.a.C1716a) {
            return new g((i.a.C1716a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f5187g ? n0Var.f5181a : n0Var.f5182b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i14 = this.mContentInsetEndWithActions;
        return i14 != Integer.MIN_VALUE ? i14 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f5181a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f5182b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f5187g ? n0Var.f5182b : n0Var.f5181a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i14 = this.mContentInsetStartWithNavigation;
        return i14 != Integer.MIN_VALUE ? i14 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.h hVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (hVar = actionMenuView.f4897a) == null || !hVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public b0 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new z0(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        return (fVar == null || fVar.f5015b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        androidx.appcompat.widget.c cVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (cVar = actionMenuView.f4901e) == null || !cVar.e()) ? false : true;
    }

    public void inflateMenu(int i14) {
        getMenuInflater().inflate(i14, getMenu());
    }

    @Override // androidx.core.view.o
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public boolean isOverflowMenuShowPending() {
        androidx.appcompat.widget.c cVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (cVar = actionMenuView.f4901e) == null) {
            return false;
        }
        return cVar.f5050x != null || cVar.f();
    }

    public boolean isOverflowMenuShowing() {
        androidx.appcompat.widget.c cVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (cVar = actionMenuView.f4901e) == null || !cVar.f()) ? false : true;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i14 = 0; i14 < lineCount; i14++) {
            if (layout.getEllipsisCount(i14) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0230  */
    /* JADX WARN: Code duplicated, block: B:102:0x0253  */
    /* JADX WARN: Code duplicated, block: B:104:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x0278  */
    /* JADX WARN: Code duplicated, block: B:107:0x027b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0291 A[LOOP:0: B:109:0x028d->B:111:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x02ad A[LOOP:1: B:113:0x02a9->B:115:0x02ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e2 A[LOOP:2: B:123:0x02de->B:125:0x02e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x029e A[EDGE_INSN: B:128:0x029e->B:112:0x029e BREAK  A[LOOP:0: B:109:0x028d->B:111:0x0291], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ba A[EDGE_INSN: B:129:0x02ba->B:116:0x02ba BREAK  A[LOOP:1: B:113:0x02a9->B:115:0x02ad], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:91:0x020a  */
    /* JADX WARN: Code duplicated, block: B:93:0x020d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0218  */
    /* JADX WARN: Code duplicated, block: B:98:0x021c  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int iLayoutChildLeft;
        int iLayoutChildRight;
        int iMax;
        int iMin;
        boolean zShouldLayout;
        boolean zShouldLayout2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i18;
        boolean z15;
        int i19;
        int i24;
        int paddingTop;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int iMax2;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int size;
        int iLayoutChildLeft2;
        int i44;
        ArrayList<View> arrayList;
        int size2;
        int i45;
        ArrayList<View> arrayList2;
        int i46;
        int i47;
        int size3;
        ArrayList<View> arrayList3;
        View view2;
        View view3;
        View view4;
        View view5;
        boolean z16 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i48 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i17 - i15) : 0;
        if (shouldLayout(this.mNavButtonView)) {
            View view6 = this.mNavButtonView;
            if (z16) {
                iLayoutChildRight = layoutChildRight(view6, i48, iArr, iMin2);
                iLayoutChildLeft = paddingLeft;
            } else {
                iLayoutChildLeft = layoutChildLeft(view6, paddingLeft, iArr, iMin2);
            }
            if (shouldLayout(this.mCollapseButtonView)) {
                view5 = this.mCollapseButtonView;
                if (z16) {
                    iLayoutChildRight = layoutChildRight(view5, iLayoutChildRight, iArr, iMin2);
                } else {
                    iLayoutChildLeft = layoutChildLeft(view5, iLayoutChildLeft, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mMenuView)) {
                view4 = this.mMenuView;
                if (z16) {
                    iLayoutChildLeft = layoutChildLeft(view4, iLayoutChildLeft, iArr, iMin2);
                } else {
                    iLayoutChildRight = layoutChildRight(view4, iLayoutChildRight, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iLayoutChildLeft);
            iArr[1] = Math.max(0, currentContentInsetRight - (i48 - iLayoutChildRight));
            iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft);
            iMin = Math.min(iLayoutChildRight, i48 - currentContentInsetRight);
            if (shouldLayout(this.mExpandedActionView)) {
                view3 = this.mExpandedActionView;
                if (z16) {
                    iMin = layoutChildRight(view3, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(view3, iMax, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mLogoView)) {
                view2 = this.mLogoView;
                if (z16) {
                    iMin = layoutChildRight(view2, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(view2, iMax, iArr, iMin2);
                }
            }
            zShouldLayout = shouldLayout(this.mTitleTextView);
            zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
            if (zShouldLayout) {
                g gVar3 = (g) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zShouldLayout2) {
                g gVar4 = (g) this.mSubtitleTextView.getLayoutParams();
                measuredHeight = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).topMargin + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + measuredHeight;
            }
            if (!zShouldLayout || zShouldLayout2) {
                if (zShouldLayout) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zShouldLayout2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i18 = measuredHeight;
                z15 = (!zShouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (zShouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i19 = this.mGravity & 112;
                i24 = iMax;
                if (i19 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
                } else if (i19 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i18) / 2;
                    i35 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i36 = this.mTitleMarginTop;
                    if (iMax2 < i35 + i36) {
                        iMax2 = i35 + i36;
                    } else {
                        i37 = (((height - paddingBottom) - i18) - iMax2) - paddingTop2;
                        i38 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i39 = this.mTitleMarginBottom;
                        if (i37 < i38 + i39) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i39) - i37));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - i18;
                }
                if (z16) {
                    if (z15) {
                        i29 = this.mTitleMarginStart;
                    } else {
                        i29 = 0;
                    }
                    int i49 = i29 - iArr[1];
                    iMin -= Math.max(0, i49);
                    iArr[1] = Math.max(0, -i49);
                    if (zShouldLayout) {
                        g gVar5 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i30 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i30 = iMin;
                    }
                    if (zShouldLayout2) {
                        int i54 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i54, iMin, this.mSubtitleTextView.getMeasuredHeight() + i54);
                        i34 = iMin - this.mTitleMarginEnd;
                    } else {
                        i34 = iMin;
                    }
                    if (z15) {
                        iMin = Math.min(i30, i34);
                    }
                    iMax = i24;
                    i26 = 0;
                } else {
                    if (z15) {
                        i25 = this.mTitleMarginStart;
                    } else {
                        i25 = 0;
                    }
                    i26 = 0;
                    int i55 = i25 - iArr[0];
                    iMax = Math.max(0, i55) + i24;
                    iArr[0] = Math.max(0, -i55);
                    if (zShouldLayout) {
                        g gVar6 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i27 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i27 = iMax;
                    }
                    if (zShouldLayout2) {
                        int i56 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                        this.mSubtitleTextView.layout(iMax, i56, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i56);
                        i28 = measuredWidth3 + this.mTitleMarginEnd;
                    } else {
                        i28 = iMax;
                    }
                    if (z15) {
                        iMax = Math.max(i27, i28);
                    }
                }
            } else {
                i26 = 0;
            }
            addCustomViewsWithGravity(this.mTempViews, 3);
            size = this.mTempViews.size();
            iLayoutChildLeft2 = iMax;
            i44 = i26;
            while (true) {
                arrayList = this.mTempViews;
                if (i44 < size) {
                    break;
                }
                iLayoutChildLeft2 = layoutChildLeft(arrayList.get(i44), iLayoutChildLeft2, iArr, iMin2);
                i44++;
            }
            addCustomViewsWithGravity(arrayList, 5);
            size2 = this.mTempViews.size();
            i45 = i26;
            while (true) {
                arrayList2 = this.mTempViews;
                if (i45 < size2) {
                    break;
                }
                iMin = layoutChildRight(arrayList2.get(i45), iMin, iArr, iMin2);
                i45++;
            }
            addCustomViewsWithGravity(arrayList2, 1);
            int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr);
            i46 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (viewListMeasuredWidth / 2);
            i47 = viewListMeasuredWidth + i46;
            if (i46 >= iLayoutChildLeft2) {
                if (i47 > iMin) {
                    iLayoutChildLeft2 = i46 - (i47 - iMin);
                } else {
                    iLayoutChildLeft2 = i46;
                }
            }
            size3 = this.mTempViews.size();
            while (true) {
                arrayList3 = this.mTempViews;
                if (i26 < size3) {
                    arrayList3.clear();
                    return;
                } else {
                    iLayoutChildLeft2 = layoutChildLeft(arrayList3.get(i26), iLayoutChildLeft2, iArr, iMin2);
                    i26++;
                }
            }
        } else {
            iLayoutChildLeft = paddingLeft;
        }
        iLayoutChildRight = i48;
        if (shouldLayout(this.mCollapseButtonView)) {
            view5 = this.mCollapseButtonView;
            if (z16) {
                iLayoutChildRight = layoutChildRight(view5, iLayoutChildRight, iArr, iMin2);
            } else {
                iLayoutChildLeft = layoutChildLeft(view5, iLayoutChildLeft, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mMenuView)) {
            view4 = this.mMenuView;
            if (z16) {
                iLayoutChildLeft = layoutChildLeft(view4, iLayoutChildLeft, iArr, iMin2);
            } else {
                iLayoutChildRight = layoutChildRight(view4, iLayoutChildRight, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iLayoutChildLeft);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i48 - iLayoutChildRight));
        iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft2);
        iMin = Math.min(iLayoutChildRight, i48 - currentContentInsetRight2);
        if (shouldLayout(this.mExpandedActionView)) {
            view3 = this.mExpandedActionView;
            if (z16) {
                iMin = layoutChildRight(view3, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(view3, iMax, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mLogoView)) {
            view2 = this.mLogoView;
            if (z16) {
                iMin = layoutChildRight(view2, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(view2, iMax, iArr, iMin2);
            }
        }
        zShouldLayout = shouldLayout(this.mTitleTextView);
        zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (zShouldLayout) {
            g gVar7 = (g) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zShouldLayout2) {
            g gVar8 = (g) this.mSubtitleTextView.getLayoutParams();
            measuredHeight = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).topMargin + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin + measuredHeight;
        }
        if (zShouldLayout) {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i18 = measuredHeight;
            if (zShouldLayout) {
            }
            i19 = this.mGravity & 112;
            i24 = iMax;
            if (i19 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
            } else if (i19 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i18) / 2;
                i35 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i36 = this.mTitleMarginTop;
                if (iMax2 < i35 + i36) {
                    iMax2 = i35 + i36;
                } else {
                    i37 = (((height - paddingBottom) - i18) - iMax2) - paddingTop2;
                    i38 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i39 = this.mTitleMarginBottom;
                    if (i37 < i38 + i39) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i39) - i37));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - i18;
            }
            if (z16) {
                if (z15) {
                    i29 = this.mTitleMarginStart;
                } else {
                    i29 = 0;
                }
                int i410 = i29 - iArr[1];
                iMin -= Math.max(0, i410);
                iArr[1] = Math.max(0, -i410);
                if (zShouldLayout) {
                    g gVar9 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i30 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i30 = iMin;
                }
                if (zShouldLayout2) {
                    int i57 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i57, iMin, this.mSubtitleTextView.getMeasuredHeight() + i57);
                    i34 = iMin - this.mTitleMarginEnd;
                } else {
                    i34 = iMin;
                }
                if (z15) {
                    iMin = Math.min(i30, i34);
                }
                iMax = i24;
                i26 = 0;
            } else {
                if (z15) {
                    i25 = this.mTitleMarginStart;
                } else {
                    i25 = 0;
                }
                i26 = 0;
                int i58 = i25 - iArr[0];
                iMax = Math.max(0, i58) + i24;
                iArr[0] = Math.max(0, -i58);
                if (zShouldLayout) {
                    g gVar10 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i27 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i27 = iMax;
                }
                if (zShouldLayout2) {
                    int i59 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i59, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i59);
                    i28 = measuredWidth6 + this.mTitleMarginEnd;
                } else {
                    i28 = iMax;
                }
                if (z15) {
                    iMax = Math.max(i27, i28);
                }
            }
        } else {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i18 = measuredHeight;
            if (zShouldLayout) {
            }
            i19 = this.mGravity & 112;
            i24 = iMax;
            if (i19 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
            } else if (i19 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i18) / 2;
                i35 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i36 = this.mTitleMarginTop;
                if (iMax2 < i35 + i36) {
                    iMax2 = i35 + i36;
                } else {
                    i37 = (((height - paddingBottom) - i18) - iMax2) - paddingTop2;
                    i38 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i39 = this.mTitleMarginBottom;
                    if (i37 < i38 + i39) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i39) - i37));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - i18;
            }
            if (z16) {
                if (z15) {
                    i29 = this.mTitleMarginStart;
                } else {
                    i29 = 0;
                }
                int i411 = i29 - iArr[1];
                iMin -= Math.max(0, i411);
                iArr[1] = Math.max(0, -i411);
                if (zShouldLayout) {
                    g gVar11 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i30 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i30 = iMin;
                }
                if (zShouldLayout2) {
                    int i510 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i510, iMin, this.mSubtitleTextView.getMeasuredHeight() + i510);
                    i34 = iMin - this.mTitleMarginEnd;
                } else {
                    i34 = iMin;
                }
                if (z15) {
                    iMin = Math.min(i30, i34);
                }
                iMax = i24;
                i26 = 0;
            } else {
                if (z15) {
                    i25 = this.mTitleMarginStart;
                } else {
                    i25 = 0;
                }
                i26 = 0;
                int i511 = i25 - iArr[0];
                iMax = Math.max(0, i511) + i24;
                iArr[0] = Math.max(0, -i511);
                if (zShouldLayout) {
                    g gVar12 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i27 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i27 = iMax;
                }
                if (zShouldLayout2) {
                    int i512 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i512, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i512);
                    i28 = measuredWidth9 + this.mTitleMarginEnd;
                } else {
                    i28 = iMax;
                }
                if (z15) {
                    iMax = Math.max(i27, i28);
                }
            }
        }
        addCustomViewsWithGravity(this.mTempViews, 3);
        size = this.mTempViews.size();
        iLayoutChildLeft2 = iMax;
        i44 = i26;
        while (true) {
            arrayList = this.mTempViews;
            if (i44 < size) {
                break;
                break;
            } else {
                iLayoutChildLeft2 = layoutChildLeft(arrayList.get(i44), iLayoutChildLeft2, iArr, iMin2);
                i44++;
            }
        }
        addCustomViewsWithGravity(arrayList, 5);
        size2 = this.mTempViews.size();
        i45 = i26;
        while (true) {
            arrayList2 = this.mTempViews;
            if (i45 < size2) {
                break;
                break;
            } else {
                iMin = layoutChildRight(arrayList2.get(i45), iMin, iArr, iMin2);
                i45++;
            }
        }
        addCustomViewsWithGravity(arrayList2, 1);
        int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr);
        i46 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (viewListMeasuredWidth2 / 2);
        i47 = viewListMeasuredWidth2 + i46;
        if (i46 >= iLayoutChildLeft2) {
            if (i47 > iMin) {
                iLayoutChildLeft2 = i46 - (i47 - iMin);
            } else {
                iLayoutChildLeft2 = i46;
            }
        }
        size3 = this.mTempViews.size();
        while (true) {
            arrayList3 = this.mTempViews;
            if (i26 < size3) {
                arrayList3.clear();
                return;
            } else {
                iLayoutChildLeft2 = layoutChildLeft(arrayList3.get(i26), iLayoutChildLeft2, iArr, iMin2);
                i26++;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        char c14;
        char c15;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.mTempMargins;
        if (getLayoutDirection() == 1) {
            c15 = 1;
            c14 = 0;
        } else {
            c14 = 1;
            c15 = 0;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i14, 0, i15, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i14, 0, i15, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[c15] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i14, iMax3, i15, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[c14] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (shouldLayout(this.mExpandedActionView)) {
            iArr = iArr2;
            iMax4 += measureChildCollapseMargins(this.mExpandedActionView, i14, iMax4, i15, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (shouldLayout(this.mLogoView)) {
            iMax4 += measureChildCollapseMargins(this.mLogoView, i14, iMax4, i15, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((g) childAt.getLayoutParams()).f5017b == 0 && shouldLayout(childAt)) {
                iMax4 += measureChildCollapseMargins(childAt, i14, iMax4, i15, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i17 = iMax4;
        int i18 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i19 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i14, i17 + i19, i15, i18, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, measureChildCollapseMargins(this.mSubtitleTextView, i14, i17 + i19, i15, i18 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i17 + iMax2, getSuggestedMinimumWidth()), i14, (-16777216) & iCombineMeasuredStates2), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(iMax, measuredHeight), getSuggestedMinimumHeight()), i15, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.h hVar = actionMenuView != null ? actionMenuView.f4897a : null;
        int i14 = iVar.f5018a;
        if (i14 != 0 && this.mExpandedMenuPresenter != null && hVar != null && (menuItemFindItem = hVar.findItem(i14)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f5019b) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i14) {
        super.onRtlPropertiesChanged(i14);
        ensureContentInsets();
        n0 n0Var = this.mContentInsets;
        boolean z14 = i14 == 1;
        if (z14 == n0Var.f5187g) {
            return;
        }
        n0Var.f5187g = z14;
        if (!n0Var.f5188h) {
            n0Var.f5181a = n0Var.f5185e;
            n0Var.f5182b = n0Var.f5186f;
            return;
        }
        if (z14) {
            int i15 = n0Var.f5184d;
            if (i15 == Integer.MIN_VALUE) {
                i15 = n0Var.f5185e;
            }
            n0Var.f5181a = i15;
            int i16 = n0Var.f5183c;
            if (i16 == Integer.MIN_VALUE) {
                i16 = n0Var.f5186f;
            }
            n0Var.f5182b = i16;
            return;
        }
        int i17 = n0Var.f5183c;
        if (i17 == Integer.MIN_VALUE) {
            i17 = n0Var.f5185e;
        }
        n0Var.f5181a = i17;
        int i18 = n0Var.f5184d;
        if (i18 == Integer.MIN_VALUE) {
            i18 = n0Var.f5186f;
        }
        n0Var.f5182b = i18;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (jVar = fVar.f5015b) != null) {
            iVar.f5018a = jVar.f4773a;
        }
        iVar.f5019b = isOverflowMenuShowing();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f5017b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.o
    public void removeMenuProvider(androidx.core.view.s sVar) {
        this.mMenuHostHelper.c(sVar);
    }

    public void setBackInvokedCallbackEnabled(boolean z14) {
        if (this.mBackInvokedCallbackEnabled != z14) {
            this.mBackInvokedCallbackEnabled = z14;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setCollapsible(boolean z14) {
        this.mCollapsible = z14;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i14) {
        if (i14 < 0) {
            i14 = Integer.MIN_VALUE;
        }
        if (i14 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i14;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i14) {
        if (i14 < 0) {
            i14 = Integer.MIN_VALUE;
        }
        if (i14 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i14;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i14, int i15) {
        ensureContentInsets();
        n0 n0Var = this.mContentInsets;
        n0Var.f5188h = false;
        if (i14 != Integer.MIN_VALUE) {
            n0Var.f5185e = i14;
            n0Var.f5181a = i14;
        }
        if (i15 != Integer.MIN_VALUE) {
            n0Var.f5186f = i15;
            n0Var.f5182b = i15;
        }
    }

    public void setContentInsetsRelative(int i14, int i15) {
        ensureContentInsets();
        this.mContentInsets.a(i14, i15);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(androidx.appcompat.view.menu.h hVar, androidx.appcompat.widget.c cVar) {
        if (hVar == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.h hVar2 = this.mMenuView.f4897a;
        if (hVar2 == hVar) {
            return;
        }
        if (hVar2 != null) {
            hVar2.removeMenuPresenter(this.mOuterActionMenuPresenter);
            hVar2.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        cVar.f5046r = true;
        Context context = this.mPopupContext;
        if (hVar != null) {
            hVar.addMenuPresenter(cVar, context);
            hVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            cVar.initForMenu(context, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            cVar.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(cVar);
        this.mOuterActionMenuPresenter = cVar;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.n.a aVar, androidx.appcompat.view.menu.h.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.f4902f = aVar;
            actionMenuView.f4903g = aVar2;
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            a1.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i14) {
        if (this.mPopupTheme != i14) {
            this.mPopupTheme = i14;
            if (i14 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i14);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mSubtitleTextView;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i14 = this.mSubtitleTextAppearance;
                if (i14 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i14);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else if (textView != null && isChildOrHidden(textView)) {
            removeView(this.mSubtitleTextView);
            this.mHiddenViews.remove(this.mSubtitleTextView);
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i14) {
        this.mSubtitleTextAppearance = i14;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i14);
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleTextView;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i14 = this.mTitleTextAppearance;
                if (i14 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i14);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else if (textView != null && isChildOrHidden(textView)) {
            removeView(this.mTitleTextView);
            this.mHiddenViews.remove(this.mTitleTextView);
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int i14, int i15, int i16, int i17) {
        this.mTitleMarginStart = i14;
        this.mTitleMarginTop = i15;
        this.mTitleMarginEnd = i16;
        this.mTitleMarginBottom = i17;
        requestLayout();
    }

    public void setTitleMarginBottom(int i14) {
        this.mTitleMarginBottom = i14;
        requestLayout();
    }

    public void setTitleMarginEnd(int i14) {
        this.mTitleMarginEnd = i14;
        requestLayout();
    }

    public void setTitleMarginStart(int i14) {
        this.mTitleMarginStart = i14;
        requestLayout();
    }

    public void setTitleMarginTop(int i14) {
        this.mTitleMarginTop = i14;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i14) {
        this.mTitleTextAppearance = i14;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i14);
        }
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean showOverflowMenu() {
        androidx.appcompat.widget.c cVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (cVar = actionMenuView.f4901e) == null || !cVar.g()) ? false : true;
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z14 = hasExpandedActionView() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z14 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new x0(this, 0));
                }
                e.c(onBackInvokedDispatcherA, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherA;
                return;
            }
            if (z14 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public static class i extends s7.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5019b;

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5018a = parcel.readInt();
            this.f5019b = parcel.readInt() != 0;
        }

        @Override // s7.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f5018a);
            parcel.writeInt(this.f5019b ? 1 : 0);
        }

        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new i[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel) {
            this(parcel, null);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setSubtitleTextColor(int i14) {
        setSubtitleTextColor(ColorStateList.valueOf(i14));
    }

    public void setTitleTextColor(int i14) {
        setTitleTextColor(ColorStateList.valueOf(i14));
    }

    @Override // androidx.core.view.o
    public void addMenuProvider(androidx.core.view.s sVar, androidx.lifecycle.n0 n0Var) {
        this.mMenuHostHelper.a(sVar, n0Var);
    }

    @Override // androidx.core.view.o
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(androidx.core.view.s sVar, androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.b bVar) {
        this.mMenuHostHelper.b(sVar, n0Var, bVar);
    }

    public void setCollapseContentDescription(int i14) {
        setCollapseContentDescription(i14 != 0 ? getContext().getText(i14) : null);
    }

    public void setLogoDescription(int i14) {
        setLogoDescription(getContext().getText(i14));
    }

    public void setCollapseIcon(int i14) {
        setCollapseIcon(j.a.a(getContext(), i14));
    }

    public static class g extends i.a.C1716a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5017b;

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5017b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i14, int i15) {
            super(i14, i15);
            this.f5017b = 0;
            this.f86545a = 8388627;
        }

        public g(int i14, int i15, int i16) {
            super(i14, i15);
            this.f5017b = 0;
            this.f86545a = i16;
        }

        public g(int i14) {
            this(-2, -1, i14);
        }

        public g(g gVar) {
            super((i.a.C1716a) gVar);
            this.f5017b = 0;
            this.f5017b = gVar.f5017b;
        }

        public g(i.a.C1716a c1716a) {
            super(c1716a);
            this.f5017b = 0;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5017b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5017b = 0;
        }
    }

    public void setNavigationContentDescription(int i14) {
        setNavigationContentDescription(i14 != 0 ? getContext().getText(i14) : null);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setLogo(int i14) {
        setLogo(j.a.a(getContext(), i14));
    }

    public void setNavigationIcon(int i14) {
        setNavigationIcon(j.a.a(getContext(), i14));
    }

    public void setSubtitle(int i14) {
        setSubtitle(getContext().getText(i14));
    }

    public void setTitle(int i14) {
        setTitle(getContext().getText(i14));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
