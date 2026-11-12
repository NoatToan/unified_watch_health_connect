package j12;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lj12/k;", "Landroid/os/Parcelable;", "Lj12/a;", "sectionPublicity", "Lj12/i;", "biometricProfile", "Lj12/c;", "lastUsedDevice", "", "", "favoriteActivityTypes", "<init>", "(Lj12/a;Lj12/i;Lj12/c;Ljava/util/List;)V", "a", "Lj12/a;", "g", "()Lj12/a;", "setSectionPublicity", "(Lj12/a;)V", "b", "Lj12/i;", "()Lj12/i;", "setBiometricProfile", "(Lj12/i;)V", "c", "Lj12/c;", "f", "()Lj12/c;", "setLastUsedDevice", "(Lj12/c;)V", "d", "Ljava/util/List;", "()Ljava/util/List;", "setFavoriteActivityTypes", "(Ljava/util/List;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sectionPublicity")
    private j12.a sectionPublicity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("biometricProfile")
    private i biometricProfile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUsedDevice")
    private c lastUsedDevice;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favoriteActivityTypes")
    private List<String> favoriteActivityTypes;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readInt() == 0 ? null : j12.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(j12.a aVar, i iVar, c cVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getBiometricProfile() {
        return this.biometricProfile;
    }

    public final List<String> d() {
        return this.favoriteActivityTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.sectionPublicity, kVar.sectionPublicity) && s.g(this.biometricProfile, kVar.biometricProfile) && s.g(this.lastUsedDevice, kVar.lastUsedDevice) && s.g(this.favoriteActivityTypes, kVar.favoriteActivityTypes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getLastUsedDevice() {
        return this.lastUsedDevice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j12.a getSectionPublicity() {
        return this.sectionPublicity;
    }

    public final int hashCode() {
        j12.a aVar = this.sectionPublicity;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        i iVar = this.biometricProfile;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        c cVar = this.lastUsedDevice;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<String> list = this.favoriteActivityTypes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UserProfileAboutDTO(sectionPublicity=" + this.sectionPublicity + ", biometricProfile=" + this.biometricProfile + ", lastUsedDevice=" + this.lastUsedDevice + ", favoriteActivityTypes=" + this.favoriteActivityTypes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        j12.a aVar = this.sectionPublicity;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        i iVar = this.biometricProfile;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        c cVar = this.lastUsedDevice;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        parcel.writeStringList(this.favoriteActivityTypes);
    }

    public k(j12.a aVar, i iVar, c cVar, List<String> list) {
        this.sectionPublicity = aVar;
        this.biometricProfile = iVar;
        this.lastUsedDevice = cVar;
        this.favoriteActivityTypes = list;
    }

    public k() {
        this(null, null, null, null, 15, null);
    }
}
