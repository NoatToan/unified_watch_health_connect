package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.g5j;
import defpackage.mgi;
import defpackage.qd0;
import defpackage.sii;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.internal.app.widget.actionbar.CollapseTitle;
import miuix.appcompat.internal.app.widget.actionbar.ExpandTitle;
import miuix.appcompat.internal.view.menu.action.ActionMenuPresenter;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends ViewGroup {
    protected static final int COLLAPSE_LAYOUT_MAX_TRANSY = 20;
    static final int INNER_STATE_COLLAPSE = 0;
    static final int INNER_STATE_EXPAND = 1;
    static final int INNER_STATE_RESIZING = 2;
    protected static final int MAX_ACTION_MENU_ITEM_COUNT_UNSET = Integer.MIN_VALUE;
    List<qd0> mActionBarTransitionListeners;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected TransitionListener mAnimConfigListener;
    int mBottomMenuMode;
    protected AnimConfig mCollapseAnimHideConfig;
    protected AnimConfig mCollapseAnimShowConfig;
    protected boolean mCollapseTitleColorTransitEnable;
    protected boolean mEndActionMenuEnable;
    int mExpandState;
    int mExpandStateBeforeResizing;
    int mExpandStateOnLayout;
    protected boolean mExpandTitleColorTransitEnable;
    protected AnimConfig mHideProcessConfig;
    protected boolean mHyperActionMenuEnable;
    int mInnerExpandState;
    protected boolean mIsInWideMode;
    float mLastProcess;
    protected int mMaxActionMenuItemCount;
    protected ActionMenuView mMenuView;
    protected AnimConfig mMovableAnimNormalConfig;
    protected AnimConfig mMovableAnimShowConfig;
    protected Rect mPendingInset;
    private boolean mResizable;
    protected AnimConfig mShowProcessConfig;
    protected boolean mSplitActionBarEnable;
    protected ActionBarContainer mSplitView;
    protected boolean mSplitWhenNarrow;
    protected int mSubtitlePaddingV;
    protected boolean mTitleClickable;
    protected int mTitleMaxHeight;
    protected int mTitleMinHeight;
    protected int mTitlePaddingV;
    protected int mUserExpandState;
    protected boolean mUserSetExpandState;
    protected View.OnClickListener mUserSubTitleClickListener;

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.a$a, reason: collision with other inner class name */
    public class C1026a extends TransitionListener {
        public C1026a() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
            List<qd0> list = a.this.mActionBarTransitionListeners;
            if (list != null) {
                Iterator<qd0> it = list.iterator();
                while (it.hasNext()) {
                    it.next().c(obj);
                }
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            List<qd0> list = a.this.mActionBarTransitionListeners;
            if (list != null) {
                Iterator<qd0> it = list.iterator();
                while (it.hasNext()) {
                    it.next().d(obj);
                }
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            List<qd0> list = a.this.mActionBarTransitionListeners;
            if (list != null) {
                Iterator<qd0> it = list.iterator();
                while (it.hasNext()) {
                    it.next().e(obj, collection);
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<View> f26469a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26470b = true;
        public float c;
        public boolean d;

        /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.a$b$a, reason: collision with other inner class name */
        public class ViewOnAttachStateChangeListenerC1027a implements View.OnAttachStateChangeListener {
            public ViewOnAttachStateChangeListenerC1027a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Folme.clean(view);
            }
        }

        public void a(float f, int i, int i2, AnimConfig animConfig) {
            if (this.d) {
                return;
            }
            if (!this.f26470b) {
                f = this.c;
            }
            AnimState animStateAdd = new AnimState("to").add(ViewProperty.ALPHA, f).add(ViewProperty.TRANSLATION_X, i).add(ViewProperty.TRANSLATION_Y, i2);
            for (View view : this.f26469a) {
                if (view.isAttachedToWindow() && (view.getAlpha() != f || view.getTranslationX() != i || view.getTranslationY() != i2)) {
                    Folme.useAt(view).state().to(animStateAdd, animConfig);
                }
            }
        }

        public void b(View view) {
            if (this.f26469a.contains(view)) {
                return;
            }
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1027a());
            this.f26469a.add(view);
        }

        public void c(View view) {
            if (view == null || !this.f26469a.contains(view)) {
                return;
            }
            this.f26469a.remove(view);
        }

        public void d() {
            this.d = false;
        }

        public void e() {
            this.d = true;
            Iterator<View> it = this.f26469a.iterator();
            while (it.hasNext()) {
                Folme.clean(it.next());
            }
        }

        public void f() {
            for (View view : this.f26469a) {
                view.clearFocus();
                view.setEnabled(false);
                view.setVisibility(4);
            }
        }

        public void g() {
            Iterator<View> it = this.f26469a.iterator();
            while (it.hasNext()) {
                it.next().setEnabled(true);
            }
        }

        public void h(boolean z) {
            this.f26470b = z;
        }

        public void i(float f) {
            if (this.d) {
                return;
            }
            this.c = f;
            Iterator<View> it = this.f26469a.iterator();
            while (it.hasNext()) {
                Folme.useAt(it.next()).state().setTo(ViewProperty.ALPHA, Float.valueOf(f));
            }
        }

        public void j(float f, int i, int i2) {
            k(f, i, i2, false);
        }

        public void k(float f, int i, int i2, boolean z) {
            if (this.d) {
                return;
            }
            AnimState animStateAdd = new AnimState("from").add(ViewProperty.ALPHA, this.f26470b ? f : this.c).add(ViewProperty.TRANSLATION_X, i).add(ViewProperty.TRANSLATION_Y, i2);
            for (View view : this.f26469a) {
                if (z) {
                    view.setAlpha(f);
                    view.setTranslationX(i);
                    view.setTranslationY(i2);
                }
                if (view.isAttachedToWindow()) {
                    Folme.useAt(view).state().setTo(animStateAdd);
                }
            }
        }

        public void l(int i) {
            for (View view : this.f26469a) {
                view.setVisibility(i);
                if (i != 0) {
                    view.clearFocus();
                }
            }
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private void setTitleMaxHeight(int i) {
        this.mTitleMaxHeight = i;
        requestLayout();
    }

    private void setTitleMinHeight(int i) {
        this.mTitleMinHeight = i;
        requestLayout();
    }

    public void animateToVisibility(int i) {
        ActionMenuView actionMenuView;
        clearAnimation();
        if (i != getVisibility()) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), i == 0 ? mgi.f26157a : mgi.f26158b);
            startAnimation(animationLoadAnimation);
            setVisibility(i);
            if (this.mSplitView == null || (actionMenuView = this.mMenuView) == null) {
                return;
            }
            actionMenuView.startAnimation(animationLoadAnimation);
            this.mMenuView.setVisibility(i);
        }
    }

    public void bindActionBarTransitionListeners(List<qd0> list) {
        this.mActionBarTransitionListeners = list;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.O(false);
        }
    }

    public int getActionBarStyle() {
        return R.attr.actionBarStyle;
    }

    public ActionMenuView getActionMenuView() {
        return this.mMenuView;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public abstract CollapseTitle getCollapseTitle();

    public int getExpandState() {
        return this.mExpandState;
    }

    public abstract ExpandTitle getExpandTitle();

    public ActionMenuView getMenuView() {
        return this.mMenuView;
    }

    public abstract View getSubTitleView(int i);

    public abstract View getTitleView(int i);

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.U(false);
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.X();
    }

    public boolean isOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.Y();
    }

    public boolean isResizable() {
        return this.mResizable;
    }

    public boolean isUserSetExpandState() {
        return this.mUserSetExpandState;
    }

    public int measureChildView(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public void onAnimatedExpandStateChanged(int i, int i2) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mSplitWhenNarrow) {
            setSplitActionBar(getContext().getResources().getBoolean(sii.c));
        }
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a0(configuration);
        }
    }

    public void onExpandStateChanged(int i, int i2) {
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3, int[] iArr2) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return false;
    }

    public void onStopNestedScroll(View view, int i) {
    }

    public int positionChild(View view, int i, int i2, int i3) {
        return positionChild(view, i, i2, i3, true);
    }

    public int positionChildInverse(View view, int i, int i2, int i3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = (this.mTitleMinHeight - measuredHeight) / 2;
        dyq.h(this, view, i - measuredWidth, i4, i, i4 + measuredHeight);
        return measuredWidth;
    }

    public int positionChildWithOffset(View view, int i, int i2, int i3, boolean z, int i4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i2 + ((i3 - measuredHeight) / 2);
        if (!z) {
            i5 = (this.mTitleMinHeight - measuredHeight) / 2;
        }
        int i6 = i5;
        dyq.h(this, view, i + i4, i6, i + measuredWidth + i4, i6 + measuredHeight);
        return measuredWidth + i4;
    }

    public void postShowOverflowMenu() {
        post(new Runnable() { // from class: sz
            @Override // java.lang.Runnable
            public final void run() {
                this.f34111a.showOverflowMenu();
            }
        });
    }

    public abstract void refreshBottomMenu();

    public void setActionMenuItemLimit(int i) {
        this.mMaxActionMenuItemCount = i;
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter == null || (actionMenuPresenter instanceof miuix.appcompat.internal.view.menu.action.a)) {
            return;
        }
        actionMenuPresenter.f0(i);
    }

    public void setBottomMenuMode(int i) {
        this.mBottomMenuMode = i;
    }

    public void setExpandState(int i) {
        setExpandState(i, false, false);
    }

    public void setExpandStateByUser(int i) {
        if (i != -1) {
            this.mUserSetExpandState = true;
            this.mUserExpandState = i;
        } else {
            this.mUserSetExpandState = false;
            this.mUserExpandState = -1;
        }
    }

    public void setPendingInset(Rect rect) {
        Rect rect2;
        if (rect == null) {
            return;
        }
        boolean z = this.mMenuView != null && ((rect2 = this.mPendingInset) == null || rect2.bottom != rect.bottom);
        if (this.mPendingInset == null) {
            this.mPendingInset = new Rect();
        }
        this.mPendingInset.set(rect);
        if (z) {
            refreshBottomMenu();
        }
    }

    public void setResizable(boolean z) {
        this.mResizable = z;
    }

    public void setSplitActionBar(boolean z) {
        this.mSplitActionBarEnable = z;
    }

    public void setSplitView(ActionBarContainer actionBarContainer) {
        this.mSplitView = actionBarContainer;
    }

    public void setSplitWhenNarrow(boolean z) {
        this.mSplitWhenNarrow = z;
    }

    public void setSubTitleClickListener(View.OnClickListener onClickListener) {
        this.mUserSubTitleClickListener = onClickListener;
    }

    public void setTitleClickable(boolean z) {
        this.mTitleClickable = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.j0();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int positionChild(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (!z) {
            i4 = (this.mTitleMinHeight - measuredHeight) / 2;
        }
        int i5 = i4;
        dyq.h(this, view, i, i5, i + measuredWidth, i5 + measuredHeight);
        return measuredWidth;
    }

    public void setExpandState(int i, boolean z, boolean z2) {
        int i2;
        if ((this.mResizable || z2) && (i2 = this.mInnerExpandState) != i) {
            if (z) {
                onAnimatedExpandStateChanged(i2, i);
                return;
            }
            if (i == 2) {
                this.mExpandStateBeforeResizing = this.mExpandState;
            }
            this.mInnerExpandState = i;
            if (i == 0) {
                this.mExpandState = 0;
            } else if (i == 1) {
                this.mExpandState = 1;
            }
            onExpandStateChanged(i2, i);
            this.mExpandStateOnLayout = this.mExpandState;
            requestLayout();
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInnerExpandState = 1;
        this.mExpandStateBeforeResizing = 1;
        this.mExpandState = 1;
        this.mExpandStateOnLayout = 1;
        this.mResizable = true;
        this.mTitleClickable = false;
        this.mLastProcess = 0.0f;
        this.mBottomMenuMode = 2;
        this.mMaxActionMenuItemCount = Integer.MIN_VALUE;
        this.mIsInWideMode = false;
        this.mAnimConfigListener = new C1026a();
        this.mUserSubTitleClickListener = null;
        this.mUserSetExpandState = false;
        this.mUserExpandState = -1;
        this.mTitlePaddingV = context.getResources().getDimensionPixelSize(dmi.n);
        this.mSubtitlePaddingV = context.getResources().getDimensionPixelSize(dmi.h);
        this.mCollapseAnimShowConfig = new AnimConfig().setEase(-2, 1.0f, 0.3f);
        this.mShowProcessConfig = new AnimConfig().setEase(-2, 1.0f, 0.3f).addListeners(this.mAnimConfigListener);
        this.mCollapseAnimHideConfig = new AnimConfig().setEase(-2, 1.0f, 0.15f);
        this.mHideProcessConfig = new AnimConfig().setEase(-2, 1.0f, 0.15f).addListeners(this.mAnimConfigListener);
        this.mMovableAnimShowConfig = new AnimConfig().setEase(-2, 1.0f, 0.6f);
        this.mMovableAnimNormalConfig = new AnimConfig().setEase(-2, 1.0f, 0.6f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.f18626a, R.attr.actionBarStyle, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(g5j.v, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(g5j.x, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(g5j.B, false);
        typedArrayObtainStyledAttributes.recycle();
        if (isUserSetExpandState()) {
            int i3 = this.mUserExpandState;
            this.mInnerExpandState = i3;
            this.mExpandState = i3;
        } else if (i2 == 0) {
            this.mInnerExpandState = 0;
            this.mExpandState = 0;
        } else {
            this.mInnerExpandState = 1;
            this.mExpandState = 1;
        }
        this.mResizable = z;
        this.mTitleClickable = z2;
    }
}
