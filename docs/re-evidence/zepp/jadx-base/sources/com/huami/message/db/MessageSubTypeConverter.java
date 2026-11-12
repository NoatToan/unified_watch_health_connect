package com.huami.message.db;

import androidx.room.TypeConverter;
import com.huami.message.dto.MessageSubType;
import com.xiaomi.hm.health.push.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/huami/message/db/MessageSubTypeConverter;", "", "", "messageStatus", "Lcom/huami/message/dto/MessageSubType;", "intoMessageSubType", "messageSubTypeToString", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class MessageSubTypeConverter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageSubType.values().length];
            iArr[MessageSubType.CHAT.ordinal()] = 1;
            iArr[MessageSubType.COMMENT.ordinal()] = 2;
            iArr[MessageSubType.REPLY_COMMENT.ordinal()] = 3;
            iArr[MessageSubType.REPLY_SECOND_COMMENT.ordinal()] = 4;
            iArr[MessageSubType.AGREE_POST.ordinal()] = 5;
            iArr[MessageSubType.AGREE_COMMENT.ordinal()] = 6;
            iArr[MessageSubType.AGREE_SECOND_COMMENT.ordinal()] = 7;
            iArr[MessageSubType.COLLECT.ordinal()] = 8;
            iArr[MessageSubType.FOLLOW.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @TypeConverter
    @Nullable
    public final MessageSubType intoMessageSubType(@Nullable String messageStatus) {
        if (messageStatus != null) {
            switch (messageStatus.hashCode()) {
                case -1313015277:
                    if (messageStatus.equals("agreeComment")) {
                        return MessageSubType.AGREE_COMMENT;
                    }
                    break;
                case -1268958287:
                    if (messageStatus.equals(Type.FOLLOW_MESSAGE)) {
                        return MessageSubType.FOLLOW;
                    }
                    break;
                case -1246000129:
                    if (messageStatus.equals("agreeSecondComment")) {
                        return MessageSubType.AGREE_SECOND_COMMENT;
                    }
                    break;
                case 3052376:
                    if (messageStatus.equals("chat")) {
                        return MessageSubType.CHAT;
                    }
                    break;
                case 949444906:
                    if (messageStatus.equals("collect")) {
                        return MessageSubType.COLLECT;
                    }
                    break;
                case 950398559:
                    if (messageStatus.equals("comment")) {
                        return MessageSubType.COMMENT;
                    }
                    break;
                case 974932332:
                    if (messageStatus.equals("agreePost")) {
                        return MessageSubType.AGREE_POST;
                    }
                    break;
                case 1302542357:
                    if (messageStatus.equals("replyComment")) {
                        return MessageSubType.REPLY_COMMENT;
                    }
                    break;
                case 2034745473:
                    if (messageStatus.equals("replySecondComment")) {
                        return MessageSubType.REPLY_SECOND_COMMENT;
                    }
                    break;
            }
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final String messageSubTypeToString(@Nullable MessageSubType messageStatus) {
        switch (messageStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStatus.ordinal()]) {
            case 1:
                return "chat";
            case 2:
                return "comment";
            case 3:
                return "replyComment";
            case 4:
                return "replySecondComment";
            case 5:
                return "agreePost";
            case 6:
                return "agreeComment";
            case 7:
                return "agreeSecondComment";
            case 8:
                return "collect";
            case 9:
                return Type.FOLLOW_MESSAGE;
            default:
                return null;
        }
    }
}
