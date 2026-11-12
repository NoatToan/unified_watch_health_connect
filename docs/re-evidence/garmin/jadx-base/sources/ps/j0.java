package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u00ad\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001d¨\u00063"}, d2 = {"Lps/j0;", "Landroid/os/Parcelable;", "", "", "gasIndex", "", "heliumContent", "gasMode", "oxygenContent", "sacRate", "status", "tankEndingPressure", "Lps/z1;", "tankEndingPressureUnit", "tankSize", "tankSizeUnit", "tankStartingPressure", "tankStartingPressureUnit", "", "tankType", "volume", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Lps/z1;Ljava/lang/Double;Lps/z1;Ljava/lang/Integer;Lps/z1;Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "c", "I", "d", "h", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "g", "j", "Lps/z1;", JWKParameterNames.OCT_KEY_VALUE, "()Lps/z1;", "m", "o", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "l", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Ljava/lang/String;", "s", "()Ljava/lang/String;", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 implements Parcelable, Comparable<j0> {
    public static final Parcelable.Creator<j0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gasIndex")
    private final Integer gasIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heliumContent")
    private final Double heliumContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gasMode")
    private final int gasMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("oxygenContent")
    private final Double oxygenContent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sacRate")
    private final Double sacRate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final Integer status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankEndingPressure")
    private final Integer tankEndingPressure;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankEndingPressureUnit")
    private final z1 tankEndingPressureUnit;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankSize")
    private final Double tankSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankSizeUnit")
    private final z1 tankSizeUnit;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankStartingPressure")
    private final Integer tankStartingPressure;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankStartingPressureUnit")
    private final z1 tankStartingPressureUnit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tankType")
    private final String tankType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("volume")
    private final Double volume;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final j0 createFromParcel(Parcel parcel) {
            Double dValueOf;
            Double d14;
            Double dValueOf2;
            Integer num;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                dValueOf = null;
                d14 = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
                d14 = null;
            }
            int i14 = parcel.readInt();
            Double dValueOf3 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Object objValueOf = parcel.readInt() == 0 ? d14 : Integer.valueOf(parcel.readInt());
            Object objValueOf2 = parcel.readInt() == 0 ? d14 : Integer.valueOf(parcel.readInt());
            z1 z1Var = (z1) parcel.readParcelable(j0.class.getClassLoader());
            Double dValueOf5 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            z1 z1Var2 = (z1) parcel.readParcelable(j0.class.getClassLoader());
            Object objValueOf3 = parcel.readInt() == 0 ? d14 : Integer.valueOf(parcel.readInt());
            z1 z1Var3 = (z1) parcel.readParcelable(j0.class.getClassLoader());
            Double d15 = d14;
            Double d16 = dValueOf4;
            Integer num2 = objValueOf2;
            Double d17 = dValueOf5;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                num = objValueOf3;
                dValueOf2 = d15;
            } else {
                Object obj = objValueOf3;
                dValueOf2 = Double.valueOf(parcel.readDouble());
                num = obj;
            }
            new j0(numValueOf, dValueOf, i14, dValueOf3, d16, objValueOf, num2, z1Var, d17, z1Var2, num, z1Var3, string, dValueOf2);
            return r1;
        }

        @Override // android.os.Parcelable.Creator
        public final j0[] newArray(int i14) {
            return new j0[i14];
        }
    }

    static {
        z1.Companion companion = z1.INSTANCE;
    }

    public j0(Integer num, Double d14, int i14, Double d15, Double d16, Integer num2, Integer num3, z1 z1Var, Double d17, z1 z1Var2, Integer num4, z1 z1Var3, String str, Double d18, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : d14, (i15 & 4) != 0 ? qs.l.INVALID.f147111a : i14, (i15 & 8) != 0 ? null : d15, (i15 & 16) != 0 ? null : d16, (i15 & 32) != 0 ? null : num2, (i15 & 64) != 0 ? null : num3, (i15 & 128) != 0 ? null : z1Var, (i15 & 256) != 0 ? null : d17, (i15 & 512) != 0 ? null : z1Var2, (i15 & 1024) != 0 ? null : num4, (i15 & 2048) != 0 ? null : z1Var3, (i15 & 4096) != 0 ? null : str, (i15 & 8192) != 0 ? null : d18);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getGasIndex() {
        return this.gasIndex;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j0 j0Var) {
        Integer numValueOf;
        j0 j0Var2 = j0Var;
        j0Var2.getClass();
        Integer num = this.gasIndex;
        Integer num2 = j0Var2.gasIndex;
        if (num == null || num2 == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(p005kotlin.jvm.internal.s.h(num.intValue(), num2.intValue()));
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final qs.m d() {
        Object next;
        w13.c cVar = qs.m.f147116f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            int i14 = ((qs.m) next).f147117a;
            Integer num = this.status;
            if (num != null && i14 == num.intValue()) {
                return (qs.m) next;
            }
        }
        next = null;
        return (qs.m) next;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.gasIndex, j0Var.gasIndex) && p005kotlin.jvm.internal.s.g(this.heliumContent, j0Var.heliumContent) && this.gasMode == j0Var.gasMode && p005kotlin.jvm.internal.s.g(this.oxygenContent, j0Var.oxygenContent) && p005kotlin.jvm.internal.s.g(this.sacRate, j0Var.sacRate) && p005kotlin.jvm.internal.s.g(this.status, j0Var.status) && p005kotlin.jvm.internal.s.g(this.tankEndingPressure, j0Var.tankEndingPressure) && p005kotlin.jvm.internal.s.g(this.tankEndingPressureUnit, j0Var.tankEndingPressureUnit) && p005kotlin.jvm.internal.s.g(this.tankSize, j0Var.tankSize) && p005kotlin.jvm.internal.s.g(this.tankSizeUnit, j0Var.tankSizeUnit) && p005kotlin.jvm.internal.s.g(this.tankStartingPressure, j0Var.tankStartingPressure) && p005kotlin.jvm.internal.s.g(this.tankStartingPressureUnit, j0Var.tankStartingPressureUnit) && p005kotlin.jvm.internal.s.g(this.tankType, j0Var.tankType) && p005kotlin.jvm.internal.s.g(this.volume, j0Var.volume);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getHeliumContent() {
        return this.heliumContent;
    }

    public final qs.l g() {
        Object next;
        w13.c cVar = qs.l.f147110f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((qs.l) next).f147111a != this.gasMode);
        qs.l lVar = (qs.l) next;
        return lVar == null ? qs.l.INVALID : lVar;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getOxygenContent() {
        return this.oxygenContent;
    }

    public final int hashCode() {
        Integer num = this.gasIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.heliumContent;
        int iD = q2.d(this.gasMode, (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31, 31);
        Double d15 = this.oxygenContent;
        int iHashCode2 = (iD + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.sacRate;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tankEndingPressure;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        z1 z1Var = this.tankEndingPressureUnit;
        int iHashCode6 = (iHashCode5 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        Double d17 = this.tankSize;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        z1 z1Var2 = this.tankSizeUnit;
        int iHashCode8 = (iHashCode7 + (z1Var2 == null ? 0 : z1Var2.hashCode())) * 31;
        Integer num4 = this.tankStartingPressure;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        z1 z1Var3 = this.tankStartingPressureUnit;
        int iHashCode10 = (iHashCode9 + (z1Var3 == null ? 0 : z1Var3.hashCode())) * 31;
        String str = this.tankType;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Double d18 = this.volume;
        return iHashCode11 + (d18 != null ? d18.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getSacRate() {
        return this.sacRate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getTankEndingPressure() {
        return this.tankEndingPressure;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final z1 getTankEndingPressureUnit() {
        return this.tankEndingPressureUnit;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getTankSize() {
        return this.tankSize;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final z1 getTankSizeUnit() {
        return this.tankSizeUnit;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getTankStartingPressure() {
        return this.tankStartingPressure;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final z1 getTankStartingPressureUnit() {
        return this.tankStartingPressureUnit;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTankType() {
        return this.tankType;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getVolume() {
        return this.volume;
    }

    public final String toString() {
        Integer num = this.gasIndex;
        Double d14 = this.heliumContent;
        int i14 = this.gasMode;
        Double d15 = this.oxygenContent;
        Double d16 = this.sacRate;
        Integer num2 = this.status;
        Integer num3 = this.tankEndingPressure;
        z1 z1Var = this.tankEndingPressureUnit;
        Double d17 = this.tankSize;
        z1 z1Var2 = this.tankSizeUnit;
        Integer num4 = this.tankStartingPressure;
        z1 z1Var3 = this.tankStartingPressureUnit;
        String str = this.tankType;
        Double d18 = this.volume;
        StringBuilder sbM = lc.u0.m("DiveGasDTO(gasIndex=", num, ", heliumContent=", d14, ", gasMode=");
        sbM.append(i14);
        sbM.append(", oxygenContent=");
        sbM.append(d15);
        sbM.append(", sacRate=");
        b71.i.t(sbM, d16, ", status=", num2, ", tankEndingPressure=");
        sbM.append(num3);
        sbM.append(", tankEndingPressureUnit=");
        sbM.append(z1Var);
        sbM.append(", tankSize=");
        sbM.append(d17);
        sbM.append(", tankSizeUnit=");
        sbM.append(z1Var2);
        sbM.append(", tankStartingPressure=");
        sbM.append(num4);
        sbM.append(", tankStartingPressureUnit=");
        sbM.append(z1Var3);
        sbM.append(", tankType=");
        sbM.append(str);
        sbM.append(", volume=");
        sbM.append(d18);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.gasIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.heliumContent;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeInt(this.gasMode);
        Double d15 = this.oxygenContent;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.sacRate;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Integer num2 = this.status;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.tankEndingPressure;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeParcelable(this.tankEndingPressureUnit, i14);
        Double d17 = this.tankSize;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        parcel.writeParcelable(this.tankSizeUnit, i14);
        Integer num4 = this.tankStartingPressure;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        parcel.writeParcelable(this.tankStartingPressureUnit, i14);
        parcel.writeString(this.tankType);
        Double d18 = this.volume;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
    }

    public j0(Integer num, Double d14, int i14, Double d15, Double d16, Integer num2, Integer num3, z1 z1Var, Double d17, z1 z1Var2, Integer num4, z1 z1Var3, String str, Double d18) {
        this.gasIndex = num;
        this.heliumContent = d14;
        this.gasMode = i14;
        this.oxygenContent = d15;
        this.sacRate = d16;
        this.status = num2;
        this.tankEndingPressure = num3;
        this.tankEndingPressureUnit = z1Var;
        this.tankSize = d17;
        this.tankSizeUnit = z1Var2;
        this.tankStartingPressure = num4;
        this.tankStartingPressureUnit = z1Var3;
        this.tankType = str;
        this.volume = d18;
    }

    public j0() {
        this(null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
