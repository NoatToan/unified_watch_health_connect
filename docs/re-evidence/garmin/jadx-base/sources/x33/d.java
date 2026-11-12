package x33;

import d53.u;
import d53.w;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f188598e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f188599f = f.g("<root>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f188601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d f188602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient f f188603d;

    static {
        Pattern.compile("\\.").getClass();
    }

    public d(String str, c cVar) {
        str.getClass();
        cVar.getClass();
        this.f188600a = str;
        this.f188601b = cVar;
    }

    public static final List<f> f(d dVar) {
        if (dVar.c()) {
            return new ArrayList();
        }
        List<f> listF = f(dVar.e());
        listF.add(dVar.g());
        return listF;
    }

    public final d a(f fVar) {
        String strB;
        fVar.getClass();
        if (c()) {
            strB = fVar.b();
        } else {
            strB = this.f188600a + '.' + fVar.b();
        }
        strB.getClass();
        return new d(strB, this, fVar);
    }

    public final void b() {
        String str = this.f188600a;
        int length = str.length() - 1;
        boolean z14 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z14) {
                break;
            }
            if (cCharAt == '`') {
                z14 = !z14;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.f188603d = f.d(str.substring(length + 1));
            this.f188602c = new d(str.substring(0, length));
        } else {
            this.f188603d = f.d(str);
            this.f188602c = c.f188595d.f188596a;
        }
    }

    public final boolean c() {
        return this.f188600a.length() == 0;
    }

    public final boolean d() {
        return this.f188601b != null || w.G('<', 0, 6, this.f188600a) < 0;
    }

    public final d e() {
        d dVar = this.f188602c;
        if (dVar != null) {
            return dVar;
        }
        if (c()) {
            vb.h.z("root");
            return null;
        }
        b();
        d dVar2 = this.f188602c;
        dVar2.getClass();
        return dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return s.g(this.f188600a, ((d) obj).f188600a);
        }
        return false;
    }

    public final f g() {
        f fVar = this.f188603d;
        if (fVar != null) {
            return fVar;
        }
        if (c()) {
            vb.h.z("root");
            return null;
        }
        b();
        f fVar2 = this.f188603d;
        fVar2.getClass();
        return fVar2;
    }

    public final boolean h(f fVar) {
        fVar.getClass();
        if (!c()) {
            String str = this.f188600a;
            int iG = w.G('.', 0, 6, str);
            if (iG == -1) {
                iG = str.length();
            }
            int i14 = iG;
            String strB = fVar.b();
            strB.getClass();
            if (i14 == strB.length() && u.t(this.f188600a, 0, strB, 0, i14, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f188600a.hashCode();
    }

    public final c i() {
        c cVar = this.f188601b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f188601b = cVar2;
        return cVar2;
    }

    public final String toString() {
        if (!c()) {
            return this.f188600a;
        }
        String strB = f188599f.b();
        strB.getClass();
        return strB;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, d dVar, f fVar, p005kotlin.jvm.internal.j jVar) {
        this(str, dVar, fVar);
    }

    public d(String str) {
        str.getClass();
        this.f188600a = str;
    }

    private d(String str, d dVar, f fVar) {
        this.f188600a = str;
        this.f188602c = dVar;
        this.f188603d = fVar;
    }
}
