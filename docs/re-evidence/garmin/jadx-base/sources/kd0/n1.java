package kd0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "", "<anonymous>", "(Lo53/b0;)Ljava/util/Set;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl$onDevicesReconciled$newPairedDevices$1", f = "DeviceDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n1 extends v13.i implements e23.p<o53.b0, t13.d<? super Set<? extends Long>>, Object> {
    public n1(t13.d<? super n1> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n1(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Set<? extends Long>> dVar) {
        return new n1(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE != null) {
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListE, 10));
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                q6.f.s(((sd2.f) it.next()).getUnitID(), arrayList);
            }
            Set setG1 = p13.h0.g1(arrayList);
            if (setG1 != null) {
                return setG1;
            }
        }
        return p13.l0.f134950a;
    }
}
