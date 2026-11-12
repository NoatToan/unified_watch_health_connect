package com.huami.message.api;

import com.huami.android.vo.ApiResponse;
import com.huami.message.api.pojo.Items;
import com.huami.message.api.pojo.MessageCountBean;
import com.huami.message.api.pojo.NotificationBean;
import com.huami.message.api.pojo.PrivateMessageBean;
import com.huami.message.api.pojo.SubMessageBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJI\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0011\u001a\u00020\u0002H&J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&JO\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0013\u0010\u0019JA\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/huami/message/api/MessageWebApi;", "", "", "next", "", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.PAGE_SIZE, "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "loadMessageCenter", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/android/vo/ApiResponse;", "status", WebConst.QueryParam.NOTICE_TYPE, WebConst.QueryParam.MESSAGE_SUB_TYPE, "Lcom/huami/message/api/pojo/SubMessageBean;", "loadMessageListV2", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/android/vo/ApiResponse;", WebConst.QueryParam.MESSAGE_TYPE, "", "updateMessageStatus", "Lcom/huami/message/api/pojo/MessageCountBean;", "loadMessageCount", WebConst.QueryParam.MESSAGE_ID, "", "timestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/NotificationBean;", "loadNotification", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/android/vo/ApiResponse;", "common-message_release"}, k = 1, mv = {1, 5, 1})
public interface MessageWebApi {
    @NotNull
    ApiResponse<Items<PrivateMessageBean>> loadMessageCenter(@Nullable String next, @Nullable Integer pageSize);

    @NotNull
    ApiResponse<MessageCountBean> loadMessageCount(@Nullable String noticeType, @Nullable String messageSubType, @NotNull String status);

    @NotNull
    ApiResponse<Items<SubMessageBean>> loadMessageListV2(@Nullable String next, @Nullable Integer pageSize, @NotNull String status, @Nullable String noticeType, @NotNull String messageSubType);

    @NotNull
    ApiResponse<Items<NotificationBean>> loadNotification(@Nullable String next, @Nullable Integer pageSize, @NotNull String status, @Nullable String noticeType);

    @NotNull
    ApiResponse<Boolean> updateMessageStatus(@NotNull String messageType);

    @NotNull
    ApiResponse<String> updateMessageStatus(@NotNull String status, @Nullable String noticeType, @Nullable String messageType, @Nullable String messageSubType, @Nullable String messageId, @Nullable Long timestamp);
}
