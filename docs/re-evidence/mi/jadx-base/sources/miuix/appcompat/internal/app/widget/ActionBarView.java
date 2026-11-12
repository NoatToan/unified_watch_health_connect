package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.CollapsibleActionView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Scroller;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.al8;
import defpackage.awi;
import defpackage.de0;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.fe0;
import defpackage.g5j;
import defpackage.hm1;
import defpackage.ke0;
import defpackage.md0;
import defpackage.qd0;
import defpackage.s6g;
import defpackage.sii;
import defpackage.t8p;
import defpackage.uig;
import defpackage.vsi;
import defpackage.z1j;
import defpackage.zhi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.IStateStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.internal.app.widget.actionbar.CollapseTitle;
import miuix.appcompat.internal.app.widget.actionbar.ExpandTitle;
import miuix.appcompat.internal.view.menu.action.ActionMenuPresenter;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarView extends miuix.appcompat.internal.app.widget.a implements ke0 {
    private static final int DEFAULT_CUSTOM_GRAVITY = 8388627;
    public static final int DISPLAY_DEFAULT = 0;
    private static final int DISPLAY_RELAYOUT_MASK = 8223;
    private static final int ICON_INITIALIZED = 1;
    private static final int LOGO_INITIALIZED = 2;
    private static final String TAG = "ActionBarView";
    private static final int TYPE_NON_TOUCH = 1;
    private static final int TYPE_TOUCH = 0;
    private boolean mAnimateStart;
    private boolean mApplyBgBlur;
    private OnBackInvokedCallback mBackInvokedCallback;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    private TransitionListener mBottomMenuTransitionListener;
    private ActionBar.b mCallback;
    protected TransitionListener mCollapseAnimHideConfigListener;
    protected TransitionListener mCollapseAnimShowConfigListener;
    private miuix.appcompat.internal.app.widget.a.b mCollapseController;
    private FrameLayout mCollapseCustomContainer;
    private int mCollapseMainContainerHeight;
    private int mCollapseSecondaryTabHeight;
    private final int mCollapseSubtitleStyleRes;
    private FrameLayout mCollapseTabContainer;
    private ScrollingTabContainerView mCollapseTabs;
    private CollapseTitle mCollapseTitle;
    private boolean mCollapseTitleShowable;
    private int mCollapseTitleStyleRes;
    int mCollapseTotalHeight;
    private boolean mCollapsedTitleVisible;
    private Context mContext;
    private View mCustomNavView;
    private final TextWatcher mCustomTitleWatcher;
    private float mDensity;
    private int mDisplayOptions;
    private boolean mDoContainerShowAnimInFinishActionMode;
    private int mEndActionMenuItemLimit;
    private ActionMenuPresenter mEndActionMenuPresenter;
    private miuix.appcompat.internal.view.menu.d mEndMenu;
    private ActionMenuView mEndMenuView;
    private View mEndView;
    private int mExpandSubtitlePaddingBottom;
    private int mExpandTabTopPadding;
    private ScrollingTabContainerView mExpandTabs;
    private ExpandTitle mExpandTitle;
    private int mExpandTitlePaddingBottom;
    private boolean mExpandTitleVisible;
    int mExpandTotalHeight;
    View mExpandedActionView;
    private final View.OnClickListener mExpandedActionViewUpListener;
    private HomeView mExpandedHomeLayout;
    private o mExpandedMenuPresenter;
    private int mExtraPadding;
    private al8 mExtraPaddingPolicy;
    private boolean mHasNavigatorSwitchView;
    private boolean mHasStartView;
    private Drawable mHomeAsUpIndicatorDrawable;
    private int mHomeAsUpIndicatorResId;
    private HomeView mHomeLayout;
    private final int mHomeResId;
    private Drawable mIcon;
    private int mIconLogoInitIndicator;
    private boolean mInActionMode;
    private boolean mInActionModeAnimating;
    private boolean mInSearchMode;
    private ProgressBar mIndeterminateProgressView;
    private CharSequence mInitCustomTitle;
    private boolean mIsBottomMenuVisible;
    private boolean mIsCollapseTitleShowingOnResizing;
    private boolean mIsCollapsed;
    private int mItemPadding;
    private float mLastResizingProcess;
    private LifecycleOwner mLifecycleOwner;
    private LinearLayout mListNavLayout;
    private Drawable mLogo;
    private fe0 mLogoNavItem;
    private FrameLayout mMainContainer;
    private AnimConfig mMenuAnimConfig;
    protected TransitionListener mMovableAlphaShowListener;
    protected TransitionListener mMovableAnimAlphaListener;
    private miuix.appcompat.internal.app.widget.a.b mMovableController;
    private FrameLayout mMovableMainContainer;
    private int mMovableSecondaryTabHeight;
    private FrameLayout mMovableTabContainer;
    private final AdapterView.OnItemSelectedListener mNavItemSelectedListener;
    private int mNavigationMode;
    private View mNavigatorSwitch;
    private final int mNavigatorSwitchResId;
    private boolean mNeedRequestLayoutOnExpandTitleShowing;
    private boolean mNonTouchScrolling;
    private boolean mOptionalIconsVisible;
    private miuix.appcompat.internal.view.menu.d mOptionsMenu;
    private boolean mPendingCreated;
    private int mPendingHeight;
    private Runnable mPostScroll;
    private Scroller mPostScroller;
    private int mProgressBarPadding;
    private ProgressBar mProgressView;
    private Runnable mScheduleBottomMenuRunnable;
    private SecondaryTabContainerView mSecondaryCollapseTabs;
    private SecondaryTabContainerView mSecondaryExpandTabs;
    private int mSecondaryTabVerticalPadding;
    private Spinner mSpinner;
    private SpinnerAdapter mSpinnerAdapter;
    private View mStartView;
    private IStateStyle mStateChangeAnimStateStyle;
    private final View.OnClickListener mSubTitleClickListener;
    private CharSequence mSubtitle;
    private boolean mTabsExit;
    private boolean mTempResizable;
    private CharSequence mTitle;
    private boolean mTitleCenter;
    private final View.OnClickListener mTitleClickListener;
    private fe0 mTitleNavItem;
    private View mTitleUpView;
    private int mTitleUpViewMarginEnd;
    private int mTitleUpViewMarginStart;
    private boolean mTouchScrolling;
    private int mTransitionTarget;
    private int mUncollapsePaddingH;
    private int mUncollapseTabPaddingH;
    private final View.OnClickListener mUpClickListener;
    private boolean mUserSetEndActionMenuItemLimit;
    private boolean mUserTitle;
    Window.Callback mWindowCallback;

    public static class HomeView extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f26415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f26416b;
        public int c;
        public Drawable d;
        public int e;

        public HomeView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = context.getResources().getDimensionPixelOffset(dmi.f15697r);
        }

        public int a() {
            return 0;
        }

        public void b(Drawable drawable) {
            this.f26416b.setImageDrawable(drawable);
        }

        public void c(boolean z) {
            this.f26415a.setVisibility(z ? 0 : 8);
        }

        public void d(int i) {
            this.c = i;
            this.f26415a.setImageDrawable(i != 0 ? getResources().getDrawable(i) : null);
        }

        @Override // android.view.View
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            CharSequence contentDescription = getContentDescription();
            if (TextUtils.isEmpty(contentDescription)) {
                return true;
            }
            accessibilityEvent.getText().add(contentDescription);
            return true;
        }

        public void e(Drawable drawable) {
            ImageView imageView = this.f26415a;
            if (drawable == null) {
                drawable = this.d;
            }
            imageView.setImageDrawable(drawable);
            this.c = 0;
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            int i = this.c;
            if (i != 0) {
                d(i);
            }
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            this.f26415a = (ImageView) findViewById(vsi.r0);
            this.f26416b = (ImageView) findViewById(vsi.J);
            ImageView imageView = this.f26415a;
            if (imageView != null) {
                this.d = imageView.getDrawable();
                Folme.useAt(this.f26415a).hover().setFeedbackRadius(60.0f);
                Folme.useAt(this.f26415a).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f26415a, new AnimConfig[0]);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6 = (i4 - i2) / 2;
            boolean zE = dyq.e(this);
            if (this.f26415a.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26415a.getLayoutParams();
                int measuredHeight = this.f26415a.getMeasuredHeight();
                int measuredWidth = this.f26415a.getMeasuredWidth();
                int i7 = i6 - (measuredHeight / 2);
                dyq.h(this, this.f26415a, 0, i7, measuredWidth, i7 + measuredHeight);
                i5 = layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin;
                if (zE) {
                    i3 -= i5;
                } else {
                    i += i5;
                }
            } else {
                i5 = 0;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f26416b.getLayoutParams();
            int measuredHeight2 = this.f26416b.getMeasuredHeight();
            int measuredWidth2 = this.f26416b.getMeasuredWidth();
            int iMax = i5 + Math.max(layoutParams2.getMarginStart(), (((i3 - i) - this.e) / 2) - (measuredWidth2 / 2));
            int iMax2 = Math.max(layoutParams2.topMargin, i6 - (measuredHeight2 / 2));
            dyq.h(this, this.f26416b, iMax, iMax2, iMax + measuredWidth2, iMax2 + measuredHeight2);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            measureChildWithMargins(this.f26415a, i, 0, i2, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26415a.getLayoutParams();
            int measuredWidth = layoutParams.leftMargin + this.f26415a.getMeasuredWidth() + layoutParams.rightMargin;
            if (this.f26415a.getVisibility() == 8) {
                measuredWidth = 0;
            }
            int measuredHeight = layoutParams.topMargin + this.f26415a.getMeasuredHeight() + layoutParams.bottomMargin;
            measureChildWithMargins(this.f26416b, i, measuredWidth, i2, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f26416b.getLayoutParams();
            int measuredWidth2 = measuredWidth + (this.f26416b.getVisibility() != 8 ? layoutParams2.leftMargin + this.f26416b.getMeasuredWidth() + layoutParams2.rightMargin : 0);
            if (measuredWidth2 > 0) {
                measuredWidth2 += this.e;
            }
            int iMax = Math.max(measuredHeight, layoutParams2.topMargin + this.f26416b.getMeasuredHeight() + layoutParams2.bottomMargin);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                measuredWidth2 = Math.min(measuredWidth2, size);
            } else if (mode == 1073741824) {
                measuredWidth2 = size;
            }
            if (mode2 == Integer.MIN_VALUE) {
                iMax = Math.min(iMax, size2);
            } else if (mode2 == 1073741824) {
                iMax = size2;
            }
            setMeasuredDimension(measuredWidth2, iMax);
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26418b;
        public boolean c;
        public int d;
        public boolean e;
        public int f;
        public boolean g;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
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

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26417a);
            parcel.writeInt(this.f26418b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f26417a = parcel.readInt();
            this.f26418b = parcel.readInt() != 0;
            this.c = parcel.readInt() != 0;
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
            this.f = parcel.readInt();
            this.g = parcel.readInt() != 0;
        }

        @RequiresApi(api = 24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f26417a = parcel.readInt();
            this.f26418b = parcel.readInt() != 0;
            this.c = parcel.readInt() != 0;
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
            this.f = parcel.readInt();
            this.g = parcel.readInt() != 0;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!charSequence.equals(ActionBarView.this.mTitle)) {
                ActionBarView.this.mInitCustomTitle = charSequence;
            }
            if (ActionBarView.this.mExpandTitle != null) {
                ActionBarView.this.mExpandTitle.setTitle(charSequence);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26420a;

        public b(boolean z) {
            this.f26420a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarView.this.makeMenuViewShowHide(this.f26420a);
            ActionMenuView actionMenuView = ActionBarView.this.mMenuView;
            if (actionMenuView != null) {
                actionMenuView.setVisibility(0);
            }
        }
    }

    public class c extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionBarOverlayLayout f26422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f26423b;

        public c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
            this.f26422a = actionBarOverlayLayout;
            this.f26423b = i;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            if (ActionBarView.this.mAnimateStart) {
                return;
            }
            ActionBarView.this.mAnimateStart = true;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            ActionBarView.this.mAnimateStart = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, View.TRANSLATION_Y.getName());
            if (updateInfoFindByName == null) {
                return;
            }
            this.f26422a.M((int) (this.f26423b - updateInfoFindByName.getFloatValue()), 0);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26424a;

        public d(boolean z) {
            this.f26424a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarView.this.makeMenuViewShowHide(this.f26424a);
            ActionMenuView actionMenuView = ActionBarView.this.mMenuView;
            if (actionMenuView != null) {
                actionMenuView.setVisibility(0);
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionBarView.this.mPostScroller.computeScrollOffset()) {
                ActionBarView actionBarView = ActionBarView.this;
                int currY = actionBarView.mPostScroller.getCurrY();
                ActionBarView actionBarView2 = ActionBarView.this;
                actionBarView.mPendingHeight = (currY - actionBarView2.mCollapseTotalHeight) + actionBarView2.mCollapseSecondaryTabHeight;
                ActionBarView.this.requestLayout();
                if (!ActionBarView.this.mPostScroller.isFinished()) {
                    ActionBarView.this.postOnAnimation(this);
                    return;
                }
                int currY2 = ActionBarView.this.mPostScroller.getCurrY();
                ActionBarView actionBarView3 = ActionBarView.this;
                if (currY2 == actionBarView3.mCollapseTotalHeight) {
                    actionBarView3.setExpandState(0);
                    return;
                }
                int currY3 = actionBarView3.mPostScroller.getCurrY();
                ActionBarView actionBarView4 = ActionBarView.this;
                if (currY3 == actionBarView4.mCollapseTotalHeight + actionBarView4.mMovableMainContainer.getMeasuredHeight()) {
                    ActionBarView.this.setExpandState(1);
                }
            }
        }
    }

    public class f extends TransitionListener {
        public f() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
            if (ActionBarView.this.mCollapseController != null) {
                ActionBarView.this.mCollapseController.g();
            }
        }
    }

    public class g extends TransitionListener {
        public g() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.mCollapseController != null) {
                ActionBarView.this.mCollapseController.f();
            }
        }
    }

    public class h extends TransitionListener {
        public h() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
            if (ActionBarView.this.mMovableMainContainer == null || ActionBarView.this.mMovableMainContainer.getVisibility() == 0) {
                return;
            }
            ActionBarView.this.mMovableController.l(0);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.mNeedRequestLayoutOnExpandTitleShowing) {
                ActionBarView.this.requestLayout();
            }
            ActionBarView.this.mNeedRequestLayoutOnExpandTitleShowing = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            if (ActionBarView.this.mNeedRequestLayoutOnExpandTitleShowing) {
                ActionBarView.this.requestLayout();
            }
        }
    }

    public class i extends TransitionListener {
        public i() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.mMovableMainContainer.getAlpha() != 0.0f) {
                if (ActionBarView.this.mMovableMainContainer.getVisibility() != 0) {
                    ActionBarView.this.mMovableController.l(0);
                    return;
                }
                return;
            }
            ActionBarView actionBarView = ActionBarView.this;
            int i = actionBarView.mInnerExpandState;
            if (i == 0) {
                if (actionBarView.mMovableMainContainer.getVisibility() != 8) {
                    ActionBarView.this.mMovableController.l(8);
                }
            } else if (i == 2 && actionBarView.mMovableMainContainer.getVisibility() != 4) {
                ActionBarView.this.mMovableController.l(4);
            }
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActionBarView.access$400(ActionBarView.this);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            miuix.appcompat.internal.view.menu.f fVar = ActionBarView.this.mExpandedMenuPresenter.f26437b;
            if (fVar != null) {
                fVar.collapseActionView();
            }
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.mWindowCallback.onMenuItemSelected(0, actionBarView.mLogoNavItem);
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.mWindowCallback.onMenuItemSelected(0, actionBarView.mTitleNavItem);
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = ActionBarView.this.mUserSubTitleClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public class o implements miuix.appcompat.internal.view.menu.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public miuix.appcompat.internal.view.menu.d f26436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public miuix.appcompat.internal.view.menu.f f26437b;

        public o() {
        }

        @Override // miuix.appcompat.internal.view.menu.h
        public void b(miuix.appcompat.internal.view.menu.d dVar, boolean z) {
        }

        @Override // miuix.appcompat.internal.view.menu.h
        public void c(Context context, miuix.appcompat.internal.view.menu.d dVar) {
            miuix.appcompat.internal.view.menu.f fVar;
            miuix.appcompat.internal.view.menu.d dVar2 = this.f26436a;
            if (dVar2 != null && (fVar = this.f26437b) != null) {
                dVar2.f(fVar);
            }
            this.f26436a = dVar;
        }

        @Override // miuix.appcompat.internal.view.menu.h
        public boolean d(miuix.appcompat.internal.view.menu.d dVar, miuix.appcompat.internal.view.menu.f fVar) {
            KeyEvent.Callback callback = ActionBarView.this.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewCollapsed();
            }
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.removeView(actionBarView.mExpandedActionView);
            ActionBarView actionBarView2 = ActionBarView.this;
            actionBarView2.removeView(actionBarView2.mExpandedHomeLayout);
            ActionBarView actionBarView3 = ActionBarView.this;
            actionBarView3.mExpandedActionView = null;
            if ((actionBarView3.mDisplayOptions & 2) != 0) {
                ActionBarView.this.mHomeLayout.setVisibility(0);
            }
            if ((ActionBarView.this.mDisplayOptions & 8) != 0) {
                if (ActionBarView.this.mCollapseTitle == null) {
                    ActionBarView.this.initTitle();
                } else {
                    ActionBarView.this.setTitleVisibility(true);
                }
            }
            if (ActionBarView.this.mCollapseTabs != null && ActionBarView.this.mNavigationMode == 2) {
                ActionBarView.this.mCollapseTabs.setVisibility(0);
            }
            if (ActionBarView.this.mExpandTabs != null && ActionBarView.this.mNavigationMode == 2) {
                ActionBarView.this.mExpandTabs.setVisibility(0);
            }
            if (ActionBarView.this.mSecondaryCollapseTabs != null && ActionBarView.this.mNavigationMode == 2) {
                ActionBarView.this.mSecondaryCollapseTabs.setVisibility(0);
            }
            if (ActionBarView.this.mSecondaryExpandTabs != null && ActionBarView.this.mNavigationMode == 2) {
                ActionBarView.this.mSecondaryExpandTabs.setVisibility(0);
            }
            if (ActionBarView.this.mSpinner != null && ActionBarView.this.mNavigationMode == 1) {
                ActionBarView.this.mSpinner.setVisibility(0);
            }
            if (ActionBarView.this.mCustomNavView != null && (ActionBarView.this.mDisplayOptions & 16) != 0) {
                ActionBarView.this.mCustomNavView.setVisibility(0);
            }
            ActionBarView.this.mExpandedHomeLayout.b(null);
            this.f26437b = null;
            ActionBarView.this.requestLayout();
            fVar.q(false);
            ActionBarView.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // miuix.appcompat.internal.view.menu.h
        public boolean f(miuix.appcompat.internal.view.menu.d dVar, miuix.appcompat.internal.view.menu.f fVar) {
            ActionBarView.this.mExpandedActionView = fVar.getActionView();
            ActionBarView.this.initExpandedHomeLayout();
            ActionBarView.this.mExpandedHomeLayout.b(ActionBarView.this.getIcon().getConstantState().newDrawable(ActionBarView.this.getResources()));
            this.f26437b = fVar;
            ViewParent parent = ActionBarView.this.mExpandedActionView.getParent();
            ActionBarView actionBarView = ActionBarView.this;
            if (parent != actionBarView) {
                actionBarView.addView(actionBarView.mExpandedActionView);
            }
            ViewParent parent2 = ActionBarView.this.mExpandedHomeLayout.getParent();
            ActionBarView actionBarView2 = ActionBarView.this;
            if (parent2 != actionBarView2) {
                actionBarView2.addView(actionBarView2.mExpandedHomeLayout);
            }
            if (ActionBarView.this.mHomeLayout != null) {
                ActionBarView.this.mHomeLayout.setVisibility(8);
            }
            if (ActionBarView.this.mCollapseTitle != null) {
                ActionBarView.this.setTitleVisibility(false);
            }
            if (ActionBarView.this.mCollapseTabs != null) {
                ActionBarView.this.mCollapseTabs.setVisibility(8);
            }
            if (ActionBarView.this.mExpandTabs != null) {
                ActionBarView.this.mExpandTabs.setVisibility(8);
            }
            if (ActionBarView.this.mSecondaryCollapseTabs != null) {
                ActionBarView.this.mSecondaryCollapseTabs.setVisibility(8);
            }
            if (ActionBarView.this.mSecondaryExpandTabs != null) {
                ActionBarView.this.mSecondaryExpandTabs.setVisibility(8);
            }
            if (ActionBarView.this.mSpinner != null) {
                ActionBarView.this.mSpinner.setVisibility(8);
            }
            if (ActionBarView.this.mCustomNavView != null) {
                ActionBarView.this.mCustomNavView.setVisibility(8);
            }
            ActionBarView.this.requestLayout();
            fVar.q(true);
            KeyEvent.Callback callback = ActionBarView.this.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewExpanded();
            }
            ActionBarView.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // miuix.appcompat.internal.view.menu.h
        public boolean flagActionItems() {
            return false;
        }

        @Override // miuix.appcompat.internal.view.menu.h
        public boolean h(miuix.appcompat.internal.view.menu.j jVar) {
            return false;
        }

        @Override // miuix.appcompat.internal.view.menu.h
        public void updateMenuView(boolean z) {
            if (this.f26437b != null) {
                miuix.appcompat.internal.view.menu.d dVar = this.f26436a;
                if (dVar != null) {
                    int size = dVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f26436a.getItem(i) == this.f26437b) {
                            return;
                        }
                    }
                }
                d(this.f26436a, this.f26437b);
            }
        }

        public /* synthetic */ o(ActionBarView actionBarView, f fVar) {
            this();
        }
    }

    public static class p extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ActionBarView> f26438a;

        public p(ActionBarView actionBarView) {
            this.f26438a = new WeakReference<>(actionBarView);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            this.f26438a.clear();
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            this.f26438a.clear();
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            ActionBarView actionBarView;
            super.onUpdate(obj, collection);
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, "actionbar_state_change");
            if (updateInfoFindByName == null || (actionBarView = this.f26438a.get()) == null) {
                return;
            }
            actionBarView.mPendingHeight = updateInfoFindByName.getIntValue();
            actionBarView.requestLayout();
        }
    }

    public ActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDisplayOptions = -1;
        this.mLifecycleOwner = null;
        this.mDoContainerShowAnimInFinishActionMode = false;
        this.mIsBottomMenuVisible = true;
        this.mPendingCreated = false;
        this.mCollapsedTitleVisible = true;
        this.mExpandTitleVisible = true;
        this.mHasStartView = false;
        this.mHasNavigatorSwitchView = false;
        this.mApplyBgBlur = false;
        this.mCollapseTitleShowable = true;
        this.mLastResizingProcess = 0.0f;
        this.mNeedRequestLayoutOnExpandTitleShowing = false;
        this.mCollapseAnimShowConfigListener = new f();
        this.mCollapseAnimHideConfigListener = new g();
        this.mMovableAlphaShowListener = new h();
        this.mMovableAnimAlphaListener = new i();
        this.mNavItemSelectedListener = new j();
        this.mExpandedActionViewUpListener = new k();
        this.mUpClickListener = new l();
        this.mTitleClickListener = new m();
        this.mSubTitleClickListener = new n();
        this.mCustomTitleWatcher = new a();
        this.mIsCollapseTitleShowingOnResizing = false;
        this.mTransitionTarget = 0;
        this.mCollapseController = new miuix.appcompat.internal.app.widget.a.b();
        this.mMovableController = new miuix.appcompat.internal.app.widget.a.b();
        this.mTouchScrolling = false;
        this.mNonTouchScrolling = false;
        this.mInActionMode = false;
        this.mInSearchMode = false;
        this.mInActionModeAnimating = false;
        this.mStateChangeAnimStateStyle = null;
        this.mPostScroll = new e();
        this.mContext = context;
        this.mPostScroller = new Scroller(context);
        this.mInActionMode = false;
        this.mInSearchMode = false;
        this.mDensity = this.mContext.getResources().getDisplayMetrics().density;
        this.mUncollapsePaddingH = context.getResources().getDimensionPixelOffset(dmi.o);
        this.mUncollapseTabPaddingH = context.getResources().getDimensionPixelOffset(dmi.p);
        this.mExpandTabTopPadding = context.getResources().getDimensionPixelOffset(dmi.q);
        this.mExpandTitlePaddingBottom = context.getResources().getDimensionPixelOffset(dmi.m);
        this.mExpandSubtitlePaddingBottom = context.getResources().getDimensionPixelOffset(dmi.g);
        this.mSecondaryTabVerticalPadding = context.getResources().getDimensionPixelOffset(dmi.e);
        this.mTitleUpViewMarginStart = context.getResources().getDimensionPixelOffset(dmi.s);
        this.mTitleUpViewMarginEnd = 0;
        this.mMovableAnimShowConfig.addListeners(this.mMovableAlphaShowListener);
        this.mMovableAnimNormalConfig.addListeners(this.mMovableAnimAlphaListener);
        this.mCollapseAnimShowConfig.addListeners(this.mCollapseAnimShowConfigListener);
        this.mCollapseAnimHideConfig.addListeners(this.mCollapseAnimHideConfigListener);
        FrameLayout frameLayout = new FrameLayout(context);
        this.mMainContainer = frameLayout;
        frameLayout.setId(vsi.f37188b);
        this.mMainContainer.setForegroundGravity(17);
        this.mMainContainer.setVisibility(0);
        this.mMainContainer.setAlpha(this.mInnerExpandState == 0 ? 1.0f : 0.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.mMovableMainContainer = frameLayout2;
        frameLayout2.setId(vsi.f);
        FrameLayout frameLayout3 = this.mMovableMainContainer;
        int i2 = this.mUncollapsePaddingH;
        frameLayout3.setPaddingRelative(i2, this.mExpandTabTopPadding, i2, this.mExpandTitlePaddingBottom);
        this.mMovableMainContainer.setVisibility(0);
        this.mMovableMainContainer.setAlpha(this.mInnerExpandState != 0 ? 1.0f : 0.0f);
        this.mCollapseController.b(this.mMainContainer);
        this.mMovableController.b(this.mMovableMainContainer);
        setBackgroundResource(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.f18626a, R.attr.actionBarStyle, 0);
        this.mNavigationMode = typedArrayObtainStyledAttributes.getInt(g5j.i, 0);
        this.mTitle = typedArrayObtainStyledAttributes.getText(g5j.g);
        this.mSubtitle = typedArrayObtainStyledAttributes.getText(g5j.f18628k);
        this.mTitleCenter = typedArrayObtainStyledAttributes.getBoolean(g5j.A, false);
        this.mLogo = typedArrayObtainStyledAttributes.getDrawable(g5j.h);
        this.mIcon = typedArrayObtainStyledAttributes.getDrawable(g5j.f18627b);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.mNavigatorSwitchResId = typedArrayObtainStyledAttributes.getResourceId(g5j.w, awi.e);
        this.mHomeResId = typedArrayObtainStyledAttributes.getResourceId(g5j.p, awi.c);
        this.mCollapseTitleStyleRes = typedArrayObtainStyledAttributes.getResourceId(g5j.m, 0);
        this.mCollapseSubtitleStyleRes = typedArrayObtainStyledAttributes.getResourceId(g5j.n, 0);
        this.mProgressBarPadding = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g5j.o, 0);
        this.mItemPadding = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g5j.q, 0);
        setDisplayOptions(typedArrayObtainStyledAttributes.getInt(g5j.j, 0));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(g5j.l, 0);
        if (resourceId != 0) {
            View viewInflate = layoutInflaterFrom.inflate(resourceId, (ViewGroup) this, false);
            this.mCustomNavView = viewInflate;
            viewInflate.setLayoutParams(new ActionBar.LayoutParams(-1, -2, DEFAULT_CUSTOM_GRAVITY));
            this.mNavigationMode = 0;
        }
        this.mTitleMinHeight = typedArrayObtainStyledAttributes.getLayoutDimension(g5j.e, 0);
        this.mTitleMaxHeight = typedArrayObtainStyledAttributes.getLayoutDimension(g5j.d, 0);
        this.mTitleMaxHeight = (hm1.d(this.mContext, zhi.o, true) && (s6g.f(this.mContext) == 2)) ? this.mContext.getResources().getDimensionPixelSize(dmi.d) : this.mTitleMaxHeight;
        this.mOptionalIconsVisible = typedArrayObtainStyledAttributes.getBoolean(g5j.y, false);
        typedArrayObtainStyledAttributes.recycle();
        this.mLogoNavItem = new fe0(context, 0, R.id.home, 0, 0, this.mTitle);
        this.mTitleNavItem = new fe0(context, 0, R.id.title, 0, 0, this.mTitle);
        postRefreshTitleControllerStatus();
    }

    public static /* synthetic */ ActionBar.b access$400(ActionBarView actionBarView) {
        actionBarView.getClass();
        return null;
    }

    private void addCustomView() {
        FrameLayout frameLayout = (FrameLayout) this.mCustomNavView.findViewById(vsi.e);
        TextView customTitleView = getCustomTitleView(frameLayout);
        if (customTitleView != null) {
            this.mInitCustomTitle = customTitleView.getText();
            freeMainContainerChildren();
            this.mCollapseCustomContainer = frameLayout;
            this.mCollapseController.b(frameLayout);
            ExpandTitle expandTitle = this.mExpandTitle;
            if (expandTitle != null) {
                expandTitle.setTitle(this.mInitCustomTitle);
                this.mExpandTitle.setTitleVisibility(0);
                this.mExpandTitle.setVisibility(0);
                this.mExpandTitle.setSubTitleVisibility(8);
                if (this.mMovableMainContainer != this.mExpandTitle.getLayout().getParent()) {
                    safeAddView(this.mMovableMainContainer, this.mExpandTitle.getLayout());
                }
            }
            customTitleView.addTextChangedListener(this.mCustomTitleWatcher);
        }
    }

    private void addEndMenuView() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        this.mEndActionMenuPresenter.e0(getResources().getBoolean(sii.f33679a));
        this.mEndActionMenuPresenter.f0(this.mEndActionMenuItemLimit);
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388613;
        ActionMenuView actionMenuView = (ActionMenuView) this.mEndActionMenuPresenter.m(this);
        ViewGroup viewGroup = (ViewGroup) actionMenuView.getParent();
        if (viewGroup != null && viewGroup != this) {
            viewGroup.removeView(actionMenuView);
        }
        addView(actionMenuView, layoutParams);
        this.mEndMenuView = actionMenuView;
    }

    private void addSecondaryTabsToCollapseTabContainers() {
        if (this.mSecondaryCollapseTabs != null) {
            FrameLayout frameLayout = this.mCollapseTabContainer;
            if (frameLayout == null) {
                FrameLayout frameLayoutCreateSecondaryTabContainer = createSecondaryTabContainer(vsi.c);
                this.mCollapseTabContainer = frameLayoutCreateSecondaryTabContainer;
                if (this.mInnerExpandState == 1) {
                    frameLayoutCreateSecondaryTabContainer.setAlpha(0.0f);
                }
            } else {
                frameLayout.removeAllViews();
            }
            this.mCollapseTabContainer.addView(this.mSecondaryCollapseTabs, new ViewGroup.LayoutParams(-1, -2));
            if (this.mCollapseTabContainer.getParent() == null) {
                addView(this.mCollapseTabContainer, new FrameLayout.LayoutParams(-1, -2));
                if (this.mInnerExpandState == 1) {
                    this.mCollapseTabContainer.setVisibility(8);
                }
                this.mCollapseController.b(this.mCollapseTabContainer);
            }
        }
    }

    private void addSecondaryTabsToExpandTabContainers() {
        if (this.mSecondaryExpandTabs != null) {
            FrameLayout frameLayout = this.mMovableTabContainer;
            if (frameLayout == null) {
                FrameLayout frameLayoutCreateSecondaryTabContainer = createSecondaryTabContainer(vsi.g);
                this.mMovableTabContainer = frameLayoutCreateSecondaryTabContainer;
                if (this.mInnerExpandState == 0) {
                    frameLayoutCreateSecondaryTabContainer.setAlpha(0.0f);
                }
            } else {
                frameLayout.removeAllViews();
            }
            this.mMovableTabContainer.addView(this.mSecondaryExpandTabs, new ViewGroup.LayoutParams(-1, -2));
            if (this.mMovableTabContainer.getParent() == null) {
                addView(this.mMovableTabContainer, new FrameLayout.LayoutParams(-1, -2));
                if (this.mInnerExpandState == 0) {
                    this.mMovableTabContainer.setVisibility(8);
                }
                this.mMovableController.b(this.mMovableTabContainer);
            }
        }
    }

    private void addSplitMenuView() {
        ActionMenuView actionMenuView = (ActionMenuView) this.mActionMenuPresenter.m(this);
        this.mMenuView = actionMenuView;
        if (actionMenuView != null && this.mScheduleBottomMenuRunnable != null) {
            actionMenuView.setVisibility(4);
            this.mMenuView.post(this.mScheduleBottomMenuRunnable);
            this.mScheduleBottomMenuRunnable = null;
        }
        boolean z = this.mBottomMenuMode == 3;
        this.mActionMenuPresenter.e0(false);
        this.mActionMenuPresenter.h0(getContext().getResources().getDisplayMetrics().widthPixels, true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        if (z) {
            layoutParams.bottomMargin = s6g.d(getContext(), 16.0f);
        }
        Rect rect = this.mPendingInset;
        if (rect != null) {
            if (z) {
                layoutParams.bottomMargin += rect.bottom;
                dyq.i(this.mMenuView, 0);
            } else {
                dyq.i(this.mMenuView, rect.bottom);
            }
        }
        if (this.mSplitView == null) {
            this.mMenuView.setLayoutParams(layoutParams);
            return;
        }
        removeMenuViewFromOldParent(this.mMenuView);
        this.mSplitView.B(this.mMenuView);
        ActionMenuView actionMenuView2 = this.mMenuView;
        if (actionMenuView2 instanceof ResponsiveActionMenuView) {
            ResponsiveActionMenuView responsiveActionMenuView = (ResponsiveActionMenuView) actionMenuView2;
            responsiveActionMenuView.setSuspendEnabled(z);
            responsiveActionMenuView.setHidden(!this.mIsBottomMenuVisible);
        }
        this.mSplitView.addView(this.mMenuView, 0, layoutParams);
        this.mSplitView.A(this.mMenuView);
        View viewFindViewById = this.mMenuView.findViewById(vsi.I);
        if (viewFindViewById != null) {
            viewFindViewById.requestLayout();
        }
        requestLayout();
    }

    private void addTabsContainer() {
        FrameLayout frameLayout;
        View view;
        View layout = null;
        if (this.mInnerExpandState == 1) {
            frameLayout = this.mMovableMainContainer;
            ExpandTitle expandTitle = this.mExpandTitle;
            if (expandTitle != null) {
                layout = expandTitle.getLayout();
            }
        } else {
            frameLayout = this.mMainContainer;
            CollapseTitle collapseTitle = this.mCollapseTitle;
            if (collapseTitle != null) {
                layout = collapseTitle.getLayout();
            }
        }
        boolean z = (!((this.mDisplayOptions & 16) != 0) || (view = this.mCustomNavView) == null || getCustomTitleView((FrameLayout) view.findViewById(vsi.e)) == null) ? false : true;
        boolean z2 = ((this.mDisplayOptions & 8) == 0 || isAllTitlesEmpty()) ? false : true;
        if ((frameLayout.getChildCount() == 0 && !z) || !z2) {
            addTabsToMainContainers();
        } else if (z) {
            addSecondaryTabsToCollapseTabContainers();
            addSecondaryTabsToExpandTabContainers();
        } else if (layout != null && layout.getParent() == frameLayout) {
            if (md0.b(this.mContext).f() || hasTabsInContainer(frameLayout)) {
                addTabsToMainContainers();
            } else {
                addSecondaryTabsToCollapseTabContainers();
                addSecondaryTabsToExpandTabContainers();
            }
        }
        if (this.mMainContainer.getParent() != this) {
            safeAddView(this, this.mMainContainer);
        }
        if (this.mMovableMainContainer.getParent() != this) {
            safeAddView(this, this.mMovableMainContainer, 0);
        }
        updateTabsLayoutParams();
        updateTightTitle();
    }

    private void addTabsToMainContainers() {
        FrameLayout frameLayout = this.mCollapseTabContainer;
        if (frameLayout != null) {
            if (frameLayout.getParent() == this) {
                removeView(this.mCollapseTabContainer);
                this.mCollapseController.c(this.mCollapseTabContainer);
            }
            this.mCollapseTabContainer.removeAllViews();
            this.mCollapseTabContainer = null;
        }
        FrameLayout frameLayout2 = this.mMovableTabContainer;
        if (frameLayout2 != null) {
            if (frameLayout2.getParent() == this) {
                removeView(this.mMovableTabContainer);
                this.mMovableController.c(this.mMovableTabContainer);
            }
            this.mMovableTabContainer.removeAllViews();
            this.mMovableTabContainer = null;
        }
        this.mMainContainer.removeAllViews();
        ScrollingTabContainerView scrollingTabContainerView = this.mCollapseTabs;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.setVisibility(0);
            safeAddView(this.mMainContainer, this.mCollapseTabs);
        }
        this.mMovableMainContainer.removeAllViews();
        ScrollingTabContainerView scrollingTabContainerView2 = this.mExpandTabs;
        if (scrollingTabContainerView2 != null) {
            scrollingTabContainerView2.setVisibility(0);
            safeAddView(this.mMovableMainContainer, this.mExpandTabs);
        }
        if (this.mInnerExpandState == 2) {
            setExpandState(this.mExpandState, false, false);
        }
    }

    private void animateLayoutWithProcess(float f2) {
        float fMin = 1.0f - Math.min(1.0f, 3.0f * f2);
        int i2 = this.mInnerExpandState;
        if (i2 == 2) {
            if (this.mLastProcess == f2) {
                this.mLastResizingProcess = fMin;
                return;
            }
            if (fMin > 0.0f) {
                if (this.mIsCollapseTitleShowingOnResizing) {
                    this.mIsCollapseTitleShowingOnResizing = false;
                    this.mCollapseController.a(0.0f, 0, 20, this.mCollapseAnimHideConfig);
                    if (this.mActionBarTransitionListeners.size() > 0) {
                        Folme.useValue("target", 0).setFlags(1L).setup(1).setTo("expand", Integer.valueOf(this.mTransitionTarget)).to("expand", 20, this.mHideProcessConfig);
                    }
                    this.mMovableController.l(0);
                }
            } else if (!this.mIsCollapseTitleShowingOnResizing) {
                this.mIsCollapseTitleShowingOnResizing = true;
                this.mCollapseController.a(1.0f, 0, 0, this.mCollapseAnimShowConfig);
                if (this.mActionBarTransitionListeners.size() > 0) {
                    Folme.useValue("target", 0).setFlags(1L).setup(0).setTo("collapse", Integer.valueOf(this.mTransitionTarget)).to("collapse", 0, this.mShowProcessConfig);
                }
                this.mCollapseController.l(0);
            }
            if (this.mLastResizingProcess != fMin) {
                this.mMovableController.a(fMin, 0, 0, this.mMovableAnimNormalConfig);
                this.mLastResizingProcess = fMin;
                return;
            }
            return;
        }
        if (i2 == 1) {
            this.mNeedRequestLayoutOnExpandTitleShowing = this.mLastResizingProcess == 0.0f;
            this.mTransitionTarget = 20;
            this.mLastResizingProcess = 1.0f;
            this.mIsCollapseTitleShowingOnResizing = false;
            if (this.mLastProcess == f2) {
                return;
            }
            this.mCollapseController.a(0.0f, 0, 20, this.mCollapseAnimHideConfig);
            this.mMovableController.a(1.0f, 0, 0, this.mMovableAnimShowConfig);
            return;
        }
        if (i2 == 0) {
            this.mNeedRequestLayoutOnExpandTitleShowing = false;
            this.mTransitionTarget = 0;
            this.mLastResizingProcess = 0.0f;
            this.mIsCollapseTitleShowingOnResizing = true;
            if (this.mLastProcess == f2) {
                return;
            }
            this.mCollapseController.a(1.0f, 0, 0, this.mCollapseAnimShowConfig);
            this.mMovableController.a(0.0f, 0, 0, this.mMovableAnimNormalConfig);
        }
    }

    private boolean canCollapseTitleBeShown() {
        if (this.mCollapseTitle == null || TextUtils.isEmpty(this.mTitle)) {
            return false;
        }
        boolean zCanTitleBeShown = this.mCollapseTitle.canTitleBeShown(this.mTitle.toString());
        if (!md0.b(this.mContext).g() || zCanTitleBeShown) {
            return zCanTitleBeShown;
        }
        return true;
    }

    private boolean canConsumeScroll() {
        return (isShowTitle() || this.mCustomNavView != null) && isResizable();
    }

    private void clipViewBounds(View view, int i2, int i3, int i4, int i5) {
        Rect rect = new Rect();
        rect.set(i2, i3, i4, i5);
        view.setClipBounds(rect);
    }

    private int computeTitleCenterLayoutStart(View view) {
        int width = (getWidth() - view.getMeasuredWidth()) / 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return width - (layoutParams instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams) layoutParams).getMarginStart() : 0);
    }

    private void createCollapseTitle(boolean z) {
        if (this.mCollapseTitle == null) {
            CollapseTitle collapseTitleC = de0.c(getContext(), this.mCollapseTitleStyleRes, this.mCollapseSubtitleStyleRes);
            this.mCollapseTitle = collapseTitleC;
            collapseTitleC.setVisible(this.mCollapsedTitleVisible);
            this.mCollapseTitle.setTextColorTransitEnable(this.mCollapseTitleColorTransitEnable, this.mInnerExpandState);
            this.mCollapseTitle.setAllTitlesClickable(this.mTitleClickable);
            this.mCollapseTitle.setTitle(this.mTitle);
            this.mCollapseTitle.setOnClickListener(this.mTitleClickListener, this.mTitleClickable);
            this.mCollapseTitle.setSubTitleOnClickListener(this.mSubTitleClickListener, this.mUserSubTitleClickListener != null);
            this.mCollapseTitle.setSubTitle(this.mSubtitle);
            if (!z) {
                safeAddView(this.mMainContainer, this.mCollapseTitle.getLayout());
                return;
            }
            if ((this.mDisplayOptions & 8) != 0) {
                if (getNavigationMode() == 2 && isTightTitleWithEmbeddedTabs()) {
                    return;
                }
                if (hasTabsInContainer(this.mMainContainer)) {
                    addSecondaryTabsToCollapseTabContainers();
                }
                this.mMainContainer.removeAllViews();
                safeAddView(this.mMainContainer, this.mCollapseTitle.getLayout());
            }
        }
    }

    private void createExpandTitle(boolean z) {
        boolean z2;
        View view;
        if (this.mExpandTitle == null) {
            ExpandTitle expandTitleD = de0.d(getContext());
            this.mExpandTitle = expandTitleD;
            expandTitleD.setVisible(this.mExpandTitleVisible);
            this.mExpandTitle.setTextColorTransitEnable(this.mExpandTitleColorTransitEnable, this.mInnerExpandState);
            this.mExpandTitle.setAllTitlesClickable(this.mTitleClickable);
            CharSequence charSequence = this.mTitle;
            if (!z || (this.mDisplayOptions & 16) == 0 || (view = this.mCustomNavView) == null || getCustomTitleView((FrameLayout) view.findViewById(vsi.e)) == null || TextUtils.isEmpty(this.mInitCustomTitle)) {
                z2 = false;
            } else {
                charSequence = this.mInitCustomTitle;
                z2 = true;
            }
            this.mExpandTitle.setTitle(charSequence);
            this.mExpandTitle.setOnClickListener(this.mTitleClickListener, this.mTitleClickable);
            this.mExpandTitle.setSubTitleOnClickListener(this.mSubTitleClickListener, this.mUserSubTitleClickListener != null);
            if (z2) {
                this.mExpandTitle.setSubTitle(null);
            } else {
                this.mExpandTitle.setSubTitle(this.mSubtitle);
            }
            if (!z) {
                safeAddView(this.mMovableMainContainer, this.mExpandTitle.getLayout());
                return;
            }
            if ((this.mDisplayOptions & 8) != 0) {
                if (getNavigationMode() == 2 && isTightTitleWithEmbeddedTabs()) {
                    return;
                }
                if (hasTabsInContainer(this.mMovableMainContainer)) {
                    addSecondaryTabsToExpandTabContainers();
                }
                this.mMovableMainContainer.removeAllViews();
                safeAddView(this.mMovableMainContainer, this.mExpandTitle.getLayout());
            }
        }
    }

    private FrameLayout createSecondaryTabContainer(int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(i2);
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), this.mSecondaryTabVerticalPadding);
        frameLayout.setVisibility(0);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Pair<miuix.appcompat.internal.view.menu.d, miuix.appcompat.internal.view.menu.d> divideHyperMenuAndSplitMenu(Menu menu) {
        miuix.appcompat.internal.view.menu.d dVar = (miuix.appcompat.internal.view.menu.d) menu;
        miuix.appcompat.internal.view.menu.d dVar2 = new miuix.appcompat.internal.view.menu.d(this.mContext);
        dVar2.N(dVar.r());
        ArrayList arrayList = new ArrayList();
        for (int size = menu.size() - 1; size >= 0; size--) {
            miuix.appcompat.internal.view.menu.f fVar = (miuix.appcompat.internal.view.menu.f) menu.getItem(size);
            if (fVar.getGroupId() == vsi.R) {
                dVar.K(size);
                SubMenu subMenu = fVar.getSubMenu();
                if (subMenu instanceof miuix.appcompat.internal.view.menu.j) {
                    ((miuix.appcompat.internal.view.menu.j) subMenu).d0(dVar2);
                }
                fVar.w(dVar2);
                arrayList.add(fVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            dVar2.a((miuix.appcompat.internal.view.menu.f) arrayList.get(size2));
        }
        return new Pair<>(dVar2, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Pair<miuix.appcompat.internal.view.menu.d, miuix.appcompat.internal.view.menu.d> divideMenuByGroup(Menu menu) {
        miuix.appcompat.internal.view.menu.d dVar = (miuix.appcompat.internal.view.menu.d) menu;
        miuix.appcompat.internal.view.menu.d dVar2 = new miuix.appcompat.internal.view.menu.d(this.mContext);
        dVar2.N(dVar.r());
        ArrayList arrayList = new ArrayList();
        for (int size = menu.size() - 1; size >= 0; size--) {
            miuix.appcompat.internal.view.menu.f fVar = (miuix.appcompat.internal.view.menu.f) menu.getItem(size);
            if (fVar.getGroupId() == vsi.N) {
                dVar.K(size);
                SubMenu subMenu = fVar.getSubMenu();
                if (subMenu instanceof miuix.appcompat.internal.view.menu.j) {
                    ((miuix.appcompat.internal.view.menu.j) subMenu).d0(dVar2);
                }
                fVar.w(dVar2);
                arrayList.add(fVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            dVar2.a((miuix.appcompat.internal.view.menu.f) arrayList.get(size2));
        }
        return new Pair<>(dVar, dVar2);
    }

    private ActionBarOverlayLayout findActionBarOverlayLayout() {
        Object parent = getParent();
        while (true) {
            View view = (View) parent;
            if (view instanceof ActionBarOverlayLayout) {
                return (ActionBarOverlayLayout) view;
            }
            if (!(view.getParent() instanceof View)) {
                throw new IllegalStateException("ActionBarOverlayLayout not found");
            }
            parent = view.getParent();
        }
    }

    private boolean freeMainContainerChildren() {
        if (hasTabsInContainer(this.mMainContainer)) {
            addSecondaryTabsToCollapseTabContainers();
        }
        if (hasTabsInContainer(this.mMovableMainContainer)) {
            addSecondaryTabsToExpandTabContainers();
        }
        this.mMainContainer.removeAllViews();
        this.mMovableMainContainer.removeAllViews();
        return true;
    }

    private ProgressBar getCircularProgressBar() {
        ProgressBar progressBar = this.mIndeterminateProgressView;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        return progressBar;
    }

    private TextView getCustomTitleView(View view) {
        if (view != null) {
            return (TextView) view.findViewById(R.id.title);
        }
        return null;
    }

    private ProgressBar getHorizontalProgressBar() {
        ProgressBar progressBar = this.mProgressView;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getIcon() {
        if ((this.mIconLogoInitIndicator & 1) != 1) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                try {
                    this.mIcon = context.getPackageManager().getActivityIcon(((Activity) this.mContext).getComponentName());
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (this.mIcon == null) {
                this.mIcon = this.mContext.getApplicationInfo().loadIcon(this.mContext.getPackageManager());
            }
            this.mIconLogoInitIndicator |= 1;
        }
        return this.mIcon;
    }

    private Drawable getLogo() {
        if ((this.mIconLogoInitIndicator & 2) != 2) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                try {
                    this.mLogo = context.getPackageManager().getActivityLogo(((Activity) this.mContext).getComponentName());
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (this.mLogo == null) {
                this.mLogo = this.mContext.getApplicationInfo().loadLogo(this.mContext.getPackageManager());
            }
            this.mIconLogoInitIndicator |= 2;
        }
        return this.mLogo;
    }

    private boolean hasTabsInContainer(ViewGroup viewGroup) {
        return viewGroup != null && viewGroup.getChildCount() == 1 && (viewGroup.getChildAt(0) instanceof ScrollingTabContainerView);
    }

    private boolean hasTitle() {
        return !((this.mDisplayOptions & 8) == 0 || isAllTitlesEmpty()) || getNavigationMode() == 2;
    }

    private void hideProgressBars(ProgressBar progressBar, ProgressBar progressBar2) {
        if (progressBar2 != null && progressBar2.getVisibility() == 0) {
            progressBar2.setVisibility(4);
        }
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        progressBar.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initExpandedHomeLayout() {
        if (this.mExpandedHomeLayout == null) {
            HomeView homeView = (HomeView) LayoutInflater.from(this.mContext).inflate(this.mHomeResId, (ViewGroup) this, false);
            this.mExpandedHomeLayout = homeView;
            homeView.c(true);
            this.mExpandedHomeLayout.setOnClickListener(this.mExpandedActionViewUpListener);
        }
    }

    private void initHomeLayout() {
        if (this.mHomeLayout == null) {
            HomeView homeView = (HomeView) LayoutInflater.from(this.mContext).inflate(this.mHomeResId, (ViewGroup) this, false);
            this.mHomeLayout = homeView;
            homeView.setOnClickListener(this.mUpClickListener);
            this.mHomeLayout.setClickable(true);
            this.mHomeLayout.setFocusable(true);
            int i2 = this.mHomeAsUpIndicatorResId;
            if (i2 != 0) {
                this.mHomeLayout.d(i2);
                this.mHomeAsUpIndicatorResId = 0;
            }
            Drawable drawable = this.mHomeAsUpIndicatorDrawable;
            if (drawable != null) {
                this.mHomeLayout.e(drawable);
                this.mHomeAsUpIndicatorDrawable = null;
            }
            addView(this.mHomeLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initTitle() {
        this.mPendingCreated = false;
        initTitleUpView();
        if (this.mNavigationMode == 2) {
            freeMainContainerChildren();
        }
        int i2 = this.mInnerExpandState;
        if (i2 == 1) {
            if (this.mExpandTitle == null) {
                createExpandTitle(false);
            }
            miuix.appcompat.internal.app.widget.a.b bVar = this.mCollapseController;
            if (bVar != null) {
                bVar.f();
            }
        } else if (i2 == 0 && this.mCollapseTitle == null) {
            createCollapseTitle(false);
        }
        updateTightTitle();
        post(new Runnable() { // from class: zd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f41136a.lambda$initTitle$4();
            }
        });
        if (this.mExpandedActionView != null || isAllTitlesEmpty()) {
            setTitleVisibility(false);
        }
        safeAddView(this, this.mMainContainer);
        safeAddView(this, this.mMovableMainContainer, 0);
    }

    private void initTitleUpView() {
        if (this.mTitleUpView == null) {
            View viewE = de0.e(getContext(), null);
            this.mTitleUpView = viewE;
            viewE.setOnClickListener(this.mUpClickListener);
        }
        int i2 = this.mDisplayOptions;
        int i3 = 0;
        boolean z = (i2 & 4) != 0;
        boolean z2 = (i2 & 2) != 0;
        View view = this.mTitleUpView;
        if (z2) {
            i3 = 8;
        } else if (!z) {
            i3 = 4;
        }
        view.setVisibility(i3);
        this.mTitleUpView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        safeAddView(this, this.mTitleUpView);
    }

    private boolean isAllTitlesEmpty() {
        return TextUtils.isEmpty(this.mTitle) && TextUtils.isEmpty(this.mSubtitle);
    }

    private boolean isShowTitle() {
        return this.mMainContainer.getChildCount() > 0 || !(this.mCustomNavView == null || this.mCollapseCustomContainer == null);
    }

    private boolean isSimpleCustomNavView() {
        View view = this.mCustomNavView;
        if (view == null || view.getVisibility() != 0) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = this.mCustomNavView.getLayoutParams();
        ActionBar.LayoutParams layoutParams2 = layoutParams instanceof ActionBar.LayoutParams ? (ActionBar.LayoutParams) layoutParams : null;
        return layoutParams2 != null && normalizeHorizontalGravity(layoutParams2.f1402a, dyq.e(this)) == 8388613;
    }

    private boolean isTitleCenter() {
        HomeView homeView;
        return this.mTitleCenter && isSimpleCustomNavView() && ((homeView = this.mHomeLayout) == null || homeView.getVisibility() == 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTitle$4() {
        pendingCreateTitle();
        setTitleVisibility(shouldTitleVisible());
        updateTightTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfigurationChanged$1() {
        LifecycleOwner lifecycleOwner;
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter == null || !actionMenuPresenter.X() || (lifecycleOwner = this.mLifecycleOwner) == null || lifecycleOwner.getLifecycle().getState().equals(Lifecycle.State.RESUMED)) {
            return;
        }
        this.mEndActionMenuPresenter.U(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postRefreshTitleControllerStatus$0() {
        int i2 = this.mInnerExpandState;
        if (i2 == 0) {
            this.mCollapseController.k(1.0f, 0, 0, true);
            this.mMovableController.k(0.0f, 0, 0, true);
        } else if (i2 == 1) {
            this.mCollapseController.k(0.0f, 0, 20, true);
            this.mMovableController.k(1.0f, 0, 0, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSubtitle$3() {
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setSubTitleTextSize(collapseTitle.getSubtitleAdjustSize());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateCollapseTitle$2() {
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setSubTitleTextSize(collapseTitle.getSubtitleAdjustSize());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return 8388613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return 8388611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r5 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int normalizeHorizontalGravity(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r4
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 != 0) goto L1e
            r4 = 3
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r4) goto L18
            if (r5 == 0) goto L16
        L14:
            r0 = r2
            goto L1e
        L16:
            r0 = r1
            goto L1e
        L18:
            r4 = 5
            if (r0 != r4) goto L1e
            if (r5 == 0) goto L14
            goto L16
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.normalizeHorizontalGravity(int, boolean):int");
    }

    private void notifyMenuStateChange() {
        if (!this.mSplitActionBarEnable || this.mMenuView == null) {
            return;
        }
        ((ActionBarOverlayLayout) this.mSplitView.getParent()).M((int) (this.mMenuView.getCollapsedHeight() - this.mMenuView.getTranslationY()), 0);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x0205  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:123:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x020c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0217  */
    /* JADX WARN: Code duplicated, block: B:128:0x0219 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x021b  */
    /* JADX WARN: Code duplicated, block: B:130:0x021d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0220  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:139:0x0235  */
    /* JADX WARN: Code duplicated, block: B:141:0x0239  */
    /* JADX WARN: Code duplicated, block: B:142:0x023b  */
    /* JADX WARN: Code duplicated, block: B:143:0x024c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0253  */
    /* JADX WARN: Code duplicated, block: B:147:0x026e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0275  */
    /* JADX WARN: Code duplicated, block: B:150:0x0278  */
    /* JADX WARN: Code duplicated, block: B:151:0x027e  */
    /* JADX WARN: Code duplicated, block: B:155:0x028b  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2  */
    private void onLayoutCollapseViews(boolean z, int i2, int i3, int i4, int i5, int i6) {
        int iPositionChild;
        int iPositionChild2;
        int i7;
        View view;
        ProgressBar progressBar;
        ActionBar.LayoutParams layoutParams;
        int i8;
        int measuredWidth;
        int width;
        int i9;
        int i10;
        int i11;
        int paddingStart;
        int iNormalizeHorizontalGravity;
        int i12;
        int paddingBottom;
        int measuredWidth2;
        int width2;
        int width3;
        int width4;
        boolean zIsShowTitle;
        View view2;
        int iPositionChildWithOffset;
        View view3;
        int iPositionChild3;
        int iComputeTitleCenterLayoutStart;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int paddingStart2 = getPaddingStart();
        int paddingTop = getPaddingTop();
        View view4 = this.mMainContainer;
        FrameLayout frameLayout = this.mCollapseTabContainer;
        boolean zE = dyq.e(this);
        int paddingTop2 = (i5 - getPaddingTop()) - getPaddingBottom();
        if (paddingTop2 <= 0) {
            return;
        }
        int paddingEnd = (i4 - i2) - getPaddingEnd();
        ActionMenuView actionMenuView = this.mEndMenuView;
        if (actionMenuView != null && actionMenuView.getParent() == this && this.mEndMenuView.getVisibility() != 8) {
            positionChildInverse(this.mEndMenuView, paddingEnd, paddingTop, paddingTop2);
            paddingEnd -= this.mEndMenuView.getMeasuredWidth();
        }
        View view5 = this.mEndView;
        if (view5 != null && view5.getVisibility() != 8) {
            positionChildInverse(this.mEndView, paddingEnd, paddingTop, paddingTop2);
            paddingEnd -= this.mEndView.getMeasuredWidth();
        }
        ProgressBar progressBar2 = this.mIndeterminateProgressView;
        if (progressBar2 != null && progressBar2.getVisibility() != 8) {
            positionChildInverse(this.mIndeterminateProgressView, paddingEnd - this.mProgressBarPadding, paddingTop, paddingTop2);
            paddingEnd -= this.mIndeterminateProgressView.getMeasuredWidth() - (this.mProgressBarPadding * 2);
        }
        int marginEnd = paddingEnd;
        View view6 = this.mNavigatorSwitch;
        int iPositionChild4 = (view6 == null || view6.getVisibility() == 8) ? 0 : positionChild(this.mNavigatorSwitch, paddingStart2, paddingTop, paddingTop2, false);
        HomeView homeView = this.mExpandedActionView != null ? this.mExpandedHomeLayout : this.mHomeLayout;
        if (homeView == null || homeView.getVisibility() != 0) {
            View view7 = this.mStartView;
            if (view7 != null && view7.getVisibility() != 8) {
                iPositionChild = positionChild(this.mStartView, paddingStart2, paddingTop, paddingTop2, false);
            }
            iPositionChild2 = paddingStart2;
            i7 = 1;
            if (this.mExpandedActionView == null) {
                zIsShowTitle = isShowTitle();
                if ((zIsShowTitle && (getDisplayOptions() & 32) == 0) || (view2 = this.mTitleUpView) == null || view2.getVisibility() != 0) {
                    i7 = 1;
                } else {
                    if (!this.mHasStartView || this.mHasNavigatorSwitchView) {
                        iPositionChildWithOffset = positionChildWithOffset(this.mTitleUpView, iPositionChild2, paddingTop, paddingTop2, false, this.mTitleUpViewMarginStart);
                    } else {
                        iPositionChildWithOffset = positionChild(this.mTitleUpView, iPositionChild2, paddingTop, paddingTop2, false);
                    }
                    iPositionChild2 += iPositionChildWithOffset;
                }
                if (zIsShowTitle && view4 != null) {
                    iPositionChild3 = iPositionChild2 + iPositionChild4;
                    if (isTitleCenter()) {
                        if (view4.getVisibility() != 8) {
                            iComputeTitleCenterLayoutStart = computeTitleCenterLayoutStart(view4);
                        } else {
                            iComputeTitleCenterLayoutStart = iPositionChild3;
                        }
                        this.mCollapseTitleShowable = canCollapseTitleBeShown();
                        updateTightTitle();
                        measuredWidth3 = view4.getMeasuredWidth() + iComputeTitleCenterLayoutStart;
                        if (view4.getMeasuredWidth() + iPositionChild3 > marginEnd) {
                            measuredWidth4 = iPositionChild3;
                        } else {
                            if (measuredWidth3 > marginEnd) {
                                measuredWidth4 = marginEnd - view4.getMeasuredWidth();
                            } else if (iComputeTitleCenterLayoutStart < iPositionChild3) {
                                measuredWidth5 = view4.getMeasuredWidth() + iPositionChild3;
                                measuredWidth4 = iPositionChild3;
                            } else {
                                measuredWidth4 = iComputeTitleCenterLayoutStart;
                                measuredWidth5 = measuredWidth3;
                            }
                            int measuredHeight = view4.getMeasuredHeight();
                            int i13 = paddingTop + ((paddingTop2 - measuredHeight) / 2);
                            dyq.h(this, view4, measuredWidth4, i13, measuredWidth5, i13 + measuredHeight);
                        }
                        measuredWidth5 = marginEnd;
                        int measuredHeight2 = view4.getMeasuredHeight();
                        int i14 = paddingTop + ((paddingTop2 - measuredHeight2) / 2);
                        dyq.h(this, view4, measuredWidth4, i14, measuredWidth5, i14 + measuredHeight2);
                    } else {
                        iPositionChild3 += positionChild(view4, iPositionChild3, paddingTop, paddingTop2);
                    }
                    iPositionChild2 = iPositionChild3;
                }
                if (this.mNavigationMode == i7 && (view3 = this.mListNavLayout) != null) {
                    if (zIsShowTitle) {
                        iPositionChild2 += this.mItemPadding;
                    }
                    int i15 = iPositionChild2;
                    iPositionChild2 = i15 + positionChild(view3, i15, paddingTop, paddingTop2) + this.mItemPadding;
                }
            } else {
                i7 = 1;
            }
            view = this.mExpandedActionView;
            if (view == null && ((this.mDisplayOptions & 16) == 0 || (view = this.mCustomNavView) == null)) {
                view = null;
            }
            if (view != null && view.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams = layoutParams2 instanceof ActionBar.LayoutParams ? (ActionBar.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    i8 = layoutParams.f1402a;
                } else {
                    i8 = DEFAULT_CUSTOM_GRAVITY;
                }
                measuredWidth = view.getMeasuredWidth();
                if (layoutParams != null) {
                    int marginStart = iPositionChild2 + layoutParams.getMarginStart();
                    marginEnd -= layoutParams.getMarginEnd();
                    i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i9 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    width = marginStart;
                } else {
                    width = iPositionChild2;
                    i9 = 0;
                    i10 = 0;
                }
                i11 = 8388615 & i8;
                if (i11 == i7) {
                    width4 = (getWidth() - measuredWidth) / 2;
                    if (width4 < width) {
                        i11 = 8388611;
                    } else if (width4 + measuredWidth > marginEnd) {
                        i11 = 8388613;
                    }
                } else if (i8 == -1) {
                    i11 = 8388611;
                }
                paddingStart = getPaddingStart();
                iNormalizeHorizontalGravity = normalizeHorizontalGravity(i11, zE);
                if (iNormalizeHorizontalGravity != i7) {
                    width = (getWidth() - measuredWidth) / 2;
                } else if (iNormalizeHorizontalGravity != 8388611) {
                    if (iNormalizeHorizontalGravity != 8388613) {
                        width = paddingStart;
                    } else {
                        width = marginEnd - measuredWidth;
                    }
                }
                i12 = i8 & 112;
                if (i8 == -1) {
                    i12 = 16;
                }
                if (i12 != 16) {
                    paddingBottom = ((((this.mCollapseTotalHeight - i6) - getPaddingBottom()) - getPaddingTop()) - view.getMeasuredHeight()) / 2;
                } else if (i12 != 48) {
                    paddingBottom = getPaddingTop() + i10;
                } else if (i12 != 80) {
                    paddingBottom = 0;
                } else {
                    paddingBottom = (((this.mCollapseTotalHeight - i6) - getPaddingBottom()) - view.getMeasuredHeight()) - i9;
                }
                measuredWidth2 = view.getMeasuredWidth();
                if (zE) {
                    width2 = (getWidth() - width) - measuredWidth2;
                } else {
                    width2 = width;
                }
                if (zE) {
                    width3 = getWidth() - width;
                } else {
                    width3 = measuredWidth2 + width;
                }
                view.layout(width2, paddingBottom, width3, view.getMeasuredHeight() + paddingBottom);
            }
            progressBar = this.mProgressView;
            if (progressBar != null) {
                progressBar.bringToFront();
                int measuredHeight3 = this.mProgressView.getMeasuredHeight() / 2;
                ProgressBar progressBar3 = this.mProgressView;
                int i16 = this.mProgressBarPadding;
                progressBar3.layout(i16, -measuredHeight3, progressBar3.getMeasuredWidth() + i16, measuredHeight3);
            }
            if (i6 > 0) {
                int i17 = this.mUncollapseTabPaddingH + this.mExtraPadding;
                dyq.h(this, frameLayout, i17, i5, i17 + frameLayout.getMeasuredWidth(), i5 + i6);
            }
        }
        int iA = homeView.a();
        iPositionChild = positionChild(homeView, paddingStart2 + iA, paddingTop, paddingTop2, false) + iA;
        paddingStart2 += iPositionChild;
        iPositionChild2 = paddingStart2;
        i7 = 1;
        if (this.mExpandedActionView == null) {
            zIsShowTitle = isShowTitle();
            if (zIsShowTitle) {
                if (this.mHasStartView) {
                    iPositionChildWithOffset = positionChildWithOffset(this.mTitleUpView, iPositionChild2, paddingTop, paddingTop2, false, this.mTitleUpViewMarginStart);
                } else {
                    iPositionChildWithOffset = positionChildWithOffset(this.mTitleUpView, iPositionChild2, paddingTop, paddingTop2, false, this.mTitleUpViewMarginStart);
                }
                iPositionChild2 += iPositionChildWithOffset;
            } else {
                if (this.mHasStartView) {
                    iPositionChildWithOffset = positionChildWithOffset(this.mTitleUpView, iPositionChild2, paddingTop, paddingTop2, false, this.mTitleUpViewMarginStart);
                } else {
                    iPositionChildWithOffset = positionChildWithOffset(this.mTitleUpView, iPositionChild2, paddingTop, paddingTop2, false, this.mTitleUpViewMarginStart);
                }
                iPositionChild2 += iPositionChildWithOffset;
            }
            if (zIsShowTitle) {
                iPositionChild3 = iPositionChild2 + iPositionChild4;
                if (isTitleCenter()) {
                    if (view4.getVisibility() != 8) {
                        iComputeTitleCenterLayoutStart = computeTitleCenterLayoutStart(view4);
                    } else {
                        iComputeTitleCenterLayoutStart = iPositionChild3;
                    }
                    this.mCollapseTitleShowable = canCollapseTitleBeShown();
                    updateTightTitle();
                    measuredWidth3 = view4.getMeasuredWidth() + iComputeTitleCenterLayoutStart;
                    if (view4.getMeasuredWidth() + iPositionChild3 > marginEnd) {
                        measuredWidth4 = iPositionChild3;
                    } else {
                        if (measuredWidth3 > marginEnd) {
                            measuredWidth4 = marginEnd - view4.getMeasuredWidth();
                        } else if (iComputeTitleCenterLayoutStart < iPositionChild3) {
                            measuredWidth5 = view4.getMeasuredWidth() + iPositionChild3;
                            measuredWidth4 = iPositionChild3;
                        } else {
                            measuredWidth4 = iComputeTitleCenterLayoutStart;
                            measuredWidth5 = measuredWidth3;
                        }
                        int measuredHeight4 = view4.getMeasuredHeight();
                        int i18 = paddingTop + ((paddingTop2 - measuredHeight4) / 2);
                        dyq.h(this, view4, measuredWidth4, i18, measuredWidth5, i18 + measuredHeight4);
                    }
                    measuredWidth5 = marginEnd;
                    int measuredHeight5 = view4.getMeasuredHeight();
                    int i19 = paddingTop + ((paddingTop2 - measuredHeight5) / 2);
                    dyq.h(this, view4, measuredWidth4, i19, measuredWidth5, i19 + measuredHeight5);
                } else {
                    iPositionChild3 += positionChild(view4, iPositionChild3, paddingTop, paddingTop2);
                }
                iPositionChild2 = iPositionChild3;
            }
            if (this.mNavigationMode == i7) {
                if (zIsShowTitle) {
                    iPositionChild2 += this.mItemPadding;
                }
                int i110 = iPositionChild2;
                iPositionChild2 = i110 + positionChild(view3, i110, paddingTop, paddingTop2) + this.mItemPadding;
            }
        } else {
            i7 = 1;
        }
        view = this.mExpandedActionView;
        if (view == null) {
            view = null;
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 instanceof ActionBar.LayoutParams) {
            }
            if (layoutParams != null) {
                i8 = layoutParams.f1402a;
            } else {
                i8 = DEFAULT_CUSTOM_GRAVITY;
            }
            measuredWidth = view.getMeasuredWidth();
            if (layoutParams != null) {
                int marginStart2 = iPositionChild2 + layoutParams.getMarginStart();
                marginEnd -= layoutParams.getMarginEnd();
                i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i9 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                width = marginStart2;
            } else {
                width = iPositionChild2;
                i9 = 0;
                i10 = 0;
            }
            i11 = 8388615 & i8;
            if (i11 == i7) {
                width4 = (getWidth() - measuredWidth) / 2;
                if (width4 < width) {
                    i11 = 8388611;
                } else if (width4 + measuredWidth > marginEnd) {
                    i11 = 8388613;
                }
            } else if (i8 == -1) {
                i11 = 8388611;
            }
            paddingStart = getPaddingStart();
            iNormalizeHorizontalGravity = normalizeHorizontalGravity(i11, zE);
            if (iNormalizeHorizontalGravity != i7) {
                width = (getWidth() - measuredWidth) / 2;
            } else if (iNormalizeHorizontalGravity != 8388611) {
                if (iNormalizeHorizontalGravity != 8388613) {
                    width = paddingStart;
                } else {
                    width = marginEnd - measuredWidth;
                }
            }
            i12 = i8 & 112;
            if (i8 == -1) {
                i12 = 16;
            }
            if (i12 != 16) {
                paddingBottom = ((((this.mCollapseTotalHeight - i6) - getPaddingBottom()) - getPaddingTop()) - view.getMeasuredHeight()) / 2;
            } else if (i12 != 48) {
                paddingBottom = getPaddingTop() + i10;
            } else if (i12 != 80) {
                paddingBottom = 0;
            } else {
                paddingBottom = (((this.mCollapseTotalHeight - i6) - getPaddingBottom()) - view.getMeasuredHeight()) - i9;
            }
            measuredWidth2 = view.getMeasuredWidth();
            if (zE) {
                width2 = (getWidth() - width) - measuredWidth2;
            } else {
                width2 = width;
            }
            if (zE) {
                width3 = getWidth() - width;
            } else {
                width3 = measuredWidth2 + width;
            }
            view.layout(width2, paddingBottom, width3, view.getMeasuredHeight() + paddingBottom);
        }
        progressBar = this.mProgressView;
        if (progressBar != null) {
            progressBar.bringToFront();
            int measuredHeight6 = this.mProgressView.getMeasuredHeight() / 2;
            ProgressBar progressBar4 = this.mProgressView;
            int i111 = this.mProgressBarPadding;
            progressBar4.layout(i111, -measuredHeight6, progressBar4.getMeasuredWidth() + i111, measuredHeight6);
        }
        if (i6 > 0) {
            int i112 = this.mUncollapseTabPaddingH + this.mExtraPadding;
            dyq.h(this, frameLayout, i112, i5, i112 + frameLayout.getMeasuredWidth(), i5 + i6);
        }
    }

    private void pendingCreateTitle() {
        if (this.mPendingCreated) {
            return;
        }
        this.mPendingCreated = true;
        if ((this.mDisplayOptions & 8) != 0) {
            if (this.mExpandTitle == null) {
                createExpandTitle(true);
                updateExpandTitle();
            }
            if (this.mCollapseTitle == null) {
                createCollapseTitle(true);
            }
            updateCollapseTitle();
        }
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            Rect hitRect = collapseTitle.getHitRect();
            hitRect.left -= hm1.g(getContext(), zhi.e);
            setTouchDelegate(new TouchDelegate(hitRect, this.mCollapseTitle.getLayout()));
        }
    }

    private void postRefreshTitleControllerStatus() {
        post(new Runnable() { // from class: ae0
            @Override // java.lang.Runnable
            public final void run() {
                this.f912a.lambda$postRefreshTitleControllerStatus$0();
            }
        });
    }

    private void removeMenuViewFromOldParent(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    private void removeTabsFromContainer() {
        FrameLayout frameLayout = this.mCollapseTabContainer;
        if (frameLayout != null) {
            if (frameLayout.getParent() != null) {
                removeView(this.mCollapseTabContainer);
                this.mCollapseController.c(this.mCollapseTabContainer);
            }
            this.mCollapseTabContainer.removeAllViews();
            this.mCollapseTabContainer = null;
        }
        FrameLayout frameLayout2 = this.mMovableTabContainer;
        if (frameLayout2 != null) {
            if (frameLayout2.getParent() != null) {
                removeView(this.mMovableTabContainer);
                this.mMovableController.c(this.mMovableTabContainer);
            }
            this.mMovableTabContainer.removeAllViews();
            this.mMovableTabContainer = null;
        }
        SecondaryTabContainerView secondaryTabContainerView = this.mSecondaryCollapseTabs;
        if (secondaryTabContainerView != null && secondaryTabContainerView.getParent() != null) {
            removeView(this.mSecondaryCollapseTabs);
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.mSecondaryExpandTabs;
        if (secondaryTabContainerView2 != null && secondaryTabContainerView2.getParent() != null) {
            removeView(this.mSecondaryExpandTabs);
        }
        if (!this.mPostScroller.isFinished()) {
            this.mPostScroller.forceFinished(true);
        }
        removeCallbacks(this.mPostScroll);
        setExpandState(this.mExpandState);
    }

    private void safeAddView(ViewGroup viewGroup, View view) {
        safeAddView(viewGroup, view, -1);
    }

    private void scheduleBottomMenuAnimation(Runnable runnable) {
        this.mScheduleBottomMenuRunnable = runnable;
    }

    private void setTitleImpl(CharSequence charSequence) {
        boolean zShouldTitleVisible = shouldTitleVisible();
        this.mTitle = charSequence;
        if ((this.mDisplayOptions & 16) == 0 || this.mCustomNavView == null || !updateExpandTitleOnShowCustom()) {
            updateCollapseTitle();
            updateExpandTitle();
            boolean zShouldTitleVisible2 = shouldTitleVisible();
            setTitleVisibility(zShouldTitleVisible2);
            fe0 fe0Var = this.mLogoNavItem;
            if (fe0Var != null) {
                fe0Var.setTitle(charSequence);
            }
            fe0 fe0Var2 = this.mTitleNavItem;
            if (fe0Var2 != null) {
                fe0Var2.setTitle(charSequence);
            }
            if (zShouldTitleVisible && !zShouldTitleVisible2) {
                if (getNavigationMode() == 2 || isTightTitleWithEmbeddedTabs()) {
                    addTabsToMainContainers();
                    return;
                }
                return;
            }
            if (zShouldTitleVisible || !zShouldTitleVisible2) {
                return;
            }
            if (getNavigationMode() == 2 && isTightTitleWithEmbeddedTabs()) {
                return;
            }
            CollapseTitle collapseTitle = this.mCollapseTitle;
            boolean z = false;
            if (collapseTitle != null && collapseTitle.getLayout().getParent() == null) {
                z = true;
            }
            ExpandTitle expandTitle = this.mExpandTitle;
            if ((expandTitle == null || z || expandTitle.getLayout().getParent() != null) && !z) {
                return;
            }
            freeMainContainerChildren();
            CollapseTitle collapseTitle2 = this.mCollapseTitle;
            if (collapseTitle2 != null) {
                safeAddView(this.mMainContainer, collapseTitle2.getLayout());
            }
            ExpandTitle expandTitle2 = this.mExpandTitle;
            if (expandTitle2 != null) {
                safeAddView(this.mMovableMainContainer, expandTitle2.getLayout());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleVisibility(boolean z) {
        CollapseTitle collapseTitle = this.mCollapseTitle;
        int i2 = 8;
        if (collapseTitle != null) {
            collapseTitle.setVisibility(z ? 0 : 8);
        }
        ExpandTitle expandTitle = this.mExpandTitle;
        if (expandTitle != null) {
            expandTitle.setVisibility(z ? 0 : 4);
        }
        if (this.mTitleUpView != null && (getDisplayOptions() & 32) == 0) {
            int i3 = this.mDisplayOptions;
            boolean z2 = (i3 & 4) != 0;
            boolean z3 = (i3 & 2) != 0;
            View view = this.mTitleUpView;
            if (!z3) {
                i2 = z2 ? 0 : 4;
            }
            view.setVisibility(i2);
        }
        int i4 = TextUtils.isEmpty(this.mSubtitle) ? this.mExpandTitlePaddingBottom : this.mExpandSubtitlePaddingBottom;
        FrameLayout frameLayout = this.mMovableMainContainer;
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), this.mMovableMainContainer.getPaddingTop(), this.mMovableMainContainer.getPaddingEnd(), i4);
    }

    private void setupTabView(ScrollingTabContainerView scrollingTabContainerView, ScrollingTabContainerView scrollingTabContainerView2, SecondaryTabContainerView secondaryTabContainerView, SecondaryTabContainerView secondaryTabContainerView2) {
        this.mCollapseTabs = scrollingTabContainerView;
        this.mExpandTabs = scrollingTabContainerView2;
        this.mSecondaryCollapseTabs = secondaryTabContainerView;
        this.mSecondaryExpandTabs = secondaryTabContainerView2;
        if (secondaryTabContainerView != null) {
            secondaryTabContainerView.setParentApplyBlur(this.mApplyBgBlur);
        }
        SecondaryTabContainerView secondaryTabContainerView3 = this.mSecondaryExpandTabs;
        if (secondaryTabContainerView3 != null) {
            secondaryTabContainerView3.setParentApplyBlur(this.mApplyBgBlur);
        }
    }

    private boolean shouldMeasureCollapseTabContainer() {
        FrameLayout frameLayout = this.mCollapseTabContainer;
        return (frameLayout == null || frameLayout.getParent() != this || this.mCollapseTabContainer.getChildCount() == 0) ? false : true;
    }

    private boolean shouldMeasureMovableTabContainer() {
        FrameLayout frameLayout = this.mMovableTabContainer;
        return (frameLayout == null || frameLayout.getParent() != this || this.mMovableTabContainer.getChildCount() == 0) ? false : true;
    }

    private boolean shouldTitleVisible() {
        return (this.mExpandedActionView != null || (this.mDisplayOptions & 8) == 0 || isAllTitlesEmpty()) ? false : true;
    }

    private void showContainerInFinishActionMode() {
        if (getExpandState() == 0) {
            this.mCollapseController.a(1.0f, 0, 0, this.mMovableAnimNormalConfig);
        } else if (getExpandState() == 1) {
            this.mCollapseController.i(0.0f);
            this.mCollapseController.l(0);
            this.mMovableController.a(1.0f, 0, 0, this.mMovableAnimShowConfig);
        }
    }

    private void showProgressBars(ProgressBar progressBar, ProgressBar progressBar2) {
        if (progressBar2 != null && progressBar2.getVisibility() == 4) {
            progressBar2.setVisibility(0);
        }
        if (progressBar == null || progressBar.getProgress() >= 10000) {
            return;
        }
        progressBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherFindOnBackInvokedDispatcher != null && androidx.core.view.c.T(this);
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = new OnBackInvokedCallback() { // from class: xd0
                        @Override // android.window.OnBackInvokedCallback
                        public final void onBackInvoked() {
                            this.f39007a.collapseActionView();
                        }
                    };
                }
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    private void updateBadgeOnMenuItemViews() {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.l0();
        ActionMenuPresenter actionMenuPresenter2 = this.mEndActionMenuPresenter;
        if (actionMenuPresenter2 instanceof miuix.appcompat.internal.view.menu.action.a) {
            ((miuix.appcompat.internal.view.menu.action.a) actionMenuPresenter2).r0();
        }
    }

    private void updateCollapseTitle() {
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            if (collapseTitle.getTitleVisibility() != 0) {
                this.mCollapseTitle.setTitleVisibility(0);
            }
            this.mCollapseTitle.setTitle(this.mTitle);
            this.mCollapseTitle.setSubTitle(this.mSubtitle);
            post(new Runnable() { // from class: wd0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37862a.lambda$updateCollapseTitle$2();
                }
            });
        }
    }

    private void updateExpandTitle() {
        if (this.mExpandTitle != null) {
            boolean zUpdateExpandTitleOnShowCustom = (!((this.mDisplayOptions & 16) != 0) || this.mCustomNavView == null) ? false : updateExpandTitleOnShowCustom();
            this.mExpandTitle.setTitleVisibility(0);
            if (!zUpdateExpandTitleOnShowCustom) {
                this.mExpandTitle.setTitle(this.mTitle);
            }
            this.mExpandTitle.setSubTitle(this.mSubtitle);
        }
    }

    private boolean updateExpandTitleOnShowCustom() {
        TextView customTitleView = getCustomTitleView((FrameLayout) this.mCustomNavView.findViewById(vsi.e));
        if (customTitleView == null) {
            return false;
        }
        if (this.mExpandTitle == null) {
            return true;
        }
        if (TextUtils.isEmpty(this.mInitCustomTitle)) {
            this.mExpandTitle.setTitle(this.mTitle);
            customTitleView.removeTextChangedListener(this.mCustomTitleWatcher);
            customTitleView.setText(this.mTitle);
            customTitleView.addTextChangedListener(this.mCustomTitleWatcher);
        } else {
            if (!this.mInitCustomTitle.equals(customTitleView.getText())) {
                customTitleView.removeTextChangedListener(this.mCustomTitleWatcher);
                customTitleView.setText(this.mInitCustomTitle);
                customTitleView.addTextChangedListener(this.mCustomTitleWatcher);
            }
            this.mExpandTitle.setTitle(this.mInitCustomTitle);
        }
        if (this.mExpandTitle.getVisibility() != 0) {
            this.mExpandTitle.setVisibility(0);
        }
        this.mExpandTitle.setSubTitleVisibility(8);
        return true;
    }

    private void updateProgressBars(int i2) {
        ProgressBar circularProgressBar = getCircularProgressBar();
        ProgressBar horizontalProgressBar = getHorizontalProgressBar();
        if (i2 == -1) {
            if (horizontalProgressBar != null) {
                horizontalProgressBar.setVisibility((horizontalProgressBar.isIndeterminate() || horizontalProgressBar.getProgress() < 10000) ? 0 : 4);
            }
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 == -2) {
            if (horizontalProgressBar != null) {
                horizontalProgressBar.setVisibility(8);
            }
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(8);
                return;
            }
            return;
        }
        if (i2 == -3) {
            horizontalProgressBar.setIndeterminate(true);
            return;
        }
        if (i2 == -4) {
            horizontalProgressBar.setIndeterminate(false);
            return;
        }
        if (i2 < 0 || i2 > 10000) {
            return;
        }
        horizontalProgressBar.setProgress(i2);
        if (i2 < 10000) {
            showProgressBars(horizontalProgressBar, circularProgressBar);
        } else {
            hideProgressBars(horizontalProgressBar, circularProgressBar);
        }
    }

    private void updateTabsLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ScrollingTabContainerView scrollingTabContainerView = this.mCollapseTabs;
        if (scrollingTabContainerView != null && (layoutParams4 = scrollingTabContainerView.getLayoutParams()) != null) {
            layoutParams4.width = -2;
            layoutParams4.height = -1;
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.mExpandTabs;
        if (scrollingTabContainerView2 != null && (layoutParams3 = scrollingTabContainerView2.getLayoutParams()) != null) {
            layoutParams3.width = -2;
            layoutParams3.height = -2;
        }
        SecondaryTabContainerView secondaryTabContainerView = this.mSecondaryCollapseTabs;
        if (secondaryTabContainerView != null && (layoutParams2 = secondaryTabContainerView.getLayoutParams()) != null) {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.mSecondaryExpandTabs;
        if (secondaryTabContainerView2 == null || (layoutParams = secondaryTabContainerView2.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
    }

    private void updateTightTitle() {
        boolean z = isTightTitleWithEmbeddedTabs() && TextUtils.isEmpty(this.mTitle);
        boolean zIsEmpty = TextUtils.isEmpty(this.mSubtitle);
        int i2 = (!zIsEmpty || (!z && this.mCollapseTitleShowable)) ? 0 : 8;
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setTitleVisibility(i2);
        }
        int i3 = zIsEmpty ? 8 : 0;
        CollapseTitle collapseTitle2 = this.mCollapseTitle;
        if (collapseTitle2 != null) {
            collapseTitle2.setSubTitleVisibility(i3);
        }
    }

    private void updateTitleCenter() {
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.updateTitleCenter(isTitleCenter());
        }
    }

    public void addBadgeOnItemView(MenuItem menuItem, int i2) {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.K(menuItem, i2);
    }

    public void addBadgeOnMoreButton(int i2) {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter instanceof miuix.appcompat.internal.view.menu.action.a) {
            ((miuix.appcompat.internal.view.menu.action.a) actionMenuPresenter).o0(i2);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void animateToVisibility(int i2) {
        super.animateToVisibility(i2);
    }

    public void checkTabsAdded() {
        if (this.mTabsExit && this.mNavigationMode == 2 && this.mCollapseTabs.getParent() == null) {
            addTabsContainer();
        }
    }

    public void clearBadgeOnItemView(int i2) {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.L(i2);
    }

    public void clearBadgeOnMoreButton() {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter instanceof miuix.appcompat.internal.view.menu.action.a) {
            ((miuix.appcompat.internal.view.menu.action.a) actionMenuPresenter).p0();
        }
    }

    public void collapseActionView() {
        o oVar = this.mExpandedMenuPresenter;
        miuix.appcompat.internal.view.menu.f fVar = oVar == null ? null : oVar.f26437b;
        if (fVar != null) {
            fVar.collapseActionView();
        }
    }

    public ActionMenuPresenter createActionMenuPresenter(miuix.appcompat.internal.view.menu.h.a aVar) {
        ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.mContext, findActionBarOverlayLayout(), awi.K, awi.n);
        actionMenuPresenter.o(aVar);
        actionMenuPresenter.p(vsi.s);
        return actionMenuPresenter;
    }

    public miuix.appcompat.internal.view.menu.action.a createEndActionMenuPresenter(miuix.appcompat.internal.view.menu.h.a aVar, boolean z) {
        ActionBarOverlayLayout actionBarOverlayLayoutFindActionBarOverlayLayout = findActionBarOverlayLayout();
        miuix.appcompat.internal.view.menu.action.a bVar = z ? new miuix.appcompat.internal.view.menu.action.b(this.mContext, actionBarOverlayLayoutFindActionBarOverlayLayout, awi.l, awi.f3518k, awi.f3516a, awi.d) : new miuix.appcompat.internal.view.menu.action.a(this.mContext, actionBarOverlayLayoutFindActionBarOverlayLayout, awi.l, awi.f3518k, awi.f3516a, awi.d);
        bVar.o(aVar);
        bVar.p(vsi.O);
        return bVar;
    }

    public o createExpandedActionViewMenuPresenter() {
        return new o(this, null);
    }

    public void dismissEndPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.O(false);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ActionBar.LayoutParams(DEFAULT_CUSTOM_GRAVITY);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ActionBar.LayoutParams(getContext(), attributeSet);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ ActionMenuView getActionMenuView() {
        return super.getActionMenuView();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public int getBottomMenuCustomViewOffset() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView instanceof ResponsiveActionMenuView) {
            return ((ResponsiveActionMenuView) actionMenuView).getBottomMenuCustomViewOffset();
        }
        return 0;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public CollapseTitle getCollapseTitle() {
        if (this.mCollapseTitle == null) {
            createCollapseTitle(true);
        }
        return this.mCollapseTitle;
    }

    public int getCollapsedHeight() {
        return this.mCollapseTotalHeight;
    }

    public View getCustomNavigationView() {
        return this.mCustomNavView;
    }

    public int getDisplayOptions() {
        return this.mDisplayOptions;
    }

    public SpinnerAdapter getDropdownAdapter() {
        return this.mSpinnerAdapter;
    }

    public int getDropdownSelectedPosition() {
        return this.mSpinner.getSelectedItemPosition();
    }

    public int getEndActionMenuItemLimit() {
        return this.mEndActionMenuItemLimit;
    }

    public miuix.appcompat.internal.view.menu.d getEndMenu() {
        return this.mEndMenu;
    }

    public View getEndView() {
        return this.mEndView;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ int getExpandState() {
        return super.getExpandState();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public ExpandTitle getExpandTitle() {
        if (this.mExpandTitle == null) {
            createExpandTitle(true);
        }
        return this.mExpandTitle;
    }

    public int getExpandedHeight() {
        return this.mExpandTotalHeight;
    }

    public Map<Integer, Boolean> getHyperMenuPrimaryCheckedData() {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter instanceof miuix.appcompat.internal.view.menu.action.b) {
            return ((miuix.appcompat.internal.view.menu.action.b) actionMenuPresenter).t0();
        }
        return null;
    }

    public Map<Integer, Boolean[]> getHyperMenuSecondaryCheckedData() {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter instanceof miuix.appcompat.internal.view.menu.action.b) {
            return ((miuix.appcompat.internal.view.menu.action.b) actionMenuPresenter).u0();
        }
        return null;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ ActionMenuView getMenuView() {
        return super.getMenuView();
    }

    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    public int getSplitActionBarHeight(boolean z) {
        if (!z) {
            if (this.mSplitActionBarEnable) {
                return this.mSplitView.getHeight();
            }
            return 0;
        }
        ActionBarContainer actionBarContainer = this.mSplitView;
        if (actionBarContainer != null) {
            return actionBarContainer.getSplitCollapsedHeight();
        }
        return 0;
    }

    public View getStartView() {
        return this.mStartView;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public View getSubTitleView(int i2) {
        if (i2 == 0) {
            return findViewById(vsi.f37189k);
        }
        if (i2 != 1) {
            return null;
        }
        return findViewById(vsi.l);
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public View getTitleView(int i2) {
        if (i2 == 0) {
            return findViewById(vsi.m);
        }
        if (i2 != 1) {
            return null;
        }
        return findViewById(vsi.n);
    }

    public boolean hasExpandedActionView() {
        o oVar = this.mExpandedMenuPresenter;
        return (oVar == null || oVar.f26437b == null) ? false : true;
    }

    public void hideBottomMenuCustomView() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            ((ResponsiveActionMenuView) actionMenuView).C();
        }
    }

    public boolean hideEndOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.U(false);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean hideOverflowMenu() {
        return super.hideOverflowMenu();
    }

    public void initIndeterminateProgress() {
        ProgressBar progressBar = new ProgressBar(this.mContext, null, zhi.f41288b);
        this.mIndeterminateProgressView = progressBar;
        progressBar.setId(vsi.U);
        this.mIndeterminateProgressView.setVisibility(8);
        this.mIndeterminateProgressView.setIndeterminate(true);
        addView(this.mIndeterminateProgressView);
    }

    public boolean isCollapsed() {
        return this.mIsCollapsed;
    }

    public boolean isEndActionMenuEnable() {
        return this.mEndActionMenuEnable;
    }

    public boolean isEndOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.X();
    }

    public boolean isEndOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.Y();
    }

    public boolean isHyperActionMenuEnable() {
        return this.mHyperActionMenuEnable;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowing() {
        return super.isOverflowMenuShowing();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean isResizable() {
        return super.isResizable();
    }

    public boolean isSplitActionBar() {
        return this.mSplitActionBarEnable;
    }

    public boolean isTightTitleWithEmbeddedTabs() {
        return this.mTabsExit && md0.b(this.mContext).f();
    }

    public boolean isUserSetEndActionMenuItemLimit() {
        return this.mUserSetEndActionMenuItemLimit;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean isUserSetExpandState() {
        return super.isUserSetExpandState();
    }

    public void makeMenuViewShowHide(boolean z) {
        if (this.mSplitActionBarEnable && z != this.mIsBottomMenuVisible) {
            if (this.mMenuView == null) {
                scheduleBottomMenuAnimation(new d(z));
                return;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.mSplitView.getParent();
            int collapsedHeight = this.mMenuView.getCollapsedHeight();
            this.mMenuView.setTranslationY(z ? 0.0f : collapsedHeight);
            if (!z) {
                collapsedHeight = 0;
            }
            actionBarOverlayLayout.l(collapsedHeight);
            this.mIsBottomMenuVisible = z;
            ActionMenuView actionMenuView = this.mMenuView;
            if (actionMenuView instanceof ResponsiveActionMenuView) {
                ((ResponsiveActionMenuView) actionMenuView).setHidden(!z);
            }
        }
    }

    public void makeMenuViewShowHideWithAnimation(boolean z) {
        int i2;
        int i3;
        if (z == this.mIsBottomMenuVisible) {
            return;
        }
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null) {
            scheduleBottomMenuAnimation(new b(z));
            return;
        }
        this.mIsBottomMenuVisible = z;
        this.mAnimateStart = false;
        if (this.mSplitActionBarEnable) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) getParent().getParent();
            int collapsedHeight = actionMenuView == null ? 0 : actionMenuView.getCollapsedHeight();
            if (z) {
                i3 = 0;
                i2 = collapsedHeight;
            } else {
                i2 = 0;
                i3 = collapsedHeight;
            }
            if (actionMenuView != null) {
                if (this.mMenuAnimConfig == null) {
                    this.mMenuAnimConfig = new AnimConfig().setEase(-2, 0.95f, 0.25f);
                }
                TransitionListener transitionListener = this.mBottomMenuTransitionListener;
                if (transitionListener != null) {
                    this.mMenuAnimConfig.removeListeners(transitionListener);
                }
                AnimConfig animConfig = this.mMenuAnimConfig;
                c cVar = new c(actionBarOverlayLayout, collapsedHeight);
                this.mBottomMenuTransitionListener = cVar;
                animConfig.addListeners(cVar);
                actionMenuView.setTranslationY(i2);
                Folme.useAt(actionMenuView).state().to(new AnimState("menu_end_state").add(ViewProperty.TRANSLATION_Y, i3), this.mMenuAnimConfig);
                if (actionMenuView instanceof ResponsiveActionMenuView) {
                    ((ResponsiveActionMenuView) actionMenuView).setHidden(!this.mIsBottomMenuVisible);
                }
            }
        }
    }

    public void onActionModeEnd(boolean z) {
        this.mInActionMode = false;
        if (!this.mInSearchMode) {
            setAlpha(0.0f);
            setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, SleepAnalyzerAlpha.NAME_ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.start();
        }
        this.mInSearchMode = false;
        if (getExpandState() == 0) {
            this.mCollapseController.l(0);
            this.mMovableController.l(8);
        } else if (getExpandState() == 1) {
            this.mCollapseController.l(4);
            this.mMovableController.l(0);
        }
        View view = this.mStartView;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.mEndView;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.mTitleUpView;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        View view4 = this.mNavigatorSwitch;
        if (view4 != null) {
            uig uigVar = (uig) view4.getTag(vsi.Q);
            if (uigVar != null) {
                uigVar.a(false, 0.0f);
            } else {
                this.mNavigatorSwitch.setAlpha(1.0f);
            }
        }
        if (z) {
            this.mMovableController.h(true);
            this.mCollapseController.h(true);
            postRefreshTitleControllerStatus();
        }
    }

    public void onActionModeStart(boolean z, boolean z2) {
        this.mInActionMode = true;
        this.mInSearchMode = z;
        if (z) {
            this.mCollapseController.i(0.0f);
            this.mMovableController.i(0.0f);
        } else {
            this.mCollapseController.l(8);
            this.mMovableController.l(8);
            setVisibility(8);
        }
        View view = this.mStartView;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        View view2 = this.mEndView;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        View view3 = this.mTitleUpView;
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        View view4 = this.mNavigatorSwitch;
        if (view4 != null) {
            uig uigVar = (uig) view4.getTag(vsi.Q);
            if (uigVar != null) {
                uigVar.a(true, 0.0f);
            } else {
                this.mNavigatorSwitch.setAlpha(0.0f);
            }
        }
        if (z2) {
            this.mMovableController.h(false);
            this.mCollapseController.h(false);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onAnimatedExpandStateChanged(int i2, int i3) {
        IStateStyle iStateStyle = this.mStateChangeAnimStateStyle;
        if (iStateStyle != null) {
            iStateStyle.cancel();
        }
        if (i2 == 1) {
            this.mPendingHeight = this.mMovableMainContainer.getMeasuredHeight() + this.mMovableSecondaryTabHeight;
        } else if (i2 == 0) {
            this.mPendingHeight = 0;
        }
        AnimConfig animConfigAddListeners = new AnimConfig().addListeners(new p(this));
        int measuredHeight = i3 == 1 ? this.mMovableMainContainer.getMeasuredHeight() + this.mMovableSecondaryTabHeight : 0;
        if (i3 == 1) {
            this.mCollapseController.l(4);
        } else if (i3 == 0) {
            this.mCollapseController.l(0);
        }
        this.mStateChangeAnimStateStyle = Folme.useValue(new Object[0]).setFlags(1L).setTo("actionbar_state_change", Integer.valueOf(this.mPendingHeight)).to("actionbar_state_change", Integer.valueOf(measuredHeight), animConfigAddListeners);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mCollapseController.d();
        this.mMovableController.d();
        updateBackInvokedCallbackState();
    }

    @Override // miuix.appcompat.internal.app.widget.a, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, g5j.f18626a, getActionBarStyle(), 0);
        this.mTitleMinHeight = typedArrayObtainStyledAttributes.getLayoutDimension(g5j.e, 0);
        this.mTitleMaxHeight = typedArrayObtainStyledAttributes.getLayoutDimension(g5j.d, 0);
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(dmi.d);
        boolean zD = hm1.d(this.mContext, zhi.o, true);
        boolean z = s6g.f(this.mContext) == 2;
        if (!zD || !z) {
            dimensionPixelSize = this.mTitleMaxHeight;
        }
        this.mTitleMaxHeight = dimensionPixelSize;
        typedArrayObtainStyledAttributes.recycle();
        Configuration configuration2 = getResources().getConfiguration();
        this.mCollapseTitleShowable = true;
        updateTightTitle();
        if ((getDisplayOptions() & 8) != 0) {
            CollapseTitle collapseTitle = this.mCollapseTitle;
            if (collapseTitle != null) {
                collapseTitle.onConfigurationChanged(configuration2);
            }
            ExpandTitle expandTitle = this.mExpandTitle;
            if (expandTitle != null) {
                expandTitle.onConfigurationChanged(configuration2);
            }
        }
        float f2 = this.mContext.getResources().getDisplayMetrics().density;
        if (f2 != this.mDensity) {
            this.mDensity = f2;
            this.mUncollapseTabPaddingH = this.mContext.getResources().getDimensionPixelOffset(dmi.p);
            this.mExpandTabTopPadding = this.mContext.getResources().getDimensionPixelOffset(dmi.q);
            this.mExpandTitlePaddingBottom = this.mContext.getResources().getDimensionPixelOffset(dmi.m);
            this.mExpandSubtitlePaddingBottom = this.mContext.getResources().getDimensionPixelOffset(dmi.g);
            this.mTitleUpViewMarginStart = this.mContext.getResources().getDimensionPixelOffset(dmi.s);
            this.mTitleUpViewMarginEnd = 0;
        }
        this.mUncollapsePaddingH = getResources().getDimensionPixelOffset(dmi.o);
        this.mMovableMainContainer.setPaddingRelative(this.mUncollapsePaddingH, getResources().getDimensionPixelOffset(dmi.q), this.mUncollapsePaddingH, TextUtils.isEmpty(this.mSubtitle) ? this.mExpandTitlePaddingBottom : this.mExpandSubtitlePaddingBottom);
        this.mSecondaryTabVerticalPadding = getResources().getDimensionPixelOffset(dmi.e);
        FrameLayout frameLayout = this.mCollapseTabContainer;
        if (frameLayout != null) {
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), this.mCollapseTabContainer.getPaddingTop(), this.mCollapseTabContainer.getPaddingEnd(), this.mSecondaryTabVerticalPadding);
        }
        FrameLayout frameLayout2 = this.mMovableTabContainer;
        if (frameLayout2 != null) {
            frameLayout2.setPaddingRelative(frameLayout2.getPaddingStart(), this.mMovableTabContainer.getPaddingTop(), this.mMovableTabContainer.getPaddingEnd(), this.mSecondaryTabVerticalPadding);
        }
        setPaddingRelative(hm1.g(getContext(), zhi.e), getPaddingTop(), hm1.g(getContext(), zhi.d), getPaddingBottom());
        if (this.mTabsExit) {
            updateTabsLayoutParams();
        }
        post(new Runnable() { // from class: ud0
            @Override // java.lang.Runnable
            public final void run() {
                this.f35641a.lambda$onConfigurationChanged$1();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.U(false);
            this.mActionMenuPresenter.V();
        }
        ActionMenuPresenter actionMenuPresenter2 = this.mEndActionMenuPresenter;
        if (actionMenuPresenter2 != null) {
            actionMenuPresenter2.U(false);
            this.mEndActionMenuPresenter.V();
        }
        this.mCollapseController.e();
        this.mMovableController.e();
        updateBackInvokedCallbackState();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onExpandStateChanged(int i2, int i3) {
        miuix.appcompat.internal.app.widget.a.b bVar;
        if (i2 == 2) {
            this.mPendingHeight = 0;
            if (!this.mPostScroller.isFinished()) {
                this.mPostScroller.forceFinished(true);
            }
        }
        if (i3 == 2 && (bVar = this.mMovableController) != null) {
            bVar.l(0);
        }
        if (i3 == 1) {
            if (this.mMovableMainContainer.getAlpha() > 0.0f) {
                miuix.appcompat.internal.app.widget.a.b bVar2 = this.mCollapseController;
                if (bVar2 != null) {
                    bVar2.k(0.0f, 0, 20, true);
                }
                miuix.appcompat.internal.app.widget.a.b bVar3 = this.mMovableController;
                if (bVar3 != null) {
                    bVar3.k(1.0f, 0, 0, true);
                }
            }
            miuix.appcompat.internal.app.widget.a.b bVar4 = this.mMovableController;
            if (bVar4 != null) {
                bVar4.l(0);
            }
        }
        if (i3 == 0) {
            miuix.appcompat.internal.app.widget.a.b bVar5 = this.mCollapseController;
            if (bVar5 != null && !this.mInActionMode) {
                bVar5.k(1.0f, 0, 0, true);
                this.mCollapseController.l(0);
                this.mCollapseController.g();
            }
            miuix.appcompat.internal.app.widget.a.b bVar6 = this.mMovableController;
            if (bVar6 != null) {
                bVar6.l(8);
            }
        } else {
            this.mPendingHeight = (getHeight() - this.mCollapseTotalHeight) + this.mCollapseSecondaryTabHeight;
        }
        if (this.mActionBarTransitionListeners.size() > 0) {
            if (this.mExpandStateBeforeResizing == i3 && this.mExpandStateOnLayout == i3) {
                return;
            }
            for (qd0 qd0Var : this.mActionBarTransitionListeners) {
                if (i3 == 1) {
                    qd0Var.a(1);
                } else if (i3 == 0) {
                    qd0Var.a(0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int iMax = Math.max(this.mTitleMinHeight, this.mMainContainer.getMeasuredHeight());
        View view = this.mCustomNavView;
        if (view != null && view.getParent() == this) {
            iMax = Math.max(iMax, this.mCustomNavView.getMeasuredHeight());
        }
        int i7 = iMax;
        int i8 = this.mCollapseSecondaryTabHeight;
        int measuredHeight = this.mMovableMainContainer.getMeasuredHeight();
        int i9 = this.mMovableSecondaryTabHeight;
        int i10 = this.mInnerExpandState;
        if (i10 == 2) {
            i6 = this.mPendingHeight;
        } else {
            i6 = i10 == 1 ? measuredHeight + i9 : 0;
        }
        int i11 = (i5 - i3) - i9;
        int i12 = i11 - i6;
        float fMin = (hasTitle() || measuredHeight != 0) ? Math.min(1.0f, ((measuredHeight + i9) - i6) / measuredHeight) : 1.0f;
        onLayoutCollapseViews(z, i2, 0, i4, i7, i8);
        onLayoutExpandViews(z, i2, i12, i4, i11, i9, fMin);
        notifyMenuStateChange();
        if (!this.mInActionMode && !this.mInActionModeAnimating) {
            animateLayoutWithProcess(fMin);
        }
        this.mLastProcess = fMin;
        updateBadgeOnMenuItemViews();
    }

    public void onLayoutExpandViews(boolean z, int i2, int i3, int i4, int i5, int i6, float f2) {
        int i7;
        int measuredWidth;
        if (hasTitle()) {
            FrameLayout frameLayout = this.mMovableMainContainer;
            FrameLayout frameLayout2 = this.mMovableTabContainer;
            int i8 = 1.0f - Math.min(1.0f, 3.0f * f2) <= 0.0f ? this.mCollapseSecondaryTabHeight : 0;
            int measuredHeight = (frameLayout == null || frameLayout.getVisibility() != 0) ? 0 : frameLayout.getMeasuredHeight();
            int i9 = this.mMovableSecondaryTabHeight;
            int i10 = (((i3 + measuredHeight) + i9) - i5) + i8;
            if (frameLayout != null && frameLayout.getVisibility() == 0 && this.mInnerExpandState != 0) {
                frameLayout.layout(i2, i5 - measuredHeight, i4, i5);
                ScrollingTabContainerView scrollingTabContainerView = hasTabsInContainer(this.mMovableMainContainer) ? (ScrollingTabContainerView) this.mMovableMainContainer.getChildAt(0) : null;
                if (scrollingTabContainerView != null) {
                    int measuredWidth2 = this.mUncollapsePaddingH;
                    if (dyq.e(this)) {
                        measuredWidth2 = (i4 - this.mUncollapsePaddingH) - scrollingTabContainerView.getMeasuredWidth();
                    }
                    scrollingTabContainerView.layout(measuredWidth2, this.mExpandTabTopPadding, scrollingTabContainerView.getMeasuredWidth() + measuredWidth2, scrollingTabContainerView.getMeasuredHeight() + this.mExpandTabTopPadding);
                }
                clipViewBounds(this.mMovableMainContainer, i2, i10, i4, measuredHeight + i9);
            }
            if (i9 <= 0 || this.mInnerExpandState == 0) {
                return;
            }
            int i11 = i2 + this.mUncollapseTabPaddingH + this.mExtraPadding;
            int i12 = i5 + i6;
            dyq.h(this, frameLayout2, i11, i12 - i9, i11 + frameLayout2.getMeasuredWidth(), i12);
            ScrollingTabContainerView scrollingTabContainerView2 = hasTabsInContainer(frameLayout2) ? (ScrollingTabContainerView) frameLayout2.getChildAt(0) : null;
            if (scrollingTabContainerView2 != null) {
                int measuredWidth3 = scrollingTabContainerView2.getMeasuredWidth();
                if (dyq.e(this)) {
                    measuredWidth = (i4 - (this.mUncollapseTabPaddingH * 2)) - scrollingTabContainerView2.getMeasuredWidth();
                    i7 = i4 - (this.mUncollapseTabPaddingH * 2);
                } else {
                    i7 = measuredWidth3;
                    measuredWidth = 0;
                }
                scrollingTabContainerView2.layout(measuredWidth, 0, i7, scrollingTabContainerView2.getMeasuredHeight());
            }
            clipViewBounds(frameLayout2, i2, i10 - (measuredHeight - i9), i4, measuredHeight + i9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0394  */
    /* JADX WARN: Code duplicated, block: B:199:0x039d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:203:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:212:0x0402  */
    /* JADX WARN: Code duplicated, block: B:213:0x041a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0421  */
    /* JADX WARN: Code duplicated, block: B:217:0x0437  */
    /* JADX WARN: Code duplicated, block: B:226:0x0448  */
    /* JADX WARN: Code duplicated, block: B:227:0x044d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0462  */
    /* JADX WARN: Code duplicated, block: B:231:0x0469  */
    /* JADX WARN: Code duplicated, block: B:234:0x0482  */
    /* JADX WARN: Code duplicated, block: B:236:0x048a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0490  */
    /* JADX WARN: Code duplicated, block: B:239:0x049f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:241:0x04a5  */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int iMax;
        int i4;
        int iMax2;
        int i5;
        int i6;
        int iMax3;
        boolean z;
        int iMax4;
        int i7;
        int i8;
        boolean zShouldMeasureCollapseTabContainer;
        boolean zShouldMeasureMovableTabContainer;
        al8 al8Var;
        int i9;
        int iMax5;
        int i10;
        int i11;
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int iMax6;
        int i12;
        ProgressBar progressBar;
        int i13;
        int i14;
        int i15;
        int i16;
        View view;
        ActionMenuView actionMenuView;
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8 && (childAt != (actionMenuView = this.mMenuView) || actionMenuView.getChildCount() != 0)) {
                i17++;
            }
        }
        if (i17 == 0) {
            setMeasuredDimension(0, 0);
            this.mIsCollapsed = true;
            return;
        }
        this.mIsCollapsed = false;
        int size = View.MeasureSpec.getSize(i2);
        int i19 = this.mTitleMaxHeight;
        int i20 = this.mTitleMinHeight;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int size2 = (i19 > 0 ? i19 : View.MeasureSpec.getSize(i3)) - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        int iMeasureChildView = (size - paddingStart) - paddingEnd;
        int iMax7 = iMeasureChildView / 2;
        boolean zHasTitle = hasTitle();
        View view2 = this.mStartView;
        if (view2 == null || view2.getVisibility() == 8) {
            iMax = 0;
        } else {
            iMeasureChildView = measureChildView(this.mStartView, iMeasureChildView, iMakeMeasureSpec, 0);
            paddingStart += this.mStartView.getMeasuredWidth();
            iMax = this.mStartView.getMeasuredHeight() + paddingTop;
        }
        View view3 = this.mEndView;
        if (view3 != null && view3.getVisibility() != 8) {
            iMeasureChildView = measureChildView(this.mEndView, iMeasureChildView, iMakeMeasureSpec, 0);
            paddingEnd += this.mEndView.getMeasuredWidth();
            iMax = Math.max(iMax, this.mEndView.getMeasuredHeight() + paddingTop);
        }
        View view4 = this.mNavigatorSwitch;
        if (view4 != null) {
            ((uig) view4.getTag(vsi.Q)).b(false, 0);
            if (this.mNavigatorSwitch.getVisibility() != 8) {
                iMeasureChildView = measureChildView(this.mNavigatorSwitch, iMeasureChildView, iMakeMeasureSpec, 0);
                paddingStart += this.mNavigatorSwitch.getMeasuredWidth();
                iMax = Math.max(iMax, this.mNavigatorSwitch.getMeasuredHeight() + paddingTop);
            }
        }
        View view5 = this.mStartView;
        if (view5 != null && view5.getVisibility() != 0) {
            this.mHasStartView = false;
        }
        View view6 = this.mNavigatorSwitch;
        if (view6 != null && view6.getVisibility() != 0) {
            this.mHasNavigatorSwitchView = false;
        }
        HomeView homeView = this.mExpandedActionView != null ? this.mExpandedHomeLayout : this.mHomeLayout;
        if (this.mStartView == null || homeView == null) {
            i4 = 8;
        } else {
            i4 = 8;
            homeView.setVisibility(8);
        }
        if (homeView == null || homeView.getVisibility() == i4) {
            iMax2 = iMax7;
        } else {
            int i21 = homeView.getLayoutParams().width;
            homeView.measure(i21 < 0 ? View.MeasureSpec.makeMeasureSpec(iMeasureChildView, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i21, 1073741824), iMakeMeasureSpec);
            int measuredWidth = homeView.getMeasuredWidth() + homeView.a();
            iMeasureChildView = Math.max(0, iMeasureChildView - measuredWidth);
            iMax2 = Math.max(0, iMeasureChildView - measuredWidth);
            paddingStart += measuredWidth;
            iMax = Math.max(iMax, homeView.getMeasuredHeight() + paddingTop);
        }
        ActionMenuView actionMenuView2 = this.mEndMenuView;
        if (actionMenuView2 != null && actionMenuView2.getParent() == this && this.mEndMenuView.getVisibility() != 8) {
            iMeasureChildView = measureChildView(this.mEndMenuView, iMeasureChildView, iMakeMeasureSpec, 0);
            iMax7 = Math.max(0, iMax7 - this.mEndMenuView.getMeasuredWidth());
            paddingEnd += this.mEndMenuView.getMeasuredWidth();
            iMax = Math.max(iMax, this.mEndMenuView.getMeasuredHeight() + paddingTop);
        }
        ProgressBar progressBar2 = this.mIndeterminateProgressView;
        if (progressBar2 != null && progressBar2.getVisibility() != 8) {
            iMeasureChildView = measureChildView(this.mIndeterminateProgressView, iMeasureChildView, iMakeMeasureSpec, this.mProgressBarPadding * 2);
            iMax7 = Math.max(0, (iMax7 - this.mIndeterminateProgressView.getMeasuredWidth()) - (this.mProgressBarPadding * 2));
            paddingEnd += this.mIndeterminateProgressView.getMeasuredWidth();
            iMax = Math.max(iMax, this.mIndeterminateProgressView.getMeasuredHeight() + paddingTop);
        }
        boolean zIsShowTitle = isShowTitle();
        if (zIsShowTitle) {
            updateTitleCenter();
        }
        if (this.mExpandedActionView != null || ((!zIsShowTitle && (getDisplayOptions() & 32) == 0) || (view = this.mTitleUpView) == null || view.getVisibility() != 0)) {
            zHasTitle = zHasTitle;
        } else {
            iMeasureChildView = measureChildView(this.mTitleUpView, iMeasureChildView, iMakeMeasureSpec, (this.mHasStartView || this.mHasNavigatorSwitchView) ? this.mTitleUpViewMarginStart + this.mTitleUpViewMarginEnd : 0);
            paddingStart += this.mTitleUpView.getMeasuredWidth() + ((this.mHasStartView || this.mHasNavigatorSwitchView) ? this.mTitleUpViewMarginStart + this.mTitleUpViewMarginEnd : 0);
            Math.max(iMax, this.mTitleUpView.getMeasuredHeight() + paddingTop);
        }
        View view7 = this.mExpandedActionView;
        if (view7 == null && ((this.mDisplayOptions & 16) == 0 || (view7 = this.mCustomNavView) == null)) {
            view7 = null;
        }
        if ((this.mStartView == null && this.mEndView == null) || view7 == null) {
            i5 = 8;
        } else {
            i5 = 8;
            view7.setVisibility(8);
        }
        if (view7 == null || view7.getVisibility() == i5) {
            size = size;
            paddingStart = paddingStart;
            i6 = paddingEnd;
            ScrollingTabContainerView scrollingTabContainerView = this.mCollapseTabs;
            if (scrollingTabContainerView == null) {
                if (view7 == null || view7.getVisibility() != 8 || zIsShowTitle) {
                    iMax3 = i20;
                } else {
                    iMax3 = i20;
                    z = true;
                }
                if (this.mExpandedActionView == null || !zIsShowTitle) {
                    iMax4 = i20;
                } else {
                    if (isTitleCenter()) {
                        int i22 = paddingStart;
                        this.mMainContainer.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, i22 > i6 ? size - (i22 * 2) : iMeasureChildView), Integer.MIN_VALUE), iMakeMeasureSpec);
                        iMeasureChildView -= this.mMainContainer.getMeasuredWidth();
                    } else {
                        iMeasureChildView = measureChildView(this.mMainContainer, iMeasureChildView, iMakeMeasureSpec, 0);
                    }
                    iMax4 = Math.max(i20, this.mMainContainer.getMeasuredHeight());
                }
                if (this.mMovableMainContainer.getChildCount() != 0) {
                    if (zHasTitle) {
                        i14 = 0;
                    } else {
                        i14 = 1073741824;
                    }
                    i7 = size;
                    i8 = 0;
                    this.mMovableMainContainer.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, i14));
                } else {
                    i7 = size;
                    i8 = 0;
                }
                zShouldMeasureCollapseTabContainer = shouldMeasureCollapseTabContainer();
                zShouldMeasureMovableTabContainer = shouldMeasureMovableTabContainer();
                this.mMovableSecondaryTabHeight = i8;
                float f2 = getResources().getConfiguration().densityDpi / 160.0f;
                al8Var = this.mExtraPaddingPolicy;
                if (al8Var == null && al8Var.h()) {
                    this.mExtraPadding = (int) (this.mExtraPaddingPolicy.f() * f2);
                    i9 = 0;
                } else {
                    i9 = 0;
                    this.mExtraPadding = 0;
                }
                iMax5 = Math.max(i9, i7 - ((this.mUncollapseTabPaddingH + this.mExtraPadding) * 2));
                i10 = i7 - ((this.mUncollapseTabPaddingH + this.mExtraPadding) * 2);
                if (zShouldMeasureMovableTabContainer) {
                    i11 = 1073741824;
                    this.mMovableTabContainer.measure(View.MeasureSpec.makeMeasureSpec(iMax5, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, i9));
                    measuredHeight = this.mMovableTabContainer.getMeasuredHeight();
                    this.mMovableSecondaryTabHeight = measuredHeight;
                } else {
                    i11 = 1073741824;
                    measuredHeight = i9;
                }
                this.mCollapseSecondaryTabHeight = i9;
                if (zShouldMeasureCollapseTabContainer) {
                    this.mCollapseTabContainer.measure(View.MeasureSpec.makeMeasureSpec(i10, i11), View.MeasureSpec.makeMeasureSpec(i9, i9));
                    measuredHeight2 = this.mCollapseTabContainer.getMeasuredHeight();
                    this.mCollapseSecondaryTabHeight = measuredHeight2;
                } else {
                    measuredHeight2 = 0;
                }
                if (this.mExpandedActionView == null && this.mNavigationMode == 1 && this.mListNavLayout != null) {
                    if (zIsShowTitle) {
                        i13 = this.mItemPadding * 2;
                    } else {
                        i13 = this.mItemPadding;
                    }
                    this.mListNavLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, iMeasureChildView - i13), Integer.MIN_VALUE), iMakeMeasureSpec);
                }
                if (zHasTitle) {
                    measuredHeight3 = this.mMovableMainContainer.getMeasuredHeight();
                } else {
                    measuredHeight3 = 0;
                }
                int iMax8 = Math.max(iMax3, iMax4 + measuredHeight2);
                this.mCollapseTotalHeight = iMax8;
                this.mCollapseTotalHeight = Math.max(i20, iMax8);
                iMax6 = Math.max(iMax3, iMax4) + measuredHeight3 + measuredHeight;
                this.mExpandTotalHeight = iMax6;
                if (z) {
                    setMeasuredDimension(i7, 0);
                    this.mIsCollapsed = true;
                    return;
                }
                i12 = this.mInnerExpandState;
                if (i12 == 2) {
                    int i23 = this.mCollapseTotalHeight;
                    setMeasuredDimension(i7, Math.max((i23 - measuredHeight2) + this.mPendingHeight, i23));
                } else if (i12 == 1) {
                    setMeasuredDimension(i7, iMax6);
                } else {
                    setMeasuredDimension(i7, this.mCollapseTotalHeight);
                }
                progressBar = this.mProgressView;
                if (progressBar != null || progressBar.getVisibility() == 8) {
                }
                this.mProgressView.measure(View.MeasureSpec.makeMeasureSpec(i7 - (this.mProgressBarPadding * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                return;
            }
            measureChildView(scrollingTabContainerView, iMeasureChildView, iMakeMeasureSpec, 0);
            iMax3 = Math.max(i20, this.mCollapseTabs.getMeasuredHeight());
        } else {
            View view8 = this.mTitleUpView;
            int measuredWidth2 = (view8 == null || view8.getVisibility() != 4) ? 0 : this.mTitleUpView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = generateLayoutParams(view7.getLayoutParams());
            ActionBar.LayoutParams layoutParams = layoutParamsGenerateLayoutParams instanceof ActionBar.LayoutParams ? (ActionBar.LayoutParams) layoutParamsGenerateLayoutParams : null;
            if (layoutParams != null) {
                i16 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            } else {
                i15 = 0;
                i16 = 0;
            }
            int i24 = i19 <= 0 ? Integer.MIN_VALUE : layoutParamsGenerateLayoutParams.height >= 0 ? 1073741824 : Integer.MIN_VALUE;
            int iMin = layoutParamsGenerateLayoutParams.height;
            i6 = paddingEnd;
            if (iMin < 0) {
                if (iMin == -1) {
                    size2 = Math.max(i20, i19);
                }
                iMin = size2 - i15;
            } else if (i19 > 0) {
                iMin = Math.min(iMin, i19);
            }
            int i25 = layoutParamsGenerateLayoutParams.width;
            int i26 = i25 != -2 ? 1073741824 : Integer.MIN_VALUE;
            int iMax9 = Math.max(0, (i25 >= 0 ? Math.min(i25, iMeasureChildView + measuredWidth2) : iMeasureChildView + measuredWidth2) - i16);
            if (((layoutParams != null ? layoutParams.f1402a : DEFAULT_CUSTOM_GRAVITY) & 8388615) == 1 && layoutParamsGenerateLayoutParams.width == -1) {
                iMax9 = Math.min(iMax2, iMax7) * 2;
            }
            View view9 = this.mNavigatorSwitch;
            if (view9 != null && view9.getVisibility() == 0) {
                iMax9 = (int) (iMax9 + ((this.mNavigatorSwitch.getMeasuredWidth() * (1.0f - this.mNavigatorSwitch.getAlpha())) - (this.mTitleUpViewMarginStart * this.mNavigatorSwitch.getAlpha())));
            }
            view7.measure(View.MeasureSpec.makeMeasureSpec(iMax9, i26), View.MeasureSpec.makeMeasureSpec(iMin, i24));
            iMeasureChildView -= (i16 + view7.getMeasuredWidth()) - measuredWidth2;
            iMax3 = Math.max(i20, view7.getMeasuredHeight());
        }
        z = false;
        if (this.mExpandedActionView == null) {
            iMax4 = i20;
        } else {
            iMax4 = i20;
        }
        if (this.mMovableMainContainer.getChildCount() != 0) {
            if (zHasTitle) {
                i14 = 0;
            } else {
                i14 = 1073741824;
            }
            i7 = size;
            i8 = 0;
            this.mMovableMainContainer.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, i14));
        } else {
            i7 = size;
            i8 = 0;
        }
        zShouldMeasureCollapseTabContainer = shouldMeasureCollapseTabContainer();
        zShouldMeasureMovableTabContainer = shouldMeasureMovableTabContainer();
        this.mMovableSecondaryTabHeight = i8;
        float f3 = getResources().getConfiguration().densityDpi / 160.0f;
        al8Var = this.mExtraPaddingPolicy;
        if (al8Var == null) {
            i9 = 0;
            this.mExtraPadding = 0;
        } else {
            i9 = 0;
            this.mExtraPadding = 0;
        }
        iMax5 = Math.max(i9, i7 - ((this.mUncollapseTabPaddingH + this.mExtraPadding) * 2));
        i10 = i7 - ((this.mUncollapseTabPaddingH + this.mExtraPadding) * 2);
        if (zShouldMeasureMovableTabContainer) {
            i11 = 1073741824;
            this.mMovableTabContainer.measure(View.MeasureSpec.makeMeasureSpec(iMax5, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, i9));
            measuredHeight = this.mMovableTabContainer.getMeasuredHeight();
            this.mMovableSecondaryTabHeight = measuredHeight;
        } else {
            i11 = 1073741824;
            measuredHeight = i9;
        }
        this.mCollapseSecondaryTabHeight = i9;
        if (zShouldMeasureCollapseTabContainer) {
            this.mCollapseTabContainer.measure(View.MeasureSpec.makeMeasureSpec(i10, i11), View.MeasureSpec.makeMeasureSpec(i9, i9));
            measuredHeight2 = this.mCollapseTabContainer.getMeasuredHeight();
            this.mCollapseSecondaryTabHeight = measuredHeight2;
        } else {
            measuredHeight2 = 0;
        }
        if (this.mExpandedActionView == null) {
            if (zIsShowTitle) {
                i13 = this.mItemPadding * 2;
            } else {
                i13 = this.mItemPadding;
            }
            this.mListNavLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, iMeasureChildView - i13), Integer.MIN_VALUE), iMakeMeasureSpec);
        }
        if (zHasTitle) {
            measuredHeight3 = this.mMovableMainContainer.getMeasuredHeight();
        } else {
            measuredHeight3 = 0;
        }
        int iMax10 = Math.max(iMax3, iMax4 + measuredHeight2);
        this.mCollapseTotalHeight = iMax10;
        this.mCollapseTotalHeight = Math.max(i20, iMax10);
        iMax6 = Math.max(iMax3, iMax4) + measuredHeight3 + measuredHeight;
        this.mExpandTotalHeight = iMax6;
        if (z) {
            setMeasuredDimension(i7, 0);
            this.mIsCollapsed = true;
            return;
        }
        i12 = this.mInnerExpandState;
        if (i12 == 2) {
            int i27 = this.mCollapseTotalHeight;
            setMeasuredDimension(i7, Math.max((i27 - measuredHeight2) + this.mPendingHeight, i27));
        } else if (i12 == 1) {
            setMeasuredDimension(i7, iMax6);
        } else {
            setMeasuredDimension(i7, this.mCollapseTotalHeight);
        }
        progressBar = this.mProgressView;
        if (progressBar != null) {
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        int i5;
        if (canConsumeScroll()) {
            int height = getHeight();
            if (i3 <= 0 || height <= (i5 = this.mCollapseTotalHeight)) {
                return;
            }
            int i6 = height - i3;
            int i7 = this.mPendingHeight;
            if (i6 >= i5) {
                this.mPendingHeight = i7 - i3;
            } else {
                this.mPendingHeight = 0;
            }
            iArr[1] = iArr[1] + i3;
            if (this.mPendingHeight != i7) {
                iArr2[1] = i3;
                requestLayout();
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        if (canConsumeScroll()) {
            int measuredHeight = this.mMovableMainContainer.getMeasuredHeight() + this.mMovableSecondaryTabHeight;
            if (!hasTitle() && (this.mDisplayOptions & 16) != 0 && this.mCustomNavView != null) {
                measuredHeight = 0;
            }
            int i7 = (this.mCollapseTotalHeight - this.mCollapseSecondaryTabHeight) + measuredHeight;
            int height = getHeight();
            if (i5 >= 0 || height >= i7) {
                return;
            }
            int i8 = this.mPendingHeight;
            if (height - i5 <= i7) {
                this.mPendingHeight = i8 - i5;
                iArr[1] = iArr[1] + i5;
            } else {
                this.mPendingHeight = measuredHeight;
                iArr[1] = iArr[1] + (-(i7 - height));
            }
            if (this.mPendingHeight != i8) {
                iArr2[1] = i5;
                requestLayout();
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        if (canConsumeScroll()) {
            if (i3 == 0) {
                this.mTouchScrolling = true;
            } else {
                this.mNonTouchScrolling = true;
            }
            if (!this.mPostScroller.isFinished()) {
                this.mPostScroller.forceFinished(true);
            }
            setExpandState(2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        miuix.appcompat.internal.view.menu.d dVar;
        MenuItem menuItemFindItem;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f26417a;
        if (i2 != 0 && this.mExpandedMenuPresenter != null && (dVar = this.mOptionsMenu) != null && (menuItemFindItem = dVar.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f26418b) {
            postShowOverflowMenu();
        }
        if (savedState.c) {
            postShowEndOverflowMenu();
        }
        if (this.mUserExpandState == -1) {
            this.mUserSetExpandState = savedState.e;
            this.mUserExpandState = savedState.f;
            setExpandState(isUserSetExpandState() ? this.mUserExpandState : savedState.d, false, false);
        }
        if (savedState.g) {
            setApplyBgBlur(this.mApplyBgBlur);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        miuix.appcompat.internal.view.menu.f fVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        o oVar = this.mExpandedMenuPresenter;
        if (oVar == null || (fVar = oVar.f26437b) == null) {
            savedState.f26417a = 0;
        } else {
            savedState.f26417a = fVar.getItemId();
        }
        savedState.f26418b = isOverflowMenuShowing();
        savedState.c = isEndOverflowMenuShowing();
        int i2 = this.mInnerExpandState;
        if (i2 == 2) {
            savedState.d = 0;
        } else {
            savedState.d = i2;
        }
        savedState.e = this.mUserSetExpandState;
        savedState.f = this.mUserExpandState;
        savedState.g = this.mApplyBgBlur;
        return savedState;
    }

    @Override // defpackage.ke0
    public void onStart(boolean z) {
        this.mInActionModeAnimating = true;
        if (z) {
            this.mDoContainerShowAnimInFinishActionMode = false;
            return;
        }
        if (getExpandState() == 0) {
            this.mCollapseController.l(0);
            this.mCollapseController.i(0.0f);
            this.mMovableController.l(8);
        } else if (getExpandState() == 1) {
            this.mCollapseController.l(4);
            this.mMovableController.l(0);
            this.mMovableController.i(0.0f);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        return this.mExpandedActionView == null || this.mCustomNavView != null;
    }

    @Override // defpackage.ke0
    public void onStop(boolean z) {
        this.mInActionModeAnimating = false;
        if (z) {
            this.mCollapseController.l(4);
            this.mMovableController.l(4);
        } else {
            if (!this.mDoContainerShowAnimInFinishActionMode) {
                showContainerInFinishActionMode();
            }
            this.mDoContainerShowAnimInFinishActionMode = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // miuix.appcompat.internal.app.widget.a
    public void onStopNestedScroll(View view, int i2) {
        boolean z;
        if (this.mTouchScrolling) {
            this.mTouchScrolling = false;
            if (this.mNonTouchScrolling) {
                z = false;
            } else {
                z = true;
            }
        } else if (this.mNonTouchScrolling) {
            this.mNonTouchScrolling = false;
            z = true;
        } else {
            z = false;
        }
        if (canConsumeScroll()) {
            int measuredHeight = this.mMovableMainContainer.getMeasuredHeight();
            int height = getHeight();
            if (z) {
                int i3 = this.mPendingHeight;
                if (i3 == 0) {
                    setExpandState(0);
                    return;
                }
                int i4 = this.mMovableSecondaryTabHeight;
                if (i3 >= measuredHeight + i4) {
                    setExpandState(1);
                    return;
                }
                int i5 = this.mCollapseTotalHeight;
                if (height > ((i4 + measuredHeight) / 2) + i5) {
                    this.mPostScroller.startScroll(0, height, 0, (i5 + measuredHeight) - height);
                } else {
                    this.mPostScroller.startScroll(0, height, 0, i5 - height);
                }
                postOnAnimation(this.mPostScroll);
            }
        }
    }

    @Override // defpackage.ke0
    public void onUpdate(boolean z, float f2) {
        if (this.mDoContainerShowAnimInFinishActionMode || z || f2 <= 0.8f) {
            return;
        }
        this.mDoContainerShowAnimInFinishActionMode = true;
        showContainerInFinishActionMode();
    }

    public void onWindowHide() {
        this.mSplitView.E();
    }

    public void onWindowShow() {
        this.mSplitView.F();
    }

    public void postShowEndOverflowMenu() {
        post(new Runnable() { // from class: yd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f40060a.showEndOverflowMenu();
            }
        });
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void refreshBottomMenu() {
        if (!this.mSplitActionBarEnable || this.mActionMenuPresenter == null) {
            return;
        }
        addSplitMenuView();
    }

    public void removeBottomMenuCustomView() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b0();
        }
    }

    public void restorePrimaryMenuCheckedData(Map<Integer, Boolean> map) {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter instanceof miuix.appcompat.internal.view.menu.action.b) {
            ((miuix.appcompat.internal.view.menu.action.b) actionMenuPresenter).v0(map);
        }
    }

    public void restoreSecondaryMenuCheckedData(Map<Integer, Boolean[]> map) {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter instanceof miuix.appcompat.internal.view.menu.action.b) {
            ((miuix.appcompat.internal.view.menu.action.b) actionMenuPresenter).w0(map);
        }
    }

    public void setApplyBgBlur(boolean z) {
        if (this.mApplyBgBlur != z) {
            this.mApplyBgBlur = z;
            SecondaryTabContainerView secondaryTabContainerView = this.mSecondaryCollapseTabs;
            if (secondaryTabContainerView != null) {
                secondaryTabContainerView.setParentApplyBlur(z);
            }
            SecondaryTabContainerView secondaryTabContainerView2 = this.mSecondaryExpandTabs;
            if (secondaryTabContainerView2 != null) {
                secondaryTabContainerView2.setParentApplyBlur(z);
            }
        }
    }

    public void setBottomMenuCustomView(View view) {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.d0(view);
        }
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i2) {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) actionMenuView).setBottomMenuCustomViewTranslationYWithPx(i2);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setBottomMenuMode(int i2) {
        super.setBottomMenuMode(i2);
    }

    public void setCallback(ActionBar.b bVar) {
    }

    public void setCollapsable(boolean z) {
    }

    public void setCustomNavigationView(View view) {
        boolean z = (this.mDisplayOptions & 16) != 0;
        View view2 = this.mCustomNavView;
        if (view2 != null && z) {
            removeView(view2);
        }
        this.mCustomNavView = view;
        if (view == null || !z) {
            this.mCollapseController.b(this.mMainContainer);
        } else {
            addView(view);
            addCustomView();
        }
    }

    public void setDisplayOptions(int i2) {
        View view;
        int i3 = this.mDisplayOptions;
        int i4 = i3 != -1 ? i2 ^ i3 : -1;
        this.mDisplayOptions = i2;
        if ((i4 & DISPLAY_RELAYOUT_MASK) != 0) {
            boolean z = (i2 & 2) != 0;
            int i5 = 8;
            if (z) {
                initHomeLayout();
                this.mHomeLayout.setVisibility(this.mExpandedActionView == null ? 0 : 8);
                if ((i4 & 4) != 0) {
                    boolean z2 = (i2 & 4) != 0;
                    this.mHomeLayout.c(z2);
                    if (z2) {
                        setHomeButtonEnabled(true);
                    }
                }
                if ((i4 & 1) != 0) {
                    Drawable logo = getLogo();
                    boolean z3 = (logo == null || (i2 & 1) == 0) ? false : true;
                    HomeView homeView = this.mHomeLayout;
                    if (!z3) {
                        logo = getIcon();
                    }
                    homeView.b(logo);
                }
            } else {
                HomeView homeView2 = this.mHomeLayout;
                if (homeView2 != null) {
                    removeView(homeView2);
                }
            }
            if ((i4 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    if (getNavigationMode() == 2) {
                        freeMainContainerChildren();
                    }
                    initTitle();
                } else {
                    CollapseTitle collapseTitle = this.mCollapseTitle;
                    if (collapseTitle != null) {
                        this.mMainContainer.removeView(collapseTitle.getLayout());
                    }
                    ExpandTitle expandTitle = this.mExpandTitle;
                    if (expandTitle != null) {
                        this.mMovableMainContainer.removeView(expandTitle.getLayout());
                    }
                    this.mCollapseTitle = null;
                    this.mExpandTitle = null;
                    if ((getDisplayOptions() & 32) == 0) {
                        removeView(this.mTitleUpView);
                        this.mTitleUpView = null;
                    }
                    if (getNavigationMode() == 2) {
                        addTabsToMainContainers();
                    }
                }
            }
            if ((i4 & 6) != 0) {
                boolean z4 = (this.mDisplayOptions & 4) != 0;
                CollapseTitle collapseTitle2 = this.mCollapseTitle;
                boolean z5 = collapseTitle2 != null && collapseTitle2.getVisibility() == 0;
                ExpandTitle expandTitle2 = this.mExpandTitle;
                boolean z6 = (expandTitle2 == null || expandTitle2.getVisibility() != 0) ? z5 : true;
                if (this.mTitleUpView != null && (z6 || (getDisplayOptions() & 32) != 0)) {
                    View view2 = this.mTitleUpView;
                    if (!z) {
                        i5 = z4 ? 0 : 4;
                    }
                    view2.setVisibility(i5);
                }
            }
            if ((i4 & 16) != 0 && (view = this.mCustomNavView) != null) {
                if ((i2 & 16) != 0) {
                    safeAddView(this, view);
                    addCustomView();
                } else {
                    removeView(view);
                }
            }
            if ((i4 & 8192) != 0) {
                if ((i2 & 8192) != 0) {
                    View viewInflate = LayoutInflater.from(this.mContext).inflate(this.mNavigatorSwitchResId, (ViewGroup) this, false);
                    this.mNavigatorSwitch = viewInflate;
                    viewInflate.setTag(vsi.Q, new uig(viewInflate));
                    Folme.useAt(this.mNavigatorSwitch).hover().setFeedbackRadius(60.0f);
                    Folme.useAt(this.mNavigatorSwitch).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.mNavigatorSwitch, new AnimConfig[0]);
                    addView(this.mNavigatorSwitch);
                } else {
                    removeView(this.mNavigatorSwitch);
                    this.mNavigatorSwitch = null;
                }
            }
            requestLayout();
        } else {
            invalidate();
        }
        HomeView homeView3 = this.mHomeLayout;
        if (homeView3 != null) {
            if (!homeView3.isEnabled()) {
                this.mHomeLayout.setContentDescription(null);
            } else if ((i2 & 4) != 0) {
                this.mHomeLayout.setContentDescription(this.mContext.getResources().getText(z1j.f40783b));
            } else {
                this.mHomeLayout.setContentDescription(this.mContext.getResources().getText(z1j.f40782a));
            }
        }
    }

    public void setDropdownAdapter(SpinnerAdapter spinnerAdapter) {
        this.mSpinnerAdapter = spinnerAdapter;
        Spinner spinner = this.mSpinner;
        if (spinner != null) {
            spinner.setAdapter(spinnerAdapter);
        }
    }

    public void setDropdownSelectedPosition(int i2) {
        this.mSpinner.setSelection(i2);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView, ScrollingTabContainerView scrollingTabContainerView2, SecondaryTabContainerView secondaryTabContainerView, SecondaryTabContainerView secondaryTabContainerView2) {
        boolean z = scrollingTabContainerView != null;
        this.mTabsExit = z;
        if (z) {
            setupTabView(scrollingTabContainerView, scrollingTabContainerView2, secondaryTabContainerView, secondaryTabContainerView2);
            if (this.mNavigationMode == 2) {
                addTabsContainer();
            }
        }
    }

    public void setEndActionMenuEnable(boolean z) {
        this.mEndActionMenuEnable = z;
    }

    public void setEndActionMenuItemLimit(int i2) {
        this.mEndActionMenuItemLimit = i2;
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f0(i2);
        }
    }

    public void setEndView(View view) {
        View view2 = this.mEndView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mEndView = view;
        if (view != null) {
            addView(view);
            Folme.useAt(this.mEndView).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
            Folme.useAt(this.mEndView).hover().setFeedbackRadius(60.0f);
            Folme.useAt(this.mEndView).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.mEndView, new AnimConfig[0]);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setExpandState(int i2) {
        super.setExpandState(i2);
    }

    public void setExtraPaddingPolicy(al8 al8Var) {
        this.mExtraPaddingPolicy = al8Var;
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        HomeView homeView = this.mHomeLayout;
        if (homeView != null) {
            homeView.e(drawable);
        } else {
            this.mHomeAsUpIndicatorDrawable = drawable;
            this.mHomeAsUpIndicatorResId = 0;
        }
    }

    public void setHomeButtonEnabled(boolean z) {
        HomeView homeView = this.mHomeLayout;
        if (homeView != null) {
            homeView.setEnabled(z);
            this.mHomeLayout.setFocusable(z);
            if (!z) {
                this.mHomeLayout.setContentDescription(null);
            } else if ((this.mDisplayOptions & 4) != 0) {
                this.mHomeLayout.setContentDescription(this.mContext.getResources().getText(z1j.f40783b));
            } else {
                this.mHomeLayout.setContentDescription(this.mContext.getResources().getText(z1j.f40782a));
            }
        }
    }

    public void setHyperActionMenuEnable(boolean z) {
        this.mHyperActionMenuEnable = z;
    }

    public void setIcon(Drawable drawable) {
        HomeView homeView;
        this.mIcon = drawable;
        this.mIconLogoInitIndicator |= 1;
        if (drawable != null && (((this.mDisplayOptions & 1) == 0 || getLogo() == null) && (homeView = this.mHomeLayout) != null)) {
            homeView.b(drawable);
        }
        if (this.mExpandedActionView != null) {
            this.mExpandedHomeLayout.b(this.mIcon.getConstantState().newDrawable(getResources()));
        }
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.mLifecycleOwner = lifecycleOwner;
    }

    public void setLogo(Drawable drawable) {
        HomeView homeView;
        this.mLogo = drawable;
        this.mIconLogoInitIndicator |= 2;
        if (drawable == null || (this.mDisplayOptions & 1) == 0 || (homeView = this.mHomeLayout) == null) {
            return;
        }
        homeView.b(drawable);
    }

    public void setMenu(Menu menu, miuix.appcompat.internal.view.menu.h.a aVar) {
        miuix.appcompat.internal.view.menu.d dVar;
        miuix.appcompat.internal.view.menu.d dVar2 = this.mOptionsMenu;
        if (dVar2 != null) {
            dVar2.M(this.mActionMenuPresenter);
            this.mOptionsMenu.M(this.mExpandedMenuPresenter);
        }
        miuix.appcompat.internal.view.menu.d dVar3 = this.mEndMenu;
        if (dVar3 != null) {
            dVar3.M(this.mEndActionMenuPresenter);
        }
        removeMenuViewFromOldParent(this.mMenuView);
        removeMenuViewFromOldParent(this.mEndMenuView);
        if (menu == null || !(this.mSplitActionBarEnable || this.mEndActionMenuEnable)) {
            this.mActionMenuPresenter = null;
            this.mEndActionMenuPresenter = null;
            this.mExpandedMenuPresenter = null;
            return;
        }
        if (this.mEndActionMenuEnable && this.mHyperActionMenuEnable) {
            Pair<miuix.appcompat.internal.view.menu.d, miuix.appcompat.internal.view.menu.d> pairDivideHyperMenuAndSplitMenu = divideHyperMenuAndSplitMenu(menu);
            this.mOptionsMenu = (miuix.appcompat.internal.view.menu.d) pairDivideHyperMenuAndSplitMenu.first;
            this.mEndMenu = (miuix.appcompat.internal.view.menu.d) pairDivideHyperMenuAndSplitMenu.second;
        } else {
            Pair<miuix.appcompat.internal.view.menu.d, miuix.appcompat.internal.view.menu.d> pairDivideMenuByGroup = divideMenuByGroup(menu);
            this.mOptionsMenu = (miuix.appcompat.internal.view.menu.d) pairDivideMenuByGroup.first;
            this.mEndMenu = (miuix.appcompat.internal.view.menu.d) pairDivideMenuByGroup.second;
        }
        if (this.mSplitActionBarEnable) {
            if (this.mActionMenuPresenter == null) {
                this.mActionMenuPresenter = createActionMenuPresenter(aVar);
                this.mExpandedMenuPresenter = createExpandedActionViewMenuPresenter();
            }
            miuix.appcompat.internal.view.menu.d dVar4 = this.mOptionsMenu;
            if (dVar4 != null) {
                dVar4.c(this.mActionMenuPresenter);
                this.mOptionsMenu.c(this.mExpandedMenuPresenter);
                this.mOptionsMenu.Q(this.mOptionalIconsVisible);
            } else {
                this.mActionMenuPresenter.c(this.mContext, null);
                this.mExpandedMenuPresenter.c(this.mContext, null);
            }
            this.mActionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
            addSplitMenuView();
        }
        if (this.mEndActionMenuEnable && (dVar = this.mEndMenu) != null && dVar.size() > 0) {
            if (this.mEndActionMenuPresenter == null) {
                this.mEndActionMenuPresenter = createEndActionMenuPresenter(aVar, this.mHyperActionMenuEnable);
            }
            this.mEndMenu.c(this.mEndActionMenuPresenter);
            this.mEndMenu.Q(this.mOptionalIconsVisible);
            this.mEndActionMenuPresenter.updateMenuView(true);
            addEndMenuView();
        }
        updateBadgeOnMenuItemViews();
        updateBackInvokedCallbackState();
    }

    public void setNavigationMode(int i2) {
        LinearLayout linearLayout;
        int i3 = this.mNavigationMode;
        if (i2 != i3) {
            if (i3 == 1 && (linearLayout = this.mListNavLayout) != null) {
                removeView(linearLayout);
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    throw new UnsupportedOperationException("MIUIX Deleted");
                }
                if (i2 == 2 && this.mTabsExit) {
                    addTabsContainer();
                }
            } else if (this.mTabsExit) {
                removeTabsFromContainer();
            }
            this.mNavigationMode = i2;
            requestLayout();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setPendingInset(Rect rect) {
        super.setPendingInset(rect);
    }

    public void setProgress(int i2) {
        updateProgressBars(i2);
    }

    public void setProgressBarIndeterminate(boolean z) {
        updateProgressBars(z ? -3 : -4);
    }

    public void setProgressBarIndeterminateVisibility(boolean z) {
        updateProgressBars(z ? -1 : -2);
    }

    public void setProgressBarVisibility(boolean z) {
        updateProgressBars(z ? -1 : -2);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setResizable(boolean z) {
        super.setResizable(z);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void setSplitActionBar(boolean z) {
        if (this.mSplitActionBarEnable != z) {
            ActionMenuView actionMenuView = this.mMenuView;
            if (actionMenuView != null) {
                removeMenuViewFromOldParent(actionMenuView);
                if (z) {
                    ActionBarContainer actionBarContainer = this.mSplitView;
                    if (actionBarContainer != null) {
                        actionBarContainer.addView(this.mMenuView);
                    }
                    this.mMenuView.getLayoutParams().width = -1;
                } else {
                    addView(this.mMenuView);
                    this.mMenuView.getLayoutParams().width = -2;
                }
                this.mMenuView.requestLayout();
            }
            ActionBarContainer actionBarContainer2 = this.mSplitView;
            if (actionBarContainer2 != null) {
                actionBarContainer2.setVisibility(z ? 0 : 8);
            }
            ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
            if (actionMenuPresenter != null) {
                if (z) {
                    actionMenuPresenter.e0(false);
                    this.mActionMenuPresenter.h0(getContext().getResources().getDisplayMetrics().widthPixels, true);
                } else {
                    actionMenuPresenter.e0(getResources().getBoolean(sii.f33679a));
                }
            }
            super.setSplitActionBar(z);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setSplitView(ActionBarContainer actionBarContainer) {
        super.setSplitView(actionBarContainer);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setSplitWhenNarrow(boolean z) {
        super.setSplitWhenNarrow(z);
    }

    public void setStartView(View view) {
        View view2 = this.mStartView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mStartView = view;
        if (view != null) {
            addView(view);
            Folme.useAt(view).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
            Folme.useAt(this.mStartView).hover().setFeedbackRadius(60.0f);
            Folme.useAt(this.mStartView).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.mStartView, new AnimConfig[0]);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void setSubTitleClickListener(View.OnClickListener onClickListener) {
        super.setSubTitleClickListener(onClickListener);
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setSubTitleClickable(onClickListener != null);
        }
        ExpandTitle expandTitle = this.mExpandTitle;
        if (expandTitle != null) {
            expandTitle.setSubTitleClickable(onClickListener != null);
        }
    }

    public void setSubTitleDrawable(t8p t8pVar) {
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setSubTitleDrawable(t8pVar);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setSubTitle(charSequence);
        }
        ExpandTitle expandTitle = this.mExpandTitle;
        if (expandTitle != null) {
            expandTitle.setSubTitle(charSequence);
        }
        setTitleVisibility(shouldTitleVisible());
        updateTightTitle();
        post(new Runnable() { // from class: vd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f36761a.lambda$setSubtitle$3();
            }
        });
    }

    public void setTitle(CharSequence charSequence) {
        this.mUserTitle = true;
        setTitleImpl(charSequence);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void setTitleClickable(boolean z) {
        super.setTitleClickable(z);
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setTitleClickable(z);
        }
        ExpandTitle expandTitle = this.mExpandTitle;
        if (expandTitle != null) {
            expandTitle.setTitleClickable(z);
        }
    }

    public void setTitleVisible(boolean z, boolean z2) {
        this.mCollapsedTitleVisible = z;
        this.mExpandTitleVisible = z2;
        CollapseTitle collapseTitle = this.mCollapseTitle;
        if (collapseTitle != null) {
            collapseTitle.setVisible(z);
        }
        ExpandTitle expandTitle = this.mExpandTitle;
        if (expandTitle != null) {
            expandTitle.setVisible(z2);
        }
    }

    public void setUserSetEndActionMenuItemLimit(boolean z) {
        this.mUserSetEndActionMenuItemLimit = z;
    }

    @Override // miuix.appcompat.internal.app.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.mWindowCallback = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (this.mUserTitle) {
            return;
        }
        setTitleImpl(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void showBottomMenuCustomView() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) actionMenuView).O();
        }
    }

    public boolean showEndOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter;
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        return (lifecycleOwner == null || lifecycleOwner.getLifecycle().getState().equals(Lifecycle.State.RESUMED)) && (actionMenuPresenter = this.mEndActionMenuPresenter) != null && this.mEndActionMenuEnable && actionMenuPresenter.j0();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean showOverflowMenu() {
        return super.showOverflowMenu();
    }

    public boolean updateExpandStateOnLayout() {
        if (this.mInnerExpandState != 2) {
            return false;
        }
        int i2 = this.mExpandStateOnLayout;
        int i3 = this.mPendingHeight;
        if (i3 == 0) {
            i2 = 0;
        } else if (i3 == this.mMovableMainContainer.getMeasuredHeight() + this.mMovableSecondaryTabHeight) {
            i2 = 1;
        }
        if (this.mExpandStateOnLayout == i2) {
            return false;
        }
        this.mExpandStateOnLayout = i2;
        this.mExpandStateBeforeResizing = i2;
        return true;
    }

    private void safeAddView(ViewGroup viewGroup, View view, int i2) {
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (viewGroup != null) {
            viewGroup.addView(view, i2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null ? generateDefaultLayoutParams() : layoutParams;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void setExpandState(int i2, boolean z, boolean z2) {
        if (!z) {
            pendingCreateTitle();
        }
        super.setExpandState(i2, z, z2);
    }

    public void addBadgeOnItemView(int i2, int i3) {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.J(i2, i3);
    }

    public void clearBadgeOnItemView(MenuItem menuItem) {
        ActionMenuPresenter actionMenuPresenter = this.mEndActionMenuPresenter;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.M(menuItem);
    }

    public void setHomeAsUpIndicator(int i2) {
        HomeView homeView = this.mHomeLayout;
        if (homeView != null) {
            homeView.d(i2);
        } else {
            this.mHomeAsUpIndicatorDrawable = null;
            this.mHomeAsUpIndicatorResId = i2;
        }
    }

    public void setLogo(int i2) {
        setLogo(this.mContext.getResources().getDrawable(i2));
    }

    public void setIcon(int i2) {
        setIcon(this.mContext.getResources().getDrawable(i2));
    }
}
