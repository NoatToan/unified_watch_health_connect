package k8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserManager;
import java.util.List;
import k23.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import y8.q0;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f103321a = b.f103323a;

    /* JADX INFO: renamed from: k8.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk8/a$a;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1981a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1981a f103322a = new C1981a();

        private C1981a() {
        }

        public static final int a(Context context) {
            f103322a.getClass();
            Object systemService = context.getSystemService("user");
            systemService.getClass();
            return (((UserManager) systemService).isProfile() || context.getSystemService("healthconnect") == null) ? 1 : 3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk8/a$b;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f103323a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f103324b;

        static {
            f103324b = Build.VERSION.SDK_INT >= 34 ? "android.health.connect.action.HEALTH_HOME_SETTINGS" : "androidx.health.ACTION_HEALTH_CONNECT_SETTINGS";
        }

        private b() {
        }

        public static int a(Context context, String str) {
            int i14 = Build.VERSION.SDK_INT;
            if (34 <= i14) {
                return C1981a.a(context);
            }
            if (i14 >= 34) {
                return 1;
            }
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                packageInfo.getClass();
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo == null || !applicationInfo.enabled) {
                    return 2;
                }
                if (str.equals("com.google.android.apps.healthdata") && packageInfo.getLongVersionCode() < 68623) {
                    return 2;
                }
                Intent intent = new Intent();
                intent.setPackage(str);
                intent.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                listQueryIntentServices.getClass();
                return !listQueryIntentServices.isEmpty() ? 3 : 2;
            } catch (PackageManager.NameNotFoundException unused) {
                return 2;
            }
        }
    }

    Object a(d dVar, b9.a aVar, v13.c cVar);

    Object c(d<? extends q0> dVar, List<String> list, List<String> list2, t13.d<? super Unit> dVar2);

    c d();

    Object e(List list, v13.c cVar);
}
