package com.huami.stress.domain.usecase;

import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.model.CardStressData;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/stress/domain/usecase/GetCardStressDataUseCase;", "", "Lcom/huami/stress/domain/model/CardStressData;", Constant.METHOD_EXECUTE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "a", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "b", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/AllDayStressRepository;Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetCardStressDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository allDayStressRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository singleStressRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.GetCardStressDataUseCase", f = "GetCardStressDataUseCase.kt", i = {0, 1, 1}, l = {17, 18}, m = Constant.METHOD_EXECUTE, n = {"this", "this", "allDayStress"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return GetCardStressDataUseCase.this.execute(this);
        }
    }

    public GetCardStressDataUseCase(@NotNull AllDayStressRepository allDayStressRepository, @NotNull SingleStressRepository singleStressRepository) {
        this.allDayStressRepository = allDayStressRepository;
        this.singleStressRepository = singleStressRepository;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object execute(@NotNull Continuation<? super CardStressData> continuation) {
        a aVar;
        GetCardStressDataUseCase getCardStressDataUseCase;
        AllDayStress allDayStress;
        GetCardStressDataUseCase getCardStressDataUseCase2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object todayAllDayStressFromLocal = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                getCardStressDataUseCase = (GetCardStressDataUseCase) aVar.a;
                ResultKt.throwOnFailure(todayAllDayStressFromLocal);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                allDayStress = (AllDayStress) aVar.b;
                getCardStressDataUseCase2 = (GetCardStressDataUseCase) aVar.a;
                ResultKt.throwOnFailure(todayAllDayStressFromLocal);
            }
            SingleStress singleStress = (SingleStress) todayAllDayStressFromLocal;
            HMLog.i(LogTagUtilsKt.getTAG(getCardStressDataUseCase2), "GetCardStressDataUseCase execute:" + allDayStress + ", " + singleStress, new Object[0]);
            return new CardStressData(allDayStress != null && singleStress == null, singleStress, allDayStress);
        }
        ResultKt.throwOnFailure(todayAllDayStressFromLocal);
        AllDayStressRepository allDayStressRepository = this.allDayStressRepository;
        aVar.a = this;
        aVar.e = 1;
        todayAllDayStressFromLocal = allDayStressRepository.getTodayAllDayStressFromLocal(aVar);
        if (todayAllDayStressFromLocal == coroutine_suspended) {
            return coroutine_suspended;
        }
        getCardStressDataUseCase = this;
        AllDayStress allDayStress2 = (AllDayStress) todayAllDayStressFromLocal;
        SingleStressRepository singleStressRepository = getCardStressDataUseCase.singleStressRepository;
        aVar.a = getCardStressDataUseCase;
        aVar.b = allDayStress2;
        aVar.e = 2;
        Object latestSingleStressFromLocal = singleStressRepository.getLatestSingleStressFromLocal(aVar);
        if (latestSingleStressFromLocal == coroutine_suspended) {
            return coroutine_suspended;
        }
        allDayStress = allDayStress2;
        todayAllDayStressFromLocal = latestSingleStressFromLocal;
        getCardStressDataUseCase2 = getCardStressDataUseCase;
        SingleStress singleStress2 = (SingleStress) todayAllDayStressFromLocal;
        HMLog.i(LogTagUtilsKt.getTAG(getCardStressDataUseCase2), "GetCardStressDataUseCase execute:" + allDayStress + ", " + singleStress2, new Object[0]);
        return new CardStressData(allDayStress != null && singleStress2 == null, singleStress2, allDayStress);
    }
}
