package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitEnumTypeAdapter$UnitTypeAdapter;
import com.garmin.android.apps.connectmobile.events.model.adapters.UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lfg0/d;", "Landroid/os/Parcelable;", "", "value", "Lgg0/i;", "unit", "Lgg0/h;", "unitType", "<init>", "(Ljava/lang/Double;Lgg0/i;Lgg0/h;)V", "a", "Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Double;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Ljava/lang/Double;)V", "b", "Lgg0/i;", IntegerTokenConverter.CONVERTER_KEY, "()Lgg0/i;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Lgg0/i;)V", "c", "Lgg0/h;", "j", "()Lgg0/h;", "s", "(Lgg0/h;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private Double value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unit")
    @JsonAdapter(UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter.class)
    private gg0.i unit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitType")
    @JsonAdapter(UnitEnumTypeAdapter$UnitTypeAdapter.class)
    private gg0.h unitType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : gg0.i.valueOf(parcel.readString()), parcel.readInt() != 0 ? gg0.h.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71222a;

        static {
            int[] iArr = new int[gg0.i.values().length];
            try {
                iArr[gg0.i.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.i.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg0.i.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gg0.i.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gg0.i.HOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gg0.i.SECOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f71222a = iArr;
        }
    }

    public /* synthetic */ d(Double d14, gg0.i iVar, gg0.h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : hVar);
    }

    public static d h(d dVar) {
        return new d(dVar.value, dVar.unit, dVar.unitType);
    }

    public final Double b() {
        Double d14;
        gg0.i iVar = this.unit;
        int i14 = iVar == null ? -1 : b.f71222a[iVar.ordinal()];
        if (i14 == 1) {
            return this.value;
        }
        if (i14 == 2) {
            Double d15 = this.value;
            if (d15 == null) {
                return null;
            }
            double dDoubleValue = d15.doubleValue();
            l3.f23124b.getClass();
            return Double.valueOf(dDoubleValue * 1000.0d);
        }
        if (i14 != 3) {
            if (i14 != 4 || (d14 = this.value) == null) {
                return null;
            }
            double dDoubleValue2 = d14.doubleValue();
            l3.f23124b.getClass();
            return Double.valueOf(dDoubleValue2 * 0.9144d);
        }
        Double d16 = this.value;
        if (d16 == null) {
            return null;
        }
        double dDoubleValue3 = d16.doubleValue();
        l3.f23124b.getClass();
        return Double.valueOf(dDoubleValue3 * 1609.344d);
    }

    public final double d() {
        int i14;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        Double d14 = this.value;
        if (zY) {
            if (d14 == null) {
                return 0.0d;
            }
            gg0.i iVar = this.unit;
            i14 = iVar != null ? b.f71222a[iVar.ordinal()] : -1;
            if (i14 == 1) {
                og0.a aVar = og0.a.f131967a;
                l3.a aVar2 = l3.f23124b;
                double dDoubleValue = d14.doubleValue();
                aVar2.getClass();
                aVar.getClass();
                return og0.a.A(dDoubleValue / 1000.0d, 2);
            }
            if (i14 == 2) {
                return d14.doubleValue();
            }
            if (i14 == 3) {
                og0.a aVar3 = og0.a.f131967a;
                l3.a aVar4 = l3.f23124b;
                double dDoubleValue2 = d14.doubleValue();
                aVar4.getClass();
                aVar3.getClass();
                return og0.a.A(dDoubleValue2 * 1.609344d, 2);
            }
            if (i14 != 4) {
                return 0.0d;
            }
            og0.a aVar5 = og0.a.f131967a;
            l3.a aVar6 = l3.f23124b;
            double dDoubleValue3 = d14.doubleValue();
            aVar6.getClass();
            aVar5.getClass();
            return og0.a.A(dDoubleValue3 * 9.144E-4d, 2);
        }
        if (d14 == null) {
            return 0.0d;
        }
        gg0.i iVar2 = this.unit;
        i14 = iVar2 != null ? b.f71222a[iVar2.ordinal()] : -1;
        if (i14 == 1) {
            og0.a aVar7 = og0.a.f131967a;
            l3.a aVar8 = l3.f23124b;
            double dDoubleValue4 = d14.doubleValue();
            aVar8.getClass();
            aVar7.getClass();
            return og0.a.A(dDoubleValue4 / 1609.344d, 2);
        }
        if (i14 == 2) {
            og0.a aVar9 = og0.a.f131967a;
            l3.a aVar10 = l3.f23124b;
            double dDoubleValue5 = d14.doubleValue();
            aVar10.getClass();
            double dCeil = Math.ceil(dDoubleValue5 / 1.609344d);
            aVar9.getClass();
            return og0.a.A(dCeil, 2);
        }
        if (i14 == 3) {
            return d14.doubleValue();
        }
        if (i14 != 4) {
            return 0.0d;
        }
        og0.a aVar11 = og0.a.f131967a;
        l3.a aVar12 = l3.f23124b;
        double dDoubleValue6 = d14.doubleValue();
        aVar12.getClass();
        aVar11.getClass();
        return og0.a.A(dDoubleValue6 * 5.68182E-4d, 2);
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
        return p005kotlin.jvm.internal.s.g(this.value, dVar.value) && this.unit == dVar.unit && this.unitType == dVar.unitType;
    }

    public final String f() {
        Double dB = b();
        double dDoubleValue = dB != null ? dB.doubleValue() : 0.0d;
        bg0.a.f17827a.getClass();
        if (bg0.a.C0255a.e()) {
            l3.f23124b.getClass();
            String str = new DecimalFormat("0.00").format(dDoubleValue / 1000.0d);
            str.getClass();
            return str;
        }
        l3.f23124b.getClass();
        String str2 = new DecimalFormat("0.00").format(dDoubleValue / 1609.344d);
        str2.getClass();
        return str2;
    }

    public final Double g() {
        gg0.i iVar = this.unit;
        int i14 = iVar == null ? -1 : b.f71222a[iVar.ordinal()];
        if (i14 != 5) {
            if (i14 != 6) {
                return null;
            }
            return this.value;
        }
        Double d14 = this.value;
        if (d14 == null) {
            return null;
        }
        double dDoubleValue = d14.doubleValue();
        l3.f23124b.getClass();
        return Double.valueOf(l3.a.y((int) dDoubleValue, 0, 0));
    }

    public final int hashCode() {
        Double d14 = this.value;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        gg0.i iVar = this.unit;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        gg0.h hVar = this.unitType;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final gg0.i getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final gg0.h getUnitType() {
        return this.unitType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final boolean m() {
        return this.unitType == gg0.h.DISTANCE;
    }

    public final boolean o() {
        return this.unitType == gg0.h.TIME;
    }

    public final com.garmin.android.apps.connectmobile.workouts.data.model.z q() {
        return new com.garmin.android.apps.connectmobile.workouts.data.model.z(this.unit, this.unitType, this.value);
    }

    public final void r(gg0.i iVar) {
        this.unit = iVar;
    }

    public final void s(gg0.h hVar) {
        this.unitType = hVar;
    }

    public final void t(Double d14) {
        this.value = d14;
    }

    public final String toString() {
        return "CompletionTargetDTO(value=" + this.value + ", unit=" + this.unit + ", unitType=" + this.unitType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.value;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        gg0.i iVar = this.unit;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        gg0.h hVar = this.unitType;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
    }

    public d(Double d14, gg0.i iVar, gg0.h hVar) {
        this.value = d14;
        this.unit = iVar;
        this.unitType = hVar;
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
