package r53;

import java.util.NoSuchElementException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
public final class f1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i<Object> f150603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.r<o13.q<o2<Object>>> f150604d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<z1<T>> f150605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f150606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.r<o13.q<o2<T>>> f150607c;

        public a(p005kotlin.jvm.internal.r0<z1<T>> r0Var, o53.b0 b0Var, o53.r<o13.q<o2<T>>> rVar) {
            this.f150605a = r0Var;
            this.f150606b = b0Var;
            this.f150607c = rVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, r53.o2, r53.p2] */
        @Override // r53.j
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            p005kotlin.jvm.internal.r0<z1<T>> r0Var = this.f150605a;
            z1<T> z1Var = r0Var.f105810a;
            if (z1Var != null) {
                z1Var.setValue(t7);
            } else {
                ?? r14 = (T) q2.a(t7);
                int i14 = o13.q.f128596b;
                this.f150607c.p(o13.q.a(new b2(r14, g8.i.G(this.f150606b.getF195311f()))));
                r0Var.f105810a = r14;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i<Object> iVar, o53.r<o13.q<o2<Object>>> rVar, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f150603c = iVar;
        this.f150604d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f1 f1Var = new f1(this.f150603c, this.f150604d, dVar);
        f1Var.f150602b = obj;
        return f1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p005kotlin.jvm.internal.r0 r0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150601a;
        o53.r<o13.q<o2<Object>>> rVar = this.f150604d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f150602b;
                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                i<Object> iVar = this.f150603c;
                a aVar2 = new a(r0Var2, b0Var, rVar);
                this.f150602b = r0Var2;
                this.f150601a = 1;
                if (iVar.collect(aVar2, this) == aVar) {
                    return aVar;
                }
                r0Var = r0Var2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var = (p005kotlin.jvm.internal.r0) this.f150602b;
                o13.r.b(obj);
            }
            if (r0Var.f105810a == 0) {
                int i15 = o13.q.f128596b;
                rVar.p(o13.q.a(new o13.q.b(new NoSuchElementException("Flow is empty"))));
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            rVar.O(th3);
            throw th3;
        }
    }
}
