package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dynamicchart.DynamicChart;

/* JADX INFO: loaded from: classes16.dex */
public class qkv extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qkw f46405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qku f46406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qlc f46407c;
    private qkt d;
    private Bitmap e;
    private qkx f;
    private SurfaceView g;
    private HandlerThread h;
    private int i;
    private int j;
    private int l;
    private int o;

    private qkv(Looper looper, HandlerThread handlerThread) {
        super(looper);
        this.i = -1;
        this.e = null;
        this.o = 40;
        this.l = HeartRateThresholdConfig.HEART_RATE_LIMIT;
        this.j = -16777216;
        this.h = handlerThread;
    }

    public static qkv e() {
        HandlerThread handlerThread = new HandlerThread("DynamicChartHandler");
        handlerThread.start();
        return new qkv(handlerThread.getLooper(), handlerThread);
    }

    public void d(Context context, DynamicChart dynamicChart) {
        this.g = dynamicChart;
    }

    public void c() {
        this.h.quit();
    }

    public void d(int i, int i2) {
        this.o = i;
        this.l = i2;
    }

    public void d(int i) {
        this.j = i;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Integer num = (Integer) message.obj;
            int iIntValue = num.intValue();
            LogUtil.a("HiH_DynamicChartHandler", "MSG_SET_POINTS_COUNT_IN_ONESCREEN,oneScreenPointsCount = ", num);
            b(iIntValue);
            return;
        }
        if (i == 2) {
            LogUtil.a("HiH_DynamicChartHandler", "MSG_RESIZE_SURFACE_VIEW");
            b(message.arg1, message.arg2);
        } else if (i == 3) {
            LogUtil.a("HiH_DynamicChartHandler", "MSG_PUSH_NEW_DATA");
            d(((Float) message.obj).floatValue());
        } else {
            if (i == 4) {
                LogUtil.a("HiH_DynamicChartHandler", "MSG_SET_ORDINATE_Y");
                int[] iArr = (int[]) message.obj;
                d(iArr[0], iArr[1]);
                return;
            }
            super.handleMessage(message);
        }
    }

    private void b(int i) {
        this.i = i;
    }

    private void b(int i, int i2) {
        LogUtil.a("HiH_DynamicChartHandler", "handleResizeView");
        if (this.e != null) {
            LogUtil.d("HiH_DynamicChartHandler", "throw new RuntimeException");
        }
        if (this.i == -1) {
            LogUtil.d("HiH_DynamicChartHandler", "throw new RuntimeException");
        }
        this.e = Bitmap.createBitmap((int) Math.floor((i / (this.i - 1)) * 500.0f), i2, Bitmap.Config.ARGB_8888);
        new Canvas(this.e).drawColor(0);
        this.f46407c = new qlb(i, i2).c((int) qky.c(16.0f), (int) qky.c(6.0f), (int) qky.c(16.0f), (int) qky.c(6.0f)).c();
        qkt qktVar = new qkt();
        this.d = qktVar;
        qktVar.b(0.0f, this.i - 1, this.o, this.l);
        this.d.d(this.o, this.l);
        RectF rectFA = this.f46407c.a();
        this.d.c(rectFA.left, rectFA.right, rectFA.top, rectFA.bottom);
        this.d.c();
        qku qkuVar = new qku(this.i, 500);
        this.f46406b = qkuVar;
        qkuVar.a(this.o, this.l);
        this.f = new qkx(this.f46407c);
        qkw qkwVar = new qkw(this.f46407c, this.d, this.f46406b);
        this.f46405a = qkwVar;
        qkwVar.b(this.o, this.l);
        this.f46405a.c(this.j);
        d(0.0f);
    }

    private void d(float f) {
        SurfaceHolder holder;
        Canvas canvasLockCanvas;
        try {
            SurfaceView surfaceView = this.g;
            if (surfaceView == null || (canvasLockCanvas = (holder = surfaceView.getHolder()).lockCanvas()) == null) {
                return;
            }
            qku qkuVar = this.f46406b;
            if (qkuVar != null) {
                qkuVar.c(f);
                canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f.e(canvasLockCanvas);
                this.f46405a.e(canvasLockCanvas, this.e);
                this.f46406b.c();
            }
            holder.unlockCanvasAndPost(canvasLockCanvas);
        } catch (IllegalArgumentException | IllegalStateException e) {
            LogUtil.e("HiH_DynamicChartHandler", "handlePushNewValue failed, exception = ", ExceptionUtils.c(e));
        }
    }
}
