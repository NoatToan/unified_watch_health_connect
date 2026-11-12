package com.xiaomi.fitness.sport_capture.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_capture.utils.SportStatusUtils;
import defpackage.ded;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001O\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bR\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u000bJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010+R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010+R\u0016\u0010<\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)R\u0018\u0010=\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010)R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010+R\u0018\u0010F\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010J\u001a\u00020I8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/SportStatusUtils;", "", "Landroid/content/Context;", "ctx", "", "width", "height", "", "startHandle", "(Landroid/content/Context;II)V", "handleData", "()V", "stopHandle", "showRecordDuration", "hideRecordDuration", "handleProjectionData", "handleDemoProjectionData", "updateSurfaceRotateMatrix", "", "getRecordSurfaceMatrix", "()[F", "getFlipFoldedRecordSurfaceMatrix", "Landroid/graphics/Bitmap;", "provideLastSportStatusBitmap", "()Landroid/graphics/Bitmap;", "provideLastRotateSportStatusBitmap", "degree", "updateRotationDegree", "(I)V", "Lded;", "data", "updateProjectionData", "(Lded;)V", "demoGPS", "", "getVideoStartTimeStamp", "()J", "", "TAG", "Ljava/lang/String;", "VIEW_REFRESH_INTERVAL", "J", "REFRESH_VIEW", "I", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "sportStatusHandler", "Landroid/os/Handler;", "curBitmap", "Landroid/graphics/Bitmap;", "lastBitmap", "curRotateBitmap", "lastRotateBitmap", "Ljava/lang/ref/WeakReference;", "context", "Ljava/lang/ref/WeakReference;", "previewWidth", "previewHeight", "videoStartTimeStamp", "projectionData", "Lded;", "lastRefreshTime", "", "orientation", "F", "BITMAP_ROTATE_DEGREE", "FRONT_BITMAP_ROTATE_DEGREE", "recordSurfaceRotateDegree", "recordSurfaceMatrix", "[F", "flipFoldedRecordSurfaceMatrix", "", "DEBUG", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProcessingTexImage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "com/xiaomi/fitness/sport_capture/utils/SportStatusUtils$orientationListener$1", "orientationListener", "Lcom/xiaomi/fitness/sport_capture/utils/SportStatusUtils$orientationListener$1;", "<init>", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportStatusUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportStatusUtils.kt\ncom/xiaomi/fitness/sport_capture/utils/SportStatusUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n1#2:436\n*E\n"})
public final class SportStatusUtils {
    private static final float BITMAP_ROTATE_DEGREE = 90.0f;
    private static final boolean DEBUG = false;
    private static final float FRONT_BITMAP_ROTATE_DEGREE = 180.0f;
    private static final int REFRESH_VIEW = 16;

    @NotNull
    private static final String TAG = "SportStatusUtils";
    private static final long VIEW_REFRESH_INTERVAL = 1000;

    @Nullable
    private static WeakReference<Context> context;

    @Nullable
    private static Bitmap curBitmap;

    @Nullable
    private static Bitmap curRotateBitmap;

    @Nullable
    private static float[] flipFoldedRecordSurfaceMatrix;

    @Nullable
    private static HandlerThread handlerThread;

    @Nullable
    private static Bitmap lastBitmap;

    @Nullable
    private static Bitmap lastRotateBitmap;

    @Nullable
    private static ded projectionData;

    @Nullable
    private static float[] recordSurfaceMatrix;

    @Nullable
    private static Handler sportStatusHandler;

    @NotNull
    public static final SportStatusUtils INSTANCE = new SportStatusUtils();
    private static int previewWidth = -1;
    private static int previewHeight = -1;
    private static long videoStartTimeStamp = -1;
    private static long lastRefreshTime = -1;
    private static float orientation = -1.0f;
    private static int recordSurfaceRotateDegree = 90;

    @NotNull
    private static final AtomicBoolean isProcessingTexImage = new AtomicBoolean(false);

    @NotNull
    private static SportStatusUtils$orientationListener$1 orientationListener = new OrientationListener() { // from class: com.xiaomi.fitness.sport_capture.utils.SportStatusUtils$orientationListener$1
        @Override // com.xiaomi.fitness.sport_capture.utils.OrientationListener
        public void onOrientationChange(float ori) {
            SportStatusUtils.orientation = ori;
        }
    };

    private SportStatusUtils() {
    }

    @JvmStatic
    @Nullable
    public static final float[] getFlipFoldedRecordSurfaceMatrix() {
        return flipFoldedRecordSurfaceMatrix;
    }

