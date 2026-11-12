package wi1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lwi1/d;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends s1 implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f185494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f185495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f185496d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"wi1/d$a", "Landroid/os/Parcelable$Creator;", "Lwi1/d;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public d(Parcel parcel) {
        parcel.getClass();
        this.f185493a = parcel.readInt();
        this.f185494b = parcel.readString();
        this.f185495c = parcel.readInt();
        this.f185496d = parcel.readByte() != 0;
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i14 = this.f185493a;
            if (i14 != -1) {
                jSONObject.put("dayId", i14);
            }
            String str = this.f185494b;
            if (str != null) {
                jSONObject.put("dayName", str);
            }
            int i15 = this.f185495c;
            if (i15 != -1) {
                jSONObject.put("sortOrder", i15);
            }
            jSONObject.put("isPossibleFirstDay", this.f185496d);
            return jSONObject;
        } catch (JSONException e4) {
            sn.a.s("Error when converting to JSON object: ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "FirstDayOfWeekDTO");
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f185493a = jSONObject.optInt("dayId", -1);
            this.f185494b = s1.u(jSONObject, "dayName");
            this.f185495c = jSONObject.optInt("sortOrder", -1);
            this.f185496d = jSONObject.optBoolean("isPossibleFirstDay", false);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f185493a);
        parcel.writeString(this.f185494b);
        parcel.writeInt(this.f185495c);
        parcel.writeByte(this.f185496d ? (byte) 1 : (byte) 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lwi1/d$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lwi1/d;", "CREATOR", "Landroid/os/Parcelable$Creator;", "DAY_ID", "DAY_NAME", "SORT_ORDER", "IS_POSSIBLE_FIRST_DAY", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public d() {
    }
}
