package p006l2;

import e23.p;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import w2.n;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f108532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f108533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f108534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f108535e;

    public /* synthetic */ h0(n nVar, boolean z14, e eVar, int i14, int i15) {
        this.f108531a = i15;
        this.f108532b = nVar;
        this.f108533c = z14;
        this.f108534d = eVar;
        this.f108535e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f108531a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                r0.a(this.f108532b, this.f108533c, this.f108534d, mVar, p0.t(this.f108535e | 1));
                break;
            default:
                y.b(this.f108532b, this.f108533c, this.f108534d, mVar, p0.t(this.f108535e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
