package com.mi.health.message.center.util;

import com.mi.health.message.center.entity.MessageData;
import com.mi.health.message.center.entity.RelativeExtraData;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.relative.export.InvitationMsgModel;
import com.xiaomi.fitness.relative.export.SharedDataTypeMsgModel;
import defpackage.fzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\"\u001b\u0010\b\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001b\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"secondTimeFormat", "", "", "getAbnormalStr", "key", "getAuthDataByList", "authDataList", "", "toInvitationMsgModel", "Lcom/xiaomi/fitness/relative/export/InvitationMsgModel;", "Lcom/mi/health/message/center/entity/MessageData;", "Lcom/mi/health/message/center/entity/RelativeExtraData;", "getToInvitationMsgModel", "(Lcom/mi/health/message/center/entity/MessageData;)Lcom/xiaomi/fitness/relative/export/InvitationMsgModel;", "toSharedDataTypeMsgModel", "Lcom/xiaomi/fitness/relative/export/SharedDataTypeMsgModel;", "getToSharedDataTypeMsgModel", "(Lcom/mi/health/message/center/entity/MessageData;)Lcom/xiaomi/fitness/relative/export/SharedDataTypeMsgModel;", "message-center_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageCenterExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageCenterExt.kt\ncom/mi/health/message/center/util/MessageCenterExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1872#2,3:80\n*S KotlinDebug\n*F\n+ 1 MessageCenterExt.kt\ncom/mi/health/message/center/util/MessageCenterExtKt\n*L\n46#1:80,3\n*E\n"})
public final class MessageCenterExtKt {
    @NotNull
    public static final String getAbnormalStr(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.areEqual(key, "low_spo2") ? ResourceExtKt.getString(fzi.f) : ResourceExtKt.getString(fzi.e);
    }

    @NotNull
    public static final String getAuthDataByList(@Nullable List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (i <= 2) {
                    Pair<Integer, Integer> healthItemNameIconResIdPair = HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getHealthItemNameIconResIdPair(CloudKey.INSTANCE.getHomeDataType(str));
                    if (healthItemNameIconResIdPair.getFirst().intValue() > 0) {
                        if (i != 0) {
                            sb.append("、");
                        }
                        sb.append(ResourceExtKt.getString(healthItemNameIconResIdPair.getFirst().intValue()));
                    }
                }
                i = i2;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final InvitationMsgModel getToInvitationMsgModel(@NotNull MessageData<RelativeExtraData> messageData) {
        Long inviteId;
        Intrinsics.checkNotNullParameter(messageData, "<this>");
        long messageId = messageData.getMessageId();
        Long senderUId = messageData.getSenderUId();
        long jLongValue = 0;
        long jLongValue2 = senderUId != null ? senderUId.longValue() : 0L;
        RelativeExtraData relativeExtraData = (RelativeExtraData) messageData.getExtraEntity();
        if (relativeExtraData != null && (inviteId = relativeExtraData.getInviteId()) != null) {
            jLongValue = inviteId.longValue();
        }
        long j = jLongValue;
        RelativeExtraData relativeExtraData2 = (RelativeExtraData) messageData.getExtraEntity();
        List<String> authDataList = relativeExtraData2 != null ? relativeExtraData2.getAuthDataList() : null;
        RelativeExtraData relativeExtraData3 = (RelativeExtraData) messageData.getExtraEntity();
        Integer authRange = relativeExtraData3 != null ? relativeExtraData3.getAuthRange() : null;
        RelativeExtraData relativeExtraData4 = (RelativeExtraData) messageData.getExtraEntity();
        String nickName = relativeExtraData4 != null ? relativeExtraData4.getNickName() : null;
        RelativeExtraData relativeExtraData5 = (RelativeExtraData) messageData.getExtraEntity();
        return new InvitationMsgModel(messageId, jLongValue2, j, authDataList, authRange, nickName, relativeExtraData5 != null ? relativeExtraData5.getIcon() : null);
    }

    @NotNull
    public static final SharedDataTypeMsgModel getToSharedDataTypeMsgModel(@NotNull MessageData<RelativeExtraData> messageData) {
        List<String> listEmptyList;
        Long inviteId;
        Intrinsics.checkNotNullParameter(messageData, "<this>");
        long messageId = messageData.getMessageId();
        Long senderUId = messageData.getSenderUId();
        long jLongValue = 0;
        long jLongValue2 = senderUId != null ? senderUId.longValue() : 0L;
        RelativeExtraData relativeExtraData = (RelativeExtraData) messageData.getExtraEntity();
        if (relativeExtraData != null && (inviteId = relativeExtraData.getInviteId()) != null) {
            jLongValue = inviteId.longValue();
        }
        long j = jLongValue;
        RelativeExtraData relativeExtraData2 = (RelativeExtraData) messageData.getExtraEntity();
        if (relativeExtraData2 == null || (listEmptyList = relativeExtraData2.getAuthDataList()) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> list = listEmptyList;
        RelativeExtraData relativeExtraData3 = (RelativeExtraData) messageData.getExtraEntity();
        String nickName = relativeExtraData3 != null ? relativeExtraData3.getNickName() : null;
        RelativeExtraData relativeExtraData4 = (RelativeExtraData) messageData.getExtraEntity();
        return new SharedDataTypeMsgModel(messageId, jLongValue2, j, list, nickName, relativeExtraData4 != null ? relativeExtraData4.getIcon() : null);
    }

    @NotNull
    public static final String secondTimeFormat(long j) {
        if (TimeDateUtil.isToday(TimeDateUtil.changZeroOfTheDay(j))) {
            return TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(j * ((long) 1000)));
        }
        if (Intrinsics.areEqual(new LocalDate().minusDays(1), TimeDateUtil.timestampToLocalDate(j))) {
            return TimeUtils.formatDate(ResourceExtKt.getString(fzi.v), Long.valueOf(j * ((long) 1000)));
        }
        long j2 = j * ((long) 1000);
        return TimeDateUtil.isSameYear(System.currentTimeMillis(), j2) ? TimeUtils.formatDate(ResourceExtKt.getString(fzi.c), Long.valueOf(j2)) : TimeUtils.formatDate(ResourceExtKt.getString(fzi.d), Long.valueOf(j2));
    }
}
