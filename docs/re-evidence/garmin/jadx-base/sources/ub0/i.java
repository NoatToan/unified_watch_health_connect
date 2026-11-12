package ub0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f169731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f169732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f169733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f169734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f169735f;

    public /* synthetic */ i(h4.r rVar, int i14, int i15, e23.l lVar, e23.a aVar, int i16, int i17) {
        this.f169730a = i17;
        this.f169731b = rVar;
        this.f169732c = i14;
        this.f169733d = i15;
        this.f169734e = lVar;
        this.f169735f = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f169730a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(7);
                k.b(this.f169731b, this.f169732c, this.f169733d, this.f169734e, this.f169735f, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(7);
                k.c(this.f169731b, this.f169732c, this.f169733d, this.f169734e, this.f169735f, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
