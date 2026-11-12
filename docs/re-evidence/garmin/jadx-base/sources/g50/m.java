package g50;

import e23.p;
import i3.mc;
import p005kotlin.Unit;
import p3.p0;
import sk0.e1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f75929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f75930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75931d;

    public /* synthetic */ m(e23.a aVar, mc mcVar, int i14, int i15) {
        this.f75928a = i15;
        this.f75929b = aVar;
        this.f75930c = mcVar;
        this.f75931d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75928a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                n.a(this.f75929b, this.f75930c, mVar, p0.t(this.f75931d | 1));
                break;
            default:
                e1.a(this.f75929b, this.f75930c, mVar, p0.t(this.f75931d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
