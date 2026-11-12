package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.s1;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class t extends s1 implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f29674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f29675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f29677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Double f29678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Double f29680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Double f29681l;

    public class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public t(Parcel parcel) {
        this.f29670a = parcel.readString();
        this.f29671b = parcel.readInt();
        this.f29672c = parcel.readInt();
        this.f29673d = parcel.readInt();
        if (parcel.readByte() == 1) {
            this.f29674e = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 1) {
            this.f29675f = Double.valueOf(parcel.readDouble());
        }
        this.f29676g = parcel.readString();
        if (parcel.readByte() == 1) {
            this.f29677h = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 1) {
            this.f29678i = Double.valueOf(parcel.readDouble());
        }
        this.f29679j = parcel.readString();
        if (parcel.readByte() == 1) {
            this.f29680k = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 1) {
            this.f29681l = Double.valueOf(parcel.readDouble());
        }
    }

    public static void C(JSONObject jSONObject, String str, Double d14) throws JSONException {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return;
        }
        jSONObject.put(str, d14);
    }

    public final void D(Double d14) {
        this.f29680k = d14;
    }

    public final void F(Double d14) {
        this.f29681l = d14;
    }

    public final void G(Double d14) {
        this.f29677h = d14;
    }

    public final void H(Double d14) {
        this.f29678i = d14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f29670a = s1.u(jSONObject, "name");
        if (!jSONObject.isNull(ModelSourceWrapper.TYPE)) {
            this.f29671b = s1.r(jSONObject, ModelSourceWrapper.TYPE).intValue();
        }
        this.f29672c = !jSONObject.isNull("gfLow") ? s1.r(jSONObject, "gfLow").intValue() : -1;
        this.f29673d = jSONObject.isNull("gfHigh") ? -1 : s1.r(jSONObject, "gfHigh").intValue();
        if (!jSONObject.isNull("waterType")) {
            this.f29674e = s1.r(jSONObject, "waterType");
        }
        if (!jSONObject.isNull("waterDensity")) {
            this.f29675f = Double.valueOf(jSONObject.getDouble("waterDensity"));
        }
        this.f29676g = s1.u(jSONObject, "ccrLowSetpointSwitchMode");
        if (!jSONObject.isNull("ccrLowSetpoint")) {
            this.f29677h = Double.valueOf(jSONObject.optDouble("ccrLowSetpoint"));
        }
        if (!jSONObject.isNull("ccrLowSetpointDepth")) {
            this.f29678i = Double.valueOf(jSONObject.optDouble("ccrLowSetpointDepth"));
        }
        this.f29679j = s1.u(jSONObject, "ccrHighSetpointSwitchMode");
        if (!jSONObject.isNull("ccrHighSetpoint")) {
            this.f29680k = Double.valueOf(jSONObject.optDouble("ccrHighSetpoint"));
        }
        if (jSONObject.isNull("ccrHighSetpointDepth")) {
            return;
        }
        this.f29681l = Double.valueOf(jSONObject.optDouble("ccrHighSetpointDepth"));
    }

    public final String toString() {
        return "DiveSettings{name='" + this.f29670a + "', model=" + this.f29671b + ", gfLow=" + this.f29672c + ", gfHigh=" + this.f29673d + ", waterType='" + this.f29674e + "', ccrLowSetpointSwitchMode='" + this.f29676g + "', ccrLowSetpoint=" + this.f29677h + ", ccrLowSetpointDepth=" + this.f29678i + ", ccrHighSetpointSwitchMode='" + this.f29679j + "', ccrHighSetpoint=" + this.f29680k + ", ccrHighSetpointDepth=" + this.f29681l + CoreConstants.CURLY_RIGHT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f29670a);
        parcel.writeInt(this.f29671b);
        parcel.writeInt(this.f29672c);
        parcel.writeInt(this.f29673d);
        parcel.writeByte((byte) (this.f29674e != null ? 1 : 0));
        Integer num = this.f29674e;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
        parcel.writeByte((byte) (this.f29675f != null ? 1 : 0));
        Double d14 = this.f29675f;
        if (d14 != null) {
            parcel.writeDouble(d14.doubleValue());
        }
        parcel.writeString(this.f29676g);
        parcel.writeByte((byte) (this.f29677h != null ? 1 : 0));
        Double d15 = this.f29677h;
        if (d15 != null) {
            parcel.writeDouble(d15.doubleValue());
        }
        parcel.writeByte((byte) (this.f29678i != null ? 1 : 0));
        Double d16 = this.f29678i;
        if (d16 != null) {
            parcel.writeDouble(d16.doubleValue());
        }
        parcel.writeString(this.f29679j);
        parcel.writeByte((byte) (this.f29680k != null ? 1 : 0));
        Double d17 = this.f29680k;
        if (d17 != null) {
            parcel.writeDouble(d17.doubleValue());
        }
        parcel.writeByte((byte) (this.f29681l != null ? 1 : 0));
        Double d18 = this.f29681l;
        if (d18 != null) {
            parcel.writeDouble(d18.doubleValue());
        }
    }

    public t() {
    }
}