    @JvmStatic
    @Nullable
    public static final float[] getRecordSurfaceMatrix() {
        return recordSurfaceMatrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleData() {
        handleProjectionData();
    }

    private final void handleDemoProjectionData() {
        final Context context2;
        WeakReference<Context> weakReference = context;
        if (weakReference == null || (context2 = weakReference.get()) == null) {
            Logger.i(TAG, "handleDemoProjectionData with empty context!!");
        } else {
            Handler handler = sportStatusHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: a3o
                    @Override // java.lang.Runnable
                    public final void run() {
                        SportStatusUtils.handleDemoProjectionData$lambda$13$lambda$11(context2);
                    }
                });
            } else {
                Logger.i(TAG, "handleDemoProjectionData with empty sportStatusHandler!!");
            }
        }
        Logger.d(TAG, "handleDemoProjectionData");
        Handler handler2 = sportStatusHandler;
        if (handler2 != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 16;
            handler2.sendMessageDelayed(messageObtain, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleDemoProjectionData$lambda$13$lambda$11(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        AtomicBoolean atomicBoolean = isProcessingTexImage;
        atomicBoolean.set(true);
        Bitmap bitmap = curBitmap;
        if (bitmap != null) {
            lastBitmap = bitmap;
        }
        Bitmap bitmap2 = curRotateBitmap;
        if (bitmap2 != null) {
            lastRotateBitmap = bitmap2;
        }
        SportStatusViewUtils sportStatusViewUtils = SportStatusViewUtils.INSTANCE;
        ded dedVar = new ded();
        dedVar.i = 100;
        ded.b bVar = new ded.b();
        bVar.c = 102.0f;
        bVar.d = 103.0f;
        bVar.e = 104.0f;
        dedVar.t = bVar;
        dedVar.g = 100;
        dedVar.f15441r = 1;
        dedVar.f15440k = 100.0f;
        Unit unit = Unit.INSTANCE;
        curBitmap = sportStatusViewUtils.convertSportStatusView2Bitmap(ctx, dedVar, previewWidth, previewHeight, orientation);
        curRotateBitmap = DeviceUtils.isFlipFolded() ? SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, 180.0f) : SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, BITMAP_ROTATE_DEGREE);
        if (recordSurfaceRotateDegree == 270) {
            curBitmap = SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, 180.0f);
        }
        curRotateBitmap = DeviceUtils.isFlipFolded() ? SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, -recordSurfaceRotateDegree) : SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, recordSurfaceRotateDegree);
        atomicBoolean.set(false);
        Bitmap bitmap3 = lastBitmap;
        if (bitmap3 != null) {
            bitmap3.recycle();
        }
        Bitmap bitmap4 = lastRotateBitmap;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
    }

    private final void handleProjectionData() {
        final Context context2;
        if (projectionData != null) {
            WeakReference<Context> weakReference = context;
            if (weakReference == null || (context2 = weakReference.get()) == null) {
                Logger.i(TAG, "handleProjectionData with empty context!!");
            } else {
                Handler handler = sportStatusHandler;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: z2o
                        @Override // java.lang.Runnable
                        public final void run() {
                            SportStatusUtils.handleProjectionData$lambda$6$lambda$4(context2);
                        }
                    });
                } else {
                    Logger.i(TAG, "handleProjectionData with empty sportStatusHandler!!");
                }
            }
        }
        Logger.d(TAG, "handleProjectionData");
        Handler handler2 = sportStatusHandler;
        if (handler2 != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 16;
            handler2.sendMessageDelayed(messageObtain, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleProjectionData$lambda$6$lambda$4(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        AtomicBoolean atomicBoolean = isProcessingTexImage;
        atomicBoolean.set(true);
        Bitmap bitmap = curBitmap;
        if (bitmap != null) {
            lastBitmap = bitmap;
        }
        Bitmap bitmap2 = curRotateBitmap;
        if (bitmap2 != null) {
            lastRotateBitmap = bitmap2;
        }
        SportStatusViewUtils sportStatusViewUtils = SportStatusViewUtils.INSTANCE;
        ded dedVar = projectionData;
        Intrinsics.checkNotNull(dedVar);
        curBitmap = sportStatusViewUtils.convertSportStatusView2Bitmap(ctx, dedVar, previewWidth, previewHeight, orientation);
        curRotateBitmap = DeviceUtils.isFlipFolded() ? SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, 180.0f) : SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, BITMAP_ROTATE_DEGREE);
        if (recordSurfaceRotateDegree == 270) {
            curBitmap = SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, 180.0f);
        }
        curRotateBitmap = DeviceUtils.isFlipFolded() ? SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, -recordSurfaceRotateDegree) : SportStatusViewUtils.rotateBitmapAndKeepSize(curBitmap, recordSurfaceRotateDegree);
        atomicBoolean.set(false);
    }

    @JvmStatic
    public static final void hideRecordDuration() {
        videoStartTimeStamp = -1L;
    }

    @JvmStatic
    @Nullable
    public static final Bitmap provideLastRotateSportStatusBitmap() {
        return isProcessingTexImage.get() ? lastRotateBitmap : curRotateBitmap;
    }

    @JvmStatic
    @Nullable
    public static final Bitmap provideLastSportStatusBitmap() {
        return isProcessingTexImage.get() ? lastBitmap : curBitmap;
    }

    @JvmStatic
    public static final void showRecordDuration() {
        videoStartTimeStamp = System.currentTimeMillis();
    }

    @JvmStatic
    public static final void startHandle(@NotNull Context ctx, int width, int height) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        SportStatusUtils sportStatusUtils = INSTANCE;
        sportStatusUtils.updateSurfaceRotateMatrix();
        context = new WeakReference<>(ctx);
        previewWidth = width;
        previewHeight = height;
        HandlerThread handlerThread2 = new HandlerThread("sport_status_handler");
        handlerThread = handlerThread2;
        handlerThread2.start();
        HandlerThread handlerThread3 = handlerThread;
        if (handlerThread3 != null) {
            sportStatusHandler = new Handler(handlerThread3.getLooper(), new Handler.Callback() { // from class: com.xiaomi.fitness.sport_capture.utils.SportStatusUtils$startHandle$1$1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message msg) {
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    if (msg.what != 16) {
                        return true;
                    }
                    SportStatusUtils.INSTANCE.handleData();
                    return true;
                }
            });
        }
        OrientationUtils.INSTANCE.init(ctx, orientationListener);
        sportStatusUtils.handleData();
    }

    @JvmStatic
    public static final void stopHandle() {
        Looper looper;
        HandlerThread handlerThread2 = handlerThread;
        if (handlerThread2 != null && (looper = handlerThread2.getLooper()) != null) {
            looper.quitSafely();
        }
        handlerThread = null;
        sportStatusHandler = null;
        Bitmap bitmap = curBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = lastBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        Bitmap bitmap3 = curRotateBitmap;
        if (bitmap3 != null) {
            bitmap3.recycle();
        }
        Bitmap bitmap4 = lastRotateBitmap;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        lastBitmap = null;
        curBitmap = null;
        curRotateBitmap = null;
        lastRotateBitmap = null;
        videoStartTimeStamp = -1L;
        projectionData = null;
        RoutePointManager.INSTANCE.clear();
        OrientationUtils.INSTANCE.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProjectionData$lambda$2$lambda$1(ded.d it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Logger.d(TAG, "addPoint--latitude:" + it.d + ")");
        Logger.d(TAG, "addPoint--longitude:" + it.c);
        double d = it.d;
        if (d > 0.0d) {
            double d2 = it.c;
            if (d2 > 0.0d) {
                Logger.d(TAG, "filter addPoint(" + d + ", " + d2 + ")");
                RoutePointManager.INSTANCE.addPoint(new RoutePoint(System.currentTimeMillis(), it.c, it.d));
            }
        }
    }

    @JvmStatic
    public static final void updateRotationDegree(int degree) {
        recordSurfaceRotateDegree = degree;
        INSTANCE.updateSurfaceRotateMatrix();
    }

    private final void updateSurfaceRotateMatrix() {
        if (recordSurfaceMatrix == null) {
            float[] fArr = new float[16];
            for (int i = 0; i < 16; i++) {
                fArr[i] = 0.0f;
            }
            recordSurfaceMatrix = fArr;
        }
        Matrix.setIdentityM(recordSurfaceMatrix, 0);
        Matrix.setRotateM(recordSurfaceMatrix, 0, recordSurfaceRotateDegree, 0.0f, 0.0f, 1.0f);
        if (flipFoldedRecordSurfaceMatrix == null) {
            float[] fArr2 = new float[16];
            for (int i2 = 0; i2 < 16; i2++) {
                fArr2[i2] = 0.0f;
            }
            flipFoldedRecordSurfaceMatrix = fArr2;
        }
        Matrix.setIdentityM(flipFoldedRecordSurfaceMatrix, 0);
        Matrix.setRotateM(flipFoldedRecordSurfaceMatrix, 0, -recordSurfaceRotateDegree, 0.0f, 0.0f, 1.0f);
    }

    public final void demoGPS() {
        RoutePointManager routePointManager = RoutePointManager.INSTANCE;
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.311614990234d, 40.0454559326172d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.311584472656d, 40.0454292297363d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.311477661133d, 40.0453681945801d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.311058044434d, 40.045093536377d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.310928344727d, 40.0448226928711d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.310997009277d, 40.0446472167969d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.310829162598d, 40.0445404052734d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.310638427734d, 40.0444450378418d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.310440063477d, 40.0443382263184d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.310279846191d, 40.0442276000977d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.310264587402d, 40.0442199707031d));
        routePointManager.addPoint(new RoutePoint(System.currentTimeMillis(), 116.309265136719d, 40.043571472168d));
    }

    public final long getVideoStartTimeStamp() {
        return videoStartTimeStamp;
    }

    public final void updateProjectionData(@NotNull ded data) {
        Intrinsics.checkNotNullParameter(data, "data");
        projectionData = data;
        final ded.d dVar = data.s;
        if (dVar != null) {
            Handler handler = sportStatusHandler;
            if ((handler != null ? Boolean.valueOf(handler.post(new Runnable() { // from class: y2o
                @Override // java.lang.Runnable
                public final void run() {
                    SportStatusUtils.updateProjectionData$lambda$2$lambda$1(dVar);
                }
            })) : null) != null) {
                return;
            }
        }
        Logger.d(TAG, "data has not track info!!");
        Unit unit = Unit.INSTANCE;
    }
}
