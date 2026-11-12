package c02;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22375a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f22376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Double f22377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Double f22378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22379e;

    public /* synthetic */ f(r rVar, Double d14, Double d15, int i14) {
        this.f22376b = rVar;
        this.f22377c = d14;
        this.f22378d = d15;
        this.f22379e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22375a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                h.c(this.f22377c, this.f22378d, this.f22376b, (p3.m) obj, iT, this.f22379e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f22379e | 1);
                h.e(this.f22376b, this.f22377c, this.f22378d, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(Double d14, Double d15, r rVar, int i14, int i15) {
        this.f22377c = d14;
        this.f22378d = d15;
        this.f22376b = rVar;
        this.f22379e = i15;
    }
}
