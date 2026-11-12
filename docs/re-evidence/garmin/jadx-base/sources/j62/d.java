package j62;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bõ\u0001\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj62/d;", "Landroid/os/Parcelable;", "Ljava/util/Observable;", "", "Lo13/p;", "", "workoutDifficulties", "workoutMuscleGroups", "workoutGoals", "sportTrainingFocuses", "Lj62/b;", "_selWorkoutActivityType", "_selWorkoutDifficulties", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a;", "_selWorkoutDurationIntervals", "_selWorkoutMuscleGroups", "_selWorkoutGoals", "_selSportTrainingFocus", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lj62/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d extends Observable implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<p<String, String>> f97409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<p<String, String>> f97410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<p<String, String>> f97411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f97412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f97413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<p<String, String>> f97414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> f97415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<p<String, String>> f97416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<p<String, String>> f97417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<String> f97418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f97419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<String> f97420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<p<String, String>> f97421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> f97422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<p<String, String>> f97423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<p<String, String>> f97424p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList5.add(parcel.readSerializable());
            }
            int i16 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList6.add(parcel.readSerializable());
            }
            int i18 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i18);
            for (int i19 = 0; i19 != i18; i19++) {
                arrayList7.add(parcel.readSerializable());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    arrayList8.add(parcel.readSerializable());
                }
                arrayList = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i26 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i26);
                int iD = 0;
                while (iD != i26) {
                    iD = u0.d(d.class, parcel, arrayList9, iD, 1);
                }
                arrayList2 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i27 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i27);
                for (int i28 = 0; i28 != i27; i28++) {
                    arrayList10.add(parcel.readSerializable());
                }
                arrayList3 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i29 = parcel.readInt();
                arrayList4 = new ArrayList(i29);
                for (int i30 = 0; i30 != i29; i30++) {
                    arrayList4.add(parcel.readSerializable());
                }
            }
            return new d(arrayList5, arrayList6, arrayList7, arrayListCreateStringArrayList, bVarValueOf, arrayList, arrayList2, arrayList3, arrayList4, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(List list, List list2, List list3, List list4, b bVar, List list5, List list6, List list7, List list8, List list9, int i14, j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? j0.f134944a : list2, (i14 & 4) != 0 ? j0.f134944a : list3, (i14 & 8) != 0 ? j0.f134944a : list4, (i14 & 16) != 0 ? null : bVar, (i14 & 32) != 0 ? null : list5, (i14 & 64) != 0 ? null : list6, (i14 & 128) != 0 ? null : list7, (i14 & 256) != 0 ? null : list8, (i14 & 512) != 0 ? null : list9);
    }

    public final void b(ArrayList arrayList) {
        this.f97420l = arrayList;
        this.f97418j = arrayList;
        setChanged();
        notifyObservers();
    }

    public final void d(b bVar) {
        this.f97419k = bVar;
        this.f97413e = bVar;
        setChanged();
        notifyObservers();
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
        return s.g(this.f97409a, dVar.f97409a) && s.g(this.f97410b, dVar.f97410b) && s.g(this.f97411c, dVar.f97411c) && s.g(this.f97412d, dVar.f97412d) && this.f97413e == dVar.f97413e && s.g(this.f97414f, dVar.f97414f) && s.g(this.f97415g, dVar.f97415g) && s.g(this.f97416h, dVar.f97416h) && s.g(this.f97417i, dVar.f97417i) && s.g(this.f97418j, dVar.f97418j);
    }

    public final void f(ArrayList arrayList) {
        this.f97421m = arrayList;
        this.f97414f = arrayList;
        setChanged();
        notifyObservers();
    }

    public final void g(ArrayList arrayList) {
        this.f97422n = arrayList;
        this.f97415g = arrayList;
        setChanged();
        notifyObservers();
    }

    public final void h(ArrayList arrayList) {
        this.f97424p = arrayList;
        this.f97417i = arrayList;
        setChanged();
        notifyObservers();
    }

    public final int hashCode() {
        int iB = u0.b(u0.b(u0.b(this.f97409a.hashCode() * 31, 31, this.f97410b), 31, this.f97411c), 31, this.f97412d);
        b bVar = this.f97413e;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<p<String, String>> list = this.f97414f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list2 = this.f97415g;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<p<String, String>> list3 = this.f97416h;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<p<String, String>> list4 = this.f97417i;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.f97418j;
        return iHashCode5 + (list5 != null ? list5.hashCode() : 0);
    }

    public final void i(ArrayList arrayList) {
        this.f97423o = arrayList;
        this.f97416h = arrayList;
        setChanged();
        notifyObservers();
    }

    public final String toString() {
        List<p<String, String>> list = this.f97409a;
        List<p<String, String>> list2 = this.f97410b;
        List<p<String, String>> list3 = this.f97411c;
        List<String> list4 = this.f97412d;
        b bVar = this.f97413e;
        List<p<String, String>> list5 = this.f97414f;
        List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list6 = this.f97415g;
        List<p<String, String>> list7 = this.f97416h;
        List<p<String, String>> list8 = this.f97417i;
        List<String> list9 = this.f97418j;
        StringBuilder sbK = f3.k("MSNWorkoutsFilterData(workoutDifficulties=", ", workoutMuscleGroups=", ", workoutGoals=", list, list2);
        n23.j.z(sbK, list3, ", sportTrainingFocuses=", list4, ", _selWorkoutActivityType=");
        sbK.append(bVar);
        sbK.append(", _selWorkoutDifficulties=");
        sbK.append(list5);
        sbK.append(", _selWorkoutDurationIntervals=");
        n23.j.z(sbK, list6, ", _selWorkoutMuscleGroups=", list7, ", _selWorkoutGoals=");
        return n23.j.j(sbK, list8, ", _selSportTrainingFocus=", list9, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f97409a, parcel);
        while (itE.hasNext()) {
            parcel.writeSerializable((Serializable) itE.next());
        }
        Iterator itE2 = kg.f.e(this.f97410b, parcel);
        while (itE2.hasNext()) {
            parcel.writeSerializable((Serializable) itE2.next());
        }
        Iterator itE3 = kg.f.e(this.f97411c, parcel);
        while (itE3.hasNext()) {
            parcel.writeSerializable((Serializable) itE3.next());
        }
        parcel.writeStringList(this.f97412d);
        b bVar = this.f97413e;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        List<p<String, String>> list = this.f97414f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeSerializable((Serializable) itO.next());
            }
        }
        List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list2 = this.f97415g;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeParcelable((Parcelable) itO2.next(), i14);
            }
        }
        List<p<String, String>> list3 = this.f97416h;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                parcel.writeSerializable((Serializable) itO3.next());
            }
        }
        List<p<String, String>> list4 = this.f97417i;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                parcel.writeSerializable((Serializable) itO4.next());
            }
        }
        parcel.writeStringList(this.f97418j);
    }

    public d(List<p<String, String>> list, List<p<String, String>> list2, List<p<String, String>> list3, List<String> list4, b bVar, List<p<String, String>> list5, List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list6, List<p<String, String>> list7, List<p<String, String>> list8, List<String> list9) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f97409a = list;
        this.f97410b = list2;
        this.f97411c = list3;
        this.f97412d = list4;
        this.f97413e = bVar;
        this.f97414f = list5;
        this.f97415g = list6;
        this.f97416h = list7;
        this.f97417i = list8;
        this.f97418j = list9;
        this.f97419k = bVar;
        this.f97420l = list9;
        this.f97421m = list5;
        this.f97422n = list6;
        this.f97423o = list7;
        this.f97424p = list8;
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
