package w20;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.t;
import k30.x;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lw20/a;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "Lfn0/a;", "hazards", "Lk30/x;", "unpavedSections", "Lk30/t;", "highTrafficSections", "", "areOnRouteFeaturesLoaded", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;Ljava/util/List;Ljava/util/List;Lk30/x;Lk30/t;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3383a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.e f181476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ClimbDTO> f181477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<fn0.a> f181478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f181479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f181480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f181481f;

    /* JADX INFO: renamed from: w20.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3383a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) parcel.readParcelable(a.class.getClassLoader());
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(a.class, parcel, arrayList, iD, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iD2 = 0;
                while (iD2 != i15) {
                    iD2 = u0.d(a.class, parcel, arrayList2, iD2, 1);
                }
            }
            return new a(eVar, arrayList, arrayList2, (x) parcel.readParcelable(a.class.getClassLoader()), (t) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, List list2, x xVar, t tVar, boolean z14, int i14, j jVar) {
        this(eVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : list2, (i14 & 8) != 0 ? null : xVar, (i14 & 16) != 0 ? null : tVar, (i14 & 32) != 0 ? false : z14);
    }

    public static a b(a aVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, ArrayList arrayList, x xVar, t tVar, int i14) {
        if ((i14 & 1) != 0) {
            eVar = aVar.f181476a;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = eVar;
        if ((i14 & 2) != 0) {
            list = aVar.f181477b;
        }
        List list2 = list;
        List<fn0.a> list3 = arrayList;
        if ((i14 & 4) != 0) {
            list3 = aVar.f181478c;
        }
        List<fn0.a> list4 = list3;
        if ((i14 & 8) != 0) {
            xVar = aVar.f181479d;
        }
        x xVar2 = xVar;
        if ((i14 & 16) != 0) {
            tVar = aVar.f181480e;
        }
        t tVar2 = tVar;
        boolean z14 = (i14 & 32) != 0 ? aVar.f181481f : true;
        aVar.getClass();
        eVar2.getClass();
        return new a(eVar2, list2, list4, xVar2, tVar2, z14);
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
        return s.g(this.f181476a, aVar.f181476a) && s.g(this.f181477b, aVar.f181477b) && s.g(this.f181478c, aVar.f181478c) && s.g(this.f181479d, aVar.f181479d) && s.g(this.f181480e, aVar.f181480e) && this.f181481f == aVar.f181481f;
    }

    public final int hashCode() {
        int iHashCode = this.f181476a.hashCode() * 31;
        List<ClimbDTO> list = this.f181477b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<fn0.a> list2 = this.f181478c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        x xVar = this.f181479d;
        int iHashCode4 = (iHashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        t tVar = this.f181480e;
        return Boolean.hashCode(this.f181481f) + ((iHashCode4 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CourseData(courseDetails=" + this.f181476a + ", climbs=" + this.f181477b + ", hazards=" + this.f181478c + ", unpavedSections=" + this.f181479d + ", highTrafficSections=" + this.f181480e + ", areOnRouteFeaturesLoaded=" + this.f181481f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f181476a, i14);
        List<ClimbDTO> list = this.f181477b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        List<fn0.a> list2 = this.f181478c;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeParcelable((Parcelable) itO2.next(), i14);
            }
        }
        parcel.writeParcelable(this.f181479d, i14);
        parcel.writeParcelable(this.f181480e, i14);
        parcel.writeInt(this.f181481f ? 1 : 0);
    }

    public a(com.garmin.android.apps.connectmobile.courses.model.e eVar, List<ClimbDTO> list, List<fn0.a> list2, x xVar, t tVar, boolean z14) {
        eVar.getClass();
        this.f181476a = eVar;
        this.f181477b = list;
        this.f181478c = list2;
        this.f181479d = xVar;
        this.f181480e = tVar;
        this.f181481f = z14;
    }
}
