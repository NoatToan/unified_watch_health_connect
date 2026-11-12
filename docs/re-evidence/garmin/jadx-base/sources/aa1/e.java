package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import j20.x;
import j53.l;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Laa1/e;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "shouldShowUpdateOneRepMaxDialog", "Lq91/d;", "personalRecordType", "", "title", "", "currentPRId", "currentPRValue", "currentPRValueContentDescription", "currentPRTimestamp", "Laa1/d;", "currentPRCandidate", "Li53/c;", "prHistoryItems", "<init>", "(ZZZLq91/d;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laa1/d;Li53/c;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q91.d f2262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f2264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f2268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<d> f2269k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            q91.d dVar = (q91.d) parcel.readParcelable(e.class.getClassLoader());
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            d dVarCreateFromParcel = parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iA != i14) {
                iA = kg.f.a(d.CREATOR, parcel, arrayList, iA, 1);
            }
            return new e(z14, z15, z16, dVar, string, lValueOf, string2, string3, string4, dVarCreateFromParcel, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(boolean z14, boolean z15, boolean z16, q91.d dVar, String str, Long l14, String str2, String str3, String str4, d dVar2, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        z16 = (i14 & 4) != 0 ? false : z16;
        dVar = (i14 & 8) != 0 ? null : dVar;
        str = (i14 & 16) != 0 ? "" : str;
        l14 = (i14 & 32) != 0 ? null : l14;
        str2 = (i14 & 64) != 0 ? null : str2;
        this(z14, z15, z16, dVar, str, l14, str2, (i14 & 128) != 0 ? str2 : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : dVar2, (i14 & 1024) != 0 ? l.b() : cVar);
    }

    public static e b(e eVar, boolean z14, boolean z15, Long l14, String str, String str2, String str3, i53.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = eVar.f2259a;
        }
        boolean z16 = z14;
        boolean z17 = (i14 & 2) != 0 ? eVar.f2260b : true;
        boolean z18 = (i14 & 4) != 0 ? eVar.f2261c : z15;
        q91.d dVar = eVar.f2262d;
        String str4 = eVar.f2263e;
        Long l15 = (i14 & 32) != 0 ? eVar.f2264f : l14;
        String str5 = (i14 & 64) != 0 ? eVar.f2265g : str;
        String str6 = (i14 & 128) != 0 ? eVar.f2266h : str2;
        String str7 = (i14 & 256) != 0 ? eVar.f2267i : str3;
        d dVar2 = (i14 & 512) != 0 ? eVar.f2268j : null;
        i53.c cVar2 = (i14 & 1024) != 0 ? eVar.f2269k : cVar;
        eVar.getClass();
        str4.getClass();
        cVar2.getClass();
        return new e(z16, z17, z18, dVar, str4, l15, str5, str6, str7, dVar2, cVar2);
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
        return this.f2259a == eVar.f2259a && this.f2260b == eVar.f2260b && this.f2261c == eVar.f2261c && this.f2262d == eVar.f2262d && s.g(this.f2263e, eVar.f2263e) && s.g(this.f2264f, eVar.f2264f) && s.g(this.f2265g, eVar.f2265g) && s.g(this.f2266h, eVar.f2266h) && s.g(this.f2267i, eVar.f2267i) && s.g(this.f2268j, eVar.f2268j) && s.g(this.f2269k, eVar.f2269k);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Boolean.hashCode(this.f2259a) * 31, 31, this.f2260b), 31, this.f2261c);
        q91.d dVar = this.f2262d;
        int iJ = wr.g.j((iG + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f2263e);
        Long l14 = this.f2264f;
        int iHashCode = (iJ + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f2265g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2266h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2267i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar2 = this.f2268j;
        return this.f2269k.hashCode() + ((iHashCode4 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PersonalRecordHistoryScreenState(isLoading=", ", isError=", ", shouldShowUpdateOneRepMaxDialog=", this.f2259a, this.f2260b);
        sbM.append(this.f2261c);
        sbM.append(", personalRecordType=");
        sbM.append(this.f2262d);
        sbM.append(", title=");
        n23.j.q(this.f2264f, this.f2263e, ", currentPRId=", ", currentPRValue=", sbM);
        sn.a.t(sbM, this.f2265g, ", currentPRValueContentDescription=", this.f2266h, ", currentPRTimestamp=");
        sbM.append(this.f2267i);
        sbM.append(", currentPRCandidate=");
        sbM.append(this.f2268j);
        sbM.append(", prHistoryItems=");
        return l2.e(sbM, this.f2269k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f2259a ? 1 : 0);
        parcel.writeInt(this.f2260b ? 1 : 0);
        parcel.writeInt(this.f2261c ? 1 : 0);
        parcel.writeParcelable(this.f2262d, i14);
        parcel.writeString(this.f2263e);
        Long l14 = this.f2264f;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f2265g);
        parcel.writeString(this.f2266h);
        parcel.writeString(this.f2267i);
        d dVar = this.f2268j;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        Iterator itG = x.g(this.f2269k, parcel);
        while (itG.hasNext()) {
            ((d) itG.next()).writeToParcel(parcel, i14);
        }
    }

    public e(boolean z14, boolean z15, boolean z16, q91.d dVar, String str, Long l14, String str2, String str3, String str4, d dVar2, i53.c<d> cVar) {
        str.getClass();
        cVar.getClass();
        this.f2259a = z14;
        this.f2260b = z15;
        this.f2261c = z16;
        this.f2262d = dVar;
        this.f2263e = str;
        this.f2264f = l14;
        this.f2265g = str2;
        this.f2266h = str3;
        this.f2267i = str4;
        this.f2268j = dVar2;
        this.f2269k = cVar;
    }

    public e() {
        this(false, false, false, null, null, null, null, null, null, null, null, 2047, null);
    }
}
