package ka2;

import e23.p;
import java.io.IOException;
import java.util.Set;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lka2/a;", "Lfa2/a;", "Lka2/a$a;", "callback", "Lt13/g;", "coroutineContext", "<init>", "(Lka2/a$a;Lt13/g;)V", "a", "b", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a extends fa2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f103750h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1989a f103751g;

    /* JADX INFO: renamed from: ka2.a$a, reason: collision with other inner class name */
    public interface InterfaceC1989a {
        void a(rs2.c cVar, ka2.b bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @e(c = "com.garmin.android.deviceinterface.capabilities.impl.vector.VectorDataHandler$onMessageReceived$1", f = "VectorDataHandler.kt", l = {55}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f103753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f103754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x xVar, a aVar, d<? super c> dVar) {
            super(2, dVar);
            this.f103753b = xVar;
            this.f103754c = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(this.f103753b, this.f103754c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103752a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    x xVar = this.f103753b;
                    y yVar = y.ACK;
                    this.f103752a = 1;
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
            } catch (IOException e4) {
                int i15 = a.f103750h;
                this.f103754c.b().warn("Failed to send Vector Pedal Pairing response", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC1989a interfaceC1989a, g gVar) {
        super("VectorDataHandler", gVar);
        interfaceC1989a.getClass();
        gVar.getClass();
        this.f103751g = interfaceC1989a;
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) {
        bArr.getClass();
        try {
            this.f103751g.a(a(), new ka2.b(bArr));
        } catch (Exception e4) {
            b().error("onVectorPedalPairingMessage callback failed", (Throwable) e4);
        }
        ge1.b.T(this.f70164c, null, null, new c(xVar, this, null), 3);
    }

    @Override // fa2.a, rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        super.start(cVar, vVar);
        ((us2.b) vVar).d(5055, this);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lka2/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "VECTOR_SENSOR_PAIRING_REQUEST_MESSAGE_ID", "I", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public a(InterfaceC1989a interfaceC1989a, g gVar, int i14, j jVar) {
        this(interfaceC1989a, (i14 & 2) != 0 ? s0.f129406a : gVar);
    }
}
