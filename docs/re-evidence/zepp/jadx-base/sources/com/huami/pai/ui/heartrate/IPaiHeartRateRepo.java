package com.huami.pai.ui.heartrate;

import android.util.Pair;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/huami/pai/ui/heartrate/IPaiHeartRateRepo;", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "dateString", "userId", "Lkotlinx/coroutines/flow/Flow;", "Landroid/util/Pair;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "", ParamKey.heartRateData, "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IPaiHeartRateRepo {
    @NotNull
    Flow<Pair<SparseArray<ChartData>, Integer>> heartRateData(@NotNull CoroutineScope scope, @NotNull String dateString, @NotNull String userId);
}
