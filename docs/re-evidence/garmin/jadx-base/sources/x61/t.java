package x61;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx61/t;", "Landroid/os/Parcelable;", "", "", "vo2MaxIntervals", "vo2Value", "vo2PreciseValue", "", "vo2Grade", "fitnessAge", "formattedTitle", "formattedDate", "", "isCycling", "<init>", "(Ljava/util/List;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Double> f189281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f189282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f189283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f189284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f189285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f189286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f189287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f189288h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(Double.valueOf(parcel.readDouble()));
            }
            return new t(arrayList, parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public /* synthetic */ t(List list, double d14, double d15, String str, String str2, String str3, String str4, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, d14, d15, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? false : z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f189281a, tVar.f189281a) && Double.compare(this.f189282b, tVar.f189282b) == 0 && Double.compare(this.f189283c, tVar.f189283c) == 0 && p005kotlin.jvm.internal.s.g(this.f189284d, tVar.f189284d) && p005kotlin.jvm.internal.s.g(this.f189285e, tVar.f189285e) && p005kotlin.jvm.internal.s.g(this.f189286f, tVar.f189286f) && p005kotlin.jvm.internal.s.g(this.f189287g, tVar.f189287g) && this.f189288h == tVar.f189288h;
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(this.f189281a.hashCode() * 31, 31, this.f189282b), 31, this.f189283c);
        String str = this.f189284d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f189285e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f189286f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f189287g;
        return Boolean.hashCode(this.f189288h) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VO2UiModelItem(vo2MaxIntervals=");
        sb3.append(this.f189281a);
        sb3.append(", vo2Value=");
        sb3.append(this.f189282b);
        am.j.x(sb3, ", vo2PreciseValue=", this.f189283c, ", vo2Grade=");
        sn.a.t(sb3, this.f189284d, ", fitnessAge=", this.f189285e, ", formattedTitle=");
        sn.a.t(sb3, this.f189286f, ", formattedDate=", this.f189287g, ", isCycling=");
        return hb.a.k(sb3, this.f189288h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f189281a, parcel);
        while (itE.hasNext()) {
            parcel.writeDouble(((Number) itE.next()).doubleValue());
        }
        parcel.writeDouble(this.f189282b);
        parcel.writeDouble(this.f189283c);
        parcel.writeString(this.f189284d);
        parcel.writeString(this.f189285e);
        parcel.writeString(this.f189286f);
        parcel.writeString(this.f189287g);
        parcel.writeInt(this.f189288h ? 1 : 0);
    }

    public t(List<Double> list, double d14, double d15, String str, String str2, String str3, String str4, boolean z14) {
        list.getClass();
        this.f189281a = list;
        this.f189282b = d14;
        this.f189283c = d15;
        this.f189284d = str;
        this.f189285e = str2;
        this.f189286f = str3;
        this.f189287g = str4;
        this.f189288h = z14;
    }
}
