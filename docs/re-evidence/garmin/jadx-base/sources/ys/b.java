package ys;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import vs.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lys/b;", "Landroid/os/Parcelable;", "", "showConfirmationDialog", "showLoadingDialog", "Lvs/e;", "selectedActivityToRecord", "Lvs/a;", "recordingState", "", "mostRecentActivities", "recordableActivities", "<init>", "(ZZLvs/e;Lvs/a;Ljava/util/List;Ljava/util/List;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f199161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vs.a f199162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f199163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f199164f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            e eVarCreateFromParcel = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            vs.a aVarCreateFromParcel = parcel.readInt() != 0 ? vs.a.CREATOR.createFromParcel(parcel) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = f.a(e.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            while (iA != i15) {
                iA = f.a(e.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new b(z14, z15, eVarCreateFromParcel, aVarCreateFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(boolean z14, boolean z15, e eVar, vs.a aVar, List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : eVar, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? j0.f134944a : list, (i14 & 32) != 0 ? j0.f134944a : list2);
    }

    public static b b(b bVar, boolean z14, boolean z15, e eVar, vs.a aVar, ArrayList arrayList, ArrayList arrayList2, int i14) {
        if ((i14 & 1) != 0) {
            z14 = bVar.f199159a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            z15 = bVar.f199160b;
        }
        boolean z17 = z15;
        if ((i14 & 4) != 0) {
            eVar = bVar.f199161c;
        }
        e eVar2 = eVar;
        if ((i14 & 8) != 0) {
            aVar = bVar.f199162d;
        }
        vs.a aVar2 = aVar;
        List<e> list = arrayList;
        if ((i14 & 16) != 0) {
            list = bVar.f199163e;
        }
        List<e> list2 = list;
        List<e> list3 = arrayList2;
        if ((i14 & 32) != 0) {
            list3 = bVar.f199164f;
        }
        List<e> list4 = list3;
        bVar.getClass();
        list2.getClass();
        list4.getClass();
        return new b(z16, z17, eVar2, aVar2, list2, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f199159a == bVar.f199159a && this.f199160b == bVar.f199160b && s.g(this.f199161c, bVar.f199161c) && s.g(this.f199162d, bVar.f199162d) && s.g(this.f199163e, bVar.f199163e) && s.g(this.f199164f, bVar.f199164f);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f199159a) * 31, 31, this.f199160b);
        e eVar = this.f199161c;
        int iHashCode = (iG + (eVar == null ? 0 : eVar.hashCode())) * 31;
        vs.a aVar = this.f199162d;
        return this.f199164f.hashCode() + u0.b((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f199163e);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ActivityRecordingUiState(showConfirmationDialog=", ", showLoadingDialog=", ", selectedActivityToRecord=", this.f199159a, this.f199160b);
        sbM.append(this.f199161c);
        sbM.append(", recordingState=");
        sbM.append(this.f199162d);
        sbM.append(", mostRecentActivities=");
        return n23.j.j(sbM, this.f199163e, ", recordableActivities=", this.f199164f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f199159a ? 1 : 0);
        parcel.writeInt(this.f199160b ? 1 : 0);
        e eVar = this.f199161c;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        vs.a aVar = this.f199162d;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        Iterator itE = f.e(this.f199163e, parcel);
        while (itE.hasNext()) {
            ((e) itE.next()).writeToParcel(parcel, i14);
        }
        Iterator itE2 = f.e(this.f199164f, parcel);
        while (itE2.hasNext()) {
            ((e) itE2.next()).writeToParcel(parcel, i14);
        }
    }

    public b(boolean z14, boolean z15, e eVar, vs.a aVar, List<e> list, List<e> list2) {
        list.getClass();
        list2.getClass();
        this.f199159a = z14;
        this.f199160b = z15;
        this.f199161c = eVar;
        this.f199162d = aVar;
        this.f199163e = list;
        this.f199164f = list2;
    }

    public b() {
        this(false, false, null, null, null, null, 63, null);
    }
}
