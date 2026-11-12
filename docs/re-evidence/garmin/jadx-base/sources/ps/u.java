package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lps/u;", "Landroid/os/Parcelable;", "Lps/v;", "summary", "", "Lps/t;", "apneaDives", "<init>", "(Lps/v;Ljava/util/List;)V", "a", "Lps/v;", "d", "()Lps/v;", "b", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summary")
    private final v summary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apneaDives")
    private final List<t> apneaDives;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            v vVarCreateFromParcel = parcel.readInt() == 0 ? null : v.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(t.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new u(vVarCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public /* synthetic */ u(v vVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : vVar, (i14 & 2) != 0 ? null : list);
    }

    public final List<t> b() {
        return this.apneaDives;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getSummary() {
        return this.summary;
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
        return p005kotlin.jvm.internal.s.g(this.summary, uVar.summary) && p005kotlin.jvm.internal.s.g(this.apneaDives, uVar.apneaDives);
    }

    public final int hashCode() {
        v vVar = this.summary;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        List<t> list = this.apneaDives;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApneaDivesDTO(summary=" + this.summary + ", apneaDives=" + this.apneaDives + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        v vVar = this.summary;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar.writeToParcel(parcel, i14);
        }
        List<t> list = this.apneaDives;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = lc.u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((t) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public u(v vVar, List<t> list) {
        this.summary = vVar;
        this.apneaDives = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
