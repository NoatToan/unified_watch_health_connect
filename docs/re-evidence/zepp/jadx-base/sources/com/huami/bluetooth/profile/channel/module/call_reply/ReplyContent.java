package com.huami.bluetooth.profile.channel.module.call_reply;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.twitter.sdk.android.tweetcomposer.g;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "", "component4", "title", "phoneNo", "content", g.g, "copy", "toString", "", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getPhoneNo", "c", "getContent", "setContent", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "Z", "getCancel", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ReplyContent implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String phoneNo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private String content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean cancel;

    public ReplyContent(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z) {
        this.title = str;
        this.phoneNo = str2;
        this.content = str3;
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
        return "ReplyContent(title=" + this.title + ", phoneNo=" + this.phoneNo + ", content=" + ((Object) this.content) + ", cancel=" + this.cancel + ')';
    }

    public /* synthetic */ ReplyContent(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }
}
