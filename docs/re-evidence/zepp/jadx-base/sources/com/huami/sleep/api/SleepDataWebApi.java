package com.huami.sleep.api;

import com.huami.android.vo.ApiResponse;
import com.huami.sleep.api.pojo.UserEventsItem;
import com.huami.sleep.api.pojo.UserEventsResponse;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001Jc\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0015\u001a\u00020\fH&¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/api/SleepDataWebApi;", "", "", "userId", "eventType", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/sleep/api/pojo/UserEventsResponse;", "fetchUserEventsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "", "Lcom/huami/sleep/api/pojo/UserEventsItem;", "events", "isDate", "uploadUserEvents", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface SleepDataWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResponse fetchUserEventsData$default(SleepDataWebApi sleepDataWebApi, String str, String str2, String str3, Long l, Long l2, Long l3, int i, Boolean bool, int i2, Object obj) {
            if (obj == null) {
                return sleepDataWebApi.fetchUserEventsData(str, str2, str3, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : l2, l3, i, (i2 & 128) != 0 ? null : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUserEventsData");
        }

        public static /* synthetic */ ApiResponse uploadUserEvents$default(SleepDataWebApi sleepDataWebApi, String str, List list, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadUserEvents");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return sleepDataWebApi.uploadUserEvents(str, list, z);
        }
    }

    @NotNull
    ApiResponse<UserEventsResponse> fetchUserEventsData(@NotNull String userId, @NotNull String eventType, @NotNull String subType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse);

    @NotNull
    ApiResponse<String> uploadUserEvents(@NotNull String userId, @NotNull List<UserEventsItem> events, boolean isDate);
}
