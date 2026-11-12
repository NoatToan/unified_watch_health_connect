package t70;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditSecondaryStatsViewModel$save$1", f = "EditSecondaryStatsViewModel.kt", l = {224, 238}, m = "invokeSuspend", v = 2)
public final class z0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f163081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f163082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(x0 x0Var, t13.d<? super z0> dVar) {
        super(2, dVar);
        this.f163082b = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z0(this.f163082b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (r1.emit(r15, r14) == r0) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z0 z0Var;
        fw.p pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163081a;
        x0 x0Var = this.f163082b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                z0Var = this;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            x0Var.f163053g.k(null, Boolean.FALSE);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        x0Var.f163053g.k(null, Boolean.TRUE);
        ArrayList arrayList = x0Var.f163069y;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new j70.b((String) it.next()));
        }
        ArrayList arrayList3 = x0Var.f163070z;
        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new j70.b((String) it3.next()));
        }
        l70.c cVar = x0Var.f163047a;
        this.f163081a = 1;
        z0Var = this;
        obj = l70.c.V0(cVar, null, null, arrayList2, arrayList4, null, z0Var, 19);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            lt.b bVar = new lt.b(p13.h0.b1(x0Var.f163069y));
            ht.s.f85508a.getClass();
            ht.s.a(bVar);
            x0Var.f163068x = x0Var.f163070z;
            x0Var.f163067w = x0Var.f163069y;
            pVar = fw.p.SUCCESS;
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            pVar = fw.p.ERROR;
        }
        e2 e2Var = x0Var.f163055i;
        z0Var.f163081a = 2;
    }
}
