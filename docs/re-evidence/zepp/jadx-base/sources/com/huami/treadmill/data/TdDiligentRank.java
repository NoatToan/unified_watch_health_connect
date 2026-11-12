package com.huami.treadmill.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/huami/treadmill/data/TdDiligentRank;", "", "", "icon", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "", WatchFaceDetailActivity.FROM_RANK, LogUtil.I, "getRank", "()I", "setRank", "(I)V", "name", "getName", "setName", "count", "getCount", "setCount", "dominat_time", "getDominat_time", "setDominat_time", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdDiligentRank {
    private int count;
    private int dominat_time;

    @NotNull
    private String icon;

    @NotNull
    private String name;
    private int rank;

    public TdDiligentRank() {
        this(null, 0, null, 0, 0, 31, null);
    }

    public TdDiligentRank(@NotNull String str, int i, @NotNull String str2, int i2, int i3) {
        this.icon = str;
        this.rank = i;
        this.name = str2;
        this.count = i2;
        this.dominat_time = i3;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDominat_time() {
        return this.dominat_time;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDominat_time(int i) {
        this.dominat_time = i;
    }

    public final void setIcon(@NotNull String str) {
        this.icon = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public /* synthetic */ TdDiligentRank(String str, int i, String str2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) == 0 ? str2 : "", (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }
}
