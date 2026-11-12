package oa0;

import e23.l;
import e23.p;
import j90.k;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h90.e f131045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f131046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f131047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f131048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f131049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f131050g;

    public /* synthetic */ c(h90.e eVar, k kVar, e23.a aVar, l lVar, l lVar2, e23.a aVar2, int i14, int i15) {
        this.f131044a = i15;
        this.f131045b = eVar;
        this.f131046c = kVar;
        this.f131047d = aVar;
        this.f131048e = lVar;
        this.f131049f = lVar2;
        this.f131050g = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f131044a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                d.b(this.f131045b, this.f131046c, this.f131047d, this.f131048e, this.f131049f, this.f131050g, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                d.a(this.f131045b, this.f131046c, this.f131047d, this.f131048e, this.f131049f, this.f131050g, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
