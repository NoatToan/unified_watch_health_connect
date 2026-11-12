package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lg81/y;", "Landroid/os/Parcelable;", "", "avgScore", "maxScore", "Li53/d;", "Lorg/joda/time/LocalDate;", "Lg81/o;", "contributors", "Lg81/w;", "contributorChartState", "Li53/c;", "Lg81/x;", "contributorListState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li53/d;Lg81/w;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.d<LocalDate, o> f76422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f76423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<x> f76424e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iA = 0;
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readSerializable(), o.CREATOR.createFromParcel(parcel));
            }
            i53.g gVarK = i53.a.k(linkedHashMap);
            w wVarCreateFromParcel = parcel.readInt() == 0 ? null : w.CREATOR.createFromParcel(parcel);
            int i16 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i16);
            while (iA != i16) {
                iA = kg.f.a(x.CREATOR, parcel, arrayList, iA, 1);
            }
            return new y(string, string2, gVarK, wVarCreateFromParcel, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i14) {
            return new y[i14];
        }
    }

    public y(String str, String str2, i53.d<LocalDate, o> dVar, w wVar, i53.c<x> cVar) {
        str.getClass();
        str2.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f76420a = str;
        this.f76421b = str2;
        this.f76422c = dVar;
        this.f76423d = wVar;
        this.f76424e = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f76420a, yVar.f76420a) && p005kotlin.jvm.internal.s.g(this.f76421b, yVar.f76421b) && p005kotlin.jvm.internal.s.g(this.f76422c, yVar.f76422c) && p005kotlin.jvm.internal.s.g(this.f76423d, yVar.f76423d) && p005kotlin.jvm.internal.s.g(this.f76424e, yVar.f76424e);
    }

    public final int hashCode() {
        int iB = l2.b(this.f76422c, wr.g.j(this.f76420a.hashCode() * 31, 31, this.f76421b), 31);
        w wVar = this.f76423d;
        return this.f76424e.hashCode() + ((iB + (wVar == null ? 0 : wVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EnduranceScoreTopContributorsUiState(avgScore=", this.f76420a, ", maxScore=", this.f76421b, ", contributors=");
        sbI.append(this.f76422c);
        sbI.append(", contributorChartState=");
        sbI.append(this.f76423d);
        sbI.append(", contributorListState=");
        return l2.e(sbI, this.f76424e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76420a);
        parcel.writeString(this.f76421b);
        i53.d<LocalDate, o> dVar = this.f76422c;
        parcel.writeInt(dVar.size());
        for (Map.Entry entry : (i53.e) dVar.entrySet()) {
            parcel.writeSerializable((Serializable) entry.getKey());
            ((o) entry.getValue()).writeToParcel(parcel, i14);
        }
        w wVar = this.f76423d;
        if (wVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wVar.writeToParcel(parcel, i14);
        }
        Iterator itG = j20.x.g(this.f76424e, parcel);
        while (itG.hasNext()) {
            ((x) itG.next()).writeToParcel(parcel, i14);
        }
    }

    public y(String str, String str2, i53.d dVar, w wVar, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, dVar, wVar, (i14 & 16) != 0 ? j53.l.b() : cVar);
    }
}
