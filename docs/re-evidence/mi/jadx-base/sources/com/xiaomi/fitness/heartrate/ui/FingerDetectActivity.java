package com.xiaomi.fitness.heartrate.ui;

import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.heartrate.camera.NumberCounter;
import com.xiaomi.fitness.heartrate.camera.OnCounterChangedListener;
import com.xiaomi.fitness.heartrate.finger.DelmarConstants;
import com.xiaomi.fitness.heartrate.finger.FingerDetectUtil;
import com.xiaomi.fitness.heartrate.finger.FingerResultLiveData;
import com.xiaomi.fitness.heartrate.finger.FingerprintDetectManager;
import com.xiaomi.fitness.heartrate.finger.HeartRateCmdResultLocal;
import com.xiaomi.fitness.heartrate.ui.FingerDetectActivity;
import com.xiaomi.fitness.heartrate.utils.HeartRateExtKt;
import com.xiaomi.fitness.heartrate.utils.HeartRatePreference;
import com.xiaomi.smarthome.library.securecompact.FrequencySecureLimitHelper;
import defpackage.av6;
import defpackage.d0j;
import defpackage.lui;
import defpackage.o2j;
import defpackage.rgi;
import defpackage.rxi;
import defpackage.wc0;
import defpackage.y6c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u0000 u2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003uvwB\u0007¢\u0006\u0004\bt\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0007J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010\u0007J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010(J\u0015\u0010+\u001a\b\u0018\u00010*R\u00020\u0000H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010-H\u0014¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020\u0005*\u00020\u0003H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0014¢\u0006\u0004\b3\u0010\u0007J\u0017\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0005H\u0014¢\u0006\u0004\b8\u0010\u0007J\u000f\u00109\u001a\u00020\u0005H\u0014¢\u0006\u0004\b9\u0010\u0007J\u000f\u0010:\u001a\u00020\u0005H\u0014¢\u0006\u0004\b:\u0010\u0007J\u000f\u0010;\u001a\u00020\u0005H\u0014¢\u0006\u0004\b;\u0010\u0007J\r\u0010<\u001a\u00020\u0005¢\u0006\u0004\b<\u0010\u0007J\r\u0010=\u001a\u00020\u0005¢\u0006\u0004\b=\u0010\u0007J\u001f\u0010@\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0013H\u0016¢\u0006\u0004\b@\u0010\u0017J\u000f\u0010A\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010\u0007R\u001a\u0010B\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010CR\u0016\u0010[\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001c\u0010j\u001a\b\u0018\u00010*R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010\\R\u001a\u0010p\u001a\u00020\u00138\u0014X\u0094D¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bq\u0010ER\u0014\u0010s\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010E¨\u0006x"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity;", "Lcom/xiaomi/fitness/heartrate/ui/BaseDetectActivity;", "Lcom/xiaomi/fitness/heartrate/ui/HeartRateDetectViewModel;", "Ly6c;", "Lcom/xiaomi/fitness/heartrate/camera/OnCounterChangedListener;", "", "handleShowTitle", "()V", "startDetect", "handleStartDetect", "showFingerPermissionDialog", "onHasNoFocus", "Lcom/xiaomi/fitness/heartrate/finger/HeartRateCmdResultLocal;", "result", "onHeartRateResultCallback", "(Lcom/xiaomi/fitness/heartrate/finger/HeartRateCmdResultLocal;)V", "handlePerDetect", "handleUiReady", "handleFingerDown", "", "cmdId", "dataIndex", "onFingerUnlockBlock", "(II)V", "index", "onTouchByMistake", "onLongTimeNoHrmData", "onDetectError", "seconds", "updateRemainderTime", "(I)V", "handlePostDetect", "handleUiDisappear", "updateFingerAreaLabelPosition", "onDetectFinished", "handleLineDrawFinished", "openDetectReportFragment", "quit", "Landroid/view/animation/Animation;", "getAnimShow", "()Landroid/view/animation/Animation;", "getAnimHide", "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity$FingerAreaLabelAnimListener;", "getLabelAnimListener", "()Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity$FingerAreaLabelAnimListener;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Ly6c;)V", LifecycleConstantKt.ON_START, "", "hasFocus", "onWindowFocusChanged", "(Z)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "onLineDrawFinished", "jumpToReportFragment", VibrateModeSetFragment.MAX, "value", "onCounterValueChanged", "onCounterFinished", "layoutId", "I", "getLayoutId", "()I", "mDetectSate", "Landroid/view/MenuItem;", "mQuestionMark", "Landroid/view/MenuItem;", "Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder;", "mTitleViewHolder", "Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder;", "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectingAnimViewHolder;", "mFingerDetectingViewHolder", "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectingAnimViewHolder;", "Lcom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager;", "mDetectMgr", "Lcom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager;", "getMDetectMgr", "()Lcom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager;", "setMDetectMgr", "(Lcom/xiaomi/fitness/heartrate/finger/FingerprintDetectManager;)V", "Lcom/xiaomi/fitness/heartrate/camera/NumberCounter;", "mNumberCounter", "Lcom/xiaomi/fitness/heartrate/camera/NumberCounter;", "mRemainderTime", "mHadFingerDown", "Z", "mDetectFinished", "", "mFingerDownTime", "J", "Landroid/widget/TextView;", "mTvFingerAreaLabel", "Landroid/widget/TextView;", "mAnimShow", "Landroid/view/animation/Animation;", "mAnimHide", "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity$DetectHandler;", "mDetectHandler", "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity$DetectHandler;", "mLabelAnimListener", "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity$FingerAreaLabelAnimListener;", "", "mFingerAreaLabelY", "F", "mHasFocus", "detectType", "getDetectType", "getViewModelId", "viewModelId", "<init>", "Companion", "DetectHandler", "FingerAreaLabelAnimListener", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FingerDetectActivity extends Hilt_FingerDetectActivity<HeartRateDetectViewModel, y6c> implements OnCounterChangedListener {
    private static final int CODE_FINGER_PERMISSION = 16;
    private static final int FRAME_DURATION = 100;
    private static final int MAX_DETECT_TIME_MILLIS = 15000;
    public static final int MAX_DETECT_TIME_SECOND = 15;
    private static final int MAX_FRAME_NUM = 150;
    private static final int MSG_LINE_DRAW_FINISHED = 2;
    private static final int MSG_START_DETECT = 1;
    private static final int MSG_START_SHOW_TITLE = 3;
    private static final int STATE_FINGER_DOWN = 3;
    private static final int STATE_FINGER_UP = 4;
    private static final int STATE_NON = 0;
    private static final int STATE_PER_DETECT = 1;
    private static final int STATE_POST_DETECT = 5;
    private static final int STATE_UI_READY = 2;

    @NotNull
    private static final String TAG = "FingerDetectActivity";

    @Nullable
    private Animation mAnimHide;

    @Nullable
    private Animation mAnimShow;
    private boolean mDetectFinished;

    @Nullable
    private DetectHandler mDetectHandler;
    public FingerprintDetectManager mDetectMgr;
    private int mDetectSate;

    @Nullable
    private FingerDetectingAnimViewHolder mFingerDetectingViewHolder;
    private long mFingerDownTime;
    private volatile boolean mHadFingerDown;
    private boolean mHasFocus;

    @Nullable
    private FingerAreaLabelAnimListener mLabelAnimListener;

    @Nullable
    private MenuItem mQuestionMark;
    private int mRemainderTime;

    @Nullable
    private DetectTitleViewHolder mTitleViewHolder;

    @Nullable
    private TextView mTvFingerAreaLabel;
    private final int layoutId = lui.e;

    @NotNull
    private NumberCounter mNumberCounter = new NumberCounter(15000);
    private float mFingerAreaLabelY = -1000.0f;
    private final int detectType = 1;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity$DetectHandler;", "Landroid/os/Handler;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity;", "<init>", "(Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity;)V", "mFragmentRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DetectHandler extends Handler {

        @NotNull
        private final WeakReference<FingerDetectActivity> mFragmentRef;

        public DetectHandler(@NotNull FingerDetectActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.mFragmentRef = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            FingerDetectActivity fingerDetectActivity = this.mFragmentRef.get();
            if (fingerDetectActivity == null) {
                return;
            }
            int i = msg.what;
            if (i == 1) {
                fingerDetectActivity.handleStartDetect();
            } else if (i == 2) {
                fingerDetectActivity.handleLineDrawFinished();
            } else {
                if (i != 3) {
                    return;
                }
                fingerDetectActivity.handleShowTitle();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity$FingerAreaLabelAnimListener;", "Landroid/view/animation/Animation$AnimationListener;", "<init>", "(Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity;)V", "onAnimationStart", "", "animation", "Landroid/view/animation/Animation;", "onAnimationEnd", "onAnimationRepeat", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class FingerAreaLabelAnimListener implements Animation.AnimationListener {
        public FingerAreaLabelAnimListener() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (animation == FingerDetectActivity.this.mAnimHide) {
                TextView textView = FingerDetectActivity.this.mTvFingerAreaLabel;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            TextView textView2 = FingerDetectActivity.this.mTvFingerAreaLabel;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(FingerDetectActivity this$0, HeartRateCmdResultLocal heartRateCmdResultLocal) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onHeartRateResultCallback(heartRateCmdResultLocal);
        return Unit.INSTANCE;
    }

    private final Animation getAnimHide() {
        if (this.mAnimHide == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, rgi.f32522a);
            this.mAnimHide = animationLoadAnimation;
            Intrinsics.checkNotNull(animationLoadAnimation);
            animationLoadAnimation.setAnimationListener(getLabelAnimListener());
        }
        return this.mAnimHide;
    }

    private final Animation getAnimShow() {
        if (this.mAnimShow == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, rgi.f32523b);
            this.mAnimShow = animationLoadAnimation;
            Intrinsics.checkNotNull(animationLoadAnimation);
            animationLoadAnimation.setAnimationListener(getLabelAnimListener());
        }
        return this.mAnimShow;
    }

    private final FingerAreaLabelAnimListener getLabelAnimListener() {
        if (this.mLabelAnimListener == null) {
            this.mLabelAnimListener = new FingerAreaLabelAnimListener();
        }
        return this.mLabelAnimListener;
    }

    private final void handleFingerDown(HeartRateCmdResultLocal result) {
        Logger.i(TAG, "Handle finger down, mHadFingerDown=" + this.mHadFingerDown);
        if (this.mHadFingerDown) {
            this.mDetectSate = 3;
            int dataIndex = result.getDataIndex();
            int resultCode = result.getResultCode();
            int i = (15000 - (dataIndex * 100)) / 1000;
            this.mRemainderTime = i;
            HeartRateExtKt.logi("handleFingerDown dataIndex=" + dataIndex + " mRemainderTimeInSec=" + i);
            updateRemainderTime(this.mRemainderTime);
            if (resultCode == 0) {
                int mHeartRateValue = result.getMHeartRateValue();
                if (mHeartRateValue > 0) {
                    DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
                    Intrinsics.checkNotNull(detectTitleViewHolder);
                    detectTitleViewHolder.setBeatCount(mHeartRateValue);
                }
                FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
                if (fingerDetectingAnimViewHolder != null) {
                    fingerDetectingAnimViewHolder.setPpgValue(result.getMPpgValue());
                }
                if (dataIndex >= 100 && mHeartRateValue == 0) {
                    onLongTimeNoHrmData(result.getMMsgCode(), dataIndex);
                    return;
                }
            } else {
                DetectTitleViewHolder detectTitleViewHolder2 = this.mTitleViewHolder;
                if (detectTitleViewHolder2 != null) {
                    detectTitleViewHolder2.setTitle(d0j.w);
                }
                int mMsgCode = result.getMMsgCode();
                if (resultCode == 1028) {
                    HeartRateExtKt.logi("finger touch by mistake,resultCode = " + resultCode + ", cmdId = " + mMsgCode);
                    onTouchByMistake(mMsgCode, dataIndex);
                } else if (resultCode != 1111) {
                    HeartRateExtKt.logi("finger heart rate receive error code " + resultCode);
                } else {
                    HeartRateExtKt.logi("finger unlock block,resultCode = " + resultCode + " cmdId = " + mMsgCode);
                    onFingerUnlockBlock(mMsgCode, dataIndex);
                }
            }
            Logger.i(TAG, "handle result: index = " + dataIndex);
            if (dataIndex == 150) {
                this.mDetectFinished = true;
                this.mHadFingerDown = false;
                onDetectFinished(result);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLineDrawFinished() {
        if (isDestroyed()) {
            return;
        }
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        Intrinsics.checkNotNull(detectTitleViewHolder);
        detectTitleViewHolder.shouldShow(false);
    }

    private final void handlePerDetect() {
        this.mDetectSate = 1;
    }

    private final void handlePostDetect() {
        this.mDetectSate = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleShowTitle() {
        if (this.mDetectSate == 3) {
            DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
            Intrinsics.checkNotNull(detectTitleViewHolder);
            detectTitleViewHolder.setTitle(d0j.x);
        }
        DetectTitleViewHolder detectTitleViewHolder2 = this.mTitleViewHolder;
        Intrinsics.checkNotNull(detectTitleViewHolder2);
        detectTitleViewHolder2.shouldShow(true);
        TextView textView = this.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView);
        if (textView.getVisibility() != 0) {
            TextView textView2 = this.mTvFingerAreaLabel;
            Intrinsics.checkNotNull(textView2);
            textView2.startAnimation(getAnimShow());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStartDetect() {
        boolean permission_allowed = HeartRatePreference.INSTANCE.getPERMISSION_ALLOWED();
        HeartRateExtKt.logi("show finger printer if permission is allowed(" + permission_allowed + ")");
        if (permission_allowed) {
            getMDetectMgr().doSendCommandInWorker(400001);
            if (this.mFingerAreaLabelY > 0.0f) {
                TextView textView = this.mTvFingerAreaLabel;
                Intrinsics.checkNotNull(textView);
                textView.setY(this.mFingerAreaLabelY);
            }
        }
    }

    private final void handleUiDisappear() {
        DetectTitleViewHolder detectTitleViewHolder;
        Logger.i(TAG, "Handle UI disappear mDetectFinished=" + this.mDetectFinished);
        TextView textView = this.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView);
        textView.startAnimation(getAnimShow());
        getMDetectMgr().doSendCommandInWorker(400003);
        if (this.mDetectFinished) {
            return;
        }
        this.mDetectSate = 4;
        if (this.mHadFingerDown && (detectTitleViewHolder = this.mTitleViewHolder) != null) {
            detectTitleViewHolder.setTitle(d0j.x);
        }
        this.mHadFingerDown = false;
        this.mRemainderTime = 15;
        FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
        if (fingerDetectingAnimViewHolder != null) {
            fingerDetectingAnimViewHolder.stopPpgAnimation();
        }
        this.mNumberCounter.reset();
        if (System.currentTimeMillis() - this.mFingerDownTime > 3000) {
            FingerDetectUtil.INSTANCE.onFingerUpVibrate(this);
        }
    }

    private final void handleUiReady() {
        Logger.i(TAG, "Handle UI ready, mHadFingerDown=" + this.mHadFingerDown);
        if (this.mHadFingerDown) {
            return;
        }
        this.mHadFingerDown = true;
        FingerDetectUtil.INSTANCE.onFingerDownVibrate(this);
        this.mFingerDownTime = System.currentTimeMillis();
        TextView textView = this.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView);
        textView.startAnimation(getAnimHide());
        this.mNumberCounter.start();
        this.mDetectSate = 2;
        getMDetectMgr().doSendCommandInWorker(400002);
        MenuItem menuItem = this.mQuestionMark;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        if (detectTitleViewHolder != null) {
            detectTitleViewHolder.setTitle(d0j.w);
        }
        FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
        if (fingerDetectingAnimViewHolder != null) {
            fingerDetectingAnimViewHolder.stopPpgAnimation();
        }
        this.mRemainderTime = 15;
        updateRemainderTime(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(FingerDetectActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMDetectMgr().registerFpService();
    }

    private final void onDetectError() {
        this.mHadFingerDown = false;
        getMDetectMgr().doSendCommandInWorker(400003);
        FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
        if (fingerDetectingAnimViewHolder != null) {
            fingerDetectingAnimViewHolder.stopPpgAnimation();
        }
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        if (detectTitleViewHolder != null) {
            detectTitleViewHolder.setTitle(d0j.x);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDetectFinished(HeartRateCmdResultLocal result) {
        ((HeartRateDetectViewModel) getMViewModel()).setAvgHrm(result.getMHeartRateValue());
        ((HeartRateDetectViewModel) getMViewModel()).setMeasureTime(System.currentTimeMillis());
        ((HeartRateDetectViewModel) getMViewModel()).insertDetectRecord();
        FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
        if (fingerDetectingAnimViewHolder != null) {
            fingerDetectingAnimViewHolder.ppgEndStage();
        }
        getMDetectMgr().doSendCommandInWorker(400003, 400004);
        TextView textView = this.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(8);
        for (int i = 0; i < 10; i++) {
            FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder2 = this.mFingerDetectingViewHolder;
            if (fingerDetectingAnimViewHolder2 != null) {
                fingerDetectingAnimViewHolder2.setPpgValue(0);
            }
        }
    }

    private final void onFingerUnlockBlock(int cmdId, int dataIndex) {
        onDetectError();
    }

    private final void onHasNoFocus() {
        HeartRateExtKt.logi("has no focus: " + this.mHasFocus);
        getMDetectMgr().getFingerHeartRateResultLiveData().setHeartRateResultValue(null);
        if (this.mHasFocus) {
            this.mHasFocus = false;
            if (this.mHadFingerDown && !this.mDetectFinished) {
                DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
                if (detectTitleViewHolder != null) {
                    detectTitleViewHolder.setTitle(d0j.x);
                }
                TextView textView = this.mTvFingerAreaLabel;
                Intrinsics.checkNotNull(textView);
                textView.startAnimation(getAnimShow());
            }
            getMDetectMgr().doSendCommandInWorker(400003, 400004);
            this.mHadFingerDown = false;
            this.mNumberCounter.reset();
            FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
            if (fingerDetectingAnimViewHolder != null) {
                fingerDetectingAnimViewHolder.stopPpgAnimation();
            }
            DetectHandler detectHandler = this.mDetectHandler;
            Intrinsics.checkNotNull(detectHandler);
            detectHandler.removeCallbacksAndMessages(null);
        }
    }

    private final void onHeartRateResultCallback(HeartRateCmdResultLocal result) {
        if (result == null || isDestroyed()) {
            return;
        }
        int mMsgCode = result.getMMsgCode();
        HeartRateExtKt.logi("ResultCallback: cmd = " + DelmarConstants.INSTANCE.getCmdName(mMsgCode));
        switch (mMsgCode) {
            case 400001:
                handlePerDetect();
                break;
            case 400002:
                handleFingerDown(result);
                break;
            case 400004:
                handlePostDetect();
                break;
            case DelmarConstants.HEARTBEAT_RATE_CMD_NOTIFY_UI_READY /* 400100 */:
                handleUiReady();
                break;
            case DelmarConstants.HEARTBEAT_RATE_CMD_NOTIFY_UI_DISAPPEAR /* 400101 */:
                handleUiDisappear();
                break;
        }
    }

    private final void onLongTimeNoHrmData(int cmdId, int index) {
        HeartRateExtKt.logi("onLongTimeNoHrmData cmdId=" + cmdId + " index=" + index);
        onDetectError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(FingerDetectActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.mTvFingerAreaLabel;
        if (textView == null || this$0.mFingerAreaLabelY <= 0.0f) {
            return;
        }
        Intrinsics.checkNotNull(textView);
        textView.setY(this$0.mFingerAreaLabelY);
    }

    private final void onTouchByMistake(int cmdId, int index) {
        onDetectError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openDetectReportFragment() {
        HeartRateReportActivity.INSTANCE.launchReport(this, 1, ((HeartRateDetectViewModel) getMViewModel()).getMeasureTime(), ((HeartRateDetectViewModel) getMViewModel()).getAvgHrm(), 1, "page_detect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quit() {
        finish();
    }

    private final void showFingerPermissionDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("finger_permission_request").setDialogTitle(d0j.A).setCanceledOnBackPressed(false).setDialogTheme(o2j.f28677b).setDialogDescription(d0j.t).setPositiveText(d0j.f14929a).setNegativeText(d0j.d0).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.heartrate.ui.FingerDetectActivity.showFingerPermissionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    HeartRatePreference.INSTANCE.setPERMISSION_ALLOWED(true);
                } else {
                    FingerDetectActivity.this.quit();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void startDetect() {
        HeartRateExtKt.logi("start detect");
        DetectHandler detectHandler = this.mDetectHandler;
        Intrinsics.checkNotNull(detectHandler);
        detectHandler.sendEmptyMessageDelayed(1, 300L);
        FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
        if (fingerDetectingAnimViewHolder != null) {
            fingerDetectingAnimViewHolder.clearPpgLine();
        }
    }

    private final void updateFingerAreaLabelPosition() {
        if (this.mFingerAreaLabelY > 0.0f) {
            TextView textView = this.mTvFingerAreaLabel;
            Intrinsics.checkNotNull(textView);
            textView.setY(this.mFingerAreaLabelY);
        } else {
            TextView textView2 = this.mTvFingerAreaLabel;
            Intrinsics.checkNotNull(textView2);
            textView2.post(new Runnable() { // from class: wn9
                @Override // java.lang.Runnable
                public final void run() {
                    FingerDetectActivity.updateFingerAreaLabelPosition$lambda$3(this.f38158a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFingerAreaLabelPosition$lambda$3(FingerDetectActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Point fpFodLocation = SystemProperties.INSTANCE.getFpFodLocation();
        UIUtils uIUtils = UIUtils.INSTANCE;
        float fPhysicalScreenHeight = uIUtils.physicalScreenHeight(this$0);
        float screenRealHeight = uIUtils.getScreenRealHeight(this$0);
        int statusBarHeight = uIUtils.getStatusBarHeight(this$0);
        wc0 miuiActionBar = this$0.getMiuiActionBar();
        int height = miuiActionBar != null ? miuiActionBar.getHeight() : 0;
        float sp = (((fpFodLocation.y / fPhysicalScreenHeight) * screenRealHeight) - height) - ExtUtilsKt.getSp(20);
        this$0.mFingerAreaLabelY = sp;
        Logger.i(TAG, "mFingerAreaLabelY=" + sp + " fodLocation.y=" + fpFodLocation.y + " physicalScreenHeight=" + fPhysicalScreenHeight + " screenRealHeight=" + screenRealHeight + " statusBarHeight=" + statusBarHeight + " actionBarHeight=" + height);
        TextView textView = this$0.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView);
        textView.setY(this$0.mFingerAreaLabelY);
        TextView textView2 = this$0.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView2);
        textView2.bringToFront();
    }

    private final void updateRemainderTime(int seconds) {
        String quantityString = getResources().getQuantityString(rxi.f33038a, seconds, Integer.valueOf(seconds));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        Intrinsics.checkNotNull(detectTitleViewHolder);
        detectTitleViewHolder.setDesc(quantityString);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull y6c y6cVar) {
        Intrinsics.checkNotNullParameter(y6cVar, "<this>");
        this.mTvFingerAreaLabel = y6cVar.C;
        updateFingerAreaLabelPosition();
        View layoutTitle = y6cVar.B;
        Intrinsics.checkNotNullExpressionValue(layoutTitle, "layoutTitle");
        DetectTitleViewHolder detectTitleViewHolder = new DetectTitleViewHolder(layoutTitle);
        this.mTitleViewHolder = detectTitleViewHolder;
        Intrinsics.checkNotNull(detectTitleViewHolder);
        detectTitleViewHolder.setTitle(d0j.v);
        View layoutFingerDetectingAnim = y6cVar.A;
        Intrinsics.checkNotNullExpressionValue(layoutFingerDetectingAnim, "layoutFingerDetectingAnim");
        this.mFingerDetectingViewHolder = new FingerDetectingAnimViewHolder(layoutFingerDetectingAnim);
        Lifecycle lifecycle = getLifecycle();
        FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder;
        Intrinsics.checkNotNull(fingerDetectingAnimViewHolder, "null cannot be cast to non-null type androidx.lifecycle.DefaultLifecycleObserver");
        lifecycle.addObserver(fingerDetectingAnimViewHolder);
        FingerResultLiveData fingerHeartRateResultLiveData = getMDetectMgr().getFingerHeartRateResultLiveData();
        LifecycleOwner lifecycleOwnerC = y6cVar.C();
        Intrinsics.checkNotNull(lifecycleOwnerC);
        fingerHeartRateResultLiveData.observe(lifecycleOwnerC, new FingerDetectActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xn9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FingerDetectActivity.bindView$lambda$1(this.f39278a, (HeartRateCmdResultLocal) obj);
            }
        }));
        if (!HeartRatePreference.INSTANCE.getPERMISSION_ALLOWED()) {
            showFingerPermissionDialog();
        }
        NumberCounter numberCounter = this.mNumberCounter;
        Intrinsics.checkNotNull(numberCounter);
        numberCounter.setOnValueChangedListener(this);
    }

    @Override // com.xiaomi.fitness.heartrate.ui.BaseDetectActivity
    public int getDetectType() {
        return this.detectType;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @NotNull
    public final FingerprintDetectManager getMDetectMgr() {
        FingerprintDetectManager fingerprintDetectManager = this.mDetectMgr;
        if (fingerprintDetectManager != null) {
            return fingerprintDetectManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDetectMgr");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void jumpToReportFragment() {
        View view;
        TextView textView = this.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(8);
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        if (detectTitleViewHolder != null && (view = detectTitleViewHolder.getView()) != null) {
            view.setVisibility(8);
        }
        FingerDetectUtil.INSTANCE.onFinishBtnClickVibrate(((y6c) getMBinding()).getRoot());
        openDetectReportFragment();
        quit();
    }

    @Override // com.xiaomi.fitness.heartrate.camera.OnCounterChangedListener
    public void onCounterFinished() {
        this.mDetectFinished = true;
    }

    @Override // com.xiaomi.fitness.heartrate.camera.OnCounterChangedListener
    public void onCounterValueChanged(int max, int value) {
        FingerDetectingAnimViewHolder fingerDetectingAnimViewHolder;
        if (value >= 750) {
            this.mNumberCounter.reset();
        } else {
            if (value % 100 != 0 || (fingerDetectingAnimViewHolder = this.mFingerDetectingViewHolder) == null) {
                return;
            }
            fingerDetectingAnimViewHolder.setPpgValue(0);
        }
    }

    @Override // com.xiaomi.fitness.heartrate.ui.Hilt_FingerDetectActivity, com.xiaomi.fitness.heartrate.ui.BaseDetectActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HeartRateExtKt.logi("lifecycle callback onCreate running");
        this.mDetectHandler = new DetectHandler(this);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightNavigationBar(window, false);
        ExecutorHelper.runInBackground(new Runnable() { // from class: vn9
            @Override // java.lang.Runnable
            public final void run() {
                FingerDetectActivity.onCreate$lambda$0(this.f37056a);
            }
        });
        getWindow().addFlags(128);
    }

    @Override // com.xiaomi.fitness.heartrate.ui.Hilt_FingerDetectActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HeartRateExtKt.logi("lifecycle callback onDestroy running");
        DetectHandler detectHandler = this.mDetectHandler;
        Intrinsics.checkNotNull(detectHandler);
        detectHandler.removeCallbacksAndMessages(null);
        TextView textView = this.mTvFingerAreaLabel;
        Intrinsics.checkNotNull(textView);
        textView.clearAnimation();
        getMDetectMgr().clearResultLiveData();
        getMDetectMgr().unregisterFpService();
        this.mNumberCounter.forceStop();
    }

    public final void onLineDrawFinished() {
        DetectHandler detectHandler = this.mDetectHandler;
        Intrinsics.checkNotNull(detectHandler);
        detectHandler.sendEmptyMessageDelayed(2, FrequencySecureLimitHelper.INVOKE_TIME_THRESHOLD);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        HeartRateExtKt.logi("lifecycle callback onPause running");
        onHasNoFocus();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HeartRateExtKt.logi("lifecycle callback onResume running");
        ExecutorHelper.postInMain(new Runnable() { // from class: yn9
            @Override // java.lang.Runnable
            public final void run() {
                FingerDetectActivity.onResume$lambda$2(this.f40342a);
            }
        }, 800L);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        HeartRateExtKt.logi("lifecycle callback onStart running");
        DetectHandler detectHandler = this.mDetectHandler;
        Intrinsics.checkNotNull(detectHandler);
        detectHandler.sendEmptyMessageDelayed(3, 200L);
        if (UIUtils.INSTANCE.checkMultiWindow(this)) {
            ToastExtKt.toastShort(this, d0j.s);
            quit();
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        HeartRateExtKt.logi("lifecycle callback onStop running");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        HeartRateExtKt.logi("onWindowFocusChanged, hasFocus=" + hasFocus);
        if (!hasFocus) {
            onHasNoFocus();
        } else {
            this.mHasFocus = true;
            startDetect();
        }
    }

    public final void setMDetectMgr(@NotNull FingerprintDetectManager fingerprintDetectManager) {
        Intrinsics.checkNotNullParameter(fingerprintDetectManager, "<set-?>");
        this.mDetectMgr = fingerprintDetectManager;
    }
}
