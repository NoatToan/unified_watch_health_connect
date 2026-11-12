package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f65657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f65658c;

    public /* synthetic */ i1(m4.q qVar, e23.l lVar, int i14) {
        this.f65656a = i14;
        this.f65657b = qVar;
        this.f65658c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f65656a) {
            case 0:
                pt1.i iVar = (pt1.i) obj;
                iVar.getClass();
                this.f65657b.y(true);
                this.f65658c.invoke(iVar);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                this.f65657b.y(false);
                this.f65658c.invoke(str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                this.f65657b.y(true);
                this.f65658c.invoke(str2);
                break;
            default:
                Float f14 = (Float) obj;
                f14.getClass();
                this.f65657b.y(false);
                this.f65658c.invoke(f14);
                break;
        }
        return Unit.INSTANCE;
    }
}
