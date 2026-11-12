package lc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llc0/g;", "", "Lda2/i;", "connectedDeviceRegistry", "<init>", "(Lda2/i;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da2.i f111937a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lc0/g$b", "Lea2/a$c;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ea2.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f111938a;

        public b(String str) {
            this.f111938a = str;
        }

        @Override // ea2.a.c
        public final void a() {
            String strN = fb1.c.n("Failed to initiate software update for device with MAC address ", this.f111938a);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "InitiateDeviceSoftwareUpdateUseCase", strN);
        }

        @Override // ea2.a.c
        public final void b() {
            String strN = fb1.c.n("Software update initiated for device with MAC address ", this.f111938a);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "InitiateDeviceSoftwareUpdateUseCase", strN);
        }
    }

    static {
        new a(null);
    }

    public g(da2.i iVar) {
        iVar.getClass();
        this.f111937a = iVar;
    }

    public final Object a(String str) {
        str.getClass();
        String strConcat = "Attempting to initiate software update for device with MAC address ".concat(str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "InitiateDeviceSoftwareUpdateUseCase", strConcat);
        try {
            int i14 = q.f128596b;
            ea2.a aVar2 = (ea2.a) this.f111937a.getCapability(str, ea2.a.class);
            if (aVar2 != null) {
                aVar2.initiateRemoteDeviceSoftwareUpdate(new b(str));
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            return new q.b(th3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llc0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
