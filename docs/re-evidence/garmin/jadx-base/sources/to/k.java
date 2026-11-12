package to;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lto/k;", "Landroid/os/Parcelable;", "", "name", "displayName", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "thirdPartyName", "json", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f165812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f165813c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(String str, String str2) {
        this(null, null, null, 7, null);
        str.getClass();
        str2.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str2).getJSONObject(str);
            this.f165811a = str;
            String string = jSONObject.getString("displayName");
            string.getClass();
            this.f165812b = string;
            String string2 = jSONObject.getString("imageUrl");
            string2.getClass();
            this.f165813c = string2;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "ThirdPartyUploaderDTO", e4);
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f165811a, kVar.f165811a) && s.g(this.f165812b, kVar.f165812b) && s.g(this.f165813c, kVar.f165813c);
    }

    public final int hashCode() {
        return this.f165813c.hashCode() + wr.g.j(this.f165811a.hashCode() * 31, 31, this.f165812b);
    }

    public final String toString() {
        return am.j.o(this.f165813c, ")", p6.b.i("ThirdPartyUploaderDTO(name=", this.f165811a, ", displayName=", this.f165812b, ", imageUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f165811a);
        parcel.writeString(this.f165812b);
        parcel.writeString(this.f165813c);
    }

    public k(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f165811a = str;
        this.f165812b = str2;
        this.f165813c = str3;
    }

    public /* synthetic */ k(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3);
    }

    public k() {
        this(null, null, null, 7, null);
    }
}
