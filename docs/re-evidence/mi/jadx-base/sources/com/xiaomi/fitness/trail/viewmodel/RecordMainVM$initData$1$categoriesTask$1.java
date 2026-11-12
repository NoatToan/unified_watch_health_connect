package com.xiaomi.fitness.trail.viewmodel;

import com.xiaomi.fit.data.common.data.annotation.SportCategory;
import com.xiaomi.fit.data.common.data.sport.SportCategoryData;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportCategoryData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.RecordMainVM$initData$1$categoriesTask$1", f = "RecordMainVM.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRecordMainVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordMainVM.kt\ncom/xiaomi/fitness/trail/viewmodel/RecordMainVM$initData$1$categoriesTask$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1863#2:70\n1864#2:72\n1010#2,2:73\n1#3:71\n*S KotlinDebug\n*F\n+ 1 RecordMainVM.kt\ncom/xiaomi/fitness/trail/viewmodel/RecordMainVM$initData$1$categoriesTask$1\n*L\n50#1:70\n50#1:72\n51#1:73,2\n*E\n"})
public final class RecordMainVM$initData$1$categoriesTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<SportCategoryData>>, Object> {
    int label;
    final /* synthetic */ RecordMainVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordMainVM$initData$1$categoriesTask$1(RecordMainVM recordMainVM, Continuation<? super RecordMainVM$initData$1$categoriesTask$1> continuation) {
        super(2, continuation);
        this.this$0 = recordMainVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordMainVM$initData$1$categoriesTask$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SportSummaryApi summaryApi = this.this$0.getSummaryApi();
            this.label = 1;
            obj = summaryApi.getCategories(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = new ArrayList();
        SportCategoryData sportCategory = SportCategory.INSTANCE.getSportCategory("sport_stats_all");
        Intrinsics.checkNotNull(sportCategory);
        arrayList.add(sportCategory);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            SportCategoryData sportCategory2 = SportCategory.INSTANCE.getSportCategory((String) it.next());
            if (sportCategory2 != null) {
                arrayList.add(sportCategory2);
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.trail.viewmodel.RecordMainVM$initData$1$categoriesTask$1$invokeSuspend$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((SportCategoryData) t).getSortId()), Integer.valueOf(((SportCategoryData) t2).getSortId()));
                }
            });
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<SportCategoryData>> continuation) {
        return ((RecordMainVM$initData$1$categoriesTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
