package com.huami.watch.companion.ecg.arch;

import android.text.format.DateUtils;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.watch.companion.ecg.model.EcgListData;
import com.huami.watch.companion.ecg.model.EcgSection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgListViewModel$refreshEcgSection$1", f = "EcgListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EcgListViewModel$refreshEcgSection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ EcgListViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgListViewModel$refreshEcgSection$1(EcgListViewModel ecgListViewModel, Continuation<? super EcgListViewModel$refreshEcgSection$1> continuation) {
        super(2, continuation);
        this.b = ecgListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new EcgListViewModel$refreshEcgSection$1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((EcgListViewModel$refreshEcgSection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<EcgData> listSortedWith;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        List list = (List) this.b.ecgList.getValue();
        if (list != null && (listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.huami.watch.companion.ecg.arch.EcgListViewModel$refreshEcgSection$1$invokeSuspend$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((EcgData) t2).getTimestamp()), Long.valueOf(((EcgData) t).getTimestamp()));
            }
        })) != null) {
            EcgListViewModel ecgListViewModel = this.b;
            for (EcgData ecgData : listSortedWith) {
                ?? dateTime = DateUtils.formatDateTime(ecgListViewModel.getApplication(), ecgData.getTimestamp() * ((long) 1000), 16);
                if (!Intrinsics.areEqual(objectRef.element, (Object) dateTime)) {
                    objectRef.element = dateTime;
                    arrayList.add(new EcgSection(true, dateTime));
                }
                List list2 = (List) ecgListViewModel.ecgTagList.getValue();
                EcgTag ecgTag = null;
                Object obj2 = null;
                if (list2 != null) {
                    for (Object obj3 : list2) {
                        if (ecgData.getTimestamp() == ((EcgTag) obj3).getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String()) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    ecgTag = (EcgTag) obj2;
                }
                arrayList.add(new EcgSection(new EcgListData(ecgData, ecgTag)));
            }
        }
        this.b.getEcgSectionLiveData().postValue(arrayList);
        return Unit.INSTANCE;
    }
}
