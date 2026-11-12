package com.xiaomi.fitness.heartrate.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.heartrate.camera.BmpMonitorHelper;
import com.xiaomi.fitness.heartrate.camera.DetectResult;
import com.xiaomi.fitness.heartrate.camera.NumberCounter;
import com.xiaomi.fitness.heartrate.camera.OnCounterChangedListener;
import com.xiaomi.fitness.heartrate.ui.CameraDetectActivity;
import com.xiaomi.heart.bmp.MonitorStatus;
import defpackage.av6;
import defpackage.d0j;
import defpackage.f43;
import defpackage.lui;
import defpackage.o2j;
import defpackage.u6c;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 U2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002UVB\u0007¢\u0006\u0004\bT\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0005*\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\u0005¢\u0006\u0004\b$\u0010\u0007J\u0015\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\r¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0015H\u0014¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\u0005H\u0014¢\u0006\u0004\b)\u0010\u0007R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010.R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010;R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010.R\u0016\u0010K\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010.R\u001a\u0010L\u001a\u00020\r8\u0014X\u0094D¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\bM\u0010;R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010R\u001a\b\u0012\u0002\b\u0003\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/CameraDetectActivity;", "Lcom/xiaomi/fitness/heartrate/ui/BaseDetectActivity;", "Lcom/xiaomi/fitness/heartrate/ui/HeartRateDetectViewModel;", "Lu6c;", "Lcom/xiaomi/fitness/heartrate/camera/OnCounterChangedListener;", "", "dismissShowingDialog", "()V", "requireCameraPermission", "showRationaleDialog", "openCamera", "showCheckFinger", "hideFingerGuide", "", "maxTime", "restartTimer", "(I)V", "updateCurrentBmpTitle", "showHeartBeatAnim", "onFpsJitter", "onPauseTimeExceed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Lu6c;)V", "Lcom/xiaomi/fitness/heartrate/camera/DetectResult;", "result", "receiveBmpResult", "(Lcom/xiaomi/fitness/heartrate/camera/DetectResult;)V", VibrateModeSetFragment.MAX, "value", "onCounterValueChanged", "(II)V", "onCounterFinished", "onDetectFinished", "selectPosition", "openDetectReportFragment", "outState", "onSaveInstanceState", LifecycleConstantKt.ON_DESTROY, "mDetectTime", "I", "", "mShowHeartRateAnim", "Z", "mHadDetected", "mFingerTipped", "mFindFinger", "mState", "Lf43;", "mBmpResult", "Lf43;", "Lcom/xiaomi/fitness/heartrate/camera/NumberCounter;", "mNumberCounter", "Lcom/xiaomi/fitness/heartrate/camera/NumberCounter;", "viewModelId", "getViewModelId", "()I", "layoutId", "getLayoutId", "Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder;", "mPreviewViewHolder", "Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder;", "Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder;", "mTitleViewHolder", "Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder;", "Lcom/xiaomi/fitness/heartrate/ui/DetectAnimationViewHolder;", "mDetectAnimationViewHolder", "Lcom/xiaomi/fitness/heartrate/ui/DetectAnimationViewHolder;", "Lcom/xiaomi/fitness/heartrate/ui/DetectFinishedViewHolder;", "mFinishedViewHolder", "Lcom/xiaomi/fitness/heartrate/ui/DetectFinishedViewHolder;", "mDetectFinished", "mFpsJitter", "detectType", "getDetectType", "Ljava/lang/Runnable;", "requireCameraPermissionRunnable", "Ljava/lang/Runnable;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", CameraDetectActivity.JITTER_DIALOG_NAME, "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "<init>", "Companion", "JitterDialogCallback", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCameraDetectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraDetectActivity.kt\ncom/xiaomi/fitness/heartrate/ui/CameraDetectActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,386:1\n13402#2,2:387\n*S KotlinDebug\n*F\n+ 1 CameraDetectActivity.kt\ncom/xiaomi/fitness/heartrate/ui/CameraDetectActivity\n*L\n130#1:387,2\n*E\n"})
public final class CameraDetectActivity extends Hilt_CameraDetectActivity<HeartRateDetectViewModel, u6c> implements OnCounterChangedListener {

