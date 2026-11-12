package g81;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg81/l;", "Landroid/os/Parcelable;", "Lc22/c3;", "contributorTypeLabelRes", "", "formattedContribution", "", "subContributors", "<init>", "(Lc22/c3;Ljava/lang/String;Ljava/util/List;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f76361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<l> f76363c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            c3 c3Var = (c3) parcel.readParcelable(l.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(l.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new l(c3Var, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(c3 c3Var, String str, List<l> list) {
        c3Var.getClass();
        str.getClass();
        this.f76361a = c3Var;
        this.f76362b = str;
        this.f76363c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f76361a, lVar.f76361a) && p005kotlin.jvm.internal.s.g(this.f76362b, lVar.f76362b) && p005kotlin.jvm.internal.s.g(this.f76363c, lVar.f76363c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f76361a.hashCode() * 31, 31, this.f76362b);
        List<l> list = this.f76363c;
        return iJ + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EnduranceScoreContributorItem(contributorTypeLabelRes=");
        sb3.append(this.f76361a);
        sb3.append(", formattedContribution=");
        sb3.append(this.f76362b);
        sb3.append(", subContributors=");
        return u62.z.c(sb3, this.f76363c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f76361a, i14);
        parcel.writeString(this.f76362b);
        List<l> list = this.f76363c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((l) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ l(c3 c3Var, String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c3Var, str, (i14 & 4) != 0 ? null : list);
    }
}
