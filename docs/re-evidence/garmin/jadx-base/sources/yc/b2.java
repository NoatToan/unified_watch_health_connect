package yc;

import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {220}, m = "invokeSuspend")
public final class b2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1<Object, Object> f195776b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/t4;", "hint", "", "<anonymous>", "(Lyc/t4;)Z"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<t4, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f195777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1<Object, Object> f195778b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s1<Object, Object> s1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f195778b = s1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f195778b, dVar);
            aVar.f195777a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(t4 t4Var, t13.d<? super Boolean> dVar) {
            return ((a) create(t4Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t4 t4Var = (t4) this.f195777a;
            int i14 = t4Var.f196487a * (-1);
            int i15 = this.f195778b.f196405c.f196515f;
            return Boolean.valueOf(i14 > i15 || t4Var.f196488b * (-1) > i15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(s1<Object, Object> s1Var, t13.d<? super b2> dVar) {
        super(2, dVar);
        this.f195776b = s1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b2(this.f195776b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195775a;
        s1<Object, Object> s1Var = this.f195776b;
        if (i14 == 0) {
            o13.r.b(obj);
            s53.l lVarE = r53.s.E(s1Var.f196410h.a(c1.APPEND), s1Var.f196410h.a(c1.PREPEND));
            a aVar2 = new a(s1Var, null);
            this.f195775a = 1;
            obj = r53.s.z(lVarE, aVar2, this);
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
        t4 t4Var = (t4) obj;
        if (t4Var != null) {
            g3.f195987a.getClass();
            if (g3.a(3)) {
                Objects.toString(s1Var.f196404b);
                t4Var.toString();
            }
            s1Var.f196409g.invoke();
        }
        return Unit.INSTANCE;
    }
}
