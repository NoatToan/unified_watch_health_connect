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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lwi1/k;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends s1 implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f185575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f185576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f185577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f185578d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"wi1/k$a", "Landroid/os/Parcelable$Creator;", "Lwi1/k;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public k(Parcel parcel) {
        parcel.getClass();
        this.f185575a = -1L;
        this.f185576b = -1L;
        this.f185575a = parcel.readLong();
        this.f185576b = parcel.readLong();
        this.f185577c = parcel.readInt() == 1;
        this.f185578d = parcel.readInt() == 1;
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            long j8 = this.f185575a;
            if (j8 > -1) {
                jSONObject.put("sleepTime", j8);
            }
            long j14 = this.f185576b;
            if (j14 > -1) {
                jSONObject.put("wakeTime", j14);
            }
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.SETTINGS, "UserDataDTO", "Error while converting to JSON object: " + e4);
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
            this.f185575a = jSONObject.optLong("sleepTime");
            this.f185576b = jSONObject.optLong("wakeTime");
            this.f185577c = jSONObject.optBoolean("defaultSleepTime", false);
            this.f185578d = jSONObject.optBoolean("defaultWakeTime", false);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f185575a);
        parcel.writeLong(this.f185576b);
        parcel.writeInt(this.f185577c ? 1 : 0);
        parcel.writeInt(this.f185578d ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lwi1/k$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lwi1/k;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "SLEEP_TIME", "Ljava/lang/String;", "WAKE_TIME", "IS_DEFAULT_SLEEP_TIME", "IS_DEFAULT_WAKE_TIME", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public k() {
        this.f185575a = -1L;
        this.f185576b = -1L;
    }
}
