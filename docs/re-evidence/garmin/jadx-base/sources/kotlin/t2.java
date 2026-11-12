package kotlin;

import e23.p;
import o13.r;
import o2.c;
import o53.b0;
import r53.j;
import r53.o2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", f = "WindowRecomposer.android.kt", l = {446}, m = "invokeSuspend", v = 1)
public final class t2 extends i implements p<b0, d<? super p005kotlin.Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2<Float> f91537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f91538c;

    @p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "", "emit", "(FLt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u2 f91539a;

        public a(u2 u2Var) {
            this.f91539a = u2Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            float fFloatValue = ((Number) obj).floatValue();
            int i14 = u2.f91584e;
            this.f91539a.f91587c.i(fFloatValue);
            return p005kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(o2<Float> o2Var, u2 u2Var, d<? super t2> dVar) {
        super(2, dVar);
        this.f91537b = o2Var;
        this.f91538c = u2Var;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        return new t2(this.f91537b, this.f91538c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super p005kotlin.Unit> dVar) {
        return ((t2) create(b0Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91536a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f91538c);
            this.f91536a = 1;
            if (this.f91537b.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        c.f();
        return null;
    }
}
