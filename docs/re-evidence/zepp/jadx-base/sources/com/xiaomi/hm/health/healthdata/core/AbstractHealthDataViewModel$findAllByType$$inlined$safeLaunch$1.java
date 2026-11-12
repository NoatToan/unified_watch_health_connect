package com.xiaomi.hm.health.healthdata.core;

import com.huami.account.HMLoginManager;
import com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.ui.vo.HistoryItem;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1", f = "AbstractHealthDataViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DataType c;
    public final /* synthetic */ AbstractHealthDataViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1(Continuation continuation, DataType dataType, AbstractHealthDataViewModel abstractHealthDataViewModel) {
        super(2, continuation);
        this.c = dataType;
        this.d = abstractHealthDataViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AbstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1 abstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1 = new AbstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1(continuation, this.c, this.d);
        abstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1.b = obj;
        return abstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AbstractHealthDataViewModel$findAllByType$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<HistoryItem> listEmptyList;
        long userCreateTimeStamp;
        ArrayList arrayList;
        boolean z;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DataType dataType = this.c;
            if (dataType instanceof HealthDataType) {
                listEmptyList = DataConverterKt.toHealthHistoryData(CollectionsKt___CollectionsKt.sortedWith(this.d.healthDataRepo.findAllByType((HealthDataType) this.c), new Comparator() { // from class: com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$findAllByType$lambda-7$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(((UserDataEntity) t2).getUploadTime(), ((UserDataEntity) t).getUploadTime());
                    }
                }));
            } else if (dataType instanceof TemperatureDataType) {
                String huamiId = HMLoginManager.getHuamiId();
                if (this.d.tempHistoryDataUseCase == null) {
                    listEmptyList = null;
                } else {
                    GetTempHistoryDataUseCase getTempHistoryDataUseCase = this.d.tempHistoryDataUseCase;
                    this.a = 1;
                    obj = getTempHistoryDataUseCase.execute(huamiId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            userCreateTimeStamp = HealthDataTimeUtils.INSTANCE.getUserCreateTimeStamp();
            arrayList = new ArrayList();
            for (Object obj2 : listEmptyList) {
                if (((HistoryItem) obj2).getTimeStamp() < userCreateTimeStamp) {
                    z = true;
                } else {
                    z = false;
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            this.d.findAllByTypeLiveData.postValue(arrayList);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        listEmptyList = DataConverterKt.toTempHistoryData(CollectionsKt___CollectionsKt.sortedWith((Iterable) obj, new Comparator() { // from class: com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$findAllByType$lambda-7$lambda-5$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t2).getTimestamp()), Long.valueOf(((TemperatureVo) t).getTimestamp()));
            }
        }));
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        userCreateTimeStamp = HealthDataTimeUtils.INSTANCE.getUserCreateTimeStamp();
        arrayList = new ArrayList();
        while (r9.hasNext()) {
            if (((HistoryItem) obj2).getTimeStamp() < userCreateTimeStamp) {
                z = true;
            } else {
                z = false;
            }
            if (!Boxing.boxBoolean(z).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        this.d.findAllByTypeLiveData.postValue(arrayList);
        return Unit.INSTANCE;
    }
}
