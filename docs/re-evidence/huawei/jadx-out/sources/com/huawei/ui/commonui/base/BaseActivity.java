package com.huawei.ui.commonui.base;

import android.R;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.android.view.DisplaySideRegionEx;
import com.huawei.android.view.WindowManagerEx;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import defpackage.lmf;
import defpackage.ltd;
import defpackage.qjb;
import defpackage.qji;
import defpackage.qop;
import defpackage.qqs;
import defpackage.qqv;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.MagicBuild;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class BaseActivity extends FragmentActivity {
    public static final String CLEAN_ACTIVITY = "com.huawei.commonui.CLEAN_ACTIVITY";
    private static final String DARK_FLAG = "MEIZU_FLAG_DARK_STATUS_BAR_ICON";
    public static final int DEFAULT_THEME_ID = 0;
    private static final String EMUI_STYLE = "androidhwext:style/Theme.Emui.NoActionBar";
    private static final int GRID_CHANGE_STATUS_OTHER = 0;
    private static final int GRID_CHANGE_STATUS_TO_DEFAULT = 2;
    private static final int GRID_CHANGE_STATUS_TO_TAHITI = 1;
    public static final int GRID_VIEW_TYPE = 1;
    private static final String HONOR_FOLDABLE_FLAG = "com.hihonor.hardware.sensor.posture";
    private static final int LIGHT_FLAG = 0;
    private static final String MANUFACTURER_FLAG_GOOGLE = "google";
    private static final String MANUFACTURER_FLAG_MEIZU = "meizu";
    private static final String MANUFACTURER_FLAG_MIUI = "xiaomi";
    private static final String MANUFACTURER_FLAG_OPPO = "oppo";
    private static final String MANUFACTURER_FLAG_SAMSUNG = "samsung";
    private static final String MANUFACTURER_FLAG_VIVO = "vivo";
    private static final String MEIZU_FLAG = "meizuFlags";
    private static final int NO_ID = -1;
    public static final int RING_VIEW_TYPE = 0;
    private static final String STATUS_BAR_MIUI_CLASS_NAME = "android.view.MiuiWindowManager$LayoutParams";
    private static final String STATUS_BAR_MIUI_FIELD = "EXTRA_FLAG_STATUS_BAR_DARK_MODE";
    private static final String STATUS_BAR_MIUI_METHOD = "setExtraFlags";
    private static final String TAG = "BaseActivity";
    private static lmf sBiAnalyticsUtil = null;
    private static boolean sIsGetSafeWidth = false;
    private static int sMaxWidth;
    private static int sSafeLeftWidth;
    private static int sSafeRightWidth;
    private int mInitContentPaddingLeft;
    private int mInitContentPaddingRight;
    private FrameLayout.LayoutParams mMinibarLayoutParams;
    private static List<Integer> sExcludeIdList = new ArrayList();
    private static int sTahitiModelChangeStatus = 0;
    private boolean mIsRingInit = false;
    private boolean mIsCutoutInit = false;
    private boolean mIsAllowCutout = true;
    private boolean mHasSetCutoutWidth = false;
    private boolean mIsFoldable = false;
    private boolean mIsTahitiModel = false;
    private boolean mIsTahitiModelLast = false;
    private boolean mIsNeedGridAdapt = false;
    private boolean mIsSetSafeWidth = false;
    private List<Integer> mGridExcludeIdList = new ArrayList();
    private List<Integer> mRingExcludeIdList = new ArrayList();
    private int mThemeResources = 0;
    private int mCutoutLeftWidth = 0;
    private int mCutoutRightWidth = 0;
    public boolean mIsPageNeedShowMinibar = true;
    public int mMinibarBottomMargin = 0;
    private boolean mIsFirstResume = true;
    private BroadcastReceiver mBroadcast = new BroadcastReceiver() { // from class: com.huawei.ui.commonui.base.BaseActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            LogUtil.d(BaseActivity.TAG, "mBroadcast Start action = ", intent.getAction());
            if ("com.huawei.commonui.CLEAN_ACTIVITY".equals(intent.getAction())) {
                BaseActivity.this.finish();
            }
        }
    };

    protected float getMaxFontScale() {
        return 1.45f;
    }

    public void initViewTahiti() {
    }

    public boolean isSupportFoldingModel() {
        return false;
    }

    public void onTrimMemory(int i, boolean z) {
    }

    public void setRootViewBackgroundColor(View view) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.mIsFoldable) {
            boolean z = qrs.af(getApplicationContext()) && qrs.t();
            LogUtil.a(TAG, "onConfigurationChanged isTahitiModel: ", Boolean.valueOf(z));
            if (this.mIsTahitiModel != z) {
                this.mIsTahitiModel = z;
                if (z) {
                    setTahitiModelOrientation();
                } else {
                    setDefaultOrientation();
                }
            }
            tahitiModelChangeStatus();
            initGridAdaptation();
            this.mIsTahitiModelLast = z;
            BaseDialog.onActivityLifeCycle(BaseDialog.LIFE_CYCLE_CONFIG_CHANGE);
            qop.c();
            initViewTahiti();
        } else if (qrs.af(getApplicationContext())) {
            BaseDialog.onActivityLifeCycle(BaseDialog.LIFE_CYCLE_CONFIG_CHANGE);
        }
        super.onConfigurationChanged(configuration);
    }

    protected void initGridAdaptation() {
        if (this.mIsNeedGridAdapt) {
            marginAdaptation();
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return qqv.a(super.getResources(), 1.45f);
    }

    protected void tahitiModelChangeStatus() {
        boolean z = this.mIsTahitiModel;
        if (z && !this.mIsTahitiModelLast) {
            setTahitiModel(1);
        } else if (!z && this.mIsTahitiModelLast) {
            setTahitiModel(2);
        } else {
            setTahitiModel(0);
        }
    }

    private static void setTahitiModel(int i) {
        sTahitiModelChangeStatus = i;
    }

    protected void marginAdaptation() {
        if (sTahitiModelChangeStatus == 0) {
            return;
        }
        List<View> allChildViews = getAllChildViews(getWindow().getDecorView().findViewById(R.id.content), 1);
        LogUtil.d(TAG, "marginAdaptation list num = ", Integer.valueOf(allChildViews.size()));
        for (View view : allChildViews) {
            if (view != null && !isRequireModifyView(view)) {
                if (view instanceof ViewGroup) {
                    setPaddingAdaptation(view);
                } else if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    setMarginAdaptation(view);
                } else {
                    LogUtil.d(TAG, "No need to deal with!");
                }
            }
        }
    }

    protected static void setMarginAdaptation(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        Context context = BaseApplication.getContext();
        for (View view : viewArr) {
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iE = qrs.e(context, marginLayoutParams.getMarginStart());
                int iE2 = qrs.e(context, marginLayoutParams.getMarginEnd());
                String str = TAG;
                LogUtil.d(str, "viewChild1 = ", view.getAccessibilityClassName().toString(), "leftMargin px = ", Integer.valueOf(marginLayoutParams.leftMargin), " dp = ", Integer.valueOf(iE));
                int i = sTahitiModelChangeStatus;
                if (i == 1) {
                    marginLayoutParams.setMarginStart(qrs.d(context, iE));
                    marginLayoutParams.setMarginEnd(qrs.d(context, iE2));
                    LogUtil.d(str, "viewChild Margin increase +", 0);
                } else if (i == 2) {
                    float f = iE > 0 ? iE : 0.0f;
                    float f2 = iE2 > 0 ? iE2 : 0.0f;
                    marginLayoutParams.setMarginStart(qrs.d(context, f));
                    marginLayoutParams.setMarginEnd(qrs.d(context, f2));
                    LogUtil.d(str, "viewChild Margin reduce -", 0);
                } else {
                    LogUtil.d(str, "No need to handle!");
                }
            }
        }
    }

    protected static void setPaddingAdaptation(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        Context context = BaseApplication.getContext();
        for (View view : viewArr) {
            if (view != null) {
                int iE = qrs.e(context, view.getPaddingStart());
                int iE2 = qrs.e(context, view.getPaddingEnd());
                String str = TAG;
                LogUtil.d(str, "viewChild = ", view.getAccessibilityClassName().toString(), "paddingStart px = ", Integer.valueOf(view.getPaddingStart()), " dp = ", Integer.valueOf(iE));
                int i = sTahitiModelChangeStatus;
                if (i == 1) {
                    view.setPadding(qrs.d(context, iE), view.getPaddingTop(), qrs.d(context, iE2), view.getPaddingBottom());
                    LogUtil.d(str, "viewChild padding increase +", 0);
                } else if (i == 2) {
                    view.setPadding(qrs.d(context, iE > 0 ? iE : 0.0f), view.getPaddingTop(), qrs.d(context, iE2 > 0 ? iE2 : 0.0f), view.getPaddingBottom());
                    LogUtil.d(str, "viewChild padding reduce -", 0);
                } else {
                    LogUtil.d(str, "No need to deal with!");
                }
            }
        }
    }

    public static void setGridMargins(int i, View... viewArr) {
        if (viewArr == null) {
            return;
        }
        if (i == 1) {
            setMarginAdaptation(viewArr);
        } else {
            if (i != 2) {
                return;
            }
            setPaddingAdaptation(viewArr);
        }
    }

    public void cancelMarginAdaptation() {
        this.mIsNeedGridAdapt = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        try {
            super.onStart();
        } catch (ClassCastException e2) {
            String str = "onStart exception happened, " + e2 + ", activity = " + this;
            LogUtil.e(TAG, str);
            throw new ClassCastException(str + System.lineSeparator() + DfxUtils.d(Thread.currentThread(), e2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        LogUtil.a(TAG, "onWindowFocusChanged: ", Boolean.valueOf(z));
        if (this.mIsRingInit && z && (CommonUtil.at() || CommonUtil.bd())) {
            adapterView();
            this.mIsRingInit = false;
        }
        if (this.mIsCutoutInit && z && isHonorFoldableDevice()) {
            setDisplayCutoutMode(3, this);
            setCutoutPadding();
            this.mIsCutoutInit = false;
        }
        super.onWindowFocusChanged(z);
    }

    protected void adapterView() {
        List<View> allChildViews = getAllChildViews(getWindow().getDecorView().findViewById(R.id.content), 0);
        if (!allChildViews.isEmpty()) {
            allChildViews.remove(0);
        }
        for (View view : allChildViews) {
            if (!isRequireModifyView(view) && view != null) {
                if ((view instanceof ViewGroup) && !this.mIsSetSafeWidth) {
                    int paddingStart = view.getPaddingStart();
                    int paddingEnd = view.getPaddingEnd();
                    view.setPadding(sSafeLeftWidth + paddingStart, view.getPaddingTop(), sSafeRightWidth + paddingEnd, view.getPaddingBottom());
                    this.mIsSetSafeWidth = true;
                } else if ((view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && !this.mIsSetSafeWidth) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin += sSafeLeftWidth;
                    marginLayoutParams.rightMargin += sSafeRightWidth;
                    view.setLayoutParams(marginLayoutParams);
                    this.mIsSetSafeWidth = true;
                }
            }
        }
    }

    public void setCutoutPadding() {
        if (!this.mIsAllowCutout) {
            LogUtil.a(TAG, "setCutoutPadding not allow cutout");
            return;
        }
        View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
        LogUtil.a(TAG, "setCutoutPadding left: ", Integer.valueOf(this.mCutoutLeftWidth), " right: ", Integer.valueOf(this.mCutoutRightWidth));
        if (!this.mHasSetCutoutWidth) {
            this.mInitContentPaddingLeft = viewFindViewById.getPaddingLeft();
            this.mInitContentPaddingRight = viewFindViewById.getPaddingRight();
        }
        setRootViewBackgroundColor(viewFindViewById);
        int i = this.mInitContentPaddingLeft;
        int i2 = this.mCutoutLeftWidth;
        int i3 = i + i2;
        viewFindViewById.setPadding(i3, viewFindViewById.getPaddingTop(), this.mInitContentPaddingRight + this.mCutoutRightWidth, viewFindViewById.getPaddingBottom());
        this.mHasSetCutoutWidth = true;
    }

    private boolean isRequireModifyView(View view) {
        return (view instanceof ListView) || (view instanceof ImageView);
    }

    public static Pair<Integer, Integer> getSafeRegionWidth() {
        return new Pair<>(Integer.valueOf(sSafeLeftWidth), Integer.valueOf(sSafeRightWidth));
    }

    protected void cancelAdaptRingRegion() {
        this.mIsRingInit = false;
    }

    public void cancelAdaptCutoutRegion() {
        this.mIsAllowCutout = false;
    }

    public static void cancelLayoutById(View... viewArr) {
        int id;
        if (viewArr != null) {
            sExcludeIdList.clear();
            for (View view : viewArr) {
                if (view != null && (id = view.getId()) != -1) {
                    sExcludeIdList.add(Integer.valueOf(id));
                }
            }
        }
    }

    public static void setViewSafeRegion(boolean z, View... viewArr) {
        if (viewArr != null) {
            if (CommonUtil.at() || CommonUtil.bd()) {
                int i = 0;
                if (z) {
                    int length = viewArr.length;
                    while (i < length) {
                        View view = viewArr[i];
                        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                            marginLayoutParams.leftMargin += sSafeLeftWidth;
                            marginLayoutParams.rightMargin += sSafeRightWidth;
                            view.setLayoutParams(marginLayoutParams);
                        }
                        i++;
                    }
                    return;
                }
                int length2 = viewArr.length;
                while (i < length2) {
                    View view2 = viewArr[i];
                    if (view2 != null) {
                        int paddingStart = view2.getPaddingStart();
                        int paddingEnd = view2.getPaddingEnd();
                        view2.setPadding(sSafeLeftWidth + paddingStart, view2.getPaddingTop(), sSafeRightWidth + paddingEnd, view2.getPaddingBottom());
                    }
                    i++;
                }
            }
        }
    }

    private List<View> getAllChildViews(View view, int i) {
        ArrayList arrayList = new ArrayList();
        if (view != null && (view instanceof ViewGroup)) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if (childAt instanceof ViewGroup) {
                sMaxWidth = childAt.getMeasuredWidth();
                return getChildView(childAt, arrayList, i);
            }
        }
        return arrayList;
    }

    private List<View> getChildView(View view, List<View> list, int i) {
        if ((i != 0 || (!sExcludeIdList.contains(Integer.valueOf(view.getId())) && !this.mRingExcludeIdList.contains(Integer.valueOf(view.getId())))) && ((i != 1 || !this.mGridExcludeIdList.contains(Integer.valueOf(view.getId()))) && (view instanceof ViewGroup))) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (!sExcludeIdList.contains(Integer.valueOf(childAt.getId()))) {
                    if (!isFullScreen(childAt.getMeasuredWidth())) {
                        list.add(childAt);
                    } else if (childAt instanceof ViewGroup) {
                        if (isSmallChildrenNode((ViewGroup) childAt)) {
                            list.add(childAt);
                        } else {
                            getChildView(childAt, list, i);
                        }
                    } else if (!isSetBackground(childAt)) {
                        list.add(childAt);
                    }
                }
            }
        }
        return list;
    }

    private boolean isFullScreen(int i) {
        return i == sMaxWidth;
    }

    private boolean isSetBackground(View view) {
        return view.getBackground() != null || (view instanceof ImageView);
    }

    private boolean isHorizontalLinearLayout(ViewGroup viewGroup) {
        return (viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 0;
    }

    public static void setDisplaySideMode(Context context) {
        if (MagicBuild.f36615a) {
            return;
        }
        if ((CommonUtil.at() || CommonUtil.bd()) && (context instanceof Activity)) {
            new WindowManagerEx.LayoutParamsEx(((Activity) context).getWindow().getAttributes()).setDisplaySideMode(1);
        }
    }

    protected void getSideRegionWidth() {
        if (MagicBuild.f36615a) {
            return;
        }
        if (CommonUtil.at() || CommonUtil.bd()) {
            new WindowManagerEx.LayoutParamsEx(getWindow().getAttributes()).setDisplaySideMode(1);
            if (sIsGetSafeWidth) {
                return;
            }
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.ui.commonui.base.BaseActivity.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    DisplaySideRegionEx displaySideRegion = WindowManagerEx.LayoutParamsEx.getDisplaySideRegion(windowInsets);
                    boolean unused = BaseActivity.sIsGetSafeWidth = true;
                    if (displaySideRegion == null) {
                        BaseActivity.this.mIsRingInit = false;
                    } else {
                        int unused2 = BaseActivity.sSafeLeftWidth = displaySideRegion.getSideWidth(0);
                        int unused3 = BaseActivity.sSafeRightWidth = displaySideRegion.getSideWidth(2);
                        LogUtil.a(BaseActivity.TAG, "sSafeLeftWidth: ", Integer.valueOf(BaseActivity.sSafeLeftWidth), " sSafeRightWidth: ", Integer.valueOf(BaseActivity.sSafeRightWidth));
                        if (BaseActivity.sSafeLeftWidth == 0 && BaseActivity.sSafeRightWidth == 0) {
                            BaseActivity.this.mIsRingInit = false;
                        }
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    private void getCutoutWidth() {
        if (!isHonorFoldableDevice()) {
            LogUtil.a(TAG, "getCutoutWidth not honor foldable device");
        } else {
            setDisplayCutoutMode(3, this);
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.ui.commonui.base.BaseActivity.5
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        BaseActivity.this.updateCutoutWidth(windowInsets.getDisplayCutout());
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCutoutWidth(DisplayCutout displayCutout) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        if (displayCutout == null) {
            LogUtil.a(TAG, "cutout is null");
            this.mIsCutoutInit = false;
            if (this.mCutoutLeftWidth == 0 && this.mCutoutRightWidth == 0) {
                return;
            }
            this.mCutoutLeftWidth = 0;
            this.mCutoutRightWidth = 0;
            setCutoutPadding();
            return;
        }
        int safeInsetLeft = displayCutout.getSafeInsetLeft();
        int safeInsetRight = displayCutout.getSafeInsetRight();
        LogUtil.a(TAG, "updateCutoutWidth, cutout left: ", Integer.valueOf(safeInsetLeft), " right: ", Integer.valueOf(safeInsetRight));
        if (safeInsetLeft == 0 && safeInsetRight == 0) {
            this.mIsCutoutInit = false;
        }
        if (safeInsetLeft == this.mCutoutLeftWidth && safeInsetRight == this.mCutoutRightWidth) {
            return;
        }
        this.mCutoutLeftWidth = safeInsetLeft;
        this.mCutoutRightWidth = safeInsetRight;
        if (this.mIsCutoutInit) {
            return;
        }
        setCutoutPadding();
    }

    private boolean isSmallChildrenNode(ViewGroup viewGroup) {
        boolean z = true;
        if (isHorizontalLinearLayout(viewGroup)) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ViewGroup) && childAt.getMeasuredWidth() == sMaxWidth) {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mRingExcludeIdList.clear();
        this.mGridExcludeIdList.clear();
        super.onCreate(bundle);
        this.mIsFoldable = qrs.t();
        adapterWideScreenAndFold();
        if (this.mIsFoldable) {
            this.mIsNeedGridAdapt = true;
        }
        if (CommonUtil.at() || CommonUtil.bd()) {
            this.mIsRingInit = true;
            getSideRegionWidth();
        }
        if (sBiAnalyticsUtil == null) {
            sBiAnalyticsUtil = lmf.d();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().registerReceiver(this.mBroadcast, intentFilter);
        loadApplicationTheme();
        initSystemBar();
        setNavigationBarColor();
        getWindow().setBackgroundDrawableResource(com.huawei.ui.commonui.R.color.colorBackground);
    }

    private void setNavigationBarColor() {
        if (isGoogle()) {
            return;
        }
        if (CommonUtil.bg() || isFlyme()) {
            getWindow().setNavigationBarColor(getResources().getColor(com.huawei.ui.commonui.R.color.colorBackground));
        } else if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarColor(getResources().getColor(com.huawei.ui.commonui.R.color.colorBackground));
        }
    }

    private void adapterWideScreenAndFold() {
        boolean z = qrs.af(getApplicationContext()) && qrs.t();
        this.mIsTahitiModel = z;
        if (this.mIsFoldable && z) {
            setTahitiModelOrientation();
        } else {
            setDefaultOrientation();
        }
        this.mIsTahitiModelLast = this.mIsTahitiModel;
        if (isHonorFoldableDevice()) {
            this.mIsCutoutInit = true;
            getCutoutWidth();
        }
        if (this.mIsTahitiModel) {
            setDisplayCutoutMode(1, this);
        }
    }

    protected void setTahitiModelOrientation() {
        setRequestedOrientation(-1);
    }

    protected void setDefaultOrientation() {
        setRequestedOrientation(1);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (isKeepDefaultOrientation()) {
            LogUtil.j(TAG, "avoid calling setRequestedOrientation when Oreo.");
        } else {
            super.setRequestedOrientation(i);
        }
    }

    private boolean isKeepDefaultOrientation() {
        return (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && isTranslucentOrFloating();
    }

    private boolean isTranslucentOrFloating() {
        boolean zBooleanValue;
        Throwable e2;
        try {
            Object obj = Class.forName("com.android.internal.R$styleable").getField("Window").get(null);
            if (!(obj instanceof int[])) {
                return false;
            }
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) obj);
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                return zBooleanValue;
            } catch (ClassNotFoundException e3) {
                e2 = e3;
            } catch (IllegalAccessException e4) {
                e2 = e4;
            } catch (IllegalArgumentException e5) {
                e2 = e5;
            } catch (NoSuchFieldException e6) {
                e2 = e6;
            } catch (NoSuchMethodException e7) {
                e2 = e7;
            } catch (SecurityException e8) {
                e2 = e8;
            } catch (InvocationTargetException e9) {
                e2 = e9;
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e10) {
            zBooleanValue = false;
            e2 = e10;
        }
        LogUtil.e(TAG, "get isTranslucentOrFloating failed with exception:", ExceptionUtils.c(e2));
        return zBooleanValue;
    }

    protected void loadApplicationTheme() {
        if (getApplicationContext().getTheme() == null) {
            LogUtil.e(TAG, "loadApplicationTheme() if (theme == null)");
        } else {
            loadTheme(EMUI_STYLE, null, null);
        }
    }

    protected void loadTheme(String str) {
        loadTheme(str, TtmlNode.TAG_STYLE, "com.huawei.health");
    }

    protected void loadTheme(String str, String str2, String str3) {
        int identifier = getResources().getIdentifier(str, str2, str3);
        if (identifier == 0) {
            LogUtil.a(TAG, "loadApplicationTheme themeResources is DEFAULT_THEME_ID");
        } else {
            LogUtil.a(TAG, "loadApplicationTheme themeResources is ", Integer.valueOf(identifier));
            setTheme(identifier);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        lmf lmfVar = sBiAnalyticsUtil;
        if (lmfVar != null) {
            lmfVar.c(this);
        }
        BaseDialog.onActivityLifeCycle(BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (this.mIsFirstResume && ActivityTransitionAnimator.c().a()) {
            this.mIsFirstResume = false;
        } else {
            this.mIsFirstResume = false;
            initMinibar();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        lmf lmfVar = sBiAnalyticsUtil;
        if (lmfVar != null) {
            lmfVar.d(this);
        }
        BaseDialog.onActivityLifeCycle(BaseDialog.LIFE_CYCLE_ON_PAUSE);
        qjb.c().d();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BaseDialog.cleanAllDialog(this);
        qji.d(toString());
        super.onDestroy();
        LocalBroadcastManager.getInstance().unregisterReceiver(this.mBroadcast);
        this.mBroadcast = null;
        lmf lmfVar = sBiAnalyticsUtil;
        if (lmfVar != null) {
            lmfVar.b(this);
        }
        this.mGridExcludeIdList.clear();
        this.mRingExcludeIdList.clear();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        onTrimMemory(i, BaseApplication.isRunningForeground());
    }

    protected void initSystemBar() {
        if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            initHwWearSystemBar();
        }
        if ("com.huawei.health".equals(BaseApplication.getAppPackage()) || BaseApplication.APP_PACKAGE_GOOGLE_HEALTH.equals(BaseApplication.getAppPackage())) {
            if (this.mThemeResources == 0 && isMiui()) {
                setTranslucentStatus(getWindow());
                setMiuiStatusBarMode(!qqs.e(getApplicationContext()), this);
            } else if (this.mThemeResources == 0 && isFlyme()) {
                setTranslucentStatus(getWindow());
                setMeizuStatusBarDarkIcon(getWindow(), !qqs.e(getApplicationContext()));
            } else {
                setTranslucentStatus(getWindow());
                setStatusBarMode(!qqs.e(getApplicationContext()));
            }
        }
    }

    public void setStatusBarMode(boolean z) {
        if (z) {
            if (CommonUtil.bb()) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 9216);
                return;
            } else {
                getWindow().getDecorView().setSystemUiVisibility(9216);
                return;
            }
        }
        setStatusBarColor();
    }

    private void initHwWearSystemBar() {
        getWindow().setNavigationBarColor(0);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(9216);
    }

    public static boolean isMiui() {
        return MANUFACTURER_FLAG_MIUI.equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean isFlyme() {
        return Build.MANUFACTURER.equalsIgnoreCase(MANUFACTURER_FLAG_MEIZU);
    }

    public static boolean isOppoSystem() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).contains(MANUFACTURER_FLAG_OPPO);
    }

    public static boolean isSumsung() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).contains(MANUFACTURER_FLAG_SAMSUNG);
    }

    public static boolean isGoogle() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).contains(MANUFACTURER_FLAG_GOOGLE);
    }

    public static Boolean isVivo() {
        return Boolean.valueOf(Build.BRAND.toLowerCase(Locale.ENGLISH).contains(MANUFACTURER_FLAG_VIVO));
    }

    public static void setMiuiStatusBarMode(boolean z, Activity activity) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName(STATUS_BAR_MIUI_CLASS_NAME);
            int i = cls2.getField(STATUS_BAR_MIUI_FIELD).getInt(cls2);
            cls.getMethod(STATUS_BAR_MIUI_METHOD, Integer.TYPE, Integer.TYPE).invoke(activity.getWindow(), Integer.valueOf(z ? i : 0), Integer.valueOf(i));
        } catch (ClassNotFoundException unused) {
            LogUtil.e(TAG, "xiaomi setStatusBarDarkIcon: failed ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            LogUtil.e(TAG, "xiaomi setStatusBarDarkIcon: failed IllegalAccessException");
        } catch (NoSuchFieldException unused3) {
            LogUtil.e(TAG, "xiaomi setStatusBarDarkIcon: failed NoSuchFieldException");
        } catch (NoSuchMethodException unused4) {
            LogUtil.e(TAG, "xiaomi setStatusBarDarkIcon: failed NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            LogUtil.e(TAG, "xiaomi setStatusBarDarkIcon: failed InvocationTargetException");
        }
        if (z) {
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
        }
    }

    public void setTranslucentStatus(Window window) {
        if (window != null) {
            if (this.mThemeResources == 0) {
                window.clearFlags(67108864);
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                return;
            }
            window.setStatusBarColor(ContextCompat.getColor(this, com.huawei.ui.commonui.R.color.common_white_0alpha));
        }
    }

    public static boolean setMeizuStatusBarDarkIcon(Window window, boolean z) {
        boolean z2 = false;
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField(DARK_FLAG);
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField(MEIZU_FLAG);
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i = declaredField.getInt(null);
                int i2 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z ? i | i2 : (~i) & i2);
                window.setAttributes(attributes);
                z2 = true;
            } catch (IllegalAccessException unused) {
                LogUtil.e(TAG, "meizu setStatusBarDarkIcon: failed IllegalAccessException");
            } catch (NoSuchFieldException unused2) {
                LogUtil.e(TAG, "meizu setStatusBarDarkIcon: failed NoSuchFieldException");
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(9216);
            }
        }
        return z2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        LogUtil.a(TAG, "Activity-onRequestPermissionsResult()");
        ltd.e().e(strArr, iArr);
    }

    public boolean isLargerThanEmui910(String str) {
        return CommonUtil.bb();
    }

    public void setStatusBarColor() {
        getWindow().getDecorView().setSystemUiVisibility((getWindow().getDecorView().getSystemUiVisibility() & (-8193)) | 1280);
    }

    public static void setNavigationBarVisibility(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        if (i == 8) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4098);
        } else {
            decorView.setSystemUiVisibility((decorView.getSystemUiVisibility() | 2) & (-3));
        }
    }

    public static boolean setAttributesShortOrDefault(int i, Activity activity) {
        String str = TAG;
        LogUtil.a(str, "cutoutModel:", Integer.valueOf(i));
        if (activity == null) {
            LogUtil.j(str, "activity = null");
            return false;
        }
        if (Build.VERSION.SDK_INT < 28 || 1 != activity.getResources().getConfiguration().orientation) {
            return false;
        }
        setDisplayCutoutMode(i, activity);
        return true;
    }

    private static void setDisplayCutoutMode(int i, Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = i;
            activity.getWindow().setAttributes(attributes);
        }
    }

    public void clearBackgroundDrawable() {
        if (isHonorFoldableDevice()) {
            return;
        }
        getWindow();
    }

    public boolean isHonorFoldableDevice() {
        return CommonUtil.bd() && MagicBuild.f36615a && getPackageManager().hasSystemFeature(HONOR_FOLDABLE_FLAG);
    }

    public void setBackgroundDrawableResource(int i) {
        getWindow().setBackgroundDrawableResource(i);
    }

    public String getCurrFoldModel() {
        return "NORMAL_MODE";
    }

    protected void initMinibar() {
        String str = TAG;
        LogUtil.a(str, "initMinibar");
        View viewB = qjb.c().b();
        if (viewB == null) {
            return;
        }
        qjb.c().d();
        ComponentName componentName = getComponentName();
        if (componentName == null || TextUtils.isEmpty(componentName.getClassName())) {
            LogUtil.a(str, "getClassName is empty");
            return;
        }
        LogUtil.a(str, "getClassName = ", componentName.getClassName());
        if (!qjb.c().c(componentName.getClassName())) {
            LogUtil.a(str, "showMiniBar current page need not to show minibar");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView().findViewById(R.id.content);
        if (this.mMinibarLayoutParams == null) {
            this.mMinibarLayoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        this.mMinibarLayoutParams.gravity = 80;
        this.mMinibarLayoutParams.width = -1;
        this.mMinibarLayoutParams.height = -2;
        this.mMinibarLayoutParams.bottomMargin = this.mMinibarBottomMargin;
        viewB.setVisibility(this.mIsPageNeedShowMinibar ? 0 : 8);
        frameLayout.addView(viewB, this.mMinibarLayoutParams);
        LogUtil.a(str, "initMinibar end, mMinibarBottomMargin:", Integer.valueOf(this.mMinibarBottomMargin));
    }

    protected void setMinibarBottomMargin(int i) {
        LogUtil.a(TAG, "setMinibarBottomMargin:", Integer.valueOf(i));
        this.mMinibarBottomMargin = i;
    }

    public void hideMinibar() {
        View viewB = qjb.c().b();
        if (viewB != null) {
            viewB.setVisibility(8);
            LogUtil.a(TAG, "hideMinibar");
        }
    }

    public void showMinibar() {
        View viewB = qjb.c().b();
        if (viewB == null || !this.mIsPageNeedShowMinibar) {
            return;
        }
        viewB.setVisibility(0);
        LogUtil.a(TAG, "showMinibar");
    }

    public void updateMinibar() {
        FrameLayout.LayoutParams layoutParams;
        View viewB = qjb.c().b();
        if (viewB == null || (layoutParams = this.mMinibarLayoutParams) == null) {
            return;
        }
        layoutParams.bottomMargin = this.mMinibarBottomMargin;
        viewB.setLayoutParams(this.mMinibarLayoutParams);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class e implements ActivityTransitionAnimator.EnterListener {
        private final WeakReference<BaseActivity> d;

        @Override // com.huawei.ui.commonui.transition.ActivityTransitionAnimator.EnterListener
        public void start() {
        }

        public e(BaseActivity baseActivity) {
            this.d = new WeakReference<>(baseActivity);
        }

        @Override // com.huawei.ui.commonui.transition.ActivityTransitionAnimator.EnterListener
        public void end() {
            BaseActivity baseActivity = this.d.get();
            if (baseActivity == null || baseActivity.isDestroyed() || baseActivity.isFinishing()) {
                LogUtil.j(BaseActivity.TAG, "TransitionAnimatorListener activity ", baseActivity);
            } else {
                ObserverManagerUtil.e(ObserveLabels.ACTIVITY_TRANSITION_ANIMATOR_END, new Object[0]);
                baseActivity.initMinibar();
            }
        }
    }
}
