package dp2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.k0;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0017\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b.\u0010\u0017R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010/\u001a\u0004\b#\u00100\"\u0004\b1\u00102R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0015\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b5\u0010\u0017R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Ldp2/b;", "Landroid/os/Parcelable;", "", "cardHolderName", "cardNumber", "", "expMonth", "expYear", "securityCode", "Ldp2/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "language", "Lfo2/k0;", "address", "phoneNumber", "deviceId", "Lfq2/a;", "riskData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ldp2/c;Ljava/lang/String;Lfo2/k0;Ljava/lang/String;Ljava/lang/String;Lfq2/a;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "b", "g", "setCardNumber", "c", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "setExpMonth", "(Ljava/lang/Integer;)V", "d", IntegerTokenConverter.CONVERTER_KEY, "setExpYear", JWKParameterNames.RSA_EXPONENT, "j", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Ldp2/c;", "getContext", "()Ldp2/c;", "setContext", "(Ldp2/c;)V", "getLanguage", "Lfo2/k0;", "()Lfo2/k0;", JWKParameterNames.OCT_KEY_VALUE, "(Lfo2/k0;)V", "getPhoneNumber", "o", "getDeviceId", "Lfq2/a;", "getRiskData", "()Lfq2/a;", "setRiskData", "(Lfq2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private String cardHolderName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pan")
    private String cardNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expMonth")
    private Integer expMonth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expYear")
    private Integer expYear;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cvv")
    private String securityCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(CoreConstants.CONTEXT_SCOPE_VALUE)
    private c context;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("language")
    private final String language;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("address")
    private k0 address;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNumber")
    private String phoneNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("riskData")
    private fq2.a riskData;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            k0 k0VarCreateFromParcel = null;
            Integer num = numValueOf2;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                k0VarCreateFromParcel = k0.CREATOR.createFromParcel(parcel);
            }
            return new b(string, string2, numValueOf, num, string3, cVarCreateFromParcel, string4, k0VarCreateFromParcel, parcel.readString(), parcel.readString(), fq2.a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(String str, String str2, Integer num, Integer num2, String str3, c cVar, String str4, k0 k0Var, String str5, String str6, fq2.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : cVar, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : k0Var, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? new fq2.a(null, 1, 0 == true ? 1 : 0) : aVar);
    }

    public final void b() {
        this.cardHolderName = null;
        this.cardNumber = null;
        this.expYear = null;
        this.expMonth = null;
        this.securityCode = null;
        this.address = null;
        this.phoneNumber = null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k0 getAddress() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getExpMonth() {
        return this.expMonth;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getExpYear() {
        return this.expYear;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSecurityCode() {
        return this.securityCode;
    }

    public final void k(k0 k0Var) {
        this.address = k0Var;
    }

    public final void m(String str) {
        this.cardHolderName = str;
    }

    public final void o(String str) {
        this.phoneNumber = str;
    }

    public final void q(String str) {
        this.securityCode = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.cardHolderName);
        parcel.writeString(this.cardNumber);
        Integer num = this.expMonth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Integer num2 = this.expYear;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
        parcel.writeString(this.securityCode);
        c cVar = this.context;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.language);
        k0 k0Var = this.address;
        if (k0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            k0Var.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.deviceId);
        this.riskData.writeToParcel(parcel, i14);
    }

    public b(String str, String str2, Integer num, Integer num2, String str3, c cVar, String str4, k0 k0Var, String str5, String str6, fq2.a aVar) {
        aVar.getClass();
        this.cardHolderName = str;
        this.cardNumber = str2;
        this.expMonth = num;
        this.expYear = num2;
        this.securityCode = str3;
        this.context = cVar;
        this.language = str4;
        this.address = k0Var;
        this.phoneNumber = str5;
        this.deviceId = str6;
        this.riskData = aVar;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
