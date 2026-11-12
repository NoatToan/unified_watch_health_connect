package com.huami.bloodoxygen.service.osaevent;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/bloodoxygen/service/osaevent/DifficultBreath;", "", "", "component1", "component2", "", "component3", "", "component4", "start", "end", "times", "version", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getStart", "()J", "b", "getEnd", "c", LogUtil.I, "getTimes", "()I", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "<init>", "(JJILjava/lang/String;)V", "service_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class DifficultBreath {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int times;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String version;

    public DifficultBreath(long j, long j2, int i, @NotNull String str) {
        this.start = j;
        this.end = j2;
        this.times = i;
        this.version = str;
    }

    public static /* synthetic */ DifficultBreath copy$default(DifficultBreath difficultBreath, long j, long j2, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = difficultBreath.start;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = difficultBreath.end;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = difficultBreath.times;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = difficultBreath.version;
        }
        return difficultBreath.copy(j3, j4, i3, str);
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

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final DifficultBreath copy(long start, long end, int times, @NotNull String version) {
        return new DifficultBreath(start, end, times, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DifficultBreath)) {
            return false;
        }
        DifficultBreath difficultBreath = (DifficultBreath) other;
        return this.start == difficultBreath.start && this.end == difficultBreath.end && this.times == difficultBreath.times && Intrinsics.areEqual(this.version, difficultBreath.version);
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

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iA = ((((b.a(this.start) * 31) + b.a(this.end)) * 31) + this.times) * 31;
        String str = this.version;
        return iA + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DifficultBreath(start=" + this.start + ", end=" + this.end + ", times=" + this.times + ", version=" + this.version + ")";
    }
}
