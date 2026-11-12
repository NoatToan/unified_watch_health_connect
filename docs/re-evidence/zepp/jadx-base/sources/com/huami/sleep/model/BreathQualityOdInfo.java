package com.huami.sleep.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/sleep/model/BreathQualityOdInfo;", "", "", "component1", "component2", "", "component3", "", "component4", "start", "end", "times", "version", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getStart", "()J", "b", "getEnd", "c", LogUtil.I, "getTimes", "()I", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "<init>", "(JJILjava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathQualityOdInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int times;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String version;

    public BreathQualityOdInfo(long j, long j2, int i, @Nullable String str) {
        this.start = j;
        this.end = j2;
        this.times = i;
        this.version = str;
    }

    public static /* synthetic */ BreathQualityOdInfo copy$default(BreathQualityOdInfo breathQualityOdInfo, long j, long j2, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = breathQualityOdInfo.start;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = breathQualityOdInfo.end;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = breathQualityOdInfo.times;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = breathQualityOdInfo.version;
        }
        return breathQualityOdInfo.copy(j3, j4, i3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimes() {
        return this.times;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final BreathQualityOdInfo copy(long start, long end, int times, @Nullable String version) {
        return new BreathQualityOdInfo(start, end, times, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathQualityOdInfo)) {
            return false;
        }
        BreathQualityOdInfo breathQualityOdInfo = (BreathQualityOdInfo) other;
        return this.start == breathQualityOdInfo.start && this.end == breathQualityOdInfo.end && this.times == breathQualityOdInfo.times && Intrinsics.areEqual(this.version, breathQualityOdInfo.version);
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getTimes() {
        return this.times;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iA = ((((b.a(this.start) * 31) + b.a(this.end)) * 31) + this.times) * 31;
        String str = this.version;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "BreathQualityOdInfo(start=" + this.start + ", end=" + this.end + ", times=" + this.times + ", version=" + this.version + ")";
    }
}
