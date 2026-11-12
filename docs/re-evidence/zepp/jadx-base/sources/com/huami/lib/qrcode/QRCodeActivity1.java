package com.huami.lib.qrcode;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DisplayOrientedMeteringPointFactory;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.util.concurrent.ListenableFuture;
import com.huami.lib.qrcode.QRCodeActivity1;
import com.huami.lib.qrcode.ext.ExtensionKt;
import com.huami.lib.qrcode.gallery.QRCodeGalleryActivity;
import com.loc.z;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.android.Utils;
import org.opencv.core.CvException;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.wechat_qrcode.WeChatQRCode;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001F\u0018\u0000 X2\u00020\u0001:\u0002X$B\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J/\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0014J\"\u0010\"\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010MR\u0016\u0010P\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010OR\u0016\u0010Q\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010OR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010OR\u0016\u0010U\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010O¨\u0006Y"}, d2 = {"Lcom/huami/lib/qrcode/QRCodeActivity1;", "Landroidx/appcompat/app/AppCompatActivity;", "", "m", "", "x", "y", "t", "v", GoogleApiAvailabilityLight.b, hl.k, "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", z.j, "", "i", "", "result", "u", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onDestroy", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroidx/camera/view/PreviewView;", "a", "Landroidx/camera/view/PreviewView;", "viewFinder", "b", LogUtil.I, "displayId", "Landroidx/camera/core/Preview;", "c", "Landroidx/camera/core/Preview;", "preview", "Landroidx/camera/core/ImageCapture;", GoogleApiAvailabilityLight.a, "Landroidx/camera/core/ImageCapture;", "imageCapture", "Landroidx/camera/core/ImageAnalysis;", "e", "Landroidx/camera/core/ImageAnalysis;", "imageAnalyzer", "Landroidx/camera/core/Camera;", "f", "Landroidx/camera/core/Camera;", "camera", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "g", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraProvider", "h", "Z", "isAnalyzerActive", "Landroid/hardware/display/DisplayManager;", "Lkotlin/Lazy;", "l", "()Landroid/hardware/display/DisplayManager;", "displayManager", "com/huami/lib/qrcode/QRCodeActivity1$displayListener$1", "Lcom/huami/lib/qrcode/QRCodeActivity1$displayListener$1;", "displayListener", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "Lorg/opencv/wechat_qrcode/WeChatQRCode;", "Lorg/opencv/wechat_qrcode/WeChatQRCode;", "mWeChatQRCode", "Ljava/lang/String;", "detectProtoPath", "detectCaffeModelPath", "o", "srProtoPath", com.google.android.exoplayer2.text.ttml.b.r, "srCaffeModelPath", "<init>", "()V", "Companion", "qrcode_release"}, k = 1, mv = {1, 5, 1})
public final class QRCodeActivity1 extends AppCompatActivity {
    public static final int REQUEST_CODE = 49374;
    public static final int REQUEST_CODE_GALLERY = 51966;
    public static final int REQUEST_PERMISSION_CODE_CAMERA = 10;

    @NotNull
    public static final String SCAN_RESULT = "SCAN_RESULT";

    @NotNull
    private static final String q = "zepp_qrcode";

    @NotNull
    private static final String r = "detect.prototxt";

    @NotNull
    private static final String s = "detect.caffemodel";

    @NotNull
    private static final String t = "sr.prototxt";

    @NotNull
    private static final String u = "sr.caffemodel";

    @NotNull
    private static final String v = "QRCode:::";
    private static final double x = 1.3333333333333333d;
    private static final double y = 1.7777777777777777d;
    private static boolean z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PreviewView viewFinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int displayId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Preview preview;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ImageCapture imageCapture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ImageAnalysis imageAnalyzer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Camera camera;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private ProcessCameraProvider cameraProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isAnalyzerActive;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final QRCodeActivity1$displayListener$1 displayListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ExecutorService cameraExecutor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private WeChatQRCode mWeChatQRCode;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String detectProtoPath;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String detectCaffeModelPath;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String srProtoPath;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String srCaffeModelPath;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] w = {"android.permission.CAMERA"};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/lib/qrcode/QRCodeActivity1$Companion;", "", "Landroid/app/Activity;", "activity", "", "start", "", "FILE_DETECT_CAFFEMODEL", "Ljava/lang/String;", "FILE_DETECT_PROTO", "FILE_SR_CAFFEMODEL", "FILE_SR_PROTO", "MODEL_DIR", "", "RATIO_16_9_VALUE", LogUtil.D, "RATIO_4_3_VALUE", "", "REQUEST_CODE", LogUtil.I, "REQUEST_CODE_GALLERY", "REQUEST_PERMISSION_CODE_CAMERA", "", "REQUIRED_PERMISSIONS", "[Ljava/lang/String;", "SCAN_RESULT", "TAG", "", "isShowGallery", "Z", "<init>", "()V", "qrcode_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Activity activity) {
            Intent intent = new Intent(activity, (Class<?>) QRCodeActivity1.class);
            QRCodeActivity1.z = true;
            activity.startActivityForResult(intent, 49374);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\n\u001a\u00020\b\u0012'\u0010\u0013\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR7\u0010\u0013\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"com/huami/lib/qrcode/QRCodeActivity1$a", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "Landroidx/camera/core/ImageProxy;", "image", "", "analyze", "Lorg/opencv/core/Mat;", "a", "Lorg/opencv/wechat_qrcode/WeChatQRCode;", "Lorg/opencv/wechat_qrcode/WeChatQRCode;", "weChatQRCode", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", "results", "b", "Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lorg/opencv/wechat_qrcode/WeChatQRCode;Lkotlin/jvm/functions/Function1;)V", "qrcode_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements ImageAnalysis.Analyzer {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeChatQRCode weChatQRCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function1<List<String>, Unit> listener;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull WeChatQRCode weChatQRCode, @NotNull Function1<? super List<String>, Unit> function1) {
            this.weChatQRCode = weChatQRCode;
            this.listener = function1;
        }

        @NotNull
        public final Mat a(@NotNull ImageProxy image) {
            ImageProxy.PlaneProxy[] planes = image.getPlanes();
            return new Mat(image.getHeight(), image.getWidth(), CvType.CV_8UC1, planes[0].getBuffer(), planes[0].getRowStride());
        }

        @Override // androidx.camera.core.ImageAnalysis.Analyzer
        public void analyze(@NotNull ImageProxy image) throws Exception {
            List<String> listDetectAndDecode;
            try {
                try {
                    listDetectAndDecode = this.weChatQRCode.detectAndDecode(a(image));
                } catch (CvException e) {
                    Log.e(QRCodeActivity1.v, "analyze: CvException ", e);
                    listDetectAndDecode = null;
                }
                boolean z = false;
                if (listDetectAndDecode != null && (!listDetectAndDecode.isEmpty())) {
                    z = true;
                }
                if (z) {
                    Log.d(QRCodeActivity1.v, Intrinsics.stringPlus("analyze: ", listDetectAndDecode));
                    this.listener.invoke(listDetectAndDecode);
                }
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(image, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(image, th);
                    throw th2;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "results", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<List<? extends String>, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<String> list) {
            if (QRCodeActivity1.this.isAnalyzerActive) {
                QRCodeActivity1.this.isAnalyzerActive = false;
                new BeepManager(QRCodeActivity1.this).playBeepSound();
                QRCodeActivity1.this.u(list.get(0));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/hardware/display/DisplayManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<DisplayManager> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayManager getA() {
            Object systemService = QRCodeActivity1.this.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY);
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            return (DisplayManager) systemService;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.huami.lib.qrcode.QRCodeActivity1$displayListener$1] */
    public QRCodeActivity1() {
        super(R.layout.activity_qrcode);
        System.loadLibrary("opencv_java4");
        this.displayId = -1;
        this.isAnalyzerActive = true;
        this.displayManager = LazyKt__LazyJVMKt.lazy(new c());
        this.displayListener = new DisplayManager.DisplayListener() { // from class: com.huami.lib.qrcode.QRCodeActivity1$displayListener$1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int displayId) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int displayId) {
                if (displayId == this.a.displayId) {
                    PreviewView previewView = this.a.viewFinder;
                    Objects.requireNonNull(previewView);
                    Display display = previewView.getDisplay();
                    int rotation = display == null ? 0 : display.getRotation();
                    ImageAnalysis imageAnalysis = this.a.imageAnalyzer;
                    if (imageAnalysis != null) {
                        imageAnalysis.setTargetRotation(rotation);
                    }
                    ImageCapture imageCapture = this.a.imageCapture;
                    if (imageCapture == null) {
                        return;
                    }
                    imageCapture.setTargetRotation(rotation);
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int displayId) {
            }
        };
    }

    private final boolean i() {
        String[] strArr = w;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            if (!(ContextCompat.checkSelfPermission(getBaseContext(), strArr[i]) == 0)) {
                return false;
            }
            i++;
        }
    }

    private final int j(int width, int height) {
        double dMax = ((double) Math.max(width, height)) / ((double) Math.min(width, height));
        return Math.abs(dMax - 1.3333333333333333d) <= Math.abs(dMax - 1.7777777777777777d) ? 0 : 1;
    }

    private final void k() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        Log.d(v, "Screen metrics: " + displayMetrics.widthPixels + " x " + displayMetrics.heightPixels);
        int iJ = j(displayMetrics.widthPixels, displayMetrics.heightPixels);
        Log.d(v, Intrinsics.stringPlus("Preview aspect ratio: ", Integer.valueOf(iJ)));
        PreviewView previewView = this.viewFinder;
        Objects.requireNonNull(previewView);
        Display display = previewView.getDisplay();
        int rotation = display == null ? 0 : display.getRotation();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider == null) {
            throw new IllegalStateException("Camera initialization failed.");
        }
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
        this.preview = new Preview.Builder().setTargetAspectRatio(iJ).setTargetRotation(rotation).build();
        this.imageCapture = new ImageCapture.Builder().setTargetAspectRatio(iJ).setTargetRotation(rotation).build();
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setTargetAspectRatio(iJ).setTargetRotation(rotation).build();
        ExecutorService executorService = this.cameraExecutor;
        Objects.requireNonNull(executorService);
        WeChatQRCode weChatQRCode = this.mWeChatQRCode;
        Objects.requireNonNull(weChatQRCode);
        imageAnalysisBuild.setAnalyzer(executorService, new a(weChatQRCode, new b()));
        Unit unit = Unit.INSTANCE;
        this.imageAnalyzer = imageAnalysisBuild;
        processCameraProvider.unbindAll();
        try {
            this.camera = processCameraProvider.bindToLifecycle(this, cameraSelectorBuild, this.preview, this.imageCapture, this.imageAnalyzer);
            Preview preview = this.preview;
            if (preview == null) {
                return;
            }
            PreviewView previewView2 = this.viewFinder;
            if (previewView2 == null) {
                throw null;
            }
            preview.setSurfaceProvider(previewView2.getSurfaceProvider());
        } catch (Exception e) {
            Log.e(v, "Use case binding failed", e);
        }
    }

    private final DisplayManager l() {
        return (DisplayManager) this.displayManager.getValue();
    }

    private final void m() {
        this.detectProtoPath = ExtensionKt.copyFromRaw(this, R.raw.detect_prototxt, q, r);
        this.detectCaffeModelPath = ExtensionKt.copyFromRaw(this, R.raw.detect_caffemodel, q, s);
        this.srProtoPath = ExtensionKt.copyFromRaw(this, R.raw.sr_prototxt, q, t);
        this.srCaffeModelPath = ExtensionKt.copyFromRaw(this, R.raw.sr_caffemodel, q, u);
        n();
    }

    private final void n() {
        String str = this.detectProtoPath;
        Objects.requireNonNull(str);
        String str2 = this.detectCaffeModelPath;
        Objects.requireNonNull(str2);
        String str3 = this.srProtoPath;
        Objects.requireNonNull(str3);
        String str4 = this.srCaffeModelPath;
        Objects.requireNonNull(str4);
        this.mWeChatQRCode = new WeChatQRCode(str, str2, str3, str4);
        Log.d(v, "Finish Init");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(QRCodeActivity1 qRCodeActivity1, View view) {
        qRCodeActivity1.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(QRCodeActivity1 qRCodeActivity1, View view) {
        qRCodeActivity1.startActivityForResult(new Intent(qRCodeActivity1, (Class<?>) QRCodeGalleryActivity.class), REQUEST_CODE_GALLERY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(QRCodeActivity1 qRCodeActivity1, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            qRCodeActivity1.t(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        PreviewView previewView = qRCodeActivity1.viewFinder;
        Objects.requireNonNull(previewView);
        previewView.performClick();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(QRCodeActivity1 qRCodeActivity1) {
        PreviewView previewView = qRCodeActivity1.viewFinder;
        Objects.requireNonNull(previewView);
        Display display = previewView.getDisplay();
        qRCodeActivity1.displayId = display == null ? -1 : display.getDisplayId();
        qRCodeActivity1.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(QRCodeActivity1 qRCodeActivity1) {
        PreviewView previewView = qRCodeActivity1.viewFinder;
        Objects.requireNonNull(previewView);
        Display display = previewView.getDisplay();
        qRCodeActivity1.displayId = display == null ? -1 : display.getDisplayId();
        qRCodeActivity1.v();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    private final void t(float x2, float y2) {
        CameraInfo cameraInfo;
        DisplayOrientedMeteringPointFactory displayOrientedMeteringPointFactory;
        Camera camera;
        CameraControl cameraControl;
        Camera camera2 = this.camera;
        if (camera2 == null || (cameraInfo = camera2.getCameraInfo()) == null) {
            displayOrientedMeteringPointFactory = null;
        } else {
            PreviewView previewView = this.viewFinder;
            Objects.requireNonNull(previewView);
            Display display = previewView.getDisplay();
            if (display == null) {
                displayOrientedMeteringPointFactory = null;
            } else {
                PreviewView previewView2 = this.viewFinder;
                Objects.requireNonNull(previewView2);
                float width = previewView2.getWidth();
                PreviewView previewView3 = this.viewFinder;
                Objects.requireNonNull(previewView3);
                displayOrientedMeteringPointFactory = new DisplayOrientedMeteringPointFactory(display, cameraInfo, width, previewView3.getHeight());
            }
        }
        MeteringPoint meteringPointCreatePoint = displayOrientedMeteringPointFactory == null ? null : displayOrientedMeteringPointFactory.createPoint(x2, y2);
        FocusMeteringAction focusMeteringActionBuild = meteringPointCreatePoint != null ? new FocusMeteringAction.Builder(meteringPointCreatePoint).build() : null;
        if (focusMeteringActionBuild == null || (camera = this.camera) == null || (cameraControl = camera.getCameraControl()) == null) {
            return;
        }
        cameraControl.startFocusAndMetering(focusMeteringActionBuild);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String result) {
        setResult(-1, new Intent().putExtra("SCAN_RESULT", result));
        finish();
    }

    private final void v() {
        final ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(this);
        processCameraProvider.addListener(new Runnable() { // from class: t56
            @Override // java.lang.Runnable
            public final void run() {
                QRCodeActivity1.w(this.a, processCameraProvider);
            }
        }, ContextCompat.getMainExecutor(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(QRCodeActivity1 qRCodeActivity1, ListenableFuture listenableFuture) {
        try {
            qRCodeActivity1.cameraProvider = (ProcessCameraProvider) listenableFuture.get();
        } catch (InterruptedException e) {
            Log.e(v, Intrinsics.stringPlus("get ProcessCameraProvider error: ", e.getLocalizedMessage()), e);
        } catch (ExecutionException e2) {
            Log.e(v, Intrinsics.stringPlus("get ProcessCameraProvider error: ", e2.getLocalizedMessage()), e2);
        }
        qRCodeActivity1.k();
    }

    private final void x() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        getWindow().setFlags(512, 512);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 51966) {
            Uri data2 = data == null ? null : data.getData();
            if (data2 != null) {
                Bitmap bitmapA = com.huami.lib.qrcode.c.a(this, data2);
                Mat mat = new Mat();
                Utils.bitmapToMat(bitmapA, mat);
                WeChatQRCode weChatQRCode = this.mWeChatQRCode;
                Objects.requireNonNull(weChatQRCode);
                List<String> listDetectAndDecode = weChatQRCode.detectAndDecode(mat);
                if (!listDetectAndDecode.isEmpty()) {
                    u(listDetectAndDecode.get(0));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m();
        x();
        ((ImageView) findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: o56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRCodeActivity1.o(this.a, view);
            }
        });
        if (z) {
            TextView textView = (TextView) findViewById(R.id.btn_gallery);
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: p56
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QRCodeActivity1.p(this.a, view);
                }
            });
        }
        PreviewView previewView = (PreviewView) findViewById(R.id.viewFinder);
        this.viewFinder = previewView;
        Objects.requireNonNull(previewView);
        previewView.setOnTouchListener(new View.OnTouchListener() { // from class: q56
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return QRCodeActivity1.q(this.a, view, motionEvent);
            }
        });
        this.cameraExecutor = Executors.newSingleThreadExecutor();
        l().registerDisplayListener(this.displayListener, null);
        if (!i()) {
            ActivityCompat.requestPermissions(this, w, 10);
            return;
        }
        PreviewView previewView2 = this.viewFinder;
        Objects.requireNonNull(previewView2);
        previewView2.post(new Runnable() { // from class: r56
            @Override // java.lang.Runnable
            public final void run() {
                QRCodeActivity1.r(this.a);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.cameraExecutor;
        Objects.requireNonNull(executorService);
        executorService.shutdown();
        l().unregisterDisplayListener(this.displayListener);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 10) {
            if (!i()) {
                Toast.makeText(this, "Permissions not granted by the user.", 0).show();
                finish();
            } else {
                PreviewView previewView = this.viewFinder;
                Objects.requireNonNull(previewView);
                previewView.post(new Runnable() { // from class: s56
                    @Override // java.lang.Runnable
                    public final void run() {
                        QRCodeActivity1.s(this.a);
                    }
                });
            }
        }
    }
}
