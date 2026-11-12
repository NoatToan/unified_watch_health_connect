package gy0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgy0/d0;", "", "Landroid/content/Context;", "applicationContext", "Lby0/a;", "dataSource", "<init>", "(Landroid/content/Context;Lby0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final by0.a f80130b;

    public d0(Context context, by0.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f80129a = context;
        this.f80130b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, o82.a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f80123d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f80123d = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objI = c0Var.f80121b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f80123d;
        if (i15 == 0) {
            o13.r.b(objI);
            if (oVar != null && oVar2 != null) {
                c0Var.f80120a = aVar;
                c0Var.f80123d = 1;
                objI = this.f80130b.i(str, oVar, oVar2, c0Var);
                if (objI == aVar2) {
                    return aVar2;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aVar = c0Var.f80120a;
        o13.r.b(objI);
        List list = (List) objI;
        q71.d dVarA = list != null ? q71.f.a(list, this.f80129a, aVar) : null;
        if (dVarA != null) {
            i53.d<q71.e, q71.c> dVar = dVarA.f143238a;
            if (!dVar.isEmpty()) {
                Collection<q71.c> collectionValues = dVar.values();
                ArrayList arrayList = new ArrayList(p13.y.r(collectionValues, 10));
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((q71.c) it.next()).f143233a);
                }
                if (!p13.y.s(arrayList).isEmpty()) {
                    return dVarA;
                }
            }
        }
        return null;
    }
}
