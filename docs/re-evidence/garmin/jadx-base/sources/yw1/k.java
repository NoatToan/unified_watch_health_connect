package yw1;

import c22.b2;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lyw1/k;", "", "", "_fitnessAge", "_achievableFitnessAge", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f199947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f199948b;

    public /* synthetic */ k(int i14, Double d14, Double d15, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f199947a = null;
        } else {
            this.f199947a = d14;
        }
        if ((i14 & 2) == 0) {
            this.f199948b = null;
        } else {
            this.f199948b = d15;
        }
    }

    public final Double a() {
        Double d14 = this.f199947a;
        if (d14 == null) {
            return null;
        }
        Double d15 = this.f199948b;
        if (d15 == null) {
            b2.f23009a.getClass();
            double dDoubleValue = d14.doubleValue();
            double d16 = 2;
            return Double.valueOf(Math.floor(dDoubleValue * d16) / d16);
        }
        if (d14.doubleValue() > d15.doubleValue()) {
            b2.f23009a.getClass();
            double dDoubleValue2 = d14.doubleValue();
            double d17 = 2;
            return Double.valueOf(Math.ceil(dDoubleValue2 * d17) / d17);
        }
        b2.f23009a.getClass();
        double dDoubleValue3 = d14.doubleValue();
        double d18 = 2;
        return Double.valueOf(Math.floor(dDoubleValue3 * d18) / d18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f199947a, kVar.f199947a) && p005kotlin.jvm.internal.s.g(this.f199948b, kVar.f199948b);
    }

    public final int hashCode() {
        Double d14 = this.f199947a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f199948b;
        return iHashCode + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        return "FBTProgressReportFitnessAgeDTO(_fitnessAge=" + this.f199947a + ", _achievableFitnessAge=" + this.f199948b + ")";
    }

    /* JADX INFO: renamed from: yw1.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/k$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/k;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f199949a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this((Double) null, (Double) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public k(Double d14, Double d15) {
        this.f199947a = d14;
        this.f199948b = d15;
    }

    public /* synthetic */ k(Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15);
    }
}
