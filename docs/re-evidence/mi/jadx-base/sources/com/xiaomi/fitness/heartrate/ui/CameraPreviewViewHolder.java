package com.xiaomi.fitness.heartrate.ui;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.g;
import androidx.camera.core.o;
import androidx.camera.lifecycle.b;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.heartrate.camera.BmpMonitorHelper;
import com.xiaomi.fitness.heartrate.camera.CameraConfiguration;
import com.xiaomi.fitness.heartrate.camera.DetectResult;
import com.xiaomi.fitness.heartrate.camera.IPlayerEventListener;
import com.xiaomi.fitness.heartrate.camera.ImageAnalyzer;
import com.xiaomi.fitness.heartrate.camera.VideoPreviewView;
import com.xiaomi.fitness.heartrate.ui.CameraPreviewViewHolder;
import com.xiaomi.passport.ui.page.UserAvatarUpdateActivity;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.fri;
import defpackage.lhe;
import defpackage.ni4;
import defpackage.ue3;
import defpackage.xh3;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002TUB\u001f\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\bR\u0010SJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\rJ\u0019\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010\u001dJ\u0019\u0010!\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u0019\u0010\"\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001dJ)\u0010&\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/xiaomi/fitness/heartrate/camera/IPlayerEventListener;", "Lcom/xiaomi/fitness/heartrate/camera/DetectResult;", "result", "", "parseResult", "(Lcom/xiaomi/fitness/heartrate/camera/DetectResult;)V", "", "isShow", "showFingerVideoCover", "(Z)V", "playPreDetectVideo", "()V", "releaseCameraProviderFutureListener", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "openCamera", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "stopCamera", "closeCamera", LifecycleConstantKt.ON_DESTROY, "hideFingerGuide", "", "fileName", "onInit", "(Ljava/lang/String;)V", "onReset", "onStopped", "onPlayed", "onPaused", "onFinished", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, VibrateModeSetFragment.MAX, "onProgress", "(Ljava/lang/String;JJ)V", "msg", "onError", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/view/View;", "mView", "Landroid/view/View;", "Lcom/xiaomi/fitness/heartrate/camera/VideoPreviewView;", "mFingerGuideView", "Lcom/xiaomi/fitness/heartrate/camera/VideoPreviewView;", "Landroidx/camera/view/PreviewView;", "mPreviewView", "Landroidx/camera/view/PreviewView;", "Llhe;", "Landroidx/camera/lifecycle/b;", "cameraProviderFuture", "Llhe;", "Lcom/xiaomi/fitness/heartrate/camera/ImageAnalyzer;", "mImageAnalyzer", "Lcom/xiaomi/fitness/heartrate/camera/ImageAnalyzer;", "mCameraProvider", "Landroidx/camera/lifecycle/b;", "Lue3;", "mCamera", "Lue3;", "Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder$DetectHandler;", "mDetectHandler", "Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder$DetectHandler;", "Landroid/widget/ImageView;", "mFingerDetectCover", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/heartrate/ui/CameraDetectActivity;", "mActivity", "Lcom/xiaomi/fitness/heartrate/ui/CameraDetectActivity;", "Landroid/util/Size;", "getMinSize", "()Landroid/util/Size;", "minSize", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Landroid/view/View;)V", "Companion", "DetectHandler", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CameraPreviewViewHolder implements DefaultLifecycleObserver, IPlayerEventListener {
    private static final int MAX_PLAY_TIME = CommonConstants.Mgc.NEED_UPGRADE_VERSION;
    private static final int MSG_HIDE_VIDEO_COVER = 1;

    @NotNull
    private static final String TAG = "CameraPreviewViewHolder";

    @Nullable
    private lhe<b> cameraProviderFuture;

    @Nullable
    private CameraDetectActivity mActivity;

    @Nullable
    private ue3 mCamera;

    @Nullable
    private b mCameraProvider;

    @NotNull
    private final Context mContext;

    @Nullable
    private DetectHandler mDetectHandler;

    @Nullable
    private ImageView mFingerDetectCover;

    @NotNull
    private VideoPreviewView mFingerGuideView;

    @NotNull
    private final ImageAnalyzer mImageAnalyzer;

    @NotNull
    private final LifecycleOwner mLifecycleOwner;

    @NotNull
    private PreviewView mPreviewView;

    @NotNull
    private final View mView;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder$DetectHandler;", "Landroid/os/Handler;", "vh", "Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder;", "<init>", "(Lcom/xiaomi/fitness/heartrate/ui/CameraPreviewViewHolder;)V", "mVHRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DetectHandler extends Handler {

        @NotNull
        private final WeakReference<CameraPreviewViewHolder> mVHRef;

        public DetectHandler(@NotNull CameraPreviewViewHolder vh) {
            Intrinsics.checkNotNullParameter(vh, "vh");
            this.mVHRef = new WeakReference<>(vh);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            CameraPreviewViewHolder cameraPreviewViewHolder = this.mVHRef.get();
            if (cameraPreviewViewHolder != null && msg.what == 1) {
                cameraPreviewViewHolder.hideFingerGuide();
            }
        }
    }

    public CameraPreviewViewHolder(@NotNull Context mContext, @NotNull LifecycleOwner mLifecycleOwner, @NotNull View mView) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mLifecycleOwner, "mLifecycleOwner");
        Intrinsics.checkNotNullParameter(mView, "mView");
        this.mContext = mContext;
        this.mLifecycleOwner = mLifecycleOwner;
        this.mView = mView;
        this.mFingerDetectCover = (ImageView) mView.findViewById(fri.s);
        PreviewView previewView = (PreviewView) mView.findViewById(fri.A);
        this.mPreviewView = previewView;
        PreviewView.ImplementationMode implementationMode = PreviewView.ImplementationMode.COMPATIBLE;
        previewView.setImplementationMode(implementationMode);
        VideoPreviewView videoPreviewView = (VideoPreviewView) mView.findViewById(fri.C);
        this.mFingerGuideView = videoPreviewView;
        videoPreviewView.setZOrderOnTop(true);
        this.mFingerGuideView.setPLayerEventListener(this);
        this.mPreviewView.setImplementationMode(implementationMode);
        ImageAnalyzer imageAnalyzer = new ImageAnalyzer();
        this.mImageAnalyzer = imageAnalyzer;
        imageAnalyzer.observe(mLifecycleOwner, new CameraPreviewViewHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qh3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CameraPreviewViewHolder._init_$lambda$0(this.f31514a, (DetectResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(CameraPreviewViewHolder this$0, DetectResult detectResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (detectResult == null) {
            Logger.e(TAG, "detect result is null");
            return Unit.INSTANCE;
        }
        this$0.parseResult(detectResult);
        return Unit.INSTANCE;
    }

    private final Size getMinSize() {
        Size[] outputSizes;
        Size size = new Size(4, 3);
        try {
            Object systemService = this.mContext.getApplicationContext().getSystemService(UserAvatarUpdateActivity.CAMERA);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            String[] cameraIdList = cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
            long j = Long.MAX_VALUE;
            for (String str : cameraIdList) {
                Intrinsics.checkNotNull(str);
                if (Integer.parseInt(str) == 1) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    if (streamConfigurationMap != null && (outputSizes = streamConfigurationMap.getOutputSizes(256)) != null && outputSizes.length != 0) {
                        Iterator it = ArrayIteratorKt.iterator(outputSizes);
                        while (it.hasNext()) {
                            Size size2 = (Size) it.next();
                            long width = size2.getWidth() * size2.getHeight();
                            if (width < j) {
                                size = size2;
                                j = width;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "getMinSize: ", e);
        }
        Logger.i(TAG, "selected camera size " + size);
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCamera$lambda$1(CameraPreviewViewHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Size minSize = this$0.getMinSize();
            lhe<b> lheVar = this$0.cameraProviderFuture;
            this$0.mCameraProvider = lheVar != null ? lheVar.get() : null;
            o.b bVar = new o.b();
            Intrinsics.checkNotNull(minSize);
            bVar.j(minSize);
            CameraConfiguration.INSTANCE.configPreviewExtender(bVar);
            o oVarC = bVar.c();
            Intrinsics.checkNotNullExpressionValue(oVarC, "build(...)");
            xh3 xh3VarB = new xh3.a().d(1).b();
            Intrinsics.checkNotNullExpressionValue(xh3VarB, "build(...)");
            g.c cVarF = new g.c().l(minSize).m(1).f(0);
            Intrinsics.checkNotNullExpressionValue(cVarF, "setBackpressureStrategy(...)");
            g gVarC = cVarF.c();
            Intrinsics.checkNotNullExpressionValue(gVarC, "build(...)");
            gVarC.Y(ExecutorHelper.getBackgroundPool(), this$0.mImageAnalyzer);
            b bVar2 = this$0.mCameraProvider;
            ue3 ue3VarE = bVar2 != null ? bVar2.e(this$0.mLifecycleOwner, xh3VarB, oVarC, gVarC) : null;
            this$0.mCamera = ue3VarE;
            Intrinsics.checkNotNull(ue3VarE);
            ue3VarE.a().d(true);
            oVarC.S(this$0.mPreviewView.getSurfaceProvider());
        } catch (Exception e) {
            Logger.e(TAG, "openCamera: " + e.getMessage(), e);
        }
    }

    private final void parseResult(DetectResult result) {
        Logger.i(TAG, "result = " + result);
        CameraDetectActivity cameraDetectActivity = this.mActivity;
        if (cameraDetectActivity != null) {
            cameraDetectActivity.receiveBmpResult(result);
        }
    }

    private final void playPreDetectVideo() {
        try {
            CameraDetectActivity cameraDetectActivity = this.mActivity;
            if (cameraDetectActivity != null) {
                Intrinsics.checkNotNull(cameraDetectActivity);
                if (cameraDetectActivity.isDestroyed()) {
                    return;
                }
                CameraDetectActivity cameraDetectActivity2 = this.mActivity;
                Intrinsics.checkNotNull(cameraDetectActivity2);
                AssetManager assets = cameraDetectActivity2.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(CameraDetectActivity.VIDEO_DETECT_FINGER_PRE_PROGRESS);
                Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
                this.mFingerGuideView.setDataSource(assetFileDescriptorOpenFd, CameraDetectActivity.VIDEO_DETECT_FINGER_PRE_PROGRESS);
                this.mFingerGuideView.setVisibility(0);
            }
        } catch (Exception e) {
            Logger.e(TAG, "open video source error, %s", e.getMessage(), e);
        }
    }

    private final void releaseCameraProviderFutureListener() {
        lhe<b> lheVar = this.cameraProviderFuture;
        if (lheVar != null) {
            lheVar.cancel(true);
        }
        this.cameraProviderFuture = null;
    }

    private final void showFingerVideoCover(boolean isShow) {
        if (isShow) {
            ImageView imageView = this.mFingerDetectCover;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.mFingerDetectCover;
            Intrinsics.checkNotNull(imageView2);
            imageView2.setVisibility(8);
            playPreDetectVideo();
        }
    }

    public final void closeCamera() {
        ViewExtKt.gone(this.mView);
        b bVar = this.mCameraProvider;
        if (bVar != null) {
            bVar.m();
        }
        releaseCameraProviderFutureListener();
    }

    public final void hideFingerGuide() {
        this.mFingerGuideView.setVisibility(8);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        if (owner instanceof CameraDetectActivity) {
            this.mActivity = (CameraDetectActivity) owner;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        DetectHandler detectHandler = this.mDetectHandler;
        if (detectHandler != null) {
            detectHandler.removeCallbacksAndMessages(null);
        }
        b bVar = this.mCameraProvider;
        if (bVar != null) {
            bVar.m();
        }
        releaseCameraProviderFutureListener();
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onError(@Nullable String fileName, @Nullable String msg) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onFinished(@Nullable String fileName) {
        if (TextUtils.equals(fileName, CameraDetectActivity.VIDEO_DETECT_FINGER_PRE_PROGRESS)) {
            try {
                AssetManager assets = this.mPreviewView.getContext().getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(CameraDetectActivity.VIDEO_DETECT_FINGER_IN_PROGRESS);
                Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
                this.mFingerGuideView.setDataSource(assetFileDescriptorOpenFd, CameraDetectActivity.VIDEO_DETECT_FINGER_IN_PROGRESS);
                this.mFingerGuideView.setLoop(true);
                this.mFingerGuideView.play();
                if (this.mDetectHandler == null) {
                    this.mDetectHandler = new DetectHandler(this);
                }
                DetectHandler detectHandler = this.mDetectHandler;
                Intrinsics.checkNotNull(detectHandler);
                detectHandler.sendEmptyMessageDelayed(1, MAX_PLAY_TIME);
            } catch (Exception e) {
                Logger.e(TAG, "open video source error.", e);
            }
        }
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onInit(@Nullable String fileName) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.mImageAnalyzer.onPause();
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onPaused(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onPlayed(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onProgress(@Nullable String fileName, long progress, long max) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onReset(@Nullable String fileName) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        BmpMonitorHelper.INSTANCE.startUp();
        this.mImageAnalyzer.onResume();
        ue3 ue3Var = this.mCamera;
        if (ue3Var != null) {
            Intrinsics.checkNotNull(ue3Var);
            ue3Var.a().d(true);
        }
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onStopped(@Nullable String fileName) {
    }

    public final void openCamera() {
        showFingerVideoCover(false);
        if (this.cameraProviderFuture == null) {
            lhe<b> lheVarF = b.f(this.mContext);
            this.cameraProviderFuture = lheVarF;
            if (lheVarF != null) {
                lheVarF.addListener(new Runnable() { // from class: rh3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreviewViewHolder.openCamera$lambda$1(this.f32536a);
                    }
                }, ni4.h(this.mContext));
            }
        }
    }

    public final void stopCamera() {
        b bVar = this.mCameraProvider;
        Intrinsics.checkNotNull(bVar);
        bVar.m();
    }
}
