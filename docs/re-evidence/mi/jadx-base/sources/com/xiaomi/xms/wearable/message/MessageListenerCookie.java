package com.xiaomi.xms.wearable.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/xms/wearable/message/MessageListenerCookie;", "", "did", "", "messageKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "getMessageKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MessageListenerCookie {

    @NotNull
    private final String did;

    @NotNull
    private final String messageKey;

    public MessageListenerCookie(@NotNull String did, @NotNull String messageKey) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(messageKey, "messageKey");
        this.did = did;
        this.messageKey = messageKey;
    }

    public static /* synthetic */ MessageListenerCookie copy$default(MessageListenerCookie messageListenerCookie, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageListenerCookie.did;
        }
        if ((i & 2) != 0) {
            str2 = messageListenerCookie.messageKey;
        }
        return messageListenerCookie.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageKey() {
        return this.messageKey;
    }

    @NotNull
    public final MessageListenerCookie copy(@NotNull String did, @NotNull String messageKey) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(messageKey, "messageKey");
        return new MessageListenerCookie(did, messageKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListenerCookie)) {
            return false;
        }
        MessageListenerCookie messageListenerCookie = (MessageListenerCookie) other;
        return Intrinsics.areEqual(this.did, messageListenerCookie.did) && Intrinsics.areEqual(this.messageKey, messageListenerCookie.messageKey);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getMessageKey() {
        return this.messageKey;
    }

    public int hashCode() {
        return (this.did.hashCode() * 31) + this.messageKey.hashCode();
    }

    @NotNull
    public String toString() {
        return "MessageListenerCookie(did=" + this.did + ", messageKey=" + this.messageKey + ")";
    }
}
