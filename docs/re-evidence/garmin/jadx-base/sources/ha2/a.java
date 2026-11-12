package ha2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import e23.p;
import java.util.Set;
import java.util.Timer;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.l0;
import rs2.v;
import rs2.x;
import rs2.y;
import t13.d;
import t13.g;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lha2/a;", "Lfa2/a;", "Lha2/a$a;", "callback", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lt13/g;", "coroutineContext", "<init>", "(Lha2/a$a;Landroid/content/Context;Lt13/g;)V", "a", "b", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a extends fa2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f82703k = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1635a f82704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f82705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ha2.c f82706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f82707j;

    /* JADX INFO: renamed from: ha2.a$a, reason: collision with other inner class name */
    public interface InterfaceC1635a {
        void a(rs2.c cVar);

        void b(rs2.c cVar);

        void c(rs2.c cVar);

        void d(rs2.c cVar);

        void e(rs2.c cVar);

        void f(rs2.c cVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @e(c = "com.garmin.android.deviceinterface.capabilities.impl.battery.BatteryStatusDataHandler$onMessageReceived$1", f = "BatteryStatusDataHandler.kt", l = {72}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f82709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f82710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x xVar, a aVar, d<? super c> dVar) {
            super(2, dVar);
            this.f82709b = xVar;
            this.f82710c = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(this.f82709b, this.f82710c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82708a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    x xVar = this.f82709b;
                    y yVar = y.ACK;
                    this.f82708a = 1;
                    if (xVar.b(yVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                int i15 = a.f82703k;
                this.f82710c.b().warn("Failed to send battery status response", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC1635a interfaceC1635a, Context context, g gVar) {
        super("BatteryStatusDataHandler", gVar);
        interfaceC1635a.getClass();
        context.getClass();
        gVar.getClass();
        this.f82704g = interfaceC1635a;
        this.f82705h = context.getApplicationContext();
    }

    @Override // fa2.a, rs2.h
    public final void close(String str) {
        str.getClass();
        super.close(str);
        e();
    }

    public final void e() {
        ha2.c cVar = this.f82706i;
        if (cVar != null) {
            cVar.cancel();
        }
        this.f82706i = null;
        Timer timer = this.f82707j;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.f82707j;
        if (timer2 != null) {
            timer2.purge();
        }
        this.f82707j = null;
        b().trace("Timer Stopped");
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) {
        bArr.getClass();
        ge1.b.T(this.f70164c, null, null, new c(xVar, this, null), 3);
        if (bArr.length < 6) {
            b().warn("Received invalid battery status message");
            return;
        }
        int i15 = bArr[2] & UnsignedBytes.MAX_VALUE;
        if (i15 <= 15) {
            b().error("Got battery status message. Capacity is " + i15);
        } else {
            b().info("Got battery status message. Capacity is " + i15);
        }
        int i16 = bArr[0] & 112;
        InterfaceC1635a interfaceC1635a = this.f82704g;
        if (i16 == 16) {
            interfaceC1635a.a(a());
            return;
        }
        if (i16 == 32) {
            interfaceC1635a.b(a());
            return;
        }
        if (i16 == 48) {
            interfaceC1635a.c(a());
            return;
        }
        if (i16 == 64) {
            interfaceC1635a.f(a());
        } else if (i16 == 80) {
            interfaceC1635a.d(a());
        } else {
            if (i16 != 112) {
                return;
            }
            interfaceC1635a.e(a());
        }
    }

    @Override // fa2.a, rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        super.start(cVar, vVar);
        ((us2.b) vVar).d(5023, this);
        e();
        Timer timer = new Timer();
        this.f82707j = timer;
        Context context = this.f82705h;
        context.getClass();
        ha2.c cVar2 = new ha2.c(context, a().getF92741e(), new ha2.b(this));
        this.f82706i = cVar2;
        timer.scheduleAtFixedRate(cVar2, 0L, 600000L);
        b().trace("Timer Started");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lha2/a$b;", "", "<init>", "()V", "", "BATTERY_STATUS_CRITICAL", "I", "BATTERY_STATUS_GOOD", "BATTERY_STATUS_INVALID", "BATTERY_STATUS_LOW", "BATTERY_STATUS_MASK", "BATTERY_STATUS_MESSAGE_ID", "BATTERY_STATUS_NEW", "BATTERY_STATUS_OK", "", "TAG", "Ljava/lang/String;", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public a(InterfaceC1635a interfaceC1635a, Context context, g gVar, int i14, j jVar) {
        this(interfaceC1635a, context, (i14 & 4) != 0 ? s0.f129406a : gVar);
    }
}
