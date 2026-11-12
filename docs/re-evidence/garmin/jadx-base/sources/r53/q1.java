package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class q1<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<p13.m0<? extends T>> f150804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f150805b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {67}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1<T> f150807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f150808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q1<? super T> q1Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150807b = q1Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150806a = obj;
            this.f150808c |= Integer.MIN_VALUE;
            return this.f150807b.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q1(j<? super p13.m0<? extends T>> jVar, p005kotlin.jvm.internal.p0 p0Var) {
        this.f150804a = jVar;
        this.f150805b = p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150808c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150808c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150806a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150808c;
        if (i15 == 0) {
            o13.r.b(obj);
            p005kotlin.jvm.internal.p0 p0Var = this.f150805b;
            int i16 = p0Var.f105807a;
            p0Var.f105807a = i16 + 1;
            if (i16 < 0) {
                org.apache.commons.lang3.e.u("Index overflow has happened");
                return null;
            }
            p13.m0<? extends T> m0Var = new p13.m0<>(i16, t7);
            aVar.f150808c = 1;
            if (this.f150804a.emit(m0Var, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
