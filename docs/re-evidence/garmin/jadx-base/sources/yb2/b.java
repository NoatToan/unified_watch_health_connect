package yb2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import bd0.c0;
import bm2.d;
import bm2.f;
import com.garmin.device.pairing.PairingException;
import com.google.gson.Gson;
import java.util.Set;
import kc2.g;
import lc.u0;
import lm2.h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yl2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyb2/b;", "", "<init>", "()V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f195700a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyb2/b$a;", "Lzl2/b;", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a implements zl2.b {
        public final void a(f fVar, d dVar, PairingException pairingException) {
            if (fVar == null && dVar != null) {
                try {
                    fVar = new yb2.a(dVar);
                } catch (Exception e4) {
                    b.f195700a.warn("sendPairingAnalytic: Failed to send pairing analytic", (Throwable) e4);
                    return;
                }
            }
            if (fVar == null) {
                b.f195700a.warn("sendPairingAnalytic: Tried to send pairing analytic without device");
                return;
            }
            int f172497e = dVar != null ? dVar.getF92745i() : -1;
            if (fVar.getDeviceUnitId() <= 0) {
                fVar.b(dVar != null ? dVar.getF92746j() : fVar.getDeviceUnitId());
            }
            if (pairingException == null) {
                b.d(fVar, f172497e, dVar);
            } else {
                b.c(fVar, f172497e, dVar, pairingException);
            }
        }
    }

    /* JADX INFO: renamed from: yb2.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3641b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195701a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.ABORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f195701a = iArr;
        }
    }

    static {
        new b();
        f195700a = LoggerFactory.getLogger("PAIR-OMT#Analytics");
    }

    private b() {
    }

    @SuppressLint({"MissingPermission"})
    public static final jc2.b a(String str, BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter == null) {
            return jc2.b.NONE;
        }
        try {
            Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
            Set<BluetoothDevice> set = bondedDevices;
            if (set != null && !set.isEmpty()) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    String address = bluetoothDevice.getAddress();
                    if (address != null && address.length() != 0 && s.g(bluetoothDevice.getAddress(), str)) {
                        return jc2.b.BONDING;
                    }
                }
            }
            return jc2.b.AUTH;
        } catch (SecurityException unused) {
            f195700a.warn("Unable to determine if device bonded");
            return jc2.b.NONE;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static final void b(yt2.d dVar, jc2.a aVar, jc2.f fVar, jc2.b bVar, g gVar, Long l14, kc2.b bVar2) {
        String strName;
        String typeName;
        String subtypeName;
        NetworkInfo.State state;
        dVar.getClass();
        aVar.getClass();
        fVar.getClass();
        yt2.g gVarD = dVar.d();
        kc2.a aVar2 = new kc2.a(gVarD.f199677c, gVarD.f199675a, gVarD.f199676b);
        Object systemService = ((c0) h.d()).f17547a.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || (state = activeNetworkInfo.getState()) == null || (strName = state.name()) == null) {
            strName = "UNKNOWN";
        }
        String str = "";
        if (activeNetworkInfo == null || (typeName = activeNetworkInfo.getTypeName()) == null) {
            typeName = "";
        }
        if (activeNetworkInfo != null && (subtypeName = activeNetworkInfo.getSubtypeName()) != null) {
            str = subtypeName;
        }
        kc2.e eVar = new kc2.e(strName, typeName, str);
        String str2 = fVar.jsonValue;
        str2.getClass();
        String str3 = bVar.jsonValue;
        str3.getClass();
        boolean z14 = !dVar.a();
        if (bVar2 != null) {
            com.garmin.android.lib.garminmobileanalytics.b.a aVar3 = com.garmin.android.lib.garminmobileanalytics.b.f49927a;
            String strD = bVar2.getErrorMessage();
            aVar3.getClass();
            bVar2.j(com.garmin.android.lib.garminmobileanalytics.b.a.a(strD));
            bVar2.i(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar2.getErrorGroupName()));
            bVar2.k(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar2.getErrorStackTrace()));
            bVar2.m(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar2.getErrorType()));
        }
        kc2.c cVar = new kc2.c(gVar, aVar2, str2, str3, z14, eVar, bVar2, null, l14, 128, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        yt2.f fVar2 = yt2.f.f199669a;
        String str4 = aVar.omtEventTypeValue;
        str4.getClass();
        String json = new Gson().toJson(cVar);
        json.getClass();
        yt2.e eVar2 = new yt2.e(str4, json, jCurrentTimeMillis);
        fVar2.getClass();
        yt2.f.a(eVar2, false);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    public static final void c(f fVar, int i14, d dVar, PairingException pairingException) {
        jc2.b bVarA;
        String productDisplayName;
        String str;
        String partNumberPartial;
        String str2;
        String strF;
        fVar.getClass();
        pairingException.getClass();
        if (dVar == null || (strF = dVar.f()) == null || (bVarA = a(strF, BluetoothAdapter.getDefaultAdapter())) == null) {
            bVarA = jc2.b.NONE;
        }
        jc2.b bVar = bVarA;
        bVar.getClass();
        yt2.f.f199669a.getClass();
        yt2.a aVar = yt2.f.f199670b;
        if (aVar == null) {
        }
        f195700a.debug("sendPairingAnalyticsError - " + pairingException.getPairingFailure());
        jc2.f fVar2 = C3641b.f195701a[pairingException.getPairingFailure().ordinal()] == 1 ? jc2.f.ABORT : jc2.f.FAILURE;
        zl2.a.f205191e.getClass();
        Object failureCode = pairingException.getFailureCode();
        String str3 = null;
        String str4 = "network";
        String str5 = "com.garmin.deviceRegisteringDomain";
        switch (zl2.a.C3835a.C3836a.f205196a[pairingException.getPairingFailure().ordinal()]) {
            case 1:
                str4 = "badbluetooth";
                str5 = "com.garmin.deviceConnectingDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar2 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar2 = new kc2.b(aVar2.f205192a, aVar2.f205193b, aVar2.f205194c, aVar2.f205195d, null, 16, null);
                long deviceUnitId = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar2);
                break;
            case 2:
                str4 = "passkeytimeout";
                str5 = "com.garmin.deviceConnectingDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar3 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar3 = new kc2.b(aVar3.f205192a, aVar3.f205193b, aVar3.f205194c, aVar3.f205195d, null, 16, null);
                long deviceUnitId2 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId2, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar3);
                break;
            case 3:
                str4 = "connectingdevicetimeout";
                str5 = "com.garmin.deviceConnectingDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar4 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar4 = new kc2.b(aVar4.f205192a, aVar4.f205193b, aVar4.f205194c, aVar4.f205195d, null, 16, null);
                long deviceUnitId3 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId3, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar4);
                break;
            case 4:
                str4 = "connectingfailure";
                str5 = "com.garmin.deviceConnectingDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar5 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar5 = new kc2.b(aVar5.f205192a, aVar5.f205193b, aVar5.f205194c, aVar5.f205195d, null, 16, null);
                long deviceUnitId4 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId4, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar5);
                break;
            case 5:
                str4 = "disconnecteddevice";
                str3 = "Device disconnected during pairing";
                str5 = "com.garmin.deviceConnectingDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar6 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar6 = new kc2.b(aVar6.f205192a, aVar6.f205193b, aVar6.f205194c, aVar6.f205195d, null, 16, null);
                long deviceUnitId5 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId5, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar6);
                break;
            case 6:
                str4 = "resetfailure";
                str5 = "com.garmin.deviceResettingDomain";
                str3 = "Reset operation failed";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar7 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar7 = new kc2.b(aVar7.f205192a, aVar7.f205193b, aVar7.f205194c, aVar7.f205195d, null, 16, null);
                long deviceUnitId6 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId6, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar7);
                break;
            case 7:
                str4 = "deviceinfonull";
                str3 = "Device info object (created after handshake) is NULL";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar8 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar8 = new kc2.b(aVar8.f205192a, aVar8.f205193b, aVar8.f205194c, aVar8.f205195d, null, 16, null);
                long deviceUnitId7 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId7, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar8);
                break;
            case 8:
                str3 = "Invalid device unit id during registration";
                str4 = "deviceregistrationfailure";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar9 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar9 = new kc2.b(aVar9.f205192a, aVar9.f205193b, aVar9.f205194c, aVar9.f205195d, null, 16, null);
                long deviceUnitId8 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId8, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar9);
                break;
            case 9:
                str3 = "HTTP_CONFLICT_409 during registration";
                str4 = "deviceregistrationfailure";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar10 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar10 = new kc2.b(aVar10.f205192a, aVar10.f205193b, aVar10.f205194c, aVar10.f205195d, null, 16, null);
                long deviceUnitId9 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId9, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar10);
                break;
            case 10:
                str3 = "HTTP_INTERNAL_ERROR_500 during registration";
                str4 = "deviceregistrationfailure";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar11 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar11 = new kc2.b(aVar11.f205192a, aVar11.f205193b, aVar11.f205194c, aVar11.f205195d, null, 16, null);
                long deviceUnitId10 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId10, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar11);
                break;
            case 11:
                str3 = "NULL_OR_EMPTY_DEVICE_XML_BYTES during registration";
                str4 = "deviceregistrationfailure";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar12 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar12 = new kc2.b(aVar12.f205192a, aVar12.f205193b, aVar12.f205194c, aVar12.f205195d, null, 16, null);
                long deviceUnitId11 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId11, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar12);
                break;
            case 12:
                str4 = "devicexmldownloadfailure";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar13 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar13 = new kc2.b(aVar13.f205192a, aVar13.f205193b, aVar13.f205194c, aVar13.f205195d, null, 16, null);
                long deviceUnitId12 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId12, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar13);
                break;
            case 13:
                str4 = "jsonParsingException";
                str3 = "Error parsing JSON during pairing server operations";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar14 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar14 = new kc2.b(aVar14.f205192a, aVar14.f205193b, aVar14.f205194c, aVar14.f205195d, null, 16, null);
                long deviceUnitId13 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId13, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar14);
                break;
            case 14:
                str3 = "No internet connection";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar15 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar15 = new kc2.b(aVar15.f205192a, aVar15.f205193b, aVar15.f205194c, aVar15.f205195d, null, 16, null);
                long deviceUnitId14 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId14, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar15);
                break;
            case 15:
                str3 = "General network error";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar16 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar16 = new kc2.b(aVar16.f205192a, aVar16.f205193b, aVar16.f205194c, aVar16.f205195d, null, 16, null);
                long deviceUnitId15 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId15, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar16);
                break;
            case 16:
                str4 = "syncfailure";
                str5 = "com.garmin.deviceSyncingDomain";
                str3 = "Sync failed at the end of the pairing setup";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar17 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar17 = new kc2.b(aVar17.f205192a, aVar17.f205193b, aVar17.f205194c, aVar17.f205195d, null, 16, null);
                long deviceUnitId16 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId16, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar17);
                break;
            case 17:
                str4 = "pairaborted";
                str3 = "User aborted the pairing setup";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar18 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar18 = new kc2.b(aVar18.f205192a, aVar18.f205193b, aVar18.f205194c, aVar18.f205195d, null, 16, null);
                long deviceUnitId17 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId17, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar18);
                break;
            case 18:
                str4 = "otherfatal";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar19 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar19 = new kc2.b(aVar19.f205192a, aVar19.f205193b, aVar19.f205194c, aVar19.f205195d, null, 16, null);
                long deviceUnitId18 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId18, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar19);
                break;
            case 19:
                str4 = "discoveryfailure";
                str3 = "Failed to Discover device";
                str5 = "com.garmin.devicePairingOtherDomain";
                if (failureCode == null) {
                    failureCode = pairingException.getPairingFailure();
                    failureCode.getClass();
                }
                if (str3 == null) {
                    str3 = "none";
                }
                zl2.a aVar110 = new zl2.a(str4, str5, "Failure Code = [" + failureCode + "] - Extra Info = [" + str3 + "]", "");
                kc2.b bVar110 = new kc2.b(aVar110.f205192a, aVar110.f205193b, aVar110.f205194c, aVar110.f205195d, null, 16, null);
                long deviceUnitId19 = fVar.getDeviceUnitId();
                productDisplayName = fVar.getProductDisplayName();
                if (productDisplayName == null) {
                    str = "";
                } else {
                    str = productDisplayName;
                }
                partNumberPartial = fVar.getPartNumberPartial();
                if (partNumberPartial == null) {
                    str2 = "";
                } else {
                    str2 = partNumberPartial;
                }
                b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, fVar2, bVar, new g(deviceUnitId19, str, str2, i14 > 0 ? String.valueOf(i14) : ""), null, bVar110);
                break;
            default:
                u0.r();
                break;
        }
    }

    public static final void d(f fVar, int i14, d dVar) {
        jc2.b bVarA;
        String strF;
        fVar.getClass();
        if (dVar == null || (strF = dVar.f()) == null || (bVarA = a(strF, BluetoothAdapter.getDefaultAdapter())) == null) {
            bVarA = jc2.b.NONE;
        }
        jc2.b bVar = bVarA;
        bVar.getClass();
        f195700a.debug("sendPairingAnalyticsSuccess");
        yt2.f.f199669a.getClass();
        yt2.a aVar = yt2.f.f199670b;
        if (aVar == null) {
            return;
        }
        long deviceUnitId = fVar.getDeviceUnitId();
        String productDisplayName = fVar.getProductDisplayName();
        String str = productDisplayName == null ? "" : productDisplayName;
        String partNumberPartial = fVar.getPartNumberPartial();
        b(aVar, jc2.a.GARMIN_DEVICE_PAIRING, jc2.f.SUCCESS, bVar, new g(deviceUnitId, str, partNumberPartial == null ? "" : partNumberPartial, i14 > 0 ? String.valueOf(i14) : ""), null, null);
    }
}
