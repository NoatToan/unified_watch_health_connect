package nd0;

import am.j;
import c22.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import j90.l;
import j90.m;
import java.io.File;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import v13.i;
import vb.h;
import xv.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lj90/l;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.device.setup.customization.SpeedSensorRepositoryImpl$speedSensorFileEvent$1", f = "SpeedSensorRepositoryImpl.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<t<? super l>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f125398c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nd0/d$a", "Lxv/f;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<l> f125399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f125400b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super l> tVar, c cVar) {
            this.f125399a = tVar;
            this.f125400b = cVar;
        }

        @Override // xv.f
        public final void fileFetchComplete(xv.c cVar) {
            cVar.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            int i14 = cVar.f192265a;
            String strH = j.h(i14, "Received fileFetchCompleteEvent: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SpeedSensorUpdateUseCaseImpl", strH);
            int i15 = c.f125393c;
            this.f125400b.getClass();
            this.f125399a.i(i14 == 0 ? new l.a(new m.b(null)) : new l.a(new m.a(Integer.valueOf(R.string.txt_something_went_wrong_try_again))));
        }

        @Override // xv.f
        public final void fileTransferComplete(xv.d dVar) {
            dVar.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            int i14 = dVar.f192266a;
            String strH = j.h(i14, "Received fileTransferCompleteEvent: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SpeedSensorUpdateUseCaseImpl", strH);
            int i15 = c.f125393c;
            this.f125400b.getClass();
            this.f125399a.i(i14 == 0 ? new l.b(new m.b(Integer.valueOf(R.string.settings_saved_message))) : new l.b(new m.a(Integer.valueOf(R.string.txt_something_went_wrong_try_again))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f125398c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f125398c, dVar);
        dVar2.f125397b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(t<? super l> tVar, t13.d<? super Unit> dVar) {
        return ((d) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f125397b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125396a;
        if (i14 == 0) {
            r.b(obj);
            c cVar = this.f125398c;
            a aVar2 = new a(tVar, cVar);
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.b(aVar2);
            zv.d dVar = cVar.f125395b;
            if (dVar != null) {
                File file = new File(dVar.f207143d.get().getFilesDir(), "/downloads");
                hk0.d.h().f(u1.a(dVar.f207142c), 25, file.getParent(), "settings.fit", new zv.b(dVar));
                Unit unit = Unit.INSTANCE;
            }
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SpeedSensorUpdateUseCaseImpl", "fetchDeviceSettings() called in speedSensorFileEvent()");
            n82.i iVar = new n82.i(aVar2, 3);
            this.f125397b = null;
            this.f125396a = 1;
            if (q53.r.a(tVar, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
