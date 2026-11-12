package com.huami.bluetooth.profile.channel.module.call_reply;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "Ljava/io/Serializable;", "", "component1", "", "component2", "id", "content", "copy", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getId", "()I", "b", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ReplyMsg implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    public ReplyMsg(int i, @NotNull String str) {
        this.id = i;
        this.content = str;
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
        return (this.id * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReplyMsg(id=" + this.id + ", content=" + this.content + ')';
    }
}
