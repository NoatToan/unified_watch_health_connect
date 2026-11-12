package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhd1/g0;", "Lhd1/q;", "Landroid/os/Parcelable;", "", "respiration", "<init>", "(I)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 extends q implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83381b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g0> {
        @Override // android.os.Parcelable.Creator
        public final g0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final g0[] newArray(int i14) {
            return new g0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ g0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? -1 : i14);
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f83381b = jSONObject.optInt("respiration", -1);
            this.f83396a = jSONObject.optLong("lastUpdated", -1L);
            return true;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "RealTimeRespirationDTO", e4);
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.f83381b == ((g0) obj).f83381b;
    }

    @Override // pd2.b
    public final String h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("respiration", this.f83381b);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "RealTimeRespirationDTO", e4);
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83381b);
    }

    public final String toString() {
        return v.e0.f(this.f83381b, "RealTimeRespirationDTO(respiration=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f83381b);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lhd1/g0$a;", "", "<init>", "()V", "", "WBL_RESPIRATION_RATE_INVALID", "I", "WBL_RESPIRATION_RATE_LARGE_MOTION", "WBL_RESPIRATION_RATE_OFF_WRIST", "WBL_RESPIRATION_RATE_NOT_AVAILABLE", "", "TAG", "Ljava/lang/String;", "KEY_RESPIRATION", "KEY_LAST_UPDATED", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public g0(int i14) {
        this.f83381b = i14;
    }

    public g0() {
        this(0, 1, null);
    }
}
