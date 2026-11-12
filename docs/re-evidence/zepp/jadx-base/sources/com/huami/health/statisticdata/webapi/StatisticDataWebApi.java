package com.huami.health.statisticdata.webapi;

import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.model.StatisticDataModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JK\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/health/statisticdata/webapi/StatisticDataWebApi;", "", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "distributionType", "", "userId", "", "ageGroup", "gender", "version", "timeGroup", "", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "synStatisticDataFromServer", "(Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;Ljava/lang/String;IIILjava/lang/Integer;)Ljava/util/List;", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public interface StatisticDataWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static /* synthetic */ List synStatisticDataFromServer$default(StatisticDataWebApi statisticDataWebApi, DistributionTypeEnum distributionTypeEnum, String str, int i, int i2, int i3, Integer num, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: synStatisticDataFromServer");
            }
            if ((i4 & 32) != 0) {
                num = null;
            }
            return statisticDataWebApi.synStatisticDataFromServer(distributionTypeEnum, str, i, i2, i3, num);
        }
    }

    @Nullable
    List<StatisticDataModel> synStatisticDataFromServer(@NotNull DistributionTypeEnum distributionType, @NotNull String userId, int ageGroup, int gender, int version, @Nullable Integer timeGroup);
}
