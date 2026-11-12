package jy2;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import d53.u;
import i3.e5;
import java.net.URI;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Ljy2/a;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "json", "Ljy2/b;", "defn", "<init>", "(Lorg/json/JSONObject;Ljy2/b;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "b", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URI f101855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f101856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f101857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f101858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f101859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f101860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final UUID f101861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f101862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f101863k;

    /* JADX INFO: renamed from: jy2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"jy2/a$a", "Landroid/os/Parcelable$Creator;", "Ljy2/a;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1955a implements Parcelable.Creator<a> {
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

    static {
        new b(null);
        CREATOR = new C1955a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public a(JSONObject jSONObject, jy2.b bVar) {
        Object arrayList;
        String str;
        jSONObject.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("deliverable");
        if (jSONObjectOptJSONObject == null) {
            vb.h.s("deliverable not found");
            throw null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("installation");
        if (jSONObjectOptJSONObject2 == null) {
            vb.h.s("installation not found");
            throw null;
        }
        URI uriCreate = URI.create(jSONObjectOptJSONObject.getString("downloadUrl"));
        uriCreate.getClass();
        this.f101855c = uriCreate;
        String strOptString = jSONObject.optString("version", "");
        strOptString.getClass();
        this.f101856d = strOptString;
        String strOptString2 = jSONObject.optString("dataType", "");
        strOptString2.getClass();
        this.f101857e = strOptString2;
        String strOptString3 = jSONObjectOptJSONObject2.optString("fileName");
        this.f101853a = (bVar == null || (str = bVar.f101865b) == null) ? jSONObjectOptJSONObject2.has("path") ? jSONObjectOptJSONObject2.optString("path") : null : str;
        strOptString3.getClass();
        if (strOptString3.length() <= 0) {
            strOptString3 = bVar != null ? bVar.f101866c : null;
            if (strOptString3 == null || strOptString3.length() == 0) {
                strOptString3 = null;
            }
        }
        this.f101854b = strOptString3;
        this.f101858f = jSONObjectOptJSONObject.optLong("sizeInBytes", 0L);
        String strOptString4 = jSONObject.optString("partNumber", "");
        strOptString4.getClass();
        this.f101859g = strOptString4;
        this.f101862j = jSONObjectOptJSONObject2.optInt("order");
        String string = jSONObjectOptJSONObject.has("md5") ? jSONObjectOptJSONObject.getString("md5") : e5.g(strOptString4, strOptString2, strOptString);
        string.getClass();
        byte[] bytes = string.getBytes(d53.c.f57666b);
        bytes.getClass();
        UUID uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
        uuidNameUUIDFromBytes.getClass();
        this.f101861i = uuidNameUUIDFromBytes;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("deliveryRestrictions");
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i14));
            }
        } else {
            arrayList = j0.f134944a;
        }
        this.f101863k = arrayList;
        String string2 = jSONObject.toString();
        string2.getClass();
        this.f101860h = string2;
    }

    public final String b() {
        String str;
        String str2 = this.f101853a;
        if (str2 == null || (str = this.f101854b) == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder(str2);
        if (!u.p(str2, "/", false) && !u.y(str, "/", false)) {
            sb3.append("/");
        }
        sb3.append(str);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        a aVar = (a) obj;
        return s.g(this.f101853a, aVar.f101853a) && s.g(this.f101854b, aVar.f101854b) && s.g(this.f101855c, aVar.f101855c) && s.g(this.f101856d, aVar.f101856d) && s.g(this.f101857e, aVar.f101857e) && this.f101858f == aVar.f101858f && s.g(this.f101859g, aVar.f101859g) && s.g(this.f101861i, aVar.f101861i) && this.f101862j == aVar.f101862j && s.g(this.f101863k, aVar.f101863k);
    }

    public final int hashCode() {
        String str = this.f101853a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101854b;
        return this.f101863k.hashCode() + ((((this.f101861i.hashCode() + wr.g.j(q6.f.e(wr.g.j(wr.g.j((this.f101855c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f101856d), 31, this.f101857e), 31, this.f101858f), 31, this.f101859g)) * 31) + this.f101862j) * 31);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("class FirmwareUpdate {\n    id: ");
        sb3.append(this.f101861i);
        sb3.append("\n    partNumber: ");
        sb3.append(this.f101859g);
        sb3.append("\n    version: ");
        sb3.append(this.f101856d);
        sb3.append("\n    dataType: ");
        sb3.append(this.f101857e);
        sb3.append("\n    devicePath: ");
        sb3.append(b());
        sb3.append("\n    remoteUrl: ");
        sb3.append(this.f101855c);
        sb3.append("\n    fileSize: ");
        sb3.append(this.f101858f);
        sb3.append("\n    order: ");
        sb3.append(this.f101862j);
        sb3.append("\n    restrictions: [");
        return j.o(h0.k0(this.f101863k, null, null, null, null, 63), "]\n}", sb3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f101861i.toString());
        parcel.writeString(this.f101855c.toString());
        parcel.writeString(this.f101856d);
        parcel.writeString(this.f101853a);
        parcel.writeString(this.f101854b);
        parcel.writeString(this.f101857e);
        parcel.writeLong(this.f101858f);
        parcel.writeString(this.f101859g);
        parcel.writeInt(this.f101862j);
        parcel.writeString(this.f101860h);
        parcel.writeStringList(this.f101863k);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Ljy2/a$b;", "", "<init>", "()V", "", "DATA_TYPE_KEY", "Ljava/lang/String;", "DELIVERABLE_DOWNLOAD_URL_KEY", "DELIVERABLE_KEY", "DELIVERABLE_MD5_KEY", "DELIVERABLE_SIZE_KEY", "INSTALLATION_KEY", "INSTALLATION_NAME_KEY", "INSTALLATION_ORDER_KEY", "INSTALLATION_PATH_KEY", "PART_NUMBER_KEY", "RESTRICTIONS_KEY", "VERSION_KEY", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public a(Parcel parcel) {
        parcel.getClass();
        UUID uuidFromString = UUID.fromString(parcel.readString());
        uuidFromString.getClass();
        this.f101861i = uuidFromString;
        String string = parcel.readString();
        string.getClass();
        URI uriCreate = URI.create(string);
        uriCreate.getClass();
        this.f101855c = uriCreate;
        String string2 = parcel.readString();
        string2.getClass();
        this.f101856d = string2;
        this.f101853a = parcel.readString();
        this.f101854b = parcel.readString();
        String string3 = parcel.readString();
        string3.getClass();
        this.f101857e = string3;
        this.f101858f = parcel.readLong();
        String string4 = parcel.readString();
        string4.getClass();
        this.f101859g = string4;
        this.f101862j = parcel.readInt();
        String string5 = parcel.readString();
        string5.getClass();
        this.f101860h = string5;
        Object objCreateStringArrayList = parcel.createStringArrayList();
        this.f101863k = objCreateStringArrayList == null ? j0.f134944a : objCreateStringArrayList;
    }
}
