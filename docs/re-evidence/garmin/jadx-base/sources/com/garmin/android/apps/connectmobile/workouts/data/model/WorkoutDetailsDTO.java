package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.z1;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(WorkoutDetailsDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "WorkoutDetailsDeserializer", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutDetailsDTO extends WorkoutDTO implements Parcelable {
    public static final Parcelable.Creator<WorkoutDetailsDTO> CREATOR;
    public List<h0> Q0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO$WorkoutDetailsDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WorkoutDetailsDeserializer implements JsonDeserializer<WorkoutDetailsDTO>, JsonSerializer<WorkoutDetailsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final WorkoutDetailsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
                workoutDetailsDTO.k(new JSONObject(jsonElement.toString()));
                return workoutDetailsDTO;
            } catch (Exception e4) {
                a2 a2Var = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.g(a2Var, "WorkoutDetailsDTO", e4);
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(WorkoutDetailsDTO workoutDetailsDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            WorkoutDetailsDTO workoutDetailsDTO2 = workoutDetailsDTO;
            workoutDetailsDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(workoutDetailsDTO2.e0().toString(), JsonElement.class);
            } catch (Exception e4) {
                a2 a2Var = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.g(a2Var, "WorkoutDetailsDTO", e4);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkoutDetailsDTO> {
        @Override // android.os.Parcelable.Creator
        public final WorkoutDetailsDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WorkoutDetailsDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WorkoutDetailsDTO[] newArray(int i14) {
            return new WorkoutDetailsDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutDetailsDTO(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        ArrayList arrayList = new ArrayList();
        this.Q0 = arrayList;
        parcel.readList(arrayList, h0.class.getClassLoader());
    }

    public final int a0() {
        Iterator<T> it = this.Q0.iterator();
        int iD = 0;
        while (it.hasNext()) {
            iD += l52.o.d(((h0) it.next()).t());
        }
        return iD;
    }

    public final boolean c0() {
        if (this.f48053m != null) {
            return true;
        }
        int i14 = 0;
        if (!this.Q0.isEmpty()) {
            Object objB = l52.o.b(this.Q0.get(0).t(), l52.h.PRE_ORDER, new e0(i14));
            int i15 = o13.q.f128596b;
            if (objB instanceof o13.q.b) {
                objB = null;
            }
            Boolean bool = (Boolean) objB;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject e0() {
        String lowerCase;
        String strName;
        String lowerCase2;
        String strName2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("workoutId", Long.valueOf(this.f48040a));
            jSONObject.putOpt("workoutName", this.f48041b);
            jSONObject.putOpt("createdDate", this.f48042c);
            jSONObject.putOpt("updateDate", this.f48043d);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("sportTypeKey", this.f48044e.f116765a);
            jSONObject2.putOpt("sportTypeId", Integer.valueOf(this.f48044e.f116766b));
            jSONObject.putOpt("sportType", jSONObject2);
            jSONObject.putOpt("subSportType", this.f48045f.name());
            String str = this.f48046g;
            if (str != null && str.length() != 0) {
                jSONObject.putOpt("description", this.f48046g);
            }
            if (zf.b.D(this.f48047h)) {
                jSONObject.putOpt("poolLength", this.f48047h);
            }
            if (this.f48048i != null) {
                m52.j jVar = this.f48048i;
                if (jVar == null || (strName2 = jVar.name()) == null) {
                    lowerCase2 = null;
                } else {
                    lowerCase2 = strName2.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                }
                jSONObject.putOpt("poolLengthUnit", new z1(null, null, lowerCase2).i());
            }
            jSONObject.putOpt("ownerId", Integer.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()));
            Integer num = this.f48049j;
            if (num != null && num.intValue() >= 0.0d) {
                jSONObject.putOpt("estimatedDurationInSecs", this.f48049j);
            }
            jSONObject.put("estimatedDistanceInMeters", this.f48050k);
            Double d14 = this.f48052l;
            if (d14 != null && !Double.isNaN(d14.doubleValue())) {
                jSONObject.putOpt("avgTrainingSpeed", this.f48052l);
            }
            m52.b bVar = this.f48053m;
            if (bVar != null) {
                jSONObject.putOpt("estimateType", bVar.name());
            }
            if (this.f48054n != null) {
                m52.j jVar2 = this.f48054n;
                if (jVar2 == null || (strName = jVar2.name()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = strName.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                jSONObject.putOpt("estimatedDistanceUnit", new z1(null, null, lowerCase).i());
            }
            String str2 = this.f48056p;
            if (str2 != null && str2.length() != 0) {
                jSONObject.putOpt("consumer", this.f48056p);
            }
            String str3 = this.f48057q;
            if (str3 != null && str3.length() != 0) {
                jSONObject.putOpt("consumerName", this.f48057q);
            }
            String str4 = this.f48058r;
            if (str4 != null && str4.length() != 0) {
                jSONObject.putOpt("consumerImageURL", this.f48058r);
            }
            String str5 = this.f48059t;
            if (str5 != null && str5.length() != 0) {
                jSONObject.putOpt("consumerWebsiteURL", this.f48059t);
            }
            List<String> list = this.f48061w;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                List<String> list2 = this.f48061w;
                list2.getClass();
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("primaryMuscles", jSONArray);
            }
            List<String> list3 = this.H0;
            if (list3 != null && !list3.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    jSONArray2.put((String) it3.next());
                }
                jSONObject.put("primaryMuscles", jSONArray2);
            }
            String str6 = this.f48060v;
            if (str6 != null && str6.length() != 0) {
                jSONObject.putOpt("bodyParts", this.f48060v);
            }
            String str7 = this.f48062x;
            if (str7 != null && str7.length() != 0) {
                jSONObject.putOpt("difficulty", this.f48062x);
            }
            String str8 = this.f48063y;
            if (str8 != null && str8.length() != 0) {
                jSONObject.putOpt("focus", this.f48063y);
            }
            String str9 = this.f48064z;
            if (str9 != null && str9.length() != 0) {
                jSONObject.putOpt("goals", this.f48064z);
            }
            String str10 = this.A;
            if (str10 != null && str10.length() != 0) {
                jSONObject.putOpt("how", this.A);
            }
            String str11 = this.B;
            if (str11 != null && str11.length() != 0) {
                jSONObject.putOpt("imageAttribution", this.B);
            }
            String str12 = this.C;
            if (str12 != null && str12.length() != 0) {
                jSONObject.putOpt("locale", this.C);
            }
            String str13 = this.D;
            if (str13 != null && str13.length() != 0) {
                jSONObject.putOpt("workoutProvider", this.D);
            }
            String str14 = this.E;
            if (str14 != null && str14.length() != 0) {
                jSONObject.putOpt("workoutSourceId", this.E);
            }
            String str15 = this.F;
            if (str15 != null && str15.length() != 0) {
                jSONObject.putOpt("heroImage", this.F);
            }
            String str16 = this.I;
            if (str16 != null && str16.length() != 0) {
                jSONObject.putOpt("equipment", this.I);
            }
            String str17 = this.T;
            if (str17 != null && str17.length() != 0) {
                jSONObject.putOpt("workoutAudioNoteUuid", this.T);
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = this.X;
            if (aVar != null) {
                jSONObject.putOpt("workoutAudioNote", aVar.H());
            }
            long j8 = this.Y;
            if (j8 > 0) {
                jSONObject.putOpt("trainingPlanId", Long.valueOf(j8));
            }
            if (!Double.isNaN(this.Z)) {
                jSONObject.putOpt("estimatedTrainingEffect", Double.valueOf(this.Z));
            }
            if (!Double.isNaN(this.f48051k0)) {
                jSONObject.putOpt("estimatedAnaerobicTrainingEffect", Double.valueOf(this.f48051k0));
            }
            jSONObject.putOpt("isWheelchair", this.I0);
            jSONObject.putOpt("isSessionTransitionEnabled", Boolean.valueOf(this.J0));
            String str18 = this.K0;
            if (str18 != null && str18.length() != 0) {
                jSONObject.putOpt("workoutUuid", this.K0);
            }
            Object obj = this.L0;
            if (obj != null) {
                jSONObject.putOpt("workoutIndex", obj);
            }
            qs.u uVar = this.M0;
            if (uVar != null) {
                jSONObject.putOpt("trainingEffectLabel", uVar.name());
            }
            w wVar = this.N0;
            if (wVar != null) {
                jSONObject.putOpt("runWalkDescription", wVar.D());
            }
            String str19 = this.O0;
            if (str19 != null && str19.length() != 0) {
                jSONObject.putOpt("workoutThumbnailUrl", this.O0);
            }
        } catch (JSONException e4) {
            a2 a2Var = a2.WORKOUTS;
            String strN = fb1.c.n("JsonException: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var, "WorkoutDTO", strN);
        }
        try {
            JSONArray jSONArray3 = new JSONArray();
            int i14 = 0;
            int i15 = 1;
            for (h0 h0Var : this.Q0) {
                int i16 = i14 + 1;
                h0Var.F(i14);
                JSONObject jSONObjectH = h0Var.H(i15);
                JSONArray jSONArray4 = jSONObjectH.getJSONArray("workoutSteps");
                i15 = jSONArray4.getJSONObject(jSONArray4.length() - 1).getInt("stepOrder") + 1;
                jSONArray3.put(jSONObjectH);
                i14 = i16;
            }
            jSONObject.putOpt("workoutSegments", jSONArray3);
        } catch (JSONException e14) {
            a2 a2Var2 = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.g(a2Var2, "WorkoutDetailsDTO", e14);
        }
        return jSONObject;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO, com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        super.k(jSONObject);
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("workoutSegments")) == null || jSONArrayOptJSONArray.length() == 0) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i14);
            if (jSONObject2 != null) {
                List<h0> list = this.Q0;
                h0.a aVar = h0.f48185j;
                Double d14 = this.f48047h;
                m52.j jVar = this.f48048i;
                aVar.getClass();
                h0 h0Var = new h0(0, null, null, null, null, null, null, null, null, 511, null);
                h0.b(h0Var, jSONObject2, d14, jVar);
                list.add(h0Var);
            }
        }
        p13.c0.u(this.Q0, new a61.c(new e0(1), 3));
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeList(this.Q0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WORKOUT_SEGMENTS", "WORKOUT_STEPS", "WORKOUT_STEP_ORDER", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public WorkoutDetailsDTO() {
        this.Q0 = new ArrayList();
    }
}
