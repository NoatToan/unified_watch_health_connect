package am2;

import android.bluetooth.BluetoothAdapter;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.concurrent.ConcurrentHashMap;
import jc2.f;
import kc2.b;
import kc2.g;
import la2.c;
import la2.h;
import la2.i;
import lm2.d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lam2/a;", "Llm2/d;", "", "bleOnly", "excludeTimeouts", "<init>", "(ZZ)V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f4407d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<String, bm2.d> f4410c = new ConcurrentHashMap<>();

    static {
        new C0069a(null);
        f4407d = LoggerFactory.getLogger("PAIR-OMT#ConnectivityAnalytics");
    }

    public a(boolean z14, boolean z15) {
        this.f4408a = z14;
        this.f4409b = z15;
    }

    public static void a(a aVar, bm2.d dVar, jc2.a aVar2, f fVar, b bVar, Long l14, int i14) {
        if ((i14 & 8) != 0) {
            bVar = null;
        }
        if ((i14 & 16) != 0) {
            l14 = null;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return;
        }
        jc2.b bVarA = aVar.f4408a ? null : jc2.b.NONE;
        if (1 == dVar.getConnectionType()) {
            String strF = dVar.f();
            strF.getClass();
            bVarA = yb2.b.a(strF, defaultAdapter);
        } else if (2 == dVar.getConnectionType() && dVar.getF92743g()) {
            bVarA = null;
        }
        if (bVarA == null) {
            return;
        }
        long f172494b = dVar.getF92746j();
        String f172496d = dVar.getF92742f();
        f172496d.getClass();
        g gVar = new g(f172494b, f172496d, String.valueOf(dVar.getF92744h()), String.valueOf(dVar.getF92745i()));
        f4407d.debug("Sending Connectivity Analytics for event : " + aVar2 + " with resultType: " + fVar + " for macAddress: " + dVar.f() + ", error: " + (bVar != null ? bVar.getErrorType() : null));
        Logger logger = yb2.b.f195700a;
        aVar2.getClass();
        fVar.getClass();
        yt2.f.f199669a.getClass();
        jc2.b bVar2 = bVarA;
        yt2.a aVar3 = yt2.f.f199670b;
        if (aVar3 == null) {
            return;
        }
        yb2.b.b(aVar3, aVar2, fVar, bVar2, gVar, l14, bVar);
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onDeviceAuthenticated(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        str.getClass();
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        DeviceProfile deviceProfile = bVar.f111632a;
        bm2.d dVar = new bm2.d(deviceProfile);
        this.f4410c.put(deviceProfile.getMacAddress(), dVar);
        a(this, dVar, jc2.a.GARMIN_DEVICE_HANDSHAKE, f.SUCCESS, null, null, 24);
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(c cVar) {
        f fVar;
        i iVar = cVar.f111634b;
        bm2.d dVar = this.f4410c.get(cVar.f111633a);
        if (dVar == null) {
            return;
        }
        if (!cVar.b()) {
            fVar = f.FAILURE;
        } else if (this.f4409b) {
            return;
        } else {
            fVar = f.ABORT;
        }
        f fVar2 = fVar;
        a(this, dVar, jc2.a.GARMIN_DEVICE_HANDSHAKE, fVar2, new b(iVar.name(), iVar.name(), "", "", null, 16, null), null, 16);
    }

    @Override // la2.a
    public final void onDeviceDisconnected(h hVar) {
        bm2.d dVar = this.f4410c.get(hVar.f111673a.getMacAddress());
        if (dVar == null) {
            return;
        }
        a(this, dVar, jc2.a.GARMIN_DEVICE_DISCONNECT, f.SUCCESS, null, hVar.f111675c, 8);
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onPasskeyRequired(String str, int i14) {
        str.getClass();
    }

    /* JADX INFO: renamed from: am2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lam2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0069a {
        public /* synthetic */ C0069a(j jVar) {
            this();
        }

        private C0069a() {
        }
    }
}
