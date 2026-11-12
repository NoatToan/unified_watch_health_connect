package com.huami.message.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.message.api.WebConst;
import com.huami.message.db.po.MessageCount;
import com.huami.message.db.po.NotificationPo;
import com.huami.message.db.po.PrivateMessagePo;
import com.huami.message.db.po.SubMessagePo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H'J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH'J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0004H'J\b\u0010\u0014\u001a\u00020\u000fH'J\b\u0010\u0015\u001a\u00020\u0004H'J\b\u0010\u0016\u001a\u00020\u000fH'J\u001e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H'J\b\u0010\u0019\u001a\u00020\u000fH'J\u001e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H'J\b\u0010\u001b\u001a\u00020\u0004H'J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH'J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001dH'J*\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u001d2\u0006\u0010\u0017\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H'J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u001dH'J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\rH'J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0'H'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0'2\u0006\u0010\u0017\u001a\u00020\rH'J,\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0'2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H'J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00060'H'J\u0016\u0010.\u001a\u00020\u000f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u0006H'J\u0010\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u001eH'J\u0018\u00100\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u001eH'J.\u00100\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010/\u001a\u00020\u001eH'J.\u00101\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010/\u001a\u00020\u001eH'¨\u00064"}, d2 = {"Lcom/huami/message/db/dao/MessageDao;", "", "Lcom/huami/message/db/po/PrivateMessagePo;", "user", "", "insertPrivateMessage", "", "insertPrivateMessageList", "Lcom/huami/message/db/po/SubMessagePo;", "insertSubMessageList", "Lcom/huami/message/db/po/NotificationPo;", "insertNotificationList", WebConst.QueryParam.MESSAGE_ID, "", "messageStatus", "", "updateMessageStatus", "updateAllMessageStatus", "updateFullMessageStatus", "deletePrivateMessagePo", "deleteFullPrivateMessagePo", "privateMessagePoCount", "deleteSubMessagePo", WebConst.QueryParam.NOTICE_TYPE, "messageSubTypes", "deleteNotificationPo", "subMessagePoCount", "notificationPoCount", "querySubMessagePoByType", "Landroidx/paging/DataSource$Factory;", "", "queryFullPrivateMessageByPaging", "querySubMessageByPaging", "queryNotificationByPaging", "status", "updateSubMessage", "userId", "followStatus", "updateSubMessageForFollowStatus", "Landroidx/lifecycle/LiveData;", "queryAllMessageCount", "queryMessageCount", "mainType", "Lcom/huami/message/db/po/MessageCount;", "queryAllMessageCountPo", "countList", "insertMessageCount", "count", "updateMessageCount", "decreaseMessageCount", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public abstract class MessageDao {
    @Query("UPDATE MessageCount SET count = count - :count WHERE noticeType = :noticeType AND mainType = :mainType AND subType IN (:messageSubTypes)")
    public abstract void decreaseMessageCount(@NotNull String noticeType, @NotNull String mainType, @NotNull List<String> messageSubTypes, int count);

    @Query("DELETE FROM PrivateMessagePo")
    public abstract void deleteFullPrivateMessagePo();

    @Query("DELETE FROM NotificationPo")
    public abstract void deleteNotificationPo();

    @Query("DELETE FROM PrivateMessagePo WHERE messageId = :messageId")
    public abstract void deletePrivateMessagePo(long messageId);

    @Query("DELETE FROM SubMessagePo")
    public abstract void deleteSubMessagePo();

    @Query("DELETE FROM SubMessagePo WHERE noticeType = :noticeType AND messageSubType IN (:messageSubTypes)")
    public abstract void deleteSubMessagePo(@NotNull String noticeType, @NotNull List<String> messageSubTypes);

    @Insert(onConflict = 1)
    public abstract void insertMessageCount(@NotNull List<MessageCount> countList);

    @Insert(onConflict = 5)
    @NotNull
    public abstract List<Long> insertNotificationList(@NotNull List<NotificationPo> user);

    @Insert(onConflict = 5)
    public abstract long insertPrivateMessage(@NotNull PrivateMessagePo user);

    @Insert(onConflict = 5)
    @NotNull
    public abstract List<Long> insertPrivateMessageList(@NotNull List<PrivateMessagePo> user);

    @Insert(onConflict = 5)
    @NotNull
    public abstract List<Long> insertSubMessageList(@NotNull List<SubMessagePo> user);

    @Query("SELECT COUNT(*) FROM NotificationPo")
    public abstract long notificationPoCount();

    @Query("SELECT COUNT(*) FROM PrivateMessagePo")
    public abstract long privateMessagePoCount();

    @Query("SELECT SUM(MessageCount.count) FROM MessageCount")
    @NotNull
    public abstract LiveData<Integer> queryAllMessageCount();

    @Query("SELECT * FROM MessageCount")
    @NotNull
    public abstract LiveData<List<MessageCount>> queryAllMessageCountPo();

    @Query("SELECT * FROM PrivateMessagePo")
    @NotNull
    public abstract DataSource.Factory<Integer, PrivateMessagePo> queryFullPrivateMessageByPaging();

    @Query("SELECT SUM(MessageCount.count) FROM MessageCount WHERE noticeType = :noticeType")
    @NotNull
    public abstract LiveData<Integer> queryMessageCount(@NotNull String noticeType);

    @Query("SELECT SUM(MessageCount.count) FROM MessageCount WHERE noticeType = :noticeType AND mainType = :mainType AND subType IN (:messageSubTypes)")
    @NotNull
    public abstract LiveData<Integer> queryMessageCount(@NotNull String noticeType, @NotNull String mainType, @NotNull List<String> messageSubTypes);

    @Query("SELECT * FROM NotificationPo")
    @NotNull
    public abstract DataSource.Factory<Integer, NotificationPo> queryNotificationByPaging();

    @Query("SELECT * FROM SubMessagePo WHERE noticeType = :noticeType AND messageSubType IN (:messageSubTypes)")
    @NotNull
    public abstract DataSource.Factory<Integer, SubMessagePo> querySubMessageByPaging(@NotNull String noticeType, @NotNull List<String> messageSubTypes);

    @Query("SELECT * FROM SubMessagePo WHERE noticeType = :noticeType AND messageSubType = :messageSubTypes")
    @NotNull
    public abstract SubMessagePo querySubMessagePoByType(@NotNull String noticeType, @NotNull String messageSubTypes);

    @Query("SELECT COUNT(*) FROM SubMessagePo WHERE noticeType = :noticeType AND messageSubType IN (:messageSubTypes)")
    public abstract long subMessagePoCount(@NotNull String noticeType, @NotNull List<String> messageSubTypes);

    @Query("UPDATE PrivateMessagePo SET messageStatus = :messageStatus")
    public abstract void updateAllMessageStatus(@NotNull String messageStatus);

    @Query("UPDATE PrivateMessagePo SET messageStatus = :messageStatus")
    public abstract void updateFullMessageStatus(@NotNull String messageStatus);

    @Query("UPDATE MessageCount SET count = :count")
    public abstract void updateMessageCount(int count);

    @Query("UPDATE MessageCount SET count = :count WHERE noticeType = :noticeType")
    public abstract void updateMessageCount(@NotNull String noticeType, int count);

    @Query("UPDATE MessageCount SET count = :count WHERE noticeType = :noticeType AND mainType = :mainType AND subType IN (:messageSubTypes)")
    public abstract void updateMessageCount(@NotNull String noticeType, @NotNull String mainType, @NotNull List<String> messageSubTypes, int count);

    @Query("UPDATE PrivateMessagePo SET messageStatus = :messageStatus WHERE messageId = :messageId")
    public abstract void updateMessageStatus(long messageId, @NotNull String messageStatus);

    @Query("UPDATE SubMessagePo SET status = :status WHERE messageId = :messageId")
    public abstract void updateSubMessage(long messageId, @NotNull String status);

    @Query("UPDATE SubMessagePo SET followStatus = :followStatus WHERE followeeId = :userId")
    public abstract void updateSubMessageForFollowStatus(@NotNull String userId, @NotNull String followStatus);
}
