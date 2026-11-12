package com.huami.bluetooth.profile.channel.module.call_reply;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "Ljava/io/Serializable;", "title", "", "phoneNo", MiuiCursorConstants.CONTENT, BroadcastsKt.SILENT_PUSHING_CANCEL, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCancel", "()Z", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getPhoneNo", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ReplyContent implements Serializable {
    private static final long serialVersionUID = 1;
    private final boolean cancel;

    @Nullable
    private String content;

    @NotNull
    private final String phoneNo;

    @NotNull
    private final String title;

    public ReplyContent(@NotNull String title, @NotNull String phoneNo, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
        this.title = title;
        this.phoneNo = phoneNo;
        this.content = str;
        this.cancel = z;
    }

    public static /* synthetic */ ReplyContent copy$default(ReplyContent replyContent, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyContent.title;
        }
        if ((i & 2) != 0) {
            str2 = replyContent.phoneNo;
        }
        if ((i & 4) != 0) {
            str3 = replyContent.content;
        }
        if ((i & 8) != 0) {
            z = replyContent.cancel;
        }
        return replyContent.copy(str, str2, str3, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneNo() {
        return this.phoneNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCancel() {
        return this.cancel;
    }

    @NotNull
    public final ReplyContent copy(@NotNull String title, @NotNull String phoneNo, @Nullable String content, boolean cancel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
        return new ReplyContent(title, phoneNo, content, cancel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyContent)) {
            return false;
        }
        ReplyContent replyContent = (ReplyContent) other;
        return Intrinsics.areEqual(this.title, replyContent.title) && Intrinsics.areEqual(this.phoneNo, replyContent.phoneNo) && Intrinsics.areEqual(this.content, replyContent.content) && this.cancel == replyContent.cancel;
    }

    public final boolean getCancel() {
        return this.cancel;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getPhoneNo() {
        return this.phoneNo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.phoneNo.hashCode()) * 31;
        String str = this.content;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.cancel;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    @NotNull
    public String toString() {
        return "ReplyContent(title=" + this.title + ", phoneNo=" + this.phoneNo + ", content=" + this.content + ", cancel=" + this.cancel + ')';
    }

    public /* synthetic */ ReplyContent(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }
}
