package wi1;

import android.os.Parcel;
import android.os.Parcelable;
import bs2.in;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lwi1/c;", "Lwi1/h;", "Landroid/os/Parcel;", "in", "<init>", "(Landroid/os/Parcel;)V", "()V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f185491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f185492j;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"wi1/c$a", "Landroid/os/Parcelable$Creator;", "Lwi1/c;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.f185491i = (o) parcel.readParcelable(o.class.getClassLoader());
        this.f185492j = parcel.readString();
        i0(parcel.readString());
    }

    @Override // wi1.h, com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        super.k(jSONObject);
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("screens");
            if (jSONObjectOptJSONObject != null) {
                o oVar = new o();
                this.f185491i = oVar;
                oVar.k(jSONObjectOptJSONObject);
            }
            this.f185492j = s1.u(jSONObject, "defaultScreen");
            i0(s1.u(jSONObject, "smartNotificationsStatus"));
        }
    }

    public final JSONObject o0() {
        JSONObject jSONObjectN0 = n0();
        try {
            o oVar = this.f185491i;
            if (oVar != null) {
                jSONObjectN0.put("screens", oVar.z0());
            }
            String str = this.f185492j;
            if (str != null) {
                jSONObjectN0.put("defaultScreen", str);
            }
            String str2 = this.f185502a;
            if (str2 != null) {
                jSONObjectN0.put("smartNotificationsStatus", str2);
            }
            in inVarA0 = a0();
            if (inVarA0 != null) {
                jSONObjectN0.put("phoneNotificationPrivacyMode", inVarA0.name());
            }
            return jSONObjectN0;
        } catch (JSONException e4) {
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "DuringActivityDTO", "Error while converting to JSON object: " + e4);
            return jSONObjectN0;
        }
    }

    @Override // wi1.h, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeParcelable(this.f185491i, i14);
        parcel.writeString(this.f185492j);
        parcel.writeString(this.f185502a);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwi1/c$b;", "", "<init>", "()V", "", "SCREENS", "Ljava/lang/String;", "DEFAULT_SCREEN", "NOTIFICATIONS_STATUS_SHOW_NONE", "NOTIFICATIONS_STATUS_SHOW_ALL", "NOTIFICATIONS_STATUS_SHOW_CALLS_ONLY", "NOTIFICATIONS_STATUS_SHOW_CALLS_AND_TEXTS", "NOTIFICATIONS_SOUND_VIBRATION", "NOTIFICATIONS_STATUS_SOUND_TONES", "NOTIFICATIONS_SOUND_TONES_AND_VIBRATION", "Landroid/os/Parcelable$Creator;", "Lwi1/c;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public c() {
    }
}
