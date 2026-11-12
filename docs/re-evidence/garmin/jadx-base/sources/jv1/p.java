package jv1;

import gg1.o0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljv1/p;", "", "", "Ljv1/o;", "profiles", "selProfile", "", "customElevationInMeters", "Lgg1/o0;", "userPrefMeasurementSystem", "<init>", "(Ljava/util/List;Ljv1/o;Ljava/lang/Double;Lgg1/o0;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o> f101109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f101110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f101111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f101112d;

    /* JADX WARN: Multi-variable type inference failed */
    public p(List<? extends o> list, o oVar, Double d14, o0 o0Var) {
        list.getClass();
        o0Var.getClass();
        this.f101109a = list;
        this.f101110b = oVar;
        this.f101111c = d14;
        this.f101112d = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f101109a.equals(pVar.f101109a) && p005kotlin.jvm.internal.s.g(this.f101110b, pVar.f101110b) && p005kotlin.jvm.internal.s.g(this.f101111c, pVar.f101111c) && this.f101112d == pVar.f101112d;
    }

    public final int hashCode() {
        int iHashCode = this.f101109a.hashCode() * 31;
        o oVar = this.f101110b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Double d14 = this.f101111c;
        return this.f101112d.hashCode() + ((iHashCode2 + (d14 != null ? d14.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FBTElevationProfileUIModel(profiles=" + this.f101109a + ", selProfile=" + this.f101110b + ", customElevationInMeters=" + this.f101111c + ", userPrefMeasurementSystem=" + this.f101112d + ")";
    }
}
