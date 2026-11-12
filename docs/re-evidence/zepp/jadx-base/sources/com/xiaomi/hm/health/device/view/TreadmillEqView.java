package com.xiaomi.hm.health.device.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.utils.ex.ViewExKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0002MNB\u0011\b\u0016\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GB\u001b\b\u0016\u0012\u0006\u0010E\u001a\u00020D\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bF\u0010JB#\b\u0016\u0012\u0006\u0010E\u001a\u00020D\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\u0006\u0010K\u001a\u00020\u0002¢\u0006\u0004\bF\u0010LJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017R\u0019\u0010\u001b\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001d\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#R&\u0010-\u001a\u0012\u0012\u0004\u0012\u00020*0)j\b\u0012\u0004\u0012\u00020*`+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R&\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00040)j\b\u0012\u0004\u0012\u00020\u0004`+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R.\u0010C\u001a\u0004\u0018\u00010<2\b\u0010\u0003\u001a\u0004\u0018\u00010<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006O"}, d2 = {"Lcom/xiaomi/hm/health/device/view/TreadmillEqView;", "Landroid/view/View;", "", "value", "", "c", "(Ljava/lang/Integer;)F", "y", "a", "Landroid/view/MotionEvent;", "event", "b", "w", "h", "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "onTouchEvent", "", LogUtil.D, "getGap", "()D", "gap", "getEdgeGap", "edgeGap", LogUtil.I, "viewWidth", GoogleApiAvailabilityLight.a, "viewHeight", "e", "F", "slideHeight", "f", "touchPosition", "g", "slideMarginTop", "Ljava/util/ArrayList;", "Landroid/graphics/RectF;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "slideArea", "i", "slideValues", "Landroid/graphics/Paint;", z.j, "Landroid/graphics/Paint;", "paint", "Lcom/xiaomi/hm/health/device/view/TreadmillEqView$OnDBChangeListener;", hl.k, "Lcom/xiaomi/hm/health/device/view/TreadmillEqView$OnDBChangeListener;", "getDbListener", "()Lcom/xiaomi/hm/health/device/view/TreadmillEqView$OnDBChangeListener;", "setDbListener", "(Lcom/xiaomi/hm/health/device/view/TreadmillEqView$OnDBChangeListener;)V", "dbListener", "", "l", "[I", "getValues", "()[I", "setValues", "([I)V", "values", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnDBChangeListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TreadmillEqView extends View {
    public static final int SLIDE_COUNT = 10;
    private static final double m = 10.8d;
    private static final float n = 20.0f;
    private static final float o = 15.0f;
    private static final float p = 10.0f;
    private static final float q = 7.0f;
    private static final float r = 2.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double gap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double edgeGap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int viewWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int viewHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float slideHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int touchPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float slideMarginTop;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<RectF> slideArea;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Float> slideValues;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private Paint paint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private OnDBChangeListener dbListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private int[] values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/view/TreadmillEqView$OnDBChangeListener;", "", "", "index", "value", "", "uiChanged", "gainChanged", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnDBChangeListener {
        void gainChanged(int index, int value);

        void uiChanged(int index, int value);
    }

    public TreadmillEqView(@NotNull Context context) {
        this(context, null);
    }

    private final int a(float y) {
        float f = this.slideHeight;
        return ((int) ((((this.slideMarginTop + f) - y) / f) * 12)) - 6;
    }

    private final int b(MotionEvent event) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.slideArea.get(i).contains(event.getX(), event.getY())) {
                return i;
            }
            if (i2 >= 10) {
                return -1;
            }
            i = i2;
        }
    }

    private final float c(Integer value) {
        int iIntValue = value == null ? -6 : value.intValue();
        float f = this.slideMarginTop;
        float f2 = this.slideHeight;
        return (f + f2) - (((iIntValue + 6) * f2) / 12);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final OnDBChangeListener getDbListener() {
        return this.dbListener;
    }

    public final double getEdgeGap() {
        return this.edgeGap;
    }

    public final double getGap() {
        return this.gap;
    }

    @Nullable
    public final int[] getValues() {
        return this.values;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null || getWidth() == -1 || getHeight() == -1) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f = (float) (this.edgeGap + (this.gap * ((double) i)));
            int color = this.paint.getColor();
            this.paint.setColor(Color.parseColor("#EFEFEF"));
            canvas.drawLine(f, this.slideMarginTop, f, this.slideValues.get(i).floatValue(), this.paint);
            if (i < 9) {
                this.paint.setColor(Color.parseColor("#FCD7D7"));
                canvas.drawLine(f, this.slideValues.get(i).floatValue(), (float) (this.edgeGap + (this.gap * ((double) i2))), this.slideValues.get(i2).floatValue(), this.paint);
            }
            this.paint.setColor(color);
            canvas.drawLine(f, this.slideValues.get(i).floatValue(), f, this.slideHeight + this.slideMarginTop, this.paint);
            canvas.drawCircle(f, this.slideValues.get(i).floatValue(), ViewExKt.dp2px(this, 7.0f), this.paint);
            if (i2 >= 10) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.viewWidth = w;
        this.viewHeight = h;
        this.slideHeight = h - ViewExKt.dp2px(this, 20.0f);
        this.slideMarginTop = ViewExKt.dp2px(this, 10.0f);
        this.slideValues.clear();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            double d = i;
            this.slideArea.add(new RectF(((float) (this.edgeGap + (this.gap * d))) - ViewExKt.dp2px(this, 15.0f), 0.0f, ((float) (this.edgeGap + (this.gap * d))) + ViewExKt.dp2px(this, 15.0f), this.viewHeight));
            ArrayList<Float> arrayList = this.slideValues;
            int[] iArr = this.values;
            arrayList.add(Float.valueOf(c(iArr == null ? null : Integer.valueOf(iArr[i]))));
            invalidate();
            if (i2 >= 10) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (event == null) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            int iB = b(event);
            if (iB == -1) {
                return super.onTouchEvent(event);
            }
            this.touchPosition = iB;
            this.slideValues.set(iB, Float.valueOf(event.getY()));
            invalidate();
            return true;
        }
        if (action == 1) {
            ArrayList<Float> arrayList = this.slideValues;
            int i = this.touchPosition;
            float y = event.getY();
            float y2 = this.slideMarginTop;
            if (y >= y2) {
                float y3 = event.getY();
                float f = this.slideHeight;
                float f2 = this.slideMarginTop;
                y2 = y3 > f + f2 ? f + f2 : event.getY();
            }
            arrayList.set(i, Float.valueOf(y2));
            OnDBChangeListener onDBChangeListener = this.dbListener;
            if (onDBChangeListener != null) {
                int i2 = this.touchPosition;
                onDBChangeListener.gainChanged(i2, a(this.slideValues.get(i2).floatValue()));
            }
            invalidate();
        } else if (action == 2) {
            ArrayList<Float> arrayList2 = this.slideValues;
            int i3 = this.touchPosition;
            float y4 = event.getY();
            float y5 = this.slideMarginTop;
            if (y4 >= y5) {
                float y6 = event.getY();
                float f3 = this.slideHeight;
                float f4 = this.slideMarginTop;
                y5 = y6 > f3 + f4 ? f3 + f4 : event.getY();
            }
            arrayList2.set(i3, Float.valueOf(y5));
            OnDBChangeListener onDBChangeListener2 = this.dbListener;
            if (onDBChangeListener2 != null) {
                int i4 = this.touchPosition;
                onDBChangeListener2.uiChanged(i4, a(this.slideValues.get(i4).floatValue()));
            }
            invalidate();
        }
        return super.onTouchEvent(event);
    }

    public final void setDbListener(@Nullable OnDBChangeListener onDBChangeListener) {
        this.dbListener = onDBChangeListener;
    }

    public final void setValues(@Nullable int[] iArr) {
        this.values = iArr;
        this.slideValues.clear();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.slideValues.add(Float.valueOf(c(Integer.valueOf(this.values[i]))));
            if (i2 >= 10) {
                invalidate();
                return;
            }
            i = i2;
        }
    }

    public TreadmillEqView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public TreadmillEqView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        double screenWidth = ViewExKt.getScreenWidth(this);
        double d = screenWidth / m;
        this.gap = d;
        this.edgeGap = (screenWidth - (d * ((double) 9))) / ((double) 2);
        this.viewWidth = -1;
        this.viewHeight = -1;
        this.slideHeight = -1.0f;
        this.touchPosition = -1;
        this.slideMarginTop = -1.0f;
        this.slideArea = new ArrayList<>();
        this.slideValues = new ArrayList<>();
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#FF5353"));
        paint.setStrokeWidth(ViewExKt.dp2px(this, 2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        Unit unit = Unit.INSTANCE;
        this.paint = paint;
    }
}
