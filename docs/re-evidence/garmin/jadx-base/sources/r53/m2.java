package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr53/m2;", "Lr53/k2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m2 implements k2 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lr53/i2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<j<? super i2>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o2<Integer> f150741c;

        /* JADX INFO: renamed from: r53.m2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C2836a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p005kotlin.jvm.internal.m0 f150742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j<i2> f150743b;

            /* JADX INFO: renamed from: r53.m2$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @v13.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            public static final class C2837a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f150744a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2836a<T> f150745b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f150746c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2837a(C2836a<? super T> c2836a, t13.d<? super C2837a> dVar) {
                    super(dVar);
                    this.f150745b = c2836a;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f150744a = obj;
                    this.f150746c |= Integer.MIN_VALUE;
                    return this.f150745b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C2836a(p005kotlin.jvm.internal.m0 m0Var, j<? super i2> jVar) {
                this.f150742a = m0Var;
                this.f150743b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(int i14, t13.d<? super Unit> dVar) {
                C2837a c2837a;
                if (dVar instanceof C2837a) {
                    c2837a = (C2837a) dVar;
                    int i15 = c2837a.f150746c;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c2837a.f150746c = i15 - Integer.MIN_VALUE;
                    } else {
                        c2837a = new C2837a(this, dVar);
                    }
                } else {
                    c2837a = new C2837a(this, dVar);
                }
                Object obj = c2837a.f150744a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i16 = c2837a.f150746c;
                if (i16 == 0) {
                    o13.r.b(obj);
                    if (i14 > 0) {
                        p005kotlin.jvm.internal.m0 m0Var = this.f150742a;
                        if (!m0Var.f105804a) {
                            m0Var.f105804a = true;
                            i2 i2Var = i2.START;
                            c2837a.f150746c = 1;
                            if (this.f150743b.emit(i2Var, c2837a) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                return Unit.INSTANCE;
            }

            @Override // r53.j
            public final /* bridge */ /* synthetic */ Object emit(Object obj, t13.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2<Integer> o2Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f150741c = o2Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f150741c, dVar);
            aVar.f150740b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(j<? super i2> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150739a;
            if (i14 == 0) {
                o13.r.b(obj);
                C2836a c2836a = new C2836a(new p005kotlin.jvm.internal.m0(), (j) this.f150740b);
                this.f150739a = 1;
                if (this.f150741c.collect(c2836a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Override // r53.k2
    public final i<i2> a(o2<Integer> o2Var) {
        return new c2(new a(o2Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
