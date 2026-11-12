package hv;

import c22.s3;
import com.garmin.device.pairing.devices.PrimaryApp;
import d53.w;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public static final boolean a(com.garmin.android.apps.connectmobile.devices.model.l lVar, String str, boolean z14) {
        int minGCMAndroidVersion;
        List<PrimaryApp> listU;
        str.getClass();
        if (!lVar.getBluetoothLowEnergyDevice() && !lVar.getBluetoothClassicDevice()) {
            return false;
        }
        if (z14) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                f12.l.f68084a.getClass();
                if (!f12.l.a.a().I2()) {
                    if (b(lVar.getIncludeCountries(), lVar.getExcludeCountries(), str)) {
                        return false;
                    }
                    s3.f23252a.getClass();
                    if (!s3.a("ROLE_MBTESTER") && (listU = lVar.u()) != null && listU.contains(PrimaryApp.GCM)) {
                        return false;
                    }
                    zb0.c.a aVar = zb0.c.f203436a;
                    minGCMAndroidVersion = lVar.getMinGCMAndroidVersion();
                    aVar.getClass();
                    if (zb0.c.a.a(minGCMAndroidVersion) == zb0.c.NOT_COMPATIBLE) {
                        return false;
                    }
                }
            } else {
                if (b(lVar.getIncludeCountries(), lVar.getExcludeCountries(), str)) {
                    return false;
                }
                s3.f23252a.getClass();
                if (!s3.a("ROLE_MBTESTER")) {
                }
                zb0.c.a aVar2 = zb0.c.f203436a;
                minGCMAndroidVersion = lVar.getMinGCMAndroidVersion();
                aVar2.getClass();
                if (zb0.c.a.a(minGCMAndroidVersion) == zb0.c.NOT_COMPATIBLE) {
                    return false;
                }
            }
        } else {
            if (b(lVar.getIncludeCountries(), lVar.getExcludeCountries(), str)) {
                return false;
            }
            s3.f23252a.getClass();
            if (!s3.a("ROLE_MBTESTER")) {
            }
            zb0.c.a aVar3 = zb0.c.f203436a;
            minGCMAndroidVersion = lVar.getMinGCMAndroidVersion();
            aVar3.getClass();
            if (zb0.c.a.a(minGCMAndroidVersion) == zb0.c.NOT_COMPATIBLE) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(String str, String str2, String str3) {
        str3.getClass();
        if (str2 == null || str2.length() == 0 || !w.z(str2, str3, false)) {
            return (str == null || str.length() == 0 || w.z(str, str3, false)) ? false : true;
        }
        return true;
    }
}
