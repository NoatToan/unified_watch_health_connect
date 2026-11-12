package in1;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f94540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f94541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94542d;

    public /* synthetic */ o(t2 t2Var, String str, int i14, int i15) {
        this.f94539a = i15;
        this.f94540b = t2Var;
        this.f94541c = str;
        this.f94542d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f94539a) {
            case 0:
                num.getClass();
                s.e(this.f94540b, this.f94541c, mVar, p0.t(this.f94542d | 1));
                break;
            default:
                num.intValue();
                wr1.g.b(this.f94540b, this.f94541c, mVar, p0.t(this.f94542d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
