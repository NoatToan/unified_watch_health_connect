package o92;

import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo92/b;", "", "Lo92/e;", "shape", "Lo4/d0;", "fillColor", "Lo92/a;", "border", "<init>", "(Lo92/e;JLo92/a;Lkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f131004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f131005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f131006c;

    public /* synthetic */ b(e eVar, long j8, a aVar, int i14, j jVar) {
        this(eVar, j8, (i14 & 4) != 0 ? null : aVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f131004a == bVar.f131004a && d0.d(this.f131005b, bVar.f131005b) && s.g(this.f131006c, bVar.f131006c);
    }

    public final int hashCode() {
        int iHashCode = this.f131004a.hashCode() * 31;
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        int iE = f.e(iHashCode, 31, this.f131005b);
        a aVar3 = this.f131006c;
        return iE + (aVar3 == null ? 0 : aVar3.hashCode());
    }

    public final String toString() {
        return "CustomShape(shape=" + this.f131004a + ", fillColor=" + d0.j(this.f131005b) + ", border=" + this.f131006c + ")";
    }

    private b(e eVar, long j8, a aVar) {
        eVar.getClass();
        this.f131004a = eVar;
        this.f131005b = j8;
        this.f131006c = aVar;
    }

    public /* synthetic */ b(e eVar, long j8, a aVar, j jVar) {
        this(eVar, j8, aVar);
    }
}
