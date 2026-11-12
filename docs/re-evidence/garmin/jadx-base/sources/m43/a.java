package m43;

import java.util.List;
import org.apache.commons.io.IOUtils;
import s33.c;
import s33.h;
import s33.j;
import s33.m;
import s33.o;
import s33.s;
import s33.u;
import s33.w;
import x33.d;
import z33.e;
import z33.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends k43.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f116638q = new a();

    private a() {
        e eVar = new e();
        t33.b.a(eVar);
        g.f<m, Integer> fVar = t33.b.f162238a;
        fVar.getClass();
        g.f<s33.e, List<s33.b>> fVar2 = t33.b.f162240c;
        fVar2.getClass();
        g.f<c, List<s33.b>> fVar3 = t33.b.f162239b;
        fVar3.getClass();
        g.f<j, List<s33.b>> fVar4 = t33.b.f162241d;
        fVar4.getClass();
        g.f<o, List<s33.b>> fVar5 = t33.b.f162242e;
        fVar5.getClass();
        g.f<o, List<s33.b>> fVar6 = t33.b.f162243f;
        fVar6.getClass();
        g.f<o, List<s33.b>> fVar7 = t33.b.f162244g;
        fVar7.getClass();
        g.f<h, List<s33.b>> fVar8 = t33.b.f162246i;
        fVar8.getClass();
        g.f<o, s33.b.C2953b.c> fVar9 = t33.b.f162245h;
        fVar9.getClass();
        g.f<w, List<s33.b>> fVar10 = t33.b.f162247j;
        fVar10.getClass();
        g.f<s, List<s33.b>> fVar11 = t33.b.f162248k;
        fVar11.getClass();
        g.f<u, List<s33.b>> fVar12 = t33.b.f162249l;
        fVar12.getClass();
        super(eVar, fVar, fVar2, fVar3, fVar4, null, fVar5, fVar6, fVar7, null, null, null, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    public static String a(x33.c cVar) {
        String strB;
        cVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        d dVar = cVar.f188596a;
        sb3.append(d53.u.w(dVar.f188600a, '.', IOUtils.DIR_SEPARATOR_UNIX));
        sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.g().b();
            strB.getClass();
        }
        sb3.append(strB.concat(".kotlin_builtins"));
        return sb3.toString();
    }
}
