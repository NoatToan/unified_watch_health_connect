package wt0;

import e23.p;
import gg1.o0;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import z2.h2;
import z2.m2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f187009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f187010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f187011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f187012e;

    public /* synthetic */ c(boolean z14, Object obj, Object obj2, int i14, int i15) {
        this.f187008a = i15;
        this.f187009b = z14;
        this.f187011d = obj;
        this.f187012e = obj2;
        this.f187010c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f187008a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f187010c | 1);
                d.b(this.f187009b, (tt0.e.b) this.f187011d, (o0) this.f187012e, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f187010c | 1);
                m2.a(this.f187009b, (d6.g) this.f187011d, (h2) this.f187012e, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
