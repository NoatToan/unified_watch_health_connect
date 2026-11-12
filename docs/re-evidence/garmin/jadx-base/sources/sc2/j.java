package sc2;

import android.os.Parcel;
import android.os.Parcelable;
import d53.w;
import org.json.JSONObject;
import p005kotlin.Metadata;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lsc2/j;", "Landroid/os/Parcelable;", "", "userToken", "userSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class j implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f158513c = new a(null);
    public static final Parcelable.Creator<j> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f158514a = str;
        this.f158515b = str2;
    }

    public static boolean b(j jVar) {
        return !w.J(jVar.f158514a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f158514a.equals(jVar.f158514a) && this.f158515b.equals(jVar.f158515b);
    }

    public final int hashCode() {
        return this.f158515b.hashCode() + (this.f158514a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("OAuth1GCData(userToken='", this.f158514a, "', userSecret='", this.f158515b, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f158514a);
        parcel.writeString(this.f158515b);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsc2/j$a;", "", "<init>", "()V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: sc2.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsc2/j$a$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC2993a {
            ROOT("oAuth1ConnectData"),
            USER_TOKEN("userToken"),
            USER_SECRET("userSecret");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f158520a;

            EnumC2993a(String str) {
                this.f158520a = str;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(String str) throws Exception {
            str.getClass();
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("token")) {
                q2.u("JSON response does not contain 'token' key");
                return null;
            }
            String string = jSONObject.getString("token");
            string.getClass();
            if (string.length() == 0) {
                q2.u("JSON response for key 'token' is empty");
                return null;
            }
            if (!jSONObject.has("secret")) {
                q2.u("JSON response does not contain 'secret' key");
                return null;
            }
            String string2 = jSONObject.getString("secret");
            string2.getClass();
            if (string2.length() != 0) {
                return new j(string, string2);
            }
            q2.u("JSON response for key 'secret' is empty");
            return null;
        }

        private a() {
        }
    }
}
