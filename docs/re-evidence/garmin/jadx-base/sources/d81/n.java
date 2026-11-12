package d81;

import c22.c3;
import h2.j0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g81.c0 f58344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f58345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f58346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g6.c f58347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f58348f;

    public /* synthetic */ n(g81.c0 c0Var, o53.b0 b0Var, h2.b bVar, g6.c cVar, e23.l lVar, int i14) {
        this.f58343a = i14;
        this.f58344b = c0Var;
        this.f58345c = b0Var;
        this.f58346d = bVar;
        this.f58347e = cVar;
        this.f58348f = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        e2.f0 f0Var = (e2.f0) obj;
        switch (this.f58343a) {
            case 0:
                f0Var.getClass();
                int i14 = 0;
                for (c3 c3Var : this.f58344b.f76290d) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    e2.f0.b(f0Var, null, new z3.e(-830107500, true, new e(this.f58345c, this.f58346d, i14, c3Var, this.f58347e, this.f58348f, 1)), 3);
                    i14 = i15;
                }
                return Unit.INSTANCE;
            default:
                f0Var.getClass();
                int i16 = 0;
                for (c3 c3Var2 : this.f58344b.f76290d) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    e2.f0.b(f0Var, null, new z3.e(-1381501408, true, new e(this.f58345c, this.f58346d, i16, c3Var2, this.f58347e, this.f58348f, 2)), 3);
                    i16 = i17;
                }
                return Unit.INSTANCE;
        }
    }
}
