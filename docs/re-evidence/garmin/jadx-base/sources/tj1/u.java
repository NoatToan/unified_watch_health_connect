package tj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Ltj1/u;", "Landroid/os/Parcelable;", "", "Ltj1/t;", "successes", "Ltj1/s;", "failures", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("successes")
    private final List<t> successes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("failures")
    private final List<s> failures;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int iA = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(t.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iA != i15) {
                    iA = kg.f.a(s.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new u(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public u(List<t> list, List<s> list2) {
        this.successes = list;
        this.failures = list2;
    }

    public final List<s> b() {
        return this.failures;
    }

    public final List<t> d() {
        return this.successes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.successes, uVar.successes) && p005kotlin.jvm.internal.s.g(this.failures, uVar.failures);
    }

    public final List<String> f() {
        List<s> list = this.failures;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String contactUuid = ((s) it.next()).getContactUuid();
            if (contactUuid != null) {
                arrayList2.add(contactUuid);
            }
        }
        return arrayList2;
    }

    public final int hashCode() {
        List<t> list = this.successes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<s> list2 = this.failures;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return c22.t.f("SendNotificationsResponseDTO(successes=", ", failures=", ")", this.successes, this.failures);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<t> list = this.successes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((t) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<s> list2 = this.failures;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO2 = u0.o(parcel, list2, 1);
        while (itO2.hasNext()) {
            ((s) itO2.next()).writeToParcel(parcel, i14);
        }
    }
}
