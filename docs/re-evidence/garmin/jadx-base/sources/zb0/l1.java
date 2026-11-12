package zb0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzb0/l1;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f203565a = new l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f203566b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zb0/l1$a", "Lla2/a;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements la2.a {

        /* JADX INFO: renamed from: zb0.l1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.SystemBondingLostEventHandler$deviceConnectionCallback$1$onDeviceConnectingFailure$1", f = "SystemBondingLostEventHandler.kt", l = {53}, m = "invokeSuspend", v = 2)
        public static final class C3801a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f203567a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f203568b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ la2.c f203569c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3801a(la2.c cVar, t13.d<? super C3801a> dVar) {
                super(2, dVar);
                this.f203569c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3801a c3801a = new C3801a(this.f203569c, dVar);
                c3801a.f203568b = obj;
                return c3801a;
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3801a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f203567a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    rd2.j jVar = rd2.f.a().f152045a;
                    String str = this.f203569c.f111633a;
                    jVar.getClass();
                    sd2.j jVarF = rd2.j.f(str);
                    a2 a2Var = a2.DEVICES;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "SystemBondingLostEventHandler", "onDeviceConnectingFailure device " + jVarF);
                    if (jVarF != null) {
                        l1 l1Var = l1.f203565a;
                        String strValueOf = String.valueOf(jVarF.f158686c);
                        l1Var.getClass();
                        i2.a.b(a2Var, "SystemBondingLostEventHandler", "addSystemBondingLostDevice " + strValueOf);
                        f12.l.f68084a.getClass();
                        Set<String> setF1 = p13.h0.f1(f12.l.a.a().L1("SystemBondingLostDeviceIds"));
                        setF1.add(strValueOf);
                        f12.l.a.a().X1("SystemBondingLostDeviceIds", setF1);
                        i2.a.b(a2Var, "SystemBondingLostEventHandler", "addSystemBondingLostDevice updated cache " + setF1);
                        ed0.a aVar2 = ed0.a.f63825a;
                        this.f203568b = null;
                        this.f203567a = 1;
                        if (aVar2.l("SystemBondingLostEventHandler", this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            a2 a2Var = a2.DEVICES;
            DeviceProfile deviceProfile = bVar.f111632a;
            String str = "onDeviceConnected macAddress:" + deviceProfile.getMacAddress() + StringUtils.SPACE + bVar;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SystemBondingLostEventHandler", str);
            l1 l1Var = l1.f203565a;
            String strValueOf = String.valueOf(deviceProfile.getF172494b());
            l1Var.getClass();
            l1.a(strValueOf);
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICES, "SystemBondingLostEventHandler", "onDeviceConnectingFailure " + cVar);
            if (cVar.f111634b == la2.i.SYSTEM_BONDING_LOST) {
                x53.c cVar2 = o53.s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a.plus(new o53.a0("SystemBondingLostEventHandler.onDeviceConnectingFailure"))), null, null, new C3801a(cVar, null), 3);
            }
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            a2 a2Var = a2.DEVICES;
            String str = "onDeviceDisconnected macAddress:" + hVar.f111673a.getMacAddress() + StringUtils.SPACE + hVar;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SystemBondingLostEventHandler", str);
        }
    }

    private l1() {
    }

    public static void a(String str) {
        str.getClass();
        f12.l.f68084a.getClass();
        Set<String> setF1 = p13.h0.f1(f12.l.a.a().L1("SystemBondingLostDeviceIds"));
        if (setF1.contains(str)) {
            a2 a2Var = a2.DEVICES;
            String strConcat = "removeSystemBondingLostDevice ".concat(str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SystemBondingLostEventHandler", strConcat);
            setF1.remove(str);
            f12.l.a.a().X1("SystemBondingLostDeviceIds", setF1);
            i2.a.b(a2Var, "SystemBondingLostEventHandler", "removeSystemBondingLostMacAddress updated cache " + setF1);
        }
    }
}
