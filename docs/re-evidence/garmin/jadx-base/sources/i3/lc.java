package i3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g6.c f88894b;

    public /* synthetic */ lc(g6.c cVar, int i14) {
        this.f88893a = i14;
        this.f88894b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        float fS0;
        int i14 = this.f88893a;
        g6.c cVar = this.f88894b;
        switch (i14) {
            case 0:
                mc.a aVar = mc.f88991h;
                f0.f88041a.getClass();
                fS0 = cVar.s0(f0.f88044d);
                break;
            case 1:
                mc.a aVar2 = mc.f88991h;
                f0.f88041a.getClass();
                fS0 = cVar.s0(f0.f88045e);
                break;
            case 2:
                cf.a aVar3 = cf.f87780c;
                fS0 = cVar.s0(af.f87490a);
                break;
            default:
                g6.f.a aVar4 = g6.f.f75994b;
                fS0 = cVar.s0(125);
                break;
        }
        return Float.valueOf(fS0);
    }
}
