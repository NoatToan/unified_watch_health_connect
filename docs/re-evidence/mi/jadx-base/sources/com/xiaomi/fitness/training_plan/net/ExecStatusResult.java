package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/ExecStatusResult;", "", "result", "", "<init>", "(Z)V", "getResult", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExecStatusResult {

    @SerializedName("success")
    private final boolean result;

    public ExecStatusResult(boolean z) {
        this.result = z;
    }

    public static /* synthetic */ ExecStatusResult copy$default(ExecStatusResult execStatusResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = execStatusResult.result;
        }
        return execStatusResult.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    @NotNull
    public final ExecStatusResult copy(boolean result) {
        return new ExecStatusResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExecStatusResult) && this.result == ((ExecStatusResult) other).result;
    }

    public final boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        return Boolean.hashCode(this.result);
    }

    @NotNull
    public String toString() {
        return "ExecStatusResult(result=" + this.result + ")";
    }
}
