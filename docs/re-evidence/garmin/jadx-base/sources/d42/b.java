package d42;

import i53.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q71.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld42/b;", "", "Li53/d;", "Lq71/e;", "Ld42/a;", "vo2MaxTypeCurrentRecordStates", "<init>", "(Li53/d;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<e, a> f57477a;

    public /* synthetic */ b(d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? i53.a.c() : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && s.g(this.f57477a, ((b) obj).f57477a);
    }

    public final int hashCode() {
        return this.f57477a.hashCode();
    }

    public final String toString() {
        return "VO2MaxCurrentState(vo2MaxTypeCurrentRecordStates=" + this.f57477a + ")";
    }

    public b(d<e, a> dVar) {
        dVar.getClass();
        this.f57477a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
