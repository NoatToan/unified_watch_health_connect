package com.huami.stress.domain.usecase;

import com.huami.stress.domain.data.converter.AllDayStressExKt;
import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/stress/domain/usecase/GetLatestStressUseCase;", "", "Lcom/huami/stress/domain/model/SingleStress;", Constant.METHOD_EXECUTE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "a", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "b", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/AllDayStressRepository;Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetLatestStressUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository allDayStressRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository singleStressRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.GetLatestStressUseCase", f = "GetLatestStressUseCase.kt", i = {0}, l = {21, 24}, m = Constant.METHOD_EXECUTE, n = {"singleStressList"}, s = {"L$1"})
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
            return GetLatestStressUseCase.this.execute(this);
        }
    }

    public GetLatestStressUseCase(@NotNull AllDayStressRepository allDayStressRepository, @NotNull SingleStressRepository singleStressRepository) {
        this.allDayStressRepository = allDayStressRepository;
        this.singleStressRepository = singleStressRepository;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object execute(@NotNull Continuation<? super SingleStress> continuation) {
        a aVar;
        GetLatestStressUseCase getLatestStressUseCase;
        List list;
        List list2;
        List<SingleStress> singleStressList;
        SingleStress singleStress;
        Iterator it2;
        Long lBoxLong;
        Object next;
        Long lBoxLong2;
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
        Object latestSingleStressFromLocal = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        Object next2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                list = (List) aVar.b;
                getLatestStressUseCase = (GetLatestStressUseCase) aVar.a;
                ResultKt.throwOnFailure(latestSingleStressFromLocal);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) aVar.a;
                ResultKt.throwOnFailure(latestSingleStressFromLocal);
            }
            singleStress = (SingleStress) latestSingleStressFromLocal;
            if (singleStress != null) {
                list2.add(singleStress);
            }
            it2 = list2.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    lBoxLong = Boxing.boxLong(((SingleStress) next2).getTimestamp());
                    do {
                        next = it2.next();
                        lBoxLong2 = Boxing.boxLong(((SingleStress) next).getTimestamp());
                        if (lBoxLong.compareTo(lBoxLong2) < 0) {
                            next2 = next;
                            lBoxLong = lBoxLong2;
                        }
                    } while (it2.hasNext());
                }
            }
            return next2;
        }
        ResultKt.throwOnFailure(latestSingleStressFromLocal);
        HMLog.i(LogTagUtilsKt.getTAG(this), "GetLatestStressUseCase execute", new Object[0]);
        ArrayList arrayList = new ArrayList();
        AllDayStressRepository allDayStressRepository = this.allDayStressRepository;
        aVar.a = this;
        aVar.b = arrayList;
        aVar.e = 1;
        Object latestAllDayStressFromLocal = allDayStressRepository.getLatestAllDayStressFromLocal(aVar);
        if (latestAllDayStressFromLocal == coroutine_suspended) {
            return coroutine_suspended;
        }
        getLatestStressUseCase = this;
        list = arrayList;
        latestSingleStressFromLocal = latestAllDayStressFromLocal;
        AllDayStress allDayStress = (AllDayStress) latestSingleStressFromLocal;
        if (allDayStress != null && (singleStressList = AllDayStressExKt.toSingleStressList(allDayStress)) != null) {
            list.addAll(singleStressList);
        }
        SingleStressRepository singleStressRepository = getLatestStressUseCase.singleStressRepository;
        aVar.a = list;
        aVar.b = null;
        aVar.e = 2;
        latestSingleStressFromLocal = singleStressRepository.getLatestSingleStressFromLocal(aVar);
        if (latestSingleStressFromLocal == coroutine_suspended) {
            return coroutine_suspended;
        }
        list2 = list;
        singleStress = (SingleStress) latestSingleStressFromLocal;
        if (singleStress != null) {
            list2.add(singleStress);
        }
        it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                lBoxLong = Boxing.boxLong(((SingleStress) next2).getTimestamp());
                do {
                    next = it2.next();
                    lBoxLong2 = Boxing.boxLong(((SingleStress) next).getTimestamp());
                    if (lBoxLong.compareTo(lBoxLong2) < 0) {
                        next2 = next;
                        lBoxLong = lBoxLong2;
                    }
                } while (it2.hasNext());
            }
        }
        return next2;
    }
}
