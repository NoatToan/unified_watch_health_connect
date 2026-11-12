package l02;

import e2.i0;
import e2.n;
import e23.p;
import h2.j0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p13.h0;
import p3.n1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.pager.GCHorizontalPagerIndicatorKt$GCHorizontalPagerIndicator$1", f = "GCHorizontalPagerIndicator.kt", l = {87, 89}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f107939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f107940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f107941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f107942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f107943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f107944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f107945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1 f107946i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j0 j0Var, i0 i0Var, int i14, o0 o0Var, float f14, float f15, float f16, n1 n1Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f107939b = j0Var;
        this.f107940c = i0Var;
        this.f107941d = i14;
        this.f107942e = o0Var;
        this.f107943f = f14;
        this.f107944g = f15;
        this.f107945h = f16;
        this.f107946i = n1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f107939b, this.f107940c, this.f107941d, this.f107942e, this.f107943f, this.f107944g, this.f107945h, this.f107946i, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (e2.i0.f(r1, r12 - 3, r11) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (e2.i0.f(r1, r5, r11) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float intValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107938a;
        if (i14 == 0) {
            r.b(obj);
            int iL = this.f107939b.l();
            i0 i0Var = this.f107940c;
            n nVar = (n) h0.n0(i0Var.j().e());
            int f62559a = nVar != null ? nVar.getF62559a() : 0;
            int iH = i0Var.h();
            int i15 = this.f107941d;
            int i16 = (iH == 0 || f62559a == i15 + (-1)) ? 1 : 2;
            n1 n1Var = this.f107946i;
            n1Var.t(i16);
            float f14 = this.f107943f;
            float f15 = this.f107944g;
            if (i15 == 5) {
                float f16 = 5;
                g6.f.a aVar2 = g6.f.f75994b;
                intValue = (f15 * 2 * f16) + (f14 * f16);
            } else if (i15 > 5) {
                float intValue2 = f14 * (5 - n1Var.getIntValue());
                g6.f.a aVar3 = g6.f.f75994b;
                intValue = (f15 * 2 * 5) + (this.f107945h * n1Var.getIntValue()) + intValue2;
            } else {
                g6.f.a aVar4 = g6.f.f75994b;
                intValue = (f14 + (f15 * 2)) * i15;
            }
            this.f107942e.f105806a = intValue;
            if (iL > iH + 3) {
                this.f107938a = 1;
            } else if (iL <= iH + 1) {
                int i17 = iL - 1;
                int i18 = i17 >= 0 ? i17 : 0;
                this.f107938a = 2;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
