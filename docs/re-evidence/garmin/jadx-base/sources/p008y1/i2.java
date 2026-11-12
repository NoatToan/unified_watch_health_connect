package p008y1;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import s1.k;
import s1.q1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import xm0.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend", v = 1)
public final class i2 extends i implements p<o2, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f193304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k<Float> f193305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f193306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(float f14, k<Float> kVar, o0 o0Var, d<? super i2> dVar) {
        super(2, dVar);
        this.f193304c = f14;
        this.f193305d = kVar;
        this.f193306e = o0Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        i2 i2Var = new i2(this.f193304c, this.f193305d, this.f193306e, dVar);
        i2Var.f193303b = obj;
        return i2Var;
    }

    @Override // e23.p
    public final Object invoke(o2 o2Var, d<? super Unit> dVar) {
        return ((i2) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193302a;
        if (i14 == 0) {
            r.b(obj);
            h hVar = new h(13, this.f193306e, (o2) this.f193303b);
            this.f193302a = 1;
            if (q1.c(0.0f, this.f193304c, this.f193305d, hVar, this, 4) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
