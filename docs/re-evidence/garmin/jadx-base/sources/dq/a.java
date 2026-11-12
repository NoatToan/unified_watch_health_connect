package dq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.x1;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldq/a;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/a;", "activityChartDetails", "Lps/x1;", "split", "", "splitSections", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/a;Lps/x1;Ljava/util/List;)V", "a", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/a;", "b", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/a;", "Lps/x1;", "d", "()Lps/x1;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1289a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("chartDetails")
    private final com.garmin.android.apps.connectmobile.activities.newmodel.a activityChartDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("split")
    private final x1 split;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("split_sections")
    private final List<x1> splitSections;

    /* JADX INFO: renamed from: dq.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1289a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            com.garmin.android.apps.connectmobile.activities.newmodel.a aVar = (com.garmin.android.apps.connectmobile.activities.newmodel.a) parcel.readParcelable(a.class.getClassLoader());
            x1 x1Var = (x1) parcel.readParcelable(a.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(a.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new a(aVar, x1Var, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(com.garmin.android.apps.connectmobile.activities.newmodel.a aVar, x1 x1Var, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : x1Var, (i14 & 4) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.a getActivityChartDetails() {
        return this.activityChartDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x1 getSplit() {
        return this.split;
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
        return s.g(this.activityChartDetails, aVar.activityChartDetails) && s.g(this.split, aVar.split) && s.g(this.splitSections, aVar.splitSections);
    }

    public final List<x1> f() {
        return this.splitSections;
    }

    public final int hashCode() {
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar = this.activityChartDetails;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        x1 x1Var = this.split;
        int iHashCode2 = (iHashCode + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        List<x1> list = this.splitSections;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar = this.activityChartDetails;
        x1 x1Var = this.split;
        List<x1> list = this.splitSections;
        StringBuilder sb3 = new StringBuilder("ClimbChartData(activityChartDetails=");
        sb3.append(aVar);
        sb3.append(", split=");
        sb3.append(x1Var);
        sb3.append(", splitSections=");
        return z.c(sb3, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.activityChartDetails, i14);
        parcel.writeParcelable(this.split, i14);
        List<x1> list = this.splitSections;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    public a(com.garmin.android.apps.connectmobile.activities.newmodel.a aVar, x1 x1Var, List<x1> list) {
        this.activityChartDetails = aVar;
        this.split = x1Var;
        this.splitSections = list;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
