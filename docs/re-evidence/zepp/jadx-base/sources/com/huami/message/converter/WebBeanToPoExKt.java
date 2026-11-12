package com.huami.message.converter;

import com.huami.message.api.pojo.MessageCountBean;
import com.huami.message.api.pojo.NotificationBean;
import com.huami.message.api.pojo.PrivateMessageBean;
import com.huami.message.api.pojo.SubMessageBean;
import com.huami.message.db.po.MessageCount;
import com.huami.message.db.po.NotificationPo;
import com.huami.message.db.po.PrivateMessagePo;
import com.huami.message.db.po.SubMessagePo;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.MessageType;
import com.huami.message.dto.NoticeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0000*\b\u0012\u0004\u0012\u00020\u00070\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000*\u00020\n¨\u0006\r"}, d2 = {"", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "Lcom/huami/message/db/po/PrivateMessagePo;", "toPrivateMessagePo", "Lcom/huami/message/api/pojo/SubMessageBean;", "Lcom/huami/message/db/po/SubMessagePo;", "toSubMessagePo", "Lcom/huami/message/api/pojo/NotificationBean;", "Lcom/huami/message/db/po/NotificationPo;", "toNotificationPo", "Lcom/huami/message/api/pojo/MessageCountBean;", "Lcom/huami/message/db/po/MessageCount;", "toMessageCountList", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class WebBeanToPoExKt {
    @NotNull
    public static final List<MessageCount> toMessageCountList(@NotNull MessageCountBean messageCountBean) {
        ArrayList arrayList = new ArrayList();
        MessageCount messageCount = new MessageCount(NoticeType.MESSAGE.getValue(), MessageType.USER.getValue(), "", 0, null, 16, null);
        String value = NoticeType.NOTICE.getValue();
        Integer notification = messageCountBean.getNotification();
        arrayList.add(new MessageCount(value, "", "", notification == null ? 0 : notification.intValue(), null, 16, null));
        String value2 = MessageSubType.CHAT.getValue();
        Integer chat = messageCountBean.getChat();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value2, chat == null ? 0 : chat.intValue(), null, 19, null));
        String value3 = MessageSubType.COMMENT.getValue();
        Integer comment = messageCountBean.getComment();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value3, comment == null ? 0 : comment.intValue(), null, 19, null));
        String value4 = MessageSubType.REPLY_COMMENT.getValue();
        Integer replyComment = messageCountBean.getReplyComment();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value4, replyComment == null ? 0 : replyComment.intValue(), null, 19, null));
        String value5 = MessageSubType.REPLY_SECOND_COMMENT.getValue();
        Integer replySecondComment = messageCountBean.getReplySecondComment();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value5, replySecondComment == null ? 0 : replySecondComment.intValue(), null, 19, null));
        String value6 = MessageSubType.AGREE_POST.getValue();
        Integer agreePost = messageCountBean.getAgreePost();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value6, agreePost == null ? 0 : agreePost.intValue(), null, 19, null));
        String value7 = MessageSubType.AGREE_COMMENT.getValue();
        Integer agreeComment = messageCountBean.getAgreeComment();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value7, agreeComment == null ? 0 : agreeComment.intValue(), null, 19, null));
        String value8 = MessageSubType.AGREE_SECOND_COMMENT.getValue();
        Integer agreeSecondComment = messageCountBean.getAgreeSecondComment();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value8, agreeSecondComment == null ? 0 : agreeSecondComment.intValue(), null, 19, null));
        String value9 = MessageSubType.COLLECT.getValue();
        Integer collect = messageCountBean.getCollect();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value9, collect == null ? 0 : collect.intValue(), null, 19, null));
        String value10 = MessageSubType.FOLLOW.getValue();
        Integer follow = messageCountBean.getFollow();
        arrayList.add(MessageCount.copy$default(messageCount, null, null, value10, follow == null ? 0 : follow.intValue(), null, 19, null));
        return arrayList;
    }

    @NotNull
    public static final NotificationPo toNotificationPo(@NotNull NotificationBean notificationBean) {
        long messageId = notificationBean.getMessageId();
        Long generateTime = notificationBean.getGenerateTime();
        String iconUrl = notificationBean.getIconUrl();
        String text = notificationBean.getText();
        String title = notificationBean.getTitle();
        String subTypeName = notificationBean.getSubTypeName();
        String typeName = notificationBean.getTypeName();
        String jumpType = notificationBean.getJumpType();
        String url = notificationBean.getUrl();
        return new NotificationPo(0, messageId, generateTime, iconUrl, notificationBean.getGroupExType(), notificationBean.getStatus(), text, title, subTypeName, typeName, jumpType, url, notificationBean.getPushUrl(), notificationBean.getNoticeType(), notificationBean.getSubType(), 1, null);
    }

    @NotNull
    public static final PrivateMessagePo toPrivateMessagePo(@NotNull PrivateMessageBean privateMessageBean) {
        return new PrivateMessagePo(0L, privateMessageBean.getMessageId(), privateMessageBean.getFolloweeId(), privateMessageBean.getAvatar(), privateMessageBean.getNickName(), Integer.valueOf(privateMessageBean.getCount()), privateMessageBean.getStatus(), privateMessageBean.getText(), Long.valueOf(privateMessageBean.getGenerateTime()), null, 513, null);
    }

    @NotNull
    public static final SubMessagePo toSubMessagePo(@NotNull SubMessageBean subMessageBean) {
        return new SubMessagePo(0, subMessageBean.getMessageId(), subMessageBean.getCount(), subMessageBean.getDataType(), subMessageBean.getDay(), subMessageBean.getDescription(), subMessageBean.getFolloweeId(), subMessageBean.getFrom(), subMessageBean.getFromFirstCommentId(), subMessageBean.getFromPostId(), subMessageBean.getFromSecondCommentId(), subMessageBean.getFromTopicId(), subMessageBean.getGenerateTime(), subMessageBean.getGeneratedTime(), subMessageBean.getHrvType(), subMessageBean.getIconUrl(), subMessageBean.getMemberId(), subMessageBean.getMessageSubType(), subMessageBean.getNickName(), subMessageBean.getNoticeType(), subMessageBean.getStatus(), subMessageBean.getSubType(), subMessageBean.getText(), subMessageBean.getSubText(), subMessageBean.getTitle(), subMessageBean.getType(), subMessageBean.getResource(), subMessageBean.getResourceType(), subMessageBean.getFollowStatus(), 1, null);
    }

    @NotNull
    public static final List<PrivateMessagePo> toPrivateMessagePo(@NotNull List<PrivateMessageBean> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(toPrivateMessagePo((PrivateMessageBean) it2.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<NotificationPo> toNotificationPo(@NotNull List<NotificationBean> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(toNotificationPo((NotificationBean) it2.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<SubMessagePo> toSubMessagePo(@NotNull List<SubMessageBean> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(toSubMessagePo((SubMessageBean) it2.next()));
        }
        return arrayList;
    }
}
