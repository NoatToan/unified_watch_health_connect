package com.xiaomi.fitness.rn.share.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/DeviceShareMsgBean;", "", "invite_id", "", "sender_name", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInvite_id", "()Ljava/lang/String;", "setInvite_id", "(Ljava/lang/String;)V", "getSender_name", "setSender_name", "getModel", "setModel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceShareMsgBean {

    @NotNull
    private String invite_id;

    @NotNull
    private String model;

    @NotNull
    private String sender_name;

    public DeviceShareMsgBean(@NotNull String invite_id, @NotNull String sender_name, @NotNull String model) {
        Intrinsics.checkNotNullParameter(invite_id, "invite_id");
        Intrinsics.checkNotNullParameter(sender_name, "sender_name");
        Intrinsics.checkNotNullParameter(model, "model");
        this.invite_id = invite_id;
        this.sender_name = sender_name;
        this.model = model;
    }

    public static /* synthetic */ DeviceShareMsgBean copy$default(DeviceShareMsgBean deviceShareMsgBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceShareMsgBean.invite_id;
        }
        if ((i & 2) != 0) {
            str2 = deviceShareMsgBean.sender_name;
        }
        if ((i & 4) != 0) {
            str3 = deviceShareMsgBean.model;
        }
        return deviceShareMsgBean.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInvite_id() {
        return this.invite_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSender_name() {
        return this.sender_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final DeviceShareMsgBean copy(@NotNull String invite_id, @NotNull String sender_name, @NotNull String model) {
        Intrinsics.checkNotNullParameter(invite_id, "invite_id");
        Intrinsics.checkNotNullParameter(sender_name, "sender_name");
        Intrinsics.checkNotNullParameter(model, "model");
        return new DeviceShareMsgBean(invite_id, sender_name, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceShareMsgBean)) {
            return false;
        }
        DeviceShareMsgBean deviceShareMsgBean = (DeviceShareMsgBean) other;
        return Intrinsics.areEqual(this.invite_id, deviceShareMsgBean.invite_id) && Intrinsics.areEqual(this.sender_name, deviceShareMsgBean.sender_name) && Intrinsics.areEqual(this.model, deviceShareMsgBean.model);
    }

    @NotNull
    public final String getInvite_id() {
        return this.invite_id;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getSender_name() {
        return this.sender_name;
    }

    public int hashCode() {
        return (((this.invite_id.hashCode() * 31) + this.sender_name.hashCode()) * 31) + this.model.hashCode();
    }

    public final void setInvite_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invite_id = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setSender_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sender_name = str;
    }

    @NotNull
    public String toString() {
        return "DeviceShareMsgBean(invite_id=" + this.invite_id + ", sender_name=" + this.sender_name + ", model=" + this.model + ")";
    }
}