    @NotNull
    private static final String CAMERA_PERMISSION_DIALOG_NAME = "cameraPermissionDialog";

    @NotNull
    private static final String JITTER_DIALOG_NAME = "jitterDialog";

    @NotNull
    private static final String KEY_DETECT_FINISHED = "key_detect_finished";
    private static final int MAX_IN_DETECT_TIME = 15000;
    private static final int PAUSE_CHECK_TIME = 5000;
    private static final int STATE_INIT_CHECK = 0;
    private static final int STATE_INIT_RE_CHECK = 3;
    private static final int STATE_IN_DETECT = 2;
    private static final int STATE_PAUSED = 3;
    private static final int STATE_PRE_CHECK = 1;

    @NotNull
    public static final String VIDEO_DETECT_FINGER_IN_PROGRESS = "heartrate/detect_finger_in_progress.mp4";

    @NotNull
    public static final String VIDEO_DETECT_FINGER_PRE_PROGRESS = "heartrate/detect_finger_per_progress.mp4";

    @NotNull
    public static final String VIDEO_DETECT_IN_PROGRESS = "heartrate/detect_in_progress.mp4";

    @NotNull
    public static final String VIDEO_DETECT_PAUSED = "heartrate/detect_paused.mp4";

    @NotNull
    public static final String VIDEO_DETECT_POST_PROGRESS = "heartrate/detect_post_progress.mp4";

    @NotNull
    public static final String VIDEO_DETECT_PRE_PROGRESS = "heartrate/detect_pre_progress.mp4";

    @NotNull
    private static final String VIDEO_HEART_RATE_DIR = "heartrate/";

    @Nullable
    private CommonDialog<?> jitterDialog;

    @Nullable
    private f43 mBmpResult;
    private DetectAnimationViewHolder mDetectAnimationViewHolder;
    private boolean mDetectFinished;
    private int mDetectTime;
    private boolean mFindFinger;
    private boolean mFingerTipped;
    private DetectFinishedViewHolder mFinishedViewHolder;
    private boolean mFpsJitter;
    private boolean mHadDetected;
    private NumberCounter mNumberCounter;
    private CameraPreviewViewHolder mPreviewViewHolder;
    private boolean mShowHeartRateAnim;
    private int mState;
    private DetectTitleViewHolder mTitleViewHolder;
    private static final int PRE_CHECK_TIME_MAX = (int) TimeUnit.MINUTES.toMillis(20);
    private final int viewModelId = -1;
    private final int layoutId = lui.f25443a;
    private final int detectType = 2;

    @NotNull
    private final Runnable requireCameraPermissionRunnable = new Runnable() { // from class: hg3
        @Override // java.lang.Runnable
        public final void run() {
            CameraDetectActivity.requireCameraPermissionRunnable$lambda$0(this.f20037a);
        }
    };

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/CameraDetectActivity$JitterDialogCallback;", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/heartrate/ui/CameraDetectActivity;", "weakActivity", "Ljava/lang/ref/WeakReference;", "activityRef", "<init>", "(Ljava/lang/ref/WeakReference;)V", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class JitterDialogCallback extends av6 {

        @NotNull
        private final WeakReference<CameraDetectActivity> weakActivity;

        public JitterDialogCallback(@NotNull WeakReference<CameraDetectActivity> activityRef) {
            Intrinsics.checkNotNullParameter(activityRef, "activityRef");
            this.weakActivity = activityRef;
        }

        @Override // defpackage.av6
        public void onDialogClick(@Nullable String dialogName, @Nullable DialogInterface dialog, int which) {
            CameraDetectActivity cameraDetectActivity;
            if (which != -1 || (cameraDetectActivity = this.weakActivity.get()) == null) {
                return;
            }
            cameraDetectActivity.finish();
        }
    }

