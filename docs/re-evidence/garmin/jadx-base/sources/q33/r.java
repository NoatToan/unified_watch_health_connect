package q33;

import ch.qos.logback.core.CoreConstants;
import n43.m0;
import org.apache.commons.io.IOUtils;
import t23.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements n43.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g43.c f142522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g43.c f142523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f142524d;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(x xVar, s33.m mVar, u33.d dVar, l43.y<u33.c> yVar, boolean z14, n43.u uVar) {
        g43.c cVarD;
        xVar.getClass();
        mVar.getClass();
        dVar.getClass();
        uVar.getClass();
        g43.c cVarB = g43.c.b(xVar.d());
        r33.a aVarA = xVar.a();
        String str = aVarA.f150095a != r33.a.EnumC2820a.MULTIFILE_CLASS_PART ? null : aVarA.f150100f;
        if (str != null) {
            cVarD = str.length() > 0 ? g43.c.d(str) : null;
        } else {
            cVarD = null;
        }
        this(cVarB, cVarD, null, mVar, dVar, yVar, new m0(z14, null, 2, null), uVar, xVar);
    }

    @Override // t23.y0
    public final z0.a a() {
        z0.a aVar = z0.f162077a;
        aVar.getClass();
        return aVar;
    }

    @Override // n43.v
    public final String b() {
        return androidx.room.a0.m(new StringBuilder("Class '"), d().a().f188596a.f188600a, CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public final x33.b d() {
        x33.c cVar;
        g43.c cVar2 = this.f142522b;
        String str = cVar2.f75851a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = x33.c.f188595d;
            if (cVar == null) {
                g43.c.a(9);
                throw null;
            }
        } else {
            cVar = new x33.c(str.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, '.'));
        }
        String strE = cVar2.e();
        strE.getClass();
        return new x33.b(cVar, x33.f.e(d53.w.d0(IOUtils.DIR_SEPARATOR_UNIX, strE, strE)));
    }

    public final String toString() {
        return r.class.getSimpleName() + ": " + this.f142522b;
    }

    public r(g43.c cVar, g43.c cVar2, g43.c cVar3, s33.m mVar, u33.d dVar, l43.y<u33.c> yVar, m0 m0Var, n43.u uVar, x xVar) {
        cVar.getClass();
        mVar.getClass();
        dVar.getClass();
        m0Var.getClass();
        uVar.getClass();
        this.f142522b = cVar;
        this.f142523c = cVar2;
        this.f142524d = xVar;
        z33.g.f<s33.m, Integer> fVar = v33.a.f175432k;
        fVar.getClass();
        Integer num = (Integer) u33.f.a(mVar, fVar);
        if (num != null) {
            dVar.getString(num.intValue());
        }
    }
}
