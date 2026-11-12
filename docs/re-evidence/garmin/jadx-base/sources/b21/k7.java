package b21;

import android.content.Context;
import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$NutritionSettingsGraphContainer$1$1", f = "NutritionSettingsNav.kt", l = {611}, m = "invokeSuspend", v = 2)
public final class k7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q21.r f14800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<q21.q> f14802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f14803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f14804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q21.r f14805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(p3.x3<q21.q> x3Var, fe feVar, Context context, q21.r rVar, t13.d<? super k7> dVar) {
        super(2, dVar);
        this.f14802c = x3Var;
        this.f14803d = feVar;
        this.f14804e = context;
        this.f14805f = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k7(this.f14802c, this.f14803d, this.f14804e, this.f14805f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q21.r rVar;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f14801b;
        if (i14 == 0) {
            o13.r.b(obj);
            Integer num = this.f14802c.getF182175a().f142283f;
            if (num != null) {
                String string = this.f14804e.getString(num.intValue());
                string.getClass();
                q21.r rVar2 = this.f14805f;
                this.f14800a = rVar2;
                this.f14801b = 1;
                if (l72.d3.c(this.f14803d, string, null, this) == aVar) {
                    return aVar;
                }
                rVar = rVar2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rVar = this.f14800a;
        o13.r.b(obj);
        r53.p2 p2Var = rVar.f142295h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, q21.q.a((q21.q) value, false, false, null, null, false, null, false, false, null, 479)));
        return Unit.INSTANCE;
    }
}
