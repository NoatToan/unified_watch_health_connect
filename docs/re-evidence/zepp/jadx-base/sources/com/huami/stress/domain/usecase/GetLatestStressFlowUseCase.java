package com.huami.stress.domain.usecase;

import com.huami.stress.domain.data.converter.AllDayStressExKt;
import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/stress/domain/usecase/GetLatestStressFlowUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/stress/domain/model/SingleStress;", Constant.METHOD_EXECUTE, "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "a", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "b", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/AllDayStressRepository;Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetLatestStressFlowUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository allDayStressRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository singleStressRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/huami/stress/domain/model/AllDayStress;", "allDayStress", "Lcom/huami/stress/domain/model/SingleStress;", ParamKey.singleStress, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.GetLatestStressFlowUseCase$execute$1", f = "GetLatestStressFlowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<AllDayStress, SingleStress, Continuation<? super SingleStress>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable AllDayStress allDayStress, @Nullable SingleStress singleStress, @Nullable Continuation<? super SingleStress> continuation) {
            a aVar = GetLatestStressFlowUseCase.this.new a(continuation);
            aVar.b = allDayStress;
            aVar.c = singleStress;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AllDayStress allDayStress = (AllDayStress) this.b;
            SingleStress singleStress = (SingleStress) this.c;
            HMLog.i(LogTagUtilsKt.getTAG(GetLatestStressFlowUseCase.this), "allDayStress:" + allDayStress + ",singleStress:" + singleStress, new Object[0]);
            Object next = null;
            if (allDayStress == null && singleStress == null) {
                return null;
            }
            if (allDayStress == null) {
                return singleStress;
            }
            if (singleStress == null) {
                Iterator<T> it2 = AllDayStressExKt.toSingleStressList(allDayStress).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Long lBoxLong = Boxing.boxLong(((SingleStress) next).getTimestamp());
                        do {
                            Object next2 = it2.next();
                            Long lBoxLong2 = Boxing.boxLong(((SingleStress) next2).getTimestamp());
                            if (lBoxLong.compareTo(lBoxLong2) < 0) {
                                next = next2;
                                lBoxLong = lBoxLong2;
                            }
                        } while (it2.hasNext());
                    }
                }
                return next;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(AllDayStressExKt.toSingleStressList(allDayStress));
            arrayList.add(singleStress);
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    Long lBoxLong3 = Boxing.boxLong(((SingleStress) next).getTimestamp());
                    do {
                        Object next3 = it3.next();
                        Long lBoxLong4 = Boxing.boxLong(((SingleStress) next3).getTimestamp());
                        if (lBoxLong3.compareTo(lBoxLong4) < 0) {
                            next = next3;
                            lBoxLong3 = lBoxLong4;
                        }
                    } while (it3.hasNext());
                }
            }
            return next;
        }
    }

    public GetLatestStressFlowUseCase(@NotNull AllDayStressRepository allDayStressRepository, @NotNull SingleStressRepository singleStressRepository) {
        this.allDayStressRepository = allDayStressRepository;
        this.singleStressRepository = singleStressRepository;
    }

    @NotNull
    public final Flow<SingleStress> execute() {
        HMLog.i(LogTagUtilsKt.getTAG(this), "GetLatestStressUseCase execute", new Object[0]);
        return FlowKt.flowCombine(this.allDayStressRepository.getLatestAllDayStressFromLocalFlow(), this.singleStressRepository.getLatestSingleStressFromLocalFlow(), new a(null));
    }
}
