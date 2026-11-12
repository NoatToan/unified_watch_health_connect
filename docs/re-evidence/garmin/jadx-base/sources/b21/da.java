package b21;

import android.content.Context;
import i3.fe;
import i3.se;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$18$1$2$1", f = "NutritionSetupNav.kt", l = {1027}, m = "invokeSuspend", v = 2)
public final class da extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f14624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f14625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u21.t f14626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.s> f14628f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(fe feVar, Context context, u21.t tVar, lc.m0 m0Var, p3.x3<u21.s> x3Var, t13.d<? super da> dVar) {
        super(2, dVar);
        this.f14624b = feVar;
        this.f14625c = context;
        this.f14626d = tVar;
        this.f14627e = m0Var;
        this.f14628f = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new da(this.f14624b, this.f14625c, this.f14626d, this.f14627e, this.f14628f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((da) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f14623a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f14628f.getF182175a().f168126o) {
                c22.x0.f23314a.getClass();
                String strD = dh.b.D(this.f14625c, c22.x0.f23747zf);
                String str = c22.x0.De;
                str.getClass();
                String strF = c22.g2.f(str);
                this.f14623a = 1;
                obj = l72.d3.c(this.f14624b, strD, strF, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        se seVar = (se) obj;
        this.f14626d.z4();
        if (seVar == se.ActionPerformed) {
            lc.y.l(this.f14627e, c.f.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
