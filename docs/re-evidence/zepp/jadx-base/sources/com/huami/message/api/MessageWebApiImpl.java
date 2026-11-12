package com.huami.message.api;

import com.google.android.gms.common.Scopes;
import com.huami.android.vo.ApiResponse;
import com.huami.message.api.pojo.Items;
import com.huami.message.api.pojo.MessageCountBean;
import com.huami.message.api.pojo.NotificationBean;
import com.huami.message.api.pojo.PrivateMessageBean;
import com.huami.message.api.pojo.SubMessageBean;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.NoticeType;
import com.huami.message.dto.Profile;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JI\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/message/api/MessageWebApiImpl;", "Lcom/huami/message/api/MessageWebApi;", "", "path", "a", "next", "", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.PAGE_SIZE, "status", WebConst.QueryParam.NOTICE_TYPE, WebConst.QueryParam.MESSAGE_SUB_TYPE, "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/Items;", "Lcom/huami/message/api/pojo/SubMessageBean;", "loadMessageListV2", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/android/vo/ApiResponse;", WebConst.QueryParam.MESSAGE_TYPE, WebConst.QueryParam.MESSAGE_ID, "", "timestamp", "updateMessageStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/MessageCountBean;", "loadMessageCount", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "loadMessageCenter", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/api/pojo/NotificationBean;", "loadNotification", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/android/vo/ApiResponse;", "", "Ljava/lang/String;", "host", "Lcom/huami/message/dto/Profile;", "b", "Lcom/huami/message/dto/Profile;", Scopes.PROFILE, "<init>", "(Ljava/lang/String;Lcom/huami/message/dto/Profile;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class MessageWebApiImpl implements MessageWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Profile profile;

    public MessageWebApiImpl(@NotNull String str, @NotNull Profile profile) {
        this.host = str;
        this.profile = profile;
    }

    private final String a(String path) {
        return Intrinsics.stringPlus(this.host, path);
    }

    @Override // com.huami.message.api.MessageWebApi
    @NotNull
    public ApiResponse<Items<PrivateMessageBean>> loadMessageCenter(@Nullable String next, @Nullable Integer pageSize) {
        String strReplace$default = m.replace$default(a(WebConst.Path.MESSAGE_CENTER), "{userId}", this.profile.getUserId(), false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (next != null) {
            linkedHashMap.put("next", next);
        }
        if (pageSize != null) {
            linkedHashMap.put("limit", pageSize);
        }
        linkedHashMap.put(WebConst.QueryParam.FIG, "true");
        linkedHashMap.put(WebConst.QueryParam.NOTICE_TYPE, NoticeType.MESSAGE.getValue());
        linkedHashMap.put(WebConst.QueryParam.MESSAGE_SUB_TYPE, MessageSubType.CHAT.getValue());
        return MessageWebApiImplKt.b(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), Items.INSTANCE.serializer(PrivateMessageBean.INSTANCE.serializer()));
    }

    @Override // com.huami.message.api.MessageWebApi
    @NotNull
    public ApiResponse<MessageCountBean> loadMessageCount(@Nullable String noticeType, @Nullable String messageSubType, @NotNull String status) {
        String strReplace$default = m.replace$default(m.replace$default(a(WebConst.Path.MESSAGE_STATUS), "{userId}", this.profile.getUserId(), false, 4, (Object) null), "{status}", status, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (noticeType != null) {
            linkedHashMap.put(WebConst.QueryParam.NOTICE_TYPE, noticeType);
        }
        if (messageSubType != null) {
            linkedHashMap.put(WebConst.QueryParam.MESSAGE_SUB_TYPE, messageSubType);
        }
        return MessageWebApiImplKt.b(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), MessageCountBean.INSTANCE.serializer());
    }

    @Override // com.huami.message.api.MessageWebApi
    @NotNull
    public ApiResponse<Items<SubMessageBean>> loadMessageListV2(@Nullable String next, @Nullable Integer pageSize, @NotNull String status, @Nullable String noticeType, @NotNull String messageSubType) {
        String strReplace$default = m.replace$default(m.replace$default(a(WebConst.Path.MESSAGE_CENTER_V2), "{userId}", this.profile.getUserId(), false, 4, (Object) null), "{status}", status, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (next != null) {
            linkedHashMap.put("next", next);
        }
        if (pageSize != null) {
            linkedHashMap.put("limit", pageSize);
        }
        if (noticeType != null) {
            linkedHashMap.put(WebConst.QueryParam.NOTICE_TYPE, noticeType);
        }
        linkedHashMap.put(WebConst.QueryParam.MESSAGE_SUB_TYPE, messageSubType);
        return MessageWebApiImplKt.b(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), Items.INSTANCE.serializer(SubMessageBean.INSTANCE.serializer()));
    }

    @Override // com.huami.message.api.MessageWebApi
    @NotNull
    public ApiResponse<Items<NotificationBean>> loadNotification(@Nullable String next, @Nullable Integer pageSize, @NotNull String status, @Nullable String noticeType) {
        String strReplace$default = m.replace$default(m.replace$default(a(WebConst.Path.MESSAGE_CENTER_V2), "{userId}", this.profile.getUserId(), false, 4, (Object) null), "{status}", status, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (next != null) {
            linkedHashMap.put("next", next);
        }
        if (pageSize != null) {
            linkedHashMap.put("limit", pageSize);
        }
        if (noticeType != null) {
            linkedHashMap.put(WebConst.QueryParam.NOTICE_TYPE, noticeType);
        }
        return MessageWebApiImplKt.b(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), Items.INSTANCE.serializer(NotificationBean.INSTANCE.serializer()));
    }

    @Override // com.huami.message.api.MessageWebApi
    @NotNull
    public ApiResponse<String> updateMessageStatus(@NotNull String status, @Nullable String noticeType, @Nullable String messageType, @Nullable String messageSubType, @Nullable String messageId, @Nullable Long timestamp) {
        String strReplace$default = m.replace$default(m.replace$default(a(WebConst.Path.MESSAGE_STATUS), "{userId}", this.profile.getUserId(), false, 4, (Object) null), "{status}", status, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (noticeType != null) {
            linkedHashMap.put(WebConst.QueryParam.NOTICE_TYPE, noticeType);
        }
        if (messageSubType != null) {
            linkedHashMap.put(WebConst.QueryParam.MESSAGE_SUB_TYPE, messageSubType);
        }
        if (messageId != null) {
            linkedHashMap.put(WebConst.QueryParam.MESSAGE_ID, messageId);
        }
        if (timestamp != null) {
            linkedHashMap.put("timestamp", timestamp.toString());
        }
        return MessageWebApiImplKt.a(WebUtils.INSTANCE.put(strReplace$default, linkedHashMap));
    }

    @Override // com.huami.message.api.MessageWebApi
    @NotNull
    public ApiResponse<Boolean> updateMessageStatus(@NotNull String messageType) {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }
}
