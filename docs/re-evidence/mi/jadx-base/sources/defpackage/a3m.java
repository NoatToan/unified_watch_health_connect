package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a3m extends o82<u2m, Path> {
    public final u2m i;
    public final Path j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<c3m> f580k;

    public a3m(List<e1e<u2m>> list) {
        super(list);
        this.i = new u2m();
        this.j = new Path();
    }

    @Override // defpackage.o82
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path i(e1e<u2m> e1eVar, float f) {
        this.i.c(e1eVar.f16153b, e1eVar.c, f);
        u2m u2mVarG = this.i;
        List<c3m> list = this.f580k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                u2mVarG = this.f580k.get(size).g(u2mVarG);
            }
        }
        d5g.h(u2mVarG, this.j);
        return this.j;
    }

    public void q(List<c3m> list) {
        this.f580k = list;
    }
}
