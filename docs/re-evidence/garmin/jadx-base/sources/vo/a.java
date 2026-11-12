package vo;

import am.j;
import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import zm.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvo/a;", "Landroid/os/Parcelable;", "", "rangeStart", "rangeEnd", "initialProgress", "Lam/x0;", "activityType", "nextLegActivityType", "Lzm/p;", "chartData", "chartSplitPoint", "<init>", "(IIILam/x0;Lam/x0;Lzm/p;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3342a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f178987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f178988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f178989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f178990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f178991g;

    /* JADX INFO: renamed from: vo.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3342a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), parcel.readInt(), parcel.readInt(), (x0) parcel.readParcelable(a.class.getClassLoader()), (x0) parcel.readParcelable(a.class.getClassLoader()), (p) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, int i15, int i16, x0 x0Var, x0 x0Var2, p pVar, int i17) {
        x0Var.getClass();
        this.f178985a = i14;
        this.f178986b = i15;
        this.f178987c = i16;
        this.f178988d = x0Var;
        this.f178989e = x0Var2;
        this.f178990f = pVar;
        this.f178991g = i17;
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
        return this.f178985a == aVar.f178985a && this.f178986b == aVar.f178986b && this.f178987c == aVar.f178987c && this.f178988d == aVar.f178988d && this.f178989e == aVar.f178989e && s.g(this.f178990f, aVar.f178990f) && this.f178991g == aVar.f178991g;
    }

    public final int hashCode() {
        int iHashCode = (this.f178988d.hashCode() + q2.d(this.f178987c, q2.d(this.f178986b, Integer.hashCode(this.f178985a) * 31, 31), 31)) * 31;
        x0 x0Var = this.f178989e;
        int iHashCode2 = (iHashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        p pVar = this.f178990f;
        return Integer.hashCode(this.f178991g) + ((iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f178985a, this.f178986b, "LegEditInfo(rangeStart=", ", rangeEnd=", ", initialProgress=");
        sbJ.append(this.f178987c);
        sbJ.append(", activityType=");
        sbJ.append(this.f178988d);
        sbJ.append(", nextLegActivityType=");
        sbJ.append(this.f178989e);
        sbJ.append(", chartData=");
        sbJ.append(this.f178990f);
        sbJ.append(", chartSplitPoint=");
        return j.q(sbJ, this.f178991g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f178985a);
        parcel.writeInt(this.f178986b);
        parcel.writeInt(this.f178987c);
        parcel.writeParcelable(this.f178988d, i14);
        parcel.writeParcelable(this.f178989e, i14);
        parcel.writeParcelable(this.f178990f, i14);
        parcel.writeInt(this.f178991g);
    }

    public /* synthetic */ a(int i14, int i15, int i16, x0 x0Var, x0 x0Var2, p pVar, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, x0Var, x0Var2, pVar, (i18 & 64) != 0 ? 0 : i17);
    }
}
