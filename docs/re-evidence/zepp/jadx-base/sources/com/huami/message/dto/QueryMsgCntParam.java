package com.huami.message.dto;

import com.huami.message.api.WebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003J1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R!\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/message/dto/QueryMsgCntParam;", "", "", "component1", "component2", "", "component3", WebConst.QueryParam.NOTICE_TYPE, WebConst.QueryParam.MESSAGE_TYPE, "messageSubTypes", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getNoticeType", "()Ljava/lang/String;", "b", "getMessageType", "c", "Ljava/util/List;", "getMessageSubTypes", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class QueryMsgCntParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String noticeType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String messageType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<String> messageSubTypes;

    public QueryMsgCntParam(@NotNull String str, @Nullable String str2, @Nullable List<String> list) {
        this.noticeType = str;
        this.messageType = str2;
        this.messageSubTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryMsgCntParam copy$default(QueryMsgCntParam queryMsgCntParam, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryMsgCntParam.noticeType;
        }
        if ((i & 2) != 0) {
            str2 = queryMsgCntParam.messageType;
        }
        if ((i & 4) != 0) {
            list = queryMsgCntParam.messageSubTypes;
        }
        return queryMsgCntParam.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final List<String> component3() {
        return this.messageSubTypes;
    }

    @NotNull
    public final QueryMsgCntParam copy(@NotNull String noticeType, @Nullable String messageType, @Nullable List<String> messageSubTypes) {
        return new QueryMsgCntParam(noticeType, messageType, messageSubTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryMsgCntParam)) {
            return false;
        }
        QueryMsgCntParam queryMsgCntParam = (QueryMsgCntParam) other;
        return Intrinsics.areEqual(this.noticeType, queryMsgCntParam.noticeType) && Intrinsics.areEqual(this.messageType, queryMsgCntParam.messageType) && Intrinsics.areEqual(this.messageSubTypes, queryMsgCntParam.messageSubTypes);
    }

    @Nullable
    public final List<String> getMessageSubTypes() {
        return this.messageSubTypes;
    }

    @Nullable
    public final String getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final String getNoticeType() {
        return this.noticeType;
    }

    public int hashCode() {
        int iHashCode = this.noticeType.hashCode() * 31;
        String str = this.messageType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.messageSubTypes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QueryMsgCntParam(noticeType=" + this.noticeType + ", messageType=" + ((Object) this.messageType) + ", messageSubTypes=" + this.messageSubTypes + ')';
    }
}
