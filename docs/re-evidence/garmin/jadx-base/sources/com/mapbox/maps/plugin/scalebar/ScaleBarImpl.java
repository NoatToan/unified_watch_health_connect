package com.mapbox.maps.plugin.scalebar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsKt;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import o13.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 w2\u00020\u00012\u00020\u0002:\u0002wxB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJY\u0010(\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00120\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u0001¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u00101\u001a\u00020.2\u0006\u0010-\u001a\u00020\nH\u0001¢\u0006\u0004\b/\u00100J/\u00105\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0013H\u0002¢\u0006\u0004\b5\u00106JQ\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130:2\u0006\u00102\u001a\u00020\"2\u0006\u00107\u001a\u00020\u00132\u0006\u00109\u001a\u0002082\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010=\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b=\u0010>R4\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00120\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010 \u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010D\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u001a\u0010I\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010Q\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u00138\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010W\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010R\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR*\u0010Z\u001a\u00020.2\u0006\u0010P\u001a\u00020.8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010[R\u0018\u0010g\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR*\u0010j\u001a\u00020i2\u0006\u0010P\u001a\u00020i8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR*\u0010\u001c\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u00138\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010R\u001a\u0004\br\u0010T\"\u0004\bs\u0010VR$\u0010v\u001a\u00020.2\u0006\u0010P\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010]\"\u0004\bu\u0010_¨\u0006y"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl;", "Lcom/mapbox/maps/plugin/scalebar/ScaleBar;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/util/Pair;", "", "calculateWidthAndHeight$plugin_scalebar_release", "()Landroid/util/Pair;", "calculateWidthAndHeight", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "maxDistance", "distancePerPixel", "", "scaleTable", "Landroid/graphics/Paint;", "textPaint", "strokeWidth", "", "unit", "rightMarginPx", "Lcom/mapbox/maps/plugin/scalebar/SegmentsConfiguration;", "calculateSegmentsConfiguration$plugin_scalebar_release", "(FFLjava/util/List;Landroid/graphics/Paint;FLjava/lang/String;I)Lcom/mapbox/maps/plugin/scalebar/SegmentsConfiguration;", "calculateSegmentsConfiguration", "distance", "getDistanceText$plugin_scalebar_release", "(FLjava/lang/String;)Ljava/lang/String;", "getDistanceText", "what", "", "refreshHandlerHasMessages$plugin_scalebar_release", "(I)Z", "refreshHandlerHasMessages", "text", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "drawText", "(Landroid/graphics/Canvas;Ljava/lang/String;FF)V", "anchorXPx", "Landroid/graphics/Paint$Align;", "alignment", "Lo13/u;", "calculateTextPositions", "(Ljava/lang/String;FLandroid/graphics/Paint$Align;Landroid/graphics/Paint;FI)Lo13/u;", "toOneDecimal", "(F)F", "Ljava/util/List;", "getScaleTable$plugin_scalebar_release", "()Ljava/util/List;", "setScaleTable$plugin_scalebar_release", "(Ljava/util/List;)V", "Landroid/graphics/Paint;", "getTextPaint$plugin_scalebar_release", "()Landroid/graphics/Paint;", "barPaint", "getBarPaint$plugin_scalebar_release", "strokePaint", "getStrokePaint$plugin_scalebar_release", "Ljava/lang/String;", "getUnit$plugin_scalebar_release", "()Ljava/lang/String;", "setUnit$plugin_scalebar_release", "(Ljava/lang/String;)V", "value", "mapViewWidth", "F", "getMapViewWidth", "()F", "setMapViewWidth", "(F)V", "pixelRatio", "getPixelRatio", "setPixelRatio", "useContinuousRendering", "Z", "getUseContinuousRendering", "()Z", "setUseContinuousRendering", "(Z)V", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl$RefreshHandler;", "refreshHandler", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl$RefreshHandler;", "Ljava/text/DecimalFormat;", "decimalFormat", "Ljava/text/DecimalFormat;", "isScaleBarVisible", "reusableCanvas", "Landroid/graphics/Canvas;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "settings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "setSettings", "(Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;)V", "currentSegmentsConfiguration", "Lcom/mapbox/maps/plugin/scalebar/SegmentsConfiguration;", "getDistancePerPixel", "setDistancePerPixel", "getEnable", "setEnable", "enable", "Companion", "RefreshHandler", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ScaleBarImpl extends View implements ScaleBar {
    public static final float DEFAULT_MAPVIEW_WIDTH = 0.0f;
    public static final float DEFAULT_PIXEL_RATIO = 1.0f;
    public static final int INTERNAL_PADDING_DP = 10;
    public static final int MSG_RENDER_CONTINUOUS = 1;
    public static final int MSG_RENDER_ON_DEMAND = 0;
    private final Paint barPaint;
    private SegmentsConfiguration currentSegmentsConfiguration;
    private final DecimalFormat decimalFormat;
    private float distancePerPixel;
    private boolean isScaleBarVisible;
    private float mapViewWidth;
    private float pixelRatio;
    private final RefreshHandler refreshHandler;
    private Canvas reusableCanvas;
    private List<? extends Pair<Integer, Integer>> scaleTable;
    private ScaleBarSettings settings;
    private final Paint strokePaint;
    private final Paint textPaint;
    private String unit;
    private boolean useContinuousRendering;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl$RefreshHandler;", "Landroid/os/Handler;", "scaleBarImpl", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl;", "(Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl;)V", "scaleBarWidgetWeakReference", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RefreshHandler extends Handler {
        private WeakReference<ScaleBarImpl> scaleBarWidgetWeakReference;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshHandler(ScaleBarImpl scaleBarImpl) {
            super(Looper.getMainLooper());
            scaleBarImpl.getClass();
            this.scaleBarWidgetWeakReference = new WeakReference<>(scaleBarImpl);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            msg.getClass();
            ScaleBarImpl scaleBarImpl = this.scaleBarWidgetWeakReference.get();
            if (scaleBarImpl != null) {
                int i14 = msg.what;
                if (i14 == 0) {
                    scaleBarImpl.invalidate();
                } else {
                    if (i14 != 1) {
                        return;
                    }
                    if (scaleBarImpl.reusableCanvas == null) {
                        scaleBarImpl.invalidate();
                    } else {
                        scaleBarImpl.draw(scaleBarImpl.reusableCanvas);
                    }
                    sendEmptyMessageDelayed(1, scaleBarImpl.getSettings().getRefreshInterval());
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Paint.Align.values().length];
            try {
                iArr[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paint.Align.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleBarImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.scaleTable = ScaleBarConstantKt.getMetricTable();
        Paint paint = new Paint();
        this.textPaint = paint;
        Paint paint2 = new Paint();
        this.barPaint = paint2;
        Paint paint3 = new Paint();
        this.strokePaint = paint3;
        this.unit = ScaleBarConstantKt.METER_UNIT;
        this.pixelRatio = 1.0f;
        this.decimalFormat = new DecimalFormat("0.#");
        this.settings = ScaleBarSettingsKt.ScaleBarSettings(ScaleBarImpl$settings$1.INSTANCE);
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint2.setAntiAlias(true);
        RefreshHandler refreshHandler = new RefreshHandler(this);
        if (getUseContinuousRendering()) {
            refreshHandler.sendEmptyMessage(1);
        }
        this.refreshHandler = refreshHandler;
    }

    private final u<Float, Float, Float> calculateTextPositions(String text, float anchorXPx, Paint.Align alignment, Paint textPaint, float strokeWidth, int rightMarginPx) {
        float f14;
        float fMeasureText = textPaint.measureText(text);
        float f15 = strokeWidth / 2.0f;
        float f16 = anchorXPx + f15;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i14 = iArr[alignment.ordinal()];
        if (i14 == 1) {
            f14 = fMeasureText;
        } else if (i14 == 2) {
            f14 = fMeasureText / 2;
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            f14 = 0.0f;
        }
        float f17 = f16 + f14;
        float f18 = rightMarginPx;
        if (f17 > f18) {
            anchorXPx -= f17 - f18;
        }
        float f19 = anchorXPx - f15;
        int i15 = iArr[alignment.ordinal()];
        if (i15 == 1) {
            fMeasureText = 0.0f;
        } else if (i15 == 2) {
            fMeasureText /= 2;
        } else if (i15 != 3) {
            u0.r();
            return null;
        }
        float f22 = f19 - fMeasureText;
        if (f22 < 0.0f) {
            float f24 = strokeWidth / 2;
            f22 += f24;
            anchorXPx += f24;
            f17 += f24;
        }
        return new u<>(Float.valueOf(toOneDecimal(f22)), Float.valueOf(toOneDecimal(f17)), Float.valueOf(toOneDecimal(anchorXPx)));
    }

    private final void drawText(Canvas canvas, String text, float x14, float y14) {
        if (getSettings().getShowTextBorder()) {
            canvas.drawText(text, x14, y14, this.strokePaint);
        }
        canvas.drawText(text, x14, y14, this.textPaint);
    }

    private final float toOneDecimal(float f14) {
        return ((int) (f14 * 10)) / 10.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SegmentsConfiguration calculateSegmentsConfiguration$plugin_scalebar_release(float maxDistance, float distancePerPixel, List<? extends Pair<Integer, Integer>> scaleTable, Paint textPaint, float strokeWidth, String unit, int rightMarginPx) {
        Pair<Integer, Integer> pairPrevious;
        float f14;
        this = this;
        scaleTable.getClass();
        textPaint.getClass();
        unit.getClass();
        ListIterator<? extends Pair<Integer, Integer>> listIterator = scaleTable.listIterator(scaleTable.size());
        do {
            if (!listIterator.hasPrevious()) {
                pairPrevious = null;
                break;
            }
            pairPrevious = listIterator.previous();
        } while (((Number) pairPrevious.first).intValue() > maxDistance);
        Pair<Integer, Integer> pair = pairPrevious;
        if (pair == null) {
            pair = scaleTable.get(0);
        }
        float fIntValue = ((Number) pair.first).intValue();
        Object obj = pair.second;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        float oneDecimal = fIntValue / iIntValue;
        while (iIntValue * oneDecimal > maxDistance && iIntValue > 0) {
            iIntValue--;
            fIntValue = iIntValue * oneDecimal;
        }
        if (iIntValue == 0) {
            oneDecimal = toOneDecimal(maxDistance);
            f14 = oneDecimal;
            iIntValue = 1;
        } else {
            f14 = fIntValue;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f15 = 0.0f;
        int i14 = iIntValue;
        boolean z14 = true;
        while (z14) {
            float f16 = f14 / i14;
            float oneDecimal2 = this.toOneDecimal(f16 / distancePerPixel);
            arrayList.clear();
            arrayList2.clear();
            if (i14 >= 0) {
                int i15 = 0;
                while (true) {
                    float f17 = i15;
                    arrayList.add(i15, this.getDistanceText$plugin_scalebar_release(f16 * f17, unit));
                    arrayList2.add(i15, this.calculateTextPositions((String) arrayList.get(i15), f17 * oneDecimal2, i15 == 0 ? Paint.Align.LEFT : Paint.Align.CENTER, textPaint, strokeWidth, rightMarginPx));
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                    this = this;
                }
            }
            int size = arrayList2.size() - 1;
            int i16 = 0;
            while (true) {
                if (i16 < size) {
                    float fFloatValue = ((Number) ((u) arrayList2.get(i16)).f128606b).floatValue();
                    i16++;
                    if (fFloatValue >= ((Number) ((u) arrayList2.get(i16)).f128605a).floatValue()) {
                        if (i14 != 1) {
                            i14--;
                            z14 = true;
                            break;
                        }
                        arrayList.set(0, "");
                    }
                }
                z14 = false;
                break;
            }
            oneDecimal = f16;
            f15 = oneDecimal2;
        }
        return new SegmentsConfiguration(oneDecimal, f15, i14, h0.b1(arrayList), h0.b1(arrayList2));
    }

    public final Pair<Float, Float> calculateWidthAndHeight$plugin_scalebar_release() {
        float pixelRatio = (getPixelRatio() * 10) + (getSettings().getRatio() * getMapViewWidth());
        ScaleBarSettings settings = getSettings();
        return new Pair<>(Float.valueOf(pixelRatio), Float.valueOf((settings.getBorderWidth() * 2) + settings.getHeight() + settings.getTextSize() + settings.getTextBarMargin()));
    }

    /* JADX INFO: renamed from: getBarPaint$plugin_scalebar_release, reason: from getter */
    public final Paint getBarPaint() {
        return this.barPaint;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public float getDistancePerPixel() {
        return this.distancePerPixel;
    }

    public final String getDistanceText$plugin_scalebar_release(float distance, String unit) {
        unit.getClass();
        if (distance == 0.0f) {
            return "0";
        }
        if (ScaleBarConstantKt.METER_UNIT.equals(unit)) {
            DecimalFormat decimalFormat = this.decimalFormat;
            if (distance < 1000.0f) {
                return decimalFormat.format(Float.valueOf(distance)) + unit;
            }
            return decimalFormat.format((((double) distance) * 1.0d) / ((double) 1000)) + ScaleBarConstantKt.KILOMETER_UNIT;
        }
        DecimalFormat decimalFormat2 = this.decimalFormat;
        if (distance < 5280.0f) {
            return decimalFormat2.format(Float.valueOf(distance)) + unit;
        }
        return decimalFormat2.format((((double) distance) * 1.0d) / ((double) ScaleBarConstantKt.FEET_PER_MILE)) + ScaleBarConstantKt.MILE_UNIT;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    /* JADX INFO: renamed from: getEnable, reason: from getter */
    public boolean getIsScaleBarVisible() {
        return this.isScaleBarVisible;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public float getMapViewWidth() {
        return this.mapViewWidth;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public final List<Pair<Integer, Integer>> getScaleTable$plugin_scalebar_release() {
        return this.scaleTable;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public ScaleBarSettings getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: getStrokePaint$plugin_scalebar_release, reason: from getter */
    public final Paint getStrokePaint() {
        return this.strokePaint;
    }

    /* JADX INFO: renamed from: getTextPaint$plugin_scalebar_release, reason: from getter */
    public final Paint getTextPaint() {
        return this.textPaint;
    }

    /* JADX INFO: renamed from: getUnit$plugin_scalebar_release, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public boolean getUseContinuousRendering() {
        return this.useContinuousRendering;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        int i14 = 0;
        if (getUseContinuousRendering()) {
            if (!this.isScaleBarVisible) {
                canvas.drawARGB(0, 0, 0, 0);
                return;
            } else if (this.reusableCanvas != null) {
                return;
            }
        }
        if (getDistancePerPixel() <= 0.0f || getMapViewWidth() <= 0.0f || getWidth() <= 0) {
            return;
        }
        ScaleBarSettings settings = getSettings();
        float ratio = settings.getRatio() * getDistancePerPixel() * getMapViewWidth();
        if (ratio <= 0.1f) {
            canvas.drawARGB(0, 0, 0, 0);
            return;
        }
        SegmentsConfiguration segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release = calculateSegmentsConfiguration$plugin_scalebar_release(ratio, getDistancePerPixel(), this.scaleTable, this.textPaint, this.strokePaint.getStrokeWidth(), this.unit, getWidth());
        this.currentSegmentsConfiguration = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release;
        this.barPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.barPaint.setColor(settings.getSecondaryColor());
        float unitBarWidth = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getUnitBarWidth() * segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getRectCount();
        float f14 = 2;
        canvas.drawRect(0.0f, (settings.getTextSize() + settings.getTextBarMargin()) - (settings.getBorderWidth() * f14), (settings.getBorderWidth() * f14) + unitBarWidth, (settings.getBorderWidth() * f14) + settings.getHeight() + settings.getTextSize() + settings.getTextBarMargin(), this.barPaint);
        this.barPaint.setColor(settings.getPrimaryColor());
        canvas.drawRect(settings.getBorderWidth(), (settings.getTextSize() + settings.getTextBarMargin()) - settings.getBorderWidth(), settings.getBorderWidth() + unitBarWidth, settings.getBorderWidth() + settings.getHeight() + settings.getTextSize() + settings.getTextBarMargin(), this.barPaint);
        this.barPaint.setStyle(Paint.Style.FILL);
        int rectCount = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getRectCount();
        if (rectCount >= 0) {
            while (true) {
                this.barPaint.setColor(i14 % 2 == 0 ? settings.getPrimaryColor() : settings.getSecondaryColor());
                String str = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getLabelTexts().get(i14);
                Paint paint = this.textPaint;
                if (i14 == 0) {
                    Paint.Align align = Paint.Align.LEFT;
                    paint.setTextAlign(align);
                    this.strokePaint.setTextAlign(align);
                } else {
                    Paint.Align align2 = Paint.Align.CENTER;
                    paint.setTextAlign(align2);
                    this.strokePaint.setTextAlign(align2);
                }
                drawText(canvas, str, segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getLabelMarginsAndAnchor().get(i14).f128607c.floatValue(), settings.getTextSize());
                if (i14 != segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getRectCount()) {
                    canvas.drawRect((settings.getBorderWidth() * f14) + (segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getUnitBarWidth() * i14), settings.getTextBarMargin() + settings.getTextSize(), segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.getUnitBarWidth() * (i14 + 1), settings.getHeight() + settings.getTextSize() + settings.getTextBarMargin(), this.barPaint);
                }
                if (i14 == rectCount) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (getUseContinuousRendering()) {
            this.reusableCanvas = canvas;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<Float, Float> pairCalculateWidthAndHeight$plugin_scalebar_release = calculateWidthAndHeight$plugin_scalebar_release();
        setMeasuredDimension((int) ((Number) pairCalculateWidthAndHeight$plugin_scalebar_release.first).floatValue(), (int) ((Number) pairCalculateWidthAndHeight$plugin_scalebar_release.second).floatValue());
    }

    public final boolean refreshHandlerHasMessages$plugin_scalebar_release(int what) {
        return this.refreshHandler.hasMessages(what);
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public void setDistancePerPixel(float f14) {
        if (!getSettings().getIsMetricUnits()) {
            f14 *= 3.2808f;
        }
        if (this.distancePerPixel == f14) {
            return;
        }
        this.distancePerPixel = f14;
        if (getUseContinuousRendering()) {
            this.reusableCanvas = null;
            return;
        }
        if (s.g(calculateSegmentsConfiguration$plugin_scalebar_release(getSettings().getRatio() * getDistancePerPixel() * getMapViewWidth(), this.distancePerPixel, this.scaleTable, this.textPaint, this.strokePaint.getStrokeWidth(), this.unit, getWidth()), this.currentSegmentsConfiguration) || this.refreshHandler.hasMessages(0)) {
            return;
        }
        this.refreshHandler.sendEmptyMessageDelayed(0, getSettings().getRefreshInterval());
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public void setEnable(boolean z14) {
        this.isScaleBarVisible = z14;
        if (getUseContinuousRendering()) {
            return;
        }
        setVisibility(z14 ? 0 : 8);
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public void setMapViewWidth(float f14) {
        this.mapViewWidth = f14;
        post(new cd0.h0(this, 22));
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public void setPixelRatio(float f14) {
        this.pixelRatio = f14;
    }

    public final void setScaleTable$plugin_scalebar_release(List<? extends Pair<Integer, Integer>> list) {
        list.getClass();
        this.scaleTable = list;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public void setSettings(ScaleBarSettings scaleBarSettings) {
        scaleBarSettings.getClass();
        this.textPaint.setColor(scaleBarSettings.getTextColor());
        this.textPaint.setTextSize(scaleBarSettings.getTextSize());
        this.strokePaint.setTextSize(scaleBarSettings.getTextSize());
        this.scaleTable = scaleBarSettings.getIsMetricUnits() ? ScaleBarConstantKt.getMetricTable() : ScaleBarConstantKt.getImperialTable();
        this.unit = scaleBarSettings.getIsMetricUnits() ? ScaleBarConstantKt.METER_UNIT : ScaleBarConstantKt.FEET_UNIT;
        this.strokePaint.setStrokeWidth(scaleBarSettings.getShowTextBorder() ? scaleBarSettings.getTextBorderWidth() : 0.0f);
        setEnable(scaleBarSettings.getEnabled());
        setUseContinuousRendering(scaleBarSettings.getUseContinuousRendering());
        if (getUseContinuousRendering()) {
            this.reusableCanvas = null;
        } else if (!this.refreshHandler.hasMessages(0)) {
            this.refreshHandler.sendEmptyMessageDelayed(0, scaleBarSettings.getRefreshInterval());
        }
        this.settings = scaleBarSettings;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = scaleBarSettings.getPosition();
            layoutParams2.setMargins((int) scaleBarSettings.getMarginLeft(), (int) scaleBarSettings.getMarginTop(), (int) scaleBarSettings.getMarginRight(), (int) scaleBarSettings.getMarginBottom());
        }
        setMapViewWidth(getMapViewWidth());
    }

    public final void setUnit$plugin_scalebar_release(String str) {
        str.getClass();
        this.unit = str;
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBar
    public void setUseContinuousRendering(boolean z14) {
        boolean z15 = this.isScaleBarVisible;
        if (z14) {
            if (!z15) {
                setVisibility(0);
            }
            this.refreshHandler.removeMessages(0);
            this.refreshHandler.sendEmptyMessage(1);
        } else {
            if (!z15) {
                setVisibility(8);
            }
            this.refreshHandler.removeMessages(1);
            this.reusableCanvas = null;
        }
        this.useContinuousRendering = z14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleBarImpl(Context context) {
        super(context);
        context.getClass();
        this.scaleTable = ScaleBarConstantKt.getMetricTable();
        Paint paint = new Paint();
        this.textPaint = paint;
        Paint paint2 = new Paint();
        this.barPaint = paint2;
        Paint paint3 = new Paint();
        this.strokePaint = paint3;
        this.unit = ScaleBarConstantKt.METER_UNIT;
        this.pixelRatio = 1.0f;
        this.decimalFormat = new DecimalFormat("0.#");
        this.settings = ScaleBarSettingsKt.ScaleBarSettings(ScaleBarImpl$settings$1.INSTANCE);
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint2.setAntiAlias(true);
        RefreshHandler refreshHandler = new RefreshHandler(this);
        if (getUseContinuousRendering()) {
            refreshHandler.sendEmptyMessage(1);
        }
        this.refreshHandler = refreshHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleBarImpl(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        attributeSet.getClass();
        this.scaleTable = ScaleBarConstantKt.getMetricTable();
        Paint paint = new Paint();
        this.textPaint = paint;
        Paint paint2 = new Paint();
        this.barPaint = paint2;
        Paint paint3 = new Paint();
        this.strokePaint = paint3;
        this.unit = ScaleBarConstantKt.METER_UNIT;
        this.pixelRatio = 1.0f;
        this.decimalFormat = new DecimalFormat("0.#");
        this.settings = ScaleBarSettingsKt.ScaleBarSettings(ScaleBarImpl$settings$1.INSTANCE);
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint2.setAntiAlias(true);
        RefreshHandler refreshHandler = new RefreshHandler(this);
        if (getUseContinuousRendering()) {
            refreshHandler.sendEmptyMessage(1);
        }
        this.refreshHandler = refreshHandler;
    }
}
