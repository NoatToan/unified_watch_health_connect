package fs;

import ak0.p;
import e2.f0;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p13.h0;
import ta0.h1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f73400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f73401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f73402d;

    public /* synthetic */ i(List list, l lVar, e23.a aVar, int i14) {
        this.f73399a = i14;
        this.f73400b = list;
        this.f73401c = lVar;
        this.f73402d = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f73399a) {
            case 0:
                f0Var.getClass();
                ArrayList arrayListQ = h0.Q(this.f73400b, 4);
                f0Var.a(arrayListQ.size(), null, new j.c(j.b.f73404a, arrayListQ), new z3.e(802480018, true, new j.d(arrayListQ, this.f73401c, this.f73402d)));
                break;
            default:
                f0Var.getClass();
                t52.c cVar = new t52.c(13);
                h1.d dVar = h1.d.f163354a;
                List list = this.f73400b;
                f0Var.a(list.size(), new h1.e(cVar, list), new h1.f(dVar, list), new z3.e(802480018, true, new h1.g(list, this.f73401c)));
                f0.b(f0Var, null, new z3.e(1177459130, true, new p(this.f73402d, 21)), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
