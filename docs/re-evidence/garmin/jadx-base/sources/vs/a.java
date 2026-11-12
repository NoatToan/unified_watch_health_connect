package vs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvs/a;", "Landroid/os/Parcelable;", "Lvs/f;", "activityType", "Lys/a;", "status", "", "Lvs/c;", "metrics", "<init>", "(Lvs/f;Lys/a;Ljava/util/List;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3355a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f179692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ys.a f179693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c> f179694c;

    /* JADX INFO: renamed from: vs.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3355a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            f fVarValueOf = parcel.readInt() == 0 ? null : f.valueOf(parcel.readString());
            ys.a aVar = (ys.a) parcel.readParcelable(a.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(c.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new a(fVarValueOf, aVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(f fVar, ys.a aVar, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : list);
    }

    public static a b(a aVar, f fVar, ys.a aVar2, ArrayList arrayList, int i14) {
        if ((i14 & 1) != 0) {
            fVar = aVar.f179692a;
        }
        if ((i14 & 2) != 0) {
            aVar2 = aVar.f179693b;
        }
        List<c> list = arrayList;
        if ((i14 & 4) != 0) {
            list = aVar.f179694c;
        }
        aVar.getClass();
        return new a(fVar, aVar2, list);
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
        return this.f179692a == aVar.f179692a && s.g(this.f179693b, aVar.f179693b) && s.g(this.f179694c, aVar.f179694c);
    }

    public final int hashCode() {
        f fVar = this.f179692a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        ys.a aVar = this.f179693b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<c> list = this.f179694c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityRecordingDataState(activityType=");
        sb3.append(this.f179692a);
        sb3.append(", status=");
        sb3.append(this.f179693b);
        sb3.append(", metrics=");
        return z.c(sb3, this.f179694c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.f179692a;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar.name());
        }
        parcel.writeParcelable(this.f179693b, i14);
        List<c> list = this.f179694c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((c) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public a(f fVar, ys.a aVar, List<c> list) {
        this.f179692a = fVar;
        this.f179693b = aVar;
        this.f179694c = list;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
