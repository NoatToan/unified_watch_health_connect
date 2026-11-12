package com.xiaomi.hm.health.healthdata.ui.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.amap.api.mapcore.util.hl;
import com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2Entity;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.vo.HistoryItem;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R+\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020 0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0011¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataViewModel;", "Lcom/xiaomi/hm/health/healthdata/core/AbstractHealthDataViewModel;", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "entity", "", "a", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2Entity;", "b", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "type", "loadHistoryByType", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HistoryItem;", "item", "deleteHistory", Constant.METHOD_INSERT, "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "typeLiveData", "Landroidx/lifecycle/LiveData;", "", "h", "Landroidx/lifecycle/LiveData;", "getHistoryLiveData", "()Landroidx/lifecycle/LiveData;", "historyLiveData", "", "i", "getShowNoData", "showNoData", z.j, "entityLiveData", "Lkotlin/Pair;", hl.k, "getDeleteHealthResultLiveData", "deleteHealthResultLiveData", "l", "spO2EntityLiveData", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "healthDataRepo", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;", "tempDataUseCase", "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataViewModel extends AbstractHealthDataViewModel {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DataType> typeLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<HistoryItem>> historyLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showNoData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<UserDataEntity> entityLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Boolean, UserDataEntity>> deleteHealthResultLiveData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Spo2Entity> spO2EntityLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "type is null ";
        }
    }

    public HealthDataViewModel(@NotNull HealthCoreDataRepo healthCoreDataRepo, @NotNull GetTempHistoryDataUseCase getTempHistoryDataUseCase) {
        super(healthCoreDataRepo, getTempHistoryDataUseCase, null, 4, null);
        MutableLiveData<DataType> mutableLiveData = new MutableLiveData<>();
        this.typeLiveData = mutableLiveData;
        LiveData<List<HistoryItem>> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function<DataType, LiveData<List<? extends HistoryItem>>>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            public final LiveData<List<? extends HistoryItem>> apply(DataType dataType) {
                return this.a.findAllByType(dataType);
            }
        });
        this.historyLiveData = liveDataSwitchMap;
        this.showNoData = Transformations.map(liveDataSwitchMap, new Function<List<? extends HistoryItem>, Boolean>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(List<? extends HistoryItem> list) {
                List<? extends HistoryItem> list2 = list;
                return Boolean.valueOf(list2 == null || list2.isEmpty());
            }
        });
        MutableLiveData<UserDataEntity> mutableLiveData2 = new MutableLiveData<>();
        this.entityLiveData = mutableLiveData2;
        this.deleteHealthResultLiveData = Transformations.switchMap(mutableLiveData2, new Function<UserDataEntity, LiveData<Pair<? extends Boolean, ? extends UserDataEntity>>>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel$special$$inlined$switchMap$2
            @Override // androidx.arch.core.util.Function
            public final LiveData<Pair<? extends Boolean, ? extends UserDataEntity>> apply(UserDataEntity userDataEntity) {
                return this.a.deleteRecord(userDataEntity);
            }
        });
        this.spO2EntityLiveData = new MutableLiveData<>();
    }

    private final void a(UserDataEntity entity) {
        this.entityLiveData.setValue(entity);
    }

    private final void b(Spo2Entity entity) {
        this.spO2EntityLiveData.setValue(entity);
    }

    public final void deleteHistory(@NotNull HistoryItem item) {
        DataType value = this.typeLiveData.getValue();
        if (value == null) {
            HMLog.warn$default("HealthDataViewModel", null, a.a, 2, null);
        } else if (value instanceof HealthDataType) {
            UserDataEntity userDataEntity = new UserDataEntity(null, HMPersonInfo.getInstance().getUserInfo().getUserid(), (HealthDataType) value, new Date(item.getTimeStamp()), null, null, null, null, 241, null);
            userDataEntity.setOldData(item.getOldData());
            Unit unit = Unit.INSTANCE;
            a(userDataEntity);
        }
    }

    @NotNull
    public final LiveData<Pair<Boolean, UserDataEntity>> getDeleteHealthResultLiveData() {
        return this.deleteHealthResultLiveData;
    }

    @NotNull
    public final LiveData<List<HistoryItem>> getHistoryLiveData() {
        return this.historyLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getShowNoData() {
        return this.showNoData;
    }

    public final void insert() {
        insert(new UserDataEntity(null, HMPersonInfo.getInstance().getUserInfo().getUserid(), HealthDataType.BMI, null, null, "20", null, null, 216, null));
    }

    public final void loadHistoryByType(@NotNull DataType type) {
        this.typeLiveData.setValue(type);
    }
}
