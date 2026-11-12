package yr0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002%\u001fBÝ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aBÏ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010 \u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010$\u001a\u0004\b.\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010)\u0012\u0004\b2\u0010$\u001a\u0004\b1\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b6\u0010$\u001a\u0004\b%\u00105R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010)\u0012\u0004\b8\u0010$\u001a\u0004\b7\u0010+R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010)\u0012\u0004\b:\u0010$\u001a\u0004\b3\u0010+R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010$\u001a\u0004\b=\u0010>R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010)\u0012\u0004\bB\u0010$\u001a\u0004\bA\u0010+R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00104\u0012\u0004\bD\u0010$\u001a\u0004\bC\u00105R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010)\u0012\u0004\bG\u0010$\u001a\u0004\bF\u0010+R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010H\u0012\u0004\bK\u0010$\u001a\u0004\bI\u0010JR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010)\u0012\u0004\bM\u0010$\u001a\u0004\b9\u0010+R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010)\u0012\u0004\bO\u0010$\u001a\u0004\bN\u0010+R*\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bP\u00104\u0012\u0004\bT\u0010$\u001a\u0004\bQ\u00105\"\u0004\bR\u0010SR(\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bU\u0010H\u0012\u0004\bV\u0010$\u001a\u0004\b@\u0010J¨\u0006X"}, d2 = {"Lyr0/f;", "Landroid/os/Parcelable;", "", "dailyStatusId", "tripId", "", "tripStartDate", "tripEndDate", "calendarDate", "", "bodyClockDifference", "bodyClockShiftFeedback", "bodyClockFeedback", "severity", "severityFeedback", "severityPercentage", "travelDirection", "", "Lyr0/l;", "suggestions", "currentLocation", "currentTimezone", "userTimezoneOffset", "Lyr0/j;", "flights", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lm63/u1;)V", "a", "Ljava/lang/Long;", "getDailyStatusId", "()Ljava/lang/Long;", "getDailyStatusId$annotations", "()V", "b", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getTripId$annotations", "c", "Ljava/lang/String;", "getTripStartDate", "()Ljava/lang/String;", "getTripStartDate$annotations", "d", "getTripEndDate", "getTripEndDate$annotations", JWKParameterNames.RSA_EXPONENT, "getCalendarDate", "getCalendarDate$annotations", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getBodyClockDifference$annotations", "g", "getBodyClockShiftFeedback$annotations", "h", "getBodyClockFeedback$annotations", IntegerTokenConverter.CONVERTER_KEY, "I", JWKParameterNames.OCT_KEY_VALUE, "()I", "getSeverity$annotations", "j", "getSeverityFeedback", "getSeverityFeedback$annotations", "m", "getSeverityPercentage$annotations", "l", "getTravelDirection", "getTravelDirection$annotations", "Ljava/util/List;", "o", "()Ljava/util/List;", "getSuggestions$annotations", JWKParameterNames.RSA_MODULUS, "getCurrentLocation$annotations", "getCurrentTimezone", "getCurrentTimezone$annotations", "p", "getUserTimezoneOffset", "setUserTimezoneOffset", "(Ljava/lang/Integer;)V", "getUserTimezoneOffset$annotations", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getFlights$annotations", "Companion", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f198939r;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyStatusId")
    private final Long dailyStatusId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripId")
    private final Long tripId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripStartDate")
    private final String tripStartDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripEndDate")
    private final String tripEndDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyClockDifference")
    private final Integer bodyClockDifference;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyClockShiftFeedback")
    private final String bodyClockShiftFeedback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyClockFeedback")
    private final String bodyClockFeedback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("severity")
    private final int severity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("severityFeedback")
    private final String severityFeedback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("severityPercentage")
    private final Integer severityPercentage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("travelDirection")
    private final String travelDirection;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestions")
    private final List<l> suggestions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentLocation")
    private final String currentLocation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentTimezone")
    private final String currentTimezone;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userTimezoneOffset")
    private Integer userTimezoneOffset;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flights")
    private final List<j> flights;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/jet_lag/data/model/JetLagDailyStatusDTO.$serializer", "Lm63/e0;", "Lyr0/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f198957a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f198957a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.jet_lag.data.model.JetLagDailyStatusDTO", aVar, 17);
            m1Var.j("dailyStatusId", true);
            m1Var.j("tripId", true);
            m1Var.j("tripStartDate", true);
            m1Var.j("tripEndDate", true);
            m1Var.j("calendarDate", true);
            m1Var.j("bodyClockDifference", true);
            m1Var.j("bodyClockShiftFeedback", true);
            m1Var.j("bodyClockFeedback", true);
            m1Var.j("severity", true);
            m1Var.j("severityFeedback", true);
            m1Var.j("severityPercentage", true);
            m1Var.j("travelDirection", true);
            m1Var.j("suggestions", true);
            m1Var.j("currentLocation", true);
            m1Var.j("currentTimezone", true);
            m1Var.j("userTimezoneOffset", true);
            m1Var.j("flights", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = f.f198939r;
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            i63.c<?> cVarD2 = j63.a.d(v0Var);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD3 = j63.a.d(y1Var);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, j63.a.d(m0Var), j63.a.d(y1Var), j63.a.d(y1Var), m0Var, j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(y1Var), j63.a.d(lVarArr[12].getValue()), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(lVarArr[16].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            String str;
            int i14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = f.f198939r;
            int i15 = l63.c.f110557a;
            List list = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            int i16 = 0;
            String str6 = null;
            Integer num2 = null;
            List list2 = null;
            String str7 = null;
            String str8 = null;
            Integer num3 = null;
            String str9 = null;
            int iA = 0;
            boolean z14 = true;
            Long l14 = null;
            Long l15 = null;
            String str10 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        list = list;
                        str8 = str8;
                        z14 = false;
                        str2 = str2;
                        list = list;
                        str8 = str8;
                        break;
                    case 0:
                        str = str7;
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                        i16 |= 1;
                        str2 = str2;
                        str7 = str;
                        list = list;
                        str8 = str8;
                        break;
                    case 1:
                        str = str7;
                        l15 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l15);
                        i16 |= 2;
                        str10 = str10;
                        str7 = str;
                        list = list;
                        str8 = str8;
                        break;
                    case 2:
                        str = str7;
                        str10 = (String) cVarC.v(eVar2, 2, y1.f117048a, str10);
                        i16 |= 4;
                        str7 = str;
                        list = list;
                        str8 = str8;
                        break;
                    case 3:
                        list = list;
                        str8 = str8;
                        str7 = (String) cVarC.v(eVar2, 3, y1.f117048a, str7);
                        i16 |= 8;
                        list = list;
                        str8 = str8;
                        break;
                    case 4:
                        str8 = (String) cVarC.v(eVar2, 4, y1.f117048a, str8);
                        i16 |= 16;
                        str7 = str7;
                        list = list;
                        break;
                    case 5:
                        str7 = str7;
                        str8 = str8;
                        num3 = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num3);
                        i16 |= 32;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 6:
                        str7 = str7;
                        str8 = str8;
                        str9 = (String) cVarC.v(eVar2, 6, y1.f117048a, str9);
                        i16 |= 64;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 7:
                        str7 = str7;
                        str8 = str8;
                        str5 = (String) cVarC.v(eVar2, 7, y1.f117048a, str5);
                        i16 |= 128;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 8:
                        iA = cVarC.A(eVar2, 8);
                        i16 |= 256;
                        str7 = str7;
                        break;
                    case 9:
                        str7 = str7;
                        str8 = str8;
                        str3 = (String) cVarC.v(eVar2, 9, y1.f117048a, str3);
                        i16 |= 512;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 10:
                        str7 = str7;
                        str8 = str8;
                        num = (Integer) cVarC.v(eVar2, 10, m0.f116981a, num);
                        i16 |= 1024;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 11:
                        str7 = str7;
                        str8 = str8;
                        str2 = (String) cVarC.v(eVar2, 11, y1.f117048a, str2);
                        i16 |= 2048;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 12:
                        str7 = str7;
                        str8 = str8;
                        list = (List) cVarC.v(eVar2, 12, lVarArr[12].getValue(), list);
                        i16 |= 4096;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 13:
                        str7 = str7;
                        str8 = str8;
                        str4 = (String) cVarC.v(eVar2, 13, y1.f117048a, str4);
                        i16 |= 8192;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 14:
                        str7 = str7;
                        str8 = str8;
                        str6 = (String) cVarC.v(eVar2, 14, y1.f117048a, str6);
                        i16 |= 16384;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 15:
                        num2 = (Integer) cVarC.v(eVar2, 15, m0.f116981a, num2);
                        i14 = 32768;
                        i16 |= i14;
                        str7 = str7;
                        str8 = str8;
                        break;
                    case 16:
                        list2 = (List) cVarC.v(eVar2, 16, lVarArr[16].getValue(), list2);
                        i14 = 65536;
                        i16 |= i14;
                        str7 = str7;
                        str8 = str8;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            List list3 = list;
            String str11 = str8;
            Long l16 = l14;
            Long l17 = l15;
            String str12 = str10;
            cVarC.b(eVar2);
            return new f(i16, l16, l17, str12, str7, str11, num3, str9, str5, iA, str3, num, str2, list3, str4, str6, num2, list2, (u1) null);
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
            f.t(fVar2, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i14 = parcel.readInt();
            String string6 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                arrayList = new ArrayList(i15);
                int iD = 0;
                while (iD != i15) {
                    iD = u0.d(f.class, parcel, arrayList, iD, 1);
                    i15 = i15;
                }
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i16);
                int iD2 = 0;
                while (iD2 != i16) {
                    iD2 = u0.d(f.class, parcel, arrayList3, iD2, 1);
                    i16 = i16;
                }
                arrayList2 = arrayList3;
            }
            return new f(lValueOf, lValueOf2, string, string2, string3, numValueOf, string4, string5, i14, string6, numValueOf2, string7, arrayList, string8, string9, numValueOf3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f198939r = new o13.l[]{null, null, null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new ya0.j(20)), null, null, null, o13.m.a(nVar, new ya0.j(21))};
    }

    public /* synthetic */ f(Long l14, Long l15, String str, String str2, String str3, Integer num, String str4, String str5, int i14, String str6, Integer num2, String str7, List list, String str8, String str9, Integer num3, List list2, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : l14, (i15 & 2) != 0 ? null : l15, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? null : str2, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : num, (i15 & 64) != 0 ? null : str4, (i15 & 128) != 0 ? null : str5, (i15 & 256) != 0 ? -1 : i14, (i15 & 512) != 0 ? null : str6, (i15 & 1024) != 0 ? null : num2, (i15 & 2048) != 0 ? null : str7, (i15 & 4096) != 0 ? null : list, (i15 & 8192) != 0 ? null : str8, (i15 & 16384) != 0 ? null : str9, (i15 & 32768) != 0 ? null : num3, (i15 & 65536) != 0 ? null : list2);
    }

    public static List q(f fVar) {
        LocalDate localDateI = fVar.i();
        List<l> list = fVar.suggestions;
        if (localDateI == null) {
            return list;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            l lVar = (l) obj;
            DateTime dateTimeD = lVar.d();
            LocalDate localDate = dateTimeD != null ? dateTimeD.toLocalDate() : null;
            DateTime dateTimeB = lVar.b();
            LocalDate localDate2 = dateTimeB != null ? dateTimeB.toLocalDate() : null;
            if (g22.k.g(localDate, localDateI) || g22.k.g(localDate2, localDateI)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ void t(f fVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || fVar.dailyStatusId != null) {
            dVar.d(eVar, 0, v0.f117027a, fVar.dailyStatusId);
        }
        if (dVar.C(eVar) || fVar.tripId != null) {
            dVar.d(eVar, 1, v0.f117027a, fVar.tripId);
        }
        if (dVar.C(eVar) || fVar.tripStartDate != null) {
            dVar.d(eVar, 2, y1.f117048a, fVar.tripStartDate);
        }
        if (dVar.C(eVar) || fVar.tripEndDate != null) {
            dVar.d(eVar, 3, y1.f117048a, fVar.tripEndDate);
        }
        if (dVar.C(eVar) || fVar.calendarDate != null) {
            dVar.d(eVar, 4, y1.f117048a, fVar.calendarDate);
        }
        if (dVar.C(eVar) || fVar.bodyClockDifference != null) {
            dVar.d(eVar, 5, m0.f116981a, fVar.bodyClockDifference);
        }
        if (dVar.C(eVar) || fVar.bodyClockShiftFeedback != null) {
            dVar.d(eVar, 6, y1.f117048a, fVar.bodyClockShiftFeedback);
        }
        if (dVar.C(eVar) || fVar.bodyClockFeedback != null) {
            dVar.d(eVar, 7, y1.f117048a, fVar.bodyClockFeedback);
        }
        if (dVar.C(eVar) || fVar.severity != -1) {
            dVar.v(8, fVar.severity, eVar);
        }
        if (dVar.C(eVar) || fVar.severityFeedback != null) {
            dVar.d(eVar, 9, y1.f117048a, fVar.severityFeedback);
        }
        if (dVar.C(eVar) || fVar.severityPercentage != null) {
            dVar.d(eVar, 10, m0.f116981a, fVar.severityPercentage);
        }
        if (dVar.C(eVar) || fVar.travelDirection != null) {
            dVar.d(eVar, 11, y1.f117048a, fVar.travelDirection);
        }
        boolean zC = dVar.C(eVar);
        o13.l<i63.c<Object>>[] lVarArr = f198939r;
        if (zC || fVar.suggestions != null) {
            dVar.d(eVar, 12, lVarArr[12].getValue(), fVar.suggestions);
        }
        if (dVar.C(eVar) || fVar.currentLocation != null) {
            dVar.d(eVar, 13, y1.f117048a, fVar.currentLocation);
        }
        if (dVar.C(eVar) || fVar.currentTimezone != null) {
            dVar.d(eVar, 14, y1.f117048a, fVar.currentTimezone);
        }
        if (dVar.C(eVar) || fVar.userTimezoneOffset != null) {
            dVar.d(eVar, 15, m0.f116981a, fVar.userTimezoneOffset);
        }
        if (!dVar.C(eVar) && fVar.flights == null) {
            return;
        }
        dVar.d(eVar, 16, lVarArr[16].getValue(), fVar.flights);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBodyClockDifference() {
        return this.bodyClockDifference;
    }

    public final Double d() {
        Integer num = this.bodyClockDifference;
        if (num != null) {
            return Double.valueOf(((double) num.intValue()) / 60.0d);
        }
        return null;
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
        return p005kotlin.jvm.internal.s.g(this.dailyStatusId, fVar.dailyStatusId) && p005kotlin.jvm.internal.s.g(this.tripId, fVar.tripId) && p005kotlin.jvm.internal.s.g(this.tripStartDate, fVar.tripStartDate) && p005kotlin.jvm.internal.s.g(this.tripEndDate, fVar.tripEndDate) && p005kotlin.jvm.internal.s.g(this.calendarDate, fVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.bodyClockDifference, fVar.bodyClockDifference) && p005kotlin.jvm.internal.s.g(this.bodyClockShiftFeedback, fVar.bodyClockShiftFeedback) && p005kotlin.jvm.internal.s.g(this.bodyClockFeedback, fVar.bodyClockFeedback) && this.severity == fVar.severity && p005kotlin.jvm.internal.s.g(this.severityFeedback, fVar.severityFeedback) && p005kotlin.jvm.internal.s.g(this.severityPercentage, fVar.severityPercentage) && p005kotlin.jvm.internal.s.g(this.travelDirection, fVar.travelDirection) && p005kotlin.jvm.internal.s.g(this.suggestions, fVar.suggestions) && p005kotlin.jvm.internal.s.g(this.currentLocation, fVar.currentLocation) && p005kotlin.jvm.internal.s.g(this.currentTimezone, fVar.currentTimezone) && p005kotlin.jvm.internal.s.g(this.userTimezoneOffset, fVar.userTimezoneOffset) && p005kotlin.jvm.internal.s.g(this.flights, fVar.flights);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBodyClockFeedback() {
        return this.bodyClockFeedback;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBodyClockShiftFeedback() {
        return this.bodyClockShiftFeedback;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCurrentLocation() {
        return this.currentLocation;
    }

    public final int hashCode() {
        Long l14 = this.dailyStatusId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.tripId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.tripStartDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tripEndDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.calendarDate;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.bodyClockDifference;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.bodyClockShiftFeedback;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bodyClockFeedback;
        int iD = q2.d(this.severity, (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.severityFeedback;
        int iHashCode8 = (iD + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.severityPercentage;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.travelDirection;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<l> list = this.suggestions;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.currentLocation;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.currentTimezone;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num3 = this.userTimezoneOffset;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<j> list2 = this.flights;
        return iHashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    public final LocalDate i() {
        return g22.k.w(this.calendarDate, "yyyy-MM-dd");
    }

    public final List<j> j() {
        return this.flights;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSeverity() {
        return this.severity;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getSeverityPercentage() {
        return this.severityPercentage;
    }

    public final List<l> o() {
        return this.suggestions;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getTripId() {
        return this.tripId;
    }

    public final LocalDate s() {
        return g22.k.w(this.tripStartDate, "yyyy-MM-dd");
    }

    public final String toString() {
        Long l14 = this.dailyStatusId;
        Long l15 = this.tripId;
        String str = this.tripStartDate;
        String str2 = this.tripEndDate;
        String str3 = this.calendarDate;
        Integer num = this.bodyClockDifference;
        String str4 = this.bodyClockShiftFeedback;
        String str5 = this.bodyClockFeedback;
        int i14 = this.severity;
        String str6 = this.severityFeedback;
        Integer num2 = this.severityPercentage;
        String str7 = this.travelDirection;
        List<l> list = this.suggestions;
        String str8 = this.currentLocation;
        String str9 = this.currentTimezone;
        Integer num3 = this.userTimezoneOffset;
        List<j> list2 = this.flights;
        StringBuilder sbJ = f3.j(l14, l15, "JetLagDailyStatusDTO(dailyStatusId=", ", tripId=", ", tripStartDate=");
        sn.a.t(sbJ, str, ", tripEndDate=", str2, ", calendarDate=");
        fb1.c.u(num, str3, ", bodyClockDifference=", ", bodyClockShiftFeedback=", sbJ);
        sn.a.t(sbJ, str4, ", bodyClockFeedback=", str5, ", severity=");
        wr.g.t(i14, ", severityFeedback=", str6, ", severityPercentage=", sbJ);
        p6.b.l(num2, ", travelDirection=", str7, ", suggestions=", sbJ);
        o2.c.n(", currentLocation=", str8, ", currentTimezone=", sbJ, list);
        fb1.c.u(num3, str9, ", userTimezoneOffset=", ", flights=", sbJ);
        return z.c(sbJ, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.dailyStatusId;
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
        parcel.writeString(this.tripStartDate);
        parcel.writeString(this.tripEndDate);
        parcel.writeString(this.calendarDate);
        Integer num = this.bodyClockDifference;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.bodyClockShiftFeedback);
        parcel.writeString(this.bodyClockFeedback);
        parcel.writeInt(this.severity);
        parcel.writeString(this.severityFeedback);
        Integer num2 = this.severityPercentage;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.travelDirection);
        List<l> list = this.suggestions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        parcel.writeString(this.currentLocation);
        parcel.writeString(this.currentTimezone);
        Integer num3 = this.userTimezoneOffset;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        List<j> list2 = this.flights;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO2 = u0.o(parcel, list2, 1);
        while (itO2.hasNext()) {
            parcel.writeParcelable((Parcelable) itO2.next(), i14);
        }
    }

    /* JADX INFO: renamed from: yr0.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyr0/f$b;", "", "<init>", "()V", "Li63/c;", "Lyr0/f;", "serializer", "()Li63/c;", "", "ONE_HOUR_IN_MINUTES", "D", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f198957a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(int i14, Long l14, Long l15, String str, String str2, String str3, Integer num, String str4, String str5, int i15, String str6, Integer num2, String str7, List list, String str8, String str9, Integer num3, List list2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.dailyStatusId = null;
        } else {
            this.dailyStatusId = l14;
        }
        if ((i14 & 2) == 0) {
            this.tripId = null;
        } else {
            this.tripId = l15;
        }
        if ((i14 & 4) == 0) {
            this.tripStartDate = null;
        } else {
            this.tripStartDate = str;
        }
        if ((i14 & 8) == 0) {
            this.tripEndDate = null;
        } else {
            this.tripEndDate = str2;
        }
        if ((i14 & 16) == 0) {
            this.calendarDate = null;
        } else {
            this.calendarDate = str3;
        }
        if ((i14 & 32) == 0) {
            this.bodyClockDifference = null;
        } else {
            this.bodyClockDifference = num;
        }
        if ((i14 & 64) == 0) {
            this.bodyClockShiftFeedback = null;
        } else {
            this.bodyClockShiftFeedback = str4;
        }
        if ((i14 & 128) == 0) {
            this.bodyClockFeedback = null;
        } else {
            this.bodyClockFeedback = str5;
        }
        if ((i14 & 256) == 0) {
            this.severity = -1;
        } else {
            this.severity = i15;
        }
        if ((i14 & 512) == 0) {
            this.severityFeedback = null;
        } else {
            this.severityFeedback = str6;
        }
        if ((i14 & 1024) == 0) {
            this.severityPercentage = null;
        } else {
            this.severityPercentage = num2;
        }
        if ((i14 & 2048) == 0) {
            this.travelDirection = null;
        } else {
            this.travelDirection = str7;
        }
        if ((i14 & 4096) == 0) {
            this.suggestions = null;
        } else {
            this.suggestions = list;
        }
        if ((i14 & 8192) == 0) {
            this.currentLocation = null;
        } else {
            this.currentLocation = str8;
        }
        if ((i14 & 16384) == 0) {
            this.currentTimezone = null;
        } else {
            this.currentTimezone = str9;
        }
        if ((32768 & i14) == 0) {
            this.userTimezoneOffset = null;
        } else {
            this.userTimezoneOffset = num3;
        }
        if ((i14 & 65536) == 0) {
            this.flights = null;
        } else {
            this.flights = list2;
        }
    }

    public f(Long l14, Long l15, String str, String str2, String str3, Integer num, String str4, String str5, int i14, String str6, Integer num2, String str7, List<l> list, String str8, String str9, Integer num3, List<j> list2) {
        this.dailyStatusId = l14;
        this.tripId = l15;
        this.tripStartDate = str;
        this.tripEndDate = str2;
        this.calendarDate = str3;
        this.bodyClockDifference = num;
        this.bodyClockShiftFeedback = str4;
        this.bodyClockFeedback = str5;
        this.severity = i14;
        this.severityFeedback = str6;
        this.severityPercentage = num2;
        this.travelDirection = str7;
        this.suggestions = list;
        this.currentLocation = str8;
        this.currentTimezone = str9;
        this.userTimezoneOffset = num3;
        this.flights = list2;
    }

    public f() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Integer) null, (String) null, (List) null, (String) null, (String) null, (Integer) null, (List) null, 131071, (p005kotlin.jvm.internal.j) null);
    }
}
