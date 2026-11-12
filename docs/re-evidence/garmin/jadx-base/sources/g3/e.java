package g3;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.q1;
import u1.k1;
import u1.l1;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {196}, m = "invokeSuspend", v = 1)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f75590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f75591c;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {197}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f75593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f75594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, float f14, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f75593b = fVar;
            this.f75594c = f14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f75593b, this.f75594c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75592a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = this.f75593b;
                float floatValue = fVar.f75599e.getFloatValue();
                fp0.l lVar = new fp0.l(fVar, 3);
                this.f75592a = 1;
                if (q1.c(floatValue, this.f75594c, null, lVar, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, float f14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f75590b = fVar;
        this.f75591c = f14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f75590b, this.f75591c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75589a;
        if (i14 == 0) {
            r.b(obj);
            f fVar = this.f75590b;
            l1 l1Var = fVar.f75603i;
            a aVar2 = new a(fVar, this.f75591c, null);
            this.f75589a = 1;
            if (l1Var.b(k1.Default, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
