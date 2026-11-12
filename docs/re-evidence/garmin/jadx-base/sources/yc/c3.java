package yc;

import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {121}, m = "invokeSuspend")
public final class c3 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3<Object> f195803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2<Object> f195804c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lyc/m1;", "event", "", "emit", "(Lyc/m1;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a3<T> f195805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v2<T> f195806b;

        public a(a3<T> a3Var, v2<T> v2Var) {
            this.f195805a = a3Var;
            this.f195806b = v2Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) throws Throwable {
            m1 m1Var = (m1) obj;
            g3.f195987a.getClass();
            if (g3.a(2)) {
                Objects.toString(m1Var);
            }
            a3<T> a3Var = this.f195805a;
            Object objE0 = ge1.b.e0(a3Var.f195736a, new b3(m1Var, a3Var, this.f195806b, null), dVar);
            return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(a3<Object> a3Var, v2<Object> v2Var, t13.d<? super c3> dVar) {
        super(1, dVar);
        this.f195803b = a3Var;
        this.f195804c = v2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c3(this.f195803b, this.f195804c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((c3) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195802a;
        if (i14 == 0) {
            o13.r.b(obj);
            v2<Object> v2Var = this.f195804c;
            q4 q4Var = v2Var.f196539b;
            a3<Object> a3Var = this.f195803b;
            q4 q4Var2 = a3Var.f195738c;
            a3Var.f195738c = q4Var;
            if (q4Var2 instanceof a3.b) {
                a3.b bVar = (a3.b) q4Var2;
                if (bVar.f195749a) {
                    q4Var.retry();
                }
                if (bVar.f195750b) {
                    q4Var.a();
                }
            }
            r53.i<m1<Object>> iVar = v2Var.f196538a;
            a aVar2 = new a(a3Var, v2Var);
            this.f195802a = 1;
            if (iVar.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
