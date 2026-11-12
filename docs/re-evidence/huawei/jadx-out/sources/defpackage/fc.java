package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes21.dex */
public class fc extends jb<PointF> {
    private Path i;
    private final jb<PointF> k;

    public fc(cx cxVar, jb<PointF> jbVar) {
        super(cxVar, jbVar.j, jbVar.f38328b, jbVar.d, jbVar.g, jbVar.f, jbVar.h, jbVar.f38327a);
        this.k = jbVar;
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        boolean z = (this.f38328b == 0 || this.j == 0 || !((PointF) this.j).equals(((PointF) this.f38328b).x, ((PointF) this.f38328b).y)) ? false : true;
        if (this.j == 0 || this.f38328b == 0 || z) {
            return;
        }
        this.i = je.b((PointF) this.j, (PointF) this.f38328b, this.k.f38329c, this.k.e);
    }

    Path e() {
        return this.i;
    }
}
