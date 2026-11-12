package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rB7\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyc/t2;", "", "Key", "Value", "Lyc/u2;", "config", "initialKey", "Lyc/n3;", "remoteMediator", "Lkotlin/Function0;", "Lyc/h3;", "pagingSourceFactory", "<init>", "(Lyc/u2;Ljava/lang/Object;Lyc/n3;Le23/a;)V", "(Lyc/u2;Ljava/lang/Object;Le23/a;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t2<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<v2<Value>> f196485a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<t13.d<? super h3<Key, Value>>, Object> {
        public a(Object obj) {
            super(1, obj, n4.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.l
        public final Object invoke(Object obj) {
            n4 n4Var = (n4) this.receiver;
            return ge1.b.e0(n4Var.f196280a, new m4(n4Var, null), (t13.d) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lyc/h3;", "<anonymous>", "()Lyc/h3;"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.l<t13.d<? super h3<Key, Value>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<h3<Key, Value>> f196486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.a<? extends h3<Key, Value>> aVar, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f196486a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(this.f196486a, dVar);
        }

        @Override // e23.l
        public final Object invoke(Object obj) {
            return ((b) create((t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return this.f196486a.invoke();
        }
    }

    public t2(u2 u2Var, Key key, n3<Key, Value> n3Var, e23.a<? extends h3<Key, Value>> aVar) {
        u2Var.getClass();
        aVar.getClass();
        this.f196485a = new n1(aVar instanceof n4 ? new a(aVar) : new b(aVar, null), key, u2Var, n3Var).f196248f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t2(u2 u2Var, e23.a<? extends h3<Key, Value>> aVar) {
        this(u2Var, null, aVar, 2, null);
        u2Var.getClass();
        aVar.getClass();
    }

    public /* synthetic */ t2(u2 u2Var, Object obj, n3 n3Var, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(u2Var, (i14 & 2) != 0 ? null : obj, n3Var, aVar);
    }

    public /* synthetic */ t2(u2 u2Var, Object obj, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(u2Var, (i14 & 2) != 0 ? null : obj, aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t2(u2 u2Var, Key key, e23.a<? extends h3<Key, Value>> aVar) {
        this(u2Var, key, null, aVar);
        u2Var.getClass();
        aVar.getClass();
    }
}
