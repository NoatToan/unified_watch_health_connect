package com.xiaomi.fitness.rn.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/rn/bean/RevokePrivacyResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "", "<init>", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RevokePrivacyResult extends BaseBean {

    @SerializedName("result")
    @NotNull
    private final String result;

    public RevokePrivacyResult(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ RevokePrivacyResult copy$default(RevokePrivacyResult revokePrivacyResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = revokePrivacyResult.result;
        }
        return revokePrivacyResult.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final RevokePrivacyResult copy(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new RevokePrivacyResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RevokePrivacyResult) && Intrinsics.areEqual(this.result, ((RevokePrivacyResult) other).result);
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "{code=" + getCode() + ", msg=" + getMessage() + ", result=" + this.result + "}";
    }
}
