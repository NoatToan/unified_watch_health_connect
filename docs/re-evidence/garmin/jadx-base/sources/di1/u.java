package di1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B'\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Ldi1/u;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Ldi1/b0;", "deviceConsumerTokenDto", "userTokenDto", "", "deviceConsumerType", "(Ldi1/b0;Ldi1/b0;Ljava/lang/String;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends s1 implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f59785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f59786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f59787c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"di1/u$a", "Landroid/os/Parcelable$Creator;", "Ldi1/u;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public u(Parcel parcel) {
        parcel.getClass();
        this.f59785a = (b0) parcel.readParcelable(b0.class.getClassLoader());
        this.f59786b = (b0) parcel.readParcelable(b0.class.getClassLoader());
        this.f59787c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("deviceConsumerTokenDto");
            b0 b0Var = new b0();
            this.f59785a = b0Var;
            if (jSONObjectOptJSONObject != null) {
                b0Var.k(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("userTokenDto");
            b0 b0Var2 = new b0();
            this.f59786b = b0Var2;
            if (jSONObjectOptJSONObject2 != null) {
                b0Var2.k(jSONObjectOptJSONObject2);
            }
            this.f59787c = jSONObject.optString("deviceConsumerType");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f59785a, i14);
        parcel.writeParcelable(this.f59786b, i14);
        parcel.writeString(this.f59787c);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldi1/u$b;", "", "<init>", "()V", "", "DEVICE_CONSUMER_TOKEN_DTO", "Ljava/lang/String;", "USER_TOKEN_DTO", "DEVICE_CONSUMER_TYPE", "DEVICE_KEY", "Landroid/os/Parcelable$Creator;", "Ldi1/u;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public u(b0 b0Var, b0 b0Var2, String str) {
        this.f59785a = b0Var;
        this.f59786b = b0Var2;
        this.f59787c = str;
    }

    public u() {
    }
}
