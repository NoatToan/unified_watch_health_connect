package gv0;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$getContactById$2", f = "LiveTrackSettingsViewModel.kt", l = {449}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f79324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f79325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d dVar, String str, boolean z14, t13.d<? super m> dVar2) {
        super(2, dVar2);
        this.f79323b = dVar;
        this.f79324c = str;
        this.f79325d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f79323b, this.f79324c, this.f79325d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        g3 g3VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79322a;
        d dVar = this.f79323b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = dVar.f79191i;
            do {
                value = p2Var.getValue();
                g3.f35298f.getClass();
            } while (!p2Var.b(value, g3.a.b(null)));
            this.f79322a = 1;
            obj = dVar.E4(this.f79324c, this.f79325d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        pu0.b bVar = (pu0.b) obj;
        p2 p2Var2 = dVar.f79191i;
        do {
            value2 = p2Var2.getValue();
            if (bVar != null) {
                g3.f35298f.getClass();
                g3VarA = g3.a.d(bVar);
            } else {
                g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
            }
        } while (!p2Var2.b(value2, g3VarA));
        return Unit.INSTANCE;
    }
}
