package com.xiaomi.hm.health.healthdata.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.api.pojo.HearingHealthNext;
import com.xiaomi.hm.health.healthdata.api.pojo.HearingHealthResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.SyncHealthDataNext;
import com.xiaomi.hm.health.healthdata.api.pojo.SyncHealthDataResponse;
import com.xiaomi.hm.health.healthdata.api.request.UploadHealthDataRequest;
import com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI;
import com.xiaomi.hm.health.healthdata.core.converter.DataTypeConverter;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J7\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0012\"\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J#\u0010\u0019\u001a\u00020\u00142\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0012\"\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u001e\u0010\"\u001a\n  *\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/RemoteHealthData;", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "", "to", "next", "Lkotlin/Pair;", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "b", "(JLjava/lang/Long;)Lkotlin/Pair;", "from", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", GoogleApiAvailabilityLight.a, "(JJLjava/lang/Long;)Lkotlin/Pair;", "", "a", "syncUserData", "(Ljava/lang/Long;)Ljava/util/List;", "", "userDataEntity", "", "create", "([Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)Z", "delete", "healthEntity", "upHhHearingData", "([Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;)Z", "syncHhHearingData", "(JJLjava/lang/Long;)Ljava/util/List;", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "webApi", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "", "c", LogUtil.I, "limit", "limitSmall", "<init>", "(Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RemoteHealthData implements UserDataRemoteAPI {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthDataWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String tag = RemoteHealthData.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int limit = 1000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int limitSmall = 10;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete fail upload time is empty.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete fail data type is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Long l) {
            super(0);
            this.a = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load from server by next = [" + this.a + "]";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "server response";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<SyncHealthDataResponse> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ApiResponse<SyncHealthDataResponse> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return ((ApiErrorResponse) this.a).getErrorMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Long l) {
            super(0);
            this.a = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load hearing data from server by next = [" + this.a + "]";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "server hearing data response";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<HearingHealthResponse> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ApiResponse<HearingHealthResponse> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return ((ApiErrorResponse) this.a).getErrorMessage();
        }
    }

    public RemoteHealthData(@NotNull HealthDataWebApi healthDataWebApi) {
        this.webApi = healthDataWebApi;
    }

    private final String a() {
        return HMPersonInfo.getInstance().getUserInfo().getUserid();
    }

    private final Pair<List<UserDataEntity>, Long> b(long to, Long next) {
        HMLog.debug(this.tag, new c(next));
        ApiResponse apiResponseFetchData$default = HealthDataWebApi.DefaultImpls.fetchData$default(this.webApi, a(), "health_data", "", 0L, to, next, this.limit, null, 128, null);
        HMLog.debug(this.tag, d.a);
        if (!(apiResponseFetchData$default instanceof ApiSuccessResponse)) {
            if (apiResponseFetchData$default instanceof ApiErrorResponse) {
                HMLog.error$default(this.tag, null, null, new e(apiResponseFetchData$default), 6, null);
            }
            return new Pair<>(CollectionsKt__CollectionsKt.emptyList(), null);
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseFetchData$default;
        List<UserDataEntity> listConvert = DataTypeConverter.INSTANCE.convert(((SyncHealthDataResponse) apiSuccessResponse.getBody()).getItems());
        SyncHealthDataNext next2 = ((SyncHealthDataResponse) apiSuccessResponse.getBody()).getNext();
        return new Pair<>(listConvert, next2 != null ? Long.valueOf(next2.getUploadTime()) : null);
    }

    public static /* synthetic */ Pair c(RemoteHealthData remoteHealthData, long j, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return remoteHealthData.b(j, l);
    }

    private final Pair<List<HearingHealthEntity>, Long> d(long from, long to, Long next) {
        HMLog.debug(this.tag, new f(next));
        ApiResponse apiResponseFetchHearingEvents$default = HealthDataWebApi.DefaultImpls.fetchHearingEvents$default(this.webApi, a(), WebConst.Param.HEARING_HEALTH_RECORDS_TYPE, Long.valueOf(from), Long.valueOf(to), next, this.limitSmall, null, 64, null);
        HMLog.debug(this.tag, g.a);
        if (!(apiResponseFetchHearingEvents$default instanceof ApiSuccessResponse)) {
            if (apiResponseFetchHearingEvents$default instanceof ApiErrorResponse) {
                HMLog.error$default(this.tag, null, null, new h(apiResponseFetchHearingEvents$default), 6, null);
            }
            return new Pair<>(CollectionsKt__CollectionsKt.emptyList(), null);
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseFetchHearingEvents$default;
        List<HearingHealthEntity> items = ((HearingHealthResponse) apiSuccessResponse.getBody()).getItems();
        HearingHealthNext next2 = ((HearingHealthResponse) apiSuccessResponse.getBody()).getNext();
        return new Pair<>(items, next2 != null ? Long.valueOf(next2.getTimestamp()) : null);
    }

    public static /* synthetic */ Pair e(RemoteHealthData remoteHealthData, long j, long j2, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return remoteHealthData.d(j, j2, l);
    }

    @Override // com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI
    public boolean create(@NotNull UserDataEntity... userDataEntity) {
        DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
        ArrayList arrayList = new ArrayList(userDataEntity.length);
        int length = userDataEntity.length;
        int i = 0;
        while (i < length) {
            UserDataEntity userDataEntity2 = userDataEntity[i];
            i++;
            arrayList.add(dataTypeConverter.convert2Request(userDataEntity2));
        }
        List<UploadHealthDataRequest> list = CollectionsKt___CollectionsKt.toList(arrayList);
        if (list.isEmpty()) {
            return false;
        }
        return this.webApi.uploadEvent(a(), list) instanceof ApiSuccessResponse;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI
    public boolean delete(@NotNull UserDataEntity userDataEntity) {
        if (userDataEntity.getIsOldData()) {
            return true;
        }
        if (userDataEntity.getUploadTime() == null) {
            HMLog.error$default(this.tag, null, null, a.a, 6, null);
            return false;
        }
        String strValueOf = String.valueOf(userDataEntity.getUploadTime().getTime());
        HealthDataType type = userDataEntity.getType();
        if (type != null) {
            return this.webApi.delete(a(), "health_data", type.getType(), strValueOf) instanceof ApiSuccessResponse;
        }
        HMLog.error$default(this.tag, null, null, b.a, 6, null);
        return false;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI
    @NotNull
    public List<HearingHealthEntity> syncHhHearingData(long from, long to, @Nullable Long next) {
        ArrayList arrayList = new ArrayList();
        Long second = next;
        do {
            Pair<List<HearingHealthEntity>, Long> pairD = d(from, to, second);
            second = pairD.getSecond();
            arrayList.addAll(pairD.getFirst());
        } while (second != null);
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI
    @NotNull
    public List<UserDataEntity> syncUserData(@Nullable Long next) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Pair<List<UserDataEntity>, Long> pairB = b(timeInMillis, next);
            Long second = pairB.getSecond();
            arrayList.addAll(pairB.getFirst());
            if (second == null) {
                return arrayList;
            }
            next = second;
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI
    public boolean upHhHearingData(@NotNull HearingHealthEntity... healthEntity) {
        if (healthEntity.length == 0) {
            return false;
        }
        return this.webApi.uploadHearingEvents(a(), ArraysKt___ArraysKt.toList(healthEntity)) instanceof ApiSuccessResponse;
    }
}
