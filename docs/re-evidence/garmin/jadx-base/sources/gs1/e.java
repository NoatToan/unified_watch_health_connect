package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0004\n\u000b\u0006\fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lgs1/e;", "Landroid/os/Parcelable;", "Lgs1/e$c;", "payload", "<init>", "(Lgs1/e$c;)V", "a", "Lgs1/e$c;", "b", "()Lgs1/e$c;", "c", JWKParameterNames.RSA_EXPONENT, "d", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final c payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lgs1/e$d;", "", "", "name", "<init>", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "f", "a", "b", "g", "d", "c", "Lgs1/e$d$a;", "Lgs1/e$d$b;", "Lgs1/e$d$d;", "Lgs1/e$d$e;", "Lgs1/e$d$f;", "Lgs1/e$d$g;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f78738b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78739a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/e$d$a;", "Lgs1/e$d;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f78740c = new a();

            private a() {
                super("ADJUSTED", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 831258738;
            }

            public final String toString() {
                return "Adjusted";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/e$d$b;", "Lgs1/e$d;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f78741c = new b();

            private b() {
                super("ADJUSTED_MODELED", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 664040630;
            }

            public final String toString() {
                return "AdjustedModeled";
            }
        }

        /* JADX INFO: renamed from: gs1.e$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/e$d$d;", "Lgs1/e$d;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1586d extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1586d f78742c = new C1586d();

            private C1586d() {
                super("INVALID", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1586d);
            }

            public final int hashCode() {
                return -1997603469;
            }

            public final String toString() {
                return "Invalid";
            }
        }

        /* JADX INFO: renamed from: gs1.e$d$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/e$d$e;", "Lgs1/e$d;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1587e extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1587e f78743c = new C1587e();

            private C1587e() {
                super("MEASURED", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1587e);
            }

            public final int hashCode() {
                return 898198218;
            }

            public final String toString() {
                return "Measured";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/e$d$f;", "Lgs1/e$d;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f78744c = new f();

            private f() {
                super("MODELED", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1564536068;
            }

            public final String toString() {
                return "Modeled";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/e$d$g;", "Lgs1/e$d;", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f78745c = new g();

            private g() {
                super("RESET", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 345626571;
            }

            public final String toString() {
                return "Reset";
            }
        }

        private d(String str) {
            this.f78739a = str;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/e$d$c;", "", "<init>", "()V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c {
            public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static d a(String str) {
                C1587e c1587e = C1587e.f78743c;
                if (p005kotlin.jvm.internal.s.g(str, c1587e.f78739a)) {
                    return c1587e;
                }
                f fVar = f.f78744c;
                if (p005kotlin.jvm.internal.s.g(str, fVar.f78739a)) {
                    return fVar;
                }
                a aVar = a.f78740c;
                if (p005kotlin.jvm.internal.s.g(str, aVar.f78739a)) {
                    return aVar;
                }
                b bVar = b.f78741c;
                if (p005kotlin.jvm.internal.s.g(str, bVar.f78739a)) {
                    return bVar;
                }
                g gVar = g.f78745c;
                return p005kotlin.jvm.internal.s.g(str, gVar.f78739a) ? gVar : C1586d.f78742c;
            }

            private c() {
            }
        }

        public /* synthetic */ d(String str, p005kotlin.jvm.internal.j jVar) {
            this(str);
        }
    }

    public e(c cVar) {
        this.payload = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: gs1.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgs1/e$e;", "", "Lorg/joda/time/DateTime;", "dateTime", "", "level", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/Integer;)V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1588e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f78746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f78747b;

        public /* synthetic */ C1588e(DateTime dateTime, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1588e)) {
                return false;
            }
            C1588e c1588e = (C1588e) obj;
            return p005kotlin.jvm.internal.s.g(this.f78746a, c1588e.f78746a) && p005kotlin.jvm.internal.s.g(this.f78747b, c1588e.f78747b);
        }

        public final int hashCode() {
            DateTime dateTime = this.f78746a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            Integer num = this.f78747b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "StressValue(dateTime=" + this.f78746a + ", level=" + this.f78747b + ")";
        }

        public C1588e(DateTime dateTime, Integer num) {
            this.f78746a = dateTime;
            this.f78747b = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1588e() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgs1/e$a;", "", "Lorg/joda/time/DateTime;", "dateTime", "Lgs1/e$d;", "status", "", "level", "", "version", "<init>", "(Lorg/joda/time/DateTime;Lgs1/e$d;Ljava/lang/Integer;Ljava/lang/Double;)V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f78729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f78730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f78731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f78732d;

        public /* synthetic */ a(DateTime dateTime, d dVar, Integer num, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : d14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f78729a, aVar.f78729a) && p005kotlin.jvm.internal.s.g(this.f78730b, aVar.f78730b) && p005kotlin.jvm.internal.s.g(this.f78731c, aVar.f78731c) && p005kotlin.jvm.internal.s.g(this.f78732d, aVar.f78732d);
        }

        public final int hashCode() {
            DateTime dateTime = this.f78729a;
            int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
            d dVar = this.f78730b;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Integer num = this.f78731c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Double d14 = this.f78732d;
            return iHashCode3 + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            return "BodyBatteryValue(dateTime=" + this.f78729a + ", status=" + this.f78730b + ", level=" + this.f78731c + ", version=" + this.f78732d + ")";
        }

        public a(DateTime dateTime, d dVar, Integer num, Double d14) {
            this.f78729a = dateTime;
            this.f78730b = dVar;
            this.f78731c = num;
            this.f78732d = d14;
        }

        public a() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R$\u0010\b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R$\u0010\n\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lgs1/e$c;", "Landroid/os/Parcelable;", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "", "", "stressValues", "", "bodyBatteryValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "getStartTimestampGMT", "c", "getEndTimestampGMT", "Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("calendarDate")
        private final String calendarDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("startTimestampGMT")
        private final String startTimestampGMT;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("endTimestampGMT")
        private final String endTimestampGMT;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("stressValuesArray")
        private final List<List<Long>> stressValues;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("bodyBatteryValuesArray")
        private final List<List<Object>> bodyBatteryValues;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i14 = parcel.readInt();
                    arrayList = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        int i16 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i16);
                        for (int i17 = 0; i17 != i16; i17++) {
                            arrayList3.add(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                        }
                        arrayList.add(arrayList3);
                    }
                }
                if (parcel.readInt() != 0) {
                    int i18 = parcel.readInt();
                    arrayList2 = new ArrayList(i18);
                    for (int i19 = 0; i19 != i18; i19++) {
                        int i24 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i24);
                        for (int i25 = 0; i25 != i24; i25++) {
                            arrayList4.add(parcel.readValue(c.class.getClassLoader()));
                        }
                        arrayList2.add(arrayList4);
                    }
                }
                return new c(string, string2, string3, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public /* synthetic */ c(String str, String str2, String str3, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : list2);
        }

        public final ArrayList b() {
            ArrayList arrayList = new ArrayList();
            List<List<Object>> list = this.bodyBatteryValues;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    if (list2.get(0) != null && list2.get(2) != null) {
                        j0 j0Var = j0.f23099a;
                        Object obj = list2.get(0);
                        Double d14 = obj instanceof Double ? (Double) obj : null;
                        Long lValueOf = d14 != null ? Long.valueOf((long) d14.doubleValue()) : null;
                        j0Var.getClass();
                        DateTime dateTimeB = j0.B(lValueOf);
                        d.c cVar = d.f78738b;
                        Object obj2 = list2.get(1);
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        cVar.getClass();
                        d dVarA = d.c.a(str);
                        Object obj3 = list2.get(2);
                        Double d15 = obj3 instanceof Double ? (Double) obj3 : null;
                        Integer numValueOf = d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null;
                        Object objE0 = h0.e0(3, list2);
                        arrayList.add(new a(dateTimeB, dVarA, numValueOf, objE0 instanceof Double ? (Double) objE0 : null));
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCalendarDate() {
            return this.calendarDate;
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
            return p005kotlin.jvm.internal.s.g(this.calendarDate, cVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.startTimestampGMT, cVar.startTimestampGMT) && p005kotlin.jvm.internal.s.g(this.endTimestampGMT, cVar.endTimestampGMT) && p005kotlin.jvm.internal.s.g(this.stressValues, cVar.stressValues) && p005kotlin.jvm.internal.s.g(this.bodyBatteryValues, cVar.bodyBatteryValues);
        }

        public final DateTime f() {
            return j0.N(this.startTimestampGMT, true);
        }

        public final ArrayList g() {
            C1588e c1588e;
            List<List<Long>> list = this.stressValues;
            if (list == null || !(!list.isEmpty())) {
                return null;
            }
            List<List<Long>> list2 = this.stressValues;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                List list3 = (List) it.next();
                if (list3.get(0) == null || list3.get(1) == null) {
                    c1588e = null;
                } else {
                    j0 j0Var = j0.f23099a;
                    Long l14 = (Long) list3.get(0);
                    j0Var.getClass();
                    DateTime dateTimeB = j0.B(l14);
                    Long l15 = (Long) list3.get(1);
                    c1588e = new C1588e(dateTimeB, l15 != null ? Integer.valueOf((int) l15.longValue()) : null);
                }
                if (c1588e != null) {
                    arrayList.add(c1588e);
                }
            }
            return arrayList;
        }

        public final int hashCode() {
            String str = this.calendarDate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.startTimestampGMT;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.endTimestampGMT;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<List<Long>> list = this.stressValues;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List<List<Object>> list2 = this.bodyBatteryValues;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.calendarDate;
            String str2 = this.startTimestampGMT;
            String str3 = this.endTimestampGMT;
            List<List<Long>> list = this.stressValues;
            List<List<Object>> list2 = this.bodyBatteryValues;
            StringBuilder sbI = p6.b.i("Payload(calendarDate=", str, ", startTimestampGMT=", str2, ", endTimestampGMT=");
            e0.o(str3, ", stressValues=", ", bodyBatteryValues=", sbI, list);
            return u62.z.c(sbI, list2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.calendarDate);
            parcel.writeString(this.startTimestampGMT);
            parcel.writeString(this.endTimestampGMT);
            List<List<Long>> list = this.stressValues;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itO = u0.o(parcel, list, 1);
                while (itO.hasNext()) {
                    Iterator itE = kg.f.e((List) itO.next(), parcel);
                    while (itE.hasNext()) {
                        Long l14 = (Long) itE.next();
                        if (l14 == null) {
                            parcel.writeInt(0);
                        } else {
                            sn.a.n(parcel, 1, l14);
                        }
                    }
                }
            }
            List<List<Object>> list2 = this.bodyBatteryValues;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                Iterator itE2 = kg.f.e((List) itO2.next(), parcel);
                while (itE2.hasNext()) {
                    parcel.writeValue(itE2.next());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, String str3, List<? extends List<Long>> list, List<? extends List<? extends Object>> list2) {
            this.calendarDate = str;
            this.startTimestampGMT = str2;
            this.endTimestampGMT = str3;
            this.stressValues = list;
            this.bodyBatteryValues = list2;
        }

        public c() {
            this(null, null, null, null, null, 31, null);
        }
    }
}
