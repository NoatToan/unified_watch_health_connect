package r53;

import ch.qos.logback.core.net.SyslogConstants;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend")
public final class j0 extends v13.i implements e23.p<j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i<Object> f150663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<j<Object>, Object, t13.d<? super Boolean>, Object> f150664d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"r53/j0$a", "Lr53/j;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.q f150665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f150666b;

        /* JADX INFO: renamed from: r53.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {132}, m = "emit")
        public static final class C2830a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f150667a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f150668b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f150669c;

            public C2830a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f150668b = obj;
                this.f150669c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(e23.q qVar, j jVar) {
            this.f150665a = qVar;
            this.f150666b = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d<? super Unit> dVar) {
            C2830a c2830a;
            a aVar;
            if (dVar instanceof C2830a) {
                c2830a = (C2830a) dVar;
                int i14 = c2830a.f150669c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2830a.f150669c = i14 - Integer.MIN_VALUE;
                } else {
                    c2830a = new C2830a(dVar);
                }
            } else {
                c2830a = new C2830a(dVar);
            }
            Object objInvoke = c2830a.f150668b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2830a.f150669c;
            if (i15 == 0) {
                o13.r.b(objInvoke);
                c2830a.f150667a = this;
                c2830a.f150669c = 1;
                objInvoke = this.f150665a.invoke(this.f150666b, obj, c2830a);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
                aVar = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = c2830a.f150667a;
                o13.r.b(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            throw new AbortFlowException(aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(i<Object> iVar, e23.q<? super j<Object>, Object, ? super t13.d<? super Boolean>, ? extends Object> qVar, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f150663c = iVar;
        this.f150664d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f150663c, this.f150664d, dVar);
        j0Var.f150662b = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((j0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150661a;
        if (i14 == 0) {
            o13.r.b(obj);
            j jVar = (j) this.f150662b;
            i<Object> iVar = this.f150663c;
            a aVar3 = new a(this.f150664d, jVar);
            try {
                this.f150662b = aVar3;
                this.f150661a = 1;
                if (iVar.collect(aVar3, this) == aVar2) {
                    return aVar2;
                }
            } catch (AbortFlowException e4) {
                e = e4;
                aVar = aVar3;
                if (e.owner == aVar) {
                    throw e;
                }
                g8.i.v(getF157466b());
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.f150662b;
            try {
                o13.r.b(obj);
            } catch (AbortFlowException e14) {
                e = e14;
                if (e.owner == aVar) {
                    throw e;
                }
                g8.i.v(getF157466b());
            }
        }
        return Unit.INSTANCE;
    }
}
