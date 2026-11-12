package com.huami.message.converter;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.message.dto.FollowStatus;
import com.huami.message.dto.MessageStatus;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.NoticeType;
import com.huami.message.dto.ResourceType;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.xiaomi.hm.health.push.Type;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000¨\u0006\u000b"}, d2 = {"", "Lcom/huami/message/dto/MessageStatus;", "toMessageStatusDto", "Lcom/huami/message/dto/MessageSubType;", "toMessageSubTypeDto", "Lcom/huami/message/dto/NoticeType;", "toNoticeTypeDto", "Lcom/huami/message/dto/FollowStatus;", "toFollowStatusDto", "Lcom/huami/message/dto/ResourceType;", "toResourceTypeDto", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class MapDtoExKt {
    @NotNull
    public static final FollowStatus toFollowStatusDto(@NotNull String str) {
        if (TextUtils.equals(Type.UNFOLLOW_MESSAGE, str)) {
            return FollowStatus.UN_FOLLOW;
        }
        if (TextUtils.equals(Type.FOLLOW_MESSAGE, str)) {
            return FollowStatus.FOLLOW;
        }
        return TextUtils.equals("followEach", str) ? FollowStatus.FOLLOW_EACH : FollowStatus.UN_FOLLOW;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    @NotNull
    public static final MessageStatus toMessageStatusDto(@NotNull String str) {
        MessageStatus messageStatus;
        int iHashCode = str.hashCode();
        if (iHashCode != -2026521607) {
            if (iHashCode != 77184) {
                if (iHashCode == 2511254 && str.equals("READ")) {
                    messageStatus = MessageStatus.READ;
                } else {
                    messageStatus = null;
                }
            } else if (str.equals("NEW")) {
                messageStatus = MessageStatus.NEW;
            } else {
                messageStatus = null;
            }
        } else if (str.equals("DELETED")) {
            messageStatus = MessageStatus.DELETED;
        } else {
            messageStatus = null;
        }
        Objects.requireNonNull(messageStatus, "null cannot be cast to non-null type com.huami.message.dto.MessageStatus");
        return messageStatus;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    @NotNull
    public static final MessageSubType toMessageSubTypeDto(@NotNull String str) {
        MessageSubType messageSubType;
        switch (str) {
            case "agreeComment":
                messageSubType = MessageSubType.AGREE_COMMENT;
                break;
            case "follow":
                messageSubType = MessageSubType.FOLLOW;
                break;
            case "agreeSecondComment":
                messageSubType = MessageSubType.AGREE_SECOND_COMMENT;
                break;
            case "comment_latest":
                messageSubType = MessageSubType.COMMENT_LATEST;
                break;
            case "chat":
                messageSubType = MessageSubType.CHAT;
                break;
            case "comment_history":
                messageSubType = MessageSubType.COMMENT_HISTORY;
                break;
            case "collect":
                messageSubType = MessageSubType.COLLECT;
                break;
            case "comment":
                messageSubType = MessageSubType.COMMENT;
                break;
            case "agreePost":
                messageSubType = MessageSubType.AGREE_POST;
                break;
            case "replyComment":
                messageSubType = MessageSubType.REPLY_COMMENT;
                break;
            case "agree_history":
                messageSubType = MessageSubType.AGREE_HISTORY;
                break;
            case "agree_latest":
                messageSubType = MessageSubType.AGREE_LATEST;
                break;
            case "replySecondComment":
                messageSubType = MessageSubType.REPLY_SECOND_COMMENT;
                break;
            default:
                messageSubType = null;
                break;
        }
        Objects.requireNonNull(messageSubType, "null cannot be cast to non-null type com.huami.message.dto.MessageSubType");
        return messageSubType;
    }

    @NotNull
    public static final NoticeType toNoticeTypeDto(@NotNull String str) {
        NoticeType noticeType;
        if (Intrinsics.areEqual(str, "message")) {
            noticeType = NoticeType.MESSAGE;
        } else {
            noticeType = Intrinsics.areEqual(str, SleepHomeActivity.FROM_NOTIFICATION) ? NoticeType.NOTICE : null;
        }
        Objects.requireNonNull(noticeType, "null cannot be cast to non-null type com.huami.message.dto.NoticeType");
        return noticeType;
    }

    @NotNull
    public static final ResourceType toResourceTypeDto(@NotNull String str) {
        ResourceType resourceType;
        if (Intrinsics.areEqual(str, MimeTypes.IMAGE_JPEG)) {
            resourceType = ResourceType.IMAGE;
        } else {
            resourceType = Intrinsics.areEqual(str, MimeTypes.VIDEO_MP4) ? ResourceType.VIDEO : null;
        }
        Objects.requireNonNull(resourceType, "null cannot be cast to non-null type com.huami.message.dto.ResourceType");
        return resourceType;
    }
}
