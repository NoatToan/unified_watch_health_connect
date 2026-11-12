package sm2;

import bd0.c0;
import com.garmin.device.datatypes.DeviceProfile;
import o53.b0;
import o53.e1;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm2/g;", "", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f160297a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f160298b = LoggerFactory.getLogger("ConfigurePermissionsUtil");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.setup.operations.ConfigurePermissionsUtil$sendSettings$1", f = "ConfigurePermissionsUtil.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rs2.c f160299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qm2.l f160300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rs2.c cVar, qm2.l lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160299a = cVar;
            this.f160300b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160299a, this.f160300b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            new e(this.f160299a, this.f160300b).c();
            return Unit.INSTANCE;
        }
    }

    private g() {
    }

    public static final boolean a(DeviceProfile deviceProfile) {
        deviceProfile.getClass();
        lm2.e eVarD = lm2.h.d();
        String strValueOf = String.valueOf(deviceProfile.getF92744h());
        f160297a.getClass();
        b(deviceProfile);
        qm2.m mVar = ((c0) eVarD).b(strValueOf).f145759a.f145780a.get(1);
        if ((mVar == null || mVar.f145778a == qm2.l.c.RESPECT_PERMISSION) && lm2.h.f113619b) {
            x53.c cVar = s0.f129406a;
            return ((Boolean) ge1.b.W(x53.b.f189152a, new f(deviceProfile, null))).booleanValue();
        }
        if ((mVar != null ? mVar.f145778a : null) != qm2.l.c.ALWAYS_ON) {
            if ((mVar != null ? mVar.f145778a : null) == qm2.l.c.ALWAYS_OFF) {
                return false;
            }
            if ((mVar != null ? mVar.f145779b : null) != null) {
                return mVar.f145779b.booleanValue();
            }
        }
        return true;
    }

    public static boolean b(rs2.c cVar) {
        if (cVar instanceof DeviceProfile) {
            return ((DeviceProfile) cVar).getConnectionType() != 2;
        }
        if (cVar instanceof bm2.d) {
            return ((bm2.d) cVar).getConnectionType() != 2;
        }
        return !cVar.getF92743g();
    }

    public static final Boolean c(rs2.c cVar) {
        cVar.getClass();
        lm2.e eVarD = lm2.h.d();
        String strValueOf = String.valueOf(cVar.getF92744h());
        f160297a.getClass();
        b(cVar);
        return e.b(3, ((c0) eVarD).b(strValueOf));
    }

    public static final void d(rs2.c cVar) {
        cVar.getClass();
        lm2.e eVarD = lm2.h.d();
        String strValueOf = String.valueOf(cVar.getF92744h());
        f160297a.getClass();
        b(cVar);
        qm2.l lVarB = ((c0) eVarD).b(strValueOf);
        e1 e1Var = e1.f129333a;
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(e1Var, x53.b.f189152a, null, new a(cVar, lVarB, null), 2);
    }

    @o13.e
    public static final void e(DeviceProfile deviceProfile, int i14, boolean z14) {
        lm2.e eVarD = lm2.h.d();
        String strValueOf = String.valueOf(deviceProfile.getF92744h());
        f160297a.getClass();
        b(deviceProfile);
        qm2.l lVarB = ((c0) eVarD).b(strValueOf);
        e1 e1Var = e1.f129333a;
        x53.c cVar = s0.f129406a;
        ge1.b.T(e1Var, x53.b.f189152a, null, new i(deviceProfile, lVarB, i14, z14, null), 2);
    }
}
