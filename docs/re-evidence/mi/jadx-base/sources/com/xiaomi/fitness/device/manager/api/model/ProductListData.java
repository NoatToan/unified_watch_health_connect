package com.xiaomi.fitness.device.manager.api.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.net.response.BaseListData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/model/ProductListData;", "Lcom/xiaomi/fitness/net/response/BaseListData;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "<init>", "()V", "lastModifyTime", "", "getLastModifyTime", "()J", "setLastModifyTime", "(J)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductListData extends BaseListData<WearableProduct> {

    @SerializedName("last_modify_time")
    private long lastModifyTime;

    public final long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public final void setLastModifyTime(long j) {
        this.lastModifyTime = j;
    }
}
