package d11;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import y22.x;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld11/a;", "", "Ld11/c;", "food", "Li53/c;", "Lg01/c;", "units", "Ly22/x;", "photo", "originalPhoto", "<init>", "(Ld11/c;Li53/c;Ly22/x;Ly22/x;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f57040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<g01.c> f57041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f57042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f57043d;

    static {
        x.Companion companion = x.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(c cVar, i53.c<? extends g01.c> cVar2, x xVar, x xVar2) {
        cVar.getClass();
        cVar2.getClass();
        this.f57040a = cVar;
        this.f57041b = cVar2;
        this.f57042c = xVar;
        this.f57043d = xVar2;
    }

    public static a a(a aVar, c cVar, x xVar, int i14) {
        if ((i14 & 1) != 0) {
            cVar = aVar.f57040a;
        }
        i53.c<g01.c> cVar2 = aVar.f57041b;
        if ((i14 & 4) != 0) {
            xVar = aVar.f57042c;
        }
        x xVar2 = aVar.f57043d;
        aVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        return new a(cVar, cVar2, xVar, xVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f57040a, aVar.f57040a) && s.g(this.f57041b, aVar.f57041b) && s.g(this.f57042c, aVar.f57042c) && s.g(this.f57043d, aVar.f57043d);
    }

    public final int hashCode() {
        int iA = l2.a(this.f57041b, this.f57040a.hashCode() * 31, 31);
        x xVar = this.f57042c;
        int iHashCode = (iA + (xVar == null ? 0 : xVar.hashCode())) * 31;
        x xVar2 = this.f57043d;
        return iHashCode + (xVar2 != null ? xVar2.hashCode() : 0);
    }

    public final String toString() {
        return "CreateFoodData(food=" + this.f57040a + ", units=" + this.f57041b + ", photo=" + this.f57042c + ", originalPhoto=" + this.f57043d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(c cVar, i53.c cVar2, x xVar, x xVar2, int i14, j jVar) {
        xVar = (i14 & 4) != 0 ? null : xVar;
        this(cVar, cVar2, xVar, (i14 & 8) != 0 ? xVar : xVar2);
    }
}
