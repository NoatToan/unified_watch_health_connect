package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import ds.e0;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(SwingDeserializer.class)
public class SwingDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<SwingDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f35874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f35875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[][] f35876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[][] f35877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f35879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35881j;

    public static class SwingDeserializer implements JsonDeserializer<SwingDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final SwingDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                SwingDTO swingDTO = new SwingDTO();
                swingDTO.k(new JSONObject(jsonElement.toString()));
                return swingDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<SwingDTO> {
        @Override // android.os.Parcelable.Creator
        public final SwingDTO createFromParcel(Parcel parcel) {
            return new SwingDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SwingDTO[] newArray(int i14) {
            return new SwingDTO[i14];
        }
    }

    public SwingDTO(Parcel parcel) {
        this.f35881j = -1;
        this.f35872a = parcel.readLong();
        this.f35873b = parcel.readString();
        this.f35874c = parcel.readLong();
        this.f35881j = parcel.readInt();
        this.f35875d = (k) parcel.readParcelable(k.class.getClassLoader());
        int i14 = parcel.readInt();
        if (i14 > 0) {
            this.f35876e = new double[i14][];
            int i15 = 0;
            while (true) {
                double[][] dArr = this.f35876e;
                if (i15 >= dArr.length) {
                    break;
                }
                dArr[i15] = parcel.createDoubleArray();
                i15++;
            }
        }
        int i16 = parcel.readInt();
        if (i16 > 0) {
            this.f35877f = new double[i16][];
            int i17 = 0;
            while (true) {
                double[][] dArr2 = this.f35877f;
                if (i17 >= dArr2.length) {
                    break;
                }
                dArr2[i17] = parcel.createDoubleArray();
                i17++;
            }
        }
        this.f35878g = parcel.readByte() != 0;
        this.f35879h = (i) parcel.readParcelable(i.class.getClassLoader());
    }

    public static double[][] C(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        double[][] dArr = new double[jSONArray.length()][];
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i14);
            double[] dArr2 = new double[jSONArray2.length()];
            for (int i15 = 0; i15 < jSONArray2.length(); i15++) {
                dArr2[i15] = jSONArray2.getDouble(i15);
            }
            dArr[i14] = dArr2;
        }
        return dArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SwingDTO swingDTO = (SwingDTO) obj;
            i iVar = this.f35879h;
            if (iVar != null && iVar.equals(swingDTO.f35879h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35879h);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f35872a = jSONObject.optLong("swingId");
            String strOptString = jSONObject.optString("swingTime");
            if (TextUtils.isEmpty(strOptString)) {
                this.f35880i = -1L;
            } else {
                this.f35873b = strOptString;
                this.f35880i = j0.f23103e.parseMillis(strOptString);
            }
            this.f35874c = jSONObject.optLong("swingTimeZoneOffset");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("club");
            k kVar = new k();
            kVar.k(jSONObjectOptJSONObject);
            this.f35875d = kVar;
            this.f35876e = C(jSONObject.optJSONArray("clubPaths"));
            this.f35877f = C(jSONObject.optJSONArray("wristPaths"));
            this.f35878g = jSONObject.optBoolean("favorite");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("swingMetrics");
            i iVar = new i();
            iVar.k(jSONObjectOptJSONObject2);
            this.f35879h = iVar;
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SwingDTO{id=");
        sb3.append(this.f35872a);
        sb3.append(", swingTime='");
        sb3.append(this.f35873b);
        sb3.append("', swingTimeZoneOffset=");
        sb3.append(this.f35874c);
        sb3.append(", club=");
        sb3.append(this.f35875d);
        sb3.append(", clubPaths=");
        sb3.append(Arrays.toString(this.f35876e));
        sb3.append(", wristPaths=");
        sb3.append(Arrays.toString(this.f35877f));
        sb3.append(", favorite=");
        sb3.append(this.f35878g);
        sb3.append(", swingMetrics=");
        sb3.append(this.f35879h);
        sb3.append(", swingTimeInMillis=");
        sb3.append(this.f35880i);
        sb3.append(", sequenceOrder=");
        return e0.j(sb3, this.f35881j, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f35872a);
        parcel.writeString(this.f35873b);
        parcel.writeLong(this.f35874c);
        parcel.writeInt(this.f35881j);
        parcel.writeParcelable(this.f35875d, i14);
        double[][] dArr = this.f35876e;
        parcel.writeInt(dArr != null ? dArr.length : 0);
        double[][] dArr2 = this.f35876e;
        if (dArr2 != null) {
            for (double[] dArr3 : dArr2) {
                parcel.writeDoubleArray(dArr3);
            }
        }
        double[][] dArr4 = this.f35877f;
        parcel.writeInt(dArr4 != null ? dArr4.length : 0);
        double[][] dArr5 = this.f35877f;
        if (dArr5 != null) {
            for (double[] dArr6 : dArr5) {
                parcel.writeDoubleArray(dArr6);
            }
        }
        parcel.writeByte(this.f35878g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f35879h, i14);
    }

    public SwingDTO(long j8, String str, long j14, k kVar, double[][] dArr, double[][] dArr2, boolean z14, i iVar, int i14) {
        this.f35872a = j8;
        this.f35873b = str;
        this.f35874c = j14;
        this.f35875d = kVar;
        this.f35876e = dArr;
        this.f35877f = dArr2;
        this.f35878g = z14;
        this.f35879h = iVar;
        this.f35881j = i14;
    }

    public SwingDTO() {
        this.f35881j = -1;
    }
}
