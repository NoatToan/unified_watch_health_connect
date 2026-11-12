package com.google.android.material.navigation;

import a7.b;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.w0;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.drawerlayout.widget.DrawerLayout;
import b.c;
import bd0.e;
import cd0.h0;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import m.g;
import s7.a;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final DrawerLayout.e backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    private final int drawerLayoutCornerSizeBackAnimationMax;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016c A[PHI: r15
      0x016c: PHI (r15v4 android.graphics.drawable.Drawable) = 
      (r15v3 android.graphics.drawable.Drawable)
      (r15v3 android.graphics.drawable.Drawable)
      (r15v6 android.graphics.drawable.Drawable)
     binds: [B:50:0x0145, B:52:0x014b, B:54:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i14) {
        int i15;
        int i16 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i14, i16), attributeSet, i14);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new DrawerLayout.h() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.drawerlayout.widget.DrawerLayout.h, androidx.drawerlayout.widget.DrawerLayout.e
            public void onDrawerClosed(View view2) {
                NavigationView navigationView = NavigationView.this;
                if (view2 == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.h, androidx.drawerlayout.widget.DrawerLayout.e
            public void onDrawerOpened(View view2) {
                NavigationView navigationView = NavigationView.this;
                if (view2 == navigationView) {
                    MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    Objects.requireNonNull(materialBackOrchestrator);
                    view2.post(new h0(materialBackOrchestrator, 16));
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        w0 w0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i14, i16, new int[0]);
        int i17 = com.google.android.material.R.styleable.NavigationView_android_background;
        TypedArray typedArray = w0VarObtainTintedStyledAttributes.f5271b;
        TypedArray typedArray2 = w0VarObtainTintedStyledAttributes.f5271b;
        if (typedArray.hasValue(i17)) {
            Drawable drawableB = w0VarObtainTintedStyledAttributes.b(i17);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            setBackground(drawableB);
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.drawerLayoutCornerSize = dimensionPixelSize;
        this.drawerLayoutCornerSizeBackAnimationEnabled = dimensionPixelSize == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i14, i16).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            setBackground(materialShapeDrawable);
        }
        int i18 = com.google.android.material.R.styleable.NavigationView_elevation;
        if (typedArray2.hasValue(i18)) {
            setElevation(typedArray2.getDimensionPixelSize(i18, 0));
        }
        setFitsSystemWindows(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        int i19 = com.google.android.material.R.styleable.NavigationView_subheaderColor;
        ColorStateList colorStateListA = typedArray2.hasValue(i19) ? w0VarObtainTintedStyledAttributes.a(i19) : null;
        int i24 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance;
        int resourceId = typedArray2.hasValue(i24) ? typedArray2.getResourceId(i24, 0) : 0;
        if (resourceId == 0 && colorStateListA == null) {
            colorStateListA = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int i25 = com.google.android.material.R.styleable.NavigationView_itemIconTint;
        ColorStateList colorStateListA2 = typedArray2.hasValue(i25) ? w0VarObtainTintedStyledAttributes.a(i25) : createDefaultColorStateList(R.attr.textColorSecondary);
        int i26 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance;
        int resourceId2 = typedArray2.hasValue(i26) ? typedArray2.getResourceId(i26, 0) : 0;
        boolean z14 = typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        int i27 = com.google.android.material.R.styleable.NavigationView_itemIconSize;
        if (typedArray2.hasValue(i27)) {
            setItemIconSize(typedArray2.getDimensionPixelSize(i27, 0));
        }
        int i28 = com.google.android.material.R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateListA3 = typedArray2.hasValue(i28) ? w0VarObtainTintedStyledAttributes.a(i28) : null;
        if (resourceId2 == 0 && colorStateListA3 == null) {
            colorStateListA3 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableB2 = w0VarObtainTintedStyledAttributes.b(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (drawableB2 == null && hasShapeAppearance(w0VarObtainTintedStyledAttributes)) {
            drawableB2 = createDefaultItemBackground(w0VarObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, w0VarObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(w0VarObtainTintedStyledAttributes, null)));
            }
        }
        int i29 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding;
        if (typedArray2.hasValue(i29)) {
            i15 = 0;
            setItemHorizontalPadding(typedArray2.getDimensionPixelSize(i29, 0));
        } else {
            i15 = 0;
        }
        int i30 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding;
        if (typedArray2.hasValue(i30)) {
            setItemVerticalPadding(typedArray2.getDimensionPixelSize(i30, i15));
        }
        setDividerInsetStart(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i15));
        setDividerInsetEnd(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i15));
        setSubheaderInsetStart(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i15));
        setSubheaderInsetEnd(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i15));
        setTopInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconPadding, i15);
        setItemMaxLines(typedArray2.getInt(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new h.a() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // androidx.appcompat.view.menu.h.a
            public boolean onMenuItemSelected(h hVar, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.h.a
            public void onMenuModeChange(h hVar) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(resourceId);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListA);
        navigationMenuPresenter.setItemIconTintList(colorStateListA2);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (resourceId2 != 0) {
            navigationMenuPresenter.setItemTextAppearance(resourceId2);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z14);
        navigationMenuPresenter.setItemTextColor(colorStateListA3);
        navigationMenuPresenter.setItemBackground(drawableB2);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize2);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i34 = com.google.android.material.R.styleable.NavigationView_menu;
        if (typedArray2.hasValue(i34)) {
            inflateMenu(typedArray2.getResourceId(i34, 0));
        }
        int i35 = com.google.android.material.R.styleable.NavigationView_headerLayout;
        if (typedArray2.hasValue(i35)) {
            inflateHeaderView(typedArray2.getResourceId(i35, 0));
        }
        w0VarObtainTintedStyledAttributes.h();
        setupInsetScrimsListener();
    }

    private ColorStateList createDefaultColorStateList(int i14) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i14, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = b.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i15 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i15, defaultColor});
    }

    private Drawable createDefaultItemBackground(w0 w0Var) {
        return createDefaultItemDrawable(w0Var, MaterialResources.getColorStateList(getContext(), w0Var, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    private Drawable createDefaultItemDrawable(w0 w0Var, ColorStateList colorStateList) {
        int resourceId = w0Var.f5271b.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0);
        int i14 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay;
        TypedArray typedArray = w0Var.f5271b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), resourceId, typedArray.getResourceId(i14, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new g(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(w0 w0Var) {
        if (w0Var.f5271b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance)) {
            return true;
        }
        return w0Var.f5271b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i14, int i15) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.f)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                int i16 = ((DrawerLayout.f) getLayoutParams()).f6964a;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                boolean z14 = Gravity.getAbsoluteGravity(i16, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z14) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i14, i15));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    @CanIgnoreReturnValue
    private Pair<DrawerLayout, DrawerLayout.f> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.f)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.f) layoutParams);
        }
        vb.h.z("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        return null;
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Code duplicated, block: B:18:0x004f  */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean z14;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z15 = true;
                boolean z16 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z16);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z16 && navigationView2.isTopInsetScrimEnabled());
                if (NavigationView.this.tmpLocation[0] != 0) {
                    if (NavigationView.this.getWidth() + NavigationView.this.tmpLocation[0] == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = true;
                }
                NavigationView.this.setDrawLeftInsetForeground(z14);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z17 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                    boolean z18 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z17 && z18 && navigationView3.isBottomInsetScrimEnabled());
                    if (currentWindowBounds.width() != NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.tmpLocation[0]) {
                        z15 = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z15);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view2) {
        this.presenter.addHeaderView(view2);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new e(this, 26));
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i14) {
        return this.presenter.getHeaderView(i14);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.f> pairRequireDrawerLayoutParent = requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout) pairRequireDrawerLayoutParent.first;
        c cVarOnHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (cVarOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(cVarOnHandleBackInvoked, ((DrawerLayout.f) pairRequireDrawerLayoutParent.second).f6964a, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    public View inflateHeaderView(int i14) {
        return this.presenter.inflateHeaderView(i14);
    }

    public void inflateMenu(int i14) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i14, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ArrayList arrayList;
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            DrawerLayout.e eVar = this.backDrawerListener;
            if (eVar != null && (arrayList = drawerLayout.f6956t) != null) {
                arrayList.remove(eVar);
            }
            DrawerLayout.e eVar2 = this.backDrawerListener;
            if (eVar2 != null) {
                if (drawerLayout.f6956t == null) {
                    drawerLayout.f6956t = new ArrayList();
                }
                drawerLayout.f6956t.add(eVar2);
            }
            if (DrawerLayout.l(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            DrawerLayout.e eVar = this.backDrawerListener;
            if (eVar == null || (arrayList = drawerLayout.f6956t) == null) {
                return;
            }
            arrayList.remove(eVar);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(m1 m1Var) {
        this.presenter.dispatchApplyWindowInsets(m1Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        if (mode == Integer.MIN_VALUE) {
            i14 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i14), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i14, i15);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        maybeUpdateCornerSizeForDrawerLayout(i14, i15);
    }

    public void removeHeaderView(View view2) {
        this.presenter.removeHeaderView(view2);
    }

    public void setBottomInsetScrimEnabled(boolean z14) {
        this.bottomInsetScrimEnabled = z14;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((j) menuItemFindItem);
        } else {
            vb.h.s("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
    }

    public void setDividerInsetEnd(int i14) {
        this.presenter.setDividerInsetEnd(i14);
    }

    public void setDividerInsetStart(int i14) {
        this.presenter.setDividerInsetStart(i14);
    }

    @Override // android.view.View
    public void setElevation(float f14) {
        super.setElevation(f14);
        MaterialShapeUtils.setElevation(this, f14);
    }

    public void setForceCompatClippingEnabled(boolean z14) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z14);
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i14) {
        setItemBackground(b.getDrawable(getContext(), i14));
    }

    public void setItemHorizontalPadding(int i14) {
        this.presenter.setItemHorizontalPadding(i14);
    }

    public void setItemHorizontalPaddingResource(int i14) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i14));
    }

    public void setItemIconPadding(int i14) {
        this.presenter.setItemIconPadding(i14);
    }

    public void setItemIconPaddingResource(int i14) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i14));
    }

    public void setItemIconSize(int i14) {
        this.presenter.setItemIconSize(i14);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i14) {
        this.presenter.setItemMaxLines(i14);
    }

    public void setItemTextAppearance(int i14) {
        this.presenter.setItemTextAppearance(i14);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z14) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z14);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(int i14) {
        this.presenter.setItemVerticalPadding(i14);
    }

    public void setItemVerticalPaddingResource(int i14) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i14));
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i14) {
        super.setOverScrollMode(i14);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i14);
        }
    }

    public void setSubheaderInsetEnd(int i14) {
        this.presenter.setSubheaderInsetEnd(i14);
    }

    public void setSubheaderInsetStart(int i14) {
        this.presenter.setSubheaderInsetStart(i14);
    }

    public void setTopInsetScrimEnabled(boolean z14) {
        this.topInsetScrimEnabled = z14;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(c cVar) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(cVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(c cVar) {
        this.sideContainerBackHelper.updateBackProgress(cVar, ((DrawerLayout.f) requireDrawerLayoutParent().second).f6964a);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(cVar.f13789c));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    public static class SavedState extends a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i14) {
                return new SavedState[i14];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // s7.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(int i14) {
        MenuItem menuItemFindItem = this.menu.findItem(i14);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((j) menuItemFindItem);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    public NavigationView(Context context) {
        this(context, null);
    }
}
