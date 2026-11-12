package l71;

import e23.p;
import h4.r;
import i71.x;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f110847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f110848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110849d;

    public /* synthetic */ d(r rVar, x xVar, int i14) {
        this.f110846a = 2;
        this.f110847b = rVar;
        this.f110848c = xVar;
        this.f110849d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f110846a) {
            case 0:
                num.getClass();
                h.d(this.f110847b, this.f110848c, mVar, p0.t(1), this.f110849d);
                break;
            case 1:
                num.getClass();
                h.j(this.f110847b, this.f110848c, mVar, p0.t(1), this.f110849d);
                break;
            default:
                num.intValue();
                h.e(this.f110847b, this.f110848c, mVar, p0.t(this.f110849d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(r rVar, x xVar, int i14, int i15, int i16) {
        this.f110846a = i16;
        this.f110847b = rVar;
        this.f110848c = xVar;
        this.f110849d = i15;
    }
}
