package com.huami.feedback.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/feedback/entity/AdditionalInfoData;", "Landroid/os/Parcelable;", "", "component1", "component2", "defaultSelectAppLog", "defaultSelectDeviceLog", "copy", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Z", "getDefaultSelectAppLog", "()Z", "b", "getDefaultSelectDeviceLog", "<init>", "(ZZ)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AdditionalInfoData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfoData> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("defaultSelectAppLog")
    private final boolean defaultSelectAppLog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("defaultSelectDeviceLog")
    private final boolean defaultSelectDeviceLog;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<AdditionalInfoData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AdditionalInfoData createFromParcel(@NotNull Parcel parcel) {
            return new AdditionalInfoData(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AdditionalInfoData[] newArray(int i) {
            return new AdditionalInfoData[i];
        }
    }

    public AdditionalInfoData(boolean z, boolean z2) {
        this.defaultSelectAppLog = z;
        this.defaultSelectDeviceLog = z2;
    }

    public static /* synthetic */ AdditionalInfoData copy$default(AdditionalInfoData additionalInfoData, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = additionalInfoData.defaultSelectAppLog;
        }
        if ((i & 2) != 0) {
            z2 = additionalInfoData.defaultSelectDeviceLog;
        }
        return additionalInfoData.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDefaultSelectAppLog() {
        return this.defaultSelectAppLog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDefaultSelectDeviceLog() {
        return this.defaultSelectDeviceLog;
    }

    @NotNull
    public final AdditionalInfoData copy(boolean defaultSelectAppLog, boolean defaultSelectDeviceLog) {
        return new AdditionalInfoData(defaultSelectAppLog, defaultSelectDeviceLog);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalInfoData)) {
            return false;
        }
        AdditionalInfoData additionalInfoData = (AdditionalInfoData) other;
        return this.defaultSelectAppLog == additionalInfoData.defaultSelectAppLog && this.defaultSelectDeviceLog == additionalInfoData.defaultSelectDeviceLog;
    }

    public final boolean getDefaultSelectAppLog() {
        return this.defaultSelectAppLog;
    }

    public final boolean getDefaultSelectDeviceLog() {
        return this.defaultSelectDeviceLog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.defaultSelectAppLog;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.defaultSelectDeviceLog;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "AdditionalInfoData(defaultSelectAppLog=" + this.defaultSelectAppLog + ", defaultSelectDeviceLog=" + this.defaultSelectDeviceLog + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeInt(this.defaultSelectAppLog ? 1 : 0);
        parcel.writeInt(this.defaultSelectDeviceLog ? 1 : 0);
    }
}
