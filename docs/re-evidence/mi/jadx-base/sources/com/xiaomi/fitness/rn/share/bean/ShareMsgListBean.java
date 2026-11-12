package com.xiaomi.fitness.rn.share.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/ShareMsgListBean;", "", "msg_count", "", "msg_ids", "", "", "<init>", "(ILjava/util/List;)V", "getMsg_count", "()I", "setMsg_count", "(I)V", "getMsg_ids", "()Ljava/util/List;", "setMsg_ids", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShareMsgListBean {
    private int msg_count;

    @NotNull
    private List<Long> msg_ids;

    public ShareMsgListBean(int i, @NotNull List<Long> msg_ids) {
        Intrinsics.checkNotNullParameter(msg_ids, "msg_ids");
        this.msg_count = i;
        this.msg_ids = msg_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareMsgListBean copy$default(ShareMsgListBean shareMsgListBean, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shareMsgListBean.msg_count;
        }
        if ((i2 & 2) != 0) {
            list = shareMsgListBean.msg_ids;
        }
        return shareMsgListBean.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMsg_count() {
        return this.msg_count;
    }

    @NotNull
    public final List<Long> component2() {
        return this.msg_ids;
    }

    @NotNull
    public final ShareMsgListBean copy(int msg_count, @NotNull List<Long> msg_ids) {
        Intrinsics.checkNotNullParameter(msg_ids, "msg_ids");
        return new ShareMsgListBean(msg_count, msg_ids);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareMsgListBean)) {
            return false;
        }
        ShareMsgListBean shareMsgListBean = (ShareMsgListBean) other;
        return this.msg_count == shareMsgListBean.msg_count && Intrinsics.areEqual(this.msg_ids, shareMsgListBean.msg_ids);
    }

    public final int getMsg_count() {
        return this.msg_count;
    }

    @NotNull
    public final List<Long> getMsg_ids() {
        return this.msg_ids;
    }

    public int hashCode() {
        return (Integer.hashCode(this.msg_count) * 31) + this.msg_ids.hashCode();
    }

    public final void setMsg_count(int i) {
        this.msg_count = i;
    }

    public final void setMsg_ids(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.msg_ids = list;
    }

    @NotNull
    public String toString() {
        return "ShareMsgListBean(msg_count=" + this.msg_count + ", msg_ids=" + this.msg_ids + ")";
    }

    public /* synthetic */ ShareMsgListBean(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
