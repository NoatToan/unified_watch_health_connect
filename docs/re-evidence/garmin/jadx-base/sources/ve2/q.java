package ve2;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lve2/q;", "", "Lve2/p;", "itConfig", "diConfig", "Lve2/o;", "gcConfig", "<init>", "(Lve2/p;Lve2/p;Lve2/o;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f177843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f177844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f177845c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177846a;

        static {
            int[] iArr = new int[sc2.a.values().length];
            try {
                iArr[sc2.a.f158478d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc2.a.f158477c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sc2.a.f158476b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f177846a = iArr;
        }
    }

    public /* synthetic */ q(p pVar, p pVar2, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : pVar, (i14 & 2) != 0 ? null : pVar2, (i14 & 4) != 0 ? null : oVar);
    }

    public final boolean a(sc2.a aVar) {
        aVar.getClass();
        int i14 = a.f177846a[aVar.ordinal()];
        if (i14 == 1) {
            return this.f177843a != null;
        }
        if (i14 == 2) {
            return this.f177844b != null;
        }
        if (i14 == 3) {
            return this.f177845c != null;
        }
        u0.r();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f177843a, qVar.f177843a) && p005kotlin.jvm.internal.s.g(this.f177844b, qVar.f177844b) && p005kotlin.jvm.internal.s.g(this.f177845c, qVar.f177845c);
    }

    public final int hashCode() {
        p pVar = this.f177843a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        p pVar2 = this.f177844b;
        int iHashCode2 = (iHashCode + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        o oVar = this.f177845c;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "\n   itConfig=" + this.f177843a + "\n   diConfig=" + this.f177844b + "\n   gcConfig=" + this.f177845c;
    }

    public q(p pVar, p pVar2, o oVar) {
        this.f177843a = pVar;
        this.f177844b = pVar2;
        this.f177845c = oVar;
    }

    public q() {
        this(null, null, null, 7, null);
    }
}
