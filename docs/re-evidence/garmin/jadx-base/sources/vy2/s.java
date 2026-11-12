package vy2;

import p005kotlin.Metadata;
import uy2.c1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy2/s;", "Lxy2/k;", "Luy2/c;", "Lvy2/i;", "Lcom/garmin/uisynthesizer/synthesize/execution/ExecutionInterceptor;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements xy2.k<uy2.c, i> {
    @Override // xy2.k
    public final uy2.c a(xy2.d<uy2.c, i> dVar) throws InterruptedException {
        c1 c1Var = (c1) dVar.f192723b.f180851c.getAnnotation(c1.class);
        if (c1Var != null) {
            Thread.sleep(c1Var.delay());
        }
        return dVar.a();
    }
}
