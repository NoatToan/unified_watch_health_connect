package ca0;

import b21.d7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x80.e f26477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26478c;

    public /* synthetic */ t1(int i14, lc.m0 m0Var, x80.e eVar) {
        this.f26476a = i14;
        this.f26477b = eVar;
        this.f26478c = m0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f26476a) {
            case 0:
                z80.h hVar = (z80.h) obj;
                hVar.getClass();
                x80.e eVar = this.f26477b;
                eVar.getClass();
                eVar.f189518v = hVar;
                z1 z1VarA4 = eVar.A4(b2.USER_PROFILE);
                lc.m0 m0Var = this.f26478c;
                m0Var.h(zf.b.G(m0Var), z1VarA4);
                break;
            default:
                q90.d dVar = (q90.d) obj;
                dVar.getClass();
                x80.e eVar2 = this.f26477b;
                eVar2.getClass();
                eVar2.f189519w = dVar;
                z1.l lVar = z1.l.INSTANCE;
                lc.m0 m0Var2 = this.f26478c;
                m0Var2.h(new d7(m0Var2, 15), lVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
