package cz2;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import o53.d0;
import o53.i0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@v13.e(c = "com.garmin.util.coroutines.ControlledRunner$joinPreviousOrRun$3", f = "ControlledRunner.kt", l = {SyslogConstants.LOG_LOCAL7, 192, 197}, m = "invokeSuspend")
public final class b extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f56883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c<Object> f56884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f56885d;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends w implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<Object> f56886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0<Object> f56887b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<Object> cVar, i0<Object> i0Var) {
            super(1);
            this.f56886a = cVar;
            this.f56887b = i0Var;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            i0<Object> i0Var;
            AtomicReference<i0<Object>> atomicReference = this.f56886a.f56890a;
            do {
                i0Var = this.f56887b;
                if (atomicReference.compareAndSet(i0Var, null)) {
                    break;
                }
            } while (atomicReference.get() == i0Var);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cz2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @v13.e(c = "com.garmin.util.coroutines.ControlledRunner$joinPreviousOrRun$3$newTask$1", f = "ControlledRunner.kt", l = {161}, m = "invokeSuspend")
    public static final class C1220b extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f56888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<Object>, Object> f56889b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1220b(e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super C1220b> dVar) {
            super(2, dVar);
            this.f56889b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1220b(this.f56889b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
            return ((C1220b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f56888a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f56888a = 1;
                Object objInvoke = this.f56889b.invoke(this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(c<Object> cVar, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f56884c = cVar;
        this.f56885d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f56884c, this.f56885d, dVar);
        bVar.f56883b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i0<Object> i0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56882a;
        c<Object> cVar = this.f56884c;
        if (i14 == 0) {
            o13.r.b(obj);
            j0 j0VarJ = ge1.b.j((b0) this.f56883b, null, d0.LAZY, new C1220b(this.f56885d, null), 1);
            j0VarJ.J(new a(cVar, j0VarJ));
            i0Var = j0VarJ;
        } else {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            if (i14 != 2) {
                if (i14 == 3) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i0Var = (i0) this.f56883b;
            o13.r.b(obj);
        }
        loop0: do {
            AtomicReference<i0<Object>> atomicReference = cVar.f56890a;
            do {
                if (atomicReference.compareAndSet(null, i0Var)) {
                    this.f56883b = null;
                    this.f56882a = 3;
                    Object objAwait = i0Var.await(this);
                    if (objAwait == aVar) {
                        break loop0;
                    }
                    return objAwait;
                }
            } while (atomicReference.get() == null);
            i0<Object> i0Var2 = cVar.f56890a.get();
            if (i0Var2 != null) {
                i0Var.c(null);
                this.f56883b = null;
                this.f56882a = 1;
                Object objAwait2 = i0Var2.await(this);
                if (objAwait2 == aVar) {
                    break loop0;
                }
                return objAwait2;
            }
            this.f56883b = i0Var;
            this.f56882a = 2;
        } while (gg.b.U(this) != aVar);
        return aVar;
    }
}
