package sc2;

import android.os.Parcel;
import android.os.Parcelable;
import d53.w;
import i3.e5;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB9\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lsc2/m;", "Landroid/os/Parcelable;", "", "", "scopes", "accessToken", "refreshToken", "", "accessTokenExpireDateUTC", "refreshTokenExpireDateUTC", "<init>", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;JJ)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "b", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f158527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f158530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f158531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f158526f = new b(null);
    public static final Parcelable.Creator<m> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"sc2/m$a", "Landroid/os/Parcelable$Creator;", "Lsc2/m;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(Parcel parcel) {
        Set setG1;
        parcel.getClass();
        if (parcel.readInt() == 1) {
            String string = parcel.readString();
            string.getClass();
            setG1 = h0.g1(w.X(string, new char[]{'^'}));
        } else {
            setG1 = null;
        }
        Set set = setG1;
        String string2 = parcel.readString();
        string2.getClass();
        String string3 = parcel.readString();
        string3.getClass();
        this(set, string2, string3, parcel.readLong(), parcel.readLong());
    }

    public final String b() {
        Set<String> set = this.f158527a;
        if (set != null) {
            return h0.k0(set, "^", null, null, null, 62);
        }
        return null;
    }

    public final boolean d(Logger logger) {
        String str = this.f158528b;
        if (str == null) {
            if (logger != null) {
                logger.error("accessToken is null from a non-null 'OAuth2DIData' object");
            }
            return false;
        }
        if (w.J(str)) {
            if (logger != null) {
                logger.error("accessToken is blank from a non-null 'OAuth2DIData' object");
            }
            return false;
        }
        String str2 = this.f158529c;
        if (str2 == null) {
            if (logger != null) {
                logger.error("refreshToken is null from a non-null 'OAuth2DIData' object");
            }
            return false;
        }
        if (!w.J(str2)) {
            return true;
        }
        if (logger != null) {
            logger.error("refreshToken is blank from a non-null 'OAuth2DIData' object");
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OAuth2DIData(scopes=");
        sb3.append(this.f158527a);
        sb3.append(", accessToken='");
        sb3.append(this.f158528b);
        sb3.append("', refreshToken='");
        e5.s(this.f158530d, this.f158529c, "', accessTokenExpireDateUTC=", sb3);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f158531e, ", refreshTokenExpireDateUTC=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        if (this.f158527a != null) {
            parcel.writeInt(1);
            parcel.writeString(b());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f158528b);
        parcel.writeString(this.f158529c);
        parcel.writeLong(this.f158530d);
        parcel.writeLong(this.f158531e);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsc2/m$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lsc2/m;", "CREATOR", "Landroid/os/Parcelable$Creator;", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsc2/m$b$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum a {
            ROOT("oAuth2DIData"),
            SCOPES("scopes"),
            ACCESS_TOKEN("accessToken"),
            REFRESH_TOKEN("refreshToken"),
            ACCESS_TOKEN_EXPIRE_DATE_UTC("accessTokenExpireDateUTC"),
            REFRESH_TOKEN_EXPIRE_DATE_UTC("refreshTokenExpireDateUTC");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f158539a;

            a(String str) {
                this.f158539a = str;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ m(Set set, String str, String str2, long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : set, str, str2, j8, j14);
    }

    public m(Set<String> set, String str, String str2, long j8, long j14) {
        str.getClass();
        str2.getClass();
        this.f158527a = set;
        this.f158528b = str;
        this.f158529c = str2;
        this.f158530d = j8;
        this.f158531e = j14;
    }
}
