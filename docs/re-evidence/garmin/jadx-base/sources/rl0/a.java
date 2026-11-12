package rl0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\bB\u0011\b\u0014\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000bR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lrl0/a;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "a", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "b", "D", "setValue", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f153399c = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C2903a();

    /* JADX INFO: renamed from: rl0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"rl0/a$a", "Landroid/os/Parcelable$Creator;", "Lrl0/a;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2903a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        parcel.getClass();
        this.key = parcel.readString();
        this.value = parcel.readString();
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final String F() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Action.KEY_ATTRIBUTE, this.key);
        jSONObject.put("value", this.value);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class.equals(obj.getClass())) {
            a aVar = (a) obj;
            if (s.g(this.key, aVar.key) && s.g(this.value, aVar.value)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.key = s1.u(jSONObject, Action.KEY_ATTRIBUTE);
            this.value = s1.u(jSONObject, "value");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lrl0/a$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lrl0/a;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "SWING_SPEED_MEASUREMENT_SYSTEM", "Ljava/lang/String;", "KEY", "VALUE", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }

    private a(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public /* synthetic */ a(String str, String str2, j jVar) {
        this(str, str2);
    }
}
