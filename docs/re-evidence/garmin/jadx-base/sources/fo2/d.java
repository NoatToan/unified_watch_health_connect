package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b \u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001bR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b\u001c\u0010.R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.¨\u00068"}, d2 = {"Lfo2/d;", "Landroid/os/Parcelable;", "", "labelColor", "issuerName", "shortDescription", "longDescription", "contactUrl", "contactPhone", "contactEmail", "termsAndConditionsUrl", "privacyPolicyUrl", "faqUrl", "foregroundColor", "", "Lfo2/m;", "brandLogo", "issuerLogo", "coBrandLogo", "cardBackgroundCombined", "cardBackground", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getLabelColor", "()Ljava/lang/String;", "b", "g", "c", "h", "d", "getLongDescription", JWKParameterNames.RSA_EXPONENT, "getContactUrl", "f", "getContactEmail", IntegerTokenConverter.CONVERTER_KEY, "getPrivacyPolicyUrl", "j", JWKParameterNames.OCT_KEY_VALUE, "getForegroundColor", "l", "Ljava/util/List;", "getBrandLogo", "()Ljava/util/List;", "m", "getIssuerLogo", JWKParameterNames.RSA_MODULUS, "getCoBrandLogo", "o", "p", "getCardBackground", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getIcon", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("labelColor")
    private final String labelColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerName")
    private final String issuerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortDescription")
    private final String shortDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longDescription")
    private final String longDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactUrl")
    private final String contactUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactPhone")
    private final String contactPhone;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactEmail")
    private final String contactEmail;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("termsAndConditionsUrl")
    private final String termsAndConditionsUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("faqUrl")
    private final String faqUrl;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("foregroundColor")
    private final String foregroundColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("brandLogo")
    private final List<m> brandLogo;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuerLogo")
    private final List<m> issuerLogo;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coBrandLogo")
    private final List<m> coBrandLogo;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardBackgroundCombined")
    private final List<m> cardBackgroundCombined;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardBackground")
    private final List<m> cardBackground;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("icon")
    private final List<m> icon;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(m.CREATOR, parcel, arrayList7, iA, 1);
                    string = string;
                }
                arrayList = arrayList7;
            }
            String str = string;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(m.CREATOR, parcel, arrayList2, iA2, 1);
                    i15 = i15;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(m.CREATOR, parcel, arrayList3, iA3, 1);
                    i16 = i16;
                    string2 = string2;
                }
            }
            String str2 = string2;
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList4 = new ArrayList(i17);
                int iA4 = 0;
                while (iA4 != i17) {
                    iA4 = kg.f.a(m.CREATOR, parcel, arrayList4, iA4, 1);
                    i17 = i17;
                    string3 = string3;
                }
            }
            String str3 = string3;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i18 = parcel.readInt();
                arrayList5 = new ArrayList(i18);
                int iA5 = 0;
                while (iA5 != i18) {
                    iA5 = kg.f.a(m.CREATOR, parcel, arrayList5, iA5, 1);
                    i18 = i18;
                    arrayList4 = arrayList4;
                }
            }
            ArrayList arrayList8 = arrayList4;
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i19 = parcel.readInt();
                arrayList6 = new ArrayList(i19);
                int iA6 = 0;
                while (iA6 != i19) {
                    iA6 = kg.f.a(m.CREATOR, parcel, arrayList6, iA6, 1);
                    i19 = i19;
                    arrayList5 = arrayList5;
                }
            }
            return new d(str, str2, str3, string4, string5, string6, string7, string8, string9, string10, string11, arrayList, arrayList2, arrayList3, arrayList8, arrayList5, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<m> list, List<m> list2, List<m> list3, List<m> list4, List<m> list5, List<m> list6) {
        this.labelColor = str;
        this.issuerName = str2;
        this.shortDescription = str3;
        this.longDescription = str4;
        this.contactUrl = str5;
        this.contactPhone = str6;
        this.contactEmail = str7;
        this.termsAndConditionsUrl = str8;
        this.privacyPolicyUrl = str9;
        this.faqUrl = str10;
        this.foregroundColor = str11;
        this.brandLogo = list;
        this.issuerLogo = list2;
        this.coBrandLogo = list3;
        this.cardBackgroundCombined = list4;
        this.cardBackground = list5;
        this.icon = list6;
    }

    public final List<m> b() {
        return this.cardBackgroundCombined;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getContactPhone() {
        return this.contactPhone;
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
        return p005kotlin.jvm.internal.s.g(this.labelColor, dVar.labelColor) && p005kotlin.jvm.internal.s.g(this.issuerName, dVar.issuerName) && p005kotlin.jvm.internal.s.g(this.shortDescription, dVar.shortDescription) && p005kotlin.jvm.internal.s.g(this.longDescription, dVar.longDescription) && p005kotlin.jvm.internal.s.g(this.contactUrl, dVar.contactUrl) && p005kotlin.jvm.internal.s.g(this.contactPhone, dVar.contactPhone) && p005kotlin.jvm.internal.s.g(this.contactEmail, dVar.contactEmail) && p005kotlin.jvm.internal.s.g(this.termsAndConditionsUrl, dVar.termsAndConditionsUrl) && p005kotlin.jvm.internal.s.g(this.privacyPolicyUrl, dVar.privacyPolicyUrl) && p005kotlin.jvm.internal.s.g(this.faqUrl, dVar.faqUrl) && p005kotlin.jvm.internal.s.g(this.foregroundColor, dVar.foregroundColor) && p005kotlin.jvm.internal.s.g(this.brandLogo, dVar.brandLogo) && p005kotlin.jvm.internal.s.g(this.issuerLogo, dVar.issuerLogo) && p005kotlin.jvm.internal.s.g(this.coBrandLogo, dVar.coBrandLogo) && p005kotlin.jvm.internal.s.g(this.cardBackgroundCombined, dVar.cardBackgroundCombined) && p005kotlin.jvm.internal.s.g(this.cardBackground, dVar.cardBackground) && p005kotlin.jvm.internal.s.g(this.icon, dVar.icon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    public final int hashCode() {
        String str = this.labelColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.issuerName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortDescription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.longDescription;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contactUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.contactPhone;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contactEmail;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.termsAndConditionsUrl;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.privacyPolicyUrl;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.faqUrl;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.foregroundColor;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<m> list = this.brandLogo;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<m> list2 = this.issuerLogo;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<m> list3 = this.coBrandLogo;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<m> list4 = this.cardBackgroundCombined;
        int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<m> list5 = this.cardBackground;
        int iHashCode16 = (iHashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<m> list6 = this.icon;
        return iHashCode16 + (list6 != null ? list6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTermsAndConditionsUrl() {
        return this.termsAndConditionsUrl;
    }

    public final String toString() {
        String str = this.labelColor;
        String str2 = this.issuerName;
        String str3 = this.shortDescription;
        String str4 = this.longDescription;
        String str5 = this.contactUrl;
        String str6 = this.contactPhone;
        String str7 = this.contactEmail;
        String str8 = this.termsAndConditionsUrl;
        String str9 = this.privacyPolicyUrl;
        String str10 = this.faqUrl;
        String str11 = this.foregroundColor;
        List<m> list = this.brandLogo;
        List<m> list2 = this.issuerLogo;
        List<m> list3 = this.coBrandLogo;
        List<m> list4 = this.cardBackgroundCombined;
        List<m> list5 = this.cardBackground;
        List<m> list6 = this.icon;
        StringBuilder sbI = p6.b.i("CardMetaData(labelColor=", str, ", issuerName=", str2, ", shortDescription=");
        sn.a.t(sbI, str3, ", longDescription=", str4, ", contactUrl=");
        sn.a.t(sbI, str5, ", contactPhone=", str6, ", contactEmail=");
        sn.a.t(sbI, str7, ", termsAndConditionsUrl=", str8, ", privacyPolicyUrl=");
        sn.a.t(sbI, str9, ", faqUrl=", str10, ", foregroundColor=");
        v.e0.o(str11, ", brandLogo=", ", issuerLogo=", sbI, list);
        n23.j.z(sbI, list2, ", coBrandLogo=", list3, ", cardBackgroundCombined=");
        n23.j.z(sbI, list4, ", cardBackground=", list5, ", icon=");
        return u62.z.c(sbI, list6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.labelColor);
        parcel.writeString(this.issuerName);
        parcel.writeString(this.shortDescription);
        parcel.writeString(this.longDescription);
        parcel.writeString(this.contactUrl);
        parcel.writeString(this.contactPhone);
        parcel.writeString(this.contactEmail);
        parcel.writeString(this.termsAndConditionsUrl);
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeString(this.faqUrl);
        parcel.writeString(this.foregroundColor);
        List<m> list = this.brandLogo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((m) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<m> list2 = this.issuerLogo;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((m) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<m> list3 = this.coBrandLogo;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((m) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        List<m> list4 = this.cardBackgroundCombined;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                ((m) itO4.next()).writeToParcel(parcel, i14);
            }
        }
        List<m> list5 = this.cardBackground;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO5 = u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                ((m) itO5.next()).writeToParcel(parcel, i14);
            }
        }
        List<m> list6 = this.icon;
        if (list6 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO6 = u0.o(parcel, list6, 1);
        while (itO6.hasNext()) {
            ((m) itO6.next()).writeToParcel(parcel, i14);
        }
    }
}
