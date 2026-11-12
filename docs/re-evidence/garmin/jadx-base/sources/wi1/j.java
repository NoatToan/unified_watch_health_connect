package wi1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lwi1/j;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "d", "c", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends s1 implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f185538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f185539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f185540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f185541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f185542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f185543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f185544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f185545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f185546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wi1.b f185547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public wi1.d f185548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f185549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f185550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f185551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f185552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f185553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f185554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f185555r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f185556t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f185557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g42.d f185558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f185559x;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"wi1/j$a", "Landroid/os/Parcelable$Creator;", "Lwi1/j;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public j(Parcel parcel) {
        parcel.getClass();
        this.f185540c = -1.0d;
        this.f185541d = -1.0d;
        this.f185545h = -1;
        this.f185549l = -1;
        this.f185550m = -1;
        this.f185551n = -1L;
        this.f185554q = -1;
        this.f185555r = -1;
        this.f185538a = parcel.readString();
        this.f185540c = parcel.readDouble();
        this.f185541d = parcel.readDouble();
        this.f185542e = parcel.readString();
        this.f185543f = parcel.readString();
        this.f185544g = parcel.readString();
        this.f185545h = parcel.readInt();
        this.f185546i = parcel.readString();
        this.f185547j = (wi1.b) parcel.readParcelable(wi1.b.class.getClassLoader());
        this.f185548k = (wi1.d) parcel.readParcelable(wi1.d.class.getClassLoader());
        this.f185549l = parcel.readInt();
        this.f185550m = parcel.readInt();
        this.f185551n = parcel.readLong();
        this.f185552o = parcel.readLong();
        this.f185553p = parcel.readString();
        this.f185554q = parcel.readInt();
        this.f185555r = parcel.readInt();
        this.f185556t = parcel.readString();
        this.f185539b = parcel.readString();
        this.f185558w = (g42.d) parcel.readParcelable(g42.d.class.getClassLoader());
        this.f185559x = parcel.readInt() == 1;
    }

    public final void C(c cVar) {
        if (cVar != null) {
            String str = cVar.f185566a;
            c.f185560c.getClass();
            this.f185554q = c.a.a(str).ordinal() + 1;
        }
    }

    public final void D(c cVar) {
        if (cVar != null) {
            String str = cVar.f185566a;
            c.f185560c.getClass();
            this.f185555r = c.a.a(str).ordinal() + 1;
        }
    }

    public final JSONObject F() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gender", !TextUtils.isEmpty(this.f185538a) ? this.f185538a : JSONObject.NULL);
            double d14 = this.f185540c;
            jSONObject.put("weight", d14 > 0.0d ? Double.valueOf(d14) : JSONObject.NULL);
            double d15 = this.f185541d;
            jSONObject.put("height", d15 > 0.0d ? Double.valueOf(d15) : JSONObject.NULL);
            if (!TextUtils.isEmpty(this.f185542e)) {
                jSONObject.put("timeFormat", this.f185542e);
            }
            jSONObject.put("birthDate", !TextUtils.isEmpty(this.f185543f) ? this.f185543f : JSONObject.NULL);
            if (!TextUtils.isEmpty(this.f185544g)) {
                jSONObject.put("measurementSystem", this.f185544g);
            }
            int i14 = this.f185545h;
            jSONObject.put("activityLevel", i14 >= 0 ? Integer.valueOf(i14) : JSONObject.NULL);
            if (!TextUtils.isEmpty(this.f185546i)) {
                jSONObject.put("handedness", this.f185546i);
            }
            wi1.b bVar = this.f185547j;
            if (bVar != null) {
                jSONObject.put("powerFormat", bVar.C());
            }
            wi1.d dVar = this.f185548k;
            if (dVar != null) {
                jSONObject.put("firstDayOfWeek", dVar.C());
            }
            int i15 = this.f185549l;
            jSONObject.put("vo2MaxRunning", i15 > -1 ? Integer.valueOf(i15) : JSONObject.NULL);
            int i16 = this.f185550m;
            jSONObject.put("vo2MaxCycling", i16 > -1 ? Integer.valueOf(i16) : JSONObject.NULL);
            long j8 = this.f185551n;
            if (j8 > -1) {
                jSONObject.put("externalBottomTime", j8);
            }
            String str = this.f185553p;
            if (str != null) {
                jSONObject.put("intensityMinutesCalcMethod", str);
            }
            int i17 = this.f185554q;
            if (i17 > -1 && this.f185553p != null) {
                jSONObject.put("moderateIntensityMinutesHrZone", i17);
            }
            int i18 = this.f185555r;
            if (i18 > -1 && this.f185553p != null) {
                jSONObject.put("vigorousIntensityMinutesHrZone", i18);
            }
            if (!TextUtils.isEmpty(this.f185556t)) {
                jSONObject.put("hydrationMeasurementUnit", this.f185556t);
            }
            if (TextUtils.isEmpty(this.f185557v)) {
                jSONObject.put("trainingStatusPausedDate", JSONObject.NULL);
            } else {
                jSONObject.put("trainingStatusPausedDate", this.f185557v);
            }
            g42.d dVar2 = this.f185558w;
            if (dVar2 != null) {
                jSONObject.put("weatherLocation", dVar2.C());
            }
            jSONObject.put("glucoseMeasurementUnit", !TextUtils.isEmpty(this.f185539b) ? this.f185539b : JSONObject.NULL);
            jSONObject.put("wheelchairModeEnabled", this.f185559x);
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.SETTINGS, "UserDataDTO", "Error while converting to JSON object: " + e4);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            String strU = s1.u(jSONObject, "gender");
            if (TextUtils.isEmpty(strU)) {
                strU = "";
            }
            this.f185538a = strU;
            this.f185540c = jSONObject.optDouble("weight");
            this.f185541d = jSONObject.optDouble("height");
            this.f185542e = s1.u(jSONObject, "timeFormat");
            this.f185543f = s1.u(jSONObject, "birthDate");
            this.f185544g = s1.u(jSONObject, "measurementSystem");
            this.f185545h = jSONObject.optInt("activityLevel", -1);
            this.f185546i = s1.u(jSONObject, "handedness");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("powerFormat");
            if (jSONObjectOptJSONObject != null) {
                wi1.b bVar = new wi1.b();
                this.f185547j = bVar;
                bVar.k(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("firstDayOfWeek");
            if (jSONObjectOptJSONObject2 != null) {
                wi1.d dVar = new wi1.d();
                this.f185548k = dVar;
                dVar.k(jSONObjectOptJSONObject2);
            }
            this.f185549l = jSONObject.optInt("vo2MaxRunning", -1);
            this.f185550m = jSONObject.optInt("vo2MaxCycling", -1);
            this.f185551n = jSONObject.optLong("externalBottomTime", -1L);
            String strU2 = s1.u(jSONObject, "intensityMinutesCalcMethod");
            this.f185553p = strU2;
            if (strU2 != null) {
                this.f185554q = jSONObject.optInt("moderateIntensityMinutesHrZone");
                this.f185555r = jSONObject.optInt("vigorousIntensityMinutesHrZone");
            }
            this.f185556t = s1.u(jSONObject, "hydrationMeasurementUnit");
            this.f185557v = s1.u(jSONObject, "trainingStatusPausedDate");
            String strU3 = s1.u(jSONObject, "glucoseMeasurementUnit");
            this.f185539b = TextUtils.isEmpty(strU3) ? "" : strU3;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("weatherLocation");
            if (jSONObjectOptJSONObject3 != null) {
                g42.d dVar2 = new g42.d(false, null, null, null, null, null, 63, null);
                this.f185558w = dVar2;
                dVar2.k(jSONObjectOptJSONObject3);
            }
            this.f185559x = jSONObject.optBoolean("wheelchairModeEnabled");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f185538a);
        parcel.writeDouble(this.f185540c);
        parcel.writeDouble(this.f185541d);
        parcel.writeString(this.f185542e);
        parcel.writeString(this.f185543f);
        parcel.writeString(this.f185544g);
        parcel.writeInt(this.f185545h);
        parcel.writeString(this.f185546i);
        parcel.writeParcelable(this.f185547j, i14);
        parcel.writeParcelable(this.f185548k, i14);
        parcel.writeInt(this.f185549l);
        parcel.writeInt(this.f185550m);
        parcel.writeLong(this.f185551n);
        parcel.writeLong(this.f185552o);
        parcel.writeString(this.f185553p);
        parcel.writeInt(this.f185554q);
        parcel.writeInt(this.f185555r);
        parcel.writeString(this.f185556t);
        parcel.writeString(this.f185539b);
        parcel.writeParcelable(this.f185558w, i14);
        parcel.writeInt(this.f185559x ? 1 : 0);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wi1.j$c[], still in use, count: 1, list:
      (r0v1 wi1.j$c[]) from 0x004f: CONSTRUCTOR (r0v1 wi1.j$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwi1/j$c;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        ZONE_1("Zone1", R.string.intensity_minutes_config_zone_one),
        /* JADX INFO: Fake field, exist only in values array */
        ZONE_2("Zone2", R.string.intensity_minutes_config_zone_two),
        ZONE_3("Zone3", R.string.intensity_minutes_config_zone_three),
        ZONE_4("Zone4", R.string.intensity_minutes_config_zone_four),
        /* JADX INFO: Fake field, exist only in values array */
        ZONE_5("Zone5", R.string.intensity_minutes_config_zone_five);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f185560c = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f185565h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f185566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f185567b;

        static {
            f185565h = new w13.c(new c[]{r0, r1, r2, r3, new c("Zone5", R.string.intensity_minutes_config_zone_five)});
        }

        private c(String str, int i14) {
            super(str, i);
            this.f185566a = str;
            this.f185567b = i14;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f185564g.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi1/j$c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static c a(String str) {
                if (str != null) {
                    w13.c cVar = c.f185565h;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        c cVar2 = (c) bVarN.next();
                        if (s.g(cVar2.f185566a, str)) {
                            return cVar2;
                        }
                    }
                }
                return c.ZONE_1;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wi1.j$d[], still in use, count: 1, list:
      (r0v1 wi1.j$d[]) from 0x0022: CONSTRUCTOR (r0v1 wi1.j$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwi1/j$d;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        AUTO("AUTO", R.string.common_lbl_automatic),
        HR_ZONES("HR_ZONES", R.string.devices_lbl_heart_rate_zones);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f185568c = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f185572g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f185573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f185574b;

        static {
            f185572g = new w13.c(new d[]{r0, r1});
        }

        private d(String str, int i14) {
            super(str, i);
            this.f185573a = str;
            this.f185574b = i14;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f185571f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi1/j$d$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"Lwi1/j$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lwi1/j;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "GENDER", "Ljava/lang/String;", "WEIGHT", "HEIGHT", "TIME_FORMAT", "BIRTH_DATE", "MEASUREMENT_SYSTEM", "ACTIVITY_LEVEL", "HANDEDNESS", "POWER_FORMAT", "FIRST_DAY_OF_WEEK", "VO2_MAX_RUNNING", "VO2_MAX_CYCLING", "EXTERNAL_BOTTOM_TIME", "CUSTOM_INTENSITY_MINUTES_CALC_METHOD", "MODERATE_INTENSITY_HR_ZONE", "VIGOROUS_INTENSITY_HR_ZONE", "HYDRATION_MEASUREMENT_UNIT", "TRAINING_STATUS_PAUSED_DATE", "GLUCOSE_MEASUREMENT_UNIT", "WEATHER_LOCATION", "WHEELCHAIR_MODE_ENABLED", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public j() {
        this.f185540c = -1.0d;
        this.f185541d = -1.0d;
        this.f185545h = -1;
        this.f185549l = -1;
        this.f185550m = -1;
        this.f185551n = -1L;
        this.f185554q = -1;
        this.f185555r = -1;
    }
}
