package ve;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;
import o53.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
public final class z0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f177661b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve/y0$b;", "<anonymous>", "(Lo53/b0;)Lve/y0$b;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super y0.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f177663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0 y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f177663b = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f177663b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super y0.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177662a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f177662a = 1;
                Object objA = y0.a(this.f177663b, this);
                return objA == aVar ? aVar : objA;
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
    public z0(y0 y0Var, t13.d<? super z0> dVar) {
        super(2, dVar);
        this.f177661b = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z0(this.f177661b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((z0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177660a;
        y0 y0Var = this.f177661b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                m1 m1Var = y0Var.f177646n;
                a aVar3 = new a(y0Var, null);
                this.f177660a = 1;
                obj = ge1.b.e0(m1Var, aVar3, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            aVar = (y0.b) obj;
        } catch (WorkerStoppedException e4) {
            aVar = new y0.b.c(e4.getReason());
        } catch (CancellationException unused) {
            aVar = new y0.b.a(null, 1, null);
        } catch (Throwable unused2) {
            int i15 = d1.f177564a;
            ue.u.a().getClass();
            aVar = new y0.b.a(null, 1, null);
        }
        Object objRunInTransaction = y0Var.f177641i.runInTransaction(new com.google.firebase.remoteconfig.b(7, aVar, y0Var));
        objRunInTransaction.getClass();
        return objRunInTransaction;
    }
}
