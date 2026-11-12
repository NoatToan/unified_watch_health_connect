package com.xiaomi.wearable;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/wearable/LocalBindResult;", "", "sourceId", "", "<init>", "(Ljava/lang/String;)V", "getSourceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocalBindResult {

    @SerializedName("source_id")
    @NotNull
    private final String sourceId;

    public LocalBindResult(@NotNull String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.sourceId = sourceId;
    }

    public static /* synthetic */ LocalBindResult copy$default(LocalBindResult localBindResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localBindResult.sourceId;
        }
        return localBindResult.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final LocalBindResult copy(@NotNull String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        return new LocalBindResult(sourceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalBindResult) && Intrinsics.areEqual(this.sourceId, ((LocalBindResult) other).sourceId);
    }

    @NotNull
    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        return this.sourceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocalBindResult(sourceId=" + this.sourceId + ")";
    }
}