    private final void dismissShowingDialog() {
        String[] strArr = {CAMERA_PERMISSION_DIALOG_NAME, JITTER_DIALOG_NAME};
        for (int i = 0; i < 2; i++) {
            CommonDialog commonDialog = (CommonDialog) getSupportFragmentManager().l0(strArr[i]);
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
            }
        }
    }

    private final void hideFingerGuide() {
        CameraPreviewViewHolder cameraPreviewViewHolder = this.mPreviewViewHolder;
        DetectTitleViewHolder detectTitleViewHolder = null;
        if (cameraPreviewViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreviewViewHolder");
            cameraPreviewViewHolder = null;
        }
        cameraPreviewViewHolder.hideFingerGuide();
        DetectTitleViewHolder detectTitleViewHolder2 = this.mTitleViewHolder;
        if (detectTitleViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
        } else {
            detectTitleViewHolder = detectTitleViewHolder2;
        }
        detectTitleViewHolder.setTitle(d0j.e);
    }

    private final void onFpsJitter() {
        this.mFpsJitter = true;
        CameraPreviewViewHolder cameraPreviewViewHolder = this.mPreviewViewHolder;
        NumberCounter numberCounter = null;
        if (cameraPreviewViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreviewViewHolder");
            cameraPreviewViewHolder = null;
        }
        cameraPreviewViewHolder.stopCamera();
        NumberCounter numberCounter2 = this.mNumberCounter;
        if (numberCounter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNumberCounter");
        } else {
            numberCounter = numberCounter2;
        }
        numberCounter.pause();
        CommonDialog<?> commonDialog = (CommonDialog) getSupportFragmentManager().l0(JITTER_DIALOG_NAME);
        this.jitterDialog = commonDialog;
        if (commonDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c(JITTER_DIALOG_NAME).setDialogDescription(d0j.i).setDialogTheme(o2j.f28676a).setPositiveText(d0j.common_exit).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create();
            this.jitterDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.addDialogCallback(new JitterDialogCallback(new WeakReference(this)));
        }
        CommonDialog<?> commonDialog2 = this.jitterDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
    }

    private final void onPauseTimeExceed() {
        this.mDetectTime = 0;
        DetectAnimationViewHolder detectAnimationViewHolder = this.mDetectAnimationViewHolder;
        DetectAnimationViewHolder detectAnimationViewHolder2 = null;
        if (detectAnimationViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
            detectAnimationViewHolder = null;
        }
        detectAnimationViewHolder.setProgress(this.mDetectTime);
        DetectAnimationViewHolder detectAnimationViewHolder3 = this.mDetectAnimationViewHolder;
        if (detectAnimationViewHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
        } else {
            detectAnimationViewHolder2 = detectAnimationViewHolder3;
        }
        detectAnimationViewHolder2.shouldShow(false);
        this.mState = 3;
        this.mShowHeartRateAnim = false;
    }

    private final void openCamera() {
        CameraPreviewViewHolder cameraPreviewViewHolder = this.mPreviewViewHolder;
        if (cameraPreviewViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreviewViewHolder");
            cameraPreviewViewHolder = null;
        }
        cameraPreviewViewHolder.openCamera();
    }

    private final void requireCameraPermission() {
        if (isDestroyed()) {
            return;
        }
        PermissionExtKt.permission(this, "android.permission.CAMERA", getString(d0j.c0), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: eg3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CameraDetectActivity.requireCameraPermission$lambda$7(this.f16617a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requireCameraPermission$lambda$7(final CameraDetectActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: ig3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CameraDetectActivity.requireCameraPermission$lambda$7$lambda$3(this.f21109a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: jg3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CameraDetectActivity.requireCameraPermission$lambda$7$lambda$6(this.f22760a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requireCameraPermission$lambda$7$lambda$3(CameraDetectActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.openCamera();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requireCameraPermission$lambda$7$lambda$6(final CameraDetectActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, this$0, null, null, new Function0() { // from class: fg3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraDetectActivity.requireCameraPermission$lambda$7$lambda$6$lambda$4(this.f17755a);
            }
        }, new Function0() { // from class: gg3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraDetectActivity.requireCameraPermission$lambda$7$lambda$6$lambda$5(this.f18945a);
            }
        }, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requireCameraPermission$lambda$7$lambda$6$lambda$4(CameraDetectActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requireCameraPermission$lambda$7$lambda$6$lambda$5(CameraDetectActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRationaleDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCameraPermissionRunnable$lambda$0(CameraDetectActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requireCameraPermission();
    }

    private final void restartTimer(int maxTime) {
        NumberCounter numberCounter = this.mNumberCounter;
        NumberCounter numberCounter2 = null;
        if (numberCounter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNumberCounter");
            numberCounter = null;
        }
        numberCounter.setMaxValue(maxTime);
        NumberCounter numberCounter3 = this.mNumberCounter;
        if (numberCounter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNumberCounter");
            numberCounter3 = null;
        }
        numberCounter3.reset();
        NumberCounter numberCounter4 = this.mNumberCounter;
        if (numberCounter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNumberCounter");
        } else {
            numberCounter2 = numberCounter4;
        }
        numberCounter2.start();
    }

    private final void showCheckFinger() {
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        DetectAnimationViewHolder detectAnimationViewHolder = null;
        if (detectTitleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
            detectTitleViewHolder = null;
        }
        detectTitleViewHolder.setTitle(d0j.D);
        DetectAnimationViewHolder detectAnimationViewHolder2 = this.mDetectAnimationViewHolder;
        if (detectAnimationViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
        } else {
            detectAnimationViewHolder = detectAnimationViewHolder2;
        }
        detectAnimationViewHolder.shouldShow(false);
    }

    private final void showHeartBeatAnim() {
        DetectAnimationViewHolder detectAnimationViewHolder = this.mDetectAnimationViewHolder;
        if (detectAnimationViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
            detectAnimationViewHolder = null;
        }
        detectAnimationViewHolder.shouldShow(true);
    }

    private final void showRationaleDialog() {
        new CommonDialog.c(CAMERA_PERMISSION_DIALOG_NAME).setDialogTheme(o2j.f28677b).setDialogTitle(d0j.A).setDialogDescription(d0j.z).setPositiveText(d0j.f14929a).setNegativeText(d0j.f14930b).create().showIfNeed(getSupportFragmentManager());
    }

    private final void updateCurrentBmpTitle() {
        f43 f43Var = this.mBmpResult;
        Intrinsics.checkNotNull(f43Var);
        int iB = f43Var.b();
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        DetectTitleViewHolder detectTitleViewHolder2 = null;
        if (detectTitleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
            detectTitleViewHolder = null;
        }
        detectTitleViewHolder.setBeatCount(iB);
        DetectTitleViewHolder detectTitleViewHolder3 = this.mTitleViewHolder;
        if (detectTitleViewHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
        } else {
            detectTitleViewHolder2 = detectTitleViewHolder3;
        }
        detectTitleViewHolder2.setDesc(d0j.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull u6c u6cVar) {
        Intrinsics.checkNotNullParameter(u6cVar, "<this>");
        LifecycleOwner lifecycleOwnerC = u6cVar.C();
        Intrinsics.checkNotNull(lifecycleOwnerC);
        View layoutCameraPreview = u6cVar.C;
        Intrinsics.checkNotNullExpressionValue(layoutCameraPreview, "layoutCameraPreview");
        this.mPreviewViewHolder = new CameraPreviewViewHolder(this, lifecycleOwnerC, layoutCameraPreview);
        View layoutTitle = u6cVar.D;
        Intrinsics.checkNotNullExpressionValue(layoutTitle, "layoutTitle");
        this.mTitleViewHolder = new DetectTitleViewHolder(layoutTitle);
        View layoutCameraImgAnim = u6cVar.B;
        Intrinsics.checkNotNullExpressionValue(layoutCameraImgAnim, "layoutCameraImgAnim");
        this.mDetectAnimationViewHolder = new DetectAnimationViewHolder(layoutCameraImgAnim);
        View layoutCameraDetectFinished = u6cVar.A;
        Intrinsics.checkNotNullExpressionValue(layoutCameraDetectFinished, "layoutCameraDetectFinished");
        this.mFinishedViewHolder = new DetectFinishedViewHolder(layoutCameraDetectFinished, (HeartRateDetectViewModel) getMViewModel());
        Lifecycle lifecycle = getLifecycle();
        CameraPreviewViewHolder cameraPreviewViewHolder = this.mPreviewViewHolder;
        DetectFinishedViewHolder detectFinishedViewHolder = null;
        if (cameraPreviewViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreviewViewHolder");
            cameraPreviewViewHolder = null;
        }
        lifecycle.addObserver(cameraPreviewViewHolder);
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        if (detectTitleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
            detectTitleViewHolder = null;
        }
        lifecycle.addObserver(detectTitleViewHolder);
        DetectAnimationViewHolder detectAnimationViewHolder = this.mDetectAnimationViewHolder;
        if (detectAnimationViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
            detectAnimationViewHolder = null;
        }
        lifecycle.addObserver(detectAnimationViewHolder);
        DetectFinishedViewHolder detectFinishedViewHolder2 = this.mFinishedViewHolder;
        if (detectFinishedViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFinishedViewHolder");
        } else {
            detectFinishedViewHolder = detectFinishedViewHolder2;
        }
        lifecycle.addObserver(detectFinishedViewHolder);
    }

    @Override // com.xiaomi.fitness.heartrate.ui.BaseDetectActivity
    public int getDetectType() {
        return this.detectType;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    @Override // com.xiaomi.fitness.heartrate.camera.OnCounterChangedListener
    public void onCounterFinished() {
        int i = this.mState;
        DetectTitleViewHolder detectTitleViewHolder = null;
        DetectAnimationViewHolder detectAnimationViewHolder = null;
        if (i != 2 || 15000 - this.mDetectTime > 0) {
            if (i == 3) {
                onPauseTimeExceed();
                DetectTitleViewHolder detectTitleViewHolder2 = this.mTitleViewHolder;
                if (detectTitleViewHolder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
                } else {
                    detectTitleViewHolder = detectTitleViewHolder2;
                }
                detectTitleViewHolder.setTitle(d0j.E);
                restartTimer(PRE_CHECK_TIME_MAX);
                BmpMonitorHelper.INSTANCE.startUp();
                return;
            }
            return;
        }
        this.mDetectFinished = true;
        CameraPreviewViewHolder cameraPreviewViewHolder = this.mPreviewViewHolder;
        if (cameraPreviewViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreviewViewHolder");
            cameraPreviewViewHolder = null;
        }
        cameraPreviewViewHolder.closeCamera();
        DetectAnimationViewHolder detectAnimationViewHolder2 = this.mDetectAnimationViewHolder;
        if (detectAnimationViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
        } else {
            detectAnimationViewHolder = detectAnimationViewHolder2;
        }
        detectAnimationViewHolder.onDetectFinished();
    }

    @Override // com.xiaomi.fitness.heartrate.camera.OnCounterChangedListener
    public void onCounterValueChanged(int max, int value) {
        f43 f43Var;
        if (value == TimeUnit.MINUTES.toMillis(10L)) {
            finish();
            return;
        }
        if (value % 1000 == 0 && (f43Var = this.mBmpResult) != null) {
            Intrinsics.checkNotNull(f43Var);
            if (f43Var.c() == MonitorStatus.OK) {
                updateCurrentBmpTitle();
            }
        }
        if (this.mState == 2) {
            this.mDetectTime += 20;
            DetectAnimationViewHolder detectAnimationViewHolder = this.mDetectAnimationViewHolder;
            DetectAnimationViewHolder detectAnimationViewHolder2 = null;
            if (detectAnimationViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
                detectAnimationViewHolder = null;
            }
            detectAnimationViewHolder.setSeekBarMax(15000);
            DetectAnimationViewHolder detectAnimationViewHolder3 = this.mDetectAnimationViewHolder;
            if (detectAnimationViewHolder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
            } else {
                detectAnimationViewHolder2 = detectAnimationViewHolder3;
            }
            detectAnimationViewHolder2.setProgress(this.mDetectTime);
        }
    }

    @Override // com.xiaomi.fitness.heartrate.ui.Hilt_CameraDetectActivity, com.xiaomi.fitness.heartrate.ui.BaseDetectActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || !savedInstanceState.getBoolean(KEY_DETECT_FINISHED)) {
            dismissShowingDialog();
            if (PermissionExtKt.isPermissionGranted(this, "android.permission.CAMERA")) {
                openCamera();
            } else {
                ExecutorHelper.postInMain(this.requireCameraPermissionRunnable, 400L);
            }
        } else {
            this.mDetectFinished = true;
            CameraPreviewViewHolder cameraPreviewViewHolder = this.mPreviewViewHolder;
            DetectFinishedViewHolder detectFinishedViewHolder = null;
            if (cameraPreviewViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPreviewViewHolder");
                cameraPreviewViewHolder = null;
            }
            cameraPreviewViewHolder.closeCamera();
            DetectFinishedViewHolder detectFinishedViewHolder2 = this.mFinishedViewHolder;
            if (detectFinishedViewHolder2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFinishedViewHolder");
            } else {
                detectFinishedViewHolder = detectFinishedViewHolder2;
            }
            detectFinishedViewHolder.shouldShow(true);
        }
        NumberCounter numberCounter = new NumberCounter(PRE_CHECK_TIME_MAX);
        this.mNumberCounter = numberCounter;
        numberCounter.setOnValueChangedListener(this);
    }

    @Override // com.xiaomi.fitness.heartrate.ui.Hilt_CameraDetectActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        NumberCounter numberCounter = this.mNumberCounter;
        if (numberCounter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNumberCounter");
            numberCounter = null;
        }
        numberCounter.forceStop();
        CommonDialog<?> commonDialog = this.jitterDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        this.jitterDialog = null;
        ExecutorHelper.INSTANCE.removeFromMain(this.requireCameraPermissionRunnable);
        dismissShowingDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetectFinished() {
        ((HeartRateDetectViewModel) getMViewModel()).setMeasureTime(System.currentTimeMillis());
        DetectFinishedViewHolder detectFinishedViewHolder = this.mFinishedViewHolder;
        DetectAnimationViewHolder detectAnimationViewHolder = null;
        if (detectFinishedViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFinishedViewHolder");
            detectFinishedViewHolder = null;
        }
        detectFinishedViewHolder.shouldShow(true);
        DetectTitleViewHolder detectTitleViewHolder = this.mTitleViewHolder;
        if (detectTitleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
            detectTitleViewHolder = null;
        }
        detectTitleViewHolder.shouldShow(false);
        DetectAnimationViewHolder detectAnimationViewHolder2 = this.mDetectAnimationViewHolder;
        if (detectAnimationViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
        } else {
            detectAnimationViewHolder = detectAnimationViewHolder2;
        }
        detectAnimationViewHolder.shouldShow(false);
        ((HeartRateDetectViewModel) getMViewModel()).insertDetectRecord();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(KEY_DETECT_FINISHED, this.mDetectFinished);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void openDetectReportFragment(int selectPosition) {
        DetectFinishedViewHolder detectFinishedViewHolder = this.mFinishedViewHolder;
        if (detectFinishedViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFinishedViewHolder");
            detectFinishedViewHolder = null;
        }
        detectFinishedViewHolder.setSelectPosition(selectPosition);
        finish();
        HeartRateReportActivity.INSTANCE.launchReport(this, 2, ((HeartRateDetectViewModel) getMViewModel()).getMeasureTime(), ((HeartRateDetectViewModel) getMViewModel()).getAvgHrm(), ((HeartRateDetectViewModel) getMViewModel()).getType(), "page_detect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void receiveBmpResult(@NotNull DetectResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.mDetectFinished || this.mFpsJitter) {
            return;
        }
        f43 bmpResult = result.getBmpResult();
        this.mBmpResult = bmpResult;
        if (bmpResult == null) {
            return;
        }
        HeartRateDetectViewModel heartRateDetectViewModel = (HeartRateDetectViewModel) getMViewModel();
        f43 f43Var = this.mBmpResult;
        Intrinsics.checkNotNull(f43Var);
        heartRateDetectViewModel.setAvgHrm(f43Var.a());
        f43 f43Var2 = this.mBmpResult;
        Intrinsics.checkNotNull(f43Var2);
        MonitorStatus monitorStatusC = f43Var2.c();
        Intrinsics.checkNotNullExpressionValue(monitorStatusC, "getStatus(...)");
        int i = this.mState;
        if (i == 0) {
            restartTimer(PRE_CHECK_TIME_MAX);
            this.mState = 1;
            return;
        }
        if (monitorStatusC == MonitorStatus.FPS_JITTER) {
            onFpsJitter();
            return;
        }
        DetectTitleViewHolder detectTitleViewHolder = null;
        DetectAnimationViewHolder detectAnimationViewHolder = null;
        if (!this.mFindFinger && i == 1) {
            if (result.getIsFingerTip()) {
                this.mFingerTipped = true;
                hideFingerGuide();
                showCheckFinger();
            } else if (this.mFingerTipped) {
                DetectTitleViewHolder detectTitleViewHolder2 = this.mTitleViewHolder;
                if (detectTitleViewHolder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
                    detectTitleViewHolder2 = null;
                }
                detectTitleViewHolder2.setTitle(d0j.e);
            }
        }
        if (monitorStatusC != MonitorStatus.OK) {
            if (this.mFindFinger) {
                this.mFindFinger = false;
                if (this.mState == 2) {
                    this.mState = 3;
                    DetectAnimationViewHolder detectAnimationViewHolder2 = this.mDetectAnimationViewHolder;
                    if (detectAnimationViewHolder2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
                        detectAnimationViewHolder2 = null;
                    }
                    detectAnimationViewHolder2.playVideo(VIDEO_DETECT_PAUSED, true);
                    restartTimer(5000);
                    DetectTitleViewHolder detectTitleViewHolder3 = this.mTitleViewHolder;
                    if (detectTitleViewHolder3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTitleViewHolder");
                    } else {
                        detectTitleViewHolder = detectTitleViewHolder3;
                    }
                    detectTitleViewHolder.setTitle(d0j.j);
                    return;
                }
                return;
            }
            return;
        }
        this.mHadDetected = true;
        if (!this.mFindFinger) {
            this.mFindFinger = true;
            hideFingerGuide();
        }
        if (!this.mShowHeartRateAnim) {
            f43 f43Var3 = this.mBmpResult;
            Integer numValueOf = f43Var3 != null ? Integer.valueOf(f43Var3.b()) : null;
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() > 0) {
                this.mShowHeartRateAnim = true;
                this.mState = 2;
                showHeartBeatAnim();
                updateCurrentBmpTitle();
                restartTimer(15000);
            }
        }
        if (this.mState == 3) {
            this.mState = 2;
            DetectAnimationViewHolder detectAnimationViewHolder3 = this.mDetectAnimationViewHolder;
            if (detectAnimationViewHolder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
                detectAnimationViewHolder3 = null;
            }
            detectAnimationViewHolder3.getView().setVisibility(0);
            DetectAnimationViewHolder detectAnimationViewHolder4 = this.mDetectAnimationViewHolder;
            if (detectAnimationViewHolder4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetectAnimationViewHolder");
            } else {
                detectAnimationViewHolder = detectAnimationViewHolder4;
            }
            detectAnimationViewHolder.playVideo(VIDEO_DETECT_IN_PROGRESS, true);
            updateCurrentBmpTitle();
            restartTimer(Math.max(15000 - this.mDetectTime, 0));
        }
    }
}
