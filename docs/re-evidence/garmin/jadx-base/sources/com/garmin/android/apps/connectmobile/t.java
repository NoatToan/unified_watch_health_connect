package com.garmin.android.apps.connectmobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.AppUpgradeManager$Companion$upgradeToGC5$2", f = "AppUpgradeManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45034a;

    public t(t13.d<? super t> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(dVar);
        tVar.f45034a = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0 s0Var = (com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class, null, null, 6, null);
        ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c2(0L);
        List listE = rd2.f.a().f152045a != null ? rd2.j.e() : null;
        if (listE == null) {
            listE = p13.j0.f134944a;
        }
        a2 a2Var = a2.DASHBOARD;
        String strF = v.e0.f(listE.size(), "Add Whats New items for non beta users with paired devices pairedDevicesCount[", "]");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "AppUpgradeManager", strF);
        if (!listE.isEmpty()) {
            j70.a0.f97472p.getClass();
            List<j70.a0> list = j70.a0.f97474r;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                j70.a0 a0Var = (j70.a0) next;
                if (a0Var != null ? a0Var.f97482h : false) {
                    arrayList.add(next);
                }
            }
            j70.a0[] a0VarArr = (j70.a0[]) arrayList.toArray(new j70.a0[0]);
            s0Var.i((j70.a0[]) Arrays.copyOf(a0VarArr, a0VarArr.length));
        }
        return Unit.INSTANCE;
    }
}
