package z1;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p008y1.o2;
import s1.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lz1/a;", "", "Ls1/n;", "<anonymous>", "(Lo53/b0;)Lz1/a;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 150}, m = "invokeSuspend", v = 1)
public final class l extends v13.i implements e23.p<b0, t13.d<? super a<Float, s1.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f200842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f200843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f200844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f200845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f200846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o2 f200847f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(o oVar, float f14, e23.l<? super Float, Unit> lVar, o2 o2Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f200844c = oVar;
        this.f200845d = f14;
        this.f200846e = lVar;
        this.f200847f = o2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f200844c, this.f200845d, this.f200846e, this.f200847f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a<Float, s1.n>> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [z1.k] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        final o0 o0Var;
        Object objC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200843b;
        final e23.l<Float, Unit> lVar = this.f200846e;
        o oVar = this.f200844c;
        if (i14 == 0) {
            o13.r.b(obj);
            y<Float> yVar = oVar.f200855b;
            float f14 = this.f200845d;
            float fB = oVar.f200854a.b(f14, s1.v.b(yVar, 0.0f, f14));
            if (Float.isNaN(fB)) {
                b2.e.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            o0Var = new o0();
            float fSignum = Math.signum(f14) * Math.abs(fB);
            o0Var.f105806a = fSignum;
            lVar.invoke(new Float(fSignum));
            float f15 = o0Var.f105806a;
            final int i15 = 0;
            ?? r14 = new e23.l() { // from class: z1.k
                @Override // e23.l
                public final Object invoke(Object obj2) {
                    int i16 = i15;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (i16) {
                        case 0:
                            o0 o0Var2 = o0Var;
                            float f16 = o0Var2.f105806a - fFloatValue;
                            o0Var2.f105806a = f16;
                            lVar.invoke(Float.valueOf(f16));
                            break;
                        default:
                            o0 o0Var3 = o0Var;
                            float f17 = o0Var3.f105806a - fFloatValue;
                            o0Var3.f105806a = f17;
                            lVar.invoke(Float.valueOf(f17));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.f200842a = o0Var;
            this.f200843b = 1;
            objC = o.c(this.f200844c, this.f200847f, f15, this.f200845d, r14, this);
            if (objC != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o0 o0Var2 = this.f200842a;
        o13.r.b(obj);
        o0Var = o0Var2;
        objC = obj;
        s1.m mVar = (s1.m) objC;
        float fA = oVar.f200854a.a(((Number) mVar.a()).floatValue());
        if (Float.isNaN(fA)) {
            b2.e.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        o0Var.f105806a = fA;
        s1.m mVarD = s1.v.d(mVar, 0.0f, 0.0f, 30);
        s1.k<Float> kVar = oVar.f200856c;
        final int i16 = 1;
        e23.l lVar2 = new e23.l() { // from class: z1.k
            @Override // e23.l
            public final Object invoke(Object obj2) {
                int i17 = i16;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i17) {
                    case 0:
                        o0 o0Var3 = o0Var;
                        float f16 = o0Var3.f105806a - fFloatValue;
                        o0Var3.f105806a = f16;
                        lVar.invoke(Float.valueOf(f16));
                        break;
                    default:
                        o0 o0Var4 = o0Var;
                        float f17 = o0Var4.f105806a - fFloatValue;
                        o0Var4.f105806a = f17;
                        lVar.invoke(Float.valueOf(f17));
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        this.f200842a = null;
        this.f200843b = 2;
        Object objB = s.b(this.f200847f, fA, fA, mVarD, kVar, lVar2, this);
        return objB == aVar ? aVar : objB;
    }
}
