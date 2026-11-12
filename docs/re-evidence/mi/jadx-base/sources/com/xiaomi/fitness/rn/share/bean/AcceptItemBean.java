package com.xiaomi.fitness.rn.share.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;", "", "device_name", "", "sender_name", "did", "model", "inv_id", "status", "", "msgId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDevice_name", "()Ljava/lang/String;", "getSender_name", "getDid", "getModel", "getInv_id", "getStatus", "()I", "setStatus", "(I)V", "getMsgId", "isAccepted", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AcceptItemBean {

    @NotNull
    private final String device_name;

    @NotNull
    private final String did;

    @NotNull
    private final String inv_id;

    @NotNull
    private final String model;

    @NotNull
    private final String msgId;

    @NotNull
    private final String sender_name;
    private int status;

    public AcceptItemBean(@NotNull String device_name, @NotNull String sender_name, @NotNull String did, @NotNull String model, @NotNull String inv_id, int i, @NotNull String msgId) {
        Intrinsics.checkNotNullParameter(device_name, "device_name");
        Intrinsics.checkNotNullParameter(sender_name, "sender_name");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(inv_id, "inv_id");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        this.device_name = device_name;
        this.sender_name = sender_name;
        this.did = did;
        this.model = model;
        this.inv_id = inv_id;
        this.status = i;
        this.msgId = msgId;
    }

    public static /* synthetic */ AcceptItemBean copy$default(AcceptItemBean acceptItemBean, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = acceptItemBean.device_name;
        }
        if ((i2 & 2) != 0) {
            str2 = acceptItemBean.sender_name;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = acceptItemBean.did;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = acceptItemBean.model;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = acceptItemBean.inv_id;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            i = acceptItemBean.status;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            str6 = acceptItemBean.msgId;
        }
        return acceptItemBean.copy(str, str7, str8, str9, str10, i3, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDevice_name() {
        return this.device_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSender_name() {
        return this.sender_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInv_id() {
        return this.inv_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    @NotNull
    public final AcceptItemBean copy(@NotNull String device_name, @NotNull String sender_name, @NotNull String did, @NotNull String model, @NotNull String inv_id, int status, @NotNull String msgId) {
        Intrinsics.checkNotNullParameter(device_name, "device_name");
        Intrinsics.checkNotNullParameter(sender_name, "sender_name");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(inv_id, "inv_id");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        return new AcceptItemBean(device_name, sender_name, did, model, inv_id, status, msgId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcceptItemBean)) {
            return false;
        }
        AcceptItemBean acceptItemBean = (AcceptItemBean) other;
        return Intrinsics.areEqual(this.device_name, acceptItemBean.device_name) && Intrinsics.areEqual(this.sender_name, acceptItemBean.sender_name) && Intrinsics.areEqual(this.did, acceptItemBean.did) && Intrinsics.areEqual(this.model, acceptItemBean.model) && Intrinsics.areEqual(this.inv_id, acceptItemBean.inv_id) && this.status == acceptItemBean.status && Intrinsics.areEqual(this.msgId, acceptItemBean.msgId);
    }

    @NotNull
    public final String getDevice_name() {
        return this.device_name;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getInv_id() {
        return this.inv_id;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getMsgId() {
        return this.msgId;
    }

    @NotNull
    public final String getSender_name() {
        return this.sender_name;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((this.device_name.hashCode() * 31) + this.sender_name.hashCode()) * 31) + this.did.hashCode()) * 31) + this.model.hashCode()) * 31) + this.inv_id.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.msgId.hashCode();
    }

    public final boolean isAccepted() {
        return this.status == 1;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "AcceptItemBean(device_name=" + this.device_name + ", sender_name=" + this.sender_name + ", did=" + this.did + ", model=" + this.model + ", inv_id=" + this.inv_id + ", status=" + this.status + ", msgId=" + this.msgId + ")";
    }
}
