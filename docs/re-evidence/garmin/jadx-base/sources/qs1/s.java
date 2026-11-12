package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqs1/s;", "Landroid/os/Parcelable;", "Lqs1/d;", "curatedCourseDTO", "", "Lo20/a;", "elevationData", "Lcom/google/android/gms/maps/model/LatLng;", "polylineData", "Lqs1/l;", "popularityData", "<init>", "(Lqs1/d;Ljava/util/List;Ljava/util/List;Lqs1/l;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f147341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o20.a> f147342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<LatLng> f147343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f147344d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            d dVarCreateFromParcel = d.CREATOR.createFromParcel(parcel);
            int iD = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD2 = 0;
                while (iD2 != i14) {
                    iD2 = u0.d(s.class, parcel, arrayList, iD2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iD != i15) {
                    iD = u0.d(s.class, parcel, arrayList2, iD, 1);
                }
            }
            return new s(dVarCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0 ? l.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(d dVar, List list, List list2, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? j0.f134944a : list2, (i14 & 8) != 0 ? null : lVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f147341a, sVar.f147341a) && p005kotlin.jvm.internal.s.g(this.f147342b, sVar.f147342b) && p005kotlin.jvm.internal.s.g(this.f147343c, sVar.f147343c) && p005kotlin.jvm.internal.s.g(this.f147344d, sVar.f147344d);
    }

    public final int hashCode() {
        int iHashCode = this.f147341a.hashCode() * 31;
        List<o20.a> list = this.f147342b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<LatLng> list2 = this.f147343c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        l lVar = this.f147344d;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrailExtraInfo(curatedCourseDTO=" + this.f147341a + ", elevationData=" + this.f147342b + ", polylineData=" + this.f147343c + ", popularityData=" + this.f147344d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f147341a.writeToParcel(parcel, i14);
        List<o20.a> list = this.f147342b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        List<LatLng> list2 = this.f147343c;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeParcelable((Parcelable) itO2.next(), i14);
            }
        }
        l lVar = this.f147344d;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(d dVar, List<? extends o20.a> list, List<LatLng> list2, l lVar) {
        dVar.getClass();
        this.f147341a = dVar;
        this.f147342b = list;
        this.f147343c = list2;
        this.f147344d = lVar;
    }
}
