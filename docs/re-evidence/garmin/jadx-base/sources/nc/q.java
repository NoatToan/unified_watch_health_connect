package nc;

import java.util.List;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.m1;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/i;", "Lb/c;", "Landroidx/navigation/compose/internal/BackEventCompat;", "backEvent", "", "<anonymous>", "(Lr53/i;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {534}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<r53.i<? extends b.c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f125321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<List<lc.v>> f125322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1 f125323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f125324f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<List<lc.v>> f125325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f125326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m1 f125327c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x3<? extends List<lc.v>> x3Var, p1<Boolean> p1Var, m1 m1Var) {
            this.f125325a = x3Var;
            this.f125326b = p1Var;
            this.f125327c = m1Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            b.c cVar = (b.c) obj;
            if (this.f125325a.getF182175a().size() > 1) {
                this.f125326b.setValue(Boolean.TRUE);
                this.f125327c.i(cVar.f13789c);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(e eVar, x3<? extends List<lc.v>> x3Var, m1 m1Var, p1<Boolean> p1Var, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f125321c = eVar;
        this.f125322d = x3Var;
        this.f125323e = m1Var;
        this.f125324f = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f125321c, this.f125322d, this.f125323e, this.f125324f, dVar);
        qVar.f125320b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(r53.i<? extends b.c> iVar, t13.d<? super Unit> dVar) {
        return ((q) create(iVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        lc.v vVar;
        lc.v vVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125319a;
        p1<Boolean> p1Var = this.f125324f;
        e eVar = this.f125321c;
        x3<List<lc.v>> x3Var = this.f125322d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                r53.i iVar = (r53.i) this.f125320b;
                int size = x3Var.getF182175a().size();
                m1 m1Var = this.f125323e;
                if (size > 1) {
                    m1Var.i(0.0f);
                    vVar = (lc.v) h0.n0(x3Var.getF182175a());
                    vVar.getClass();
                    eVar.b().f(vVar);
                    eVar.b().f(x3Var.getF182175a().get(x3Var.getF182175a().size() - 2));
                } else {
                    vVar = null;
                }
                a aVar2 = new a(x3Var, p1Var, m1Var);
                this.f125320b = vVar;
                this.f125319a = 1;
                if (iVar.collect(aVar2, this) == aVar) {
                    return aVar;
                }
                vVar2 = vVar;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vVar2 = (lc.v) this.f125320b;
                o13.r.b(obj);
            }
            if (x3Var.getF182175a().size() > 1) {
                p1Var.setValue(Boolean.FALSE);
                vVar2.getClass();
                eVar.i(vVar2, false);
            }
        } catch (CancellationException unused) {
            if (x3Var.getF182175a().size() > 1) {
                p1Var.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
