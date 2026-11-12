package com.xiaomi.fitness.devicesettings.base.aivs;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/aivs/Data;", "", "is_success", "", "privacy_set", "Lcom/xiaomi/fitness/devicesettings/base/aivs/PrivacySet;", "watermark", "", "<init>", "(ZLcom/xiaomi/fitness/devicesettings/base/aivs/PrivacySet;J)V", "()Z", "getPrivacy_set", "()Lcom/xiaomi/fitness/devicesettings/base/aivs/PrivacySet;", "getWatermark", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Data {
    private final boolean is_success;

    @NotNull
    private final PrivacySet privacy_set;
    private final long watermark;

    public Data(boolean z, @NotNull PrivacySet privacy_set, long j) {
        Intrinsics.checkNotNullParameter(privacy_set, "privacy_set");
        this.is_success = z;
        this.privacy_set = privacy_set;
        this.watermark = j;
    }

    public static /* synthetic */ Data copy$default(Data data, boolean z, PrivacySet privacySet, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = data.is_success;
        }
        if ((i & 2) != 0) {
            privacySet = data.privacy_set;
        }
        if ((i & 4) != 0) {
            j = data.watermark;
        }
        return data.copy(z, privacySet, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIs_success() {
        return this.is_success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PrivacySet getPrivacy_set() {
        return this.privacy_set;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getWatermark() {
        return this.watermark;
    }

    @NotNull
    public final Data copy(boolean is_success, @NotNull PrivacySet privacy_set, long watermark) {
        Intrinsics.checkNotNullParameter(privacy_set, "privacy_set");
        return new Data(is_success, privacy_set, watermark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return this.is_success == data.is_success && Intrinsics.areEqual(this.privacy_set, data.privacy_set) && this.watermark == data.watermark;
    }

    @NotNull
    public final PrivacySet getPrivacy_set() {
        return this.privacy_set;
    }

    public final long getWatermark() {
        return this.watermark;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.is_success) * 31) + this.privacy_set.hashCode()) * 31) + Long.hashCode(this.watermark);
    }

    public final boolean is_success() {
        return this.is_success;
    }

    @NotNull
    public String toString() {
        return "Data(is_success=" + this.is_success + ", privacy_set=" + this.privacy_set + ", watermark=" + this.watermark + ")";
    }
}
