package com.huami.bodymeasurements.temperature.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.bodymeasurements.temperature.model.converter.HistoryDataConverterKt;
import com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/bodymeasurements/temperature/viewmodel/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.bodymeasurements.temperature.viewmodel.TempHistoryDataViewModel$loadData$$inlined$safeLaunch$1", f = "TempHistoryDataViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class TempHistoryDataViewModel$loadData$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ TempHistoryDataViewModel c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempHistoryDataViewModel$loadData$$inlined$safeLaunch$1(Continuation continuation, TempHistoryDataViewModel tempHistoryDataViewModel, String str) {
        super(2, continuation);
        this.c = tempHistoryDataViewModel;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TempHistoryDataViewModel$loadData$$inlined$safeLaunch$1 tempHistoryDataViewModel$loadData$$inlined$safeLaunch$1 = new TempHistoryDataViewModel$loadData$$inlined$safeLaunch$1(continuation, this.c, this.d);
        tempHistoryDataViewModel$loadData$$inlined$safeLaunch$1.b = obj;
        return tempHistoryDataViewModel$loadData$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TempHistoryDataViewModel$loadData$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetTempHistoryDataUseCase getTempHistoryDataUseCase = this.c.loadUseCase;
            String str = this.d;
            this.a = 1;
            obj = getTempHistoryDataUseCase.execute(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableLiveData mutableLiveData = this.c._historyDataLiveData;
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith((List) obj, new Comparator() { // from class: com.huami.bodymeasurements.temperature.viewmodel.TempHistoryDataViewModel$loadData$lambda-4$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t2).getTimestamp()), Long.valueOf(((TemperatureVo) t).getTimestamp()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            arrayList.add(HistoryDataConverterKt.toHistoryDataItem((TemperatureVo) it2.next()));
        }
        mutableLiveData.postValue(arrayList);
        return Unit.INSTANCE;
    }
}
