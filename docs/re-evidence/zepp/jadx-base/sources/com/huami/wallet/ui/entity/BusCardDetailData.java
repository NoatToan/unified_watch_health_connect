package com.huami.wallet.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rHÖ\u0001R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\"R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c¨\u0006'"}, d2 = {"Lcom/huami/wallet/ui/entity/BusCardDetailData;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "busCardId", "busCardName", "xMiCardName", "busCardNumber", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getBusCardId", "()Ljava/lang/String;", "b", "getBusCardName", "c", "getXMiCardName", "setXMiCardName", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "getBusCardNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BusCardDetailData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BusCardDetailData> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String busCardId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String busCardName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private String xMiCardName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String busCardNumber;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<BusCardDetailData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BusCardDetailData createFromParcel(@NotNull Parcel parcel) {
            return new BusCardDetailData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BusCardDetailData[] newArray(int i) {
            return new BusCardDetailData[i];
        }
    }

    public BusCardDetailData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.busCardId = str;
        this.busCardName = str2;
        this.xMiCardName = str3;
        this.busCardNumber = str4;
    }

    public static /* synthetic */ BusCardDetailData copy$default(BusCardDetailData busCardDetailData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = busCardDetailData.busCardId;
        }
        if ((i & 2) != 0) {
            str2 = busCardDetailData.busCardName;
        }
        if ((i & 4) != 0) {
            str3 = busCardDetailData.xMiCardName;
        }
        if ((i & 8) != 0) {
            str4 = busCardDetailData.busCardNumber;
        }
        return busCardDetailData.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBusCardId() {
        return this.busCardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBusCardName() {
        return this.busCardName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getXMiCardName() {
        return this.xMiCardName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBusCardNumber() {
        return this.busCardNumber;
    }

    @NotNull
    public final BusCardDetailData copy(@Nullable String busCardId, @Nullable String busCardName, @Nullable String xMiCardName, @Nullable String busCardNumber) {
        return new BusCardDetailData(busCardId, busCardName, xMiCardName, busCardNumber);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusCardDetailData)) {
            return false;
        }
        BusCardDetailData busCardDetailData = (BusCardDetailData) other;
        return Intrinsics.areEqual(this.busCardId, busCardDetailData.busCardId) && Intrinsics.areEqual(this.busCardName, busCardDetailData.busCardName) && Intrinsics.areEqual(this.xMiCardName, busCardDetailData.xMiCardName) && Intrinsics.areEqual(this.busCardNumber, busCardDetailData.busCardNumber);
    }

    @Nullable
    public final String getBusCardId() {
        return this.busCardId;
    }

    @Nullable
    public final String getBusCardName() {
        return this.busCardName;
    }

    @Nullable
    public final String getBusCardNumber() {
        return this.busCardNumber;
    }

    @Nullable
    public final String getXMiCardName() {
        return this.xMiCardName;
    }

    public int hashCode() {
        String str = this.busCardId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.busCardName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xMiCardName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.busCardNumber;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setXMiCardName(@Nullable String str) {
        this.xMiCardName = str;
    }

    @NotNull
    public String toString() {
        return "BusCardDetailData(busCardId=" + ((Object) this.busCardId) + ", busCardName=" + ((Object) this.busCardName) + ", xMiCardName=" + ((Object) this.xMiCardName) + ", busCardNumber=" + ((Object) this.busCardNumber) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.busCardId);
        parcel.writeString(this.busCardName);
        parcel.writeString(this.xMiCardName);
        parcel.writeString(this.busCardNumber);
    }
}
