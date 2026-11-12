package com.xiaomi.hm.health.healthdata.core;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1", f = "AbstractHealthDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ AbstractHealthDataViewModel c;
    public final /* synthetic */ UserDataEntity d;
    public final /* synthetic */ MutableLiveData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1(Continuation continuation, AbstractHealthDataViewModel abstractHealthDataViewModel, UserDataEntity userDataEntity, MutableLiveData mutableLiveData) {
        super(2, continuation);
        this.c = abstractHealthDataViewModel;
        this.d = userDataEntity;
        this.e = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AbstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1 abstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1 = new AbstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e);
        abstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1.b = obj;
        return abstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AbstractHealthDataViewModel$deleteRecord$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HealthDataType type;
        Boolean boolBoxBoolean;
        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean zDelete = this.c.healthDataRepo.delete(this.d);
        if (zDelete && (type = this.d.getType()) != null) {
            MutableLiveData mutableLiveData = this.c.findAllByTypeLiveData;
            List<UserDataEntity> listFindAllByType = this.c.healthDataRepo.findAllByType(type);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listFindAllByType) {
                Date uploadTime = ((UserDataEntity) obj2).getUploadTime();
                boolean zBooleanValue = false;
                if (uploadTime != null && (boolBoxBoolean = Boxing.boxBoolean(uploadTime.after(new Date(HealthDataTimeUtils.INSTANCE.getUserCreateTimeStamp())))) != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                }
                if (Boxing.boxBoolean(zBooleanValue).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            mutableLiveData.postValue(DataConverterKt.toHealthHistoryData(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$deleteRecord$lambda-11$lambda-10$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(((UserDataEntity) t2).getUploadTime(), ((UserDataEntity) t).getUploadTime());
                }
            })));
        }
        this.e.postValue(new Pair(Boxing.boxBoolean(zDelete), this.d));
        return Unit.INSTANCE;
    }
}
