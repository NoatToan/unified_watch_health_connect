package io.sentry.android.replay;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.onetrack.c.q;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001@B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u00020)J\u0006\u00106\u001a\u000204J\u0006\u00107\u001a\u000204J\b\u00108\u001a\u000204H\u0016J\u0006\u00109\u001a\u000204J\u0006\u0010:\u001a\u000204J\u0010\u0010;\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010)J\u0014\u0010<\u001a\u00020=*\u00020\u00112\u0006\u0010>\u001a\u00020?H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR#\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b0\u00101¨\u0006A"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorder;", "Landroid/view/ViewTreeObserver$OnDrawListener;", q.f13857a, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "options", "Lio/sentry/SentryOptions;", "mainLooperHandler", "Lio/sentry/android/replay/util/MainLooperHandler;", "screenshotRecorderCallback", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/SentryOptions;Lio/sentry/android/replay/util/MainLooperHandler;Lio/sentry/android/replay/ScreenshotRecorderCallback;)V", "getConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "contentChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCapturing", "lastScreenshot", "Landroid/graphics/Bitmap;", "getMainLooperHandler", "()Lio/sentry/android/replay/util/MainLooperHandler;", "maskingPaint", "Landroid/graphics/Paint;", "getMaskingPaint", "()Landroid/graphics/Paint;", "maskingPaint$delegate", "Lkotlin/Lazy;", "getOptions", "()Lio/sentry/SentryOptions;", "prescaledMatrix", "Landroid/graphics/Matrix;", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "recorder", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "getRecorder", "()Ljava/util/concurrent/ScheduledExecutorService;", "recorder$delegate", "rootView", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "singlePixelBitmap", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmap$delegate", "singlePixelBitmapCanvas", "Landroid/graphics/Canvas;", "getSinglePixelBitmapCanvas", "()Landroid/graphics/Canvas;", "singlePixelBitmapCanvas$delegate", "bind", "", "root", "capture", Constants.EXTRA_CLOSE_TAI, "onDraw", "pause", "resume", "unbind", "dominantColorForRect", "", "rect", "Landroid/graphics/Rect;", "RecorderExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@TargetApi(26)
public final class ScreenshotRecorder implements ViewTreeObserver.OnDrawListener {

    @NotNull
    private final ScreenshotRecorderConfig config;

    @NotNull
    private final AtomicBoolean contentChanged;

    @NotNull
    private final AtomicBoolean isCapturing;

    @Nullable
    private Bitmap lastScreenshot;

    @NotNull
    private final MainLooperHandler mainLooperHandler;

