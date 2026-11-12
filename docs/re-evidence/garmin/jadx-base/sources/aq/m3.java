package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12062d;

    public /* synthetic */ m3(int i14, nr.q0 q0Var, int i15) {
        this.f12059a = 2;
        this.f12060b = i14;
        this.f12062d = q0Var;
        this.f12061c = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12059a;
        int i15 = this.f12061c;
        int i16 = this.f12060b;
        Object obj3 = this.f12062d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int i17 = o3.f12139h;
                ((o3) obj3).j(i16, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ew1.q1.a aVar = ew1.q1.f66677f;
                ((ew1.q1) obj3).F6(i16, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vr.g.b(i16, (nr.q0) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ww.f.a aVar2 = ww.f.f187506i;
                ((ww.f) obj3).h(i16, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m3(Object obj, int i14, int i15, int i16) {
        this.f12059a = i16;
        this.f12062d = obj;
        this.f12060b = i14;
        this.f12061c = i15;
    }
}
