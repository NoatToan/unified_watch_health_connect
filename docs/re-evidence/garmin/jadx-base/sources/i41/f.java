package i41;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import g22.k;
import i3.e5;
import j20.x;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002\u001b\u0013Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010\u001c\u0012\u0004\b%\u0010\u001a\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R*\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u001c\u0012\u0004\b(\u0010\u001a\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b.\u0010\u001a\u001a\u0004\b\u001b\u0010+\"\u0004\b,\u0010-R*\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u0010\u0014\u0012\u0004\b2\u0010\u001a\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R*\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010\u0014\u0012\u0004\b6\u0010\u001a\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018R*\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010\u0014\u0012\u0004\b9\u0010\u001a\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018¨\u0006;"}, d2 = {"Li41/f;", "Landroid/os/Parcelable;", "", "calendarDate", "", "weeklyAvg", "lastNightAvg", "lastNight5MinHigh", "Li41/a;", "baseline", "status", "feedbackPhrase", "createTimeStamp", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Li41/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Li41/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setCalendarDate", "(Ljava/lang/String;)V", "getCalendarDate$annotations", "()V", "b", "Ljava/lang/Integer;", "o", "()Ljava/lang/Integer;", "setWeeklyAvg", "(Ljava/lang/Integer;)V", "getWeeklyAvg$annotations", "c", IntegerTokenConverter.CONVERTER_KEY, "setLastNightAvg", "getLastNightAvg$annotations", "h", "setLastNight5MinHigh", "getLastNight5MinHigh$annotations", JWKParameterNames.RSA_EXPONENT, "Li41/a;", "()Li41/a;", "setBaseline", "(Li41/a;)V", "getBaseline$annotations", "f", JWKParameterNames.OCT_KEY_VALUE, "setStatus", "getStatus$annotations", "g", "getFeedbackPhrase", "setFeedbackPhrase", "getFeedbackPhrase$annotations", "getCreateTimeStamp", "setCreateTimeStamp", "getCreateTimeStamp$annotations", "Companion", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weeklyAvg")
    private Integer weeklyAvg;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastNightAvg")
    private Integer lastNightAvg;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastNight5MinHigh")
    private Integer lastNight5MinHigh;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseline")
    private i41.a baseline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private String status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackPhrase")
    private String feedbackPhrase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createTimeStamp")
    private String createTimeStamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f90926i = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/overnighthrv/model/HrvSummaryDTO.$serializer", "Lm63/e0;", "Li41/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f90935a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f90935a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.overnighthrv.model.HrvSummaryDTO", aVar, 8);
            m1Var.j("calendarDate", true);
            m1Var.j("weeklyAvg", true);
            m1Var.j("lastNightAvg", true);
            m1Var.j("lastNight5MinHigh", true);
            m1Var.j("baseline", true);
            m1Var.j("status", true);
            m1Var.j("feedbackPhrase", true);
            m1Var.j("createTimeStamp", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(i41.a.C1745a.f90901a), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
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
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            i41.a aVar = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                        break;
                    case 1:
                        num = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num);
                        i15 |= 2;
                        break;
                    case 2:
                        num2 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num2);
                        i15 |= 4;
                        break;
                    case 3:
                        num3 = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num3);
                        i15 |= 8;
                        break;
                    case 4:
                        aVar = (i41.a) cVarC.v(eVar2, 4, i41.a.C1745a.f90901a, aVar);
                        i15 |= 16;
                        break;
                    case 5:
                        str2 = (String) cVarC.v(eVar2, 5, y1.f117048a, str2);
                        i15 |= 32;
                        break;
                    case 6:
                        str3 = (String) cVarC.v(eVar2, 6, y1.f117048a, str3);
                        i15 |= 64;
                        break;
                    case 7:
                        str4 = (String) cVarC.v(eVar2, 7, y1.f117048a, str4);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new f(i15, str, num, num2, num3, aVar, str2, str3, str4, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f fVar2 = (f) obj;
            fVar2.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            f.r(fVar2, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? i41.a.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90936a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.ONBOARDING_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.ONBOARDING_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90936a = iArr;
        }
    }

    public /* synthetic */ f(int i14, String str, Integer num, Integer num2, Integer num3, i41.a aVar, String str2, String str3, String str4, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.calendarDate = null;
        } else {
            this.calendarDate = str;
        }
        if ((i14 & 2) == 0) {
            this.weeklyAvg = null;
        } else {
            this.weeklyAvg = num;
        }
        if ((i14 & 4) == 0) {
            this.lastNightAvg = null;
        } else {
            this.lastNightAvg = num2;
        }
        if ((i14 & 8) == 0) {
            this.lastNight5MinHigh = null;
        } else {
            this.lastNight5MinHigh = num3;
        }
        if ((i14 & 16) == 0) {
            this.baseline = null;
        } else {
            this.baseline = aVar;
        }
        if ((i14 & 32) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i14 & 64) == 0) {
            this.feedbackPhrase = null;
        } else {
            this.feedbackPhrase = str3;
        }
        if ((i14 & 128) == 0) {
            this.createTimeStamp = null;
        } else {
            this.createTimeStamp = str4;
        }
    }

    public static final /* synthetic */ void r(f fVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || fVar.calendarDate != null) {
            dVar.d(eVar, 0, y1.f117048a, fVar.calendarDate);
        }
        if (dVar.C(eVar) || fVar.weeklyAvg != null) {
            dVar.d(eVar, 1, m0.f116981a, fVar.weeklyAvg);
        }
        if (dVar.C(eVar) || fVar.lastNightAvg != null) {
            dVar.d(eVar, 2, m0.f116981a, fVar.lastNightAvg);
        }
        if (dVar.C(eVar) || fVar.lastNight5MinHigh != null) {
            dVar.d(eVar, 3, m0.f116981a, fVar.lastNight5MinHigh);
        }
        if (dVar.C(eVar) || fVar.baseline != null) {
            dVar.d(eVar, 4, i41.a.C1745a.f90901a, fVar.baseline);
        }
        if (dVar.C(eVar) || fVar.status != null) {
            dVar.d(eVar, 5, y1.f117048a, fVar.status);
        }
        if (dVar.C(eVar) || fVar.feedbackPhrase != null) {
            dVar.d(eVar, 6, y1.f117048a, fVar.feedbackPhrase);
        }
        if (!dVar.C(eVar) && fVar.createTimeStamp == null) {
            return;
        }
        dVar.d(eVar, 7, y1.f117048a, fVar.createTimeStamp);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i41.a getBaseline() {
        return this.baseline;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.calendarDate, fVar.calendarDate) && s.g(this.weeklyAvg, fVar.weeklyAvg) && s.g(this.lastNightAvg, fVar.lastNightAvg) && s.g(this.lastNight5MinHigh, fVar.lastNight5MinHigh) && s.g(this.baseline, fVar.baseline) && s.g(this.status, fVar.status) && s.g(this.feedbackPhrase, fVar.feedbackPhrase) && s.g(this.createTimeStamp, fVar.createTimeStamp);
    }

    public final LocalDate f() {
        String str = this.calendarDate;
        if (str != null) {
            return k.w(str, "yyyy-MM-dd");
        }
        return null;
    }

    public final int g() {
        String str = this.feedbackPhrase;
        return (str == null || str.length() == 0) ? g.NONE.f90941a : g.valueOf(String.valueOf(this.feedbackPhrase)).f90941a;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getLastNight5MinHigh() {
        return this.lastNight5MinHigh;
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.weeklyAvg;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastNightAvg;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.lastNight5MinHigh;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        i41.a aVar = this.baseline;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackPhrase;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createTimeStamp;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getLastNightAvg() {
        return this.lastNightAvg;
    }

    public final h j() {
        h.a aVar = h.f90942e;
        String str = this.status;
        aVar.getClass();
        for (h hVar : h.values()) {
            if (s.g(hVar.f90953a, str)) {
                return hVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final int m() {
        String str = this.status;
        return (str == null || str.length() == 0 || u.q(this.status, "NONE", true)) ? h.f90943f.f90954b : h.valueOf(String.valueOf(this.status)).f90954b;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getWeeklyAvg() {
        return this.weeklyAvg;
    }

    public final boolean q() {
        int i14 = d.f90936a[g.valueOf(String.valueOf(this.feedbackPhrase)).ordinal()];
        return i14 == 1 || i14 == 2;
    }

    public final String toString() {
        String str = this.calendarDate;
        Integer num = this.weeklyAvg;
        Integer num2 = this.lastNightAvg;
        Integer num3 = this.lastNight5MinHigh;
        i41.a aVar = this.baseline;
        String str2 = this.status;
        String str3 = this.feedbackPhrase;
        String str4 = this.createTimeStamp;
        StringBuilder sbN = u0.n("HrvSummaryDTO(calendarDate=", num, str, ", weeklyAvg=", ", lastNightAvg=");
        x.m(sbN, num2, ", lastNight5MinHigh=", num3, ", baseline=");
        sbN.append(aVar);
        sbN.append(", status=");
        sbN.append(str2);
        sbN.append(", feedbackPhrase=");
        return e5.h(sbN, str3, ", createTimeStamp=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.calendarDate);
        Integer num = this.weeklyAvg;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.lastNightAvg;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.lastNight5MinHigh;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        i41.a aVar = this.baseline;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.feedbackPhrase);
        parcel.writeString(this.createTimeStamp);
    }

    /* JADX INFO: renamed from: i41.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li41/f$b;", "", "<init>", "()V", "Li63/c;", "Li41/f;", "serializer", "()Li63/c;", "", "CALENDAR_DATE_FORMAT", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f90935a;
        }

        private Companion() {
        }
    }

    public f() {
        this((String) null, (Integer) null, (Integer) null, (Integer) null, (i41.a) null, (String) null, (String) null, (String) null, 255, (j) null);
    }

    public f(String str, Integer num, Integer num2, Integer num3, i41.a aVar, String str2, String str3, String str4) {
        this.calendarDate = str;
        this.weeklyAvg = num;
        this.lastNightAvg = num2;
        this.lastNight5MinHigh = num3;
        this.baseline = aVar;
        this.status = str2;
        this.feedbackPhrase = str3;
        this.createTimeStamp = str4;
    }

    public /* synthetic */ f(String str, Integer num, Integer num2, Integer num3, i41.a aVar, String str2, String str3, String str4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : num3, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4);
    }
}
