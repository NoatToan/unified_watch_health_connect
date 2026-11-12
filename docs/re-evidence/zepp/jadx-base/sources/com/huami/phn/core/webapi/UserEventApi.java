package com.huami.phn.core.webapi;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0083\u0001\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H&J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H&J<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00190\u00182\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u001c"}, d2 = {"Lcom/huami/phn/core/webapi/UserEventApi;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "eventType", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObject;", "eventParse", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/phn/core/webapi/ApiResult;", "Lcom/huami/phn/core/webapi/UserEventList;", "queryUserEvents", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/phn/core/webapi/ApiResult;", "timestamp", "queryUserEventData", "deleteUserEvent", "", "Lkotlin/Pair;", "postDatas", "postUserEvent", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface UserEventApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResult deleteUserEvent$default(UserEventApi userEventApi, String str, long j, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteUserEvent");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return userEventApi.deleteUserEvent(str, j, str2);
        }

        public static /* synthetic */ ApiResult postUserEvent$default(UserEventApi userEventApi, String str, List list, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postUserEvent");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return userEventApi.postUserEvent(str, list, str2);
        }

        public static /* synthetic */ ApiResult queryUserEventData$default(UserEventApi userEventApi, String str, Function1 function1, long j, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUserEventData");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return userEventApi.queryUserEventData(str, function1, j, str2);
        }

        public static /* synthetic */ ApiResult queryUserEvents$default(UserEventApi userEventApi, String str, Function1 function1, String str2, Long l, Long l2, Long l3, int i, Boolean bool, int i2, Object obj) {
            if (obj == null) {
                return userEventApi.queryUserEvents(str, function1, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? null : l3, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? null : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUserEvents");
        }
    }

    @NotNull
    ApiResult<Boolean> deleteUserEvent(@NotNull String eventType, long timestamp, @Nullable String subType);

    @NotNull
    ApiResult<Boolean> postUserEvent(@NotNull String eventType, @NotNull List<Pair<Long, JsonObject>> postDatas, @Nullable String subType);

    @NotNull
    <T> ApiResult<T> queryUserEventData(@NotNull String eventType, @NotNull Function1<? super JsonObject, ? extends T> eventParse, long timestamp, @Nullable String subType);

    @NotNull
    <T> ApiResult<UserEventList<T>> queryUserEvents(@NotNull String eventType, @NotNull Function1<? super JsonObject, ? extends T> eventParse, @Nullable String subType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse);
}
