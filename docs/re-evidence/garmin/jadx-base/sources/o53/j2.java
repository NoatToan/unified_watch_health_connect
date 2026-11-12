package o53;

import kotlinx.coroutines.TimeoutCancellationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
    public static final class a<T> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f129355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f129356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f129357c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f129356b = obj;
            this.f129357c |= Integer.MIN_VALUE;
            return j2.c(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(i2<U, ? super T> i2Var, e23.p<? super b0, ? super t13.d<? super T>, ? extends Object> pVar) {
        g8.i.O(i2Var, new w0(m0.d(i2Var.f168769d.getF157466b()).j(i2Var.f129352e, i2Var, i2Var.f129302c)));
        return oi0.c.V(i2Var, false, i2Var, pVar);
    }

    public static final Object b(long j8, e23.p pVar, v13.c cVar) {
        if (j8 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objA = a(new i2(j8, cVar), pVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, o53.i2] */
    public static final <T> Object c(long j8, e23.p<? super b0, ? super t13.d<? super T>, ? extends Object> pVar, t13.d<? super T> dVar) {
        a aVar;
        p005kotlin.jvm.internal.r0 r0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f129357c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f129357c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f129356b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f129357c;
        if (i15 == 0) {
            o13.r.b(obj);
            if (j8 <= 0) {
                return null;
            }
            p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
            try {
                aVar.f129355a = r0Var2;
                aVar.f129357c = 1;
                ?? r14 = (T) new i2(j8, aVar);
                r0Var2.f105810a = r14;
                Object objA = a(r14, pVar);
                return objA == aVar2 ? aVar2 : objA;
            } catch (TimeoutCancellationException e4) {
                e = e4;
                r0Var = r0Var2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = aVar.f129355a;
            try {
                o13.r.b(obj);
                return obj;
            } catch (TimeoutCancellationException e14) {
                e = e14;
            }
        }
        if (e.coroutine == r0Var.f105810a) {
            return null;
        }
        throw e;
    }
}
