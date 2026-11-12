package o32;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q71.e;
import yz1.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lo32/a;", "", "Lyz1/d;", "status", "Lq71/a;", "vo2MaxRange", "", "vo2MaxValue", "", "indicatorValue", "Lq71/e;", "vo2MaxType", "<init>", "(Lyz1/d;Lq71/a;Ljava/lang/Integer;Ljava/lang/Float;Lq71/e;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f128795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q71.a f128796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f128797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f128798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f128799e;

    public a(d dVar, q71.a aVar, Integer num, Float f14, e eVar) {
        dVar.getClass();
        eVar.getClass();
        this.f128795a = dVar;
        this.f128796b = aVar;
        this.f128797c = num;
        this.f128798d = f14;
        this.f128799e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f128795a, aVar.f128795a) && this.f128796b == aVar.f128796b && s.g(this.f128797c, aVar.f128797c) && s.g(this.f128798d, aVar.f128798d) && this.f128799e == aVar.f128799e;
    }

    public final int hashCode() {
        int iHashCode = this.f128795a.hashCode() * 31;
        q71.a aVar = this.f128796b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f128797c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f14 = this.f128798d;
        return this.f128799e.hashCode() + ((iHashCode3 + (f14 != null ? f14.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VO2MaxCardData(status=" + this.f128795a + ", vo2MaxRange=" + this.f128796b + ", vo2MaxValue=" + this.f128797c + ", indicatorValue=" + this.f128798d + ", vo2MaxType=" + this.f128799e + ")";
    }

    public /* synthetic */ a(d dVar, q71.a aVar, Integer num, Float f14, e eVar, int i14, j jVar) {
        this(dVar, aVar, num, f14, (i14 & 16) != 0 ? e.RUNNING : eVar);
    }
}
