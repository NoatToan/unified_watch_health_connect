package wz2;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.room.a0;
import com.google.maps.android.BuildConfig;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3503a f188197a = new C3503a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f188198b = new b();

    public static class b {
    }

    private a() {
    }

    public static void a(String str, Object... objArr) {
        C3503a c3503a = f188197a;
        int i14 = c3503a.f188199a;
        int i15 = c3503a.f188199a;
        if (i14 > 3) {
            return;
        }
        String string = str != null ? str.toString() : BuildConfig.TRAVIS;
        if (objArr.length > 0) {
            string = String.format(string, objArr);
        }
        f188198b.getClass();
        String string2 = c3503a.f188200b;
        if (i15 <= 3) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[5];
            StringBuilder sbI = sn.a.i(string2, "/");
            sbI.append(stackTraceElement.getFileName());
            sbI.append(":");
            sbI.append(stackTraceElement.getLineNumber());
            string2 = sbI.toString();
        }
        if (i15 <= 3) {
            string = a0.j("MFP ", Thread.currentThread().getName(), StringUtils.SPACE, string);
        }
        Log.println(3, string2, string);
    }

    /* JADX INFO: renamed from: wz2.a$a, reason: collision with other inner class name */
    public static class C3503a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f188199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f188200b;

        public C3503a(Application application) {
            String str;
            int i14 = 2;
            this.f188199a = 2;
            this.f188200b = "";
            try {
                String packageName = application.getPackageName();
                ApplicationInfo applicationInfo = application.getPackageManager().getApplicationInfo(packageName, 0);
                if (((applicationInfo != null ? applicationInfo.flags : 0) & 2) == 0) {
                    i14 = 4;
                }
                this.f188199a = i14;
                this.f188200b = packageName != null ? packageName.toUpperCase() : "";
                C3503a c3503a = a.f188197a;
                switch (i14) {
                    case 2:
                        str = "VERBOSE";
                        break;
                    case 3:
                        str = "DEBUG";
                        break;
                    case 4:
                        str = "INFO";
                        break;
                    case 5:
                        str = "WARN";
                        break;
                    case 6:
                        str = "ERROR";
                        break;
                    case 7:
                        str = "ASSERT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                a.a("Configuring Logging, minimum log level is %s", str);
            } catch (Exception unused) {
            }
        }

        public C3503a() {
            this.f188199a = 2;
            this.f188200b = "";
        }
    }
}
