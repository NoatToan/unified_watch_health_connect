package tm2;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.text.TextUtils;
import bd0.c0;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.gfdi.AuthRegistry;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import com.garmin.device.pairing.devices.PrimaryApp;
import com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import d53.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.y;
import rd2.d;
import rd2.i;
import rd2.j;
import sd2.e;
import sd2.f;
import v.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltm2/c;", "Ltm2/b;", "<init>", "()V", "device-pairing-database_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f165448c = LoggerFactory.getLogger("DM#SharedDeviceDAODelegate");

    public static SharedDeviceInfo.Builder n(String str, f fVar) {
        SharedDeviceInfo.Builder builder = new SharedDeviceInfo.Builder();
        builder.unitID = fVar.getUnitID();
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        builder.displayName = displayName;
        builder.partNumber = str;
        String productDisplayName = fVar.getProductDisplayName();
        if (productDisplayName == null) {
            productDisplayName = "";
        }
        builder.productDisplayName = productDisplayName;
        String productNumber = fVar.getProductNumber();
        if (productNumber == null) {
            productNumber = "";
        }
        builder.productNumber = productNumber;
        builder.softwareVersion = fVar.getSoftwareVersion();
        String imageURL = fVar.getImageURL();
        if (imageURL == null) {
            imageURL = "";
        }
        builder.imageURL = imageURL;
        String applicationKey = fVar.getApplicationKey();
        builder.applicationKey = applicationKey != null ? applicationKey : "";
        builder.connectionType = Integer.valueOf(fVar.getConnectionType());
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x0129  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:50:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6 A[SYNTHETIC] */
    @Override // dn2.i
    public final ArrayList c() {
        byte[] gbleEdiv;
        boolean z14;
        boolean z15;
        int i14;
        String strQ;
        SharedDeviceInfo.Builder builderN;
        da2.a authInfo;
        String str;
        String strQ2;
        String str2;
        String strD0;
        boolean z16;
        Logger logger = this.f165448c;
        logger.debug("getLocalDevices");
        d dVarF = ConnectDatabase.g().f();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        rd2.f.a().f152045a.getClass();
        List<f> listD = j.d();
        if (listD == null) {
            listD = j0.f134944a;
        }
        for (f fVar : listD) {
            String partNumber = fVar.getPartNumber();
            String partNumber2 = fVar.getPartNumber();
            if (partNumber2 == null || partNumber2.length() == 0) {
                String productNumber = fVar.getProductNumber();
                if (productNumber == null || productNumber.length() == 0) {
                    logger.warn("Ignoring device " + fVar.getUnitID() + " since part number is empty");
                } else {
                    logger.trace(h.u(fVar.getUnitID(), "Full part number missing for ", ", fall back to product number ", fVar.getProductNumber()));
                    partNumber = fVar.getProductNumber();
                    String productDisplayName = fVar.getProductDisplayName();
                    long unitID = fVar.getUnitID();
                    String strD1 = fVar.d0();
                    String strQ3 = fVar.Q();
                    int connectionType = fVar.getConnectionType();
                    gbleEdiv = fVar.getGbleEdiv();
                    if (gbleEdiv != null) {
                        if (gbleEdiv.length == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z14 = !z16;
                    } else {
                        z14 = false;
                    }
                    StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(unitID, "Device: ", productDisplayName, StringUtils.SPACE);
                    sn.a.t(sbJ, " ble:", strD1, " btc:", strQ3);
                    sbJ.append(StringUtils.SPACE);
                    sbJ.append(connectionType);
                    sbJ.append(" auth:");
                    sbJ.append(z14);
                    logger.trace(sbJ.toString());
                    for (e eVar : dVarF.a(fVar.getUnitID())) {
                        if (fVar.d0() != null) {
                            str2 = eVar.f158647b;
                            strD0 = fVar.d0();
                            strD0.getClass();
                            z15 = true;
                            i14 = 1;
                            if (u.q(str2, strD0, true)) {
                                strQ = fVar.d0();
                            }
                            hashSet.add(new Long(fVar.getUnitID()));
                            partNumber.getClass();
                            builderN = n(partNumber, fVar);
                            builderN.connectionType = new Integer(i14);
                            builderN.macAddress = strQ;
                            if (i14 == 1) {
                                builderN.configureGarminAuth(fVar.getGbleEdiv(), fVar.getGbleRand(), fVar.getGbleLongTermKey());
                                authInfo = AuthRegistry.getInstance().getAuthInfo(builderN.macAddress);
                                if (authInfo != null) {
                                    builderN.configureGarminAuth(authInfo.f58872c, authInfo.f58873d, authInfo.f58871b);
                                }
                            }
                            builderN.configureCapabilities(eVar.f158648c);
                            arrayList.add(builderN.build());
                        } else {
                            z15 = true;
                        }
                        if (fVar.Q() != null) {
                            str = eVar.f158647b;
                            strQ2 = fVar.Q();
                            strQ2.getClass();
                            if (u.q(str, strQ2, z15)) {
                                strQ = fVar.Q();
                                i14 = 2;
                                hashSet.add(new Long(fVar.getUnitID()));
                                partNumber.getClass();
                                builderN = n(partNumber, fVar);
                                builderN.connectionType = new Integer(i14);
                                builderN.macAddress = strQ;
                                if (i14 == 1) {
                                    builderN.configureGarminAuth(fVar.getGbleEdiv(), fVar.getGbleRand(), fVar.getGbleLongTermKey());
                                    authInfo = AuthRegistry.getInstance().getAuthInfo(builderN.macAddress);
                                    if (authInfo != null) {
                                        builderN.configureGarminAuth(authInfo.f58872c, authInfo.f58873d, authInfo.f58871b);
                                    }
                                }
                                builderN.configureCapabilities(eVar.f158648c);
                                arrayList.add(builderN.build());
                            }
                        }
                    }
                    if (!hashSet.contains(new Long(fVar.getUnitID()))) {
                        partNumber.getClass();
                        arrayList.add(n(partNumber, fVar).build());
                    }
                }
            } else {
                String productDisplayName2 = fVar.getProductDisplayName();
                long unitID2 = fVar.getUnitID();
                String strD2 = fVar.d0();
                String strQ4 = fVar.Q();
                int connectionType2 = fVar.getConnectionType();
                gbleEdiv = fVar.getGbleEdiv();
                if (gbleEdiv != null) {
                    if (gbleEdiv.length == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z14 = !z16;
                } else {
                    z14 = false;
                }
                StringBuilder sbJ2 = com.nimbusds.jose.shaded.gson.internal.a.j(unitID2, "Device: ", productDisplayName2, StringUtils.SPACE);
                sn.a.t(sbJ2, " ble:", strD2, " btc:", strQ4);
                sbJ2.append(StringUtils.SPACE);
                sbJ2.append(connectionType2);
                sbJ2.append(" auth:");
                sbJ2.append(z14);
                logger.trace(sbJ2.toString());
                while (r1.hasNext()) {
                    if (fVar.d0() != null) {
                        str2 = eVar.f158647b;
                        strD0 = fVar.d0();
                        strD0.getClass();
                        z15 = true;
                        i14 = 1;
                        if (u.q(str2, strD0, true)) {
                            strQ = fVar.d0();
                        }
                        hashSet.add(new Long(fVar.getUnitID()));
                        partNumber.getClass();
                        builderN = n(partNumber, fVar);
                        builderN.connectionType = new Integer(i14);
                        builderN.macAddress = strQ;
                        if (i14 == 1) {
                            builderN.configureGarminAuth(fVar.getGbleEdiv(), fVar.getGbleRand(), fVar.getGbleLongTermKey());
                            authInfo = AuthRegistry.getInstance().getAuthInfo(builderN.macAddress);
                            if (authInfo != null) {
                                builderN.configureGarminAuth(authInfo.f58872c, authInfo.f58873d, authInfo.f58871b);
                            }
                        }
                        builderN.configureCapabilities(eVar.f158648c);
                        arrayList.add(builderN.build());
                    } else {
                        z15 = true;
                    }
                    if (fVar.Q() != null) {
                        str = eVar.f158647b;
                        strQ2 = fVar.Q();
                        strQ2.getClass();
                        if (u.q(str, strQ2, z15)) {
                            strQ = fVar.Q();
                            i14 = 2;
                            hashSet.add(new Long(fVar.getUnitID()));
                            partNumber.getClass();
                            builderN = n(partNumber, fVar);
                            builderN.connectionType = new Integer(i14);
                            builderN.macAddress = strQ;
                            if (i14 == 1) {
                                builderN.configureGarminAuth(fVar.getGbleEdiv(), fVar.getGbleRand(), fVar.getGbleLongTermKey());
                                authInfo = AuthRegistry.getInstance().getAuthInfo(builderN.macAddress);
                                if (authInfo != null) {
                                    builderN.configureGarminAuth(authInfo.f58872c, authInfo.f58873d, authInfo.f58871b);
                                }
                            }
                            builderN.configureCapabilities(eVar.f158648c);
                            arrayList.add(builderN.build());
                        }
                    }
                }
                if (!hashSet.contains(new Long(fVar.getUnitID()))) {
                    partNumber.getClass();
                    arrayList.add(n(partNumber, fVar).build());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0334  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    @Override // tm2.b, dn2.c
    @SuppressLint({"WrongConstant"})
    public Object l(SharedDeviceInfo sharedDeviceInfo, boolean z14, v13.c cVar) throws Throwable {
        PrimaryApp primaryApp;
        ?? arrayList;
        String str;
        String str2;
        ArrayList arrayList2;
        String strA = ((c0) lm2.h.d()).a(sharedDeviceInfo.getProductNumber());
        IRegisteredDeviceDto deviceDto = sharedDeviceInfo.getDeviceDto();
        bm2.c cVar2 = deviceDto instanceof bm2.c ? (bm2.c) deviceDto : null;
        String productDisplayName = sharedDeviceInfo.getProductDisplayName();
        long unitID = sharedDeviceInfo.getUnitID();
        boolean zIsPaired = sharedDeviceInfo.isPaired();
        String str3 = StringUtils.SPACE;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(unitID, "Update device: ", productDisplayName, StringUtils.SPACE);
        sbJ.append(" isPaired:");
        sbJ.append(zIsPaired);
        String string = sbJ.toString();
        Logger logger = this.f165448c;
        logger.debug(string);
        if (z14 && !sharedDeviceInfo.isPaired()) {
            i iVar = rd2.f.a().f152047c;
            long unitID2 = sharedDeviceInfo.getUnitID();
            iVar.getClass();
            i.d(unitID2);
        }
        HashMap map = new HashMap();
        if (cVar2 != null) {
            try {
                map.put(rd2.f.a.SEGMENT_CAPABLE, Boolean.valueOf(cVar2.f18940w));
                map.put(rd2.f.a.GCJ02_COURSE_CAPABLE, Boolean.valueOf(cVar2.P0));
                map.put(rd2.f.a.ACTIVITY_COURSE_CAPABLE, Boolean.valueOf(cVar2.Q0));
                map.put(rd2.f.a.SOLAR_PANEL_UTILIZATION_CAPABLE, Boolean.valueOf(cVar2.T0));
                map.put(rd2.f.a.NFC_CAPABLE, Boolean.valueOf(cVar2.X0));
                map.put(rd2.f.a.LOW_HR_ALERT_CAPABLE, Boolean.valueOf(cVar2.Y0));
                map.put(rd2.f.a.HIGH_HR_ALERT_CAPABLE, Boolean.valueOf(cVar2.Z0));
                map.put(rd2.f.a.SPECTATOR_MESSAGING_CAPABLE, Boolean.valueOf(cVar2.f18898a1));
                map.put(rd2.f.a.TRAINING_STATUS_CAPABLE, Boolean.valueOf(cVar2.f18900b1));
                map.put(rd2.f.a.TRAINING_STATUS_PAUSE_CAPABLE, Boolean.valueOf(cVar2.f18902c1));
                map.put(rd2.f.a.MEASUREMENT_UNIT_SETTING_CAPABLE, Boolean.valueOf(cVar2.f18904d1));
                map.put(rd2.f.a.POWER_CURVE_CAPABLE, Boolean.valueOf(cVar2.f18906e1));
                map.put(rd2.f.a.SECONDARY_WORKOUT_STEP_TARGET_CAPABLE, Boolean.valueOf(cVar2.f18908f1));
                map.put(rd2.f.a.ASSISTANCE_PLUS_CAPABLE, Boolean.valueOf(cVar2.f18910g1));
                map.put(rd2.f.a.EMERGENCY_CALLING_CAPABLE, Boolean.valueOf(cVar2.f18912h1));
                map.put(rd2.f.a.SOLAR_CHARGE_CAPABLE, Boolean.valueOf(cVar2.f18914i1));
                map.put(rd2.f.a.DIVE_APP_SYNC_CAPABLE, Boolean.valueOf(cVar2.f18919k1));
                map.put(rd2.f.a.DAY_OF_WEEK_SLEEP_WINDOW_CAPABLE, Boolean.valueOf(cVar2.f18921l1));
                map.put(rd2.f.a.APPLY_BACKUP_CAPABLE, Boolean.valueOf(cVar2.f18934s1));
                map.put(rd2.f.a.HILLSCORE_ENDURANCESCORE_CAPABLE, Boolean.valueOf(cVar2.f18936t1));
                map.put(rd2.f.a.BODY_BATTERY_TRUE_UP_CAPABLE, Boolean.valueOf(cVar2.f18943x1));
                map.put(rd2.f.a.START_ACTIVITY_CAPABLE, Boolean.valueOf(cVar2.f18945y1));
                map.put(rd2.f.a.PENDING_ACTIVITY_CAPABLE, Boolean.valueOf(cVar2.f18947z1));
                map.put(rd2.f.a.FIXED_LOCATION_CAPABLE, Boolean.valueOf(cVar2.A1));
                map.put(rd2.f.a.SCREENLESS_DEVICE_CAPABLE, Boolean.valueOf(cVar2.B1));
                map.put(rd2.f.a.START_STOP_WORKOUT_CAPABLE, Boolean.valueOf(cVar2.C1));
                map.put(rd2.f.a.FALL_DETECTION_CAPABLE, Boolean.valueOf(cVar2.D1));
                map.put(rd2.f.a.DIRECT_ACTIVATION_CAPABLE, Boolean.valueOf(cVar2.E1));
            } catch (Throwable th3) {
                com.airbnb.lottie.animation.keyframe.a.w("Exception while populating gcCapabilities. ", th3.getMessage(), logger);
            }
        }
        boolean z15 = (cVar2 == null || !cVar2.V0) ? true : cVar2.U0;
        if (cVar2 == null || (primaryApp = cVar2.f18931q1) == null) {
            primaryApp = PrimaryApp.UNSPECIFIED;
        }
        int appId = primaryApp.getAppId();
        if (cVar2 == null || (arrayList2 = cVar2.f18933r1) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList(y.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((PrimaryApp) it.next()).getAppId()));
            }
        }
        i iVar2 = rd2.f.a().f152047c;
        String partNumber = sharedDeviceInfo.getPartNumber();
        String productNumber = sharedDeviceInfo.getProductNumber();
        boolean z16 = z15;
        long unitID3 = sharedDeviceInfo.getUnitID();
        String applicationKey = sharedDeviceInfo.getApplicationKey();
        if (cVar2 == null || (str = cVar2.f18903d) == null) {
            str = "";
        }
        String str4 = cVar2 != null ? cVar2.f18909g : null;
        String str5 = cVar2 != null ? cVar2.f18911h : null;
        String str6 = cVar2 != null ? cVar2.f18913i : null;
        String productDisplayName2 = sharedDeviceInfo.getProductDisplayName();
        ?? r24 = arrayList;
        String displayName = sharedDeviceInfo.getDisplayName();
        String str7 = strA == null ? "" : strA;
        Boolean boolValueOf = cVar2 != null ? Boolean.valueOf(cVar2.f18922m) : null;
        Boolean boolValueOf2 = cVar2 != null ? Boolean.valueOf(cVar2.f18924n) : null;
        String string2 = cVar2 != null ? new Integer(cVar2.f18930q).toString() : null;
        String macAddress = sharedDeviceInfo.getMacAddress();
        Integer connectionType = sharedDeviceInfo.getConnectionType();
        int iIntValue = connectionType != null ? connectionType.intValue() : 0;
        byte[] gbleEdiv = sharedDeviceInfo.getGbleEdiv();
        byte[] gbleRand = sharedDeviceInfo.getGbleRand();
        byte[] gbleLongTermKey = sharedDeviceInfo.getGbleLongTermKey();
        String str8 = cVar2 != null ? cVar2.f18917k : null;
        iVar2.getClass();
        bm2.c cVar3 = cVar2;
        Boolean bool = boolValueOf2;
        ContentValues contentValues = new ContentValues(51);
        contentValues.put("part_nbr", partNumber);
        contentValues.put("product_nbr", productNumber);
        contentValues.put("unit_id", Long.valueOf(unitID3));
        contentValues.put("application_key", applicationKey);
        contentValues.put("is_software_update_available", (Integer) 0);
        contentValues.put("sku", str);
        contentValues.put("is_primary_user", Integer.valueOf(z16 ? 1 : 0));
        contentValues.put("image_url", str4);
        contentValues.put("video_url", str5);
        contentValues.put("training_video_url", str6);
        contentValues.put("product_display_name", productDisplayName2);
        contentValues.put("display_name", displayName);
        contentValues.put("active_ind", (Integer) 0);
        contentValues.put("categories", str7);
        contentValues.put("gcmSettingsFileName", str8);
        for (Map.Entry entry : map.entrySet()) {
            String str9 = ((rd2.f.a) entry.getKey()).f152071a;
            if (entry.getValue() != null && !TextUtils.isEmpty(str9)) {
                contentValues.put(str9, (Boolean) entry.getValue());
            }
        }
        String str10 = "btc";
        if (iIntValue != 2) {
            if (iIntValue == 1) {
                str10 = "ble";
            } else {
                Boolean bool2 = Boolean.TRUE;
                if (!Objects.equals(boolValueOf, bool2)) {
                    if (Objects.equals(bool, bool2)) {
                        str10 = "ble";
                    } else {
                        str10 = PrivacyUpdateRequestError.UNKNOWN;
                    }
                }
            }
        }
        if (str10.equals(PrivacyUpdateRequestError.UNKNOWN)) {
            com.airbnb.lottie.animation.keyframe.a.z("saveGcDevice: cannot save device with connection type [", str10, "]", i.f152075b);
        } else {
            contentValues.put("connection_type", str10);
            if (TextUtils.isEmpty(macAddress)) {
                contentValues.putNull("mac_address");
                contentValues.putNull("garmin_device_xml");
                contentValues.putNull("gble_ediv");
                contentValues.putNull("gble_ltk");
                contentValues.putNull("gble_rand");
                contentValues.put("is_connected", (Integer) 0);
            } else {
                contentValues.put("mac_address", macAddress);
                if (gbleEdiv != null && gbleEdiv.length > 0) {
                    contentValues.put("gble_ediv", gbleEdiv);
                }
                if (gbleRand != null && gbleRand.length > 0) {
                    contentValues.put("gble_rand", gbleRand);
                }
                if (gbleLongTermKey != null && gbleLongTermKey.length > 0) {
                    contentValues.put("gble_ltk", gbleLongTermKey);
                }
            }
            if (!TextUtils.isEmpty(string2)) {
                try {
                    contentValues.put("min_app_version_code_supported", Integer.valueOf(Integer.parseInt(string2)));
                } catch (NumberFormatException unused) {
                }
            }
            contentValues.put("primaryApp", Integer.valueOf(appId));
            if (!r24.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                for (Integer num : r24) {
                    if (num != null) {
                        sb3.append(num);
                        str2 = str3;
                        sb3.append(str2);
                    } else {
                        str2 = str3;
                    }
                    str3 = str2;
                }
                contentValues.put("incompatibleApps", sb3.toString());
            }
            iVar2.f(unitID3, str10, contentValues);
        }
        if (cVar3 != null && cVar3.I0) {
            o(sharedDeviceInfo.getUnitID());
        }
        if (!sharedDeviceInfo.isPaired() || sharedDeviceInfo.getCapabilities() == null) {
            ConnectDatabase.g().f().b(sharedDeviceInfo.getUnitID());
        } else {
            e eVar = new e();
            eVar.f158646a = sharedDeviceInfo.getUnitID();
            String macAddress2 = sharedDeviceInfo.getMacAddress();
            macAddress2.getClass();
            eVar.f158647b = macAddress2;
            byte[] capabilities = sharedDeviceInfo.getCapabilities();
            capabilities.getClass();
            eVar.f158648c = capabilities;
            new Long(ConnectDatabase.g().f().c(eVar));
        }
        km2.a.j();
        return Unit.INSTANCE;
    }

    public void o(long j8) {
    }
}
