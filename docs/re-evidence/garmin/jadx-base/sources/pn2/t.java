package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lpn2/t;", "Lpn2/d;", "", "lastNameKana", "firstNameKana", "birthday", "gender", "mobilePhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "d", "c", "f", JWKParameterNames.RSA_EXPONENT, "h", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements d {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastNameKana")
    private final String lastNameKana;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstNameKana")
    private final String firstNameKana;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("birthday")
    private final String birthday;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gender")
    private final String gender;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mobilePhoneNumber")
    private final String mobilePhoneNumber;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public t(String str, String str2, String str3, String str4, String str5) {
        hb.a.p(str, str2, str3, str4, str5);
        this.lastNameKana = str;
        this.firstNameKana = str2;
        this.birthday = str3;
        this.gender = str4;
        this.mobilePhoneNumber = str5;
        int length = str.length();
        if (1 > length || length >= 11) {
            vb.h.x(am.j.h(str.length(), "lastNameKana length(1-10): "));
            throw null;
        }
        int length2 = str2.length();
        if (1 > length2 || length2 >= 11) {
            vb.h.x(am.j.h(str2.length(), "firstNameKana length(1-10): "));
            throw null;
        }
        if (str3.length() != 8) {
            vb.h.x(am.j.h(str3.length(), "birthday length(8): "));
            throw null;
        }
        if (str4.length() != 1) {
            vb.h.x(am.j.h(str4.length(), "gender length(1): "));
            throw null;
        }
        if (str5.length() == 11) {
            return;
        }
        vb.h.x(am.j.h(str5.length(), "mobilePhoneNumber length(11): "));
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFirstNameKana() {
        return this.firstNameKana;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.lastNameKana, tVar.lastNameKana) && p005kotlin.jvm.internal.s.g(this.firstNameKana, tVar.firstNameKana) && p005kotlin.jvm.internal.s.g(this.birthday, tVar.birthday) && p005kotlin.jvm.internal.s.g(this.gender, tVar.gender) && p005kotlin.jvm.internal.s.g(this.mobilePhoneNumber, tVar.mobilePhoneNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLastNameKana() {
        return this.lastNameKana;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getMobilePhoneNumber() {
        return this.mobilePhoneNumber;
    }

    public final int hashCode() {
        return this.mobilePhoneNumber.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.lastNameKana.hashCode() * 31, 31, this.firstNameKana), 31, this.birthday), 31, this.gender);
    }

    public final String toString() {
        String str = this.lastNameKana;
        String str2 = this.firstNameKana;
        String str3 = this.birthday;
        String str4 = this.gender;
        String str5 = this.mobilePhoneNumber;
        StringBuilder sbI = p6.b.i("FNUserInfoDto(lastNameKana='", str, "', firstNameKana='", str2, "', birthday='");
        sn.a.t(sbI, str3, "', gender='", str4, "', mobilePhoneNumber='");
        return am.j.o(str5, "')", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.lastNameKana);
        parcel.writeString(this.firstNameKana);
        parcel.writeString(this.birthday);
        parcel.writeString(this.gender);
        parcel.writeString(this.mobilePhoneNumber);
    }
}
