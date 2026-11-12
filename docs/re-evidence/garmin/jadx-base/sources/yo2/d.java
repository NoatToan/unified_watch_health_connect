package yo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lyo2/d;", "Landroid/os/Parcelable;", "", "name", "cvv", "pan", "", "expMonth", "expYear", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getCvv", "c", "f", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "getLanguage", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cvv")
    private final String cvv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pan")
    private final String pan;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expMonth")
    private final Integer expMonth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expYear")
    private final Integer expYear;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("language")
    private final String language;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(String str, String str2, String str3, Integer num, Integer num2, String str4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getExpMonth() {
        return this.expMonth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getExpYear() {
        return this.expYear;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.name, dVar.name) && s.g(this.cvv, dVar.cvv) && s.g(this.pan, dVar.pan) && s.g(this.expMonth, dVar.expMonth) && s.g(this.expYear, dVar.expYear) && s.g(this.language, dVar.language);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cvv;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pan;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.expMonth;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expYear;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.language;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.cvv;
        String str3 = this.pan;
        Integer num = this.expMonth;
        Integer num2 = this.expYear;
        String str4 = this.language;
        StringBuilder sbI = p6.b.i("NewCreditCardInfo(name=", str, ", cvv=", str2, ", pan=");
        fb1.c.u(num, str3, ", expMonth=", ", expYear=", sbI);
        sbI.append(num2);
        sbI.append(", language=");
        sbI.append(str4);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.cvv);
        parcel.writeString(this.pan);
        Integer num = this.expMonth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.expYear;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.language);
    }

    public d(String str, String str2, String str3, Integer num, Integer num2, String str4) {
        this.name = str;
        this.cvv = str2;
        this.pan = str3;
        this.expMonth = num;
        this.expYear = num2;
        this.language = str4;
    }

    public d() {
        this(null, null, null, null, null, null, 63, null);
    }
}
