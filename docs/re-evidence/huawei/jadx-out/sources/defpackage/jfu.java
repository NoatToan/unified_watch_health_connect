package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0011J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0011J\u001a\u0010\u0019\u001a\u00020\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bJ\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/huawei/healthcloud/plugintrack/trackanimation/recorder/PixelCopyManager;", "", "<init>", "()V", "TAG", "", "mView", "Landroid/view/View;", "mWindow", "Landroid/view/Window;", "mHandlerThread", "Landroid/os/HandlerThread;", "mHandler", "Landroid/os/Handler;", "mLocation", "", "mWidth", "", "mHeight", "init", "", Constants.NATIVE_WINDOW_SUB_DIR, "view", "width", "initSize", "getPixelBitmap", ParamConstants.Param.CALLBACK, "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "destroy", "copyPixelFromViewAsync", "Ljava/util/concurrent/CompletableFuture;", "Companion", "PluginMotionTrack_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38557a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile jfu f38558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f38559c;
    private HandlerThread d;
    private final String e;
    private int f;
    private View g;
    private int h;
    private int[] i;
    private Window j;

    private jfu() {
        this.e = "Track_PixelCopyManager";
        this.d = new HandlerThread("Track_PixelCopyManager");
        this.i = new int[2];
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/healthcloud/plugintrack/trackanimation/recorder/PixelCopyManager$Companion;", "", "<init>", "()V", "instance", "Lcom/huawei/healthcloud/plugintrack/trackanimation/recorder/PixelCopyManager;", "getInstance", "PluginMotionTrack_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public final jfu e() {
            jfu jfuVar;
            jfu jfuVar2 = jfu.f38558b;
            if (jfuVar2 != null) {
                return jfuVar2;
            }
            synchronized (this) {
                jfuVar = jfu.f38558b;
                if (jfuVar == null) {
                    jfuVar = new jfu(null);
                    b bVar = jfu.f38557a;
                    jfu.f38558b = jfuVar;
                    jfuVar.d.start();
                    jfuVar.f38559c = new Handler(jfuVar.d.getLooper());
                }
            }
            return jfuVar;
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }

    public final void d(Window window, View view, int i) {
        zcp.c(window, "");
        zcp.c(view, "");
        this.j = window;
        this.g = view;
        this.h = i;
        d(view, i);
        view.getLocationInWindow(this.i);
        ReleaseLogUtil.d(this.e, "init with mHeight: ", Integer.valueOf(this.f), " mWidth: ", Integer.valueOf(this.h));
    }

    public final void d(View view, int i) {
        int measuredHeight;
        zcp.c(view, "");
        if (i % 2 != 0) {
            i--;
        }
        if (i == view.getMeasuredWidth()) {
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredHeight = (int) (view.getMeasuredHeight() * (i / view.getMeasuredWidth()));
        }
        this.f = measuredHeight;
        if (measuredHeight % 2 != 0) {
            this.f = measuredHeight - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void c(final Function1<? super Bitmap, yzc> function1) {
        zcp.c(function1, "");
        d().thenAcceptAsync(new Consumer() { // from class: jga
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jfu.e(function1, obj);
            }
        });
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this) {
            jfu jfuVar = f38558b;
            if (jfuVar != null && (handlerThread = jfuVar.d) != null) {
                handlerThread.quit();
            }
            jfu jfuVar2 = f38558b;
            if (jfuVar2 != null) {
                Handler handler = jfuVar2.f38559c;
                if (handler == null) {
                    zcp.d("");
                    handler = null;
                }
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            }
            f38558b = null;
            yzc yzcVar = yzc.e;
        }
    }

    private final CompletableFuture<Bitmap> d() {
        int i;
        final CompletableFuture<Bitmap> completableFuture = new CompletableFuture<>();
        Window window = this.j;
        Handler handler = null;
        if (window != null) {
            if (window == null) {
                zcp.d("");
                window = null;
            }
            if (window.isActive()) {
                int i2 = this.h;
                if (i2 <= 0 || (i = this.f) <= 0) {
                    LogUtil.e(this.e, " mWidth: ", Integer.valueOf(i2), " mHeight: ", Integer.valueOf(this.f));
                    View view = this.g;
                    if (view == null) {
                        zcp.d("");
                        view = null;
                    }
                    View view2 = this.g;
                    if (view2 == null) {
                        zcp.d("");
                        view2 = null;
                    }
                    d(view, view2.getWidth());
                    completableFuture.complete(null);
                    return completableFuture;
                }
                final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                zcp.b((Object) bitmapCreateBitmap, "");
                try {
                    Window window2 = this.j;
                    if (window2 == null) {
                        zcp.d("");
                        window2 = null;
                    }
                    int[] iArr = this.i;
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    Rect rect = new Rect(i3, i4, this.h + i3, this.f + i4);
                    PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: jgb
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i5) {
                            jfu.a(completableFuture, bitmapCreateBitmap, this, i5);
                        }
                    };
                    Handler handler2 = this.f38559c;
                    if (handler2 == null) {
                        zcp.d("");
                    } else {
                        handler = handler2;
                    }
                    PixelCopy.request(window2, rect, bitmapCreateBitmap, onPixelCopyFinishedListener, handler);
                    return completableFuture;
                } catch (Exception e) {
                    Exception exc = e;
                    ReleaseLogUtil.a(this.e, "copyPixelFromViewAsync with ", ExceptionUtils.c(exc));
                    bitmapCreateBitmap.recycle();
                    completableFuture.completeExceptionally(exc);
                    return completableFuture;
                }
            }
        }
        LogUtil.e(this.e, "copyPixelFromView not active");
        completableFuture.complete(null);
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CompletableFuture completableFuture, Bitmap bitmap, jfu jfuVar, int i) {
        if (i == 0) {
            completableFuture.complete(bitmap);
            return;
        }
        ReleaseLogUtil.a(jfuVar.e, "PixelCopy copyResult: ", Integer.valueOf(i));
        bitmap.recycle();
        completableFuture.complete(null);
    }

    public /* synthetic */ jfu(zcm zcmVar) {
        this();
    }
}
