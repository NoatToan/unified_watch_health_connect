package yc;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", l = {314}, m = "invokeSuspend")
public final class s3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f196454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f196455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3<Object, Object> f196456c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", l = {321}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o3 f196457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p005kotlin.jvm.internal.m0 f196458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f196459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o3<Object, Object> f196460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.m0 f196461e;

        /* JADX INFO: renamed from: yc.s3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a;", "it", "", "invoke", "(Lyc/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C3675a extends p005kotlin.jvm.internal.w implements e23.l<yc.a<Object, Object>, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n3.b f196462a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3675a(n3.b bVar) {
                super(1);
                this.f196462a = bVar;
            }

            @Override // e23.l
            public final Boolean invoke(yc.a<Object, Object> aVar) {
                yc.a<Object, Object> aVar2 = aVar;
                aVar2.getClass();
                c1 c1Var = c1.REFRESH;
                aVar2.a(c1Var);
                if (((n3.b.C3667b) this.f196462a).f196279a) {
                    yc.a.EnumC3643a enumC3643a = yc.a.EnumC3643a.COMPLETED;
                    aVar2.d(c1Var, enumC3643a);
                    aVar2.d(c1.PREPEND, enumC3643a);
                    aVar2.d(c1.APPEND, enumC3643a);
                    aVar2.f195712c.clear();
                } else {
                    c1 c1Var2 = c1.PREPEND;
                    yc.a.EnumC3643a enumC3643a2 = yc.a.EnumC3643a.UNBLOCKED;
                    aVar2.d(c1Var2, enumC3643a2);
                    aVar2.d(c1.APPEND, enumC3643a2);
                }
                aVar2.e(c1.PREPEND, null);
                aVar2.e(c1.APPEND, null);
                return Boolean.valueOf(aVar2.c() != null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a;", "it", "", "invoke", "(Lyc/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class b extends p005kotlin.jvm.internal.w implements e23.l<yc.a<Object, Object>, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n3.b f196463a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n3.b bVar) {
                super(1);
                this.f196463a = bVar;
            }

            @Override // e23.l
            public final Boolean invoke(yc.a<Object, Object> aVar) {
                yc.a<Object, Object> aVar2 = aVar;
                aVar2.getClass();
                c1 c1Var = c1.REFRESH;
                aVar2.a(c1Var);
                aVar2.e(c1Var, new z0.a(((n3.b.a) this.f196463a).f196278a));
                return Boolean.valueOf(aVar2.c() != null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a;", "it", "Lyc/i3;", "invoke", "(Lyc/a;)Lyc/i3;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class c extends p005kotlin.jvm.internal.w implements e23.l<yc.a<Object, Object>, i3<Object, Object>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f196464a = new c();

            public c() {
                super(1);
            }

            @Override // e23.l
            public final i3<Object, Object> invoke(yc.a<Object, Object> aVar) {
                yc.a.b<Object, Object> next;
                yc.a<Object, Object> aVar2 = aVar;
                aVar2.getClass();
                Iterator<yc.a.b<Object, Object>> it = aVar2.f195712c.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.f195718a != c1.REFRESH);
                yc.a.b<Object, Object> bVar = next;
                if (bVar != null) {
                    return bVar.f195719b;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o3<Object, Object> o3Var, p005kotlin.jvm.internal.m0 m0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f196460d = o3Var;
            this.f196461e = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f196460d, this.f196461e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o3<Object, Object> o3Var;
            p005kotlin.jvm.internal.m0 m0Var;
            boolean zBooleanValue;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196459c;
            if (i14 == 0) {
                o13.r.b(obj);
                o3Var = this.f196460d;
                if (((i3) o3Var.f196294c.a(c.f196464a)) != null) {
                    n3<Object, Object> n3Var = o3Var.f196293b;
                    c1 c1Var = c1.REFRESH;
                    this.f196457a = o3Var;
                    p005kotlin.jvm.internal.m0 m0Var2 = this.f196461e;
                    this.f196458b = m0Var2;
                    this.f196459c = 1;
                    obj = n3Var.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                    m0Var = m0Var2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var = this.f196458b;
            o3Var = this.f196457a;
            o13.r.b(obj);
            n3.b bVar = (n3.b) obj;
            if (bVar instanceof n3.b.C3667b) {
                zBooleanValue = ((Boolean) o3Var.f196294c.a(new C3675a(bVar))).booleanValue();
            } else {
                if (!(bVar instanceof n3.b.a)) {
                    lc.u0.r();
                    return null;
                }
                zBooleanValue = ((Boolean) o3Var.f196294c.a(new b(bVar))).booleanValue();
            }
            m0Var.f105804a = zBooleanValue;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(o3<Object, Object> o3Var, t13.d<? super s3> dVar) {
        super(2, dVar);
        this.f196456c = o3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s3(this.f196456c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p005kotlin.jvm.internal.m0 m0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196455b;
        o3<Object, Object> o3Var = this.f196456c;
        if (i14 == 0) {
            o13.r.b(obj);
            p005kotlin.jvm.internal.m0 m0Var2 = new p005kotlin.jvm.internal.m0();
            i4 i4Var = o3Var.f196295d;
            a aVar2 = new a(o3Var, m0Var2, null);
            this.f196454a = m0Var2;
            this.f196455b = 1;
            if (i4Var.a(2, aVar2, this) == aVar) {
                return aVar;
            }
            m0Var = m0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var = this.f196454a;
            o13.r.b(obj);
        }
        if (m0Var.f105804a) {
            int i15 = o3.f196291e;
            ge1.b.T(o3Var.f196292a, null, null, new r3(o3Var, null), 3);
        }
        return Unit.INSTANCE;
    }
}
