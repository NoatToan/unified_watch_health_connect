package ia2;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.common.primitives.UnsignedBytes;
import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.a1;
import rs2.v;
import rs2.x;
import rs2.y;
import t13.d;
import t13.g;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lia2/a;", "Lfa2/a;", "Lia2/a$a;", "callback", "Lt13/g;", "coroutineContext", "<init>", "(Lia2/a$a;Lt13/g;)V", "a", "b", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a extends fa2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SupportedCapability f92441h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1767a f92442g;

    /* JADX INFO: renamed from: ia2.a$a, reason: collision with other inner class name */
    public interface InterfaceC1767a {
        void a(rs2.c cVar, int i14);

        void b(rs2.c cVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @e(c = "com.garmin.android.deviceinterface.capabilities.impl.findmyphone.FindMyPhoneDataHandler$onMessageReceived$1", f = "FindMyPhoneDataHandler.kt", l = {64}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f92444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f92445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x xVar, a aVar, d<? super c> dVar) {
            super(2, dVar);
            this.f92444b = xVar;
            this.f92445c = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(this.f92444b, this.f92445c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92443a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    x xVar = this.f92444b;
                    y yVar = y.ACK;
                    this.f92443a = 1;
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
                SupportedCapability supportedCapability = a.f92441h;
                this.f92445c.b().warn("Failed to send response", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
        f92441h = SupportedCapability.FIND_MY_PHONE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC1767a interfaceC1767a, g gVar) {
        super("FindMyPhoneDataHandler", gVar);
        interfaceC1767a.getClass();
        gVar.getClass();
        this.f92442g = interfaceC1767a;
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return a1.b(Integer.valueOf(f92441h.ordinal()));
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) {
        bArr.getClass();
        InterfaceC1767a interfaceC1767a = this.f92442g;
        if (i14 == 5039) {
            interfaceC1767a.a(a(), bArr[0] & UnsignedBytes.MAX_VALUE);
        } else if (i14 == 5040) {
            interfaceC1767a.b(a());
        }
        ge1.b.T(this.f70164c, null, null, new c(xVar, this, null), 3);
    }

    @Override // fa2.a, rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        super.start(cVar, vVar);
        us2.b bVar = (us2.b) vVar;
        bVar.d(5039, this);
        bVar.d(5040, this);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lia2/a$b;", "", "<init>", "()V", "", "CANCEL_FIND_MY_PHONE_MESSAGE_ID", "I", "FIND_MY_PHONE_MESSAGE_ID", "Lcom/garmin/android/gfdi/configuration/SupportedCapability;", "SUPPORTED_CAPABILITY", "Lcom/garmin/android/gfdi/configuration/SupportedCapability;", "", "TAG", "Ljava/lang/String;", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public a(InterfaceC1767a interfaceC1767a, g gVar, int i14, j jVar) {
        this(interfaceC1767a, (i14 & 2) != 0 ? s0.f129406a : gVar);
    }
}
