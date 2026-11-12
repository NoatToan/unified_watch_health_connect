package com.huami.message.dto;

import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.push.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/huami/message/dto/MessageSubType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CHAT", "COMMENT", "REPLY_COMMENT", "REPLY_SECOND_COMMENT", "AGREE_POST", "AGREE_COMMENT", "AGREE_SECOND_COMMENT", "COLLECT", Constant.FOLLOW_STATUS, "COMMENT_LATEST", "COMMENT_HISTORY", "AGREE_LATEST", "AGREE_HISTORY", "common-message_release"}, k = 1, mv = {1, 5, 1})
public enum MessageSubType {
    CHAT("chat"),
    COMMENT("comment"),
    REPLY_COMMENT("replyComment"),
    REPLY_SECOND_COMMENT("replySecondComment"),
    AGREE_POST("agreePost"),
    AGREE_COMMENT("agreeComment"),
    AGREE_SECOND_COMMENT("agreeSecondComment"),
    COLLECT("collect"),
    FOLLOW(Type.FOLLOW_MESSAGE),
    COMMENT_LATEST("comment_latest"),
    COMMENT_HISTORY("comment_history"),
    AGREE_LATEST("agree_latest"),
    AGREE_HISTORY("agree_history");


    @NotNull
    private final String value;

    MessageSubType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
