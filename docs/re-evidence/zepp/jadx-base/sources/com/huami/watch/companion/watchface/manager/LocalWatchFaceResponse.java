package com.huami.watch.companion.watchface.manager;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/LocalWatchFaceResponse;", "", "", "component1", "cloudId", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getCloudId", "()I", "<init>", "(I)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LocalWatchFaceResponse {
    private final int cloudId;

    public LocalWatchFaceResponse(int i) {
        this.cloudId = i;
    }

    public static /* synthetic */ LocalWatchFaceResponse copy$default(LocalWatchFaceResponse localWatchFaceResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = localWatchFaceResponse.cloudId;
        }
        return localWatchFaceResponse.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCloudId() {
        return this.cloudId;
    }

    @NotNull
    public final LocalWatchFaceResponse copy(int cloudId) {
        return new LocalWatchFaceResponse(cloudId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalWatchFaceResponse) && this.cloudId == ((LocalWatchFaceResponse) other).cloudId;
    }

    public final int getCloudId() {
        return this.cloudId;
    }

    public int hashCode() {
        return this.cloudId;
    }

    @NotNull
    public String toString() {
        return "LocalWatchFaceResponse(cloudId=" + this.cloudId + ")";
    }
}
