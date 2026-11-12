package g2;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lg2/h0;", "", "Ld4/c;", "saveableStateHolder", "Lkotlin/Function0;", "Lg2/i0;", "itemProvider", "<init>", "(Ld4/c;Le23/a;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4.c f75124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<i0> f75125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.t0<Object, a> f75126c = p1.g1.b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg2/h0$a;", "", "", FirebaseAnalytics.Param.INDEX, Action.KEY_ATTRIBUTE, "contentType", "<init>", "(Lg2/h0;ILjava/lang/Object;Ljava/lang/Object;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f75127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f75128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f75129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z3.e f75130d;

        public a(int i14, Object obj, Object obj2) {
            this.f75127a = obj;
            this.f75128b = obj2;
            this.f75129c = i14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(d4.c cVar, e23.a<? extends i0> aVar) {
        this.f75124a = cVar;
        this.f75125b = aVar;
    }

    public final e23.p<p3.m, Integer, Unit> a(int i14, Object obj, Object obj2) {
        p1.t0<Object, a> t0Var = this.f75126c;
        a aVarD = t0Var.d(obj);
        if (aVarD != null && aVarD.f75129c == i14 && p005kotlin.jvm.internal.s.g(aVarD.f75128b, obj2)) {
            z3.e eVar = aVarD.f75130d;
            if (eVar != null) {
                return eVar;
            }
            z3.e eVar2 = new z3.e(818252804, true, new ew1.r1(26, h0.this, aVarD));
            aVarD.f75130d = eVar2;
            return eVar2;
        }
        a aVar = new a(i14, obj, obj2);
        t0Var.m(obj, aVar);
        z3.e eVar3 = aVar.f75130d;
        if (eVar3 != null) {
            return eVar3;
        }
        z3.e eVar4 = new z3.e(818252804, true, new ew1.r1(26, h0.this, aVar));
        aVar.f75130d = eVar4;
        return eVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarD = this.f75126c.d(obj);
        if (aVarD != null) {
            return aVarD.f75128b;
        }
        i0 i0VarInvoke = this.f75125b.invoke();
        int iA = i0VarInvoke.a(obj);
        if (iA != -1) {
            return i0VarInvoke.f(iA);
        }
        return null;
    }
}
