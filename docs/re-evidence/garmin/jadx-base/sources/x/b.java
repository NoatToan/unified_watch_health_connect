package x;

import android.os.Build;
import d53.u;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx/b;", "", "<init>", "()V", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f188201a = new b();

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public static final boolean a() {
        String lowerCase;
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase2 = str.toLowerCase(locale);
        lowerCase2.getClass();
        if (u.y(lowerCase2, "ums", false)) {
            return true;
        }
        f188201a.getClass();
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase("Itel")) {
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (u.y(lowerCase, "sp", false)) {
                return true;
            }
        } else {
            String str3 = Build.BRAND;
            str3.getClass();
            if (str3.equalsIgnoreCase("Itel")) {
                lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                if (u.y(lowerCase, "sp", false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
