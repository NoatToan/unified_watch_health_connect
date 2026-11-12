package com.huami.bluetooth.profile.channel.module.call_reply;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "Ljava/io/Serializable;", "id", "", MiuiCursorConstants.CONTENT, "", "(ILjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ReplyMsg implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final String content;
    private final int id;

    public ReplyMsg(int i, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = i;
        this.content = content;
    }

    public static /* synthetic */ ReplyMsg copy$default(ReplyMsg replyMsg, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = replyMsg.id;
        }
        if ((i2 & 2) != 0) {
            str = replyMsg.content;
        }
        return replyMsg.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final ReplyMsg copy(int id, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new ReplyMsg(id, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyMsg)) {
            return false;
        }
        ReplyMsg replyMsg = (ReplyMsg) other;
        return this.id == replyMsg.id && Intrinsics.areEqual(this.content, replyMsg.content);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReplyMsg(id=" + this.id + ", content=" + this.content + ')';
    }
}
