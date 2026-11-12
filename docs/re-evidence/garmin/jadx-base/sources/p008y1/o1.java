package p008y1;

import e23.p;
import ge1.b;
import o13.r;
import o53.b0;
import o53.c2;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.g1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ly1/n1$a;", "<anonymous>", "(Lo53/b0;)Ly1/n1$a;"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {198}, m = "invokeSuspend", v = 1)
public final class o1 extends i implements p<b0, d<? super n1.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q53.i<n1.a> f193467c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {194}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193469b;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f193469b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193468a;
            if (i14 == 0) {
                r.b(obj);
                b0Var = (b0) this.f193469b;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var = (b0) this.f193469b;
                r.b(obj);
            }
            while (g8.i.P(b0Var.getF195311f())) {
                y0 y0Var = new y0(1);
                this.f193469b = b0Var;
                this.f193468a = 1;
                if (g1.a(getF157466b()).v(y0Var, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q53.i<n1.a> iVar, d<? super o1> dVar) {
        super(2, dVar);
        this.f193467c = iVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        o1 o1Var = new o1(this.f193467c, dVar);
        o1Var.f193466b = obj;
        return o1Var;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super n1.a> dVar) {
        return ((o1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        l1 l1Var;
        Throwable th3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193465a;
        if (i14 == 0) {
            r.b(obj);
            c2 c2VarT = b.T((b0) this.f193466b, null, null, new a(null), 3);
            try {
                q53.i<n1.a> iVar = this.f193467c;
                this.f193466b = c2VarT;
                this.f193465a = 1;
                Object objG = iVar.g(this);
                if (objG == aVar) {
                    return aVar;
                }
                l1Var = c2VarT;
                obj = objG;
            } catch (Throwable th4) {
                l1Var = c2VarT;
                th3 = th4;
                l1Var.c(null);
                throw th3;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l1Var = (l1) this.f193466b;
            try {
                r.b(obj);
            } catch (Throwable th5) {
                th3 = th5;
                l1Var.c(null);
                throw th3;
            }
        }
        n1.a aVar2 = (n1.a) obj;
        l1Var.c(null);
        return aVar2;
    }
}
