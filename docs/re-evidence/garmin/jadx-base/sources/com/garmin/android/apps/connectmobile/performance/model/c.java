package com.garmin.android.apps.connectmobile.performance.model;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.gncs.NotificationConstants;
import e71.m;
import java.util.Arrays;
import java.util.LinkedHashMap;
import o61.n;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i;
import p005kotlin.jvm.internal.j;
import x61.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\u0011\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/c;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "in", "<init>", "(Landroid/os/Parcel;)V", "()V", "c", "b", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends s1 implements Parcelable {
    public double A;
    public double B;
    public boolean C;
    public boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DateTime f39943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f39945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f39946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f39950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f39951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f39954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f39956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39959r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39960t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f39961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f39962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f39963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f39964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public double f39965z;
    public static final b E = new b(null);
    public static final int F = 8;
    public static final Parcelable.Creator<c> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/performance/model/c$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/performance/model/c;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Parcel parcel) {
        parcel.getClass();
        this.f39959r = true;
        String string = parcel.readString();
        this.f39942a = string;
        this.f39943b = j0.K(string, "yyyy-MM-dd");
        this.f39944c = parcel.readString();
        this.f39945d = parcel.readDouble();
        this.f39946e = parcel.readDouble();
        this.f39947f = parcel.readString();
        this.f39948g = parcel.readString();
        this.f39949h = parcel.readLong();
        this.f39950i = parcel.readDouble();
        this.f39951j = parcel.readDouble();
        this.f39952k = parcel.readString();
        this.f39953l = parcel.readInt();
        this.f39954m = parcel.readLong();
        this.f39955n = parcel.readInt();
        this.f39956o = parcel.readString();
        this.f39957p = parcel.readInt() != 0;
        this.f39958q = parcel.readInt() != 0;
        this.f39960t = parcel.readInt();
        this.f39961v = parcel.readString();
        this.f39962w = parcel.readString();
        this.f39963x = parcel.readDouble();
        this.f39964y = parcel.readDouble();
        this.f39965z = parcel.readDouble();
        this.A = parcel.readDouble();
        this.B = parcel.readDouble();
        this.C = !(parcel.readDouble() == 0.0d);
        this.D = parcel.readInt() != 0;
    }

    public final DateTime C() {
        DateTime dateTime = this.f39943b;
        if (dateTime != null) {
            dateTime.getClass();
            return dateTime;
        }
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        return dateTimeNow;
    }

    public final Double D() {
        if (this.f39959r) {
            return null;
        }
        return Double.valueOf(this.A);
    }

    public final EnumC0736c F() {
        String str = this.f39952k;
        if (str != null) {
            EnumC0736c.f39966b.getClass();
            return EnumC0736c.a.a(str);
        }
        EnumC0736c.a aVar = EnumC0736c.f39966b;
        String str2 = this.f39947f;
        aVar.getClass();
        return EnumC0736c.a.a(str2);
    }

    public final m G() {
        if (this.f39959r || !bo1.a.a().c().e()) {
            m.a aVar = m.f63320c;
            double d14 = this.f39951j;
            double d15 = this.f39946e;
            double d16 = this.f39945d;
            aVar.getClass();
            return m.a.c(d14, d15, d16);
        }
        m.a aVar2 = m.f63320c;
        String str = this.f39961v;
        str.getClass();
        String str2 = this.f39962w;
        str2.getClass();
        aVar2.getClass();
        return m.a.b(str, str2);
    }

    public final int H() {
        String strName = this.f39956o;
        if (strName == null) {
            strName = com.garmin.android.apps.connectmobile.performance.model.b.a.b(com.garmin.android.apps.connectmobile.performance.model.b.f39921h, this.f39950i).name();
        }
        strName.getClass();
        h hVar = new h(strName);
        LinkedHashMap linkedHashMap = hVar.f189241b;
        String str = hVar.f189240a;
        if (((Integer) linkedHashMap.get(str)) == null) {
            return R.string.msg_training_status_no_data;
        }
        Integer num = (Integer) linkedHashMap.get(str);
        num.getClass();
        return num.intValue();
    }

    public final double I() {
        return !this.f39959r ? this.f39963x : this.f39951j;
    }

    public final n M() {
        String str = this.f39942a;
        String str2 = this.f39944c;
        Double dValueOf = Double.valueOf(this.f39951j);
        Double dValueOf2 = Double.valueOf(this.f39950i);
        long j8 = this.f39949h;
        long j14 = this.f39954m;
        Double dValueOf3 = Double.valueOf(this.f39946e);
        Double dValueOf4 = Double.valueOf(this.f39945d);
        Integer numValueOf = Integer.valueOf(this.f39955n);
        String str3 = this.f39947f;
        String str4 = this.f39948g;
        String str5 = this.f39952k;
        int i14 = this.f39953l;
        String str6 = this.f39956o;
        if (str6 == null) {
            str6 = "";
        }
        return new n(str, str2, dValueOf, dValueOf2, j8, j14, dValueOf3, dValueOf4, numValueOf, str3, str4, str5, i14, str6, this.f39957p, new o61.a(Integer.valueOf(this.f39960t), this.f39961v, this.f39962w, Integer.valueOf((int) this.f39963x), Double.valueOf(this.f39964y), Double.valueOf(this.f39965z), Integer.valueOf((int) this.A), Double.valueOf(this.B)), this.D);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String strU = s1.u(jSONObject, "calendarDate");
        this.f39942a = strU;
        this.f39943b = j0.K(strU, "yyyy-MM-dd");
        this.f39944c = s1.u(jSONObject, "sinceDate");
        this.f39945d = jSONObject.optDouble("loadTunnelMax");
        this.f39946e = jSONObject.optDouble("loadTunnelMin");
        this.f39947f = s1.u(jSONObject, "sport");
        this.f39948g = s1.u(jSONObject, "subSport");
        this.f39949h = jSONObject.optLong("timestamp");
        this.f39950i = jSONObject.optDouble("trainingStatus");
        this.f39951j = jSONObject.optDouble("weeklyTrainingLoad");
        this.f39952k = jSONObject.optString("fitnessTrendSport");
        this.f39953l = jSONObject.optInt("fitnessTrend");
        this.f39954m = jSONObject.optLong("deviceId", -1L);
        this.f39955n = jSONObject.optInt("loadLevelTrend");
        this.f39956o = s1.u(jSONObject, "trainingStatusFeedbackPhrase");
        this.f39957p = jSONObject.optBoolean("trainingPaused", false);
        this.D = jSONObject.optBoolean("primaryTrainingDevice", false);
        this.f39958q = jSONObject.has("acuteTrainingLoadDTO");
        boolean zIsNull = jSONObject.isNull("acuteTrainingLoadDTO");
        this.f39959r = zIsNull;
        if (zIsNull) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("acuteTrainingLoadDTO");
        this.f39960t = jSONObject2.optInt("acwrPercent");
        this.f39961v = jSONObject2.optString("acwrStatus");
        this.f39962w = jSONObject2.optString("acwrStatusFeedback");
        this.f39963x = jSONObject2.optDouble("dailyTrainingLoadAcute");
        this.f39964y = jSONObject2.optDouble("maxTrainingLoadChronic");
        this.f39965z = jSONObject2.optDouble("minTrainingLoadChronic");
        this.A = jSONObject2.optDouble("dailyTrainingLoadChronic");
        double dOptDouble = jSONObject2.optDouble("dailyAcuteChronicWorkloadRatio");
        this.B = dOptDouble;
        this.C = !Double.isNaN(dOptDouble);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f39942a);
        parcel.writeString(this.f39944c);
        parcel.writeDouble(this.f39945d);
        parcel.writeDouble(this.f39946e);
        parcel.writeString(this.f39947f);
        parcel.writeString(this.f39948g);
        parcel.writeLong(this.f39949h);
        parcel.writeDouble(this.f39950i);
        parcel.writeDouble(this.f39951j);
        parcel.writeString(this.f39952k);
        parcel.writeInt(this.f39953l);
        parcel.writeLong(this.f39954m);
        parcel.writeInt(this.f39955n);
        parcel.writeString(this.f39956o);
        parcel.writeInt(this.f39957p ? 1 : 0);
        parcel.writeInt(this.f39958q ? 1 : 0);
        parcel.writeInt(this.f39960t);
        parcel.writeString(this.f39961v);
        parcel.writeString(this.f39962w);
        parcel.writeDouble(this.f39963x);
        parcel.writeDouble(this.f39964y);
        parcel.writeDouble(this.f39965z);
        parcel.writeDouble(this.A);
        parcel.writeDouble(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.performance.model.c$c[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.performance.model.c$c[]) from 0x0032: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.performance.model.c$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.model.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/c$c;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EnumC0736c {
        NONE(""),
        CYCLING("CYCLING"),
        RUNNING("RUNNING"),
        ROWING("ROWING");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f39966b = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f39972h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39973a;

        static {
            f39972h = new w13.c(new EnumC0736c[]{r0, r1, r2, r3});
        }

        private EnumC0736c(String str) {
            super(str, i);
            this.f39973a = str;
        }

        public static EnumC0736c valueOf(String str) {
            return (EnumC0736c) Enum.valueOf(EnumC0736c.class, str);
        }

        public static EnumC0736c[] values() {
            return (EnumC0736c[]) f39971g.clone();
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.model.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/c$c$a;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            public static EnumC0736c a(String str) {
                w13.c cVar = EnumC0736c.f39972h;
                cVar.getClass();
                Object objOrElse = Arrays.stream(i.d(cVar, new EnumC0736c[0])).filter(new a73.n(new o60.b(str, 1), 21)).findFirst().orElse(EnumC0736c.NONE);
                objOrElse.getClass();
                return (EnumC0736c) objOrElse;
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/c$b;", "", "<init>", "()V", "", "CALENDAR_DATE_KEY", "Ljava/lang/String;", "LOAD_TUNNEL_MAX_KEY", "LOAD_TUNNEL_MIN_KEY", "SPORT_KEY", "SUB_SPORT_KEY", "TIME_STAMP_KEY", "TRAINING_STATUS_KEY", "WEEKLY_TRAINING_LOAD_KEY", "TRAINING_STATUS_FEEDBACK_PHRASE_KEY", "DEVICE_ID", "LOAD_LEVEL_TREND", "FITNESS_TREND_SPORT", "FITNESS_TREND", "SINCE_CALENDAR_DATE_KEY", "TRAINING_STATUS_PAUSED", "ACUTE_LOAD_TRAINING_DTO", "ACUTE_LOAD_PERCENTAGE", "ACUTE_LOAD_STATUS", "ACUTE_LOAD_FEEDBACK", "ACUTE_LOAD_DAILY_TRAINING", "MAX_TRAINING_LOAD_CHRONIC", "MIN_TRAINING_LOAD_CHRONIC", "CHRONIC_LOAD_DAILY_TRAINING", "DAILY_ACUTE_CHRONIC_WORKLOAD_RATIO", "PRIMARY_TRAINING_DEVICE", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/performance/model/c;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public c() {
        this.f39959r = true;
    }
}
