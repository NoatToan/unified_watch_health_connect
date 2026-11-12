package health.compact.a;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class BuildTypeConfig {
    private static int e = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    public static void e(String str) {
        if (str == null) {
            com.huawei.hwlogsmodel.LogUtil.j("BuildTypeConfig", "modifyBuildType string null");
            e = 1;
            return;
        }
        str.hashCode();
        switch (str) {
            case "speedup":
                e = 2;
                break;
            case "t3rdDevice":
                e = 6;
                break;
            case "customTest":
                e = 4;
                break;
            case "StoreDemo":
                e = 5;
                break;
            case "HTY":
            case "beta":
                e = 3;
                break;
            case "debug":
                e = 2;
                break;
            case "release":
                e = 1;
                break;
            case "BetaPay":
                e = 3;
                break;
            default:
                e = 1;
                break;
        }
        Log.i("BuildTypeConfig", "modifyBuildType(): sBuildType = " + e);
    }

    public static boolean e() {
        return e == 1;
    }

    public static boolean b() {
        return e == 3;
    }

    public static boolean c() {
        return e == 2;
    }

    public static boolean i() {
        return e == 4;
    }

    public static boolean a() {
        return e == 5;
    }

    public static boolean d() {
        return e == 6;
    }
}
