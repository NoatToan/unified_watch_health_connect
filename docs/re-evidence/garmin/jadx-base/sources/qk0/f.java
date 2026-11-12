package qk0;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import o53.c0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.u0;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqk0/f;", "Landroidx/lifecycle/u1;", "Lqk0/i;", "Lmk0/g;", "getDefaultGearConflicts", "<init>", "(Lmk0/g;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.g f145091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f145092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f145093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f145094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f145095e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.defaultactivities.DefaultActivitySelectionViewModel$loadConflicts$1", f = "DefaultActivitySelectionViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145096a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f145098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f145098c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(this.f145098c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            o13.p pVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145096a;
            c cVar = this.f145098c;
            f fVar = f.this;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = fVar.f145092b;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, e.a((e) value, true, false, 4)));
                mk0.g gVar = fVar.f145091a;
                List listB1 = h0.b1(cVar.f145082a);
                this.f145096a = 1;
                gVar.getClass();
                obj = c0.e(new mk0.f(listB1, gVar, null), this);
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
                Iterable<mk0.a> iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList();
                for (mk0.a aVar2 : iterable) {
                    aVar2.getClass();
                    cVar.getClass();
                    List<mk0.b> list = aVar2.f119098b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!cVar.f145084c.contains(((mk0.b) obj2).f119100a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    List<mk0.d> list2 = aVar2.f119099c;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!cVar.f145083b.contains(((mk0.d) obj3).f119105a)) {
                            arrayList3.add(obj3);
                        }
                    }
                    if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                        pVar = null;
                    } else {
                        x0 x0Var = aVar2.f119097a;
                        x0Var.getClass();
                        pVar = new o13.p(x0Var, new mk0.a(x0Var, arrayList2, arrayList3));
                    }
                    if (pVar != null) {
                        arrayList.add(pVar);
                    }
                }
                i53.d dVarG = i53.a.g(u0.l(arrayList));
                p2 p2Var2 = fVar.f145092b;
                do {
                    value3 = p2Var2.getValue();
                    ((e) value3).getClass();
                } while (!p2Var2.b(value3, new e(false, false, dVarG)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                p2 p2Var3 = fVar.f145092b;
                do {
                    value2 = p2Var3.getValue();
                } while (!p2Var3.b(value2, e.a((e) value2, false, true, 4)));
            }
            return Unit.INSTANCE;
        }
    }

    public f(mk0.g gVar) {
        gVar.getClass();
        this.f145091a = gVar;
        p2 p2VarA = q2.a(new e(false, false, null, 7, null));
        this.f145092b = p2VarA;
        this.f145093c = p2VarA;
    }

    @Override // qk0.i
    public final void Y1(c cVar) {
        c2 c2Var;
        cVar.getClass();
        if (cVar.f145082a.isEmpty()) {
            this.f145095e = null;
            this.f145092b.k(null, new e(false, false, null, 7, null));
        } else {
            if (cVar.equals(this.f145095e) && (c2Var = this.f145094d) != null && c2Var.isActive()) {
                return;
            }
            this.f145095e = cVar;
            c2 c2Var2 = this.f145094d;
            if (c2Var2 != null) {
                c2Var2.c(null);
            }
            this.f145094d = ge1.b.T(v1.a(this), null, null, new a(cVar, null), 3);
        }
    }

    @Override // qk0.i
    public final o2<e> getUiState() {
        return this.f145093c;
    }

    @Override // qk0.i
    public final void m2() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f145092b;
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, false, false, 5)));
    }
}
