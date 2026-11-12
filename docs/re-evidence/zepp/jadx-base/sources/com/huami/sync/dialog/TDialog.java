package com.huami.sync.dialog;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.annotation.FloatRange;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sync.dialog.TDialog;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.Constant;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0088\u0001*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0002\u0088\u0001B\u0011\u0012\u0007\u0010\u0086\u0001\u001a\u00020@¢\u0006\u0005\b\u0087\u0001\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0004J\b\u0010\u000b\u001a\u00020\u0003H\u0004J\b\u0010\f\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ\u001e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aJ\u0016\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00028\u00002\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00028\u00002\u0006\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00028\u00002\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b)\u0010'J\u0017\u0010+\u001a\u00028\u00002\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\b\u0010-\u001a\u0004\u0018\u00010*¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0011¢\u0006\u0004\b.\u0010!J\u0015\u00100\u001a\u00028\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0010\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u000202H\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\u0010\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u00020$H\u0004R\"\u0010?\u001a\u0002088\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010M\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010T\u001a\u00020$8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020$8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bU\u0010O\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR\u0018\u0010Z\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR$\u0010d\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020]8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR.\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010h\u001a\u0004\u0018\u00010\u00068\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010HR\u0016\u0010r\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010HR*\u0010v\u001a\u00020$2\u0006\u0010h\u001a\u00020$8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010O\u001a\u0004\bt\u0010Q\"\u0004\bu\u0010SR*\u0010z\u001a\u00020$2\u0006\u0010h\u001a\u00020$8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010O\u001a\u0004\bx\u0010Q\"\u0004\by\u0010SR\u0016\u0010|\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010HR\u0016\u0010~\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010HR\u0018\u0010\u0081\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/huami/sync/dialog/TDialog;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Dialog;", "", "f", "c", "Landroid/view/View;", "onCreateView", "targetView", "onViewCreated", "onShowAnimEnd", "onDismissAnimEnd", "bindView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onAttachedToWindow", "", g.g, "setCanceledOnTouchOutside", "show", "onStart", "onStop", "onDetachedFromWindow", "dismiss", "superDismiss", "", "animStyle", "gravity", "x", "y", "showAtLocation", "popupStyle", "(Z)Lcom/huami/sync/dialog/TDialog;", "isDimEnabled", "dimEnabled", "", "dimAmount", "dim", "(F)Lcom/huami/sync/dialog/TDialog;", "widthScale", "heightScale", "Lcom/huami/sync/dialog/AnimatorSet;", "showAnim", "(Lcom/huami/sync/dialog/AnimatorSet;)Lcom/huami/sync/dialog/TDialog;", "dismissAnim", "autoDismiss", "", "autoDismissDelay", "(J)Lcom/huami/sync/dialog/TDialog;", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "onBackPressed", Constant.PAI_KEY_DAILY_PAI, "dp2px", "", "a", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "setMTag", "(Ljava/lang/String;)V", "mTag", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Z", "getMCancelOnTouchOutside", "()Z", "setMCancelOnTouchOutside", "(Z)V", "mCancelOnTouchOutside", GoogleApiAvailabilityLight.a, "F", "getMWidthScale", "()F", "setMWidthScale", "(F)V", "mWidthScale", "e", "getMHeightScale", "setMHeightScale", "mHeightScale", "Lcom/huami/sync/dialog/AnimatorSet;", "mShowAnim", "g", "mDismissAnim", "Landroid/widget/LinearLayout;", "h", "Landroid/widget/LinearLayout;", "getMTopContainer", "()Landroid/widget/LinearLayout;", "setMTopContainer", "(Landroid/widget/LinearLayout;)V", "mTopContainer", "mControlHeightContainer", "getMControlHeightContainer", "setMControlHeightContainer", "<set-?>", "i", "Landroid/view/View;", "getTargetView", "()Landroid/view/View;", "setTargetView", "(Landroid/view/View;)V", z.j, "isShowAnimRunning", hl.k, "isDismissAnimRunning", "l", "getMaxHeight", "setMaxHeight", "maxHeight", "m", "getMaxWidth", "setMaxWidth", "maxWidth", GoogleApiAvailabilityLight.b, "isPopupStyle", "o", "mAutoDismiss", b.r, "J", "mAutoDismissDelay", "Landroid/os/Handler;", DTransferConstants.SEARCH_KEY, "Landroid/os/Handler;", "mHandler", DbUtils.Const.Table.CONTEXT, "<init>", "Companion", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public abstract class TDialog<T extends TDialog<T>> extends Dialog {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String mTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Context mContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean mCancelOnTouchOutside;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mWidthScale;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float mHeightScale;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private AnimatorSet mShowAnim;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private AnimatorSet mDismissAnim;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private LinearLayout mTopContainer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private View targetView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isShowAnimRunning;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isDismissAnimRunning;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float maxHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float maxWidth;
    public LinearLayout mControlHeightContainer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isPopupStyle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean mAutoDismiss;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long mAutoDismissDelay;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Handler mHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0013\u0010\u0007\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/sync/dialog/TDialog$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getStatusBarHeight", "", "isFlymeOs4x", "()Z", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getStatusBarHeight(@NotNull Context context) {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
            return isFlymeOs4x() ? dimensionPixelSize * 2 : dimensionPixelSize;
        }

        public final boolean isFlymeOs4x() {
            if (!Intrinsics.areEqual("4.4.4", Build.VERSION.RELEASE)) {
                return false;
            }
            String str = Build.VERSION.INCREMENTAL;
            return !TextUtils.isEmpty(str) ? StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "Flyme_OS_4", false, 2, (Object) null) : StringsKt__StringsKt.contains$default((CharSequence) Build.DISPLAY, (CharSequence) "Flyme OS 4", false, 2, (Object) null);
        }
    }

    public TDialog(@NotNull Context context) {
        super(context);
        this.mWidthScale = 1.0f;
        this.mAutoDismissDelay = 1500L;
        this.mHandler = new Handler(Looper.getMainLooper());
        f();
        this.mContext = context;
        this.mTag = getClass().getSimpleName();
        setCanceledOnTouchOutside(true);
        Log.d(this.mTag, "constructor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (!this.mAutoDismiss || this.mAutoDismissDelay <= 0) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: lk7
            @Override // java.lang.Runnable
            public final void run() {
                TDialog.d(this.a);
            }
        }, this.mAutoDismissDelay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(TDialog tDialog) {
        tDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TDialog tDialog, View view) {
        if (tDialog.getMCancelOnTouchOutside()) {
            tDialog.dismiss();
        }
    }

    private final void f() {
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(2);
    }

    @NotNull
    public final T autoDismiss(boolean autoDismiss) {
        this.mAutoDismiss = autoDismiss;
        return this;
    }

    @NotNull
    public final T autoDismissDelay(long autoDismissDelay) {
        this.mAutoDismissDelay = autoDismissDelay;
        return this;
    }

    public abstract void bindView();

    @NotNull
    public final T dim(@FloatRange(from = 0.0d, to = 1.0d) float dimAmount) {
        getWindow().setDimAmount(dimAmount);
        getWindow().addFlags(2);
        return this;
    }

    @NotNull
    public final T dimEnabled(boolean isDimEnabled) {
        if (isDimEnabled) {
            getWindow().addFlags(2);
        } else {
            getWindow().clearFlags(2);
        }
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Log.d(this.mTag, "dismiss");
        AnimatorSet animatorSet = this.mDismissAnim;
        if (animatorSet != null) {
            animatorSet.listener(new AnimatorSet.AnimatorListener(this) { // from class: com.huami.sync.dialog.TDialog.dismiss.1
                public final /* synthetic */ TDialog<T> a;

                {
                    this.a = this;
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationCancel(@Nullable Animator animator) {
                    ((TDialog) this.a).isDismissAnimRunning = false;
                    this.a.superDismiss();
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animator) {
                    ((TDialog) this.a).isDismissAnimRunning = false;
                    this.a.superDismiss();
                    this.a.onDismissAnimEnd();
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationRepeat(@Nullable Animator animator) {
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationStart(@Nullable Animator animator) {
                    ((TDialog) this.a).isDismissAnimRunning = true;
                }
            }).playOn(getMControlHeightContainer());
        } else {
            superDismiss();
        }
    }

    @NotNull
    public final T dismissAnim(@Nullable AnimatorSet dismissAnim) {
        this.mDismissAnim = dismissAnim;
        return this;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        if (this.isDismissAnimRunning || this.isShowAnimRunning || this.mAutoDismiss) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    public final int dp2px(float dp) {
        return (int) ((dp * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final boolean getMCancelOnTouchOutside() {
        return this.mCancelOnTouchOutside;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final LinearLayout getMControlHeightContainer() {
        LinearLayout linearLayout = this.mControlHeightContainer;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final float getMHeightScale() {
        return this.mHeightScale;
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @Nullable
    public final LinearLayout getMTopContainer() {
        return this.mTopContainer;
    }

    public final float getMWidthScale() {
        return this.mWidthScale;
    }

    public final float getMaxHeight() {
        return this.maxHeight;
    }

    public final float getMaxWidth() {
        return this.maxWidth;
    }

    @Nullable
    public final View getTargetView() {
        return this.targetView;
    }

    @NotNull
    public T heightScale(float heightScale) {
        this.mHeightScale = heightScale;
        return this;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        View childAt;
        super.onAttachedToWindow();
        Log.d(this.mTag, "onAttachedToWindow");
        bindView();
        float f = this.mWidthScale;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? -2 : (int) (this.maxWidth * f);
        float f2 = this.mHeightScale;
        int i2 = f2 == 0.0f ? -2 : (int) (this.maxHeight * f2);
        getMControlHeightContainer().setLayoutParams(new LinearLayout.LayoutParams(i, i2));
        if (getMControlHeightContainer().getChildCount() > 0 && (childAt = getMControlHeightContainer().getChildAt(0)) != null && (childAt.getLayoutParams().height == -2 || childAt.getLayoutParams().height == -1)) {
            childAt.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
        }
        AnimatorSet animatorSet = this.mShowAnim;
        if (animatorSet != null) {
            animatorSet.listener(new AnimatorSet.AnimatorListener(this) { // from class: com.huami.sync.dialog.TDialog.onAttachedToWindow.1
                public final /* synthetic */ TDialog<T> a;

                {
                    this.a = this;
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationCancel(@Nullable Animator animator) {
                    ((TDialog) this.a).isShowAnimRunning = false;
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animator) {
                    ((TDialog) this.a).isShowAnimRunning = false;
                    this.a.c();
                    this.a.onShowAnimEnd();
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationRepeat(@Nullable Animator animator) {
                }

                @Override // com.huami.sync.dialog.AnimatorSet.AnimatorListener
                public void onAnimationStart(@Nullable Animator animator) {
                    ((TDialog) this.a).isShowAnimRunning = true;
                }
            }).playOn(getMControlHeightContainer());
        } else {
            AnimatorSet.INSTANCE.reset(getMControlHeightContainer());
            c();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.isDismissAnimRunning || this.isShowAnimRunning || this.mAutoDismiss) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(this.mTag, "onCreate");
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        this.maxHeight = displayMetrics.heightPixels - INSTANCE.getStatusBarHeight(this.mContext);
        this.maxWidth = displayMetrics.widthPixels;
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        this.mTopContainer = linearLayout;
        linearLayout.setGravity(17);
        setMControlHeightContainer(new LinearLayout(this.mContext));
        getMControlHeightContainer().setOrientation(1);
        this.targetView = onCreateView();
        getMControlHeightContainer().addView(this.targetView);
        this.mTopContainer.addView(getMControlHeightContainer());
        onViewCreated(this.targetView);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((int) this.maxWidth, (int) this.maxHeight);
        if (this.isPopupStyle) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        setContentView(this.mTopContainer, layoutParams);
        this.mTopContainer.setOnClickListener(new View.OnClickListener() { // from class: kk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TDialog.e(this.a, view);
            }
        });
        this.targetView.setClickable(true);
    }

    @Nullable
    public abstract View onCreateView();

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(this.mTag, "onDetachedFromWindow");
    }

    public final void onDismissAnimEnd() {
    }

    public final void onShowAnimEnd() {
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Log.d(this.mTag, "onStart");
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        Log.d(this.mTag, "onStop");
    }

    public final void onViewCreated(@Nullable View targetView) {
    }

    @NotNull
    public final T popupStyle(boolean popupStyle) {
        this.isPopupStyle = popupStyle;
        return this;
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean cancel) {
        this.mCancelOnTouchOutside = cancel;
        super.setCanceledOnTouchOutside(cancel);
    }

    public final void setMCancelOnTouchOutside(boolean z) {
        this.mCancelOnTouchOutside = z;
    }

    public final void setMContext(@NotNull Context context) {
        this.mContext = context;
    }

    public final void setMControlHeightContainer(@NotNull LinearLayout linearLayout) {
        this.mControlHeightContainer = linearLayout;
    }

    public final void setMHeightScale(float f) {
        this.mHeightScale = f;
    }

    public final void setMTag(@NotNull String str) {
        this.mTag = str;
    }

    public final void setMTopContainer(@Nullable LinearLayout linearLayout) {
        this.mTopContainer = linearLayout;
    }

    public final void setMWidthScale(float f) {
        this.mWidthScale = f;
    }

    public final void setMaxHeight(float f) {
        this.maxHeight = f;
    }

    public final void setMaxWidth(float f) {
        this.maxWidth = f;
    }

    public final void setTargetView(@Nullable View view) {
        this.targetView = view;
    }

    @Override // android.app.Dialog
    public void show() {
        Log.d(this.mTag, "show");
        super.show();
    }

    @NotNull
    public final T showAnim(@Nullable AnimatorSet showAnim) {
        this.mShowAnim = showAnim;
        return this;
    }

    public final void showAtLocation(int gravity, int x, int y) {
        if (this.isPopupStyle) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setGravity(gravity);
            attributes.x = x;
            attributes.y = y;
        }
        show();
    }

    public final void superDismiss() {
        super.dismiss();
    }

    @NotNull
    public T widthScale(float widthScale) {
        this.mWidthScale = widthScale;
        return this;
    }

    public final void show(int animStyle) {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(animStyle);
        }
        show();
    }

    public final void showAtLocation(int x, int y) {
        showAtLocation(51, x, y);
    }
}
