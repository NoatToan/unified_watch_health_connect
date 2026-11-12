package com.huami.heartrate.usecase;

import com.huami.heartrate.repository.IHeartRateRepository;
import com.huami.heartrate.repository.entity.PagingRemoteHeartRateData;
import com.huami.heartrate.repository.entity.RemoteHeartRateData;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "", "", "dateFrom", "dateEnd", "", "limitCount", "Lcom/huami/heartrate/repository/entity/RemoteHeartRateData;", "fetchRemoteMeasureHrUseCase", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextSeconds", "Lcom/huami/heartrate/repository/entity/PagingRemoteHeartRateData;", "fetchRemoteMeasureHrByPaging", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "a", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "repository", "<init>", "(Lcom/huami/heartrate/repository/IHeartRateRepository;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class FetchRemoteMeasureHrUseCase {

    @NotNull
    private static final String b = "FetchRemoteMeasureHrUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepository repository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.usecase.FetchRemoteMeasureHrUseCase", f = "FetchRemoteMeasureHrUseCase.kt", i = {0}, l = {42}, m = "fetchRemoteMeasureHrByPaging", n = {"nextSeconds"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FetchRemoteMeasureHrUseCase.this.fetchRemoteMeasureHrByPaging(null, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l) {
            super(0);
            this.a = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "nextSeconds：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.usecase.FetchRemoteMeasureHrUseCase", f = "FetchRemoteMeasureHrUseCase.kt", i = {}, l = {30}, m = "fetchRemoteMeasureHrUseCase", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return FetchRemoteMeasureHrUseCase.this.fetchRemoteMeasureHrUseCase(0L, 0L, 0, this);
        }
    }

    public FetchRemoteMeasureHrUseCase(@NotNull IHeartRateRepository iHeartRateRepository) {
        this.repository = iHeartRateRepository;
    }

    public static /* synthetic */ Object fetchRemoteMeasureHrByPaging$default(FetchRemoteMeasureHrUseCase fetchRemoteMeasureHrUseCase, Long l, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return fetchRemoteMeasureHrUseCase.fetchRemoteMeasureHrByPaging(l, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetchRemoteMeasureHrByPaging(@Nullable Long l, int i, @NotNull Continuation<? super PagingRemoteHeartRateData> continuation) {
        a aVar;
        Object objM3845constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object measureHeartRatePagingList = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.d;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(measureHeartRatePagingList);
                Result.Companion companion = Result.Companion;
                IHeartRateRepository iHeartRateRepository = this.repository;
                aVar.a = l;
                aVar.d = 1;
                measureHeartRatePagingList = iHeartRateRepository.getMeasureHeartRatePagingList(l, i, aVar);
                if (measureHeartRatePagingList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l = (Long) aVar.a;
                ResultKt.throwOnFailure(measureHeartRatePagingList);
            }
            objM3845constructorimpl = Result.m3845constructorimpl((PagingRemoteHeartRateData) measureHeartRatePagingList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(b, null, thM3848exceptionOrNullimpl, new b(l), 2, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            return null;
        }
        return objM3845constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetchRemoteMeasureHrUseCase(long j, long j2, int i, @NotNull Continuation<? super RemoteHeartRateData> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object remoteMeasureHrData = cVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar2.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(remoteMeasureHrData);
                IHeartRateRepository iHeartRateRepository = this.repository;
                cVar2.c = 1;
                remoteMeasureHrData = iHeartRateRepository.getRemoteMeasureHrData(j, j2, i, cVar2);
                if (remoteMeasureHrData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(remoteMeasureHrData);
            }
            return (RemoteHeartRateData) remoteMeasureHrData;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
