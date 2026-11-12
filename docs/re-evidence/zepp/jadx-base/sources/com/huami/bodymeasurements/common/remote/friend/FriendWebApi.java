package com.huami.bodymeasurements.common.remote.friend;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bodymeasurements.common.remote.friend.bean.FriendDataItem;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Ju\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/bodymeasurements/common/remote/friend/FriendWebApi;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "userId", "dataType", "eventType", "subType", "", "from", "to", "", "limit", "", "reverse", "appName", "Ljava/lang/reflect/Type;", "type", "Lcom/huami/bodymeasurements/common/remote/friend/bean/FriendDataItem;", "getFriendCommonData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/reflect/Type;)Lcom/huami/bodymeasurements/common/remote/friend/bean/FriendDataItem;", "common_release"}, k = 1, mv = {1, 5, 1})
public interface FriendWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ FriendDataItem getFriendCommonData$default(FriendWebApi friendWebApi, String str, String str2, String str3, String str4, long j, long j2, int i, Boolean bool, String str5, Type type, int i2, Object obj) {
            if (obj == null) {
                return friendWebApi.getFriendCommonData(str, str2, str3, str4, j, j2, i, (i2 & 128) != 0 ? Boolean.FALSE : bool, str5, type);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFriendCommonData");
        }
    }

    @Nullable
    <T> FriendDataItem<T> getFriendCommonData(@NotNull String userId, @NotNull String dataType, @NotNull String eventType, @NotNull String subType, long from, long to, int limit, @Nullable Boolean reverse, @NotNull String appName, @NotNull Type type);
}
