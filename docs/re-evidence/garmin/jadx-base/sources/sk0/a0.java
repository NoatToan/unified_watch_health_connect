package sk0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$ensureBrandListsLoaded$2", f = "AddGearViewModel.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f159560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f159561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Context context, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f159560b = b0Var;
        this.f159561c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f159560b, this.f159561c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159559a;
        b0 b0Var = this.f159560b;
        if (i14 == 0) {
            o13.r.b(obj);
            kk0.j0 j0Var = b0Var.f159581b;
            this.f159559a = 1;
            obj = j0Var.a(this.f159561c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            Iterable<jk0.i> iterable = (Iterable) ((v2.b) v2Var).f47386a;
            int iA = p13.t0.a(p13.y.r(iterable, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (jk0.i iVar : iterable) {
                List<jk0.h> list = iVar.f99259b;
                ArrayList arrayList = new ArrayList();
                for (jk0.h hVar : list) {
                    jk0.h hVar2 = null;
                    jk0.h hVar3 = !d53.w.J(hVar.f99254a) ? hVar : null;
                    if (hVar3 != null) {
                        List<String> list2 = hVar.f99255b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!d53.w.J((String) obj2)) {
                                arrayList2.add(obj2);
                            }
                        }
                        List listB1 = p13.h0.b1(p13.h0.f1(arrayList2));
                        String str = hVar3.f99254a;
                        str.getClass();
                        listB1.getClass();
                        hVar2 = new jk0.h(str, listB1);
                    }
                    if (hVar2 != null) {
                        arrayList.add(hVar2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (hashSet.add(((jk0.h) obj3).f99254a)) {
                        arrayList3.add(obj3);
                    }
                }
                o13.p pVar = new o13.p(iVar.f99258a, i53.a.e(arrayList3));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
            i53.d dVarG = i53.a.g(linkedHashMap);
            p2 p2Var = b0Var.f159587h;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, q.a((q) value2, false, null, dVarG, false, false, 3)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var2 = b0Var.f159587h;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, q.a((q) value, false, null, null, false, true, 7)));
        }
        return Unit.INSTANCE;
    }
}
