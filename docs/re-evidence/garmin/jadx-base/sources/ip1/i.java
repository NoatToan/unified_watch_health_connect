package ip1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lip1/i;", "Landroid/os/Parcelable;", "Lip1/h;", "currentSolarGainDataDTO", "previousSolarGainDataDTO", "<init>", "(Lip1/h;Lip1/h;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f94690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f94691b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? h.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(h hVar, h hVar2) {
        this.f94690a = hVar;
        this.f94691b = hVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f94690a, iVar.f94690a) && s.g(this.f94691b, iVar.f94691b);
    }

    public final int hashCode() {
        h hVar = this.f94690a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        h hVar2 = this.f94691b;
        return iHashCode + (hVar2 != null ? hVar2.hashCode() : 0);
    }

    public final String toString() {
        return "SolarGainSummaryDataDTO(currentSolarGainDataDTO=" + this.f94690a + ", previousSolarGainDataDTO=" + this.f94691b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        h hVar = this.f94690a;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i14);
        }
        h hVar2 = this.f94691b;
        if (hVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar2.writeToParcel(parcel, i14);
        }
    }
}
