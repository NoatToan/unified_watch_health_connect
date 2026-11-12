package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.LogFoodUseCase$invoke$2", f = "LogFoodUseCase.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<b11.i> f174453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f174454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f174455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i01.e f174456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(List<? extends b11.i> list, n1 n1Var, b63.o oVar, i01.e eVar, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f174453b = list;
        this.f174454c = n1Var;
        this.f174455d = oVar;
        this.f174456e = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k1(this.f174453b, this.f174454c, this.f174455d, this.f174456e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        i01.m mVar;
        i01.f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174452a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ArrayList arrayList = new ArrayList();
        List<b11.i> list = this.f174453b;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Iterator it3 = it;
            n1 n1Var = this.f174454c;
            if (!zHasNext) {
                ArrayList arrayList2 = new ArrayList();
                for (b11.i iVar : list) {
                    n1Var.getClass();
                    if (iVar instanceof b11.h) {
                        mVar = null;
                    } else {
                        if (!(iVar instanceof b11.i.c)) {
                            lc.u0.r();
                            return null;
                        }
                        b11.i.c cVar = (b11.i.c) iVar;
                        String str = cVar.f14315a;
                        b63.l lVarA = b63.a.C0229a.f16171a.a();
                        i01.i iVar2 = cVar.f14321g;
                        String str2 = cVar.f14316b;
                        b63.v vVarA = n1.a(cVar.f14317c);
                        long j8 = cVar.f14318d;
                        b11.f fVar2 = cVar.f14319e;
                        mVar = new i01.m(str, lVarA, (String) null, iVar2, str2, vVarA, Long.valueOf(j8), this.f174456e, fVar2.f14266a, fVar2.f14267b, fVar2.f14268c, fVar2.f14269d, (Double) null, fVar2.f14270e, fVar2.f14272g, fVar2.f14271f, fVar2.f14273h, fVar2.f14274i, fVar2.f14275j, fVar2.f14276k, fVar2.f14277l, fVar2.f14278m, fVar2.f14279n, fVar2.f14284t, fVar2.f14283r, fVar2.f14280o, fVar2.f14281p, fVar2.f14282q, 4100, (p005kotlin.jvm.internal.j) null);
                    }
                    if (mVar != null) {
                        arrayList2.add(mVar);
                    }
                    arrayList = arrayList;
                }
                this.f174452a = 1;
                Object objE0 = ge1.b.e0(n1Var.f174480c, new m1(arrayList, this.f174455d, n1Var, arrayList2, null), this);
                return objE0 == aVar ? aVar : objE0;
            }
            b11.i iVar3 = (b11.i) it3.next();
            n1Var.getClass();
            if (iVar3 instanceof b11.h) {
                String f14315a = iVar3.getF14315a();
                b63.l lVarA2 = b63.a.C0229a.f16171a.a();
                i01.i f14321g = iVar3.getF14321g();
                b63.v vVarA2 = n1.a(iVar3.getF14317c());
                Long lValueOf = Long.valueOf(iVar3.getF14318d());
                b11.h hVar = (b11.h) iVar3;
                fVar = new i01.f(f14315a, lVarA2, (String) null, f14321g, vVarA2, this.f174456e, lValueOf, hVar.getF14311g().f14253a, hVar.getF14312h().f14372a, hVar.getF14311g().f14257e, hVar.getF14311g().f14258f, hVar.getF14311g().f14259g, Double.valueOf(hVar.getF14308d()), (Long) null, 8196, (p005kotlin.jvm.internal.j) null);
            } else {
                if (!(iVar3 instanceof b11.i.c)) {
                    lc.u0.r();
                    return null;
                }
                fVar = null;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
            it = it3;
        }
    }
}
