package kotlin;

import e23.p;
import o13.r;
import o2.c;
import p005kotlin.jvm.internal.w;
import p3.p0;
import r53.c2;
import r53.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
public final class j1 extends i implements p<p005kotlin.Unit, d<?>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f91221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f91222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3 f91223d;

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li5/a3;", "invoke", "()Li5/a3;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements e23.a<a3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l1 f91224a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l1 l1Var) {
            super(0);
            this.f91224a = l1Var;
        }

        @Override // e23.a
        public final a3 invoke() {
            return (a3) this.f91224a.f91258b.getF182175a();
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li5/a3;", "interceptor", "", "<anonymous>", "(Li5/a3;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<a3, d<? super p005kotlin.Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f91225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b3 f91227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h3 f91228d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b3 b3Var, h3 h3Var, d<? super b> dVar) {
            super(2, dVar);
            this.f91227c = b3Var;
            this.f91228d = h3Var;
        }

        @Override // v13.a
        public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f91227c, this.f91228d, dVar);
            bVar.f91226b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(a3 a3Var, d<? super p005kotlin.Unit> dVar) {
            return ((b) create(a3Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f91225a;
            if (i14 == 0) {
                r.b(obj);
                a3 a3Var = (a3) this.f91226b;
                this.f91225a = 1;
                if (a3Var.a() == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            c.f();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, b3 b3Var, h3 h3Var, d<? super j1> dVar) {
        super(2, dVar);
        this.f91221b = l1Var;
        this.f91222c = b3Var;
        this.f91223d = h3Var;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        return new j1(this.f91221b, this.f91222c, this.f91223d, dVar);
    }

    @Override // e23.p
    public final Object invoke(p005kotlin.Unit unit, d<?> dVar) {
        return ((j1) create(unit, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91220a;
        if (i14 == 0) {
            r.b(obj);
            c2 c2VarS = p0.s(new a(this.f91221b));
            b bVar = new b(this.f91222c, this.f91223d, null);
            this.f91220a = 1;
            if (s.k(c2VarS, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        h.z("Interceptors flow should never terminate.");
        return null;
    }
}
