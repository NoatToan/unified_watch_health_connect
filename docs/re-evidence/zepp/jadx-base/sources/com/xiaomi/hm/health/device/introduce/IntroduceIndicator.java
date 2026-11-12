package com.xiaomi.hm.health.device.introduce;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b5\u00109B#\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010:\u001a\u00020\u0002¢\u0006\u0004\b5\u0010;J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR*\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\fR\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010/\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001aR\u001d\u00102\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010\u001a¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/IntroduceIndicator;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "a", "F", "selectSize", "b", "normalSize", "c", "selectRadius", GoogleApiAvailabilityLight.a, "normalRadius", "e", "centerGap", "value", "f", LogUtil.I, "getCount", "()I", "setCount", "(I)V", "count", "g", "getSelectIndex", "setSelectIndex", "selectIndex", "h", "realWidth", "i", "realHeight", z.j, "centerY", "Landroid/graphics/Paint;", hl.k, "Landroid/graphics/Paint;", "paint", "l", "Lkotlin/Lazy;", "getSelectColor", "selectColor", "m", "getNormalColor", "normalColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class IntroduceIndicator extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float selectSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float normalSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float selectRadius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float normalRadius;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float centerGap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int count;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int selectIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int realWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int realHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float centerY;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy normalColor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(IntroduceIndicator.this.getContext(), R.color.s3);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(IntroduceIndicator.this.getContext(), R.color.s2);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    public IntroduceIndicator(@NotNull Context context) {
        this(context, null);
    }

    private final int getNormalColor() {
        return ((Number) this.normalColor.getValue()).intValue();
    }

    private final int getSelectColor() {
        return ((Number) this.selectColor.getValue()).intValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getCount() {
        return this.count;
    }

    public final int getSelectIndex() {
        return this.selectIndex;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        float f = this.selectRadius;
        Iterator<Integer> it2 = e.until(0, this.count).iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            this.paint.setColor(getNormalColor());
            canvas.drawCircle(f, this.centerY, this.normalRadius, this.paint);
            f += this.centerGap;
        }
        this.paint.setColor(getSelectColor());
        float f2 = this.selectRadius;
        canvas.drawCircle((this.centerGap * this.selectIndex) + f2, this.centerY, f2, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.realWidth, this.realHeight);
    }

    public final void setCount(int i) {
        this.count = i;
        this.realWidth = (int) ((this.centerGap * (i - 1)) + this.selectSize);
        invalidate();
    }

    public final void setSelectIndex(int i) {
        this.selectIndex = i;
        invalidate();
    }

    public IntroduceIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public IntroduceIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float fDp2px = ViewUtils.dp2px(getContext(), 8.0f);
        this.selectSize = fDp2px;
        float fDp2px2 = ViewUtils.dp2px(getContext(), 7.0f);
        this.normalSize = fDp2px2;
        this.selectRadius = fDp2px / 2.0f;
        this.normalRadius = fDp2px2 / 2.0f;
        this.centerGap = ViewUtils.dp2px(getContext(), 16.0f);
        int i2 = (int) fDp2px;
        this.realHeight = i2;
        this.centerY = i2 / 2.0f;
        this.paint = new Paint(1);
        this.selectColor = LazyKt__LazyJVMKt.lazy(new b());
        this.normalColor = LazyKt__LazyJVMKt.lazy(new a());
    }
}
