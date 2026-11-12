package s21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls21/e;", "", "", "carbs", "fat", "protein", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f156097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f156098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f156099c;

    public /* synthetic */ e(Double d14, Double d15, Double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f156097a, eVar.f156097a) && p005kotlin.jvm.internal.s.g(this.f156098b, eVar.f156098b) && p005kotlin.jvm.internal.s.g(this.f156099c, eVar.f156099c);
    }

    public final int hashCode() {
        Double d14 = this.f156097a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f156098b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f156099c;
        return iHashCode2 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        return b71.i.g(tn.k.i("MacroGoalsUiModel(carbs=", this.f156097a, this.f156098b, ", fat=", ", protein="), this.f156099c, ")");
    }

    public e(Double d14, Double d15, Double d16) {
        this.f156097a = d14;
        this.f156098b = d15;
        this.f156099c = d16;
    }

    public e() {
        this(null, null, null, 7, null);
    }
}
