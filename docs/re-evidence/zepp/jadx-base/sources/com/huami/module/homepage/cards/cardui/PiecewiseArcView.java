package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.internal.view.SupportMenu;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 O2\u00020\u0001:\u0001\bB\u0011\b\u0016\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u001b\b\u0016\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bH\u0010LB#\b\u0016\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\u0006\u0010M\u001a\u00020\n¢\u0006\u0004\bH\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0002J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0019J(\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0014J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010(R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010.\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010(R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00104R\u0016\u0010A\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00104R\u0016\u0010C\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010(R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006P"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/PiecewiseArcView;", "Landroid/view/View;", "", GoogleApiAvailabilityLight.a, "e", "f", "Landroid/graphics/Canvas;", "canvas", "a", "", "", "angleValue", "b", "c", "g", "", "show", "showIndicator", "colors", "setPiecewiseColor", "color", "setIndicatorColor", "refresh", "angleRange", "setAngleRange", "", "openAngle", "setOpenAngle", "maxValue", "setMaxValue", "value", "setValue", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", LogUtil.I, "lastColorSize", "F", "startAngle", "", "Ljava/util/List;", "piecewiseColors", "rangeAngle", "arcRadius", "i", "Ljava/lang/Integer;", "indicatorColor", "Landroid/graphics/Paint;", z.j, "Landroid/graphics/Paint;", "arcPaint", "Landroid/graphics/Path;", hl.k, "Landroid/graphics/Path;", "arcPath", "l", "outPath", "m", "innerPath", GoogleApiAvailabilityLight.b, "outPaint", "o", "innerPaint", b.r, "indicatorAngle", DTransferConstants.SEARCH_KEY, "Z", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "r", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PiecewiseArcView extends View {

    @Deprecated
    public static final float ANGLE_OFFSET = 10.0f;

    @Deprecated
    public static final float COLOR_POSITION_OFFSET = 1.0E-6f;

    @Deprecated
    public static final float DASH_HALF_HEIGHT = 4.5f;

    @Deprecated
    public static final float DEFAULT_MAX_VALUE = 100.0f;

    @Deprecated
    public static final float HALF_CIRCLE_ANGLE = 180.0f;

    @Deprecated
    public static final float INNER_TRIANGLE_OFFSET = -3.0f;

    @Deprecated
    public static final float QUARTER_CIRCLE = 90.0f;

    @Deprecated
    public static final float SWEEP_ANGLE = 360.0f;

    @Deprecated
    public static final float THREE_QUARTERS_CIRCLE = 270.0f;

    @NotNull
    private static final a r = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int lastColorSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float openAngle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float startAngle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> piecewiseColors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<Integer> rangeAngle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float maxValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float value;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float arcRadius;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @ColorInt
    @Nullable
    private Integer indicatorColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Paint arcPaint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Path arcPath;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Path outPath;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Path innerPath;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Paint outPaint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Paint innerPaint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float indicatorAngle;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean showIndicator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"com/huami/module/homepage/cards/cardui/PiecewiseArcView$a", "", "", "ANGLE_OFFSET", "F", "COLOR_POSITION_OFFSET", "DASH_HALF_HEIGHT", "DEFAULT_MAX_VALUE", "HALF_CIRCLE_ANGLE", "INNER_TRIANGLE_OFFSET", "QUARTER_CIRCLE", "SWEEP_ANGLE", "THREE_QUARTERS_CIRCLE", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PiecewiseArcView(@NotNull Context context) {
        this(context, null);
    }

    private final void a(Canvas canvas) {
        int size = this.piecewiseColors.size();
        float f = (360.0f - this.openAngle) / size;
        int i = size - 1;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            float f2 = i2 * f;
            double d = (float) ((((double) (this.startAngle + f2)) * 3.141592653589793d) / ((double) 180.0f));
            float width = (getWidth() / 2.0f) + (this.arcRadius * ((float) Math.cos(d)));
            float height = (getHeight() / 2.0f) + (this.arcRadius * ((float) Math.sin(d)));
            canvas.save();
            canvas.translate(width, height);
            canvas.rotate((this.startAngle + f2) - 270.0f);
            RectF rectF = new RectF(NumberExtKt.getDp(-1.0f), NumberExtKt.getDp(-4.5f), NumberExtKt.getDp(1.0f), NumberExtKt.getDp(4.5f));
            Paint paint = new Paint(1);
            paint.setColor(ViewExtKt.loadColor(this, R.color.s38));
            Unit unit = Unit.INSTANCE;
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    private final void b(Canvas canvas, List<Integer> angleValue) {
        float f = (360.0f - this.openAngle) / this.maxValue;
        int i = 0;
        for (Object obj : angleValue) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i != angleValue.size() - 1) {
                float f2 = iIntValue * f;
                double d = (float) ((((double) (this.startAngle + f2)) * 3.141592653589793d) / ((double) 180.0f));
                float width = (getWidth() / 2.0f) + (this.arcRadius * ((float) Math.cos(d)));
                float height = (getHeight() / 2.0f) + (this.arcRadius * ((float) Math.sin(d)));
                canvas.save();
                canvas.translate(width, height);
                canvas.rotate((this.startAngle + f2) - 270.0f);
                RectF rectF = new RectF(NumberExtKt.getDp(-1.0f), NumberExtKt.getDp(-4.5f), NumberExtKt.getDp(1.0f), NumberExtKt.getDp(4.5f));
                Paint paint = new Paint(1);
                paint.setColor(ViewExtKt.loadColor(this, R.color.s38));
                Unit unit = Unit.INSTANCE;
                canvas.drawRect(rectF, paint);
                canvas.restore();
            }
            i = i2;
        }
    }

    private final void c(Canvas canvas) {
        float f = ((360.0f - this.openAngle) / this.maxValue) * this.value;
        this.indicatorAngle = f;
        double d = (float) ((((double) (this.startAngle + f)) * 3.141592653589793d) / ((double) 180.0f));
        float width = (getWidth() / 2.0f) + (this.arcRadius * ((float) Math.cos(d)));
        float height = (getHeight() / 2.0f) + (this.arcRadius * ((float) Math.sin(d)));
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate((this.startAngle + this.indicatorAngle) - 270.0f);
        canvas.drawPath(this.innerPath, this.innerPaint);
        canvas.drawPath(this.outPath, this.outPaint);
        canvas.restore();
    }

    private final void d() {
        Path path = this.arcPath;
        path.reset();
        path.addArc(new RectF((getWidth() / 2) - this.arcRadius, (getHeight() / 2) - this.arcRadius, (getWidth() / 2) + this.arcRadius, (getHeight() / 2) + this.arcRadius), this.startAngle, 360.0f - this.openAngle);
    }

    private final void e() {
        int size = this.piecewiseColors.size();
        if (size != 0) {
            int i = 0;
            if (size == 1) {
                this.arcPaint.setColor(this.piecewiseColors.get(0).intValue());
                return;
            }
            float f = (360.0f - this.openAngle) / 360.0f;
            int size2 = this.piecewiseColors.size();
            float f2 = f / size2;
            int i2 = size2 * 2;
            int[] iArr = new int[i2];
            float[] fArr = new float[i2];
            for (Object obj : this.piecewiseColors) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj).intValue();
                int i4 = i * 2;
                iArr[i4] = iIntValue;
                int i5 = i4 + 1;
                iArr[i5] = iIntValue;
                if (i == 0) {
                    fArr[i4] = i * f2;
                } else {
                    fArr[i4] = (i * f2) + 0.027777778f + 1.0E-6f;
                }
                if (i == size2 - 1) {
                    fArr[i5] = i3 * f2;
                } else {
                    fArr[i5] = ((i3 * f2) + 0.027777778f) - 1.0E-6f;
                }
                i = i3;
            }
            SweepGradient sweepGradient = new SweepGradient(getWidth() / 2.0f, getHeight() / 2.0f, iArr, fArr);
            Matrix matrix = new Matrix();
            matrix.setRotate(this.startAngle - 10.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            sweepGradient.setLocalMatrix(matrix);
            this.arcPaint.setShader(sweepGradient);
        }
    }

    private final void f() {
        List<Integer> list = this.rangeAngle;
        if (list == null) {
            return;
        }
        float f = (360.0f - this.openAngle) / 360.0f;
        int size = list.size();
        float f2 = f / this.maxValue;
        int i = size * 2;
        int[] iArr = new int[i];
        float[] fArr = new float[i];
        float f3 = 0.0f;
        int i2 = 0;
        for (Object obj : this.rangeAngle) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            int i4 = i2 * 2;
            iArr[i4] = this.piecewiseColors.get(i2).intValue();
            int i5 = i4 + 1;
            iArr[i5] = this.piecewiseColors.get(i2).intValue();
            if (i2 == 0) {
                fArr[i4] = f3;
            } else {
                fArr[i4] = f3 + 0.027777778f + 1.0E-6f;
            }
            f3 = iIntValue * f2;
            if (i2 == size - 1) {
                fArr[i5] = f3;
            } else {
                fArr[i5] = (f3 + 0.027777778f) - 1.0E-6f;
            }
            i2 = i3;
        }
        SweepGradient sweepGradient = new SweepGradient(getWidth() / 2.0f, getHeight() / 2.0f, iArr, fArr);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.startAngle - 10.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        sweepGradient.setLocalMatrix(matrix);
        this.arcPaint.setShader(sweepGradient);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    private final void g() {
        int iIntValue;
        int i;
        float dp = NumberExtKt.getDp(10.0f);
        float dp2 = NumberExtKt.getDp(8.0f);
        float dp3 = NumberExtKt.getDp(-1.0f);
        float dp4 = NumberExtKt.getDp(-3.0f);
        Path path = this.innerPath;
        path.reset();
        path.moveTo(0.0f, dp4);
        float f = -dp2;
        float f2 = dp4 + dp;
        path.lineTo(f, f2);
        path.lineTo(dp2, f2);
        path.close();
        Path path2 = this.outPath;
        path2.reset();
        path2.moveTo(0.0f, dp3);
        float f3 = dp + dp3;
        path2.lineTo(f, f3);
        path2.lineTo(dp2, f3);
        path2.close();
        Paint paint = this.outPaint;
        Integer num = this.indicatorColor;
        if (num == null) {
            int size = this.piecewiseColors.size();
            if (size == 0) {
                throw new IllegalArgumentException("color count must more than zero.");
            }
            if (size != 1) {
                float size2 = this.maxValue / this.piecewiseColors.size();
                float f4 = this.value;
                float f5 = f4 / size2;
                List<Integer> list = this.piecewiseColors;
                if (f4 <= 0.0f) {
                    i = (int) f5;
                } else {
                    if (!(f4 % size2 == 0.0f) || this.maxValue / f4 > list.size()) {
                        i = (int) f5;
                    } else {
                        i = ((int) f5) - 1;
                    }
                }
                iIntValue = list.get(i).intValue();
            } else {
                iIntValue = this.piecewiseColors.get(0).intValue();
            }
        } else {
            iIntValue = num.intValue();
        }
        paint.setColor(iIntValue);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Unit unit;
        Unit unit2 = null;
        if (this.rangeAngle == null) {
            unit = null;
        } else {
            f();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            e();
        }
        if (this.showIndicator) {
            g();
        }
        canvas.translate(0.0f, NumberExtKt.getDp(9.0f));
        canvas.drawPath(this.arcPath, this.arcPaint);
        List<Integer> list = this.rangeAngle;
        if (list != null) {
            b(canvas, list);
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            a(canvas);
        }
        if (this.showIndicator) {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.arcRadius = (getWidth() / 2.0f) - NumberExtKt.getDp(5.0f);
        float f = this.openAngle;
        this.startAngle = ((180.0f - f) / 2) + f;
        this.lastColorSize = this.piecewiseColors.size();
        d();
    }

    public final void refresh() {
        if (GlobalFunctionKt.isRtl()) {
            float f = this.maxValue - this.value;
            this.value = f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.value = f;
        }
        invalidate();
    }

    @NotNull
    public final PiecewiseArcView setAngleRange(@NotNull List<Integer> angleRange) {
        this.rangeAngle = angleRange;
        return this;
    }

    @NotNull
    public final PiecewiseArcView setIndicatorColor(@ColorInt int color) {
        this.indicatorColor = Integer.valueOf(color);
        return this;
    }

    @NotNull
    public final PiecewiseArcView setMaxValue(float maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    @NotNull
    public final PiecewiseArcView setOpenAngle(float openAngle) {
        this.openAngle = openAngle;
        return this;
    }

    @NotNull
    public final PiecewiseArcView setPiecewiseColor(@NotNull List<Integer> colors) {
        List<Integer> list = this.piecewiseColors;
        list.clear();
        list.addAll(colors);
        if (GlobalFunctionKt.isRtl()) {
            j.reverse(this.piecewiseColors);
        }
        return this;
    }

    @NotNull
    public final PiecewiseArcView setValue(float value) {
        this.value = value;
        return this;
    }

    @NotNull
    public final PiecewiseArcView showIndicator(boolean show) {
        this.showIndicator = show;
        return this;
    }

    public PiecewiseArcView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PiecewiseArcView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.openAngle = 90.0f;
        this.piecewiseColors = CollectionsKt__CollectionsKt.mutableListOf(-7829368, Integer.valueOf(SupportMenu.CATEGORY_MASK), -7829368, -7829368);
        this.maxValue = 100.0f;
        this.value = 100.0f;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(NumberExtKt.getDp(8.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        Unit unit = Unit.INSTANCE;
        this.arcPaint = paint;
        this.arcPath = new Path();
        this.outPath = new Path();
        this.innerPath = new Path();
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(new CornerPathEffect(NumberExtKt.getDp(2.0f)));
        this.outPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setPathEffect(new CornerPathEffect(NumberExtKt.getDp(3.0f)));
        paint3.setColor(ViewExtKt.loadColor(this, R.color.s38));
        this.innerPaint = paint3;
        this.showIndicator = true;
    }
}
