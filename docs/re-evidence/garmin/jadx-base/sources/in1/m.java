package in1;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f94533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f94534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94535d;

    public /* synthetic */ m(t2 t2Var, int i14, int i15, int i16) {
        this.f94532a = i16;
        this.f94533b = t2Var;
        this.f94534c = i14;
        this.f94535d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f94532a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                s.a(this.f94533b, this.f94534c, mVar, p0.t(this.f94535d | 1));
                break;
            case 1:
                s.h(this.f94533b, this.f94534c, mVar, p0.t(this.f94535d | 1));
                break;
            case 2:
                s.k(this.f94533b, this.f94534c, mVar, p0.t(this.f94535d | 1));
                break;
            case 3:
                s.i(this.f94533b, this.f94534c, mVar, p0.t(this.f94535d | 1));
                break;
            case 4:
                s.p(this.f94533b, this.f94534c, mVar, p0.t(this.f94535d | 1));
                break;
            case 5:
                s.d(this.f94533b, this.f94534c, mVar, p0.t(this.f94535d | 1));
                break;
            default:
                s.j(this.f94533b, this.f94534c, mVar, p0.t(this.f94535d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
