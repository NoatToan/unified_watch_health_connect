package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class ulh extends e1e<PointF> {
    public Path q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1e<PointF> f35910r;

    public ulh(lse lseVar, e1e<PointF> e1eVar) {
        super(lseVar, e1eVar.f16153b, e1eVar.c, e1eVar.d, e1eVar.e, e1eVar.f, e1eVar.g, e1eVar.h);
        this.f35910r = e1eVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t;
        T t2;
        T t3 = this.c;
        boolean z = (t3 == 0 || (t2 = this.f16153b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.f16153b;
        if (t4 == 0 || (t = this.c) == 0 || z) {
            return;
        }
        e1e<PointF> e1eVar = this.f35910r;
        this.q = emq.d((PointF) t4, (PointF) t, e1eVar.o, e1eVar.p);
    }

    public Path k() {
        return this.q;
    }
}
