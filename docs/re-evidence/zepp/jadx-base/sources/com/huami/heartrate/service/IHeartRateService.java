package com.huami.heartrate.service;

import android.content.Context;
import com.huami.heartrate.view.AbsHeartRateChartView;
import com.huami.tools.analytics.DbUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H&J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lcom/huami/heartrate/service/IHeartRateService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/heartrate/service/HeartRate;", "loadLatestManualHeartRate", "Lcom/huami/heartrate/service/HeartRateInfo;", "loadLatestHeartRateInfo", "Ljava/util/Date;", "date", "loadHeartRateInfo", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/heartrate/view/AbsHeartRateChartView;", "buildHeartRateChartView", "heartrate-service_release"}, k = 1, mv = {1, 5, 1})
public interface IHeartRateService {
    @NotNull
    AbsHeartRateChartView buildHeartRateChartView(@NotNull Context context);

    @NotNull
    Flow<HeartRateInfo> loadHeartRateInfo(@NotNull Date date);

    @NotNull
    Flow<HeartRateInfo> loadLatestHeartRateInfo();

    @NotNull
    Flow<HeartRate> loadLatestManualHeartRate();
}
