package yr0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0019\u0013Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001d\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001d\u0012\u0004\b(\u0010\u0018\u001a\u0004\b'\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001d\u0012\u0004\b+\u0010\u0018\u001a\u0004\b*\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001d\u0012\u0004\b-\u0010\u0018\u001a\u0004\b,\u0010\u001f¨\u0006/"}, d2 = {"Lyr0/j;", "Landroid/os/Parcelable;", "", "flightId", "tripId", "", "originLocation", "originTimezone", "originTimestamp", "destinationLocation", "destinationTimezone", "destinationTimestamp", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "getFlightId$annotations", "()V", "b", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getTripId$annotations", "c", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "getOriginLocation$annotations", "d", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getOriginTimezone$annotations", JWKParameterNames.RSA_EXPONENT, "getOriginTimestamp", "getOriginTimestamp$annotations", "f", "getDestinationLocation$annotations", "g", "h", "getDestinationTimezone$annotations", "getDestinationTimestamp", "getDestinationTimestamp$annotations", "Companion", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class j implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flightId")
    private final Long flightId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripId")
    private final Long tripId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originLocation")
    private final String originLocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originTimezone")
    private final String originTimezone;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originTimestamp")
    private final String originTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("destinationLocation")
    private final String destinationLocation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("destinationTimezone")
    private final String destinationTimezone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("destinationTimestamp")
    private final String destinationTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<j> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/jet_lag/data/model/JetLagFlightDTO.$serializer", "Lm63/e0;", "Lyr0/j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199011a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199011a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.jet_lag.data.model.JetLagFlightDTO", aVar, 8);
            m1Var.j("flightId", true);
            m1Var.j("tripId", true);
            m1Var.j("originLocation", true);
            m1Var.j("originTimezone", true);
            m1Var.j("originTimestamp", true);
            m1Var.j("destinationLocation", true);
            m1Var.j("destinationTimezone", true);
            m1Var.j("destinationTimestamp", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            i63.c<?> cVarD2 = j63.a.d(v0Var);
            y1 y1Var = y1.f117048a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            int i15 = 0;
            Long l14 = null;
            Long l15 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                        i15 |= 1;
                        break;
                    case 1:
                        l15 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l15);
                        i15 |= 2;
                        break;
                    case 2:
                        str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                        i15 |= 4;
                        break;
                    case 3:
                        str2 = (String) cVarC.v(eVar2, 3, y1.f117048a, str2);
                        i15 |= 8;
                        break;
                    case 4:
                        str3 = (String) cVarC.v(eVar2, 4, y1.f117048a, str3);
                        i15 |= 16;
                        break;
                    case 5:
                        str4 = (String) cVarC.v(eVar2, 5, y1.f117048a, str4);
                        i15 |= 32;
                        break;
                    case 6:
                        str5 = (String) cVarC.v(eVar2, 6, y1.f117048a, str5);
                        i15 |= 64;
                        break;
                    case 7:
                        str6 = (String) cVarC.v(eVar2, 7, y1.f117048a, str6);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new j(i15, l14, l15, str, str2, str3, str4, str5, str6, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            j.s(jVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(int i14, Long l14, Long l15, String str, String str2, String str3, String str4, String str5, String str6, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.flightId = null;
        } else {
            this.flightId = l14;
        }
        if ((i14 & 2) == 0) {
            this.tripId = null;
        } else {
            this.tripId = l15;
        }
        if ((i14 & 4) == 0) {
            this.originLocation = null;
        } else {
            this.originLocation = str;
        }
        if ((i14 & 8) == 0) {
            this.originTimezone = null;
        } else {
            this.originTimezone = str2;
        }
        if ((i14 & 16) == 0) {
            this.originTimestamp = null;
        } else {
            this.originTimestamp = str3;
        }
        if ((i14 & 32) == 0) {
            this.destinationLocation = null;
        } else {
            this.destinationLocation = str4;
        }
        if ((i14 & 64) == 0) {
            this.destinationTimezone = null;
        } else {
            this.destinationTimezone = str5;
        }
        if ((i14 & 128) == 0) {
            this.destinationTimestamp = null;
        } else {
            this.destinationTimestamp = str6;
        }
    }

    public static final /* synthetic */ void s(j jVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || jVar.flightId != null) {
            dVar.d(eVar, 0, v0.f117027a, jVar.flightId);
        }
        if (dVar.C(eVar) || jVar.tripId != null) {
            dVar.d(eVar, 1, v0.f117027a, jVar.tripId);
        }
        if (dVar.C(eVar) || jVar.originLocation != null) {
            dVar.d(eVar, 2, y1.f117048a, jVar.originLocation);
        }
        if (dVar.C(eVar) || jVar.originTimezone != null) {
            dVar.d(eVar, 3, y1.f117048a, jVar.originTimezone);
        }
        if (dVar.C(eVar) || jVar.originTimestamp != null) {
            dVar.d(eVar, 4, y1.f117048a, jVar.originTimestamp);
        }
        if (dVar.C(eVar) || jVar.destinationLocation != null) {
            dVar.d(eVar, 5, y1.f117048a, jVar.destinationLocation);
        }
        if (dVar.C(eVar) || jVar.destinationTimezone != null) {
            dVar.d(eVar, 6, y1.f117048a, jVar.destinationTimezone);
        }
        if (!dVar.C(eVar) && jVar.destinationTimestamp == null) {
            return;
        }
        dVar.d(eVar, 7, y1.f117048a, jVar.destinationTimestamp);
    }

    public final LocalDate b(String str) {
        DateTime dateTimeQ = g22.k.q(this.destinationTimestamp, str, null);
        if (dateTimeQ != null) {
            return dateTimeQ.toLocalDate();
        }
        return null;
    }

    public final DateTime d(String str) {
        return g22.k.q(this.destinationTimestamp, str, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.flightId, jVar.flightId) && p005kotlin.jvm.internal.s.g(this.tripId, jVar.tripId) && p005kotlin.jvm.internal.s.g(this.originLocation, jVar.originLocation) && p005kotlin.jvm.internal.s.g(this.originTimezone, jVar.originTimezone) && p005kotlin.jvm.internal.s.g(this.originTimestamp, jVar.originTimestamp) && p005kotlin.jvm.internal.s.g(this.destinationLocation, jVar.destinationLocation) && p005kotlin.jvm.internal.s.g(this.destinationTimezone, jVar.destinationTimezone) && p005kotlin.jvm.internal.s.g(this.destinationTimestamp, jVar.destinationTimestamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDestinationLocation() {
        return this.destinationLocation;
    }

    public final LocalTime g(String str) {
        DateTime dateTimeQ = g22.k.q(this.destinationTimestamp, str, null);
        if (dateTimeQ != null) {
            return dateTimeQ.toLocalTime();
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDestinationTimezone() {
        return this.destinationTimezone;
    }

    public final int hashCode() {
        Long l14 = this.flightId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.tripId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.originLocation;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originTimezone;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originTimestamp;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.destinationLocation;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.destinationTimezone;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.destinationTimestamp;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getFlightId() {
        return this.flightId;
    }

    public final LocalDate j(String str) {
        DateTime dateTimeQ = g22.k.q(this.originTimestamp, str, null);
        if (dateTimeQ != null) {
            return dateTimeQ.toLocalDate();
        }
        return null;
    }

    public final DateTime k(String str) {
        return g22.k.q(this.originTimestamp, str, null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getOriginLocation() {
        return this.originLocation;
    }

    public final LocalTime o(String str) {
        DateTime dateTimeQ = g22.k.q(this.originTimestamp, str, null);
        if (dateTimeQ != null) {
            return dateTimeQ.toLocalTime();
        }
        return null;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getOriginTimezone() {
        return this.originTimezone;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getTripId() {
        return this.tripId;
    }

    public final String toString() {
        Long l14 = this.flightId;
        Long l15 = this.tripId;
        String str = this.originLocation;
        String str2 = this.originTimezone;
        String str3 = this.originTimestamp;
        String str4 = this.destinationLocation;
        String str5 = this.destinationTimezone;
        String str6 = this.destinationTimestamp;
        StringBuilder sbJ = f3.j(l14, l15, "JetLagFlightDTO(flightId=", ", tripId=", ", originLocation=");
        sn.a.t(sbJ, str, ", originTimezone=", str2, ", originTimestamp=");
        sn.a.t(sbJ, str3, ", destinationLocation=", str4, ", destinationTimezone=");
        return e5.h(sbJ, str5, ", destinationTimestamp=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.flightId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.tripId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.originLocation);
        parcel.writeString(this.originTimezone);
        parcel.writeString(this.originTimestamp);
        parcel.writeString(this.destinationLocation);
        parcel.writeString(this.destinationTimezone);
        parcel.writeString(this.destinationTimestamp);
    }

    /* JADX INFO: renamed from: yr0.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyr0/j$b;", "", "<init>", "()V", "Li63/c;", "Lyr0/j;", "serializer", "()Li63/c;", "", "TIMESTAMP_PATTERN", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<j> serializer() {
            return a.f199011a;
        }

        private Companion() {
        }
    }

    public j() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
    }

    public j(Long l14, Long l15, String str, String str2, String str3, String str4, String str5, String str6) {
        this.flightId = l14;
        this.tripId = l15;
        this.originLocation = str;
        this.originTimezone = str2;
        this.originTimestamp = str3;
        this.destinationLocation = str4;
        this.destinationTimezone = str5;
        this.destinationTimestamp = str6;
    }

    public /* synthetic */ j(Long l14, Long l15, String str, String str2, String str3, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6);
    }
}
