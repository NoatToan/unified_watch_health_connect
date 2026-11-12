package vh;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 {
    public static final <D extends n0.a> f<D> a(n0<D> n0Var, zh.f fVar, z zVar) throws Throwable {
        f<D> fVarB;
        n0Var.getClass();
        zVar.getClass();
        e0.b bVarA = f0.a(n0Var, zVar);
        yh.a aVar = yh.a.f197243a;
        z.a aVar2 = new z.a();
        aVar2.f178401a.putAll(zVar.f178400d);
        b.a aVarA = zVar.f178398b.a();
        aVarA.f178261a = bVarA;
        aVar2.f178402b = aVarA.a();
        z zVarA = aVar2.a();
        aVar.getClass();
        Throwable th3 = null;
        try {
            fVar.y();
            n0.a aVar3 = null;
            List<d0> listA = null;
            Map<String, ? extends Object> map = null;
            while (fVar.hasNext()) {
                String strNextName = fVar.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1809421292) {
                    if (iHashCode != -1294635157) {
                        if (iHashCode == 3076010 && strNextName.equals("data")) {
                            l0 l0VarA = n0Var.a();
                            c.g gVar = c.f178266a;
                            aVar3 = (n0.a) new k0(l0VarA).b(fVar, zVarA);
                        } else {
                            fVar.skipValue();
                        }
                    } else if (strNextName.equals("errors")) {
                        yh.a.f197243a.getClass();
                        listA = yh.a.a(fVar);
                    } else {
                        fVar.skipValue();
                    }
                } else if (strNextName.equals("extensions")) {
                    Object objA = zh.a.a(fVar);
                    map = objA instanceof Map ? (Map) objA : null;
                } else {
                    fVar.skipValue();
                }
            }
            fVar.A();
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            f.a aVar4 = new f.a(n0Var, uuidRandomUUID, aVar3);
            aVar4.f178318e = listA;
            aVar4.f178319f = map;
            fVarB = aVar4.b();
        } catch (Throwable th4) {
            th3 = th4;
            fVarB = null;
        }
        try {
            fVar.close();
        } catch (Throwable th5) {
            if (th3 == null) {
                th3 = th5;
            } else {
                o13.g.a(th3, th5);
            }
        }
        if (th3 != null) {
            throw th3;
        }
        fVarB.getClass();
        return fVarB;
    }
}
