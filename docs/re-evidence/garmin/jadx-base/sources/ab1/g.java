package ab1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.powerguide.model.PowerGuideSummaryAdapter;
import com.google.gson.annotations.JsonAdapter;
import java.util.Observable;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(PowerGuideSummaryAdapter.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lab1/g;", "Landroid/os/Parcelable;", "Ljava/util/Observable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends Observable implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f2567w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f2568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f2570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f2571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f2572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f2573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f2574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f2575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Float f2576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f2577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Float f2578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Float f2579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Float f2580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f2581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f2582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f2583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Long f2585r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f2586t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f2587v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Parcel parcel) {
        l lVar;
        this();
        parcel.getClass();
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        p pVar = null;
        this.f2568a = value instanceof Long ? (Long) value : null;
        this.f2569b = parcel.readString();
        Object value2 = parcel.readValue(cls.getClassLoader());
        this.f2570c = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        this.f2571d = value3 instanceof Long ? (Long) value3 : null;
        Class cls2 = Float.TYPE;
        Object value4 = parcel.readValue(cls2.getClassLoader());
        g(value4 instanceof Float ? (Float) value4 : null);
        Class cls3 = Integer.TYPE;
        Object value5 = parcel.readValue(cls3.getClassLoader());
        j(value5 instanceof Integer ? (Integer) value5 : null);
        Object value6 = parcel.readValue(cls3.getClassLoader());
        this.f2574g = value6 instanceof Integer ? (Integer) value6 : null;
        Object value7 = parcel.readValue(cls2.getClassLoader());
        this.f2575h = value7 instanceof Float ? (Float) value7 : null;
        Object value8 = parcel.readValue(cls2.getClassLoader());
        this.f2576i = value8 instanceof Float ? (Float) value8 : null;
        Object value9 = parcel.readValue(cls2.getClassLoader());
        h(value9 instanceof Float ? (Float) value9 : null);
        Object value10 = parcel.readValue(cls2.getClassLoader());
        f(value10 instanceof Float ? (Float) value10 : null);
        Object value11 = parcel.readValue(cls2.getClassLoader());
        this.f2579l = value11 instanceof Float ? (Float) value11 : null;
        Object value12 = parcel.readValue(cls2.getClassLoader());
        this.f2580m = value12 instanceof Float ? (Float) value12 : null;
        Object value13 = parcel.readValue(cls3.getClassLoader());
        this.f2581n = value13 instanceof Integer ? (Integer) value13 : null;
        Object value14 = parcel.readValue(cls3.getClassLoader());
        this.f2582o = value14 instanceof Integer ? (Integer) value14 : null;
        Object value15 = parcel.readValue(cls3.getClassLoader());
        this.f2583p = value15 instanceof Integer ? (Integer) value15 : null;
        this.f2584q = parcel.readString();
        Object value16 = parcel.readValue(cls.getClassLoader());
        this.f2585r = value16 instanceof Long ? (Long) value16 : null;
        String string = parcel.readString();
        if (string == null) {
            lVar = null;
            break;
        }
        l.f2599e.getClass();
        l[] lVarArrValues = l.values();
        int length = lVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                lVar = null;
                break;
            }
            lVar = lVarArrValues[i14];
            if (s.g(lVar.f2603b, string)) {
                break;
            } else {
                i14++;
            }
        }
        d(lVar);
        String string2 = parcel.readString();
        if (string2 != null) {
            p.f2628e.getClass();
            for (p pVar2 : p.values()) {
                if (s.g(pVar2.f2634b, string2)) {
                    pVar = pVar2;
                    break;
                }
            }
        }
        i(pVar);
    }

    public final void b(JSONObject jSONObject) {
        p pVar;
        l lVar;
        try {
            this.f2568a = Long.valueOf(jSONObject.optLong("powerGuidancePk"));
            this.f2569b = jSONObject.optString("powerGuidanceName");
            this.f2570c = Long.valueOf(jSONObject.optLong("coursePk"));
            this.f2571d = Long.valueOf(jSONObject.optLong("userProfilePk"));
            g(Float.valueOf((float) jSONObject.optDouble("goalEffort")));
            j(Integer.valueOf(jSONObject.optInt("userFTP")));
            this.f2574g = Integer.valueOf(jSONObject.optInt("splitCount"));
            this.f2575h = Float.valueOf((float) jSONObject.optDouble("aeroCoefficient"));
            this.f2576i = Float.valueOf((float) jSONObject.optDouble("rollingResistanceCoefficient"));
            h(Float.valueOf((float) jSONObject.optDouble("riderMass")));
            f(Float.valueOf((float) jSONObject.optDouble("bikeMass")));
            this.f2579l = Float.valueOf((float) jSONObject.optDouble("estimatedDurationLow"));
            this.f2580m = Float.valueOf((float) jSONObject.optDouble("estimatedDurationHigh"));
            this.f2581n = Integer.valueOf(jSONObject.optInt("ftpUsagePercent"));
            this.f2582o = Integer.valueOf(jSONObject.optInt("maxPowerUsage"));
            this.f2583p = Integer.valueOf(jSONObject.optInt("meanPowerUsage"));
            this.f2584q = jSONObject.optString("lastUpdatedDate");
            this.f2585r = Long.valueOf(jSONObject.optLong("distance"));
            l.a aVar = l.f2599e;
            String strOptString = jSONObject.optString("aeroProfile");
            strOptString.getClass();
            aVar.getClass();
            l[] lVarArrValues = l.values();
            int length = lVarArrValues.length;
            int i14 = 0;
            while (true) {
                pVar = null;
                if (i14 >= length) {
                    lVar = null;
                    break;
                }
                lVar = lVarArrValues[i14];
                if (s.g(lVar.f2603b, strOptString)) {
                    break;
                } else {
                    i14++;
                }
            }
            d(lVar);
            p.a aVar2 = p.f2628e;
            String strOptString2 = jSONObject.optString("terrainProfile");
            strOptString2.getClass();
            aVar2.getClass();
            for (p pVar2 : p.values()) {
                if (s.g(pVar2.f2634b, strOptString2)) {
                    pVar = pVar2;
                    break;
                }
            }
            i(pVar);
        } catch (JSONException e4) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.g(a2Var, "PowerGuideSummaryDTO", e4);
        }
    }

    public final void d(l lVar) {
        this.f2586t = lVar;
        setChanged();
        notifyObservers();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(Float f14) {
        this.f2578k = f14;
        setChanged();
        notifyObservers();
    }

    public final void g(Float f14) {
        this.f2572e = f14;
        setChanged();
        notifyObservers();
    }

    public final void h(Float f14) {
        this.f2577j = f14;
        setChanged();
        notifyObservers();
    }

    public final void i(p pVar) {
        this.f2587v = pVar;
        setChanged();
        notifyObservers();
    }

    public final void j(Integer num) {
        this.f2573f = num;
        setChanged();
        notifyObservers();
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("powerGuidancePk", this.f2568a);
            jSONObject.put("powerGuidanceName", this.f2569b);
            jSONObject.put("coursePk", this.f2570c);
            jSONObject.put("userProfilePk", this.f2571d);
            jSONObject.put("goalEffort", this.f2572e);
            jSONObject.put("userFTP", this.f2573f);
            jSONObject.put("splitCount", this.f2574g);
            jSONObject.put("aeroCoefficient", this.f2575h);
            jSONObject.put("rollingResistanceCoefficient", this.f2576i);
            jSONObject.put("riderMass", this.f2577j);
            jSONObject.put("bikeMass", this.f2578k);
            jSONObject.put("estimatedDurationLow", this.f2579l);
            jSONObject.put("estimatedDurationHigh", this.f2580m);
            jSONObject.put("ftpUsagePercent", this.f2581n);
            jSONObject.put("maxPowerUsage", this.f2582o);
            jSONObject.put("meanPowerUsage", this.f2583p);
            jSONObject.put("lastUpdatedDate", this.f2584q);
            jSONObject.put("distance", this.f2585r);
            l lVar = this.f2586t;
            String str = lVar != null ? lVar.f2603b : null;
            if (str != null) {
                jSONObject.put("aeroProfile", str);
            }
            p pVar = this.f2587v;
            String str2 = pVar != null ? pVar.f2634b : null;
            if (str2 != null) {
                jSONObject.put("terrainProfile", str2);
            }
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "PowerGuideSummaryDTO", e4);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeValue(this.f2568a);
        parcel.writeString(this.f2569b);
        parcel.writeValue(this.f2570c);
        parcel.writeValue(this.f2571d);
        parcel.writeValue(this.f2572e);
        parcel.writeValue(this.f2573f);
        parcel.writeValue(this.f2574g);
        parcel.writeValue(this.f2575h);
        parcel.writeValue(this.f2576i);
        parcel.writeValue(this.f2577j);
        parcel.writeValue(this.f2578k);
        parcel.writeValue(this.f2579l);
        parcel.writeValue(this.f2580m);
        parcel.writeValue(this.f2581n);
        parcel.writeValue(this.f2582o);
        parcel.writeValue(this.f2583p);
        parcel.writeString(this.f2584q);
        parcel.writeValue(this.f2585r);
        l lVar = this.f2586t;
        parcel.writeString(lVar != null ? lVar.f2603b : null);
        p pVar = this.f2587v;
        parcel.writeString(pVar != null ? pVar.f2634b : null);
    }

    /* JADX INFO: renamed from: ab1.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lab1/g$a;", "Landroid/os/Parcelable$Creator;", "Lab1/g;", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "POWER_GUIDANCE_PK_KEY", "POWER_GUIDANCE_NAME_KEY", "COURSE_PK_KEY", "USER_PROFILE_PK_KEY", "GOAL_EFFORT_KEY", "USER_FTP_KEY", "SPLIT_COUNT_KEY", "AERO_COEFFICIENT_KEY", "ROLLING_RESISTANCE_COEFFICIENT_KEY", "RIDER_MASS_KEY", "BIKE_MASS_KEY", "ESTIMATED_DURATION_LOW_KEY", "ESTIMATED_DURATION_HIGH_KEY", "FTP_USAGE_PERCENT_KEY", "MAX_POWER_USAGE_KEY", "MEAN_POWER_USAGE_KEY", "LAST_UPDATED_DATE_KEY", "DISTANCE_KEY", "AERO_PROFILE_KEY", "TERRAIN_PROFILE_KEY", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<g> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }

        private Companion() {
        }
    }

    public g() {
    }
}
