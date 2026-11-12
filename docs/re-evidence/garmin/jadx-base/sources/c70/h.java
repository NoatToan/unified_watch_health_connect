package c70;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc70/h;", "", "Lorg/joda/time/DateTime;", "initialDate", "Lo82/g;", "initialIntervalType", "<init>", "(Lorg/joda/time/DateTime;Lo82/g;)V", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f25230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f25231b;

    public /* synthetic */ h(DateTime dateTime, o82.g gVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? new DateTime() : dateTime, (i14 & 2) != 0 ? o82.g.f130849b : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f25230a, hVar.f25230a) && this.f25231b == hVar.f25231b;
    }

    public final int hashCode() {
        return this.f25231b.hashCode() + (this.f25230a.hashCode() * 31);
    }

    public final String toString() {
        return "CyclingAbilityReportsUiState(initialDate=" + this.f25230a + ", initialIntervalType=" + this.f25231b + ")";
    }

    public h(DateTime dateTime, o82.g gVar) {
        dateTime.getClass();
        gVar.getClass();
        this.f25230a = dateTime;
        this.f25231b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
