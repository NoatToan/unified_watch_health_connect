package f20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf20/c0;", "Landroid/os/Parcelable;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "countryName", "phonePrefix", "", "regionalCodes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f68363d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public c0(String str, String str2, String str3, List<String> list) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f68360a = str;
        this.f68361b = str2;
        this.f68362c = str3;
        this.f68363d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null && p005kotlin.jvm.internal.s.g(this.f68360a, c0Var.f68360a) && p005kotlin.jvm.internal.s.g(this.f68361b, c0Var.f68361b)) {
            String str = c0Var.f68362c;
            if (p005kotlin.jvm.internal.s.g(str, str)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68360a.hashCode();
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CountryInfo(countryCode=", this.f68360a, ", countryName=", this.f68361b, ", phonePrefix=");
        sbI.append(this.f68362c);
        sbI.append(", regionalCodes=");
        sbI.append(this.f68363d);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f68360a);
        parcel.writeString(this.f68361b);
        parcel.writeString(this.f68362c);
        parcel.writeStringList(this.f68363d);
    }

    public /* synthetic */ c0(String str, String str2, String str3, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, (i14 & 8) != 0 ? null : list);
    }
}
