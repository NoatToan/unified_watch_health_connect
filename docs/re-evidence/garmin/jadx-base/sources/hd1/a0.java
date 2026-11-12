package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a0 extends q implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83367f;

    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    public a0(Parcel parcel) {
        this.f83363b = parcel.readInt();
        this.f83364c = parcel.readInt();
        this.f83365d = parcel.readInt();
        this.f83366e = parcel.readInt();
        this.f83367f = parcel.readInt();
        this.f83396a = parcel.readLong();
    }

    public final void b(JSONObject jSONObject) {
        this.f83363b = jSONObject.optInt("heartRateSource", 255);
        this.f83364c = jSONObject.optInt("currentHeartRate", -1);
        this.f83366e = jSONObject.optInt("dailyHighHeartRate", -1);
        this.f83367f = jSONObject.optInt("dailyLowHeartRate", -1);
        this.f83396a = jSONObject.optLong("lastUpdated", -1L);
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            b(new JSONObject(str));
            return true;
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeHeartRateDTO");
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pd2.b
    public final String h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("heartRateSource", this.f83363b);
            jSONObject.put("currentHeartRate", this.f83364c);
            jSONObject.put("dailyHighHeartRate", this.f83366e);
            jSONObject.put("dailyLowHeartRate", this.f83367f);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeHeartRateDTO");
        }
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RealTimeHeartRateDTO{lastUpdated=");
        sb3.append(this.f83396a);
        sb3.append(", heartRateSource=");
        sb3.append(this.f83363b);
        sb3.append(", currentHeartRate=");
        sb3.append(this.f83364c);
        sb3.append(", restingHeartRate=");
        sb3.append(this.f83365d);
        sb3.append(", dailyHighHeartRate=");
        sb3.append(this.f83366e);
        sb3.append(", dailyLowHeartRate=");
        return ds.e0.j(sb3, this.f83367f, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f83363b);
        parcel.writeInt(this.f83364c);
        parcel.writeInt(this.f83365d);
        parcel.writeInt(this.f83366e);
        parcel.writeInt(this.f83367f);
        parcel.writeLong(this.f83396a);
    }

    public a0() {
        this.f83363b = 255;
        this.f83364c = -1;
        this.f83365d = -1;
        this.f83366e = -1;
        this.f83367f = -1;
        this.f83396a = -1L;
    }

    public a0(int i14, int i15, int i16, int i17, int i18, long j8) {
        this.f83363b = i14;
        this.f83364c = i15;
        this.f83365d = i16;
        this.f83366e = i17;
        this.f83367f = i18;
        this.f83396a = j8;
    }
}
