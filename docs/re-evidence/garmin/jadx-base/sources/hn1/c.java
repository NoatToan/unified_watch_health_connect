package hn1;

import e23.p;
import o53.x;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84514a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f84515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f84516c;

    public /* synthetic */ c(r0 r0Var, boolean z14) {
        this.f84515b = r0Var;
        this.f84516c = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, t13.g] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84514a;
        t13.g gVar = null;
        boolean z14 = this.f84516c;
        r0 r0Var = this.f84515b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        mVar.C(683215328);
                        mVar.f();
                    } else {
                        mVar.C(683141331);
                        u82.f fVar = (u82.f) r0Var.f105810a;
                        g.f(fVar != null ? (ir0.e) fVar.a() : null, mVar, ir0.e.f94792c);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                t13.g gVar2 = (t13.g) obj;
                t13.g.a aVar = (t13.g.a) obj2;
                if (!(aVar instanceof x)) {
                    return gVar2.plus(aVar);
                }
                if (((t13.g) r0Var.f105810a).get(aVar.getKey()) != null) {
                    r0Var.f105810a = ((t13.g) r0Var.f105810a).minusKey(aVar.getKey());
                    return gVar2.plus(((x) aVar).K());
                }
                if (z14) {
                    ((x) aVar).n();
                } else {
                    gVar = (x) aVar;
                }
                return gVar2.plus(gVar);
        }
    }

    public /* synthetic */ c(boolean z14, r0 r0Var) {
        this.f84516c = z14;
        this.f84515b = r0Var;
    }
}
