package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.IBaseCallback;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IReadCallback;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.IRegisterRealTimeCallback;
import com.huawei.hihealth.ISportDataCallback;
import com.huawei.hihealth.ISubScribeCallback;
import com.huawei.hihealth.IWriteCallback;
import com.huawei.hihealth.model.Notification;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hihealthservice.auth.HiAuthorization;
import com.huawei.hihealthservice.auth.HiScope;
import com.huawei.hihealthservice.auth.HiUserAuth;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearkit.IDetectCommonCallback;
import com.huawei.wearkit.IRealTimeCallback;
import com.huawei.wearkit.IWearCommonCallback;
import com.huawei.wearkit.IWearReadCallback;
import com.huawei.wearkit.IWearWriteCallback;
import health.compact.a.AuthorizationUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class lcm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f39911b;
    private static boolean d;
    private static final ExecutorService e = Executors.newSingleThreadExecutor();

    private lcm() {
    }

    public static List<kum> e(HiAuthorization hiAuthorization) {
        if (hiAuthorization == null) {
            return null;
        }
        List<HiScope> scopes = hiAuthorization.getScopes();
        if (scopes == null || scopes.isEmpty()) {
            LogUtil.a("Debug_HiAuthUtil", "hiscopes is null or empty hisopes = ", scopes);
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        for (HiScope hiScope : scopes) {
            String[] permissions = hiScope.getPermissions();
            if (permissions == null || permissions.length <= 0) {
                LogUtil.a("Debug_HiAuthUtil", "permissions is null or empty permissions = ", permissions);
                return null;
            }
            for (String str : permissions) {
                if (HiScopeUtil.e(str)) {
                    kum kumVar = new kum();
                    kumVar.c(hiScope.getId());
                    kumVar.a(hiScope.getUri());
                    kumVar.c(hiScope.getName());
                    kumVar.e(str);
                    arrayList.add(kumVar);
                }
            }
        }
        return arrayList;
    }

    public static int a(String str, HiUserAuth hiUserAuth) {
        if (str != null && hiUserAuth != null) {
            for (String str2 : hiUserAuth.getScope().split(" ")) {
                if (str.equalsIgnoreCase(str2)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean c(Context context, int i) {
        HiAppInfo hiAppInfoD = kwi.b().d(ljp.e(context));
        if (hiAppInfoD != null) {
            return ljo.a(hiAppInfoD.getSignature()) == i;
        }
        ReleaseLogUtil.a("HiH_HiAuthUtil", "isUidValid, AppInfo is null");
        return false;
    }

    public static <T> boolean e(String str, T t) throws RemoteException {
        synchronized (lcm.class) {
            if (lek.c()) {
                ReleaseLogUtil.d("HiH_HiAuthUtil", "isPrivacyPermitted, FA return true");
                return true;
            }
            d = false;
            f39911b = false;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            e.execute(new Runnable() { // from class: lcm.4
                @Override // java.lang.Runnable
                public void run() {
                    boolean unused = lcm.d = AuthorizationUtils.c(BaseApplication.getContext());
                    boolean unused2 = lcm.f39911b = lek.d(BaseApplication.getContext());
                    countDownLatch.countDown();
                }
            });
            try {
                ReleaseLogUtil.d("HiH_HiAuthUtil", str, " isPrivacyPermitted is on time: ", Boolean.valueOf(countDownLatch.await(1L, TimeUnit.SECONDS)));
            } catch (InterruptedException e2) {
                ReleaseLogUtil.a("HiH_HiAuthUtil", str, " InterruptedException: ", e2.getMessage());
            }
            if (!d) {
                c(t);
            }
            ReleaseLogUtil.d("HiH_HiAuthUtil", str, " app privacy term status = ", Boolean.valueOf(d));
            LogUtil.a("Debug_HiAuthUtil", "health kit app linked status = ", Boolean.valueOf(f39911b));
            return d;
        }
    }

    private static <T> void c(T t) throws RemoteException {
        String strB = lcr.b(1003);
        if (t instanceof ICommonListener) {
            ((ICommonListener) t).onSuccess(1003, null);
            return;
        }
        if (t instanceof IRealTimeDataCallback) {
            ((IRealTimeDataCallback) t).onResult(1003);
            return;
        }
        if (t instanceof IRealTimeCallback) {
            ((IRealTimeCallback) t).onResult(1003);
            return;
        }
        if (t instanceof IWearReadCallback) {
            ((IWearReadCallback) t).onResult(1003, strB, null);
            return;
        }
        if (t instanceof IWearWriteCallback) {
            ((IWearWriteCallback) t).onResult(1003, strB);
            return;
        }
        if (t instanceof IWearCommonCallback) {
            ((IWearCommonCallback) t).onResult(1003, strB);
            return;
        }
        if (t instanceof IDataReadResultListener) {
            ((IDataReadResultListener) t).onResult(null, 1003, 2);
            return;
        }
        if (t instanceof IDataOperateListener) {
            ((IDataOperateListener) t).onResult(1003, null);
            return;
        }
        if (t instanceof IWriteCallback) {
            ((IWriteCallback) t).onResult(1003, strB);
            return;
        }
        if (t instanceof IReadCallback) {
            ((IReadCallback) t).onResult(1003, strB, null);
            return;
        }
        if (t instanceof ICommonCallback) {
            ((ICommonCallback) t).onResult(1003, strB);
            return;
        }
        if (t instanceof ISportDataCallback) {
            ((ISportDataCallback) t).onResult(1003);
            return;
        }
        if (t instanceof IBaseCallback) {
            ((IBaseCallback) t).onResult(1003, null);
            return;
        }
        if (t instanceof IRegisterRealTimeCallback) {
            ((IRegisterRealTimeCallback) t).onResult(1003, lcr.b(1003));
            return;
        }
        if (t instanceof IDetectCommonCallback) {
            ((IDetectCommonCallback) t).onResult(1003, null, lcr.b(1003));
        } else if (t instanceof ISubScribeCallback) {
            ((ISubScribeCallback) t).onResult(new ArrayList(), Arrays.asList(new Notification(0, 1003, lcr.b(1003))));
        } else {
            ReleaseLogUtil.a("HiH_HiAuthUtil", "chargeListenerType", " on else branch");
        }
    }

    public static boolean b(String str, Context context) {
        boolean zD;
        synchronized (lcm.class) {
            zD = lek.d(str, context);
            LogUtil.a("Debug_HiAuthUtil", "is white app=", Boolean.valueOf(zD));
        }
        return zD;
    }

    public static int c(String str) {
        synchronized (lcm.class) {
            int iD = let.d(str);
            ReleaseLogUtil.d("HiH_HiAuthUtil", "data sharing enable=", Boolean.valueOf(f39911b), " health kit version=", Integer.valueOf(iD));
            if (f39911b) {
                ReleaseLogUtil.d("HiH_HiAuthUtil", "package is whiteApp, Auth success");
                return 0;
            }
            if (iD >= 6) {
                ReleaseLogUtil.a("HiH_HiAuthUtil", "HealthKit data sharing not enabled");
                return 1008;
            }
            ReleaseLogUtil.a("HiH_HiAuthUtil", "permission exception");
            return 1001;
        }
    }
}
