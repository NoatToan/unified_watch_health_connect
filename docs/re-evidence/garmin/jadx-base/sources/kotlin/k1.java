package kotlin;

import android.view.View;
import e23.p;
import h4.t;
import h4.u;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.c0;
import t13.d;
import t13.g;
import v13.c;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li5/h3;", "", "<anonymous>", "(Li5/h3;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend", v = 1)
public final class k1 extends i implements p<h3, d<?>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f91242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<h3, d<?>, Object> f91243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f91244d;

    @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/k1$a", "Li5/h3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h3 f91245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h3 f91246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicReference<t<p005kotlin.Unit>> f91247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l1 f91248d;

        public a(h3 h3Var, AtomicReference<t<p005kotlin.Unit>> atomicReference, l1 l1Var) {
            this.f91246b = h3Var;
            this.f91247c = atomicReference;
            this.f91248d = l1Var;
            this.f91245a = h3Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlin.g3
        public final u13.a a(b3 b3Var, c cVar) {
            h1 h1Var;
            if (cVar instanceof h1) {
                h1Var = (h1) cVar;
                int i14 = h1Var.f91201c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    h1Var.f91201c = i14 - Integer.MIN_VALUE;
                } else {
                    h1Var = new h1(this, cVar);
                }
            } else {
                h1Var = new h1(this, cVar);
            }
            Object obj = h1Var.f91199a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = h1Var.f91201c;
            if (i15 == 0) {
                r.b(obj);
                i1 i1Var = i1.f91206a;
                j1 j1Var = new j1(this.f91248d, b3Var, this.f91246b, null);
                h1Var.f91201c = 1;
                if (c0.e(new u(i1Var, this.f91247c, j1Var, null), h1Var) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }

        @Override // o53.b0
        /* JADX INFO: renamed from: getCoroutineContext */
        public final g getF183565a() {
            return this.f91245a.getF183565a();
        }

        @Override // kotlin.g3
        /* JADX INFO: renamed from: getView */
        public final View getF91361a() {
            return this.f91245a.getF91361a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(p<? super h3, ? super d<?>, ? extends Object> pVar, l1 l1Var, d<? super k1> dVar) {
        super(2, dVar);
        this.f91243c = pVar;
        this.f91244d = l1Var;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        k1 k1Var = new k1(this.f91243c, this.f91244d, dVar);
        k1Var.f91242b = obj;
        return k1Var;
    }

    @Override // e23.p
    public final Object invoke(h3 h3Var, d<?> dVar) {
        return ((k1) create(h3Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91241a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a((h3) this.f91242b, new AtomicReference(null), this.f91244d);
            this.f91241a = 1;
            if (this.f91243c.invoke(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
