package com.huami.message.db.po;

import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.huami.message.dto.MessageStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Entity(primaryKeys = {WebConst.QueryParam.NOTICE_TYPE, "mainType", "subType"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u0006$"}, d2 = {"Lcom/huami/message/db/po/MessageCount;", "", "", "component1", "component2", "component3", "", "component4", "component5", WebConst.QueryParam.NOTICE_TYPE, "mainType", "subType", "count", "status", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getNoticeType", "()Ljava/lang/String;", "b", "getMainType", "c", "getSubType", GoogleApiAvailabilityLight.a, LogUtil.I, "getCount", "()I", "e", "getStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MessageCount {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String noticeType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String mainType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int count;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String status;

    public MessageCount(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        this.noticeType = str;
        this.mainType = str2;
        this.subType = str3;
        this.count = i;
        this.status = str4;
    }

    public static /* synthetic */ MessageCount copy$default(MessageCount messageCount, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = messageCount.noticeType;
        }
        if ((i2 & 2) != 0) {
            str2 = messageCount.mainType;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = messageCount.subType;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = messageCount.count;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = messageCount.status;
        }
        return messageCount.copy(str, str5, str6, i3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoticeType() {
        return this.noticeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMainType() {
        return this.mainType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final MessageCount copy(@NotNull String noticeType, @NotNull String mainType, @NotNull String subType, int count, @NotNull String status) {
        return new MessageCount(noticeType, mainType, subType, count, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageCount)) {
            return false;
        }
        MessageCount messageCount = (MessageCount) other;
        return Intrinsics.areEqual(this.noticeType, messageCount.noticeType) && Intrinsics.areEqual(this.mainType, messageCount.mainType) && Intrinsics.areEqual(this.subType, messageCount.subType) && this.count == messageCount.count && Intrinsics.areEqual(this.status, messageCount.status);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getMainType() {
        return this.mainType;
    }

    @NotNull
    public final String getNoticeType() {
        return this.noticeType;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public int hashCode() {
        return (((((((this.noticeType.hashCode() * 31) + this.mainType.hashCode()) * 31) + this.subType.hashCode()) * 31) + this.count) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "MessageCount(noticeType=" + this.noticeType + ", mainType=" + this.mainType + ", subType=" + this.subType + ", count=" + this.count + ", status=" + this.status + ')';
    }

    public /* synthetic */ MessageCount(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? MessageStatus.NEW.getStatus() : str4);
    }
}
