package com.xiaomi.fitness.rn.share.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/ShareMsgDetailListBean;", "", "messages", "", "Lcom/xiaomi/fitness/rn/share/bean/ShareMsgDetailBean;", "<init>", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "setMessages", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShareMsgDetailListBean {

    @NotNull
    private List<ShareMsgDetailBean> messages;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareMsgDetailListBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareMsgDetailListBean copy$default(ShareMsgDetailListBean shareMsgDetailListBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shareMsgDetailListBean.messages;
        }
        return shareMsgDetailListBean.copy(list);
    }

    @NotNull
    public final List<ShareMsgDetailBean> component1() {
        return this.messages;
    }

    @NotNull
    public final ShareMsgDetailListBean copy(@NotNull List<ShareMsgDetailBean> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new ShareMsgDetailListBean(messages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShareMsgDetailListBean) && Intrinsics.areEqual(this.messages, ((ShareMsgDetailListBean) other).messages);
    }

    @NotNull
    public final List<ShareMsgDetailBean> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode();
    }

    public final void setMessages(@NotNull List<ShareMsgDetailBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messages = list;
    }

    @NotNull
    public String toString() {
        return "ShareMsgDetailListBean(messages=" + this.messages + ")";
    }

    public ShareMsgDetailListBean(@NotNull List<ShareMsgDetailBean> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
    }

    public /* synthetic */ ShareMsgDetailListBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
