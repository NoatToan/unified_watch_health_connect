package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import j20.x;
import j53.l;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Laa1/a;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "Lq91/d;", "personalRecordType", "", "title", "", "currentPRId", "currentPRValue", "currentPRValueContentDescription", "currentPRTimestamp", "Laa1/d;", "currentPRCandidate", "Li53/c;", "prHistoryItems", "allPRs", "Ldn/a;", "fastestSplit", "<init>", "(ZZLq91/d;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laa1/d;Li53/c;Li53/c;Li53/c;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0025a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q91.d f2220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f2222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f2226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<d> f2227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<d> f2228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i53.c<dn.a> f2229l;

    /* JADX INFO: renamed from: aa1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0025a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            q91.d dVar = (q91.d) parcel.readParcelable(a.class.getClassLoader());
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            d dVarCreateFromParcel = parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(d.CREATOR, parcel, arrayList, iA, 1);
            }
            i53.f fVarJ = i53.a.j(arrayList);
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iA2 = 0;
            while (iA2 != i15) {
                iA2 = kg.f.a(d.CREATOR, parcel, arrayList2, iA2, 1);
                i15 = i15;
            }
            i53.f fVarJ2 = i53.a.j(arrayList2);
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            Long l14 = lValueOf;
            int iD = 0;
            while (iD != i16) {
                iD = u0.d(a.class, parcel, arrayList3, iD, 1);
            }
            return new a(z14, z15, dVar, string, l14, string2, string3, string4, dVarCreateFromParcel, fVarJ, fVarJ2, i53.a.j(arrayList3));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        Parcelable.Creator<dn.a> creator = dn.a.CREATOR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(boolean z14, boolean z15, q91.d dVar, String str, Long l14, String str2, String str3, String str4, d dVar2, i53.c cVar, i53.c cVar2, i53.c cVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        dVar = (i14 & 4) != 0 ? null : dVar;
        str = (i14 & 8) != 0 ? "" : str;
        l14 = (i14 & 16) != 0 ? null : l14;
        str2 = (i14 & 32) != 0 ? null : str2;
        this(z14, z15, dVar, str, l14, str2, (i14 & 64) != 0 ? str2 : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : dVar2, (i14 & 512) != 0 ? l.b() : cVar, (i14 & 1024) != 0 ? l.b() : cVar2, (i14 & 2048) != 0 ? l.b() : cVar3);
    }

    public static a b(a aVar, boolean z14, boolean z15, q91.d dVar, String str, Long l14, String str2, String str3, String str4, d dVar2, i53.c cVar, i53.c cVar2, int i14) {
        if ((i14 & 1) != 0) {
            z14 = aVar.f2218a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            z15 = aVar.f2219b;
        }
        boolean z17 = z15;
        q91.d dVar3 = (i14 & 4) != 0 ? aVar.f2220c : dVar;
        String str5 = (i14 & 8) != 0 ? aVar.f2221d : str;
        Long l15 = (i14 & 16) != 0 ? aVar.f2222e : l14;
        String str6 = (i14 & 32) != 0 ? aVar.f2223f : str2;
        String str7 = (i14 & 64) != 0 ? aVar.f2224g : str3;
        String str8 = (i14 & 128) != 0 ? aVar.f2225h : str4;
        d dVar4 = (i14 & 256) != 0 ? aVar.f2226i : dVar2;
        i53.c<d> cVar3 = aVar.f2227j;
        i53.c cVar4 = (i14 & 1024) != 0 ? aVar.f2228k : cVar;
        i53.c cVar5 = (i14 & 2048) != 0 ? aVar.f2229l : cVar2;
        aVar.getClass();
        str5.getClass();
        cVar3.getClass();
        cVar4.getClass();
        cVar5.getClass();
        return new a(z16, z17, dVar3, str5, l15, str6, str7, str8, dVar4, cVar3, cVar4, cVar5);
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
        return this.f2218a == aVar.f2218a && this.f2219b == aVar.f2219b && this.f2220c == aVar.f2220c && s.g(this.f2221d, aVar.f2221d) && s.g(this.f2222e, aVar.f2222e) && s.g(this.f2223f, aVar.f2223f) && s.g(this.f2224g, aVar.f2224g) && s.g(this.f2225h, aVar.f2225h) && s.g(this.f2226i, aVar.f2226i) && s.g(this.f2227j, aVar.f2227j) && s.g(this.f2228k, aVar.f2228k) && s.g(this.f2229l, aVar.f2229l);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f2218a) * 31, 31, this.f2219b);
        q91.d dVar = this.f2220c;
        int iJ = wr.g.j((iG + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f2221d);
        Long l14 = this.f2222e;
        int iHashCode = (iJ + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f2223f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2224g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2225h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar2 = this.f2226i;
        return this.f2229l.hashCode() + l2.a(this.f2228k, l2.a(this.f2227j, (iHashCode4 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("BestEffortsScreenState(isLoading=", ", isError=", ", personalRecordType=", this.f2218a, this.f2219b);
        sbM.append(this.f2220c);
        sbM.append(", title=");
        sbM.append(this.f2221d);
        sbM.append(", currentPRId=");
        b71.i.q(this.f2222e, ", currentPRValue=", this.f2223f, ", currentPRValueContentDescription=", sbM);
        sn.a.t(sbM, this.f2224g, ", currentPRTimestamp=", this.f2225h, ", currentPRCandidate=");
        sbM.append(this.f2226i);
        sbM.append(", prHistoryItems=");
        sbM.append(this.f2227j);
        sbM.append(", allPRs=");
        sbM.append(this.f2228k);
        sbM.append(", fastestSplit=");
        sbM.append(this.f2229l);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f2218a ? 1 : 0);
        parcel.writeInt(this.f2219b ? 1 : 0);
        parcel.writeParcelable(this.f2220c, i14);
        parcel.writeString(this.f2221d);
        Long l14 = this.f2222e;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f2223f);
        parcel.writeString(this.f2224g);
        parcel.writeString(this.f2225h);
        d dVar = this.f2226i;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        Iterator itG = x.g(this.f2227j, parcel);
        while (itG.hasNext()) {
            ((d) itG.next()).writeToParcel(parcel, i14);
        }
        Iterator itG2 = x.g(this.f2228k, parcel);
        while (itG2.hasNext()) {
            ((d) itG2.next()).writeToParcel(parcel, i14);
        }
        Iterator itG3 = x.g(this.f2229l, parcel);
        while (itG3.hasNext()) {
            parcel.writeParcelable((Parcelable) itG3.next(), i14);
        }
    }

    public a(boolean z14, boolean z15, q91.d dVar, String str, Long l14, String str2, String str3, String str4, d dVar2, i53.c<d> cVar, i53.c<d> cVar2, i53.c<dn.a> cVar3) {
        str.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f2218a = z14;
        this.f2219b = z15;
        this.f2220c = dVar;
        this.f2221d = str;
        this.f2222e = l14;
        this.f2223f = str2;
        this.f2224g = str3;
        this.f2225h = str4;
        this.f2226i = dVar2;
        this.f2227j = cVar;
        this.f2228k = cVar2;
        this.f2229l = cVar3;
    }

    public a() {
        this(false, false, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
