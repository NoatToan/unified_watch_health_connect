package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import j20.x;
import j53.l;
import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Laa1/c;", "Landroid/os/Parcelable;", "", "isLoading", "Lq91/d;", "personalRecordType", "", "personalRecordTypeName", "personalRecordTypeMessage", "", "lowerDateLimitMillis", "selectedDateUTCMillis", "formattedSelectedDate", "", "metricDoubleValue", "metricStringValue", "formattedMetricValue", "formattedMetricValueContentDescription", "Lq91/b;", "metricUnit", "Li53/c;", "allUnits", "isMetricError", "metricErrorMessage", "metricErrorMessageContentDescription", "<init>", "(ZLq91/d;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq91/b;Li53/c;ZLjava/lang/String;Ljava/lang/String;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q91.d f2234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f2240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f2242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q91.b f2244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i53.c<q91.b> f2245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f2248p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = parcel.readInt() != 0;
            q91.d dVar = (q91.d) parcel.readParcelable(c.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            String string3 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            q91.b bVarCreateFromParcel = parcel.readInt() != 0 ? q91.b.CREATOR.createFromParcel(parcel) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(q91.b.CREATOR, parcel, arrayList, iA, 1);
                i14 = i14;
            }
            return new c(z14, dVar, string, string2, j8, j14, string3, dValueOf, string4, string5, string6, bVarCreateFromParcel, i53.a.j(arrayList), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(boolean z14, q91.d dVar, String str, String str2, long j8, long j14, String str3, Double d14, String str4, String str5, String str6, q91.b bVar, i53.c cVar, boolean z15, String str7, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        String str9;
        String str10;
        boolean z16 = (i14 & 1) != 0 ? false : z14;
        q91.d dVar2 = (i14 & 2) != 0 ? null : dVar;
        String str11 = (i14 & 4) != 0 ? "" : str;
        String str12 = (i14 & 8) != 0 ? "" : str2;
        long millis = (i14 & 16) != 0 ? DateTime.now().getMillis() : j8;
        long millis2 = (i14 & 32) != 0 ? DateTime.now().getMillis() : j14;
        String str13 = (i14 & 64) != 0 ? "" : str3;
        Double d15 = (i14 & 128) != 0 ? null : d14;
        String str14 = (i14 & 256) != 0 ? null : str4;
        String str15 = (i14 & 512) != 0 ? "" : str5;
        String str16 = (i14 & 1024) != 0 ? "" : str6;
        q91.b bVar2 = (i14 & 2048) != 0 ? null : bVar;
        boolean z17 = z16;
        i53.c cVarB = (i14 & 4096) != 0 ? l.b() : cVar;
        boolean z18 = (i14 & 8192) != 0 ? false : z15;
        String str17 = (i14 & 16384) == 0 ? str7 : "";
        if ((i14 & 32768) != 0) {
            str10 = str17;
            str9 = str10;
        } else {
            str9 = str8;
            str10 = str17;
        }
        this(z17, dVar2, str11, str12, millis, millis2, str13, d15, str14, str15, str16, bVar2, cVarB, z18, str10, str9);
    }

    public static c b(c cVar, boolean z14, long j8, String str, Double d14, String str2, String str3, String str4, q91.b bVar, boolean z15, String str5, String str6, int i14) {
        boolean z16 = (i14 & 1) != 0 ? cVar.f2233a : z14;
        q91.d dVar = cVar.f2234b;
        String str7 = cVar.f2235c;
        String str8 = cVar.f2236d;
        long j14 = cVar.f2237e;
        long j15 = (i14 & 32) != 0 ? cVar.f2238f : j8;
        String str9 = (i14 & 64) != 0 ? cVar.f2239g : str;
        Double d15 = (i14 & 128) != 0 ? cVar.f2240h : d14;
        String str10 = (i14 & 256) != 0 ? cVar.f2241i : str2;
        String str11 = (i14 & 512) != 0 ? cVar.f2242j : str3;
        String str12 = (i14 & 1024) != 0 ? cVar.f2243k : str4;
        q91.b bVar2 = (i14 & 2048) != 0 ? cVar.f2244l : bVar;
        i53.c<q91.b> cVar2 = cVar.f2245m;
        boolean z17 = (i14 & 8192) != 0 ? cVar.f2246n : z15;
        String str13 = (i14 & 16384) != 0 ? cVar.f2247o : str5;
        String str14 = (i14 & 32768) != 0 ? cVar.f2248p : str6;
        cVar.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str11.getClass();
        str12.getClass();
        cVar2.getClass();
        str13.getClass();
        str14.getClass();
        return new c(z16, dVar, str7, str8, j14, j15, str9, d15, str10, str11, str12, bVar2, cVar2, z17, str13, str14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2233a == cVar.f2233a && this.f2234b == cVar.f2234b && s.g(this.f2235c, cVar.f2235c) && s.g(this.f2236d, cVar.f2236d) && this.f2237e == cVar.f2237e && this.f2238f == cVar.f2238f && s.g(this.f2239g, cVar.f2239g) && s.g(this.f2240h, cVar.f2240h) && s.g(this.f2241i, cVar.f2241i) && s.g(this.f2242j, cVar.f2242j) && s.g(this.f2243k, cVar.f2243k) && this.f2244l == cVar.f2244l && s.g(this.f2245m, cVar.f2245m) && this.f2246n == cVar.f2246n && s.g(this.f2247o, cVar.f2247o) && s.g(this.f2248p, cVar.f2248p);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2233a) * 31;
        q91.d dVar = this.f2234b;
        int iJ = wr.g.j(q6.f.e(q6.f.e(wr.g.j(wr.g.j((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f2235c), 31, this.f2236d), 31, this.f2237e), 31, this.f2238f), 31, this.f2239g);
        Double d14 = this.f2240h;
        int iHashCode2 = (iJ + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f2241i;
        int iJ2 = wr.g.j(wr.g.j((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2242j), 31, this.f2243k);
        q91.b bVar = this.f2244l;
        return this.f2248p.hashCode() + wr.g.j(q6.f.g(l2.a(this.f2245m, (iJ2 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31), 31, this.f2246n), 31, this.f2247o);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ManualPersonalRecordCreationState(isLoading=");
        sb3.append(this.f2233a);
        sb3.append(", personalRecordType=");
        sb3.append(this.f2234b);
        sb3.append(", personalRecordTypeName=");
        sn.a.t(sb3, this.f2235c, ", personalRecordTypeMessage=", this.f2236d, ", lowerDateLimitMillis=");
        sb3.append(this.f2237e);
        x.j(this.f2238f, ", selectedDateUTCMillis=", ", formattedSelectedDate=", sb3);
        b71.i.x(sb3, this.f2239g, ", metricDoubleValue=", this.f2240h, ", metricStringValue=");
        sn.a.t(sb3, this.f2241i, ", formattedMetricValue=", this.f2242j, ", formattedMetricValueContentDescription=");
        sb3.append(this.f2243k);
        sb3.append(", metricUnit=");
        sb3.append(this.f2244l);
        sb3.append(", allUnits=");
        sb3.append(this.f2245m);
        sb3.append(", isMetricError=");
        sb3.append(this.f2246n);
        sb3.append(", metricErrorMessage=");
        return e5.h(sb3, this.f2247o, ", metricErrorMessageContentDescription=", this.f2248p, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f2233a ? 1 : 0);
        parcel.writeParcelable(this.f2234b, i14);
        parcel.writeString(this.f2235c);
        parcel.writeString(this.f2236d);
        parcel.writeLong(this.f2237e);
        parcel.writeLong(this.f2238f);
        parcel.writeString(this.f2239g);
        Double d14 = this.f2240h;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.f2241i);
        parcel.writeString(this.f2242j);
        parcel.writeString(this.f2243k);
        q91.b bVar = this.f2244l;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        Iterator itG = x.g(this.f2245m, parcel);
        while (itG.hasNext()) {
            ((q91.b) itG.next()).writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f2246n ? 1 : 0);
        parcel.writeString(this.f2247o);
        parcel.writeString(this.f2248p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z14, q91.d dVar, String str, String str2, long j8, long j14, String str3, Double d14, String str4, String str5, String str6, q91.b bVar, i53.c<? extends q91.b> cVar, boolean z15, String str7, String str8) {
        hb.a.p(str, str2, str3, str5, str6);
        cVar.getClass();
        str7.getClass();
        str8.getClass();
        this.f2233a = z14;
        this.f2234b = dVar;
        this.f2235c = str;
        this.f2236d = str2;
        this.f2237e = j8;
        this.f2238f = j14;
        this.f2239g = str3;
        this.f2240h = d14;
        this.f2241i = str4;
        this.f2242j = str5;
        this.f2243k = str6;
        this.f2244l = bVar;
        this.f2245m = cVar;
        this.f2246n = z15;
        this.f2247o = str7;
        this.f2248p = str8;
    }

    public c() {
        this(false, null, null, null, 0L, 0L, null, null, null, null, null, null, null, false, null, null, 65535, null);
    }
}
