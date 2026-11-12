package com.huami.sleep.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/view/SleepPosCircleView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "Lcom/huami/sleep/view/SleepPosCircleView$Item;", "mItems", "setData", "value", "a", "Ljava/util/List;", "setMItems", "(Ljava/util/List;)V", "Landroid/graphics/Paint;", "b", "Lkotlin/Lazy;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Item", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepPosCircleView extends View {
    private static final int c = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<Item> mItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPaint;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/view/SleepPosCircleView$Item;", "", "", "component1", "component2", "mColor", "mValue", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMColor", "()I", "b", "getMValue", "<init>", "(II)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Item {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int mColor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int mValue;

        public Item(int i, int i2) {
            this.mColor = i;
            this.mValue = i2;
        }

        public static /* synthetic */ Item copy$default(Item item, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = item.mColor;
            }
            if ((i3 & 2) != 0) {
                i2 = item.mValue;
            }
            return item.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMColor() {
            return this.mColor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMValue() {
            return this.mValue;
        }

        @NotNull
        public final Item copy(int mColor, int mValue) {
            return new Item(mColor, mValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.mColor == item.mColor && this.mValue == item.mValue;
        }

        public final int getMColor() {
            return this.mColor;
        }

        public final int getMValue() {
            return this.mValue;
        }

        public int hashCode() {
            return (this.mColor * 31) + this.mValue;
        }

        @NotNull
        public String toString() {
            return "Item(mColor=" + this.mColor + ", mValue=" + this.mValue + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Paint> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    @JvmOverloads
    public SleepPosCircleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepPosCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepPosCircleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Paint getMPaint() {
        return (Paint) this.mPaint.getValue();
    }

    private final void setMItems(List<Item> list) {
        this.mItems = list;
        invalidate();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (this.mItems.isEmpty() || canvas == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int iIntValue = 0;
        for (Item item : this.mItems) {
            if (item.getMValue() > 0) {
                arrayList.add(Integer.valueOf(item.getMValue()));
                arrayList2.add(Integer.valueOf(item.getMColor()));
                iIntValue += item.getMValue();
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        float width = getWidth() / 10.0f;
        getMPaint().setStrokeWidth(width);
        RectF rectF = new RectF(width, width, getWidth() - width, getHeight() - width);
        boolean z = arrayList.size() > 1;
        float fFloatValue = 270.0f;
        float size = 360.0f - (z ? arrayList.size() * 5 : 0);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(new Pair(Integer.valueOf(i), Integer.valueOf(((Number) obj).intValue())));
            i = i2;
        }
        List<Pair> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.huami.sleep.view.SleepPosCircleView$onDraw$lambda-6$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Pair) t).getSecond(), (Integer) ((Pair) t2).getSecond());
            }
        });
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        for (Pair pair : listSortedWith) {
            float fFloatValue2 = (((Number) pair.getSecond()).floatValue() / iIntValue) * size;
            if (fFloatValue2 < 5.0f) {
                fFloatValue2 = 5.0f;
            }
            size -= fFloatValue2;
            iIntValue -= ((Number) pair.getSecond()).intValue();
            arrayList4.add(new Pair(pair.getFirst(), Float.valueOf(fFloatValue2)));
        }
        for (Pair pair2 : CollectionsKt___CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.huami.sleep.view.SleepPosCircleView$onDraw$lambda-6$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Pair) t).getFirst(), (Integer) ((Pair) t2).getFirst());
            }
        })) {
            Path path = new Path();
            path.addArc(rectF, fFloatValue, ((Number) pair2.getSecond()).floatValue());
            getMPaint().setColor(((Number) arrayList2.get(((Number) pair2.getFirst()).intValue())).intValue());
            canvas.drawPath(path, getMPaint());
            fFloatValue += ((Number) pair2.getSecond()).floatValue();
            if (z) {
                fFloatValue += 5;
            }
        }
    }

    public final void setData(@NotNull List<Item> mItems) {
        setMItems(mItems);
        invalidate();
    }

    @JvmOverloads
    public SleepPosCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mItems = new ArrayList();
        this.mPaint = LazyKt__LazyJVMKt.lazy(a.a);
    }
}
