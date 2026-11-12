package yo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyo2/e;", "Landroid/os/Parcelable;", "", "Lxo2/a;", "topOfWallet", RemoteConfigComponent.ACTIVATE_FILE_NAME, "deactivate", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<xo2.a> f198593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<xo2.a> f198594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<xo2.a> f198595c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            int iA = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(xo2.a.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iA3 = 0;
                while (iA3 != i15) {
                    iA3 = kg.f.a(xo2.a.CREATOR, parcel, arrayList2, iA3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                while (iA != i16) {
                    iA = kg.f.a(xo2.a.CREATOR, parcel, arrayList3, iA, 1);
                }
            }
            return new e(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(List list, List list2, List list3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f198593a, eVar.f198593a) && s.g(this.f198594b, eVar.f198594b) && s.g(this.f198595c, eVar.f198595c);
    }

    public final int hashCode() {
        List<xo2.a> list = this.f198593a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<xo2.a> list2 = this.f198594b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<xo2.a> list3 = this.f198595c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return z.c(f3.k("NewCreditCardOfflineActions(topOfWallet=", ", activate=", ", deactivate=", this.f198593a, this.f198594b), this.f198595c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<xo2.a> list = this.f198593a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((xo2.a) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<xo2.a> list2 = this.f198594b;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((xo2.a) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<xo2.a> list3 = this.f198595c;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO3 = u0.o(parcel, list3, 1);
        while (itO3.hasNext()) {
            ((xo2.a) itO3.next()).writeToParcel(parcel, i14);
        }
    }

    public e(List<xo2.a> list, List<xo2.a> list2, List<xo2.a> list3) {
        this.f198593a = list;
        this.f198594b = list2;
        this.f198595c = list3;
    }

    public e() {
        this(null, null, null, 7, null);
    }
}
