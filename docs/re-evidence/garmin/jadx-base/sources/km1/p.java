package km1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import m63.m0;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0002\u0016\u001cB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0017\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b!\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010\u001b\u001a\u0004\b\b\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\u001b\u001a\u0004\b)\u0010*R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010\u001b\u001a\u0004\b-\u0010*R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010(\u0012\u0004\b0\u0010\u001b\u001a\u0004\b,\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u001d\u0012\u0004\b2\u0010\u001b\u001a\u0004\b1\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010(\u0012\u0004\b3\u0010\u001b\u001a\u0004\b/\u0010*R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010(\u0012\u0004\b5\u0010\u001b\u001a\u0004\b#\u0010*¨\u00067"}, d2 = {"Lkm1/p;", "Landroid/os/Parcelable;", "", "userId", "", "calendarDate", "deviceId", "", "isPreferredActivityTracker", "", "sleepNeedBaselineMins", "optimalSleepWindowStartMins", "optimalSleepWindowEndMins", "status", "optimalSleepWindowMidpointMins", "lastSleepMidpointMins", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lm63/u1;)V", "a", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "getUserId$annotations", "()V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "getCalendarDate$annotations", "c", "getDeviceId", "getDeviceId$annotations", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isPreferredActivityTracker$annotations", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "getSleepNeedBaselineMins", "()Ljava/lang/Integer;", "getSleepNeedBaselineMins$annotations", "f", "h", "getOptimalSleepWindowStartMins$annotations", "g", "getOptimalSleepWindowEndMins$annotations", IntegerTokenConverter.CONVERTER_KEY, "getStatus$annotations", "getOptimalSleepWindowMidpointMins$annotations", "j", "getLastSleepMidpointMins$annotations", "Companion", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class p implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPreferredActivityTracker")
    private final Boolean isPreferredActivityTracker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepNeedBaselineMins")
    private final Integer sleepNeedBaselineMins;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("optimalSleepWindowStartMins")
    private final Integer optimalSleepWindowStartMins;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("optimalSleepWindowEndMins")
    private final Integer optimalSleepWindowEndMins;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final String status;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("optimalSleepWindowMidpointMins")
    private final Integer optimalSleepWindowMidpointMins;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastSleepMidpointMins")
    private final Integer lastSleepMidpointMins;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<p> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            Object objValueOf;
            Integer num2;
            Integer numValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            String string = parcel.readString();
            Object objValueOf2 = parcel.readInt() == 0 ? num : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                objValueOf = num;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            Integer numValueOf5 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num3 = numValueOf5;
                numValueOf = num;
                num2 = num3;
            } else {
                num2 = numValueOf5;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new p(lValueOf, string, objValueOf2, objValueOf, numValueOf2, numValueOf3, numValueOf4, string2, num2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public /* synthetic */ p(int i14, Long l14, String str, Long l15, Boolean bool, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.userId = null;
        } else {
            this.userId = l14;
        }
        if ((i14 & 2) == 0) {
            this.calendarDate = null;
        } else {
            this.calendarDate = str;
        }
        if ((i14 & 4) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = l15;
        }
        if ((i14 & 8) == 0) {
            this.isPreferredActivityTracker = null;
        } else {
            this.isPreferredActivityTracker = bool;
        }
        if ((i14 & 16) == 0) {
            this.sleepNeedBaselineMins = null;
        } else {
            this.sleepNeedBaselineMins = num;
        }
        if ((i14 & 32) == 0) {
            this.optimalSleepWindowStartMins = null;
        } else {
            this.optimalSleepWindowStartMins = num2;
        }
        if ((i14 & 64) == 0) {
            this.optimalSleepWindowEndMins = null;
        } else {
            this.optimalSleepWindowEndMins = num3;
        }
        if ((i14 & 128) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i14 & 256) == 0) {
            this.optimalSleepWindowMidpointMins = null;
        } else {
            this.optimalSleepWindowMidpointMins = num4;
        }
        if ((i14 & 512) == 0) {
            this.lastSleepMidpointMins = null;
        } else {
            this.lastSleepMidpointMins = num5;
        }
    }

    public static final /* synthetic */ void j(p pVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || pVar.userId != null) {
            dVar.d(eVar, 0, v0.f117027a, pVar.userId);
        }
        if (dVar.C(eVar) || pVar.calendarDate != null) {
            dVar.d(eVar, 1, y1.f117048a, pVar.calendarDate);
        }
        if (dVar.C(eVar) || pVar.deviceId != null) {
            dVar.d(eVar, 2, v0.f117027a, pVar.deviceId);
        }
        if (dVar.C(eVar) || pVar.isPreferredActivityTracker != null) {
            dVar.d(eVar, 3, m63.g.f116948a, pVar.isPreferredActivityTracker);
        }
        if (dVar.C(eVar) || pVar.sleepNeedBaselineMins != null) {
            dVar.d(eVar, 4, m0.f116981a, pVar.sleepNeedBaselineMins);
        }
        if (dVar.C(eVar) || pVar.optimalSleepWindowStartMins != null) {
            dVar.d(eVar, 5, m0.f116981a, pVar.optimalSleepWindowStartMins);
        }
        if (dVar.C(eVar) || pVar.optimalSleepWindowEndMins != null) {
            dVar.d(eVar, 6, m0.f116981a, pVar.optimalSleepWindowEndMins);
        }
        if (dVar.C(eVar) || pVar.status != null) {
            dVar.d(eVar, 7, y1.f117048a, pVar.status);
        }
        if (dVar.C(eVar) || pVar.optimalSleepWindowMidpointMins != null) {
            dVar.d(eVar, 8, m0.f116981a, pVar.optimalSleepWindowMidpointMins);
        }
        if (!dVar.C(eVar) && pVar.lastSleepMidpointMins == null) {
            return;
        }
        dVar.d(eVar, 9, m0.f116981a, pVar.lastSleepMidpointMins);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getLastSleepMidpointMins() {
        return this.lastSleepMidpointMins;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.userId, pVar.userId) && p005kotlin.jvm.internal.s.g(this.calendarDate, pVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.deviceId, pVar.deviceId) && p005kotlin.jvm.internal.s.g(this.isPreferredActivityTracker, pVar.isPreferredActivityTracker) && p005kotlin.jvm.internal.s.g(this.sleepNeedBaselineMins, pVar.sleepNeedBaselineMins) && p005kotlin.jvm.internal.s.g(this.optimalSleepWindowStartMins, pVar.optimalSleepWindowStartMins) && p005kotlin.jvm.internal.s.g(this.optimalSleepWindowEndMins, pVar.optimalSleepWindowEndMins) && p005kotlin.jvm.internal.s.g(this.status, pVar.status) && p005kotlin.jvm.internal.s.g(this.optimalSleepWindowMidpointMins, pVar.optimalSleepWindowMidpointMins) && p005kotlin.jvm.internal.s.g(this.lastSleepMidpointMins, pVar.lastSleepMidpointMins);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getOptimalSleepWindowEndMins() {
        return this.optimalSleepWindowEndMins;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getOptimalSleepWindowMidpointMins() {
        return this.optimalSleepWindowMidpointMins;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getOptimalSleepWindowStartMins() {
        return this.optimalSleepWindowStartMins;
    }

    public final int hashCode() {
        Long l14 = this.userId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.calendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.deviceId;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool = this.isPreferredActivityTracker;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.sleepNeedBaselineMins;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.optimalSleepWindowStartMins;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.optimalSleepWindowEndMins;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.optimalSleepWindowMidpointMins;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.lastSleepMidpointMins;
        return iHashCode9 + (num5 != null ? num5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final String toString() {
        Long l14 = this.userId;
        String str = this.calendarDate;
        Long l15 = this.deviceId;
        Boolean bool = this.isPreferredActivityTracker;
        Integer num = this.sleepNeedBaselineMins;
        Integer num2 = this.optimalSleepWindowStartMins;
        Integer num3 = this.optimalSleepWindowEndMins;
        String str2 = this.status;
        Integer num4 = this.optimalSleepWindowMidpointMins;
        Integer num5 = this.lastSleepMidpointMins;
        StringBuilder sbJ = b71.i.j("SleepAlignmentDTO(userId=", ", calendarDate=", str, l14, ", deviceId=");
        sbJ.append(l15);
        sbJ.append(", isPreferredActivityTracker=");
        sbJ.append(bool);
        sbJ.append(", sleepNeedBaselineMins=");
        j20.x.m(sbJ, num, ", optimalSleepWindowStartMins=", num2, ", optimalSleepWindowEndMins=");
        p6.b.l(num3, ", status=", str2, ", optimalSleepWindowMidpointMins=", sbJ);
        return b71.i.h(sbJ, num4, ", lastSleepMidpointMins=", num5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.calendarDate);
        Long l15 = this.deviceId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Boolean bool = this.isPreferredActivityTracker;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Integer num = this.sleepNeedBaselineMins;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.optimalSleepWindowStartMins;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.optimalSleepWindowEndMins;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.status);
        Integer num4 = this.optimalSleepWindowMidpointMins;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.lastSleepMidpointMins;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
    }

    /* JADX INFO: renamed from: km1.p$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkm1/p$b;", "", "<init>", "()V", "Li63/c;", "Lkm1/p;", "serializer", "()Li63/c;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<p> serializer() {
            return a.f105558a;
        }

        private Companion() {
        }
    }

    public p() {
        this((Long) null, (String) null, (Long) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, 1023, (p005kotlin.jvm.internal.j) null);
    }

    public p(Long l14, String str, Long l15, Boolean bool, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5) {
        this.userId = l14;
        this.calendarDate = str;
        this.deviceId = l15;
        this.isPreferredActivityTracker = bool;
        this.sleepNeedBaselineMins = num;
        this.optimalSleepWindowStartMins = num2;
        this.optimalSleepWindowEndMins = num3;
        this.status = str2;
        this.optimalSleepWindowMidpointMins = num4;
        this.lastSleepMidpointMins = num5;
    }

    public /* synthetic */ p(Long l14, String str, Long l15, Boolean bool, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : num3, (i14 & 128) != 0 ? null : str2, (i14 & 256) != 0 ? null : num4, (i14 & 512) != 0 ? null : num5);
    }
}
