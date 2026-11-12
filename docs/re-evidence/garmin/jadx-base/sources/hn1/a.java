package hn1;

import c2.t2;
import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f84508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ir0.e f84509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84510d;

    public /* synthetic */ a(t2 t2Var, ir0.e eVar, int i14, int i15) {
        this.f84507a = i15;
        this.f84508b = t2Var;
        this.f84509c = eVar;
        this.f84510d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84507a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                g.d(this.f84508b, this.f84509c, mVar, p0.t(this.f84510d | 1));
                break;
            case 1:
                g.b(this.f84508b, this.f84509c, mVar, p0.t(this.f84510d | 1));
                break;
            default:
                g.c(this.f84508b, this.f84509c, mVar, p0.t(this.f84510d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
