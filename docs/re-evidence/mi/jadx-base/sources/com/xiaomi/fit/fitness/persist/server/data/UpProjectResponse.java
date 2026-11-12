package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/UpProjectResponse;", "", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpProjectResponse {

    @SerializedName("result")
    private final boolean success;

    public UpProjectResponse(boolean z) {
        this.success = z;
    }

    public static /* synthetic */ UpProjectResponse copy$default(UpProjectResponse upProjectResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = upProjectResponse.success;
        }
        return upProjectResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final UpProjectResponse copy(boolean success) {
        return new UpProjectResponse(success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpProjectResponse) && this.success == ((UpProjectResponse) other).success;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success);
    }

    @NotNull
    public String toString() {
        return "UpProjectResponse(success=" + this.success + ")";
    }
}
