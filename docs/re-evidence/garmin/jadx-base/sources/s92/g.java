package s92;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR,\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b \u0010(\"\u0004\b,\u0010*R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\b4\u0010\u001fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010'\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R,\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010'\u001a\u0004\b@\u0010(\"\u0004\bA\u0010*R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001b\u001a\u0004\b<\u0010\u001d\"\u0004\bC\u0010\u001fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001b\u001a\u0004\bB\u0010\u001d\"\u0004\bE\u0010\u001fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001b\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010\u001f¨\u0006H"}, d2 = {"Ls92/g;", "Landroid/os/Parcelable;", "", "consentTypeId", "locale", "version", "", "Ls92/e;", "consentLinks", "Ls92/b;", "consentCopyBlocks", "Ls92/f;", "consentTexts", "headline", "description", "grantButton", "rejectButton", "revokeTexts", "revokeHeadline", "revokeCopyBlocks", "revokeLinks", "revokeCancelButton", "revokeConsentButton", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setConsentTypeId", "(Ljava/lang/String;)V", "b", "j", "setLocale", "c", "u", "setVersion", "d", "Ljava/util/List;", "()Ljava/util/List;", "setConsentLinks", "(Ljava/util/List;)V", JWKParameterNames.RSA_EXPONENT, "setConsentCopyBlocks", "f", "setConsentTexts", IntegerTokenConverter.CONVERTER_KEY, "setHeadline", "h", "getDescription", "setDescription", "setGrantButton", JWKParameterNames.OCT_KEY_VALUE, "setRejectButton", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "setRevokeTexts", "l", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setRevokeHeadline", "m", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setRevokeCopyBlocks", JWKParameterNames.RSA_MODULUS, "s", "setRevokeLinks", "o", "setRevokeCancelButton", "p", "setRevokeConsentButton", "getDisplayName", "setDisplayName", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTypeId")
    @Expose
    private String consentTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    @Expose
    private String locale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    @Expose
    private String version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentLinks")
    @Expose
    private List<e> consentLinks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentCopyBlocks")
    @Expose
    private List<b> consentCopyBlocks;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTexts")
    @Expose
    private List<f> consentTexts;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("headline")
    @Expose
    private String headline;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    @Expose
    private String description;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("grantButton")
    @Expose
    private String grantButton;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rejectButton")
    @Expose
    private String rejectButton;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("revokeTexts")
    @Expose
    private List<f> revokeTexts;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("revokeHeadline")
    @Expose
    private String revokeHeadline;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("revokeCopyBlocks")
    @Expose
    private List<b> revokeCopyBlocks;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("revokeLinks")
    @Expose
    private List<e> revokeLinks;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("revokeCancelButton")
    @Expose
    private String revokeCancelButton;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("revokeConsentButton")
    @Expose
    private String revokeConsentButton;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    @Expose
    private String displayName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList7.add(parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList2 = new ArrayList(i16);
                int iA = 0;
                while (iA != i16) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList3 = new ArrayList(i17);
                int iA2 = 0;
                while (iA2 != i17) {
                    iA2 = kg.f.a(f.CREATOR, parcel, arrayList3, iA2, 1);
                }
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int iA3 = 0;
            ArrayList arrayList8 = arrayList2;
            String string6 = parcel.readString();
            ArrayList arrayList9 = arrayList3;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i18 = parcel.readInt();
                arrayList4 = new ArrayList(i18);
                while (iA3 != i18) {
                    iA3 = kg.f.a(f.CREATOR, parcel, arrayList4, iA3, 1);
                }
            }
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i19);
                int iA4 = 0;
                while (iA4 != i19) {
                    iA4 = kg.f.a(b.CREATOR, parcel, arrayList10, iA4, 1);
                    string = string;
                    string2 = string2;
                }
                arrayList5 = arrayList10;
            }
            String str = string;
            String str2 = string2;
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    arrayList11.add(parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel));
                }
                arrayList6 = arrayList11;
            }
            return new g(str, str2, string3, arrayList, arrayList8, arrayList9, string4, string5, string6, string7, arrayList4, string8, arrayList5, arrayList6, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(String str, String str2, String str3, List<e> list, List<b> list2, List<f> list3, String str4, String str5, String str6, String str7, List<f> list4, String str8, List<b> list5, List<e> list6, String str9, String str10, String str11) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.consentTypeId = str;
        this.locale = str2;
        this.version = str3;
        this.consentLinks = list;
        this.consentCopyBlocks = list2;
        this.consentTexts = list3;
        this.headline = str4;
        this.description = str5;
        this.grantButton = str6;
        this.rejectButton = str7;
        this.revokeTexts = list4;
        this.revokeHeadline = str8;
        this.revokeCopyBlocks = list5;
        this.revokeLinks = list6;
        this.revokeCancelButton = str9;
        this.revokeConsentButton = str10;
        this.displayName = str11;
    }

    public final List<b> b() {
        return this.consentCopyBlocks;
    }

    public final List<e> d() {
        return this.consentLinks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.consentTypeId, gVar.consentTypeId) && s.g(this.locale, gVar.locale) && s.g(this.version, gVar.version) && s.g(this.consentLinks, gVar.consentLinks) && s.g(this.consentCopyBlocks, gVar.consentCopyBlocks) && s.g(this.consentTexts, gVar.consentTexts) && s.g(this.headline, gVar.headline) && s.g(this.description, gVar.description) && s.g(this.grantButton, gVar.grantButton) && s.g(this.rejectButton, gVar.rejectButton) && s.g(this.revokeTexts, gVar.revokeTexts) && s.g(this.revokeHeadline, gVar.revokeHeadline) && s.g(this.revokeCopyBlocks, gVar.revokeCopyBlocks) && s.g(this.revokeLinks, gVar.revokeLinks) && s.g(this.revokeCancelButton, gVar.revokeCancelButton) && s.g(this.revokeConsentButton, gVar.revokeConsentButton) && s.g(this.displayName, gVar.displayName);
    }

    public final List<f> f() {
        return this.consentTexts;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getConsentTypeId() {
        return this.consentTypeId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getGrantButton() {
        return this.grantButton;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.consentTypeId.hashCode() * 31, 31, this.locale), 31, this.version);
        List<e> list = this.consentLinks;
        int iHashCode = (iJ + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.consentCopyBlocks;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<f> list3 = this.consentTexts;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.headline;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.grantButton;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rejectButton;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<f> list4 = this.revokeTexts;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str5 = this.revokeHeadline;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<b> list5 = this.revokeCopyBlocks;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<e> list6 = this.revokeLinks;
        int iHashCode11 = (iHashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str6 = this.revokeCancelButton;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.revokeConsentButton;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.displayName;
        return iHashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRejectButton() {
        return this.rejectButton;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRevokeCancelButton() {
        return this.revokeCancelButton;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRevokeConsentButton() {
        return this.revokeConsentButton;
    }

    public final List<b> q() {
        return this.revokeCopyBlocks;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getRevokeHeadline() {
        return this.revokeHeadline;
    }

    public final List<e> s() {
        return this.revokeLinks;
    }

    public final List<f> t() {
        return this.revokeTexts;
    }

    public final String toString() {
        String str = this.consentTypeId;
        String str2 = this.locale;
        String str3 = this.version;
        List<e> list = this.consentLinks;
        List<b> list2 = this.consentCopyBlocks;
        List<f> list3 = this.consentTexts;
        String str4 = this.headline;
        String str5 = this.description;
        String str6 = this.grantButton;
        String str7 = this.rejectButton;
        List<f> list4 = this.revokeTexts;
        String str8 = this.revokeHeadline;
        List<b> list5 = this.revokeCopyBlocks;
        List<e> list6 = this.revokeLinks;
        String str9 = this.revokeCancelButton;
        String str10 = this.revokeConsentButton;
        String str11 = this.displayName;
        StringBuilder sbI = p6.b.i("ConsentTextDTO(consentTypeId=", str, ", locale=", str2, ", version=");
        e0.o(str3, ", consentLinks=", ", consentCopyBlocks=", sbI, list);
        n23.j.z(sbI, list2, ", consentTexts=", list3, ", headline=");
        sn.a.t(sbI, str4, ", description=", str5, ", grantButton=");
        sn.a.t(sbI, str6, ", rejectButton=", str7, ", revokeTexts=");
        o2.c.n(", revokeHeadline=", str8, ", revokeCopyBlocks=", sbI, list4);
        n23.j.z(sbI, list5, ", revokeLinks=", list6, ", revokeCancelButton=");
        sn.a.t(sbI, str9, ", revokeConsentButton=", str10, ", displayName=");
        return am.j.o(str11, ")", sbI);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.consentTypeId);
        parcel.writeString(this.locale);
        parcel.writeString(this.version);
        List<e> list = this.consentLinks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                e eVar = (e) itO.next();
                if (eVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    eVar.writeToParcel(parcel, i14);
                }
            }
        }
        List<b> list2 = this.consentCopyBlocks;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((b) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<f> list3 = this.consentTexts;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((f) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.headline);
        parcel.writeString(this.description);
        parcel.writeString(this.grantButton);
        parcel.writeString(this.rejectButton);
        List<f> list4 = this.revokeTexts;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                ((f) itO4.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.revokeHeadline);
        List<b> list5 = this.revokeCopyBlocks;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO5 = u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                ((b) itO5.next()).writeToParcel(parcel, i14);
            }
        }
        List<e> list6 = this.revokeLinks;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO6 = u0.o(parcel, list6, 1);
            while (itO6.hasNext()) {
                e eVar2 = (e) itO6.next();
                if (eVar2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    eVar2.writeToParcel(parcel, i14);
                }
            }
        }
        parcel.writeString(this.revokeCancelButton);
        parcel.writeString(this.revokeConsentButton);
        parcel.writeString(this.displayName);
    }
}
