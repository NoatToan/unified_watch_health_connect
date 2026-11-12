package wg0;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.newmodel.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.b2;
import ps.c1;
import ps.d1;
import ps.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u00ad\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwg0/d;", "Lwg0/f;", "Landroid/os/Parcelable;", "Lam/x0;", "activityType", "Lps/c1;", "activityPolyline", "Lcom/garmin/android/library/mapsdkadapter/f;", "startPoint", "endPoint", "Lps/b2;", "weather", "", "Lls/c;", "mapMarkers", "Lps/x1;", "typedSplitDTOs", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/a0;", "polylineDTOs", "Lps/i;", "heatmapPoints", "Lps/d1;", "legs", "Los/a;", "mapCustomization", "", "isActivityProcessing", "<init>", "(Lam/x0;Lps/c1;Lcom/garmin/android/library/mapsdkadapter/f;Lcom/garmin/android/library/mapsdkadapter/f;Lps/b2;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Los/a;Z)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d extends f implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f185078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f185079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f185080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f185081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f185082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<ls.c> f185083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<x1> f185084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a0> f185085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<ps.i> f185086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<d1> f185087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final os.a f185088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f185089l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            parcel.getClass();
            x0 x0Var = (x0) parcel.readParcelable(d.class.getClassLoader());
            c1 c1Var = (c1) parcel.readParcelable(d.class.getClassLoader());
            com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) parcel.readParcelable(d.class.getClassLoader());
            com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) parcel.readParcelable(d.class.getClassLoader());
            b2 b2Var = (b2) parcel.readParcelable(d.class.getClassLoader());
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(d.class, parcel, arrayList, iD, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iD2 = 0;
                while (iD2 != i15) {
                    iD2 = u0.d(d.class, parcel, arrayList2, iD2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iD3 = 0;
                while (iD3 != i16) {
                    iD3 = u0.d(d.class, parcel, arrayList3, iD3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList4 = new ArrayList(i17);
                int iD4 = 0;
                while (iD4 != i17) {
                    iD4 = u0.d(d.class, parcel, arrayList4, iD4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i18 = parcel.readInt();
                arrayList5 = new ArrayList(i18);
                int iD5 = 0;
                while (iD5 != i18) {
                    iD5 = u0.d(d.class, parcel, arrayList5, iD5, 1);
                }
            }
            return new d(x0Var, c1Var, fVar, fVar2, b2Var, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, (os.a) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(x0 x0Var, c1 c1Var, com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, b2 b2Var, List list, List list2, List list3, List list4, List list5, os.a aVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, (i14 & 2) != 0 ? null : c1Var, (i14 & 4) != 0 ? null : fVar, (i14 & 8) != 0 ? null : fVar2, (i14 & 16) != 0 ? null : b2Var, (i14 & 32) != 0 ? null : list, (i14 & 64) != 0 ? null : list2, (i14 & 128) != 0 ? null : list3, (i14 & 256) != 0 ? null : list4, (i14 & 512) != 0 ? null : list5, (i14 & 1024) != 0 ? new os.e() : aVar, (i14 & 2048) != 0 ? false : z14);
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
        return this.f185078a == dVar.f185078a && s.g(this.f185079b, dVar.f185079b) && s.g(this.f185080c, dVar.f185080c) && s.g(this.f185081d, dVar.f185081d) && s.g(this.f185082e, dVar.f185082e) && s.g(this.f185083f, dVar.f185083f) && s.g(this.f185084g, dVar.f185084g) && s.g(this.f185085h, dVar.f185085h) && s.g(this.f185086i, dVar.f185086i) && s.g(this.f185087j, dVar.f185087j) && this.f185088k.getClass().equals(dVar.f185088k.getClass()) && this.f185089l == dVar.f185089l;
    }

    public final int hashCode() {
        int iHashCode = this.f185078a.hashCode() * 31;
        c1 c1Var = this.f185079b;
        int iHashCode2 = (iHashCode + (c1Var != null ? c1Var.hashCode() : 0)) * 31;
        com.garmin.android.library.mapsdkadapter.f fVar = this.f185080c;
        int iHashCode3 = (iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        com.garmin.android.library.mapsdkadapter.f fVar2 = this.f185081d;
        int iHashCode4 = (iHashCode3 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        b2 b2Var = this.f185082e;
        int iHashCode5 = (iHashCode4 + (b2Var != null ? b2Var.hashCode() : 0)) * 31;
        List<ls.c> list = this.f185083f;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<x1> list2 = this.f185084g;
        int iHashCode7 = (iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<a0> list3 = this.f185085h;
        int iHashCode8 = (iHashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<ps.i> list4 = this.f185086i;
        int iHashCode9 = (iHashCode8 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<d1> list5 = this.f185087j;
        return Boolean.hashCode(this.f185089l) + ((this.f185088k.hashCode() + ((iHashCode9 + (list5 != null ? list5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityFeedMapOverlay(activityType=");
        sb3.append(this.f185078a);
        sb3.append(", activityPolyline=");
        sb3.append(this.f185079b);
        sb3.append(", startPoint=");
        sb3.append(this.f185080c);
        sb3.append(", endPoint=");
        sb3.append(this.f185081d);
        sb3.append(", weather=");
        sb3.append(this.f185082e);
        sb3.append(", mapMarkers=");
        sb3.append(this.f185083f);
        sb3.append(", typedSplitDTOs=");
        n23.j.z(sb3, this.f185084g, ", polylineDTOs=", this.f185085h, ", heatmapPoints=");
        n23.j.z(sb3, this.f185086i, ", legs=", this.f185087j, ", mapCustomization=");
        sb3.append(this.f185088k);
        sb3.append(", isActivityProcessing=");
        sb3.append(this.f185089l);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f185078a, i14);
        parcel.writeParcelable(this.f185079b, i14);
        parcel.writeParcelable(this.f185080c, i14);
        parcel.writeParcelable(this.f185081d, i14);
        parcel.writeParcelable(this.f185082e, i14);
        List<ls.c> list = this.f185083f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        List<x1> list2 = this.f185084g;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeParcelable((Parcelable) itO2.next(), i14);
            }
        }
        List<a0> list3 = this.f185085h;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                parcel.writeParcelable((Parcelable) itO3.next(), i14);
            }
        }
        List<ps.i> list4 = this.f185086i;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                parcel.writeParcelable((Parcelable) itO4.next(), i14);
            }
        }
        List<d1> list5 = this.f185087j;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO5 = u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                parcel.writeParcelable((Parcelable) itO5.next(), i14);
            }
        }
        parcel.writeParcelable(this.f185088k, i14);
        parcel.writeInt(this.f185089l ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(x0 x0Var, c1 c1Var, com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, b2 b2Var, List<ls.c> list, List<x1> list2, List<? extends a0> list3, List<ps.i> list4, List<d1> list5, os.a aVar, boolean z14) {
        super(null);
        x0Var.getClass();
        aVar.getClass();
        this.f185078a = x0Var;
        this.f185079b = c1Var;
        this.f185080c = fVar;
        this.f185081d = fVar2;
        this.f185082e = b2Var;
        this.f185083f = list;
        this.f185084g = list2;
        this.f185085h = list3;
        this.f185086i = list4;
        this.f185087j = list5;
        this.f185088k = aVar;
        this.f185089l = z14;
    }
}
