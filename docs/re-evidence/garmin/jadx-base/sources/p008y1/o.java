package p008y1;

import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ly1/a;", "Ly1/w0;", "it", "", "<anonymous>", "(Ly1/a;Ly1/w0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {471}, m = "invokeSuspend", v = 1)
public final class o extends i implements q<p008y1.a, w0<Object>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<Object> f193453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f193454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f193455e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/o$a", "Ly1/o2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements o2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<Object> f193456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p008y1.a f193457b;

        public a(p<Object> pVar, p008y1.a aVar) {
            this.f193456a = pVar;
            this.f193457b = aVar;
        }

        @Override // p008y1.o2
        public final float f(float f14) {
            p<Object> pVar = this.f193456a;
            float fD = pVar.f193507x.d(f14);
            float floatValue = fD - pVar.f193507x.f193588j.getFloatValue();
            this.f193457b.a(fD, 0.0f);
            return floatValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p<Object> pVar, o0 o0Var, float f14, d<? super o> dVar) {
        super(3, dVar);
        this.f193453c = pVar;
        this.f193454d = o0Var;
        this.f193455e = f14;
    }

    @Override // e23.q
    public final Object invoke(p008y1.a aVar, w0<Object> w0Var, d<? super Unit> dVar) {
        o0 o0Var = this.f193454d;
        float f14 = this.f193455e;
        o oVar = new o(this.f193453c, o0Var, f14, dVar);
        oVar.f193452b = aVar;
        return oVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o0 o0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193451a;
        if (i14 == 0) {
            r.b(obj);
            p008y1.a aVar2 = (p008y1.a) this.f193452b;
            p<Object> pVar = this.f193453c;
            a aVar3 = new a(pVar, aVar2);
            e1 e1Var = pVar.D;
            if (e1Var == null) {
                s.m("resolvedFlingBehavior");
                throw null;
            }
            o0 o0Var2 = this.f193454d;
            this.f193452b = o0Var2;
            this.f193451a = 1;
            obj = e1Var.a(aVar3, this.f193455e, this);
            if (obj == aVar) {
                return aVar;
            }
            o0Var = o0Var2;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o0Var = (o0) this.f193452b;
            r.b(obj);
        }
        o0Var.f105806a = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }
}
