package miuix.appcompat.internal.app.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import defpackage.al8;
import defpackage.awi;
import defpackage.bie;
import defpackage.cd0;
import defpackage.dil;
import defpackage.eil;
import defpackage.hm1;
import defpackage.le0;
import defpackage.md0;
import defpackage.me0;
import defpackage.n5g;
import defpackage.od0;
import defpackage.osc;
import defpackage.qd0;
import defpackage.s6g;
import defpackage.t8p;
import defpackage.tc8;
import defpackage.vsi;
import defpackage.wc0;
import defpackage.woc;
import defpackage.x08;
import defpackage.yc0;
import defpackage.yig;
import defpackage.zhi;
import defpackage.zig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.app.AppCompatActivity;
import miuix.appcompat.app.strategy.CommonActionBarStrategy;
import miuix.appcompat.internal.app.widget.actionbar.CollapseTitle;
import miuix.appcompat.internal.app.widget.actionbar.ExpandTitle;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.PhoneActionMenuView;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarImpl extends wc0 {
    private static final int CONTEXT_DISPLAY_NORMAL = 0;
    private static final int CONTEXT_DISPLAY_SPLIT = 1;
    private static final int INVALID_POSITION = -1;
    public static final boolean IS_COMPLY_WITH_THEME = true;
    private static final int MAX_ACTION_MENU_ITEM_COUNT_UNSET = -1;
    private woc mActionBarStrategy;
    ActionMode mActionMode;
    private me0 mActionModeView;
    private ActionBarView mActionView;
    private IStateStyle mContainerAnim;
    private ActionBarContainer mContainerView;
    private Rect mContentInset;
    private View mContentMask;
    private View.OnClickListener mContentMaskOnClickListener;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private int mCurrentAccessibilityImportant;
    private int mCurrentExpandState;
    private boolean mCurrentResizable;
    private boolean mDisplayHomeAsUpSet;
    private ScrollingTabContainerView mExpandTabScrollView;
    private al8 mExtraPaddingPolicy;
    private FragmentManager mFragmentManager;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    private boolean mIsWindowInfoChanged;
    private ActionBarOverlayLayout mOverlayLayout;
    private SearchActionModeView mSearchActionModeView;
    private SecondaryTabContainerView mSecondaryExpandTabScrollView;
    private SecondaryTabContainerView mSecondaryTabScrollView;
    private h mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    private boolean mShowingForMode;
    private PhoneActionMenuView mSplitMenuView;
    private ActionBarContainer mSplitView;
    private IStateStyle mSpliterAnim;
    private ScrollingTabContainerView mTabScrollView;
    private Context mThemedContext;
    private miuix.appcompat.internal.app.widget.b mViewPagerController;
    private int mWindowMode;
    private static ActionBar.d sTabListenerWrapper = new a();
    private static final Integer UNINITIALIZED_OFFSET = -1;
    private final HashMap<View, Integer> mCoordinateOffsetViewSet = new HashMap<>();
    private final HashSet<yig> mNestedContentInsetObserverSet = new HashSet<>();
    private ArrayList<h> mTabs = new ArrayList<>();
    private boolean isSelectingTab = false;
    private int mSavedTabPosition = -1;
    private ArrayList<ActionBar.a> mMenuVisibilityListeners = new ArrayList<>();
    private int mCurWindowVisibility = 0;
    private boolean mNowShowing = true;
    private le0.a mActionModeCallback = new b();
    private boolean mIsContainerAnimationRunning = false;
    private int mMaxActionMenuItemCount = -1;
    private int mContentInsetTop = 0;
    private int mCurrentActionBarHeightGap = 0;
    private int mActionBarHeightTotalGap = 0;
    private int mCurrentActionBarHeightGapOnShow = 0;
    private int mActionBarHeightTotalGapOnShow = 0;
    private float mTargetTranslationY = 0.0f;
    private final TransitionListener mContainerViewAnimationListener = new g();

    public class a implements ActionBar.d {
        @Override // androidx.appcompat.app.ActionBar.d
        public void a(ActionBar.c cVar, k kVar) {
            h hVar = (h) cVar;
            if (hVar.f26399b != null) {
                hVar.f26399b.a(cVar, kVar);
            }
            if (hVar.f26398a != null) {
                hVar.f26398a.a(cVar, kVar);
            }
        }

        @Override // androidx.appcompat.app.ActionBar.d
        public void b(ActionBar.c cVar, k kVar) {
            h hVar = (h) cVar;
            if (hVar.f26399b != null) {
                hVar.f26399b.b(cVar, kVar);
            }
            if (hVar.f26398a != null) {
                hVar.f26398a.b(cVar, kVar);
            }
        }

        @Override // androidx.appcompat.app.ActionBar.d
        public void c(ActionBar.c cVar, k kVar) {
            h hVar = (h) cVar;
            if (hVar.f26399b != null) {
                hVar.f26399b.c(cVar, kVar);
            }
            if (hVar.f26398a != null) {
                hVar.f26398a.c(cVar, kVar);
            }
        }
    }

    public class b implements le0.a {
        public b() {
        }

        @Override // le0.a
        public void a(ActionMode actionMode) {
            ActionBarImpl.this.animateToMode(false);
            ActionBarImpl.this.mActionMode = null;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ActionBarImpl.this.mSplitMenuView == null || !ActionBarImpl.this.mSplitMenuView.z()) {
                return;
            }
            ActionBarImpl.this.mSplitMenuView.getPresenter().U(true);
        }
    }

    public class d implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26392a = 0;

        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int measuredWidth = ActionBarImpl.this.mOverlayLayout.getMeasuredWidth();
            if (this.f26392a == measuredWidth && !ActionBarImpl.this.mIsWindowInfoChanged) {
                return true;
            }
            ActionBarImpl.this.mIsWindowInfoChanged = false;
            this.f26392a = measuredWidth;
            ActionBarImpl actionBarImpl = ActionBarImpl.this;
            actionBarImpl.applyActionBarStrategy(actionBarImpl.mActionView, ActionBarImpl.this.mContextView);
            ActionBarImpl.this.mOverlayLayout.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    public class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26394a = 0;

        public e() {
        }

        public final /* synthetic */ void b() {
            ActionBarImpl actionBarImpl = ActionBarImpl.this;
            actionBarImpl.applyActionBarStrategy(actionBarImpl.mActionView, ActionBarImpl.this.mContextView);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            if (this.f26394a != i9 || ActionBarImpl.this.mIsWindowInfoChanged) {
                ActionBarImpl.this.mIsWindowInfoChanged = false;
                this.f26394a = i9;
                ActionBarImpl.this.mActionView.post(new Runnable() { // from class: id0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21011a.b();
                    }
                });
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionMode actionMode = ActionBarImpl.this.mActionMode;
            if (actionMode != null) {
                actionMode.finish();
            }
        }
    }

    public class g extends TransitionListener {
        public g() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            ActionBarImpl.this.mIsContainerAnimationRunning = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            ActionBarImpl.this.mIsContainerAnimationRunning = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            float translationY = (ActionBarImpl.this.mTargetTranslationY - ActionBarImpl.this.mContainerView.getTranslationY()) / ActionBarImpl.this.mTargetTranslationY;
            ActionBarImpl actionBarImpl = ActionBarImpl.this;
            actionBarImpl.mActionBarHeightTotalGap = (int) Math.max(0.0f, actionBarImpl.mActionBarHeightTotalGapOnShow * translationY);
            ActionBarImpl actionBarImpl2 = ActionBarImpl.this;
            actionBarImpl2.mCurrentActionBarHeightGap = (int) Math.max(0.0f, actionBarImpl2.mCurrentActionBarHeightGapOnShow * translationY);
            ActionBarImpl.this.mOverlayLayout.X();
            ActionBarImpl.this.updateCoordinateOffsetView();
        }
    }

    public class h extends ActionBar.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActionBar.d f26398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ActionBar.d f26399b;
        public Drawable c;
        public CharSequence d;
        public CharSequence e;
        public View g;
        public int f = -1;
        public boolean h = true;

        public h() {
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public CharSequence a() {
            return this.e;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public View b() {
            return this.g;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public Drawable c() {
            return this.c;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public int d() {
            return this.f;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public CharSequence e() {
            return this.d;
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public void f() {
            ActionBarImpl.this.selectTab(this, false);
        }

        @Override // androidx.appcompat.app.ActionBar.c
        public ActionBar.c g(CharSequence charSequence) {
            this.d = charSequence;
            if (this.f >= 0) {
                ActionBarImpl.this.mTabScrollView.q(this.f);
                ActionBarImpl.this.mExpandTabScrollView.q(this.f);
                ActionBarImpl.this.mSecondaryTabScrollView.B(this.f);
                ActionBarImpl.this.mSecondaryTabScrollView.B(this.f);
            }
            return this;
        }

        public ActionBar.d j() {
            return ActionBarImpl.sTabListenerWrapper;
        }

        public ActionBar.c k(ActionBar.d dVar) {
            this.f26399b = dVar;
            return this;
        }

        public void l(int i) {
            this.f = i;
        }
    }

    public static class i extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<View> f26400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<ActionBarImpl> f26401b;

        public i(View view, ActionBarImpl actionBarImpl) {
            this.f26400a = new WeakReference<>(view);
            this.f26401b = new WeakReference<>(actionBarImpl);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            ActionBarImpl actionBarImpl = this.f26401b.get();
            View view = this.f26400a.get();
            if (view == null || actionBarImpl == null || actionBarImpl.mNowShowing) {
                return;
            }
            view.setVisibility(8);
            if (view.getId() == vsi.d) {
                view.setTranslationY(-view.getHeight());
            }
        }
    }

    public static class j extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<View> f26402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<ActionBarImpl> f26403b;

        public j(View view, ActionBarImpl actionBarImpl) {
            this.f26402a = new WeakReference<>(view);
            this.f26403b = new WeakReference<>(actionBarImpl);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            ActionBarImpl actionBarImpl = this.f26403b.get();
            View view = this.f26402a.get();
            if (view == null || actionBarImpl == null || !actionBarImpl.mNowShowing || view.getId() != vsi.d) {
                return;
            }
            view.setTranslationY(0.0f);
        }
    }

    public ActionBarImpl(AppCompatActivity appCompatActivity, ViewGroup viewGroup) {
        this.mContext = appCompatActivity;
        this.mFragmentManager = appCompatActivity.getSupportFragmentManager();
        init(viewGroup);
        this.mActionView.setWindowTitle(appCompatActivity.getTitle());
    }

    private void addContentMask() {
        ViewStub viewStub = (ViewStub) this.mOverlayLayout.findViewById(vsi.C);
        this.mOverlayLayout.setContentMask(viewStub != null ? viewStub.inflate() : this.mOverlayLayout.findViewById(vsi.B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyActionBarStrategy(ActionBarView actionBarView, ActionBarContextView actionBarContextView) {
        if (this.mActionBarStrategy == null) {
            return;
        }
        int expandState = getExpandState();
        yc0 yc0VarConfig = this.mActionBarStrategy.config(this, getActionBarSpec(this.mContainerView, this.mActionView));
        if (actionBarView != null && yc0VarConfig != null) {
            if (!actionBarView.isUserSetExpandState() || yc0VarConfig.f40029a) {
                if (!actionBarView.isResizable() || !yc0VarConfig.c) {
                    actionBarView.setExpandState(yc0VarConfig.f40030b, false, true);
                }
                actionBarView.setResizable(yc0VarConfig.c);
            }
            if (!actionBarView.isUserSetEndActionMenuItemLimit() || yc0VarConfig.d) {
                actionBarView.setEndActionMenuItemLimit(yc0VarConfig.e);
            }
        }
        if (actionBarContextView != null && yc0VarConfig != null && (!actionBarContextView.isUserSetExpandState() || yc0VarConfig.f40029a)) {
            if (!actionBarContextView.isResizable() || !yc0VarConfig.c) {
                actionBarContextView.setExpandState(yc0VarConfig.f40030b, false, true);
            }
            actionBarContextView.setResizable(yc0VarConfig.c);
        }
        this.mCurrentExpandState = getExpandState();
        this.mCurrentResizable = isResizable();
        int i2 = this.mCurrentExpandState;
        if (i2 != 1 || expandState == i2 || this.mContentInset == null) {
            return;
        }
        Iterator<View> it = this.mCoordinateOffsetViewSet.keySet().iterator();
        while (it.hasNext()) {
            this.mCoordinateOffsetViewSet.put(it.next(), Integer.valueOf(this.mContentInset.top));
        }
        Iterator<yig> it2 = this.mNestedContentInsetObserverSet.iterator();
        while (it2.hasNext()) {
            it2.next().onContentInsetChanged(this.mContentInset);
        }
        ActionBarContainer actionBarContainer = this.mContainerView;
        if (actionBarContainer != null) {
            actionBarContainer.setActionBarBlurByNestedScrolled(false);
        }
    }

    private static boolean checkShowingFlags(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void cleanupTabs() {
        if (this.mSelectedTab != null) {
            selectTab(null);
        }
        this.mTabs.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.mTabScrollView;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.h();
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.mExpandTabScrollView;
        if (scrollingTabContainerView2 != null) {
            scrollingTabContainerView2.h();
        }
        SecondaryTabContainerView secondaryTabContainerView = this.mSecondaryTabScrollView;
        if (secondaryTabContainerView != null) {
            secondaryTabContainerView.t();
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.mSecondaryExpandTabScrollView;
        if (secondaryTabContainerView2 != null) {
            secondaryTabContainerView2.t();
        }
        this.mSavedTabPosition = -1;
    }

    private void configureTab(ActionBar.c cVar, int i2) {
        h hVar = (h) cVar;
        if (hVar.j() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        hVar.l(i2);
        this.mTabs.add(i2, hVar);
        int size = this.mTabs.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            } else {
                this.mTabs.get(i2).l(i2);
            }
        }
    }

    private ActionMode createActionMode(ActionMode.Callback callback) {
        return callback instanceof dil.b ? new eil(this.mContext, callback) : new x08(this.mContext, callback);
    }

    private void createContextView(boolean z, boolean z2) {
        ViewStub viewStub = (ViewStub) this.mOverlayLayout.findViewById(vsi.h0);
        ActionBarContainer actionBarContainer = viewStub != null ? (ActionBarContainer) viewStub.inflate() : (ActionBarContainer) this.mOverlayLayout.findViewById(vsi.g0);
        if (actionBarContainer != null) {
            this.mActionView.setSplitView(actionBarContainer);
            this.mActionView.setSplitActionBar(z);
            this.mActionView.setSplitWhenNarrow(z2);
            ViewStub viewStub2 = (ViewStub) this.mOverlayLayout.findViewById(vsi.p);
            if (viewStub2 != null) {
                this.mContextView = (ActionBarContextView) viewStub2.inflate();
            } else {
                this.mContextView = (ActionBarContextView) this.mOverlayLayout.findViewById(vsi.o);
            }
            ActionBarContextView actionBarContextView = this.mContextView;
            if (actionBarContextView != null) {
                this.mContainerView.setActionBarContextView(actionBarContextView);
                this.mOverlayLayout.setActionBarContextView(this.mContextView);
                this.mContextView.setSplitView(actionBarContainer);
                this.mContextView.setSplitActionBar(z);
                this.mContextView.setSplitWhenNarrow(z2);
            }
        }
    }

    private void doHide(boolean z) {
        doHide(z, true, null);
    }

    private void doShow(boolean z) {
        doShow(z, true, null);
    }

    private void doUpdateTopOffsetForCoordinateView(View view, int i2) {
        int top = view.getTop();
        int i3 = this.mCurrentActionBarHeightGap;
        if (top != i3 + i2) {
            view.offsetTopAndBottom((Math.max(0, i3) + i2) - top);
        }
    }

    private void ensureTabsExist() {
        if (this.mTabScrollView != null) {
            this.mActionView.checkTabsAdded();
            return;
        }
        CollapseTabContainer collapseTabContainer = new CollapseTabContainer(this.mContext);
        ExpandTabContainer expandTabContainer = new ExpandTabContainer(this.mContext);
        SecondaryCollapseTabContainer secondaryCollapseTabContainer = new SecondaryCollapseTabContainer(this.mContext);
        SecondaryExpandTabContainer secondaryExpandTabContainer = new SecondaryExpandTabContainer(this.mContext);
        collapseTabContainer.setVisibility(0);
        expandTabContainer.setVisibility(0);
        secondaryCollapseTabContainer.setVisibility(0);
        secondaryExpandTabContainer.setVisibility(0);
        this.mActionView.setEmbeddedTabView(collapseTabContainer, expandTabContainer, secondaryCollapseTabContainer, secondaryExpandTabContainer);
        collapseTabContainer.setEmbeded(true);
        this.mTabScrollView = collapseTabContainer;
        this.mExpandTabScrollView = expandTabContainer;
        this.mSecondaryTabScrollView = secondaryCollapseTabContainer;
        this.mSecondaryExpandTabScrollView = secondaryExpandTabContainer;
    }

    public static ActionBarImpl getActionBar(View view) {
        while (view != null) {
            if (view instanceof ActionBarOverlayLayout) {
                return (ActionBarImpl) ((ActionBarOverlayLayout) view).getActionBar();
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return null;
    }

    private od0 getActionBarSpec(ActionBarContainer actionBarContainer, ActionBarView actionBarView) {
        od0 od0Var = new od0();
        od0Var.f29022a = this.mOverlayLayout.getDeviceType();
        od0Var.f29023b = this.mWindowMode;
        if (actionBarContainer != null && actionBarView != null) {
            float f2 = actionBarView.getContext().getResources().getDisplayMetrics().density;
            Point pointL = tc8.l(actionBarView.getContext());
            int i2 = pointL.x;
            od0Var.c = i2;
            od0Var.e = pointL.y;
            od0Var.d = s6g.t(f2, i2);
            od0Var.f = s6g.t(f2, od0Var.e);
            int measuredWidth = actionBarContainer.getMeasuredWidth();
            od0Var.g = measuredWidth;
            if (measuredWidth == 0) {
                od0Var.g = this.mOverlayLayout.getMeasuredWidth();
            }
            od0Var.i = s6g.t(f2, od0Var.g);
            int measuredHeight = actionBarView.getMeasuredHeight();
            od0Var.h = measuredHeight;
            od0Var.j = s6g.t(f2, measuredHeight);
            od0Var.f29024k = actionBarView.isUserSetExpandState();
            od0Var.l = actionBarView.getExpandState();
            od0Var.m = actionBarView.isResizable();
            od0Var.n = actionBarView.isUserSetEndActionMenuItemLimit();
            od0Var.o = actionBarView.getEndActionMenuItemLimit();
        }
        Context context = this.mContext;
        if (context instanceof AppCompatActivity) {
            od0Var.p = ((AppCompatActivity) context).isInFloatingWindowMode();
        }
        return od0Var;
    }

    private int getBlurOptions() {
        return ((getDisplayOptions() & 32768) != 0 ? 32768 : 0) | ((getDisplayOptions() & 16384) != 0 ? 16384 : 0);
    }

    private Integer getCoordinateOffsetViewTopOffsetOrDefault(View view) {
        Integer num = this.mCoordinateOffsetViewSet.get(view);
        return Integer.valueOf(Objects.equals(num, UNINITIALIZED_OFFSET) ? 0 : num.intValue());
    }

    private int getSplitHeight() {
        View childAt;
        int height = this.mSplitView.getHeight();
        if (this.mSplitView.getChildCount() != 1 || (childAt = this.mSplitView.getChildAt(0)) == null) {
            return height;
        }
        if (childAt instanceof ResponsiveActionMenuView) {
            return height;
        }
        if (!(childAt instanceof PhoneActionMenuView)) {
            return height;
        }
        PhoneActionMenuView phoneActionMenuView = (PhoneActionMenuView) childAt;
        return !phoneActionMenuView.z() ? phoneActionMenuView.getCollapsedHeight() : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createActionBarCoordinateListener$1(int i2, float f2, int i3, int i4) {
        this.mCurrentActionBarHeightGapOnShow = i3;
        this.mActionBarHeightTotalGapOnShow = i4;
        float height = (this.mContainerView.getHeight() + this.mContainerView.getTranslationY()) / this.mContainerView.getHeight();
        float f3 = this.mTargetTranslationY;
        if (f3 != 0.0f) {
            height = (f3 - this.mContainerView.getTranslationY()) / this.mTargetTranslationY;
        }
        if (this.mContainerView.getHeight() == 0) {
            height = 1.0f;
        }
        this.mCurrentActionBarHeightGap = (int) (this.mCurrentActionBarHeightGapOnShow * height);
        this.mActionBarHeightTotalGap = (int) (this.mActionBarHeightTotalGapOnShow * height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setActionBarStrategy$0() {
        applyActionBarStrategy(this.mActionView, this.mContextView);
    }

    private void measureSearchActionModeView() {
        this.mSearchActionModeView.measure(ViewGroup.getChildMeasureSpec(this.mOverlayLayout.getMeasuredWidth(), 0, this.mSearchActionModeView.getLayoutParams().width), ViewGroup.getChildMeasureSpec(this.mOverlayLayout.getMeasuredHeight(), 0, this.mSearchActionModeView.getLayoutParams().height));
    }

    private void setHasEmbeddedTabs(boolean z) {
        this.mContainerView.setTabContainer(null);
        this.mActionView.setEmbeddedTabView(this.mTabScrollView, this.mExpandTabScrollView, this.mSecondaryTabScrollView, this.mSecondaryExpandTabScrollView);
        boolean z2 = getNavigationMode() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.mTabScrollView;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.mTabScrollView.setEmbeded(true);
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.mExpandTabScrollView;
        if (scrollingTabContainerView2 != null) {
            if (z2) {
                scrollingTabContainerView2.setVisibility(0);
            } else {
                scrollingTabContainerView2.setVisibility(8);
            }
            this.mExpandTabScrollView.setEmbeded(true);
        }
        SecondaryTabContainerView secondaryTabContainerView = this.mSecondaryTabScrollView;
        if (secondaryTabContainerView != null) {
            if (z2) {
                secondaryTabContainerView.setVisibility(0);
            } else {
                secondaryTabContainerView.setVisibility(8);
            }
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.mSecondaryExpandTabScrollView;
        if (secondaryTabContainerView2 != null) {
            if (z2) {
                secondaryTabContainerView2.setVisibility(0);
            } else {
                secondaryTabContainerView2.setVisibility(8);
            }
        }
        this.mActionView.setCollapsable(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a9 A[PHI: r2
      0x00a9: PHI (r2v9 miuix.animation.controller.AnimState) = 
      (r2v5 miuix.animation.controller.AnimState)
      (r2v5 miuix.animation.controller.AnimState)
      (r2v15 miuix.animation.controller.AnimState)
      (r2v15 miuix.animation.controller.AnimState)
     binds: [B:19:0x00dd, B:20:0x00df, B:11:0x0092, B:12:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    private IStateStyle startContainerViewAnimation(boolean z, String str, AnimState animState, AnimState animState2) {
        AnimState animStateAdd;
        AnimState animStateAdd2;
        int height = this.mContainerView.getHeight();
        if (height == 0) {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.mOverlayLayout.getMeasuredWidth(), 0, this.mOverlayLayout.getLayoutParams().width);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mOverlayLayout.getMeasuredHeight(), 0, this.mOverlayLayout.getLayoutParams().height);
            this.mContainerView.measure(childMeasureSpec, childMeasureSpec2);
            applyActionBarStrategy(this.mActionView, this.mContextView);
            this.mContainerView.measure(childMeasureSpec, childMeasureSpec2);
            height = this.mContainerView.getMeasuredHeight();
        }
        int i2 = -height;
        this.mTargetTranslationY = i2;
        AnimConfig animConfig = new AnimConfig();
        animConfig.addListeners(this.mContainerViewAnimationListener);
        if (z) {
            animConfig.setEase(EaseManager.getStyle(-2, 0.9f, 0.25f));
            animConfig.addListeners(new j(this.mContainerView, this));
            animStateAdd = animState2 == null ? new AnimState(str).add(ViewProperty.TRANSLATION_Y, 0.0d).add(ViewProperty.ALPHA, 1.0d) : animState2;
            if (animState == null && animState2 == null) {
                animStateAdd2 = new AnimState(str).add(ViewProperty.TRANSLATION_Y, i2).add(ViewProperty.ALPHA, 0.0d);
            } else {
                animStateAdd2 = animState;
            }
        } else {
            animConfig.setEase(EaseManager.getStyle(-2, 1.0f, 0.35f));
            animConfig.addListeners(new i(this.mContainerView, this));
            animStateAdd = animState2 == null ? new AnimState(str).add(ViewProperty.TRANSLATION_Y, i2).add(ViewProperty.ALPHA, 0.0d) : animState2;
            if (animState == null && animState2 == null) {
                animStateAdd2 = new AnimState(str).add(ViewProperty.TRANSLATION_Y, 0.0d).add(ViewProperty.ALPHA, 1.0d);
            } else {
                animStateAdd2 = animState;
            }
        }
        IStateStyle iStateStyleState = Folme.useAt(this.mContainerView).state();
        if (animStateAdd2 != null) {
            animStateAdd2.setTag(str);
            iStateStyleState = iStateStyleState.setTo(animStateAdd2);
        }
        iStateStyleState.to(animStateAdd, animConfig);
        this.mIsContainerAnimationRunning = true;
        return iStateStyleState;
    }

    private IStateStyle startSplitViewAnimation(boolean z, String str, AnimState animState) {
        int splitHeight = getSplitHeight();
        if (z) {
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase(EaseManager.getStyle(-2, 0.9f, 0.25f));
            AnimState animStateAdd = new AnimState(str).add(ViewProperty.TRANSLATION_Y, 0.0d).add(ViewProperty.ALPHA, 1.0d);
            IStateStyle iStateStyleState = Folme.useAt(this.mSplitView).state();
            if (animState != null) {
                animState.setTag(str);
                iStateStyleState = iStateStyleState.setTo(animState);
            }
            return iStateStyleState.to(animStateAdd, animConfig);
        }
        AnimConfig animConfig2 = new AnimConfig();
        animConfig2.setEase(EaseManager.getStyle(-2, 1.0f, 0.35f));
        animConfig2.addListeners(new i(this.mSplitView, this));
        AnimState animStateAdd2 = new AnimState(str).add(ViewProperty.TRANSLATION_Y, splitHeight + 100).add(ViewProperty.ALPHA, 0.0d);
        IStateStyle iStateStyleState2 = Folme.useAt(this.mSplitView).state();
        if (animState != null) {
            animState.setTag(str);
            iStateStyleState2 = iStateStyleState2.setTo(animState);
        }
        return iStateStyleState2.to(animStateAdd2, animConfig2);
    }

    private void updateContentMaskVisibility(boolean z) {
        if (this.mSplitView.getChildCount() == 2 && (this.mSplitView.getChildAt(1) instanceof PhoneActionMenuView)) {
            PhoneActionMenuView phoneActionMenuView = (PhoneActionMenuView) this.mSplitView.getChildAt(1);
            this.mSplitMenuView = phoneActionMenuView;
            if (!phoneActionMenuView.z() || this.mContentMask == null) {
                return;
            }
            if (z) {
                this.mOverlayLayout.u(this.mContentMaskOnClickListener).b().start();
            } else {
                this.mOverlayLayout.u(null).a().start();
            }
        }
    }

    private void updateVisibility(boolean z) {
        updateVisibility(z, true, null);
    }

    @Override // defpackage.wc0
    public void addActionBarTransitionListener(qd0 qd0Var) {
        this.mContainerView.l(qd0Var);
    }

    @Override // defpackage.wc0
    public void addBadgeOnItemView(int i2) {
        addBadgeOnItemView(i2, 2);
    }

    @Override // defpackage.wc0
    public void addBadgeOnMoreButton() {
        addBadgeOnMoreButton(2);
    }

    @Override // defpackage.wc0
    public int addFragmentTab(String str, ActionBar.c cVar, Class<? extends Fragment> cls, Bundle bundle, boolean z) {
        return this.mViewPagerController.f(str, cVar, cls, bundle, z);
    }

    @Override // defpackage.wc0
    public void addOnFragmentViewPagerChangeListener(wc0.a aVar) {
        this.mViewPagerController.g(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(ActionBar.a aVar) {
        this.mMenuVisibilityListeners.add(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar) {
        addTab(cVar, this.mTabs.isEmpty());
    }

    public void animateToMode(boolean z) {
        if (z) {
            showForActionMode();
        } else {
            hideForActionMode();
        }
        this.mActionModeView.b(z);
        if (this.mTabScrollView == null || this.mActionView.isTightTitleWithEmbeddedTabs() || !this.mActionView.isCollapsed()) {
            return;
        }
        this.mTabScrollView.setEnabled(!z);
        this.mExpandTabScrollView.setEnabled(!z);
        this.mSecondaryTabScrollView.setEnabled(!z);
        this.mSecondaryExpandTabScrollView.setEnabled(!z);
    }

    @Override // defpackage.wc0
    public void clearBadgeOnItemView(int i2) {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView == null || !actionBarView.isEndActionMenuEnable()) {
            return;
        }
        this.mActionView.clearBadgeOnItemView(i2);
    }

    @Override // defpackage.wc0
    public void clearBadgeOnMoreButton() {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView == null || !actionBarView.isEndActionMenuEnable()) {
            return;
        }
        this.mActionView.clearBadgeOnMoreButton();
    }

    public cd0 createActionBarCoordinateListener() {
        return new cd0() { // from class: gd0
            @Override // defpackage.cd0
            public final void a(int i2, float f2, int i3, int i4) {
                this.f18844a.lambda$createActionBarCoordinateListener$1(i2, f2, i3, i4);
            }
        };
    }

    public me0 createActionModeView(ActionMode.Callback callback) {
        me0 me0Var;
        int i2;
        if (callback instanceof dil.b) {
            if (this.mSearchActionModeView == null) {
                SearchActionModeView searchActionModeViewCreateSearchActionModeView = createSearchActionModeView();
                this.mSearchActionModeView = searchActionModeViewCreateSearchActionModeView;
                searchActionModeViewCreateSearchActionModeView.setExtraPaddingPolicy(this.mExtraPaddingPolicy);
            }
            if (this.mOverlayLayout != this.mSearchActionModeView.getParent()) {
                this.mOverlayLayout.addView(this.mSearchActionModeView);
            }
            measureSearchActionModeView();
            this.mSearchActionModeView.c(this.mActionView);
            me0Var = this.mSearchActionModeView;
        } else {
            me0Var = this.mContextView;
            if (me0Var == null) {
                throw new IllegalStateException("not set windowSplitActionBar true in activity style!");
            }
        }
        if ((me0Var instanceof ActionBarContextView) && (i2 = this.mMaxActionMenuItemCount) != -1) {
            ((ActionBarContextView) me0Var).setActionMenuItemLimit(i2);
        }
        return me0Var;
    }

    public SearchActionModeView createSearchActionModeView() {
        SearchActionModeView searchActionModeView = (SearchActionModeView) LayoutInflater.from(getThemedContext()).inflate(awi.P, (ViewGroup) this.mOverlayLayout, false);
        searchActionModeView.setOverlayModeView(this.mOverlayLayout);
        searchActionModeView.setOnBackClickListener(new f());
        return searchActionModeView;
    }

    public ActionBarContainer getActionBarContainer() {
        return this.mContainerView;
    }

    public ActionBarOverlayLayout getActionBarOverlayLayout() {
        return this.mOverlayLayout;
    }

    @Override // defpackage.wc0
    public woc getActionBarStrategy() {
        return this.mActionBarStrategy;
    }

    @Override // defpackage.wc0
    public View getActionBarView() {
        return this.mActionView;
    }

    @Override // defpackage.wc0
    public CollapseTitle getCollapseTitle() {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView != null) {
            return actionBarView.getCollapseTitle();
        }
        return null;
    }

    public View getContentView() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.findViewById(R.id.content);
        }
        return null;
    }

    @Override // androidx.appcompat.app.ActionBar
    public View getCustomView() {
        return this.mActionView.getCustomNavigationView();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.mActionView.getDisplayOptions();
    }

    @Override // defpackage.wc0
    public View getEndView() {
        return this.mActionView.getEndView();
    }

    @Override // defpackage.wc0
    public int getExpandState() {
        return this.mActionView.getExpandState();
    }

    @Override // defpackage.wc0
    public ExpandTitle getExpandTitle() {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView != null) {
            return actionBarView.getExpandTitle();
        }
        return null;
    }

    @Override // defpackage.wc0
    public int getExpandedHeight() {
        return this.mContainerView.getExpandedHeight();
    }

    @Override // defpackage.wc0
    public Fragment getFragmentAt(int i2) {
        return this.mViewPagerController.h(i2);
    }

    @Override // defpackage.wc0
    public int getFragmentTabCount() {
        return this.mViewPagerController.i();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.mContainerView.getHeight();
    }

    @Override // defpackage.wc0
    public Map<Integer, Boolean> getHyperMenuPrimaryCheckedData() {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView != null && actionBarView.isEndActionMenuEnable() && this.mActionView.isHyperActionMenuEnable()) {
            return this.mActionView.getHyperMenuPrimaryCheckedData();
        }
        return null;
    }

    @Override // defpackage.wc0
    public Map<Integer, Boolean[]> getHyperMenuSecondaryCheckedData() {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView != null && actionBarView.isEndActionMenuEnable() && this.mActionView.isHyperActionMenuEnable()) {
            return this.mActionView.getHyperMenuSecondaryCheckedData();
        }
        return null;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        int navigationMode = this.mActionView.getNavigationMode();
        if (navigationMode != 1) {
            if (navigationMode != 2) {
                return 0;
            }
            return this.mTabs.size();
        }
        SpinnerAdapter dropdownAdapter = this.mActionView.getDropdownAdapter();
        if (dropdownAdapter != null) {
            return dropdownAdapter.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return this.mActionView.getNavigationMode();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        h hVar;
        int navigationMode = this.mActionView.getNavigationMode();
        if (navigationMode == 1) {
            return this.mActionView.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (hVar = this.mSelectedTab) != null) {
            return hVar.d();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c getSelectedTab() {
        return this.mSelectedTab;
    }

    @Override // defpackage.wc0
    public View getStartView() {
        return this.mActionView.getStartView();
    }

    @Override // defpackage.wc0
    public View getSubTitleView(int i2) {
        return this.mActionView.getSubTitleView(i2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getSubtitle() {
        return this.mActionView.getSubtitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c getTabAt(int i2) {
        return this.mTabs.get(i2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return this.mTabs.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context getThemedContext() {
        if (this.mThemedContext == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.mThemedContext = new ContextThemeWrapper(this.mContext, i2);
            } else {
                this.mThemedContext = this.mContext;
            }
        }
        return this.mThemedContext;
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence getTitle() {
        return this.mActionView.getTitle();
    }

    @Override // defpackage.wc0
    public View getTitleView(int i2) {
        return this.mActionView.getTitleView(i2);
    }

    public int getTopOffsetForCoordinateView(View view) {
        if (this.mCoordinateOffsetViewSet.containsKey(view)) {
            return getCoordinateOffsetViewTopOffsetOrDefault(view).intValue();
        }
        return -1;
    }

    public int getTopViewHeight() {
        me0 me0Var;
        if (this.mActionMode != null && (me0Var = this.mActionModeView) != null) {
            return me0Var.getViewHeight();
        }
        if (this.mActionView.isCollapsed()) {
            return 0;
        }
        return this.mActionView.getCollapsedHeight();
    }

    @Override // defpackage.wc0
    public int getViewPagerOffscreenPageLimit() {
        return this.mViewPagerController.j();
    }

    public boolean hasNonEmbeddedTabs() {
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
        hide((AnimState) null);
    }

    public void hideForActionMode() {
        if (this.mShowingForMode) {
            this.mShowingForMode = false;
            this.mActionView.onActionModeEnd((getDisplayOptions() & 32768) != 0);
            updateVisibility(false);
            if (this.mActionModeView instanceof SearchActionModeView) {
                setResizable(this.mCurrentResizable);
            } else {
                this.mContainerView.n();
                this.mCurrentResizable = ((ActionBarContextView) this.mActionModeView).isResizable();
                this.mCurrentExpandState = ((ActionBarContextView) this.mActionModeView).getExpandState();
                setResizable(this.mCurrentResizable);
                this.mActionView.setExpandState(this.mCurrentExpandState);
            }
            this.mActionView.setImportantForAccessibility(this.mCurrentAccessibilityImportant);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init(ViewGroup viewGroup) {
        int iJ;
        al8 al8Var;
        if (viewGroup == null) {
            return;
        }
        TypedValue typedValueK = hm1.k(this.mContext, zhi.g);
        if (typedValueK != null) {
            try {
                this.mActionBarStrategy = (woc) Class.forName(typedValueK.string.toString()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
            }
        }
        this.mWindowMode = tc8.i(this.mContext).g;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup;
        this.mOverlayLayout = actionBarOverlayLayout;
        actionBarOverlayLayout.setActionBar(this);
        ActionBarView actionBarView = (ActionBarView) viewGroup.findViewById(vsi.f37187a);
        this.mActionView = actionBarView;
        if (actionBarView != null && (al8Var = this.mExtraPaddingPolicy) != null) {
            actionBarView.setExtraPaddingPolicy(al8Var);
        }
        this.mContextView = (ActionBarContextView) viewGroup.findViewById(vsi.o);
        this.mContainerView = (ActionBarContainer) viewGroup.findViewById(vsi.d);
        this.mSplitView = (ActionBarContainer) viewGroup.findViewById(vsi.g0);
        View viewFindViewById = viewGroup.findViewById(vsi.B);
        this.mContentMask = viewFindViewById;
        if (viewFindViewById != null) {
            this.mContentMaskOnClickListener = new c();
        }
        ActionBarView actionBarView2 = this.mActionView;
        if (actionBarView2 == null && this.mContextView == null && this.mContainerView == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.mContextDisplayMode = actionBarView2.isSplitActionBar() ? 1 : 0;
        Object[] objArr = (this.mActionView.getDisplayOptions() & 4) != 0;
        if (objArr != false) {
            this.mDisplayHomeAsUpSet = true;
        }
        md0 md0VarB = md0.b(this.mContext);
        setHomeButtonEnabled(md0VarB.a() || objArr == true);
        setHasEmbeddedTabs(md0VarB.e());
        boolean z = n5g.f() && !bie.a();
        ActionBarContainer actionBarContainer = this.mContainerView;
        if (actionBarContainer != null) {
            actionBarContainer.setSupportBlur(z);
        }
        ActionBarContainer actionBarContainer2 = this.mSplitView;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setSupportBlur(z);
        }
        if (z && (iJ = hm1.j(this.mContext, zhi.t, 0)) != 0) {
            int displayOptions = getDisplayOptions();
            if ((iJ & 1) != 0) {
                displayOptions |= 32768;
            }
            if ((iJ & 2) != 0) {
                displayOptions |= 16384;
            }
            setDisplayOptions(displayOptions);
        }
        if (this.mActionBarStrategy == null) {
            this.mActionBarStrategy = new CommonActionBarStrategy();
        }
        this.mOverlayLayout.getViewTreeObserver().addOnPreDrawListener(new d());
        this.mOverlayLayout.addOnLayoutChangeListener(new e());
    }

    public void internalAddTab(ActionBar.c cVar) {
        internalAddTab(cVar, getTabCount() == 0);
    }

    public void internalRemoveAllTabs() {
        cleanupTabs();
    }

    public void internalRemoveTab(ActionBar.c cVar) {
        internalRemoveTabAt(cVar.d());
    }

    public void internalRemoveTabAt(int i2) {
        if (this.mTabScrollView == null) {
            return;
        }
        h hVar = this.mSelectedTab;
        int iD = hVar != null ? hVar.d() : this.mSavedTabPosition;
        this.mTabScrollView.i(i2);
        this.mExpandTabScrollView.i(i2);
        this.mSecondaryTabScrollView.u(i2);
        this.mSecondaryExpandTabScrollView.u(i2);
        h hVarRemove = this.mTabs.remove(i2);
        if (hVarRemove != null) {
            hVarRemove.l(-1);
        }
        int size = this.mTabs.size();
        for (int i3 = i2; i3 < size; i3++) {
            this.mTabs.get(i3).l(i3);
        }
        if (iD == i2) {
            selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i2 - 1)));
        }
        if (this.mTabs.isEmpty()) {
            this.mSavedTabPosition = -1;
        }
    }

    @Override // defpackage.wc0
    public boolean isFragmentViewPagerMode() {
        return this.mViewPagerController != null;
    }

    @Override // defpackage.wc0
    public boolean isResizable() {
        return this.mActionView.isResizable();
    }

    public boolean isShowHideAnimationEnabled() {
        return this.mShowHideAnimationEnabled;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        return this.mNowShowing;
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.c newTab() {
        return new h();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(Configuration configuration) {
        this.mIsWindowInfoChanged = true;
        this.mWindowMode = tc8.j(this.mContext, configuration).g;
        setHasEmbeddedTabs(md0.b(this.mContext).e());
        SearchActionModeView searchActionModeView = this.mSearchActionModeView;
        if (searchActionModeView == null || searchActionModeView.isAttachedToWindow()) {
            return;
        }
        this.mSearchActionModeView.onConfigurationChanged(configuration);
    }

    @Override // defpackage.wc0
    public void onDestroy() {
    }

    public void onFloatingModeChanged(boolean z) {
        this.mContainerView.setIsMiuixFloating(z);
        SearchActionModeView searchActionModeView = this.mSearchActionModeView;
        if (searchActionModeView != null) {
            searchActionModeView.I();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc0
    public void registerCoordinateScrollView(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof yig) {
            yig yigVar = (yig) view;
            this.mNestedContentInsetObserverSet.add(yigVar);
            Rect rect = this.mContentInset;
            if (rect != null) {
                yigVar.onContentInsetChanged(rect);
            }
        } else {
            HashMap<View, Integer> map = this.mCoordinateOffsetViewSet;
            Rect rect2 = this.mContentInset;
            map.put(view, Integer.valueOf(rect2 != null ? rect2.top : UNINITIALIZED_OFFSET.intValue()));
            Rect rect3 = this.mContentInset;
            if (rect3 != null) {
                this.mCoordinateOffsetViewSet.put(view, Integer.valueOf(rect3.top));
                doUpdateTopOffsetForCoordinateView(view, this.mContentInset.top);
            }
        }
        if (this.mContainerView.getActionBarCoordinateListener() == null) {
            this.mContainerView.setActionBarCoordinateListener(createActionBarCoordinateListener());
        }
    }

    @Override // defpackage.wc0
    public void registerCoordinatedScrollView(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.O(view);
        }
    }

    @Override // defpackage.wc0
    public void removeActionBarTransitionListener(qd0 qd0Var) {
        this.mContainerView.G(qd0Var);
    }

    @Override // defpackage.wc0
    public void removeAllFragmentTab() {
        this.mViewPagerController.k();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        if (isFragmentViewPagerMode()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        internalRemoveAllTabs();
    }

    @Override // defpackage.wc0
    public void removeFragmentTab(String str) {
        this.mViewPagerController.o(str);
    }

    @Override // defpackage.wc0
    public void removeFragmentTabAt(int i2) {
        this.mViewPagerController.m(i2);
    }

    @Override // defpackage.wc0
    public void removeOnFragmentViewPagerChangeListener(wc0.a aVar) {
        this.mViewPagerController.p(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(ActionBar.a aVar) {
        this.mMenuVisibilityListeners.remove(aVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(ActionBar.c cVar) {
        if (isFragmentViewPagerMode()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        internalRemoveTab(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int i2) {
        if (isFragmentViewPagerMode()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        internalRemoveTabAt(i2);
    }

    @Override // defpackage.wc0
    public void replaceFragmentTab(String str, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z) {
        this.mViewPagerController.q(str, i2, cls, bundle, z);
    }

    @Override // defpackage.wc0
    public void resetCoordinateScrollView(View view) {
        if (view instanceof yig) {
            if (this.mNestedContentInsetObserverSet.contains(view)) {
                doUpdateTopOffsetForCoordinateView(view, 0);
            }
        } else if (this.mCoordinateOffsetViewSet.containsKey(view)) {
            HashMap<View, Integer> map = this.mCoordinateOffsetViewSet;
            Rect rect = this.mContentInset;
            map.put(view, Integer.valueOf(rect != null ? rect.top : UNINITIALIZED_OFFSET.intValue()));
            Rect rect2 = this.mContentInset;
            doUpdateTopOffsetForCoordinateView(view, rect2 != null ? rect2.top : 0);
        }
    }

    @Override // defpackage.wc0
    public void restoreHyperMenuPrimaryCheckedData(Map<Integer, Boolean> map) {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView != null && actionBarView.isEndActionMenuEnable() && this.mActionView.isHyperActionMenuEnable()) {
            this.mActionView.restorePrimaryMenuCheckedData(map);
        }
    }

    @Override // defpackage.wc0
    public void restoreHyperMenuSecondaryCheckedData(Map<Integer, Boolean[]> map) {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView != null && actionBarView.isEndActionMenuEnable() && this.mActionView.isHyperActionMenuEnable()) {
            this.mActionView.restoreSecondaryMenuCheckedData(map);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(ActionBar.c cVar) {
        selectTab(cVar, true);
    }

    @Override // defpackage.wc0
    public void setActionBarStrategy(woc wocVar) {
        this.mActionBarStrategy = wocVar;
        this.mOverlayLayout.post(new Runnable() { // from class: hd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19941a.lambda$setActionBarStrategy$0();
            }
        });
    }

    @Override // defpackage.wc0
    public void setActionMenuItemLimit(int i2) {
        this.mMaxActionMenuItemCount = i2;
        this.mActionView.setActionMenuItemLimit(i2);
        me0 me0Var = this.mActionModeView;
        if (me0Var instanceof ActionBarContextView) {
            ((ActionBarContextView) me0Var).setActionMenuItemLimit(this.mMaxActionMenuItemCount);
        }
    }

    @Override // defpackage.wc0
    public void setActionModeAnim(boolean z) {
        ActionBarContextView actionBarContextView = this.mContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setActionModeAnim(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(Drawable drawable) {
        this.mContainerView.setPrimaryBackground(drawable);
    }

    public void setBlur(Boolean bool) {
        ActionBarContainer actionBarContainer;
        if ((getDisplayOptions() & 32768) == 0 || (actionBarContainer = this.mContainerView) == null) {
            return;
        }
        actionBarContainer.setActionBarBlur(bool);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view) {
        this.mActionView.setCustomNavigationView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        int blurOptions = getBlurOptions();
        setDisplayOptions((z ? 4 : 0) | blurOptions, blurOptions | 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i2, int i3) {
        int displayOptions = this.mActionView.getDisplayOptions();
        if ((i3 & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mActionView.setDisplayOptions((i2 & i3) | ((~i3) & displayOptions));
        int displayOptions2 = this.mActionView.getDisplayOptions();
        ActionBarContainer actionBarContainer = this.mContainerView;
        if (actionBarContainer != null) {
            actionBarContainer.setEnableBlur((32768 & displayOptions2) != 0);
        }
        ActionBarContainer actionBarContainer2 = this.mSplitView;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setEnableBlur((displayOptions2 & 16384) != 0);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z) {
        int blurOptions = getBlurOptions();
        setDisplayOptions((z ? 16 : 0) | blurOptions, blurOptions | 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z) {
        int blurOptions = getBlurOptions();
        setDisplayOptions((z ? 2 : 0) | blurOptions, blurOptions | 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z) {
        int blurOptions = getBlurOptions();
        setDisplayOptions((z ? 8 : 0) | blurOptions, blurOptions | 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z) {
        int blurOptions = getBlurOptions();
        setDisplayOptions((z ? 1 : 0) | blurOptions, blurOptions | 1);
    }

    @Override // defpackage.wc0
    public void setEndActionMenuItemLimit(int i2) {
        this.mActionView.setUserSetEndActionMenuItemLimit(true);
        this.mActionView.setEndActionMenuItemLimit(i2);
    }

    @Override // defpackage.wc0
    public void setEndView(View view) {
        this.mActionView.setEndView(view);
    }

    @Override // defpackage.wc0
    public void setExpandState(int i2) {
        this.mActionView.setExpandStateByUser(i2);
        this.mActionView.setExpandState(i2);
        ActionBarContextView actionBarContextView = this.mContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setExpandStateByUser(i2);
            this.mContextView.setExpandState(i2);
        }
    }

    @Override // defpackage.wc0
    public void setExpandTabTextAppearance(int i2, int i3) {
        this.mExpandTabScrollView.o(i2, i3);
    }

    public void setExtraPaddingPolicy(al8 al8Var) {
        if (this.mExtraPaddingPolicy != al8Var) {
            this.mExtraPaddingPolicy = al8Var;
            ActionBarView actionBarView = this.mActionView;
            if (actionBarView != null) {
                actionBarView.setExtraPaddingPolicy(al8Var);
            }
            SearchActionModeView searchActionModeView = this.mSearchActionModeView;
            if (searchActionModeView != null) {
                searchActionModeView.setExtraPaddingPolicy(this.mExtraPaddingPolicy);
            }
        }
    }

    @Override // defpackage.wc0
    public void setFragmentActionMenuAt(int i2, boolean z) {
        this.mViewPagerController.r(i2, z);
    }

    @Override // defpackage.wc0
    public void setFragmentViewPagerMode(FragmentActivity fragmentActivity) {
        setFragmentViewPagerMode(fragmentActivity, true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
        this.mActionView.setHomeButtonEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int i2) {
        this.mActionView.setIcon(i2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, ActionBar.b bVar) {
        this.mActionView.setDropdownAdapter(spinnerAdapter);
        this.mActionView.setCallback(bVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int i2) {
        this.mActionView.setLogo(i2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int i2) {
        if (this.mActionView.getNavigationMode() == 2) {
            this.mSavedTabPosition = getSelectedNavigationIndex();
            selectTab(null);
            this.mTabScrollView.setVisibility(8);
            this.mExpandTabScrollView.setVisibility(8);
            this.mSecondaryTabScrollView.setVisibility(8);
            this.mSecondaryExpandTabScrollView.setVisibility(8);
        }
        this.mActionView.setNavigationMode(i2);
        if (i2 == 2) {
            ensureTabsExist();
            this.mTabScrollView.setVisibility(0);
            this.mExpandTabScrollView.setVisibility(0);
            this.mSecondaryTabScrollView.setVisibility(0);
            this.mSecondaryExpandTabScrollView.setVisibility(0);
            int i3 = this.mSavedTabPosition;
            if (i3 != -1) {
                setSelectedNavigationItem(i3);
                this.mSavedTabPosition = -1;
            }
        }
        this.mActionView.setCollapsable(false);
    }

    @Override // defpackage.wc0
    public void setProgress(int i2) {
        this.mActionView.setProgress(i2);
    }

    @Override // defpackage.wc0
    public void setProgressBarIndeterminate(boolean z) {
        this.mActionView.setProgressBarIndeterminate(z);
    }

    @Override // defpackage.wc0
    public void setProgressBarIndeterminateVisibility(boolean z) {
        this.mActionView.setProgressBarIndeterminateVisibility(z);
    }

    @Override // defpackage.wc0
    public void setProgressBarVisibility(boolean z) {
        this.mActionView.setProgressBarVisibility(z);
    }

    @Override // defpackage.wc0
    public void setResizable(boolean z) {
        this.mActionView.setResizable(z);
    }

    @Override // defpackage.wc0
    public void setSecondaryTabTextAppearance(int i2, int i3) {
        this.mSecondaryTabScrollView.y(i2, i3);
        this.mSecondaryExpandTabScrollView.y(i2, i3);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int i2) {
        int navigationMode = this.mActionView.getNavigationMode();
        if (navigationMode == 1) {
            this.mActionView.setDropdownSelectedPosition(i2);
        } else {
            if (navigationMode != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            selectTab(this.mTabs.get(i2));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"RestrictedApi"})
    public void setShowHideAnimationEnabled(boolean z) {
        this.mShowHideAnimationEnabled = z;
        if (z) {
            return;
        }
        if (isShowing()) {
            doShow(false);
        } else {
            doHide(false);
        }
    }

    public void setSplitActionBarBlur(Boolean bool) {
        ActionBarContainer actionBarContainer;
        if ((getDisplayOptions() & 16384) == 0 || (actionBarContainer = this.mSplitView) == null) {
            return;
        }
        actionBarContainer.setSplitActionBarBlur(bool);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable) {
        if (this.mSplitView != null) {
            for (int i2 = 0; i2 < this.mSplitView.getChildCount(); i2++) {
                if (this.mSplitView.getChildAt(i2) instanceof ActionMenuView) {
                    this.mSplitView.getChildAt(i2).setBackground(drawable);
                }
            }
        }
    }

    @Override // defpackage.wc0
    public void setStartView(View view) {
        this.mActionView.setStartView(view);
    }

    @Override // defpackage.wc0
    public void setSubTitleClickListener(View.OnClickListener onClickListener) {
        this.mActionView.setSubTitleClickListener(onClickListener);
    }

    @Override // defpackage.wc0
    public void setSubTitleDrawable(t8p t8pVar) {
        this.mActionView.setSubTitleDrawable(t8pVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(CharSequence charSequence) {
        this.mActionView.setSubtitle(charSequence);
    }

    @Override // defpackage.wc0
    public void setTabBadgeDisappearOnClick(int i2, boolean z) {
        this.mSecondaryTabScrollView.w(i2, z);
        this.mSecondaryExpandTabScrollView.w(i2, z);
    }

    @Override // defpackage.wc0
    public void setTabBadgeVisibility(int i2, boolean z) {
        this.mTabScrollView.k(i2, z);
        this.mExpandTabScrollView.k(i2, z);
        this.mSecondaryTabScrollView.v(i2, z);
        this.mSecondaryExpandTabScrollView.v(i2, z);
    }

    @Override // defpackage.wc0
    public void setTabIconWithPosition(int i2, int i3, int i4, int i5, int i6, int i7) {
        setTabIconWithPosition(i2, i3, i4 != 0 ? this.mContext.getDrawable(i4) : null, i5 != 0 ? this.mContext.getDrawable(i5) : null, i6 != 0 ? this.mContext.getDrawable(i6) : null, i7 != 0 ? this.mContext.getDrawable(i7) : null);
    }

    @Override // defpackage.wc0
    public void setTabTextAppearance(int i2, int i3) {
        this.mTabScrollView.o(i2, i3);
    }

    @Override // defpackage.wc0
    public void setTabsMode(boolean z) {
        setHasEmbeddedTabs(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(CharSequence charSequence) {
        this.mActionView.setTitle(charSequence);
    }

    @Override // defpackage.wc0
    public void setTitleClickable(boolean z) {
        this.mActionView.setTitleClickable(z);
    }

    @Override // defpackage.wc0
    public void setViewPagerDecor(View view) {
        this.mViewPagerController.s(view);
    }

    @Override // defpackage.wc0
    public void setViewPagerDraggable(boolean z) {
        this.mViewPagerController.t(z);
    }

    @Override // defpackage.wc0
    public void setViewPagerOffscreenPageLimit(int i2) {
        this.mViewPagerController.u(i2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
        show((AnimState) null);
    }

    @Override // defpackage.wc0
    public void showActionBarShadow(boolean z) {
    }

    public void showForActionMode() {
        if (this.mShowingForMode) {
            return;
        }
        this.mShowingForMode = true;
        updateVisibility(false);
        this.mCurrentExpandState = getExpandState();
        this.mCurrentResizable = isResizable();
        if (this.mActionModeView instanceof SearchActionModeView) {
            setResizable(false);
        } else {
            this.mContainerView.L();
            ((ActionBarContextView) this.mActionModeView).setExpandState(this.mCurrentExpandState);
            ((ActionBarContextView) this.mActionModeView).setResizable(this.mCurrentResizable);
        }
        this.mCurrentAccessibilityImportant = this.mActionView.getImportantForAccessibility();
        this.mActionView.setImportantForAccessibility(4);
        this.mActionView.onActionModeStart(this.mActionModeView instanceof SearchActionModeView, (getDisplayOptions() & 32768) != 0);
    }

    @Override // defpackage.wc0
    public void showSplitActionBar(boolean z, boolean z2) {
        if (this.mActionView.isSplitActionBar()) {
            if (z) {
                this.mSplitView.K(z2);
            } else {
                this.mSplitView.q(z2);
            }
        }
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        Rect baseInnerInsets;
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionMode actionModeCreateActionMode = createActionMode(callback);
        me0 me0Var = this.mActionModeView;
        if (((me0Var instanceof SearchActionModeView) && (actionModeCreateActionMode instanceof eil)) || ((me0Var instanceof ActionBarContextView) && (actionModeCreateActionMode instanceof x08))) {
            me0Var.e();
            this.mActionModeView.a();
        }
        me0 me0VarCreateActionModeView = createActionModeView(callback);
        this.mActionModeView = me0VarCreateActionModeView;
        if (me0VarCreateActionModeView == null) {
            throw new IllegalStateException("not set windowSplitActionBar true in activity style!");
        }
        if (!(actionModeCreateActionMode instanceof le0)) {
            return null;
        }
        le0 le0Var = (le0) actionModeCreateActionMode;
        le0Var.f(me0VarCreateActionModeView);
        if ((le0Var instanceof eil) && (baseInnerInsets = this.mOverlayLayout.getBaseInnerInsets()) != null) {
            ((eil) le0Var).g(baseInnerInsets);
        }
        le0Var.e(this.mActionModeCallback);
        if (!le0Var.c()) {
            return null;
        }
        actionModeCreateActionMode.invalidate();
        this.mActionModeView.d(actionModeCreateActionMode);
        animateToMode(true);
        ActionBarContainer actionBarContainer = this.mSplitView;
        if (actionBarContainer != null && this.mContextDisplayMode == 1 && actionBarContainer.getVisibility() != 0) {
            this.mSplitView.setVisibility(0);
        }
        me0 me0Var2 = this.mActionModeView;
        if (me0Var2 instanceof ActionBarContextView) {
            ((ActionBarContextView) me0Var2).sendAccessibilityEvent(32);
        }
        this.mActionMode = actionModeCreateActionMode;
        return actionModeCreateActionMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc0
    public void unregisterCoordinateScrollView(View view) {
        if (view instanceof yig) {
            this.mNestedContentInsetObserverSet.remove((yig) view);
        } else {
            this.mCoordinateOffsetViewSet.remove(view);
        }
        if (this.mCoordinateOffsetViewSet.size() == 0 && this.mNestedContentInsetObserverSet.size() == 0) {
            this.mContainerView.setActionBarCoordinateListener(null);
        }
    }

    @Override // defpackage.wc0
    public void unregisterCoordinatedScrollView(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.V(view);
        }
    }

    public void updateBackgroundViewBlurState(boolean z) {
        if (!z || n5g.e(getThemedContext())) {
            SearchActionModeView searchActionModeView = this.mSearchActionModeView;
            if (searchActionModeView != null) {
                searchActionModeView.P(z);
            }
            this.mContainerView.M(z);
        }
    }

    public void updateContentInsetForNestedObserver(Rect rect) {
        this.mContentInset = rect;
        int i2 = rect.top;
        int i3 = i2 - this.mContentInsetTop;
        this.mContentInsetTop = i2;
        Iterator<yig> it = this.mNestedContentInsetObserverSet.iterator();
        while (it.hasNext()) {
            it.next().onContentInsetChanged(rect);
        }
        for (View view : this.mCoordinateOffsetViewSet.keySet()) {
            Integer num = this.mCoordinateOffsetViewSet.get(view);
            if (num != null && i3 != 0) {
                if (num.equals(UNINITIALIZED_OFFSET)) {
                    num = 0;
                } else if (num.intValue() == 0) {
                }
                int iMax = Math.max(0, num.intValue() + i3);
                this.mCoordinateOffsetViewSet.put(view, Integer.valueOf(iMax));
                doUpdateTopOffsetForCoordinateView(view, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateCoordinateOffsetView() {
        if (this.mCoordinateOffsetViewSet.size() == 0 && this.mNestedContentInsetObserverSet.size() == 0) {
            this.mContainerView.setActionBarCoordinateListener(null);
            return;
        }
        for (View view : this.mCoordinateOffsetViewSet.keySet()) {
            doUpdateTopOffsetForCoordinateView(view, getCoordinateOffsetViewTopOffsetOrDefault(view).intValue());
        }
        Iterator<yig> it = this.mNestedContentInsetObserverSet.iterator();
        while (it.hasNext()) {
            View view2 = (View) ((yig) it.next());
            if (view2 instanceof zig) {
                ((zig) view2).a(this.mCurrentActionBarHeightGap, this.mActionBarHeightTotalGap);
            }
            doUpdateTopOffsetForCoordinateView(view2, 0);
        }
    }

    public void updateTab(int i2) {
        ensureTabsExist();
        this.mTabScrollView.q(i2);
        this.mExpandTabScrollView.q(i2);
        this.mSecondaryTabScrollView.B(i2);
        this.mSecondaryExpandTabScrollView.B(i2);
    }

    public int updateTopOffsetOnNestedPreScroll(View view, int i2) {
        if (this.mCoordinateOffsetViewSet.containsKey(view)) {
            Integer coordinateOffsetViewTopOffsetOrDefault = getCoordinateOffsetViewTopOffsetOrDefault(view);
            if (coordinateOffsetViewTopOffsetOrDefault.intValue() > i2) {
                this.mCoordinateOffsetViewSet.put(view, Integer.valueOf(i2));
                doUpdateTopOffsetForCoordinateView(view, i2);
                return coordinateOffsetViewTopOffsetOrDefault.intValue() - i2;
            }
        }
        return 0;
    }

    public int updateTopOffsetOnNestedScroll(View view, int i2) {
        int i3 = 0;
        for (View view2 : this.mCoordinateOffsetViewSet.keySet()) {
            int iIntValue = getCoordinateOffsetViewTopOffsetOrDefault(view2).intValue();
            int i4 = iIntValue - i2;
            Rect rect = this.mContentInset;
            int iMin = Math.min(i4, rect == null ? 0 : rect.top);
            if (iIntValue < iMin) {
                this.mCoordinateOffsetViewSet.put(view2, Integer.valueOf(iMin));
                doUpdateTopOffsetForCoordinateView(view2, iMin);
                if (view == view2) {
                    i3 = iIntValue - iMin;
                }
            }
        }
        return i3;
    }

    private void doHide(boolean z, boolean z2, AnimState animState) {
        AnimState currentState;
        IStateStyle iStateStyle = this.mContainerAnim;
        if (iStateStyle == null || !this.mIsContainerAnimationRunning) {
            currentState = null;
        } else {
            currentState = iStateStyle.getCurrentState();
            this.mContainerAnim.cancel();
        }
        if ((isShowHideAnimationEnabled() || z) && z2) {
            this.mContainerAnim = startContainerViewAnimation(false, "HideActionBar", currentState, animState);
            return;
        }
        ActionBarContainer actionBarContainer = this.mContainerView;
        actionBarContainer.setTranslationY(-actionBarContainer.getHeight());
        this.mContainerView.setAlpha(0.0f);
        this.mActionBarHeightTotalGap = 0;
        this.mCurrentActionBarHeightGap = 0;
        this.mContainerView.setVisibility(8);
    }

    private void doShow(boolean z, boolean z2, AnimState animState) {
        AnimState currentState;
        IStateStyle iStateStyle = this.mContainerAnim;
        if (iStateStyle == null || !this.mIsContainerAnimationRunning) {
            currentState = null;
        } else {
            currentState = iStateStyle.getCurrentState();
            this.mContainerAnim.cancel();
        }
        boolean z3 = (isShowHideAnimationEnabled() || z) && z2;
        if (this.mActionMode instanceof dil) {
            this.mContainerView.setVisibility(this.mOverlayLayout.D() ? 4 : 8);
        } else {
            this.mContainerView.setVisibility(0);
        }
        this.mContainerView.H();
        if (z3) {
            this.mContainerAnim = startContainerViewAnimation(true, "ShowActionBar", currentState, animState);
        } else {
            this.mContainerView.setTranslationY(0.0f);
            this.mContainerView.setAlpha(1.0f);
        }
    }

    private void updateVisibility(boolean z, boolean z2, AnimState animState) {
        if (checkShowingFlags(this.mHiddenByApp, this.mHiddenBySystem, this.mShowingForMode)) {
            if (this.mNowShowing) {
                return;
            }
            this.mNowShowing = true;
            doShow(z, z2, animState);
            return;
        }
        if (this.mNowShowing) {
            this.mNowShowing = false;
            doHide(z, z2, animState);
        }
    }

    @Override // defpackage.wc0
    public void addBadgeOnItemView(int i2, int i3) {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView == null || !actionBarView.isEndActionMenuEnable()) {
            return;
        }
        this.mActionView.addBadgeOnItemView(i2, i3);
    }

    @Override // defpackage.wc0
    public void addBadgeOnMoreButton(int i2) {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView == null || !actionBarView.isEndActionMenuEnable()) {
            return;
        }
        this.mActionView.addBadgeOnMoreButton(i2);
    }

    @Override // defpackage.wc0
    public int addFragmentTab(String str, ActionBar.c cVar, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z) {
        return this.mViewPagerController.e(str, cVar, i2, cls, bundle, z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, boolean z) {
        if (isFragmentViewPagerMode()) {
            throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
        }
        internalAddTab(cVar, z);
    }

    @Override // defpackage.wc0
    public void hide(boolean z) {
        hide(z, null);
    }

    public void internalAddTab(ActionBar.c cVar, boolean z) {
        ensureTabsExist();
        this.mTabScrollView.c(cVar, z);
        this.mExpandTabScrollView.c(cVar, z);
        this.mSecondaryTabScrollView.p(cVar, z);
        this.mSecondaryExpandTabScrollView.p(cVar, z);
        configureTab(cVar, this.mTabs.size());
        if (z) {
            selectTab(cVar);
        }
    }

    @Override // defpackage.wc0
    public void removeFragmentTab(ActionBar.c cVar) {
        this.mViewPagerController.n(cVar);
    }

    @Override // defpackage.wc0
    public void selectTab(ActionBar.c cVar, boolean z) {
        if (this.isSelectingTab) {
            this.isSelectingTab = false;
            return;
        }
        this.isSelectingTab = true;
        Context context = this.mContext;
        if ((context instanceof Activity) && (((Activity) context).isDestroyed() || ((Activity) this.mContext).isFinishing())) {
            return;
        }
        if (getNavigationMode() != 2) {
            this.mSavedTabPosition = cVar != null ? cVar.d() : -1;
            return;
        }
        k kVarR = this.mFragmentManager.o().r();
        h hVar = this.mSelectedTab;
        if (hVar != cVar) {
            this.mTabScrollView.n(cVar != null ? cVar.d() : -1, z);
            this.mExpandTabScrollView.n(cVar != null ? cVar.d() : -1, z);
            this.mSecondaryTabScrollView.setTabSelected(cVar != null ? cVar.d() : -1);
            this.mSecondaryExpandTabScrollView.setTabSelected(cVar != null ? cVar.d() : -1);
            h hVar2 = this.mSelectedTab;
            if (hVar2 != null) {
                hVar2.j().c(this.mSelectedTab, kVarR);
            }
            h hVar3 = (h) cVar;
            this.mSelectedTab = hVar3;
            if (hVar3 != null) {
                hVar3.h = z;
                hVar3.j().a(this.mSelectedTab, kVarR);
            }
        } else if (hVar != null) {
            hVar.j().b(this.mSelectedTab, kVarR);
            this.mTabScrollView.d(cVar.d());
            this.mExpandTabScrollView.d(cVar.d());
            this.mSecondaryTabScrollView.q(cVar.d());
            this.mSecondaryExpandTabScrollView.q(cVar.d());
        }
        if (!kVarR.u()) {
            kVarR.l();
        }
        this.isSelectingTab = false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.mActionView.setCustomNavigationView(view);
    }

    @Override // defpackage.wc0
    public void setFragmentViewPagerMode(FragmentActivity fragmentActivity, boolean z) {
        if (isFragmentViewPagerMode()) {
            return;
        }
        removeAllTabs();
        setNavigationMode(2);
        this.mViewPagerController = new miuix.appcompat.internal.app.widget.b(this, this.mFragmentManager, fragmentActivity.getLifecycle(), z);
        addOnFragmentViewPagerChangeListener(this.mTabScrollView);
        addOnFragmentViewPagerChangeListener(this.mExpandTabScrollView);
        addOnFragmentViewPagerChangeListener(this.mSecondaryTabScrollView);
        addOnFragmentViewPagerChangeListener(this.mSecondaryExpandTabScrollView);
        ActionBarContainer actionBarContainer = this.mSplitView;
        if (actionBarContainer != null) {
            addOnFragmentViewPagerChangeListener(actionBarContainer);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(Drawable drawable) {
        this.mActionView.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(Drawable drawable) {
        this.mActionView.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int i2) {
        setSubtitle(this.mContext.getString(i2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int i2) {
        setTitle(this.mContext.getString(i2));
    }

    @Override // defpackage.wc0
    public void show(boolean z) {
        show(z, null);
    }

    @Override // defpackage.wc0
    public void clearBadgeOnItemView(MenuItem menuItem) {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView == null || !actionBarView.isEndActionMenuEnable()) {
            return;
        }
        this.mActionView.clearBadgeOnItemView(menuItem);
    }

    @Override // defpackage.wc0
    public void hide(AnimState animState) {
        hide(true, animState);
    }

    @Override // defpackage.wc0
    public void removeFragmentTab(Fragment fragment) {
        this.mViewPagerController.l(fragment);
    }

    @Override // defpackage.wc0
    public void setSecondaryTabTextAppearance(int i2, int i3, int i4) {
        this.mSecondaryTabScrollView.z(i2, i3, i4);
        this.mSecondaryExpandTabScrollView.z(i2, i3, i4);
    }

    @Override // defpackage.wc0
    public void show(AnimState animState) {
        show(true, animState);
    }

    @Override // defpackage.wc0
    public void addBadgeOnItemView(MenuItem menuItem) {
        addBadgeOnItemView(menuItem, 2);
    }

    @Override // defpackage.wc0
    public void hide(boolean z, AnimState animState) {
        if (this.mHiddenByApp) {
            return;
        }
        this.mHiddenByApp = true;
        updateVisibility(false, z, animState);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int i2) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i2, (ViewGroup) this.mActionView, false));
    }

    @Override // defpackage.wc0
    public void show(boolean z, AnimState animState) {
        if (this.mHiddenByApp) {
            this.mHiddenByApp = false;
            updateVisibility(false, z, animState);
        }
    }

    @Override // defpackage.wc0
    public void addBadgeOnItemView(MenuItem menuItem, int i2) {
        ActionBarView actionBarView = this.mActionView;
        if (actionBarView == null || !actionBarView.isEndActionMenuEnable()) {
            return;
        }
        this.mActionView.addBadgeOnItemView(menuItem, i2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, int i2) {
        addTab(cVar, i2, this.mTabs.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(ActionBar.c cVar, int i2, boolean z) {
        if (!isFragmentViewPagerMode()) {
            internalAddTab(cVar, i2, z);
            return;
        }
        throw new IllegalStateException("Cannot add tab directly in fragment view pager mode!\n Please using addFragmentTab().");
    }

    @Override // defpackage.wc0
    public void setExpandState(int i2, boolean z) {
        this.mActionView.setExpandStateByUser(i2);
        this.mActionView.setExpandState(i2, z, false);
        ActionBarContextView actionBarContextView = this.mContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setExpandStateByUser(i2);
            this.mContextView.setExpandState(i2, z, false);
        }
    }

    @Override // defpackage.wc0
    public void setTabIconWithPosition(int i2, int i3, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.mTabScrollView.l(i2, i3, drawable, drawable2, drawable3, drawable4);
        this.mExpandTabScrollView.l(i2, i3, drawable, drawable2, drawable3, drawable4);
        this.mSecondaryTabScrollView.x(i2, i3, drawable, drawable2, drawable3, drawable4);
        this.mSecondaryExpandTabScrollView.x(i2, i3, drawable, drawable2, drawable3, drawable4);
    }

    public void internalAddTab(ActionBar.c cVar, int i2) {
        internalAddTab(cVar, i2, i2 == getTabCount());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int i2) {
        if ((i2 & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        this.mActionView.setDisplayOptions(i2);
        int displayOptions = this.mActionView.getDisplayOptions();
        ActionBarContainer actionBarContainer = this.mContainerView;
        if (actionBarContainer != null) {
            actionBarContainer.setEnableBlur((displayOptions & 32768) != 0);
        }
        ActionBarContainer actionBarContainer2 = this.mSplitView;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setEnableBlur((i2 & 16384) != 0);
        }
    }

    public void internalAddTab(ActionBar.c cVar, int i2, boolean z) {
        ensureTabsExist();
        this.mTabScrollView.b(cVar, i2, z);
        this.mExpandTabScrollView.b(cVar, i2, z);
        this.mSecondaryTabScrollView.o(cVar, i2, z);
        this.mSecondaryExpandTabScrollView.o(cVar, i2, z);
        configureTab(cVar, i2);
        if (z) {
            selectTab(cVar);
        }
    }

    @Override // defpackage.wc0
    public void setExpandState(int i2, boolean z, boolean z2) {
        this.mActionView.setExpandStateByUser(i2);
        this.mActionView.setExpandState(i2, z, z2);
        ActionBarContextView actionBarContextView = this.mContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setExpandStateByUser(i2);
            this.mContextView.setExpandState(i2, z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarImpl(Fragment fragment) {
        this.mContext = ((osc) fragment).getThemedContext();
        this.mFragmentManager = fragment.getChildFragmentManager();
        init((ViewGroup) fragment.getView());
        FragmentActivity activity = fragment.getActivity();
        this.mActionView.setWindowTitle(activity != null ? activity.getTitle() : null);
    }

    public ActionBarImpl(Dialog dialog, ViewGroup viewGroup) {
        this.mContext = dialog.getContext();
        init(viewGroup);
    }
}
