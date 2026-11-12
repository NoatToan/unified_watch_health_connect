package x33;

import d53.u;
import d53.w;
import org.apache.commons.io.IOUtils;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f188590d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f188591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f188592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188593c;

    public b(c cVar, c cVar2, boolean z14) {
        cVar.getClass();
        cVar2.getClass();
        this.f188591a = cVar;
        this.f188592b = cVar2;
        this.f188593c = z14;
        cVar2.f188596a.c();
    }

    public static final String c(c cVar) {
        String str = cVar.f188596a.f188600a;
        return w.A(str, IOUtils.DIR_SEPARATOR_UNIX) ? o2.c.c('`', "`", str) : str;
    }

    public final c a() {
        c cVar = this.f188591a;
        boolean zC = cVar.f188596a.c();
        c cVar2 = this.f188592b;
        if (zC) {
            return cVar2;
        }
        return new c(cVar.f188596a.f188600a + '.' + cVar2.f188596a.f188600a);
    }

    public final String b() {
        c cVar = this.f188591a;
        boolean zC = cVar.f188596a.c();
        c cVar2 = this.f188592b;
        if (zC) {
            return c(cVar2);
        }
        return u.w(cVar.f188596a.f188600a, '.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + c(cVar2);
    }

    public final b d(f fVar) {
        fVar.getClass();
        return new b(this.f188591a, this.f188592b.a(fVar), this.f188593c);
    }

    public final b e() {
        c cVarB = this.f188592b.b();
        if (cVarB.f188596a.c()) {
            return null;
        }
        return new b(this.f188591a, cVarB, this.f188593c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f188591a, bVar.f188591a) && s.g(this.f188592b, bVar.f188592b) && this.f188593c == bVar.f188593c;
    }

    public final f f() {
        return this.f188592b.f188596a.g();
    }

    public final boolean g() {
        return !this.f188592b.b().f188596a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188593c) + ((this.f188592b.hashCode() + (this.f188591a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f188591a.f188596a.c() ? "/".concat(b()) : b();
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(String str, boolean z14) {
            String strV;
            str.getClass();
            int iG = w.G('`', 0, 6, str);
            if (iG == -1) {
                iG = str.length();
            }
            int iL = w.L(iG, 4, str, "/");
            String str2 = "";
            if (iL == -1) {
                strV = u.v(str, "`", "", false);
            } else {
                String strReplace = str.substring(0, iL).replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
                strReplace.getClass();
                strV = u.v(str.substring(iL + 1), "`", "", false);
                str2 = strReplace;
            }
            return new b(new c(str2), new c(strV), z14);
        }

        public static b b(c cVar) {
            cVar.getClass();
            return new b(cVar.b(), cVar.f188596a.g());
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f fVar) {
        this(cVar, c.a.a(fVar), false);
        cVar.getClass();
        fVar.getClass();
        c.f188594c.getClass();
    }
}
