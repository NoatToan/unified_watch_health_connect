package y2;

import p005kotlin.Metadata;
import s5.x0;
import s5.y0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly2/d;", "", "Lg6/o;", "layoutDirection", "Ls5/x0;", "inputTextStyle", "Lg6/c;", "density", "Lw5/q$b;", "fontFamilyResolver", "<init>", "(Lg6/o;Ls5/x0;Lg6/c;Lw5/q$b;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f194048h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static d f194049i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6.o f194050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f194051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6.c f194052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5.q.b f194053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f194054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f194055f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f194056g = Float.NaN;

    public d(g6.o oVar, x0 x0Var, g6.c cVar, w5.q.b bVar) {
        this.f194050a = oVar;
        this.f194051b = x0Var;
        this.f194052c = cVar;
        this.f194053d = bVar;
        this.f194054e = y0.a(x0Var, oVar);
    }

    public final long a(int i14, long j8) {
        int iK;
        float f14 = this.f194056g;
        float f15 = this.f194055f;
        if (Float.isNaN(f14) || Float.isNaN(f15)) {
            String str = e.f194057a;
            long jB = g6.b.b(0, 0, 15);
            d6.p.f57793b.getClass();
            int i15 = d6.p.f57794c;
            float height = s5.v.a(str, this.f194054e, jB, this.f194052c, this.f194053d, null, 1, i15, 96).getHeight();
            float height2 = s5.v.a(e.f194058b, this.f194054e, g6.b.b(0, 0, 15), this.f194052c, this.f194053d, null, 2, i15, 96).getHeight() - height;
            this.f194056g = height;
            this.f194055f = height2;
            f15 = height2;
            f14 = height;
        }
        if (i14 != 1) {
            int iRound = Math.round((f15 * (i14 - 1)) + f14);
            iK = iRound >= 0 ? iRound : 0;
            int i16 = g6.a.i(j8);
            if (iK > i16) {
                iK = i16;
            }
        } else {
            iK = g6.a.k(j8);
        }
        return g6.b.a(g6.a.l(j8), g6.a.j(j8), iK, g6.a.i(j8));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly2/d$a;", "", "<init>", "()V", "Ly2/d;", "last", "Ly2/d;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(d dVar, g6.o oVar, x0 x0Var, g6.c cVar, w5.q.b bVar) {
            if (dVar != null && oVar == dVar.f194050a && y0.a(x0Var, oVar).equals(dVar.f194051b) && cVar.getF69050b() == dVar.f194052c.getF69050b() && bVar == dVar.f194053d) {
                return dVar;
            }
            d dVar2 = d.f194049i;
            if (dVar2 != null && oVar == dVar2.f194050a && y0.a(x0Var, oVar).equals(dVar2.f194051b) && cVar.getF69050b() == dVar2.f194052c.getF69050b() && bVar == dVar2.f194053d) {
                return dVar2;
            }
            d dVar3 = new d(oVar, y0.a(x0Var, oVar), new g6.d(cVar.getF69050b(), cVar.getF69051c()), bVar);
            d.f194049i = dVar3;
            return dVar3;
        }

        private a() {
        }
    }
}
