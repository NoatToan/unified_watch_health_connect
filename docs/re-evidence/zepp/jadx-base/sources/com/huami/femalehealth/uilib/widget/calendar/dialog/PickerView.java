package com.huami.femalehealth.uilib.widget.calendar.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 l2\u00020\u0001:\u0003l\u0012\u0015B\u0013\b\u0016\u0012\b\u0010f\u001a\u0004\u0018\u00010e¢\u0006\u0004\bg\u0010hB\u001d\b\u0016\u0012\b\u0010f\u001a\u0004\u0018\u00010e\u0012\b\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bg\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0014\u0010\u001a\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0014J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0002H\u0014R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010.\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b-\u0010+R\u001d\u00100\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b/\u0010+R\u0016\u00102\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010&R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010>\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010&R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010&R\u0016\u0010D\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00101R\u0016\u0010F\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00101R\u0016\u0010I\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR0\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0002\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010Y\u001a\b\u0018\u00010VR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R!\u0010d\u001a\n _*\u0004\u0018\u00010^0^8\u0006@\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006m"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView;", "Landroid/view/View;", "", "i", "", "pos", "setSelectedPos", "g", "h", "f", "Landroid/graphics/Canvas;", "canvas", GoogleApiAvailabilityLight.a, "position", "type", "e", "Landroid/view/MotionEvent;", "event", "a", "", "eventY", "b", "c", "", "", "data", "setData", "content", "setSelected", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "", "onTouchEvent", "onAttachedToWindow", "Ljava/util/List;", "dataList", LogUtil.I, "currentSelected", "Landroid/graphics/Paint;", "Lkotlin/Lazy;", "getPaint", "()Landroid/graphics/Paint;", "paint", "getSymbolPaint", "symbolPaint", "getLinePaint", "linePaint", "F", "selectTextSize", "selectTextColor", "getUnSelectTextColor", "()I", "setUnSelectTextColor", "(I)V", "unSelectTextColor", "Ljava/lang/String;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "symbol", z.j, "viewHeight", hl.k, "viewWidth", "l", "lastDownY", "m", "moveLen", GoogleApiAvailabilityLight.b, "Z", "isInit", "Lkotlin/Function1;", "o", "Lkotlin/jvm/functions/Function1;", "getOnSelectListener", "()Lkotlin/jvm/functions/Function1;", "setOnSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "onSelectListener", "Ljava/util/Timer;", com.google.android.exoplayer2.text.ttml.b.r, "Ljava/util/Timer;", "timer", "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView$a;", DTransferConstants.SEARCH_KEY, "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView$a;", "task", "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView$b;", "r", "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView$b;", "updateHandler", "Landroid/view/VelocityTracker;", "kotlin.jvm.PlatformType", SOAP.XMLNS, "Landroid/view/VelocityTracker;", "getT", "()Landroid/view/VelocityTracker;", "t", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class PickerView extends View {
    private static final float t = 2.4f;
    private static final float u = 2.0f;
    private static final float v;
    private static final float w;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<String> dataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int currentSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy paint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy symbolPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy linePaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float selectTextSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int selectTextColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int unSelectTextColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String symbol;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int viewHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int viewWidth;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float lastDownY;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float moveLen;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isInit;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private Function1<? super String, Unit> onSelectListener;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private Timer timer;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private a task;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private b updateHandler;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final VelocityTracker t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/femalehealth/uilib/widget/calendar/dialog/PickerView$a", "Ljava/util/TimerTask;", "", "run", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView;Landroid/os/Handler;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private Handler handler;

        public a(Handler handler) {
            this.handler = handler;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Handler handler = this.handler;
            handler.sendMessage(handler.obtainMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"com/huami/femalehealth/uilib/widget/calendar/dialog/PickerView$b", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView;", "a", "Ljava/lang/ref/WeakReference;", "pickerViewCatch", "pickerView", "<init>", "(Lcom/huami/femalehealth/uilib/widget/calendar/dialog/PickerView;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<PickerView> pickerViewCatch;

        public b(@NotNull PickerView pickerView) {
            super(Looper.getMainLooper());
            this.pickerViewCatch = new WeakReference<>(pickerView);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            super.handleMessage(msg);
            PickerView pickerView = this.pickerViewCatch.get();
            if (pickerView == null) {
                return;
            }
            if (Math.abs(pickerView.moveLen) < 2.0f) {
                pickerView.moveLen = 0.0f;
                a aVar = pickerView.task;
                if (aVar != null) {
                    aVar.cancel();
                    pickerView.task = null;
                    pickerView.i();
                }
            } else {
                pickerView.moveLen -= (((pickerView.moveLen / Math.abs(pickerView.moveLen)) * 2.0f) * Math.abs(pickerView.moveLen)) / 10;
            }
            pickerView.invalidate();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("moveLen:", Float.valueOf(PickerView.this.moveLen));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Paint> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(ExtKt.getResColor(PickerView.this.getContext(), R.color.fh_calendar_select_line_color));
            paint.setStrokeWidth(ResourceHelper.INSTANCE.getDimen(R.dimen.fh_calendar_select_line_size));
            return paint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Paint> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            return paint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Paint> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(PickerView.this.selectTextColor);
            paint.setTextSize(ResourceHelper.INSTANCE.spToPx(10.0f));
            return paint;
        }
    }

    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        v = resourceHelper.dp2px(10.0f);
        w = resourceHelper.dp2px(25.5f);
    }

    public PickerView(@Nullable Context context) {
        super(context);
        this.dataList = new ArrayList();
        this.paint = LazyKt__LazyJVMKt.lazy(e.a);
        this.symbolPaint = LazyKt__LazyJVMKt.lazy(new f());
        this.linePaint = LazyKt__LazyJVMKt.lazy(new d());
        this.selectTextSize = ResourceHelper.INSTANCE.spToPx(18.0f);
        this.selectTextColor = ExtKt.getResColor(getContext(), R.color.fh_btn_main_color);
        this.unSelectTextColor = ExtKt.getResColor(getContext(), R.color.fh_black_33);
        this.symbol = "";
        this.timer = new Timer();
        this.updateHandler = new b(this);
        this.t = VelocityTracker.obtain();
        f();
    }

    private final void a(MotionEvent event) {
        a aVar = this.task;
        if (aVar != null) {
            aVar.cancel();
            this.task = null;
        }
        this.lastDownY = event.getY();
    }

    private final void b(float eventY) {
        float f2 = this.moveLen;
        float f3 = (eventY - this.lastDownY) + f2;
        this.moveLen = f3;
        float f4 = this.selectTextSize;
        float f5 = 2;
        if (f3 > (f4 * t) / f5) {
            int i = this.currentSelected - 1;
            this.currentSelected = i;
            if (i < 0) {
                this.currentSelected = 0;
                this.moveLen = f2;
            } else {
                this.moveLen = f3 - (f4 * t);
            }
        } else if (f3 < (f4 * (-2.4f)) / f5) {
            int i2 = this.currentSelected + 1;
            this.currentSelected = i2;
            if (i2 > this.dataList.size() - 1) {
                this.currentSelected = this.dataList.size() - 1;
                this.moveLen = f2;
            } else {
                this.moveLen += this.selectTextSize * t;
            }
        }
        this.lastDownY = eventY;
        invalidate();
    }

    private final void c(MotionEvent event) {
        if (Math.abs(this.moveLen) < 1.0E-4d) {
            this.moveLen = 0.0f;
            return;
        }
        this.t.computeCurrentVelocity(1000, ViewConfiguration.get(getContext()).getScaledMaximumFlingVelocity());
        HMLog.error$default("xys", null, null, new c(), 6, null);
        this.t.getYVelocity();
        a aVar = this.task;
        if (aVar != null) {
            aVar.cancel();
            this.task = null;
        }
        a aVar2 = new a(this.updateHandler);
        this.task = aVar2;
        this.timer.schedule(aVar2, 0L, 10L);
    }

    private final void d(Canvas canvas) {
        getPaint().setTextSize(this.selectTextSize);
        getPaint().setAlpha(255);
        float f2 = (float) (((double) this.viewWidth) / 2.0d);
        float f3 = (float) ((((double) this.viewHeight) / 2.0d) + ((double) this.moveLen));
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        float f4 = (float) (((double) f3) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d)));
        getPaint().setColor(this.selectTextColor);
        canvas.drawText(this.dataList.get(this.currentSelected), f2, f4, getPaint());
        canvas.drawText(this.symbol, f2 + (getPaint().measureText(this.dataList.get(this.currentSelected)) / 2) + v, f4 - this.moveLen, getSymbolPaint());
        getPaint().setColor(this.unSelectTextColor);
        for (int i = 1; this.currentSelected - i >= 0; i++) {
            getPaint().setAlpha(getPaint().getAlpha() / 2);
            getPaint().setTextSize(getPaint().getTextSize() - ResourceHelper.INSTANCE.spToPx(2.0f));
            e(canvas, i, -1);
        }
        getPaint().setTextSize(this.selectTextSize);
        getPaint().setAlpha(255);
        for (int i2 = 1; this.currentSelected + i2 < this.dataList.size(); i2++) {
            getPaint().setAlpha(getPaint().getAlpha() / 2);
            getPaint().setTextSize(getPaint().getTextSize() - ResourceHelper.INSTANCE.spToPx(2.0f));
            e(canvas, i2, 1);
        }
    }

    private final void e(Canvas canvas, int position, int type) {
        float f2 = type;
        float f3 = (float) ((((double) this.viewHeight) / 2.0d) + ((double) (f2 * ((this.selectTextSize * t * position) + (this.moveLen * f2)))));
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        canvas.drawText(this.dataList.get(this.currentSelected + (type * position)), (float) (((double) this.viewWidth) / 2.0d), (float) (((double) f3) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d))), getPaint());
    }

    private final void f() {
        performClick();
    }

    private final void g() {
        String str = this.dataList.get(0);
        this.dataList.remove(0);
        this.dataList.add(str);
    }

    private final Paint getLinePaint() {
        return (Paint) this.linePaint.getValue();
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Paint getSymbolPaint() {
        return (Paint) this.symbolPaint.getValue();
    }

    private final void h() {
        List<String> list = this.dataList;
        String str = list.get(list.size() - 1);
        List<String> list2 = this.dataList;
        list2.remove(list2.size() - 1);
        this.dataList.add(0, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        Function1<? super String, Unit> function1 = this.onSelectListener;
        if (function1 == null) {
            return;
        }
        function1.invoke(this.dataList.get(this.currentSelected));
    }

    private final void setSelectedPos(int pos) {
        this.currentSelected = pos;
        i();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Function1<String, Unit> getOnSelectListener() {
        return this.onSelectListener;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final VelocityTracker getT() {
        return this.t;
    }

    public final int getUnSelectTextColor() {
        return this.unSelectTextColor;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        this.t.recycle();
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.isInit) {
            d(canvas);
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float f2 = w;
            float f3 = measuredHeight - f2;
            canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, getLinePaint());
            float measuredHeight2 = (getMeasuredHeight() / 2.0f) + f2;
            canvas.drawLine(0.0f, measuredHeight2, getMeasuredWidth(), measuredHeight2, getLinePaint());
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.viewHeight = getMeasuredHeight();
        this.viewWidth = getMeasuredWidth();
        this.isInit = true;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        this.t.addMovement(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            a(event);
        } else if (actionMasked == 1) {
            c(event);
        } else if (actionMasked == 2) {
            b(event.getY());
        }
        return true;
    }

    public final void setData(@NotNull List<String> data) {
        this.dataList.clear();
        this.dataList.addAll(data);
        this.currentSelected = this.dataList.size() / 2;
        invalidate();
    }

    public final void setOnSelectListener(@Nullable Function1<? super String, Unit> function1) {
        this.onSelectListener = function1;
    }

    public final void setSelected(@NotNull String content) {
        int i = 0;
        for (Object obj : this.dataList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(content, (String) obj)) {
                setSelectedPos(i);
            }
            i = i2;
        }
    }

    public final void setSymbol(@NotNull String str) {
        this.symbol = str;
    }

    public final void setUnSelectTextColor(int i) {
        this.unSelectTextColor = i;
    }

    public PickerView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dataList = new ArrayList();
        this.paint = LazyKt__LazyJVMKt.lazy(e.a);
        this.symbolPaint = LazyKt__LazyJVMKt.lazy(new f());
        this.linePaint = LazyKt__LazyJVMKt.lazy(new d());
        this.selectTextSize = ResourceHelper.INSTANCE.spToPx(18.0f);
        this.selectTextColor = ExtKt.getResColor(getContext(), R.color.fh_btn_main_color);
        this.unSelectTextColor = ExtKt.getResColor(getContext(), R.color.fh_black_33);
        this.symbol = "";
        this.timer = new Timer();
        this.updateHandler = new b(this);
        this.t = VelocityTracker.obtain();
        f();
    }
}
