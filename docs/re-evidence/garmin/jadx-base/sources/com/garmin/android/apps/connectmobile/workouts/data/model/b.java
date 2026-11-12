package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001cR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b3\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "benchmarkKey", "benchmarkCategoryKey", "", "_maxWeight", "", "reps", "_oneRepMax", "Lps/z1;", "weightUnit", "dateSet", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/l;", "linkedBenchmarkExercises", "benchmarkName", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Lps/z1;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "c", "f", "d", "Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "o", "()Ljava/lang/Integer;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Ljava/lang/Integer;)V", "Lps/z1;", "getWeightUnit", "()Lps/z1;", "z", "(Lps/z1;)V", "h", "getDateSet", "Ljava/util/List;", "j", "()Ljava/util/List;", "s", "(Ljava/util/List;)V", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;)V", "", JWKParameterNames.OCT_KEY_VALUE, "Z", "metric", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkKey")
    private final String benchmarkKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("benchmarkCategoryKey")
    private final String benchmarkCategoryKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxWeight")
    private Double _maxWeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reps")
    private Integer reps;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("oneRepMax")
    private Double _oneRepMax;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightUnit")
    private z1 weightUnit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateSet")
    private final String dateSet;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("linkedBenchmarkExercises")
    private List<l> linkedBenchmarkExercises;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String benchmarkName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private final boolean metric;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            z1 z1Var = (z1) parcel.readParcelable(b.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(l.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new b(lValueOf, string, string2, dValueOf, numValueOf, dValueOf2, z1Var, string3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Long l14, String str, String str2, Double d14, Integer num, Double d15, z1 z1Var, String str3, List list, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : d15, (i14 & 64) != 0 ? null : z1Var, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : str4);
    }

    public static Double b(Double d14, boolean z14, boolean z15) {
        if (d14 == null) {
            return d14;
        }
        if (z14 && !z15) {
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            return Double.valueOf(dDoubleValue * 2.20462d);
        }
        if (z14 || !z15) {
            return d14;
        }
        l3.a aVar2 = l3.f23124b;
        double dDoubleValue2 = d14.doubleValue();
        aVar2.getClass();
        return Double.valueOf(dDoubleValue2 / 2.20462d);
    }

    public static b d(b bVar, ArrayList arrayList) {
        Long l14 = bVar.id;
        String str = bVar.benchmarkKey;
        String str2 = bVar.benchmarkCategoryKey;
        Double d14 = bVar._maxWeight;
        Integer num = bVar.reps;
        Double d15 = bVar._oneRepMax;
        z1 z1Var = bVar.weightUnit;
        String str3 = bVar.dateSet;
        String str4 = bVar.benchmarkName;
        bVar.getClass();
        return new b(l14, str, str2, d14, num, d15, z1Var, str3, arrayList, str4);
    }

    public static Double q(Double d14) {
        BigDecimal scale;
        if (d14 == null || (scale = new BigDecimal(String.valueOf(d14.doubleValue())).setScale(1, RoundingMode.HALF_EVEN)) == null) {
            return null;
        }
        return Double.valueOf(scale.doubleValue());
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
        return p005kotlin.jvm.internal.s.g(this.id, bVar.id) && p005kotlin.jvm.internal.s.g(this.benchmarkKey, bVar.benchmarkKey) && p005kotlin.jvm.internal.s.g(this.benchmarkCategoryKey, bVar.benchmarkCategoryKey) && p005kotlin.jvm.internal.s.g(this._maxWeight, bVar._maxWeight) && p005kotlin.jvm.internal.s.g(this.reps, bVar.reps) && p005kotlin.jvm.internal.s.g(this._oneRepMax, bVar._oneRepMax) && p005kotlin.jvm.internal.s.g(this.weightUnit, bVar.weightUnit) && p005kotlin.jvm.internal.s.g(this.dateSet, bVar.dateSet) && p005kotlin.jvm.internal.s.g(this.linkedBenchmarkExercises, bVar.linkedBenchmarkExercises) && p005kotlin.jvm.internal.s.g(this.benchmarkName, bVar.benchmarkName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBenchmarkCategoryKey() {
        return this.benchmarkCategoryKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBenchmarkKey() {
        return this.benchmarkKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getBenchmarkName() {
        return this.benchmarkName;
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.benchmarkKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.benchmarkCategoryKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this._maxWeight;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num = this.reps;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d15 = this._oneRepMax;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        z1 z1Var = this.weightUnit;
        int iHashCode7 = (iHashCode6 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        String str3 = this.dateSet;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<l> list = this.linkedBenchmarkExercises;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.benchmarkName;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    public final List<l> j() {
        return this.linkedBenchmarkExercises;
    }

    public final Double k() {
        Double d14 = this._maxWeight;
        z1 z1Var = this.weightUnit;
        return q(b(d14, z1Var == null || z1Var.h() == qs.y.UNIT_WEIGHT_KILOGRAM, this.metric));
    }

    public final Double m() {
        Double d14 = this._oneRepMax;
        z1 z1Var = this.weightUnit;
        return q(b(d14, z1Var == null || z1Var.h() == qs.y.UNIT_WEIGHT_KILOGRAM, this.metric));
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getReps() {
        return this.reps;
    }

    public final void r(String str) {
        this.benchmarkName = str;
    }

    public final void s(ArrayList arrayList) {
        this.linkedBenchmarkExercises = arrayList;
    }

    public final void t(Double d14) {
        boolean z14 = this.metric;
        z1 z1Var = this.weightUnit;
        this._maxWeight = q(b(d14, z14, z1Var == null || z1Var.h() == qs.y.UNIT_WEIGHT_KILOGRAM));
    }

    public final String toString() {
        Long l14 = this.id;
        String str = this.benchmarkKey;
        String str2 = this.benchmarkCategoryKey;
        Double d14 = this._maxWeight;
        Integer num = this.reps;
        Double d15 = this._oneRepMax;
        z1 z1Var = this.weightUnit;
        String str3 = this.dateSet;
        List<l> list = this.linkedBenchmarkExercises;
        String str4 = this.benchmarkName;
        StringBuilder sbJ = b71.i.j("BenchmarkExerciseDTO(id=", ", benchmarkKey=", str, l14, ", benchmarkCategoryKey=");
        b71.i.x(sbJ, str2, ", _maxWeight=", d14, ", reps=");
        b71.i.v(sbJ, num, ", _oneRepMax=", d15, ", weightUnit=");
        sbJ.append(z1Var);
        sbJ.append(", dateSet=");
        sbJ.append(str3);
        sbJ.append(", linkedBenchmarkExercises=");
        sbJ.append(list);
        sbJ.append(", benchmarkName=");
        sbJ.append(str4);
        sbJ.append(")");
        return sbJ.toString();
    }

    public final void u(Double d14) {
        boolean z14 = this.metric;
        z1 z1Var = this.weightUnit;
        this._oneRepMax = q(b(d14, z14, z1Var == null || z1Var.h() == qs.y.UNIT_WEIGHT_KILOGRAM));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.id;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.benchmarkKey);
        parcel.writeString(this.benchmarkCategoryKey);
        Double d14 = this._maxWeight;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Integer num = this.reps;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d15 = this._oneRepMax;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeParcelable(this.weightUnit, i14);
        parcel.writeString(this.dateSet);
        List<l> list = this.linkedBenchmarkExercises;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((l) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.benchmarkName);
    }

    public final void y(Integer num) {
        this.reps = num;
    }

    public final void z(z1 z1Var) {
        this.weightUnit = z1Var;
    }

    public b(Long l14, String str, String str2, Double d14, Integer num, Double d15, z1 z1Var, String str3, List<l> list, String str4) {
        this.id = l14;
        this.benchmarkKey = str;
        this.benchmarkCategoryKey = str2;
        this._maxWeight = d14;
        this.reps = num;
        this._oneRepMax = d15;
        this.weightUnit = z1Var;
        this.dateSet = str3;
        this.linkedBenchmarkExercises = list;
        this.benchmarkName = str4;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        this.metric = zY;
        if (this.weightUnit == null) {
            this.weightUnit = new z1((Double) null, (Integer) null, (zY ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null);
        }
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
