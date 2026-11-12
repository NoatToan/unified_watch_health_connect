package s80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import e23.p;
import o13.r;
import o53.b0;
import o53.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeCallbackImpl$sendAppInitiatedPasscodeSetNotification$1", f = "DevicePasscodeCallbackImpl.kt", l = {91}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f157929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f157930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y92.e f157931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f157932e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeCallbackImpl$sendAppInitiatedPasscodeSetNotification$1$1", f = "DevicePasscodeCallbackImpl.kt", l = {97}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y92.e f157933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f157934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f157935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f157936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g f157937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f157938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ y92.e f157939g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, long j8, y92.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157937e = gVar;
            this.f157938f = j8;
            this.f157939g = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f157937e, this.f157938f, this.f157939g, dVar);
            aVar.f157936d = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            DeviceProfile deviceProfile;
            String f92741e;
            long j8;
            y92.e eVar;
            b0 b0Var = (b0) this.f157936d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157935c;
            if (i14 == 0) {
                r.b(obj);
                g gVar = this.f157937e;
                da2.b bVar = (da2.b) gVar.f157925c;
                long j14 = this.f157938f;
                DeviceProfile[] deviceProfileArrA = bVar.a(j14);
                int length = deviceProfileArrA.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        deviceProfile = null;
                        break;
                    }
                    deviceProfile = deviceProfileArrA[i15];
                    if (deviceProfile.getConnectionType() == 1) {
                        break;
                    }
                    i15++;
                }
                if (deviceProfile == null) {
                    deviceProfile = (DeviceProfile) u.H(deviceProfileArrA);
                }
                if (deviceProfile == null || (f92741e = deviceProfile.getF92741e()) == null) {
                    String strE = org.apache.commons.lang3.e.e(j14, "Connection id not found for device unit id ");
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "DevicePasscodeCallback", strE);
                } else {
                    y92.e eVar2 = this.f157939g;
                    y92.b bVar2 = (y92.b) gVar.f157925c.getCapability(f92741e, y92.b.class);
                    if (bVar2 != null) {
                        try {
                            this.f157936d = b0Var;
                            this.f157933a = eVar2;
                            this.f157934b = j14;
                            this.f157935c = 1;
                            if (bVar2.c(eVar2, this) == aVar) {
                                return aVar;
                            }
                            j8 = j14;
                            eVar = eVar2;
                        } catch (Exception e4) {
                            e = e4;
                            j8 = j14;
                            String strN = wr.g.n("Failed to send app initiated passcode set notification for device unit id ", j8, StringUtils.SPACE, e);
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var2, "DevicePasscodeCallback", strN);
                        }
                    } else {
                        String strE2 = org.apache.commons.lang3.e.e(j14, "DevicePasscodeProtobufHandler not found for device unit id ");
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var3, "DevicePasscodeCallback", strE2);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = this.f157934b;
            eVar = this.f157933a;
            try {
                r.b(obj);
            } catch (Exception e14) {
                e = e14;
                String strN2 = wr.g.n("Failed to send app initiated passcode set notification for device unit id ", j8, StringUtils.SPACE, e);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var4, "DevicePasscodeCallback", strN2);
            }
            String str = "App initiated passcode set notification sent for device unit id " + j8 + " devicePasscodeSource " + eVar;
            i2.a aVar6 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var5, "DevicePasscodeCallback", str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j8, y92.e eVar, g gVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f157930c = j8;
        this.f157931d = eVar;
        this.f157932e = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f157930c, this.f157931d, this.f157932e, dVar);
        hVar.f157929b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157928a;
        if (i14 == 0) {
            r.b(obj);
            String str = "Sending app initiated passcode set notification for device unit id: " + this.f157930c + " devicePasscodeSource: " + this.f157931d;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "DevicePasscodeCallback", str);
            g gVar = this.f157932e;
            z zVar = gVar.f157926d;
            a aVar3 = new a(gVar, this.f157930c, this.f157931d, null);
            this.f157929b = null;
            this.f157928a = 1;
            if (ge1.b.e0(zVar, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
