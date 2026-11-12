package com.xiaomi.hm.health.healthtag.ui.view;

import android.annotation.SuppressLint;
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
import com.huami.lib.view.ViewUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.healthtag.ui.view.DragIntervalView;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u008e\u00012\u00020\u0001:\u0004\u008e\u0001\u008f\u0001B.\b\u0007\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001\u0012\f\b\u0002\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001\u0012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u0011¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0014J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J \u0010 \u001a\u00020\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u001eR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010%R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010%R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010%R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010%R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R*\u0010D\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010%R\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010%R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010%R\u0016\u0010L\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010%R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010%R%\u0010U\u001a\n P*\u0004\u0018\u00010O0O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR%\u0010X\u001a\n P*\u0004\u0018\u00010O0O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010TR%\u0010[\u001a\n P*\u0004\u0018\u00010O0O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010TR%\u0010^\u001a\n P*\u0004\u0018\u00010O0O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010R\u001a\u0004\b]\u0010TR*\u0010f\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010j\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010a\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR*\u0010n\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010a\u001a\u0004\bl\u0010c\"\u0004\bm\u0010eR*\u0010r\u001a\u00020\u00022\u0006\u0010_\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010%\u001a\u0004\bp\u0010'\"\u0004\bq\u0010)R\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010x\u001a\u00020s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR\u0016\u0010z\u001a\u00020s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010uR\u0016\u0010|\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010%R\u0016\u0010~\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010%R\u0016\u0010\u007f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010%R\u0018\u0010\u0081\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010%R\u0018\u0010\u0083\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010%R\u0017\u0010\u0084\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010%R\u0018\u0010\u0086\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010a¨\u0006\u0090\u0001"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/DragIntervalView;", "Landroid/view/View;", "", "fingerPosition", "Lcom/xiaomi/hm/health/healthtag/ui/view/DragIntervalView$SelectLineState;", GoogleApiAvailabilityLight.a, "Landroid/util/Pair;", "b", "c", "left", "right", "", "initStartEndValue", "showDefault", "min", "max", "setXAxisMinMaxValue", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "ev", "dispatchTouchEvent", "Lkotlin/Function2;", "callback", "setDragCallback", "", "a", "Ljava/lang/String;", "mTag", "F", "getMActiveInterval", "()F", "setMActiveInterval", "(F)V", "mActiveInterval", "mLeftLinePosition", "mRightLinePosition", "e", "Lcom/xiaomi/hm/health/healthtag/ui/view/DragIntervalView$SelectLineState;", "mSelectState", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "srcRect", "g", "dstRect", "h", "xAxisMaxValue", "i", "xAxisMinValue", z.j, "xIntervalRightValue", hl.k, "xIntervalLeftValue", "Landroid/graphics/Matrix;", "l", "Landroid/graphics/Matrix;", "rotateMatrix", "m", "Lkotlin/jvm/functions/Function2;", "mDragCallback", GoogleApiAvailabilityLight.b, "drawRightPadding", "o", "drawLeftPadding", com.google.android.exoplayer2.text.ttml.b.r, "drawBottomPadding", DTransferConstants.SEARCH_KEY, "drawTopPadding", "r", "mDragIntervalHeight", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", SOAP.XMLNS, "Lkotlin/Lazy;", "getLtBitmap", "()Landroid/graphics/Bitmap;", "ltBitmap", "t", "getLbBitmap", "lbBitmap", "u", "getRtBitmap", "rtBitmap", "v", "getRbBitmap", "rbBitmap", "value", "w", LogUtil.I, "getMSelectedColor", "()I", "setMSelectedColor", "(I)V", "mSelectedColor", "x", "getMUnSelectedColor", "setMUnSelectedColor", "mUnSelectedColor", "y", "getBoundaryLineColor", "setBoundaryLineColor", "boundaryLineColor", "z", "getBoundaryWidth", "setBoundaryWidth", "boundaryWidth", "Landroid/graphics/Paint;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/graphics/Paint;", "linePaint", "B", "picPaint", "C", "intervalPaint", LogUtil.D, "lastX", "E", "lastY", "xDistance", "G", "yDistance", "H", "xLast", "yLast", "J", "scaledTouchSlop", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "SelectLineState", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DragIntervalView extends View {
    private static final double K = 0.2d;
    private static final double L = 0.8d;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Paint linePaint;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Paint picPaint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Paint intervalPaint;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float lastX;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private float lastY;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float xDistance;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float yDistance;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private float xLast;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private float yLast;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
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
    private float drawRightPadding;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float drawLeftPadding;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float drawBottomPadding;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float drawTopPadding;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float mDragIntervalHeight;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy ltBitmap;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy lbBitmap;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy rtBitmap;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy rbBitmap;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int mSelectedColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int mUnSelectedColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int boundaryLineColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private float boundaryWidth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/DragIntervalView$SelectLineState;", "", "<init>", "(Ljava/lang/String;I)V", "RIGHT", "LEFT", NoticesEntity.LOOP_TYPE_NONE, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public enum SelectLineState {
        RIGHT,
        LEFT,
        NONE
    }

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "最新值最小值： " + DragIntervalView.this.xAxisMinValue + " " + DragIntervalView.this.xAxisMaxValue + "  ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "选中的区间起始值： " + DragIntervalView.this.mLeftLinePosition + "  " + DragIntervalView.this.mRightLinePosition + "  ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<Float, Float> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Pair<Float, Float> pair) {
            super(0);
            this.a = pair;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "选中的时间： " + this.a + "   ";
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
            matrix.setRotate(270.0f);
            Unit unit = Unit.INSTANCE;
            return Bitmap.createBitmap(ltBitmap, 0, 0, width, height, matrix, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Bitmap> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            return BitmapFactory.decodeResource(this.a.getResources(), R.drawable.slp_icon_drag);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return DragIntervalView.this.mLeftLinePosition + "   " + DragIntervalView.this.mRightLinePosition;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Bitmap> {
        public g() {
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
    public static final class h extends Lambda implements Function0<Bitmap> {
        public h() {
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

    private final Pair<Float, Float> b() {
        HMLog.info(this.mTag, new a());
        float f2 = this.xAxisMaxValue - this.xAxisMinValue;
        HMLog.info(this.mTag, new b());
        float width = getWidth() - this.drawRightPadding;
        float f3 = this.drawLeftPadding;
        float f4 = width - f3;
        float f5 = ((this.mLeftLinePosition - f3) / f4) * f2;
        float f6 = this.xAxisMinValue;
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(f5 + f6), Float.valueOf((((this.mRightLinePosition - f3) / f4) * f2) + f6));
        HMLog.info(this.mTag, new c(pair));
        return pair;
    }

    private final Pair<Float, Float> c() {
        float width = getWidth();
        float f2 = this.drawLeftPadding;
        float f3 = (width - f2) - this.drawRightPadding;
        float f4 = this.xAxisMaxValue;
        float f5 = this.xAxisMinValue;
        float f6 = f4 - f5;
        return new Pair<>(Float.valueOf((((this.xIntervalLeftValue - f5) / f6) * f3) + f2), Float.valueOf((((this.xIntervalRightValue - f5) / f6) * f3) + f2));
    }

    private final SelectLineState d(float fingerPosition) {
        if (this.mRightLinePosition <= getWidth() / 2.0f) {
            float f2 = this.mRightLinePosition;
            float f3 = this.mActiveInterval;
            if (fingerPosition <= f2 + f3 && fingerPosition >= f2 - f3) {
                return SelectLineState.RIGHT;
            }
            float f4 = this.mLeftLinePosition;
            return (fingerPosition > f4 + f3 || fingerPosition < f4 - f3) ? SelectLineState.NONE : SelectLineState.LEFT;
        }
        float f5 = this.mLeftLinePosition;
        float f6 = this.mActiveInterval;
        if (fingerPosition <= f5 + f6 && fingerPosition >= f5 - f6) {
            return SelectLineState.LEFT;
        }
        float f7 = this.mRightLinePosition;
        return (fingerPosition > f7 + f6 || fingerPosition < f7 - f6) ? SelectLineState.NONE : SelectLineState.RIGHT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DragIntervalView dragIntervalView) {
        Pair<Float, Float> pairC = dragIntervalView.c();
        dragIntervalView.mLeftLinePosition = ((Number) pairC.first).floatValue();
        dragIntervalView.mRightLinePosition = ((Number) pairC.second).floatValue();
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
        float f2 = this.xDistance;
        float f3 = this.yDistance;
        getParent().requestDisallowInterceptTouchEvent(f2 >= f3 || f3 < ((float) this.scaledTouchSlop));
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
        this.intervalPaint.setColor(getMSelectedColor());
        this.dstRect.set((int) this.mLeftLinePosition, (int) this.drawTopPadding, (int) this.mRightLinePosition, (int) (getMeasuredHeight() - this.drawBottomPadding));
        if (canvas != null) {
            canvas.drawRect(this.dstRect, this.intervalPaint);
        }
        this.intervalPaint.setColor(getMUnSelectedColor());
        this.dstRect.set(0, (int) this.drawTopPadding, (int) this.mLeftLinePosition, (int) (getMeasuredHeight() - this.drawBottomPadding));
        if (canvas != null) {
            canvas.drawRect(this.dstRect, this.intervalPaint);
        }
        this.dstRect.set((int) this.mRightLinePosition, (int) this.drawTopPadding, getMeasuredWidth(), (int) (getMeasuredHeight() - this.drawBottomPadding));
        if (canvas != null) {
            canvas.drawRect(this.dstRect, this.intervalPaint);
        }
        this.linePaint.setColor(this.boundaryLineColor);
        if (canvas != null) {
            float f2 = this.mLeftLinePosition;
            canvas.drawLine(f2, this.drawTopPadding, f2, getMeasuredHeight() - this.drawBottomPadding, this.linePaint);
        }
        if (canvas != null) {
            float f3 = this.mRightLinePosition;
            canvas.drawLine(f3, this.drawTopPadding, f3, getMeasuredHeight() - this.drawBottomPadding, this.linePaint);
        }
        this.srcRect.set(0, 0, getLtBitmap().getWidth(), getLtBitmap().getHeight());
        this.dstRect.set((int) (this.mLeftLinePosition - getLtBitmap().getWidth()), (int) (this.drawTopPadding - getLtBitmap().getHeight()), (int) this.mLeftLinePosition, (int) this.drawTopPadding);
        if (canvas != null) {
            canvas.drawBitmap(getLtBitmap(), this.srcRect, this.dstRect, this.picPaint);
        }
        this.srcRect.set(0, 0, getLbBitmap().getWidth(), getLbBitmap().getHeight());
        this.dstRect.set((int) (this.mLeftLinePosition - getLtBitmap().getWidth()), (int) (getMeasuredHeight() - this.drawBottomPadding), (int) this.mLeftLinePosition, (int) ((getMeasuredHeight() - this.drawBottomPadding) + getLbBitmap().getHeight()));
        if (canvas != null) {
            canvas.drawBitmap(getLbBitmap(), this.srcRect, this.dstRect, this.picPaint);
        }
        this.dstRect.set((int) this.mRightLinePosition, (int) (this.drawTopPadding - getLtBitmap().getHeight()), (int) (this.mRightLinePosition + getRtBitmap().getWidth()), (int) this.drawTopPadding);
        if (canvas != null) {
            canvas.drawBitmap(getRtBitmap(), this.srcRect, this.dstRect, this.picPaint);
        }
        this.dstRect.set((int) this.mRightLinePosition, (int) (getMeasuredHeight() - this.drawBottomPadding), (int) (this.mRightLinePosition + getRtBitmap().getWidth()), (int) ((getMeasuredHeight() - this.drawBottomPadding) + getRbBitmap().getHeight()));
        if (canvas == null) {
            return;
        }
        canvas.drawBitmap(getRbBitmap(), this.srcRect, this.dstRect, this.picPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.resolveSize((int) (this.drawTopPadding + this.drawBottomPadding + this.mDragIntervalHeight), heightMeasureSpec));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (event != null) {
            float x = event.getX();
            float y = event.getY();
            int action = event.getAction();
            if (action == 0) {
                this.lastX = x;
                this.lastY = y;
                this.mSelectState = d(x);
            } else if (action == 1) {
                this.lastX = x;
                this.lastY = y;
                Pair<Float, Float> pairB = b();
                Function2<? super Float, ? super Float, Unit> function2 = this.mDragCallback;
                if (function2 != null) {
                    function2.invoke(pairB.first, pairB.second);
                }
            } else if (action == 2) {
                float f2 = x - this.lastX;
                int i = WhenMappings.$EnumSwitchMapping$0[this.mSelectState.ordinal()];
                if (i == 1) {
                    float f3 = this.mLeftLinePosition;
                    float f4 = f2 + f3;
                    float f5 = this.mRightLinePosition;
                    if (f4 < f5) {
                        float f6 = f2 + f3;
                        f5 = this.drawLeftPadding;
                        if (f6 >= f5) {
                            f5 = f2 + f3;
                        }
                    }
                    this.mLeftLinePosition = f5;
                    invalidate();
                } else if (i == 2) {
                    HMLog.verbose(this.mTag, new f());
                    float f7 = this.mRightLinePosition;
                    float f8 = f2 + f7;
                    float width = this.mLeftLinePosition;
                    if (f8 > width) {
                        width = f7 + f2 > ((float) getWidth()) - this.drawRightPadding ? getWidth() - this.drawRightPadding : f2 + this.mRightLinePosition;
                    }
                    this.mRightLinePosition = width;
                    invalidate();
                }
                this.lastX = x;
                this.lastY = y;
            }
        }
        return true;
    }

    public final void setBoundaryLineColor(int i) {
        this.boundaryLineColor = i;
        invalidate();
    }

    public final void setBoundaryWidth(float f2) {
        this.boundaryWidth = f2;
        invalidate();
    }

    public final void setDragCallback(@NotNull Function2<? super Float, ? super Float, Unit> callback) {
        this.mDragCallback = callback;
    }

    public final void setMActiveInterval(float f2) {
        this.mActiveInterval = f2;
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
        postDelayed(new Runnable() { // from class: zc1
            @Override // java.lang.Runnable
            public final void run() {
                DragIntervalView.e(this.a);
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
        this.ltBitmap = LazyKt__LazyJVMKt.lazy(new e(context));
        this.lbBitmap = LazyKt__LazyJVMKt.lazy(new d());
        this.rtBitmap = LazyKt__LazyJVMKt.lazy(new h());
        this.rbBitmap = LazyKt__LazyJVMKt.lazy(new g());
        this.mSelectedColor = NumberExtKt.addAlpha(ContextCompat.getColor(context, R.color.s53), 0.2d);
        this.mUnSelectedColor = NumberExtKt.addAlpha(ContextCompat.getColor(context, R.color.s39), L);
        this.boundaryLineColor = ContextCompat.getColor(context, R.color.p3);
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
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.xiaomi.hm.health.R.styleable.TagDragIntervalView);
        this.xAxisMaxValue = typedArrayObtainStyledAttributes.getFloat(5, 0.0f);
        this.xAxisMinValue = typedArrayObtainStyledAttributes.getFloat(6, 0.0f);
        this.xIntervalRightValue = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
        this.xIntervalLeftValue = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.drawRightPadding = typedArrayObtainStyledAttributes.getDimension(7, getRbBitmap().getWidth());
        this.drawLeftPadding = typedArrayObtainStyledAttributes.getDimension(4, getRbBitmap().getWidth());
        this.drawBottomPadding = typedArrayObtainStyledAttributes.getDimension(0, getLbBitmap().getHeight());
        this.drawTopPadding = typedArrayObtainStyledAttributes.getDimension(8, getLtBitmap().getHeight());
        this.mDragIntervalHeight = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
