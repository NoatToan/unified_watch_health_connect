package j12;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lj12/j;", "Landroid/os/Parcelable;", "", "isShowLast12Months", "isShowLifetimeTotals", "isShowPersonalRecords", "<init>", "(ZZZ)V", "a", "Z", "b", "()Z", "setShowLast12Months", "(Z)V", "d", "setShowLifetimeTotals", "c", "f", "setShowPersonalRecords", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showLast12Months")
    private boolean isShowLast12Months;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showLifetimeTotals")
    private boolean isShowLifetimeTotals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showPersonalRecords")
    private boolean isShowPersonalRecords;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsShowLast12Months() {
        return this.isShowLast12Months;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsShowLifetimeTotals() {
        return this.isShowLifetimeTotals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.isShowLast12Months == jVar.isShowLast12Months && this.isShowLifetimeTotals == jVar.isShowLifetimeTotals && this.isShowPersonalRecords == jVar.isShowPersonalRecords;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsShowPersonalRecords() {
        return this.isShowPersonalRecords;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isShowPersonalRecords) + q6.f.g(Boolean.hashCode(this.isShowLast12Months) * 31, 31, this.isShowLifetimeTotals);
    }

    public final String toString() {
        boolean z14 = this.isShowLast12Months;
        boolean z15 = this.isShowLifetimeTotals;
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("StatsSectionPublicityDTO(isShowLast12Months=", ", isShowLifetimeTotals=", ", isShowPersonalRecords=", z14, z15), this.isShowPersonalRecords, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.isShowLast12Months ? 1 : 0);
        parcel.writeInt(this.isShowLifetimeTotals ? 1 : 0);
        parcel.writeInt(this.isShowPersonalRecords ? 1 : 0);
    }

    public j(boolean z14, boolean z15, boolean z16) {
        this.isShowLast12Months = z14;
        this.isShowLifetimeTotals = z15;
        this.isShowPersonalRecords = z16;
    }

    public j() {
        this(false, false, false, 7, null);
    }
}
