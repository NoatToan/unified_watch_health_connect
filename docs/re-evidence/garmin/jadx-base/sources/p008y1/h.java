package p008y1;

import e23.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import s1.k;
import s1.m;
import s1.v;
import s1.y;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Ly1/a;", "Ly1/w0;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1394, 1412, 1436}, m = "invokeSuspend", v = 1)
public final class h extends i implements r<a, w0<Object>, Object, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ a f193229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ w0 f193230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f193231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r<Object> f193232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f193233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k<Float> f193234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0 f193235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y<Float> f193236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r<Object> rVar, float f14, k<Float> kVar, o0 o0Var, y<Float> yVar, d<? super h> dVar) {
        super(4, dVar);
        this.f193232e = rVar;
        this.f193233f = f14;
        this.f193234g = kVar;
        this.f193235h = o0Var;
        this.f193236i = yVar;
    }

    @Override // e23.r
    public final Object invoke(a aVar, w0<Object> w0Var, Object obj, d<? super Unit> dVar) {
        o0 o0Var = this.f193235h;
        y<Float> yVar = this.f193236i;
        h hVar = new h(this.f193232e, this.f193233f, this.f193234g, o0Var, yVar, dVar);
        hVar.f193229b = aVar;
        hVar.f193230c = w0Var;
        hVar.f193231d = obj;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (s1.q1.d(r2, r4, false, r6, r14) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (p008y1.e.a(r14.f193232e, r8, r9, r10, r11, r14.f193234g, r14) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (p008y1.e.a(r14.f193232e, r8, r9, r10, r11, r14.f193234g, r14) == r0) goto L42;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193228a;
        o0 o0Var = this.f193235h;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = this.f193229b;
            w0 w0Var = this.f193230c;
            Object obj2 = this.f193231d;
            float fC = w0Var.c(obj2);
            if (!Float.isNaN(fC)) {
                o0 o0Var2 = new o0();
                r<Object> rVar = this.f193232e;
                float floatValue = Float.isNaN(rVar.f193588j.getFloatValue()) ? 0.0f : rVar.f193588j.getFloatValue();
                o0Var2.f105806a = floatValue;
                if (floatValue != fC) {
                    float f14 = this.f193233f;
                    if ((fC - floatValue) * f14 < 0.0f || f14 == 0.0f) {
                        this.f193229b = null;
                        this.f193230c = null;
                        this.f193228a = 1;
                    } else {
                        y<Float> yVar = this.f193236i;
                        float fB = v.b(yVar, floatValue, f14);
                        float f15 = this.f193233f;
                        if (f15 <= 0.0f ? fB > fC : fB < fC) {
                            this.f193229b = null;
                            this.f193230c = null;
                            this.f193228a = 3;
                        } else {
                            m mVarA = v.a(o0Var2.f105806a, f15, 28);
                            io0.a aVar3 = new io0.a(fC, o0Var2, aVar2, o0Var);
                            this.f193229b = null;
                            this.f193230c = null;
                            this.f193228a = 2;
                        }
                    }
                    return aVar;
                }
            }
        } else if (i14 == 1) {
            o13.r.b(obj);
            o0Var.f105806a = 0.0f;
        } else if (i14 == 2) {
            o13.r.b(obj);
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o0Var.f105806a = 0.0f;
        }
        return Unit.INSTANCE;
    }
}
