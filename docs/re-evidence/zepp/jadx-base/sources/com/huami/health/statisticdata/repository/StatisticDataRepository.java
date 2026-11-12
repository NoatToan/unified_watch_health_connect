package com.huami.health.statisticdata.repository;

import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.model.StatisticDataModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001JK\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J;\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0010H&¨\u0006\u0017"}, d2 = {"Lcom/huami/health/statisticdata/repository/StatisticDataRepository;", "", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "distributionType", "", "userId", "", "ageGroup", "timeGroup", "gender", "version", "", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "loadStatisticDataFromServer", "(Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;Ljava/lang/String;ILjava/lang/Integer;II)Ljava/util/List;", "dataList", "", "saveStatisticDataList", "queryStatisticDataList", "(Ljava/lang/String;IILjava/lang/Integer;)Ljava/util/List;", "deleteStatisticDataList", "(Ljava/lang/String;IILjava/lang/Integer;)V", "deleteAllStatisticData", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public interface StatisticDataRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static /* synthetic */ void deleteStatisticDataList$default(StatisticDataRepository statisticDataRepository, String str, int i, int i2, Integer num, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteStatisticDataList");
            }
            if ((i3 & 8) != 0) {
                num = null;
            }
            statisticDataRepository.deleteStatisticDataList(str, i, i2, num);
        }

        public static /* synthetic */ List loadStatisticDataFromServer$default(StatisticDataRepository statisticDataRepository, DistributionTypeEnum distributionTypeEnum, String str, int i, Integer num, int i2, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadStatisticDataFromServer");
            }
            if ((i4 & 8) != 0) {
                num = null;
            }
            return statisticDataRepository.loadStatisticDataFromServer(distributionTypeEnum, str, i, num, i2, i3);
        }

        public static /* synthetic */ List queryStatisticDataList$default(StatisticDataRepository statisticDataRepository, String str, int i, int i2, Integer num, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryStatisticDataList");
            }
            if ((i3 & 8) != 0) {
                num = null;
            }
            return statisticDataRepository.queryStatisticDataList(str, i, i2, num);
        }
    }

    void deleteAllStatisticData();

    void deleteStatisticDataList(@NotNull String distributionType, int ageGroup, int gender, @Nullable Integer timeGroup);

    @Nullable
    List<StatisticDataModel> loadStatisticDataFromServer(@NotNull DistributionTypeEnum distributionType, @NotNull String userId, int ageGroup, @Nullable Integer timeGroup, int gender, int version);

    @Nullable
    List<StatisticDataModel> queryStatisticDataList(@NotNull String distributionType, int ageGroup, int gender, @Nullable Integer timeGroup);

    void saveStatisticDataList(@NotNull List<StatisticDataModel> dataList);
}
