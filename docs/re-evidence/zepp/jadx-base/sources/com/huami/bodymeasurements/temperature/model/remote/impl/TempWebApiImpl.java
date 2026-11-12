package com.huami.bodymeasurements.temperature.model.remote.impl;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.bodymeasurements.common.remote.friend.FriendWebApi;
import com.huami.bodymeasurements.common.remote.friend.bean.FriendDataItem;
import com.huami.bodymeasurements.common.remote.net.vo.ApiErrorResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiSuccessResponse;
import com.huami.bodymeasurements.common.remote.userevents.UserEventsApi;
import com.huami.bodymeasurements.common.remote.userevents.bean.UserEventsItem;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.bodymeasurements.temperature.model.remote.TempWebConstants;
import com.huami.bodymeasurements.temperature.model.remote.bean.AllDayTempBean;
import com.huami.bodymeasurements.temperature.model.remote.bean.EightySecondsTempBean;
import com.huami.bodymeasurements.temperature.model.remote.bean.ManualTempBean;
import com.huami.bodymeasurements.temperature.model.remote.bean.SingleTempBean;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b3\u00104J*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0006\"\b\b\u0000\u0010\u0004*\u00020\u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0002J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ!\u0010\u0013\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJ?\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ?\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ?\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001cR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010.\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b!\u0010-R\u001d\u00102\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/remote/impl/TempWebApiImpl;", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "Lorg/koin/core/component/KoinComponent;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bodymeasurements/common/remote/userevents/bean/UserEventsItem;", "Lcom/huami/bodymeasurements/common/remote/net/vo/ApiResponse;", "b", "", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/SingleTempBean;", "data", "", "uploadSingleTemp", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/AllDayTempBean;", "uploadAllDayTemp", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/ManualTempBean;", "uploadManualTemp", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/EightySecondsTempBean;", "uploadEightySecondsTemp", "", "userId", "", "from", "to", "", "limit", "fetchAllDayTempByTimeRange", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSingleTempByTimeRange", "fetchManualTempByTimeRange", "fetchEightySecondsTempByTimeRange", "Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsApi;", "a", "Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsApi;", "userEventsApi", "Lcom/huami/bodymeasurements/common/remote/friend/FriendWebApi;", "Lcom/huami/bodymeasurements/common/remote/friend/FriendWebApi;", "friendWebApi", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "c", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "externalApi", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Z", "isFriend", "e", "getAppName", "()Ljava/lang/String;", "appName", "<init>", "(Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsApi;Lcom/huami/bodymeasurements/common/remote/friend/FriendWebApi;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempWebApiImpl implements TempWebApi, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UserEventsApi userEventsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FriendWebApi friendWebApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final TempExternalApi externalApi = ScopesKt.tempExternalApi(getKoin());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy isFriend = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy appName = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String appName;
            TempExternalApi tempExternalApi = TempWebApiImpl.this.externalApi;
            return (tempExternalApi == null || (appName = tempExternalApi.getAppName()) == null) ? "" : appName;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            TempExternalApi tempExternalApi = TempWebApiImpl.this.externalApi;
            if (tempExternalApi == null) {
                return false;
            }
            return tempExternalApi.isFriend();
        }
    }

    public TempWebApiImpl(@NotNull UserEventsApi userEventsApi, @NotNull FriendWebApi friendWebApi) {
        this.userEventsApi = userEventsApi;
        this.friendWebApi = friendWebApi;
    }

    private final boolean a() {
        return ((Boolean) this.isFriend.getValue()).booleanValue();
    }

    private final <T> ApiResponse<UserEventsItem<T>> b(UserEventsItem<T> userEventsItem) {
        return userEventsItem != null ? new ApiSuccessResponse(userEventsItem) : new ApiErrorResponse("");
    }

    private final String getAppName() {
        return (String) this.appName.getValue();
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchAllDayTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<AllDayTempBean>>> continuation) {
        UserEventsItem userEventsItem;
        if (a()) {
            FriendDataItem friendCommonData = this.friendWebApi.getFriendCommonData(str, TempWebConstants.FRIEND_DATA_TYPE, "allDayTemperature", "allDayTemperature", j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<FriendDataItem<AllDayTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchAllDayTempByTimeRange$userEventsItem$friendItem$1
            }.getType());
            userEventsItem = friendCommonData == null ? null : new UserEventsItem(friendCommonData.getItems(), friendCommonData.getNext());
        } else {
            userEventsItem = this.userEventsApi.getUserEvents(str, "allDayTemperature", "allDayTemperature", j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<UserEventsItem<AllDayTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchAllDayTempByTimeRange$userEventsItem$1
            }.getType());
        }
        return b(userEventsItem);
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchEightySecondsTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<EightySecondsTempBean>>> continuation) {
        UserEventsItem userEventsItem;
        if (a()) {
            FriendDataItem friendCommonData = this.friendWebApi.getFriendCommonData(str, TempWebConstants.FRIEND_DATA_TYPE, TempWebConstants.EventType.EIGHTY_SECONDS_TEMPS, TempWebConstants.EventType.EIGHTY_SECONDS_TEMPS, j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<FriendDataItem<EightySecondsTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchEightySecondsTempByTimeRange$userEventsItem$friendItem$1
            }.getType());
            userEventsItem = friendCommonData == null ? null : new UserEventsItem(friendCommonData.getItems(), friendCommonData.getNext());
        } else {
            userEventsItem = this.userEventsApi.getUserEvents(str, TempWebConstants.EventType.EIGHTY_SECONDS_TEMPS, TempWebConstants.EventType.EIGHTY_SECONDS_TEMPS, j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<UserEventsItem<EightySecondsTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchEightySecondsTempByTimeRange$userEventsItem$1
            }.getType());
        }
        return b(userEventsItem);
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchManualTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<ManualTempBean>>> continuation) {
        UserEventsItem userEventsItem;
        if (a()) {
            FriendDataItem friendCommonData = this.friendWebApi.getFriendCommonData(str, TempWebConstants.FRIEND_DATA_TYPE, "health_data", "temperature", j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<FriendDataItem<ManualTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchManualTempByTimeRange$userEventsItem$friendItem$1
            }.getType());
            userEventsItem = friendCommonData == null ? null : new UserEventsItem(friendCommonData.getItems(), friendCommonData.getNext());
        } else {
            userEventsItem = this.userEventsApi.getUserEvents(str, "health_data", "temperature", j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<UserEventsItem<ManualTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchManualTempByTimeRange$userEventsItem$1
            }.getType());
        }
        return b(userEventsItem);
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object fetchSingleTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<UserEventsItem<SingleTempBean>>> continuation) {
        UserEventsItem userEventsItem;
        if (a()) {
            FriendDataItem friendCommonData = this.friendWebApi.getFriendCommonData(str, TempWebConstants.FRIEND_DATA_TYPE, "singleTemperature", "singleTemperature", j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<FriendDataItem<SingleTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchSingleTempByTimeRange$userEventsItem$friendItem$1
            }.getType());
            userEventsItem = friendCommonData == null ? null : new UserEventsItem(friendCommonData.getItems(), friendCommonData.getNext());
        } else {
            userEventsItem = this.userEventsApi.getUserEvents(str, "singleTemperature", "singleTemperature", j, j2, i, Boxing.boxBoolean(true), getAppName(), new TypeToken<UserEventsItem<SingleTempBean>>() { // from class: com.huami.bodymeasurements.temperature.model.remote.impl.TempWebApiImpl$fetchSingleTempByTimeRange$userEventsItem$1
            }.getType());
        }
        return b(userEventsItem);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadAllDayTemp(@NotNull List<AllDayTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.userEventsApi.postUserEvents(((AllDayTempBean) CollectionsKt.first((List) list)).getUserId(), list));
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadEightySecondsTemp(@NotNull List<EightySecondsTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.userEventsApi.postUserEvents(((EightySecondsTempBean) CollectionsKt.first((List) list)).getUserId(), list));
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadManualTemp(@NotNull List<ManualTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.userEventsApi.postUserEvents(((ManualTempBean) CollectionsKt.first((List) list)).getUserId(), list));
    }

    @Override // com.huami.bodymeasurements.temperature.model.remote.TempWebApi
    @Nullable
    public Object uploadSingleTemp(@NotNull List<SingleTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.userEventsApi.postUserEvents(((SingleTempBean) CollectionsKt.first((List) list)).getUserId(), list));
    }
}
