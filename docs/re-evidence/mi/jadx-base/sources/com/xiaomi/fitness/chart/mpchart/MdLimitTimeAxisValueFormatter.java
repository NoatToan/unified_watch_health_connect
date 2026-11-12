package com.xiaomi.fitness.chart.mpchart;

import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.xiaomi.fitness.chart.util.ChartUtil;
import defpackage.fpc;
import defpackage.ft1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/chart/mpchart/MdLimitTimeAxisValueFormatter;", "Lfpc;", "", "value", "Lft1;", "axis", "", "getAxisLabel", "(FLft1;)Ljava/lang/String;", "getFormattedValue", "", "showCount", "I", "getShowCount", "()I", "<init>", "(I)V", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMdLimitTimeAxisValueFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MdLimitTimeAxisValueFormatter.kt\ncom/xiaomi/fitness/chart/mpchart/MdLimitTimeAxisValueFormatter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1557#2:86\n1628#2,3:87\n*S KotlinDebug\n*F\n+ 1 MdLimitTimeAxisValueFormatter.kt\ncom/xiaomi/fitness/chart/mpchart/MdLimitTimeAxisValueFormatter\n*L\n63#1:86\n63#1:87,3\n*E\n"})
public final class MdLimitTimeAxisValueFormatter implements fpc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "MdLimitTimeAxisValueFormatter";
    private final int showCount;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/chart/mpchart/MdLimitTimeAxisValueFormatter$Companion;", "", "<init>", "()V", "TAG", "", "calculateLabelCount", "", "entries", "", "Lcom/github/mikephil/charting/data/Entry;", "xAxis", "Lcom/github/mikephil/charting/components/XAxis;", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int calculateLabelCount(@NotNull List<? extends Entry> entries, @NotNull XAxis xAxis) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            Intrinsics.checkNotNullParameter(xAxis, "xAxis");
            if (!entries.isEmpty()) {
                return ((int) ((((Entry) CollectionsKt___CollectionsKt.last((List) entries)).getX() - ((Entry) CollectionsKt___CollectionsKt.first((List) entries)).getX()) + 1.0f)) + ((int) Math.floor(xAxis.getSpaceMin())) + ((int) Math.floor(xAxis.getSpaceMax()));
            }
            return 0;
        }
    }

    public MdLimitTimeAxisValueFormatter() {
        this(0, 1, null);
    }

    @Nullable
    public final String getAxisLabel(float value, @Nullable ft1 axis) {
        List listListOf;
        if (value % 1.0f != 0.0f) {
            return "";
        }
        int axisMinimum = (int) ((axis != null ? axis.getAxisMinimum() : 0.0f) + (axis != null ? axis.getSpaceMin() : 0.0f));
        int axisMaximum = (int) ((axis != null ? axis.getAxisMaximum() : 0.0f) - (axis != null ? axis.getSpaceMax() : 0.0f));
        int i = axisMaximum - axisMinimum;
        int iCoerceAtLeast = this.showCount;
        if (iCoerceAtLeast < 0) {
            iCoerceAtLeast = axis != null ? RangesKt___RangesKt.coerceAtLeast(axis.getLabelCount(), 2) : 2;
        }
        if (iCoerceAtLeast == 1) {
            listListOf = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(axisMinimum));
        } else if (iCoerceAtLeast != 2) {
            float f = i / (iCoerceAtLeast - 1);
            IntRange intRangeUntil = RangesKt___RangesKt.until(0, iCoerceAtLeast);
            listListOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                listListOf.add(Integer.valueOf(MathKt__MathJVMKt.roundToInt(axisMinimum + (((IntIterator) it).nextInt() * f))));
            }
        } else {
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(axisMinimum), Integer.valueOf(axisMaximum)});
        }
        return listListOf.contains(Integer.valueOf((int) value)) ? ChartUtil.INSTANCE.convertToDayString((long) value) : "";
    }

    @Override // defpackage.fpc
    @Nullable
    public String getFormattedValue(float value, @Nullable ft1 axis) {
        return getAxisLabel(value, axis);
    }

    public final int getShowCount() {
        return this.showCount;
    }

    public MdLimitTimeAxisValueFormatter(int i) {
        this.showCount = i;
    }

    public /* synthetic */ MdLimitTimeAxisValueFormatter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}
