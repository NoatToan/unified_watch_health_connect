package mm2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.text.TextUtils;
import c22.d1;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.x2;
import com.garmin.android.apps.connectmobile.y;
import com.garmin.android.apps.connectmobile.z;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.util.SoftwareUpdateChecker;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import lm2.f;
import lm2.h;
import ok2.a0;
import org.slf4j.Logger;
import qm2.l;
import rd2.g;
import rd2.j;
import zb0.u0;

/* JADX INFO: loaded from: classes11.dex */
public class c extends a {
    public c() {
        super("BleNonSetupStrategy");
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x016c A[LOOP:0: B:71:0x0166->B:73:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [long] */
    @Override // mm2.d
    public final void b(Context context, bm2.d dVar) throws Throwable {
        Cursor cursorQuery;
        ArrayList<String> arrayList;
        bd0.a aVar;
        String productDisplayName;
        long j8;
        u0 u0Var;
        h.d();
        boolean z14 = GarminDeviceWakefulService.f33825e;
        Logger logger = this.f119678b;
        if (z14) {
            logger.error("handleHandshakeCompleted: User in pairing flow, NonSetupHandshakeStrategy should not have been called. Aborting.");
            return;
        }
        String strF = dVar.f();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = e.f119687a;
        strF.getClass();
        e.f119687a.put(strF, Boolean.FALSE);
        this.f119679c = context;
        l lVar = this.f119681e;
        boolean z15 = false;
        f fVar = this.f119677a;
        if (lVar != null && lVar.f145761c) {
            if (!fVar.k(dVar.getF92746j())) {
                logger.warn("Ignoring handshake completed for unit ID [" + dVar.getF92746j() + "]. Device needs to be paired from within the app first.");
                return;
            }
            DeviceProfile deviceProfileH = ((fm2.c) h.c()).h(dVar.f());
            if (deviceProfileH != null && deviceProfileH.getConfigurationFlags().contains(64)) {
                h.d();
                if (GarminDeviceWakefulService.f33825e) {
                    logger.debug("handleHandshakeCompleted: Already in pair flow, DO NOT trigger REPAIR for device unit id = " + dVar.getF92746j());
                    return;
                }
                logger.debug("handleHandshakeCompleted: Ask for RE-PAIR for device unit id = " + dVar.getF92746j());
                h.c();
                bm2.c cVarC = zb0.b.c(String.valueOf(dVar.getF92744h()));
                if (cVarC != null) {
                    cVarC.f18942x = dVar.getF92746j();
                }
                if (!u0.u(String.valueOf(dVar.getF92744h()), cVarC != null && cVarC.f18923m1)) {
                    j jVar = rd2.f.a().f152045a;
                    ?? f172494b = dVar.getF92746j();
                    jVar.getClass();
                    ?? r14 = 0;
                    try {
                        try {
                            cursorQuery = rd2.a.b().query("devices", new String[]{"mac_address"}, "unit_id = ?", new String[]{String.valueOf((long) f172494b)}, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        arrayList = new ArrayList(cursorQuery.getCount());
                                        try {
                                            String string = cursorQuery.getString(0);
                                            if (!TextUtils.isEmpty(string)) {
                                                arrayList.add(string);
                                            }
                                            while (!cursorQuery.isLast()) {
                                                cursorQuery.moveToNext();
                                                String string2 = cursorQuery.getString(0);
                                                if (!TextUtils.isEmpty(string2)) {
                                                    arrayList.add(string2);
                                                }
                                            }
                                        } catch (SQLException e4) {
                                            e = e4;
                                            j.f152077a.error("resolveMacAddressesFrom", e);
                                        } catch (NullPointerException e14) {
                                            e = e14;
                                            j.f152077a.error("resolveMacAddressesFrom", e);
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                } catch (SQLException | NullPointerException e15) {
                                    e = e15;
                                    arrayList = null;
                                }
                            } else {
                                arrayList = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r14 = f172494b;
                            rd2.a.a(r14);
                            throw th;
                        }
                    } catch (SQLException e16) {
                        e = e16;
                        cursorQuery = null;
                        arrayList = null;
                        j.f152077a.error("resolveMacAddressesFrom", e);
                        rd2.a.a(cursorQuery);
                        if (arrayList != null) {
                            for (String str : arrayList) {
                                a0 a0VarA = a0.f132585h.a();
                                str.getClass();
                                a0VarA.h(str);
                            }
                        }
                        g gVar = rd2.f.a().f152046b;
                        long f172494b2 = dVar.getF92746j();
                        gVar.getClass();
                        g.d(f172494b2);
                        String strF2 = dVar.f();
                        strF2.getClass();
                        aVar = new bd0.a(strF2, dVar.getF92742f());
                        Intent intent = new Intent();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("extra_ble_device", aVar);
                        bundle.putParcelable("extra_device_dto", cVarC);
                        bundle.putParcelable("extra_device_info", dVar);
                        intent.putExtras(bundle);
                        z.f49770a.getClass();
                        z.f49773d.j(new y<>(new x2(intent)));
                        if (cVarC != null) {
                            productDisplayName = aVar.f17522c;
                        } else {
                            productDisplayName = aVar.f17522c;
                        }
                        String str2 = productDisplayName;
                        if (cVarC != null) {
                            j8 = cVarC.f18942x;
                        } else {
                            j8 = -1;
                        }
                        d1.b bVar = new d1.b(aVar.f17520a, str2, j8, null);
                        if ((cVarC != null ? cVarC.getF143517g() : null) != null) {
                            z15 = true;
                        }
                        d1.c("android_rePairDevice", bVar, Boolean.valueOf(z15));
                        logger.debug("handleHandshakeCompleted: RE-PAIR in progress. Aborting non-setup handshake");
                        return;
                    } catch (NullPointerException e17) {
                        e = e17;
                        cursorQuery = null;
                        arrayList = null;
                        j.f152077a.error("resolveMacAddressesFrom", e);
                        rd2.a.a(cursorQuery);
                        if (arrayList != null) {
                            while (r0.hasNext()) {
                                a0 a0VarA2 = a0.f132585h.a();
                                str.getClass();
                                a0VarA2.h(str);
                            }
                        }
                        g gVar2 = rd2.f.a().f152046b;
                        long f172494b3 = dVar.getF92746j();
                        gVar2.getClass();
                        g.d(f172494b3);
                        String strF3 = dVar.f();
                        strF3.getClass();
                        aVar = new bd0.a(strF3, dVar.getF92742f());
                        Intent intent2 = new Intent();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("extra_ble_device", aVar);
                        bundle2.putParcelable("extra_device_dto", cVarC);
                        bundle2.putParcelable("extra_device_info", dVar);
                        intent2.putExtras(bundle2);
                        z.f49770a.getClass();
                        z.f49773d.j(new y<>(new x2(intent2)));
                        if (cVarC != null) {
                            productDisplayName = aVar.f17522c;
                        } else {
                            productDisplayName = aVar.f17522c;
                        }
                        String str3 = productDisplayName;
                        if (cVarC != null) {
                            j8 = cVarC.f18942x;
                        } else {
                            j8 = -1;
                        }
                        d1.b bVar2 = new d1.b(aVar.f17520a, str3, j8, null);
                        if ((cVarC != null ? cVarC.getF143517g() : null) != null) {
                            z15 = true;
                        }
                        d1.c("android_rePairDevice", bVar2, Boolean.valueOf(z15));
                        logger.debug("handleHandshakeCompleted: RE-PAIR in progress. Aborting non-setup handshake");
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        rd2.a.a(r14);
                        throw th;
                    }
                    rd2.a.a(cursorQuery);
                    if (arrayList != null) {
                        while (r0.hasNext()) {
                            a0 a0VarA3 = a0.f132585h.a();
                            str.getClass();
                            a0VarA3.h(str);
                        }
                    }
                    g gVar3 = rd2.f.a().f152046b;
                    long f172494b4 = dVar.getF92746j();
                    gVar3.getClass();
                    g.d(f172494b4);
                    String strF4 = dVar.f();
                    strF4.getClass();
                    aVar = new bd0.a(strF4, dVar.getF92742f());
                    Intent intent3 = new Intent();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("extra_ble_device", aVar);
                    bundle3.putParcelable("extra_device_dto", cVarC);
                    bundle3.putParcelable("extra_device_info", dVar);
                    intent3.putExtras(bundle3);
                    z.f49770a.getClass();
                    z.f49773d.j(new y<>(new x2(intent3)));
                    if (cVarC != null || (productDisplayName = cVarC.getF143516f()) == null) {
                        productDisplayName = aVar.f17522c;
                    }
                    String str4 = productDisplayName;
                    if (cVarC != null) {
                        j8 = cVarC.f18942x;
                    } else {
                        j8 = -1;
                    }
                    d1.b bVar3 = new d1.b(aVar.f17520a, str4, j8, null);
                    if ((cVarC != null ? cVarC.getF143517g() : null) != null && (u0Var = (u0) u0.f203782n6.get(cVarC.getF143517g())) != null && u0Var.f203859f) {
                        z15 = true;
                    }
                    d1.c("android_rePairDevice", bVar3, Boolean.valueOf(z15));
                    logger.debug("handleHandshakeCompleted: RE-PAIR in progress. Aborting non-setup handshake");
                    return;
                }
            }
        }
        logger.info("***** BLE RECONNECT START ***** " + dVar.f());
        new sm2.e(dVar, this.f119681e).c();
        e(dVar);
        byte[] bArr = fVar.f(dVar).f128594a;
        if (vm2.e.c(dVar, bArr)) {
            logger.debug("Device firmware version is greater than the cached XML firmware version... requesting device XML download.");
            ((fm2.c) h.c()).o(dVar.f(), new b(this, dVar));
            lm2.g gVarC = h.c();
            String strF5 = dVar.f();
            strF5.getClass();
            logger.debug("Refresh device service cache [success = " + da2.d.c(((fm2.c) gVarC).g()).f58886a.h(strF5) + "] for unitID [" + dVar.getF92746j() + "]");
        } else {
            logger.debug("checkForDeviceSoftwareUpdate");
            if (bArr == null || bArr.length == 0) {
                logger.error("checkForDeviceSoftwareUpdate: deviceXMLBytes read from database is either null or zero length, aborting");
            } else {
                c(dVar, bArr);
            }
            d(dVar, false);
        }
        try {
            if (this.f119680d != null && bArr != null && vm2.e.b(bArr, dVar.getF92745i(), dVar.getF92746j())) {
                this.f119680d.getClass();
                if (this.f119680d.a(dVar.getF92746j())) {
                    SoftwareUpdateChecker.d(this.f119679c, dVar);
                }
            }
        } catch (Throwable th5) {
            logger.warn("onFirmwareVersionChanged failed", th5);
        }
        logger.info("***** BLE RECONNECT COMPLETE ***** " + dVar.f());
    }
}
