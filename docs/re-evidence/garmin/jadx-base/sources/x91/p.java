package x91;

import h2.j0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f189629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aa1.h f189630c;

    public /* synthetic */ p(j0 j0Var, aa1.h hVar, int i14, int i15) {
        this.f189628a = i15;
        this.f189629b = j0Var;
        this.f189630c = hVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f189628a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                r.c(this.f189629b, this.f189630c, mVar, p0.t(1));
                break;
            default:
                s.d(this.f189629b, this.f189630c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
