package com.garmin.android.apps.connectmobile.repcounting.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends s1 implements Parcelable, Comparable<b> {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("probability")
    private double f41092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("category")
    private String f41093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("name")
    private String f41094c;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    private b(Parcel parcel) {
        this.f41092a = parcel.readDouble();
        this.f41093b = parcel.readString();
        this.f41094c = parcel.readString();
    }

    public final b C() {
        b bVar = new b();
        bVar.f41092a = this.f41092a;
        bVar.f41093b = this.f41093b;
        bVar.f41094c = this.f41094c;
        return bVar;
    }

    public final String D() {
        return this.f41093b;
    }

    public final String F() {
        return this.f41094c;
    }

    public final double G() {
        return this.f41092a;
    }

    public final void H(String str) {
        this.f41093b = str;
    }

    public final void I(String str) {
        this.f41094c = str;
    }

    public final void M() {
        this.f41092a = 100L;
    }

    public final JSONObject Z() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f41093b;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("category", obj);
            Object obj2 = this.f41094c;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("name", obj2);
            jSONObject.put("probability", this.f41092a);
            return jSONObject;
        } catch (JSONException e4) {
            i2.d("ExerciseDTO", "Error while converting to JSON object: " + e4.toString());
            return jSONObject;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return Double.compare(this.f41092a, bVar.f41092a);
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
            b bVar = (b) obj;
            if (Double.compare(bVar.f41092a, this.f41092a) == 0 && Objects.equals(this.f41093b, bVar.f41093b) && Objects.equals(this.f41094c, bVar.f41094c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.f41092a), this.f41093b, this.f41094c);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject.has("category") && !jSONObject.isNull("category")) {
            this.f41093b = jSONObject.optString("category");
        }
        if (jSONObject.has("name") && !jSONObject.isNull("name")) {
            this.f41094c = jSONObject.optString("name");
        }
        if (jSONObject.has("probability")) {
            this.f41092a = jSONObject.optDouble("probability");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeDouble(this.f41092a);
        parcel.writeString(this.f41093b);
        parcel.writeString(this.f41094c);
    }

    public b() {
    }

    public b(b bVar) {
        if (bVar == null) {
            return;
        }
        this.f41092a = bVar.f41092a;
        this.f41093b = bVar.f41093b;
        this.f41094c = bVar.f41094c;
    }

    public /* synthetic */ b(Parcel parcel, int i14) {
        this(parcel);
    }
}
