package r11;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import ca0.o0;
import e23.p;
import h4.r;
import i3.c5;
import i3.fe;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149374a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f149375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f149376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f149377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f149378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f149379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o13.h f149380g;

    public /* synthetic */ g(long j8, k2.h hVar, s11.d dVar, c5 c5Var, e23.l lVar, e23.l lVar2) {
        this.f149375b = j8;
        this.f149377d = hVar;
        this.f149378e = dVar;
        this.f149379f = c5Var;
        this.f149376c = lVar;
        this.f149380g = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f149374a;
        o13.h hVar = this.f149380g;
        Object obj3 = this.f149379f;
        Object obj4 = this.f149378e;
        Object obj5 = this.f149377d;
        switch (i14) {
            case 0:
                k2.h hVar2 = (k2.h) obj5;
                s11.d dVar = (s11.d) obj4;
                c5 c5Var = (c5) obj3;
                e23.l lVar = (e23.l) hVar;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    float f14 = ((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a)).screenHeightDp;
                    g6.f.a aVar = g6.f.f75994b;
                    r.a aVar2 = r.S;
                    long j8 = this.f149375b;
                    r rVarB = l4.k.b(u1.n.e(aVar2, j8, hVar2), hVar2);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97920e;
                    r rVarJ = x2.j(c2.l.z(rVarB, f15, f15), 0.0f, f14, 1);
                    h4.d.f81522a.getClass();
                    vx.c.e(x2.x(rVarJ, h4.d.a.f81535m, 2), dVar.f155887i, c5Var, j8, this.f149376c, lVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                r31.f.c((i53.c) obj5, this.f149375b, (d31.c) obj4, (fe) obj3, (p) hVar, this.f149376c, (p3.m) obj, p0.t(221185));
                break;
            default:
                ((Integer) obj2).getClass();
                ya0.p.a(this.f149375b, (l90.b) obj5, (e23.a) obj4, (ya0.a) obj3, (o0) hVar, this.f149376c, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(long j8, l90.b bVar, e23.a aVar, ya0.a aVar2, o0 o0Var, e23.l lVar, int i14) {
        this.f149375b = j8;
        this.f149377d = bVar;
        this.f149378e = aVar;
        this.f149379f = aVar2;
        this.f149380g = o0Var;
        this.f149376c = lVar;
    }

    public /* synthetic */ g(i53.c cVar, long j8, d31.c cVar2, fe feVar, p pVar, e23.l lVar, int i14) {
        this.f149377d = cVar;
        this.f149375b = j8;
        this.f149378e = cVar2;
        this.f149379f = feVar;
        this.f149380g = pVar;
        this.f149376c = lVar;
    }
}
