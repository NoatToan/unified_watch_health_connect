package com.xiaomi.hm.health.healthdata.api;

import com.huami.android.vo.ApiResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.HealthDataBean;
import com.xiaomi.hm.health.healthdata.api.pojo.HealthDataFindResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.HearingHealthResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.SyncHealthDataResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsItem;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsResponse;
import com.xiaomi.hm.health.healthdata.api.request.UploadHealthDataRequest;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J[\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J_\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH&J.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH&J.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\b\b\u0002\u0010!\u001a\u00020\u0010H&J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010#\u001a\u00020 H&J$\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020%0\u001cH&JW\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataBean;", "data", "Lcom/huami/android/vo/ApiResponse;", "", "postHealthData", "userId", "eventType", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/xiaomi/hm/health/healthdata/api/pojo/SyncHealthDataResponse;", "fetchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsResponse;", "fetchUserEventsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "uploadTime", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataFindResponse;", "findDataByType", "delete", "", "Lcom/xiaomi/hm/health/healthdata/api/request/UploadHealthDataRequest;", "events", "uploadEvent", "Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem;", "isDate", "uploadUserEvents", "event", "deleteUserEvents", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", "uploadHearingEvents", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HearingHealthResponse;", "fetchHearingEvents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface HealthDataWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResponse fetchData$default(HealthDataWebApi healthDataWebApi, String str, String str2, String str3, long j, long j2, Long l, int i, Boolean bool, int i2, Object obj) {
            if (obj == null) {
                return healthDataWebApi.fetchData(str, str2, str3, j, j2, l, i, (i2 & 128) != 0 ? null : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
        }

        public static /* synthetic */ ApiResponse fetchHearingEvents$default(HealthDataWebApi healthDataWebApi, String str, String str2, Long l, Long l2, Long l3, int i, Boolean bool, int i2, Object obj) {
            if (obj == null) {
                return healthDataWebApi.fetchHearingEvents(str, str2, l, l2, l3, i, (i2 & 64) != 0 ? null : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchHearingEvents");
        }

        public static /* synthetic */ ApiResponse fetchUserEventsData$default(HealthDataWebApi healthDataWebApi, String str, String str2, String str3, Long l, Long l2, Long l3, int i, Boolean bool, int i2, Object obj) {
            if (obj == null) {
                return healthDataWebApi.fetchUserEventsData(str, str2, str3, l, l2, l3, i, (i2 & 128) != 0 ? null : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUserEventsData");
        }

        public static /* synthetic */ ApiResponse uploadUserEvents$default(HealthDataWebApi healthDataWebApi, String str, List list, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadUserEvents");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return healthDataWebApi.uploadUserEvents(str, list, z);
        }
    }

    @NotNull
    ApiResponse<String> delete(@NotNull String userId, @NotNull String eventType, @NotNull String subType, @NotNull String uploadTime);

    @NotNull
    ApiResponse<String> deleteUserEvents(@NotNull String userId, @NotNull UserEventsItem event);

    @NotNull
    ApiResponse<SyncHealthDataResponse> fetchData(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long from, long to, @Nullable Long next, int limit, @Nullable Boolean reverse);

    @NotNull
    ApiResponse<HearingHealthResponse> fetchHearingEvents(@NotNull String userId, @NotNull String eventType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse);

    @NotNull
    ApiResponse<UserEventsResponse> fetchUserEventsData(@NotNull String userId, @NotNull String eventType, @NotNull String subType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse);

    @NotNull
    ApiResponse<HealthDataFindResponse> findDataByType(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long uploadTime);

    @Deprecated(message = "接口变更")
    @NotNull
    ApiResponse<String> postHealthData(@NotNull HealthDataBean data);

    @NotNull
    ApiResponse<String> uploadEvent(@NotNull String userId, @NotNull List<UploadHealthDataRequest> events);

    @NotNull
    ApiResponse<String> uploadHearingEvents(@NotNull String userId, @NotNull List<HearingHealthEntity> events);

    @NotNull
    ApiResponse<String> uploadUserEvents(@NotNull String userId, @NotNull List<UserEventsItem> events, boolean isDate);
}
