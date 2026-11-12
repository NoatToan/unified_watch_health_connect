package b21;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$5$1$1$1", f = "NutritionSettingsNav.kt", l = {278}, m = "invokeSuspend", v = 2)
public final class r7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f15200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q21.b f15202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<q21.a> f15203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(fe feVar, Context context, q21.b bVar, p3.x3<q21.a> x3Var, t13.d<? super r7> dVar) {
        super(2, dVar);
        this.f15200b = feVar;
        this.f15201c = context;
        this.f15202d = bVar;
        this.f15203e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r7(this.f15200b, this.f15201c, this.f15202d, this.f15203e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15199a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f15203e.getF182175a().f142206e) {
                String string = this.f15201c.getString(R.string.generic_error_message);
                string.getClass();
                this.f15199a = 1;
                if (l72.d3.c(this.f15200b, string, null, this) == aVar) {
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
        r53.p2 p2Var = this.f15202d.f142215f;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, q21.a.a((q21.a) value, null, false, false, false, false, 47)));
        return Unit.INSTANCE;
    }
}
