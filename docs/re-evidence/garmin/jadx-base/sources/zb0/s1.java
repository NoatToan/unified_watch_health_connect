package zb0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lzb0/s1;", "Lma2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpj2/k;", "gatt", "Lrs2/u;", "hostConfig", "<init>", "(Landroid/content/Context;Lpj2/k;Lrs2/u;)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s1 implements ma2.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f203658g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pj2.k f203659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs2.u f203660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f203661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f203662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f203663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DeviceManager f203664f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzb0/s1$b;", "Lma2/f$a;", "Lrs2/u;", "hostConfig", "<init>", "(Lrs2/u;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ma2.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rs2.u f203665a;

        public b(rs2.u uVar) {
            uVar.getClass();
            this.f203665a = uVar;
        }

        @Override // ma2.f.a
        public final ma2.f create(Context context, da2.e eVar, pj2.k kVar) {
            context.getClass();
            eVar.getClass();
            kVar.getClass();
            return new s1(context, kVar, this.f203665a, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.VivokiServiceSubscriber$initialize$1", f = "VivokiServiceSubscriber.kt", l = {63, 65}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public rs2.e f203666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f203667b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DeviceManager f203669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f203670e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeviceManager deviceManager, String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f203669d = deviceManager;
            this.f203670e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s1.this.new c(this.f203669d, this.f203670e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        
            if (r15 == r1) goto L23;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th3;
            c cVar;
            rs2.e eVar;
            rs2.e eVar2;
            rs2.i.a aVar;
            PipedInputStream pipedInputStream;
            PipedOutputStream pipedOutputStream;
            String macAddress;
            rs2.u uVar;
            rs2.i.b bVar;
            DeviceManager deviceManager = this.f203669d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f203667b;
            s1 s1Var = s1.this;
            try {
                if (i14 != 0) {
                    try {
                        if (i14 == 1) {
                            eVar = this.f203666a;
                            o13.r.b(obj);
                        } else {
                            if (i14 != 2) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o13.r.b(obj);
                            cVar = this;
                        }
                        deviceManager.setGfdiDevice((rs2.i) obj);
                        DeviceProfile profile = deviceManager.getProfile();
                        if (profile != null) {
                            da2.h.b(profile);
                        }
                    } catch (Throwable th4) {
                        th3 = th4;
                        cVar = this;
                        s1Var.f203661c.error("Failed to create Vivoki GfdiDevice", th3);
                        da2.h.c(cVar.f203670e, "Failed to create Vivoki GfdiDevice");
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                eVar = new rs2.e(0, Long.MAX_VALUE);
                try {
                    uk.k.b bVar2 = uk.k.f171687m;
                    Context context = s1Var.f203662d;
                    context.getClass();
                    pj2.k kVar = s1Var.f203659a;
                    this.f203666a = eVar;
                    this.f203667b = 1;
                    obj = bVar2.a(context, kVar, this);
                    if (obj == aVar2) {
                    }
                    return aVar2;
                } catch (Throwable th5) {
                    th = th5;
                    cVar = this;
                    th3 = th;
                    s1Var.f203661c.error("Failed to create Vivoki GfdiDevice", th3);
                    da2.h.c(cVar.f203670e, "Failed to create Vivoki GfdiDevice");
                }
                obj = aVar.b(pipedInputStream, pipedOutputStream, macAddress, uVar, bVar, eVar2, cVar);
            } catch (Throwable th6) {
                th = th6;
                th3 = th;
                s1Var.f203661c.error("Failed to create Vivoki GfdiDevice", th3);
                da2.h.c(cVar.f203670e, "Failed to create Vivoki GfdiDevice");
            }
            eVar2 = eVar;
            uk.k kVar2 = (uk.k) obj;
            aVar = rs2.i.f154387h;
            pipedInputStream = kVar2.f171690c;
            pipedOutputStream = kVar2.f171689b;
            macAddress = s1Var.f203659a.getMacAddress();
            macAddress.getClass();
            uVar = s1Var.f203660b;
            bVar = rs2.i.b.NOTIFY_MISMATCH;
            this.f203666a = null;
            this.f203667b = 2;
            cVar = this;
        }
    }

    private s1(Context context, pj2.k kVar, rs2.u uVar) {
        this.f203659a = kVar;
        this.f203660b = uVar;
        this.f203661c = LoggerFactory.getLogger("Vivoki[" + kVar.getMacAddress() + "]");
        this.f203662d = context.getApplicationContext();
        this.f203663e = o53.c0.a(t13.g.a.C3052a.d(o53.s0.f129406a, ge1.b.h()).plus(new o53.a0(am.j.m("vivoki[", kVar.getMacAddress(), "]"))));
    }

    @Override // ma2.f
    public final boolean initialize(UUID uuid, UUID[] uuidArr) {
        String macAddress = this.f203659a.getMacAddress();
        macAddress.getClass();
        DeviceManager deviceManagerRegister = this.f203664f;
        if (deviceManagerRegister == null) {
            deviceManagerRegister = DeviceManager.register(this.f203662d, macAddress, 1);
        }
        this.f203664f = deviceManagerRegister;
        ge1.b.T(this.f203663e, null, null, new c(deviceManagerRegister, macAddress, null), 3);
        return true;
    }

    @Override // ma2.f
    public final void onDeviceDisconnect() {
        o53.c0.c(this.f203663e, null);
        DeviceManager deviceManager = this.f203664f;
        this.f203664f = null;
        if (deviceManager != null) {
            deviceManager.terminate();
            da2.b bVar = da2.d.c(this.f203662d).f58886a.f111646e;
            bVar.getClass();
            bVar.h(this.f203659a.getMacAddress());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzb0/s1$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ s1(Context context, pj2.k kVar, rs2.u uVar, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, uVar);
    }
}
