package i41;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u000e\u0016B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u000f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u000f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001d\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Li41/a;", "Landroid/os/Parcelable;", "", "lowUpper", "balancedLow", "balancedUpper", "", "markerValue", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lm63/u1;)V", "a", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "setLowUpper", "(Ljava/lang/Integer;)V", "getLowUpper$annotations", "()V", "b", "setBalancedLow", "getBalancedLow$annotations", "c", "d", "setBalancedUpper", "getBalancedUpper$annotations", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "setMarkerValue", "(Ljava/lang/Double;)V", "getMarkerValue$annotations", "Companion", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowUpper")
    private Integer lowUpper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("balancedLow")
    private Integer balancedLow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("balancedUpper")
    private Integer balancedUpper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("markerValue")
    private Double markerValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: i41.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/overnighthrv/model/BaseLineDTO.$serializer", "Lm63/e0;", "Li41/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C1745a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1745a f90901a;
        private static final k63.e descriptor;

        static {
            C1745a c1745a = new C1745a();
            f90901a = c1745a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.overnighthrv.model.BaseLineDTO", c1745a, 4);
            m1Var.j("lowUpper", true);
            m1Var.j("balancedLow", true);
            m1Var.j("balancedUpper", true);
            m1Var.j("markerValue", true);
            descriptor = m1Var;
        }

        private C1745a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(x.f117036a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Double d14 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    num2 = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num2);
                    i15 |= 2;
                } else if (iE == 2) {
                    num3 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num3);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    d14 = (Double) cVarC.v(eVar2, 3, x.f117036a, d14);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, num, num2, num3, d14, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            a.h(aVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(int i14, Integer num, Integer num2, Integer num3, Double d14, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.lowUpper = null;
        } else {
            this.lowUpper = num;
        }
        if ((i14 & 2) == 0) {
            this.balancedLow = null;
        } else {
            this.balancedLow = num2;
        }
        if ((i14 & 4) == 0) {
            this.balancedUpper = null;
        } else {
            this.balancedUpper = num3;
        }
        if ((i14 & 8) == 0) {
            this.markerValue = null;
        } else {
            this.markerValue = d14;
        }
    }

    public static final /* synthetic */ void h(a aVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || aVar.lowUpper != null) {
            dVar.d(eVar, 0, m0.f116981a, aVar.lowUpper);
        }
        if (dVar.C(eVar) || aVar.balancedLow != null) {
            dVar.d(eVar, 1, m0.f116981a, aVar.balancedLow);
        }
        if (dVar.C(eVar) || aVar.balancedUpper != null) {
            dVar.d(eVar, 2, m0.f116981a, aVar.balancedUpper);
        }
        if (!dVar.C(eVar) && aVar.markerValue == null) {
            return;
        }
        dVar.d(eVar, 3, x.f117036a, aVar.markerValue);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBalancedLow() {
        return this.balancedLow;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getBalancedUpper() {
        return this.balancedUpper;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.lowUpper, aVar.lowUpper) && s.g(this.balancedLow, aVar.balancedLow) && s.g(this.balancedUpper, aVar.balancedUpper) && s.g(this.markerValue, aVar.markerValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getLowUpper() {
        return this.lowUpper;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getMarkerValue() {
        return this.markerValue;
    }

    public final int hashCode() {
        Integer num = this.lowUpper;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.balancedLow;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.balancedUpper;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d14 = this.markerValue;
        return iHashCode3 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.lowUpper;
        Integer num2 = this.balancedLow;
        Integer num3 = this.balancedUpper;
        Double d14 = this.markerValue;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "BaseLineDTO(lowUpper=", ", balancedLow=", ", balancedUpper=", num2);
        sbL.append(num3);
        sbL.append(", markerValue=");
        sbL.append(d14);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.lowUpper;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.balancedLow;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.balancedUpper;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Double d14 = this.markerValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    /* JADX INFO: renamed from: i41.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li41/a$b;", "", "<init>", "()V", "Li63/c;", "Li41/a;", "serializer", "()Li63/c;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1745a.f90901a;
        }

        private Companion() {
        }
    }

    public a() {
        this((Integer) null, (Integer) null, (Integer) null, (Double) null, 15, (j) null);
    }

    public a(Integer num, Integer num2, Integer num3, Double d14) {
        this.lowUpper = num;
        this.balancedLow = num2;
        this.balancedUpper = num3;
        this.markerValue = d14;
    }

    public /* synthetic */ a(Integer num, Integer num2, Integer num3, Double d14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : d14);
    }
}
