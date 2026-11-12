package vy2;

import o53.e1;
import p005kotlin.Metadata;
import uy2.p0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy2/p;", "Lxy2/k;", "Luy2/c;", "Lvy2/i;", "Lcom/garmin/uisynthesizer/synthesize/execution/ExecutionInterceptor;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements xy2.k<uy2.c, i> {
    @Override // xy2.k
    public final uy2.c a(xy2.d<uy2.c, i> dVar) {
        String[] strArrKeys;
        i iVar = dVar.f192723b;
        p0 p0Var = (p0) iVar.f180851c.getAnnotation(p0.class);
        if (p0Var != null && (strArrKeys = p0Var.keys()) != null) {
            for (String str : strArrKeys) {
                ge1.b.T(e1.f129333a, null, null, new o(iVar, str, null), 3);
            }
        }
        return dVar.a();
    }
}
