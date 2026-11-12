package ha2;

import e23.p;
import java.io.ByteArrayOutputStream;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.v;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lha2/b;", "Lha2/c$a;", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ha2.a f82711a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @e(c = "com.garmin.android.deviceinterface.capabilities.impl.battery.BatteryStatusDataHandler$startTimer$batteryStatusTask$1$onBatteryStatus$1", f = "BatteryStatusDataHandler.kt", l = {127}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f82713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ha2.a f82714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i14, ha2.a aVar, d<? super a> dVar) {
            super(2, dVar);
            this.f82713b = i14;
            this.f82714c = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f82713b, this.f82714c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82712a;
            ha2.a aVar2 = this.f82714c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(255);
                    byteArrayOutputStream.write(0);
                    byteArrayOutputStream.write(255 & this.f82713b);
                    byteArrayOutputStream.write(new byte[]{-1, -1, -1});
                    int i15 = ha2.a.f82703k;
                    v vVar = aVar2.f70166e;
                    if (vVar == null) {
                        s.m("messenger");
                        throw null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    this.f82712a = 1;
                    if (vVar.b(5023, byteArray, this) == aVar) {
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
                int i16 = ha2.a.f82703k;
                aVar2.b().warn("Failed to send battery status message", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    public b(ha2.a aVar) {
        this.f82711a = aVar;
    }

    @Override // ha2.c.a
    public final void a(int i14) {
        int i15 = ha2.a.f82703k;
        ha2.a aVar = this.f82711a;
        ge1.b.T(aVar.f70164c, null, null, new a(i14, aVar, null), 3);
    }

    @Override // ha2.c.a
    public final void b() {
        int i14 = ha2.a.f82703k;
        this.f82711a.e();
    }
}
