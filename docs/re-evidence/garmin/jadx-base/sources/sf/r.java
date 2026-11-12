package sf;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import w63.a0;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lsf/r;", "Lsf/q;", "source", "Lw63/g;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w63.g f158820a;

    private /* synthetic */ r(w63.g gVar) {
        this.f158820a = gVar;
    }

    public static final /* synthetic */ r a(w63.g gVar) {
        return new r(gVar);
    }

    @Override // sf.q
    public final Unit D1(w63.e eVar) {
        this.f158820a.V3(eVar);
        return Unit.INSTANCE;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f158820a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return s.g(this.f158820a, ((r) obj).f158820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f158820a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f158820a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // sf.q
    public final Unit z2(w63.l lVar, y yVar) throws Throwable {
        Throwable th3;
        w63.g gVar = this.f158820a;
        a0 a0VarC = w5.r.c(lVar.v(yVar, false));
        try {
            new Long(gVar.V3(a0VarC));
            try {
                a0VarC.close();
                th3 = null;
            } catch (Throwable th4) {
                th3 = th4;
            }
        } catch (Throwable th5) {
            try {
                a0VarC.close();
            } catch (Throwable th6) {
                o13.g.a(th5, th6);
            }
            th3 = th5;
        }
        if (th3 == null) {
            return Unit.INSTANCE;
        }
        throw th3;
    }
}
