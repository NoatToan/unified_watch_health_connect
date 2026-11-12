package q33;

import ch.qos.logback.core.CoreConstants;
import lc.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f142442b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142443a;

    private a0(String str) {
        this.f142443a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && p005kotlin.jvm.internal.s.g(this.f142443a, ((a0) obj).f142443a);
    }

    public final int hashCode() {
        return this.f142443a.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("MemberSignature(signature="), this.f142443a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a0 a(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new a0(str + '#' + str2, null);
        }

        public static a0 b(w33.d dVar) {
            if (!(dVar instanceof w33.d.b)) {
                if (dVar instanceof w33.d.a) {
                    w33.d.a aVar = (w33.d.a) dVar;
                    return a(aVar.f181893a, aVar.f181894b);
                }
                u0.r();
                return null;
            }
            w33.d.b bVar = (w33.d.b) dVar;
            String str = bVar.f181895a;
            String str2 = bVar.f181896b;
            str.getClass();
            str2.getClass();
            return new a0(str.concat(str2), null);
        }

        public static a0 c(u33.d dVar, v33.a.c cVar) {
            dVar.getClass();
            cVar.getClass();
            return new a0(dVar.getString(cVar.f175449c).concat(dVar.getString(cVar.f175450d)), null);
        }

        public static a0 d(a0 a0Var, int i14) {
            return new a0(a0Var.f142443a + '@' + i14, null);
        }

        private a() {
        }
    }

    public /* synthetic */ a0(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
