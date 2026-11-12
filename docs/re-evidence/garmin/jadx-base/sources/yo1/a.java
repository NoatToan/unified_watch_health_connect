package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lyo1/a;", "Landroid/os/Parcelable;", "", "", "deviceCategories", "", "groupTrack2Capable", "", "registeredDate", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "c", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3716a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceCategories")
    private final List<String> deviceCategories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupTrack2Capable")
    private final Boolean groupTrack2Capable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("registeredDate")
    private final Long registeredDate;

    /* JADX INFO: renamed from: yo1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3716a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(arrayListCreateStringArrayList, boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(List<String> list, Boolean bool, Long l14) {
        this.deviceCategories = list;
        this.groupTrack2Capable = bool;
        this.registeredDate = l14;
    }

    public final List<String> b() {
        return this.deviceCategories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getGroupTrack2Capable() {
        return this.groupTrack2Capable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.deviceCategories, aVar.deviceCategories) && s.g(this.groupTrack2Capable, aVar.groupTrack2Capable) && s.g(this.registeredDate, aVar.registeredDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getRegisteredDate() {
        return this.registeredDate;
    }

    public final int hashCode() {
        List<String> list = this.deviceCategories;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.groupTrack2Capable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l14 = this.registeredDate;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        List<String> list = this.deviceCategories;
        Boolean bool = this.groupTrack2Capable;
        Long l14 = this.registeredDate;
        StringBuilder sb3 = new StringBuilder("DeviceDTO(deviceCategories=");
        sb3.append(list);
        sb3.append(", groupTrack2Capable=");
        sb3.append(bool);
        sb3.append(", registeredDate=");
        return p6.b.g(sb3, l14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeStringList(this.deviceCategories);
        Boolean bool = this.groupTrack2Capable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Long l14 = this.registeredDate;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }
}
