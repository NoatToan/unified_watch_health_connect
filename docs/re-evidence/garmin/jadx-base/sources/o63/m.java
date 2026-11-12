package o63;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo63/m;", "Ll63/a;", "Lo63/a;", "lexer", "Ln63/b;", "json", "<init>", "(Lo63/a;Ln63/b;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends l63.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f129869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p63.e f129870c;

    public m(a aVar, n63.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f129869b = aVar;
        this.f129870c = bVar.f123894b;
    }

    @Override // l63.e, l63.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public final p63.e getF129870c() {
        return this.f129870c;
    }

    @Override // l63.c
    public final int e(k63.e eVar) {
        eVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // l63.a, l63.e
    public final byte m() {
        o13.v vVarA;
        a aVar = this.f129869b;
        String strJ = aVar.j();
        try {
            strJ.getClass();
            o13.x xVarU = zf.b.U(strJ);
            if (xVarU != null) {
                int i14 = xVarU.f128614a;
                vVarA = Integer.compareUnsigned(i14, 255) > 0 ? null : o13.v.a((byte) i14);
            }
            if (vVarA != null) {
                return vVarA.f128609a;
            }
            d53.t.h(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.m(aVar, o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'UByte' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // l63.a, l63.e
    public final long o() {
        a aVar = this.f129869b;
        String strJ = aVar.j();
        try {
            strJ.getClass();
            o13.z zVarV = zf.b.V(strJ);
            if (zVarV != null) {
                return zVarV.f128619a;
            }
            d53.t.h(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.m(aVar, o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'ULong' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // l63.a, l63.e
    public final short p() {
        o13.c0 c0VarA;
        a aVar = this.f129869b;
        String strJ = aVar.j();
        try {
            strJ.getClass();
            o13.x xVarU = zf.b.U(strJ);
            if (xVarU != null) {
                int i14 = xVarU.f128614a;
                c0VarA = Integer.compareUnsigned(i14, 65535) > 0 ? null : o13.c0.a((short) i14);
            }
            if (c0VarA != null) {
                return c0VarA.f128568a;
            }
            d53.t.h(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.m(aVar, o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'UShort' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // l63.a, l63.e
    public final int u() {
        a aVar = this.f129869b;
        String strJ = aVar.j();
        try {
            strJ.getClass();
            o13.x xVarU = zf.b.U(strJ);
            if (xVarU != null) {
                return xVarU.f128614a;
            }
            d53.t.h(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.m(aVar, o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'UInt' for input '", strJ), 0, null, 6);
            throw null;
        }
    }
}
