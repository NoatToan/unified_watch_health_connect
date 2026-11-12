package com.huami.health.statisticdata.repository;

import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.model.StatisticDataModel;
import com.huami.health.statisticdata.persistence.StatisticDataDatabase;
import com.huami.health.statisticdata.persistence.StatisticDataEntity;
import com.huami.health.statisticdata.webapi.StatisticDataWebApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 JI\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J9\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0010H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/health/statisticdata/repository/StatisticDataRepositoryImpl;", "Lcom/huami/health/statisticdata/repository/StatisticDataRepository;", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "distributionType", "", "userId", "", "ageGroup", "timeGroup", "gender", "version", "", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "loadStatisticDataFromServer", "(Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;Ljava/lang/String;ILjava/lang/Integer;II)Ljava/util/List;", "dataList", "", "saveStatisticDataList", "queryStatisticDataList", "(Ljava/lang/String;IILjava/lang/Integer;)Ljava/util/List;", "deleteStatisticDataList", "(Ljava/lang/String;IILjava/lang/Integer;)V", "deleteAllStatisticData", "Lcom/huami/health/statisticdata/persistence/StatisticDataDatabase;", "a", "Lcom/huami/health/statisticdata/persistence/StatisticDataDatabase;", "database", "Lcom/huami/health/statisticdata/webapi/StatisticDataWebApi;", "b", "Lcom/huami/health/statisticdata/webapi/StatisticDataWebApi;", "webApi", "<init>", "(Lcom/huami/health/statisticdata/persistence/StatisticDataDatabase;Lcom/huami/health/statisticdata/webapi/StatisticDataWebApi;)V", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final class StatisticDataRepositoryImpl implements StatisticDataRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StatisticDataDatabase database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final StatisticDataWebApi webApi;

    public StatisticDataRepositoryImpl(@NotNull StatisticDataDatabase statisticDataDatabase, @NotNull StatisticDataWebApi statisticDataWebApi) {
        this.database = statisticDataDatabase;
        this.webApi = statisticDataWebApi;
    }

    @Override // com.huami.health.statisticdata.repository.StatisticDataRepository
    public void deleteAllStatisticData() {
        this.database.statisticDataDao().deleteAll();
    }

    @Override // com.huami.health.statisticdata.repository.StatisticDataRepository
    public void deleteStatisticDataList(@NotNull String distributionType, int ageGroup, int gender, @Nullable Integer timeGroup) {
        if (timeGroup != null) {
            this.database.statisticDataDao().deleteByAgeGroupAndGender(distributionType, ageGroup, gender, timeGroup.intValue());
        } else {
            this.database.statisticDataDao().deleteByAgeGroupAndGender(distributionType, ageGroup, gender);
        }
    }

    @Override // com.huami.health.statisticdata.repository.StatisticDataRepository
    @Nullable
    public List<StatisticDataModel> loadStatisticDataFromServer(@NotNull DistributionTypeEnum distributionType, @NotNull String userId, int ageGroup, @Nullable Integer timeGroup, int gender, int version) {
        return this.webApi.synStatisticDataFromServer(distributionType, userId, ageGroup, gender, version, timeGroup);
    }

    @Override // com.huami.health.statisticdata.repository.StatisticDataRepository
    @Nullable
    public List<StatisticDataModel> queryStatisticDataList(@NotNull String distributionType, int ageGroup, int gender, @Nullable Integer timeGroup) {
        List<StatisticDataEntity> listQueryStatisticDataEntityList = timeGroup != null ? this.database.statisticDataDao().queryStatisticDataEntityList(distributionType, ageGroup, gender, timeGroup.intValue()) : this.database.statisticDataDao().queryStatisticDataEntityList(distributionType, ageGroup, gender);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryStatisticDataEntityList, 10));
        for (StatisticDataEntity statisticDataEntity : listQueryStatisticDataEntityList) {
            arrayList.add(new StatisticDataModel(statisticDataEntity.getVersion(), statisticDataEntity.getAgeGroup(), statisticDataEntity.getTimeGroup(), statisticDataEntity.getItemType(), statisticDataEntity.getGender(), statisticDataEntity.getCategory(), statisticDataEntity.getCount(), statisticDataEntity.getLocation(), statisticDataEntity.getCategoryCount()));
        }
        return arrayList;
    }

    @Override // com.huami.health.statisticdata.repository.StatisticDataRepository
    public void saveStatisticDataList(@NotNull List<StatisticDataModel> dataList) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dataList, 10));
        for (StatisticDataModel statisticDataModel : dataList) {
            arrayList.add(new StatisticDataEntity(0L, statisticDataModel.getVersion(), statisticDataModel.getAgeGroup(), statisticDataModel.getTimeGroup(), statisticDataModel.getItemType(), statisticDataModel.getGender(), statisticDataModel.getCategory(), statisticDataModel.getCount(), statisticDataModel.getLocation(), statisticDataModel.getCategoryCount(), 1, null));
        }
        this.database.statisticDataDao().insertStatisticDataEntityList(arrayList);
    }
}
