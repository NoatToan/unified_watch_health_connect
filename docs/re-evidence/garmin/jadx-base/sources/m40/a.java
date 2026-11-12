package m40;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm40/a;", "Landroid/os/Parcelable;", "", "isDistanceMarkersEnabled", "isDistanceMarkersChecked", "showPointsOfInterestSetting", "isPointsOfInterestChecked", "", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "selectedPointsOfInterestTypes", "showHazardsSettings", "isHazardsChecked", "Lfn0/c;", "selectedHazardTypes", "showHazardsOnCourseSettings", "isHazardsOnCourseChecked", "showClimbsSettings", "isClimbsChecked", "Lcom/garmin/android/apps/connectmobile/courses/model/c;", "climbSurfaceType", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "minClimbDifficulty", "maxClimbDifficulty", "<init>", "(ZZZZLjava/util/List;ZZLjava/util/List;ZZZZLcom/garmin/android/apps/connectmobile/courses/model/c;Lcom/garmin/android/apps/connectmobile/courses/model/b;Lcom/garmin/android/apps/connectmobile/courses/model/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2216a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f116563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.h> f116564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f116565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f116566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<fn0.c> f116567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f116568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f116569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f116570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f116571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.c f116572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.b f116573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.b f116574o;

    /* JADX INFO: renamed from: m40.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2216a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(com.garmin.android.apps.connectmobile.courses.model.h.valueOf(parcel.readString()));
            }
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(fn0.c.valueOf(parcel.readString()));
            }
            return new a(z14, z15, z16, z17, arrayList, z18, z19, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, com.garmin.android.apps.connectmobile.courses.model.c.valueOf(parcel.readString()), com.garmin.android.apps.connectmobile.courses.model.b.valueOf(parcel.readString()), com.garmin.android.apps.connectmobile.courses.model.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z14, boolean z15, boolean z16, boolean z17, List<? extends com.garmin.android.apps.connectmobile.courses.model.h> list, boolean z18, boolean z19, List<? extends fn0.c> list2, boolean z24, boolean z25, boolean z26, boolean z27, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        list.getClass();
        list2.getClass();
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f116560a = z14;
        this.f116561b = z15;
        this.f116562c = z16;
        this.f116563d = z17;
        this.f116564e = list;
        this.f116565f = z18;
        this.f116566g = z19;
        this.f116567h = list2;
        this.f116568i = z24;
        this.f116569j = z25;
        this.f116570k = z26;
        this.f116571l = z27;
        this.f116572m = cVar;
        this.f116573n = bVar;
        this.f116574o = bVar2;
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
        return this.f116560a == aVar.f116560a && this.f116561b == aVar.f116561b && this.f116562c == aVar.f116562c && this.f116563d == aVar.f116563d && this.f116564e.equals(aVar.f116564e) && this.f116565f == aVar.f116565f && this.f116566g == aVar.f116566g && this.f116567h.equals(aVar.f116567h) && this.f116568i == aVar.f116568i && this.f116569j == aVar.f116569j && this.f116570k == aVar.f116570k && this.f116571l == aVar.f116571l && this.f116572m == aVar.f116572m && this.f116573n == aVar.f116573n && this.f116574o == aVar.f116574o;
    }

    public final int hashCode() {
        return this.f116574o.hashCode() + ((this.f116573n.hashCode() + ((this.f116572m.hashCode() + q6.f.g(q6.f.g(q6.f.g(q6.f.g(u0.b(q6.f.g(q6.f.g(u0.b(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f116560a) * 31, 31, this.f116561b), 31, this.f116562c), 31, this.f116563d), 31, this.f116564e), 31, this.f116565f), 31, this.f116566g), 31, this.f116567h), 31, this.f116568i), 31, this.f116569j), 31, this.f116570k), 31, this.f116571l)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("CourseElementsSettings(isDistanceMarkersEnabled=", ", isDistanceMarkersChecked=", ", showPointsOfInterestSetting=", this.f116560a, this.f116561b);
        kg.f.q(", isPointsOfInterestChecked=", ", selectedPointsOfInterestTypes=", sbM, this.f116562c, this.f116563d);
        sbM.append(this.f116564e);
        sbM.append(", showHazardsSettings=");
        sbM.append(this.f116565f);
        sbM.append(", isHazardsChecked=");
        sbM.append(this.f116566g);
        sbM.append(", selectedHazardTypes=");
        sbM.append(this.f116567h);
        sbM.append(", showHazardsOnCourseSettings=");
        kg.f.q(", isHazardsOnCourseChecked=", ", showClimbsSettings=", sbM, this.f116568i, this.f116569j);
        kg.f.q(", isClimbsChecked=", ", climbSurfaceType=", sbM, this.f116570k, this.f116571l);
        sbM.append(this.f116572m);
        sbM.append(", minClimbDifficulty=");
        sbM.append(this.f116573n);
        sbM.append(", maxClimbDifficulty=");
        sbM.append(this.f116574o);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f116560a ? 1 : 0);
        parcel.writeInt(this.f116561b ? 1 : 0);
        parcel.writeInt(this.f116562c ? 1 : 0);
        parcel.writeInt(this.f116563d ? 1 : 0);
        Iterator itE = kg.f.e(this.f116564e, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((com.garmin.android.apps.connectmobile.courses.model.h) itE.next()).name());
        }
        parcel.writeInt(this.f116565f ? 1 : 0);
        parcel.writeInt(this.f116566g ? 1 : 0);
        Iterator itE2 = kg.f.e(this.f116567h, parcel);
        while (itE2.hasNext()) {
            parcel.writeString(((fn0.c) itE2.next()).name());
        }
        parcel.writeInt(this.f116568i ? 1 : 0);
        parcel.writeInt(this.f116569j ? 1 : 0);
        parcel.writeInt(this.f116570k ? 1 : 0);
        parcel.writeInt(this.f116571l ? 1 : 0);
        parcel.writeString(this.f116572m.name());
        parcel.writeString(this.f116573n.name());
        parcel.writeString(this.f116574o.name());
    }
}
