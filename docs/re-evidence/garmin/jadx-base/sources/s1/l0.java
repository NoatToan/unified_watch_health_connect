package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {32}, m = "invokeSuspend", v = 1)
    public static final class a<R> extends v13.i implements e23.l<t13.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, R> f155624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Long, ? extends R> lVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f155624b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f155624b, dVar);
        }

        @Override // e23.l
        public final Object invoke(Object obj) {
            return ((a) create((t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155623a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f155623a = 1;
                Object objV = p3.g1.a(getF157466b()).v(this.f155624b, this);
                return objV == aVar ? aVar : objV;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final <R> Object a(e23.l<? super Long, ? extends R> lVar, t13.d<? super R> dVar) {
        kotlin.g2 g2Var = (kotlin.g2) dVar.getF157466b().get(kotlin.g2.f91193c0);
        if (g2Var == null) {
            return p3.g1.a(dVar.getF157466b()).v(lVar, dVar);
        }
        new a(lVar, null);
        return g2Var.x();
    }
}
