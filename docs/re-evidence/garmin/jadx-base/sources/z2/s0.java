package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "Lz2/i;", "<anonymous>", "(Lb5/c;)Lz2/i;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
public final class s0 extends v13.h implements e23.p<b5.c, t13.d<? super i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f201784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.q0 f201785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(long j8, p005kotlin.jvm.internal.q0 q0Var, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f201784c = j8;
        this.f201785d = q0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s0 s0Var = new s0(this.f201784c, this.f201785d, dVar);
        s0Var.f201783b = obj;
        return s0Var;
    }

    @Override // e23.p
    public final Object invoke(b5.c cVar, t13.d<? super i> dVar) {
        return ((s0) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b5.c cVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201782a;
        p005kotlin.jvm.internal.q0 q0Var = this.f201785d;
        if (i14 == 0) {
            o13.r.b(obj);
            b5.c cVar2 = (b5.c) this.f201783b;
            r02.f fVar = new r02.f(1, q0Var);
            this.f201783b = cVar2;
            this.f201782a = 1;
            Object objD = p008y1.m0.d(cVar2, this.f201784c, fVar, this);
            if (objD == aVar) {
                return aVar;
            }
            cVar = cVar2;
            obj = objD;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = (b5.c) this.f201783b;
            o13.r.b(obj);
        }
        if (((b5.a0) obj) != null && (q0Var.f105808a & 9223372034707292159L) != 9205357640488583168L) {
            return i.Drag;
        }
        b5.a0 a0Var = (b5.a0) p13.h0.b0(cVar.k0().f15870a);
        if (!b5.r.d(a0Var)) {
            return i.Cancel;
        }
        a0Var.a();
        return i.Up;
    }
}
