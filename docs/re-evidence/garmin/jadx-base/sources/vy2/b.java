package vy2;

import p005kotlin.Metadata;
import tn2.s0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvy2/b;", "", "DataType", "Lxy2/k;", "Luy2/c;", "Lvy2/i;", "Lcom/garmin/uisynthesizer/synthesize/execution/ExecutionInterceptor;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<DataType> implements xy2.k<uy2.c, i> {
    @Override // xy2.k
    public final uy2.c a(xy2.d<uy2.c, i> dVar) {
        i iVar = dVar.f192723b;
        return d(iVar) ? new uy2.c.a(c(iVar, new s0(this, 19, iVar, dVar))) : dVar.a();
    }

    public abstract void b(DataType datatype, uy2.c cVar);

    public abstract Object c(i iVar, s0 s0Var);

    public abstract boolean d(i iVar);
}
