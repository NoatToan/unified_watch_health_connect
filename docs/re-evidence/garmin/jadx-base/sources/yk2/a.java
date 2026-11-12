package yk2;

import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIFileAccess;
import da2.d;
import ds.e0;
import la2.h;
import lk2.b;
import ok2.a0;
import ok2.e;
import ok2.g;
import ok2.n;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import pk2.x;
import rs2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lyk2/a;", "Lla2/a;", "Lok2/a;", "Lok2/a0;", "instance", "<init>", "(Lok2/a0;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends ok2.a implements la2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f197623c;

    static {
        new C3706a(null);
        Logger logger = LoggerFactory.getLogger("CFT#GdiTransferHelper");
        logger.getClass();
        f197623c = logger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a0 a0Var) {
        super(a0Var);
        a0Var.getClass();
        d.b().f58886a.b(this);
    }

    @Override // ok2.b
    public final b c(String str) {
        str.getClass();
        try {
            return (b) d.b().getCapability(str, b.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ok2.a
    public final com.garmin.device.filetransfer.a d(c cVar, g gVar) {
        cVar.getClass();
        return new com.garmin.device.filetransfer.a(gVar);
    }

    @Override // ok2.a
    public final void e(String str) {
        str.getClass();
        if (c(str) == null) {
            boolean zG = d.b().f58886a.g(str);
            Logger logger = f197623c;
            if (!zG) {
                e0.u("No persistent connection to ", str, ", unable to restart.", logger);
                return;
            }
            logger.warn("Attempting to refresh connection " + str + " without active handler");
            d.b().f58886a.k(str);
        }
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        g gVarD;
        String f92741e = bVar.f111632a.getF92741e();
        f92741e.getClass();
        b bVarC = c(f92741e);
        com.garmin.device.filetransfer.a aVar = bVarC instanceof com.garmin.device.filetransfer.a ? (com.garmin.device.filetransfer.a) bVarC : null;
        if (aVar != null) {
            try {
                ll2.a aVar2 = new ll2.a(new a90.c(f92741e, 16));
                synchronized (aVar.f50731g) {
                    aVar.f50731g.put(Integer.valueOf(GDIFileAccess.TransportProtocol.MULTILINK_TRANSPORT_PIPE.ordinal()), aVar2);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e4) {
                f197623c.error("Failed finding MultiLinkCommunicator", (Throwable) e4);
            }
        }
        if (!d.b().f58886a.g(f92741e)) {
            f197623c.info("Skip connectivity notification for pairing device ".concat(f92741e));
            return;
        }
        DeviceProfile deviceProfile = bVar.f111632a;
        if (cl2.c.m(deviceProfile) && (gVarD = this.f132583a.d(deviceProfile.getF92741e())) != null) {
            for (pk2.a0 a0Var : gVarD.z()) {
                try {
                    a0Var.f(gVarD.f132682a);
                } catch (Exception e14) {
                    gVarD.f132688g.warn(a0Var.A() + " failed onDeviceConnected: " + e14.getMessage());
                }
            }
            b bVarB = gVarD.B();
            GDICore.FeatureCapabilitiesResponse f50734j = bVarB != null ? bVarB.getF50734j() : null;
            if (f50734j != null) {
                dt2.c.f61142a.getClass();
                if (f50734j.getVersion() >= 1) {
                    return;
                }
            }
            ge1.b.T(gVarD.f132687f, null, null, new n(gVarD, null), 3);
        }
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(h hVar) {
        g gVarD;
        DeviceProfile deviceProfile = hVar.f111673a;
        deviceProfile.getClass();
        if (cl2.c.m(deviceProfile) && (gVarD = this.f132583a.d(deviceProfile.getF92741e())) != null) {
            gVarD.f132693l = gl.b.b();
            for (pk2.a0 a0Var : gVarD.z()) {
                try {
                    a0Var.x(gVarD.f132682a);
                } catch (Exception e4) {
                    gVarD.f132688g.warn(a0Var.A() + " failed onDeviceDisconnected: " + e4.getMessage());
                }
            }
            gVarD.w("onDeviceDisconnected", x.a.c(x.f138495e, e.f132636d, null, null, 6));
            gVarD.f132692k.c();
        }
    }

    /* JADX INFO: renamed from: yk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyk2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3706a {
        public /* synthetic */ C3706a(j jVar) {
            this();
        }

        private C3706a() {
        }
    }
}
