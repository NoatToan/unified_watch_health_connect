package k30;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk30/u;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "Lfn0/b;", "hazards", "Lk30/x;", "unpavedSections", "Lk30/t;", "highTrafficSections", "<init>", "(Ljava/util/List;Ljava/util/List;Lk30/x;Lk30/t;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "c", "Lk30/x;", "g", "()Lk30/x;", "Lk30/t;", "f", "()Lk30/t;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("climbs")
    private final List<ClimbDTO> climbs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hazards")
    private final List<fn0.b> hazards;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unpavedSections")
    private final x unpavedSections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highTrafficSections")
    private final t highTrafficSections;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(ClimbDTO.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iA != i15) {
                    iA = kg.f.a(fn0.b.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new u(arrayList, arrayList2, parcel.readInt() == 0 ? null : x.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? t.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public u(List<ClimbDTO> list, List<fn0.b> list2, x xVar, t tVar) {
        this.climbs = list;
        this.hazards = list2;
        this.unpavedSections = xVar;
        this.highTrafficSections = tVar;
    }

    public final List<ClimbDTO> b() {
        return this.climbs;
    }

    public final List<fn0.b> d() {
        return this.hazards;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.climbs, uVar.climbs) && p005kotlin.jvm.internal.s.g(this.hazards, uVar.hazards) && p005kotlin.jvm.internal.s.g(this.unpavedSections, uVar.unpavedSections) && p005kotlin.jvm.internal.s.g(this.highTrafficSections, uVar.highTrafficSections);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t getHighTrafficSections() {
        return this.highTrafficSections;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final x getUnpavedSections() {
        return this.unpavedSections;
    }

    public final int hashCode() {
        List<ClimbDTO> list = this.climbs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<fn0.b> list2 = this.hazards;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        x xVar = this.unpavedSections;
        int iHashCode3 = (iHashCode2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        t tVar = this.highTrafficSections;
        return iHashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        List<ClimbDTO> list = this.climbs;
        List<fn0.b> list2 = this.hazards;
        x xVar = this.unpavedSections;
        t tVar = this.highTrafficSections;
        StringBuilder sbK = f3.k("OnCourseRouteFeaturesDTO(climbs=", ", hazards=", ", unpavedSections=", list, list2);
        sbK.append(xVar);
        sbK.append(", highTrafficSections=");
        sbK.append(tVar);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<ClimbDTO> list = this.climbs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((ClimbDTO) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<fn0.b> list2 = this.hazards;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((fn0.b) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        x xVar = this.unpavedSections;
        if (xVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xVar.writeToParcel(parcel, i14);
        }
        t tVar = this.highTrafficSections;
        if (tVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tVar.writeToParcel(parcel, i14);
        }
    }
}
