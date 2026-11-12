package health.compact.a;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.huawei.hwencryptmodel.utils.CommonLibUtil$RestartService;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class CommonLibUtil {
    private CommonLibUtil() {
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            com.huawei.hwlogsmodel.LogUtil.j("CommonLibUtil", "parseByte2HexStr source null");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            stringBuffer.append(hexString.toUpperCase(Locale.ROOT));
        }
        return stringBuffer.toString();
    }

    public static void d(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("CommonLibUtil", "reboot context is null");
            return;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_CommonLibUtil", "start reboot, ", Log.getStackTraceString(new Throwable()));
        launchIntentForPackage.addFlags(268468224);
        context.startActivity(launchIntentForPackage);
        System.exit(0);
    }

    public static void c(Context context) {
        com.huawei.hwlogsmodel.LogUtil.a("CommonLibUtil", "rebootDelayMillis start RestartService");
        ContextCompat.startForegroundService(context, new Intent(context, (Class<?>) CommonLibUtil$RestartService.class));
        Process.killProcess(Process.myPid());
    }
}
