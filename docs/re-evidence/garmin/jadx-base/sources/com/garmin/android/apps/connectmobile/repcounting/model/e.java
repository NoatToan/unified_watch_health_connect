package com.garmin.android.apps.connectmobile.repcounting.model;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import d53.u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p13.d0;
import x91.j;

/* JADX INFO: loaded from: classes9.dex */
public class e extends s1 implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("messageIndex")
    private int f41111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("startTime")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private DateTime f41112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("duration")
    private Double f41113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("setType")
    private String f41114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f41117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SerializedName("repetitionCount")
    private Long f41118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("weight")
    private Long f41119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f41120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("exercises")
    private b[] f41121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("wktStepIndex")
    private Integer f41122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<String> f41124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<String> f41125o;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    private e(Parcel parcel) {
        this.f41111a = parcel.readInt();
        long j8 = parcel.readLong();
        if (j8 > 0) {
            this.f41112b = new DateTime(j8);
        }
        this.f41113c = Double.valueOf(parcel.readDouble());
        this.f41114d = parcel.readString();
        this.f41115e = parcel.readString();
        this.f41116f = parcel.readString();
        this.f41117g = parcel.readString();
        this.f41118h = Long.valueOf(parcel.readLong());
        this.f41119i = Long.valueOf(parcel.readLong());
        this.f41121k = (b[]) parcel.createTypedArray(b.CREATOR);
        if (parcel.readByte() == 0) {
            this.f41122l = null;
        } else {
            this.f41122l = Integer.valueOf(parcel.readInt());
        }
        this.f41124n = parcel.createStringArrayList();
        this.f41125o = parcel.createStringArrayList();
    }

    public final e C() {
        e eVar = new e();
        eVar.f41111a = this.f41111a;
        eVar.f41112b = this.f41112b;
        eVar.f41113c = this.f41113c;
        eVar.f41114d = this.f41114d;
        eVar.f41115e = this.f41115e;
        eVar.f41116f = this.f41116f;
        eVar.f41117g = this.f41117g;
        eVar.f41118h = this.f41118h;
        eVar.f41119i = this.f41119i;
        eVar.f41120j = this.f41120j;
        eVar.f41121k = new b[this.f41121k.length];
        int i14 = 0;
        while (true) {
            b[] bVarArr = this.f41121k;
            if (i14 >= bVarArr.length) {
                eVar.f41122l = this.f41122l;
                eVar.f41124n = this.f41124n;
                eVar.f41125o = this.f41125o;
                return eVar;
            }
            eVar.f41121k[i14] = bVarArr[i14].C();
            i14++;
        }
    }

    public final Double D() {
        return this.f41113c;
    }

    public final b[] F() {
        return this.f41121k;
    }

    public final int G() {
        return this.f41111a;
    }

    public final Long H() {
        return this.f41118h;
    }

    public final DateTime I() {
        return this.f41112b;
    }

    public final String M() {
        return this.f41114d;
    }

    public final Long Z() {
        return this.f41119i;
    }

    public final Integer a0() {
        return this.f41122l;
    }

    public final void c0() {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f41121k));
        d0.A(arrayList, new j(13), true);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            t.g();
            return;
        }
        b bVar = (b) it.next();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (Double.compare(bVar.G(), bVar2.G()) < 0) {
                bVar = bVar2;
            }
        }
        this.f41116f = bVar.F();
        this.f41115e = bVar.D();
        String str = this.f41116f;
        if (str == null || str.length() == 0) {
            String str2 = this.f41115e;
            this.f41116f = str2;
            if (str2 == null || str2.length() == 0 || u.q(this.f41116f, PrivacyUpdateRequestError.UNKNOWN, true)) {
                this.f41117g = null;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e0() {
        String str = this.f41114d;
        return str != null && str.equalsIgnoreCase(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f41112b, eVar.f41112b) && Objects.equals(this.f41113c, eVar.f41113c) && Objects.equals(this.f41114d, eVar.f41114d) && Objects.equals(this.f41115e, eVar.f41115e) && Objects.equals(this.f41116f, eVar.f41116f) && Objects.equals(this.f41117g, eVar.f41117g) && Objects.equals(this.f41118h, eVar.f41118h) && Objects.equals(this.f41119i, eVar.f41119i) && Arrays.equals(this.f41120j, eVar.f41120j) && Arrays.equals(this.f41121k, eVar.f41121k) && Objects.equals(this.f41122l, eVar.f41122l) && Integer.valueOf(this.f41111a).equals(Integer.valueOf(eVar.f41111a))) {
                return true;
            }
        }
        return false;
    }

    public final boolean f0() {
        String str = this.f41114d;
        return str != null && str.equalsIgnoreCase("rest");
    }

    public final void g0(Double d14) {
        this.f41113c = d14;
    }

    public final void h0(b[] bVarArr) {
        this.f41121k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length);
    }

    public final int hashCode() {
        return (((Objects.hash(this.f41112b, this.f41113c, this.f41114d, this.f41115e, this.f41116f, this.f41117g, this.f41118h, this.f41119i, this.f41122l, Integer.valueOf(this.f41111a)) * 31) + Arrays.hashCode(this.f41120j)) * 31) + Arrays.hashCode(this.f41121k);
    }

    public final void i0(Long l14) {
        this.f41118h = l14;
    }

    public final void j0(DateTime dateTime) {
        this.f41112b = dateTime;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        Long l14;
        String[] strArr;
        String[] strArr2;
        if (jSONObject.has("messageIndex") && !jSONObject.isNull("messageIndex")) {
            this.f41111a = jSONObject.optInt("messageIndex");
        }
        if (!jSONObject.has("startTime") || jSONObject.isNull("startTime")) {
            this.f41112b = new DateTime();
        } else {
            this.f41112b = j0.K(jSONObject.optString("startTime"), "yyyy-MM-dd'T'HH:mm:ss.SSS");
        }
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            this.f41113c = Double.valueOf(jSONObject.optDouble("duration"));
        }
        this.f41114d = jSONObject.optString("setType");
        if (jSONObject.has("repetitionCount") && !jSONObject.isNull("repetitionCount")) {
            this.f41118h = Long.valueOf(jSONObject.optLong("repetitionCount"));
        }
        if (jSONObject.has("weight") && !jSONObject.isNull("weight")) {
            this.f41119i = Long.valueOf(jSONObject.optLong("weight"));
        }
        if (jSONObject.has("exerciseTypeCandidates")) {
            JSONArray jSONArray = jSONObject.getJSONArray("exerciseTypeCandidates");
            if (jSONArray != null) {
                int length = jSONArray.length();
                strArr2 = new String[length];
                for (int i14 = 0; i14 < length; i14++) {
                    strArr2[i14] = jSONArray.optString(i14);
                }
            } else {
                strArr2 = null;
            }
            this.f41120j = strArr2;
        }
        if (jSONObject.has("exerciseTypeCandidates")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("exerciseTypeCandidates");
            if (jSONArray2 != null) {
                int length2 = jSONArray2.length();
                strArr = new String[length2];
                for (int i15 = 0; i15 < length2; i15++) {
                    strArr[i15] = jSONArray2.optString(i15);
                }
            } else {
                strArr = null;
            }
            this.f41120j = strArr;
        }
        if (jSONObject.has("exercises")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("exercises");
            int length3 = jSONArray3.length();
            b[] bVarArr = new b[length3];
            for (int i16 = 0; i16 < jSONArray3.length(); i16++) {
                b bVar = new b();
                bVar.k(jSONArray3.getJSONObject(i16));
                bVarArr[i16] = bVar;
            }
            if (length3 != 0 || (l14 = this.f41118h) == null || l14.longValue() <= 0) {
                this.f41121k = bVarArr;
                c0();
            } else {
                this.f41117g = null;
            }
        }
        if (!jSONObject.has("wktStepIndex") || jSONObject.isNull("wktStepIndex")) {
            return;
        }
        this.f41122l = Integer.valueOf(jSONObject.optInt("wktStepIndex"));
    }

    public final void k0(String str) {
        this.f41114d = str;
    }

    public final void n0(Long l14) {
        this.f41119i = l14;
    }

    public final JSONObject o0() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            b[] bVarArr = this.f41121k;
            if (bVarArr != null && bVarArr.length > 0) {
                for (b bVar : bVarArr) {
                    jSONArray.put(bVar.Z());
                }
            }
            jSONObject.put("exercises", jSONArray);
            jSONObject.put("startTime", simpleDateFormat.format(this.f41112b.toDate()));
            Double d14 = this.f41113c;
            Object obj = JSONObject.NULL;
            jSONObject.put("duration", (d14 == obj || d14 == null || d14.doubleValue() == 0.0d) ? obj : this.f41113c);
            jSONObject.put("setType", this.f41114d);
            Long l14 = this.f41118h;
            jSONObject.put("repetitionCount", (l14 == obj || l14 == null || l14.longValue() == -2) ? obj : this.f41118h);
            Long l15 = this.f41119i;
            jSONObject.put("weight", (l15 == obj || l15 == null || l15.longValue() == -2) ? obj : this.f41119i);
            Integer num = this.f41122l;
            if (num != obj && num != null && num.intValue() != -2) {
                obj = this.f41122l;
            }
            jSONObject.put("wktStepIndex", obj);
            return jSONObject;
        } catch (JSONException e4) {
            i2.d("ExerciseSetDTO", "Error while converting to JSON object: " + e4.toString());
            return jSONObject;
        }
    }

    public final String toString() {
        return "ExerciseSetDTO{mStartTimeGMT=" + this.f41112b + ", mDuration=" + this.f41113c + ", mType='" + this.f41114d + "', mExerciseKeyName='" + this.f41116f + "', mExerciseName='" + this.f41117g + "', mRepCount=" + this.f41118h + ", mWeight=" + this.f41119i + ", mExerciseKeyNameCandidates=" + Arrays.toString(this.f41120j) + ", mExercisesSet=" + Arrays.toString(this.f41121k) + ", mWorkoutStepIndex=" + this.f41122l + CoreConstants.CURLY_RIGHT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f41111a);
        DateTime dateTime = this.f41112b;
        parcel.writeLong(dateTime == null ? 0L : dateTime.toDate().getTime());
        Double d14 = this.f41113c;
        parcel.writeDouble(d14 == null ? 0.0d : d14.doubleValue());
        parcel.writeString(this.f41114d);
        parcel.writeString(this.f41115e);
        parcel.writeString(this.f41116f);
        parcel.writeString(this.f41117g);
        String str = this.f41114d;
        if (str == null || !"REST".contentEquals(str)) {
            Long l14 = this.f41118h;
            parcel.writeLong(l14 == null ? -2L : l14.longValue());
        } else {
            Long l15 = this.f41118h;
            parcel.writeLong(l15 == null ? 0L : l15.longValue());
        }
        String str2 = this.f41114d;
        if (str2 == null || !"REST".contentEquals(str2)) {
            Long l16 = this.f41119i;
            parcel.writeLong(l16 != null ? l16.longValue() : -2L);
        } else {
            Long l17 = this.f41119i;
            parcel.writeLong(l17 != null ? l17.longValue() : 0L);
        }
        parcel.writeTypedArray(this.f41121k, 0);
        if (this.f41122l == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f41122l.intValue());
        }
        parcel.writeStringList(this.f41124n);
        parcel.writeStringList(this.f41125o);
    }

    public e() {
    }

    public e(e eVar) {
        if (eVar == null) {
            return;
        }
        DateTime dateTime = eVar.f41112b;
        if (dateTime != null) {
            this.f41112b = new DateTime(dateTime);
        }
        this.f41111a = eVar.f41111a;
        this.f41113c = eVar.f41113c;
        this.f41114d = eVar.f41114d;
        this.f41115e = eVar.f41115e;
        this.f41116f = eVar.f41116f;
        this.f41117g = eVar.f41117g;
        this.f41118h = eVar.f41118h;
        this.f41119i = eVar.f41119i;
        String[] strArr = eVar.f41120j;
        int i14 = 0;
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f41120j = strArr2;
            System.arraycopy(eVar.f41120j, 0, strArr2, 0, strArr2.length);
        }
        b[] bVarArr = eVar.f41121k;
        if (bVarArr != null) {
            this.f41121k = new b[bVarArr.length];
            while (true) {
                b[] bVarArr2 = this.f41121k;
                if (i14 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i14] = new b(eVar.f41121k[i14]);
                i14++;
            }
        }
        this.f41122l = eVar.f41122l;
        this.f41124n = eVar.f41124n;
        this.f41125o = eVar.f41125o;
    }

    public /* synthetic */ e(Parcel parcel, int i14) {
        this(parcel);
    }
}
