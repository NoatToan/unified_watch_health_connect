package tm2;

import android.content.Context;
import bd0.c0;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import em2.d;
import lm2.f;
import lm2.g;
import lm2.h;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltm2/b;", "Ldn2/c;", "<init>", "()V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b extends dn2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f165446a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f165447b = m.b(new tk0.a(17));

    @Override // dn2.c
    public final Unit h(SharedDeviceInfo sharedDeviceInfo) {
        Context context = ((c0) h.d()).f17547a;
        ((d) h.e()).g(context, sharedDeviceInfo.getUnitID(), sharedDeviceInfo.getProductNumber(), null);
        return Unit.INSTANCE;
    }

    @Override // dn2.c
    public final void j(SharedDeviceInfo sharedDeviceInfo) {
        sharedDeviceInfo.getClass();
        ((fm2.c) h.c()).d(sharedDeviceInfo.getUnitID(), sharedDeviceInfo.getMacAddress(), true);
    }

    @Override // dn2.c
    public final void k(SharedDeviceInfo sharedDeviceInfo) {
        sharedDeviceInfo.getClass();
        if (sharedDeviceInfo.isPaired()) {
            Integer connectionType = sharedDeviceInfo.getConnectionType();
            if (connectionType != null && connectionType.intValue() == 1) {
                g gVarC = h.c();
                String macAddress = sharedDeviceInfo.getMacAddress();
                macAddress.getClass();
                ((fm2.c) gVarC).s(macAddress, sharedDeviceInfo.getGbleLongTermKey(), sharedDeviceInfo.getGbleEdiv(), sharedDeviceInfo.getGbleRand());
                return;
            }
            Integer connectionType2 = sharedDeviceInfo.getConnectionType();
            if (connectionType2 != null && connectionType2.intValue() == 2) {
                g gVarC2 = h.c();
                String macAddress2 = sharedDeviceInfo.getMacAddress();
                macAddress2.getClass();
                ((fm2.c) gVarC2).r(macAddress2);
            }
        }
    }

    @Override // dn2.c
    public Object l(SharedDeviceInfo sharedDeviceInfo, boolean z14, v13.c cVar) {
        bm2.d dVar;
        Integer numI;
        sharedDeviceInfo.getClass();
        Integer numI2 = d53.t.i(sharedDeviceInfo.getProductNumber());
        String macAddress = sharedDeviceInfo.getMacAddress();
        if (macAddress == null || macAddress.length() == 0 || sharedDeviceInfo.getConnectionType() == null || numI2 == null) {
            dVar = null;
        } else {
            long unitID = sharedDeviceInfo.getUnitID();
            int iIntValue = numI2.intValue();
            String macAddress2 = sharedDeviceInfo.getMacAddress();
            macAddress2.getClass();
            String displayName = sharedDeviceInfo.getDisplayName();
            String softwareVersion = sharedDeviceInfo.getSoftwareVersion();
            int iIntValue2 = (softwareVersion == null || (numI = d53.t.i(softwareVersion)) == null) ? 0 : numI.intValue();
            Integer connectionType = sharedDeviceInfo.getConnectionType();
            connectionType.getClass();
            dVar = new bm2.d(unitID, iIntValue, macAddress2, displayName, iIntValue2, connectionType.intValue(), new Configuration(sharedDeviceInfo.getCapabilities()));
        }
        bm2.d dVar2 = dVar;
        if (dVar2 != null) {
            f fVarE = h.e();
            String applicationKey = sharedDeviceInfo.getApplicationKey();
            IRegisteredDeviceDto deviceDto = sharedDeviceInfo.getDeviceDto();
            if (deviceDto instanceof bm2.f) {
            }
            ((d) fVarE).c(dVar2, applicationKey, sharedDeviceInfo.getGbleEdiv(), sharedDeviceInfo.getGbleRand(), sharedDeviceInfo.getGbleLongTermKey());
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltm2/b$a;", "", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
