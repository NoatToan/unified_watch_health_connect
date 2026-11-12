package sw1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import fg0.k;
import fg0.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import tw1.c;
import tw1.j;
import tw1.m;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsw1/a;", "Landroid/os/Parcelable;", "Ltw1/m;", "activePlan", "Ltw1/j;", "nextWorkoutTask", "", "currentWeekRemainingTaskWorkouts", "Ltw1/c;", "planSubType", "Lfg0/k;", "eventDTO", "Lfg0/t;", "weatherData", "", "activityDistanceMeters", "activityDurationSec", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "completedPlanActivities", "<init>", "(Ltw1/m;Ltw1/j;Ljava/util/List;Ltw1/c;Lfg0/k;Lfg0/t;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3041a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f161085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f161086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f161087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f161088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f161089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f161090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f161091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f161092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<ActivityListItemDTO> f161093i;

    /* JADX INFO: renamed from: sw1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3041a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            m mVarCreateFromParcel = m.CREATOR.createFromParcel(parcel);
            j jVarCreateFromParcel = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            int iD = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = f.a(j.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            c cVarCreateFromParcel = c.CREATOR.createFromParcel(parcel);
            k kVar = (k) parcel.readParcelable(a.class.getClassLoader());
            t tVar = (t) parcel.readParcelable(a.class.getClassLoader());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            int i15 = parcel.readInt();
            ArrayList arrayList2 = arrayList;
            Double d14 = dValueOf;
            ArrayList arrayList3 = new ArrayList(i15);
            while (iD != i15) {
                iD = u0.d(a.class, parcel, arrayList3, iD, 1);
            }
            return new a(mVarCreateFromParcel, jVarCreateFromParcel, arrayList2, cVarCreateFromParcel, kVar, tVar, d14, dValueOf2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(m mVar, j jVar, List list, c cVar, k kVar, t tVar, Double d14, Double d15, List list2, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(mVar, jVar, list, cVar, (i14 & 16) != 0 ? null : kVar, (i14 & 32) != 0 ? null : tVar, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? j0.f134944a : list2);
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
        return s.g(this.f161085a, aVar.f161085a) && s.g(this.f161086b, aVar.f161086b) && s.g(this.f161087c, aVar.f161087c) && s.g(this.f161088d, aVar.f161088d) && s.g(this.f161089e, aVar.f161089e) && s.g(this.f161090f, aVar.f161090f) && s.g(this.f161091g, aVar.f161091g) && s.g(this.f161092h, aVar.f161092h) && s.g(this.f161093i, aVar.f161093i);
    }

    public final int hashCode() {
        int iHashCode = this.f161085a.hashCode() * 31;
        j jVar = this.f161086b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List<j> list = this.f161087c;
        int iHashCode3 = (this.f161088d.hashCode() + ((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        k kVar = this.f161089e;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        t tVar = this.f161090f;
        int iHashCode5 = (iHashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Double d14 = this.f161091g;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f161092h;
        return this.f161093i.hashCode() + ((iHashCode6 + (d15 != null ? d15.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ITPDashboard(activePlan=");
        sb3.append(this.f161085a);
        sb3.append(", nextWorkoutTask=");
        sb3.append(this.f161086b);
        sb3.append(", currentWeekRemainingTaskWorkouts=");
        sb3.append(this.f161087c);
        sb3.append(", planSubType=");
        sb3.append(this.f161088d);
        sb3.append(", eventDTO=");
        sb3.append(this.f161089e);
        sb3.append(", weatherData=");
        sb3.append(this.f161090f);
        sb3.append(", activityDistanceMeters=");
        i.p(this.f161091g, this.f161092h, ", activityDurationSec=", ", completedPlanActivities=", sb3);
        return z.c(sb3, this.f161093i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f161085a.writeToParcel(parcel, i14);
        j jVar = this.f161086b;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        List<j> list = this.f161087c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((j) itO.next()).writeToParcel(parcel, i14);
            }
        }
        this.f161088d.writeToParcel(parcel, i14);
        parcel.writeParcelable(this.f161089e, i14);
        parcel.writeParcelable(this.f161090f, i14);
        Double d14 = this.f161091g;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f161092h;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Iterator itE = f.e(this.f161093i, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(m mVar, j jVar, List<j> list, c cVar, k kVar, t tVar, Double d14, Double d15, List<? extends ActivityListItemDTO> list2) {
        mVar.getClass();
        cVar.getClass();
        list2.getClass();
        this.f161085a = mVar;
        this.f161086b = jVar;
        this.f161087c = list;
        this.f161088d = cVar;
        this.f161089e = kVar;
        this.f161090f = tVar;
        this.f161091g = d14;
        this.f161092h = d15;
        this.f161093i = list2;
    }
}
