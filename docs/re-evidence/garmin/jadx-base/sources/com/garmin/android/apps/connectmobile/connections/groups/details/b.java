package com.garmin.android.apps.connectmobile.connections.groups.details;

import a73.k;
import am.r1;
import am.x0;
import am.z0;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;
import to.o;
import v13.e;
import v13.i;
import vb.h;
import ym0.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeViewModel$initActivityTypes$1", f = "GroupActivityFeedTypeViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f31481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f31481c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f31481c, dVar);
        bVar.f31480b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objC;
        boolean z14;
        Object next;
        b0 b0Var = (b0) this.f31480b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f31479a;
        boolean z15 = true;
        a aVar2 = this.f31481c;
        if (i14 == 0) {
            r.b(obj);
            aVar2.f31470f.j(g3.a.c(g3.f35298f));
            ym0.a aVar3 = aVar2.f31466b;
            this.f31480b = b0Var;
            this.f31479a = 1;
            aVar3.getClass();
            objC = aVar3.C(new t(aVar3, null), this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objC = obj;
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.a) {
            aVar2.f31470f.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            Iterable iterable = (List) ((v2.b) v2Var).f47386a;
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            Iterable iterable2 = iterable;
            String strConcat = "list: ".concat(h0.k0(iterable2, null, null, null, null, 63));
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var, "GroupActivityFeedTypeViewModel", strConcat);
            ConcurrentHashMap<o, x0> concurrentHashMap = aVar2.f31469e;
            ConcurrentHashMap<o, x0> concurrentHashMap2 = aVar2.f31469e;
            ArrayList<o> arrayList = new ArrayList();
            for (Object obj2 : iterable2) {
                o oVar = (o) obj2;
                w13.c cVar = x0.H3;
                if (cVar == null || !cVar.isEmpty()) {
                    Iterator<T> it = cVar.iterator();
                    while (it.hasNext()) {
                        if (s.g(((x0) it.next()).f4358a, oVar.j())) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
            for (o oVar2 : arrayList) {
                concurrentHashMap.put(oVar2, z0.l(x0.f4346x, oVar2.j()));
            }
            ArrayList arrayList2 = new ArrayList();
            x0 x0Var = x0.f4304m;
            com.garmin.android.apps.connectmobile.i.f36758a.getClass();
            for (x0 x0Var2 : com.garmin.android.apps.connectmobile.i.g(x0Var, concurrentHashMap2)) {
                if (x0Var2 != x0.F && x0Var2 != x0.B && x0Var2 != x0.E) {
                    arrayList2.add(x0Var2);
                }
            }
            arrayList2.remove(x0.D);
            ArrayList<x0> arrayListB = r1.b(h0.N0(arrayList2, r1.n()));
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = aVar2.f31465a.f31577v;
            arrayList4.getClass();
            ArrayList arrayList5 = new ArrayList(y.r(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                String str = ((com.garmin.android.apps.connectmobile.connections.groups.services.model.a) it3.next()).f31607a;
                str.getClass();
                arrayList5.add(new Integer(Integer.parseInt(str)));
            }
            for (x0 x0Var3 : arrayListB) {
                com.garmin.android.apps.connectmobile.i.f36758a.getClass();
                List listG = com.garmin.android.apps.connectmobile.i.g(x0Var3, concurrentHashMap2);
                GarminConnectMobileApp.f28685g.getClass();
                Comparator comparatorComparing = Comparator.comparing(new k(GarminConnectMobileApp.a.a(), 1));
                comparatorComparing.getClass();
                ArrayList arrayListD1 = h0.d1(h0.N0(listG, comparatorComparing));
                arrayListD1.add(0, x0Var3);
                ArrayList arrayListB2 = r1.b(arrayListD1);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayListB2) {
                    x0 x0Var4 = (x0) obj3;
                    Set<o> setKeySet = concurrentHashMap2.keySet();
                    setKeySet.getClass();
                    Iterator<T> it4 = setKeySet.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z14 = z15;
                            next = null;
                            break;
                        }
                        next = it4.next();
                        z14 = z15;
                        if (concurrentHashMap2.get((o) next) == x0Var4) {
                            break;
                        }
                        z15 = z14;
                    }
                    o oVar3 = (o) next;
                    if (arrayList5.contains(new Integer(oVar3 != null ? oVar3.getTypeId() : -1))) {
                        arrayList6.add(obj3);
                    }
                    z15 = z14;
                }
                arrayList3.add(new a.AbstractC0510a.C0511a(x0Var3, !arrayList6.isEmpty()));
                arrayList3.add(new a.AbstractC0510a.b(x0Var3, arrayListB2, arrayList6, null, 8, null));
                z15 = z15;
            }
            aVar2.f31467c.j(arrayList3);
            aVar2.f31470f.j(g3.a.e(g3.f35298f));
        }
        return Unit.INSTANCE;
    }
}
