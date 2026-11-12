package defpackage;

import android.content.Context;
import android.os.Binder;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import com.huawei.hihealthkit.context.QuickAppInfo;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lep {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, String> f39992c = b();

    public static boolean a(Context context) {
        if (context == null) {
            LogUtil.j("HiHealthKitCallController", "isHwQuickAppEngine, context is null");
            return false;
        }
        return c(context, 2);
    }

    public static boolean d(Context context) {
        if (context == null) {
            LogUtil.j("HiHealthKitCallController", "H5AppEngine, context is null");
            return false;
        }
        return c(context, 3);
    }

    public static boolean e(Context context) {
        if (context == null) {
            LogUtil.j("HiHealthKitCallController", "isSupportedAssembleSubApplication, context is null");
            return false;
        }
        return c(context, 4);
    }

    public static boolean d(QuickAppInfo quickAppInfo) {
        if (quickAppInfo == null) {
            LogUtil.j("HiHealthKitCallController", "isWhiteQuickApp, info is null");
            return false;
        }
        return e(quickAppInfo);
    }

    public static boolean b(Context context) {
        if (context == null) {
            LogUtil.j("HiHealthKitCallController", "isPermissionErrorReturn, context is null");
            return false;
        }
        return c(context, 1);
    }

    public static boolean a(H5ProAppInfo h5ProAppInfo) {
        for (leh lehVar : lcp.e()) {
            if (lehVar.getPackageName().equals(h5ProAppInfo.getPkgName()) && lehVar.getPackageSignature().equals(h5ProAppInfo.getCertPrint())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, int i) {
        if (context == null) {
            LogUtil.j("HiHealthKitCallController", "isAllowedForRemoteTest, context is null");
            return false;
        }
        return c(context, i);
    }

    private static boolean c(Context context, int i) {
        String strD = lkf.d(context);
        LogUtil.a("HiHealthKitCallController", "caller package name ", strD);
        if (strD == null) {
            LogUtil.j("HiHealthKitCallController", "checkCaller, error in getCallingPackageName");
            return false;
        }
        leh[] lehVarArrD = d(i);
        if (lehVarArrD != null && lehVarArrD.length != 0) {
            int callingUid = Binder.getCallingUid();
            for (leh lehVar : lehVarArrD) {
                boolean zEquals = lehVar.getPackageName().equals(strD);
                if (zEquals && lehVar.getUid() == callingUid) {
                    return true;
                }
                if (zEquals && lehVar.getPackageSignature().equals(HsfSignValidator.a(context, strD))) {
                    lehVar.setUid(callingUid);
                    return true;
                }
            }
        }
        return false;
    }

    private static leh[] d(int i) {
        leh[] lehVarArr = new leh[0];
        switch (i) {
            case 1:
                return lcp.n();
            case 2:
                return lcp.y();
            case 3:
                return lcp.f();
            case 4:
                return lcp.s();
            case 5:
                return lcp.c();
            case 6:
                return lcp.k();
            case 7:
                return lcp.o();
            case 8:
                return lcp.v();
            case 9:
                return lcp.l();
            case 10:
                return lcp.j();
            case 11:
                return lcp.i();
            case 12:
                return lcp.h();
            case 13:
                return lcp.a();
            case 14:
                return lcp.b();
            case 15:
                return lcp.t();
            case 16:
                return lcp.p();
            case 17:
                return lcp.r();
            case 18:
            case 19:
                return lcp.g();
            case 20:
            case 21:
                return lcp.q();
            case 22:
                return lcp.d();
            case 23:
                return lcp.m();
            default:
                return lehVarArr;
        }
    }

    private static boolean e(QuickAppInfo quickAppInfo) {
        for (leh lehVar : lcp.x()) {
            if (lehVar.getPackageName().equals(quickAppInfo.getPackageName()) && lehVar.getPackageSignature().equals(quickAppInfo.getFingerPrint())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        return f39992c.containsKey(str);
    }

    private static Map<String, String> b() {
        leh[] lehVarArrX = lcp.x();
        HashMap map = new HashMap(16);
        for (leh lehVar : lehVarArrX) {
            map.put(lehVar.getPackageName(), lehVar.getPackageSignature());
        }
        return map;
    }
}
