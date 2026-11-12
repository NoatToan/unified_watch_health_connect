package yj1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyj1/m;", "Landroid/os/Parcelable;", "", "isSetupWizard", "", "setupDeviceUnitId", "Lyj1/n;", "setupWizardType", "<init>", "(ZLjava/lang/Long;Lyj1/n;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f197568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f197569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f197570c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? n.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(boolean z14, Long l14, n nVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : nVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f197568a == mVar.f197568a && s.g(this.f197569b, mVar.f197569b) && this.f197570c == mVar.f197570c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f197568a) * 31;
        Long l14 = this.f197569b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        n nVar = this.f197570c;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "SafetyFeaturesSetupWizardConfiguration(isSetupWizard=" + this.f197568a + ", setupDeviceUnitId=" + this.f197569b + ", setupWizardType=" + this.f197570c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f197568a ? 1 : 0);
        Long l14 = this.f197569b;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        n nVar = this.f197570c;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(nVar.name());
        }
    }

    public m(boolean z14, Long l14, n nVar) {
        this.f197568a = z14;
        this.f197569b = l14;
        this.f197570c = nVar;
    }

    public m() {
        this(false, null, null, 7, null);
    }
}
