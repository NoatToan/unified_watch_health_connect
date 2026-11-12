package com.huami.bodymeasurements.common.remote.userevents;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bodymeasurements.common.remote.userevents.bean.UserEventsItem;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jm\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0016\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H&¨\u0006\u0017"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/userevents/UserEventsApi;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "userId", "eventType", "subType", "", "from", "to", "", "limit", "", "reverse", "appName", "Ljava/lang/reflect/Type;", "type", "Lcom/huami/bodymeasurements/common/remote/userevents/bean/UserEventsItem;", "getUserEvents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/reflect/Type;)Lcom/huami/bodymeasurements/common/remote/userevents/bean/UserEventsItem;", "", "userEvents", "postUserEvents", "common_release"}, k = 1, mv = {1, 5, 1})
public interface UserEventsApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ UserEventsItem getUserEvents$default(UserEventsApi userEventsApi, String str, String str2, String str3, long j, long j2, int i, Boolean bool, String str4, Type type, int i2, Object obj) {
            if (obj == null) {
                return userEventsApi.getUserEvents(str, str2, str3, j, j2, i, (i2 & 64) != 0 ? Boolean.FALSE : bool, str4, type);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserEvents");
        }
    }

    @Nullable
    <T> UserEventsItem<T> getUserEvents(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long from, long to, int limit, @Nullable Boolean reverse, @NotNull String appName, @NotNull Type type);

    <T> boolean postUserEvents(@NotNull String userId, @NotNull List<? extends T> userEvents);
}
