package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\n\bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgs1/j;", "Landroid/os/Parcelable;", "Lgs1/j$c;", "payload", "<init>", "(Lgs1/j$c;)V", "a", "Lgs1/j$c;", "b", "()Lgs1/j$c;", "c", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final c payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getPayload() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && p005kotlin.jvm.internal.s.g(this.payload, ((j) obj).payload);
    }

    public final int hashCode() {
        c cVar = this.payload;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "DailyMovementDTO(payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        c cVar = this.payload;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
    }

    public j(c cVar) {
        this.payload = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgs1/j$b;", "", "Lorg/joda/time/DateTime;", "dateTime", "", "movement", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Double;)V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f78778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f78779b;

        public /* synthetic */ b(DateTime dateTime, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : d14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f78778a, bVar.f78778a) && p005kotlin.jvm.internal.s.g(this.f78779b, bVar.f78779b);
        }

        public final int hashCode() {
            DateTime dateTime = this.f78778a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            Double d14 = this.f78779b;
            return iHashCode + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            return "MovementValue(dateTime=" + this.f78778a + ", movement=" + this.f78779b + ")";
        }

        public b(DateTime dateTime, Double d14) {
            this.f78778a = dateTime;
            this.f78779b = d14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR$\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgs1/j$c;", "Landroid/os/Parcelable;", "", "startTimestampGMT", "endTimestampGMT", "", "", "movementValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getStartTimestampGMT", "()Ljava/lang/String;", "b", "getEndTimestampGMT", "c", "Ljava/util/List;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("startTimestampGMT")
        private final String startTimestampGMT;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("endTimestampGMT")
        private final String endTimestampGMT;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("movementValues")
        private final List<List<Double>> movementValues;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f78783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DateTime f78784e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList arrayList = null;
                if (parcel.readInt() != 0) {
                    int i14 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        int i16 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i16);
                        for (int i17 = 0; i17 != i16; i17++) {
                            arrayList3.add(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                        }
                        arrayList2.add(arrayList3);
                    }
                    arrayList = arrayList2;
                }
                return new c(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public /* synthetic */ c(String str, String str2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : list);
        }

        public static c b(c cVar, ArrayList arrayList) {
            return new c(cVar.startTimestampGMT, cVar.endTimestampGMT, arrayList);
        }

        public final List<b> d() {
            if (this.f78783d == null) {
                List<List<Double>> list = this.movementValues;
                ArrayList arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = (List) it.next();
                        j0 j0Var = j0.f23099a;
                        Double d14 = (Double) list2.get(0);
                        Long lValueOf = d14 != null ? Long.valueOf((long) d14.doubleValue()) : null;
                        j0Var.getClass();
                        arrayList2.add(new b(j0.B(lValueOf), (Double) list2.get(1)));
                    }
                    arrayList = arrayList2;
                }
                this.f78783d = arrayList;
            }
            return this.f78783d;
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
            return p005kotlin.jvm.internal.s.g(this.startTimestampGMT, cVar.startTimestampGMT) && p005kotlin.jvm.internal.s.g(this.endTimestampGMT, cVar.endTimestampGMT) && p005kotlin.jvm.internal.s.g(this.movementValues, cVar.movementValues);
        }

        public final DateTime f() {
            if (this.f78784e == null) {
                this.f78784e = j0.N(this.startTimestampGMT, true);
            }
            return this.f78784e;
        }

        public final int hashCode() {
            String str = this.startTimestampGMT;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.endTimestampGMT;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<List<Double>> list = this.movementValues;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            String str = this.startTimestampGMT;
            String str2 = this.endTimestampGMT;
            return u62.z.c(p6.b.i("Payload(startTimestampGMT=", str, ", endTimestampGMT=", str2, ", movementValues="), this.movementValues, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.startTimestampGMT);
            parcel.writeString(this.endTimestampGMT);
            List<List<Double>> list = this.movementValues;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                Iterator itE = kg.f.e((List) itO.next(), parcel);
                while (itE.hasNext()) {
                    Double d14 = (Double) itE.next();
                    if (d14 == null) {
                        parcel.writeInt(0);
                    } else {
                        sn.a.m(parcel, 1, d14);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, List<? extends List<Double>> list) {
            this.startTimestampGMT = str;
            this.endTimestampGMT = str2;
            this.movementValues = list;
        }

        public c() {
            this(null, null, null, 7, null);
        }
    }
}
