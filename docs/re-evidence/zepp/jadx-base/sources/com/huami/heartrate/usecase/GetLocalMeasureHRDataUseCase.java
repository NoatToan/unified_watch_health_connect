package com.huami.heartrate.usecase;

import com.huami.heartrate.repository.IHeartRateRepository;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "", "", "from", "to", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "getLocalMeasureHRData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "queryLocalMeasureHrByLimit", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeHeartRateLiveDataList", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "a", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "repository", "<init>", "(Lcom/huami/heartrate/repository/IHeartRateRepository;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class GetLocalMeasureHRDataUseCase {

    @NotNull
    private static final String b = "GetLocalWholeDayHRDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepository repository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase", f = "GetLocalMeasureHRDataUseCase.kt", i = {}, l = {25}, m = "getLocalMeasureHRData", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return GetLocalMeasureHRDataUseCase.this.getLocalMeasureHRData(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase", f = "GetLocalMeasureHRDataUseCase.kt", i = {}, l = {31}, m = "queryLocalMeasureHrByLimit", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return GetLocalMeasureHRDataUseCase.this.queryLocalMeasureHrByLimit(0L, 0, this);
        }
    }

    public GetLocalMeasureHRDataUseCase(@NotNull IHeartRateRepository iHeartRateRepository) {
        this.repository = iHeartRateRepository;
    }

    public static /* synthetic */ Object queryLocalMeasureHrByLimit$default(GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCase, long j, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return getLocalMeasureHRDataUseCase.queryLocalMeasureHrByLimit(j, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLocalMeasureHRData(long j, long j2, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        a aVar;
        Object objM3845constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objQueryHeartRateListByDayRange = aVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objQueryHeartRateListByDayRange);
                Result.Companion companion = Result.Companion;
                IHeartRateRepository iHeartRateRepository = this.repository;
                aVar2.c = 1;
                objQueryHeartRateListByDayRange = iHeartRateRepository.queryHeartRateListByDayRange(j, j2, aVar2);
                if (objQueryHeartRateListByDayRange == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objQueryHeartRateListByDayRange);
            }
            objM3845constructorimpl = Result.m3845constructorimpl((List) objQueryHeartRateListByDayRange);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            return null;
        }
        return objM3845constructorimpl;
    }

    @NotNull
    public final Flow<List<HeartRateEntity>> observeHeartRateLiveDataList(long from, long to) {
        return this.repository.observeHeartRateLiveDataList(from, to);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryLocalMeasureHrByLimit(long j, int i, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        b bVar;
        Object objM3845constructorimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objQueryHeartRateListByLimit = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objQueryHeartRateListByLimit);
                Result.Companion companion = Result.Companion;
                IHeartRateRepository iHeartRateRepository = this.repository;
                bVar.c = 1;
                objQueryHeartRateListByLimit = iHeartRateRepository.queryHeartRateListByLimit(j, i, bVar);
                if (objQueryHeartRateListByLimit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objQueryHeartRateListByLimit);
            }
            objM3845constructorimpl = Result.m3845constructorimpl((List) objQueryHeartRateListByLimit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            return null;
        }
        return objM3845constructorimpl;
    }
}
