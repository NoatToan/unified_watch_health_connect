package com.huami.sync;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000b\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/sync/ToggleResult;", "", "", "isAllow", "", "component1", "", "component2", "", "component3", "realTimeRate", "result", "failMsg", "copy", "toString", "hashCode", "other", "equals", "a", "J", "getRealTimeRate", "()J", "b", LogUtil.I, "getResult", "()I", "c", "Ljava/lang/String;", "getFailMsg", "()Ljava/lang/String;", "<init>", "(JILjava/lang/String;)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ToggleResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("realTimeRate")
    private final long realTimeRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("result")
    private final int result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("failMsg")
    @NotNull
    private final String failMsg;

    public ToggleResult(long j, int i, @NotNull String str) {
        this.realTimeRate = j;
        this.result = i;
        this.failMsg = str;
    }

    public static /* synthetic */ ToggleResult copy$default(ToggleResult toggleResult, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = toggleResult.realTimeRate;
        }
        if ((i2 & 2) != 0) {
            i = toggleResult.result;
        }
        if ((i2 & 4) != 0) {
            str = toggleResult.failMsg;
        }
        return toggleResult.copy(j, i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRealTimeRate() {
        return this.realTimeRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFailMsg() {
        return this.failMsg;
    }

    @NotNull
    public final ToggleResult copy(long realTimeRate, int result, @NotNull String failMsg) {
        return new ToggleResult(realTimeRate, result, failMsg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleResult)) {
            return false;
        }
        ToggleResult toggleResult = (ToggleResult) other;
        return this.realTimeRate == toggleResult.realTimeRate && this.result == toggleResult.result && Intrinsics.areEqual(this.failMsg, toggleResult.failMsg);
    }

    @NotNull
    public final String getFailMsg() {
        return this.failMsg;
    }

    public final long getRealTimeRate() {
        return this.realTimeRate;
    }

    public final int getResult() {
        return this.result;
    }

    public int hashCode() {
        return (((b.a(this.realTimeRate) * 31) + this.result) * 31) + this.failMsg.hashCode();
    }

    public final boolean isAllow() {
        return this.result == 1;
    }

    @NotNull
    public String toString() {
        return "ToggleResult(realTimeRate=" + this.realTimeRate + ", result=" + this.result + ", failMsg=" + this.failMsg + ')';
    }
}
