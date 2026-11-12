package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.CurseFactor;
import com.xiaomi.fitness.health.curse.data.CurseFactorKt;
import com.xiaomi.fitness.health.curse.data.FactorLevel;
import defpackage.ili;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001;B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J\u0018\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0014J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0014J\u0016\u00100\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0007J.\u00101\u001a\u00020%2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\b\b\u0002\u00108\u001a\u00020\u0007J\u000e\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u000207R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/SymRangeView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "source", "paint", "Landroid/graphics/Paint;", "txtPaint", "radius", "", "rectF", "Landroid/graphics/RectF;", "list", "", "Lcom/xiaomi/fitness/health/curse/view/SymRangeView$Item;", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "circleXOff", "circleW", "circleH", "circleRadius", "circleSpace", "circleXSpace", "circleTop", "circleBottom", "strokeWidth", "halfStrokeWidth", "dateToCircle", "viewHeight", "viewWidth", "onSizeChanged", "", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setFactor", "setData", "startMills", "", "inDays", "data", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "nameWidth", "getValue", EcgReportKey.symptom, "Item", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSymRangeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymRangeView.kt\ncom/xiaomi/fitness/health/curse/view/SymRangeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class SymRangeView extends View {
    private float circleBottom;
    private int circleH;
    private float circleRadius;
    private int circleSpace;
    private float circleTop;
    private int circleW;
    private float circleXOff;
    private int circleXSpace;
    private final int dateToCircle;

    @NotNull
    private CurseFactor factor;
    private float halfStrokeWidth;

    @NotNull
    private final List<Item> list;

    @NotNull
    private final Paint paint;
    private final float radius;

    @NotNull
    private final RectF rectF;
    private int source;
    private float strokeWidth;

    @NotNull
    private final Paint txtPaint;
    private int viewHeight;
    private int viewWidth;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/SymRangeView$Item;", "", "time", "", "value", "", "<init>", "(JI)V", "getTime", "()J", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        private final long time;
        private final int value;

        public Item(long j, int i) {
            this.time = j;
            this.value = i;
        }

        public static /* synthetic */ Item copy$default(Item item, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = item.time;
            }
            if ((i2 & 2) != 0) {
                i = item.value;
            }
            return item.copy(j, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final Item copy(long time, int value) {
            return new Item(time, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.time == item.time && this.value == item.value;
        }

        public final long getTime() {
            return this.time;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "Item(time=" + this.time + ", value=" + this.value + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRangeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setData$default(SymRangeView symRangeView, long j, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        symRangeView.setData(j, i, list, i2);
    }

    public final int getValue(@NotNull WomenHealthSymptoms symptom) {
        Integer mood;
        Intrinsics.checkNotNullParameter(symptom, "symptom");
        CurseFactor curseFactor = this.factor;
        if (Intrinsics.areEqual(curseFactor, CurseFactor.Hurt.INSTANCE)) {
            mood = symptom.getPain();
        } else if (Intrinsics.areEqual(curseFactor, CurseFactor.Blood.INSTANCE)) {
            mood = symptom.getHp();
        } else {
            if (!Intrinsics.areEqual(curseFactor, CurseFactor.Motion.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            mood = symptom.getMood();
        }
        if (mood != null) {
            return mood.intValue();
        }
        return -1;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Paint.Style style;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(SymRangeViewKt.bgColor(this.factor));
        this.rectF.set(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        if (this.source == 2) {
            RectF rectF = this.rectF;
            float f = this.radius;
            canvas.drawRoundRect(rectF, f, f, this.paint);
        }
        Logger.d("SymptomPeriodView", "onDraw: " + this.list);
        int size = this.list.size();
        for (int i = 0; i < size; i++) {
            Item item = this.list.get(i);
            FactorLevel factorLevelLevel2Obj = CurseFactorKt.level2Obj(item.getValue());
            Logger.d("SymptomPeriodView", "onDraw: id = " + i + "; level = " + factorLevelLevel2Obj);
            this.paint.setColor(CurseFactorKt.circleColor(factorLevelLevel2Obj, this.factor));
            float f2 = this.circleXOff + ((float) (this.circleXSpace * i));
            float right = ((float) this.circleW) + f2;
            if (AppUtil.isRTLDirection()) {
                right = getRight() - (this.circleXOff + (this.circleXSpace * i));
                f2 = right - this.circleW;
            }
            this.rectF.set(f2, this.circleTop, right, this.circleBottom);
            boolean zAreEqual = Intrinsics.areEqual(factorLevelLevel2Obj, FactorLevel.None.INSTANCE);
            Paint paint = this.paint;
            if (zAreEqual) {
                RectF rectF2 = this.rectF;
                float f3 = this.halfStrokeWidth;
                rectF2.inset(f3, f3);
                style = Paint.Style.STROKE;
            } else {
                style = Paint.Style.FILL;
            }
            paint.setStyle(style);
            RectF rectF3 = this.rectF;
            float f4 = this.circleRadius;
            canvas.drawRoundRect(rectF3, f4, f4, this.paint);
            if (zAreEqual) {
                RectF rectF4 = this.rectF;
                float f5 = this.halfStrokeWidth;
                rectF4.inset(-f5, -f5);
            }
            if (this.source == 1) {
                this.txtPaint.ascent();
                this.txtPaint.descent();
                canvas.drawText(TimeDateUtil.getDateMMddNumberFormat(item.getTime()), this.rectF.centerX(), this.rectF.bottom + this.dateToCircle, this.txtPaint);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Logger.d("SymptomPeriodView", "onMeasure: " + this.viewWidth + "  " + this.viewHeight);
        setMeasuredDimension(this.viewWidth, this.viewHeight);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.rectF.set(0.0f, 0.0f, w, h);
        Logger.d("SymptomPeriodView", "onSizeChanged2: w = " + w + "; h = " + h);
    }

    public final void setData(long startMills, int inDays, @NotNull List<WomenHealthSymptoms> data, int nameWidth) {
        int screenWidth;
        int dimension;
        Object next;
        Intrinsics.checkNotNullParameter(data, "data");
        boolean z = this.source == 2;
        float f = z ? (this.viewHeight - this.circleH) / 2.0f : 0.0f;
        this.circleTop = f;
        this.circleBottom = f + this.circleH;
        this.list.clear();
        long todayZeroMills = CurseExtKt.getTodayZeroMills();
        for (int i = 0; i < inDays; i++) {
            long j = startMills + (((long) i) * 86400000);
            if (j > todayZeroMills) {
                break;
            }
            Iterator<T> it = data.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((WomenHealthSymptoms) next).getTime() != j);
            WomenHealthSymptoms womenHealthSymptoms = (WomenHealthSymptoms) next;
            this.list.add(new Item(j, womenHealthSymptoms == null ? -1 : getValue(womenHealthSymptoms)));
        }
        if (z) {
            screenWidth = ((DisplayUtil.getScreenWidth() - (ExtUtilsKt.getDimension(ili.e) * 2)) - (ExtUtilsKt.getDimension(ili.j) * 2)) - nameWidth;
            dimension = ExtUtilsKt.getDimension(ili.f);
        } else {
            screenWidth = DisplayUtil.getScreenWidth() - (ExtUtilsKt.getDimension(ili.e) * 2);
            dimension = ExtUtilsKt.getDimension(ili.j) * 2;
        }
        this.viewWidth = Math.max(screenWidth - dimension, (int) (this.circleXOff + ((this.circleW + this.circleSpace) * this.list.size())));
        invalidate();
        requestLayout();
    }

    public final void setFactor(@NotNull CurseFactor factor, int source) {
        Intrinsics.checkNotNullParameter(factor, "factor");
        this.factor = factor;
        this.source = source;
        if (source == 1) {
            this.circleXOff = 0.0f;
            this.circleW = DisplayUtil.dip2px(23.3f);
            this.circleH = DisplayUtil.dip2px(30.0f);
            this.circleRadius = DisplayUtil.dip2px(11.67f);
            this.circleSpace = ExtUtilsKt.getDp(16);
            this.strokeWidth = DisplayUtil.dip2px(3.3f);
            this.viewHeight = DisplayUtil.dip2px(46.7f);
        } else {
            this.circleXOff = DisplayUtil.dip2px(13.3f);
            this.circleW = DisplayUtil.dip2px(11.0f);
            this.circleH = DisplayUtil.dip2px(13.0f);
            this.circleRadius = DisplayUtil.dip2px(5.5f);
            this.circleSpace = DisplayUtil.dip2px(10.0f);
            this.strokeWidth = DisplayUtil.dip2px(2.0f);
            this.viewHeight = ExtUtilsKt.getDp(30);
        }
        this.paint.setStrokeWidth(this.strokeWidth);
        this.halfStrokeWidth = this.strokeWidth / 2.0f;
        this.circleXSpace = this.circleW + this.circleSpace;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRangeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRangeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.source = 2;
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.txtPaint = paint2;
        this.radius = DisplayUtil.dip2px(12.0f);
        this.rectF = new RectF();
        this.list = new ArrayList();
        this.factor = CurseFactor.Hurt.INSTANCE;
        this.circleXOff = DisplayUtil.dip2px(13.3f);
        this.circleW = DisplayUtil.dip2px(11.0f);
        this.circleH = DisplayUtil.dip2px(13.0f);
        this.circleRadius = DisplayUtil.dip2px(5.5f);
        int iDip2px = DisplayUtil.dip2px(10.0f);
        this.circleSpace = iDip2px;
        this.circleXSpace = this.circleW + iDip2px;
        this.circleBottom = this.circleH;
        float fDip2px = DisplayUtil.dip2px(2.0f);
        this.strokeWidth = fDip2px;
        this.halfStrokeWidth = fDip2px / 2;
        this.dateToCircle = DisplayUtil.dip2px(15.0f);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(-8421505);
        paint2.setTextSize(DisplayUtil.dip2px(8.0f));
        paint2.setTextAlign(Paint.Align.CENTER);
    }

    public /* synthetic */ SymRangeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
