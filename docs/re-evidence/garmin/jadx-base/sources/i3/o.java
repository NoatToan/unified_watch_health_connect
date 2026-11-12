package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {823, 826}, m = "invokeSuspend")
public final class o extends v13.i implements e23.l<t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f89112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f89113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f89115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, float f14, boolean z14, s1.k<Float> kVar, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f89112b = pVar;
        this.f89113c = f14;
        this.f89114d = z14;
        this.f89115e = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f89112b, this.f89113c, this.f89114d, this.f89115e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Object> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r15.g(r1, r14) == r0) goto L34;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f89111a;
        if (i14 == 0) {
            o13.r.b(obj);
            p pVar = this.f89112b;
            ri riVar = pVar.f89247a;
            ri riVar2 = pVar.f89247a;
            int iC = riVar.c();
            qi.f89469b.getClass();
            float f14 = this.f89113c;
            if (iC == 0) {
                double d14 = ((double) 0.2617994f) + 1.5707963267948966d;
                double d15 = 0.5235988f;
                float f15 = ((((int) ((((double) f14) + d14) / d15)) % 12) % 12) * 0.5235988f;
                pVar.f89250d = f15;
                riVar2.e(((((int) ((((double) f15) + d14) / d15)) % 12) % 12) + (bi.w(pVar) ? 12 : 0));
            } else {
                double d16 = ((double) 0.05235988f) + 1.5707963267948966d;
                double d17 = 0.10471976f;
                float f16 = (((int) ((((double) f14) + d16) / d17)) % 60) * 0.10471976f;
                pVar.f89251e = f16;
                riVar2.f(((int) ((((double) f16) + d16) / d17)) % 60);
            }
            if (this.f89114d) {
                float f17 = f14 + 1.5707964f;
                if (f17 < 0.0f) {
                    f17 += 6.2831855f;
                }
                float fH = pVar.h(f17);
                s1.b<Float, s1.n> bVar = pVar.f89252f;
                Float f18 = new Float(fH);
                this.f89111a = 2;
                Object objC = s1.b.c(bVar, f18, this.f89115e, null, this, 12);
                if (objC != aVar) {
                    return objC;
                }
            } else {
                s1.b<Float, s1.n> bVar2 = pVar.f89252f;
                float f19 = f14 + 1.5707964f;
                if (f19 < 0.0f) {
                    f19 += 6.2831855f;
                }
                Float f22 = new Float(f19);
                this.f89111a = 1;
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        return Unit.INSTANCE;
    }
}
