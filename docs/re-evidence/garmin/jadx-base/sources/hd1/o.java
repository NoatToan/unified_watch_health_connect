package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class o extends q implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83394c;

    public class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(Parcel parcel) {
        this.f83393b = parcel.readInt();
        this.f83394c = parcel.readInt();
        this.f83396a = parcel.readLong();
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f83393b = jSONObject.optInt("totalCalories", -1);
            this.f83394c = jSONObject.optInt("activeCalories", -1);
            this.f83396a = jSONObject.optLong("lastUpdated", -1L);
            return true;
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeCaloriesDTO");
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
            jSONObject.put("totalCalories", this.f83393b);
            jSONObject.put("activeCalories", this.f83394c);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.g(e4, "RealTimeCaloriesDTO");
        }
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RealTimeCaloriesDTO{totalCalories=");
        sb3.append(this.f83393b);
        sb3.append(", activeCalories=");
        sb3.append(this.f83394c);
        sb3.append(", lastUpdated=");
        return androidx.room.a0.l(sb3, this.f83396a, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f83393b);
        parcel.writeInt(this.f83394c);
        parcel.writeLong(this.f83396a);
    }

    public o() {
        this.f83393b = -1;
        this.f83394c = -1;
        this.f83396a = -1L;
    }

    public o(int i14, int i15, long j8) {
        this.f83393b = i14;
        this.f83394c = i15;
        this.f83396a = j8;
    }
}
