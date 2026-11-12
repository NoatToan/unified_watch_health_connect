package ot1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.a f133788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.u f133789c;

    public /* synthetic */ f(qt1.a aVar, b.u uVar, int i14) {
        this.f133787a = i14;
        this.f133788b = aVar;
        this.f133789c = uVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f133787a;
        b.u uVar = this.f133789c;
        qt1.a aVar = this.f133788b;
        us1.n nVar = (us1.n) obj;
        switch (i14) {
            case 0:
                g gVar = g.f133790a;
                nVar.getClass();
                aVar.f147505r.a(nVar);
                aVar.H4();
                uVar.d();
                break;
            default:
                m mVar = m.f133805a;
                nVar.getClass();
                vs1.t tVar = aVar.f147506t;
                tVar.getClass();
                tVar.f179897f.b(nVar);
                tVar.b();
                uVar.d();
                break;
        }
        return Unit.INSTANCE;
    }
}
