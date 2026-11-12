package g81;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg81/g;", "Landroid/os/Parcelable;", "Lc22/c3;", "activityTypeLabelRes", "abbrevActivityTypeLabelRes", "", "contributorColorRes", "", "contribution", "", "formattedContribution", "Lam/x0;", "activityType", "Li53/c;", "Lg81/v;", "contributorBreakdown", "<init>", "(Lc22/c3;Lc22/c3;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Lam/x0;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f76325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f76326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f76327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f76328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f76330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<v> f76331g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            c3 c3Var = (c3) parcel.readParcelable(g.class.getClassLoader());
            c3 c3Var2 = (c3) parcel.readParcelable(g.class.getClassLoader());
            i53.f fVarJ = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string = parcel.readString();
            x0 x0Var = (x0) parcel.readParcelable(g.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(v.CREATOR, parcel, arrayList, iA, 1);
                }
                fVarJ = i53.a.j(arrayList);
            }
            return new g(c3Var, c3Var2, numValueOf, dValueOf, string, x0Var, fVarJ);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(c3 c3Var, c3 c3Var2, Integer num, Double d14, String str, x0 x0Var, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : c3Var, (i14 & 2) != 0 ? null : c3Var2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : d14, str, (i14 & 32) != 0 ? null : x0Var, (i14 & 64) != 0 ? null : cVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f76325a, gVar.f76325a) && p005kotlin.jvm.internal.s.g(this.f76326b, gVar.f76326b) && p005kotlin.jvm.internal.s.g(this.f76327c, gVar.f76327c) && p005kotlin.jvm.internal.s.g(this.f76328d, gVar.f76328d) && p005kotlin.jvm.internal.s.g(this.f76329e, gVar.f76329e) && this.f76330f == gVar.f76330f && p005kotlin.jvm.internal.s.g(this.f76331g, gVar.f76331g);
    }

    public final int hashCode() {
        c3 c3Var = this.f76325a;
        int iHashCode = (c3Var == null ? 0 : c3Var.hashCode()) * 31;
        c3 c3Var2 = this.f76326b;
        int iHashCode2 = (iHashCode + (c3Var2 == null ? 0 : c3Var2.hashCode())) * 31;
        Integer num = this.f76327c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f76328d;
        int iJ = wr.g.j((iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31, 31, this.f76329e);
        x0 x0Var = this.f76330f;
        int iHashCode4 = (iJ + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        i53.c<v> cVar = this.f76331g;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EnduranceScoreContributor(activityTypeLabelRes=");
        sb3.append(this.f76325a);
        sb3.append(", abbrevActivityTypeLabelRes=");
        sb3.append(this.f76326b);
        sb3.append(", contributorColorRes=");
        b71.i.v(sb3, this.f76327c, ", contribution=", this.f76328d, ", formattedContribution=");
        sb3.append(this.f76329e);
        sb3.append(", activityType=");
        sb3.append(this.f76330f);
        sb3.append(", contributorBreakdown=");
        return l2.e(sb3, this.f76331g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f76325a, i14);
        parcel.writeParcelable(this.f76326b, i14);
        Integer num = this.f76327c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.f76328d;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.f76329e);
        parcel.writeParcelable(this.f76330f, i14);
        i53.c<v> cVar = this.f76331g;
        if (cVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(cVar.size());
        Iterator<v> it = cVar.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i14);
        }
    }

    public g(c3 c3Var, c3 c3Var2, Integer num, Double d14, String str, x0 x0Var, i53.c<v> cVar) {
        str.getClass();
        this.f76325a = c3Var;
        this.f76326b = c3Var2;
        this.f76327c = num;
        this.f76328d = d14;
        this.f76329e = str;
        this.f76330f = x0Var;
        this.f76331g = cVar;
    }
}
