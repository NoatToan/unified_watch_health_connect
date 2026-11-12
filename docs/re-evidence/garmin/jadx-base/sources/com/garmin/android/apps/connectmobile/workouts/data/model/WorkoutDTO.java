package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.maps.android.BuildConfig;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(WorkoutDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "WorkoutDeserializer", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class WorkoutDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<WorkoutDTO> CREATOR;
    public static final int P0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public List<String> H0;
    public String I;
    public Boolean I0;
    public boolean J0;
    public String K0;
    public Integer L0;
    public qs.u M0;
    public w N0;
    public String O0;
    public String P;
    public String T;
    public com.garmin.android.apps.connectmobile.workouts.data.model.a X;
    public long Y;
    public double Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m52.k f48044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m52.l f48045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f48046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f48047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m52.j f48048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f48049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Double f48050k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public double f48051k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Double f48052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m52.b f48053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m52.j f48054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f48057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f48058r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f48059t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f48060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<String> f48061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f48062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f48063y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f48064z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO$WorkoutDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WorkoutDeserializer implements JsonDeserializer<WorkoutDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final WorkoutDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                WorkoutDTO workoutDTO = new WorkoutDTO();
                workoutDTO.k(new JSONObject(jsonElement.toString()));
                return workoutDTO;
            } catch (Exception e4) {
                a2 a2Var = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.g(a2Var, "WorkoutDTO", e4);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkoutDTO> {
        @Override // android.os.Parcelable.Creator
        public final WorkoutDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WorkoutDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WorkoutDTO[] newArray(int i14) {
            return new WorkoutDTO[i14];
        }
    }

    static {
        new b(null);
        P0 = 8;
        CREATOR = new a();
    }

    public WorkoutDTO(Parcel parcel) {
        m52.k kVar;
        m52.l lVar;
        parcel.getClass();
        this.f48041b = "";
        this.f48044e = m52.k.f116756p;
        this.f48045f = m52.l.GENERIC;
        this.Z = Double.NaN;
        this.f48051k0 = Double.NaN;
        this.f48040a = parcel.readLong();
        String string = parcel.readString();
        this.f48041b = string != null ? string : "";
        m52.k.a aVar = m52.k.f116753m;
        int i14 = parcel.readInt();
        aVar.getClass();
        m52.k[] kVarArrValues = m52.k.values();
        int length = kVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i15];
            if (kVar.f116766b == i14) {
                break;
            } else {
                i15++;
            }
        }
        if (kVar != null) {
            this.f48044e = kVar;
        }
        m52.l.a aVar2 = m52.l.f116779a;
        String string2 = parcel.readString();
        aVar2.getClass();
        m52.l[] lVarArrValues = m52.l.values();
        int length2 = lVarArrValues.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length2) {
                lVar = m52.l.GENERIC;
                break;
            }
            lVar = lVarArrValues[i16];
            if (d53.u.q(lVar.name(), string2, true)) {
                break;
            } else {
                i16++;
            }
        }
        this.f48045f = lVar;
        this.f48046g = parcel.readString();
        this.f48042c = parcel.readString();
        this.f48043d = parcel.readString();
        this.f48049j = (Integer) parcel.readValue(Integer.TYPE.getClassLoader());
        this.f48050k = (Double) parcel.readValue(Double.TYPE.getClassLoader());
        if (parcel.readByte() == 1) {
            this.f48052l = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 1) {
            String string3 = parcel.readString();
            string3.getClass();
            this.f48053m = m52.b.valueOf(string3);
        }
        if (parcel.readByte() == 1) {
            String string4 = parcel.readString();
            string4.getClass();
            this.f48054n = m52.j.valueOf(string4);
        }
        if (parcel.readByte() == 1) {
            this.T = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            this.X = (com.garmin.android.apps.connectmobile.workouts.data.model.a) parcel.readParcelable(com.garmin.android.apps.connectmobile.workouts.data.model.a.class.getClassLoader());
        }
        if (parcel.readByte() == 1) {
            String string5 = parcel.readString();
            string5.getClass();
            this.f48048i = m52.j.valueOf(string5);
        }
        this.f48055o = parcel.readLong();
        this.f48056p = parcel.readString();
        this.f48057q = parcel.readString();
        this.f48058r = parcel.readString();
        this.f48059t = parcel.readString();
        this.f48060v = parcel.readString();
        this.f48061w = parcel.createStringArrayList();
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.H0 = arrayList;
        this.f48062x = parcel.readString();
        this.f48063y = parcel.readString();
        this.f48064z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.I = parcel.readString();
        this.Y = parcel.readLong();
        if (parcel.readByte() == 1) {
            this.f48047h = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 1) {
            String string6 = parcel.readString();
            string6.getClass();
            this.f48048i = m52.j.valueOf(string6);
        }
        this.I0 = Boolean.valueOf(parcel.readInt() == 1);
        this.J0 = parcel.readInt() != 0;
        this.K0 = parcel.readString();
        int i17 = parcel.readInt();
        this.L0 = i17 != -1 ? Integer.valueOf(i17) : null;
        qs.u.a aVar3 = qs.u.f147173f;
        String string7 = parcel.readString();
        aVar3.getClass();
        qs.u uVarA = qs.u.a.a(string7);
        if (uVarA != null) {
            this.M0 = uVarA;
        }
        if (parcel.readByte() == 1) {
            this.N0 = (w) parcel.readParcelable(w.class.getClassLoader());
        }
        this.O0 = parcel.readString();
    }

    public final com.garmin.android.apps.connectmobile.workouts.data.model.a C() {
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = this.X;
        return aVar == null ? new com.garmin.android.apps.connectmobile.workouts.data.model.a(this.T, null, null) : aVar;
    }

    public final boolean D() {
        return this.f48055o > 0;
    }

    public final boolean F() {
        return "Garmin".equals(this.D);
    }

    public final boolean G() {
        return this.Y > 0;
    }

    public final boolean H() {
        return "MSN".equals(this.D);
    }

    public final boolean I() {
        if (this.Y <= 0) {
            return false;
        }
        m52.k kVar = this.f48044e;
        return kVar == m52.k.f116759t || kVar == m52.k.f116764z;
    }

    public final Integer M() {
        String str = this.f48042c;
        if (str == null) {
            return null;
        }
        b63.u uVarA = b63.u.Companion.a(b63.u.INSTANCE, str);
        b63.a0.INSTANCE.getClass();
        b63.a0 a0Var = b63.a0.f16172b;
        b63.x.f16223a.getClass();
        b63.x xVar = b63.x.f16224b;
        a0Var.getClass();
        xVar.getClass();
        Instant instant = uVarA.f16216a.toInstant(a0Var.f16173a);
        instant.getClass();
        return Integer.valueOf((int) (f53.a.b(instant).f63115a - ((long) 631065600)));
    }

    public final Long Z() {
        Long lValueOf = Long.valueOf(this.f48040a);
        if (lValueOf.longValue() > 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public void k(JSONObject jSONObject) {
        m52.l lVar;
        if (jSONObject != null) {
            this.f48040a = jSONObject.optInt("workoutId");
            String strOptString = jSONObject.optString("workoutName");
            strOptString.getClass();
            this.f48041b = strOptString;
            this.f48042c = jSONObject.optString("createdDate");
            this.f48043d = jSONObject.optString("updateDate");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sportType");
            if (jSONObjectOptJSONObject != null) {
                String strOptString2 = jSONObjectOptJSONObject.optString("sportTypeKey");
                strOptString2.getClass();
                if (strOptString2.length() > 0) {
                    m52.k.f116753m.getClass();
                    m52.k kVarC = m52.k.a.c(strOptString2);
                    if (kVarC != null) {
                        this.f48044e = kVarC;
                    }
                }
            }
            String strOptString3 = jSONObject.optString("subSportType");
            strOptString3.getClass();
            if (strOptString3.length() > 0) {
                m52.l.f116779a.getClass();
                m52.l[] lVarArrValues = m52.l.values();
                int length = lVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        lVar = m52.l.GENERIC;
                        break;
                    }
                    lVar = lVarArrValues[i14];
                    if (d53.u.q(lVar.name(), strOptString3, true)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                this.f48045f = lVar;
            }
            String strOptString4 = jSONObject.optString("description");
            strOptString4.getClass();
            if ((strOptString4.length() > 0) & (true ^ BuildConfig.TRAVIS.equalsIgnoreCase(strOptString4))) {
                this.f48046g = strOptString4;
            }
            this.f48047h = Double.valueOf(jSONObject.optDouble("poolLength"));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("poolLengthUnit");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has("unitKey") && !BuildConfig.TRAVIS.equalsIgnoreCase(jSONObjectOptJSONObject2.optString("unitKey"))) {
                m52.j.a aVar = m52.j.f116744d;
                String strOptString5 = jSONObjectOptJSONObject2.optString("unitKey");
                strOptString5.getClass();
                aVar.getClass();
                this.f48048i = m52.j.a.a(strOptString5);
            }
            this.f48049j = !jSONObject.isNull("estimatedDurationInSecs") ? Integer.valueOf(jSONObject.optInt("estimatedDurationInSecs")) : null;
            this.f48050k = !jSONObject.isNull("estimatedDistanceInMeters") ? Double.valueOf(jSONObject.getDouble("estimatedDistanceInMeters")) : null;
            this.f48052l = Double.valueOf(jSONObject.optDouble("avgTrainingSpeed"));
            String strOptString6 = jSONObject.optString("estimateType");
            strOptString6.getClass();
            if (strOptString6.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString6)) {
                this.f48053m = m52.b.valueOf(strOptString6);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("estimatedDistanceUnit");
            if (jSONObjectOptJSONObject3 != null) {
                String strOptString7 = jSONObjectOptJSONObject3.optString("unitKey");
                strOptString7.getClass();
                if (strOptString7.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString7)) {
                    String upperCase = strOptString7.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    this.f48054n = m52.j.valueOf(upperCase);
                }
            }
            this.f48055o = jSONObject.optLong("atpPlanId", -1L);
            String strOptString8 = jSONObject.optString("consumer");
            strOptString8.getClass();
            if (strOptString8.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString8)) {
                this.f48056p = strOptString8;
            }
            String strOptString9 = jSONObject.optString("consumerName");
            strOptString9.getClass();
            if (strOptString9.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString9)) {
                this.f48057q = strOptString9;
            }
            String strOptString10 = jSONObject.optString("consumerImageURL");
            strOptString10.getClass();
            if (strOptString10.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString10)) {
                this.f48058r = strOptString10;
            }
            String strOptString11 = jSONObject.optString("consumerWebsiteURL");
            strOptString11.getClass();
            if (strOptString11.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString11)) {
                this.f48059t = strOptString11;
            }
            this.f48061w = s1.y(jSONObject, "primaryMuscles");
            this.H0 = s1.y(jSONObject, "sportTypes");
            this.f48060v = jSONObject.optString("bodyParts");
            this.f48062x = jSONObject.optString("difficulty");
            this.f48063y = jSONObject.optString("focus");
            this.f48064z = jSONObject.optString("goals");
            this.A = jSONObject.optString("how");
            this.B = jSONObject.optString("imageAttribution");
            this.C = jSONObject.optString("locale");
            this.D = jSONObject.optString("workoutProvider");
            this.E = jSONObject.optString("workoutSourceId");
            this.F = jSONObject.optString("heroImage");
            this.I = jSONObject.optString("equipment");
            this.T = jSONObject.optString("workoutAudioNoteUuid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("workoutAudioNote");
            if (jSONObjectOptJSONObject4 != null) {
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2 = new com.garmin.android.apps.connectmobile.workouts.data.model.a(null, null, null, 7, null);
                this.X = aVar2;
                aVar2.k(jSONObjectOptJSONObject4);
            }
            this.Y = jSONObject.optLong("trainingPlanId");
            this.Z = jSONObject.optDouble("estimatedTrainingEffect");
            this.f48051k0 = jSONObject.optDouble("estimatedAnaerobicTrainingEffect");
            this.I0 = Boolean.valueOf(jSONObject.optBoolean("isWheelchair"));
            this.J0 = jSONObject.optBoolean("isSessionTransitionEnabled", false);
            this.K0 = jSONObject.optString("workoutUuid");
            int iOptInt = jSONObject.optInt("workoutIndex", -1);
            Integer numValueOf = Integer.valueOf(iOptInt);
            if (iOptInt == -1) {
                numValueOf = null;
            }
            this.L0 = numValueOf;
            String strOptString12 = jSONObject.optString("trainingEffectLabel");
            strOptString12.getClass();
            if (strOptString12.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString12)) {
                qs.u.f147173f.getClass();
                this.M0 = qs.u.a.a(strOptString12);
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("runWalkDescription");
            if (jSONObjectOptJSONObject5 != null) {
                w wVar = new w(0, 0, 0, 7, null);
                this.N0 = wVar;
                wVar.k(jSONObjectOptJSONObject5);
            }
            this.O0 = jSONObject.isNull("workoutThumbnailUrl") ? null : jSONObject.optString("workoutThumbnailUrl");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f48040a);
        parcel.writeString(this.f48041b);
        parcel.writeInt(this.f48044e.f116766b);
        parcel.writeString(this.f48045f.name());
        parcel.writeString(this.f48046g);
        parcel.writeString(this.f48042c);
        parcel.writeString(this.f48043d);
        parcel.writeValue(this.f48049j);
        parcel.writeValue(this.f48050k);
        if (this.f48052l != null) {
            parcel.writeByte((byte) 1);
            Double d14 = this.f48052l;
            d14.getClass();
            parcel.writeDouble(d14.doubleValue());
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.f48053m != null) {
            parcel.writeByte((byte) 1);
            m52.b bVar = this.f48053m;
            bVar.getClass();
            parcel.writeString(bVar.name());
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.f48054n != null) {
            parcel.writeByte((byte) 1);
            m52.j jVar = this.f48054n;
            jVar.getClass();
            parcel.writeString(jVar.name());
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.T != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.T);
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.X != null) {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.X, i14);
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.f48048i != null) {
            parcel.writeByte((byte) 1);
            m52.j jVar2 = this.f48048i;
            jVar2.getClass();
            parcel.writeString(jVar2.name());
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeLong(this.f48055o);
        parcel.writeString(this.f48056p);
        parcel.writeString(this.f48057q);
        parcel.writeString(this.f48058r);
        parcel.writeString(this.f48059t);
        parcel.writeString(this.f48060v);
        parcel.writeStringList(this.f48061w);
        parcel.writeStringList(this.H0);
        parcel.writeString(this.f48062x);
        parcel.writeString(this.f48063y);
        parcel.writeString(this.f48064z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.I);
        parcel.writeLong(this.Y);
        if (this.f48047h != null) {
            parcel.writeByte((byte) 1);
            Double d15 = this.f48047h;
            d15.getClass();
            parcel.writeDouble(d15.doubleValue());
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.f48048i != null) {
            parcel.writeByte((byte) 1);
            m52.j jVar3 = this.f48048i;
            jVar3.getClass();
            parcel.writeString(jVar3.name());
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeInt(p005kotlin.jvm.internal.s.g(this.I0, Boolean.TRUE) ? 1 : 0);
        parcel.writeInt(this.J0 ? 1 : 0);
        parcel.writeString(this.K0);
        Integer num = this.L0;
        parcel.writeInt(num != null ? num.intValue() : -1);
        qs.u uVar = this.M0;
        parcel.writeString(uVar != null ? uVar.name() : null);
        if (this.N0 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.N0, i14);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeString(this.O0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u0006¨\u0006<"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "KEY_MSN_WORKOUT_PROVIDER", "KEY_GARMIN_WORKOUT_PROVIDER", "KEY_WORKOUT_ID", "KEY_WORKOUT_NAME", "KEY_WORKOUT_CREATE_DATE", "KEY_WORKOUT_UPDATE_DATE", "KEY_SPORT_TYPE", "KEY_SPORT_TYPE_KEY", "KEY_SPORT_TYPE_ID", "KEY_SUB_SPORT_TYPE", "KEY_DESCRIPTION", "KEY_POOL_LENGTH", "KEY_POOL_LENGTH_UNIT", "KEY_ESTIMATED_DURATION_IN_SEC", "KEY_ESTIMATED_DISTANCE_IN_METERS", "KEY_AVG_TRAINING_SPEED", "KEY_ESTIMATED_DISTANCE_UNIT", "KEY_ESTIMATE_TYPE", "KEY_ATP_PLAN_ID", "KEY_UNIT_KEY", "KEY_CONSUMER", "KEY_CONSUMER_NAME", "KEY_CONSUMER_IMAGE_URL", "KEY_CONSUMER_WEBSITE_URL", "KEY_BODY_PARTS", "KEY_PRIMARY_MUSCLES", "KEY_SPORT_TYPES", "KEY_DIFFICULTY", "KEY_FOCUS", "KEY_GOALS", "KEY_HOW", "KEY_IMAGE_ATTRIBUTION", "KEY_LOCALE", "KEY_WORKOUT_PROVIDER", "KEY_WORKOUT_SOURCE_ID", "KEY_HERO_IMAGE", "KEY_EQUIPMENT", "KEY_AUDIO_NOTE_UUID", "KEY_AUDIO_NOTE", "KEY_TRAINING_PLAN_ID", "KEY_ESTIMATED_TRAINING_EFFECT", "KEY_ESTIMATED_ANAEROBIC_TRAINING_EFFECT", "KEY_IS_WHEELCHAIR_ENABLED", "KEY_IS_SESSION_TRANSITION_ENABLED", "KEY_WORKOUT_UUID", "KEY_WORKOUT_INDEX", "KEY_TRAINING_EFFECT_LABEL", "KEY_RUN_WALK_DESCRIPTION", "KEY_PREVIEW_IMAGE_URL", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public WorkoutDTO() {
        this.f48041b = "";
        this.f48044e = m52.k.f116756p;
        this.f48045f = m52.l.GENERIC;
        this.Z = Double.NaN;
        this.f48051k0 = Double.NaN;
    }
}
