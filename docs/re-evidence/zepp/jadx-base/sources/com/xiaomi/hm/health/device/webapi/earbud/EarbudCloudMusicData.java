package com.xiaomi.hm.health.device.webapi.earbud;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/earbud/EarbudCloudMusicData;", "", "", "a", LogUtil.I, "getPage", "()I", "setPage", "(I)V", DTransferConstants.PAGE, "b", "getPerPage", "setPerPage", "perPage", "c", "getTotalPage", "setTotalPage", "totalPage", "", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudCloudMusicData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int page;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int perPage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int totalPage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<EarbudMusicInfo> data;

    @Nullable
    public final List<EarbudMusicInfo> getData() {
        return this.data;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPerPage() {
        return this.perPage;
    }

    public final int getTotalPage() {
        return this.totalPage;
    }

    public final void setData(@Nullable List<EarbudMusicInfo> list) {
        this.data = list;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setPerPage(int i) {
        this.perPage = i;
    }

    public final void setTotalPage(int i) {
        this.totalPage = i;
    }
}
