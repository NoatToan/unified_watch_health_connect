package gv0;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$loadContactForChangeMethod$1", f = "LiveTrackSettingsViewModel.kt", l = {473}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f79361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d dVar, String str, t13.d<? super q> dVar2) {
        super(2, dVar2);
        this.f79360b = dVar;
        this.f79361c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f79360b, this.f79361c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        g3 g3VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79359a;
        d dVar = this.f79360b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = dVar.f79198o;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, g3.a.c(g3.f35298f)));
            this.f79359a = 1;
            obj = dVar.E4(this.f79361c, false, this);
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
        p2 p2Var2 = dVar.f79198o;
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