    /* JADX INFO: renamed from: maskingPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy maskingPaint;

    @NotNull
    private final SentryOptions options;

    /* JADX INFO: renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy prescaledMatrix;

    /* JADX INFO: renamed from: recorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recorder;

    @Nullable
    private WeakReference<View> rootView;

    @Nullable
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    /* JADX INFO: renamed from: singlePixelBitmap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singlePixelBitmap;

    /* JADX INFO: renamed from: singlePixelBitmapCanvas$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singlePixelBitmapCanvas;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorder$RecorderExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RecorderExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r2) {
            Intrinsics.checkNotNullParameter(r2, "r");
            StringBuilder sb = new StringBuilder();
            sb.append("SentryReplayRecorder-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb.append(i);
            Thread thread = new Thread(r2, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public ScreenshotRecorder(@NotNull ScreenshotRecorderConfig config, @NotNull SentryOptions options, @NotNull MainLooperHandler mainLooperHandler, @Nullable ScreenshotRecorderCallback screenshotRecorderCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        this.config = config;
        this.options = options;
        this.mainLooperHandler = mainLooperHandler;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.recorder = LazyKt__LazyJVMKt.lazy(new Function0<ScheduledExecutorService>() { // from class: io.sentry.android.replay.ScreenshotRecorder$recorder$2
            @Override // kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                return Executors.newSingleThreadScheduledExecutor(new ScreenshotRecorder.RecorderExecutorServiceThreadFactory());
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.maskingPaint = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Paint>() { // from class: io.sentry.android.replay.ScreenshotRecorder$maskingPaint$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Paint invoke() {
                return new Paint();
            }
        });
        this.singlePixelBitmap = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Bitmap>() { // from class: io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmap$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Bitmap invoke() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
                return bitmapCreateBitmap;
            }
        });
        this.singlePixelBitmapCanvas = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Canvas>() { // from class: io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmapCanvas$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Canvas invoke() {
                return new Canvas(this.this$0.getSinglePixelBitmap());
            }
        });
        this.prescaledMatrix = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Matrix>() { // from class: io.sentry.android.replay.ScreenshotRecorder$prescaledMatrix$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Matrix invoke() {
                Matrix matrix = new Matrix();
                ScreenshotRecorder screenshotRecorder = this.this$0;
                matrix.preScale(screenshotRecorder.getConfig().getScaleFactorX(), screenshotRecorder.getConfig().getScaleFactorY());
                return matrix;
            }
        });
        this.contentChanged = new AtomicBoolean(false);
        this.isCapturing = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$3(final ScreenshotRecorder this$0, Window window, final Bitmap bitmap, final View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        try {
            this$0.contentChanged.set(false);
            PixelCopy.request(window, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.h
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    ScreenshotRecorder.capture$lambda$3$lambda$2(this.f21650a, bitmap, view, i);
                }
            }, this$0.mainLooperHandler.getHandler());
        } catch (Throwable th) {
            this$0.options.getLogger().a(SentryLevel.WARNING, "Failed to capture replay recording", th);
            bitmap.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$3$lambda$2(final ScreenshotRecorder this$0, final Bitmap bitmap, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        if (i != 0) {
            this$0.options.getLogger().c(SentryLevel.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
            bitmap.recycle();
        } else {
            if (this$0.contentChanged.get()) {
                this$0.options.getLogger().c(SentryLevel.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                bitmap.recycle();
                return;
            }
            final ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.INSTANCE.fromView(view, null, 0, this$0.options);
            ViewsKt.traverse(view, viewHierarchyNodeFromView, this$0.options);
            ScheduledExecutorService recorder = this$0.getRecorder();
            Intrinsics.checkNotNullExpressionValue(recorder, "recorder");
            ExecutorsKt.submitSafely(recorder, this$0.options, "screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.g
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenshotRecorder.capture$lambda$3$lambda$2$lambda$1(bitmap, this$0, viewHierarchyNodeFromView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$3$lambda$2$lambda$1(final Bitmap bitmap, final ScreenshotRecorder this$0, ViewHierarchyNode viewHierarchy) {
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewHierarchy, "$viewHierarchy");
        final Canvas canvas = new Canvas(bitmap);
        canvas.setMatrix(this$0.getPrescaledMatrix());
        viewHierarchy.traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: io.sentry.android.replay.ScreenshotRecorder$capture$2$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(@NotNull ViewHierarchyNode node) {
                Pair pair;
                Integer dominantColor;
                Intrinsics.checkNotNullParameter(node, "node");
                if (node.getShouldMask() && node.getWidth() > 0 && node.getHeight() > 0) {
                    if (node.getVisibleRect() == null) {
                        return Boolean.FALSE;
                    }
                    if (node instanceof ViewHierarchyNode.ImageViewHierarchyNode) {
                        pair = TuplesKt.to(CollectionsKt__CollectionsJVMKt.listOf(node.getVisibleRect()), Integer.valueOf(this.this$0.dominantColorForRect(bitmap, node.getVisibleRect())));
                    } else {
                        if (node instanceof ViewHierarchyNode.TextViewHierarchyNode) {
                            ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) node;
                            TextLayout layout = textViewHierarchyNode.getLayout();
                            pair = TuplesKt.to(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), node.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(((layout == null || (dominantColor = layout.getDominantTextColor()) == null) && (dominantColor = textViewHierarchyNode.getDominantColor()) == null) ? -16777216 : dominantColor.intValue()));
                        } else {
                            pair = TuplesKt.to(CollectionsKt__CollectionsJVMKt.listOf(node.getVisibleRect()), -16777216);
                        }
                    }
                    List list = (List) pair.component1();
                    this.this$0.getMaskingPaint().setColor(((Number) pair.component2()).intValue());
                    Canvas canvas2 = canvas;
                    ScreenshotRecorder screenshotRecorder = this.this$0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        canvas2.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, screenshotRecorder.getMaskingPaint());
                    }
                }
                return Boolean.TRUE;
            }
        });
        Bitmap screenshot = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        ScreenshotRecorderCallback screenshotRecorderCallback = this$0.screenshotRecorderCallback;
        if (screenshotRecorderCallback != null) {
            Intrinsics.checkNotNullExpressionValue(screenshot, "screenshot");
            screenshotRecorderCallback.onScreenshotRecorded(screenshot);
        }
        Bitmap bitmap2 = this$0.lastScreenshot;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this$0.lastScreenshot = screenshot;
        this$0.contentChanged.set(false);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dominantColorForRect(Bitmap bitmap, Rect rect) {
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        getPrescaledMatrix().mapRect(rectF);
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return getSinglePixelBitmap().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint getMaskingPaint() {
        return (Paint) this.maskingPaint.getValue();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    private final ScheduledExecutorService getRecorder() {
        return (ScheduledExecutorService) this.recorder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getSinglePixelBitmap() {
        return (Bitmap) this.singlePixelBitmap.getValue();
    }

    private final Canvas getSinglePixelBitmapCanvas() {
        return (Canvas) this.singlePixelBitmapCanvas.getValue();
    }

    public final void bind(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        ViewTreeObserver viewTreeObserver = root.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnDrawListener(this);
        }
        this.contentChanged.set(true);
    }

    public final void capture() {
        Bitmap bitmap;
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!this.isCapturing.get()) {
            this.options.getLogger().c(SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
            return;
        }
        if (!this.contentChanged.get() && (bitmap = this.lastScreenshot) != null) {
            Intrinsics.checkNotNull(bitmap);
            if (!bitmap.isRecycled()) {
                this.options.getLogger().c(SentryLevel.DEBUG, "Content hasn't changed, repeating last known frame", new Object[0]);
                Bitmap bitmap2 = this.lastScreenshot;
                if (bitmap2 == null || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
                    return;
                }
                Bitmap bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, false);
                Intrinsics.checkNotNullExpressionValue(bitmapCopy, "it.copy(ARGB_8888, false)");
                screenshotRecorderCallback.onScreenshotRecorded(bitmapCopy);
                return;
            }
        }
        WeakReference<View> weakReference = this.rootView;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().c(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        final Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().c(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.config.getRecordingWidth(), this.config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        this.mainLooperHandler.post(new Runnable() { // from class: io.sentry.android.replay.f
            @Override // java.lang.Runnable
            public final void run() {
                ScreenshotRecorder.capture$lambda$3(this.f21646a, phoneWindow, bitmapCreateBitmap, view);
            }
        });
    }

    public final void close() {
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        Bitmap bitmap = this.lastScreenshot;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.isCapturing.set(false);
        ScheduledExecutorService recorder = getRecorder();
        Intrinsics.checkNotNullExpressionValue(recorder, "recorder");
        ExecutorsKt.gracefullyShutdown(recorder, this.options);
    }

    @NotNull
    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final MainLooperHandler getMainLooperHandler() {
        return this.mainLooperHandler;
    }

    @NotNull
    public final SentryOptions getOptions() {
        return this.options;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().c(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.contentChanged.set(true);
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        View view;
        ViewTreeObserver viewTreeObserver;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnDrawListener(this);
        }
        this.isCapturing.set(true);
    }

    public final void unbind(@Nullable View root) {
        ViewTreeObserver viewTreeObserver;
        if (root == null || (viewTreeObserver = root.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnDrawListener(this);
    }
}
