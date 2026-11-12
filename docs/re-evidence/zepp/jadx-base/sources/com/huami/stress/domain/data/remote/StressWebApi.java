package com.huami.stress.domain.data.remote;

import com.huami.stress.domain.data.remote.bean.AllDayStressApiBean;
import com.huami.stress.domain.data.remote.bean.GetAllDayStressListResponse;
import com.huami.stress.domain.data.remote.bean.GetSingleStressListResponse;
import com.huami.stress.domain.data.remote.bean.SingleStressApiBean;
import com.huami.stress.domain.data.remote.net.ApiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/stress/domain/data/remote/StressWebApi;", "", "", "userId", "", "Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "data", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "uploadAllDayStress", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "uploadSingleStress", "", "from", "", "limit", "Lcom/huami/stress/domain/data/remote/bean/GetAllDayStressListResponse;", "getAllDayStress", "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "to", "getAllDayStressByTimeRange", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/data/remote/bean/GetSingleStressListResponse;", "getSingleStress", "getSingleStressByTimeRange", "timestamp", "deleteSingleStress", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 5, 1})
public interface StressWebApi {
    @Nullable
    Object deleteSingleStress(@NotNull String str, long j, @NotNull Continuation<? super ApiResponse<String>> continuation);

    @Nullable
    Object getAllDayStress(@NotNull String str, long j, int i, @NotNull Continuation<? super ApiResponse<GetAllDayStressListResponse>> continuation);

    @Nullable
    Object getAllDayStressByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<GetAllDayStressListResponse>> continuation);

    @Nullable
    Object getSingleStress(@NotNull String str, long j, int i, @NotNull Continuation<? super ApiResponse<GetSingleStressListResponse>> continuation);

    @Nullable
    Object getSingleStressByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<GetSingleStressListResponse>> continuation);

    @Nullable
    Object uploadAllDayStress(@NotNull String str, @NotNull List<AllDayStressApiBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation);

    @Nullable
    Object uploadSingleStress(@NotNull String str, @NotNull List<SingleStressApiBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation);
}
