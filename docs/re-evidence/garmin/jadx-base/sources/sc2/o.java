package sc2;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lsc2/o;", "Landroid/os/Parcelable;", "", "accessToken", "", "accessTokenExpireDateUTC", "refreshToken", "customerGUID", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "b", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class o implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f158543e = new b(null);
    public static final Parcelable.Creator<o> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"sc2/o$a", "Landroid/os/Parcelable$Creator;", "Lsc2/o;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        string.getClass();
        long j8 = parcel.readLong();
        String string2 = parcel.readString();
        string2.getClass();
        this(string, j8, string2, parcel.readInt() == 1 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.g(this.f158544a, oVar.f158544a) && this.f158545b == oVar.f158545b && s.g(this.f158546c, oVar.f158546c) && s.g(this.f158547d, oVar.f158547d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(this.f158544a.hashCode() * 31, 31, this.f158545b), 31, this.f158546c);
        String str = this.f158547d;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = b.a.ACCESS_TOKEN.f158553a;
        String str2 = b.a.ACCESS_TOKEN_EXPIRE_DATE_UTC.f158553a;
        String str3 = b.a.REFRESH_TOKEN.f158553a;
        StringBuilder sbI = p6.b.i("OAuth2ITData(", str, "='", this.f158544a, "', ");
        e5.s(this.f158545b, str2, "=", sbI);
        sn.a.t(sbI, ", ", str3, "='", this.f158546c);
        return e0.h(sbI, "', customerGUID='", this.f158547d, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f158544a);
        parcel.writeLong(this.f158545b);
        parcel.writeString(this.f158546c);
        String str = this.f158547d;
        if (str == null || str.length() == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lsc2/o$b;", "", "<init>", "()V", "", "JSON_KEY_ACCESS_TOKEN", "Ljava/lang/String;", "JSON_KEY_REFRESH_TOKEN", "JSON_KEY_TOKEN_TYPE", "JSON_KEY_ACCESS_EXPIRES_IN", "JSON_KEY_REFRESH_EXPIRES_IN", "Landroid/os/Parcelable$Creator;", "Lsc2/o;", "CREATOR", "Landroid/os/Parcelable$Creator;", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsc2/o$b$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum a {
            ROOT("oAuth2ITData"),
            ACCESS_TOKEN("accessToken"),
            ACCESS_TOKEN_EXPIRE_DATE_UTC("accessTokenExpireDateUTC"),
            REFRESH_TOKEN("refreshToken");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f158553a;

            a(String str) {
                this.f158553a = str;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ o(String str, long j8, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, str2, (i14 & 8) != 0 ? null : str3);
    }

    public o(String str, long j8, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f158544a = str;
        this.f158545b = j8;
        this.f158546c = str2;
        this.f158547d = str3;
    }
}
