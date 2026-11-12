package com.huami.sleep.daysleep.sleepstagechart.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagChartData;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010l\u001a\u00020k\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010m\u0012\b\b\u0002\u0010o\u001a\u00020\u0002¢\u0006\u0004\bp\u0010qJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\r0\u001dj\b\u0012\u0004\u0012\u00020\r`\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R%\u0010)\u001a\n $*\u0004\u0018\u00010#0#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R*\u00101\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R%\u0010>\u001a\n $*\u0004\u0018\u00010#0#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010(R%\u0010A\u001a\n $*\u0004\u0018\u00010#0#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u0010(R$\u0010E\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bB\u0010!\"\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR*\u0010N\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010!\u001a\u0004\bK\u0010L\"\u0004\bM\u0010DR*\u0010R\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010,\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R\u0016\u0010T\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010HR\u0016\u0010V\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010HR*\u0010Z\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010,\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R*\u0010^\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010,\u001a\u0004\b\\\u0010.\"\u0004\b]\u00100R*\u0010b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010,\u001a\u0004\b`\u0010.\"\u0004\ba\u00100R*\u0010f\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010,\u001a\u0004\bd\u0010.\"\u0004\be\u00100R\u0016\u0010h\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010,R\u0016\u0010j\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010,¨\u0006r"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepTagChart;", "Landroid/view/View;", "", "a", "startValue", "endValue", "Lkotlin/Pair;", "", "c", "originLeftValue", "originRightValue", "b", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagChartData;", "data", "", "updateData", "min", "max", "setXMaxMinValue", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "Ljava/lang/String;", "mTag", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mData", LogUtil.I, "circleBitmapSize", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMBitmap", "()Landroid/graphics/Bitmap;", "mBitmap", "value", "e", "F", "getDrawPadding", "()F", "setDrawPadding", "(F)V", "drawPadding", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "srcRect", "g", "dstRect", "Landroid/graphics/Matrix;", "h", "Landroid/graphics/Matrix;", "rotateMatrix", "i", "getRbBitmap", "rbBitmap", z.j, "getLbBitmap", "lbBitmap", hl.k, "setMColor", "(I)V", "mColor", "Landroid/graphics/Paint;", "l", "Landroid/graphics/Paint;", "rectPaint", "m", "getMTagTextColor", "()I", "setMTagTextColor", "mTagTextColor", GoogleApiAvailabilityLight.b, "getMTagTextSize", "setMTagTextSize", "mTagTextSize", "o", "tagPaint", com.google.android.exoplayer2.text.ttml.b.r, "picPaint", DTransferConstants.SEARCH_KEY, "getMTagBgHeight", "setMTagBgHeight", "mTagBgHeight", "r", "getMTagBgWithBarDis", "setMTagBgWithBarDis", "mTagBgWithBarDis", SOAP.XMLNS, "getMTagRLPadding", "setMTagRLPadding", "mTagRLPadding", "t", "getMBarHeight", "setMBarHeight", "mBarHeight", "u", "xAxisMin", "v", "xAxisMax", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTagChart extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<SleepTagChartData> mData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int circleBitmapSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBitmap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float drawPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Rect srcRect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Rect dstRect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Matrix rotateMatrix;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy rbBitmap;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy lbBitmap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Paint rectPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mTagTextColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float mTagTextSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Paint tagPaint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Paint picPaint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float mTagBgHeight;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float mTagBgWithBarDis;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float mTagRLPadding;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float mBarHeight;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float xAxisMin;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float xAxisMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Bitmap> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap rbBitmap = SleepTagChart.this.getRbBitmap();
            int i = SleepTagChart.this.circleBitmapSize;
            int i2 = SleepTagChart.this.circleBitmapSize;
            Matrix matrix = SleepTagChart.this.rotateMatrix;
            matrix.setRotate(90.0f);
            Unit unit = Unit.INSTANCE;
            return Bitmap.createBitmap(rbBitmap, 0, 0, i, i2, matrix, true);
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
            return BitmapFactory.decodeResource(this.a.getResources(), R.drawable.sleep_tag_bg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Bitmap> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ SleepTagChart b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, SleepTagChart sleepTagChart) {
            super(0);
            this.a = context;
            this.b = sleepTagChart;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.a.getResources(), R.drawable.slp_icon_drag);
            int i = this.b.circleBitmapSize;
            int i2 = this.b.circleBitmapSize;
            Matrix matrix = this.b.rotateMatrix;
            matrix.setRotate(180.0f);
            Unit unit = Unit.INSTANCE;
            return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, i, i2, matrix, true);
        }
    }

    @JvmOverloads
    public SleepTagChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepTagChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepTagChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int a() {
        return (int) ((this.mBarHeight + this.mTagBgHeight + getLbBitmap().getHeight() + this.mTagBgWithBarDis) * 4);
    }

    private final Pair<Float, Float> b(float originLeftValue, float originRightValue) {
        return ViewUtils.isRTL() ? new Pair<>(Float.valueOf(getWidth() - originRightValue), Float.valueOf(getWidth() - originLeftValue)) : new Pair<>(Float.valueOf(originLeftValue), Float.valueOf(originRightValue));
    }

    private final Pair<Float, Float> c(int startValue, int endValue) {
        float f = endValue;
        float f2 = this.xAxisMin;
        if (f <= f2) {
            return null;
        }
        float f3 = startValue;
        float f4 = this.xAxisMax;
        if (f3 >= f4) {
            return null;
        }
        if (f3 < f2) {
            startValue = (int) f2;
        }
        if (f > f4) {
            endValue = (int) f4;
        }
        float width = getWidth();
        float f5 = this.drawPadding;
        float f6 = width - (2 * f5);
        float f7 = this.xAxisMin;
        float f8 = this.xAxisMax;
        return new Pair<>(Float.valueOf((((startValue - f7) / (f8 - f7)) * f6) + f5), Float.valueOf((((endValue - f7) / (f8 - f7)) * f6) + f5));
    }

    private final Bitmap getLbBitmap() {
        return (Bitmap) this.lbBitmap.getValue();
    }

    private final Bitmap getMBitmap() {
        return (Bitmap) this.mBitmap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getRbBitmap() {
        return (Bitmap) this.rbBitmap.getValue();
    }

    private final void setMColor(int i) {
        this.mColor = i;
        this.rectPaint.setColor(i);
        invalidate();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final float getDrawPadding() {
        return this.drawPadding;
    }

    public final float getMBarHeight() {
        return this.mBarHeight;
    }

    public final float getMTagBgHeight() {
        return this.mTagBgHeight;
    }

    public final float getMTagBgWithBarDis() {
        return this.mTagBgWithBarDis;
    }

    public final float getMTagRLPadding() {
        return this.mTagRLPadding;
    }

    public final int getMTagTextColor() {
        return this.mTagTextColor;
    }

    public final float getMTagTextSize() {
        return this.mTagTextSize;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        int height = (int) (this.mBarHeight + this.mTagBgHeight + getLbBitmap().getHeight() + this.mTagBgWithBarDis);
        int i = 0;
        for (SleepTagChartData sleepTagChartData : this.mData) {
            int height2 = getHeight() - (i * height);
            int i2 = i + 1;
            int height3 = getHeight() - (i2 * height);
            Pair<Float, Float> pairC = c(sleepTagChartData.getStart(), sleepTagChartData.getEnd());
            if (pairC != null) {
                Pair<Float, Float> pairB = b(pairC.getFirst().floatValue(), pairC.getSecond().floatValue());
                if (canvas != null) {
                    canvas.drawRect(pairB.getFirst().floatValue(), (height2 - getMBarHeight()) - getLbBitmap().getHeight(), pairB.getSecond().floatValue(), height2 - getLbBitmap().getHeight(), this.rectPaint);
                }
                float fMeasureText = this.tagPaint.measureText(sleepTagChartData.getTag());
                float fFloatValue = (((pairB.getSecond().floatValue() - pairB.getFirst().floatValue()) / 2.0f) + pairB.getFirst().floatValue()) - (fMeasureText / 2.0f);
                this.srcRect.set(0, 0, getMBitmap().getWidth(), getMBitmap().getHeight());
                float f = height3;
                this.dstRect.set((int) (fFloatValue - getMTagRLPadding()), height3, (int) (fMeasureText + fFloatValue + getMTagRLPadding()), (int) (getMTagBgHeight() + f));
                if (canvas != null) {
                    canvas.drawBitmap(getMBitmap(), this.srcRect, this.dstRect, this.picPaint);
                }
                if (canvas != null) {
                    canvas.drawText(sleepTagChartData.getTag(), fFloatValue, f + getMTagTextSize(), this.tagPaint);
                }
                this.srcRect.set(0, 0, getLbBitmap().getWidth(), getLbBitmap().getHeight());
                this.dstRect.set((int) (pairB.getFirst().floatValue() - getLbBitmap().getWidth()), height2 - getLbBitmap().getHeight(), (int) pairB.getFirst().floatValue(), height2);
                if (canvas != null) {
                    canvas.drawBitmap(getLbBitmap(), this.srcRect, this.dstRect, this.picPaint);
                }
                this.srcRect.set(0, 0, getRbBitmap().getWidth(), getRbBitmap().getHeight());
                this.dstRect.set((int) pairB.getSecond().floatValue(), height2 - getRbBitmap().getHeight(), (int) (pairB.getSecond().floatValue() + getRbBitmap().getWidth()), height2);
                if (canvas != null) {
                    canvas.drawBitmap(getRbBitmap(), this.srcRect, this.dstRect, this.picPaint);
                }
            }
            i = i2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(a(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setDrawPadding(float f) {
        this.drawPadding = f;
        requestLayout();
    }

    public final void setMBarHeight(float f) {
        this.mBarHeight = f;
        requestLayout();
    }

    public final void setMTagBgHeight(float f) {
        this.mTagBgHeight = f;
        requestLayout();
    }

    public final void setMTagBgWithBarDis(float f) {
        this.mTagBgWithBarDis = f;
        requestLayout();
    }

    public final void setMTagRLPadding(float f) {
        this.mTagRLPadding = f;
        invalidate();
    }

    public final void setMTagTextColor(int i) {
        this.mTagTextColor = i;
        this.tagPaint.setColor(i);
        invalidate();
    }

    public final void setMTagTextSize(float f) {
        this.mTagTextSize = f;
        this.tagPaint.setTextSize(f);
        invalidate();
    }

    public final void setXMaxMinValue(float min, float max) {
        this.xAxisMin = min;
        this.xAxisMax = max;
        invalidate();
    }

    public final void updateData(@NotNull List<SleepTagChartData> data) {
        ArrayList<SleepTagChartData> arrayList = this.mData;
        arrayList.clear();
        arrayList.addAll(data);
        invalidate();
    }

    @JvmOverloads
    public SleepTagChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTag = "SleepTagChart";
        this.mData = new ArrayList<>();
        this.circleBitmapSize = (int) ViewUtils.dp2px(context, 9.0f);
        this.mBitmap = LazyKt__LazyJVMKt.lazy(new b(context));
        this.drawPadding = ViewUtils.dp2px(context, 15.0f);
        this.srcRect = new Rect(0, 0, 0, 0);
        this.dstRect = new Rect(0, 0, 0, 0);
        this.rotateMatrix = new Matrix();
        this.rbBitmap = LazyKt__LazyJVMKt.lazy(new c(context, this));
        this.lbBitmap = LazyKt__LazyJVMKt.lazy(new a());
        this.mColor = ViewExKt.addAlpha(ContextCompat.getColor(context, R.color.p3), 0.39d);
        Paint paint = new Paint();
        paint.setColor(this.mColor);
        Unit unit = Unit.INSTANCE;
        this.rectPaint = paint;
        int i2 = R.color.s5;
        this.mTagTextColor = ContextCompat.getColor(context, i2);
        Resources resources = getResources();
        int i3 = R.dimen.slp_size_11sp;
        this.mTagTextSize = resources.getDimension(i3);
        Paint paint2 = new Paint();
        paint2.setColor(getMTagTextColor());
        paint2.setTextSize(getMTagTextSize());
        this.tagPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setAntiAlias(true);
        this.picPaint = paint3;
        this.mTagBgHeight = ViewUtils.dp2px(context, 20.0f);
        this.mTagBgWithBarDis = ViewUtils.dp2px(context, 2.0f);
        this.mTagRLPadding = ViewUtils.dp2px(context, 4.0f);
        this.mBarHeight = ViewUtils.dp2px(context, 4.0f);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SleepTagChart);
        this.xAxisMax = typedArrayObtainStyledAttributes.getFloat(R.styleable.SleepTagChart_stc_maxValue, 0.0f);
        this.xAxisMin = typedArrayObtainStyledAttributes.getFloat(R.styleable.SleepTagChart_stc_minValue, 0.0f);
        setDrawPadding(typedArrayObtainStyledAttributes.getDimension(R.styleable.SleepTagChart_stc_drawPadding, ViewUtils.dp2px(context, 15.0f)));
        setMTagTextSize(typedArrayObtainStyledAttributes.getDimension(R.styleable.SleepTagChart_stc_tagTextSize, getResources().getDimension(i3)));
        setMTagTextColor(typedArrayObtainStyledAttributes.getColor(R.styleable.SleepTagChart_stc_tagColor, ContextCompat.getColor(context, i2)));
        typedArrayObtainStyledAttributes.recycle();
    }
}
