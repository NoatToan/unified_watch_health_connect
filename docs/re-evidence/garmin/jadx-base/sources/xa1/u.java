package xa1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$updateFTP$1", f = "EditPowerGuideStrategyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Unit>> f189810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PowerZonesDTO f189811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f189812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f189813d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"xa1/u$a", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y0<g3<Unit>> f189814a;

        public a(y0<g3<Unit>> y0Var) {
            this.f189814a = y0Var;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            y0<g3<Unit>> y0Var = this.f189814a;
            if (cVar == cVar2) {
                y0Var.j(g3.a.e(g3.f35298f));
            } else {
                y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Unit unit) {
            eVar.getClass();
            unit.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y0<g3<Unit>> y0Var, PowerZonesDTO powerZonesDTO, int i14, k kVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f189810a = y0Var;
        this.f189811b = powerZonesDTO;
        this.f189812c = i14;
        this.f189813d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f189810a, this.f189811b, this.f189812c, this.f189813d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g3<Unit> g3VarC = g3.a.c(g3.f35298f);
        y0<g3<Unit>> y0Var = this.f189810a;
        y0Var.j(g3VarC);
        ok1.a aVar2 = ok1.a.f132581a;
        PowerZonesDTO powerZonesDTO = this.f189811b;
        powerZonesDTO.getClass();
        powerZonesDTO.f43987b = this.f189812c;
        ok1.a.d(powerZonesDTO);
        a aVar3 = new a(y0Var);
        ok1.b bVar = new ok1.b();
        bVar.f132582a = powerZonesDTO;
        this.f189813d.f189757f.l(bVar, aVar3);
        return Unit.INSTANCE;
    }
}
