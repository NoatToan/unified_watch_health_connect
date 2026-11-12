package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class o1<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f150779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q<Object, T, t13.d<Object>, Object> f150780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j<Object> f150781c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", l = {105, 106}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o1 f150782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f150783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f150784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o1<T> f150785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f150786e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o1<? super T> o1Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150785d = o1Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150784c = obj;
            this.f150786e |= Integer.MIN_VALUE;
            return this.f150785d.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o1(p005kotlin.jvm.internal.r0<Object> r0Var, e23.q<Object, ? super T, ? super t13.d<Object>, ? extends Object> qVar, j<Object> jVar) {
        this.f150779a = r0Var;
        this.f150780b = qVar;
        this.f150781c = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L22;
     */
    @Override // r53.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        a aVar;
        p005kotlin.jvm.internal.r0<Object> r0Var;
        o1<T> o1Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150786e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150786e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        T t14 = (T) aVar.f150784c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150786e;
        if (i15 != 0) {
            if (i15 == 1) {
                r0Var = aVar.f150783b;
                o1Var = aVar.f150782a;
                o13.r.b(t14);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(t14);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(t14);
        p005kotlin.jvm.internal.r0<Object> r0Var2 = this.f150779a;
        Object obj = r0Var2.f105810a;
        aVar.f150782a = this;
        aVar.f150783b = r0Var2;
        aVar.f150786e = 1;
        Object objInvoke = this.f150780b.invoke(obj, t7, aVar);
        if (objInvoke != aVar2) {
            t14 = (T) objInvoke;
            r0Var = r0Var2;
            o1Var = this;
        }
        return aVar2;
        r0Var.f105810a = t14;
        j<Object> jVar = o1Var.f150781c;
        Object obj2 = o1Var.f150779a.f105810a;
        aVar.f150782a = null;
        aVar.f150783b = null;
        aVar.f150786e = 2;
    }
}
