package yz1;

import p005kotlin.Unit;
import p3.p0;
import z2.m0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200316a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.e f200317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f200318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f200319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f200320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f200321f;

    public /* synthetic */ j(h4.r rVar, z2.b0 b0Var, e23.l lVar, z3.e eVar, int i14) {
        this.f200319d = rVar;
        this.f200320e = b0Var;
        this.f200321f = lVar;
        this.f200317b = eVar;
        this.f200318c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f200316a) {
            case 0:
                ((Integer) obj2).getClass();
                k.c((d) this.f200319d, (u4.d) this.f200320e, this.f200317b, (e23.a) this.f200321f, (p3.m) obj, p0.t(this.f200318c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m0.a((h4.r) this.f200319d, (z2.b0) this.f200320e, (e23.l) this.f200321f, this.f200317b, (p3.m) obj, p0.t(this.f200318c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                this.f200317b.d(this.f200319d, this.f200320e, this.f200321f, (p3.m) obj, p0.t(this.f200318c) | 1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(d dVar, u4.d dVar2, z3.e eVar, e23.a aVar, int i14) {
        this.f200319d = dVar;
        this.f200320e = dVar2;
        this.f200317b = eVar;
        this.f200321f = aVar;
        this.f200318c = i14;
    }

    public /* synthetic */ j(z3.e eVar, Object obj, Object obj2, Object obj3, int i14) {
        this.f200317b = eVar;
        this.f200319d = obj;
        this.f200320e = obj2;
        this.f200321f = obj3;
        this.f200318c = i14;
    }
}
