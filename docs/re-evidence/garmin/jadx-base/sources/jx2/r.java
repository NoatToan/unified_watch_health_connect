package jx2;

import android.annotation.SuppressLint;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.samd.exception.GarminDeviceNotCapableException;
import java.util.Set;
import o53.a0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljx2/r;", "Ljx2/a;", "<init>", "()V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r extends a {
    public r() {
        super("DeviceManager");
    }

    public static final px2.e i(r rVar, long j8, String str, kx2.a aVar) throws GarminDeviceNotCapableException {
        String strName;
        rVar.getClass();
        px2.o oVar = (px2.o) da2.d.b().getCapability(str, px2.o.class);
        if (oVar == null) {
            if (aVar == null || (strName = aVar.name()) == null) {
                strName = "";
            }
            throw new GarminDeviceNotCapableException(j8, strName);
        }
        px2.e eVar = oVar.f141844k;
        if (eVar != null) {
            return eVar;
        }
        throw new GarminDeviceNotCapableException(j8, fb1.c.n("feature ", aVar.name()));
    }

    public static final boolean j(r rVar, long j8, kx2.a aVar) {
        boolean zContains;
        rVar.getClass();
        qx2.a aVar2 = qx2.a.f148445a;
        qx2.b bVar = qx2.b.ANALYTIC_RECORDED_DEVICE_FEATURES_ENABLED;
        synchronized (aVar2) {
            bVar.getClass();
            aVar.getClass();
            Set<kx2.a> setC = aVar2.c(bVar, j8);
            zContains = setC != null ? setC.contains(aVar) : false;
        }
        return !zContains;
    }

    public static void l(r rVar, long j8, kx2.a aVar, DeviceProfile deviceProfile, kx2.b bVar, Exception exc, String str, int i14) {
        kx2.b bVar2 = (i14 & 8) != 0 ? null : bVar;
        Exception exc2 = (i14 & 16) != 0 ? null : exc;
        String str2 = (i14 & 32) != 0 ? null : str;
        rVar.getClass();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a.plus(new a0("RecordFeatureEnabledAnalytic"))), null, null, new p(deviceProfile, aVar, bVar2, exc2, str2, j8, rVar, null), 3);
    }

    @SuppressLint({"VisibleForTests"})
    public final Object k(long j8, v13.c cVar) {
        d().debug(androidx.room.a0.f(j8, "getCapabilities(", ")"));
        gx2.b.f80060a.getClass();
        return ge1.b.e0(gx2.b.d.a(), new l(this, j8, null), cVar);
    }

    public final Object m(String str, v13.i iVar) throws Throwable {
        gx2.b.f80060a.getClass();
        Object objE0 = ge1.b.e0(gx2.b.d.a(), new q(this, str, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }
}
