package com.huawei.ui.commonui.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qso;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class BaseDialog extends Dialog {
    public static final String LIFE_CYCLE_CONFIG_CHANGE = "configureChanged";
    public static final String LIFE_CYCLE_ON_PAUSE = "onPause";
    public static final String LIFE_CYCLE_ON_RESUME = "onResume";
    private static final String RELEASE_TAG = "R_BaseDialog";
    private static final String TAG = "BaseDialog";
    private static final int WIDTH_FROM_MARGIN = 48;
    private static boolean mIsDialogMapCleaned = false;
    public static int sSplashAdViewId;
    private final Handler mBuildHandler;
    private int mColumnType;
    protected Context mContext;
    protected int mDialogType;
    private int mGravity;
    private boolean mIsDeferredByAd;
    private boolean mIsHarmonyStyle;
    protected View mView;
    private static WeakHashMap<Dialog, String> mCleanDialogMap = new WeakHashMap<>();
    private static WeakHashMap<Dialog, String> sShowingDialogMap = new WeakHashMap<>();
    private static HashMap<Dialog, String> sAdHideDialogMap = new HashMap<>();

    public void dialogPause() {
    }

    public void dialogResume() {
    }

    public BaseDialog(Context context) {
        super(context);
        this.mDialogType = -1;
        this.mBuildHandler = new Handler();
        this.mGravity = 0;
        this.mColumnType = 12;
        this.mContext = context;
        registerCleanDialog(context);
    }

    public BaseDialog(Context context, int i) {
        super(context, i);
        this.mDialogType = -1;
        this.mBuildHandler = new Handler();
        this.mGravity = 0;
        this.mColumnType = 12;
        this.mContext = context;
        registerCleanDialog(context);
    }

    public BaseDialog(Context context, int i, int i2) {
        super(context, i);
        this.mDialogType = -1;
        this.mBuildHandler = new Handler();
        this.mGravity = 0;
        this.mColumnType = 12;
        this.mContext = context;
        this.mDialogType = i2;
        registerCleanDialog(context);
    }

    public BaseDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mDialogType = -1;
        this.mBuildHandler = new Handler();
        this.mGravity = 0;
        this.mColumnType = 12;
        this.mContext = context;
        registerCleanDialog(context);
    }

    public Handler getBuildHandler() {
        return this.mBuildHandler;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (!mIsDialogMapCleaned) {
            unregisterCleanDialog();
            unregisterShowingDialog();
        }
        super.dismiss();
    }

    public void setHarmonyStyle(boolean z) {
        this.mIsHarmonyStyle = z;
    }

    public void configDialog() {
        if (this.mDialogType == 0) {
            return;
        }
        Window window = getWindow();
        if (window == null) {
            ReleaseLogUtil.e(TAG, "configDialog window is null");
            return;
        }
        LogUtil.a(TAG, "configDialog mDialogType ", Integer.valueOf(this.mDialogType));
        window.setDimAmount(qqs.e(this.mContext) ? 0.4f : 0.2f);
        Resources resources = this.mContext.getResources();
        Point pointL = qrs.l();
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.mContext, this.mColumnType);
        healthColumnSystem.d(this.mContext, pointL.x, pointL.y, resources.getDisplayMetrics().density);
        boolean zAf = qrs.af(this.mContext);
        WindowManager.LayoutParams attributes = window.getAttributes();
        Context context = this.mContext;
        if ((context instanceof BaseActivity) && ((BaseActivity) context).isSupportFoldingModel()) {
            String currFoldModel = ((BaseActivity) this.mContext).getCurrFoldModel();
            LogUtil.j(TAG, "configDialog currFoldModel ", currFoldModel);
            attributes.width = getDialogWidth(healthColumnSystem);
            if (!zAf) {
                attributes.y = qre.b(R.dimen.dialogMarginBottom);
            }
            window.setAttributes(attributes);
            if (this.mGravity == 0 && (zAf || 2 == resources.getConfiguration().orientation)) {
                WindowManager windowManagerT = CommonUtils.t();
                if ("HORIZONTAL_FOLDING_MODE".equals(currFoldModel) && windowManagerT != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManagerT.getDefaultDisplay().getMetrics(displayMetrics);
                    attributes.y = displayMetrics.heightPixels / 4;
                } else {
                    attributes.y = 0;
                }
                window.setAttributes(attributes);
                LogUtil.j(TAG, "configDialog screen is ORIENTATION_LANDSCAPE");
                return;
            }
            int i = this.mGravity;
            window.setGravity(i != 0 ? i : 80);
            return;
        }
        boolean z = (!this.mIsHarmonyStyle || zAf || qrs.ah(this.mContext)) ? false : true;
        int iQ = z ? qrs.q() : getDialogWidth(healthColumnSystem);
        int iB = qre.b(R.dimen.dialogMarginBottom);
        if (attributes.width == iQ && (zAf || attributes.y == iB)) {
            return;
        }
        attributes.width = iQ;
        if (z) {
            attributes.y = 0;
        } else if (!zAf) {
            attributes.y = iB;
        }
        window.setAttributes(attributes);
        if (this.mGravity == 0 && (zAf || 2 == resources.getConfiguration().orientation)) {
            window.setGravity(16);
            LogUtil.j(TAG, "configDialog screen is ORIENTATION_LANDSCAPE");
        } else {
            int i2 = this.mGravity;
            window.setGravity(i2 != 0 ? i2 : 80);
        }
    }

    private static void deferDialogByAd(BaseDialog baseDialog, final View view) {
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.huawei.ui.commonui.base.BaseDialog.5
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                LogUtil.a(BaseDialog.TAG, "deferDialogPendingShow onViewDetachedFromWindow! tag = ", BaseDialog.this);
                BaseDialog.this.show();
                view.removeOnAttachStateChangeListener(this);
            }
        });
        baseDialog.mIsDeferredByAd = true;
    }

    @Override // android.app.Dialog
    public void show() {
        View viewFindViewById;
        int i = sSplashAdViewId;
        if (i != 0) {
            Context context = this.mContext;
            if ((context instanceof Activity) && (viewFindViewById = ((Activity) context).findViewById(i)) != null && viewFindViewById.getVisibility() == 0 && !this.mIsDeferredByAd) {
                LogUtil.a(TAG, "show dialog but deferred by ad dialog = ", this);
                deferDialogByAd(this, viewFindViewById);
                return;
            }
        }
        LogUtil.a(TAG, ParamConstants.CallbackMethod.ON_SHOW);
        configDialog();
        registerShowingDialog(this.mContext);
        try {
            if (Looper.myLooper() == this.mBuildHandler.getLooper()) {
                super.show();
                return;
            }
            LogUtil.j(TAG, "show() not in ui thread, post it, context = " + this.mContext);
            this.mBuildHandler.post(new Runnable() { // from class: com.huawei.ui.commonui.base.BaseDialog.2
                @Override // java.lang.Runnable
                public void run() {
                    BaseDialog.super.show();
                }
            });
        } catch (RuntimeException e) {
            LogUtil.e(TAG, "BaseDialog show RuntimeException: ", ExceptionUtils.c(e));
        }
    }

    private int getDialogWidth(HealthColumnSystem healthColumnSystem) {
        int iG = healthColumnSystem.g();
        LogUtil.a(TAG, "getDialogWidth dialogWidth :", Integer.valueOf(iG));
        Context context = this.mContext;
        Activity activityJ = context instanceof Activity ? (Activity) context : null;
        if (activityJ == null) {
            activityJ = BaseApplication.j();
        }
        if (activityJ != null) {
            boolean zIsInMultiWindowMode = activityJ.isInMultiWindowMode();
            boolean zIsHorizontalScreen = isHorizontalScreen(activityJ);
            boolean zB = qrs.b(activityJ);
            LogUtil.a(TAG, "getDialogWidth inMultiWindowMode:", Boolean.valueOf(zIsInMultiWindowMode), " isFreeformMode:", Boolean.valueOf(zB), " isHorizontalScreen:", Boolean.valueOf(zIsHorizontalScreen));
            if (zIsInMultiWindowMode) {
                if (qrs.af(activityJ) || (!zB && !zIsHorizontalScreen)) {
                    LogUtil.a(TAG, "configDialog isWidescreen or portrait split Screen");
                } else {
                    int i = qrs.i(activityJ) - 192;
                    LogUtil.a(TAG, "getDialogWidth inMultiWindowMode dialogWidth:", Integer.valueOf(i));
                    return i;
                }
            }
        }
        return iG;
    }

    private boolean isHorizontalScreen(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 1 || rotation == 3;
    }

    private void registerCleanDialog(Context context) {
        if (isBaseActivity(context)) {
            registerCleanDialogImpl(this, context.toString());
        }
    }

    private boolean isBaseActivity(Context context) {
        if (context instanceof BaseActivity) {
            return true;
        }
        return context != null && context.toString().contains(ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
    }

    private void unregisterCleanDialog() {
        unregisterCleanDialogImpl(this);
    }

    private void registerShowingDialog(Context context) {
        LogUtil.a(TAG, "sShowingDialogMap,", sShowingDialogMap, "context:", context);
        if (isBaseActivity(context)) {
            sShowingDialogMap.put(this, context.toString());
        }
        if (LogConfig.f() || HandlerExecutor.d()) {
            return;
        }
        LogUtil.j(TAG, "registerShowingDialog ", DfxUtils.d(Thread.currentThread(), null));
    }

    private void unregisterShowingDialog() {
        sShowingDialogMap.remove(this);
    }

    public static void onActivityLifeCycle(String str) {
        LogUtil.a(TAG, "onActivityLifeCycle");
        mIsDialogMapCleaned = true;
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.putAll(sShowingDialogMap);
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Dialog dialog = (Dialog) ((Map.Entry) it.next()).getKey();
            if (dialog instanceof BaseDialog) {
                BaseDialog baseDialog = (BaseDialog) dialog;
                Context context = baseDialog.mContext;
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                        ReleaseLogUtil.e(RELEASE_TAG, "attach activity is gone");
                    } else if (TextUtils.equals(str, LIFE_CYCLE_CONFIG_CHANGE)) {
                        baseDialog.configDialog();
                    } else if (TextUtils.equals(str, LIFE_CYCLE_ON_PAUSE)) {
                        baseDialog.dialogPause();
                    } else if (TextUtils.equals(str, LIFE_CYCLE_ON_RESUME)) {
                        baseDialog.dialogResume();
                    }
                } else {
                    ReleaseLogUtil.e(RELEASE_TAG, "context not instanceof Activity");
                }
            }
        }
        mIsDialogMapCleaned = false;
    }

    public static void cleanAllDialog(Context context) {
        ArrayList<Dialog> arrayListCleanAllDialogImpl = cleanAllDialogImpl(context.toString());
        if (arrayListCleanAllDialogImpl == null) {
            return;
        }
        Iterator<Dialog> it = arrayListCleanAllDialogImpl.iterator();
        while (it.hasNext()) {
            it.next().dismiss();
        }
    }

    private static void registerCleanDialogImpl(Dialog dialog, String str) {
        mCleanDialogMap.put(dialog, str);
    }

    private static void unregisterCleanDialogImpl(Dialog dialog) {
        mCleanDialogMap.remove(dialog);
    }

    private static ArrayList<Dialog> cleanAllDialogImpl(String str) {
        clearShowDialogMap(str);
        int size = mCleanDialogMap.size();
        if (size == 0) {
            return new ArrayList<>();
        }
        Iterator<Map.Entry<Dialog, String>> it = mCleanDialogMap.entrySet().iterator();
        ArrayList<Dialog> arrayList = null;
        while (it.hasNext()) {
            Map.Entry<Dialog, String> next = it.next();
            if (str.equals(next.getValue())) {
                Dialog key = next.getKey();
                if (key != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(size);
                    }
                    arrayList.add(key);
                }
                it.remove();
            }
        }
        return arrayList;
    }

    private static void clearShowDialogMap(String str) {
        Iterator<Map.Entry<Dialog, String>> it = sShowingDialogMap.entrySet().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getValue())) {
                it.remove();
            }
        }
    }

    private static void registerAdHideDialog(Dialog dialog, Context context) {
        if (context instanceof BaseActivity) {
            LogUtil.a(TAG, "registerAdHideDialog");
            sAdHideDialogMap.put(dialog, context.toString());
        }
    }

    public static void updateShowAdNowStatus(Context context, boolean z) {
        LogUtil.a(TAG, "updateShowAdNowStatus, context: ", context, " isShowAdNow: ", Boolean.valueOf(z));
        if (z) {
            hideAllDialogOnAdShow(context);
        } else {
            restoreAllDialogOnAdFinish(context);
        }
    }

    private static void hideAllDialogOnAdShow(Context context) {
        for (Map.Entry<Dialog, String> entry : sShowingDialogMap.entrySet()) {
            Dialog key = entry.getKey();
            String value = entry.getValue();
            if (key != null && TextUtils.equals(context.toString(), value) && key.isShowing()) {
                LogUtil.a(TAG, "hide dialog on ad show, context: ", context, " dialog: ", key);
                key.hide();
                registerAdHideDialog(key, context);
            }
        }
    }

    private static void restoreAllDialogOnAdFinish(Context context) {
        Iterator<Map.Entry<Dialog, String>> it = sAdHideDialogMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Dialog, String> next = it.next();
            Dialog key = next.getKey();
            String value = next.getValue();
            if (key != null && TextUtils.equals(context.toString(), value)) {
                LogUtil.a(TAG, "show dialog on ad finish, context: ", context, " dialog: ", key);
                key.show();
                it.remove();
            }
        }
    }

    public static void clearResource() {
        clearAdHideDialogMap();
    }

    private static void clearAdHideDialogMap() {
        sAdHideDialogMap.clear();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(i);
        qso.d().b(this);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        this.mView = view;
        super.setContentView(view);
        qso.d().b(this);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.mView = view;
        super.setContentView(view, layoutParams);
        qso.d().b(this);
    }

    public void setWindowGravityParams(int i) {
        this.mGravity = i;
    }

    public void setColumnType(int i) {
        this.mColumnType = i;
    }

    public void setBottomPadding() {
        Context context;
        Window window = getWindow();
        if (window == null || window.getDecorView() == null || (context = this.mContext) == null || qrs.af(context)) {
            return;
        }
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.dialogMarginBottom);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = 0;
        window.setAttributes(attributes);
        window.getDecorView().setPadding(0, 0, 0, dimensionPixelSize);
    }
}
