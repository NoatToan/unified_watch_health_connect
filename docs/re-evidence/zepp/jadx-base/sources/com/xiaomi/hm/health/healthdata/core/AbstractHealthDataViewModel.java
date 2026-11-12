package com.xiaomi.hm.health.healthdata.core;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.helper.Resource;
import com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity;
import com.huami.bodymeasurements.temperature.model.usecase.AddManualTempUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.vo.HistoryItem;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010&¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0004J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00150\u000e2\u0006\u0010\u0014\u001a\u00020\u0004J8\u0010\u001a\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00150\u00150\u000e2\u0006\u0010\u0019\u001a\u00020\u0018J8\u0010\u001b\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00150\u00150\u000e2\u0006\u0010\u0019\u001a\u00020\u0018J8\u0010\u001c\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00150\u00150\u000e2\u0006\u0010\u0019\u001a\u00020\u0018J8\u0010\u001d\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00150\u00150\u000e2\u0006\u0010\u0019\u001a\u00020\u0018R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R%\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002000/8\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/AbstractHealthDataViewModel;", "Landroidx/lifecycle/ViewModel;", "", "syncUserData", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "item", Constant.METHOD_INSERT, "Lcom/huami/bodymeasurements/temperature/model/local/entity/ManualTempEntity;", "entity", "insertTemp", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "", "limit", "Landroidx/lifecycle/LiveData;", "", "findTopDataWithType", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HistoryItem;", "findAllByType", "userDataEntity", "Lkotlin/Pair;", "", "deleteRecord", "Ljava/util/Date;", "date", "findLatestBpRangeByDay", "findLatestBpRangeByWeek", "findLatestBpRangeByMonth", "findLatestBpRangeByYear", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "a", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "healthDataRepo", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;", "b", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;", "tempHistoryDataUseCase", "Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;", "c", "Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;", "addManualTempUseCase", "", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "tag", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "e", "Landroidx/lifecycle/MutableLiveData;", "getInsertResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "insertResultLiveData", "f", "findAllByTypeLiveData", "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractHealthDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthCoreDataRepo healthDataRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final GetTempHistoryDataUseCase tempHistoryDataUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final AddManualTempUseCase addManualTempUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Unit>> insertResultLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<HistoryItem>> findAllByTypeLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "旧数据不可删除";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$syncUserData$1", f = "AbstractHealthDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AbstractHealthDataViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                AbstractHealthDataViewModel.this.healthDataRepo.syncUserData();
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AbstractHealthDataViewModel(HealthCoreDataRepo healthCoreDataRepo, GetTempHistoryDataUseCase getTempHistoryDataUseCase, AddManualTempUseCase addManualTempUseCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(healthCoreDataRepo, (i & 2) != 0 ? null : getTempHistoryDataUseCase, (i & 4) != 0 ? null : addManualTempUseCase);
    }

    @NotNull
    public final LiveData<Pair<Boolean, UserDataEntity>> deleteRecord(@NotNull UserDataEntity userDataEntity) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (userDataEntity.getIsOldData()) {
            HMLog.debug(this.tag, a.a);
            return mutableLiveData;
        }
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1(null, this, userDataEntity, mutableLiveData), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public LiveData<List<HistoryItem>> findAllByType(@NotNull DataType type) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1(null, type, this), 2, null);
        return this.findAllByTypeLiveData;
    }

    @NotNull
    public final LiveData<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>> findLatestBpRangeByDay(@NotNull Date date) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1(null, mutableLiveData, this, date), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>> findLatestBpRangeByMonth(@NotNull Date date) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$findLatestBpRangeByMonth$$inlined$safeLaunch$1(null, mutableLiveData, this, date), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>> findLatestBpRangeByWeek(@NotNull Date date) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$findLatestBpRangeByWeek$$inlined$safeLaunch$1(null, mutableLiveData, this, date), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>> findLatestBpRangeByYear(@NotNull Date date) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$findLatestBpRangeByYear$$inlined$safeLaunch$1(null, mutableLiveData, this, date), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public LiveData<List<UserDataEntity>> findTopDataWithType(@NotNull HealthDataType type, int limit) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$findTopDataWithType$$inlined$safeLaunch$1(null, mutableLiveData, this, type, limit), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<Unit>> getInsertResultLiveData() {
        return this.insertResultLiveData;
    }

    public final void insert(@NotNull UserDataEntity item) {
        this.insertResultLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$insert$$inlined$safeLaunch$1(null, this, item), 2, null);
    }

    public final void insertTemp(@NotNull ManualTempEntity entity) {
        this.insertResultLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new AbstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1(null, this, entity), 2, null);
    }

    public final void syncUserData() {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO().plus(ExtKt.getExceptionHandler()), null, new b(null), 2, null);
    }

    public AbstractHealthDataViewModel(@NotNull HealthCoreDataRepo healthCoreDataRepo, @Nullable GetTempHistoryDataUseCase getTempHistoryDataUseCase, @Nullable AddManualTempUseCase addManualTempUseCase) {
        this.healthDataRepo = healthCoreDataRepo;
        this.tempHistoryDataUseCase = getTempHistoryDataUseCase;
        this.addManualTempUseCase = addManualTempUseCase;
        this.tag = getClass().getSimpleName();
        this.insertResultLiveData = new MutableLiveData<>();
        this.findAllByTypeLiveData = new MutableLiveData<>();
    }
}
