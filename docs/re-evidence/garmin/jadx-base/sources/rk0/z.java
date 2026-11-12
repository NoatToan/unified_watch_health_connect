package rk0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import l72.d3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsScreenKt$GearDetailsScreen$17$1", f = "GearDetailsScreen.kt", l = {231}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f153328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f153329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f153330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f153331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, Context context, fe feVar, h0 h0Var, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f153328b = g0Var;
        this.f153329c = context;
        this.f153330d = feVar;
        this.f153331e = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f153328b, this.f153329c, this.f153330d, this.f153331e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153327a;
        if (i14 == 0) {
            o13.r.b(obj);
            g0 g0Var = this.f153328b;
            l lVar = g0Var.f153133f;
            if (lVar != null) {
                uk0.r rVar = uk0.r.f171870a;
                f0 f0Var = g0Var.f153128a;
                String str = f0Var.f153105e;
                String str2 = f0Var.f153106f;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = f0Var.f153107g;
                rVar.getClass();
                Context context = this.f153329c;
                String string = context.getString(R.string.item_removed_from_group, uk0.r.a(context, str, str2, str3), lVar.f153209a);
                string.getClass();
                this.f153327a = 1;
                if (d3.c(this.f153330d, string, null, this) == aVar) {
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
        p2 p2Var = this.f153331e.f153149d;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, g0.a((g0) value, null, null, null, null, null, null, false, false, 223)));
        return Unit.INSTANCE;
    }
}
