package x33;

import d53.u;
import org.apache.commons.io.IOUtils;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f188587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f188588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f188589c;

    static {
        new C3508a(null);
        f fVar = h.f188615g;
        c.f188594c.getClass();
        c.a.a(fVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c cVar, f fVar) {
        this(cVar, null, fVar, null, null);
        cVar.getClass();
        fVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f188587a, aVar.f188587a) && s.g(this.f188588b, aVar.f188588b) && s.g(this.f188589c, aVar.f188589c);
    }

    public final int hashCode() {
        int iHashCode = (this.f188587a.hashCode() + 527) * 31;
        c cVar = this.f188588b;
        return this.f188589c.hashCode() + ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(u.w(this.f188587a.f188596a.f188600a, '.', IOUtils.DIR_SEPARATOR_UNIX));
        sb3.append("/");
        c cVar = this.f188588b;
        if (cVar != null) {
            sb3.append(cVar);
            sb3.append(".");
        }
        sb3.append(this.f188589c);
        return sb3.toString();
    }

    /* JADX INFO: renamed from: x33.a$a, reason: collision with other inner class name */
    public static final class C3508a {
        public /* synthetic */ C3508a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3508a() {
        }
    }

    private a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f188587a = cVar;
        this.f188588b = cVar2;
        this.f188589c = fVar;
    }
}
