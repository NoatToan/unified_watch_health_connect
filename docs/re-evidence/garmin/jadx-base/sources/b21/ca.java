package b21;

import android.content.Context;
import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$18$1$1$1", f = "NutritionSetupNav.kt", l = {1020}, m = "invokeSuspend", v = 2)
public final class ca extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u21.t f14591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<u21.s> f14593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f14594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f14595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u21.t f14596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(p3.x3<u21.s> x3Var, fe feVar, Context context, u21.t tVar, t13.d<? super ca> dVar) {
        super(2, dVar);
        this.f14593c = x3Var;
        this.f14594d = feVar;
        this.f14595e = context;
        this.f14596f = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ca(this.f14593c, this.f14594d, this.f14595e, this.f14596f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ca) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u21.t tVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f14592b;
        if (i14 == 0) {
            o13.r.b(obj);
            Integer num = this.f14593c.getF182175a().f168127p;
            if (num != null) {
                String string = this.f14595e.getString(num.intValue());
                string.getClass();
                u21.t tVar2 = this.f14596f;
                this.f14591a = tVar2;
                this.f14592b = 1;
                if (l72.d3.c(this.f14594d, string, null, this) == aVar) {
                    return aVar;
                }
                tVar = tVar2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tVar = this.f14591a;
        o13.r.b(obj);
        tVar.B4();
        return Unit.INSTANCE;
    }
}
