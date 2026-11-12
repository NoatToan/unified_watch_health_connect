package defpackage;

import android.os.Build;
import com.careforeyou.library.utils.CsBtUtil_v11;

/* JADX INFO: loaded from: classes4.dex */
public class vp {
    public static boolean d(boolean z) {
        if (!z) {
            return true;
        }
        if (!Build.BRAND.equalsIgnoreCase("samsung")) {
            return Build.BRAND.equalsIgnoreCase("yanbochuang") && !Build.MODEL.equalsIgnoreCase("A106");
        }
        if (Build.MODEL.contains("SM-G9300")) {
            return false;
        }
        Build.MODEL.contains("SM-G9008");
        return false;
    }

    public static CsBtUtil_v11.CONNECT_MODE c() {
        CsBtUtil_v11.CONNECT_MODE connect_mode = CsBtUtil_v11.CONNECT_MODE.FSAC;
        return (Build.BRAND.equalsIgnoreCase("xiaomi") && Build.DEVICE.startsWith("HM")) ? CsBtUtil_v11.CONNECT_MODE.Alway_Conn : connect_mode;
    }
}
