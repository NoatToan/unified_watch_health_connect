package vy2;

import java.util.List;
import p005kotlin.Metadata;
import uy2.w0;
import vv0.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy2/r;", "Lxy2/k;", "Luy2/c;", "Lvy2/i;", "Lcom/garmin/uisynthesizer/synthesize/execution/ExecutionInterceptor;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements xy2.k<uy2.c, i> {
    @Override // xy2.k
    public final uy2.c a(xy2.d<uy2.c, i> dVar) {
        i iVar = dVar.f192723b;
        uy2.i iVar2 = (uy2.i) iVar.f180851c.getAnnotation(uy2.i.class);
        if (iVar2 != null) {
            List<w0> list = iVar.f180850b;
            uy2.c.a aVar = new uy2.c.a((e23.a<? extends Object>) new u(19));
            String strDescription = iVar2.description();
            strDescription.getClass();
            if (strDescription.length() <= 0) {
                strDescription = null;
            }
            if (strDescription == null) {
                strDescription = "Empty";
            }
            list.add(new w0(aVar, strDescription));
        }
        Class<?> returnType = iVar.f180851c.getReturnType();
        if (p005kotlin.jvm.internal.s.g(returnType, q03.r.class)) {
            return new uy2.c.a((e23.a<? extends Object>) new a(dVar, 3));
        }
        if (p005kotlin.jvm.internal.s.g(returnType, q03.b.class)) {
            return new uy2.c.a((e23.a<? extends Object>) new a(dVar, 4));
        }
        return p005kotlin.jvm.internal.s.g(returnType, q03.i.class) ? new uy2.c.a((e23.a<? extends Object>) new a(dVar, 5)) : dVar.a();
    }
}
