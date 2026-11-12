package nj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnj1/d;", "Landroid/os/Parcelable;", "", "", "associatedParentActivityTypeIds", "", "privacySubcategoryType", "Lnj1/c;", "subcategoryDetails", "<init>", "(Ljava/util/List;Ljava/lang/String;Lnj1/c;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Lnj1/c;", "f", "()Lnj1/c;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedParentActivityTypeIds")
    private final List<Integer> associatedParentActivityTypeIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacySubcategoryType")
    private final String privacySubcategoryType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subcategoryDetails")
    private final c subcategoryDetails;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new d(arrayList, parcel.readString(), c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(List<Integer> list, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        this.associatedParentActivityTypeIds = list;
        this.privacySubcategoryType = str;
        this.subcategoryDetails = cVar;
    }

    public final List<Integer> b() {
        return this.associatedParentActivityTypeIds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrivacySubcategoryType() {
        return this.privacySubcategoryType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.associatedParentActivityTypeIds, dVar.associatedParentActivityTypeIds) && s.g(this.privacySubcategoryType, dVar.privacySubcategoryType) && s.g(this.subcategoryDetails, dVar.subcategoryDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getSubcategoryDetails() {
        return this.subcategoryDetails;
    }

    public final int hashCode() {
        List<Integer> list = this.associatedParentActivityTypeIds;
        return this.subcategoryDetails.hashCode() + g.j((list == null ? 0 : list.hashCode()) * 31, 31, this.privacySubcategoryType);
    }

    public final String toString() {
        return "SubcategoryPrivacySettingsDto(associatedParentActivityTypeIds=" + this.associatedParentActivityTypeIds + ", privacySubcategoryType=" + this.privacySubcategoryType + ", subcategoryDetails=" + this.subcategoryDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<Integer> list = this.associatedParentActivityTypeIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        parcel.writeString(this.privacySubcategoryType);
        this.subcategoryDetails.writeToParcel(parcel, i14);
    }
}
