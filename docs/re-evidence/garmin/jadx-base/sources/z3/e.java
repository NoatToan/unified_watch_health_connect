package z3;

import androidx.lifecycle.u1;
import ch.qos.logback.core.joran.action.Action;
import e23.s;
import e23.t;
import e23.u;
import e23.v;
import e23.w;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import p3.o0;
import p3.o2;
import p3.p2;
import w52.j0;
import w52.k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz3/e;", "", "", Action.KEY_ATTRIBUTE, "", "tracked", "block", "<init>", "(IZLjava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements e23.p, e23.q, e23.r, s, t, u, v, w, e23.b, e23.c, e23.e, e23.f, e23.g, e23.h, e23.i, e23.j, e23.k, e23.m, e23.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f202095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o2 f202096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f202097e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.a implements e23.p<p3.m, Integer, Unit> {
        public a(Object obj) {
            super(2, obj, e.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            int iIntValue = num.intValue();
            ((e) this.receiver).g(mVar, iIntValue);
            return Unit.INSTANCE;
        }
    }

    public e(int i14, boolean z14, Object obj) {
        this.f202093a = i14;
        this.f202094b = z14;
        this.f202095c = obj;
    }

    public final Object a(u1 u1Var, Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(this.f202093a);
        h(o0VarE);
        int iA = o0VarE.B(this) ? f.a(2, 5) : f.a(1, 5);
        Object obj5 = this.f202095c;
        obj5.getClass();
        y0.e(7, obj5);
        Object objM = ((u) obj5).m(u1Var, obj, obj2, obj3, obj4, o0VarE, Integer.valueOf(i14 | iA));
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(this, u1Var, obj, obj2, obj3, obj4, i14, 27);
        }
        return objM;
    }

    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(this.f202093a);
        h(o0VarE);
        int iA = o0VarE.B(this) ? f.a(2, 6) : f.a(1, 6);
        Object obj7 = this.f202095c;
        obj7.getClass();
        y0.e(8, obj7);
        Object objT = ((v) obj7).t(obj, obj2, obj3, obj4, obj5, obj6, o0VarE, Integer.valueOf(i14 | iA));
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, obj, obj2, obj3, obj4, obj5, obj6, i14, 0);
        }
        return objT;
    }

    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(this.f202093a);
        h(o0VarE);
        int iA = o0VarE.B(this) ? f.a(2, 4) : f.a(1, 4);
        Object obj5 = this.f202095c;
        obj5.getClass();
        y0.e(6, obj5);
        Object objInvoke = ((t) obj5).invoke(obj, obj2, obj3, obj4, o0VarE, Integer.valueOf(i14 | iA));
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(this, obj, obj2, obj3, obj4, i14, 10);
        }
        return objInvoke;
    }

    public final Object d(Object obj, Object obj2, Object obj3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(this.f202093a);
        h(o0VarE);
        int iA = o0VarE.B(this) ? f.a(2, 3) : f.a(1, 3);
        Object obj4 = this.f202095c;
        obj4.getClass();
        y0.e(5, obj4);
        Object objInvoke = ((s) obj4).invoke(obj, obj2, obj3, o0VarE, Integer.valueOf(iA | i14));
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yz1.j(this, obj, obj2, obj3, i14);
        }
        return objInvoke;
    }

    public final Object e(Object obj, Object obj2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(this.f202093a);
        h(o0VarE);
        int iA = o0VarE.B(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.f202095c;
        obj3.getClass();
        y0.e(4, obj3);
        Object objInvoke = ((e23.r) obj3).invoke(obj, obj2, o0VarE, Integer.valueOf(iA | i14));
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(this, obj, obj2, i14, 21);
        }
        return objInvoke;
    }

    public final Object f(Object obj, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(this.f202093a);
        h(o0VarE);
        int iA = o0VarE.B(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.f202095c;
        obj2.getClass();
        y0.e(3, obj2);
        Object objInvoke = ((e23.q) obj2).invoke(obj, o0VarE, Integer.valueOf(iA | i14));
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, obj, i14, 24);
        }
        return objInvoke;
    }

    public final Object g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(this.f202093a);
        h(o0VarE);
        int iA = i14 | (o0VarE.B(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj = this.f202095c;
        obj.getClass();
        y0.e(2, obj);
        Object objInvoke = ((e23.p) obj).invoke(o0VarE, Integer.valueOf(iA));
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(this);
        }
        return objInvoke;
    }

    public final void h(p3.m mVar) {
        p2 p2VarO;
        if (!this.f202094b || (p2VarO = mVar.o()) == null) {
            return;
        }
        mVar.t(p2VarO);
        if (f.d(this.f202096d, p2VarO)) {
            this.f202096d = p2VarO;
            return;
        }
        ArrayList arrayList = this.f202097e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f202097e = arrayList2;
            arrayList2.add(p2VarO);
            return;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (f.d((o2) arrayList.get(i14), p2VarO)) {
                arrayList.set(i14, p2VarO);
                return;
            }
        }
        arrayList.add(p2VarO);
    }

    public final void i(o13.h hVar) {
        if (p005kotlin.jvm.internal.s.g(this.f202095c, hVar)) {
            return;
        }
        boolean z14 = this.f202095c == null;
        this.f202095c = hVar;
        if (z14 || !this.f202094b) {
            return;
        }
        o2 o2Var = this.f202096d;
        if (o2Var != null) {
            o2Var.invalidate();
            this.f202096d = null;
        }
        ArrayList arrayList = this.f202097e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((o2) arrayList.get(i14)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // e23.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return c(obj, obj2, obj3, obj4, (p3.m) obj5, ((Number) obj6).intValue());
    }

    @Override // e23.u
    public final /* bridge */ /* synthetic */ Object m(u1 u1Var, Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, Integer num) {
        return a(u1Var, obj, obj2, obj3, obj4, mVar, num.intValue());
    }

    @Override // e23.v
    public final /* bridge */ /* synthetic */ Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        return b(obj, obj2, obj3, obj4, obj5, obj6, mVar, num.intValue());
    }

    @Override // e23.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return f(obj, (p3.m) obj2, ((Number) obj3).intValue());
    }

    @Override // e23.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (p3.m) obj3, ((Number) obj4).intValue());
    }

    @Override // e23.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return d(obj, obj2, obj3, (p3.m) obj4, ((Number) obj5).intValue());
    }

    @Override // e23.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return g((p3.m) obj, ((Number) obj2).intValue());
    }
}
