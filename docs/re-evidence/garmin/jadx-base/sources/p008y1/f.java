package p008y1;

import e23.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.k;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Ly1/a;", "Ly1/w0;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1347}, m = "invokeSuspend", v = 1)
public final class f extends i implements r<a, w0<Object>, Object, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ a f193183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ w0 f193184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f193185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r<Object> f193186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k<Float> f193187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r<Object> rVar, k<Float> kVar, d<? super f> dVar) {
        super(4, dVar);
        this.f193186e = rVar;
        this.f193187f = kVar;
    }

    @Override // e23.r
    public final Object invoke(a aVar, w0<Object> w0Var, Object obj, d<? super Unit> dVar) {
        f fVar = new f(this.f193186e, this.f193187f, dVar);
        fVar.f193183b = aVar;
        fVar.f193184c = w0Var;
        fVar.f193185d = obj;
        return fVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193182a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = this.f193183b;
            w0 w0Var = this.f193184c;
            Object obj2 = this.f193185d;
            r<Object> rVar = this.f193186e;
            float floatValue = rVar.f193589k.getFloatValue();
            this.f193183b = null;
            this.f193184c = null;
            this.f193182a = 1;
            if (e.a(rVar, floatValue, aVar2, w0Var, obj2, this.f193187f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
