package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.LogFoodUseCase$invoke$4", f = "LogFoodUseCase.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b11.a f174463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f174464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.u f174465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f174466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i01.e f174467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i01.i f174468g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(b11.a aVar, n1 n1Var, b63.u uVar, Long l14, i01.e eVar, i01.i iVar, t13.d<? super l1> dVar) {
        super(2, dVar);
        this.f174463b = aVar;
        this.f174464c = n1Var;
        this.f174465d = uVar;
        this.f174466e = l14;
        this.f174467f = eVar;
        this.f174468g = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f174463b, this.f174464c, this.f174465d, this.f174466e, this.f174467f, this.f174468g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? arrayList;
        List listC;
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174462a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b11.a aVar2 = this.f174463b;
        boolean z14 = aVar2 instanceof b11.a.C0202a;
        n1 n1Var = this.f174464c;
        b63.u uVar = this.f174465d;
        if (!z14) {
            if (aVar2 instanceof b11.a.c) {
                b11.a.c cVar = (b11.a.c) aVar2;
                b63.v vVarC = uVar.c();
                n1Var.getClass();
                listC = p13.w.c(cVar.d3(n1.a(vVarC), this.f174466e, this.f174467f, this.f174468g, null));
            } else {
                if (!(aVar2 instanceof b11.a.b)) {
                    lc.u0.r();
                    return null;
                }
                b11.a.b bVar = (b11.a.b) aVar2;
                i53.c<b11.v> cVar2 = bVar.f14233i;
                arrayList = new ArrayList(p13.y.r(cVar2, 10));
                for (b11.v vVar : cVar2) {
                    b63.v vVarC2 = uVar.c();
                    n1Var.getClass();
                    arrayList.add(b11.v.N3(vVar, n1.a(vVarC2), this.f174466e, this.f174467f, this.f174468g, new Long(bVar.f14228d), 32));
                }
            }
            b63.o oVarB = uVar.b();
            this.f174462a = 1;
            objE0 = ge1.b.e0(n1Var.f174480c, new m1(arrayList, oVarB, n1Var, p13.j0.f134944a, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
            return objE0;
        }
        b11.a.C0202a c0202a = (b11.a.C0202a) aVar2;
        b63.v vVarC3 = uVar.c();
        n1Var.getClass();
        listC = p13.w.c(c0202a.d3(n1.a(vVarC3), this.f174466e, this.f174467f, this.f174468g, null));
        arrayList = listC;
        b63.o oVarB2 = uVar.b();
        this.f174462a = 1;
        objE0 = ge1.b.e0(n1Var.f174480c, new m1(arrayList, oVarB2, n1Var, p13.j0.f134944a, null), this);
        if (objE0 == aVar) {
            return aVar;
        }
        return objE0;
    }
}
