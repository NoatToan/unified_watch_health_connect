package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class e0 extends q implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83379c;

    public class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        public final e0 createFromParcel(Parcel parcel) {
            return new e0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e0[] newArray(int i14) {
            return new e0[i14];
        }
    }

    public e0(Parcel parcel) {
        this.f83378b = parcel.readInt();
        this.f83379c = parcel.readInt();
        this.f83396a = parcel.readLong();
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f83378b = jSONObject.optInt("pushesCount", -1);
            this.f83379c = jSONObject.optInt("pushesGoal", -1);
            this.f83396a = jSONObject.optLong("lastUpdated", -1L);
            return true;
        } catch (JSONException e4) {
            i2.g(e4, "RealTimePushesDTO");
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
            jSONObject.put("pushesCount", this.f83378b);
            jSONObject.put("pushesGoal", this.f83379c);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.g(e4, "RealTimePushesDTO");
        }
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RealTimeStepsDTO{lastUpdated=");
        sb3.append(this.f83396a);
        sb3.append(", pushesCount=");
        sb3.append(this.f83378b);
        sb3.append(", pushesGoal=");
        return ds.e0.j(sb3, this.f83379c, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f83378b);
        parcel.writeInt(this.f83379c);
        parcel.writeLong(this.f83396a);
    }

    public e0() {
        this.f83378b = -1;
        this.f83379c = -1;
        this.f83396a = -1L;
    }

    public e0(int i14, int i15, long j8) {
        this.f83378b = i14;
        this.f83379c = i15;
        this.f83396a = j8;
    }
}
