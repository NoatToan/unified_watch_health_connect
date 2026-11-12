package jd;

import androidx.room.u0;
import i3.f2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012B\b\u0002\u0010\u000b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ljd/m;", "Ljd/c;", "Lud/b;", "driver", "", "fileName", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lt13/d;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Lud/b;Ljava/lang/String;Le23/p;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.b f98256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<e23.l<? super t13.d<Object>, ? extends Object>, t13.d<Object>, Object> f98258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f98259d;

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.coroutines.PassthroughConnectionPool$useConnection$2", f = "PassthroughConnectionPool.kt", l = {59}, m = "invokeSuspend")
    public static final class b<R> extends v13.i implements e23.p<b0, t13.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<u0, t13.d<? super R>, Object> f98263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f98264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super u0, ? super t13.d<? super R>, ? extends Object> pVar, h hVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f98263b = pVar;
            this.f98264c = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f98263b, this.f98264c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, Object obj) {
            return ((b) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98262a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f98262a = 1;
                Object objInvoke = this.f98263b.invoke(this.f98264c, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(ud.b bVar, String str, e23.p<? super e23.l<? super t13.d<Object>, ? extends Object>, ? super t13.d<Object>, ? extends Object> pVar) {
        bVar.getClass();
        str.getClass();
        this.f98256a = bVar;
        this.f98257b = str;
        this.f98258c = pVar;
        this.f98259d = o13.m.b(new f2(this, 19));
    }

    @Override // jd.c
    public final <R> Object V1(boolean z14, e23.p<? super u0, ? super t13.d<? super R>, ? extends Object> pVar, t13.d<? super R> dVar) {
        a aVar = (a) dVar.getF157466b().get(a.f98260b);
        h hVar = aVar != null ? aVar.f98261a : null;
        if (hVar != null) {
            return pVar.invoke(hVar, dVar);
        }
        h hVar2 = new h(this.f98258c, (ud.a) this.f98259d.getValue());
        return ge1.b.e0(new a(hVar2), new b(pVar, hVar2, null), dVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        o13.t tVar = this.f98259d;
        if (tVar.isInitialized()) {
            ((ud.a) tVar.getValue()).close();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljd/m$a;", "Lt13/g$a;", "Ljd/h;", "connectionWrapper", "<init>", "(Ljd/h;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t13.g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1882a f98260b = new C1882a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f98261a;

        public a(h hVar) {
            hVar.getClass();
            this.f98261a = hVar;
        }

        @Override // t13.g
        public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
            return (R) t13.g.a.C3052a.a(this, r14, pVar);
        }

        @Override // t13.g
        public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
            return (E) t13.g.a.C3052a.b(this, bVar);
        }

        @Override // t13.g.a
        public final t13.g.b<a> getKey() {
            return f98260b;
        }

        @Override // t13.g
        public final t13.g minusKey(t13.g.b<?> bVar) {
            return t13.g.a.C3052a.c(this, bVar);
        }

        @Override // t13.g
        public final t13.g plus(t13.g gVar) {
            return t13.g.a.C3052a.d(gVar, this);
        }

        /* JADX INFO: renamed from: jd.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljd/m$a$a;", "Lt13/g$b;", "Ljd/m$a;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1882a implements t13.g.b<a> {
            public /* synthetic */ C1882a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C1882a() {
            }
        }
    }

    public /* synthetic */ m(ud.b bVar, String str, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, str, (i14 & 4) != 0 ? null : pVar);
    }
}
