package androidx.lifecycle;

import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, 108}, m = "invokeSuspend", v = 1)
    public static final class a<T> extends v13.i implements e23.p<q53.t<? super T>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s0<T> f8045c;

        /* JADX INFO: renamed from: androidx.lifecycle.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0112a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s0<T> f8046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0<T> f8047b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0112a(s0<T> s0Var, z0<T> z0Var, t13.d<? super C0112a> dVar) {
                super(2, dVar);
                this.f8046a = s0Var;
                this.f8047b = z0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0112a(this.f8046a, this.f8047b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0112a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f8046a.g((z0<? super T>) this.f8047b);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s0<T> f8048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0<T> f8049b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s0<T> s0Var, z0<T> z0Var, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f8048a = s0Var;
                this.f8049b = z0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f8048a, this.f8049b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f8048a.k((z0<? super T>) this.f8049b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0<T> s0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f8045c = s0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f8045c, dVar);
            aVar.f8044b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create((q53.t) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.z0] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            ?? r14 = this.f8043a;
            s0<T> s0Var = this.f8045c;
            try {
                if (r14 == 0) {
                    o13.r.b(obj);
                    a4.b bVar = new a4.b((q53.t) this.f8044b, 6);
                    x53.c cVar = o53.s0.f129406a;
                    o53.t1 t1VarH = u53.o.f168762a.H();
                    C0112a c0112a = new C0112a(s0Var, bVar, null);
                    this.f8044b = bVar;
                    this.f8043a = 1;
                    z0Var = bVar;
                    if (ge1.b.e0(t1VarH, c0112a, this) == aVar) {
                    }
                    return aVar;
                }
                if (r14 == 1) {
                    z0 z0Var2 = (z0) this.f8044b;
                    o13.r.b(obj);
                    z0Var = z0Var2;
                } else {
                    if (r14 != 2) {
                        if (r14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th3 = (Throwable) this.f8044b;
                        o13.r.b(obj);
                        throw th3;
                    }
                    z0 z0Var3 = (z0) this.f8044b;
                    o13.r.b(obj);
                    r14 = z0Var3;
                }
                throw new KotlinNothingValueException();
                this.f8044b = z0Var;
                this.f8043a = 2;
                r14 = z0Var;
                if (o53.m0.a(this) == aVar) {
                    return aVar;
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th4) {
                x53.c cVar2 = o53.s0.f129406a;
                t13.g gVarPlus = u53.o.f168762a.H().plus(o53.v1.f129418a);
                b bVar2 = new b(s0Var, r14, null);
                this.f8044b = th4;
                this.f8043a = 3;
                if (ge1.b.e0(gVarPlus, bVar2, this) != aVar) {
                    throw th4;
                }
            }
        }
    }

    public static final <T> r53.i<T> a(s0<T> s0Var) {
        s0Var.getClass();
        return r53.s.o(r53.s.f(new a(s0Var, null)));
    }

    public static j b(r53.i iVar) {
        t13.h hVar = t13.h.f161748a;
        iVar.getClass();
        hVar.getClass();
        j jVar = new j(hVar, 5000L, new w(iVar, null));
        if (iVar instanceof o2) {
            if (n.a.a().f122013a.a()) {
                jVar.m(((o2) iVar).getValue());
                return jVar;
            }
            jVar.j(((o2) iVar).getValue());
        }
        return jVar;
    }
}
