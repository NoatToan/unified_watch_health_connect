package kotlin;

import e23.l;
import o13.r;
import p3.g1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend", v = 1)
public final class h2 extends i implements l<d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<Long, Object> f91203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h2(l<? super Long, Object> lVar, d<? super h2> dVar) {
        super(1, dVar);
        this.f91203b = lVar;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(d<?> dVar) {
        return new h2(this.f91203b, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<Object> dVar) {
        return ((h2) create(dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f91202a;
        if (i14 == 0) {
            r.b(obj);
            this.f91202a = 1;
            Object objV = g1.a(getF157466b()).v(this.f91203b, this);
            return objV == aVar ? aVar : objV;
        }
        if (i14 == 1) {
            r.b(obj);
            return obj;
        }
        h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
