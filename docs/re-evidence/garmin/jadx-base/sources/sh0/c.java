package sh0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import d53.s;
import ds.e0;
import i63.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sd.o;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB[\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0014"}, d2 = {"Lsh0/c;", "Landroid/os/Parcelable;", "", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "", "floorValuesArray", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "d", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<List<String>> f159286e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C3016c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f159281f = {null, null, null, null, m.a(n.PUBLICATION, new o(9))};

    /* JADX INFO: renamed from: sh0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3016c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(parcel.createStringArrayList());
                }
            }
            return new c(string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, String str, String str2, String str3, String str4, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f159282a = null;
        } else {
            this.f159282a = str;
        }
        if ((i14 & 2) == 0) {
            this.f159283b = null;
        } else {
            this.f159283b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f159284c = null;
        } else {
            this.f159284c = str3;
        }
        if ((i14 & 8) == 0) {
            this.f159285d = null;
        } else {
            this.f159285d = str4;
        }
        if ((i14 & 16) == 0) {
            this.f159286e = null;
        } else {
            this.f159286e = list;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        List<List<String>> list = this.f159286e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                if (list2.get(0) != null && list2.get(1) != null && list2.get(2) != null && list2.get(3) != null) {
                    DateTime dateTimeN = j0.N((String) list2.get(0), true);
                    if (dateTimeN == null) {
                        dateTimeN = DateTime.now();
                    }
                    dateTimeN.getClass();
                    DateTime dateTimeN2 = j0.N((String) list2.get(1), true);
                    if (dateTimeN2 == null) {
                        dateTimeN2 = DateTime.now();
                    }
                    dateTimeN2.getClass();
                    String str = (String) list2.get(2);
                    Double dF = str != null ? s.f(str) : null;
                    String str2 = (String) list2.get(3);
                    arrayList.add(new d(dateTimeN, dateTimeN2, dF, str2 != null ? s.f(str2) : null));
                }
            }
        }
        return arrayList;
    }

    public final List<d> d() {
        if (b().isEmpty()) {
            return p13.j0.f134944a;
        }
        ArrayList<d> arrayListB = b();
        ArrayList arrayList = new ArrayList();
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = 0.0d;
        for (d dVar : arrayListB) {
            Double d14 = dVar.f159290c;
            dDoubleValue += d14 != null ? d14.doubleValue() : 0.0d;
            Double d15 = dVar.f159291d;
            dDoubleValue2 += d15 != null ? d15.doubleValue() : 0.0d;
            arrayList.add(new d(dVar.f159288a, dVar.f159289b, Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2)));
        }
        return arrayList;
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
        return p005kotlin.jvm.internal.s.g(this.f159282a, cVar.f159282a) && p005kotlin.jvm.internal.s.g(this.f159283b, cVar.f159283b) && p005kotlin.jvm.internal.s.g(this.f159284c, cVar.f159284c) && p005kotlin.jvm.internal.s.g(this.f159285d, cVar.f159285d) && p005kotlin.jvm.internal.s.g(this.f159286e, cVar.f159286e);
    }

    public final int hashCode() {
        String str = this.f159282a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f159283b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f159284c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f159285d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<List<String>> list = this.f159286e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FloorsChartDataDTO(startTimestampGMT=", this.f159282a, ", endTimestampGMT=", this.f159283b, ", startTimestampLocal=");
        sn.a.t(sbI, this.f159284c, ", endTimestampLocal=", this.f159285d, ", floorValuesArray=");
        return z.c(sbI, this.f159286e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159282a);
        parcel.writeString(this.f159283b);
        parcel.writeString(this.f159284c);
        parcel.writeString(this.f159285d);
        List<List<String>> list = this.f159286e;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeStringList((List) itO.next());
        }
    }

    /* JADX INFO: renamed from: sh0.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsh0/c$b;", "", "<init>", "()V", "Li63/c;", "Lsh0/c;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f159287a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsh0/c$d;", "", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "", "ascended", "descended", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f159288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f159289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f159290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f159291d;

        public d(DateTime dateTime, DateTime dateTime2, Double d14, Double d15) {
            dateTime.getClass();
            dateTime2.getClass();
            this.f159288a = dateTime;
            this.f159289b = dateTime2;
            this.f159290c = d14;
            this.f159291d = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f159288a, dVar.f159288a) && p005kotlin.jvm.internal.s.g(this.f159289b, dVar.f159289b) && p005kotlin.jvm.internal.s.g(this.f159290c, dVar.f159290c) && p005kotlin.jvm.internal.s.g(this.f159291d, dVar.f159291d);
        }

        public final int hashCode() {
            int iA = e0.a(this.f159288a.hashCode() * 31, this.f159289b, 31);
            Double d14 = this.f159290c;
            int iHashCode = (iA + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f159291d;
            return iHashCode + (d15 != null ? d15.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FloorValue(startDateTime=");
            sb3.append(this.f159288a);
            sb3.append(", endDateTime=");
            sb3.append(this.f159289b);
            sb3.append(", ascended=");
            return sn.a.f(this.f159290c, this.f159291d, ", descended=", ")", sb3);
        }

        public /* synthetic */ d(DateTime dateTime, DateTime dateTime2, Double d14, Double d15, int i14, j jVar) {
            this(dateTime, dateTime2, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15);
        }
    }

    public c() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, String str2, String str3, String str4, List<? extends List<String>> list) {
        this.f159282a = str;
        this.f159283b = str2;
        this.f159284c = str3;
        this.f159285d = str4;
        this.f159286e = list;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : list);
    }
}
