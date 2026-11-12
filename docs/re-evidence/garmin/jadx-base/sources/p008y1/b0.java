package p008y1;

import e23.p;
import ge1.b;
import h4.s;
import java.util.concurrent.CancellationException;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.o0;
import s1.m;
import s1.q1;
import s1.v;
import s1.y;
import t13.d;
import v13.e;
import v13.i;
import wv0.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly1/b0;", "Ly1/q2;", "Ls1/y;", "", "flingDecay", "Lh4/s;", "motionDurationScale", "<init>", "(Ls1/y;Lh4/s;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y<Float> f193093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f193094b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)F"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1048}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<o53.b0, d<? super Float>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o0 f193095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m f193096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f193097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f193098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b0 f193099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o2 f193100f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f14, b0 b0Var, o2 o2Var, d<? super a> dVar) {
            super(2, dVar);
            this.f193098d = f14;
            this.f193099e = b0Var;
            this.f193100f = o2Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f193098d, this.f193099e, this.f193100f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, d<? super Float> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            float f14;
            m mVar;
            o0 o0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193097c;
            if (i14 == 0) {
                r.b(obj);
                f14 = this.f193098d;
                if (Math.abs(f14) > 1.0f) {
                    o0 o0Var2 = new o0();
                    o0Var2.f105806a = f14;
                    o0 o0Var3 = new o0();
                    m mVarA = v.a(0.0f, f14, 28);
                    try {
                        b0 b0Var = this.f193099e;
                        y<Float> yVar = b0Var.f193093a;
                        h hVar = new h(o0Var3, this.f193100f, o0Var2, b0Var, 7);
                        this.f193095a = o0Var2;
                        this.f193096b = mVarA;
                        this.f193097c = 1;
                        if (q1.d(mVarA, yVar, false, hVar, this) == aVar) {
                            return aVar;
                        }
                        o0Var = o0Var2;
                        f14 = o0Var.f105806a;
                    } catch (CancellationException unused) {
                        mVar = mVarA;
                        o0Var = o0Var2;
                        o0Var.f105806a = ((Number) mVar.a()).floatValue();
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mVar = this.f193096b;
                o0Var = this.f193095a;
                try {
                    r.b(obj);
                } catch (CancellationException unused2) {
                    o0Var.f105806a = ((Number) mVar.a()).floatValue();
                }
                f14 = o0Var.f105806a;
            }
            return new Float(f14);
        }
    }

    public b0(y yVar, s sVar, int i14, j jVar) {
        this(yVar, (i14 & 2) != 0 ? t2.f193656c : sVar);
    }

    @Override // p008y1.e1
    public final Object a(o2 o2Var, float f14, d<? super Float> dVar) {
        return b.e0(this.f193094b, new a(f14, this, o2Var, null), dVar);
    }

    public b0(y<Float> yVar, s sVar) {
        this.f193093a = yVar;
        this.f193094b = sVar;
    }
}
