package com.huami.health.bodymeasurements.bodyfat_service;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H&J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H&J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u0012"}, d2 = {"Lcom/huami/health/bodymeasurements/bodyfat_service/BodyfatService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/bodymeasurements/bodyfat_service/Weight;", "loadLatestWeight", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyScore;", "loadLatestBodyScore", "Lcom/huami/health/bodymeasurements/bodyfat_service/BMI;", "loadLatestBMI", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "loadLatestBmiDetailInfo", "Lcom/huami/health/bodymeasurements/bodyfat_service/BalanceEntry;", "loadBalanceInfo", "", "", "loadBalanceLevel", "bodyfat-service_release"}, k = 1, mv = {1, 4, 0})
public interface BodyfatService {
    @NotNull
    Flow<BalanceEntry> loadBalanceInfo(@NotNull Context context);

    @NotNull
    List<String> loadBalanceLevel(@NotNull Context context);

    @NotNull
    Flow<BMI> loadLatestBMI();

    @NotNull
    Flow<BmiDetailInfoEntry> loadLatestBmiDetailInfo(@NotNull Context context);

    @NotNull
    Flow<BodyScore> loadLatestBodyScore();

    @NotNull
    Flow<Weight> loadLatestWeight();
}
