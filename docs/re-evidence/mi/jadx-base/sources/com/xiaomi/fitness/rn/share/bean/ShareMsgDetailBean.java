package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/ShareMsgDetailBean;", "", "msg_id", "", "img_url", "extra_data", RnReportConst.ApiReport.PARAM_MODULE, "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getMsg_id", "()Ljava/lang/String;", "setMsg_id", "(Ljava/lang/String;)V", "getImg_url", "setImg_url", "getExtra_data", "setExtra_data", "getModule", "()I", "setModule", "(I)V", "getType", "setType", "deviceShareMsgBean", "Lcom/xiaomi/fitness/rn/share/bean/DeviceShareMsgBean;", "getDeviceShareMsgBean", "()Lcom/xiaomi/fitness/rn/share/bean/DeviceShareMsgBean;", "setDeviceShareMsgBean", "(Lcom/xiaomi/fitness/rn/share/bean/DeviceShareMsgBean;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShareMsgDetailBean {

    @Nullable
    private DeviceShareMsgBean deviceShareMsgBean;

    @NotNull
    private String extra_data;

    @NotNull
    private String img_url;
    private int module;

    @NotNull
    private String msg_id;
    private int type;

    public ShareMsgDetailBean(@NotNull String msg_id, @NotNull String img_url, @NotNull String extra_data, int i, int i2) {
        Intrinsics.checkNotNullParameter(msg_id, "msg_id");
        Intrinsics.checkNotNullParameter(img_url, "img_url");
        Intrinsics.checkNotNullParameter(extra_data, "extra_data");
        this.msg_id = msg_id;
        this.img_url = img_url;
        this.extra_data = extra_data;
        this.module = i;
        this.type = i2;
    }

    public static /* synthetic */ ShareMsgDetailBean copy$default(ShareMsgDetailBean shareMsgDetailBean, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = shareMsgDetailBean.msg_id;
        }
        if ((i3 & 2) != 0) {
            str2 = shareMsgDetailBean.img_url;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = shareMsgDetailBean.extra_data;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = shareMsgDetailBean.module;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = shareMsgDetailBean.type;
        }
        return shareMsgDetailBean.copy(str, str4, str5, i4, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsg_id() {
        return this.msg_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImg_url() {
        return this.img_url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExtra_data() {
        return this.extra_data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getModule() {
        return this.module;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final ShareMsgDetailBean copy(@NotNull String msg_id, @NotNull String img_url, @NotNull String extra_data, int module, int type) {
        Intrinsics.checkNotNullParameter(msg_id, "msg_id");
        Intrinsics.checkNotNullParameter(img_url, "img_url");
        Intrinsics.checkNotNullParameter(extra_data, "extra_data");
        return new ShareMsgDetailBean(msg_id, img_url, extra_data, module, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareMsgDetailBean)) {
            return false;
        }
        ShareMsgDetailBean shareMsgDetailBean = (ShareMsgDetailBean) other;
        return Intrinsics.areEqual(this.msg_id, shareMsgDetailBean.msg_id) && Intrinsics.areEqual(this.img_url, shareMsgDetailBean.img_url) && Intrinsics.areEqual(this.extra_data, shareMsgDetailBean.extra_data) && this.module == shareMsgDetailBean.module && this.type == shareMsgDetailBean.type;
    }

    @Nullable
    public final DeviceShareMsgBean getDeviceShareMsgBean() {
        return this.deviceShareMsgBean;
    }

    @NotNull
    public final String getExtra_data() {
        return this.extra_data;
    }

    @NotNull
    public final String getImg_url() {
        return this.img_url;
    }

    public final int getModule() {
        return this.module;
    }

    @NotNull
    public final String getMsg_id() {
        return this.msg_id;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.msg_id.hashCode() * 31) + this.img_url.hashCode()) * 31) + this.extra_data.hashCode()) * 31) + Integer.hashCode(this.module)) * 31) + Integer.hashCode(this.type);
    }

    public final void setDeviceShareMsgBean(@Nullable DeviceShareMsgBean deviceShareMsgBean) {
        this.deviceShareMsgBean = deviceShareMsgBean;
    }

    public final void setExtra_data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extra_data = str;
    }

    public final void setImg_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.img_url = str;
    }

    public final void setModule(int i) {
        this.module = i;
    }

    public final void setMsg_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg_id = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "ShareMsgDetailBean(msg_id=" + this.msg_id + ", img_url=" + this.img_url + ", extra_data=" + this.extra_data + ", module=" + this.module + ", type=" + this.type + ")";
    }
}
