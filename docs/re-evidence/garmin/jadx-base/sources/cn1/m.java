package cn1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f28025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz1.d f28026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f28027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28028e;

    public /* synthetic */ m(h4.r rVar, yz1.d dVar, e23.a aVar, int i14, int i15) {
        this.f28024a = i15;
        this.f28025b = rVar;
        this.f28026c = dVar;
        this.f28027d = aVar;
        this.f28028e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f28024a) {
            case 0:
                num.intValue();
                n.c(this.f28025b, this.f28026c, this.f28027d, mVar, p0.t(this.f28028e | 1));
                break;
            case 1:
                num.intValue();
                n.d(this.f28025b, this.f28026c, this.f28027d, mVar, p0.t(this.f28028e | 1));
                break;
            case 2:
                num.getClass();
                mx.g.b(this.f28025b, this.f28026c, this.f28027d, mVar, p0.t(this.f28028e | 1));
                break;
            default:
                num.getClass();
                mx.g.c(this.f28025b, this.f28026c, this.f28027d, mVar, p0.t(this.f28028e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
