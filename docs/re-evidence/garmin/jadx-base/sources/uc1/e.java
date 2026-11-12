package uc1;

import b63.o;
import b63.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luc1/e;", "", "Lp3/p1;", "", "isLoading", "Lo82/g;", "selectedIntervalType", "Lb63/o;", "selectedDate", "<init>", "(Lp3/p1;Lo82/g;Lb63/o;)V", "gcm-race-time-prediction_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1<Boolean> f169980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f169981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f169982c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e(p1 p1Var, o82.g gVar, o oVar, int i14, j jVar) {
        p1Var = (i14 & 1) != 0 ? p0.n(Boolean.FALSE) : p1Var;
        gVar = (i14 & 2) != 0 ? o82.g.f130850c : gVar;
        if ((i14 & 4) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(p1Var, gVar, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f169980a, eVar.f169980a) && this.f169981b == eVar.f169981b && s.g(this.f169982c, eVar.f169982c);
    }

    public final int hashCode() {
        return this.f169982c.f16206a.hashCode() + q6.f.i(this.f169981b, this.f169980a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RaceTimePredictionUiState(isLoading=" + this.f169980a + ", selectedIntervalType=" + this.f169981b + ", selectedDate=" + this.f169982c + ")";
    }

    public e(p1<Boolean> p1Var, o82.g gVar, o oVar) {
        p1Var.getClass();
        gVar.getClass();
        oVar.getClass();
        this.f169980a = p1Var;
        this.f169981b = gVar;
        this.f169982c = oVar;
    }

    public e() {
        this(null, null, null, 7, null);
    }
}
