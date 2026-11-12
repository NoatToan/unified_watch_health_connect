package d11;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import s21.o;
import y22.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld11/b;", "", "Ld11/d;", "meal", "Ly22/x;", "photo", "originalPhoto", "Ls21/o;", "micronutrientsSettings", "<init>", "(Ld11/d;Ly22/x;Ly22/x;Ls21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f57044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f57045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f57046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f57047d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(d dVar, x xVar, x xVar2, o oVar, int i14, j jVar) {
        xVar = (i14 & 2) != 0 ? null : xVar;
        this(dVar, xVar, (i14 & 4) != 0 ? xVar : xVar2, (i14 & 8) != 0 ? null : oVar);
    }

    public static b a(b bVar, d dVar, x xVar, int i14) {
        if ((i14 & 1) != 0) {
            dVar = bVar.f57044a;
        }
        if ((i14 & 2) != 0) {
            xVar = bVar.f57045b;
        }
        x xVar2 = bVar.f57046c;
        o oVar = bVar.f57047d;
        dVar.getClass();
        return new b(dVar, xVar, xVar2, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f57044a, bVar.f57044a) && s.g(this.f57045b, bVar.f57045b) && s.g(this.f57046c, bVar.f57046c) && s.g(this.f57047d, bVar.f57047d);
    }

    public final int hashCode() {
        int iHashCode = this.f57044a.hashCode() * 31;
        x xVar = this.f57045b;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.f57046c;
        int iHashCode3 = (iHashCode2 + (xVar2 == null ? 0 : xVar2.hashCode())) * 31;
        o oVar = this.f57047d;
        return iHashCode3 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "CreateMealData(meal=" + this.f57044a + ", photo=" + this.f57045b + ", originalPhoto=" + this.f57046c + ", micronutrientsSettings=" + this.f57047d + ")";
    }

    public b(d dVar, x xVar, x xVar2, o oVar) {
        dVar.getClass();
        this.f57044a = dVar;
        this.f57045b = xVar;
        this.f57046c = xVar2;
        this.f57047d = oVar;
    }
}
