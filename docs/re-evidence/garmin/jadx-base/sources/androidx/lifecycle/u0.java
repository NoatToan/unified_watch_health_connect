package androidx.lifecycle;

import android.annotation.SuppressLint;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/u0;", "T", "Landroidx/lifecycle/t0;", "Landroidx/lifecycle/j;", "target", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroidx/lifecycle/j;Lt13/g;)V", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0<T> implements t0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f8038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f8039b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {100}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u0<T> f8041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f8042c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0<T> u0Var, T t7, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f8041b = u0Var;
            this.f8042c = t7;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f8041b, this.f8042c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f8040a;
            u0<T> u0Var = this.f8041b;
            if (i14 == 0) {
                o13.r.b(obj);
                j<T> jVar = u0Var.f8038a;
                this.f8040a = 1;
                if (jVar.p(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            u0Var.f8038a.m(this.f8042c);
            return Unit.INSTANCE;
        }
    }

    public u0(j<T> jVar, t13.g gVar) {
        jVar.getClass();
        gVar.getClass();
        this.f8038a = jVar;
        x53.c cVar = o53.s0.f129406a;
        this.f8039b = gVar.plus(u53.o.f168762a.H());
    }

    @Override // androidx.lifecycle.t0
    public final Object a(j jVar, bq0.m mVar) {
        return ge1.b.e0(this.f8039b, new v0(this, jVar, null), mVar);
    }

    @Override // androidx.lifecycle.t0
    @SuppressLint({"NullSafeMutableLiveData"})
    public final Object emit(T t7, t13.d<? super Unit> dVar) throws Throwable {
        Object objE0 = ge1.b.e0(this.f8039b, new a(this, t7, null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }
}
