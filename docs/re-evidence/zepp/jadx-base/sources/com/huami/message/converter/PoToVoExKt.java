package com.huami.message.converter;

import com.huami.message.db.po.NotificationPo;
import com.huami.message.db.po.PrivateMessagePo;
import com.huami.message.db.po.SubMessagePo;
import com.huami.message.dto.MessageStatus;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.NoticeType;
import com.huami.message.dto.ResourceType;
import com.huami.message.vo.NotificationItemVo;
import com.huami.message.vo.PrivateMessageItemVo;
import com.huami.message.vo.SubMessageItemVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/huami/message/db/po/PrivateMessagePo;", "Lcom/huami/message/vo/PrivateMessageItemVo;", "toPrivateMessageItemVo", "Lcom/huami/message/db/po/SubMessagePo;", "Lcom/huami/message/vo/SubMessageItemVo;", "toSubMessageItemVo", "Lcom/huami/message/db/po/NotificationPo;", "Lcom/huami/message/vo/NotificationItemVo;", "toNotificationItemVo", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class PoToVoExKt {
    @NotNull
    public static final NotificationItemVo toNotificationItemVo(@NotNull NotificationPo notificationPo) {
        long messageId = notificationPo.getMessageId();
        Long generateTime = notificationPo.getGenerateTime();
        String iconUrl = notificationPo.getIconUrl();
        String groupExType = notificationPo.getGroupExType();
        String status = notificationPo.getStatus();
        return new NotificationItemVo(messageId, generateTime, iconUrl, groupExType, status == null ? null : MapDtoExKt.toMessageStatusDto(status), notificationPo.getText(), notificationPo.getTitle(), notificationPo.getSubTypeName(), notificationPo.getTypeName(), notificationPo.getJumpType(), notificationPo.getPushUrl(), notificationPo.getUrl(), notificationPo.getNoticeType(), notificationPo.getSubType());
    }

    @NotNull
    public static final PrivateMessageItemVo toPrivateMessageItemVo(@NotNull PrivateMessagePo privateMessagePo) {
        long messageId = privateMessagePo.getMessageId();
        String userId = privateMessagePo.getUserId();
        String avatar = privateMessagePo.getAvatar();
        String nickName = privateMessagePo.getNickName();
        Integer count = privateMessagePo.getCount();
        String messageStatus = privateMessagePo.getMessageStatus();
        MessageStatus messageStatusDto = messageStatus == null ? null : MapDtoExKt.toMessageStatusDto(messageStatus);
        String content = privateMessagePo.getContent();
        Long generateTime = privateMessagePo.getGenerateTime();
        return new PrivateMessageItemVo(messageId, userId, avatar, nickName, count, messageStatusDto, content, generateTime == null ? 0L : generateTime.longValue());
    }

    @NotNull
    public static final SubMessageItemVo toSubMessageItemVo(@NotNull SubMessagePo subMessagePo) {
        long messageId = subMessagePo.getMessageId();
        Integer count = subMessagePo.getCount();
        String dataType = subMessagePo.getDataType();
        String day = subMessagePo.getDay();
        String description = subMessagePo.getDescription();
        String followeeId = subMessagePo.getFolloweeId();
        String from = subMessagePo.getFrom();
        String fromFirstCommentId = subMessagePo.getFromFirstCommentId();
        String fromPostId = subMessagePo.getFromPostId();
        String fromSecondCommentId = subMessagePo.getFromSecondCommentId();
        String fromTopicId = subMessagePo.getFromTopicId();
        Long generateTime = subMessagePo.getGenerateTime();
        Long generatedTime = subMessagePo.getGeneratedTime();
        String hrvType = subMessagePo.getHrvType();
        String iconUrl = subMessagePo.getIconUrl();
        String memberId = subMessagePo.getMemberId();
        String messageSubType = subMessagePo.getMessageSubType();
        MessageSubType messageSubTypeDto = messageSubType == null ? null : MapDtoExKt.toMessageSubTypeDto(messageSubType);
        String nickName = subMessagePo.getNickName();
        String noticeType = subMessagePo.getNoticeType();
        NoticeType noticeTypeDto = noticeType == null ? null : MapDtoExKt.toNoticeTypeDto(noticeType);
        String status = subMessagePo.getStatus();
        MessageStatus messageStatusDto = status == null ? null : MapDtoExKt.toMessageStatusDto(status);
        String text = subMessagePo.getText();
        String title = subMessagePo.getTitle();
        String subText = subMessagePo.getSubText();
        String resourceType = subMessagePo.getResourceType();
        ResourceType resourceTypeDto = resourceType == null ? null : MapDtoExKt.toResourceTypeDto(resourceType);
        String resource = subMessagePo.getResource();
        String followStatus = subMessagePo.getFollowStatus();
        return new SubMessageItemVo(messageId, count, dataType, day, description, followeeId, from, fromFirstCommentId, fromPostId, fromSecondCommentId, fromTopicId, generateTime, generatedTime, hrvType, iconUrl, memberId, messageSubTypeDto, nickName, noticeTypeDto, messageStatusDto, text, subText, title, null, resource, resourceTypeDto, followStatus == null ? null : MapDtoExKt.toFollowStatusDto(followStatus), 8388608, null);
    }
}
