package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lix1/l;", "Landroid/os/Parcelable;", "", "", "intensities", "Lix1/b;", "primaries", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "getIntensities", "()Ljava/util/List;", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("intensity")
    private final List<String> intensities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaries")
    private final List<b> primaries;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(b.CREATOR, parcel, arrayList, iA, 1);
            }
            return new l(arrayListCreateStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(List<String> list, List<b> list2) {
        list.getClass();
        list2.getClass();
        this.intensities = list;
        this.primaries = list2;
    }

    public final List<b> b() {
        return this.primaries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.intensities, lVar.intensities) && s.g(this.primaries, lVar.primaries);
    }

    public final int hashCode() {
        return this.primaries.hashCode() + (this.intensities.hashCode() * 31);
    }

    public final String toString() {
        return t.f("StrengthTrainingPlanTypeDTO(intensities=", ", primaries=", ")", this.intensities, this.primaries);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeStringList(this.intensities);
        Iterator itE = kg.f.e(this.primaries, parcel);
        while (itE.hasNext()) {
            ((b) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
