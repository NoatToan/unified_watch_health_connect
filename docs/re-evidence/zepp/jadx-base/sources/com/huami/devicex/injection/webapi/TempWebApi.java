package com.huami.devicex.injection.webapi;

import com.xiaomi.hm.health.temperature.remote.bean.AllDayTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.AllDayTempResponse;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempResponse;
import com.xiaomi.hm.health.temperature.remote.bean.SingleTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.SingleTempResponse;
import com.xiaomi.hm.health.temperature.remote.net.ApiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J9\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/devicex/injection/webapi/TempWebApi;", "", "", "Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempBean;", "data", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "", "uploadSingleTemp", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "uploadAllDayTemp", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempBean;", "uploadManualTemp", "userId", "", "from", "to", "", "limit", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempResponse;", "fetchAllDayTempByTimeRange", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempResponse;", "fetchSingleTempByTimeRange", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempResponse;", "fetchManualTempByTimeRange", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface TempWebApi {
    @Nullable
    Object fetchAllDayTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<AllDayTempResponse>> continuation);

    @Nullable
    Object fetchManualTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<ManualTempResponse>> continuation);

    @Nullable
    Object fetchSingleTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<SingleTempResponse>> continuation);

    @Nullable
    Object uploadAllDayTemp(@NotNull List<AllDayTempBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation);

    @Nullable
    Object uploadManualTemp(@NotNull List<ManualTempBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation);

    @Nullable
    Object uploadSingleTemp(@NotNull List<SingleTempBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation);
}
