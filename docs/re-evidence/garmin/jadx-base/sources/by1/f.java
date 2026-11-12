package by1;

import android.content.Context;
import androidx.lifecycle.v1;
import lc.m0;
import o53.s0;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f22181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f22182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3 f22183e;

    public /* synthetic */ f(ey1.a aVar, m0 m0Var, Context context, p1 p1Var) {
        this.f22179a = 1;
        this.f22180b = aVar;
        this.f22181c = m0Var;
        this.f22182d = context;
        this.f22183e = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f22179a;
        x3 x3Var = this.f22183e;
        m0 m0Var = this.f22181c;
        Context context = this.f22182d;
        ey1.a aVar = this.f22180b;
        switch (i14) {
            case 0:
                g gVar = g.f22184a;
                aVar.I4(context);
                mx1.f fVar = ((dy1.p) x3Var.getF182175a()).f61598d;
                if (fVar == null || !fVar.c()) {
                    lc.y.k(z.f22228a.c(), m0Var);
                } else {
                    lc.y.k(cy1.b.f56796a.c(), m0Var);
                }
                break;
            case 1:
                r rVar = r.f22207a;
                aVar.P4(Boolean.TRUE);
                aVar.H4();
                if (((dy1.p) x3Var.getF182175a()).f61596b == mx1.c.FULL_GYM) {
                    lc.y.k(g.f22184a.c(), m0Var);
                } else {
                    aVar.I4(context);
                    mx1.f fVar2 = ((dy1.p) x3Var.getF182175a()).f61598d;
                    if (fVar2 == null || !fVar2.c()) {
                        lc.y.k(z.f22228a.c(), m0Var);
                    } else {
                        lc.y.k(cy1.b.f56796a.c(), m0Var);
                    }
                }
                break;
            case 2:
                r rVar2 = r.f22207a;
                ey1.a aVar2 = this.f22180b;
                Context context2 = this.f22182d;
                f fVar3 = new f(aVar2, context2, this.f22181c, this.f22183e, 3);
                context2.getClass();
                w9.a aVarA = v1.a(aVar2);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new ey1.f(aVar2, context2, fVar3, null), 2);
                break;
            default:
                r rVar3 = r.f22207a;
                aVar.P4(Boolean.FALSE);
                aVar.I4(context);
                mx1.f fVar4 = ((dy1.p) x3Var.getF182175a()).f61598d;
                if (fVar4 == null || !fVar4.c()) {
                    lc.y.k(z.f22228a.c(), m0Var);
                } else {
                    lc.y.k(cy1.b.f56796a.c(), m0Var);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(ey1.a aVar, Context context, m0 m0Var, x3 x3Var, int i14) {
        this.f22179a = i14;
        this.f22180b = aVar;
        this.f22182d = context;
        this.f22181c = m0Var;
        this.f22183e = x3Var;
    }
}
