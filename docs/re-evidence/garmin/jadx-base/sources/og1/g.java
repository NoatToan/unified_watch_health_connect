package og1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Log1/g;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "enabled", "", "sport", "subSport", "displayName", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "c", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g extends s1 implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enabled")
    private Boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sport")
    private String sport;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subSport")
    private String subSport;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient String f132003d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new g(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ g(Boolean bool, String str, String str2, String str3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getSport() {
        return this.sport;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getSubSport() {
        return this.subSport;
    }

    public final void G(boolean z14) {
        this.enabled = Boolean.valueOf(z14);
    }

    public final JSONObject H() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.enabled);
            jSONObject.put("sport", this.sport);
            jSONObject.put("subSport", this.subSport);
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "DisplayedActivitiesEachItemDTO", e4);
            return jSONObject;
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.enabled, gVar.enabled) && s.g(this.sport, gVar.sport) && s.g(this.subSport, gVar.subSport) && s.g(this.f132003d, gVar.f132003d);
    }

    public final int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.sport;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subSport;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132003d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.enabled = Boolean.valueOf(jSONObject.optBoolean("enabled", false));
            this.sport = jSONObject.optString("sport", "");
            this.subSport = jSONObject.optString("subSport", "");
            this.f132003d = null;
        }
    }

    public final String toString() {
        Boolean bool = this.enabled;
        String str = this.sport;
        String str2 = this.subSport;
        String str3 = this.f132003d;
        StringBuilder sb3 = new StringBuilder("DisplayedActivitiesEachItemDTO(enabled=");
        sb3.append(bool);
        sb3.append(", sport=");
        sb3.append(str);
        sb3.append(", subSport=");
        return e5.h(sb3, str2, ", displayName=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeString(this.sport);
        parcel.writeString(this.subSport);
        parcel.writeString(this.f132003d);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Log1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ENABLED", "SPORT", "SUBSPORT", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public g(Boolean bool, String str, String str2, String str3) {
        this.enabled = bool;
        this.sport = str;
        this.subSport = str2;
        this.f132003d = str3;
    }

    public g() {
        this(null, null, null, null, 15, null);
    }
}
