package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h3b extends f1e<f3b> {
    public final f3b i;

    public h3b(List<e1e<f3b>> list) {
        super(list);
        f3b f3bVar = list.get(0).f16153b;
        int iE = f3bVar != null ? f3bVar.e() : 0;
        this.i = new f3b(new float[iE], new int[iE]);
    }

    @Override // defpackage.o82
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f3b i(e1e<f3b> e1eVar, float f) {
        this.i.f(e1eVar.f16153b, e1eVar.c, f);
        return this.i;
    }
}
