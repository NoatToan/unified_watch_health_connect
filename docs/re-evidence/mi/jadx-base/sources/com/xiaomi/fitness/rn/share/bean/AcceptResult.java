package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/AcceptResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "", "<init>", "(Z)V", "getResult", "()Z", "setResult", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AcceptResult extends BaseBean {
    private boolean result;

    public AcceptResult() {
        this(false, 1, null);
    }

    public static /* synthetic */ AcceptResult copy$default(AcceptResult acceptResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acceptResult.result;
        }
        return acceptResult.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    @NotNull
    public final AcceptResult copy(boolean result) {
        return new AcceptResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AcceptResult) && this.result == ((AcceptResult) other).result;
    }

    public final boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        return Boolean.hashCode(this.result);
    }

    public final void setResult(boolean z) {
        this.result = z;
    }

    @NotNull
    public String toString() {
        return "AcceptResult(result=" + this.result + ")";
    }

    public /* synthetic */ AcceptResult(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public AcceptResult(boolean z) {
        this.result = z;
    }
}
