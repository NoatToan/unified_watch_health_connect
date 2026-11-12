package k30;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk30/q;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoints", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "Lk30/w;", "unpavedCourseSections", "", "courseDistance", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoints", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<GeoPointDTO> f102582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ClimbDTO> f102583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<w> f102584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f102585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.g> f102586e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            parcel.getClass();
            int iA = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(GeoPointDTO.CREATOR, parcel, arrayList5, iA2, 1);
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i15);
                int iA3 = 0;
                while (iA3 != i15) {
                    iA3 = kg.f.a(ClimbDTO.CREATOR, parcel, arrayList6, iA3, 1);
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i16);
                int iA4 = 0;
                while (iA4 != i16) {
                    iA4 = kg.f.a(w.CREATOR, parcel, arrayList7, iA4, 1);
                }
                arrayList3 = arrayList7;
            }
            double d14 = parcel.readDouble();
            if (parcel.readInt() != 0) {
                int i17 = parcel.readInt();
                arrayList4 = new ArrayList(i17);
                while (iA != i17) {
                    iA = kg.f.a(com.garmin.android.apps.connectmobile.courses.model.g.CREATOR, parcel, arrayList4, iA, 1);
                }
            }
            return new q(arrayList, arrayList2, arrayList3, d14, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(List list, List list2, List list3, double d14, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, list3, d14, (i14 & 16) != 0 ? null : list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f102582a, qVar.f102582a) && p005kotlin.jvm.internal.s.g(this.f102583b, qVar.f102583b) && p005kotlin.jvm.internal.s.g(this.f102584c, qVar.f102584c) && Double.compare(this.f102585d, qVar.f102585d) == 0 && p005kotlin.jvm.internal.s.g(this.f102586e, qVar.f102586e);
    }

    public final int hashCode() {
        List<GeoPointDTO> list = this.f102582a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ClimbDTO> list2 = this.f102583b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<w> list3 = this.f102584c;
        int iB = org.apache.commons.lang3.e.b((iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.f102585d);
        List<com.garmin.android.apps.connectmobile.courses.model.g> list4 = this.f102586e;
        return iB + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("ElevationChartData(geoPoints=", ", climbs=", ", unpavedCourseSections=", this.f102582a, this.f102583b);
        sbK.append(this.f102584c);
        sbK.append(", courseDistance=");
        sbK.append(this.f102585d);
        sbK.append(", coursePoints=");
        sbK.append(this.f102586e);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<GeoPointDTO> list = this.f102582a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((GeoPointDTO) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<ClimbDTO> list2 = this.f102583b;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((ClimbDTO) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<w> list3 = this.f102584c;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((w) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeDouble(this.f102585d);
        List<com.garmin.android.apps.connectmobile.courses.model.g> list4 = this.f102586e;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO4 = u0.o(parcel, list4, 1);
        while (itO4.hasNext()) {
            ((com.garmin.android.apps.connectmobile.courses.model.g) itO4.next()).writeToParcel(parcel, i14);
        }
    }

    public q(List<GeoPointDTO> list, List<ClimbDTO> list2, List<w> list3, double d14, List<com.garmin.android.apps.connectmobile.courses.model.g> list4) {
        this.f102582a = list;
        this.f102583b = list2;
        this.f102584c = list3;
        this.f102585d = d14;
        this.f102586e = list4;
    }
}
