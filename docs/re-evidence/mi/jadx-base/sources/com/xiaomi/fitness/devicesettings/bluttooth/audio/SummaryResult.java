package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryResult;", "", "code", "", "abstract", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getAbstract", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SummaryResult {

    @NotNull
    private final String abstract;
    private final int code;

    public SummaryResult(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "abstract");
        this.code = i;
        this.abstract = str;
    }

    public static /* synthetic */ SummaryResult copy$default(SummaryResult summaryResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = summaryResult.code;
        }
        if ((i2 & 2) != 0) {
            str = summaryResult.abstract;
        }
        return summaryResult.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAbstract() {
        return this.abstract;
    }

    @NotNull
    public final SummaryResult copy(int code, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "abstract");
        return new SummaryResult(code, str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryResult)) {
            return false;
        }
        SummaryResult summaryResult = (SummaryResult) other;
        return this.code == summaryResult.code && Intrinsics.areEqual(this.abstract, summaryResult.abstract);
    }

    @NotNull
    public final String getAbstract() {
        return this.abstract;
    }

    public final int getCode() {
        return this.code;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.abstract.hashCode();
    }

    @NotNull
    public String toString() {
        return "SummaryResult(code=" + this.code + ", abstract=" + this.abstract + ")";
    }
}
