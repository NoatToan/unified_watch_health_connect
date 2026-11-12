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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lwi1/b;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends s1 implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f185486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f185487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f185488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f185489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f185490f;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"wi1/b$a", "Landroid/os/Parcelable$Creator;", "Lwi1/b;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new C3441b(null);
        CREATOR = new a();
    }

    public b(Parcel parcel) {
        parcel.getClass();
        this.f185485a = parcel.readInt();
        this.f185486b = parcel.readString();
        this.f185487c = parcel.readInt();
        this.f185488d = parcel.readInt();
        this.f185489e = parcel.readByte() != 0;
        this.f185490f = parcel.readString();
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i14 = this.f185485a;
            if (i14 != -1) {
                jSONObject.put("formatId", i14);
            }
            String str = this.f185486b;
            if (str != null) {
                jSONObject.put("formatKey", str);
            }
            int i15 = this.f185487c;
            if (i15 != -1) {
                jSONObject.put("minFraction", i15);
            }
            int i16 = this.f185488d;
            if (i16 != -1) {
                jSONObject.put("maxFraction", i16);
            }
            String str2 = this.f185490f;
            if (str2 != null) {
                jSONObject.put("displayFormat", str2);
            }
            return jSONObject;
        } catch (JSONException e4) {
            sn.a.s("Error when converting to JSON object: ", e4.getMessage(), i2.f36769a, a2.SETTINGS, "DisplayFormatDTO");
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
            this.f185485a = jSONObject.optInt("formatId", -1);
            this.f185486b = s1.u(jSONObject, "formatKey");
            this.f185487c = jSONObject.optInt("minFraction", -1);
            this.f185488d = jSONObject.optInt("maxFraction", -1);
            this.f185489e = jSONObject.optBoolean("groupingUsed", false);
            this.f185490f = s1.u(jSONObject, "displayFormat");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f185485a);
        parcel.writeString(this.f185486b);
        parcel.writeInt(this.f185487c);
        parcel.writeInt(this.f185488d);
        parcel.writeByte(this.f185489e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f185490f);
    }

    /* JADX INFO: renamed from: wi1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lwi1/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lwi1/b;", "CREATOR", "Landroid/os/Parcelable$Creator;", "FORMAT_ID", "FORMAT_KEY", "MIN_FRACTION", "MAX_FRACTION", "GROUPING_USED", "DISPLAY_FORMAT", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3441b {
        public /* synthetic */ C3441b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3441b() {
        }
    }

    public b() {
    }
}
