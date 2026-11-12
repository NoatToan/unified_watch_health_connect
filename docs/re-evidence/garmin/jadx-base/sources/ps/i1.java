package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lps/i1;", "Landroid/os/Parcelable;", "", "startDate", "endDate", "", "Lps/j1;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "b", "getEndDate", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.ENTRIES)
    private final List<j1> entries;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<i1> {
        @Override // android.os.Parcelable.Creator
        public final i1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(j1.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new i1(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final i1[] newArray(int i14) {
            return new i1[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public i1(String str, String str2, List<j1> list) {
        this.startDate = str;
        this.endDate = str2;
        this.entries = list;
    }

    public static i1 b(i1 i1Var, ArrayList arrayList) {
        String str = i1Var.startDate;
        String str2 = i1Var.endDate;
        i1Var.getClass();
        return new i1(str, str2, arrayList);
    }

    public final List<j1> d() {
        return this.entries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return p005kotlin.jvm.internal.s.g(this.startDate, i1Var.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, i1Var.endDate) && p005kotlin.jvm.internal.s.g(this.entries, i1Var.entries);
    }

    public final int hashCode() {
        String str = this.startDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<j1> list = this.entries;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        return u62.z.c(p6.b.i("PowerCurveDTO(startDate=", str, ", endDate=", str2, ", entries="), this.entries, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        List<j1> list = this.entries;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = lc.u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((j1) itO.next()).writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lps/i1$a;", "", "<init>", "()V", "", "SPORT_CYCLING", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
