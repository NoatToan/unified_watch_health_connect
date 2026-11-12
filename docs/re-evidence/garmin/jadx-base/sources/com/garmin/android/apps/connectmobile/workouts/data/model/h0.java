package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import c62.g2;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.google.maps.android.BuildConfig;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p006l2.w2;
import ps.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001:\u0002!\u0015Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/h0;", "Landroid/os/Parcelable;", "", "segmentOrder", "", "description", "estimatedDurationInSecs", "", "estimatedDistanceInMeters", "avgTrainingSpeed", "Lm52/b;", "estimateType", "Lm52/j;", "estimatedDistanceUnit", "Lm52/k;", "sportType", "Ll52/i;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "workoutSteps", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lm52/b;Lm52/j;Lm52/k;Ll52/i;)V", "a", "I", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()I", "F", "(I)V", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Ljava/lang/String;)V", "c", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "D", "(Ljava/lang/Integer;)V", "d", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "A", "(Ljava/lang/Double;)V", JWKParameterNames.RSA_EXPONENT, "g", "u", "f", "Lm52/b;", IntegerTokenConverter.CONVERTER_KEY, "()Lm52/b;", "z", "(Lm52/b;)V", "Lm52/j;", JWKParameterNames.OCT_KEY_VALUE, "()Lm52/j;", "C", "(Lm52/j;)V", "Ll52/i;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "()Ll52/i;", "G", "(Ll52/i;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("segmentOrder")
    private int segmentOrder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDurationInSecs")
    private Integer estimatedDurationInSecs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDistanceInMeters")
    private Double estimatedDistanceInMeters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgTrainingSpeed")
    private Double avgTrainingSpeed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimateType")
    private m52.b estimateType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDistanceUnit")
    private m52.j estimatedDistanceUnit;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m52.k f48193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutSteps")
    private l52.i<j0> workoutSteps;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f48185j = new a(null);
    public static final Parcelable.Creator<h0> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        public final h0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h0(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : m52.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? m52.j.valueOf(parcel.readString()) : null, m52.k.valueOf(parcel.readString()), (l52.i) parcel.readParcelable(h0.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final h0[] newArray(int i14) {
            return new h0[i14];
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/h0$c;", "", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "node", "<init>", "(Ll52/i$a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l52.i.a<j0> f48195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JSONArray f48196b = new JSONArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48197c;

        public c(l52.i.a<j0> aVar) {
            this.f48195a = aVar;
        }
    }

    public h0(int i14, String str, Integer num, Double d14, Double d15, m52.b bVar, m52.j jVar, m52.k kVar, l52.i iVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this((i15 & 1) != 0 ? 1 : i14, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? null : d14, (i15 & 16) != 0 ? null : d15, (i15 & 32) != 0 ? null : bVar, (i15 & 64) != 0 ? null : jVar, (i15 & 128) != 0 ? m52.k.f116756p : kVar, (i15 & 256) != 0 ? l52.n.d(new w2(18)) : iVar);
    }

    public static final void b(h0 h0Var, JSONObject jSONObject, Double d14, m52.j jVar) {
        h0Var.segmentOrder = jSONObject.optInt("segmentOrder");
        String strOptString = jSONObject.optString("description");
        strOptString.getClass();
        if ((strOptString.length() > 0) & (true ^ BuildConfig.TRAVIS.equalsIgnoreCase(strOptString))) {
            h0Var.description = strOptString;
        }
        h0Var.estimatedDurationInSecs = !jSONObject.isNull("estimatedDurationInSecs") ? Integer.valueOf(jSONObject.optInt("estimatedDurationInSecs")) : null;
        h0Var.estimatedDistanceInMeters = jSONObject.isNull("estimatedDistanceInMeters") ? null : Double.valueOf(jSONObject.getDouble("estimatedDistanceInMeters"));
        h0Var.avgTrainingSpeed = Double.valueOf(jSONObject.optDouble("avgTrainingSpeed"));
        String strOptString2 = jSONObject.optString("estimateType");
        strOptString2.getClass();
        if (strOptString2.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString2)) {
            h0Var.estimateType = m52.b.valueOf(strOptString2);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("estimatedDistanceUnit");
        if (jSONObjectOptJSONObject != null) {
            String strOptString3 = jSONObjectOptJSONObject.optString("unitKey");
            strOptString3.getClass();
            if (strOptString3.length() > 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString3)) {
                String upperCase = strOptString3.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                h0Var.estimatedDistanceUnit = m52.j.valueOf(upperCase);
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("sportType");
        if (jSONObjectOptJSONObject2 != null) {
            String strOptString4 = jSONObjectOptJSONObject2.optString("sportTypeKey");
            m52.k.a aVar = m52.k.f116753m;
            strOptString4.getClass();
            aVar.getClass();
            m52.k kVarC = m52.k.a.c(strOptString4);
            if (kVarC == null) {
                kVarC = m52.k.f116756p;
            }
            h0Var.f48193h = kVarC;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("workoutSteps");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i14);
            if (jSONObject2 != null) {
                arrayList.add(f(jSONObject2, d14, jVar));
            }
        }
        p13.c0.u(arrayList, new a61.c(new e0(2), 4));
        h0Var.workoutSteps = l52.n.d(new g0(0, arrayList));
    }

    public static l52.e.b f(JSONObject jSONObject, Double d14, m52.j jVar) throws JSONException {
        String str;
        double d15;
        m52.h hVar;
        m52.h hVar2;
        m52.e eVar;
        m52.f fVar;
        Object obj;
        Boolean boolValueOf;
        Object next;
        j0.Q0.getClass();
        j0 j0Var = new j0(0, 0, null, 0, 0, false, null, false, false, null, null, null, 0, 0.0d, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, 0, 0, 0, 0, 0.0d, null, 0.0d, 0.0d, null, 0, null, 0, null, null, null, null, 0.0d, null, null, 0.0d, 0.0d, null, null, -1, 16383, null);
        j0Var.f48215a = jSONObject.optInt("stepOrder");
        if (jSONObject.optJSONObject("stepType") != null) {
            int iOptInt = jSONObject.getJSONObject("stepType").optInt("stepTypeId");
            j0Var.f48216b = iOptInt;
            m52.d.f116681c.getClass();
            Iterator<T> it = m52.d.f116692n.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((m52.d) next).f116693a != iOptInt);
            m52.d dVar = (m52.d) next;
            if (dVar == null) {
                dVar = m52.d.OTHER;
            }
            j0Var.f48217c = dVar;
        }
        j0Var.f48218d = jSONObject.optInt("childStepId");
        if (j0Var.f48217c == m52.d.REPEAT) {
            j0Var.i(jSONObject, d14, jVar);
            if (!jSONObject.isNull("numberOfIterations")) {
                j0Var.f48227l = m52.a.f116654j;
            }
            j0Var.f48219e = jSONObject.optInt("numberOfIterations");
            j0Var.f48220f = jSONObject.optBoolean("smartRepeat");
            if (BuildConfig.TRAVIS.equalsIgnoreCase(jSONObject.optString("skipLastRestStep"))) {
                boolValueOf = null;
            } else {
                j0Var.f48222h = true;
                boolValueOf = Boolean.valueOf(jSONObject.optBoolean("skipLastRestStep"));
            }
            j0Var.f48221g = boolValueOf;
            str = null;
        } else {
            String strOptString = jSONObject.optString("description");
            if (strOptString != null && strOptString.length() != 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString)) {
                j0Var.f48225k = strOptString;
            }
            j0Var.i(jSONObject, d14, jVar);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preferredEndConditionUnit");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("unitKey") && !BuildConfig.TRAVIS.equalsIgnoreCase(jSONObjectOptJSONObject.optString("unitKey"))) {
                m52.j.a aVar = m52.j.f116744d;
                String strOptString2 = jSONObjectOptJSONObject.optString("unitKey");
                strOptString2.getClass();
                aVar.getClass();
                j0Var.f48231p = m52.j.a.a(strOptString2);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("strokeType");
            if (jSONObjectOptJSONObject2 != null) {
                m52.f.a aVar2 = m52.f.f116704d;
                int iOptInt2 = jSONObjectOptJSONObject2.optInt("strokeTypeId");
                aVar2.getClass();
                m52.f[] fVarArrValues = m52.f.values();
                int length = fVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        fVar = null;
                        break;
                    }
                    fVar = fVarArrValues[i14];
                    if (fVar.f116711a == iOptInt2) {
                        break;
                    }
                    i14++;
                }
                j0Var.X = fVar;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("drillType");
            if (jSONObjectOptJSONObject3 != null) {
                qs.f.a aVar3 = qs.f.f147060d;
                int iOptInt3 = jSONObjectOptJSONObject3.optInt("drillTypeId");
                aVar3.getClass();
                j0Var.f48226k0 = qs.f.a.a(iOptInt3);
            }
            if (j0Var.X == m52.f.DRILL) {
                j0Var.X = m52.f.CHOICE;
                j0Var.f48226k0 = qs.f.DRILL;
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("equipmentType");
            if (jSONObjectOptJSONObject4 != null) {
                m52.e.a aVar4 = m52.e.f116695b;
                int iOptInt4 = jSONObjectOptJSONObject4.optInt("equipmentTypeId");
                aVar4.getClass();
                m52.e[] eVarArrValues = m52.e.values();
                int length2 = eVarArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        eVar = m52.e.NONE;
                        break;
                    }
                    eVar = eVarArrValues[i15];
                    if (eVar.f116703a == iOptInt4) {
                        break;
                    }
                    i15++;
                }
                j0Var.Z = eVar;
            } else {
                j0Var.Z = m52.e.NONE;
            }
            String strOptString3 = jSONObject.optString("endConditionCompare");
            if (strOptString3 != null && strOptString3.length() != 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString3)) {
                j0Var.f48230o = strOptString3;
            }
            if (jSONObject.optJSONObject("targetType") != null) {
                m52.g.a aVar5 = m52.g.f116714b;
                int iOptInt5 = jSONObject.getJSONObject("targetType").optInt("workoutTargetTypeId");
                aVar5.getClass();
                j0Var.f48232q = m52.g.a.a(iOptInt5);
            }
            j0Var.f48233r = jSONObject.optDouble("targetValueOne", Double.NaN);
            j0Var.f48234t = jSONObject.optDouble("targetValueTwo", Double.NaN);
            if (jSONObject.has("targetValueUnit") && !jSONObject.isNull("targetValueUnit")) {
                m52.h.a aVar6 = m52.h.f116728b;
                String strOptString4 = jSONObject.getJSONObject("targetValueUnit").optString("unitKey");
                aVar6.getClass();
                m52.h[] hVarArrValues = m52.h.values();
                int length3 = hVarArrValues.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length3) {
                        hVar2 = null;
                        break;
                    }
                    hVar2 = hVarArrValues[i16];
                    if (d53.u.q(strOptString4, hVar2.f116733a, true)) {
                        break;
                    }
                    i16++;
                }
                j0Var.f48235v = hVar2;
            }
            j0Var.f48236w = jSONObject.optInt("powerCurveDuration", -1);
            j0Var.f48237x = jSONObject.optInt("powerCurveScale", -1);
            j0Var.f48238y = jSONObject.optInt("powerCurveRange", -1);
            j0Var.f48239z = jSONObject.optInt("secondaryTargetPowerCurveDuration", -1);
            j0Var.A = jSONObject.optInt("secondaryTargetPowerCurveScale", -1);
            j0Var.B = jSONObject.optInt("secondaryTargetPowerCurveRange", -1);
            j0Var.C = jSONObject.optInt("zoneNumber", 0);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("secondaryTargetType");
            if (jSONObjectOptJSONObject5 != null) {
                m52.g.a aVar7 = m52.g.f116714b;
                int iOptInt6 = jSONObjectOptJSONObject5.optInt("workoutTargetTypeId");
                aVar7.getClass();
                j0Var.E = m52.g.a.a(iOptInt6);
            }
            j0Var.F = jSONObject.optDouble("secondaryTargetValueOne", Double.NaN);
            j0Var.I = jSONObject.optDouble("secondaryTargetValueTwo", Double.NaN);
            if (jSONObject.has("secondaryTargetValueUnit") && !jSONObject.isNull("secondaryTargetValueUnit")) {
                m52.h.a aVar8 = m52.h.f116728b;
                String strOptString5 = jSONObject.getJSONObject("secondaryTargetValueUnit").optString("unitKey");
                aVar8.getClass();
                m52.h[] hVarArrValues2 = m52.h.values();
                int length4 = hVarArrValues2.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length4) {
                        hVar = null;
                        break;
                    }
                    hVar = hVarArrValues2[i17];
                    if (d53.u.q(strOptString5, hVar.f116733a, true)) {
                        break;
                    }
                    i17++;
                }
                j0Var.P = hVar;
            }
            j0Var.T = jSONObject.optInt("secondaryZoneNumber", 0);
            String strOptString6 = jSONObject.optString("category");
            if (strOptString6 != null && strOptString6.length() != 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString6)) {
                j0Var.H0 = strOptString6;
            }
            String strOptString7 = jSONObject.optString("exerciseName");
            if (strOptString7 != null && strOptString7.length() != 0 && !BuildConfig.TRAVIS.equalsIgnoreCase(strOptString7)) {
                j0Var.I0 = strOptString7;
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("weightUnit");
            String strOptString8 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optString("unitKey") : null;
            if (strOptString8 != null) {
                str = null;
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                if (strOptString8.equals((zY ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a)) {
                    d15 = Double.NaN;
                    j0Var.J0 = jSONObject.optDouble("weightValue", Double.NaN);
                } else {
                    double dOptDouble = jSONObject.optDouble("weightValue", Double.NaN);
                    if (zY) {
                        if (!Double.isNaN(dOptDouble)) {
                            l3.f23124b.getClass();
                            dOptDouble /= 2.20462d;
                        }
                    } else if (!Double.isNaN(dOptDouble)) {
                        l3.f23124b.getClass();
                        dOptDouble *= 2.20462d;
                    }
                    j0Var.J0 = dOptDouble;
                    d15 = Double.NaN;
                }
            } else {
                str = null;
                d15 = Double.NaN;
                j0Var.J0 = jSONObject.optDouble("weightValue", Double.NaN);
            }
            String strOptString9 = jSONObject.optString("benchmarkKey");
            if (strOptString9.length() == 0) {
                strOptString9 = str;
            }
            j0Var.L0 = strOptString9;
            j0Var.M0 = jSONObject.optDouble("benchmarkPercentage", d15);
            j0Var.O0 = jSONObject.optString("stepAudioNoteUuid");
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("stepAudioNote");
            if (jSONObjectOptJSONObject7 != null) {
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVar9 = new com.garmin.android.apps.connectmobile.workouts.data.model.a(null, null, null, 7, null);
                aVar9.k(jSONObjectOptJSONObject7);
                j0Var.P0 = aVar9;
            }
            j0Var.f48223i = jSONObject.optBoolean("isMinReps");
        }
        Iterator<T> it3 = j0.c.f48246g.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = str;
                break;
            }
            Object next2 = it3.next();
            if (p005kotlin.jvm.internal.s.g(((j0.c) next2).name(), jSONObject.optString("relativeWeight"))) {
                obj = next2;
                break;
            }
        }
        j0Var.f48224j = (j0.c) obj;
        if (j0Var.E == m52.g.PACE && !zf.b.D(d14)) {
            j0Var.P = jVar == m52.j.f116748h ? m52.h.YARD : m52.h.METER;
        }
        if (j0Var.f48217c != m52.d.REPEAT) {
            return l52.n.c(j0Var);
        }
        l52.f.a aVarB = l52.n.b(j0Var);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("workoutSteps");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            int length5 = jSONArrayOptJSONArray.length();
            for (int i18 = 0; i18 < length5; i18++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i18);
                if (jSONObject2 != null) {
                    arrayList.add(f(jSONObject2, d14, jVar));
                }
            }
            p13.c0.u(arrayList, new a61.c(new e0(3), 5));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                l52.l.b(aVarB, (l52.e.b) it4.next());
            }
        }
        return aVarB;
    }

    public final void A(Double d14) {
        this.estimatedDistanceInMeters = d14;
    }

    public final void C(m52.j jVar) {
        this.estimatedDistanceUnit = jVar;
    }

    public final void D(Integer num) {
        this.estimatedDurationInSecs = num;
    }

    public final void F(int i14) {
        this.segmentOrder = i14;
    }

    public final void G(l52.i<j0> iVar) {
        iVar.getClass();
        this.workoutSteps = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2 A[Catch: JSONException -> 0x0137, TryCatch #0 {JSONException -> 0x0137, blocks: (B:3:0x000c, B:5:0x003b, B:8:0x0042, B:9:0x0049, B:11:0x004d, B:13:0x0058, B:14:0x005f, B:16:0x006a, B:18:0x0074, B:19:0x007b, B:21:0x007f, B:22:0x0088, B:24:0x008d, B:26:0x0093, B:34:0x00b5, B:29:0x00a2, B:31:0x00a6, B:33:0x00ac, B:35:0x00c3, B:36:0x00dd, B:39:0x00e6, B:41:0x00f6, B:43:0x00fe, B:44:0x0109, B:46:0x0112, B:48:0x011a, B:50:0x0126, B:51:0x012c), top: B:54:0x000c }] */
    public final JSONObject H(int i14) {
        j0 j0Var;
        m52.j jVar;
        String strName;
        String lowerCase;
        p0 p0Var = new p0();
        p0Var.f105807a = i14;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("segmentOrder", Integer.valueOf(this.segmentOrder));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("sportTypeKey", this.f48193h.f116765a);
            jSONObject2.putOpt("sportTypeId", Integer.valueOf(this.f48193h.f116766b));
            jSONObject.putOpt("sportType", jSONObject2);
            String str = this.description;
            if (str != null && str.length() != 0) {
                jSONObject.putOpt("description", this.description);
            }
            Integer num = this.estimatedDurationInSecs;
            if (num != null && num.intValue() >= 0.0d) {
                jSONObject.putOpt("estimatedDurationInSecs", this.estimatedDurationInSecs);
            }
            jSONObject.put("estimatedDistanceInMeters", this.estimatedDistanceInMeters);
            Double d14 = this.avgTrainingSpeed;
            if (d14 != null && !Double.isNaN(d14.doubleValue())) {
                jSONObject.putOpt("avgTrainingSpeed", this.avgTrainingSpeed);
            }
            m52.b bVar = this.estimateType;
            if (bVar != null) {
                jSONObject.putOpt("estimateType", bVar.name());
            }
            m52.j jVar2 = this.estimatedDistanceUnit;
            if (jVar2 != null) {
                String strName2 = jVar2.name();
                if (strName2 != null) {
                    m52.j.f116744d.getClass();
                    if (m52.j.a.a(strName2) == m52.j.f116748h) {
                        lowerCase = null;
                    } else {
                        jVar = this.estimatedDistanceUnit;
                        if (jVar != null || (strName = jVar.name()) == null) {
                            lowerCase = null;
                        } else {
                            lowerCase = strName.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                    }
                } else {
                    jVar = this.estimatedDistanceUnit;
                    if (jVar != null) {
                        lowerCase = null;
                    } else {
                        lowerCase = null;
                    }
                }
                jSONObject.putOpt("estimatedDistanceUnit", new z1(null, null, lowerCase).i());
            }
            Stack stack = new Stack();
            stack.push(new c(null));
            l52.o.a(this.workoutSteps, l52.h.PRE_ORDER, new a73.f(stack, 6, this, p0Var));
            while (stack.size() > 1) {
                c cVar = (c) stack.pop();
                c cVar2 = (c) stack.peek();
                l52.i.a<j0> aVar = cVar.f48195a;
                if (aVar != null && (j0Var = (j0) aVar.getData()) != null) {
                    int i15 = p0Var.f105807a;
                    int i16 = cVar2.f48197c;
                    cVar2.f48197c = i16 + 1;
                    j0Var.f48215a = i15 + i16;
                }
                p0Var.f105807a++;
                l52.i.a<j0> aVar2 = cVar.f48195a;
                if (aVar2 != null) {
                    j0 j0Var2 = (j0) aVar2.getData();
                    cVar2.f48196b.put(j0Var2 != null ? j0Var2.k().putOpt("workoutSteps", cVar.f48196b) : null);
                }
            }
            jSONObject.putOpt("workoutSteps", ((c) stack.pop()).f48196b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean d() {
        return l52.w.d(this.workoutSteps, this.f48193h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAvgTrainingSpeed() {
        return this.avgTrainingSpeed;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final m52.b getEstimateType() {
        return this.estimateType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getEstimatedDistanceInMeters() {
        return this.estimatedDistanceInMeters;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final m52.j getEstimatedDistanceUnit() {
        return this.estimatedDistanceUnit;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getEstimatedDurationInSecs() {
        return this.estimatedDurationInSecs;
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        if (k52.g.f(this.f48193h)) {
            l52.o.a(this.workoutSteps, l52.h.PRE_ORDER, new g2(1, arrayList));
        }
        return arrayList;
    }

    public final int q() {
        p0 p0Var = new p0();
        p0 p0Var2 = new p0();
        l52.o.a(this.workoutSteps, l52.h.POST_ORDER, new a0.h(22, p0Var2, p0Var));
        int i14 = p0Var.f105807a;
        return i14 > 0 ? i14 : p0Var2.f105807a;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getSegmentOrder() {
        return this.segmentOrder;
    }

    public final int s() {
        return l52.o.d(this.workoutSteps);
    }

    public final l52.i<j0> t() {
        return this.workoutSteps;
    }

    public final void u(Double d14) {
        this.avgTrainingSpeed = d14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.segmentOrder);
        parcel.writeString(this.description);
        Integer num = this.estimatedDurationInSecs;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.estimatedDistanceInMeters;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.avgTrainingSpeed;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        m52.b bVar = this.estimateType;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        m52.j jVar = this.estimatedDistanceUnit;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jVar.name());
        }
        parcel.writeString(this.f48193h.name());
        parcel.writeParcelable(this.workoutSteps, i14);
    }

    public final void y(String str) {
        this.description = str;
    }

    public final void z(m52.b bVar) {
        this.estimateType = bVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/h0$a;", "", "<init>", "()V", "", "SEGMENT_ORDER", "Ljava/lang/String;", "SPORT_TYPE", "SPORT_TYPE_KEY", "WORKOUT_STEPS", "SPORT_TYPE_ID", "KEY_DESCRIPTION", "KEY_ESTIMATED_DURATION_IN_SEC", "KEY_ESTIMATED_DISTANCE_IN_METERS", "KEY_AVG_TRAINING_SPEED", "KEY_ESTIMATED_DISTANCE_UNIT", "KEY_ESTIMATE_TYPE", "KEY_UNIT_KEY", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h0(int i14, String str, Integer num, Double d14, Double d15, m52.b bVar, m52.j jVar, m52.k kVar, l52.i<j0> iVar) {
        kVar.getClass();
        iVar.getClass();
        this.segmentOrder = i14;
        this.description = str;
        this.estimatedDurationInSecs = num;
        this.estimatedDistanceInMeters = d14;
        this.avgTrainingSpeed = d15;
        this.estimateType = bVar;
        this.estimatedDistanceUnit = jVar;
        this.f48193h = kVar;
        this.workoutSteps = iVar;
    }

    public h0() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }
}
