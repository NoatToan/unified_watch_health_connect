package a02;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f62b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f63c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64d;

    public /* synthetic */ d(r rVar, float f14, int i14, int i15) {
        this.f61a = i15;
        this.f62b = rVar;
        this.f63c = f14;
        this.f64d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f61a) {
            case 0:
                num.intValue();
                e.a(this.f62b, this.f63c, mVar, p0.t(this.f64d | 1));
                break;
            case 1:
                num.getClass();
                f.b(this.f62b, this.f63c, mVar, p0.t(this.f64d | 1));
                break;
            case 2:
                num.intValue();
                f.a(this.f62b, this.f63c, mVar, p0.t(this.f64d | 1));
                break;
            default:
                num.getClass();
                u11.d.b(this.f62b, this.f63c, mVar, p0.t(this.f64d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
