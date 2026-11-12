package hk1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lhk1/w;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Lhk1/w$a;", "Lhk1/w$b;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class w implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhk1/w$b;", "Lhk1/w;", "", "clientId", RemoteConfigConstants.ResponseFieldKey.STATE, "codeChallenge", "codeChallengeMethod", "redirectUri", "responseType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends w {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f84212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f84213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f84214f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            this.f84209a = str;
            this.f84210b = str2;
            this.f84211c = str3;
            this.f84212d = str4;
            this.f84213e = str5;
            this.f84214f = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f84209a, bVar.f84209a) && p005kotlin.jvm.internal.s.g(this.f84210b, bVar.f84210b) && p005kotlin.jvm.internal.s.g(this.f84211c, bVar.f84211c) && p005kotlin.jvm.internal.s.g(this.f84212d, bVar.f84212d) && p005kotlin.jvm.internal.s.g(this.f84213e, bVar.f84213e) && p005kotlin.jvm.internal.s.g(this.f84214f, bVar.f84214f);
        }

        public final int hashCode() {
            String str = this.f84209a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f84210b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f84211c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f84212d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f84213e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f84214f;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("Oauth2Data(clientId=", this.f84209a, ", state=", this.f84210b, ", codeChallenge=");
            sn.a.t(sbI, this.f84211c, ", codeChallengeMethod=", this.f84212d, ", redirectUri=");
            return e5.h(sbI, this.f84213e, ", responseType=", this.f84214f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f84209a);
            parcel.writeString(this.f84210b);
            parcel.writeString(this.f84211c);
            parcel.writeString(this.f84212d);
            parcel.writeString(this.f84213e);
            parcel.writeString(this.f84214f);
        }
    }

    public /* synthetic */ w(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private w() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhk1/w$a;", "Lhk1/w;", "", "token", "oauthCallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends w {
        public static final Parcelable.Creator<a> CREATOR = new C1668a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84208b;

        /* JADX INFO: renamed from: hk1.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1668a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public /* synthetic */ a(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
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
            return p005kotlin.jvm.internal.s.g(this.f84207a, aVar.f84207a) && p005kotlin.jvm.internal.s.g(this.f84208b, aVar.f84208b);
        }

        public final int hashCode() {
            String str = this.f84207a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f84208b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return e0.g("Oauth1Data(token=", this.f84207a, ", oauthCallback=", this.f84208b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f84207a);
            parcel.writeString(this.f84208b);
        }

        public a(String str, String str2) {
            super(null);
            this.f84207a = str;
            this.f84208b = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
