package com.garmin.android.apps.connectmobile.calendar.model;

import am.x0;
import am.y0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.j0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.maps.android.BuildConfig;
import com.nimbusds.jose.shaded.gson.internal.a;
import d53.u;
import java.lang.reflect.Type;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.u0;
import ps.z1;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(CalendarItemDeserializer.class)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u0003:\u0004&'()B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bBo\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0004\u0010\u0018Bs\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u0004\u0010\u001fBy\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010!B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u0004\u0010$¨\u0006*"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "", "Landroid/os/Parcelable;", "<init>", "()V", "", TtmlNode.ATTR_ID, "(J)V", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;", "itemType", "userProfileId", "", "date", "", "activityTypeId", "activityTypeKey", "activitySubTypeKey", "startTimestampLocal", "endTimestampLocal", "startTimestampGMT", "endTimestampGMT", "", "duration", "(Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "distanceInMeters", "activityId", "activityName", "calories", "caloriesUnit", "avgRespirationRate", "(Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;Ljava/lang/String;ILjava/lang/String;DDJLjava/lang/String;JID)V", "activeSets", "(Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DDJLjava/lang/String;JIDI)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "CREATOR", "b", "c", "CalendarItemDeserializer", "a", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CalendarItemDTO extends s1 implements Comparable<CalendarItemDTO>, Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final DateTimeFormatter P1 = DateTimeFormat.forPattern("yyyy-MM-dd");
    public static final DateTimeFormatter Q1 = DateTimeFormat.forPattern("yyyy-MM-dd");
    public int A;
    public double A1;
    public int B;
    public double B1;
    public int C;
    public int C1;
    public double D;
    public int D1;
    public int E;
    public String E1;
    public String F;
    public double F1;
    public double G1;
    public int H0;
    public String H1;
    public int I;
    public int I0;
    public boolean I1;
    public String J0;
    public boolean J1;
    public int K0;
    public z1 K1;
    public int L0;
    public long L1;
    public String M0;
    public String M1;
    public int N0;
    public fg0.d N1;
    public int O0;
    public String O1;
    public int P;
    public int P0;
    public double Q0;
    public String R0;
    public String S0;
    public String T;
    public long T0;
    public long U0;
    public String V0;
    public String W0;
    public int X;
    public String X0;
    public int Y;
    public String Y0;
    public double Z;
    public long Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f30967a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public long f30968a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30969b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f30970b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30971c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Date f30972c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f30973d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f30974d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30975e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f30976e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30977f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public double f30978f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30979g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f30980g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f30981h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public double f30982h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f30983i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f30984i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f30985j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f30986j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30987k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f30988k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f30989k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f30990l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f30991l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f30992m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public long f30993m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f30994n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f30995n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30996o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f30997o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f30998p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f30999p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f31000q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f31001q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f31002r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public double f31003r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f31004s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f31005t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public double f31006t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public long f31007u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f31008v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public u0 f31009v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31010w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public double f31011w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f31012x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public double f31013x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f31014y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public double f31015y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f31016z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public String f31017z1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$CalendarItemDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "<init>", "()V", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CalendarItemDeserializer implements JsonDeserializer<CalendarItemDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final CalendarItemDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            a.p(jsonElement, type, jsonDeserializationContext);
            try {
                CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                calendarItemDTO.m(jsonElement.toString());
                return calendarItemDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31048a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.MOVE_IQ_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.TRAINING_PLAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31048a = iArr;
        }
    }

    public CalendarItemDTO(Parcel parcel) {
        parcel.getClass();
        this.f30973d = b.UNKNOWN;
        this.f30987k = 1;
        this.f30998p = c.UNKNOWN;
        this.f30986j1 = -1;
        this.f30989k1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.f30967a = parcel.readLong();
        this.f30969b = parcel.readLong();
        this.f30971c = parcel.readLong();
        I(parcel.readString());
        this.f30975e = parcel.readInt();
        this.f30977f = parcel.readString();
        this.f30979g = parcel.readString();
        this.f30981h = parcel.readDouble();
        this.f30983i = parcel.readDouble();
        this.f30985j = parcel.readLong();
        this.M0 = parcel.readString();
        this.f30987k = parcel.readInt();
        this.f30990l = parcel.readDouble();
        this.f30992m = parcel.readDouble();
        this.f30994n = parcel.readLong();
        this.f30996o = parcel.readString();
        M(parcel.readString());
        this.f31000q = parcel.readString();
        this.f31002r = parcel.readInt() == 1;
        this.f31005t = parcel.readInt() == 1;
        this.f31008v = parcel.readLong();
        this.f31010w = parcel.readInt() == 1;
        this.f31012x = parcel.readInt();
        this.f31014y = parcel.readString();
        this.f31016z = parcel.readInt();
        this.A = parcel.readInt();
        this.D = parcel.readDouble();
        this.E = parcel.readInt();
        this.F = parcel.readString();
        this.I = parcel.readInt();
        this.P = parcel.readInt();
        this.T = parcel.readString();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readDouble();
        this.K0 = parcel.readInt();
        this.L0 = parcel.readInt();
        this.N0 = parcel.readInt();
        this.O0 = parcel.readInt();
        this.P0 = parcel.readInt();
        this.Q0 = parcel.readDouble();
        this.R0 = parcel.readString();
        this.S0 = parcel.readString();
        this.T0 = parcel.readLong();
        this.U0 = parcel.readLong();
        this.V0 = parcel.readString();
        this.W0 = parcel.readString();
        this.X0 = parcel.readString();
        this.Y0 = parcel.readString();
        this.Z0 = parcel.readLong();
        this.f30968a1 = parcel.readLong();
        this.f30970b1 = parcel.readString();
        this.f30972c1 = new Date(parcel.readLong());
        this.f30974d1 = parcel.readInt() == 1;
        this.f30976e1 = parcel.readInt() == 1;
        this.f30978f1 = parcel.readDouble();
        this.f30980g1 = parcel.readLong();
        this.f30982h1 = parcel.readDouble();
        this.f30984i1 = parcel.readInt();
        this.f30986j1 = parcel.readInt();
        this.f30989k1 = parcel.readInt();
        this.f30991l1 = parcel.readLong();
        this.f30995n1 = parcel.readInt() == 1;
        this.f30993m1 = parcel.readLong();
        this.f30997o1 = parcel.readInt() == 1;
        this.f30999p1 = parcel.readInt();
        this.f31001q1 = parcel.readInt();
        this.f31003r1 = parcel.readDouble();
        this.f31004s1 = parcel.readInt();
        this.f31006t1 = parcel.readDouble();
        this.f31007u1 = parcel.readLong();
        this.f31009v1 = (u0) parcel.readParcelable(u0.class.getClassLoader());
        this.f31011w1 = parcel.readDouble();
        this.f31013x1 = parcel.readDouble();
        this.f31015y1 = parcel.readDouble();
        this.B1 = parcel.readDouble();
        this.F1 = parcel.readDouble();
        this.G1 = parcel.readDouble();
        this.f31017z1 = parcel.readString();
        this.A1 = parcel.readDouble();
        this.C1 = parcel.readInt();
        this.D1 = parcel.readInt();
        this.E1 = parcel.readString();
        this.H1 = parcel.readString();
        this.I1 = parcel.readInt() == 1;
        this.J1 = parcel.readInt() == 1;
        this.N1 = (fg0.d) parcel.readParcelable(fg0.d.class.getClassLoader());
        this.K1 = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.L1 = parcel.readLong();
        this.M1 = parcel.readString();
        this.H0 = parcel.readInt();
        this.I0 = parcel.readInt();
        this.J0 = parcel.readString();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.O1 = parcel.readString();
    }

    public final x0 C() {
        x0 x0VarM = z0.m(this.R0);
        return x0VarM == null ? z0.k(this.f30975e, x0.f4346x) : x0VarM;
    }

    public final DateTime D() {
        DateTime dateTimeK = j0.K(this.f30979g, "yyyy-MM-dd");
        if (dateTimeK != null) {
            return dateTimeK;
        }
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        return dateTimeNow;
    }

    public final double F() {
        int i14 = d.f31048a[this.f30973d.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? this.f30981h : this.f30981h * ((double) 60);
        }
        return this.f30981h / ((double) 1000);
    }

    public final boolean G() {
        return this.f30973d == b.WORKOUT && this.f30991l1 > 0;
    }

    public final void H(DateTime dateTime) {
        DateTimeFormatter dateTimeFormatter = Q1;
        dateTimeFormatter.getClass();
        this.f30979g = j0.h(dateTime, dateTimeFormatter);
    }

    public final void I(String str) {
        b.a aVar = b.f31018b;
        b bVar = b.UNKNOWN;
        aVar.getClass();
        bVar.getClass();
        w13.c cVar = b.D;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            b bVar2 = (b) bVarN.next();
            if (u.q(bVar2.f31041a, str, true)) {
                bVar = bVar2;
                break;
            }
        }
        this.f30973d = bVar;
    }

    public final void M(String str) {
        c.a aVar = c.f31042b;
        c cVar = c.UNKNOWN;
        aVar.getClass();
        cVar.getClass();
        w13.c cVar2 = c.f31046f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
        while (bVarN.hasNext()) {
            c cVar3 = (c) bVarN.next();
            if (s.g(cVar3.f31047a, str)) {
                cVar = cVar3;
                break;
            }
        }
        this.f30998p = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(CalendarItemDTO calendarItemDTO) {
        DateTime dateTime;
        CalendarItemDTO calendarItemDTO2 = calendarItemDTO;
        calendarItemDTO2.getClass();
        b bVar = this.f30973d;
        b bVar2 = calendarItemDTO2.f30973d;
        dateTime = null;
        DateTime dateTime2 = null;
        if (bVar != bVar2) {
            if (bVar != null) {
                if (bVar2 != null) {
                    int iOrdinal = bVar.ordinal();
                    b bVar3 = calendarItemDTO2.f30973d;
                    Integer numValueOf = bVar3 != null ? Integer.valueOf(bVar3.ordinal()) : null;
                    if (numValueOf != null) {
                        return iOrdinal - numValueOf.intValue();
                    }
                }
                return -1;
            }
            return 1;
        }
        String str = this.f30979g;
        if (str == null && calendarItemDTO2.f30979g == null) {
            return 0;
        }
        if (str != null) {
            if (calendarItemDTO2.f30979g != null) {
                DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
                try {
                    dateTime = DateTime.parse(this.f30979g, dateTimeFormatterForPattern);
                    try {
                        dateTime2 = DateTime.parse(calendarItemDTO2.f30979g, dateTimeFormatterForPattern);
                    } catch (IllegalInstantException e4) {
                        e = e4;
                        i2.a aVar = i2.f36769a;
                        String str2 = this.f30979g;
                        String str3 = calendarItemDTO2.f30979g;
                        String localizedMessage = e.getLocalizedMessage();
                        StringBuilder sbI = p6.b.i("Illegal instant [", str2, "] and/or [", str3, " ]");
                        sbI.append(localizedMessage);
                        i2.a.j(aVar, "CalendarItemDTO", sbI.toString());
                    } catch (IllegalArgumentException e14) {
                        e = e14;
                        i2.a aVar2 = i2.f36769a;
                        String str4 = this.f30979g;
                        String str5 = calendarItemDTO2.f30979g;
                        String localizedMessage2 = e.getLocalizedMessage();
                        StringBuilder sbI2 = p6.b.i("Illegal argument [", str4, "] and/or [", str5, " ]");
                        sbI2.append(localizedMessage2);
                        i2.a.j(aVar2, "CalendarItemDTO", sbI2.toString());
                    }
                } catch (IllegalInstantException e15) {
                    e = e15;
                    dateTime = null;
                } catch (IllegalArgumentException e16) {
                    e = e16;
                    dateTime = null;
                }
                if (dateTime == null && dateTime2 == null) {
                    return 0;
                }
                if (dateTime == null) {
                    return 1;
                }
                if (dateTime2 == null) {
                    return -1;
                }
                return dateTime.compareTo((ReadableInstant) dateTime2);
            }
            return -1;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        Date date;
        jSONObject.getClass();
        this.f30967a = jSONObject.optLong(TtmlNode.ATTR_ID);
        this.f30969b = jSONObject.optLong("groupId");
        this.f30971c = jSONObject.optLong("trainingPlanId");
        I(s1.u(jSONObject, "itemType"));
        this.f30975e = jSONObject.optInt("activityTypeId");
        this.f30977f = s1.u(jSONObject, "title");
        this.f30979g = s1.u(jSONObject, jSONObject.has("date") ? "date" : "calendarDate");
        this.f30981h = jSONObject.optDouble("duration");
        this.f30983i = jSONObject.optDouble("distance");
        this.f30985j = jSONObject.optLong("calories");
        this.M0 = s1.u(jSONObject, "categoryName");
        this.f30990l = jSONObject.optDouble("weight");
        this.f30992m = jSONObject.optDouble("difference");
        this.f30994n = jSONObject.optLong("courseId");
        this.f30996o = s1.u(jSONObject, "courseName");
        M(s1.u(jSONObject, "sportTypeKey"));
        this.f31000q = s1.u(jSONObject, "url");
        this.f31002r = jSONObject.optBoolean("isStart");
        this.f31005t = jSONObject.optBoolean("isRace");
        this.f31008v = jSONObject.optLong("recurrenceId");
        this.f31010w = jSONObject.optBoolean("isParent");
        this.f31012x = jSONObject.optInt("parentId");
        this.f31014y = s1.u(jSONObject, "autoCalcCalories");
        this.f31016z = jSONObject.optInt("step", -1);
        this.A = jSONObject.optInt("stepGoal", -1);
        this.B = jSONObject.optInt("pushes", -1);
        this.C = jSONObject.optInt("pushesGoal", -1);
        this.D = jSONObject.optDouble("sleepDuration");
        this.E = jSONObject.optInt("sleepScore");
        this.F = s1.u(jSONObject, "qualifierKey");
        this.I = jSONObject.optInt("actualNeed");
        this.P = jSONObject.optInt("nextActualNeed");
        this.T = jSONObject.optString("napStartTimeLocal");
        this.X = jSONObject.optInt("minHeartRate");
        this.Y = jSONObject.optInt("maxHeartRate");
        this.Z = jSONObject.optDouble("averageHR");
        this.K0 = jSONObject.optInt("systolic");
        this.L0 = jSONObject.optInt("diastolic");
        this.N0 = jSONObject.optInt("noOfMeasurements");
        this.O0 = jSONObject.optInt("averageStressLevel", -1);
        this.P0 = jSONObject.optInt("maxStressLevel", -1);
        this.Q0 = jSONObject.optDouble("differenceStress");
        this.R0 = s1.u(jSONObject, "activityType");
        String strU = s1.u(jSONObject, "activitySubType");
        this.S0 = strU;
        String str = this.R0;
        Date date2 = null;
        y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
        if (strU != null && !TextUtils.isEmpty(strU)) {
            this.f30975e = y0Var.c(strU);
        } else if (str != null && !TextUtils.isEmpty(str)) {
            this.f30975e = y0Var.c(str);
        }
        this.T0 = jSONObject.optLong("userProfilePk");
        this.U0 = jSONObject.optLong("deviceId");
        this.V0 = jSONObject.optString("startTimestampGMT");
        this.W0 = jSONObject.optString("endTimestampGMT");
        this.X0 = jSONObject.optString("startTimestampLocal");
        this.Y0 = jSONObject.optString("endTimestampLocal");
        this.Z0 = jSONObject.optLong("userBadgeId");
        this.f30968a1 = jSONObject.optLong("badgeCategoryTypeId");
        this.f30970b1 = jSONObject.optString("badgeCategoryTypeDesc");
        String strOptString = jSONObject.optString("badgeAwardedDate");
        if ((!TextUtils.isEmpty(strOptString)) & (!BuildConfig.TRAVIS.equalsIgnoreCase(strOptString))) {
            try {
                date = P1.parseDateTime(strOptString).toDate();
            } catch (IllegalArgumentException unused) {
                strOptString.getClass();
                try {
                    date2 = new Date(Long.parseLong(strOptString));
                } catch (IllegalArgumentException unused2) {
                }
                date = date2;
            }
            this.f30972c1 = date;
        }
        this.f30974d1 = jSONObject.optBoolean("badgeViewed");
        this.f30976e1 = jSONObject.optBoolean("hideBadge");
        this.f30978f1 = jSONObject.optDouble("maxDepth");
        this.f30980g1 = jSONObject.optLong("lapCount");
        this.f30982h1 = jSONObject.optDouble("bottomTime");
        this.f30984i1 = jSONObject.optInt("diveCount");
        this.f30986j1 = jSONObject.optInt("bodyBatteryCharged", -1);
        this.f30989k1 = jSONObject.optInt("bodyBatteryDrained", -1);
        this.f30991l1 = jSONObject.optLong("atpPlanId");
        this.f30993m1 = jSONObject.optLong("workoutId");
        this.f30997o1 = jSONObject.optBoolean("protectedWorkoutSchedule");
        this.f30999p1 = jSONObject.optInt("phase");
        this.f31001q1 = jSONObject.optInt("dayInCycle");
        this.f31003r1 = jSONObject.optDouble("avgRespirationRate");
        this.f31004s1 = jSONObject.optInt("activeSets");
        this.f31006t1 = jSONObject.optDouble("strokes");
        this.f31007u1 = jSONObject.optLong("noOfSplits", 0L);
        if (jSONObject.has("maxGradeValue")) {
            this.f31009v1 = (u0) new Gson().fromJson(jSONObject.getString("maxGradeValue"), u0.class);
        }
        this.f31011w1 = jSONObject.optDouble("maxSpeed");
        this.f31013x1 = jSONObject.optDouble("maxSplitDistance");
        this.f31015y1 = jSONObject.optDouble("activeSplitSummaryDistance");
        this.B1 = jSONObject.optDouble("floorsClimbed");
        this.F1 = jSONObject.optDouble("beginPackWeight");
        this.G1 = jSONObject.optDouble("maxPackWeight");
        this.f31017z1 = jSONObject.optString("splitSummaryMode");
        this.A1 = jSONObject.optDouble("totalAscent");
        this.C1 = jSONObject.optInt("moderateIntensityMinutes", -1);
        this.D1 = jSONObject.optInt("vigorousIntensityMinutes", -1);
        this.E1 = jSONObject.optString("wellnessActivityUuid");
        this.H1 = jSONObject.optString("shareableEventUuid");
        this.I1 = jSONObject.optBoolean("shareableEvent");
        this.J1 = jSONObject.optBoolean("primaryEvent");
        if (!jSONObject.isNull("completionTarget")) {
            this.N1 = (fg0.d) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("completionTarget").toString(), fg0.d.class);
        }
        if (!jSONObject.isNull("unitOfPoolLength")) {
            this.K1 = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("unitOfPoolLength").toString(), z1.class);
        }
        this.L1 = jSONObject.optLong("jetLagTripId", -1L);
        this.M1 = jSONObject.optString("tripDestination");
        this.I0 = jSONObject.optInt("weeklyAvg");
        this.H0 = jSONObject.optInt("lastNightAvg");
        this.J0 = jSONObject.optString("status");
        this.O1 = jSONObject.optString("workoutUuid");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f30967a);
        parcel.writeLong(this.f30969b);
        parcel.writeLong(this.f30971c);
        parcel.writeString(this.f30973d.f31041a);
        parcel.writeInt(this.f30975e);
        parcel.writeString(this.f30977f);
        parcel.writeString(this.f30979g);
        parcel.writeDouble(this.f30981h);
        parcel.writeDouble(this.f30983i);
        parcel.writeLong(this.f30985j);
        parcel.writeString(this.M0);
        parcel.writeInt(this.f30987k);
        parcel.writeDouble(this.f30990l);
        parcel.writeDouble(this.f30992m);
        parcel.writeLong(this.f30994n);
        parcel.writeString(this.f30996o);
        parcel.writeString(this.f30998p.f31047a);
        parcel.writeString(this.f31000q);
        parcel.writeInt(this.f31002r ? 1 : 0);
        parcel.writeInt(this.f31005t ? 1 : 0);
        parcel.writeLong(this.f31008v);
        parcel.writeInt(this.f31010w ? 1 : 0);
        parcel.writeInt(this.f31012x);
        parcel.writeString(this.f31014y);
        parcel.writeInt(this.f31016z);
        parcel.writeInt(this.A);
        parcel.writeDouble(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.I);
        parcel.writeInt(this.P);
        parcel.writeString(this.T);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeDouble(this.Z);
        parcel.writeInt(this.K0);
        parcel.writeInt(this.L0);
        parcel.writeInt(this.N0);
        parcel.writeInt(this.O0);
        parcel.writeInt(this.P0);
        parcel.writeDouble(this.Q0);
        parcel.writeString(this.R0);
        parcel.writeString(this.S0);
        parcel.writeLong(this.T0);
        parcel.writeLong(this.U0);
        parcel.writeString(this.V0);
        parcel.writeString(this.W0);
        parcel.writeString(this.X0);
        parcel.writeString(this.Y0);
        parcel.writeLong(this.Z0);
        parcel.writeLong(this.f30968a1);
        parcel.writeString(this.f30970b1);
        Date date = this.f30972c1;
        long time = 0;
        if (date != null && date != null) {
            time = date.getTime();
        }
        parcel.writeLong(time);
        parcel.writeInt(this.f30974d1 ? 1 : 0);
        parcel.writeInt(this.f30976e1 ? 1 : 0);
        parcel.writeDouble(this.f30978f1);
        parcel.writeLong(this.f30980g1);
        parcel.writeDouble(this.f30982h1);
        parcel.writeInt(this.f30984i1);
        parcel.writeInt(this.f30986j1);
        parcel.writeInt(this.f30989k1);
        parcel.writeLong(this.f30991l1);
        parcel.writeInt(this.f30995n1 ? 1 : 0);
        parcel.writeLong(this.f30993m1);
        parcel.writeInt(this.f30997o1 ? 1 : 0);
        parcel.writeInt(this.f30999p1);
        parcel.writeInt(this.f31001q1);
        parcel.writeDouble(this.f31003r1);
        parcel.writeInt(this.f31004s1);
        parcel.writeDouble(this.f31006t1);
        parcel.writeLong(this.f31007u1);
        parcel.writeParcelable(this.f31009v1, 0);
        parcel.writeDouble(this.f31011w1);
        parcel.writeDouble(this.f31013x1);
        parcel.writeDouble(this.f31015y1);
        parcel.writeDouble(this.B1);
        parcel.writeDouble(this.F1);
        parcel.writeDouble(this.G1);
        parcel.writeString(this.f31017z1);
        parcel.writeDouble(this.A1);
        parcel.writeInt(this.C1);
        parcel.writeInt(this.D1);
        parcel.writeString(this.E1);
        parcel.writeString(this.H1);
        parcel.writeInt(this.I1 ? 1 : 0);
        parcel.writeInt(this.J1 ? 1 : 0);
        parcel.writeParcelable(this.N1, i14);
        parcel.writeParcelable(this.K1, i14);
        parcel.writeLong(this.L1);
        parcel.writeString(this.M1);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeString(this.J0);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.O1);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO$b[], still in use, count: 1, list:
      (r0v25 com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO$b[]) from 0x0168: CONSTRUCTOR (r0v25 com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        ACTIVITY("activity"),
        HEALTH_SNAPSHOT("wellnessActivity"),
        ECG("ecg"),
        MOVE_IQ_EVENT("MOVE_IQ_EVENT"),
        HEART_RATE("HEART_RATE"),
        HRV_STATUS("hrvStatus"),
        BODY_BATTERY("BODY_BATTERY"),
        STRESS("STRESS"),
        PUSHES("PUSHES"),
        STEPS("STEPS"),
        SLEEP("SLEEP"),
        SLEEP_AND_SCORE("SLEEP_AND_SCORE"),
        NAP("nap"),
        SLEEP_COACH("SLEEP_COACH"),
        JET_LAG_TRIP("jetLagTrip"),
        BLOOD_PRESSURE("bloodpressure"),
        WEIGHT("weight"),
        EVENT("event"),
        WORKOUT("workout"),
        FBT_ADAPTIVE_WORKOUT("fbtAdaptiveWorkout"),
        TRAINING_PLAN("trainingPlan"),
        NOTE("note"),
        /* JADX INFO: Fake field, exist only in values array */
        GOAL("goal"),
        MENSTRUAL_CYCLE("menstrualCycleSummary"),
        UNKNOWN(PrivacyUpdateRequestError.UNKNOWN);

        public static final /* synthetic */ w13.c D;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f31018b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31041a;

        static {
            D = new w13.c(new b[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1});
        }

        private b(String str) {
            super(str, i);
            this.f31041a = str;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) C.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$b$a;", "", "<init>", "()V", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO$c[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO$c[]) from 0x0048: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$c;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        UNKNOWN(PrivacyUpdateRequestError.UNKNOWN),
        /* JADX INFO: Fake field, exist only in values array */
        RUNNING("running"),
        /* JADX INFO: Fake field, exist only in values array */
        CYCLING("cycling"),
        /* JADX INFO: Fake field, exist only in values array */
        STEPS("steps"),
        MULTISPORT("multi_sport"),
        /* JADX INFO: Fake field, exist only in values array */
        OTHER("other");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f31042b = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f31046f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31047a;

        static {
            f31046f = new w13.c(new c[]{r0, r1, r2, r3, r4, new c("other")});
        }

        private c(String str) {
            super(str, i);
            this.f31047a = str;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f31045e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$c$a;", "", "<init>", "()V", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bd\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0007R\u0014\u0010'\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0007R\u0014\u0010)\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0007R\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0007R\u0014\u0010-\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0007R\u0014\u0010/\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0007R\u0014\u00101\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0007R\u0014\u00103\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0007R\u0014\u00105\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0007R\u0014\u00107\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u0007R\u0014\u00109\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0007R\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\u0007R\u0014\u0010=\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010\u0007R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010\u0007R\u0014\u0010A\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\u0007R\u0014\u0010C\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010\u0007R\u0014\u0010D\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010\u0007R\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010\u0007R\u0014\u0010F\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010\u0007R\u0014\u0010G\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010\u0007R\u0014\u0010H\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010\u0007R\u0014\u0010I\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010\u0007R\u0014\u0010J\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010\u0007R\u0014\u0010K\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010\u0007R\u0014\u0010L\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010\u0007R\u0014\u0010M\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010\u0007R\u0014\u0010N\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010\u0007R\u0014\u0010O\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010\u0007R\u0014\u0010P\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010\u0007R\u0014\u0010Q\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010\u0007R\u0014\u0010R\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010\u0007R\u0014\u0010S\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010\u0007R\u0014\u0010T\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010\u0007R\u0014\u0010U\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010\u0007R\u0014\u0010V\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010\u0007R\u0014\u0010W\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010\u0007R\u0014\u0010X\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010\u0007R\u0014\u0010Y\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010\u0007R\u0014\u0010Z\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010\u0007R\u0014\u0010[\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010\u0007R\u0014\u0010\\\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010\u0007R\u0014\u0010]\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010\u0007R\u0014\u0010^\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010\u0007R\u0014\u0010_\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010\u0007R\u0014\u0010`\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010\u0007R\u0014\u0010a\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010\u0007R\u0014\u0010b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010\u0007R\u0014\u0010c\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010\u0007R\u0014\u0010d\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010\u0007R\u0014\u0010e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010\u0007R\u0014\u0010f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010\u0007R\u0014\u0010g\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010\u0007R\u0014\u0010h\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010\u0007R\u0014\u0010i\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010\u0007R\u0014\u0010j\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010\u0007R\u0014\u0010k\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010\u0007¨\u0006l"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO$a;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "CONNECT_DATE_FORMAT", "Lorg/joda/time/format/DateTimeFormatter;", "SHORT_DATE_TIME_FORMAT", "ID_PK", "GROUP_ID_PK", "TRAINING_PLAN_ID_PK", "ITEM_TYPE_PK", "ACTIVITY_TYPE_ID_PK", "TITLE_PK", "DATE_PK", "DURATION_PK", "DISTANCE_PK", "CALORIES_PK", "WEIGHT_PK", "DIFFERENCE_PK", "COURSE_ID_PK", "COURSE_NAME_PK", "SPORT_TYPE_KEY_PK", "URL_PK", "IS_START_PK", "IS_RACE_PK", "RECURRENCE_ID_PK", "IS_PARENT_PK", "PARENT_ID_PK", "AUTO_CALC_CALORIES_PK", "USER_BADGE_ID_PK", "BADGE_TYPE_ID_PK", "BADGE_TYPE_DESC_PK", "BADGE_AWARDED_DATE_PK", "BADGE_VIEWED_PK", "HIDE_BADGE_PK", "MIN_HEART_RATE_PK", "MAX_HEART_RATE_PK", "AVG_HEART_RATE_PK", "STEP_PK", "STEP_GOAL_PK", "PUSH_PK", "PUSH_GOAL_PK", "SLEEP_DURATION_PK", "SLEEP_SCORE_PK", "SLEEP_SCORE_QUALIFIER_PK", "SLEEP_ACTUAL_NEED", "SLEEP_NEXT_ACTUAL_NEED", "NAP_START_TIME_LOCAL", "AVERAGE_STRESS_LEVEL_PK", "MAX_STRESS_LEVEL_PK", "DIFFERENCE_STRESS_PK", "CALENDAR_DATE_PK", "ACTIVITY_TYPE_PK", "ACTIVITY_SUBTYPE_PK", "USER_PROFILE_ID_PK", "DEVICE_ID_PK", "START_TIMESTAMP_GMT_PK", "END_TIMESTAMP_GMT_PK", "START_TIMESTAMP_LOCAL_PK", "END_TIMESTAMP_LOCAL_PK", "MAX_DEPTH_PK", "LAP_COUNT_PK", "BOTTOM_TIME_PK", "DIVE_COUNT_PK", "BODY_BATTERY_CHARGED_PK", "BODY_BATTERY_DRAINED_PK", "ATP_PLAN_ID", "WORKOUT_ID", "PROTECTED_WORKOUT_SCHEDULE", "MAX_SPEED_KEY", "MAX_SPLIT_DISTANCE_KEY", "ACTIVE_SPLIT_SUMMARY_DISTANCE", "SPLIT_SUMMARY_MODE", "TOTAL_ASCENT_KEY", "PHASE", "DAY_IN_CYCLE", "AVG_RESPIRATION_RATE", "ACTIVE_SETS", "STROKES", "KEY_NO_OF_SPLITS", "KEY_MAX_GRADE_VALUE", "FLOOR_CLIMBED", "PACK_WEIGHT", "MAX_PACK_WEIGHT", "MODERATE_INTENSITY_MINUTES", "VIGOROUS_INTENSITY_MINUTES", "WELLNESS_ACTIVITY_UUID", "UNIT_OF_POOL_LENGTH", "SHAREABLE_EVENT_UUID", "SHAREABLE_EVENT", "PRIMARY_EVENT", "COMPLETION_TARGET", "BLOOD_PRESSURE_SYSTOLIC_PK", "BLOOD_PRESSURE_DIASTOLIC_PK", "BLOOD_PRESSURE_CATEGORY_PK", "BLOOD_PRESSURE_NUMBER_OF_MEASUREMENTS_PK", "JET_LAG_TRIP_ID", "JET_LAG_TRIP_DESTINATION", "LAST_NIGHT_AVG_PK", "WEEKLY_AVG_PK", "STATUS_PK", "WORKOUT_UUID", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalendarItemDTO> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarItemDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CalendarItemDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarItemDTO[] newArray(int i14) {
            return new CalendarItemDTO[i14];
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarItemDTO(b bVar, String str, int i14, String str2, double d14, double d15) {
        this(bVar, str, i14, str2, d14, d15, 0L, (String) null, 0L, 0, 0.0d, 1984, (j) null);
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarItemDTO(b bVar, String str, int i14, String str2, double d14, double d15, long j8) {
        this(bVar, str, i14, str2, d14, d15, j8, (String) null, 0L, 0, 0.0d, 1920, (j) null);
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarItemDTO(b bVar, String str, int i14, String str2, double d14, double d15, long j8, String str3) {
        this(bVar, str, i14, str2, d14, d15, j8, str3, 0L, 0, 0.0d, 1792, (j) null);
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarItemDTO(b bVar, String str, int i14, String str2, double d14, double d15, long j8, String str3, long j14) {
        this(bVar, str, i14, str2, d14, d15, j8, str3, j14, 0, 0.0d, 1536, (j) null);
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarItemDTO(b bVar, String str, int i14, String str2, double d14, double d15, long j8, String str3, long j14, int i15) {
        this(bVar, str, i14, str2, d14, d15, j8, str3, j14, i15, 0.0d, 1024, (j) null);
        bVar.getClass();
    }

    public CalendarItemDTO() {
        this.f30973d = b.UNKNOWN;
        this.f30987k = 1;
        this.f30998p = c.UNKNOWN;
        this.f30986j1 = -1;
        this.f30989k1 = -1;
        this.C1 = -1;
        this.D1 = -1;
    }

    public CalendarItemDTO(long j8) {
        this.f30973d = b.UNKNOWN;
        this.f30987k = 1;
        this.f30998p = c.UNKNOWN;
        this.f30986j1 = -1;
        this.f30989k1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.f30967a = j8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarItemDTO(b bVar, long j8, String str, int i14, String str2, String str3, String str4, String str5, String str6, String str7, double d14) {
        this(bVar, str, i14, str4, d14, 0.0d, 0L, (String) null, 0L, 0, 0.0d, 1792, (j) null);
        bVar.getClass();
        this.T0 = j8;
        this.R0 = str2;
        this.S0 = str3;
        this.Y0 = str5;
        this.V0 = str6;
        this.W0 = str7;
    }

    public /* synthetic */ CalendarItemDTO(b bVar, String str, int i14, String str2, double d14, double d15, long j8, String str3, long j14, int i15, double d16, int i16, j jVar) {
        this(bVar, str, i14, str2, d14, (i16 & 32) != 0 ? 0.0d : d15, (i16 & 64) != 0 ? 0L : j8, (i16 & 128) != 0 ? null : str3, (i16 & 256) != 0 ? 0L : j14, (i16 & 512) != 0 ? 1 : i15, (i16 & 1024) != 0 ? 0.0d : d16);
    }

    public CalendarItemDTO(b bVar, String str, int i14, String str2, double d14, double d15, long j8, String str3, long j14, int i15, double d16) {
        bVar.getClass();
        this.f30973d = b.UNKNOWN;
        this.f30987k = 1;
        this.f30998p = c.UNKNOWN;
        this.f30986j1 = -1;
        this.f30989k1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.f30973d = bVar;
        this.f30979g = str;
        this.f30975e = i14;
        this.X0 = str2;
        this.f30981h = d14;
        this.f30983i = d15;
        this.f30967a = j8;
        this.f30977f = str3;
        this.f30985j = j14;
        this.f30987k = i15;
        this.f31003r1 = d16;
    }

    public CalendarItemDTO(b bVar, String str, int i14, String str2, String str3, double d14, double d15, long j8, String str4, long j14, int i15, double d16, int i16) {
        bVar.getClass();
        this.f30973d = b.UNKNOWN;
        this.f30987k = 1;
        this.f30998p = c.UNKNOWN;
        this.f30986j1 = -1;
        this.f30989k1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.f30973d = bVar;
        this.f30979g = str;
        this.f30975e = i14;
        this.R0 = str2;
        this.X0 = str3;
        this.f30981h = d14;
        this.f30983i = d15;
        this.f30967a = j8;
        this.f30977f = str4;
        this.f30985j = j14;
        this.f30987k = i15;
        this.f31003r1 = d16;
        this.f31004s1 = i16;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarItemDTO(b bVar, String str, int i14, String str2, double d14) {
        this(bVar, str, i14, str2, d14, 0.0d, 0L, (String) null, 0L, 0, 0.0d, 2016, (j) null);
        bVar.getClass();
    }
}
