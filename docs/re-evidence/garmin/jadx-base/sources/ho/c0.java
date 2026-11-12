package ho;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo13/u;", "Li53/c;", "Ljo/c;", "", "", "<destruct>", "", "<anonymous>", "(Lo13/u;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.filtering.FilterViewModel$observeFilters$2", f = "FilterViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o13.u<? extends i53.c<? extends jo.c>, ? extends Boolean, ? extends String>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f84599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f84599c = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f84599c, dVar);
        c0Var.f84598b = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(o13.u<? extends i53.c<? extends jo.c>, ? extends Boolean, ? extends String> uVar, t13.d<? super Unit> dVar) {
        return ((c0) create(uVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object objD;
        p2 p2Var;
        Object value4;
        Object value5;
        o13.u uVar = (o13.u) this.f84598b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84597a;
        a0 a0Var = this.f84599c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                i53.c cVar = (i53.c) uVar.f128605a;
                boolean zBooleanValue = ((Boolean) uVar.f128606b).booleanValue();
                String str = (String) uVar.f128607c;
                if (zBooleanValue) {
                    p2 p2Var2 = a0Var.f84578j;
                    do {
                        value3 = p2Var2.getValue();
                    } while (!p2Var2.b(value3, y.a((y) value3, null, false, false, null, null, true, null, 95)));
                    ao.d dVar = a0Var.f84575g;
                    bo.b bVarA = bo.c.a(str, null, cVar);
                    this.f84598b = null;
                    this.f84597a = 1;
                    objD = dVar.d(bVarA, this);
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    p2 p2Var3 = a0Var.f84578j;
                    do {
                        value2 = p2Var3.getValue();
                    } while (!p2Var3.b(value2, y.a((y) value2, null, false, false, null, null, false, null, 103)));
                }
                p2Var = a0Var.f84578j;
                do {
                    value4 = p2Var.getValue();
                } while (!p2Var.b(value4, y.a((y) value4, null, false, false, null, null, false, null, 95)));
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objD = ((o13.q) obj).f128597a;
            if (o13.q.b(objD) != null) {
                objD = new bo.f(0, true);
            }
            bo.f fVar = (bo.f) objD;
            p2 p2Var4 = a0Var.f84578j;
            do {
                value5 = p2Var4.getValue();
            } while (!p2Var4.b(value5, y.a((y) value5, null, false, false, new Integer(fVar.f19113a), Boolean.valueOf(fVar.f19114b), false, null, 103)));
            p2Var = a0Var.f84578j;
            do {
                value4 = p2Var.getValue();
            } while (!p2Var.b(value4, y.a((y) value4, null, false, false, null, null, false, null, 95)));
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            p2 p2Var5 = a0Var.f84578j;
            do {
                value = p2Var5.getValue();
            } while (!p2Var5.b(value, y.a((y) value, null, false, false, null, null, false, null, 95)));
            throw th3;
        }
    }
}
