package gv0;

import i3.mc;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements s5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79260d;

    public /* synthetic */ e0(Object obj, int i14, Object obj2, Object obj3) {
        this.f79257a = i14;
        this.f79258b = obj;
        this.f79259c = obj2;
        this.f79260d = obj3;
    }

    @Override // s5.n
    public final void a(s5.m mVar) {
        switch (this.f79257a) {
            case 0:
                e23.p pVar = (e23.p) this.f79258b;
                pu0.b bVar = (pu0.b) this.f79259c;
                y yVar = (y) this.f79260d;
                mVar.getClass();
                pVar.invoke(bVar, yVar);
                break;
            default:
                o53.b0 b0Var = (o53.b0) this.f79258b;
                e23.a aVar = (e23.a) this.f79259c;
                mc mcVar = (mc) this.f79260d;
                mVar.getClass();
                ge1.b.T(b0Var, null, null, new vz1.l.a(aVar, mcVar, null), 3);
                break;
        }
    }
}
