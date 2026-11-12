package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b'\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b.\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102¨\u00068"}, d2 = {"Lps/k0;", "Landroid/os/Parcelable;", "", "buddy", "current", "", "Lps/j0;", "diveGasDTOS", "Lps/m0;", "diveSettingsDTO", "entryType", "equipment", "exposureSuit", "", "suitThickness", "surfaceCondition", "totalSurfaceTime", "visibility", "Lps/z1;", "visibilityUnit", "", "weight", "weightUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lps/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lps/z1;Ljava/lang/Integer;Lps/z1;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lps/m0;", "g", "()Lps/m0;", JWKParameterNames.RSA_EXPONENT, "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Double;", "m", "o", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "l", "Lps/z1;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lps/z1;", "Ljava/lang/Integer;", "s", "()Ljava/lang/Integer;", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("buddy")
    private final String buddy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("current")
    private final String current;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("diveGases")
    private final List<j0> diveGasDTOS;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("diveSettings")
    private final m0 diveSettingsDTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("entryType")
    private final String entryType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("equipments")
    private final String equipment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exposureSuit")
    private final String exposureSuit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suitThickness")
    private final Double suitThickness;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("surfaceCondition")
    private final String surfaceCondition;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalSurfaceTime")
    private final Double totalSurfaceTime;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("visibility")
    private final Double visibility;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("visibilityUnit")
    private final z1 visibilityUnit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private final Integer weight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightUnit")
    private final z1 weightUnit;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k0> {
        @Override // android.os.Parcelable.Creator
        public final k0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(j0.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            m0 m0VarCreateFromParcel = parcel.readInt() == 0 ? null : m0.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = null;
            String string5 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string6 = parcel.readString();
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            z1 z1Var = (z1) parcel.readParcelable(k0.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new k0(string, string2, arrayList, m0VarCreateFromParcel, string3, string4, string5, dValueOf, string6, dValueOf2, dValueOf3, z1Var, numValueOf, (z1) parcel.readParcelable(k0.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final k0[] newArray(int i14) {
            return new k0[i14];
        }
    }

    public /* synthetic */ k0(String str, String str2, List list, m0 m0Var, String str3, String str4, String str5, Double d14, String str6, Double d15, Double d16, z1 z1Var, Integer num, z1 z1Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : m0Var, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : d14, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : d15, (i14 & 1024) != 0 ? null : d16, (i14 & 2048) != 0 ? null : z1Var, (i14 & 4096) != 0 ? null : num, (i14 & 8192) != 0 ? null : z1Var2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBuddy() {
        return this.buddy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrent() {
        return this.current;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.buddy, k0Var.buddy) && p005kotlin.jvm.internal.s.g(this.current, k0Var.current) && p005kotlin.jvm.internal.s.g(this.diveGasDTOS, k0Var.diveGasDTOS) && p005kotlin.jvm.internal.s.g(this.diveSettingsDTO, k0Var.diveSettingsDTO) && p005kotlin.jvm.internal.s.g(this.entryType, k0Var.entryType) && p005kotlin.jvm.internal.s.g(this.equipment, k0Var.equipment) && p005kotlin.jvm.internal.s.g(this.exposureSuit, k0Var.exposureSuit) && p005kotlin.jvm.internal.s.g(this.suitThickness, k0Var.suitThickness) && p005kotlin.jvm.internal.s.g(this.surfaceCondition, k0Var.surfaceCondition) && p005kotlin.jvm.internal.s.g(this.totalSurfaceTime, k0Var.totalSurfaceTime) && p005kotlin.jvm.internal.s.g(this.visibility, k0Var.visibility) && p005kotlin.jvm.internal.s.g(this.visibilityUnit, k0Var.visibilityUnit) && p005kotlin.jvm.internal.s.g(this.weight, k0Var.weight) && p005kotlin.jvm.internal.s.g(this.weightUnit, k0Var.weightUnit);
    }

    public final List<j0> f() {
        return this.diveGasDTOS;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m0 getDiveSettingsDTO() {
        return this.diveSettingsDTO;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEntryType() {
        return this.entryType;
    }

    public final int hashCode() {
        String str = this.buddy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.current;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<j0> list = this.diveGasDTOS;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        m0 m0Var = this.diveSettingsDTO;
        int iHashCode4 = (iHashCode3 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        String str3 = this.entryType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.equipment;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exposureSuit;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d14 = this.suitThickness;
        int iHashCode8 = (iHashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str6 = this.surfaceCondition;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d15 = this.totalSurfaceTime;
        int iHashCode10 = (iHashCode9 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.visibility;
        int iHashCode11 = (iHashCode10 + (d16 == null ? 0 : d16.hashCode())) * 31;
        z1 z1Var = this.visibilityUnit;
        int iHashCode12 = (iHashCode11 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        Integer num = this.weight;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        z1 z1Var2 = this.weightUnit;
        return iHashCode13 + (z1Var2 != null ? z1Var2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEquipment() {
        return this.equipment;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getExposureSuit() {
        return this.exposureSuit;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getSuitThickness() {
        return this.suitThickness;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSurfaceCondition() {
        return this.surfaceCondition;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getTotalSurfaceTime() {
        return this.totalSurfaceTime;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final z1 getVisibilityUnit() {
        return this.visibilityUnit;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final z1 getWeightUnit() {
        return this.weightUnit;
    }

    public final String toString() {
        String str = this.buddy;
        String str2 = this.current;
        List<j0> list = this.diveGasDTOS;
        m0 m0Var = this.diveSettingsDTO;
        String str3 = this.entryType;
        String str4 = this.equipment;
        String str5 = this.exposureSuit;
        Double d14 = this.suitThickness;
        String str6 = this.surfaceCondition;
        Double d15 = this.totalSurfaceTime;
        Double d16 = this.visibility;
        z1 z1Var = this.visibilityUnit;
        Integer num = this.weight;
        z1 z1Var2 = this.weightUnit;
        StringBuilder sbI = p6.b.i("DiveInfoDTO(buddy=", str, ", current=", str2, ", diveGasDTOS=");
        sbI.append(list);
        sbI.append(", diveSettingsDTO=");
        sbI.append(m0Var);
        sbI.append(", entryType=");
        sn.a.t(sbI, str3, ", equipment=", str4, ", exposureSuit=");
        b71.i.x(sbI, str5, ", suitThickness=", d14, ", surfaceCondition=");
        b71.i.x(sbI, str6, ", totalSurfaceTime=", d15, ", visibility=");
        sbI.append(d16);
        sbI.append(", visibilityUnit=");
        sbI.append(z1Var);
        sbI.append(", weight=");
        sbI.append(num);
        sbI.append(", weightUnit=");
        sbI.append(z1Var2);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.buddy);
        parcel.writeString(this.current);
        List<j0> list = this.diveGasDTOS;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((j0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        m0 m0Var = this.diveSettingsDTO;
        if (m0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m0Var.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.entryType);
        parcel.writeString(this.equipment);
        parcel.writeString(this.exposureSuit);
        Double d14 = this.suitThickness;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.surfaceCondition);
        Double d15 = this.totalSurfaceTime;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.visibility;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        parcel.writeParcelable(this.visibilityUnit, i14);
        Integer num = this.weight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeParcelable(this.weightUnit, i14);
    }

    public k0(String str, String str2, List<j0> list, m0 m0Var, String str3, String str4, String str5, Double d14, String str6, Double d15, Double d16, z1 z1Var, Integer num, z1 z1Var2) {
        this.buddy = str;
        this.current = str2;
        this.diveGasDTOS = list;
        this.diveSettingsDTO = m0Var;
        this.entryType = str3;
        this.equipment = str4;
        this.exposureSuit = str5;
        this.suitThickness = d14;
        this.surfaceCondition = str6;
        this.totalSurfaceTime = d15;
        this.visibility = d16;
        this.visibilityUnit = z1Var;
        this.weight = num;
        this.weightUnit = z1Var2;
    }

    public k0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
