package r02;

import o53.b0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148889a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f148890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f148891c;

    public /* synthetic */ k(b0 b0Var, m mVar) {
        this.f148891c = b0Var;
        this.f148890b = mVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f148889a) {
            case 0:
                ge1.b.T(this.f148891c, null, null, new i.c.a(this.f148890b, null), 3);
                break;
            default:
                m mVar = this.f148890b;
                if (mVar.h()) {
                    c5.b bVar = mVar.f148894b.f24464a;
                    c5.d dVar = bVar.f24447a;
                    c5.a[] aVarArr = dVar.f24455d;
                    p13.s.m(0, aVarArr.length, null, aVarArr);
                    dVar.f24456e = 0;
                    c5.d dVar2 = bVar.f24448b;
                    c5.a[] aVarArr2 = dVar2.f24455d;
                    p13.s.m(0, aVarArr2.length, null, aVarArr2);
                    dVar2.f24456e = 0;
                    bVar.f24449c = 0L;
                } else {
                    ge1.b.T(this.f148891c, null, null, new i.c.b(mVar, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(m mVar, b0 b0Var) {
        this.f148890b = mVar;
        this.f148891c = b0Var;
    }
}
