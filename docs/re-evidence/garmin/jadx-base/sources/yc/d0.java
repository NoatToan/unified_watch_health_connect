package yc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyc/d0;", "", "T", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0<T> f195823a = new e0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z53.b f195824b = z53.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195825c = -1;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(v13.c cVar) {
        b0 b0Var;
        d0<T> d0Var;
        z53.b bVar;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f195766e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f195766e = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object obj = b0Var.f195764c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f195766e;
        if (i15 == 0) {
            o13.r.b(obj);
            b0Var.f195762a = this;
            z53.b bVar2 = this.f195824b;
            b0Var.f195763b = bVar2;
            b0Var.f195766e = 1;
            if (bVar2.c(b0Var) == aVar) {
                return aVar;
            }
            d0Var = this;
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = b0Var.f195763b;
            d0Var = b0Var.f195762a;
            o13.r.b(obj);
        }
        try {
            List<m1<T>> listB = d0Var.f195823a.b();
            int size = (d0Var.f195825c - listB.size()) + 1;
            ArrayList arrayList = new ArrayList(p13.y.r(listB, 10));
            int i16 = 0;
            for (T t7 : listB) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList.add(new p13.m0(i16 + size, (m1) t7));
                i16 = i17;
            }
            bVar.e(null);
            return arrayList;
        } catch (Throwable th3) {
            bVar.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p13.m0 m0Var, v13.c cVar) {
        c0 c0Var;
        z53.b bVar;
        d0<T> d0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f195792f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f195792f = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object obj = c0Var.f195790d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f195792f;
        if (i15 == 0) {
            o13.r.b(obj);
            c0Var.f195787a = this;
            c0Var.f195788b = m0Var;
            bVar = this.f195824b;
            c0Var.f195789c = bVar;
            c0Var.f195792f = 1;
            if (bVar.c(c0Var) == aVar) {
                return aVar;
            }
            d0Var = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = c0Var.f195789c;
            p13.m0 m0Var2 = c0Var.f195788b;
            d0Var = c0Var.f195787a;
            o13.r.b(obj);
            bVar = bVar2;
            m0Var = m0Var2;
        }
        try {
            d0Var.f195825c = m0Var.f134951a;
            d0Var.f195823a.a((m1) m0Var.f134952b);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
