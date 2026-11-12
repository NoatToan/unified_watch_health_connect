package t70;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsViewModel$save$1", f = "EditEssentialsViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 164}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f162982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f162982b = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f162982b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r1.emit(r15, r14) == r0) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r rVar;
        g3 g3VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162981a;
        q qVar = this.f162982b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                rVar = this;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            qVar.f162958f.k(null, Boolean.FALSE);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        qVar.f162958f.k(null, Boolean.TRUE);
        List<o70.i> listA4 = qVar.A4();
        ArrayList arrayList = new ArrayList(p13.y.r(listA4, 10));
        Iterator<T> it = listA4.iterator();
        while (it.hasNext()) {
            arrayList.add(new j70.b(((o70.i) it.next()).f130007a));
        }
        l70.c cVar = qVar.f162953a;
        this.f162981a = 1;
        rVar = this;
        obj = l70.c.V0(cVar, null, null, null, null, arrayList, rVar, 15);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            g3.a aVar2 = g3.f35298f;
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            g3VarA = g3.a.d(unit);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
        }
        e2 e2Var = qVar.f162956d;
        rVar.f162981a = 2;
    }
}
