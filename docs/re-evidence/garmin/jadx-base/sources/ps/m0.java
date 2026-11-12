package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010#¨\u0006*"}, d2 = {"Lps/m0;", "Landroid/os/Parcelable;", "", "ccrHighSetPoint", "ccrHighSetPointDepth", "", "ccrHighSetPointSwitchMode", "ccrLowSetPoint", "ccrLowSetPointDepth", "ccrLowSetPointSwitchMode", "", "gfHigh", "gfLow", ModelSourceWrapper.TYPE, "name", "waterDensity", "_waterType", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)V", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "d", "c", "Ljava/lang/String;", "getCcrHighSetPointSwitchMode", "()Ljava/lang/String;", "f", JWKParameterNames.RSA_EXPONENT, "g", "getCcrLowSetPointSwitchMode", "I", "h", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "getModel", "()Ljava/lang/Integer;", "j", "getName", JWKParameterNames.OCT_KEY_VALUE, "l", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ccrHighSetpoint")
    private final Double ccrHighSetPoint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ccrHighSetpointDepth")
    private final Double ccrHighSetPointDepth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ccrHighSetpointSwitchMode")
    private final String ccrHighSetPointSwitchMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ccrLowSetpoint")
    private final Double ccrLowSetPoint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ccrLowSetpointDepth")
    private final Double ccrLowSetPointDepth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ccrLowSetpointSwitchMode")
    private final String ccrLowSetPointSwitchMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gfHigh")
    private final int gfHigh;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gfLow")
    private final int gfLow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ModelSourceWrapper.TYPE)
    private final Integer model;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("waterDensity")
    private final Double waterDensity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("waterType")
    private final Integer _waterType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m0> {
        @Override // android.os.Parcelable.Creator
        public final m0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string = parcel.readString();
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string2 = parcel.readString();
            Double d14 = dValueOf2;
            Double d15 = dValueOf3;
            Double d16 = dValueOf4;
            int i14 = parcel.readInt();
            Integer numValueOf = null;
            int i15 = parcel.readInt();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new m0(dValueOf, d14, string, d15, d16, string2, i14, i15, numValueOf2, string3, dValueOf5, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final m0[] newArray(int i14) {
            return new m0[i14];
        }
    }

    public m0(Double d14, Double d15, String str, Double d16, Double d17, String str2, int i14, int i15, Integer num, String str3, Double d18, Integer num2, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : d14, (i16 & 2) != 0 ? null : d15, (i16 & 4) != 0 ? null : str, (i16 & 8) != 0 ? null : d16, (i16 & 16) != 0 ? null : d17, (i16 & 32) != 0 ? null : str2, (i16 & 64) != 0 ? qs.j.HIGH_DEFAULT.f147098a : i14, (i16 & 128) != 0 ? qs.k.LOW_DEFAULT.f147105a : i15, (i16 & 256) != 0 ? null : num, (i16 & 512) != 0 ? null : str3, (i16 & 1024) != 0 ? null : d18, (i16 & 2048) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getCcrHighSetPoint() {
        return this.ccrHighSetPoint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getCcrHighSetPointDepth() {
        return this.ccrHighSetPointDepth;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return p005kotlin.jvm.internal.s.g(this.ccrHighSetPoint, m0Var.ccrHighSetPoint) && p005kotlin.jvm.internal.s.g(this.ccrHighSetPointDepth, m0Var.ccrHighSetPointDepth) && p005kotlin.jvm.internal.s.g(this.ccrHighSetPointSwitchMode, m0Var.ccrHighSetPointSwitchMode) && p005kotlin.jvm.internal.s.g(this.ccrLowSetPoint, m0Var.ccrLowSetPoint) && p005kotlin.jvm.internal.s.g(this.ccrLowSetPointDepth, m0Var.ccrLowSetPointDepth) && p005kotlin.jvm.internal.s.g(this.ccrLowSetPointSwitchMode, m0Var.ccrLowSetPointSwitchMode) && this.gfHigh == m0Var.gfHigh && this.gfLow == m0Var.gfLow && p005kotlin.jvm.internal.s.g(this.model, m0Var.model) && p005kotlin.jvm.internal.s.g(this.name, m0Var.name) && p005kotlin.jvm.internal.s.g(this.waterDensity, m0Var.waterDensity) && p005kotlin.jvm.internal.s.g(this._waterType, m0Var._waterType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getCcrLowSetPoint() {
        return this.ccrLowSetPoint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getCcrLowSetPointDepth() {
        return this.ccrLowSetPointDepth;
    }

    public final qs.c h() {
        if (j() == qs.k.LOW_35 && i() == qs.j.HIGH_75) {
            return qs.c.High;
        }
        if (j() == qs.k.LOW_40 && i() == qs.j.HIGH_85) {
            return qs.c.Medium;
        }
        if (j() == qs.k.LOW_45 && i() == qs.j.HIGH_95) {
            return qs.c.Low;
        }
        return (j() == qs.k.LOW_DEFAULT || i() == qs.j.HIGH_DEFAULT) ? qs.c.Default : qs.c.Custom;
    }

    public final int hashCode() {
        Double d14 = this.ccrHighSetPoint;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.ccrHighSetPointDepth;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str = this.ccrHighSetPointSwitchMode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d16 = this.ccrLowSetPoint;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.ccrLowSetPointDepth;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str2 = this.ccrLowSetPointSwitchMode;
        int iD = q2.d(this.gfLow, q2.d(this.gfHigh, (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Integer num = this.model;
        int iHashCode6 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d18 = this.waterDensity;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Integer num2 = this._waterType;
        return iHashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public final qs.j i() {
        Object next;
        w13.c cVar = qs.j.f147097g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((qs.j) next).f147098a != this.gfHigh);
        qs.j jVar = (qs.j) next;
        return jVar == null ? qs.j.HIGH_DEFAULT : jVar;
    }

    public final qs.k j() {
        Object next;
        w13.c cVar = qs.k.f147104g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((qs.k) next).f147105a != this.gfLow);
        qs.k kVar = (qs.k) next;
        return kVar == null ? qs.k.LOW_DEFAULT : kVar;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getWaterDensity() {
        return this.waterDensity;
    }

    public final qs.a0 m() {
        Object next;
        w13.c cVar = qs.a0.f146994e;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            int i14 = ((qs.a0) next).f146995a;
            Integer num = this._waterType;
            if (num != null && i14 == num.intValue()) {
                return (qs.a0) next;
            }
        }
        next = null;
        return (qs.a0) next;
    }

    public final String toString() {
        Double d14 = this.ccrHighSetPoint;
        Double d15 = this.ccrHighSetPointDepth;
        String str = this.ccrHighSetPointSwitchMode;
        Double d16 = this.ccrLowSetPoint;
        Double d17 = this.ccrLowSetPointDepth;
        String str2 = this.ccrLowSetPointSwitchMode;
        int i14 = this.gfHigh;
        int i15 = this.gfLow;
        Integer num = this.model;
        String str3 = this.name;
        Double d18 = this.waterDensity;
        Integer num2 = this._waterType;
        StringBuilder sbI = tn.k.i("DiveSettingsDTO(ccrHighSetPoint=", d14, d15, ", ccrHighSetPointDepth=", ", ccrHighSetPointSwitchMode=");
        b71.i.x(sbI, str, ", ccrLowSetPoint=", d16, ", ccrLowSetPointDepth=");
        b71.i.u(sbI, d17, ", ccrLowSetPointSwitchMode=", str2, ", gfHigh=");
        ds.e0.m(i14, i15, ", gfLow=", ", model=", sbI);
        p6.b.l(num, ", name=", str3, ", waterDensity=", sbI);
        sbI.append(d18);
        sbI.append(", _waterType=");
        sbI.append(num2);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.ccrHighSetPoint;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.ccrHighSetPointDepth;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.ccrHighSetPointSwitchMode);
        Double d16 = this.ccrLowSetPoint;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.ccrLowSetPointDepth;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        parcel.writeString(this.ccrLowSetPointSwitchMode);
        parcel.writeInt(this.gfHigh);
        parcel.writeInt(this.gfLow);
        Integer num = this.model;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.name);
        Double d18 = this.waterDensity;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Integer num2 = this._waterType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
    }

    public m0(Double d14, Double d15, String str, Double d16, Double d17, String str2, int i14, int i15, Integer num, String str3, Double d18, Integer num2) {
        this.ccrHighSetPoint = d14;
        this.ccrHighSetPointDepth = d15;
        this.ccrHighSetPointSwitchMode = str;
        this.ccrLowSetPoint = d16;
        this.ccrLowSetPointDepth = d17;
        this.ccrLowSetPointSwitchMode = str2;
        this.gfHigh = i14;
        this.gfLow = i15;
        this.model = num;
        this.name = str3;
        this.waterDensity = d18;
        this._waterType = num2;
    }

    public m0() {
        this(null, null, null, null, null, null, 0, 0, null, null, null, null, 4095, null);
    }
}
