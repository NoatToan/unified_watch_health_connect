package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.LogFoodUseCase$invoke$6", f = "LogFoodUseCase.kt", l = {89, 103}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<i01.f> f174472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f174473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f174474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<i01.m> f174475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(List<i01.f> list, b63.o oVar, n1 n1Var, List<i01.m> list2, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f174472b = list;
        this.f174473c = oVar;
        this.f174474d = n1Var;
        this.f174475e = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f174472b, this.f174473c, this.f174474d, this.f174475e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r13 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r13 == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        List<i01.m> list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174471a;
        n1 n1Var = this.f174474d;
        b63.o oVar = this.f174473c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.b) {
                n1Var.f174479b.b(oVar, (k01.b) ((v2.b) v2Var2).f47386a);
            }
            return v2Var2;
        }
        o13.r.b(obj);
        List<i01.f> list2 = this.f174472b;
        if (list2.isEmpty()) {
            v2Var = null;
            list = this.f174475e;
            if (!list.isEmpty()) {
                if (v2Var == null) {
                    return new v2.a(new IllegalStateException("No regular or quick add items to log"), null, null, 6, null);
                }
                return v2Var;
            }
            i01.g gVar = new i01.g(oVar, list);
            m01.g gVar2 = n1Var.f174478a;
            this.f174471a = 2;
            obj = gVar2.P0(gVar, this);
        } else {
            i01.h hVar = new i01.h(oVar, list2);
            m01.g gVar3 = n1Var.f174478a;
            this.f174471a = 1;
            obj = gVar3.a0(hVar, this);
        }
        return aVar;
        v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            n1Var.f174479b.b(oVar, (k01.b) ((v2.b) v2Var).f47386a);
        }
        list = this.f174475e;
        if (!list.isEmpty()) {
            if (v2Var == null) {
                return new v2.a(new IllegalStateException("No regular or quick add items to log"), null, null, 6, null);
            }
            return v2Var;
        }
        i01.g gVar4 = new i01.g(oVar, list);
        m01.g gVar5 = n1Var.f174478a;
        this.f174471a = 2;
        obj = gVar5.P0(gVar4, this);
    }
}
