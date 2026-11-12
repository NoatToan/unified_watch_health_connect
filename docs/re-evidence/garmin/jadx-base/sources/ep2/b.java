package ep2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR.\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010(\u001a\u0004\b\u001c\u0010)R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b$\u0010)R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR6\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b-\u0010\u001f\"\u0004\b5\u00106R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001d\u001a\u0004\b/\u0010\u001f\"\u0004\b8\u00106¨\u00069"}, d2 = {"Lep2/b;", "Landroid/os/Parcelable;", "", "cardType", "", "cvvLength", "", "cvvRequired", "displayName", "logoUrl", "", "Lo13/p;", "binRanges", "Lep2/a;", "capabilities", "lengths", "priority", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "panFormat", "maxLength", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lo13/p;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "c", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "d", "getDisplayName", JWKParameterNames.RSA_EXPONENT, "getLogoUrl", "Ljava/util/List;", "()Ljava/util/List;", "Lo13/p;", "getLengths", "()Lo13/p;", IntegerTokenConverter.CONVERTER_KEY, "m", "j", "Ljava/util/ArrayList;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/util/ArrayList;", "setPanFormat", "(Ljava/util/ArrayList;)V", "setMaxLength", "(Ljava/lang/Integer;)V", "l", "setMinLength", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardType")
    private final String cardType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cvvLength")
    private final Integer cvvLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cvvRequired")
    private final Boolean cvvRequired;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("logoUrl")
    private final String logoUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("binRanges")
    private final List<p<String, String>> binRanges;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("capabilities")
    private final List<ep2.a> capabilities;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lengths")
    private final p<String, String> lengths;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("priority")
    private final Integer priority;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("panFormat")
    private ArrayList<Integer> panFormat;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxLength")
    private Integer maxLength;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minLength")
    private Integer minLength;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList2.add(parcel.readSerializable());
            }
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList3.add(ep2.a.valueOf(parcel.readString()));
            }
            p pVar = (p) parcel.readSerializable();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i18 = parcel.readInt();
                arrayList = new ArrayList(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new b(string, numValueOf, boolValueOf, string2, string3, arrayList2, arrayList3, pVar, numValueOf2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, Integer num, Boolean bool, String str2, String str3, List list, List list2, p pVar, Integer num2, ArrayList arrayList, Integer num3, Integer num4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? j0.f134944a : list, (i14 & 64) != 0 ? j0.f134944a : list2, (i14 & 128) != 0 ? null : pVar, (i14 & 256) != 0 ? null : num2, (i14 & 512) != 0 ? null : arrayList, (i14 & 1024) != 0 ? null : num3, (i14 & 2048) != 0 ? null : num4);
    }

    public final List<p<String, String>> b() {
        return this.binRanges;
    }

    public final List<ep2.a> d() {
        return this.capabilities;
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
        return s.g(this.cardType, bVar.cardType) && s.g(this.cvvLength, bVar.cvvLength) && s.g(this.cvvRequired, bVar.cvvRequired) && s.g(this.displayName, bVar.displayName) && s.g(this.logoUrl, bVar.logoUrl) && s.g(this.binRanges, bVar.binRanges) && s.g(this.capabilities, bVar.capabilities) && s.g(this.lengths, bVar.lengths) && s.g(this.priority, bVar.priority) && s.g(this.panFormat, bVar.panFormat) && s.g(this.maxLength, bVar.maxLength) && s.g(this.minLength, bVar.minLength);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getCvvLength() {
        return this.cvvLength;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getCvvRequired() {
        return this.cvvRequired;
    }

    public final int hashCode() {
        String str = this.cardType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.cvvLength;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.cvvRequired;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logoUrl;
        int iB = u0.b(u0.b((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.binRanges), 31, this.capabilities);
        p<String, String> pVar = this.lengths;
        int iHashCode5 = (iB + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Integer num2 = this.priority;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.panFormat;
        int iHashCode7 = (iHashCode6 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num3 = this.maxLength;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minLength;
        return iHashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getMinLength() {
        return this.minLength;
    }

    public final ArrayList<Integer> k() {
        return this.panFormat;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getPriority() {
        return this.priority;
    }

    public final String toString() {
        String str = this.cardType;
        Integer num = this.cvvLength;
        Boolean bool = this.cvvRequired;
        String str2 = this.displayName;
        String str3 = this.logoUrl;
        List<p<String, String>> list = this.binRanges;
        List<ep2.a> list2 = this.capabilities;
        p<String, String> pVar = this.lengths;
        Integer num2 = this.priority;
        ArrayList<Integer> arrayList = this.panFormat;
        Integer num3 = this.maxLength;
        Integer num4 = this.minLength;
        StringBuilder sbN = u0.n("CardType(cardType='", num, str, "', cvvLength='", "', cvvRequired='");
        b71.i.s(sbN, bool, "', displayName='", str2, "', logoUrl='");
        e0.o(str3, "', binRanges=", "', capabilities=", sbN, list);
        sbN.append(list2);
        sbN.append("', lengths=");
        sbN.append(pVar);
        sbN.append("', priority=");
        sbN.append(num2);
        sbN.append("', panFormat=");
        sbN.append(arrayList);
        sbN.append("', maxLength=");
        return b71.i.h(sbN, num3, "', minLength=", num4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.cardType);
        Integer num = this.cvvLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Boolean bool = this.cvvRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.logoUrl);
        Iterator itE = kg.f.e(this.binRanges, parcel);
        while (itE.hasNext()) {
            parcel.writeSerializable((Serializable) itE.next());
        }
        Iterator itE2 = kg.f.e(this.capabilities, parcel);
        while (itE2.hasNext()) {
            parcel.writeString(((ep2.a) itE2.next()).name());
        }
        parcel.writeSerializable(this.lengths);
        Integer num2 = this.priority;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        ArrayList<Integer> arrayList = this.panFormat;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        }
        Integer num3 = this.maxLength;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.minLength;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, Integer num, Boolean bool, String str2, String str3, List<p<String, String>> list, List<? extends ep2.a> list2, p<String, String> pVar, Integer num2, ArrayList<Integer> arrayList, Integer num3, Integer num4) {
        list.getClass();
        list2.getClass();
        this.cardType = str;
        this.cvvLength = num;
        this.cvvRequired = bool;
        this.displayName = str2;
        this.logoUrl = str3;
        this.binRanges = list;
        this.capabilities = list2;
        this.lengths = pVar;
        this.priority = num2;
        this.panFormat = arrayList;
        this.maxLength = num3;
        this.minLength = num4;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
