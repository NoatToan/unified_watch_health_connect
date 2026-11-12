package my1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.proto.generated.GDIInReachMessaging;
import fg0.u;
import fg0.x;
import gg0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lmy1/d;", "Landroid/os/Parcelable;", "", "beginningDate", "endingDate", "Lny1/f;", "filterType", "Lgg0/f;", "eventType", "Lny1/g;", "participationType", "Lez1/d;", "limitRadius", "", "Lgg0/j;", "eventSource", "", "isDistanceFilterSelected", "Lny1/b;", "eventSearchDistanceUiState", "Lez1/c;", "limitDistance", "limitTime", "completionTargetDurationType", "", "completionTargetMaxValue", "completionTargetMinValue", "Lbg0/a$b;", "selectedUnit", "Lorg/joda/time/LocalDate;", "dateFromTIFlow", "eventTypeFromTIFlow", "hasLocation", "Lfg0/x;", "garminCoachDTO", "Lfg0/u;", "fbtFlowDataDTO", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lny1/f;Lgg0/f;Lny1/g;Lez1/d;Ljava/util/List;ZLny1/b;Lez1/c;Lez1/c;Ljava/lang/String;DDLbg0/a$b;Lorg/joda/time/LocalDate;Lgg0/f;Ljava/lang/Boolean;Lfg0/x;Lfg0/u;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f121484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ny1.f f121486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gg0.f f121487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ny1.g f121488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ez1.d f121489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<j> f121490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f121491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ny1.b f121492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ez1.c f121493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ez1.c f121494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f121495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final double f121496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final double f121497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg0.a.b f121498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LocalDate f121499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gg0.f f121500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f121501r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f121502t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u f121503v;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ny1.f fVarCreateFromParcel = ny1.f.CREATOR.createFromParcel(parcel);
            gg0.f fVarValueOf = parcel.readInt() == 0 ? null : gg0.f.valueOf(parcel.readString());
            ny1.g gVarValueOf = ny1.g.valueOf(parcel.readString());
            ez1.d dVar = (ez1.d) parcel.readParcelable(d.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(j.valueOf(parcel.readString()));
                }
            }
            boolean z14 = parcel.readInt() != 0;
            ny1.b bVarValueOf = ny1.b.valueOf(parcel.readString());
            ez1.c cVar = (ez1.c) parcel.readParcelable(d.class.getClassLoader());
            ez1.c cVar2 = (ez1.c) parcel.readParcelable(d.class.getClassLoader());
            String string3 = parcel.readString();
            double d14 = parcel.readDouble();
            ArrayList arrayList2 = arrayList;
            double d15 = parcel.readDouble();
            bg0.a.b bVarValueOf2 = bg0.a.b.valueOf(parcel.readString());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            gg0.f fVarValueOf2 = parcel.readInt() == 0 ? null : gg0.f.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new d(string, string2, fVarCreateFromParcel, fVarValueOf, gVarValueOf, dVar, arrayList2, z14, bVarValueOf, cVar, cVar2, string3, d14, d15, bVarValueOf2, localDate, fVarValueOf2, boolValueOf, (x) parcel.readParcelable(d.class.getClassLoader()), (u) parcel.readParcelable(d.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, String str2, ny1.f fVar, gg0.f fVar2, ny1.g gVar, ez1.d dVar, List list, boolean z14, ny1.b bVar, ez1.c cVar, ez1.c cVar2, String str3, double d14, double d15, bg0.a.b bVar2, LocalDate localDate, gg0.f fVar3, Boolean bool, x xVar, u uVar, int i14, p005kotlin.jvm.internal.j jVar) {
        List listA;
        bg0.a.b bVar3;
        String str4 = (i14 & 1) != 0 ? null : str;
        String str5 = (i14 & 2) != 0 ? null : str2;
        ny1.f fVar4 = (i14 & 4) != 0 ? ny1.f.CUSTOM : fVar;
        gg0.f fVar5 = (i14 & 8) != 0 ? gg0.f.f77129e : fVar2;
        ny1.g gVar2 = (i14 & 16) != 0 ? ny1.g.IN_PERSON : gVar;
        ez1.d dVar2 = (i14 & 32) != 0 ? ez1.f.WORLD_WIDE : dVar;
        if ((i14 & 64) != 0) {
            j.f77174c.getClass();
            listA = j.a.a();
        } else {
            listA = list;
        }
        boolean z15 = (i14 & 128) != 0 ? true : z14;
        ny1.b bVar4 = (i14 & 256) != 0 ? ny1.b.RUNNING_DISTANCE : bVar;
        ez1.c cVar3 = (i14 & 512) != 0 ? ez1.g.TYPE_ALL : cVar;
        ez1.c cVar4 = (i14 & 1024) != 0 ? ez1.h.ALL : cVar2;
        String str6 = (i14 & 2048) != 0 ? null : str3;
        double d16 = (i14 & 4096) != 0 ? 0.0d : d14;
        double d17 = (i14 & 8192) == 0 ? d15 : 0.0d;
        if ((i14 & 16384) != 0) {
            bg0.a.f17827a.getClass();
            bVar3 = new eg0.b(bg0.a.C0255a.a()).f63972a;
        } else {
            bVar3 = bVar2;
        }
        this(str4, str5, fVar4, fVar5, gVar2, dVar2, listA, z15, bVar4, cVar3, cVar4, str6, d16, d17, bVar3, (32768 & i14) != 0 ? null : localDate, (i14 & 65536) != 0 ? null : fVar3, (i14 & 131072) != 0 ? null : bool, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : xVar, (i14 & 524288) != 0 ? null : uVar);
    }

    public static d b(d dVar, String str, String str2, ny1.f fVar, gg0.f fVar2, ny1.g gVar, ez1.d dVar2, List list, boolean z14, ny1.b bVar, ez1.c cVar, ez1.c cVar2, double d14, double d15, bg0.a.b bVar2, LocalDate localDate, Boolean bool, int i14) {
        String str3 = (i14 & 1) != 0 ? dVar.f121484a : str;
        String str4 = (i14 & 2) != 0 ? dVar.f121485b : str2;
        ny1.f fVar3 = (i14 & 4) != 0 ? dVar.f121486c : fVar;
        gg0.f fVar4 = (i14 & 8) != 0 ? dVar.f121487d : fVar2;
        ny1.g gVar2 = (i14 & 16) != 0 ? dVar.f121488e : gVar;
        ez1.d dVar3 = (i14 & 32) != 0 ? dVar.f121489f : dVar2;
        List list2 = (i14 & 64) != 0 ? dVar.f121490g : list;
        boolean z15 = (i14 & 128) != 0 ? dVar.f121491h : z14;
        ny1.b bVar3 = (i14 & 256) != 0 ? dVar.f121492i : bVar;
        ez1.c cVar3 = (i14 & 512) != 0 ? dVar.f121493j : cVar;
        ez1.c cVar4 = (i14 & 1024) != 0 ? dVar.f121494k : cVar2;
        String str5 = dVar.f121495l;
        double d16 = (i14 & 4096) != 0 ? dVar.f121496m : d14;
        double d17 = (i14 & 8192) != 0 ? dVar.f121497n : d15;
        bg0.a.b bVar4 = (i14 & 16384) != 0 ? dVar.f121498o : bVar2;
        LocalDate localDate2 = (32768 & i14) != 0 ? dVar.f121499p : localDate;
        gg0.f fVar5 = dVar.f121500q;
        Boolean bool2 = (i14 & 131072) != 0 ? dVar.f121501r : bool;
        x xVar = dVar.f121502t;
        u uVar = dVar.f121503v;
        dVar.getClass();
        fVar3.getClass();
        gVar2.getClass();
        dVar3.getClass();
        bVar3.getClass();
        cVar3.getClass();
        cVar4.getClass();
        bVar4.getClass();
        return new d(str3, str4, fVar3, fVar4, gVar2, dVar3, list2, z15, bVar3, cVar3, cVar4, str5, d16, d17, bVar4, localDate2, fVar5, bool2, xVar, uVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f121484a, dVar.f121484a) && s.g(this.f121485b, dVar.f121485b) && this.f121486c == dVar.f121486c && this.f121487d == dVar.f121487d && this.f121488e == dVar.f121488e && s.g(this.f121489f, dVar.f121489f) && s.g(this.f121490g, dVar.f121490g) && this.f121491h == dVar.f121491h && this.f121492i == dVar.f121492i && s.g(this.f121493j, dVar.f121493j) && s.g(this.f121494k, dVar.f121494k) && s.g(this.f121495l, dVar.f121495l) && Double.compare(this.f121496m, dVar.f121496m) == 0 && Double.compare(this.f121497n, dVar.f121497n) == 0 && this.f121498o == dVar.f121498o && s.g(this.f121499p, dVar.f121499p) && this.f121500q == dVar.f121500q && s.g(this.f121501r, dVar.f121501r) && s.g(this.f121502t, dVar.f121502t) && s.g(this.f121503v, dVar.f121503v);
    }

    public final int hashCode() {
        String str = this.f121484a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f121485b;
        int iHashCode2 = (this.f121486c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        gg0.f fVar = this.f121487d;
        int iHashCode3 = (this.f121489f.hashCode() + ((this.f121488e.hashCode() + ((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31;
        List<j> list = this.f121490g;
        int iHashCode4 = (this.f121494k.hashCode() + ((this.f121493j.hashCode() + ((this.f121492i.hashCode() + q6.f.g((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f121491h)) * 31)) * 31)) * 31;
        String str3 = this.f121495l;
        int iHashCode5 = (this.f121498o.hashCode() + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f121496m), 31, this.f121497n)) * 31;
        LocalDate localDate = this.f121499p;
        int iHashCode6 = (iHashCode5 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        gg0.f fVar2 = this.f121500q;
        int iHashCode7 = (iHashCode6 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        Boolean bool = this.f121501r;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        x xVar = this.f121502t;
        int iHashCode9 = (iHashCode8 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        u uVar = this.f121503v;
        return iHashCode9 + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FilterDTO(beginningDate=", this.f121484a, ", endingDate=", this.f121485b, ", filterType=");
        sbI.append(this.f121486c);
        sbI.append(", eventType=");
        sbI.append(this.f121487d);
        sbI.append(", participationType=");
        sbI.append(this.f121488e);
        sbI.append(", limitRadius=");
        sbI.append(this.f121489f);
        sbI.append(", eventSource=");
        sbI.append(this.f121490g);
        sbI.append(", isDistanceFilterSelected=");
        sbI.append(this.f121491h);
        sbI.append(", eventSearchDistanceUiState=");
        sbI.append(this.f121492i);
        sbI.append(", limitDistance=");
        sbI.append(this.f121493j);
        sbI.append(", limitTime=");
        sbI.append(this.f121494k);
        sbI.append(", completionTargetDurationType=");
        sbI.append(this.f121495l);
        sbI.append(", completionTargetMaxValue=");
        sbI.append(this.f121496m);
        am.j.x(sbI, ", completionTargetMinValue=", this.f121497n, ", selectedUnit=");
        sbI.append(this.f121498o);
        sbI.append(", dateFromTIFlow=");
        sbI.append(this.f121499p);
        sbI.append(", eventTypeFromTIFlow=");
        sbI.append(this.f121500q);
        sbI.append(", hasLocation=");
        sbI.append(this.f121501r);
        sbI.append(", garminCoachDTO=");
        sbI.append(this.f121502t);
        sbI.append(", fbtFlowDataDTO=");
        sbI.append(this.f121503v);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f121484a);
        parcel.writeString(this.f121485b);
        this.f121486c.writeToParcel(parcel, i14);
        gg0.f fVar = this.f121487d;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar.name());
        }
        parcel.writeString(this.f121488e.name());
        parcel.writeParcelable(this.f121489f, i14);
        List<j> list = this.f121490g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeString(((j) itO.next()).name());
            }
        }
        parcel.writeInt(this.f121491h ? 1 : 0);
        parcel.writeString(this.f121492i.name());
        parcel.writeParcelable(this.f121493j, i14);
        parcel.writeParcelable(this.f121494k, i14);
        parcel.writeString(this.f121495l);
        parcel.writeDouble(this.f121496m);
        parcel.writeDouble(this.f121497n);
        parcel.writeString(this.f121498o.name());
        parcel.writeSerializable(this.f121499p);
        gg0.f fVar2 = this.f121500q;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar2.name());
        }
        Boolean bool = this.f121501r;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f121502t, i14);
        parcel.writeParcelable(this.f121503v, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, String str2, ny1.f fVar, gg0.f fVar2, ny1.g gVar, ez1.d dVar, List<? extends j> list, boolean z14, ny1.b bVar, ez1.c cVar, ez1.c cVar2, String str3, double d14, double d15, bg0.a.b bVar2, LocalDate localDate, gg0.f fVar3, Boolean bool, x xVar, u uVar) {
        fVar.getClass();
        gVar.getClass();
        dVar.getClass();
        bVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        bVar2.getClass();
        this.f121484a = str;
        this.f121485b = str2;
        this.f121486c = fVar;
        this.f121487d = fVar2;
        this.f121488e = gVar;
        this.f121489f = dVar;
        this.f121490g = list;
        this.f121491h = z14;
        this.f121492i = bVar;
        this.f121493j = cVar;
        this.f121494k = cVar2;
        this.f121495l = str3;
        this.f121496m = d14;
        this.f121497n = d15;
        this.f121498o = bVar2;
        this.f121499p = localDate;
        this.f121500q = fVar3;
        this.f121501r = bool;
        this.f121502t = xVar;
        this.f121503v = uVar;
    }

    public d() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, 0.0d, 0.0d, null, null, null, null, null, null, 1048575, null);
    }
}
