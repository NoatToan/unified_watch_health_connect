package com.xiaomi.fitness.pay.export.data.response;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/CheckPayResponse;", "", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckPayResponse {
    private final boolean success;

    public CheckPayResponse(boolean z) {
        this.success = z;
    }

    public static /* synthetic */ CheckPayResponse copy$default(CheckPayResponse checkPayResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkPayResponse.success;
        }
        return checkPayResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final CheckPayResponse copy(boolean success) {
        return new CheckPayResponse(success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckPayResponse) && this.success == ((CheckPayResponse) other).success;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success);
    }

    @NotNull
    public String toString() {
        return "CheckPayResponse(success=" + this.success + ")";
    }
}
