package com.huami.widget.piechart;

import androidx.core.internal.view.SupportMenu;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/widget/piechart/PieChartDataUtil;", "", "", "Lcom/huami/widget/piechart/SliceValue;", "getDefaultPieChartData", "<init>", "()V", "piechart_release"}, k = 1, mv = {1, 4, 0})
public final class PieChartDataUtil {
    public static final PieChartDataUtil INSTANCE = new PieChartDataUtil();

    private PieChartDataUtil() {
    }

    @NotNull
    public final List<SliceValue> getDefaultPieChartData() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new SliceValue[]{new SliceValue(40.0f, -16776961), new SliceValue(20.0f, -7829368), new SliceValue(20.0f, SupportMenu.CATEGORY_MASK), new SliceValue(20.0f, -16711936)});
    }
}
