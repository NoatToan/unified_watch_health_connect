package com.huami.third.wechat;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/huami/third/wechat/QRResult;", "", "", "component1", "component2", "ticket", "toUserName", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTicket", "()Ljava/lang/String;", "setTicket", "(Ljava/lang/String;)V", "b", "getToUserName", "setToUserName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class QRResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("ticket")
    @NotNull
    private String ticket;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("toUserName")
    @NotNull
    private String toUserName;

    public QRResult(@NotNull String str, @NotNull String str2) {
        this.ticket = str;
        this.toUserName = str2;
    }

    public static /* synthetic */ QRResult copy$default(QRResult qRResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRResult.ticket;
        }
        if ((i & 2) != 0) {
            str2 = qRResult.toUserName;
        }
        return qRResult.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToUserName() {
        return this.toUserName;
    }

    @NotNull
    public final QRResult copy(@NotNull String ticket, @NotNull String toUserName) {
        return new QRResult(ticket, toUserName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRResult)) {
            return false;
        }
        QRResult qRResult = (QRResult) other;
        return Intrinsics.areEqual(this.ticket, qRResult.ticket) && Intrinsics.areEqual(this.toUserName, qRResult.toUserName);
    }

    @NotNull
    public final String getTicket() {
        return this.ticket;
    }

    @NotNull
    public final String getToUserName() {
        return this.toUserName;
    }

    public int hashCode() {
        return (this.ticket.hashCode() * 31) + this.toUserName.hashCode();
    }

    public final void setTicket(@NotNull String str) {
        this.ticket = str;
    }

    public final void setToUserName(@NotNull String str) {
        this.toUserName = str;
    }

    @NotNull
    public String toString() {
        return "QRResult(ticket=" + this.ticket + ", toUserName=" + this.toUserName + ")";
    }
}
