package o53;

/* JADX INFO: loaded from: classes3.dex */
public final class y {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    public static final t13.g a(t13.g gVar, t13.g gVar2, boolean z14) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) gVar.fold(bool, new o01.e(13))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) gVar2.fold(bool, new o01.e(13))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return gVar.plus(gVar2);
        }
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        r0Var.f105810a = gVar2;
        t13.h hVar = t13.h.f161748a;
        t13.g gVar3 = (t13.g) gVar.fold(hVar, new hn1.c(r0Var, z14));
        if (zBooleanValue2) {
            r0Var.f105810a = ((t13.g) r0Var.f105810a).fold(hVar, new o01.e(14));
        }
        return gVar3.plus((t13.g) r0Var.f105810a);
    }

    public static final t13.g b(b0 b0Var, t13.g gVar) {
        t13.g gVarA = a(b0Var.getF136462d(), gVar, true);
        x53.c cVar = s0.f129406a;
        return (gVarA == cVar || gVarA.get(t13.e.f161746w0) != null) ? gVarA : gVarA.plus(cVar);
    }

    public static final l2<?> c(t13.d<?> dVar, t13.g gVar, Object obj) {
        l2<?> l2Var = null;
        if ((dVar instanceof v13.d) && gVar.get(m2.f129373a) != null) {
            v13.d callerFrame = (v13.d) dVar;
            while (!(callerFrame instanceof o0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof l2) {
                    l2Var = (l2) callerFrame;
                    break;
                }
            }
            if (l2Var != null) {
                l2Var.z0(gVar, obj);
            }
        }
        return l2Var;
    }
}
