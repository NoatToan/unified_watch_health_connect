package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class i0 extends q implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83384c;

    public class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            return new i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i14) {
            return new i0[i14];
        }
    }

    public i0(Parcel parcel) {
        this.f83383b = parcel.readInt();
        this.f83384c = parcel.readInt();
        this.f83396a = parcel.readLong();
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f83383b = jSONObject.optInt("stepsCount", -1);
            this.f83384c = jSONObject.optInt("stepsGoal", -1);
            this.f83396a = jSONObject.optLong("lastUpdated", -1L);
            return true;
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeStepsDTO");
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
            jSONObject.put("stepsCount", this.f83383b);
            jSONObject.put("stepsGoal", this.f83384c);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeStepsDTO");
        }
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RealTimeStepsDTO{lastUpdated=");
        sb3.append(this.f83396a);
        sb3.append(", stepsCount=");
        sb3.append(this.f83383b);
        sb3.append(", stepsGoal=");
        return ds.e0.j(sb3, this.f83384c, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f83383b);
        parcel.writeInt(this.f83384c);
        parcel.writeLong(this.f83396a);
    }

    public i0() {
        this.f83383b = -1;
        this.f83384c = -1;
        this.f83396a = -1L;
    }

    public i0(int i14, int i15, long j8) {
        this.f83383b = i14;
        this.f83384c = i15;
        this.f83396a = j8;
    }
}
