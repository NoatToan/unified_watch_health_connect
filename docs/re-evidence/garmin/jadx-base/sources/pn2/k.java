package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0018"}, d2 = {"Lpn2/k;", "Lpn2/d;", "", "date", "type1", "type2", "place1", "place2", "balance", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "h", "c", IntegerTokenConverter.CONVERTER_KEY, "f", JWKParameterNames.RSA_EXPONENT, "g", "getBalance", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements d {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private final String date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("type1")
    private final String type1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("type2")
    private final String type2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("place1")
    private final String place1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("place2")
    private final String place2;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("balance")
    private final String balance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("amount")
    private final String amount;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int length;
        int length2;
        int length3;
        int length4;
        str.getClass();
        str6.getClass();
        this.date = str;
        this.type1 = str2;
        this.type2 = str3;
        this.place1 = str4;
        this.place2 = str5;
        this.balance = str6;
        this.amount = str7;
        if (str.length() != 8) {
            vb.h.x(am.j.h(str.length(), "date length(8): "));
            throw null;
        }
        if (str2 != null && (1 > (length4 = str2.length()) || length4 >= 17)) {
            vb.h.x(am.j.h(str2.length(), "type1 length(1-16): "));
            throw null;
        }
        if (str3 != null && (1 > (length3 = str3.length()) || length3 >= 17)) {
            vb.h.x(am.j.h(str3.length(), "type2 length(1-16): "));
            throw null;
        }
        if (str4 != null && (1 > (length2 = str4.length()) || length2 >= 17)) {
            vb.h.x(am.j.h(str4.length(), "place1 length(1-16): "));
            throw null;
        }
        if (str5 != null && (1 > (length = str5.length()) || length >= 17)) {
            vb.h.x(am.j.h(str5.length(), "place2 length(1-16): "));
            throw null;
        }
        int length5 = str6.length();
        if (1 > length5 || length5 >= 6) {
            vb.h.x(am.j.h(str6.length(), "balance length(1-5): "));
            throw null;
        }
        if (str7 != null) {
            int length6 = str7.length();
            if (1 > length6 || length6 >= 7) {
                vb.h.x(am.j.h(str7.length(), "amount length(1-6): "));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDate() {
        return this.date;
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
        return p005kotlin.jvm.internal.s.g(this.date, kVar.date) && p005kotlin.jvm.internal.s.g(this.type1, kVar.type1) && p005kotlin.jvm.internal.s.g(this.type2, kVar.type2) && p005kotlin.jvm.internal.s.g(this.place1, kVar.place1) && p005kotlin.jvm.internal.s.g(this.place2, kVar.place2) && p005kotlin.jvm.internal.s.g(this.balance, kVar.balance) && p005kotlin.jvm.internal.s.g(this.amount, kVar.amount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlace1() {
        return this.place1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPlace2() {
        return this.place2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType1() {
        return this.type1;
    }

    public final int hashCode() {
        int iHashCode = this.date.hashCode() * 31;
        String str = this.type1;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type2;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.place1;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.place2;
        int iJ = wr.g.j((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.balance);
        String str5 = this.amount;
        return iJ + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType2() {
        return this.type2;
    }

    public final String toString() {
        String str = this.date;
        String str2 = this.type1;
        String str3 = this.type2;
        String str4 = this.place1;
        String str5 = this.place2;
        String str6 = this.balance;
        String str7 = this.amount;
        StringBuilder sbI = p6.b.i("FNRecordDto(date='", str, "', type1='", str2, "', type2='");
        sn.a.t(sbI, str3, "', place1='", str4, "', place2='");
        sn.a.t(sbI, str5, "', balance='", str6, "', amount='");
        return am.j.o(str7, "')", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.date);
        parcel.writeString(this.type1);
        parcel.writeString(this.type2);
        parcel.writeString(this.place1);
        parcel.writeString(this.place2);
        parcel.writeString(this.balance);
        parcel.writeString(this.amount);
    }
}
