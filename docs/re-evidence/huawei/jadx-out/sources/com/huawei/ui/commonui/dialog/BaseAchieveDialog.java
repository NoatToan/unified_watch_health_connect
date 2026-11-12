package com.huawei.ui.commonui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.AnimResUtils;
import com.huawei.ui.commonui.utils.ResInfo;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseAchieveDialog extends QueueDialog implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener {
    private static final boolean IS_LITE_VERSION = false;
    protected static final float RING_EXTRA_BOTTOM_MARGIN_RATIO = 0.06666667f;
    protected static final float RING_EXTRA_TOP_MARGIN_RATIO = 0.31666666f;
    protected static final float RING_OCCUPIED_RATIO = 0.6666667f;
    protected static final String TAG = "BaseAchieveDialog";
    private HealthTextView mAchieveText;
    protected String mActiveHourText;
    private long mAnimFrameDuration;
    private ImageView mAnimImg;
    private List<String> mAnimResList;
    protected long mAnimationDuration;
    protected ThreeCircleShareCallback mCallback;
    protected ImageView mCancelImg;
    private HealthButton mCheckButton;
    private final Context mContext;
    protected AchieveDialogFactory.DialogType mDialogType;
    private final long mExpiredTime;
    private Drawable mFirstFrame;
    protected HealthTextView mGotoDetailText;
    private boolean mHasDoTextAnimation;
    private volatile boolean mHasTryToShown;
    protected String mHeatText;
    protected String mIntensityTimeText;
    private volatile boolean mIsAnimReady;
    private volatile boolean mIsDialogAbandoned;
    private Drawable mLastFrame;
    private byte mLayoutMask;
    private DialogResourcesListener mResourcesListener;
    protected float mRingExtraTopMarginRatio;
    protected ViewGroup mRootView;
    protected RelativeLayout mTextContainer;
    private byte mTextLayoutFlags;
    protected HealthTextView mTipText;

    protected abstract byte generateAllTextViewLayoutFlags();

    protected void goToShare() {
    }

    protected void initCancelImageAndTipText() {
    }

    protected abstract void onAnimSizeMeasured(int i, int i2);

    public abstract String toString();

    static /* synthetic */ byte access$480(BaseAchieveDialog baseAchieveDialog, int i) {
        byte b2 = (byte) (i ^ baseAchieveDialog.mTextLayoutFlags);
        baseAchieveDialog.mTextLayoutFlags = b2;
        return b2;
    }

    public BaseAchieveDialog(final Context context, final AchieveDialogFactory.DialogType dialogType, final DialogResourcesListener dialogResourcesListener) {
        super(context, R.style.DialogFullScreen, 0);
        this.mRingExtraTopMarginRatio = RING_EXTRA_TOP_MARGIN_RATIO;
        this.mLayoutMask = (byte) 1;
        this.mExpiredTime = ltb.b(System.currentTimeMillis());
        this.mAnimResList = null;
        this.mHasTryToShown = false;
        this.mIsAnimReady = false;
        this.mIsDialogAbandoned = false;
        this.mContext = context;
        this.mDialogType = dialogType;
        this.mResourcesListener = dialogResourcesListener;
        init();
        enqueueShowing(this);
        LogUtil.a(TAG, "animResName ", dialogType.getAnimResName());
        ThreadPoolManager.c().execute(new Runnable() { // from class: qjq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.m1665lambda$new$0$comhuaweiuicommonuidialogBaseAchieveDialog(context, dialogType, dialogResourcesListener);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-ui-commonui-dialog-BaseAchieveDialog, reason: not valid java name */
    public /* synthetic */ void m1665lambda$new$0$comhuaweiuicommonuidialogBaseAchieveDialog(Context context, AchieveDialogFactory.DialogType dialogType, DialogResourcesListener dialogResourcesListener) {
        LogUtil.a(TAG, "start fetchAnimation in thread");
        AnimResUtils.d dVar = new AnimResUtils.d();
        List<String> listB = AnimResUtils.b(context, dialogType.getAnimResName(), ResInfo.Location.HOME, dVar);
        this.mAnimResList = listB;
        if (njy.b(listB)) {
            this.mFirstFrame = AnimResUtils.a(this.mAnimResList.get(0));
            List<String> list = this.mAnimResList;
            this.mLastFrame = AnimResUtils.a(list.get(list.size() - 1));
            this.mAnimFrameDuration = dVar.b();
            this.mAnimationDuration = IS_LITE_VERSION ? 0L : ((long) this.mAnimResList.size()) * this.mAnimFrameDuration;
            this.mIsAnimReady = true;
            LogUtil.a(TAG, "dialog = ", toString(), " frames = ", Integer.valueOf(this.mAnimResList.size()), ", mAnimationDuration = ", Long.valueOf(this.mAnimationDuration));
            if (this.mHasTryToShown) {
                LogUtil.a(TAG, "has try to show achieve dialog: ", toString(), " before, anim ready now, show it");
                HandlerExecutor.b(new Runnable() { // from class: qjr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.show();
                    }
                });
                this.mHasTryToShown = false;
                return;
            }
            return;
        }
        LogUtil.e(TAG, "fetchAnimation get empty anim res, failed to fetch first frame!");
        if (dialogResourcesListener != null) {
            dialogResourcesListener.onResourcesDownloadFailed();
        }
        this.mIsDialogAbandoned = true;
    }

    public BaseAchieveDialog setHeatText(String str) {
        this.mHeatText = str;
        return this;
    }

    public BaseAchieveDialog setIntensityTimeText(String str) {
        this.mIntensityTimeText = str;
        return this;
    }

    public BaseAchieveDialog setActiveHourText(String str) {
        this.mActiveHourText = str;
        return this;
    }

    public void setGotoDetailBtnClickListener(final View.OnClickListener onClickListener) {
        HealthTextView healthTextView = this.mGotoDetailText;
        if (healthTextView == null || onClickListener == null) {
            return;
        }
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: qjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.m1666xd7a6e814(onClickListener, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setGotoDetailBtnClickListener$1$com-huawei-ui-commonui-dialog-BaseAchieveDialog, reason: not valid java name */
    public /* synthetic */ void m1666xd7a6e814(View.OnClickListener onClickListener, View view) {
        if (qrs.r()) {
            LogUtil.j(TAG, "setGotoDetailBtnClickListener is fast click");
        } else {
            dismiss();
            onClickListener.onClick(view);
        }
    }

    private void init() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        this.mTextLayoutFlags = generateAllTextViewLayoutFlags();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R.layout.base_achieve_dialog_layout, (ViewGroup) null);
        this.mRootView = viewGroup;
        this.mTextContainer = (RelativeLayout) viewGroup.findViewById(R.id.text_container);
        this.mAchieveText = (HealthTextView) this.mRootView.findViewById(R.id.achieve_text);
        initCancelImageAndTipText();
        ImageView imageView = (ImageView) this.mRootView.findViewById(R.id.anim_img);
        this.mAnimImg = imageView;
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.dialog.BaseAchieveDialog.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int width = BaseAchieveDialog.this.mAnimImg.getWidth();
                if (width <= 0 || BaseAchieveDialog.this.mFirstFrame == null) {
                    return;
                }
                int intrinsicHeight = (int) (width * (BaseAchieveDialog.this.mFirstFrame.getIntrinsicHeight() / BaseAchieveDialog.this.mFirstFrame.getIntrinsicWidth()));
                ViewGroup.LayoutParams layoutParams = BaseAchieveDialog.this.mAnimImg.getLayoutParams();
                layoutParams.height = intrinsicHeight;
                BaseAchieveDialog.this.mAnimImg.setLayoutParams(layoutParams);
                BaseAchieveDialog.this.mAnimImg.setImageDrawable(BaseAchieveDialog.IS_LITE_VERSION ? BaseAchieveDialog.this.mLastFrame : BaseAchieveDialog.this.mFirstFrame);
                BaseAchieveDialog.this.onAnimSizeMeasured(width, intrinsicHeight);
                BaseAchieveDialog.this.mAnimImg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        HealthButton healthButton = (HealthButton) this.mRootView.findViewById(R.id.button);
        this.mCheckButton = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.BaseAchieveDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                BaseAchieveDialog.this.dismiss();
                BaseAchieveDialog.this.goToShare();
            }
        });
        setContentView(this.mRootView);
        setLayoutParamsForRootView(this.mRootView);
        window.setType(1000);
        window.setBackgroundDrawableResource(R.color.common_black_50alpha);
        setOnShowListener(this);
        setOnDismissListener(this);
    }

    private void setCenterCardLayout() {
        RelativeLayout relativeLayout = this.mTextContainer;
        if (relativeLayout == null || this.mContext == null) {
            LogUtil.j(TAG, "setCenterCardLayout() mTextContainer or mContext is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        int iC = 0;
        if (qrs.af(this.mContext)) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.mContext, 0);
            int iJ = healthColumnSystem.j();
            float fMax = Math.max(0.0f, (iJ - 4) / 4.0f);
            LogUtil.a(TAG, "setCenterCardLayout isWidescreen, columnCount:", Integer.valueOf(iJ), " multiplier:", Float.valueOf(fMax));
            iC = (int) (healthColumnSystem.c() + (healthColumnSystem.f() * fMax) + healthColumnSystem.b());
            this.mCheckButton.setMinimumWidth(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_230dp));
        } else {
            this.mCheckButton.setMinimumWidth(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_192dp));
        }
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = iC;
            layoutParams2.rightMargin = iC;
            LogUtil.a(TAG, "setCenterCardLayout() marginLeft:", Integer.valueOf(iC));
            this.mTextContainer.setLayoutParams(layoutParams2);
        }
    }

    private void setLayoutParamsForRootView(View view) {
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.bottomMargin = (qrs.ad(getContext()) ? qrs.q(getContext()) : 0) + this.mContext.getResources().getDimensionPixelOffset(getMarginBottom());
            view.setLayoutParams(layoutParams);
        }
        this.mTextContainer.setPadding(0, this.mContext.getResources().getDimensionPixelOffset(getContainerMarginTop()), 0, this.mContext.getResources().getDimensionPixelOffset(getContainerMarginBottom()));
        setCenterCardLayout();
    }

    private int getContainerMarginTop() {
        if (qrs.aa(this.mContext)) {
            return R.dimen.health_common_12dp;
        }
        return R.dimen.health_common_96dp;
    }

    private int getContainerMarginBottom() {
        return R.dimen.health_common_24dp;
    }

    private int getMarginBottom() {
        if (qrs.aa(this.mContext)) {
            return R.dimen.health_common_12dp;
        }
        return R.dimen.health_common_48dp;
    }

    @Override // com.huawei.ui.commonui.dialog.QueueDialog
    protected boolean isReadyToShow() {
        LogUtil.a(TAG, "dialog IsReadyToShow : ", Boolean.valueOf(this.mIsAnimReady));
        return this.mIsAnimReady;
    }

    @Override // com.huawei.ui.commonui.dialog.QueueDialog
    protected boolean isDialogAbandoned() {
        LogUtil.a(TAG, "dialog mIsDialogAbandoned:", Boolean.valueOf(this.mIsDialogAbandoned), " mExpiredTime:", Long.valueOf(this.mExpiredTime));
        return this.mIsDialogAbandoned || System.currentTimeMillis() > this.mExpiredTime;
    }

    public void setIsDialogAbandoned(boolean z) {
        LogUtil.a(TAG, "setIsDialogAbandoned: ", Boolean.valueOf(z));
        this.mIsDialogAbandoned = z;
    }

    @Override // com.huawei.ui.commonui.dialog.QueueDialog, com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (isDestroy()) {
            LogUtil.j(TAG, "activity is destroy");
            this.mIsDialogAbandoned = true;
            this.mHasTryToShown = false;
        } else {
            setLayoutParamsForRootView(this.mRootView);
            if (!this.mIsAnimReady) {
                LogUtil.j(TAG, "try to show achieveDialog: ", toString(), ", but anim not ready, abort!");
                this.mHasTryToShown = true;
            } else {
                super.show();
            }
        }
    }

    private boolean isDestroy() {
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            ReleaseLogUtil.d(TAG, "isDestroy mContext ", context);
            return true;
        }
        Activity activity = (Activity) context;
        return activity.isFinishing() || activity.isDestroyed();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Drawable drawable;
        DialogResourcesListener dialogResourcesListener = this.mResourcesListener;
        if (dialogResourcesListener != null) {
            dialogResourcesListener.onShown();
        }
        if (njy.e(this.mAnimResList) || (drawable = this.mFirstFrame) == null) {
            LogUtil.e(TAG, "show dialog failed, cause mAnimResList is ", this.mAnimResList, ", mFirstFrame = ", this.mFirstFrame);
            return;
        }
        if (!IS_LITE_VERSION) {
            AnimResUtils.c(this.mAnimResList, drawable, this.mAnimFrameDuration, new c(this));
        }
        LogUtil.a(TAG, "dialog = ", toString(), " show mAnimationDrawable duration =", Long.valueOf(this.mAnimationDuration), ", frames count = ", Integer.valueOf(this.mAnimResList.size()));
        doTextAnimation();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.mAnimImg.setImageDrawable(null);
        this.mFirstFrame = null;
    }

    private void scheduleTextViewGlobalLayout(final View view, final int i) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.dialog.BaseAchieveDialog.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                BaseAchieveDialog.access$480(BaseAchieveDialog.this, i);
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                BaseAchieveDialog.this.doTextAnimation();
            }
        });
    }

    protected HealthTextView createTextViewAbove(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        return createTextView(i, i2, i3, i4, str, 2, i5, i6);
    }

    protected HealthTextView createTextViewBelow(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        return createTextView(i, i2, i3, i4, str, 3, i5, i6);
    }

    private HealthTextView createTextView(int i, int i2, int i3, int i4, String str, int i5, int i6, int i7) {
        HealthTextView healthTextView = new HealthTextView(getContext());
        healthTextView.setTextColor(i4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i5 == 2) {
            layoutParams.bottomMargin = i3;
        } else {
            layoutParams.topMargin = i3;
        }
        layoutParams.leftMargin = getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_24dp);
        layoutParams.rightMargin = getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_24dp);
        if (i2 != 0) {
            layoutParams.addRule(i5, i2);
        } else {
            layoutParams.addRule(i5 == 2 ? 8 : 6, R.id.anim_img);
        }
        layoutParams.addRule(14);
        healthTextView.setLayoutParams(layoutParams);
        healthTextView.setTextSize(0, getContext().getResources().getDimensionPixelSize(i6));
        healthTextView.setTypeface(Typeface.create(getContext().getResources().getString(i7), 0));
        healthTextView.setText(str);
        healthTextView.setId(i);
        healthTextView.setAlpha(0.0f);
        scheduleTextViewGlobalLayout(healthTextView, this.mLayoutMask);
        this.mLayoutMask = (byte) (this.mLayoutMask << 1);
        this.mTextContainer.addView(healthTextView);
        return healthTextView;
    }

    protected boolean isAllTextViewsLayout() {
        return this.mTextLayoutFlags == 0;
    }

    public void doTextAnimation() {
        this.mHasDoTextAnimation = true;
    }

    public boolean hasDoTextAnimation() {
        return this.mHasDoTextAnimation;
    }

    public BaseAchieveDialog setAchieveText(String str, boolean z) {
        if (this.mAchieveText == null) {
            return this;
        }
        boolean zF = LanguageUtil.f(getContext());
        boolean zQ = LanguageUtil.q(getContext());
        if ((!zF && !zQ) || !z) {
            this.mAchieveText.setText(str);
            return this;
        }
        String str2 = zF ? "，" : ",";
        String[] strArrSplit = str.split(str2);
        if (strArrSplit.length <= 0) {
            this.mAchieveText.setText(str);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            if (i < strArrSplit.length - 1) {
                sb.append(str2);
            }
            if (i == 0) {
                sb.append("\n");
            }
        }
        this.mAchieveText.setText(sb.toString());
        return this;
    }

    public BaseAchieveDialog setCheckButtonText(String str) {
        HealthButton healthButton = this.mCheckButton;
        if (healthButton != null) {
            healthButton.setText(str);
        }
        return this;
    }

    public void onConfigurationChanged(Configuration configuration) {
        setLayoutParamsForRootView(this.mRootView);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        setLayoutParamsForRootView(this.mRootView);
    }

    static final class c implements AnimResUtils.FrameCallback {
        private WeakReference<BaseAchieveDialog> d;

        public c(BaseAchieveDialog baseAchieveDialog) {
            this.d = new WeakReference<>(baseAchieveDialog);
        }

        @Override // com.huawei.ui.commonui.utils.AnimResUtils.FrameCallback
        public void doFrame(Drawable drawable) {
            BaseAchieveDialog baseAchieveDialog = this.d.get();
            if (baseAchieveDialog != null) {
                baseAchieveDialog.mAnimImg.setImageDrawable(drawable);
            }
        }

        @Override // com.huawei.ui.commonui.utils.AnimResUtils.FrameCallback
        public void showLastFrame() {
            BaseAchieveDialog baseAchieveDialog = this.d.get();
            if (baseAchieveDialog == null || baseAchieveDialog.mLastFrame == null) {
                return;
            }
            LogUtil.a(BaseAchieveDialog.TAG, "showLastFrame ");
            baseAchieveDialog.mAnimImg.setImageDrawable(baseAchieveDialog.mLastFrame);
        }
    }
}
