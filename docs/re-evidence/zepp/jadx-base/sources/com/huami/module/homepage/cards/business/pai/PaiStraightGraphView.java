package com.huami.module.homepage.cards.business.pai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 [2\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010U\u001a\u00020T\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V\u0012\b\b\u0002\u0010X\u001a\u00020\u0016¢\u0006\u0004\bY\u0010ZJ\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J(\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0014\u0010\u0018\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\nJ\u001a\u0010%\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160#J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\nJ\u000e\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nJ\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0014R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u00101\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00100R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010.R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010?\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010:R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00106R\u0016\u0010G\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010:R\u0016\u0010I\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010:R\u0016\u0010K\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00106R\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010.R\u0016\u0010S\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010.¨\u0006\\"}, d2 = {"Lcom/huami/module/homepage/cards/business/pai/PaiStraightGraphView;", "Landroid/view/View;", "", "Lcom/huami/module/homepage/cards/business/pai/StraightGraphParam;", "params", GoogleApiAvailabilityLight.a, "", "e", "h", "g", "", "offSet", "f", "value", "i", "Landroid/graphics/Canvas;", "canvas", "", "text", "textMaxHeight", "a", "b", "", "c", "setParams", "maxValue", "setMaxValue", "goalLineValue", "setGoalLineValue", "marginStart", "setMarginStart", "marginEnd", "setMarginEnd", "radius", "setConnerRadius", "Lkotlin/Pair;", "coordinateYValue", "setCoordinateYValue", "", "show", "setShowBottomLine", "graphMaxHeight", "setGraphMaxHeight", "graphBottomToTextMargin", "setGraphBottomToTextMargin", "onDraw", "F", "graphWidth", "Z", "showBottomLine", z.j, "Lkotlin/Pair;", "Landroid/graphics/Paint;", hl.k, "Landroid/graphics/Paint;", "backPaint", "Landroid/graphics/Path;", "l", "Landroid/graphics/Path;", "backPath", "m", "graphPaint", GoogleApiAvailabilityLight.b, "graphPath", "Landroid/text/TextPaint;", "o", "Landroid/text/TextPaint;", "textPaint", b.r, "dashPaint", DTransferConstants.SEARCH_KEY, "dashPath", "r", "bottomPath", SOAP.XMLNS, "bottomPaint", "", "t", "Ljava/util/List;", "graphParams", "u", "averageOffSet", "v", "coordinateWidth", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PaiStraightGraphView extends View {

    @Deprecated
    public static final float DEFAULT_MAX_VALUE = 100.0f;

    @NotNull
    private static final a w = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float radius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float graphMaxHeight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float graphWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float maxValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float marginStart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float marginEnd;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float goalLineValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean showBottomLine;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float graphBottomToTextMargin;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Pair<Integer, Integer> coordinateYValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Paint backPaint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Path backPath;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Paint graphPaint;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Path graphPath;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Paint dashPaint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Path dashPath;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Path bottomPath;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Paint bottomPaint;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final List<StraightGraphParam> graphParams;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float averageOffSet;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float coordinateWidth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/business/pai/PaiStraightGraphView$a", "", "", "DEFAULT_MAX_VALUE", "F", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public PaiStraightGraphView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PaiStraightGraphView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PaiStraightGraphView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(Canvas canvas, float offSet, String text, float textMaxHeight) {
        canvas.drawText(text, (this.marginStart + offSet) - (this.textPaint.measureText(text) / 2.0f), this.graphMaxHeight + this.graphBottomToTextMargin + textMaxHeight, this.textPaint);
    }

    private final void b(Canvas canvas) {
        Pair<Integer, Integer> pair = this.coordinateYValue;
        if (pair == null) {
            return;
        }
        float width = ((getWidth() - this.marginStart) - this.coordinateWidth) + NumberExtKt.getDp(15.0f);
        canvas.drawText(I18nKt.i18n(pair.getFirst().intValue()), width, c(I18nKt.i18n(pair.getFirst().intValue())) + 0.0f, this.textPaint);
        canvas.drawText(I18nKt.i18n(pair.getSecond().intValue()), width, this.graphMaxHeight, this.textPaint);
    }

    private final int c(String text) {
        Rect rect = new Rect();
        this.textPaint.getTextBounds(text, 0, text.length(), rect);
        return rect.height();
    }

    private final List<StraightGraphParam> d(List<StraightGraphParam> params) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(params, 10));
        Iterator<T> it2 = params.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((StraightGraphParam) it2.next()).getIndex()));
        }
        List listReversed = CollectionsKt___CollectionsKt.reversed(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(params, 10));
        for (StraightGraphParam straightGraphParam : params) {
            arrayList2.add(new StraightGraphParam(((Number) listReversed.get(straightGraphParam.getIndex())).intValue(), straightGraphParam.getValue(), straightGraphParam.getText(), straightGraphParam.getColor()));
        }
        return arrayList2;
    }

    private final void e() {
        Pair<Integer, Integer> pair = this.coordinateYValue;
        this.coordinateWidth = pair == null ? 0.0f : Math.max(this.textPaint.measureText(I18nKt.i18n(pair.getFirst().intValue())), this.textPaint.measureText(I18nKt.i18n(pair.getSecond().intValue()))) + NumberExtKt.getDp(15.0f);
        this.averageOffSet = this.graphParams.size() > 1 ? (((getWidth() - this.marginStart) - this.marginEnd) - this.coordinateWidth) / (this.graphParams.size() - 1) : 0.0f;
    }

    private final void f(float offSet) {
        this.backPath.reset();
        Path path = this.backPath;
        float f = this.marginStart;
        float f2 = this.graphWidth;
        RectF rectF = new RectF((f + offSet) - (f2 / 2.0f), 0.0f, f + offSet + (f2 / 2.0f), this.graphMaxHeight);
        float f3 = this.radius;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
    }

    private final void g() {
        this.bottomPath.reset();
        this.bottomPath.moveTo(this.marginStart - NumberExtKt.getDp(5.0f), this.graphMaxHeight);
        this.bottomPath.lineTo(((getWidth() - this.marginEnd) - this.coordinateWidth) + NumberExtKt.getDp(5.0f), this.graphMaxHeight);
    }

    private final void h() {
        this.dashPath.reset();
        float f = 1;
        this.dashPath.moveTo(this.marginStart - NumberExtKt.getDp(10.0f), this.graphMaxHeight * (f - (this.goalLineValue / this.maxValue)));
        this.dashPath.lineTo(((getWidth() - this.marginEnd) - this.coordinateWidth) + NumberExtKt.getDp(10.0f), this.graphMaxHeight * (f - (this.goalLineValue / this.maxValue)));
    }

    private final void i(float value, float offSet) {
        this.graphPath.reset();
        Path path = this.graphPath;
        float f = (this.marginStart + offSet) - (this.graphWidth / 2.0f);
        float f2 = this.graphMaxHeight;
        Float fValueOf = Float.valueOf(value);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = this.maxValue;
        if (!(fFloatValue <= fFloatValue2)) {
            fValueOf = null;
        }
        if (fValueOf != null) {
            fFloatValue2 = fValueOf.floatValue();
        }
        RectF rectF = new RectF(f, f2 - ((fFloatValue2 / this.maxValue) * f2), this.marginStart + offSet + (this.graphWidth / 2.0f), this.graphMaxHeight);
        float f3 = this.radius;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
    }

    public static /* synthetic */ void j(PaiStraightGraphView paiStraightGraphView, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        paiStraightGraphView.i(f, f2);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.graphParams.isEmpty()) {
            return;
        }
        e();
        List<StraightGraphParam> list = this.graphParams;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(c(((StraightGraphParam) it2.next()).getText())));
        }
        Float fM3963maxOrNull = CollectionsKt___CollectionsKt.m3963maxOrNull((Iterable<Float>) arrayList);
        float dp = fM3963maxOrNull == null ? NumberExtKt.getDp(18.0f) : fM3963maxOrNull.floatValue();
        for (StraightGraphParam straightGraphParam : this.graphParams) {
            f(straightGraphParam.getIndex() * this.averageOffSet);
            i(straightGraphParam.getValue(), straightGraphParam.getIndex() * this.averageOffSet);
            canvas.drawPath(this.backPath, this.backPaint);
            if (!this.graphPath.isEmpty()) {
                Path path = this.graphPath;
                Paint paint = this.graphPaint;
                paint.setColor(straightGraphParam.getColor());
                Unit unit = Unit.INSTANCE;
                canvas.drawPath(path, paint);
            }
            a(canvas, straightGraphParam.getIndex() * this.averageOffSet, straightGraphParam.getText(), dp);
        }
        h();
        canvas.drawPath(this.dashPath, this.dashPaint);
        b(canvas);
        if (this.showBottomLine) {
            g();
            canvas.drawPath(this.bottomPath, this.bottomPaint);
        }
    }

    @NotNull
    public final PaiStraightGraphView setConnerRadius(float radius) {
        this.radius = radius;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setCoordinateYValue(@NotNull Pair<Integer, Integer> coordinateYValue) {
        this.coordinateYValue = coordinateYValue;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setGoalLineValue(float goalLineValue) {
        this.goalLineValue = goalLineValue;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setGraphBottomToTextMargin(float graphBottomToTextMargin) {
        this.graphBottomToTextMargin = graphBottomToTextMargin;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setGraphMaxHeight(float graphMaxHeight) {
        this.graphMaxHeight = graphMaxHeight;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setMarginEnd(float marginEnd) {
        this.marginEnd = marginEnd;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setMarginStart(float marginStart) {
        this.marginStart = marginStart;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setMaxValue(float maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    public final void setParams(@NotNull List<StraightGraphParam> params) {
        this.graphParams.clear();
        List<StraightGraphParam> list = this.graphParams;
        if (GlobalFunctionKt.isRtl()) {
            params = d(params);
        }
        list.addAll(params);
        invalidate();
    }

    @NotNull
    public final PaiStraightGraphView setShowBottomLine(boolean show) {
        this.showBottomLine = show;
        return this;
    }

    @JvmOverloads
    public PaiStraightGraphView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.radius = NumberExtKt.getDp(4.0f);
        this.graphMaxHeight = NumberExtKt.getDp(56.0f);
        this.graphWidth = NumberExtKt.getDp(8.0f);
        this.maxValue = 100.0f;
        this.graphBottomToTextMargin = NumberExtKt.getDp(4.0f);
        Paint paint = new Paint(1);
        int i2 = R.color.s4;
        paint.setColor(ViewExtKt.loadColor(this, i2));
        Unit unit = Unit.INSTANCE;
        this.backPaint = paint;
        this.backPath = new Path();
        this.graphPaint = new Paint(1);
        this.graphPath = new Path();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(NumberExtKt.getSp(12));
        textPaint.setColor(ViewExtKt.loadColor(this, R.color.s2));
        this.textPaint = textPaint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ViewExtKt.loadColor(this, R.color.s3));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(NumberExtKt.getDp(1.0f));
        paint2.setPathEffect(new DashPathEffect(new float[]{NumberExtKt.getDp(3.0f), NumberExtKt.getDp(3.0f), NumberExtKt.getDp(3.0f), NumberExtKt.getDp(3.0f)}, 1.0f));
        this.dashPaint = paint2;
        this.dashPath = new Path();
        this.bottomPath = new Path();
        Paint paint3 = new Paint(1);
        paint3.setColor(ViewExtKt.loadColor(this, i2));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(NumberExtKt.getDp(0.5f));
        this.bottomPaint = paint3;
        this.graphParams = new ArrayList();
    }

    @NotNull
    public final PaiStraightGraphView setGoalLineValue(int goalLineValue) {
        this.goalLineValue = goalLineValue;
        return this;
    }

    @NotNull
    public final PaiStraightGraphView setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        return this;
    }
}
