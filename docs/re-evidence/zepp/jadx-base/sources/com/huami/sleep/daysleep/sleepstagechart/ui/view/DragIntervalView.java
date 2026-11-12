package com.huami.sleep.daysleep.sleepstagechart.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.ui.view.DragIntervalView;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B.\b\u0007\u0012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001\u0012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001\u0012\t\b\u0002\u0010\u0086\u0001\u001a\u00020U¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J4\u0010\f\u001a\u001e\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J \u0010 \u001a\u00020\u000f2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u001eR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010%R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010%R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010%R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010%R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R*\u0010C\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010%R%\u0010K\u001a\n \u000b*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR%\u0010N\u001a\n \u000b*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010JR%\u0010Q\u001a\n \u000b*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010JR%\u0010T\u001a\n \u000b*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010JR*\u0010]\u001a\u00020U2\u0006\u0010V\u001a\u00020U8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R*\u0010a\u001a\u00020U2\u0006\u0010V\u001a\u00020U8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R*\u0010e\u001a\u00020U2\u0006\u0010V\u001a\u00020U8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010X\u001a\u0004\bc\u0010Z\"\u0004\bd\u0010\\R*\u0010i\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010%\u001a\u0004\bg\u0010'\"\u0004\bh\u0010)R\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020j8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010q\u001a\u00020j8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010lR$\u0010t\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\br\u0010%\"\u0004\bs\u0010)R\u0016\u0010v\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010%R\u0016\u0010x\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010%R\u0016\u0010z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010%R\u0016\u0010|\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010%R\u0016\u0010~\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010%R\u0016\u0010\u007f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010%R\u0018\u0010\u0081\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010X¨\u0006\u0089\u0001"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/DragIntervalView;", "Landroid/view/View;", "", "fingerPosition", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SelectLineState;", "e", "Landroid/util/Pair;", "c", GoogleApiAvailabilityLight.a, "originLeftValue", "originRightValue", "kotlin.jvm.PlatformType", "b", "left", "right", "", "initStartEndValue", "showDefault", "min", "max", "setXAxisMinMaxValue", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "ev", "dispatchTouchEvent", "Lkotlin/Function2;", "callback", "setDragCallback", "", "a", "Ljava/lang/String;", "mTag", "F", "getMActiveInterval", "()F", "setMActiveInterval", "(F)V", "mActiveInterval", "mLeftLinePosition", "mRightLinePosition", "Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SelectLineState;", "mSelectState", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "srcRect", "g", "dstRect", "h", "xAxisMaxValue", "i", "xAxisMinValue", z.j, "xIntervalRightValue", hl.k, "xIntervalLeftValue", "Landroid/graphics/Matrix;", "l", "Landroid/graphics/Matrix;", "rotateMatrix", "m", "Lkotlin/jvm/functions/Function2;", "mDragCallback", GoogleApiAvailabilityLight.b, "drawPadding", "Landroid/graphics/Bitmap;", "o", "Lkotlin/Lazy;", "getLtBitmap", "()Landroid/graphics/Bitmap;", "ltBitmap", com.google.android.exoplayer2.text.ttml.b.r, "getLbBitmap", "lbBitmap", DTransferConstants.SEARCH_KEY, "getRtBitmap", "rtBitmap", "r", "getRbBitmap", "rbBitmap", "", "value", SOAP.XMLNS, LogUtil.I, "getMSelectedColor", "()I", "setMSelectedColor", "(I)V", "mSelectedColor", "t", "getMUnSelectedColor", "setMUnSelectedColor", "mUnSelectedColor", "u", "getBoundaryLineColor", "setBoundaryLineColor", "boundaryLineColor", "v", "getBoundaryWidth", "setBoundaryWidth", "boundaryWidth", "Landroid/graphics/Paint;", "w", "Landroid/graphics/Paint;", "linePaint", "x", "picPaint", "y", "intervalPaint", "z", "setPicHeight", "picHeight", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "lastX", "B", "lastY", "C", "xDistance", LogUtil.D, "yDistance", "E", "xLast", "yLast", "G", "scaledTouchSlop", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DragIntervalView extends View {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float lastX;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private float lastY;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float xDistance;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float yDistance;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private float xLast;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float yLast;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int scaledTouchSlop;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float mActiveInterval;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mLeftLinePosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mRightLinePosition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private SelectLineState mSelectState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Rect srcRect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Rect dstRect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float xAxisMaxValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float xAxisMinValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float xIntervalRightValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float xIntervalLeftValue;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Matrix rotateMatrix;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Float, ? super Float, Unit> mDragCallback;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float drawPadding;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy ltBitmap;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy lbBitmap;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy rtBitmap;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy rbBitmap;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int mSelectedColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int mUnSelectedColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int boundaryLineColor;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float boundaryWidth;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Paint linePaint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Paint picPaint;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Paint intervalPaint;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private float picHeight;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectLineState.values().length];
            iArr[SelectLineState.LEFT.ordinal()] = 1;
            iArr[SelectLineState.RIGHT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Bitmap> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap ltBitmap = DragIntervalView.this.getLtBitmap();
            int width = DragIntervalView.this.getLtBitmap().getWidth();
            int height = DragIntervalView.this.getLtBitmap().getHeight();
            Matrix matrix = DragIntervalView.this.rotateMatrix;
            matrix.setRotate(270.0f);
            Unit unit = Unit.INSTANCE;
            return Bitmap.createBitmap(ltBitmap, 0, 0, width, height, matrix, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Bitmap> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            return BitmapFactory.decodeResource(this.a.getResources(), R.drawable.slp_icon_drag);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Bitmap> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap ltBitmap = DragIntervalView.this.getLtBitmap();
            int width = DragIntervalView.this.getLtBitmap().getWidth();
            int height = DragIntervalView.this.getLtBitmap().getHeight();
            Matrix matrix = DragIntervalView.this.rotateMatrix;
            matrix.setRotate(180.0f);
            Unit unit = Unit.INSTANCE;
            return Bitmap.createBitmap(ltBitmap, 0, 0, width, height, matrix, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Bitmap> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap ltBitmap = DragIntervalView.this.getLtBitmap();
            int width = DragIntervalView.this.getLtBitmap().getWidth();
            int height = DragIntervalView.this.getLtBitmap().getHeight();
            Matrix matrix = DragIntervalView.this.rotateMatrix;
            matrix.setRotate(90.0f);
            Unit unit = Unit.INSTANCE;
            return Bitmap.createBitmap(ltBitmap, 0, 0, width, height, matrix, true);
        }
    }

    @JvmOverloads
    public DragIntervalView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public DragIntervalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DragIntervalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Pair<Float, Float> b(float originLeftValue, float originRightValue) {
        return ViewUtils.isRTL() ? new Pair<>(Float.valueOf(getWidth() - originRightValue), Float.valueOf(getWidth() - originLeftValue)) : new Pair<>(Float.valueOf(originLeftValue), Float.valueOf(originRightValue));
    }

    private final Pair<Float, Float> c() {
        HMLog.i(this.mTag, "最新值最小值： " + this.xAxisMinValue + " " + this.xAxisMaxValue + "  ", new Object[0]);
        float f = this.xAxisMaxValue - this.xAxisMinValue;
        HMLog.i(this.mTag, "选中的区间起始值： " + this.mLeftLinePosition + "  " + this.mRightLinePosition + "  ", new Object[0]);
        float width = ViewUtils.isRTL() ? this.xAxisMaxValue - (((this.mLeftLinePosition - this.drawPadding) / (getWidth() - (this.drawPadding * 2))) * f) : (((this.mLeftLinePosition - this.drawPadding) / (getWidth() - (this.drawPadding * 2))) * f) + this.xAxisMinValue;
        float width2 = ViewUtils.isRTL() ? this.xAxisMaxValue - (((this.mRightLinePosition - this.drawPadding) / (getWidth() - (this.drawPadding * 2))) * f) : (((this.mRightLinePosition - this.drawPadding) / (getWidth() - (this.drawPadding * 2))) * f) + this.xAxisMinValue;
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(Math.min(width, width2)), Float.valueOf(Math.max(width, width2)));
        HMLog.i(this.mTag, "选中的时间： " + pair + "   ", new Object[0]);
        return pair;
    }

    private final Pair<Float, Float> d() {
        float width = getWidth();
        float f = this.drawPadding;
        float f2 = width - (2 * f);
        float f3 = this.xAxisMaxValue;
        float f4 = this.xAxisMinValue;
        float f5 = f3 - f4;
        float f6 = (((this.xIntervalLeftValue - f4) / f5) * f2) + f;
        float f7 = (((this.xIntervalRightValue - f4) / f5) * f2) + f;
        HMLog.i(this.mTag, f6 + "    " + f7 + "  drawPadding:  " + f, new Object[0]);
        return b(f6, f7);
    }

    private final SelectLineState e(float fingerPosition) {
        if (this.mRightLinePosition <= getWidth() / 2.0f) {
            float f = this.mRightLinePosition;
            float f2 = this.mActiveInterval;
            if (fingerPosition <= f + f2 && fingerPosition >= f - f2) {
                return SelectLineState.RIGHT;
            }
            float f3 = this.mLeftLinePosition;
            return (fingerPosition > f3 + f2 || fingerPosition < f3 - f2) ? SelectLineState.NONE : SelectLineState.LEFT;
        }
        float f4 = this.mLeftLinePosition;
        float f5 = this.mActiveInterval;
        if (fingerPosition <= f4 + f5 && fingerPosition >= f4 - f5) {
            return SelectLineState.LEFT;
        }
        float f6 = this.mRightLinePosition;
        return (fingerPosition > f6 + f5 || fingerPosition < f6 - f5) ? SelectLineState.NONE : SelectLineState.RIGHT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(DragIntervalView dragIntervalView) {
        Pair<Float, Float> pairD = dragIntervalView.d();
        dragIntervalView.mLeftLinePosition = ((Number) pairD.first).floatValue();
        dragIntervalView.mRightLinePosition = ((Number) pairD.second).floatValue();
        dragIntervalView.invalidate();
        Function2<? super Float, ? super Float, Unit> function2 = dragIntervalView.mDragCallback;
        if (function2 == null) {
            return;
        }
        function2.invoke(Float.valueOf(dragIntervalView.xIntervalLeftValue), Float.valueOf(dragIntervalView.xIntervalRightValue));
    }

    private final Bitmap getLbBitmap() {
        return (Bitmap) this.lbBitmap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getLtBitmap() {
        return (Bitmap) this.ltBitmap.getValue();
    }

    private final Bitmap getRbBitmap() {
        return (Bitmap) this.rbBitmap.getValue();
    }

    private final Bitmap getRtBitmap() {
        return (Bitmap) this.rtBitmap.getValue();
    }

    private final void setPicHeight(float f) {
        this.picHeight = f;
        invalidate();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            this.xDistance = 0.0f;
            this.yDistance = 0.0f;
            this.xLast = ev.getX();
            this.yLast = ev.getY();
        } else if (action == 2) {
            float x = ev.getX();
            float y = ev.getY();
            this.xDistance += Math.abs(x - this.xLast);
            this.yDistance += Math.abs(y - this.yLast);
            this.xLast = x;
            this.yLast = y;
        }
        float f = this.xDistance;
        float f2 = this.yDistance;
        getParent().requestDisallowInterceptTouchEvent(f >= f2 || f2 < ((float) this.scaledTouchSlop));
        return super.dispatchTouchEvent(ev);
    }

    public final int getBoundaryLineColor() {
        return this.boundaryLineColor;
    }

    public final float getBoundaryWidth() {
        return this.boundaryWidth;
    }

    public final float getMActiveInterval() {
        return this.mActiveInterval;
    }

    public final int getMSelectedColor() {
        return this.mSelectedColor;
    }

    public final int getMUnSelectedColor() {
        return this.mUnSelectedColor;
    }

    public final void initStartEndValue(float left, float right) {
        this.xIntervalLeftValue = left;
        this.xIntervalRightValue = right;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (Math.abs(this.xAxisMaxValue - 0) < 1.0E-6d) {
            this.xAxisMaxValue = getMeasuredWidth();
        }
        this.intervalPaint.setColor(getMSelectedColor());
        this.dstRect.set((int) this.mLeftLinePosition, (int) this.picHeight, (int) this.mRightLinePosition, (int) (getMeasuredHeight() - this.picHeight));
        if (canvas != null) {
            canvas.drawRect(this.dstRect, this.intervalPaint);
        }
        this.intervalPaint.setColor(getMUnSelectedColor());
        this.dstRect.set(0, (int) this.picHeight, (int) this.mLeftLinePosition, (int) (getMeasuredHeight() - this.picHeight));
        if (canvas != null) {
            canvas.drawRect(this.dstRect, this.intervalPaint);
        }
        this.dstRect.set((int) this.mRightLinePosition, (int) this.picHeight, getMeasuredWidth(), (int) (getMeasuredHeight() - this.picHeight));
        if (canvas != null) {
            canvas.drawRect(this.dstRect, this.intervalPaint);
        }
        this.linePaint.setColor(this.boundaryLineColor);
        if (canvas != null) {
            float f = this.mLeftLinePosition;
            canvas.drawLine(f, this.picHeight, f, getMeasuredHeight() - this.picHeight, this.linePaint);
        }
        if (canvas != null) {
            float f2 = this.mRightLinePosition;
            canvas.drawLine(f2, this.picHeight, f2, getMeasuredHeight() - this.picHeight, this.linePaint);
        }
        this.srcRect.set(0, 0, getLtBitmap().getWidth(), getLtBitmap().getHeight());
        Rect rect = this.dstRect;
        float f3 = this.mLeftLinePosition;
        float f4 = this.picHeight;
        rect.set((int) (f3 - f4), 0, (int) f3, (int) f4);
        if (canvas != null) {
            canvas.drawBitmap(getLtBitmap(), this.srcRect, this.dstRect, this.picPaint);
        }
        this.dstRect.set((int) (this.mLeftLinePosition - this.picHeight), (int) (getMeasuredHeight() - this.picHeight), (int) this.mLeftLinePosition, getMeasuredHeight());
        if (canvas != null) {
            canvas.drawBitmap(getLbBitmap(), this.srcRect, this.dstRect, this.picPaint);
        }
        Rect rect2 = this.dstRect;
        float f5 = this.mRightLinePosition;
        float f6 = this.picHeight;
        rect2.set((int) f5, 0, (int) (f5 + f6), (int) f6);
        if (canvas != null) {
            canvas.drawBitmap(getRtBitmap(), this.srcRect, this.dstRect, this.picPaint);
        }
        Rect rect3 = this.dstRect;
        int i = (int) this.mRightLinePosition;
        float measuredHeight = getMeasuredHeight();
        float f7 = this.picHeight;
        rect3.set(i, (int) (measuredHeight - f7), (int) (this.mRightLinePosition + f7), getMeasuredHeight());
        if (canvas == null) {
            return;
        }
        canvas.drawBitmap(getRbBitmap(), this.srcRect, this.dstRect, this.picPaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        int action = event.getAction();
        if (action == 0) {
            this.lastX = x;
            this.lastY = y;
            this.mSelectState = e(x);
        } else if (action == 1) {
            this.lastX = x;
            this.lastY = y;
            Pair<Float, Float> pairC = c();
            Function2<? super Float, ? super Float, Unit> function2 = this.mDragCallback;
            if (function2 != null) {
                function2.invoke(pairC.first, pairC.second);
            }
        } else if (action == 2) {
            float f = x - this.lastX;
            int i = WhenMappings.$EnumSwitchMapping$0[this.mSelectState.ordinal()];
            if (i == 1) {
                float f2 = this.mLeftLinePosition;
                float f3 = f + f2;
                float f4 = this.mRightLinePosition;
                if (f3 < f4) {
                    float f5 = f + f2;
                    f4 = this.drawPadding;
                    if (f5 >= f4) {
                        f4 = f + f2;
                    }
                }
                this.mLeftLinePosition = f4;
                invalidate();
            } else if (i == 2) {
                HMLog.v(this.mTag, this.mLeftLinePosition + "   " + this.mRightLinePosition, new Object[0]);
                float f6 = this.mRightLinePosition;
                float f7 = f + f6;
                float width = this.mLeftLinePosition;
                if (f7 > width) {
                    width = f6 + f > ((float) getWidth()) - this.drawPadding ? getWidth() - this.drawPadding : f + this.mRightLinePosition;
                }
                this.mRightLinePosition = width;
                invalidate();
            }
            this.lastX = x;
            this.lastY = y;
        }
        return true;
    }

    public final void setBoundaryLineColor(int i) {
        this.boundaryLineColor = i;
        invalidate();
    }

    public final void setBoundaryWidth(float f) {
        this.boundaryWidth = f;
        invalidate();
    }

    public final void setDragCallback(@NotNull Function2<? super Float, ? super Float, Unit> callback) {
        this.mDragCallback = callback;
    }

    public final void setMActiveInterval(float f) {
        this.mActiveInterval = f;
    }

    public final void setMSelectedColor(int i) {
        this.mSelectedColor = i;
        invalidate();
    }

    public final void setMUnSelectedColor(int i) {
        this.mUnSelectedColor = i;
        invalidate();
    }

    public final void setXAxisMinMaxValue(float min, float max) {
        this.xAxisMaxValue = max;
        this.xAxisMinValue = min;
    }

    public final void showDefault() {
        postDelayed(new Runnable() { // from class: yc1
            @Override // java.lang.Runnable
            public final void run() {
                DragIntervalView.f(this.a);
            }
        }, 0L);
    }

    @JvmOverloads
    public DragIntervalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTag = "DragSelectView";
        this.mActiveInterval = ViewUtils.dp2px(context, 20.0f);
        this.mSelectState = SelectLineState.NONE;
        this.srcRect = new Rect(0, 0, 0, 0);
        this.dstRect = new Rect(0, 0, 0, 0);
        this.rotateMatrix = new Matrix();
        this.ltBitmap = LazyKt__LazyJVMKt.lazy(new b(context));
        this.lbBitmap = LazyKt__LazyJVMKt.lazy(new a());
        this.rtBitmap = LazyKt__LazyJVMKt.lazy(new d());
        this.rbBitmap = LazyKt__LazyJVMKt.lazy(new c());
        int i2 = R.color.p3;
        this.mSelectedColor = ViewExKt.addAlpha(ContextCompat.getColor(context, i2), 0.1d);
        this.mUnSelectedColor = ViewExKt.addAlpha(ContextCompat.getColor(context, R.color.s5), 0.3d);
        this.boundaryLineColor = ContextCompat.getColor(context, i2);
        this.boundaryWidth = ViewUtils.dp2px(context, 2.0f);
        Paint paint = new Paint();
        paint.setColor(getBoundaryLineColor());
        paint.setStrokeWidth(getBoundaryWidth());
        invalidate();
        Unit unit = Unit.INSTANCE;
        this.linePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        this.picPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(getMSelectedColor());
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setStrokeWidth(5.0f);
        this.intervalPaint = paint3;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DragIntervalView);
        this.xAxisMaxValue = typedArrayObtainStyledAttributes.getFloat(R.styleable.DragIntervalView_dv_maxValue, 0.0f);
        this.xAxisMinValue = typedArrayObtainStyledAttributes.getFloat(R.styleable.DragIntervalView_dv_minValue, 0.0f);
        this.xIntervalRightValue = typedArrayObtainStyledAttributes.getFloat(R.styleable.DragIntervalView_dv_defaultMax, 0.0f);
        this.xIntervalLeftValue = typedArrayObtainStyledAttributes.getFloat(R.styleable.DragIntervalView_dv_defaultMin, 0.0f);
        this.drawPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.DragIntervalView_dv_drawPadding, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.picHeight = ViewUtils.dp2px(context, 10.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
