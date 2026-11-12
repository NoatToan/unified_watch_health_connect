package com.xiaomi.hm.health.healthdata.utils.stress;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.piechart.SliceValue;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StressLevelRatio;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/stress/StressPieChartDataUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressLevelRatio;", "levelRatio", "", "Lcom/huami/widget/piechart/SliceValue;", "getPieChartData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressPieChartDataUtil {

    @NotNull
    public static final StressPieChartDataUtil INSTANCE = new StressPieChartDataUtil();

    private StressPieChartDataUtil() {
    }

    @NotNull
    public final List<SliceValue> getPieChartData(@NotNull Context context, @NotNull StressLevelRatio levelRatio) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new SliceValue[]{new SliceValue(levelRatio.getRelaxRatio(), ContextCompat.getColor(context, R.color.s15)), new SliceValue(levelRatio.getNormalRatio(), ContextCompat.getColor(context, R.color.s20)), new SliceValue(levelRatio.getMediumRatio(), ContextCompat.getColor(context, R.color.s33)), new SliceValue(levelRatio.getHighRatio(), ContextCompat.getColor(context, R.color.s30))});
    }
}
