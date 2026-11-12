package ds;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qr.t f61064b;

    public /* synthetic */ y(qr.t tVar, int i14) {
        this.f61063a = i14;
        this.f61064b = tVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f61063a;
        qr.t tVar = this.f61064b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                z.a(tVar, (p3.m) obj, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                hs.g.b(tVar, (p3.m) obj, p0.t(1));
                break;
            case 2:
                int i15 = qr.t.A2;
                tVar.a6((Integer) obj, (Integer) obj2);
                break;
            case 3:
                int i16 = qr.t.A2;
                tVar.a6((Integer) obj, (Integer) obj2);
                break;
            default:
                ((Integer) obj2).getClass();
                ur.b.a(tVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(qr.t tVar, int i14, int i15) {
        this.f61063a = i15;
        this.f61064b = tVar;
    }
}
