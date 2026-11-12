package com.xiaomi.fitness.repo.summary;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao;
import com.xiaomi.fit.fitness.persist.server.data.SportSummaryRes;
import com.xiaomi.fit.fitness.persist.utils.SportSummaryUtilKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo$syncOnline$1$specificTotalTask$1", f = "SportSummaryRepo.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
public final class SportSummaryRepo$syncOnline$1$specificTotalTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $categories;
    final /* synthetic */ SportSummaryDao $sDao;
    int label;
    final /* synthetic */ SportSummaryRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportSummaryRepo$syncOnline$1$specificTotalTask$1(SportSummaryRepo sportSummaryRepo, List<String> list, SportSummaryDao sportSummaryDao, Continuation<? super SportSummaryRepo$syncOnline$1$specificTotalTask$1> continuation) {
        super(2, continuation);
        this.this$0 = sportSummaryRepo;
        this.$categories = list;
        this.$sDao = sportSummaryDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportSummaryRepo$syncOnline$1$specificTotalTask$1(this.this$0, this.$categories, this.$sDao, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FitnessLogUtils.d("SRecordSummaryRepo", "syncOnline: specificTotal task");
            SportSummaryRepo sportSummaryRepo = this.this$0;
            List<String> list = this.$categories;
            this.label = 1;
            obj = sportSummaryRepo.reqBatchSpecificTotalSummary(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SportSummaryRes sportSummaryRes = (SportSummaryRes) obj;
        FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline ret = " + sportSummaryRes);
        if (sportSummaryRes == null) {
            return null;
        }
        SportSummaryDao sportSummaryDao = this.$sDao;
        ArrayList<SportSummary> arrayList = sportSummaryRes.summaries;
        if (arrayList == null || arrayList.isEmpty()) {
            FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: specificTotal empty");
            sportSummaryDao.deleteTotalSummary();
        } else {
            sportSummaryDao.insertSummary(SportSummaryUtilKt.toSummaryList(sportSummaryRes));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportSummaryRepo$syncOnline$1$specificTotalTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
