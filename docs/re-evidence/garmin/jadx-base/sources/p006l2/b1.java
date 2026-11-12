package p006l2;

import by1.h;
import e23.p;
import k62.k;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.x3;
import r53.c2;
import r53.j;
import t13.d;
import v13.e;
import v13.i;
import x5.c0;
import x5.g0;
import x5.l;
import x5.l0;
import x5.m0;
import x5.p0;
import x5.q;
import z2.h2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {367}, m = "invokeSuspend", v = 1)
public final class b1 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f108382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f108383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f108384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h2 f108385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f108386f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b2 f108387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f108388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h2 f108389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f108390d;

        public a(b2 b2Var, m0 m0Var, h2 h2Var, q qVar) {
            this.f108387a = b2Var;
            this.f108388b = m0Var;
            this.f108389c = h2Var;
            this.f108390d = qVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, x5.p0] */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            b2 b2Var = this.f108387a;
            if (zBooleanValue && b2Var.b()) {
                h2 h2Var = this.f108389c;
                l0 l0VarU = h2Var.u();
                c0 c0Var = h2Var.f201605b;
                t2.a aVar = t2.f108797a;
                l lVar = b2Var.f108394d;
                x0 x0Var = b2Var.f108412v;
                x0 x0Var2 = b2Var.f108413w;
                aVar.getClass();
                r0 r0Var = new r0();
                k kVar = new k(lVar, 14, x0Var, r0Var);
                m0 m0Var = this.f108388b;
                g0 g0Var = m0Var.f188886a;
                g0Var.g(l0VarU, this.f108390d, kVar, x0Var2);
                ?? r14 = (T) new p0(m0Var, g0Var);
                m0Var.f188887b.set((p0) r14);
                r0Var.f105810a = r14;
                b2Var.f108395e = r14;
                h1.f(b2Var, l0VarU, c0Var);
            } else {
                h1.e(b2Var);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(b2 b2Var, x3<Boolean> x3Var, m0 m0Var, h2 h2Var, q qVar, d<? super b1> dVar) {
        super(2, dVar);
        this.f108382b = b2Var;
        this.f108383c = x3Var;
        this.f108384d = m0Var;
        this.f108385e = h2Var;
        this.f108386f = qVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b1(this.f108382b, this.f108383c, this.f108384d, this.f108385e, this.f108386f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108381a;
        b2 b2Var = this.f108382b;
        try {
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p3.p0.s(new h(this.f108383c, 6));
                a aVar2 = new a(b2Var, this.f108384d, this.f108385e, this.f108386f);
                this.f108381a = 1;
                if (c2VarS.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            h1.e(b2Var);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            h1.e(b2Var);
            throw th3;
        }
    }
}
