package ol1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lol1/c;", "Landroid/os/Parcelable;", "", "logoUrl", "title", "", "distance", "eventType", "date", "time", FirebaseAnalytics.Param.LOCATION, "", "courseId", "courseName", "websiteUrl", "notes", "", "shareable", "isSubscribed", "isOrganizer", "isPastEvent", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoints", "Lcom/garmin/android/library/mapsdkadapter/i$b;", "courseGeodeticSystem", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "paceBandSummaryDTO", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/garmin/android/library/mapsdkadapter/i$b;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f132838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f132839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f132840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f132841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f132842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f132843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f132844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f132845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f132846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f132847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f132848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f132849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Boolean f132850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<GeoPointDTO> f132851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.b f132852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f132853r;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Double dValueOf;
            Long l14;
            Object objValueOf;
            Object objValueOf2;
            Object objValueOf3;
            Object objValueOf4;
            String str;
            ArrayList arrayList;
            Double d14;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                dValueOf = null;
                l14 = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
                l14 = null;
            }
            String string3 = parcel.readString();
            Long l15 = l14;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong());
            String string7 = parcel.readString();
            Long l16 = lValueOf;
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = l15;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf2 = l15;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf3 = l15;
            } else {
                objValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf4 = l15;
            } else {
                objValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            int iD = 0;
            while (true) {
                str = string2;
                if (iD == i14) {
                    break;
                }
                iD = u0.d(c.class, parcel, arrayList2, iD, 1);
                string2 = str;
            }
            com.garmin.android.library.mapsdkadapter.i.b bVarValueOf = com.garmin.android.library.mapsdkadapter.i.b.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList = new ArrayList(i15);
                int iD2 = 0;
                while (true) {
                    d14 = dValueOf;
                    if (iD2 == i15) {
                        break;
                    }
                    iD2 = u0.d(c.class, parcel, arrayList, iD2, 1);
                    dValueOf = d14;
                }
            } else {
                arrayList = null;
                d14 = dValueOf;
            }
            return new c(string, str, d14, string3, string4, string5, string6, l16, string7, string8, string9, objValueOf, objValueOf2, objValueOf3, objValueOf4, arrayList2, bVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, String str2, Double d14, String str3, String str4, String str5, String str6, Long l14, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<GeoPointDTO> list, com.garmin.android.library.mapsdkadapter.i.b bVar, List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list2) {
        list.getClass();
        bVar.getClass();
        this.f132836a = str;
        this.f132837b = str2;
        this.f132838c = d14;
        this.f132839d = str3;
        this.f132840e = str4;
        this.f132841f = str5;
        this.f132842g = str6;
        this.f132843h = l14;
        this.f132844i = str7;
        this.f132845j = str8;
        this.f132846k = str9;
        this.f132847l = bool;
        this.f132848m = bool2;
        this.f132849n = bool3;
        this.f132850o = bool4;
        this.f132851p = list;
        this.f132852q = bVar;
        this.f132853r = list2;
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
        return s.g(this.f132836a, cVar.f132836a) && s.g(this.f132837b, cVar.f132837b) && s.g(this.f132838c, cVar.f132838c) && s.g(this.f132839d, cVar.f132839d) && s.g(this.f132840e, cVar.f132840e) && s.g(this.f132841f, cVar.f132841f) && s.g(this.f132842g, cVar.f132842g) && s.g(this.f132843h, cVar.f132843h) && s.g(this.f132844i, cVar.f132844i) && s.g(this.f132845j, cVar.f132845j) && s.g(this.f132846k, cVar.f132846k) && s.g(this.f132847l, cVar.f132847l) && s.g(this.f132848m, cVar.f132848m) && s.g(this.f132849n, cVar.f132849n) && s.g(this.f132850o, cVar.f132850o) && this.f132851p.equals(cVar.f132851p) && this.f132852q == cVar.f132852q && s.g(this.f132853r, cVar.f132853r);
    }

    public final int hashCode() {
        String str = this.f132836a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f132837b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.f132838c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str3 = this.f132839d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132840e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132841f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132842g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l14 = this.f132843h;
        int iHashCode8 = (iHashCode7 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str7 = this.f132844i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132845j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f132846k;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.f132847l;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132848m;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132849n;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f132850o;
        int iHashCode15 = (this.f132852q.hashCode() + u0.b((iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.f132851p)) * 31;
        List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list = this.f132853r;
        return iHashCode15 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ShareableEventUIModel(logoUrl=", this.f132836a, ", title=", this.f132837b, ", distance=");
        b71.i.u(sbI, this.f132838c, ", eventType=", this.f132839d, ", date=");
        sn.a.t(sbI, this.f132840e, ", time=", this.f132841f, ", location=");
        n23.j.q(this.f132843h, this.f132842g, ", courseId=", ", courseName=", sbI);
        sn.a.t(sbI, this.f132844i, ", websiteUrl=", this.f132845j, ", notes=");
        b71.i.w(sbI, this.f132846k, ", shareable=", this.f132847l, ", isSubscribed=");
        b71.i.o(this.f132848m, this.f132849n, ", isOrganizer=", ", isPastEvent=", sbI);
        sbI.append(this.f132850o);
        sbI.append(", geoPoints=");
        sbI.append(this.f132851p);
        sbI.append(", courseGeodeticSystem=");
        sbI.append(this.f132852q);
        sbI.append(", paceBandSummaryDTO=");
        sbI.append(this.f132853r);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f132836a);
        parcel.writeString(this.f132837b);
        Double d14 = this.f132838c;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.f132839d);
        parcel.writeString(this.f132840e);
        parcel.writeString(this.f132841f);
        parcel.writeString(this.f132842g);
        Long l14 = this.f132843h;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f132844i);
        parcel.writeString(this.f132845j);
        parcel.writeString(this.f132846k);
        Boolean bool = this.f132847l;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f132848m;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.f132849n;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.f132850o;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool4);
        }
        Iterator itE = kg.f.e(this.f132851p, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
        parcel.writeString(this.f132852q.name());
        List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list = this.f132853r;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }
}
