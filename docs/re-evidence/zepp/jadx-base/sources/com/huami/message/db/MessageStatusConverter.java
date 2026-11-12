package com.huami.message.db;

import androidx.room.TypeConverter;
import com.huami.message.dto.MessageStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/huami/message/db/MessageStatusConverter;", "", "", "messageStatus", "Lcom/huami/message/dto/MessageStatus;", "intoMessageStatus", "messageStatusToString", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class MessageStatusConverter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStatus.values().length];
            iArr[MessageStatus.NEW.ordinal()] = 1;
            iArr[MessageStatus.READ.ordinal()] = 2;
            iArr[MessageStatus.DELETED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @TypeConverter
    @Nullable
    public final MessageStatus intoMessageStatus(@Nullable String messageStatus) {
        if (messageStatus != null) {
            int iHashCode = messageStatus.hashCode();
            if (iHashCode != -2026521607) {
                if (iHashCode != 77184) {
                    if (iHashCode == 2511254 && messageStatus.equals("READ")) {
                        return MessageStatus.READ;
                    }
                } else if (messageStatus.equals("NEW")) {
                    return MessageStatus.NEW;
                }
            } else if (messageStatus.equals("DELETED")) {
                return MessageStatus.DELETED;
            }
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final String messageStatusToString(@Nullable MessageStatus messageStatus) {
        int i = messageStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStatus.ordinal()];
        if (i == 1) {
            return "NEW";
        }
        if (i == 2) {
            return "READ";
        }
        if (i != 3) {
            return null;
        }
        return "DELETED";
    }
}
