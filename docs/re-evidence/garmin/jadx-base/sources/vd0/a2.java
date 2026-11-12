package vd0;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a2 implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f177151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pe0.d f177152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f177153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<i53.c<pe0.d>> f177154d;

    public a2(boolean z14, pe0.d dVar, boolean z15, p3.p1<i53.c<pe0.d>> p1Var) {
        this.f177151a = z14;
        this.f177152b = dVar;
        this.f177153c = z15;
        this.f177154d = p1Var;
    }

    @Override // e23.a
    public final Unit invoke() {
        i53.c<pe0.d> cVarE;
        if (!this.f177151a) {
            pe0.d dVar = this.f177152b;
            p3.p1<i53.c<pe0.d>> p1Var = this.f177154d;
            if (dVar == null) {
                cVarE = j53.l.b();
            } else if (this.f177153c) {
                i53.c<pe0.d> f182175a = p1Var.getF182175a();
                ArrayList arrayList = new ArrayList();
                for (pe0.d dVar2 : f182175a) {
                    if (dVar2.f137416a != dVar.f137416a) {
                        arrayList.add(dVar2);
                    }
                }
                cVarE = i53.a.e(arrayList);
            } else {
                cVarE = i53.a.e(p13.h0.D0(p1Var.getF182175a(), dVar));
            }
            p1Var.setValue(cVarE);
        }
        return Unit.INSTANCE;
    }
}
