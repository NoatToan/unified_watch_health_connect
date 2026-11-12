package com.xiaomi.hm.health.device.watchskinnew.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBeanNew;", "", "", "a", "Ljava/lang/Integer;", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", DTransferConstants.PAGE, "", "b", "Ljava/lang/String;", "getPerPage", "()Ljava/lang/String;", "setPerPage", "(Ljava/lang/String;)V", "perPage", "c", "getTotalPage", "setTotalPage", "totalPage", "", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/Data;", GoogleApiAvailabilityLight.a, "[Lcom/xiaomi/hm/health/device/watchskinnew/bean/Data;", "getData", "()[Lcom/xiaomi/hm/health/device/watchskinnew/bean/Data;", "setData", "([Lcom/xiaomi/hm/health/device/watchskinnew/bean/Data;)V", "data", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinBeanNew {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(DTransferConstants.PAGE)
    @Nullable
    private Integer page;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("per_page")
    @Nullable
    private String perPage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(DTransferConstants.TOTAL_PAGE)
    @Nullable
    private String totalPage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("data")
    @Nullable
    private Data[] data;

    @Nullable
    public final Data[] getData() {
        return this.data;
    }

    @Nullable
    public final Integer getPage() {
        return this.page;
    }

    @Nullable
    public final String getPerPage() {
        return this.perPage;
    }

    @Nullable
    public final String getTotalPage() {
        return this.totalPage;
    }

    public final void setData(@Nullable Data[] dataArr) {
        this.data = dataArr;
    }

    public final void setPage(@Nullable Integer num) {
        this.page = num;
    }

    public final void setPerPage(@Nullable String str) {
        this.perPage = str;
    }

    public final void setTotalPage(@Nullable String str) {
        this.totalPage = str;
    }
}
