package fv2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfv2/f;", "", "Ltv2/c;", "formattedValue", "Lfv2/b;", "selectedDate", "minimumDate", "maximumDate", "<init>", "(Ltv2/c;Lfv2/b;Lfv2/b;Lfv2/b;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv2.c f73750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f73751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f73752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f73753d;

    public /* synthetic */ f(tv2.c cVar, b bVar, b bVar2, b bVar3, int i14, j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : bVar2, (i14 & 8) != 0 ? null : bVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f73750a, fVar.f73750a) && s.g(this.f73751b, fVar.f73751b) && s.g(this.f73752c, fVar.f73752c) && s.g(this.f73753d, fVar.f73753d);
    }

    public final int hashCode() {
        int iHashCode = this.f73750a.hashCode() * 31;
        b bVar = this.f73751b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f73752c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.f73753d;
        return iHashCode3 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    public final String toString() {
        return "DatePickerOptions(formattedValue=" + this.f73750a + ", selectedDate=" + this.f73751b + ", minimumDate=" + this.f73752c + ", maximumDate=" + this.f73753d + ")";
    }

    public f(tv2.c cVar, b bVar, b bVar2, b bVar3) {
        cVar.getClass();
        this.f73750a = cVar;
        this.f73751b = bVar;
        this.f73752c = bVar2;
        this.f73753d = bVar3;
    }
}
