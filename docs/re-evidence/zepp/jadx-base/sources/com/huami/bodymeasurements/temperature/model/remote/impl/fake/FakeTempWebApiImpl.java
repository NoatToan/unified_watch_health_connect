package com.huami.bodymeasurements.temperature.model.remote.impl.fake;

import com.huami.bodymeasurements.common.remote.net.vo.ApiResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiSuccessResponse;
import com.huami.bodymeasurements.common.remote.userevents.bean.UserEventsItem;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.bodymeasurements.temperature.model.remote.bean.AllDayTempBean;
import com.huami.bodymeasurements.temperature.model.remote.bean.EightySecondsTempBean;
import com.huami.bodymeasurements.temperature.model.remote.bean.ManualTempBean;
import com.huami.bodymeasurements.temperature.model.remote.bean.SingleTempBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J!\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J?\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018J?\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J?\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/impl/fake/FakeTempWebApiImpl;", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/SingleTempBean;", "data", "", "uploadSingleTemp", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/AllDayTempBean;", "uploadAllDayTemp", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/ManualTempBean;", "uploadManualTemp", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/EightySecondsTempBean;", "uploadEightySecondsTemp", "", "userId", "", "from", "to", "", "limit", "Lcom/huami/bodymeasurements/common/remote/net/vo/ApiResponse;", "Lcom/huami/bodymeasurements/common/remote/userevents/bean/UserEventsItem;", "fetchAllDayTempByTimeRange", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSingleTempByTimeRange", "fetchManualTempByTimeRange", "fetchEightySecondsTempByTimeRange", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class FakeTempWebApiImpl implements TempWebApi {
    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchAllDayTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<AllDayTempBean>>> continuation) {
        return new ApiSuccessResponse(new UserEventsItem(CollectionsKt__CollectionsKt.emptyList(), null));
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchEightySecondsTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<EightySecondsTempBean>>> continuation) {
        return new ApiSuccessResponse(new UserEventsItem(CollectionsKt__CollectionsKt.emptyList(), null));
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchManualTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<ManualTempBean>>> continuation) {
        return new ApiSuccessResponse(new UserEventsItem(CollectionsKt__CollectionsKt.emptyList(), null));
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchSingleTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<SingleTempBean>>> continuation) {
        return new ApiSuccessResponse(new UserEventsItem(CollectionsKt__CollectionsKt.emptyList(), null));
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadAllDayTemp(@NotNull List<AllDayTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadEightySecondsTemp(@NotNull List<EightySecondsTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadManualTemp(@NotNull List<ManualTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadSingleTemp(@NotNull List<SingleTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }
}
