package mo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0018\fB7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lmo1/a;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "Lmo1/a$c;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "text", "", "userId", "displayName", "<init>", "(Lmo1/a$c;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Lmo1/a$c;", "getType", "()Lmo1/a$c;", "setType", "(Lmo1/a$c;)V", "b", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "c", "Ljava/lang/Long;", "D", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "d", "getDisplayName", "setDisplayName", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private c type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("text")
    private String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private Long userId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private String displayName;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2277a f119873e = new C2277a(null);
    public static final Parcelable.Creator<a> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmo1/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        RAW,
        TAG_USER
    }

    public /* synthetic */ a(c cVar, String str, Long l14, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public final boolean F() {
        return this.type == c.TAG_USER;
    }

    public final JSONObject G() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        c cVar = this.type;
        if (cVar != null) {
            jSONObject.put(NotificationConstants.KEY_DATA_MIME_TYPE, cVar.name());
        }
        String str = this.text;
        if (str != null) {
            jSONObject.put("text", str);
        }
        Long l14 = this.userId;
        if (l14 != null) {
            jSONObject.put("userId", l14.longValue());
        }
        String str2 = this.displayName;
        if (str2 != null) {
            jSONObject.put("displayName", str2);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.type == aVar.type && s.g(this.text, aVar.text) && s.g(this.userId, aVar.userId) && s.g(this.displayName, aVar.displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int hashCode() {
        c cVar = this.type;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.userId;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.displayName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strU = s1.u(jSONObject, NotificationConstants.KEY_DATA_MIME_TYPE);
        for (c cVar : c.values()) {
            if (s.g(cVar.name(), strU)) {
                this.type = cVar;
                this.text = s1.u(jSONObject, "text");
                this.userId = s1.t(jSONObject, "userId");
                this.displayName = s1.u(jSONObject, "displayName");
            }
        }
        cVar = null;
        this.type = cVar;
        this.text = s1.u(jSONObject, "text");
        this.userId = s1.t(jSONObject, "userId");
        this.displayName = s1.u(jSONObject, "displayName");
    }

    public final String toString() {
        return "CommentBlockDTO(type=" + this.type + ", text=" + this.text + ", userId=" + this.userId + ", displayName=" + this.displayName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        c cVar = this.type;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        parcel.writeString(this.text);
        Long l14 = this.userId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.displayName);
    }

    /* JADX INFO: renamed from: mo1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lmo1/a$a;", "", "<init>", "()V", "", "KEY_TYPE", "Ljava/lang/String;", "KEY_TEXT", "KEY_USER_ID", "KEY_DISPLAY_NAME", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2277a {
        public /* synthetic */ C2277a(j jVar) {
            this();
        }

        private C2277a() {
        }
    }

    public a(c cVar, String str, Long l14, String str2) {
        this.type = cVar;
        this.text = str;
        this.userId = l14;
        this.displayName = str2;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
