package com.huami.respiratoryrate.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/respiratoryrate/service/RespiratoryRate;", "", "", "component1", "", "component2", "component3", "", "component4", "respRate", "timeStamp", "offset", "userId", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getRespRate", "()I", "b", "J", "getTimeStamp", "()J", "c", "getOffset", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "<init>", "(IJILjava/lang/String;)V", "service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class RespiratoryRate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int respRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int offset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    public RespiratoryRate() {
        this(0, 0L, 0, null, 15, null);
    }

    public RespiratoryRate(int i, long j, int i2, @NotNull String str) {
        this.respRate = i;
        this.timeStamp = j;
        this.offset = i2;
        this.userId = str;
    }

    public static /* synthetic */ RespiratoryRate copy$default(RespiratoryRate respiratoryRate, int i, long j, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = respiratoryRate.respRate;
        }
        if ((i3 & 2) != 0) {
            j = respiratoryRate.timeStamp;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            i2 = respiratoryRate.offset;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str = respiratoryRate.userId;
        }
        return respiratoryRate.copy(i, j2, i4, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRespRate() {
        return this.respRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final RespiratoryRate copy(int respRate, long timeStamp, int offset, @NotNull String userId) {
        return new RespiratoryRate(respRate, timeStamp, offset, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            if (other instanceof RespiratoryRate) {
                RespiratoryRate respiratoryRate = (RespiratoryRate) other;
                if (this.respRate == respiratoryRate.respRate) {
                    if (this.timeStamp == respiratoryRate.timeStamp) {
                        if (!(this.offset == respiratoryRate.offset) || !Intrinsics.areEqual(this.userId, respiratoryRate.userId)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getRespRate() {
        return this.respRate;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = ((((this.respRate * 31) + b.a(this.timeStamp)) * 31) + this.offset) * 31;
        String str = this.userId;
        return iA + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RespiratoryRate(respRate=" + this.respRate + ", timeStamp=" + this.timeStamp + ", offset=" + this.offset + ", userId=" + this.userId + ")";
    }

    public /* synthetic */ RespiratoryRate(int i, long j, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? -1L : j, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str);
    }
}
